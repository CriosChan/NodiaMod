package fr.criosdu79.nodiamod.handlers;

import cpw.mods.fml.common.registry.EntityRegistry;
import fr.criosdu79.nodiamod.MainMod;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import java.awt.*;
import java.util.Random;

public class EntityHandler {
    public static void registerMonser(Class entityClass, String string){
        int entityID = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, string, EntityRegistry.findGlobalUniqueEntityId(), new Color(102,186, 245).getRGB(), new Color(156, 0, 0).getRGB());
        EntityRegistry.addSpawn(string, 2, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        EntityRegistry.registerModEntity(entityClass, string, entityID, MainMod.instance, 64, 1, true);
    }
}
