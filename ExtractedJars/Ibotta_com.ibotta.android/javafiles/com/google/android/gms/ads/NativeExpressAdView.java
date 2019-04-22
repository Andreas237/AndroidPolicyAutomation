// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.internal.ads.zzly;

// Referenced classes of package com.google.android.gms.ads:
//			BaseAdView, AdListener, AdSize, VideoController, 
//			VideoOptions, AdRequest

public final class NativeExpressAdView extends BaseAdView
{

	public NativeExpressAdView(Context context)
	{
		super(context, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #10  <Method void BaseAdView(Context, int)>
	//    4    6:return          
	}

	public NativeExpressAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #15  <Method void BaseAdView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NativeExpressAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #18  <Method void BaseAdView(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public final volatile void destroy()
	{
		super.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseAdView.destroy()>
	//    2    4:return          
	}

	public final volatile AdListener getAdListener()
	{
		return super.getAdListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method AdListener BaseAdView.getAdListener()>
	//    2    4:areturn         
	}

	public final volatile AdSize getAdSize()
	{
		return super.getAdSize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method AdSize BaseAdView.getAdSize()>
	//    2    4:areturn         
	}

	public final volatile String getAdUnitId()
	{
		return super.getAdUnitId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method String BaseAdView.getAdUnitId()>
	//    2    4:areturn         
	}

	public final volatile String getMediationAdapterClassName()
	{
		return super.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method String BaseAdView.getMediationAdapterClassName()>
	//    2    4:areturn         
	}

	public final VideoController getVideoController()
	{
		return zzut.getVideoController();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field zzly zzut>
	//    2    4:invokevirtual   #47  <Method VideoController zzly.getVideoController()>
	//    3    7:areturn         
	}

	public final VideoOptions getVideoOptions()
	{
		return zzut.getVideoOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field zzly zzut>
	//    2    4:invokevirtual   #51  <Method VideoOptions zzly.getVideoOptions()>
	//    3    7:areturn         
	}

	public final volatile boolean isLoading()
	{
		return super.isLoading();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method boolean BaseAdView.isLoading()>
	//    2    4:ireturn         
	}

	public final volatile void loadAd(AdRequest adrequest)
	{
		super.loadAd(adrequest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void BaseAdView.loadAd(AdRequest)>
	//    3    5:return          
	}

	public final volatile void pause()
	{
		super.pause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void BaseAdView.pause()>
	//    2    4:return          
	}

	public final volatile void resume()
	{
		super.resume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void BaseAdView.resume()>
	//    2    4:return          
	}

	public final volatile void setAdListener(AdListener adlistener)
	{
		super.setAdListener(adlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void BaseAdView.setAdListener(AdListener)>
	//    3    5:return          
	}

	public final volatile void setAdSize(AdSize adsize)
	{
		super.setAdSize(adsize);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void BaseAdView.setAdSize(AdSize)>
	//    3    5:return          
	}

	public final volatile void setAdUnitId(String s)
	{
		super.setAdUnitId(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void BaseAdView.setAdUnitId(String)>
	//    3    5:return          
	}

	public final void setVideoOptions(VideoOptions videooptions)
	{
		zzut.setVideoOptions(videooptions);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method void zzly.setVideoOptions(VideoOptions)>
	//    4    8:return          
	}
}
