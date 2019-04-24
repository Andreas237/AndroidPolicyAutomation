// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.listener;

import android.content.ContentValues;

public interface ContentValuesListener
{

	public abstract void onBindToContentValues(ContentValues contentvalues);

	public abstract void onBindToInsertValues(ContentValues contentvalues);
}
