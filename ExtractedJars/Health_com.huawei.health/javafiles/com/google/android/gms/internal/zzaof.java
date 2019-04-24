// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzaob, zzaou

public class zzaof extends zzaob
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
			super(zzaof.API, googleapiclient);
		//    0    0:aload_0         
		//    1    1:getstatic       #14  <Field Api zzaof.API>
		//    2    4:aload_1         
		//    3    5:invokespecial   #17  <Method void zzaad$zza(Api, GoogleApiClient)>
		//    4    8:return          
		}
	}

	public static class zzb extends com.google.android.gms.common.api.Api.zza
	{

		public com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			return ((com.google.android.gms.common.api.Api.zze) (zzj(context, looper, zzg, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:checkcast       #17  <Class com.google.android.gms.common.api.Api$ApiOptions$NoOptions>
		//    6    9:aload           5
		//    7   11:aload           6
		//    8   13:invokevirtual   #21  <Method zzaof zzj(Context, Looper, zzg, com.google.android.gms.common.api.Api$ApiOptions$NoOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//    9   16:areturn         
		}

		public zzaof zzj(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			return new zzaof(context, looper, zzg, connectioncallbacks, onconnectionfailedlistener);
		//    0    0:new             #7   <Class zzaof>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           5
		//    6    9:aload           6
		//    7   11:invokespecial   #24  <Method void zzaof(Context, Looper, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//    8   14:areturn         
		}

		public zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void com.google.android.gms.common.api.Api$zza()>
		//    2    4:return          
		}
	}


	public zzaof(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 125, connectioncallbacks, onconnectionfailedlistener, zzg);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          125
	//    4    5:aload           4
	//    5    7:aload           5
	//    6    9:aload_3         
	//    7   10:invokespecial   #41  <Method void zzaob(Context, Looper, int, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, zzg)>
	//    8   13:return          
	}

	public zzaou zzcj(IBinder ibinder)
	{
		return zzaou.zza.zzcy(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method zzaou zzaou$zza.zzcy(IBinder)>
	//    2    4:areturn         
	}

	public String zzeA()
	{
		return "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi";
	//    0    0:ldc1            #52  <String "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi">
	//    1    2:areturn         
	}

	public String zzez()
	{
		return "com.google.android.gms.fitness.GoalsApi";
	//    0    0:ldc1            #55  <String "com.google.android.gms.fitness.GoalsApi">
	//    1    2:areturn         
	}

	public IInterface zzh(IBinder ibinder)
	{
		return ((IInterface) (zzcj(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method zzaou zzcj(IBinder)>
	//    3    5:areturn         
	}

	public static final Api API;
	public static final com.google.android.gms.common.api.Api.zzf zzaid;

	static 
	{
		zzaid = new com.google.android.gms.common.api.Api.zzf();
	//    0    0:new             #21  <Class com.google.android.gms.common.api.Api$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    3    7:putstatic       #26  <Field com.google.android.gms.common.api.Api$zzf zzaid>
		API = new Api("Fitness.GOALS_API", ((com.google.android.gms.common.api.Api.zza) (new zzb())), zzaid);
	//    4   10:new             #28  <Class Api>
	//    5   13:dup             
	//    6   14:ldc1            #30  <String "Fitness.GOALS_API">
	//    7   16:new             #10  <Class zzaof$zzb>
	//    8   19:dup             
	//    9   20:invokespecial   #31  <Method void zzaof$zzb()>
	//   10   23:getstatic       #26  <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   11   26:invokespecial   #34  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   12   29:putstatic       #36  <Field Api API>
	//*  13   32:return          
	}
}
