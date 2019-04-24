// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v7.view.menu.h;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//			BottomNavigationMenuView, BottomNavigationItemView

class BottomNavigationMenuView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) (((BottomNavigationItemView)view).getItemData()));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class BottomNavigationItemView>
	//    2    4:invokevirtual   #28  <Method android.support.v7.view.menu.j BottomNavigationItemView.getItemData()>
	//    3    7:astore_1        
		if(!BottomNavigationMenuView.b(a).a(((MenuItem) (view)), ((android.support.v7.view.menu.o) (BottomNavigationMenuView.a(a))), 0))
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field BottomNavigationMenuView a>
	//*   6   12:invokestatic    #32  <Method h BottomNavigationMenuView.b(BottomNavigationMenuView)>
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #16  <Field BottomNavigationMenuView a>
	//*  10   20:invokestatic    #35  <Method BottomNavigationPresenter BottomNavigationMenuView.a(BottomNavigationMenuView)>
	//*  11   23:iconst_0        
	//*  12   24:invokevirtual   #40  <Method boolean h.a(MenuItem, android.support.v7.view.menu.o, int)>
	//*  13   27:ifne            38
			((MenuItem) (view)).setChecked(true);
	//   14   30:aload_1         
	//   15   31:iconst_1        
	//   16   32:invokeinterface #46  <Method MenuItem MenuItem.setChecked(boolean)>
	//   17   37:pop             
	//   18   38:return          
	}

	final BottomNavigationMenuView a;

	BottomNavigationMenuView$1(BottomNavigationMenuView bottomnavigationmenuview)
	{
		a = bottomnavigationmenuview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BottomNavigationMenuView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
