// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.mediation:
//			MediationAdRequest

public interface NativeMediationAdRequest
	extends MediationAdRequest
{

	public abstract float getAdVolume();

	public abstract NativeAdOptions getNativeAdOptions();

	public abstract boolean isAdMuted();

	public abstract boolean isAppInstallAdRequested();

	public abstract boolean isContentAdRequested();

	public abstract boolean isUnifiedNativeAdRequested();

	public abstract boolean zzna();

	public abstract Map zznb();
}
