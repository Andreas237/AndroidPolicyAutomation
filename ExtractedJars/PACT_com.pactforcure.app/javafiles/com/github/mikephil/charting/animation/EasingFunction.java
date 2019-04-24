// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;

public interface EasingFunction
	extends TimeInterpolator
{

	public abstract float getInterpolation(float f);
}
