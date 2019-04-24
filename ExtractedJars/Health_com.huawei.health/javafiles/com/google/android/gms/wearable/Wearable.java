// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.wearable.internal.zzag;
import com.google.android.gms.wearable.internal.zzah;
import com.google.android.gms.wearable.internal.zzby;
import com.google.android.gms.wearable.internal.zzcb;
import com.google.android.gms.wearable.internal.zzcu;
import com.google.android.gms.wearable.internal.zzcx;
import com.google.android.gms.wearable.internal.zzda;
import com.google.android.gms.wearable.internal.zzg;
import com.google.android.gms.wearable.internal.zzj;
import com.google.android.gms.wearable.internal.zzn;
import com.google.android.gms.wearable.internal.zzq;

// Referenced classes of package com.google.android.gms.wearable:
//			CapabilityApi, ChannelApi, DataApi, MessageApi, 
//			NodeApi, zzc, zza, zzf, 
//			zzi, zzj

public class Wearable
{
	public static final class WearableOptions
		implements com.google.android.gms.common.api.Api.ApiOptions.Optional
	{

		private WearableOptions(Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}

	public static class WearableOptions.Builder
	{

		public WearableOptions build()
		{
			return new WearableOptions(this);
		//    0    0:new             #6   <Class Wearable$WearableOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #20  <Method void Wearable$WearableOptions(Wearable$WearableOptions$Builder, Wearable$1)>
		//    5    9:areturn         
		}

		public WearableOptions.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	private Wearable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void Object()>
	//    2    4:return          
	}

	public static final Api API;
	public static final CapabilityApi CapabilityApi = new zzn();
	public static final ChannelApi ChannelApi = new zzq();
	public static final DataApi DataApi = new zzah();
	public static final MessageApi MessageApi = new zzby();
	public static final NodeApi NodeApi = new zzcb();
	public static final com.google.android.gms.common.api.Api.zzf zzaid;
	private static final com.google.android.gms.common.api.Api.zza zzaie;
	public static final zzc zzbSZ = new zzj();
	public static final zza zzbTa = new zzg();
	public static final zzf zzbTb = new zzag();
	public static final zzi zzbTc = new zzcu();
	public static final com.google.android.gms.wearable.zzj zzbTd = new zzda();

	static 
	{
	//    0    0:new             #45  <Class zzah>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void zzah()>
	//    3    7:putstatic       #50  <Field DataApi DataApi>
	//    4   10:new             #52  <Class zzn>
	//    5   13:dup             
	//    6   14:invokespecial   #53  <Method void zzn()>
	//    7   17:putstatic       #55  <Field CapabilityApi CapabilityApi>
	//    8   20:new             #57  <Class zzby>
	//    9   23:dup             
	//   10   24:invokespecial   #58  <Method void zzby()>
	//   11   27:putstatic       #60  <Field MessageApi MessageApi>
	//   12   30:new             #62  <Class zzcb>
	//   13   33:dup             
	//   14   34:invokespecial   #63  <Method void zzcb()>
	//   15   37:putstatic       #65  <Field NodeApi NodeApi>
	//   16   40:new             #67  <Class zzq>
	//   17   43:dup             
	//   18   44:invokespecial   #68  <Method void zzq()>
	//   19   47:putstatic       #70  <Field ChannelApi ChannelApi>
	//   20   50:new             #72  <Class zzj>
	//   21   53:dup             
	//   22   54:invokespecial   #73  <Method void zzj()>
	//   23   57:putstatic       #75  <Field zzc zzbSZ>
	//   24   60:new             #77  <Class zzg>
	//   25   63:dup             
	//   26   64:invokespecial   #78  <Method void zzg()>
	//   27   67:putstatic       #80  <Field zza zzbTa>
	//   28   70:new             #82  <Class zzag>
	//   29   73:dup             
	//   30   74:invokespecial   #83  <Method void zzag()>
	//   31   77:putstatic       #85  <Field zzf zzbTb>
	//   32   80:new             #87  <Class zzcu>
	//   33   83:dup             
	//   34   84:invokespecial   #88  <Method void zzcu()>
	//   35   87:putstatic       #90  <Field zzi zzbTc>
	//   36   90:new             #92  <Class zzda>
	//   37   93:dup             
	//   38   94:invokespecial   #93  <Method void zzda()>
	//   39   97:putstatic       #95  <Field com.google.android.gms.wearable.zzj zzbTd>
		zzaid = new com.google.android.gms.common.api.Api.zzf();
	//   40  100:new             #97  <Class com.google.android.gms.common.api.Api$zzf>
	//   41  103:dup             
	//   42  104:invokespecial   #98  <Method void com.google.android.gms.common.api.Api$zzf()>
	//   43  107:putstatic       #100 <Field com.google.android.gms.common.api.Api$zzf zzaid>
		zzaie = ((com.google.android.gms.common.api.Api.zza) (new com.google.android.gms.common.api.Api.zza() {

			public volatile com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg zzg1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return ((com.google.android.gms.common.api.Api.zze) (zza(context, looper, zzg1, (WearableOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:checkcast       #16  <Class Wearable$WearableOptions>
			//    6    9:aload           5
			//    7   11:aload           6
			//    8   13:invokevirtual   #19  <Method zzcx zza(Context, Looper, com.google.android.gms.common.internal.zzg, Wearable$WearableOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    9   16:areturn         
			}

			public zzcx zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg zzg1, WearableOptions wearableoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				if(wearableoptions == null)
			//*   0    0:aload           4
			//*   1    2:ifnull          8
			//*   2    5:goto            24
					new WearableOptions(new WearableOptions.Builder());
			//    3    8:new             #16  <Class Wearable$WearableOptions>
			//    4   11:dup             
			//    5   12:new             #21  <Class Wearable$WearableOptions$Builder>
			//    6   15:dup             
			//    7   16:invokespecial   #22  <Method void Wearable$WearableOptions$Builder()>
			//    8   19:aconst_null     
			//    9   20:invokespecial   #25  <Method void Wearable$WearableOptions(Wearable$WearableOptions$Builder, Wearable$1)>
			//   10   23:pop             
				return new zzcx(context, looper, connectioncallbacks, onconnectionfailedlistener, zzg1);
			//   11   24:new             #27  <Class zzcx>
			//   12   27:dup             
			//   13   28:aload_1         
			//   14   29:aload_2         
			//   15   30:aload           5
			//   16   32:aload           6
			//   17   34:aload_3         
			//   18   35:invokespecial   #30  <Method void zzcx(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, com.google.android.gms.common.internal.zzg)>
			//   19   38:areturn         
			}

		}
));
	//   44  110:new             #6   <Class Wearable$1>
	//   45  113:dup             
	//   46  114:invokespecial   #101 <Method void Wearable$1()>
	//   47  117:putstatic       #103 <Field com.google.android.gms.common.api.Api$zza zzaie>
		API = new Api("Wearable.API", zzaie, zzaid);
	//   48  120:new             #105 <Class Api>
	//   49  123:dup             
	//   50  124:ldc1            #107 <String "Wearable.API">
	//   51  126:getstatic       #103 <Field com.google.android.gms.common.api.Api$zza zzaie>
	//   52  129:getstatic       #100 <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   53  132:invokespecial   #110 <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   54  135:putstatic       #112 <Field Api API>
	//*  55  138:return          
	}
}
