package fr.criosdu79.nodiamod.gui.MainMenu;

import cpw.mods.fml.client.FMLClientHandler;
import fr.criosdu79.nodiamod.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.I18n;
import net.minecraft.realms.RealmsBridge;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.ISaveFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class GuiCustomMainMenu2 extends GuiScreen {
    private static final Logger logger = LogManager.getLogger();
    /**
     * The RNG used by the Main Menu Screen.
     */
    private static final Random rand = new Random();
    /**
     * Counts the number of screen updates.
     */
    private float updateCounter;
    /**
     * The splash message.
     */
    /**
     * Timer used to rotate the panorama, increases every tick.
     */
    private int panoramaTimer;
    /**
     * Texture allocated for the current viewport of the main menu's panorama background.
     */
    private DynamicTexture viewportTexture;
    private final Object field_104025_t = new Object();
    private String field_92025_p;
    private String field_146972_A;
    private String field_104024_v;
    private static final ResourceLocation minecraftTitleTextures = new ResourceLocation("textures/gui/title/minecraft.png");
    /**
     * An array of all the paths to the panorama pictures.
     */
    private static final ResourceLocation[] titlePanoramaPaths = new ResourceLocation[]{new ResourceLocation("textures/gui/title/background/panorama_0.png"), new ResourceLocation("textures/gui/title/background/panorama_1.png"), new ResourceLocation("textures/gui/title/background/panorama_2.png"), new ResourceLocation("textures/gui/title/background/panorama_3.png"), new ResourceLocation("textures/gui/title/background/panorama_4.png"), new ResourceLocation("textures/gui/title/background/panorama_5.png")};
    public static final String field_96138_a = "Please click " + EnumChatFormatting.UNDERLINE + "here" + EnumChatFormatting.RESET + " for more information.";
    private int field_92024_r;
    private int field_92023_s;
    private int field_92022_t;
    private int field_92021_u;
    private int field_92020_v;
    private int field_92019_w;
    private ResourceLocation field_110351_G;
    private static final String __OBFID = "CL_00001154";

    public GuiCustomMainMenu2() {
        this.field_146972_A = field_96138_a;

        this.updateCounter = rand.nextFloat();
        this.field_92025_p = "";

        if (!GLContext.getCapabilities().OpenGL20 && !OpenGlHelper.func_153193_b()) {
            this.field_92025_p = I18n.format("title.oldgl1", new Object[0]);
            this.field_146972_A = I18n.format("title.oldgl2", new Object[0]);
            this.field_104024_v = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
        }
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen() {
        ++this.panoramaTimer;
    }

    /**
     * Returns true if this GUI should pause the game when it is displayed in single-player
     */
    public boolean doesGuiPauseGame() {
        return false;
    }

    /**
     * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
     */
    protected void keyTyped(char p_73869_1_, int p_73869_2_) {
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui() {
        this.viewportTexture = new DynamicTexture(256, 256);
        this.field_110351_G = this.mc.getTextureManager().getDynamicTextureLocation("background", this.viewportTexture);

        boolean flag = true;
        int i = this.height / 4 + 48;

        this.addSingleplayerMultiplayerButtons(i, 24);

        this.buttonList.add(new GuiButton(0, this.width / 2 + 30, i + 24 * 3, 140, 20, I18n.format("menu.options", new Object[0])));
        this.buttonList.add(new GuiButton(4, this.width / 2 + 30, i + 72 + 12 + 12, 140, 20, I18n.format("menu.quit", new Object[0])));
        Object object = this.field_104025_t;

        synchronized (this.field_104025_t) {
            this.field_92023_s = this.fontRendererObj.getStringWidth(this.field_92025_p);
            this.field_92024_r = this.fontRendererObj.getStringWidth(this.field_146972_A);
            int j = Math.max(this.field_92023_s, this.field_92024_r);
            this.field_92022_t = (this.width - j) / 2;
            this.field_92021_u = ((GuiButton) this.buttonList.get(0)).yPosition - 24;
            this.field_92020_v = this.field_92022_t + j;
            this.field_92019_w = this.field_92021_u + 24;
        }
    }

    /**
     * Adds Singleplayer and Multiplayer buttons on Main Menu for players who have bought the game.
     */
    private void addSingleplayerMultiplayerButtons(int p_73969_1_, int p_73969_2_) {
        int i = this.height / 4 + 48;
        this.buttonList.add(new GuiButton(1, this.width / 2 + 30, i - 24 - 24 - 24,140, 20, I18n.format("menu.singleplayer", new Object[0])));
        this.buttonList.add(new GuiButton(30, this.width / 2 + 30, i, 140, 20, EnumChatFormatting.BLUE + "Discord"));
        this.buttonList.add(new GuiButton(31, this.width / 2 + 30, i - 24, 140, 20, EnumChatFormatting.GREEN + I18n.format("menu.website", new Object[0])));
        this.buttonList.add(new GuiButton(32, this.width / 2 + 30, i - 24 - 24, 140, 20,EnumChatFormatting.DARK_GREEN + I18n.format("menu.connect", new Object[0])));
        this.buttonList.add(new GuiButton(33, this.width / 2 + 30, i + 24, 140, 20, EnumChatFormatting.RED + "Changelog"));
        this.buttonList.add(new GuiButton(34, this.width / 2 + 30, i + 24 * 2, 140, 20, EnumChatFormatting.BLACK + "Forum"));
    }

    protected void actionPerformed(GuiButton p_146284_1_) {
        if (p_146284_1_.id == 0) {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        }

        if (p_146284_1_.id == 5) {
            this.mc.displayGuiScreen(new GuiLanguage(this, this.mc.gameSettings, this.mc.getLanguageManager()));
        }
        if (p_146284_1_.id == 1)
        {
            mc.displayGuiScreen(new GuiSelectWorld(this));
        }
        if (p_146284_1_.id == 30) {
            try {
                Desktop.getDesktop().browse(new URI("https://discord.gg/RvCQQEg"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }

        if (p_146284_1_.id == 31) {
            try {
                Desktop.getDesktop().browse(new URI("https://nodia-pvp-faction.000webhostapp.com/"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }

        if (p_146284_1_.id == 32) {
            FMLClientHandler.instance().connectToServerAtStartup("minecraft19.omgserv.com", 16271);
        }
        if (p_146284_1_.id == 33) {
            try {
                Desktop.getDesktop().browse(new URI("https://nodia-pvp-faction.000webhostapp.com/forum"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }        }
        if (p_146284_1_.id == 34) {
            try {
                Desktop.getDesktop().browse(new URI("https://nodia-pvp-faction.000webhostapp.com/p/changelog"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }

        if (p_146284_1_.id == 4) {
            this.mc.shutdown();
        }
    }

    private void func_140005_i() {
        RealmsBridge realmsbridge = new RealmsBridge();
        realmsbridge.switchToRealms(this);
    }

    public void confirmClicked(boolean p_73878_1_, int p_73878_2_) {
        if (p_73878_1_ && p_73878_2_ == 12) {
            ISaveFormat isaveformat = this.mc.getSaveLoader();
            isaveformat.flushCache();
            isaveformat.deleteWorldDirectory("Demo_World");
            this.mc.displayGuiScreen(this);
        } else if (p_73878_2_ == 13) {
            if (p_73878_1_) {
                try {
                    Class oclass = Class.forName("java.awt.Desktop");
                    Object object = oclass.getMethod("getDesktop", new Class[0]).invoke((Object) null, new Object[0]);
                    oclass.getMethod("browse", new Class[]{URI.class}).invoke(object, new Object[]{new URI(this.field_104024_v)});
                } catch (Throwable throwable) {
                    logger.error("Couldn\'t open link", throwable);
                }
            }

            this.mc.displayGuiScreen(this);
        }
    }

    /**
     * Draws the main menu panorama
     */
    private void drawPanorama(int p_73970_1_, int p_73970_2_, float p_73970_3_) {
        Tessellator tessellator = Tessellator.instance;
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glDepthMask(false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        byte b0 = 8;

        for (int k = 0; k < b0 * b0; ++k) {
            GL11.glPushMatrix();
            float f1 = ((float) (k % b0) / (float) b0 - 0.5F) / 64.0F;
            float f2 = ((float) (k / b0) / (float) b0 - 0.5F) / 64.0F;
            float f3 = 0.0F;
            GL11.glTranslatef(f1, f2, f3);
            GL11.glRotatef(MathHelper.sin(((float) this.panoramaTimer + p_73970_3_) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-((float) this.panoramaTimer + p_73970_3_) * 0.1F, 0.0F, 1.0F, 0.0F);

            for (int l = 0; l < 6; ++l) {
                GL11.glPushMatrix();

                if (l == 1) {
                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                }

                if (l == 2) {
                    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                }

                if (l == 3) {
                    GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
                }

                if (l == 4) {
                    GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                }

                if (l == 5) {
                    GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                }

                this.mc.getTextureManager().bindTexture(titlePanoramaPaths[l]);
                tessellator.startDrawingQuads();
                tessellator.setColorRGBA_I(16777215, 255 / (k + 1));
                float f4 = 0.0F;
                tessellator.addVertexWithUV(-1.0D, -1.0D, 1.0D, (double) (0.0F + f4), (double) (0.0F + f4));
                tessellator.addVertexWithUV(1.0D, -1.0D, 1.0D, (double) (1.0F - f4), (double) (0.0F + f4));
                tessellator.addVertexWithUV(1.0D, 1.0D, 1.0D, (double) (1.0F - f4), (double) (1.0F - f4));
                tessellator.addVertexWithUV(-1.0D, 1.0D, 1.0D, (double) (0.0F + f4), (double) (1.0F - f4));
                tessellator.draw();
                GL11.glPopMatrix();
            }

            GL11.glPopMatrix();
            GL11.glColorMask(true, true, true, false);
        }

        tessellator.setTranslation(0.0D, 0.0D, 0.0D);
        GL11.glColorMask(true, true, true, true);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPopMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPopMatrix();
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
    }

    /**
     * Rotate and blurs the skybox view in the main menu
     */
    private void rotateAndBlurSkybox(float p_73968_1_) {
        this.mc.getTextureManager().bindTexture(this.field_110351_G);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0, 0, 0, 256, 256);
        GL11.glEnable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColorMask(true, true, true, false);
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        byte b0 = 3;

        for (int i = 0; i < b0; ++i) {
            tessellator.setColorRGBA_F(1.0F, 1.0F, 1.0F, 1.0F / (float) (i + 1));
            int j = this.width;
            int k = this.height;
            float f1 = (float) (i - b0 / 2) / 256.0F;
            tessellator.addVertexWithUV((double) j, (double) k, (double) this.zLevel, (double) (0.0F + f1), 1.0D);
            tessellator.addVertexWithUV((double) j, 0.0D, (double) this.zLevel, (double) (1.0F + f1), 1.0D);
            tessellator.addVertexWithUV(0.0D, 0.0D, (double) this.zLevel, (double) (1.0F + f1), 0.0D);
            tessellator.addVertexWithUV(0.0D, (double) k, (double) this.zLevel, (double) (0.0F + f1), 0.0D);
        }

        tessellator.draw();
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glColorMask(true, true, true, true);
    }

    /**
     * Renders the skybox in the main menu
     */
    private void renderSkybox(int p_73971_1_, int p_73971_2_, float p_73971_3_) {
        this.mc.getFramebuffer().unbindFramebuffer();
        GL11.glViewport(0, 0, 256, 256);
        this.drawPanorama(p_73971_1_, p_73971_2_, p_73971_3_);
        this.rotateAndBlurSkybox(p_73971_3_);
        this.rotateAndBlurSkybox(p_73971_3_);
        this.rotateAndBlurSkybox(p_73971_3_);
        this.rotateAndBlurSkybox(p_73971_3_);
        this.rotateAndBlurSkybox(p_73971_3_);
        this.rotateAndBlurSkybox(p_73971_3_);
        this.rotateAndBlurSkybox(p_73971_3_);
        this.mc.getFramebuffer().bindFramebuffer(true);
        GL11.glViewport(0, 0, this.mc.displayWidth, this.mc.displayHeight);
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        float f1 = this.width > this.height ? 120.0F / (float) this.width : 120.0F / (float) this.height;
        float f2 = (float) this.height * f1 / 256.0F;
        float f3 = (float) this.width * f1 / 256.0F;
        tessellator.setColorRGBA_F(1.0F, 1.0F, 1.0F, 1.0F);
        int k = this.width;
        int l = this.height;
        tessellator.addVertexWithUV(0.0D, (double) l, (double) this.zLevel, (double) (0.5F - f2), (double) (0.5F + f3));
        tessellator.addVertexWithUV((double) k, (double) l, (double) this.zLevel, (double) (0.5F - f2), (double) (0.5F - f3));
        tessellator.addVertexWithUV((double) k, 0.0D, (double) this.zLevel, (double) (0.5F + f2), (double) (0.5F - f3));
        tessellator.addVertexWithUV(0.0D, 0.0D, (double) this.zLevel, (double) (0.5F + f2), (double) (0.5F + f3));
        tessellator.draw();
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        this.renderSkybox(p_73863_1_, p_73863_2_, p_73863_3_);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        Tessellator tessellator = Tessellator.instance;
        short short1 = 274;
        int k = this.width / 2 - short1 / 2;
        byte b0 = 30;
        this.drawGradientRect(0, 0, this.width, this.height, -2130706433, 16777215);
        this.drawGradientRect(0, 0, this.width, this.height, 0, Integer.MIN_VALUE);

        tessellator.setColorOpaque_I(-1);
        GL11.glPushMatrix();
        GL11.glTranslatef((float) (this.width / 2 + 90), 70.0F, 0.0F);
        GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
        float f1 = 1.8F - MathHelper.abs(MathHelper.sin((float) (Minecraft.getSystemTime() % 1000L) / 1000.0F * (float) Math.PI * 2.0F) * 0.1F);
        GL11.glScalef(f1, f1, f1);
        GL11.glPopMatrix();

        if (this.field_92025_p != null && this.field_92025_p.length() > 0) {
            drawRect(this.field_92022_t - 2, this.field_92021_u - 2, this.field_92020_v + 2, this.field_92019_w - 1, 1428160512);
            this.drawString(this.fontRendererObj, this.field_92025_p, this.field_92022_t, this.field_92021_u, -1);
            this.drawString(this.fontRendererObj, this.field_146972_A, (this.width - this.field_92024_r) / 2, ((GuiButton) this.buttonList.get(0)).yPosition - 12, -1);
        }

        this.mc.getTextureManager().bindTexture(minecraftTitleTextures);
        Tessellator tessellatorTitle = Tessellator.instance;
        tessellatorTitle.startDrawingQuads();
        tessellatorTitle.addVertexWithUV(10, this.height / 2 - 30, this.zLevel, 0, 0);
        tessellatorTitle.addVertexWithUV(10, this.height / 2+ 30, this.zLevel, 0, 1);
        tessellatorTitle.addVertexWithUV(150, this.height / 2 + 30, this.zLevel, 1, 1);
        tessellatorTitle.addVertexWithUV(150, this.height / 2 - 30, this.zLevel, 1, 0);
        tessellatorTitle.draw();

        this.drawCenteredString(this.fontRendererObj, I18n.format("Nodia Version : " + References.VERSION, new Object[0]), 52, 5, 2586866);


        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
    }

    /**
     * Called when the mouse is clicked.
     */
    protected void mouseClicked(int p_73864_1_, int p_73864_2_, int p_73864_3_) {
        super.mouseClicked(p_73864_1_, p_73864_2_, p_73864_3_);
        Object object = this.field_104025_t;

        synchronized (this.field_104025_t) {
            if (this.field_92025_p.length() > 0 && p_73864_1_ >= this.field_92022_t && p_73864_1_ <= this.field_92020_v && p_73864_2_ >= this.field_92021_u && p_73864_2_ <= this.field_92019_w) {
                GuiConfirmOpenLink guiconfirmopenlink = new GuiConfirmOpenLink((GuiYesNoCallback) this, this.field_104024_v, 13, true);
                guiconfirmopenlink.func_146358_g();
                this.mc.displayGuiScreen(guiconfirmopenlink);
            }
        }
    }
}