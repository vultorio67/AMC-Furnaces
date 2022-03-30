package ironfurnaces.gui;

import ironfurnaces.AmcFurnaces;
import ironfurnaces.container.BlockUnobtainiumFurnaceContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockUnobtainiumFurnaceScreen extends BlockIronFurnaceScreenBase<BlockUnobtainiumFurnaceContainer> {


    public BlockUnobtainiumFurnaceScreen(BlockUnobtainiumFurnaceContainer container, PlayerInventory inv, ITextComponent name) {
        super(container, inv, name);
        this.GUI = new ResourceLocation(AmcFurnaces.MOD_ID + ":" +"textures/gui/furnace_unobtanium.png");
    }
}
