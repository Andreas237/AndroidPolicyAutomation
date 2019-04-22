// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$PopupPresenterCallback
	implements android.support.v7.view.menu.MenuPresenter.Callback
{

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(menubuilder instanceof SubMenuBuilder)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #23  <Class SubMenuBuilder>
	//*   2    4:ifeq            15
			menubuilder.getRootMenu().close(false);
	//    3    7:aload_1         
	//    4    8:invokevirtual   #29  <Method MenuBuilder MenuBuilder.getRootMenu()>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #33  <Method void MenuBuilder.close(boolean)>
		android.support.v7.view.menu.MenuPresenter.Callback callback = getCallback();
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field ActionMenuPresenter this$0>
	//    9   19:invokevirtual   #37  <Method android.support.v7.view.menu.MenuPresenter$Callback ActionMenuPresenter.getCallback()>
	//   10   22:astore_3        
		if(callback != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          35
			callback.onCloseMenu(menubuilder, flag);
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:iload_2         
	//   16   30:invokeinterface #39  <Method void android.support.v7.view.menu.MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//   17   35:return          
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(menubuilder == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
	//    6    8:aload_0         
	//    7    9:getfield        #15  <Field ActionMenuPresenter this$0>
	//    8   12:aload_1         
	//    9   13:checkcast       #23  <Class SubMenuBuilder>
	//   10   16:invokevirtual   #45  <Method MenuItem SubMenuBuilder.getItem()>
	//   11   19:invokeinterface #51  <Method int MenuItem.getItemId()>
	//   12   24:putfield        #55  <Field int ActionMenuPresenter.mOpenSubMenuId>
		android.support.v7.view.menu.MenuPresenter.Callback callback = getCallback();
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field ActionMenuPresenter this$0>
	//   15   31:invokevirtual   #37  <Method android.support.v7.view.menu.MenuPresenter$Callback ActionMenuPresenter.getCallback()>
	//   16   34:astore_3        
		if(callback != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          47
			flag = callback.onOpenSubMenu(menubuilder);
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokeinterface #57  <Method boolean android.support.v7.view.menu.MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   22   46:istore_2        
		return flag;
	//   23   47:iload_2         
	//   24   48:ireturn         
	}

	final ActionMenuPresenter this$0;

	ActionMenuPresenter$PopupPresenterCallback()
	{
		this$0 = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ActionMenuPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
