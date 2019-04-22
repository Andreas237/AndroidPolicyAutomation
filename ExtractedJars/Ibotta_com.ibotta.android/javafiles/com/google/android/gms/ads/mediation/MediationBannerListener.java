// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;


// Referenced classes of package com.google.android.gms.ads.mediation:
//			MediationBannerAdapter

public interface MediationBannerListener
{

	public abstract void onAdClicked(MediationBannerAdapter mediationbanneradapter);

	public abstract void onAdClosed(MediationBannerAdapter mediationbanneradapter);

	public abstract void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i);

	public abstract void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter);

	public abstract void onAdLoaded(MediationBannerAdapter mediationbanneradapter);

	public abstract void onAdOpened(MediationBannerAdapter mediationbanneradapter);

	public abstract void zza(MediationBannerAdapter mediationbanneradapter, String s, String s1);
}
