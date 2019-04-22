// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import com.ibotta.api.model.customer.CustomerAccount;
import java.util.List;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			CashOutType

public interface WithdrawView
	extends LoadingMvpView
{

	public abstract void capturePasswordForPayPalLink(String s);

	public abstract void capturePasswordForResetEmail(String s);

	public abstract void launchCashOut(com.ibotta.api.model.customer.CustomerAccount.Type type);

	public abstract void launchGiftCard(int i);

	public abstract void launchInviteFriends();

	public abstract void launchLinkGenericCashAccount(CashOutType cashouttype);

	public abstract void launchPayPalLink(String s);

	public abstract void onResendEmailSuccess();

	public abstract void onResetEmailSuccess();

	public abstract void setBalanceBelowMinimum();

	public abstract void setBalanceMinimumMet();

	public abstract void setRows(List list);

	public abstract void setWithdrawAvailableAmount(String s);

	public abstract void showCashOutSuccess();

	public abstract void showDeleteAccountConfirmation();

	public abstract void showEmailConfirmation();

	public abstract void showGiftCardSuccess();

	public abstract void showInsufficientFundsDialog(CustomerAccount customeraccount, String s);

	public abstract void showPhoneVerification();
}
