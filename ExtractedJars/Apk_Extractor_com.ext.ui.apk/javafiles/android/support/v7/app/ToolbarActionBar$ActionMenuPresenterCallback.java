// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.DecorToolbar;

// Referenced classes of package android.support.v7.app:
//			ToolbarActionBar

private final class ToolbarActionBar$ActionMenuPresenterCallback
	implements android.support.v7.view.menu.MenuPresenter.Callback
{

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mClosingActionMenu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean mClosingActionMenu>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mClosingActionMenu = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #25  <Field boolean mClosingActionMenu>
		mDecorToolbar.dismissPopupMenus();
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field ToolbarActionBar this$0>
	//    9   17:getfield        #29  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
	//   10   20:invokeinterface #34  <Method void DecorToolbar.dismissPopupMenus()>
		if(mWindowCallback != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #17  <Field ToolbarActionBar this$0>
	//*  13   29:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//*  14   32:ifnull          50
			mWindowCallback.onPanelClosed(108, ((android.view.Menu) (menubuilder)));
	//   15   35:aload_0         
	//   16   36:getfield        #17  <Field ToolbarActionBar this$0>
	//   17   39:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//   18   42:bipush          108
	//   19   44:aload_1         
	//   20   45:invokeinterface #44  <Method void android.view.Window$Callback.onPanelClosed(int, android.view.Menu)>
		mClosingActionMenu = false;
	//   21   50:aload_0         
	//   22   51:iconst_0        
	//   23   52:putfield        #25  <Field boolean mClosingActionMenu>
	//   24   55:return          
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		if(mWindowCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ToolbarActionBar this$0>
	//*   2    4:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//*   3    7:ifnull          28
		{
			mWindowCallback.onMenuOpened(108, ((android.view.Menu) (menubuilder)));
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field ToolbarActionBar this$0>
	//    6   14:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//    7   17:bipush          108
	//    8   19:aload_1         
	//    9   20:invokeinterface #50  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   10   25:pop             
			return true;
	//   11   26:iconst_1        
	//   12   27:ireturn         
		} else
		{
			return false;
	//   13   28:iconst_0        
	//   14   29:ireturn         
		}
	}

	private boolean mClosingActionMenu;
	final ToolbarActionBar this$0;

	ToolbarActionBar$ActionMenuPresenterCallback()
	{
		this$0 = ToolbarActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ToolbarActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
