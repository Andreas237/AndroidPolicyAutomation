// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzra, zzqr, zzqo

public final class zzry extends zzra
{

	public zzry(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzra()>
		zzblc = oncontentadloadedlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field com.google.android.gms.ads.formats.NativeContentAd$OnContentAdLoadedListener zzblc>
	//    5    9:return          
	}

	public final void zza(zzqo zzqo)
	{
		zzblc.onContentAdLoaded(((com.google.android.gms.ads.formats.NativeContentAd) (new zzqr(zzqo))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.google.android.gms.ads.formats.NativeContentAd$OnContentAdLoadedListener zzblc>
	//    2    4:new             #19  <Class zzqr>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void zzqr(zzqo)>
	//    6   12:invokeinterface #27  <Method void com.google.android.gms.ads.formats.NativeContentAd$OnContentAdLoadedListener.onContentAdLoaded(com.google.android.gms.ads.formats.NativeContentAd)>
	//    7   17:return          
	}

	private final com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener zzblc;
}
