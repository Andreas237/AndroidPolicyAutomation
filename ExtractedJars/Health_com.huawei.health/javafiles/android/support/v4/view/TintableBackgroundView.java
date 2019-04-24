// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.res.ColorStateList;

public interface TintableBackgroundView
{

	public abstract ColorStateList getSupportBackgroundTintList();

	public abstract android.graphics.PorterDuff.Mode getSupportBackgroundTintMode();

	public abstract void setSupportBackgroundTintList(ColorStateList colorstatelist);

	public abstract void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode);
}
