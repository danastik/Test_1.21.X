package net.danastik.test;

import net.danastik.test.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class TestClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
