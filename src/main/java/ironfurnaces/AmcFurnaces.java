package ironfurnaces;

import ironfurnaces.init.ClientSetup;
import ironfurnaces.init.ModSetup;
import ironfurnaces.init.Registration;
import ironfurnaces.network.Messages;
import ironfurnaces.update.UpdateChecker;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AmcFurnaces.MOD_ID)
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class AmcFurnaces
{

    public static final String MOD_ID = "ironfurnaces";
    public static final String VERSION = "1";
    public static final String MC_VERSION = "1.16.5";

    public static final Logger LOGGER = LogManager.getLogger();

    public static IEventBus MOD_EVENT_BUS;

    public AmcFurnaces() {

        Messages.registerMessages(MOD_ID + "_network");

        MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.COMMON_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);

        MOD_EVENT_BUS.register(Registration.class);
        Registration.init();

        Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-client.toml"));
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + ".toml"));


        if (Config.checkUpdates.get()) {
            new UpdateChecker();
        } else {
            AmcFurnaces.LOGGER.warn("You have disabled Iron Furnaces's Update Checker, to re-enable: change the value of Update Checker in .minecraft->config->ironfurnaces-client.toml to 'true'.");
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        //Registration.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        //Registration.registerItems(event);
    }
}
