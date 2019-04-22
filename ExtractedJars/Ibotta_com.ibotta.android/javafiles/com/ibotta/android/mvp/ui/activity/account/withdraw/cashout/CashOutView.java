// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawalDetails;
import com.ibotta.android.views.base.title.TitleBarViewState;

public interface CashOutView
	extends LoadingMvpView
{

	public abstract void finishSuccessfully(WithdrawalDetails withdrawaldetails);

	public abstract void setAccountName(String s);

	public abstract void setAmountAvailable(String s);

	public abstract void setAmountRemaining(String s);

	public abstract void setMinimumCashOutAmountHint(float f);

	public abstract void setTransferCashEnabled(boolean flag);

	public abstract void setTransferToTitle(TitleBarViewState titlebarviewstate);

	public abstract void showCapturePassword(String s);

	public abstract void showInvalidAmount();
}
