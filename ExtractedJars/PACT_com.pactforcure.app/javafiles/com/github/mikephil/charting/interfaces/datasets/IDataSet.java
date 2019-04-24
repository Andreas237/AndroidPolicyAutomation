// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;

import android.graphics.Typeface;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;

public interface IDataSet
{

	public abstract boolean addEntry(Entry entry);

	public abstract void addEntryOrdered(Entry entry);

	public abstract void calcMinMax(int i, int j);

	public abstract void clear();

	public abstract boolean contains(Entry entry);

	public abstract com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency();

	public abstract int getColor();

	public abstract int getColor(int i);

	public abstract List getColors();

	public abstract int getEntryCount();

	public abstract Entry getEntryForIndex(int i);

	public abstract Entry getEntryForXIndex(int i);

	public abstract Entry getEntryForXIndex(int i, com.github.mikephil.charting.data.DataSet.Rounding rounding);

	public abstract int getEntryIndex(int i, com.github.mikephil.charting.data.DataSet.Rounding rounding);

	public abstract int getEntryIndex(Entry entry);

	public abstract int getIndexInEntries(int i);

	public abstract String getLabel();

	public abstract ValueFormatter getValueFormatter();

	public abstract int getValueTextColor();

	public abstract int getValueTextColor(int i);

	public abstract float getValueTextSize();

	public abstract Typeface getValueTypeface();

	public abstract float getYMax();

	public abstract float getYMin();

	public abstract float getYValForXIndex(int i);

	public abstract boolean isDrawValuesEnabled();

	public abstract boolean isHighlightEnabled();

	public abstract boolean isVisible();

	public abstract boolean removeEntry(int i);

	public abstract boolean removeEntry(Entry entry);

	public abstract boolean removeFirst();

	public abstract boolean removeLast();

	public abstract void setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency);

	public abstract void setDrawValues(boolean flag);

	public abstract void setHighlightEnabled(boolean flag);

	public abstract void setLabel(String s);

	public abstract void setValueFormatter(ValueFormatter valueformatter);

	public abstract void setValueTextColor(int i);

	public abstract void setValueTextColors(List list);

	public abstract void setValueTextSize(float f);

	public abstract void setValueTypeface(Typeface typeface);

	public abstract void setVisible(boolean flag);
}
