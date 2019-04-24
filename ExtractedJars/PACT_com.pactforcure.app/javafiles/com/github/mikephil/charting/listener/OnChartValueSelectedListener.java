// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;

public interface OnChartValueSelectedListener
{

	public abstract void onNothingSelected();

	public abstract void onValueSelected(Entry entry, int i, Highlight highlight);
}
