// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.dataprovider;

import com.github.mikephil.charting.data.CandleData;

// Referenced classes of package com.github.mikephil.charting.interfaces.dataprovider:
//			BarLineScatterCandleBubbleDataProvider

public interface CandleDataProvider
	extends BarLineScatterCandleBubbleDataProvider
{

	public abstract CandleData getCandleData();
}
