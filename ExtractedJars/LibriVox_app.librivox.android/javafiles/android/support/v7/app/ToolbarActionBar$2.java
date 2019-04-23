// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//			ToolbarActionBar

class ToolbarActionBar$2
	implements android.support.v7.widget.lickListener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		return mWindowCallback.onMenuItemSelected(0, menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ToolbarActionBar this$0>
	//    2    4:getfield        #24  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
	//    3    7:iconst_0        
	//    4    8:aload_1         
	//    5    9:invokeinterface #30  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
	//    6   14:ireturn         
	}

	final ToolbarActionBar this$0;

	ToolbarActionBar$2()
	{
		this$0 = ToolbarActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ToolbarActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
