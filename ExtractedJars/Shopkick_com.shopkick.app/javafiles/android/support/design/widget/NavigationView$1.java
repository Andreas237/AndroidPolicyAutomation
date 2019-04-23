// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;

// Referenced classes of package android.support.design.widget:
//			NavigationView

class NavigationView$1
	implements android.support.v7.view.menu.ack
{

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		return listener != null && listener.onNavigationItemSelected(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field NavigationView this$0>
	//    2    4:getfield        #26  <Field NavigationView$OnNavigationItemSelectedListener NavigationView.listener>
	//    3    7:ifnull          28
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field NavigationView this$0>
	//    6   14:getfield        #26  <Field NavigationView$OnNavigationItemSelectedListener NavigationView.listener>
	//    7   17:aload_2         
	//    8   18:invokeinterface #32  <Method boolean NavigationView$OnNavigationItemSelectedListener.onNavigationItemSelected(MenuItem)>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public void onMenuModeChange(MenuBuilder menubuilder)
	{
	//    0    0:return          
	}

	final NavigationView this$0;

	NavigationView$1()
	{
		this$0 = NavigationView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field NavigationView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
