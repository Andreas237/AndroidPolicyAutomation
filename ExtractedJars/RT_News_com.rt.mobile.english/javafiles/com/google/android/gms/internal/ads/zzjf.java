// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzki

public final class zzjf extends zzki
{

	public zzjf(AdListener adlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzki()>
		zzapu = adlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field AdListener zzapu>
	//    5    9:return          
	}

	public final AdListener getAdListener()
	{
		return zzapu;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:areturn         
	}

	public final void onAdClicked()
	{
		zzapu.onAdClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:invokevirtual   #22  <Method void AdListener.onAdClicked()>
	//    3    7:return          
	}

	public final void onAdClosed()
	{
		zzapu.onAdClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:invokevirtual   #25  <Method void AdListener.onAdClosed()>
	//    3    7:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzapu.onAdFailedToLoad(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #29  <Method void AdListener.onAdFailedToLoad(int)>
	//    4    8:return          
	}

	public final void onAdImpression()
	{
		zzapu.onAdImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:invokevirtual   #32  <Method void AdListener.onAdImpression()>
	//    3    7:return          
	}

	public final void onAdLeftApplication()
	{
		zzapu.onAdLeftApplication();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:invokevirtual   #35  <Method void AdListener.onAdLeftApplication()>
	//    3    7:return          
	}

	public final void onAdLoaded()
	{
		zzapu.onAdLoaded();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:invokevirtual   #38  <Method void AdListener.onAdLoaded()>
	//    3    7:return          
	}

	public final void onAdOpened()
	{
		zzapu.onAdOpened();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AdListener zzapu>
	//    2    4:invokevirtual   #41  <Method void AdListener.onAdOpened()>
	//    3    7:return          
	}

	private final AdListener zzapu;
}
