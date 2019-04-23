// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


public interface ArrayPool
{

	public abstract void clearMemory();

	public abstract Object get(int i, Class class1);

	public abstract Object getExact(int i, Class class1);

	public abstract void put(Object obj);

	public abstract void put(Object obj, Class class1);

	public abstract void trimMemory(int i);

	public static final int STANDARD_BUFFER_SIZE_BYTES = 0x10000;
}
