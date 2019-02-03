package fr.criosdu79.nodiamod.gui;

import fr.criosdu79.nodiamod.gui.MainMenu.ButtonMenu1;
import fr.criosdu79.nodiamod.gui.MainMenu.GuiCustomMainMenu;
import fr.criosdu79.nodiamod.gui.MainMenu.GuiCustomMainMenu2;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.resources.I18n;

import java.awt.*;

public class MainMenuChooser extends GuiScreen {

    private Minecraft mc;
    public void MainMenuChooser(){
        this.buttonList.add(new ButtonMenu1(35, 5, this.height / 2 - 50));
    }

    public void initGui()
    {
        MainMenuChooser();
    }

    protected void actionPerformed(GuiButton p_146284_1_) {
        if (p_146284_1_.id == 35) {
            event.setGui(new GuiCustomMainMenu());
        }
        if (p_146284_1_.id == 36) {
            this.mc.displayGuiScreen(new GuiCustomMainMenu2());
        }
    }

    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
    {
        this.drawBackground(0);

        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
    }
}
