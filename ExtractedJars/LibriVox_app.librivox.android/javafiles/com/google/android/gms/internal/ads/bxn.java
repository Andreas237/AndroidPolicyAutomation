// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			km, bwx, nn, zzwf, 
//			bxc, nx, cj, co, 
//			tu, bxu

public interface bxn
	extends IInterface
{

	public abstract bwx createAdLoaderBuilder(a a, String s, km km, int i);

	public abstract nn createAdOverlay(a a);

	public abstract bxc createBannerAdManager(a a, zzwf zzwf, String s, km km, int i);

	public abstract nx createInAppPurchaseManager(a a);

	public abstract bxc createInterstitialAdManager(a a, zzwf zzwf, String s, km km, int i);

	public abstract cj createNativeAdViewDelegate(a a, a a1);

	public abstract co createNativeAdViewHolderDelegate(a a, a a1, a a2);

	public abstract tu createRewardedVideoAd(a a, km km, int i);

	public abstract tu createRewardedVideoAdSku(a a, int i);

	public abstract bxc createSearchAdManager(a a, zzwf zzwf, String s, int i);

	public abstract bxu getMobileAdsSettingsManager(a a);

	public abstract bxu getMobileAdsSettingsManagerWithClientJarVersion(a a, int i);
}
