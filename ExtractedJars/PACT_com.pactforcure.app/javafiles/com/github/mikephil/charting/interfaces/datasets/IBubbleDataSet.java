// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;


// Referenced classes of package com.github.mikephil.charting.interfaces.datasets:
//			IBarLineScatterCandleBubbleDataSet

public interface IBubbleDataSet
	extends IBarLineScatterCandleBubbleDataSet
{

	public abstract float getHighlightCircleWidth();

	public abstract float getMaxSize();

	public abstract float getXMax();

	public abstract float getXMin();

	public abstract void setHighlightCircleWidth(float f);
}
