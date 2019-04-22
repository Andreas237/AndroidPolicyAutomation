// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import com.ibotta.api.model.card.GiftCard;
import com.ibotta.api.model.customer.CustomerAccount;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			CashOutType

public interface WithdrawAdapterListener
{

	public abstract void linkAccount(CashOutType cashouttype);

	public abstract void onAccountClicked(CustomerAccount customeraccount);

	public abstract void onGiftCardClicked(GiftCard giftcard);

	public abstract void onInviteFriendsClicked();

	public abstract void unlinkAccount(CustomerAccount customeraccount);
}
