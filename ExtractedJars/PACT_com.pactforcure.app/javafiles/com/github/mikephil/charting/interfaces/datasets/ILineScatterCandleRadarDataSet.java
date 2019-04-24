// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;

import android.graphics.DashPathEffect;

// Referenced classes of package com.github.mikephil.charting.interfaces.datasets:
//			IBarLineScatterCandleBubbleDataSet

public interface ILineScatterCandleRadarDataSet
	extends IBarLineScatterCandleBubbleDataSet
{

	public abstract DashPathEffect getDashPathEffectHighlight();

	public abstract float getHighlightLineWidth();

	public abstract boolean isHorizontalHighlightIndicatorEnabled();

	public abstract boolean isVerticalHighlightIndicatorEnabled();
}
