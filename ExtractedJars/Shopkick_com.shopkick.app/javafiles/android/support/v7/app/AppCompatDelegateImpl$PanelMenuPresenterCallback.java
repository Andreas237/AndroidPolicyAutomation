// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

private final class AppCompatDelegateImpl$PanelMenuPresenterCallback
	implements android.support.v7.view.menu.MenuPresenter.Callback
{

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		MenuBuilder menubuilder1 = menubuilder.getRootMenu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method MenuBuilder MenuBuilder.getRootMenu()>
	//    2    4:astore          4
		boolean flag1;
		if(menubuilder1 != menubuilder)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       17
			flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:goto            19
			flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		AppCompatDelegateImpl appcompatdelegateimpl = AppCompatDelegateImpl.this;
	//   11   19:aload_0         
	//   12   20:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//   13   23:astore          5
		if(flag1)
	//*  14   25:iload_3         
	//*  15   26:ifeq            32
			menubuilder = menubuilder1;
	//   16   29:aload           4
	//   17   31:astore_1        
		menubuilder = ((MenuBuilder) (appcompatdelegateimpl.findMenuPanel(((android.view.Menu) (menubuilder)))));
	//   18   32:aload           5
	//   19   34:aload_1         
	//   20   35:invokevirtual   #31  <Method AppCompatDelegateImpl$PanelFeatureState AppCompatDelegateImpl.findMenuPanel(android.view.Menu)>
	//   21   38:astore_1        
		if(menubuilder != null)
	//*  22   39:aload_1         
	//*  23   40:ifnull          80
		{
			if(flag1)
	//*  24   43:iload_3         
	//*  25   44:ifeq            71
			{
				callOnPanelClosed(((AppCompatDelegateImpl.PanelFeatureState) (menubuilder)).featureId, ((AppCompatDelegateImpl.PanelFeatureState) (menubuilder)), ((android.view.Menu) (menubuilder1)));
	//   26   47:aload_0         
	//   27   48:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//   28   51:aload_1         
	//   29   52:getfield        #37  <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//   30   55:aload_1         
	//   31   56:aload           4
	//   32   58:invokevirtual   #41  <Method void AppCompatDelegateImpl.callOnPanelClosed(int, AppCompatDelegateImpl$PanelFeatureState, android.view.Menu)>
				closePanel(((AppCompatDelegateImpl.PanelFeatureState) (menubuilder)), true);
	//   33   61:aload_0         
	//   34   62:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//   35   65:aload_1         
	//   36   66:iconst_1        
	//   37   67:invokevirtual   #45  <Method void AppCompatDelegateImpl.closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
				return;
	//   38   70:return          
			}
			closePanel(((AppCompatDelegateImpl.PanelFeatureState) (menubuilder)), flag);
	//   39   71:aload_0         
	//   40   72:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//   41   75:aload_1         
	//   42   76:iload_2         
	//   43   77:invokevirtual   #45  <Method void AppCompatDelegateImpl.closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
		}
	//   44   80:return          
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		if(menubuilder == null && mHasActionBar)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       46
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//*   4    8:getfield        #51  <Field boolean AppCompatDelegateImpl.mHasActionBar>
	//*   5   11:ifeq            46
		{
			android.view.Window.Callback callback = getWindowCallback();
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//    8   18:invokevirtual   #55  <Method android.view.Window$Callback AppCompatDelegateImpl.getWindowCallback()>
	//    9   21:astore_2        
			if(callback != null && !mIsDestroyed)
	//*  10   22:aload_2         
	//*  11   23:ifnull          46
	//*  12   26:aload_0         
	//*  13   27:getfield        #15  <Field AppCompatDelegateImpl this$0>
	//*  14   30:getfield        #58  <Field boolean AppCompatDelegateImpl.mIsDestroyed>
	//*  15   33:ifne            46
				callback.onMenuOpened(108, ((android.view.Menu) (menubuilder)));
	//   16   36:aload_2         
	//   17   37:bipush          108
	//   18   39:aload_1         
	//   19   40:invokeinterface #64  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   20   45:pop             
		}
		return true;
	//   21   46:iconst_1        
	//   22   47:ireturn         
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$PanelMenuPresenterCallback()
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
