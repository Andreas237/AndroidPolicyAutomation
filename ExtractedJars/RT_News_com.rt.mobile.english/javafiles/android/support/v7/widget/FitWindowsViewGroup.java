// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;

public interface FitWindowsViewGroup
{
	public static interface OnFitSystemWindowsListener
	{

		public abstract void onFitSystemWindows(Rect rect);
	}


	public abstract void setOnFitSystemWindowsListener(OnFitSystemWindowsListener onfitsystemwindowslistener);
}
