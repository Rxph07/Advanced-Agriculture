package at.rxphe.advancedagriculture.utils;

import at.rxphe.advancedagriculture.Advancedagriculture;
import at.rxphe.advancedagriculture.items.ItemInit;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Advancedagriculture.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {

    public static CreativeModeTab TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TAB = event.registerCreativeModeTab(new ResourceLocation(Advancedagriculture.MODID, "advanced_agriculture"),
                builder -> builder.icon(() -> new ItemStack(ItemInit.SALAD.get()))
                        .title(Component.literal("Advanced AGRICULTURE")).build());
    }
}
