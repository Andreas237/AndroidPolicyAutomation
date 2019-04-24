// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.ActionMenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ToolbarWidgetWrapper, Toolbar

class ToolbarWidgetWrapper$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(mWindowCallback != null && mMenuPrepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ToolbarWidgetWrapper this$0>
	//*   2    4:getfield        #50  <Field android.view.Window$Callback ToolbarWidgetWrapper.mWindowCallback>
	//*   3    7:ifnull          38
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field ToolbarWidgetWrapper this$0>
	//*   6   14:getfield        #54  <Field boolean ToolbarWidgetWrapper.mMenuPrepared>
	//*   7   17:ifeq            38
			mWindowCallback.onMenuItemSelected(0, ((android.view.MenuItem) (mNavItem)));
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field ToolbarWidgetWrapper this$0>
	//   10   24:getfield        #50  <Field android.view.Window$Callback ToolbarWidgetWrapper.mWindowCallback>
	//   11   27:iconst_0        
	//   12   28:aload_0         
	//   13   29:getfield        #43  <Field ActionMenuItem mNavItem>
	//   14   32:invokeinterface #60  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, android.view.MenuItem)>
	//   15   37:pop             
	//   16   38:return          
	}

	final ActionMenuItem mNavItem;
	final ToolbarWidgetWrapper this$0;

	ToolbarWidgetWrapper$1()
	{
		this$0 = ToolbarWidgetWrapper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ToolbarWidgetWrapper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		mNavItem = new ActionMenuItem(mToolbar.getContext(), 0, 0x102002c, 0, 0, mTitle);
	//    5    9:aload_0         
	//    6   10:new             #23  <Class ActionMenuItem>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field ToolbarWidgetWrapper this$0>
	//   10   18:getfield        #27  <Field Toolbar ToolbarWidgetWrapper.mToolbar>
	//   11   21:invokevirtual   #33  <Method android.content.Context Toolbar.getContext()>
	//   12   24:iconst_0        
	//   13   25:ldc1            #34  <Int 0x102002c>
	//   14   27:iconst_0        
	//   15   28:iconst_0        
	//   16   29:aload_0         
	//   17   30:getfield        #18  <Field ToolbarWidgetWrapper this$0>
	//   18   33:getfield        #38  <Field CharSequence ToolbarWidgetWrapper.mTitle>
	//   19   36:invokespecial   #41  <Method void ActionMenuItem(android.content.Context, int, int, int, int, CharSequence)>
	//   20   39:putfield        #43  <Field ActionMenuItem mNavItem>
	//   21   42:return          
	}
}
