package fr.criosdu79.nodiamod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister {
    public static void mainRegistry(){
        registerWorldGen(new WorldGenNodia(), -1);
        registerWorldGen(new WorldGenNodia(), 0);
        registerWorldGen(new WorldGenNodia(), 1);
    }

    public static void registerWorldGen(IWorldGenerator iGenerator, int probability){
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
