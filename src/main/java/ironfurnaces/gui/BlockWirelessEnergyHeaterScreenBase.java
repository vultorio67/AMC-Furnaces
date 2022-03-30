package ironfurnaces.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import ironfurnaces.AmcFurnaces;
import ironfurnaces.container.BlockWirelessEnergyHeaterContainer;
import ironfurnaces.util.StringHelper;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class BlockWirelessEnergyHeaterScreenBase<T extends BlockWirelessEnergyHeaterContainer> extends ContainerScreen<T> {

    public ResourceLocation GUI = new ResourceLocation(AmcFurnaces.MOD_ID + ":" + "textures/gui/heater.png");
    PlayerInventory playerInv;
    ITextComponent name;

    public BlockWirelessEnergyHeaterScreenBase(T t, PlayerInventory inv, ITextComponent name) {
        super(t, inv, name);
        playerInv = inv;
        this.name = name;
    }

    @Override
    public void render(MatrixStack matrix, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrix);
        super.render(matrix, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrix, mouseX, mouseY);
    }

    @Override
    protected void renderLabels(MatrixStack matrix, int mouseX, int mouseY) {
        this.minecraft.font.draw(matrix, this.playerInv.getDisplayName(), 7, this.getYSize() - 93, 4210752);
        this.minecraft.font.draw(matrix, name, this.getXSize() / 2 - this.minecraft.font.width(name.getString()) / 2, 6, 4210752);

        int actualMouseX = mouseX - ((this.width - this.getXSize()) / 2);
        int actualMouseY = mouseY - ((this.height - this.getYSize()) / 2);
        if(actualMouseX >= 65 && actualMouseX <= 111 && actualMouseY >= 64 && actualMouseY <= 76) {
            int energy = ((BlockWirelessEnergyHeaterContainer)this.getMenu()).getEnergy();
            int capacity = ((BlockWirelessEnergyHeaterContainer)this.getMenu()).getCapacity();
            this.renderTooltip(matrix, new StringTextComponent(StringHelper.displayEnergy(energy, capacity).get(0)), actualMouseX, actualMouseY);
        }

    }

    @Override
    protected void renderBg(MatrixStack matrix, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bind(GUI);
        int relX = (this.width - this.getXSize()) / 2;
        int relY = (this.height - this.getYSize()) / 2;
        this.blit(matrix, relX, relY, 0, 0, this.getXSize(), this.getYSize());

        int i;
        i = ((BlockWirelessEnergyHeaterContainer)this.getMenu()).getEnergyScaled(46);
        this.blit(matrix, getGuiLeft() + 65, getGuiTop() + 64, 176, 0, i + 1, 12);
    }

}
