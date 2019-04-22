// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.ads.formats:
//			zza

public final class NativeAdOptions
{
	public static interface AdChoicesPlacement
		extends Annotation
	{
	}

	public static final class Builder
	{

		static boolean zza(Builder builder)
		{
			return builder.zzvc;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field boolean zzvc>
		//    2    4:ireturn         
		}

		static int zzb(Builder builder)
		{
			return builder.zzvd;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int zzvd>
		//    2    4:ireturn         
		}

		static boolean zzc(Builder builder)
		{
			return builder.zzve;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field boolean zzve>
		//    2    4:ireturn         
		}

		static int zzd(Builder builder)
		{
			return builder.zzvf;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int zzvf>
		//    2    4:ireturn         
		}

		static VideoOptions zze(Builder builder)
		{
			return builder.zzvg;
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

		public final Builder setAdChoicesPlacement(int i)
		{
			zzvf = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #27  <Field int zzvf>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setImageOrientation(int i)
		{
			zzvd = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #23  <Field int zzvd>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setRequestMultipleImages(boolean flag)
		{
			zzve = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #25  <Field boolean zzve>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setReturnUrlsForImageAssets(boolean flag)
		{
			zzvc = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #21  <Field boolean zzvc>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setVideoOptions(VideoOptions videooptions)
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

		public Builder()
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


	private NativeAdOptions(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzvc = Builder.zza(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #39  <Method boolean NativeAdOptions$Builder.zza(NativeAdOptions$Builder)>
	//    5    9:putfield        #41  <Field boolean zzvc>
		zzvd = Builder.zzb(builder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #45  <Method int NativeAdOptions$Builder.zzb(NativeAdOptions$Builder)>
	//    9   17:putfield        #47  <Field int zzvd>
		zzve = Builder.zzc(builder);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #50  <Method boolean NativeAdOptions$Builder.zzc(NativeAdOptions$Builder)>
	//   13   25:putfield        #52  <Field boolean zzve>
		zzvf = Builder.zzd(builder);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #55  <Method int NativeAdOptions$Builder.zzd(NativeAdOptions$Builder)>
	//   17   33:putfield        #57  <Field int zzvf>
		zzvg = Builder.zze(builder);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #61  <Method VideoOptions NativeAdOptions$Builder.zze(NativeAdOptions$Builder)>
	//   21   41:putfield        #63  <Field VideoOptions zzvg>
	//   22   44:return          
	}

	NativeAdOptions(Builder builder, zza zza)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void NativeAdOptions(NativeAdOptions$Builder)>
	//    3    5:return          
	}

	public final int getAdChoicesPlacement()
	{
		return zzvf;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int zzvf>
	//    2    4:ireturn         
	}

	public final int getImageOrientation()
	{
		return zzvd;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int zzvd>
	//    2    4:ireturn         
	}

	public final VideoOptions getVideoOptions()
	{
		return zzvg;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field VideoOptions zzvg>
	//    2    4:areturn         
	}

	public final boolean shouldRequestMultipleImages()
	{
		return zzve;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean zzve>
	//    2    4:ireturn         
	}

	public final boolean shouldReturnUrlsForImageAssets()
	{
		return zzvc;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean zzvc>
	//    2    4:ireturn         
	}

	public static final int ADCHOICES_BOTTOM_LEFT = 3;
	public static final int ADCHOICES_BOTTOM_RIGHT = 2;
	public static final int ADCHOICES_TOP_LEFT = 0;
	public static final int ADCHOICES_TOP_RIGHT = 1;
	public static final int ORIENTATION_ANY = 0;
	public static final int ORIENTATION_LANDSCAPE = 2;
	public static final int ORIENTATION_PORTRAIT = 1;
	private final boolean zzvc;
	private final int zzvd;
	private final boolean zzve;
	private final int zzvf;
	private final VideoOptions zzvg;
}
