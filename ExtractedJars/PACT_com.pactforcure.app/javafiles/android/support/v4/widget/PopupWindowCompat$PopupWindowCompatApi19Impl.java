// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//			PopupWindowCompat

static class PopupWindowCompat$PopupWindowCompatApi19Impl extends PopupWindowCompat.PopupWindowCompatBaseImpl
{

	public void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
	{
		popupwindow.showAsDropDown(view, i, j, k);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #22  <Method void PopupWindow.showAsDropDown(View, int, int, int)>
	//    6   10:return          
	}

	PopupWindowCompat$PopupWindowCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void PopupWindowCompat$PopupWindowCompatBaseImpl()>
	//    2    4:return          
	}
}
