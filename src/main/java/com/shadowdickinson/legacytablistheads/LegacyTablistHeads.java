package com.shadowdickinson.legacytablistheads;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = LegacyTablistHeads.MOD_ID,
        name = LegacyTablistHeads.MOD_NAME,
        version = LegacyTablistHeads.VERSION,
        acceptedMinecraftVersions = "[1.12.2]",
        dependencies = "required-after:mixinbooter@[10.7,)",
        clientSideOnly = true
)
public final class LegacyTablistHeads {

    public static final String MOD_ID = "legacytablistheads";
    public static final String MOD_NAME = "Legacy Tablist Heads";
    public static final String VERSION = "1.0.0";

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("[LegacyTablistHeads] Loaded client-side tablist head support.");
    }
}
