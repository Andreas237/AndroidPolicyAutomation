// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import com.ibotta.android.mvp.base.contentevents.ContentEventsView;
import com.ibotta.api.ApiErrorDetails;

public interface LoadingMvpView
	extends ContentEventsView
{

	public abstract void hideScreenLoading();

	public abstract void hideSubmittedJobLoading();

	public abstract void recreate();

	public abstract void setTitleForLoadFailure();

	public abstract void showFacebookAuthFailed();

	public abstract void showFacebookInfoFailed();

	public abstract void showFacebookLinkFailed();

	public abstract void showFacebookUnlinkFailed();

	public abstract void showFetchJobFailed(ApiErrorDetails apierrordetails);

	public abstract void showNetworkConnectionError();

	public abstract void showScreenLoadFailed();

	public abstract void showScreenLoading();

	public abstract void showSubmittedJobFailed(ApiErrorDetails apierrordetails);

	public abstract void showSubmittedJobLoading();

	public abstract void showSubmittedJobLoading(String s);

	public abstract void showUnknownErrorDialog();
}
