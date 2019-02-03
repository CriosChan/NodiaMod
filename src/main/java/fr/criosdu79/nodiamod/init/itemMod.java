package fr.criosdu79.nodiamod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.criosdu79.nodiamod.MainMod;
import fr.criosdu79.nodiamod.References;
import fr.criosdu79.nodiamod.item.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import sun.applet.Main;

public class itemMod {
    //Autre
    public static Item saphir, ruby, anxite, anxiteinfected, nodium;
    public static Item nodium_key;
    public static Item water_orbe, wind_orbe, earth_orbe, fire_orbe;

    //Armor
    public static Item saphir_helmet, saphir_chestplate, saphir_leggings, saphir_boots;
    public static Item ruby_helmet, ruby_chestplate, ruby_leggings, ruby_boots;
    public static Item anxite_helmet, anxite_chestplate, anxite_leggings, anxite_boots;
    public static Item nodium_helmet, nodium_chestplate, nodium_leggings, nodium_boots;

    //Seed
    public static Item seed_speed_potatoes;

    //Food
    public static Item speed_potatoes_food;

    //Potion Stick
    public static Item potion_stick_tier_1, potion_geme;

    public static ItemArmor.ArmorMaterial saphirarmor = EnumHelper.addArmorMaterial("saphirarmor", 51, new int[]{4,7,6,4}, 15);
    public static ItemArmor.ArmorMaterial rubyarmor = EnumHelper.addArmorMaterial("rubyarmor", 69, new int[]{5,8,7,5}, 20);
    public static ItemArmor.ArmorMaterial anxitearmor = EnumHelper.addArmorMaterial("anxitearmor", 87, new int[]{6, 9, 8, 6}, 25);
    public static ItemArmor.ArmorMaterial nodiumarmor = EnumHelper.addArmorMaterial("nodiumarmor", 105, new int[]{8, 10, 9, 7}, 30);

    //Tool
    //Saphir
    public static Item saphir_sword, saphir_axe, saphir_pickaxe, saphir_shovel;
    //Ruby
    public static Item ruby_sword, ruby_axe, ruby_pickaxe, ruby_shovel;
    //Anxite
    public static Item anxite_sword, anxite_axe, anxite_pickaxe, anxite_shovel;
    //Nodium
    public static Item nodium_sword, nodium_axe, nodium_pickaxe, nodium_shovel;

    public static Item.ToolMaterial toolsaphir = EnumHelper.addToolMaterial("toolsaphir", 3, 3500,  6, 5, 15);
    public static Item.ToolMaterial toolruby = EnumHelper.addToolMaterial("toolruby", 3, 4000,  7, 6, 20);
    public static Item.ToolMaterial toolanxite = EnumHelper.addToolMaterial("toolanxite", 3, 4500,  8, 7, 25);
    public static Item.ToolMaterial toolnodium = EnumHelper.addToolMaterial("toolnodium", 3, 4700,  10, 9, 30);

    public static void init(){

        saphir = new Item().setUnlocalizedName("saphir").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":saphir");
        ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":ruby");
        anxite = new Item().setUnlocalizedName("anxite").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":anxite");
        anxiteinfected = new Item().setUnlocalizedName("anxiteinfected").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":anxiteinfected");
        nodium = new Item().setUnlocalizedName("nodium").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":nodium");

        //Orbes
        earth_orbe = new Item().setUnlocalizedName("earth_orbe").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":earth_orbe");
        fire_orbe = new Item().setUnlocalizedName("fire_orbe").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":fire_orbe");
        water_orbe = new Item().setUnlocalizedName("water_orbe").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":water_orbe");
        wind_orbe = new Item().setUnlocalizedName("wind_orbe").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":wind_orbe");

        //Armure
        saphir_helmet = new ItemArmorAnxite(saphirarmor, 0).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":saphir_helmet").setUnlocalizedName("saphir_helmet");
        saphir_chestplate = new ItemArmorAnxite(saphirarmor, 1).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":saphir_chestplate").setUnlocalizedName("saphir_chestplate");
        saphir_leggings = new ItemArmorAnxite(saphirarmor, 2).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":saphir_leggings").setUnlocalizedName("saphir_leggings");
        saphir_boots = new ItemArmorAnxite(saphirarmor, 3).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":saphir_boots").setUnlocalizedName("saphir_boots");

        ruby_helmet = new ItemArmorAnxite(rubyarmor, 0).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_helmet").setUnlocalizedName("ruby_helmet");
        ruby_chestplate = new ItemArmorAnxite(rubyarmor, 1).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_chestplate").setUnlocalizedName("ruby_chestplate");
        ruby_leggings = new ItemArmorAnxite(rubyarmor, 2).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_leggings").setUnlocalizedName("ruby_leggings");
        ruby_boots = new ItemArmorAnxite(rubyarmor, 3).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_boots").setUnlocalizedName("ruby_boots");

        ruby_helmet = new ItemArmorAnxite(rubyarmor, 0).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_helmet").setUnlocalizedName("ruby_helmet");
        ruby_chestplate = new ItemArmorAnxite(rubyarmor, 1).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_chestplate").setUnlocalizedName("ruby_chestplate");
        ruby_leggings = new ItemArmorAnxite(rubyarmor, 2).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_leggings").setUnlocalizedName("ruby_leggings");
        ruby_boots = new ItemArmorAnxite(rubyarmor, 3).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_boots").setUnlocalizedName("ruby_boots");

        anxite_helmet = new ItemArmorAnxite(anxitearmor, 0).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":anxite_helmet").setUnlocalizedName("anxite_helmet");
        anxite_chestplate = new ItemArmorAnxite(anxitearmor, 1).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":anxite_chestplate").setUnlocalizedName("anxite_chestplate");
        anxite_leggings = new ItemArmorAnxite(anxitearmor, 2).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":anxite_leggings").setUnlocalizedName("anxite_leggings");
        anxite_boots = new ItemArmorAnxite(anxitearmor, 3).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":anxite_boots").setUnlocalizedName("anxite_boots");

        nodium_helmet = new ItemArmorAnxite(nodiumarmor, 0).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":nodium_helmet").setUnlocalizedName("nodium_helmet");
        nodium_chestplate = new ItemArmorAnxite(nodiumarmor, 1).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":nodium_chestplate").setUnlocalizedName("nodium_chestplate");
        nodium_leggings = new ItemArmorAnxite(nodiumarmor, 2).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":nodium_leggings").setUnlocalizedName("nodium_leggings");
        nodium_boots = new ItemArmorAnxite(nodiumarmor, 3).setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":nodium_boots").setUnlocalizedName("nodium_boots");

        //Key
        nodium_key = new Item().setUnlocalizedName("nodium_key").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":nodium_key");

        //Tools
        //Saphir
        saphir_sword = new ItemSwordNodia(toolsaphir).setUnlocalizedName("saphir_sword").setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":saphir_sword");
        saphir_axe = new ItemAxeNodia(toolsaphir).setUnlocalizedName("saphir_axe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":saphir_axe");
        saphir_pickaxe = new ItemPickaxeNodia(toolsaphir).setUnlocalizedName("saphir_pickaxe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":saphir_pickaxe");
        saphir_shovel = new ItemShovelNodia(toolsaphir).setUnlocalizedName("saphir_shovel").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":saphir_shovel");
        //Ruby
        ruby_sword = new ItemSwordNodia(toolruby).setUnlocalizedName("ruby_sword").setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":ruby_sword");
        ruby_axe = new ItemAxeNodia(toolruby).setUnlocalizedName("ruby_axe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":ruby_axe");
        ruby_pickaxe = new ItemPickaxeNodia(toolruby).setUnlocalizedName("ruby_pickaxe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":ruby_pickaxe");
        ruby_shovel = new ItemShovelNodia(toolruby).setUnlocalizedName("ruby_shovel").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":ruby_shovel");

        //Anxite
        anxite_sword = new ItemSwordNodia(toolanxite).setUnlocalizedName("anxite_sword").setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":anxite_sword");
        anxite_axe = new ItemAxeNodia(toolanxite).setUnlocalizedName("anxite_axe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":anxite_axe");
        anxite_pickaxe = new ItemPickaxeNodia(toolanxite).setUnlocalizedName("anxite_pickaxe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":anxite_pickaxe");
        anxite_shovel = new ItemShovelNodia(toolanxite).setUnlocalizedName("anxite_shovel").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":anxite_shovel");

        //Nodium
        nodium_sword = new ItemSwordNodia(toolnodium).setUnlocalizedName("nodium_sword").setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":nodium_sword");
        nodium_axe = new ItemAxeNodia(toolnodium).setUnlocalizedName("nodium_axe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":nodium_axe");
        nodium_pickaxe = new ItemPickaxeNodia(toolnodium).setUnlocalizedName("nodium_pickaxe").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":nodium_pickaxe");
        nodium_shovel = new ItemShovelNodia(toolnodium).setUnlocalizedName("nodium_shovel").setCreativeTab(MainMod.NodiaTabTool).setTextureName(References.MOD_ID + ":nodium_shovel");

        //Potion Stick
        potion_stick_tier_1 = new Item().setUnlocalizedName("potion_stick_tier_1").setCreativeTab(MainMod.NodiaTabArmor).setTextureName(References.MOD_ID + ":potion_stick_tier_1");
        potion_geme = new Item().setUnlocalizedName("potion_geme").setCreativeTab(MainMod.NodiaTabItem).setTextureName(References.MOD_ID + ":potion_geme");

        //Culture
        seed_speed_potatoes = new ItemSeedMod(blockMod.speed_potatoes, Blocks.farmland).setCreativeTab(MainMod.NodiaTabFood).setUnlocalizedName("seed_speed_potatoes").setTextureName(References.MOD_ID + ":seed_speed_potatoes");

        //Food
        speed_potatoes_food = new ItemFoodMod(4, 4f, false).setAlwaysEdible().setUnlocalizedName("speed_potatoes_food").setCreativeTab(MainMod.NodiaTabFood).setTextureName(References.MOD_ID + ":speed_potatoes_food");
    }

    public static void register(){
        GameRegistry.registerItem(saphir, "saphir");
        GameRegistry.registerItem(ruby, "ruby");
        GameRegistry.registerItem(anxite, "anxite");
        GameRegistry.registerItem(nodium, "nodium");
        GameRegistry.registerItem(anxiteinfected, "anxiteinfected");

        GameRegistry.registerItem(saphir_helmet, "saphir_helmet");
        GameRegistry.registerItem(saphir_chestplate, "saphir_chestplate");
        GameRegistry.registerItem(saphir_leggings, "saphir_leggings");
        GameRegistry.registerItem(saphir_boots, "saphir_boots");

        GameRegistry.registerItem(ruby_helmet, "ruby_helmet");
        GameRegistry.registerItem(ruby_chestplate, "ruby_chestplate");
        GameRegistry.registerItem(ruby_leggings, "ruby_leggings");
        GameRegistry.registerItem(ruby_boots, "ruby_boots");

        GameRegistry.registerItem(anxite_helmet, "anxite_helmet");
        GameRegistry.registerItem(anxite_chestplate, "anxite_chestplate");
        GameRegistry.registerItem(anxite_leggings, "anxite_leggings");
        GameRegistry.registerItem(anxite_boots, "anxite_boots");


        GameRegistry.registerItem(nodium_helmet, "nodium_helmet");
        GameRegistry.registerItem(nodium_chestplate, "nodium_chestplate");
        GameRegistry.registerItem(nodium_leggings, "nodium_leggings");
        GameRegistry.registerItem(nodium_boots, "nodium_boots");

        //Key
        GameRegistry.registerItem(nodium_key, "nodium_key");

        //Tool
        //Saphir
        GameRegistry.registerItem(saphir_sword, "saphir_sword");
        GameRegistry.registerItem(saphir_axe, "saphir_axe");
        GameRegistry.registerItem(saphir_pickaxe, "saphir_pickaxe");
        GameRegistry.registerItem(saphir_shovel, "saphir_shovel");
        //Ruby
        GameRegistry.registerItem(ruby_sword, "ruby_sword");
        GameRegistry.registerItem(ruby_axe, "ruby_axe");
        GameRegistry.registerItem(ruby_pickaxe, "ruby_pickaxe");
        GameRegistry.registerItem(ruby_shovel, "ruby_shovel");
        //Anxite
        GameRegistry.registerItem(anxite_sword, "anxite_sword");
        GameRegistry.registerItem(anxite_axe, "anxite_axe");
        GameRegistry.registerItem(anxite_pickaxe, "anxite_pickaxe");
        GameRegistry.registerItem(anxite_shovel, "anxite_shovel");
        //Nodium
        GameRegistry.registerItem(nodium_sword, "nodium_sword");
        GameRegistry.registerItem(nodium_axe, "nodium_axe");
        GameRegistry.registerItem(nodium_pickaxe, "nodium_pickaxe");
        GameRegistry.registerItem(nodium_shovel, "nodium_shovel");

        //Potion Stick
        GameRegistry.registerItem(potion_stick_tier_1, "potion_stick_tier-1");
        GameRegistry.registerItem(potion_geme, "potion_geme");

        //Culture
        GameRegistry.registerItem(seed_speed_potatoes, "seed_speed_potatoes");

        //Food
        GameRegistry.registerItem(speed_potatoes_food, "speed_potatoes_food");

        //Orbes
        GameRegistry.registerItem(earth_orbe, "earth_orbe");
        GameRegistry.registerItem(fire_orbe, "fire_orbe");
        GameRegistry.registerItem(water_orbe, "wather_orbe");
        GameRegistry.registerItem(wind_orbe, "wind_orbe");

        //Craft
        GameRegistry.addRecipe(new ItemStack(blockMod.ruby_block, 1), new Object[]{"###", "###", "###", '#', itemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby, 9), new Object[]{"#", '#', blockMod.ruby_block});

        GameRegistry.addRecipe(new ItemStack(blockMod.saphir_block, 1), new Object[]{"###", "###", "###", '#', itemMod.saphir});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir, 9), new Object[]{"#", '#', blockMod.saphir_block});

        GameRegistry.addRecipe(new ItemStack(blockMod.anxite_block, 1), new Object[]{"###", "###", "###", '#', itemMod.anxite});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite, 9), new Object[]{"#", '#', blockMod.anxite_block});

        GameRegistry.addRecipe(new ItemStack(blockMod.nodium_block, 1), new Object[]{"###", "###", "###", '#', itemMod.nodium});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium, 9), new Object[]{"#", '#', blockMod.nodium_block});

        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_helmet, 1), new Object[]{"###", "#V#", '#',  itemMod.saphir});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_chestplate, 1), new Object[]{"#V#", "###", "###", '#',  itemMod.saphir});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_leggings, 1), new Object[]{"###", "#V#", "#V#", '#',  itemMod.saphir});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_boots, 1), new Object[]{"#V#", "#V#", '#',  itemMod.saphir});

        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_helmet, 1), new Object[]{"###", "#V#", '#',  itemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_chestplate, 1), new Object[]{"#V#", "###", "###", '#',  itemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_leggings, 1), new Object[]{"###", "#V#", "#V#", '#',  itemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_boots, 1), new Object[]{"#V#", "#V#", '#',  itemMod.ruby});

        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_helmet, 1), new Object[]{"###", "#V#", '#',  itemMod.anxite});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_chestplate, 1), new Object[]{"#V#", "###", "###", '#',  itemMod.anxite});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_leggings, 1), new Object[]{"###", "#V#", "#V#", '#',  itemMod.anxite});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_boots, 1), new Object[]{"#V#", "#V#", '#',  itemMod.anxite});

        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_helmet, 1), new Object[]{"###", "#V#", '#',  itemMod.nodium});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_chestplate, 1), new Object[]{"#V#", "###", "###", '#',  itemMod.nodium});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_leggings, 1), new Object[]{"###", "#V#", "#V#", '#',  itemMod.nodium});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_boots, 1), new Object[]{"#V#", "#V#", '#',  itemMod.nodium});

        //Tools
        //Saphir
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_sword, 1), new Object[]{"#", "#", "S", '#', itemMod.saphir, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_axe, 1), new Object[]{"##", "#S", "RS", '#', itemMod.saphir, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_axe, 1), new Object[]{"R##", "RS#", "RS", '#', itemMod.saphir, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_pickaxe, 1), new Object[]{"###", "RS", "RS", '#', itemMod.saphir, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.saphir_shovel, 1), new Object[]{"#", "S", "S", '#', itemMod.saphir, 'S', Items.stick});

        //Ruby
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_sword, 1), new Object[]{"#", "#", "S", '#', itemMod.ruby, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_axe, 1), new Object[]{"##", "#S", "RS", '#', itemMod.ruby, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_axe, 1), new Object[]{"R##", "RS#", "RS", '#', itemMod.ruby, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_pickaxe, 1), new Object[]{"###", "RS", "RS", '#', itemMod.ruby, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.ruby_shovel, 1), new Object[]{"#", "S", "S", '#', itemMod.ruby, 'S', Items.stick});

        //Anxite
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_sword, 1), new Object[]{"#", "#", "S", '#', itemMod.anxite, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_axe, 1), new Object[]{"##", "#S", "RS", '#', itemMod.anxite, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_axe, 1), new Object[]{"R##", "RS#", "RS", '#', itemMod.anxite, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_pickaxe, 1), new Object[]{"###", "RS", "RS", '#', itemMod.anxite, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.anxite_shovel, 1), new Object[]{"#", "S", "S", '#', itemMod.anxite, 'S', Items.stick});
        //Nodium
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_sword, 1), new Object[]{"#", "#", "S", '#', itemMod.nodium, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_axe, 1), new Object[]{"##", "#S", "RS", '#', itemMod.nodium, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_axe, 1), new Object[]{"R##", "RS#", "RS", '#', itemMod.nodium, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_pickaxe, 1), new Object[]{"###", "RS", "RS", '#', itemMod.nodium, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.nodium_shovel, 1), new Object[]{"#", "S", "S", '#', itemMod.nodium, 'S', Items.stick});

        //Potion Stick
        GameRegistry.addRecipe(new ItemStack(itemMod.potion_stick_tier_1, 1), new Object[]{"G", "S", "S", 'G', itemMod.potion_geme, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemMod.potion_geme, 1), new Object[]{"P#P", "#O#", "P#P", 'P', Items.potionitem, '#', blockMod.ruby_block, 'O', blockMod.anxite_block});



        //Furnace
        GameRegistry.addSmelting(blockMod.saphir_ore, new ItemStack(itemMod.saphir, 1), 0.0F);
        GameRegistry.addSmelting(blockMod.ruby_ore, new ItemStack(itemMod.ruby, 1), 0.0F);
        GameRegistry.addSmelting(blockMod.anxiteinfected_ore, new ItemStack(itemMod.anxiteinfected, 1), 0.0F);
    }
}
