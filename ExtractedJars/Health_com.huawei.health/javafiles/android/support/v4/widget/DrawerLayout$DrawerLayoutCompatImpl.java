// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

static interface DrawerLayout$DrawerLayoutCompatImpl
{

	public abstract void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i);

	public abstract void configureApplyInsets(View view);

	public abstract void dispatchChildInsets(View view, Object obj, int i);

	public abstract Drawable getDefaultStatusBarBackground(Context context);

	public abstract int getTopInset(Object obj);
}
