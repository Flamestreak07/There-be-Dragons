package net.flamestreak7.therebedragons;

import net.fabricmc.api.ModInitializer;

import net.flamestreak7.therebedragons.items.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThereBeDragons implements ModInitializer
{
	public static final String MOD_ID = "there-be-dragons";
    public static final Logger LOGGER = LoggerFactory.getLogger("there-be-dragons");

	@Override
	public void onInitialize()
	{
		Items.registerModItems();
	}
}