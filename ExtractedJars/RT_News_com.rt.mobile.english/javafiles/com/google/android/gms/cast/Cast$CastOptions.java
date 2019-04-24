// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.cast:
//			Cast, CastDevice, zze

public static final class Cast$CastOptions
	implements com.google.android.gms.common.api.sOptions
{
	public static final class Builder
	{

		static int zza(Builder builder1)
		{
			return builder1.zzak;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int zzak>
		//    2    4:ireturn         
		}

		static Bundle zzb(Builder builder1)
		{
			return builder1.extras;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Bundle extras>
		//    2    4:areturn         
		}

		public final Cast.CastOptions build()
		{
			return new Cast.CastOptions(this, ((zze) (null)));
		//    0    0:new             #6   <Class Cast$CastOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #51  <Method void Cast$CastOptions(Cast$CastOptions$Builder, zze)>
		//    5    9:areturn         
		}

		public final Builder setVerboseLoggingEnabled(boolean flag)
		{
			int i;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            18
				i = zzak | 1;
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field int zzak>
		//    4    8:iconst_1        
		//    5    9:ior             
		//    6   10:istore_2        
			else
		//*   7   11:aload_0         
		//*   8   12:iload_2         
		//*   9   13:putfield        #39  <Field int zzak>
		//*  10   16:aload_0         
		//*  11   17:areturn         
				i = zzak & -2;
		//   12   18:aload_0         
		//   13   19:getfield        #39  <Field int zzak>
		//   14   22:bipush          -2
		//   15   24:iand            
		//   16   25:istore_2        
			zzak = i;
			return this;
		//*  17   26:goto            11
		}

		public final Builder zza(Bundle bundle)
		{
			extras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field Bundle extras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Bundle extras;
		CastDevice zzai;
		Cast.Listener zzaj;
		private int zzak;

		public Builder(CastDevice castdevice, Cast.Listener listener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			Preconditions.checkNotNull(((Object) (castdevice)), "CastDevice parameter cannot be null");
		//    2    4:aload_1         
		//    3    5:ldc1            #25  <String "CastDevice parameter cannot be null">
		//    4    7:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    5   10:pop             
			Preconditions.checkNotNull(((Object) (listener)), "CastListener parameter cannot be null");
		//    6   11:aload_2         
		//    7   12:ldc1            #33  <String "CastListener parameter cannot be null">
		//    8   14:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    9   17:pop             
			zzai = castdevice;
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:putfield        #35  <Field CastDevice zzai>
			zzaj = listener;
		//   13   23:aload_0         
		//   14   24:aload_2         
		//   15   25:putfield        #37  <Field Cast$Listener zzaj>
			zzak = 0;
		//   16   28:aload_0         
		//   17   29:iconst_0        
		//   18   30:putfield        #39  <Field int zzak>
		//   19   33:return          
		}
	}


	public static Builder builder(CastDevice castdevice, Cast.Listener listener)
	{
		return new Builder(castdevice, listener);
	//    0    0:new             #11  <Class Cast$CastOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #53  <Method void Cast$CastOptions$Builder(CastDevice, Cast$Listener)>
	//    5    9:areturn         
	}

	static int zza(Cast$CastOptions cast$castoptions)
	{
		return cast$castoptions.zzak;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzak>
	//    2    4:ireturn         
	}

	final Bundle extras;
	final CastDevice zzai;
	final Cast.Listener zzaj;
	private final int zzak;

	private Cast$CastOptions(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzai = builder1.zzai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #27  <Field CastDevice Cast$CastOptions$Builder.zzai>
	//    5    9:putfield        #28  <Field CastDevice zzai>
		zzaj = builder1.zzaj;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #30  <Field Cast$Listener Cast$CastOptions$Builder.zzaj>
	//    9   17:putfield        #31  <Field Cast$Listener zzaj>
		zzak = Builder.zza(builder1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #35  <Method int Cast$CastOptions$Builder.zza(Cast$CastOptions$Builder)>
	//   13   25:putfield        #37  <Field int zzak>
		extras = Builder.zzb(builder1);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #41  <Method Bundle Cast$CastOptions$Builder.zzb(Cast$CastOptions$Builder)>
	//   17   33:putfield        #43  <Field Bundle extras>
	//   18   36:return          
	}

	Cast$CastOptions(Builder builder1, zze zze)
	{
		this(builder1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void Cast$CastOptions(Cast$CastOptions$Builder)>
	//    3    5:return          
	}
}
