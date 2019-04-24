// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;


// Referenced classes of package com.github.mikephil.charting.interfaces.datasets:
//			IBarLineScatterCandleBubbleDataSet

public interface IBarDataSet
	extends IBarLineScatterCandleBubbleDataSet
{

	public abstract int getBarShadowColor();

	public abstract float getBarSpace();

	public abstract int getHighLightAlpha();

	public abstract String[] getStackLabels();

	public abstract int getStackSize();

	public abstract boolean isStacked();
}
