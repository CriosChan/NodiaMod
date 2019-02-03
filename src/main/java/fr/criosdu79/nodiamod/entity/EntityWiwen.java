package fr.criosdu79.nodiamod.entity;

import fr.criosdu79.nodiamod.init.itemMod;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class EntityWiwen extends EntityMob {
    public EntityWiwen(World p_i1738_1_) {
        super(p_i1738_1_);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.setSize(0.6F, 1.8F);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
    }

    protected void dropRareDrop(int p_70600_1_)
    {
        switch (this.rand.nextInt(4))
        {
            case 0:
                this.dropItem(itemMod.earth_orbe, 1);
                break;
            case 1:
                this.dropItem(itemMod.fire_orbe, 1);
                break;
            case 2:
                this.dropItem(itemMod.water_orbe, 1);
                break;
            case 3:
                this.dropItem(itemMod.wind_orbe, 1);
        }
    }
}
