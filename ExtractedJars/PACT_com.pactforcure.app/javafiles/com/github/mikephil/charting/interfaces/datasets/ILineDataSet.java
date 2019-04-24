// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.formatter.FillFormatter;

// Referenced classes of package com.github.mikephil.charting.interfaces.datasets:
//			ILineRadarDataSet

public interface ILineDataSet
	extends ILineRadarDataSet
{

	public abstract int getCircleColor(int i);

	public abstract int getCircleHoleColor();

	public abstract float getCircleRadius();

	public abstract float getCubicIntensity();

	public abstract DashPathEffect getDashPathEffect();

	public abstract FillFormatter getFillFormatter();

	public abstract boolean isDashedLineEnabled();

	public abstract boolean isDrawCircleHoleEnabled();

	public abstract boolean isDrawCirclesEnabled();

	public abstract boolean isDrawCubicEnabled();
}
