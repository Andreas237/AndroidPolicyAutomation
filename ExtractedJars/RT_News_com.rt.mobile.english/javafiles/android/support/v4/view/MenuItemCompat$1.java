// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//			MenuItemCompat

static final class MenuItemCompat$1
	implements android.view.ExpandListener
{

	public boolean onMenuItemActionCollapse(MenuItem menuitem)
	{
		return val$listener.onMenuItemActionCollapse(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MenuItemCompat$OnActionExpandListener val$listener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method boolean MenuItemCompat$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
	//    4   10:ireturn         
	}

	public boolean onMenuItemActionExpand(MenuItem menuitem)
	{
		return val$listener.onMenuItemActionExpand(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MenuItemCompat$OnActionExpandListener val$listener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #30  <Method boolean MenuItemCompat$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
	//    4   10:ireturn         
	}

	final ActionExpandListener val$listener;

	MenuItemCompat$1(ActionExpandListener actionexpandlistener)
	{
		val$listener = actionexpandlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MenuItemCompat$OnActionExpandListener val$listener>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
