// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.app:
//			ToolbarActionBar

final class ToolbarActionBar$PanelMenuPresenterCallback
	implements android.support.v7.view.menu.MenuPresenter.Callback
{

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mWindowCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ToolbarActionBar this$0>
	//*   2    4:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//*   3    7:ifnull          24
			mWindowCallback.onPanelClosed(0, ((android.view.Menu) (menubuilder)));
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ToolbarActionBar this$0>
	//    6   14:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//    7   17:iconst_0        
	//    8   18:aload_1         
	//    9   19:invokeinterface #31  <Method void android.view.Window$Callback.onPanelClosed(int, android.view.Menu)>
	//   10   24:return          
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		if(menubuilder == null && mWindowCallback != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       29
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field ToolbarActionBar this$0>
	//*   4    8:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//*   5   11:ifnull          29
			mWindowCallback.onMenuOpened(0, ((android.view.Menu) (menubuilder)));
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field ToolbarActionBar this$0>
	//    8   18:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//    9   21:iconst_0        
	//   10   22:aload_1         
	//   11   23:invokeinterface #37  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   12   28:pop             
		return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
	}

	final ToolbarActionBar this$0;

	ToolbarActionBar$PanelMenuPresenterCallback()
	{
		this$0 = ToolbarActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ToolbarActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
