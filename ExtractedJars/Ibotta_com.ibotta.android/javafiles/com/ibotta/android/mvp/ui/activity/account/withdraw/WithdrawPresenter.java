// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;
import com.ibotta.api.model.card.GiftCard;
import com.ibotta.api.model.customer.Customer;
import com.ibotta.api.model.customer.CustomerAccount;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawalDetails, CashOutType

public interface WithdrawPresenter
	extends LoadingMvpPresenter
{

	public abstract com.ibotta.api.model.customer.CustomerAccount.Type getCashOutSuccessType();

	public abstract Customer getCustomer();

	public abstract void onCashAccountClicked(CustomerAccount customeraccount);

	public abstract void onCashOutSuccess(WithdrawalDetails withdrawaldetails);

	public abstract void onEmailResetSuccess();

	public abstract void onGiftCardClicked(GiftCard giftcard);

	public abstract void onGiftCardSuccess(WithdrawalDetails withdrawaldetails);

	public abstract void onInviteFriendsClicked();

	public abstract void onLinkAccountClicked(CashOutType cashouttype);

	public abstract void onLinkSuccess();

	public abstract void onPayPalLinkPasswordCaptured(String s);

	public abstract void onResendConfirmationSuccess();

	public abstract void onResendEmailClicked();

	public abstract void onResetEmailClicked(String s);

	public abstract void onResetEmailPasswordCaptured(String s);

	public abstract void onUnlinkAccountActionClicked(int i);

	public abstract void onUnlinkAccountClicked(CustomerAccount customeraccount);

	public abstract void onVerifyDeviceSuccess();
}
