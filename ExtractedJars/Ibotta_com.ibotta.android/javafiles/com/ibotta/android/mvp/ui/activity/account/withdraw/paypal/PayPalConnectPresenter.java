// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;

public interface PayPalConnectPresenter
	extends LoadingMvpPresenter
{

	public abstract void onBackPressed();

	public abstract void onFetchJobErrorDialogClosed();

	public abstract void onLoadFailedDialogClosed();

	public abstract void onPageLoadFailed(String s);

	public abstract void onPageLoadFinished();

	public abstract void onPageLoadStarted();

	public abstract void onSubmittedJobErrorDialogClosed();

	public abstract void setCustomerPassword(String s);

	public abstract boolean shouldOverrideUrlLoading(String s);
}
