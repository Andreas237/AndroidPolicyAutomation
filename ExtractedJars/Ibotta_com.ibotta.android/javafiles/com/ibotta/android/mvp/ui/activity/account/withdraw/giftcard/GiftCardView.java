// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawalDetails;
import com.ibotta.api.model.card.GiftCard;

public interface GiftCardView
	extends LoadingMvpView
{

	public abstract void finishSuccessfully(WithdrawalDetails withdrawaldetails);

	public abstract void setBalance(float f);

	public abstract void setBalanceRemainingText(float f);

	public abstract void setGiftCard(GiftCard giftcard);

	public abstract void setPurchaseGiftCardEnabled(boolean flag);

	public abstract void setPurchaseGiftCardText(float f);

	public abstract void showCapturePassword(String s);

	public abstract void showFixedAmounts(float af[], float f);

	public abstract void showRangeAmounts(float f, float f1);

	public abstract void showTerms(int i);
}
