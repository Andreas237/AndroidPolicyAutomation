// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;

public interface NativeAdInterface
{

	public abstract StartAppNativeAd.b getCampaignAction();

	public abstract String getCategory();

	public abstract String getDescription();

	public abstract Bitmap getImageBitmap();

	public abstract String getImageUrl();

	public abstract String getInstalls();

	public abstract String getPackacgeName();

	public abstract float getRating();

	public abstract Bitmap getSecondaryImageBitmap();

	public abstract String getSecondaryImageUrl();

	public abstract String getTitle();

	public abstract Boolean isApp();

	public abstract void sendClick(Context context);

	public abstract void sendImpression(Context context);
}
