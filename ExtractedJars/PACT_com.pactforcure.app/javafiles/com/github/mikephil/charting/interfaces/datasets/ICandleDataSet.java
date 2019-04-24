// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;


// Referenced classes of package com.github.mikephil.charting.interfaces.datasets:
//			ILineScatterCandleRadarDataSet

public interface ICandleDataSet
	extends ILineScatterCandleRadarDataSet
{

	public abstract float getBarSpace();

	public abstract int getDecreasingColor();

	public abstract android.graphics.Paint.Style getDecreasingPaintStyle();

	public abstract int getIncreasingColor();

	public abstract android.graphics.Paint.Style getIncreasingPaintStyle();

	public abstract int getNeutralColor();

	public abstract int getShadowColor();

	public abstract boolean getShadowColorSameAsCandle();

	public abstract float getShadowWidth();

	public abstract boolean getShowCandleBar();
}
