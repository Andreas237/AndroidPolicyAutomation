// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView

class ActionMenuView$MenuBuilderCallback
	implements android.support.v7.view.menu.MenuBuilder.Callback
{

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		return mOnMenuItemClickListener != null && mOnMenuItemClickListener.onMenuItemClick(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ActionMenuView this$0>
	//    2    4:getfield        #25  <Field ActionMenuView$OnMenuItemClickListener ActionMenuView.mOnMenuItemClickListener>
	//    3    7:ifnull          28
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ActionMenuView this$0>
	//    6   14:getfield        #25  <Field ActionMenuView$OnMenuItemClickListener ActionMenuView.mOnMenuItemClickListener>
	//    7   17:aload_2         
	//    8   18:invokeinterface #31  <Method boolean ActionMenuView$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public void onMenuModeChange(MenuBuilder menubuilder)
	{
		if(mMenuBuilderCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ActionMenuView this$0>
	//*   2    4:getfield        #37  <Field android.support.v7.view.menu.MenuBuilder$Callback ActionMenuView.mMenuBuilderCallback>
	//*   3    7:ifnull          23
			mMenuBuilderCallback.onMenuModeChange(menubuilder);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ActionMenuView this$0>
	//    6   14:getfield        #37  <Field android.support.v7.view.menu.MenuBuilder$Callback ActionMenuView.mMenuBuilderCallback>
	//    7   17:aload_1         
	//    8   18:invokeinterface #39  <Method void android.support.v7.view.menu.MenuBuilder$Callback.onMenuModeChange(MenuBuilder)>
	//    9   23:return          
	}

	final ActionMenuView this$0;

	ActionMenuView$MenuBuilderCallback()
	{
		this$0 = ActionMenuView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ActionMenuView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
