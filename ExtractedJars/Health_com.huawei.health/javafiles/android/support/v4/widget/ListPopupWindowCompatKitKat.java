// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListPopupWindow;

class ListPopupWindowCompatKitKat
{

	ListPopupWindowCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
	{
		return ((ListPopupWindow)obj).createDragToOpenListener(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class ListPopupWindow>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #19  <Method android.view.View$OnTouchListener ListPopupWindow.createDragToOpenListener(View)>
	//    4    8:areturn         
	}
}
