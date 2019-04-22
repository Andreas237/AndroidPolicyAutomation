// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.row;

import com.ibotta.android.mvp.ui.activity.account.AccountRowType;
import com.ibotta.api.model.customer.Customer;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.row:
//			AbstractAccountRow

public class AccountProfileRow extends AbstractAccountRow
{

	public AccountProfileRow()
	{
		super(AccountRowType.PROFILE);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field AccountRowType AccountRowType.PROFILE>
	//    2    4:invokespecial   #17  <Method void AbstractAccountRow(AccountRowType)>
	//    3    7:return          
	}

	public Customer getCustomer()
	{
		return customer;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Customer customer>
	//    2    4:areturn         
	}

	public void setCustomer(Customer customer1)
	{
		customer = customer1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Customer customer>
	//    3    5:return          
	}

	private Customer customer;
}
