// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;


public interface EventsManager
{

	public abstract void deleteAllEvents();

	public abstract void recordEvent(Object obj);

	public abstract void sendEvents();
}
