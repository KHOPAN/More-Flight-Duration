package com.khopan.moreflightduration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class MoreFlightDuration implements ModInitializer {
	public static final String MOD_NAME = "More Flight Duration";
	public static final String MOD_ID = "moreflightduration";

	public static final Logger LOGGER = LoggerFactory.getLogger(MoreFlightDuration.MOD_NAME);

	@Override
	public void onInitialize() {
		MoreFlightDuration.LOGGER.info("Initializing {}", MoreFlightDuration.MOD_NAME);
	}
}
