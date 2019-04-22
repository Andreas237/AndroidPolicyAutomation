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

private class ToolbarActionBar$ToolbarCallbackWrapper extends WindowCallbackWrapper
{

	public View onCreatePanelView(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            24
			return new View(mDecorToolbar.getContext());
	//    2    4:new             #21  <Class View>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field ToolbarActionBar this$0>
	//    6   12:getfield        #25  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
	//    7   15:invokeinterface #31  <Method android.content.Context DecorToolbar.getContext()>
	//    8   20:invokespecial   #34  <Method void View(android.content.Context)>
	//    9   23:areturn         
		else
			return super.onCreatePanelView(i);
	//   10   24:aload_0         
	//   11   25:iload_1         
	//   12   26:invokespecial   #36  <Method View WindowCallbackWrapper.onCreatePanelView(int)>
	//   13   29:areturn         
	}

	public boolean onPreparePanel(int i, View view, Menu menu)
	{
		boolean flag = super.onPreparePanel(i, view, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #40  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
	//    5    7:istore          4
		if(flag && !mToolbarMenuPrepared)
	//*   6    9:iload           4
	//*   7   11:ifeq            44
	//*   8   14:aload_0         
	//*   9   15:getfield        #13  <Field ToolbarActionBar this$0>
	//*  10   18:getfield        #44  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
	//*  11   21:ifne            44
		{
			mDecorToolbar.setMenuPrepared();
	//   12   24:aload_0         
	//   13   25:getfield        #13  <Field ToolbarActionBar this$0>
	//   14   28:getfield        #25  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
	//   15   31:invokeinterface #48  <Method void DecorToolbar.setMenuPrepared()>
			mToolbarMenuPrepared = true;
	//   16   36:aload_0         
	//   17   37:getfield        #13  <Field ToolbarActionBar this$0>
	//   18   40:iconst_1        
	//   19   41:putfield        #44  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
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
