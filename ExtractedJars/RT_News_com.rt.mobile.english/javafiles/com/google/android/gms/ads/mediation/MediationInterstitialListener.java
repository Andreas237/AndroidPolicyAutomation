// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;


// Referenced classes of package com.google.android.gms.ads.mediation:
//			MediationInterstitialAdapter

public interface MediationInterstitialListener
{

	public abstract void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter);

	public abstract void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter);

	public abstract void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i);

	public abstract void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter);

	public abstract void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter);

	public abstract void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter);
}
