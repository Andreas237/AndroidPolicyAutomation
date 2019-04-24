// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzrg, zzqv, zzqs

public final class zzsa extends zzrg
{

	public zzsa(com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener oncustomtemplateadloadedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzrg()>
		zzble = oncustomtemplateadloadedlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener zzble>
	//    5    9:return          
	}

	public final void zzb(zzqs zzqs)
	{
		zzble.onCustomTemplateAdLoaded(((com.google.android.gms.ads.formats.NativeCustomTemplateAd) (zzqv.zza(zzqs))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener zzble>
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method zzqv zzqv.zza(zzqs)>
	//    4    8:invokeinterface #29  <Method void com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(com.google.android.gms.ads.formats.NativeCustomTemplateAd)>
	//    5   13:return          
	}

	private final com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzble;
}
