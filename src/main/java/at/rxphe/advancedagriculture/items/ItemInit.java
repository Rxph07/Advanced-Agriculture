package at.rxphe.advancedagriculture.items;

import at.rxphe.advancedagriculture.Advancedagriculture;
import at.rxphe.advancedagriculture.blocks.BlockInit;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Advancedagriculture.MODID);

    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NUTELLA = ITEMS.register("nutella",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SALAD = ITEMS.register("salad",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SALAD_SEEDS = ITEMS.register("salad_seeds",
            () -> new ItemNameBlockItem(BlockInit.SALAD_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> CHEESE_BURGER = ITEMS.register("cheese_burger",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> CROISSANT = ITEMS.register("croissant",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> JAM_TOAST = ITEMS.register("jam_toast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> NUTELLA_TOAST = ITEMS.register("nutella_toast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> PEANUT_BUTTER_TOAST = ITEMS.register("peanut_butter_toast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> PRETZL = ITEMS.register("pretzl",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static final RegistryObject<Item> TOAST = ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(10f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
