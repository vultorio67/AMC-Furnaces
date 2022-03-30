package ironfurnaces.tileentity;

import ironfurnaces.Config;
import ironfurnaces.container.BlockAlphariumFurnaceContainer;
import ironfurnaces.container.BlockIronFurnaceContainer;
import ironfurnaces.init.Registration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraftforge.common.ForgeConfigSpec;

public class BlockAlphariumFurnaceTile extends BlockIronFurnaceTileBase {
    public BlockAlphariumFurnaceTile() {
        super(Registration.ALPHARIUM_FURNACE_TILE.get());
    }

    @Override
    public ForgeConfigSpec.IntValue getCookTimeConfig() {
        return Config.ironFurnaceSpeed;
    }

    @Override
    public String IgetName() {
        return "container.alphariumfurnaces.alpharium_furnace";
    }

    @Override
    public Container IcreateMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new BlockAlphariumFurnaceContainer(i, level, worldPosition, playerInventory, playerEntity, this.fields);
    }

}
