// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import com.ibotta.android.mvp.base.contentevents.ContentEventsPresenter;

public interface LoadingMvpPresenter
	extends ContentEventsPresenter
{

	public abstract boolean isLoading();

	public abstract void onFacebookAuthFailed();

	public abstract void onFacebookInfoFailed();

	public abstract void onFacebookLinkFailed();

	public abstract void onFacebookUnlinkFailed();

	public abstract void onFetchJobErrorCancelled();

	public abstract void onNetworkConnectionErrorRetryClicked();

	public abstract void onRefresh();

	public abstract void onScreenLoadingCancelled();

	public abstract void onScreenLoadingRetry();

	public abstract void onScreenLoadingRetryCancelled();

	public abstract void onSubmittedJobErrorCancelled();

	public abstract void onSubmittedJobLoadingCancelled();

	public abstract void setNetworkConnectionErrorViewShowing();
}
