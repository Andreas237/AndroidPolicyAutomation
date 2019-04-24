// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.dataprovider;

import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.utils.Transformer;

// Referenced classes of package com.github.mikephil.charting.interfaces.dataprovider:
//			ChartInterface

public interface BarLineScatterCandleBubbleDataProvider
	extends ChartInterface
{

	public abstract BarLineScatterCandleBubbleData getData();

	public abstract int getHighestVisibleXIndex();

	public abstract int getLowestVisibleXIndex();

	public abstract int getMaxVisibleCount();

	public abstract Transformer getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency);

	public abstract boolean isInverted(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency);
}
