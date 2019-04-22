// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.social;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;
import com.ibotta.android.social.facebook.FacebookManager;

public interface SocialMvpPresenter
	extends LoadingMvpPresenter
{

	public abstract void onFacebookAuthFailed();

	public abstract void onFacebookAuthSuccess();

	public abstract void onFacebookFeedCancelled();

	public abstract void onFacebookFeedFail(Exception exception);

	public abstract void onFacebookFeedSuccess();

	public abstract void setFacebookManager(FacebookManager facebookmanager);
}
