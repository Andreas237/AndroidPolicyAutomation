// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;

// Referenced classes of package android.support.v7.widget:
//			CardViewDelegate

interface CardViewImpl
{

	public abstract ColorStateList getBackgroundColor(CardViewDelegate cardviewdelegate);

	public abstract float getElevation(CardViewDelegate cardviewdelegate);

	public abstract float getMaxElevation(CardViewDelegate cardviewdelegate);

	public abstract float getMinHeight(CardViewDelegate cardviewdelegate);

	public abstract float getMinWidth(CardViewDelegate cardviewdelegate);

	public abstract float getRadius(CardViewDelegate cardviewdelegate);

	public abstract void initStatic();

	public abstract void initialize(CardViewDelegate cardviewdelegate, Context context, ColorStateList colorstatelist, float f, float f1, float f2);

	public abstract void onCompatPaddingChanged(CardViewDelegate cardviewdelegate);

	public abstract void onPreventCornerOverlapChanged(CardViewDelegate cardviewdelegate);

	public abstract void setBackgroundColor(CardViewDelegate cardviewdelegate, ColorStateList colorstatelist);

	public abstract void setElevation(CardViewDelegate cardviewdelegate, float f);

	public abstract void setMaxElevation(CardViewDelegate cardviewdelegate, float f);

	public abstract void setRadius(CardViewDelegate cardviewdelegate, float f);

	public abstract void updatePadding(CardViewDelegate cardviewdelegate);
}
