// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzrp

public final class zzse extends zzrp
{

	public zzse(com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener unconfirmedclicklistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzrp()>
		zzblk = unconfirmedclicklistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field com.google.android.gms.ads.formats.UnifiedNativeAd$UnconfirmedClickListener zzblk>
	//    5    9:return          
	}

	public final void onUnconfirmedClickCancelled()
	{
		zzblk.onUnconfirmedClickCancelled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field com.google.android.gms.ads.formats.UnifiedNativeAd$UnconfirmedClickListener zzblk>
	//    2    4:invokeinterface #19  <Method void com.google.android.gms.ads.formats.UnifiedNativeAd$UnconfirmedClickListener.onUnconfirmedClickCancelled()>
	//    3    9:return          
	}

	public final void onUnconfirmedClickReceived(String s)
	{
		zzblk.onUnconfirmedClickReceived(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field com.google.android.gms.ads.formats.UnifiedNativeAd$UnconfirmedClickListener zzblk>
	//    2    4:aload_1         
	//    3    5:invokeinterface #23  <Method void com.google.android.gms.ads.formats.UnifiedNativeAd$UnconfirmedClickListener.onUnconfirmedClickReceived(String)>
	//    4   10:return          
	}

	private final com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener zzblk;
}
