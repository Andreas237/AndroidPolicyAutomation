// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzaob, zzaov

public class zzaog extends zzaob
{
	static abstract class zza extends zzaad.zza
	{

		public void setResult(Object obj)
		{
			super.zzb((Result)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Result>
		//    3    5:invokespecial   #26  <Method void zzaad$zza.zzb(Result)>
		//    4    8:return          
		}

		public zza(GoogleApiClient googleapiclient)
		{
			super(zzaog.API, googleapiclient);
		//    0    0:aload_0         
		//    1    1:getstatic       #14  <Field Api zzaog.API>
		//    2    4:aload_1         
		//    3    5:invokespecial   #17  <Method void zzaad$zza(Api, GoogleApiClient)>
		//    4    8:return          
		}
	}

	public static class zzb extends com.google.android.gms.common.api.Api.zza
	{

		public com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			return ((com.google.android.gms.common.api.Api.zze) (zzk(context, looper, zzg, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:checkcast       #17  <Class com.google.android.gms.common.api.Api$ApiOptions$NoOptions>
		//    6    9:aload           5
		//    7   11:aload           6
		//    8   13:invokevirtual   #21  <Method zzaog zzk(Context, Looper, zzg, com.google.android.gms.common.api.Api$ApiOptions$NoOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//    9   16:areturn         
		}

		public zzaog zzk(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			return new zzaog(context, looper, zzg, connectioncallbacks, onconnectionfailedlistener);
		//    0    0:new             #7   <Class zzaog>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           5
		//    6    9:aload           6
		//    7   11:invokespecial   #24  <Method void zzaog(Context, Looper, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//    8   14:areturn         
		}

		public zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void com.google.android.gms.common.api.Api$zza()>
		//    2    4:return          
		}
	}

	static abstract class zzc extends zza
	{

		protected Status zzb(Status status)
		{
			boolean flag;
			if(!status.isSuccess())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #21  <Method boolean Status.isSuccess()>
		//*   2    4:ifne            12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_2        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_2        
			zzac.zzax(flag);
		//    8   14:iload_2         
		//    9   15:invokestatic    #27  <Method void zzac.zzax(boolean)>
			return status;
		//   10   18:aload_1         
		//   11   19:areturn         
		}

		protected Result zzc(Status status)
		{
			return ((Result) (zzb(status)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #30  <Method Status zzb(Status)>
		//    3    5:areturn         
		}

		zzc(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzaog$zza(GoogleApiClient)>
		//    3    5:return          
		}
	}


	public zzaog(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 57, connectioncallbacks, onconnectionfailedlistener, zzg);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          57
	//    4    5:aload           4
	//    5    7:aload           5
	//    6    9:aload_3         
	//    7   10:invokespecial   #44  <Method void zzaob(Context, Looper, int, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, zzg)>
	//    8   13:return          
	}

	public zzaov zzck(IBinder ibinder)
	{
		return zzaov.zza.zzcz(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method zzaov zzaov$zza.zzcz(IBinder)>
	//    2    4:areturn         
	}

	public String zzeA()
	{
		return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
	//    0    0:ldc1            #55  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
	//    1    2:areturn         
	}

	public String zzez()
	{
		return "com.google.android.gms.fitness.HistoryApi";
	//    0    0:ldc1            #58  <String "com.google.android.gms.fitness.HistoryApi">
	//    1    2:areturn         
	}

	public IInterface zzh(IBinder ibinder)
	{
		return ((IInterface) (zzck(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method zzaov zzck(IBinder)>
	//    3    5:areturn         
	}

	public static final Api API;
	public static final com.google.android.gms.common.api.Api.zzf zzaid;

	static 
	{
		zzaid = new com.google.android.gms.common.api.Api.zzf();
	//    0    0:new             #24  <Class com.google.android.gms.common.api.Api$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    3    7:putstatic       #29  <Field com.google.android.gms.common.api.Api$zzf zzaid>
		API = new Api("Fitness.API", ((com.google.android.gms.common.api.Api.zza) (new zzb())), zzaid);
	//    4   10:new             #31  <Class Api>
	//    5   13:dup             
	//    6   14:ldc1            #33  <String "Fitness.API">
	//    7   16:new             #10  <Class zzaog$zzb>
	//    8   19:dup             
	//    9   20:invokespecial   #34  <Method void zzaog$zzb()>
	//   10   23:getstatic       #29  <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   11   26:invokespecial   #37  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   12   29:putstatic       #39  <Field Api API>
	//*  13   32:return          
	}
}
