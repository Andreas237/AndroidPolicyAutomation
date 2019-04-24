// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.mediation:
//			NativeAdMapper

public class NativeAppInstallAdMapper extends NativeAdMapper
{

	public NativeAppInstallAdMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void NativeAdMapper()>
	//    2    4:return          
	}

	public final String getBody()
	{
		return zzbhy;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String zzbhy>
	//    2    4:areturn         
	}

	public final String getCallToAction()
	{
		return zzbia;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String zzbia>
	//    2    4:areturn         
	}

	public final String getHeadline()
	{
		return zzbhw;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String zzbhw>
	//    2    4:areturn         
	}

	public final com.google.android.gms.ads.formats.NativeAd.Image getIcon()
	{
		return zzdfo;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field com.google.android.gms.ads.formats.NativeAd$Image zzdfo>
	//    2    4:areturn         
	}

	public final List getImages()
	{
		return zzbhx;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List zzbhx>
	//    2    4:areturn         
	}

	public final String getPrice()
	{
		return zzbid;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String zzbid>
	//    2    4:areturn         
	}

	public final double getStarRating()
	{
		return zzbib;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field double zzbib>
	//    2    4:dreturn         
	}

	public final String getStore()
	{
		return zzbic;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzbic>
	//    2    4:areturn         
	}

	public final void setBody(String s)
	{
		zzbhy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String zzbhy>
	//    3    5:return          
	}

	public final void setCallToAction(String s)
	{
		zzbia = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String zzbia>
	//    3    5:return          
	}

	public final void setHeadline(String s)
	{
		zzbhw = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String zzbhw>
	//    3    5:return          
	}

	public final void setIcon(com.google.android.gms.ads.formats.NativeAd.Image image)
	{
		zzdfo = image;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field com.google.android.gms.ads.formats.NativeAd$Image zzdfo>
	//    3    5:return          
	}

	public final void setImages(List list)
	{
		zzbhx = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field List zzbhx>
	//    3    5:return          
	}

	public final void setPrice(String s)
	{
		zzbid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String zzbid>
	//    3    5:return          
	}

	public final void setStarRating(double d)
	{
		zzbib = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #49  <Field double zzbib>
	//    3    5:return          
	}

	public final void setStore(String s)
	{
		zzbic = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String zzbic>
	//    3    5:return          
	}

	private String zzbhw;
	private List zzbhx;
	private String zzbhy;
	private String zzbia;
	private double zzbib;
	private String zzbic;
	private String zzbid;
	private com.google.android.gms.ads.formats.NativeAd.Image zzdfo;
}
