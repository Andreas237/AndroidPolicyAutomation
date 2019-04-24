// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v7.view.menu.h;
import android.view.MenuItem;

// Referenced classes of package android.support.design.widget:
//			NavigationView

class NavigationView$1
	implements android.support.v7.view.menu.h.a
{

	public void a(h h)
	{
	//    0    0:return          
	}

	public boolean a(h h, MenuItem menuitem)
	{
		return a.c != null && a.c.a(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field NavigationView a>
	//    2    4:getfield        #26  <Field NavigationView$a NavigationView.c>
	//    3    7:ifnull          28
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field NavigationView a>
	//    6   14:getfield        #26  <Field NavigationView$a NavigationView.c>
	//    7   17:aload_2         
	//    8   18:invokeinterface #31  <Method boolean NavigationView$a.a(MenuItem)>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	final NavigationView a;

	NavigationView$1(NavigationView navigationview)
	{
		a = navigationview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field NavigationView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
