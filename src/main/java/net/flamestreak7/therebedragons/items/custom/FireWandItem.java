package net.flamestreak7.therebedragons.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class FireWandItem extends Item
{
    public FireWandItem(Settings settings)
    {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context)
    {

        return ActionResult.SUCCESS;
    }
}
