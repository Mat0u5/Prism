package com.anthonyhilyard.prism.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.client.DeltaTracker;

public class RenderTickEvent
{
	public RenderTickEvent() { }

	public static final Event<RenderTickEvent.Start> START = EventFactory.createArrayBacked(RenderTickEvent.Start.class,
		callbacks -> (tracker) -> {
		for (RenderTickEvent.Start callback : callbacks)
		{
			callback.onStart(tracker);
		}
	});

	@FunctionalInterface
	public interface Start
	{
		void onStart(DeltaTracker tracker);
	}
}
