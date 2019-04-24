// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;


// Referenced classes of package com.github.mikephil.charting.interfaces.datasets:
//			ILineScatterCandleRadarDataSet

public interface IScatterDataSet
	extends ILineScatterCandleRadarDataSet
{

	public abstract com.github.mikephil.charting.charts.ScatterChart.ScatterShape getScatterShape();

	public abstract int getScatterShapeHoleColor();

	public abstract float getScatterShapeHoleRadius();

	public abstract float getScatterShapeSize();
}
