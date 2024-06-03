package net.flamestreak7.therebedragons.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flamestreak7.therebedragons.ThereBeDragons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items
{
    public static final Item FIRSTITEM = registerItem("firstitem", new Item(new FabricItemSettings()));
    public static final Item RUBYSNAKESKIN = registerItem("rubysnakeskin", new Item(new FabricItemSettings()));



//    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
//    { // This adds shit to the creative menu, specifically the ingredients tab
//
//    }


    private static Item registerItem(String name, Item item)
    { // This makes them a unique item
        return Registry.register(Registries.ITEM, new Identifier(ThereBeDragons.MOD_ID, name), item);
    }
    public static void registerModItems()
    { // This registers them as an item
        ThereBeDragons.LOGGER.info("Registering mod items for " + ThereBeDragons.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Items ::addItemsToIngredientItemGroup);
    }
}
