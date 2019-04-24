// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.h;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView

private class ActionMenuView$c
	implements android.support.v7.view.menu.h.a
{

	public void a(h h)
	{
		if(a.a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ActionMenuView a>
	//*   2    4:getfield        #23  <Field android.support.v7.view.menu.h$a ActionMenuView.a>
	//*   3    7:ifnull          23
			a.a.a(h);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ActionMenuView a>
	//    6   14:getfield        #23  <Field android.support.v7.view.menu.h$a ActionMenuView.a>
	//    7   17:aload_1         
	//    8   18:invokeinterface #25  <Method void android.support.v7.view.menu.h$a.a(h)>
	//    9   23:return          
	}

	public boolean a(h h, MenuItem menuitem)
	{
		return a.b != null && a.b.a(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ActionMenuView a>
	//    2    4:getfield        #30  <Field ActionMenuView$d ActionMenuView.b>
	//    3    7:ifnull          28
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ActionMenuView a>
	//    6   14:getfield        #30  <Field ActionMenuView$d ActionMenuView.b>
	//    7   17:aload_2         
	//    8   18:invokeinterface #35  <Method boolean ActionMenuView$d.a(MenuItem)>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	final ActionMenuView a;

	ActionMenuView$c(ActionMenuView actionmenuview)
	{
		a = actionmenuview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ActionMenuView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
