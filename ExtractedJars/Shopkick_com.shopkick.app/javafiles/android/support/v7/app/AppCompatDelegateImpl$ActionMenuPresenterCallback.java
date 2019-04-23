// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

private final class AppCompatDelegateImpl$ActionMenuPresenterCallback
	implements android.support.v7.view.menu.MenuPresenter.Callback
{

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		checkCloseActionMenu(menubuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method void AppCompatDelegateImpl.checkCloseActionMenu(MenuBuilder)>
	//    4    8:return          
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		android.view.Window.Callback callback = getWindowCallback();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//    2    4:invokevirtual   #31  <Method android.view.Window$Callback AppCompatDelegateImpl.getWindowCallback()>
	//    3    7:astore_2        
		if(callback != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          22
			callback.onMenuOpened(108, ((android.view.Menu) (menubuilder)));
	//    6   12:aload_2         
	//    7   13:bipush          108
	//    8   15:aload_1         
	//    9   16:invokeinterface #37  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   10   21:pop             
		return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$ActionMenuPresenterCallback()
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
