// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.mediation:
//			NativeAdMapper

public class NativeContentAdMapper extends NativeAdMapper
{

	public NativeContentAdMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void NativeAdMapper()>
	//    2    4:return          
	}

	public final String getAdvertiser()
	{
		return zzbim;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String zzbim>
	//    2    4:areturn         
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

	public final List getImages()
	{
		return zzbhx;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List zzbhx>
	//    2    4:areturn         
	}

	public final com.google.android.gms.ads.formats.NativeAd.Image getLogo()
	{
		return zzdfp;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field com.google.android.gms.ads.formats.NativeAd$Image zzdfp>
	//    2    4:areturn         
	}

	public final void setAdvertiser(String s)
	{
		zzbim = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field String zzbim>
	//    3    5:return          
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

	public final void setImages(List list)
	{
		zzbhx = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field List zzbhx>
	//    3    5:return          
	}

	public final void setLogo(com.google.android.gms.ads.formats.NativeAd.Image image)
	{
		zzdfp = image;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field com.google.android.gms.ads.formats.NativeAd$Image zzdfp>
	//    3    5:return          
	}

	private String zzbhw;
	private List zzbhx;
	private String zzbhy;
	private String zzbia;
	private String zzbim;
	private com.google.android.gms.ads.formats.NativeAd.Image zzdfp;
}
