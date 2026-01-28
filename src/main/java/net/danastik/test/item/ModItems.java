package net.danastik.test.item;

import net.danastik.test.Test_121X;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Test_121X.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Test_121X.LOGGER.info("Registering Mod Items for " + Test_121X.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CHEESE);
        });
    }
}
