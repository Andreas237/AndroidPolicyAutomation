// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;

public interface AddUpcPresenter
	extends LoadingMvpPresenter
{

	public abstract void onNoClicked();

	public abstract void onYesClicked();

	public abstract void setOfferId(int i);
}
