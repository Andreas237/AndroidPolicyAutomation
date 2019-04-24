// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adListeners;

import com.startapp.android.publish.adsCommon.Ad;

public interface AdEventListener
{

	public abstract void onFailedToReceiveAd(Ad ad);

	public abstract void onReceiveAd(Ad ad);
}
