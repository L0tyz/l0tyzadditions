package net.l0tyz.l0tyzadditions.item;

import net.l0tyz.l0tyzadditions.L0tyzAdditions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, L0tyzAdditions.MOD_ID);


    public static final RegistryObject<Item> CORRUPTEDCOMPASS = ITEMS.register("corruptedcompass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPTED_EYE = ITEMS.register("corrupted_eye",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
