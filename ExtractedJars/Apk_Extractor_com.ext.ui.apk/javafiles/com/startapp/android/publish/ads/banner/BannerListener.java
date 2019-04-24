// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner;

import android.view.View;

public interface BannerListener
{

	public abstract void onClick(View view);

	public abstract void onFailedToReceiveAd(View view);

	public abstract void onReceiveAd(View view);
}
