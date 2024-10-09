package net.flamestreak7.therebedragons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.flamestreak7.therebedragons.items.Items;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModelProvider extends FabricModelProvider
{
    public ModelProvider(FabricDataOutput output)
    {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.registerArmor(((ArmorItem) Items.DRAGONHELMET));
        itemModelGenerator.registerArmor(((ArmorItem) Items.DRAGONCHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) Items.DRAGONLEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) Items.DRAGONBOOTS));

        itemModelGenerator.register(Items.DRAGONSHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Items.DRAGONTOOTHKNIFE, Models.HANDHELD);
    }
}
