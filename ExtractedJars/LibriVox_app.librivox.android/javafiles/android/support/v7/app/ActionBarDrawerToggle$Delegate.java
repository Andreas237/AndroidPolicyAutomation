// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;

public interface ActionBarDrawerToggle$Delegate
{

	public abstract Context getActionBarThemedContext();

	public abstract Drawable getThemeUpIndicator();

	public abstract boolean isNavigationVisible();

	public abstract void setActionBarDescription(int i);

	public abstract void setActionBarUpIndicator(Drawable drawable, int i);
}
