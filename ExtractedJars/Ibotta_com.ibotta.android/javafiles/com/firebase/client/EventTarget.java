// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;


public interface EventTarget
{

	public abstract void postEvent(Runnable runnable);

	public abstract void restart();

	public abstract void shutdown();
}
