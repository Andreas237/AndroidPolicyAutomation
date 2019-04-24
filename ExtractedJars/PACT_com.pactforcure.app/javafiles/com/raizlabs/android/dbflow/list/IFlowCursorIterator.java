// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import android.database.Cursor;

public interface IFlowCursorIterator
{

	public abstract Cursor cursor();

	public abstract int getCount();

	public abstract Object getItem(long l);
}
