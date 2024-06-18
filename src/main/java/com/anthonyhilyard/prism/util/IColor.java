package com.anthonyhilyard.prism.util;

import org.jetbrains.annotations.Nullable;

public interface IColor
{
	@Nullable
	public String getName();
	public int getValue();
	public boolean isAnimated();
}
