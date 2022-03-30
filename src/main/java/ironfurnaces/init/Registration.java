package ironfurnaces.init;

import ironfurnaces.AmcFurnaces;
import ironfurnaces.blocks.*;
import ironfurnaces.container.*;
import ironfurnaces.items.*;
import ironfurnaces.tileentity.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static ironfurnaces.AmcFurnaces.MOD_ID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MOD_ID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MOD_ID);
    //private static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MOD_ID);
    //private static final DeferredRegister<ModDimension> DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        //DIMENSIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    public static final RegistryObject<BlockAlphariumFurnace> ALPHARIUM_FURNACE = BLOCKS.register(BlockAlphariumFurnace.ALPHARIUM_FURNACE, () -> new BlockAlphariumFurnace(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Item> ALPHARIUM_FURNACE_ITEM = ITEMS.register(BlockAlphariumFurnace.ALPHARIUM_FURNACE, () -> new BlockItem(ALPHARIUM_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockAlphariumFurnaceTile>> ALPHARIUM_FURNACE_TILE = TILES.register(BlockAlphariumFurnace.ALPHARIUM_FURNACE, () -> TileEntityType.Builder.of(BlockAlphariumFurnaceTile::new, ALPHARIUM_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockAlphariumFurnaceContainer>> ALPHARIUM_FURNACE_CONTAINER = CONTAINERS.register(BlockAlphariumFurnace.ALPHARIUM_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockAlphariumFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));


    public static final RegistryObject<BlockIronFurnace> IRON_FURNACE = BLOCKS.register(BlockIronFurnace.IRON_FURNACE, () -> new BlockIronFurnace(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> IRON_FURNACE_ITEM = ITEMS.register(BlockIronFurnace.IRON_FURNACE, () -> new BlockItem(IRON_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockIronFurnaceTile>> IRON_FURNACE_TILE = TILES.register(BlockIronFurnace.IRON_FURNACE, () -> TileEntityType.Builder.of(BlockIronFurnaceTile::new, IRON_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockIronFurnaceContainer>> IRON_FURNACE_CONTAINER = CONTAINERS.register(BlockIronFurnace.IRON_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockIronFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockGoldFurnace> GOLD_FURNACE = BLOCKS.register(BlockGoldFurnace.GOLD_FURNACE, () -> new BlockGoldFurnace(AbstractBlock.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Item> GOLD_FURNACE_ITEM = ITEMS.register(BlockGoldFurnace.GOLD_FURNACE, () -> new BlockItem(GOLD_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockGoldFurnaceTile>> GOLD_FURNACE_TILE = TILES.register(BlockGoldFurnace.GOLD_FURNACE, () -> TileEntityType.Builder.of(BlockGoldFurnaceTile::new, GOLD_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockGoldFurnaceContainer>> GOLD_FURNACE_CONTAINER = CONTAINERS.register(BlockGoldFurnace.GOLD_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockGoldFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockDiamondFurnace> DIAMOND_FURNACE = BLOCKS.register(BlockDiamondFurnace.DIAMOND_FURNACE, () -> new BlockDiamondFurnace(AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Item> DIAMOND_FURNACE_ITEM = ITEMS.register(BlockDiamondFurnace.DIAMOND_FURNACE, () -> new BlockItem(DIAMOND_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockDiamondFurnaceTile>> DIAMOND_FURNACE_TILE = TILES.register(BlockDiamondFurnace.DIAMOND_FURNACE, () -> TileEntityType.Builder.of(BlockDiamondFurnaceTile::new, DIAMOND_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockDiamondFurnaceContainer>> DIAMOND_FURNACE_CONTAINER = CONTAINERS.register(BlockDiamondFurnace.DIAMOND_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockDiamondFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockEmeraldFurnace> EMERALD_FURNACE = BLOCKS.register(BlockEmeraldFurnace.EMERALD_FURNACE, () -> new BlockEmeraldFurnace(AbstractBlock.Properties.copy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Item> EMERALD_FURNACE_ITEM = ITEMS.register(BlockEmeraldFurnace.EMERALD_FURNACE, () -> new BlockItem(EMERALD_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockEmeraldFurnaceTile>> EMERALD_FURNACE_TILE = TILES.register(BlockEmeraldFurnace.EMERALD_FURNACE, () -> TileEntityType.Builder.of(BlockEmeraldFurnaceTile::new, EMERALD_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockEmeraldFurnaceContainer>> EMERALD_FURNACE_CONTAINER = CONTAINERS.register(BlockEmeraldFurnace.EMERALD_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockEmeraldFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockObsidianFurnace> OBSIDIAN_FURNACE = BLOCKS.register(BlockObsidianFurnace.OBSIDIAN_FURNACE, () -> new BlockObsidianFurnace(AbstractBlock.Properties.copy(Blocks.OBSIDIAN).strength(40.0F, 6000.0F)));
    public static final RegistryObject<Item> OBSIDIAN_FURNACE_ITEM = ITEMS.register(BlockObsidianFurnace.OBSIDIAN_FURNACE, () -> new BlockItem(OBSIDIAN_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockObsidianFurnaceTile>> OBSIDIAN_FURNACE_TILE = TILES.register(BlockObsidianFurnace.OBSIDIAN_FURNACE, () -> TileEntityType.Builder.of(BlockObsidianFurnaceTile::new, OBSIDIAN_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockObsidianFurnaceContainer>> OBSIDIAN_FURNACE_CONTAINER = CONTAINERS.register(BlockObsidianFurnace.OBSIDIAN_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockObsidianFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockCrystalFurnace> CRYSTAL_FURNACE = BLOCKS.register(BlockCrystalFurnace.CRYSTAL_FURNACE, () -> new BlockCrystalFurnace(AbstractBlock.Properties.copy(Blocks.PRISMARINE).noOcclusion().isValidSpawn(Registration::isntSolid).isSuffocating(Registration::isntSolid).isViewBlocking(Registration::isntSolid)));

    private static Boolean isntSolid(BlockState blockState, IBlockReader iBlockReader, BlockPos blockPos, EntityType<?> entityType) {

        return (Boolean) false;
    }

    public static final RegistryObject<Item> CRYSTAL_FURNACE_ITEM = ITEMS.register(BlockCrystalFurnace.CRYSTAL_FURNACE, () -> new BlockItem(CRYSTAL_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockCrystalFurnaceTile>> CRYSTAL_FURNACE_TILE = TILES.register(BlockCrystalFurnace.CRYSTAL_FURNACE, () -> TileEntityType.Builder.of(BlockCrystalFurnaceTile::new, CRYSTAL_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockCrystalFurnaceContainer>> CRYSTAL_FURNACE_CONTAINER = CONTAINERS.register(BlockCrystalFurnace.CRYSTAL_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockCrystalFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }

    public static final RegistryObject<BlockNetheriteFurnace> NETHERITE_FURNACE = BLOCKS.register(BlockNetheriteFurnace.NETHERITE_FURNACE, () -> new BlockNetheriteFurnace(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK).strength(40.0F, 6000.0F)));
    public static final RegistryObject<Item> NETHERITE_FURNACE_ITEM = ITEMS.register(BlockNetheriteFurnace.NETHERITE_FURNACE, () -> new BlockItem(NETHERITE_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockNetheriteFurnaceTile>> NETHERITE_FURNACE_TILE = TILES.register(BlockNetheriteFurnace.NETHERITE_FURNACE, () -> TileEntityType.Builder.of(BlockNetheriteFurnaceTile::new, NETHERITE_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockNetheriteFurnaceContainer>> NETHERITE_FURNACE_CONTAINER = CONTAINERS.register(BlockNetheriteFurnace.NETHERITE_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockNetheriteFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockCopperFurnace> COPPER_FURNACE = BLOCKS.register(BlockCopperFurnace.COPPER_FURNACE, () -> new BlockCopperFurnace(AbstractBlock.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Item> COPPER_FURNACE_ITEM = ITEMS.register(BlockCopperFurnace.COPPER_FURNACE, () -> new BlockItem(COPPER_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockCopperFurnaceTile>> COPPER_FURNACE_TILE = TILES.register(BlockCopperFurnace.COPPER_FURNACE, () -> TileEntityType.Builder.of(BlockCopperFurnaceTile::new, COPPER_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockCopperFurnaceContainer>> COPPER_FURNACE_CONTAINER = CONTAINERS.register(BlockCopperFurnace.COPPER_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockCopperFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockSilverFurnace> SILVER_FURNACE = BLOCKS.register(BlockSilverFurnace.SILVER_FURNACE, () -> new BlockSilverFurnace(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> SILVER_FURNACE_ITEM = ITEMS.register(BlockSilverFurnace.SILVER_FURNACE, () -> new BlockItem(SILVER_FURNACE.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockSilverFurnaceTile>> SILVER_FURNACE_TILE = TILES.register(BlockSilverFurnace.SILVER_FURNACE, () -> TileEntityType.Builder.of(BlockSilverFurnaceTile::new, SILVER_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockSilverFurnaceContainer>> SILVER_FURNACE_CONTAINER = CONTAINERS.register(BlockSilverFurnace.SILVER_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockSilverFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<ItemUpgradeIron> IRON_UPGRADE = ITEMS.register("upgrade_iron", () -> new ItemUpgradeIron(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeGold> GOLD_UPGRADE = ITEMS.register("upgrade_gold", () -> new ItemUpgradeGold(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeDiamond> DIAMOND_UPGRADE = ITEMS.register("upgrade_diamond", () -> new ItemUpgradeDiamond(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeEmerald> EMERALD_UPGRADE = ITEMS.register("upgrade_emerald", () -> new ItemUpgradeEmerald(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeObsidian> OBSIDIAN_UPGRADE = ITEMS.register("upgrade_obsidian", () -> new ItemUpgradeObsidian(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeCrystal> CRYSTAL_UPGRADE = ITEMS.register("upgrade_crystal", () -> new ItemUpgradeCrystal(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeNetherite> NETHERITE_UPGRADE = ITEMS.register("upgrade_netherite", () -> new ItemUpgradeNetherite(new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    public static final RegistryObject<ItemUpgradeCopper> COPPER_UPGRADE = ITEMS.register("upgrade_copper", () -> new ItemUpgradeCopper(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeSilver> SILVER_UPGRADE = ITEMS.register("upgrade_silver", () -> new ItemUpgradeSilver(new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    public static final RegistryObject<ItemUpgradeObsidian2> OBSIDIAN2_UPGRADE = ITEMS.register("upgrade_obsidian2", () -> new ItemUpgradeObsidian2(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeIron2> IRON2_UPGRADE = ITEMS.register("upgrade_iron2", () -> new ItemUpgradeIron2(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeGold2> GOLD2_UPGRADE = ITEMS.register("upgrade_gold2", () -> new ItemUpgradeGold2(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemUpgradeSilver2> SILVER2_UPGRADE = ITEMS.register("upgrade_silver2", () -> new ItemUpgradeSilver2(new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    public static RegistryObject<BlockAllthemodiumFurnace> ALLTHEMODIUM_FURNACE = BLOCKS.register(BlockAllthemodiumFurnace.ALLTHEMODIUM_FURNACE, () -> new BlockAllthemodiumFurnace(AbstractBlock.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Item> ALLTHEMODIUM_FURNACE_ITEM = ITEMS.register(BlockAllthemodiumFurnace.ALLTHEMODIUM_FURNACE, () -> new BlockItem(ALLTHEMODIUM_FURNACE.get(), ModList.get().isLoaded("allthemodium") ? new Item.Properties().tab(ModSetup.ITEM_GROUP) : new Item.Properties()));
    public static final RegistryObject<TileEntityType<BlockAllthemodiumFurnaceTile>> ALLTHEMODIUM_FURNACE_TILE = TILES.register(BlockAllthemodiumFurnace.ALLTHEMODIUM_FURNACE, () -> TileEntityType.Builder.of(BlockAllthemodiumFurnaceTile::new, ALLTHEMODIUM_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockAllthemodiumFurnaceContainer>> ALLTHEMODIUM_FURNACE_CONTAINER = CONTAINERS.register(BlockAllthemodiumFurnace.ALLTHEMODIUM_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockAllthemodiumFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockVibraniumFurnace> VIBRANIUM_FURNACE = BLOCKS.register(BlockVibraniumFurnace.VIBRANIUM_FURNACE, () -> new BlockVibraniumFurnace(AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Item> VIBRANIUM_FURNACE_ITEM = ITEMS.register(BlockVibraniumFurnace.VIBRANIUM_FURNACE, () -> new BlockItem(VIBRANIUM_FURNACE.get(), ModList.get().isLoaded("allthemodium") ? new Item.Properties().tab(ModSetup.ITEM_GROUP) : new Item.Properties()));
    public static final RegistryObject<TileEntityType<BlockVibraniumFurnaceTile>> VIBRANIUM_FURNACE_TILE = TILES.register(BlockVibraniumFurnace.VIBRANIUM_FURNACE, () -> TileEntityType.Builder.of(BlockVibraniumFurnaceTile::new, VIBRANIUM_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockVibraniumFurnaceContainer>> VIBRANIUM_FURNACE_CONTAINER = CONTAINERS.register(BlockVibraniumFurnace.VIBRANIUM_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockVibraniumFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<BlockUnobtainiumFurnace> UNOBTAINIUM_FURNACE = BLOCKS.register(BlockUnobtainiumFurnace.UNOBTAINIUM_FURNACE, () -> new BlockUnobtainiumFurnace(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Item> UNOBTAINIUM_FURNACE_ITEM = ITEMS.register(BlockUnobtainiumFurnace.UNOBTAINIUM_FURNACE, () -> new BlockItem(UNOBTAINIUM_FURNACE.get(), ModList.get().isLoaded("allthemodium") ? new Item.Properties().tab(ModSetup.ITEM_GROUP) : new Item.Properties()));
    public static final RegistryObject<TileEntityType<BlockUnobtainiumFurnaceTile>> UNOBTAINIUM_FURNACE_TILE = TILES.register(BlockUnobtainiumFurnace.UNOBTAINIUM_FURNACE, () -> TileEntityType.Builder.of(BlockUnobtainiumFurnaceTile::new, UNOBTAINIUM_FURNACE.get()).build(null));

    public static final RegistryObject<ContainerType<BlockUnobtainiumFurnaceContainer>> UNOBTAINIUM_FURNACE_CONTAINER = CONTAINERS.register(BlockUnobtainiumFurnace.UNOBTAINIUM_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockUnobtainiumFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<ItemUpgradeAllthemodium> ALLTHEMODIUM_UPGRADE = ITEMS.register("upgrade_allthemodium", () -> new ItemUpgradeAllthemodium(ModList.get().isLoaded("allthemodium") ? new Item.Properties().tab(ModSetup.ITEM_GROUP) : new Item.Properties()));
    public static final RegistryObject<ItemUpgradeVibranium> VIBRANIUM_UPGRADE = ITEMS.register("upgrade_vibranium", () -> new ItemUpgradeVibranium(ModList.get().isLoaded("allthemodium") ? new Item.Properties().tab(ModSetup.ITEM_GROUP) : new Item.Properties()));
    public static final RegistryObject<ItemUpgradeUnobtainium> UNOBTAINIUM_UPGRADE = ITEMS.register("upgrade_unobtainium", () -> new ItemUpgradeUnobtainium(ModList.get().isLoaded("allthemodium") ? new Item.Properties().tab(ModSetup.ITEM_GROUP) : new Item.Properties()));






    public static final RegistryObject<BlockWirelessEnergyHeater> HEATER = BLOCKS.register(BlockWirelessEnergyHeater.HEATER, () -> new BlockWirelessEnergyHeater(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> HEATER_ITEM = ITEMS.register(BlockWirelessEnergyHeater.HEATER, () -> new BlockItemHeater(HEATER.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<BlockWirelessEnergyHeaterTile>> HEATER_TILE = TILES.register(BlockWirelessEnergyHeater.HEATER, () -> TileEntityType.Builder.of(BlockWirelessEnergyHeaterTile::new, HEATER.get()).build(null));

    public static final RegistryObject<ContainerType<BlockWirelessEnergyHeaterContainer>> HEATER_CONTAINER = CONTAINERS.register(BlockWirelessEnergyHeater.HEATER, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockWirelessEnergyHeaterContainer(windowId, world, pos, inv, inv.player);
    }));

    public static final RegistryObject<ItemHeater> ITEM_HEATER = ITEMS.register("item_heater", () -> new ItemHeater(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));

    public static final RegistryObject<ItemAugmentBlasting> BLASTING_AUGMENT = ITEMS.register("augment_blasting", () -> new ItemAugmentBlasting(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<ItemAugmentSmoking> SMOKING_AUGMENT = ITEMS.register("augment_smoking", () -> new ItemAugmentSmoking(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<ItemAugmentSpeed> SPEED_AUGMENT = ITEMS.register("augment_speed", () -> new ItemAugmentSpeed(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<ItemAugmentFuel> FUEL_AUGMENT = ITEMS.register("augment_fuel", () -> new ItemAugmentFuel(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));

    public static final RegistryObject<ItemSpooky> ITEM_SPOOKY = ITEMS.register("item_spooky", () -> new ItemSpooky(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ItemXmas> ITEM_XMAS = ITEMS.register("item_xmas", () -> new ItemXmas(new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    public static final RegistryObject<ItemFurnaceCopy> ITEM_COPY = ITEMS.register("item_copy", () -> new ItemFurnaceCopy(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));

    //public static final RegistryObject<ItemLinker> ITEM_LINKER = ITEMS.register("item_linker", () -> new ItemLinker(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));

    public static final BlockMillionFurnace MILLION_FURNACE = new BlockMillionFurnace(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final Item MILLION_FURNACE_ITEM = new ItemMillionFurnace(MILLION_FURNACE, new Item.Properties().tab(ModSetup.ITEM_GROUP)).setRegistryName(AmcFurnaces.MOD_ID, BlockMillionFurnace.MILLION_FURNACE);





    public static final RegistryObject<TileEntityType<BlockMillionFurnaceTile>> MILLION_FURNACE_TILE = TILES.register(BlockMillionFurnace.MILLION_FURNACE, () -> TileEntityType.Builder.of(BlockMillionFurnaceTile::new, MILLION_FURNACE).build(null));

    public static final RegistryObject<ContainerType<BlockMillionFurnaceContainer>> MILLION_FURNACE_CONTAINER = CONTAINERS.register(BlockMillionFurnace.MILLION_FURNACE, () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntity().level;
        return new BlockMillionFurnaceContainer(windowId, world, pos, inv, inv.player);
    }));

}
