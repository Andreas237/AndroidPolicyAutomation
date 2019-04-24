// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

public interface OnDrawListener
{

	public abstract void onDrawFinished(DataSet dataset);

	public abstract void onEntryAdded(Entry entry);

	public abstract void onEntryMoved(Entry entry);
}
