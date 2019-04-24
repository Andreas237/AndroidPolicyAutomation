// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.dataprovider;

import com.github.mikephil.charting.data.BarData;

// Referenced classes of package com.github.mikephil.charting.interfaces.dataprovider:
//			BarLineScatterCandleBubbleDataProvider

public interface BarDataProvider
	extends BarLineScatterCandleBubbleDataProvider
{

	public abstract BarData getBarData();

	public abstract boolean isDrawBarShadowEnabled();

	public abstract boolean isDrawHighlightArrowEnabled();

	public abstract boolean isDrawValueAboveBarEnabled();
}
