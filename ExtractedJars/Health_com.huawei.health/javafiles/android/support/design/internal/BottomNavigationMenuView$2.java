// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//			BottomNavigationMenuView, BottomNavigationItemView

class BottomNavigationMenuView$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) (((BottomNavigationItemView)view).getItemData()));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class BottomNavigationItemView>
	//    2    4:invokevirtual   #28  <Method android.support.v7.view.menu.MenuItemImpl BottomNavigationItemView.getItemData()>
	//    3    7:astore_1        
		if(!BottomNavigationMenuView.access$100(b).performItemAction(((MenuItem) (view)), ((android.support.v7.view.menu.MenuPresenter) (BottomNavigationMenuView.access$000(b))), 0))
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field BottomNavigationMenuView b>
	//*   6   12:invokestatic    #32  <Method MenuBuilder BottomNavigationMenuView.access$100(BottomNavigationMenuView)>
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #16  <Field BottomNavigationMenuView b>
	//*  10   20:invokestatic    #36  <Method BottomNavigationPresenter BottomNavigationMenuView.access$000(BottomNavigationMenuView)>
	//*  11   23:iconst_0        
	//*  12   24:invokevirtual   #42  <Method boolean MenuBuilder.performItemAction(MenuItem, android.support.v7.view.menu.MenuPresenter, int)>
	//*  13   27:ifne            38
			((MenuItem) (view)).setChecked(true);
	//   14   30:aload_1         
	//   15   31:iconst_1        
	//   16   32:invokeinterface #48  <Method MenuItem MenuItem.setChecked(boolean)>
	//   17   37:pop             
	//   18   38:return          
	}

	final BottomNavigationMenuView b;

	BottomNavigationMenuView$2(BottomNavigationMenuView bottomnavigationmenuview)
	{
		b = bottomnavigationmenuview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BottomNavigationMenuView b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
