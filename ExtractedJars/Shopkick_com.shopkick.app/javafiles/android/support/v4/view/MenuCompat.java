// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.support.v4.internal.view.SupportMenu;
import android.view.Menu;
import android.view.MenuItem;

public final class MenuCompat
{

	private MenuCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void setGroupDividerEnabled(Menu menu, boolean flag)
	{
		if(menu instanceof SupportMenu)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #16  <Class SupportMenu>
	//*   2    4:ifeq            18
		{
			((SupportMenu)menu).setGroupDividerEnabled(flag);
	//    3    7:aload_0         
	//    4    8:checkcast       #16  <Class SupportMenu>
	//    5   11:iload_1         
	//    6   12:invokeinterface #19  <Method void SupportMenu.setGroupDividerEnabled(boolean)>
			return;
	//    7   17:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   8   18:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   21:bipush          28
	//*  10   23:icmplt          33
			menu.setGroupDividerEnabled(flag);
	//   11   26:aload_0         
	//   12   27:iload_1         
	//   13   28:invokeinterface #28  <Method void Menu.setGroupDividerEnabled(boolean)>
	//   14   33:return          
	}

	public static void setShowAsAction(MenuItem menuitem, int i)
	{
		menuitem.setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #37  <Method void MenuItem.setShowAsAction(int)>
	//    3    7:return          
	}
}
