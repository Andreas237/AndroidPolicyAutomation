// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.doubleclick;

import android.view.View;

public interface CustomRenderedAd
{

	public abstract String getBaseUrl();

	public abstract String getContent();

	public abstract void onAdRendered(View view);

	public abstract void recordClick();

	public abstract void recordImpression();
}
