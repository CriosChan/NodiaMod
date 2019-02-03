package fr.criosdu79.nodiamod.gui;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumChatFormatting;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GuiCustomIngameMenu extends GuiScreen {
    private int field_146445_a;
    private int field_146444_f;
    private static final String __OBFID = "CL_00000703";

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui() {
        this.field_146445_a = 0;
        this.buttonList.clear();
        int i = this.height / 4 + 48;
        byte b0 = -16;
        boolean flag = true;

        if (!this.mc.isIntegratedServerRunning()) {
            ((GuiButton) this.buttonList.get(0)).displayString = I18n.format("menu.disconnect", new Object[0]);
        }
        this.buttonList.add(new GuiButton(33, this.width / 2 - 100, this.height / 4 + 48 + b0, 99, 20, EnumChatFormatting.BLUE + "Discord"));
        this.buttonList.add(new GuiButton(4, this.width / 2 - 100, this.height / 4 + b0, I18n.format("menu.returnToGame", new Object[0])));
        this.buttonList.add(new GuiButton(34, this.width / 2 + 2, this.height / 4 + 48 + b0, 99, 20, EnumChatFormatting.GREEN + I18n.format("menu.website", new Object[0])));
        this.buttonList.add(new GuiButton(35, this.width / 2 - 100, this.height / 4 + 72 + b0, 99, 20, EnumChatFormatting.YELLOW + I18n.format("menu.vote", new Object[0])));
        this.buttonList.add(new GuiButton(36, this.width / 2 + 2, this.height / 4 + 72 + b0, 99, 20, EnumChatFormatting.DARK_GREEN + I18n.format("menu.shop", new Object[0])));
        this.buttonList.add(new GuiButton(37, this.width / 2 - 100, this.height / 4 + 96 + b0, EnumChatFormatting.RED + I18n.format("Changelog", new Object[0])));
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 4 + 144 + b0, I18n.format("menu.options", new Object[0])));
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 4 + 168 + b0, I18n.format("menu.disconnect", new Object[0])));

        GuiButton guibutton;
    }

    protected void actionPerformed(GuiButton p_146284_1_) {
        if (p_146284_1_.id == 0) {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        }
        if (p_146284_1_.id == 1) {
            p_146284_1_.enabled = false;
            this.mc.theWorld.sendQuittingDisconnectingPacket();
            this.mc.loadWorld((WorldClient) null);
            this.mc.displayGuiScreen(new GuiMainMenu());
        }
        if (p_146284_1_.id == 4) {
            this.mc.displayGuiScreen((GuiScreen) null);
            this.mc.setIngameFocus();
        }
        if (p_146284_1_.id == 33) {
            try {
                Desktop.getDesktop().browse(new URI("https://discord.gg/RvCQQEg"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        if (p_146284_1_.id == 34) {
            try {
                Desktop.getDesktop().browse(new URI("https://nodia-pvp-faction.000webhostapp.com/"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        if (p_146284_1_.id == 35) {
            try {
                Desktop.getDesktop().browse(new URI("https://nodia-pvp-faction.000webhostapp.com/vote"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        if (p_146284_1_.id == 36) {
            try {
                Desktop.getDesktop().browse(new URI("https://nodia-pvp-faction.000webhostapp.com/shop"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        if (p_146284_1_.id == 37) {
            try {
                Desktop.getDesktop().browse(new URI("https://nodia-pvp-faction.000webhostapp.com/p/changelog"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen() {
        super.updateScreen();
        ++this.field_146444_f;
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format("menu.game", new Object[0]), this.width / 2, 16, 16777215);
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
    }
}
