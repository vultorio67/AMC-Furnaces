package ironfurnaces.gui;

import ironfurnaces.container.BlockAlphariumFurnaceContainer;
import ironfurnaces.container.BlockIronFurnaceContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockAlphariumFurnaceScreen extends BlockIronFurnaceScreenBase<BlockAlphariumFurnaceContainer> {


    public BlockAlphariumFurnaceScreen(BlockAlphariumFurnaceContainer container, PlayerInventory inv, ITextComponent name) {
        super(container, inv, name);
    }
}
