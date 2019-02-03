package fr.criosdu79.nodiamod.init;

import fr.criosdu79.nodiamod.entity.EntityWiwen;
import fr.criosdu79.nodiamod.handlers.EntityHandler;

public class EntityMod {
    public static void init(){
        EntityHandler.registerMonser(EntityWiwen.class, "wiwen");
    }
}
