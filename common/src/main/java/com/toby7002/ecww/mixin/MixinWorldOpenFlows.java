package com.toby7002.ecww.mixin;

import net.minecraft.client.gui.screens.worldselection.WorldOpenFlows;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(WorldOpenFlows.class)
public abstract class MixinWorldOpenFlows {
    @ModifyVariable(
            method = "confirmWorldCreation",
            at = @At("HEAD"),
            argsOnly = true,
            index = 4
    )
    private static boolean disableWarningScreen(boolean original) {
        return true;
    }
}