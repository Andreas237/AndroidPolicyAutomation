// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Slide

private static interface Slide$CalculateSlide
{

	public abstract float getGoneX(ViewGroup viewgroup, View view);

	public abstract float getGoneY(ViewGroup viewgroup, View view);
}
