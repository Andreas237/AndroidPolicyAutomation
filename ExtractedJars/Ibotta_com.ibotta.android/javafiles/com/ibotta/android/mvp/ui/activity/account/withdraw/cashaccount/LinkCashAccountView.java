// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import com.ibotta.android.views.base.title.TitleBarViewState;

public interface LinkCashAccountView
	extends LoadingMvpView
{

	public abstract void setLinkAccountEnabled(boolean flag);

	public abstract void setLinkAccountTitle(TitleBarViewState titlebarviewstate);

	public abstract void showCapturePassword(String s);

	public abstract void showInvalidEmailAddress();
}
