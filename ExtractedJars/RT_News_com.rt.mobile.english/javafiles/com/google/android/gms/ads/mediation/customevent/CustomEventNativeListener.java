// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			CustomEventListener

public interface CustomEventNativeListener
	extends CustomEventListener
{

	public abstract void onAdImpression();

	public abstract void onAdLoaded(NativeAdMapper nativeadmapper);

	public abstract void onAdLoaded(UnifiedNativeAdMapper unifiednativeadmapper);
}
