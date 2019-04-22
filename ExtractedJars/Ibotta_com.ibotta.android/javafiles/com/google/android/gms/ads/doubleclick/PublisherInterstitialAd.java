// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzma;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//			PublisherAdRequest, AppEventListener, OnCustomRenderedAdLoadedListener

public final class PublisherInterstitialAd
{

	public PublisherInterstitialAd(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzuv = new zzma(context, this);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class zzma>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokespecial   #16  <Method void zzma(Context, PublisherInterstitialAd)>
	//    8   14:putfield        #18  <Field zzma zzuv>
		Preconditions.checkNotNull(((Object) (context)), "Context cannot be null");
	//    9   17:aload_1         
	//   10   18:ldc1            #20  <String "Context cannot be null">
	//   11   20:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   12   23:pop             
	//   13   24:return          
	}

	public final AdListener getAdListener()
	{
		return zzuv.getAdListener();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #31  <Method AdListener zzma.getAdListener()>
	//    3    7:areturn         
	}

	public final String getAdUnitId()
	{
		return zzuv.getAdUnitId();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #35  <Method String zzma.getAdUnitId()>
	//    3    7:areturn         
	}

	public final AppEventListener getAppEventListener()
	{
		return zzuv.getAppEventListener();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #39  <Method AppEventListener zzma.getAppEventListener()>
	//    3    7:areturn         
	}

	public final String getMediationAdapterClassName()
	{
		return zzuv.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #42  <Method String zzma.getMediationAdapterClassName()>
	//    3    7:areturn         
	}

	public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
	{
		return zzuv.getOnCustomRenderedAdLoadedListener();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #46  <Method OnCustomRenderedAdLoadedListener zzma.getOnCustomRenderedAdLoadedListener()>
	//    3    7:areturn         
	}

	public final boolean isLoaded()
	{
		return zzuv.isLoaded();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #50  <Method boolean zzma.isLoaded()>
	//    3    7:ireturn         
	}

	public final boolean isLoading()
	{
		return zzuv.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #53  <Method boolean zzma.isLoading()>
	//    3    7:ireturn         
	}

	public final void loadAd(PublisherAdRequest publisheradrequest)
	{
		zzuv.zza(publisheradrequest.zzay());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method com.google.android.gms.internal.ads.zzlw PublisherAdRequest.zzay()>
	//    4    8:invokevirtual   #68  <Method void zzma.zza(com.google.android.gms.internal.ads.zzlw)>
	//    5   11:return          
	}

	public final void setAdListener(AdListener adlistener)
	{
		zzuv.setAdListener(adlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method void zzma.setAdListener(AdListener)>
	//    4    8:return          
	}

	public final void setAdUnitId(String s)
	{
		zzuv.setAdUnitId(s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method void zzma.setAdUnitId(String)>
	//    4    8:return          
	}

	public final void setAppEventListener(AppEventListener appeventlistener)
	{
		zzuv.setAppEventListener(appeventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method void zzma.setAppEventListener(AppEventListener)>
	//    4    8:return          
	}

	public final void setCorrelator(Correlator correlator)
	{
		zzuv.setCorrelator(correlator);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method void zzma.setCorrelator(Correlator)>
	//    4    8:return          
	}

	public final void setImmersiveMode(boolean flag)
	{
		zzuv.setImmersiveMode(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #89  <Method void zzma.setImmersiveMode(boolean)>
	//    4    8:return          
	}

	public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
	{
		zzuv.setOnCustomRenderedAdLoadedListener(oncustomrenderedadloadedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #93  <Method void zzma.setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener)>
	//    4    8:return          
	}

	public final void show()
	{
		zzuv.show();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzma zzuv>
	//    2    4:invokevirtual   #96  <Method void zzma.show()>
	//    3    7:return          
	}

	private final zzma zzuv;
}
