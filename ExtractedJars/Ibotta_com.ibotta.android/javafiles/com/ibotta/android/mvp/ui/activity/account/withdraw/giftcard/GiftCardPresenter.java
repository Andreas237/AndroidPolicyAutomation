// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;

public interface GiftCardPresenter
	extends LoadingMvpPresenter
{

	public abstract void onAmountSelected(float f);

	public abstract void onPasswordCaptured(String s);

	public abstract void onPurchaseClicked();

	public abstract void onTermsClicked();

	public abstract void setGiftCardId(int i);
}
