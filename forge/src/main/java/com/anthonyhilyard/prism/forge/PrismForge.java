package com.anthonyhilyard.prism.forge;

import com.anthonyhilyard.prism.Prism;

import net.minecraft.network.chat.TextColor;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Prism.MODID)
public final class PrismForge
{
	public PrismForge(FMLJavaModLoadingContext context)
	{
		TextColor.fromRgb(0);
		context.registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> "ANY", (remote, isServer) -> true));
	}
}
