// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import java.util.List;
import java.util.Map;

public class UnifiedNativeAdMapper
{

	public UnifiedNativeAdMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		extras = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #38  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Bundle()>
	//    6   12:putfield        #41  <Field Bundle extras>
	//    7   15:return          
	}

	public View getAdChoicesContent()
	{
		return zzdfz;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field View zzdfz>
	//    2    4:areturn         
	}

	public final String getAdvertiser()
	{
		return zzdfu;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzdfu>
	//    2    4:areturn         
	}

	public final String getBody()
	{
		return zzceo;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String zzceo>
	//    2    4:areturn         
	}

	public final String getCallToAction()
	{
		return zzdft;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String zzdft>
	//    2    4:areturn         
	}

	public final Bundle getExtras()
	{
		return extras;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Bundle extras>
	//    2    4:areturn         
	}

	public final String getHeadline()
	{
		return zzdfq;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String zzdfq>
	//    2    4:areturn         
	}

	public final com.google.android.gms.ads.formats.NativeAd.Image getIcon()
	{
		return zzdfs;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field com.google.android.gms.ads.formats.NativeAd$Image zzdfs>
	//    2    4:areturn         
	}

	public final List getImages()
	{
		return zzdfr;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List zzdfr>
	//    2    4:areturn         
	}

	public final boolean getOverrideClickHandling()
	{
		return zzdgd;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean zzdgd>
	//    2    4:ireturn         
	}

	public final boolean getOverrideImpressionRecording()
	{
		return zzdgc;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean zzdgc>
	//    2    4:ireturn         
	}

	public final String getPrice()
	{
		return zzdfx;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String zzdfx>
	//    2    4:areturn         
	}

	public final Double getStarRating()
	{
		return zzdfv;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Double zzdfv>
	//    2    4:areturn         
	}

	public final String getStore()
	{
		return zzdfw;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String zzdfw>
	//    2    4:areturn         
	}

	public final VideoController getVideoController()
	{
		return zzbkz;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field VideoController zzbkz>
	//    2    4:areturn         
	}

	public void handleClick(View view)
	{
	//    0    0:return          
	}

	public boolean hasVideoContent()
	{
		return zzdfy;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean zzdfy>
	//    2    4:ireturn         
	}

	public void recordImpression()
	{
	//    0    0:return          
	}

	public void setAdChoicesContent(View view)
	{
		zzdfz = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field View zzdfz>
	//    3    5:return          
	}

	public final void setAdvertiser(String s)
	{
		zzdfu = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String zzdfu>
	//    3    5:return          
	}

	public final void setBody(String s)
	{
		zzceo = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field String zzceo>
	//    3    5:return          
	}

	public final void setCallToAction(String s)
	{
		zzdft = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field String zzdft>
	//    3    5:return          
	}

	public final void setExtras(Bundle bundle)
	{
		extras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field Bundle extras>
	//    3    5:return          
	}

	public void setHasVideoContent(boolean flag)
	{
		zzdfy = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #97  <Field boolean zzdfy>
	//    3    5:return          
	}

	public final void setHeadline(String s)
	{
		zzdfq = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field String zzdfq>
	//    3    5:return          
	}

	public final void setIcon(com.google.android.gms.ads.formats.NativeAd.Image image)
	{
		zzdfs = image;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field com.google.android.gms.ads.formats.NativeAd$Image zzdfs>
	//    3    5:return          
	}

	public final void setImages(List list)
	{
		zzdfr = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field List zzdfr>
	//    3    5:return          
	}

	public void setMediaView(View view)
	{
		zzdga = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field View zzdga>
	//    3    5:return          
	}

	public final void setOverrideClickHandling(boolean flag)
	{
		zzdgd = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field boolean zzdgd>
	//    3    5:return          
	}

	public final void setOverrideImpressionRecording(boolean flag)
	{
		zzdgc = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean zzdgc>
	//    3    5:return          
	}

	public final void setPrice(String s)
	{
		zzdfx = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field String zzdfx>
	//    3    5:return          
	}

	public final void setStarRating(Double double1)
	{
		zzdfv = double1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field Double zzdfv>
	//    3    5:return          
	}

	public final void setStore(String s)
	{
		zzdfw = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String zzdfw>
	//    3    5:return          
	}

	public void trackViews(View view, Map map, Map map1)
	{
	//    0    0:return          
	}

	public void untrackView(View view)
	{
	//    0    0:return          
	}

	public final void zza(VideoController videocontroller)
	{
		zzbkz = videocontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field VideoController zzbkz>
	//    3    5:return          
	}

	public final Object zzbh()
	{
		return zzdgb;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Object zzdgb>
	//    2    4:areturn         
	}

	public final void zzl(Object obj)
	{
		zzdgb = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field Object zzdgb>
	//    3    5:return          
	}

	public final View zzvy()
	{
		return zzdga;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field View zzdga>
	//    2    4:areturn         
	}

	private Bundle extras;
	private VideoController zzbkz;
	private String zzceo;
	private String zzdfq;
	private List zzdfr;
	private com.google.android.gms.ads.formats.NativeAd.Image zzdfs;
	private String zzdft;
	private String zzdfu;
	private Double zzdfv;
	private String zzdfw;
	private String zzdfx;
	private boolean zzdfy;
	private View zzdfz;
	private View zzdga;
	private Object zzdgb;
	private boolean zzdgc;
	private boolean zzdgd;
}
