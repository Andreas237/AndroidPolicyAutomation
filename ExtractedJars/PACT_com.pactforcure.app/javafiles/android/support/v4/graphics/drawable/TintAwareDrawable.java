// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;

public interface TintAwareDrawable
{

	public abstract void setTint(int i);

	public abstract void setTintList(ColorStateList colorstatelist);

	public abstract void setTintMode(android.graphics.PorterDuff.Mode mode);
}
