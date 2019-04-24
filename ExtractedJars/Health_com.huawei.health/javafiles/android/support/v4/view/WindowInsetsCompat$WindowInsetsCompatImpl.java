// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view:
//			WindowInsetsCompat

static interface WindowInsetsCompat$WindowInsetsCompatImpl
{

	public abstract WindowInsetsCompat consumeStableInsets(Object obj);

	public abstract WindowInsetsCompat consumeSystemWindowInsets(Object obj);

	public abstract Object getSourceWindowInsets(Object obj);

	public abstract int getStableInsetBottom(Object obj);

	public abstract int getStableInsetLeft(Object obj);

	public abstract int getStableInsetRight(Object obj);

	public abstract int getStableInsetTop(Object obj);

	public abstract int getSystemWindowInsetBottom(Object obj);

	public abstract int getSystemWindowInsetLeft(Object obj);

	public abstract int getSystemWindowInsetRight(Object obj);

	public abstract int getSystemWindowInsetTop(Object obj);

	public abstract boolean hasInsets(Object obj);

	public abstract boolean hasStableInsets(Object obj);

	public abstract boolean hasSystemWindowInsets(Object obj);

	public abstract boolean isConsumed(Object obj);

	public abstract boolean isRound(Object obj);

	public abstract WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int j, int k, int l);

	public abstract WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect);
}
