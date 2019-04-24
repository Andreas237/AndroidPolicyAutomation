// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.app:
//			ActionBarDrawerToggle

static interface ActionBarDrawerToggle$ActionBarDrawerToggleImpl
{

	public abstract Drawable getThemeUpIndicator(Activity activity);

	public abstract Object setActionBarDescription(Object obj, Activity activity, int i);

	public abstract Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i);
}
