// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;


public interface LifecycleListener
{

	public abstract void onDestroy();

	public abstract void onStart();

	public abstract void onStop();
}
