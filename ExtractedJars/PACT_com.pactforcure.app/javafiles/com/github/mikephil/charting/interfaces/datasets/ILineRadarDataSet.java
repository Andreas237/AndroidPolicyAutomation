// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.interfaces.datasets;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.github.mikephil.charting.interfaces.datasets:
//			ILineScatterCandleRadarDataSet

public interface ILineRadarDataSet
	extends ILineScatterCandleRadarDataSet
{

	public abstract int getFillAlpha();

	public abstract int getFillColor();

	public abstract Drawable getFillDrawable();

	public abstract float getLineWidth();

	public abstract boolean isDrawFilledEnabled();

	public abstract void setDrawFilled(boolean flag);
}
