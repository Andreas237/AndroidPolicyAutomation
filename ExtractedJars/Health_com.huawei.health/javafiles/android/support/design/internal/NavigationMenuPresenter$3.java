// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter, NavigationMenuItemView

class NavigationMenuPresenter$3
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) ((NavigationMenuItemView)view));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class NavigationMenuItemView>
	//    2    4:astore_1        
		a.setUpdateSuspended(true);
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field NavigationMenuPresenter a>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
		view = ((View) (((NavigationMenuItemView) (view)).getItemData()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #30  <Method MenuItemImpl NavigationMenuItemView.getItemData()>
	//    9   17:astore_1        
		boolean flag = a.mMenu.performItemAction(((android.view.MenuItem) (view)), ((android.support.v7.view.menu.MenuPresenter) (a)), 0);
	//   10   18:aload_0         
	//   11   19:getfield        #14  <Field NavigationMenuPresenter a>
	//   12   22:getfield        #34  <Field MenuBuilder NavigationMenuPresenter.mMenu>
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #14  <Field NavigationMenuPresenter a>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #40  <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, android.support.v7.view.menu.MenuPresenter, int)>
	//   18   34:istore_2        
		if(view != null && ((MenuItemImpl) (view)).isCheckable() && flag)
	//*  19   35:aload_1         
	//*  20   36:ifnull          61
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #46  <Method boolean MenuItemImpl.isCheckable()>
	//*  23   43:ifeq            61
	//*  24   46:iload_2         
	//*  25   47:ifeq            61
			a.mAdapter.d(((MenuItemImpl) (view)));
	//   26   50:aload_0         
	//   27   51:getfield        #14  <Field NavigationMenuPresenter a>
	//   28   54:getfield        #50  <Field NavigationMenuPresenter$d NavigationMenuPresenter.mAdapter>
	//   29   57:aload_1         
	//   30   58:invokevirtual   #56  <Method void NavigationMenuPresenter$d.d(MenuItemImpl)>
		a.setUpdateSuspended(false);
	//   31   61:aload_0         
	//   32   62:getfield        #14  <Field NavigationMenuPresenter a>
	//   33   65:iconst_0        
	//   34   66:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
		a.updateMenuView(false);
	//   35   69:aload_0         
	//   36   70:getfield        #14  <Field NavigationMenuPresenter a>
	//   37   73:iconst_0        
	//   38   74:invokevirtual   #59  <Method void NavigationMenuPresenter.updateMenuView(boolean)>
	//   39   77:return          
	}

	final NavigationMenuPresenter a;

	NavigationMenuPresenter$3(NavigationMenuPresenter navigationmenupresenter)
	{
		a = navigationmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field NavigationMenuPresenter a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
