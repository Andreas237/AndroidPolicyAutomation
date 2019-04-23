// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//			PopupMenu

class PopupMenu$1
	implements android.support.v7.view.menu.Callback
{

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		if(mMenuItemClickListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PopupMenu this$0>
	//*   2    4:getfield        #24  <Field PopupMenu$OnMenuItemClickListener PopupMenu.mMenuItemClickListener>
	//*   3    7:ifnull          24
			return mMenuItemClickListener.onMenuItemClick(menuitem);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field PopupMenu this$0>
	//    6   14:getfield        #24  <Field PopupMenu$OnMenuItemClickListener PopupMenu.mMenuItemClickListener>
	//    7   17:aload_2         
	//    8   18:invokeinterface #30  <Method boolean PopupMenu$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//    9   23:ireturn         
		else
			return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	public void onMenuModeChange(MenuBuilder menubuilder)
	{
	//    0    0:return          
	}

	final PopupMenu this$0;

	PopupMenu$1()
	{
		this$0 = PopupMenu.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PopupMenu this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
