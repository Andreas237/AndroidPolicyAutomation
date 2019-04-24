// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//			PopupWindowCompat

static class PopupWindowCompat$PopupWindowCompatApi23Impl extends PopupWindowCompat$PopupWindowCompatApi21Impl
{

	public boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		return popupwindow.getOverlapAnchor();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method boolean PopupWindow.getOverlapAnchor()>
	//    2    4:ireturn         
	}

	public int getWindowLayoutType(PopupWindow popupwindow)
	{
		return popupwindow.getWindowLayoutType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method int PopupWindow.getWindowLayoutType()>
	//    2    4:ireturn         
	}

	public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		popupwindow.setOverlapAnchor(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #32  <Method void PopupWindow.setOverlapAnchor(boolean)>
	//    3    5:return          
	}

	public void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		popupwindow.setWindowLayoutType(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #37  <Method void PopupWindow.setWindowLayoutType(int)>
	//    3    5:return          
	}

	PopupWindowCompat$PopupWindowCompatApi23Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void PopupWindowCompat$PopupWindowCompatApi21Impl()>
	//    2    4:return          
	}
}
