// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

class PopupWindowCompatKitKat
{

	PopupWindowCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
	{
		popupwindow.showAsDropDown(view, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokevirtual   #19  <Method void PopupWindow.showAsDropDown(View, int, int, int)>
	//    6    9:return          
	}
}
