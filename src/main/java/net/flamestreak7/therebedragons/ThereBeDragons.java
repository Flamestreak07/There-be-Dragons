package net.flamestreak7.therebedragons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThereBeDragons implements ModInitializer {
	public static final String MOD_ID = "there-be-dragons";
    public static final Logger LOGGER = LoggerFactory.getLogger("there-be-dragons");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.

		LOGGER.info("Hello Fabric world!");
	}
}