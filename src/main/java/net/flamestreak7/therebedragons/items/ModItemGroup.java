package net.flamestreak7.therebedragons.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flamestreak7.therebedragons.ThereBeDragons;
import net.flamestreak7.therebedragons.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup
{
    public static final ItemGroup THERE_BE_DRAGONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThereBeDragons.MOD_ID, "rubysnakeskin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.therebedragons"))
                    .icon(() -> new ItemStack(Items.RUBYSNAKESKIN)).entries((displayContext, entries) ->
                    {
                        entries.add(Items.FIRSTITEM);
                        entries.add(ModBlocks.FIRSTBLOCK);

                        entries.add(Items.FIREWAND);
                        entries.add(Items.RUBYSNAKESKIN);
                        entries.add(Items.TOPAZSNAKESKIN);
                        entries.add(Items.EMERALDSNAKESKIN);
                        entries.add(Items.SAPPHIRESNAKESKIN);
                        entries.add(Items.DRAGONSCALE);
                        entries.add(Items.DRAGONTOOTH);
                        entries.add(Items.TOOTHSHARD);

                        entries.add(Items.DRAGONHELMET);
                        entries.add(Items.DRAGONCHESTPLATE);
                        entries.add(Items.DRAGONLEGGINGS);
                        entries.add(Items.DRAGONBOOTS);

                        entries.add(Items.DRAGONSHOVEL);
                        entries.add(Items.DRAGONTOOTHKNIFE);
                        entries.add(Items.DRAGONBOW);

                        entries.add(ModBlocks.SCORCHEDGRASS);
                    }).build());
    public static void registerItemGroup()
    {
        ThereBeDragons.LOGGER.info("Registering Item Group for " + ThereBeDragons.MOD_ID);
    }
}
