package ironfurnaces.init;

import ironfurnaces.AmcFurnaces;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = AmcFurnaces.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final ItemGroup ITEM_GROUP = new ItemGroup(AmcFurnaces.MOD_ID) {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registration.IRON_FURNACE.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {

    }



}