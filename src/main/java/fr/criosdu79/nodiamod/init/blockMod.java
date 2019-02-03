package fr.criosdu79.nodiamod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.criosdu79.nodiamod.MainMod;
import fr.criosdu79.nodiamod.References;
import fr.criosdu79.nodiamod.blocks.blockBasique;
import fr.criosdu79.nodiamod.blocks.BlockPotatoMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockMod {

    public static Block ruby_block;
    public static Block saphir_block;
    public static Block anxite_block;
    public static Block nodium_block;

    public static Block saphir_ore, ruby_ore, anxiteinfected_ore;

    public static Block speed_potatoes;

    public static void init () {
        //Block
        ruby_block = new blockBasique(Material.rock).setBlockName("ruby_block").setCreativeTab(MainMod.NodiaTabBlock).setBlockTextureName(References.MOD_ID + ":ruby_block").setHardness(3);
        saphir_block = new blockBasique(Material.rock).setBlockName("saphir_block").setCreativeTab(MainMod.NodiaTabBlock).setBlockTextureName(References.MOD_ID + ":saphir_block").setHardness(3);
        anxite_block = new blockBasique(Material.rock).setBlockName("anxite_block").setCreativeTab(MainMod.NodiaTabBlock).setBlockTextureName(References.MOD_ID + ":anxite_block").setHardness(3);
        nodium_block = new blockBasique(Material.rock).setBlockName("nodium_block").setCreativeTab(MainMod.NodiaTabBlock).setBlockTextureName(References.MOD_ID + ":nodium_block").setHardness(3);

        //Minerais
        saphir_ore = new blockBasique(Material.rock).setBlockName("saphir_ore").setCreativeTab(MainMod.NodiaTabBlock).setBlockTextureName(References.MOD_ID + ":saphir_ore").setHardness(3.0f).setResistance(20.0f);
        ruby_ore = new blockBasique(Material.rock).setBlockName("ruby_ore").setCreativeTab(MainMod.NodiaTabBlock).setBlockTextureName(References.MOD_ID + ":ruby_ore").setHardness(3.0f).setResistance(20.0f);
        anxiteinfected_ore = new blockBasique(Material.rock).setBlockName("anxiteinfected_ore").setCreativeTab(MainMod.NodiaTabBlock).setBlockTextureName(References.MOD_ID + ":anxiteinfected_ore").setHardness(3.0f).setResistance(20.0f);

        //Culture
        speed_potatoes = new BlockPotatoMod().setBlockName("speed_potatoes").setBlockTextureName(References.MOD_ID + ":speed_potatoes");
    }

    public static void register () {
        //Block
        GameRegistry.registerBlock(ruby_block, ruby_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(saphir_block, saphir_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(anxite_block, anxite_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nodium_block, nodium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(saphir_ore, saphir_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(ruby_ore, ruby_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(anxiteinfected_ore, anxiteinfected_ore.getUnlocalizedName().substring(5));

        GameRegistry.registerBlock(speed_potatoes, speed_potatoes.getUnlocalizedName().substring(5));




    }
}
