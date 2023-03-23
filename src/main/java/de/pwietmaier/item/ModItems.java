package de.pwietmaier.item;

import de.pwietmaier.GanacciMod;
import de.pwietmaier.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));
    public static final Item GANACCI_HORSE_MUSIC_DISK = registerItem("music_disc_ganacci_horse",
            new MusicDiscItem(7, ModSounds.GANACCI_HORSE, new FabricItemSettings().maxCount(1), 166));

    public static void registerModItems() {
        GanacciMod.LOGGER.info("Registering Items");
        addItemsToItemGroup();
    }

    private static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, CITRINE);
        addToItemGroup(ItemGroups.INGREDIENTS, GANACCI_HORSE_MUSIC_DISK);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GanacciMod.MOD_ID, name), item);
    }
}
