// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//			PopupWindowCompat, PopupWindowCompatApi23

static class PopupWindowCompat$Api23PopupWindowImpl extends PopupWindowCompat$Api21PopupWindowImpl
{

	public boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		return PopupWindowCompatApi23.getOverlapAnchor(popupwindow);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method boolean PopupWindowCompatApi23.getOverlapAnchor(PopupWindow)>
	//    2    4:ireturn         
	}

	public int getWindowLayoutType(PopupWindow popupwindow)
	{
		return PopupWindowCompatApi23.getWindowLayoutType(popupwindow);
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method int PopupWindowCompatApi23.getWindowLayoutType(PopupWindow)>
	//    2    4:ireturn         
	}

	public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		PopupWindowCompatApi23.setOverlapAnchor(popupwindow, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #26  <Method void PopupWindowCompatApi23.setOverlapAnchor(PopupWindow, boolean)>
	//    3    5:return          
	}

	public void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		PopupWindowCompatApi23.setWindowLayoutType(popupwindow, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #30  <Method void PopupWindowCompatApi23.setWindowLayoutType(PopupWindow, int)>
	//    3    5:return          
	}

	PopupWindowCompat$Api23PopupWindowImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PopupWindowCompat$Api21PopupWindowImpl()>
	//    2    4:return          
	}
}
