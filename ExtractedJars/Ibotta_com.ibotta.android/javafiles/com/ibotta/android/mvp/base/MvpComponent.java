// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpPresenter, MvpView

public interface MvpComponent
{

	public abstract MvpPresenter getMvpPresenter();

	public abstract MvpView getMvpView();

	public abstract RedeemPreFlightHelper getRedeemPreflightHelper();

	public abstract void inject(MvpView mvpview);
}
