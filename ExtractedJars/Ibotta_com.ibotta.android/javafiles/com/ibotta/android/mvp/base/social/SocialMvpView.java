// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.social;

import com.ibotta.android.FacebookFeed;
import com.ibotta.android.mvp.base.loading.LoadingMvpView;

public interface SocialMvpView
	extends LoadingMvpView
{

	public abstract void doFacebookShare(FacebookFeed facebookfeed);

	public abstract void doTweet(String s);

	public abstract String getBackUpShareMessage(String s);

	public abstract void showFacebookAuthFailed();

	public abstract void showFacebookPostFailedMessage(String s);

	public abstract void showShareChooser(String s, String s1);
}
