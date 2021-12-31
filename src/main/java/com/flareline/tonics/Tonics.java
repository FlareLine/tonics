package com.flareline.tonics;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tonics implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("tonics");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Tonics.");
	}
}
