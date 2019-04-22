// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.view.menu:
//			BaseWrapper, MenuItemWrapperICS

private class MenuItemWrapperICS$OnActionExpandListenerWrapper extends BaseWrapper
	implements android.view.MenuItem.OnActionExpandListener
{

	public boolean onMenuItemActionCollapse(MenuItem menuitem)
	{
		return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionCollapse(getMenuItemWrapper(menuitem));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object mWrappedObject>
	//    2    4:checkcast       #7   <Class android.view.MenuItem$OnActionExpandListener>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field MenuItemWrapperICS this$0>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #30  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
	//    7   15:invokeinterface #32  <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
	//    8   20:ireturn         
	}

	public boolean onMenuItemActionExpand(MenuItem menuitem)
	{
		return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionExpand(getMenuItemWrapper(menuitem));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object mWrappedObject>
	//    2    4:checkcast       #7   <Class android.view.MenuItem$OnActionExpandListener>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field MenuItemWrapperICS this$0>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #30  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
	//    7   15:invokeinterface #35  <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
	//    8   20:ireturn         
	}

	final MenuItemWrapperICS this$0;

	MenuItemWrapperICS$OnActionExpandListenerWrapper(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		this$0 = MenuItemWrapperICS.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MenuItemWrapperICS this$0>
		super(((Object) (onactionexpandlistener)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void BaseWrapper(Object)>
	//    6   10:return          
	}
}
