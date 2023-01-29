package at.rxphe.advancedagriculture.blocks.entity;

import at.rxphe.advancedagriculture.Advancedagriculture;
import at.rxphe.advancedagriculture.blocks.BlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Advancedagriculture.MODID);

    public static final RegistryObject<BlockEntityType<HandmillBlockEntity>> HANDMILL =
            BLOCK_ENTITIES.register("handmill", () -> BlockEntityType.Builder.of(HandmillBlockEntity::new,
                    BlockInit.HANDMILL.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
