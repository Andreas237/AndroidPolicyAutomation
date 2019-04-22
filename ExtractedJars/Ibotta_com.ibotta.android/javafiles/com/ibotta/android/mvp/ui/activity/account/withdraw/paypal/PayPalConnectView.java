// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;

public interface PayPalConnectView
	extends LoadingMvpView
{

	public abstract void finishWithSuccess();

	public abstract boolean hasNavigationHistory();

	public abstract void loadUrl(String s);

	public abstract void navigateBack();

	public abstract void showLoadFailedDialog(String s);
}
