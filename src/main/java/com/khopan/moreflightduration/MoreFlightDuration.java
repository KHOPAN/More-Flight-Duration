package com.khopan.moreflightduration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraftforge.fml.common.Mod;

@Mod(MoreFlightDuration.MOD_ID)
public class MoreFlightDuration {
	public static final String MOD_NAME = "More Flight Duration";
	public static final String MOD_ID = "moreflightduration";

	public static final Logger LOGGER = LoggerFactory.getLogger(MoreFlightDuration.MOD_NAME);

	public MoreFlightDuration() {
		MoreFlightDuration.LOGGER.info("Initializing {}", MoreFlightDuration.MOD_NAME);
	}
}
