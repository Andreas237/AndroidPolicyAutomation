// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzqx, zzqn, zzqk

public final class zzrx extends zzqx
{

	public zzrx(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzqx()>
		zzblb = onappinstalladloadedlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field com.google.android.gms.ads.formats.NativeAppInstallAd$OnAppInstallAdLoadedListener zzblb>
	//    5    9:return          
	}

	public final void zza(zzqk zzqk)
	{
		zzblb.onAppInstallAdLoaded(((com.google.android.gms.ads.formats.NativeAppInstallAd) (new zzqn(zzqk))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.google.android.gms.ads.formats.NativeAppInstallAd$OnAppInstallAdLoadedListener zzblb>
	//    2    4:new             #19  <Class zzqn>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void zzqn(zzqk)>
	//    6   12:invokeinterface #27  <Method void com.google.android.gms.ads.formats.NativeAppInstallAd$OnAppInstallAdLoadedListener.onAppInstallAdLoaded(com.google.android.gms.ads.formats.NativeAppInstallAd)>
	//    7   17:return          
	}

	private final com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener zzblb;
}