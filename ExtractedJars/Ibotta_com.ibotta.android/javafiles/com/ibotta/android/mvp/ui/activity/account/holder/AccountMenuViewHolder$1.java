// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.holder;

import android.view.View;
import com.ibotta.android.mvp.ui.activity.account.AccountAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.AccountMenu;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.holder:
//			AccountMenuViewHolder

class AccountMenuViewHolder$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		val$listener.onRowClicked(val$accountMenu);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AccountAdapterListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field AccountMenu val$accountMenu>
	//    4    8:invokeinterface #37  <Method void AccountAdapterListener.onRowClicked(AccountMenu)>
	//    5   13:return          
	}

	final AccountMenuViewHolder this$0;
	final AccountMenu val$accountMenu;
	final AccountAdapterListener val$listener;

	AccountMenuViewHolder$1()
	{
		this$0 = final_accountmenuviewholder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AccountMenuViewHolder this$0>
		val$listener = accountadapterlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AccountAdapterListener val$listener>
		val$accountMenu = AccountMenu.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field AccountMenu val$accountMenu>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
