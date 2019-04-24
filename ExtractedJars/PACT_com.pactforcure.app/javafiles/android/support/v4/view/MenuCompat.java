// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.MenuItem;

public final class MenuCompat
{

	private MenuCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void setShowAsAction(MenuItem menuitem, int i)
	{
		menuitem.setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #17  <Method void MenuItem.setShowAsAction(int)>
	//    3    7:return          
	}
}
