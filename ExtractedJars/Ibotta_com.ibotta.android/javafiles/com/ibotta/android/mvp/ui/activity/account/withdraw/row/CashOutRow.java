// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.row;

import com.ibotta.android.mvp.ui.activity.account.withdraw.CashOutType;
import com.ibotta.api.model.customer.CustomerAccount;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.row:
//			AbstractWithdrawRow, WithdrawRowType

public class CashOutRow extends AbstractWithdrawRow
{

	public CashOutRow(CashOutType cashouttype, CustomerAccount customeraccount, float f, boolean flag)
	{
		super(WithdrawRowType.CASH);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field WithdrawRowType WithdrawRowType.CASH>
	//    2    4:invokespecial   #23  <Method void AbstractWithdrawRow(WithdrawRowType)>
		cashOutType = cashouttype;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #25  <Field CashOutType cashOutType>
		customerAccount = customeraccount;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #27  <Field CustomerAccount customerAccount>
		minimumAmount = f;
	//    9   17:aload_0         
	//   10   18:fload_3         
	//   11   19:putfield        #29  <Field float minimumAmount>
		belowMinimumBalance = flag;
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:putfield        #31  <Field boolean belowMinimumBalance>
	//   15   28:return          
	}

	public CashOutType getCashOutType()
	{
		return cashOutType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field CashOutType cashOutType>
	//    2    4:areturn         
	}

	public CustomerAccount getCustomerAccount()
	{
		return customerAccount;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CustomerAccount customerAccount>
	//    2    4:areturn         
	}

	public float getMinimumAmount()
	{
		return minimumAmount;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float minimumAmount>
	//    2    4:freturn         
	}

	public boolean isBelowMinimumBalance()
	{
		return belowMinimumBalance;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean belowMinimumBalance>
	//    2    4:ireturn         
	}

	private final boolean belowMinimumBalance;
	private final CashOutType cashOutType;
	private final CustomerAccount customerAccount;
	private final float minimumAmount;
}
