// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat

static interface TextViewCompat$TextViewCompatImpl
{

	public abstract Drawable[] getCompoundDrawablesRelative(TextView textview);

	public abstract int getMaxLines(TextView textview);

	public abstract int getMinLines(TextView textview);

	public abstract void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3);

	public abstract void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l);

	public abstract void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3);

	public abstract void setTextAppearance(TextView textview, int i);
}
