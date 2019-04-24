// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;


public interface Model
{

	public abstract void delete();

	public abstract boolean exists();

	public abstract long insert();

	public abstract void load();

	public abstract void save();

	public abstract void update();

	public static final long INVALID_ROW_ID = -1L;
}
