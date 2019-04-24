// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v7.view.menu.MenuItemImpl;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter

private static class NavigationMenuPresenter$NavigationMenuTextItem
	implements NavigationMenuPresenter.NavigationMenuItem
{

	public MenuItemImpl getMenuItem()
	{
		return mMenuItem;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MenuItemImpl mMenuItem>
	//    2    4:areturn         
	}

	private final MenuItemImpl mMenuItem;
	boolean needsEmptyIcon;

	NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl menuitemimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mMenuItem = menuitemimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field MenuItemImpl mMenuItem>
	//    5    9:return          
	}
}
