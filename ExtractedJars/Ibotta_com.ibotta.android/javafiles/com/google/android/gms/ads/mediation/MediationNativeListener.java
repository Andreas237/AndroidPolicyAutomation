// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

// Referenced classes of package com.google.android.gms.ads.mediation:
//			MediationNativeAdapter, NativeAdMapper, UnifiedNativeAdMapper

public interface MediationNativeListener
{

	public abstract void onAdClicked(MediationNativeAdapter mediationnativeadapter);

	public abstract void onAdClosed(MediationNativeAdapter mediationnativeadapter);

	public abstract void onAdFailedToLoad(MediationNativeAdapter mediationnativeadapter, int i);

	public abstract void onAdImpression(MediationNativeAdapter mediationnativeadapter);

	public abstract void onAdLeftApplication(MediationNativeAdapter mediationnativeadapter);

	public abstract void onAdLoaded(MediationNativeAdapter mediationnativeadapter, NativeAdMapper nativeadmapper);

	public abstract void onAdLoaded(MediationNativeAdapter mediationnativeadapter, UnifiedNativeAdMapper unifiednativeadmapper);

	public abstract void onAdOpened(MediationNativeAdapter mediationnativeadapter);

	public abstract void onVideoEnd(MediationNativeAdapter mediationnativeadapter);

	public abstract void zza(MediationNativeAdapter mediationnativeadapter, NativeCustomTemplateAd nativecustomtemplatead);

	public abstract void zza(MediationNativeAdapter mediationnativeadapter, NativeCustomTemplateAd nativecustomtemplatead, String s);
}
