package fr.criosdu79.nodiamod.blocks;

import fr.criosdu79.nodiamod.init.itemMod;
import net.minecraft.block.BlockPotato;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockPotatoMod extends BlockPotato {
    protected Item func_149866_i()
    {
        return itemMod.seed_speed_potatoes;
    }

    protected Item func_149865_P()
    {
        return itemMod.speed_potatoes_food;
    }
}
