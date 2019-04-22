// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzmu;

// Referenced classes of package com.google.android.gms.ads:
//			zzc

public final class VideoOptions
{
	public static final class Builder
	{

		static boolean zza(Builder builder)
		{
			return builder.zzuz;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field boolean zzuz>
		//    2    4:ireturn         
		}

		static boolean zzb(Builder builder)
		{
			return builder.zzva;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field boolean zzva>
		//    2    4:ireturn         
		}

		static boolean zzc(Builder builder)
		{
			return builder.zzvb;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field boolean zzvb>
		//    2    4:ireturn         
		}

		public final VideoOptions build()
		{
			return new VideoOptions(this, ((zzc) (null)));
		//    0    0:new             #6   <Class VideoOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #31  <Method void VideoOptions(VideoOptions$Builder, zzc)>
		//    5    9:areturn         
		}

		public final Builder setClickToExpandRequested(boolean flag)
		{
			zzvb = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #21  <Field boolean zzvb>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setCustomControlsRequested(boolean flag)
		{
			zzva = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #19  <Field boolean zzva>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setStartMuted(boolean flag)
		{
			zzuz = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #17  <Field boolean zzuz>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean zzuz;
		private boolean zzva;
		private boolean zzvb;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			zzuz = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #17  <Field boolean zzuz>
			zzva = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #19  <Field boolean zzva>
			zzvb = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #21  <Field boolean zzvb>
		//   11   19:return          
		}
	}


	private VideoOptions(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzuz = Builder.zza(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method boolean VideoOptions$Builder.zza(VideoOptions$Builder)>
	//    5    9:putfield        #23  <Field boolean zzuz>
		zzva = Builder.zzb(builder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #26  <Method boolean VideoOptions$Builder.zzb(VideoOptions$Builder)>
	//    9   17:putfield        #28  <Field boolean zzva>
		zzvb = Builder.zzc(builder);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #31  <Method boolean VideoOptions$Builder.zzc(VideoOptions$Builder)>
	//   13   25:putfield        #33  <Field boolean zzvb>
	//   14   28:return          
	}

	VideoOptions(Builder builder, zzc zzc)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void VideoOptions(VideoOptions$Builder)>
	//    3    5:return          
	}

	public VideoOptions(zzmu zzmu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzuz = zzmu1.zzato;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #43  <Field boolean zzmu.zzato>
	//    5    9:putfield        #23  <Field boolean zzuz>
		zzva = zzmu1.zzatp;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #46  <Field boolean zzmu.zzatp>
	//    9   17:putfield        #28  <Field boolean zzva>
		zzvb = zzmu1.zzatq;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #49  <Field boolean zzmu.zzatq>
	//   13   25:putfield        #33  <Field boolean zzvb>
	//   14   28:return          
	}

	public final boolean getClickToExpandRequested()
	{
		return zzvb;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean zzvb>
	//    2    4:ireturn         
	}

	public final boolean getCustomControlsRequested()
	{
		return zzva;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean zzva>
	//    2    4:ireturn         
	}

	public final boolean getStartMuted()
	{
		return zzuz;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean zzuz>
	//    2    4:ireturn         
	}

	private final boolean zzuz;
	private final boolean zzva;
	private final boolean zzvb;
}
