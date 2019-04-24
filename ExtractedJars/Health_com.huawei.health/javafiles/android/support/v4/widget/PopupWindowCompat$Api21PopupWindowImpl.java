// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//			PopupWindowCompat, PopupWindowCompatApi21

static class PopupWindowCompat$Api21PopupWindowImpl extends 
{

	public boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		return PopupWindowCompatApi21.getOverlapAnchor(popupwindow);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method boolean PopupWindowCompatApi21.getOverlapAnchor(PopupWindow)>
	//    2    4:ireturn         
	}

	public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		PopupWindowCompatApi21.setOverlapAnchor(popupwindow, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #22  <Method void PopupWindowCompatApi21.setOverlapAnchor(PopupWindow, boolean)>
	//    3    5:return          
	}

	PopupWindowCompat$Api21PopupWindowImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PopupWindowCompat$KitKatPopupWindowImpl()>
	//    2    4:return          
	}
}
