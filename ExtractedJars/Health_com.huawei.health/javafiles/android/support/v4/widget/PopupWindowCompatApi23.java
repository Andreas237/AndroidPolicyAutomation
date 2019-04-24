// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.PopupWindow;

class PopupWindowCompatApi23
{

	PopupWindowCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static boolean getOverlapAnchor(PopupWindow popupwindow)
	{
		return popupwindow.getOverlapAnchor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method boolean PopupWindow.getOverlapAnchor()>
	//    2    4:ireturn         
	}

	static int getWindowLayoutType(PopupWindow popupwindow)
	{
		return popupwindow.getWindowLayoutType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method int PopupWindow.getWindowLayoutType()>
	//    2    4:ireturn         
	}

	static void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
	{
		popupwindow.setOverlapAnchor(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #29  <Method void PopupWindow.setOverlapAnchor(boolean)>
	//    3    5:return          
	}

	static void setWindowLayoutType(PopupWindow popupwindow, int i)
	{
		popupwindow.setWindowLayoutType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #34  <Method void PopupWindow.setWindowLayoutType(int)>
	//    3    5:return          
	}
}
