// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.dataprovider;

import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.formatter.ValueFormatter;

public interface ChartInterface
{

	public abstract PointF getCenterOfView();

	public abstract PointF getCenterOffsets();

	public abstract RectF getContentRect();

	public abstract ChartData getData();

	public abstract ValueFormatter getDefaultValueFormatter();

	public abstract int getHeight();

	public abstract int getWidth();

	public abstract float getXChartMax();

	public abstract float getXChartMin();

	public abstract int getXValCount();

	public abstract float getYChartMax();

	public abstract float getYChartMin();
}
