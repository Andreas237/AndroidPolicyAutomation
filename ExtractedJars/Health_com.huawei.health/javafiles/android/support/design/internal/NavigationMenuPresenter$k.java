// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v7.view.menu.MenuItemImpl;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter

static class NavigationMenuPresenter$k
	implements NavigationMenuPresenter$b
{

	public MenuItemImpl c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MenuItemImpl e>
	//    2    4:areturn         
	}

	boolean d;
	private final MenuItemImpl e;

	NavigationMenuPresenter$k(MenuItemImpl menuitemimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		e = menuitemimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field MenuItemImpl e>
	//    5    9:return          
	}
}
