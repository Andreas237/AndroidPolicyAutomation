// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.c.a.*;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuWrapperICS, MenuItemWrapperJB, MenuItemWrapperICS, SubMenuWrapperICS

public final class MenuWrapperFactory
{

	private MenuWrapperFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Menu wrapSupportMenu(Context context, a a)
	{
		return ((Menu) (new MenuWrapperICS(context, a)));
	//    0    0:new             #13  <Class MenuWrapperICS>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #16  <Method void MenuWrapperICS(Context, a)>
	//    5    9:areturn         
	}

	public static MenuItem wrapSupportMenuItem(Context context, b b)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
			return ((MenuItem) (new MenuItemWrapperJB(context, b)));
	//    3    8:new             #26  <Class MenuItemWrapperJB>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #29  <Method void MenuItemWrapperJB(Context, b)>
	//    8   17:areturn         
		else
			return ((MenuItem) (new MenuItemWrapperICS(context, b)));
	//    9   18:new             #31  <Class MenuItemWrapperICS>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #32  <Method void MenuItemWrapperICS(Context, b)>
	//   14   27:areturn         
	}

	public static SubMenu wrapSupportSubMenu(Context context, c c)
	{
		return ((SubMenu) (new SubMenuWrapperICS(context, c)));
	//    0    0:new             #36  <Class SubMenuWrapperICS>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #39  <Method void SubMenuWrapperICS(Context, c)>
	//    5    9:areturn         
	}
}
