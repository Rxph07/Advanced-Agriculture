package at.rxphe.advancedagriculture;

import at.rxphe.advancedagriculture.blocks.BlockInit;
import at.rxphe.advancedagriculture.blocks.entity.ModBlockEntities;
import at.rxphe.advancedagriculture.items.ItemInit;
import at.rxphe.advancedagriculture.loot.LootModifiersInit;
import at.rxphe.advancedagriculture.screen.HandmillScreen;
import at.rxphe.advancedagriculture.screen.ModMenuTypes;
import at.rxphe.advancedagriculture.utils.ModCreativeModeTab;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Advancedagriculture.MODID)
public class Advancedagriculture {

    public static final String MODID = "advancedagriculture";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Advancedagriculture() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);

        ModMenuTypes.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        LootModifiersInit.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTab.TAB) {
            /********** ITEMS **********/
            event.accept(ItemInit.BAGUETTE);
            event.accept(ItemInit.CHEESE_BURGER);
            event.accept(ItemInit.CROISSANT);
            event.accept(ItemInit.HAMBURGER);
            event.accept(ItemInit.JAM_TOAST);
            event.accept(ItemInit.NUTELLA_TOAST);
            event.accept(ItemInit.PEANUT_BUTTER_TOAST);
            event.accept(ItemInit.PIZZA);
            event.accept(ItemInit.PRETZL);
            event.accept(ItemInit.SANDWICH);
            event.accept(ItemInit.TOAST);
            event.accept(ItemInit.FLOUR);
            event.accept(ItemInit.NUTELLA);
            event.accept(ItemInit.SALAD);
            event.accept(ItemInit.SALAD_SEEDS);
            event.accept(ItemInit.DOUGH);

            /********** BLOCKS **********/
            event.accept(BlockInit.HANDMILL);
            event.accept(BlockInit.PALM_LEAVES);
            event.accept(BlockInit.PALM_SAPLING);
            event.accept(BlockInit.PALM_LOG);
            event.accept(BlockInit.PALM_WOOD);
            event.accept(BlockInit.PALM_PLANKS);
            event.accept(BlockInit.STRIPPED_PALM_LOG);
            event.accept(BlockInit.STRIPPED_PALM_WOOD);
        }
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {

            /********** BLOCKS **********/
            event.accept(BlockInit.PALM_LOG);
            event.accept(BlockInit.PALM_WOOD);
            event.accept(BlockInit.PALM_PLANKS);
            event.accept(BlockInit.STRIPPED_PALM_LOG);
            event.accept(BlockInit.STRIPPED_PALM_WOOD);
        }

        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            /********** BLOCKS **********/
            event.accept(BlockInit.PALM_LEAVES);
            event.accept(BlockInit.PALM_SAPLING);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(BlockInit.SALAD_CROP.get(), RenderType.cutout());

            MenuScreens.register(ModMenuTypes.HANDMILL_MENU.get(), HandmillScreen::new);
        }
    }
}
