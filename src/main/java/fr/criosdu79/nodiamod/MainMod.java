package fr.criosdu79.nodiamod;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.criosdu79.nodiamod.gui.GuiCustomIngameMenu;
import fr.criosdu79.nodiamod.gui.MainMenu.GuiCustomMainMenu2;
import fr.criosdu79.nodiamod.gui.MainMenuChooser;
import fr.criosdu79.nodiamod.init.EntityMod;
import fr.criosdu79.nodiamod.init.blockMod;
import fr.criosdu79.nodiamod.init.itemMod;
import fr.criosdu79.nodiamod.item.RemoveMod;
import fr.criosdu79.nodiamod.proxy.commonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.criosdu79.nodiamod.world.WorldRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)

public class MainMod {

    @Mod.Instance(References.MOD_ID)
    public static MainMod instance;


    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static commonProxy proxy;

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onTick(TickEvent.ClientTickEvent event)
    {
        Minecraft mc = FMLClientHandler.instance().getClient();
        if(mc.currentScreen != null && mc.currentScreen.getClass().equals(GuiMainMenu.class))
        {
            mc.displayGuiScreen(new MainMenuChooser());
        }
        if(mc.currentScreen != null && mc.currentScreen.getClass().equals(GuiIngameMenu.class))
        {
            mc.displayGuiScreen(new GuiCustomIngameMenu());
        }
    }


    public static CreativeTabs NodiaTabArmor = new CreativeTabs("NodiaTabArmor"){
        @SideOnly(Side.CLIENT)
            public Item getTabIconItem (){
            return itemMod.nodium_chestplate;
        }
    };

    public static CreativeTabs NodiaTabFood = new CreativeTabs("NodiaTabFood"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem (){
            return itemMod.speed_potatoes_food;
        }
    };

    public static CreativeTabs NodiaTabBlock = new CreativeTabs("NodiaTabBlock"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem (){
            return Item.getItemFromBlock(blockMod.nodium_block);
        }
    };

    public static CreativeTabs NodiaTabTool = new CreativeTabs("NodiaTabTool"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem (){
            return itemMod.nodium_pickaxe;
        }
    };

    public static CreativeTabs NodiaTabItem = new CreativeTabs("NodiaTabItem"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem (){
            return itemMod.nodium;
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        blockMod.init();
        blockMod.register();
        itemMod.init();
        itemMod.register();
        RemoveMod.init();
        WorldRegister.mainRegistry();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
        EntityMod.init();
        if(event.getSide().isClient())
        {
            FMLCommonHandler.instance().bus().register(this);
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
