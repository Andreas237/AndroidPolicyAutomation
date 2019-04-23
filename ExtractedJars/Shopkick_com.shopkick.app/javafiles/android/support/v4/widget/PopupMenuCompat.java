// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.PopupMenu;

public final class PopupMenuCompat
{

	private PopupMenuCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static android.view.View.OnTouchListener getDragToOpenListener(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return ((PopupMenu)obj).getDragToOpenListener();
	//    3    8:aload_0         
	//    4    9:checkcast       #21  <Class PopupMenu>
	//    5   12:invokevirtual   #24  <Method android.view.View$OnTouchListener PopupMenu.getDragToOpenListener()>
	//    6   15:areturn         
		else
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
	}
}
