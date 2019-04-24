// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.widget.DecorToolbar;
import android.view.Menu;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			ToolbarActionBar

class ToolbarActionBar$ToolbarCallbackWrapper extends WindowCallbackWrapper
{

	public View onCreatePanelView(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    1: default 20
	//	               0: 23
	//*   2   20:goto            64
		case 0: // '\0'
			Menu menu = mDecorToolbar.getMenu();
	//    3   23:aload_0         
	//    4   24:getfield        #13  <Field ToolbarActionBar this$0>
	//    5   27:getfield        #23  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
	//    6   30:invokeinterface #29  <Method Menu DecorToolbar.getMenu()>
	//    7   35:astore_2        
			if(onPreparePanel(i, ((View) (null)), menu) && onMenuOpened(i, menu))
	//*   8   36:aload_0         
	//*   9   37:iload_1         
	//*  10   38:aconst_null     
	//*  11   39:aload_2         
	//*  12   40:invokevirtual   #33  <Method boolean onPreparePanel(int, View, Menu)>
	//*  13   43:ifeq            64
	//*  14   46:aload_0         
	//*  15   47:iload_1         
	//*  16   48:aload_2         
	//*  17   49:invokevirtual   #37  <Method boolean onMenuOpened(int, Menu)>
	//*  18   52:ifeq            64
				return getListMenuView(menu);
	//   19   55:aload_0         
	//   20   56:getfield        #13  <Field ToolbarActionBar this$0>
	//   21   59:aload_2         
	//   22   60:invokevirtual   #41  <Method View ToolbarActionBar.getListMenuView(Menu)>
	//   23   63:areturn         
			break;
		}
		return super.onCreatePanelView(i);
	//   24   64:aload_0         
	//   25   65:iload_1         
	//   26   66:invokespecial   #43  <Method View WindowCallbackWrapper.onCreatePanelView(int)>
	//   27   69:areturn         
	}

	public boolean onPreparePanel(int i, View view, Menu menu)
	{
		boolean flag = super.onPreparePanel(i, view, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #44  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
	//    5    7:istore          4
		if(flag && !mToolbarMenuPrepared)
	//*   6    9:iload           4
	//*   7   11:ifeq            44
	//*   8   14:aload_0         
	//*   9   15:getfield        #13  <Field ToolbarActionBar this$0>
	//*  10   18:getfield        #48  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
	//*  11   21:ifne            44
		{
			mDecorToolbar.setMenuPrepared();
	//   12   24:aload_0         
	//   13   25:getfield        #13  <Field ToolbarActionBar this$0>
	//   14   28:getfield        #23  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
	//   15   31:invokeinterface #52  <Method void DecorToolbar.setMenuPrepared()>
			mToolbarMenuPrepared = true;
	//   16   36:aload_0         
	//   17   37:getfield        #13  <Field ToolbarActionBar this$0>
	//   18   40:iconst_1        
	//   19   41:putfield        #48  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
		}
		return flag;
	//   20   44:iload           4
	//   21   46:ireturn         
	}

	final ToolbarActionBar this$0;

	public ToolbarActionBar$ToolbarCallbackWrapper(android.view.Window.Callback callback)
	{
		this$0 = ToolbarActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ToolbarActionBar this$0>
		super(callback);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void WindowCallbackWrapper(android.view.Window$Callback)>
	//    6   10:return          
	}
}
