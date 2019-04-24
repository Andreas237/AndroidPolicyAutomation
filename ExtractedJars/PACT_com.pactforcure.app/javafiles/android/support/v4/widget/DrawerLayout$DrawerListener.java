// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

public static interface DrawerLayout$DrawerListener
{

	public abstract void onDrawerClosed(View view);

	public abstract void onDrawerOpened(View view);

	public abstract void onDrawerSlide(View view, float f);

	public abstract void onDrawerStateChanged(int i);
}
