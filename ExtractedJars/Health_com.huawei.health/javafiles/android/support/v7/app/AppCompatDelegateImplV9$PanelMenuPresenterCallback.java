// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

final class AppCompatDelegateImplV9$PanelMenuPresenterCallback
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
		AppCompatDelegateImplV9 appcompatdelegateimplv9 = AppCompatDelegateImplV9.this;
	//   11   19:aload_0         
	//   12   20:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//   13   23:astore          5
		if(flag1)
	//*  14   25:iload_3         
	//*  15   26:ifeq            35
			menubuilder = menubuilder1;
	//   16   29:aload           4
	//   17   31:astore_1        
	//*  18   32:goto            35
		menubuilder = ((MenuBuilder) (appcompatdelegateimplv9.findMenuPanel(((android.view.Menu) (menubuilder)))));
	//   19   35:aload           5
	//   20   37:aload_1         
	//   21   38:invokevirtual   #31  <Method AppCompatDelegateImplV9$PanelFeatureState AppCompatDelegateImplV9.findMenuPanel(android.view.Menu)>
	//   22   41:astore_1        
		if(menubuilder != null)
	//*  23   42:aload_1         
	//*  24   43:ifnull          83
		{
			if(flag1)
	//*  25   46:iload_3         
	//*  26   47:ifeq            74
			{
				callOnPanelClosed(((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)).featureId, ((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)), ((android.view.Menu) (menubuilder1)));
	//   27   50:aload_0         
	//   28   51:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//   29   54:aload_1         
	//   30   55:getfield        #37  <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   31   58:aload_1         
	//   32   59:aload           4
	//   33   61:invokevirtual   #41  <Method void AppCompatDelegateImplV9.callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, android.view.Menu)>
				closePanel(((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)), true);
	//   34   64:aload_0         
	//   35   65:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//   36   68:aload_1         
	//   37   69:iconst_1        
	//   38   70:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
				return;
	//   39   73:return          
			}
			closePanel(((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)), flag);
	//   40   74:aload_0         
	//   41   75:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//   42   78:aload_1         
	//   43   79:iload_2         
	//   44   80:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		}
	//   45   83:return          
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		if(menubuilder == null && mHasActionBar)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       46
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//*   4    8:getfield        #51  <Field boolean AppCompatDelegateImplV9.mHasActionBar>
	//*   5   11:ifeq            46
		{
			android.view.Window.Callback callback = getWindowCallback();
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//    8   18:invokevirtual   #55  <Method android.view.Window$Callback AppCompatDelegateImplV9.getWindowCallback()>
	//    9   21:astore_2        
			if(callback != null && !isDestroyed())
	//*  10   22:aload_2         
	//*  11   23:ifnull          46
	//*  12   26:aload_0         
	//*  13   27:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//*  14   30:invokevirtual   #59  <Method boolean AppCompatDelegateImplV9.isDestroyed()>
	//*  15   33:ifne            46
				callback.onMenuOpened(108, ((android.view.Menu) (menubuilder)));
	//   16   36:aload_2         
	//   17   37:bipush          108
	//   18   39:aload_1         
	//   19   40:invokeinterface #65  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   20   45:pop             
		}
		return true;
	//   21   46:iconst_1        
	//   22   47:ireturn         
	}

	final AppCompatDelegateImplV9 this$0;

	AppCompatDelegateImplV9$PanelMenuPresenterCallback()
	{
		this$0 = AppCompatDelegateImplV9.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppCompatDelegateImplV9 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
