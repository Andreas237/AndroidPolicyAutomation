// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import com.google.android.exoplayer.upstream.Allocator;

public interface LoadControl
{

	public abstract Allocator getAllocator();

	public abstract void register(Object obj, int i);

	public abstract void trimAllocator();

	public abstract void unregister(Object obj);

	public abstract boolean update(Object obj, long l, long l1, boolean flag);
}
