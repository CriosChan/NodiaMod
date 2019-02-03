package fr.criosdu79.nodiamod.gui.MainMenu;

import cpw.mods.fml.client.config.GuiUtils;
import fr.criosdu79.nodiamod.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static cpw.mods.fml.client.config.GuiUtils.drawTexturedModalRect;

public class ButtonMenu1 extends GuiButton {
    protected static final ResourceLocation MAINMENU1 = new ResourceLocation(References.MOD_ID, "textures/gui/mainmenu1.png");

    public ButtonMenu1(int id, int xPos, int yPos)
    {
        super(id, xPos, yPos, 200, 100, "");
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if (this.visible)
        {
            mc.getTextureManager().bindTexture(MAINMENU1);
            GuiUtils.drawTexturedModalRect(this.xPosition, this.yPosition, 0, 0, 200, 100, this.zLevel);
            GuiUtils.drawContinuousTexturedBox(MAINMENU1, this.xPosition, this.yPosition, 0,  0, 200, 100, 128, 128, 0, this.zLevel);
            this.mouseDragged(mc, mouseX, mouseY);
        }
    }
}
