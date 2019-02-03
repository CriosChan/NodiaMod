package fr.criosdu79.nodiamod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.List;

public class RemoveMod
{
    public static void init()
    {
        //removeCraft(GameRegistry.findItemStack("customnpcs", "npcCarpentyBench", 0));
    }

    private static void removeCraft(ItemStack stack)
    {
        List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
        for(int i = 0; i < recipeList.size(); i++)
        {
            ItemStack out = recipeList.get(i).getRecipeOutput();
            if(out != null && stack.getItem() == out.getItem() && stack.getItemDamage() == out.getItemDamage())
            {
                recipeList.remove(i);
            }
        }
    }
}