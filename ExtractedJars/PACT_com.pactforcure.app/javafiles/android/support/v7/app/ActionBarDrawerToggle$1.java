// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//			ActionBarDrawerToggle

class ActionBarDrawerToggle$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(mDrawerIndicatorEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ActionBarDrawerToggle this$0>
	//*   2    4:getfield        #26  <Field boolean ActionBarDrawerToggle.mDrawerIndicatorEnabled>
	//*   3    7:ifeq            18
			toggle();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ActionBarDrawerToggle this$0>
	//    6   14:invokevirtual   #29  <Method void ActionBarDrawerToggle.toggle()>
		else
	//*   7   17:return          
		if(mToolbarNavigationClickListener != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #16  <Field ActionBarDrawerToggle this$0>
	//*  10   22:getfield        #33  <Field android.view.View$OnClickListener ActionBarDrawerToggle.mToolbarNavigationClickListener>
	//*  11   25:ifnull          17
		{
			mToolbarNavigationClickListener.onClick(view);
	//   12   28:aload_0         
	//   13   29:getfield        #16  <Field ActionBarDrawerToggle this$0>
	//   14   32:getfield        #33  <Field android.view.View$OnClickListener ActionBarDrawerToggle.mToolbarNavigationClickListener>
	//   15   35:aload_1         
	//   16   36:invokeinterface #35  <Method void android.view.View$OnClickListener.onClick(View)>
			return;
	//   17   41:return          
		}
	}

	final ActionBarDrawerToggle this$0;

	ActionBarDrawerToggle$1()
	{
		this$0 = ActionBarDrawerToggle.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ActionBarDrawerToggle this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
