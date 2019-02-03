package fr.criosdu79.nodiamod.renders;

import fr.criosdu79.nodiamod.References;
import fr.criosdu79.nodiamod.entity.EntityWiwen;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderWiwen extends RenderLiving
{

    private ResourceLocation texture = new ResourceLocation(References.MOD_ID + ":textures/mobs/wiwen.png");

    public RenderWiwen(ModelBase p_i1262_1_, float p_i1262_2_)
    {
        super(p_i1262_1_, p_i1262_2_);
    }

    protected ResourceLocation getEntiyTexture(EntityLiving living)
    {
        return this.getEntityTexture((EntityWiwen) living);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return texture;
    }
}