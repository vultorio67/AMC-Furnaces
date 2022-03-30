package ironfurnaces.blocks;

import ironfurnaces.tileentity.BlockAlphariumFurnaceTile;
import ironfurnaces.tileentity.BlockIronFurnaceTile;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class BlockAlphariumFurnace extends BlockIronFurnaceBase {

    public static final String ALPHARIUM_FURNACE = "alpharium_furnace";

    public BlockAlphariumFurnace(Properties properties) {
        super(properties);
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 1;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new BlockAlphariumFurnaceTile();
    }
}
