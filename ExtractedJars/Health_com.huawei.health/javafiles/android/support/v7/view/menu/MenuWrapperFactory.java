// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.*;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuWrapperICS, MenuItemWrapperJB, MenuItemWrapperICS, SubMenuWrapperICS

public final class MenuWrapperFactory
{

	private MenuWrapperFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static Menu wrapSupportMenu(Context context, SupportMenu supportmenu)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          18
			return ((Menu) (new MenuWrapperICS(context, supportmenu)));
	//    3    8:new             #23  <Class MenuWrapperICS>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #26  <Method void MenuWrapperICS(Context, SupportMenu)>
	//    8   17:areturn         
		else
			throw new UnsupportedOperationException();
	//    9   18:new             #28  <Class UnsupportedOperationException>
	//   10   21:dup             
	//   11   22:invokespecial   #29  <Method void UnsupportedOperationException()>
	//   12   25:athrow          
	}

	public static MenuItem wrapSupportMenuItem(Context context, SupportMenuItem supportmenuitem)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
			return ((MenuItem) (new MenuItemWrapperJB(context, supportmenuitem)));
	//    3    8:new             #33  <Class MenuItemWrapperJB>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #36  <Method void MenuItemWrapperJB(Context, SupportMenuItem)>
	//    8   17:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   9   18:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   21:bipush          14
	//*  11   23:icmplt          36
			return ((MenuItem) (new MenuItemWrapperICS(context, supportmenuitem)));
	//   12   26:new             #38  <Class MenuItemWrapperICS>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #39  <Method void MenuItemWrapperICS(Context, SupportMenuItem)>
	//   17   35:areturn         
		else
			throw new UnsupportedOperationException();
	//   18   36:new             #28  <Class UnsupportedOperationException>
	//   19   39:dup             
	//   20   40:invokespecial   #29  <Method void UnsupportedOperationException()>
	//   21   43:athrow          
	}

	public static SubMenu wrapSupportSubMenu(Context context, SupportSubMenu supportsubmenu)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          18
			return ((SubMenu) (new SubMenuWrapperICS(context, supportsubmenu)));
	//    3    8:new             #43  <Class SubMenuWrapperICS>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #46  <Method void SubMenuWrapperICS(Context, SupportSubMenu)>
	//    8   17:areturn         
		else
			throw new UnsupportedOperationException();
	//    9   18:new             #28  <Class UnsupportedOperationException>
	//   10   21:dup             
	//   11   22:invokespecial   #29  <Method void UnsupportedOperationException()>
	//   12   25:athrow          
	}
}
