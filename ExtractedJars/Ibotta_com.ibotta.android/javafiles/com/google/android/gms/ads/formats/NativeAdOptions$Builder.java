// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

// Referenced classes of package com.google.android.gms.ads.formats:
//			NativeAdOptions

public static final class NativeAdOptions$Builder
{

	static boolean zza(NativeAdOptions$Builder nativeadoptions$builder)
	{
		return nativeadoptions$builder.zzvc;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean zzvc>
	//    2    4:ireturn         
	}

	static int zzb(NativeAdOptions$Builder nativeadoptions$builder)
	{
		return nativeadoptions$builder.zzvd;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int zzvd>
	//    2    4:ireturn         
	}

	static boolean zzc(NativeAdOptions$Builder nativeadoptions$builder)
	{
		return nativeadoptions$builder.zzve;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean zzve>
	//    2    4:ireturn         
	}

	static int zzd(NativeAdOptions$Builder nativeadoptions$builder)
	{
		return nativeadoptions$builder.zzvf;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int zzvf>
	//    2    4:ireturn         
	}

	static VideoOptions zze(NativeAdOptions$Builder nativeadoptions$builder)
	{
		return nativeadoptions$builder.zzvg;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field VideoOptions zzvg>
	//    2    4:areturn         
	}

	public final NativeAdOptions build()
	{
		return new NativeAdOptions(this, ((zza) (null)));
	//    0    0:new             #6   <Class NativeAdOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #43  <Method void NativeAdOptions(NativeAdOptions$Builder, zza)>
	//    5    9:areturn         
	}

	public final NativeAdOptions$Builder setAdChoicesPlacement(int i)
	{
		zzvf = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int zzvf>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final NativeAdOptions$Builder setImageOrientation(int i)
	{
		zzvd = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int zzvd>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final NativeAdOptions$Builder setRequestMultipleImages(boolean flag)
	{
		zzve = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field boolean zzve>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final NativeAdOptions$Builder setReturnUrlsForImageAssets(boolean flag)
	{
		zzvc = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field boolean zzvc>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final NativeAdOptions$Builder setVideoOptions(VideoOptions videooptions)
	{
		zzvg = videooptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field VideoOptions zzvg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean zzvc;
	private int zzvd;
	private boolean zzve;
	private int zzvf;
	private VideoOptions zzvg;

	public NativeAdOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzvc = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean zzvc>
		zzvd = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #23  <Field int zzvd>
		zzve = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field boolean zzve>
		zzvf = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #27  <Field int zzvf>
	//   14   24:return          
	}
}
