// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.appsflyer;

import com.ibotta.android.mvp.base.MvpView;

public interface AppsFlyerRoutingView
	extends MvpView
{

	public abstract void onNoAppsFlyerUrl();

	public abstract void routeToLogin();

	public abstract void routeToRouting(String s);
}
