// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.row;

import com.ibotta.api.model.card.GiftCard;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.row:
//			AbstractWithdrawRow, WithdrawRowType

public class GiftCardRow extends AbstractWithdrawRow
{

	public GiftCardRow(GiftCard giftcard, boolean flag)
	{
		super(WithdrawRowType.GIFT_CARD);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field WithdrawRowType WithdrawRowType.GIFT_CARD>
	//    2    4:invokespecial   #19  <Method void AbstractWithdrawRow(WithdrawRowType)>
		giftCard = giftcard;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #21  <Field GiftCard giftCard>
		belowMinimumBalance = flag;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #23  <Field boolean belowMinimumBalance>
	//    9   17:return          
	}

	public GiftCard getGiftCard()
	{
		return giftCard;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GiftCard giftCard>
	//    2    4:areturn         
	}

	public boolean isBelowMinimumBalance()
	{
		return belowMinimumBalance;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean belowMinimumBalance>
	//    2    4:ireturn         
	}

	private final boolean belowMinimumBalance;
	private final GiftCard giftCard;
}
