// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.PopupMenu;

class PopupMenuCompatKitKat
{

	PopupMenuCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static android.view.View.OnTouchListener getDragToOpenListener(Object obj)
	{
		return ((PopupMenu)obj).getDragToOpenListener();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class PopupMenu>
	//    2    4:invokevirtual   #19  <Method android.view.View$OnTouchListener PopupMenu.getDragToOpenListener()>
	//    3    7:areturn         
	}
}
