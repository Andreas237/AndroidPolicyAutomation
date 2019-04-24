// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListPopupWindow;

public final class ListPopupWindowCompat
{

	private ListPopupWindowCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static android.view.View.OnTouchListener createDragToOpenListener(ListPopupWindow listpopupwindow, View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
			return listpopupwindow.createDragToOpenListener(view);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #24  <Method android.view.View$OnTouchListener ListPopupWindow.createDragToOpenListener(View)>
	//    6   13:areturn         
		else
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
	}

	public static android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
	{
		return createDragToOpenListener((ListPopupWindow)obj, view);
	//    0    0:aload_0         
	//    1    1:checkcast       #21  <Class ListPopupWindow>
	//    2    4:aload_1         
	//    3    5:invokestatic    #30  <Method android.view.View$OnTouchListener createDragToOpenListener(ListPopupWindow, View)>
	//    4    8:areturn         
	}
}
