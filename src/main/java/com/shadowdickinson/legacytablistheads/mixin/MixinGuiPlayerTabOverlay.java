package com.shadowdickinson.legacytablistheads.mixin;

import com.shadowdickinson.legacytablistheads.LegacyTablistHeads;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.network.NetworkManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GuiPlayerTabOverlay.class)
public abstract class MixinGuiPlayerTabOverlay {

    private static boolean legacytablistheads$logged;

    @Redirect(
            method = "renderPlayerlist",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/network/NetworkManager;isEncrypted()Z"
            )
    )
    private boolean legacytablistheads$forceEncryptedForTabHeads(NetworkManager networkManager) {
        if (!legacytablistheads$logged) {
            legacytablistheads$logged = true;
            LegacyTablistHeads.LOGGER.debug("[LegacyTablistHeads] Tablist head support active.");
        }
        return true;
    }
}
