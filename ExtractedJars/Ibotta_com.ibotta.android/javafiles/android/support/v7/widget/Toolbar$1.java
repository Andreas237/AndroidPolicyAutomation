// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//			Toolbar

class Toolbar$1
	implements View.OnMenuItemClickListener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		if(mOnMenuItemClickListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Toolbar this$0>
	//*   2    4:getfield        #24  <Field Toolbar$OnMenuItemClickListener Toolbar.mOnMenuItemClickListener>
	//*   3    7:ifnull          24
			return mOnMenuItemClickListener.onMenuItemClick(menuitem);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field Toolbar this$0>
	//    6   14:getfield        #24  <Field Toolbar$OnMenuItemClickListener Toolbar.mOnMenuItemClickListener>
	//    7   17:aload_1         
	//    8   18:invokeinterface #28  <Method boolean Toolbar$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//    9   23:ireturn         
		else
			return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	final Toolbar this$0;

	Toolbar$1()
	{
		this$0 = Toolbar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Toolbar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
