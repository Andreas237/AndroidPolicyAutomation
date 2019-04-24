// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//			PopupWindowCompat

static interface PopupWindowCompat$PopupWindowImpl
{

	public abstract boolean getOverlapAnchor(PopupWindow popupwindow);

	public abstract int getWindowLayoutType(PopupWindow popupwindow);

	public abstract void setOverlapAnchor(PopupWindow popupwindow, boolean flag);

	public abstract void setWindowLayoutType(PopupWindow popupwindow, int i);

	public abstract void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k);
}
