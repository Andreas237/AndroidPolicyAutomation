// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.DecorToolbar;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//			ToolbarActionBar

private final class ToolbarActionBar$MenuBuilderCallback
	implements android.support.v7.view.menu.MenuBuilder.Callback
{

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onMenuModeChange(MenuBuilder menubuilder)
	{
		if(mWindowCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ToolbarActionBar this$0>
	//*   2    4:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//*   3    7:ifnull          75
		{
			if(mDecorToolbar.isOverflowMenuShowing())
	//*   4   10:aload_0         
	//*   5   11:getfield        #15  <Field ToolbarActionBar this$0>
	//*   6   14:getfield        #31  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
	//*   7   17:invokeinterface #37  <Method boolean DecorToolbar.isOverflowMenuShowing()>
	//*   8   22:ifeq            41
			{
				mWindowCallback.onPanelClosed(108, ((android.view.Menu) (menubuilder)));
	//    9   25:aload_0         
	//   10   26:getfield        #15  <Field ToolbarActionBar this$0>
	//   11   29:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//   12   32:bipush          108
	//   13   34:aload_1         
	//   14   35:invokeinterface #43  <Method void android.view.Window$Callback.onPanelClosed(int, android.view.Menu)>
				return;
	//   15   40:return          
			}
			if(mWindowCallback.onPreparePanel(0, ((android.view.View) (null)), ((android.view.Menu) (menubuilder))))
	//*  16   41:aload_0         
	//*  17   42:getfield        #15  <Field ToolbarActionBar this$0>
	//*  18   45:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//*  19   48:iconst_0        
	//*  20   49:aconst_null     
	//*  21   50:aload_1         
	//*  22   51:invokeinterface #47  <Method boolean android.view.Window$Callback.onPreparePanel(int, android.view.View, android.view.Menu)>
	//*  23   56:ifeq            75
				mWindowCallback.onMenuOpened(108, ((android.view.Menu) (menubuilder)));
	//   24   59:aload_0         
	//   25   60:getfield        #15  <Field ToolbarActionBar this$0>
	//   26   63:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//   27   66:bipush          108
	//   28   68:aload_1         
	//   29   69:invokeinterface #51  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   30   74:pop             
		}
	//   31   75:return          
	}

	final ToolbarActionBar this$0;

	ToolbarActionBar$MenuBuilderCallback()
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
