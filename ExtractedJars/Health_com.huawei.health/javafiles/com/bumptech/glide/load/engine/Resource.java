// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


public interface Resource
{

	public abstract Object get();

	public abstract Class getResourceClass();

	public abstract int getSize();

	public abstract void recycle();
}
