// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.drawable.Drawable;

interface ShadowViewDelegate
{

	public abstract float getRadius();

	public abstract boolean isCompatPaddingEnabled();

	public abstract void setBackgroundDrawable(Drawable drawable);

	public abstract void setShadowPadding(int i, int j, int k, int l);
}
