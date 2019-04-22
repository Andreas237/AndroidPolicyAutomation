// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;
import com.ibotta.android.mvp.ui.activity.account.withdraw.CashOutType;

public interface LinkCashAccountPresenter
	extends LoadingMvpPresenter
{

	public abstract void onEmailChanged(String s);

	public abstract void onFirstNameChanged(String s);

	public abstract void onLastNameChanged(String s);

	public abstract void onLinkAccountClicked();

	public abstract void onPasswordCaptured(String s);

	public abstract void setAccountType(CashOutType cashouttype);
}
