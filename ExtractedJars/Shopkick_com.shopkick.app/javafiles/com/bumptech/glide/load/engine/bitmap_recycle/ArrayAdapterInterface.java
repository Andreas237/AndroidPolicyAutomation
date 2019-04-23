// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


interface ArrayAdapterInterface
{

	public abstract int getArrayLength(Object obj);

	public abstract int getElementSizeInBytes();

	public abstract String getTag();

	public abstract Object newArray(int i);
}
