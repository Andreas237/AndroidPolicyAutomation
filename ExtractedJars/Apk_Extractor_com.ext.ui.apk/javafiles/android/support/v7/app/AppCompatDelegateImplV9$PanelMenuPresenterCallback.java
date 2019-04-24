// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

private final class AppCompatDelegateImplV9$PanelMenuPresenterCallback
	implements android.support.v7.view.menu.MenuPresenter.Callback
{

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
label0:
		{
			MenuBuilder menubuilder1 = menubuilder.getRootMenu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method MenuBuilder MenuBuilder.getRootMenu()>
	//    2    4:astore          4
			boolean flag1;
			AppCompatDelegateImplV9 appcompatdelegateimplv9;
			if(menubuilder1 != menubuilder)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       66
				flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
			else
	//*   8   14:aload_0         
	//*   9   15:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//*  10   18:astore          5
	//*  11   20:iload_3         
	//*  12   21:ifeq            27
	//*  13   24:aload           4
	//*  14   26:astore_1        
	//*  15   27:aload           5
	//*  16   29:aload_1         
	//*  17   30:invokevirtual   #31  <Method AppCompatDelegateImplV9$PanelFeatureState AppCompatDelegateImplV9.findMenuPanel(android.view.Menu)>
	//*  18   33:astore_1        
	//*  19   34:aload_1         
	//*  20   35:ifnull          65
	//*  21   38:iload_3         
	//*  22   39:ifeq            71
	//*  23   42:aload_0         
	//*  24   43:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//*  25   46:aload_1         
	//*  26   47:getfield        #37  <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  27   50:aload_1         
	//*  28   51:aload           4
	//*  29   53:invokevirtual   #41  <Method void AppCompatDelegateImplV9.callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, android.view.Menu)>
	//*  30   56:aload_0         
	//*  31   57:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//*  32   60:aload_1         
	//*  33   61:iconst_1        
	//*  34   62:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
	//*  35   65:return          
				flag1 = false;
	//   36   66:iconst_0        
	//   37   67:istore_3        
			appcompatdelegateimplv9 = AppCompatDelegateImplV9.this;
			if(flag1)
				menubuilder = menubuilder1;
			menubuilder = ((MenuBuilder) (appcompatdelegateimplv9.findMenuPanel(((android.view.Menu) (menubuilder)))));
			if(menubuilder != null)
			{
				if(!flag1)
					break label0;
				callOnPanelClosed(((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)).featureId, ((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)), ((android.view.Menu) (menubuilder1)));
				closePanel(((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)), true);
			}
			return;
		}
	//*  38   68:goto            14
		closePanel(((AppCompatDelegateImplV9.PanelFeatureState) (menubuilder)), flag);
	//   39   71:aload_0         
	//   40   72:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//   41   75:aload_1         
	//   42   76:iload_2         
	//   43   77:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
	//   44   80:return          
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
