// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public interface Clock
{

	public abstract long currentThreadTimeMillis();

	public abstract long currentTimeMillis();

	public abstract long elapsedRealtime();

	public abstract long nanoTime();
}
