package fr.criosdu79.nodiamod.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.criosdu79.nodiamod.entity.EntityWiwen;
import fr.criosdu79.nodiamod.models.ModelWiwen;
import fr.criosdu79.nodiamod.renders.RenderWiwen;
import net.minecraftforge.common.MinecraftForge;

public class clientProxy extends commonProxy {

    public clientProxy(){
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    public void registerRenders ()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityWiwen.class, new RenderWiwen(new ModelWiwen(), 0.5f));
    }
}
