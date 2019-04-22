// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.holder;

import com.ibotta.android.mvp.ui.activity.account.AccountAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.row.AbstractAccountRow;
import com.ibotta.android.mvp.ui.activity.account.row.AccountProfileRow;
import com.ibotta.android.mvp.ui.view.account.AccountProfileView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.holder:
//			AbstractAccountViewHolder

public class AccountProfileViewHolder extends AbstractAccountViewHolder
{

	public AccountProfileViewHolder(AccountProfileView accountprofileview)
	{
		super(((android.view.View) (accountprofileview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void AbstractAccountViewHolder(android.view.View)>
		apvAccountProfile = accountprofileview;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #14  <Field AccountProfileView apvAccountProfile>
	//    6   10:return          
	}

	public volatile void bind(AbstractAccountRow abstractaccountrow, AccountAdapterListener accountadapterlistener)
	{
		bind((AccountProfileRow)abstractaccountrow, accountadapterlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #19  <Class AccountProfileRow>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #22  <Method void bind(AccountProfileRow, AccountAdapterListener)>
	//    5    9:return          
	}

	public void bind(AccountProfileRow accountprofilerow, AccountAdapterListener accountadapterlistener)
	{
		apvAccountProfile.setCustomer(accountprofilerow.getCustomer());
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AccountProfileView apvAccountProfile>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method com.ibotta.api.model.customer.Customer AccountProfileRow.getCustomer()>
	//    4    8:invokevirtual   #32  <Method void AccountProfileView.setCustomer(com.ibotta.api.model.customer.Customer)>
		apvAccountProfile.setListener(((com.ibotta.android.mvp.ui.view.account.AccountProfileView.AccountProfileListener) (accountadapterlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field AccountProfileView apvAccountProfile>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #36  <Method void AccountProfileView.setListener(com.ibotta.android.mvp.ui.view.account.AccountProfileView$AccountProfileListener)>
	//    9   19:return          
	}

	private final AccountProfileView apvAccountProfile;
}
