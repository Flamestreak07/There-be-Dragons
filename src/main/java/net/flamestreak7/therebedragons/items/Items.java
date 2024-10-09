package net.flamestreak7.therebedragons.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flamestreak7.therebedragons.ThereBeDragons;
import net.flamestreak7.therebedragons.items.custom.DragonBowItem;
import net.flamestreak7.therebedragons.items.custom.ToothKnifeItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items
{
    public static final Item FIRSTITEM = registerItem("firstitem", new Item(new FabricItemSettings()));
    public static final Item FIREWAND = registerItem("firewand", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item DRAGONSHOVEL = registerItem("dragonshovel", new ShovelItem(ModToolMaterials.DRAGONSCALE, 2, -3f, new FabricItemSettings()));
    public static final Item DRAGONTOOTHKNIFE = registerItem("toothknife", new ToothKnifeItem(ModToolMaterials.DRAGONTOOTH, 2, 4f, new FabricItemSettings()));
    public static final Item DRAGONBOW = registerItem("dragonbow", new DragonBowItem(new FabricItemSettings()));

    public static final Item RUBYSNAKESKIN = registerItem("rubysnakeskin", new Item(new FabricItemSettings()));
    public static final Item TOPAZSNAKESKIN = registerItem("topazsnakeskin", new Item(new FabricItemSettings()));
    public static final Item EMERALDSNAKESKIN = registerItem("emeraldsnakeskin", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRESNAKESKIN = registerItem("sapphiresnakeskin", new Item(new FabricItemSettings()));

    public static final Item DRAGONSCALE = registerItem("dragonscale", new Item(new FabricItemSettings()));
    public static final Item DRAGONTOOTH = registerItem("dragontooth", new Item(new FabricItemSettings()));
    public static final Item TOOTHSHARD = registerItem("toothshard", new Item(new FabricItemSettings()));

    public static final Item DRAGONHELMET = registerItem("dragonhelmet", new ArmorItem(ModArmorMaterials.DRAGONSCALE,
            ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DRAGONCHESTPLATE = registerItem("dragonchestplate", new ArmorItem(ModArmorMaterials.DRAGONSCALE,
            ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DRAGONLEGGINGS = registerItem("dragonleggings", new ArmorItem(ModArmorMaterials.DRAGONSCALE,
            ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DRAGONBOOTS = registerItem("dragonboots", new ArmorItem(ModArmorMaterials.DRAGONSCALE,
            ArmorItem.Type.BOOTS, new FabricItemSettings()));




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
