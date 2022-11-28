package net.BRUH_MOM.tippedtools;

import net.BRUH_MOM.tippedtools.item.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TippedTools implements ModInitializer {
	public static final String MOD_ID = "tippedtools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {

		Items.registerItems();

	}
}
