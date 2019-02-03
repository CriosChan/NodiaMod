package fr.criosdu79.nodiamod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodMod extends ItemFood {

    private int potionId = 1;
    private int potionDuration = 10;
    private int potionEffectProbability = 100;
    private int potionAmplifier = 2;

    public ItemFoodMod(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
    }
    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
        if (!p_77849_2_.isRemote && this.potionId > 0 && p_77849_2_.rand.nextFloat() < this.potionEffectProbability)
        {
            p_77849_3_.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
        }
    }
}
