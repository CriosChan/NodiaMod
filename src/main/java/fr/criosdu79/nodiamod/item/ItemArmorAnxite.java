package fr.criosdu79.nodiamod.item;

import fr.criosdu79.nodiamod.References;
import fr.criosdu79.nodiamod.init.itemMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorAnxite extends ItemArmor {

    public ItemArmorAnxite(ArmorMaterial material, int metadata) {
        super(material, 0, metadata);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == itemMod.saphir_leggings) {
            return References.MOD_ID + ":textures/models/armor/saphir_layer_2.png";
        } else if (stack.getItem() == itemMod.saphir_helmet || stack.getItem() == itemMod.saphir_chestplate || stack.getItem() == itemMod.saphir_boots) {
            return References.MOD_ID + ":textures/models/armor/saphir_layer_1.png";
        }

        if (stack.getItem() == itemMod.ruby_leggings) {
            return References.MOD_ID + ":textures/models/armor/ruby_layer_2.png";
        } else if (stack.getItem() == itemMod.ruby_helmet || stack.getItem() == itemMod.ruby_chestplate || stack.getItem() == itemMod.ruby_boots) {
            return References.MOD_ID + ":textures/models/armor/ruby_layer_1.png";
        }

        if (stack.getItem() == itemMod.anxite_leggings) {
            return References.MOD_ID + ":textures/models/armor/anxite_layer_2.png";
        } else if (stack.getItem() == itemMod.anxite_helmet || stack.getItem() == itemMod.anxite_chestplate || stack.getItem() == itemMod.anxite_boots) {
            return References.MOD_ID + ":textures/models/armor/anxite_layer_1.png";
        }

        if (stack.getItem() == itemMod.nodium_leggings) {
            return References.MOD_ID + ":textures/models/armor/nodium_layer_2.png";
        } else if (stack.getItem() == itemMod.nodium_helmet || stack.getItem() == itemMod.nodium_chestplate || stack.getItem() == itemMod.nodium_boots) {
            return References.MOD_ID + ":textures/models/armor/nodium_layer_1.png";
        }
        return null;
    }
}

