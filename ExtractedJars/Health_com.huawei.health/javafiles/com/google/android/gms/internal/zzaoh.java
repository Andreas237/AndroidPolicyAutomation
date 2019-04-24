// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzaob, zzaow

public class zzaoh extends zzaob
{
	public static class zza extends com.google.android.gms.common.api.Api.zza
	{

		public com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			return ((com.google.android.gms.common.api.Api.zze) (zzl(context, looper, zzg, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:checkcast       #16  <Class com.google.android.gms.common.api.Api$ApiOptions$NoOptions>
		//    6    9:aload           5
		//    7   11:aload           6
		//    8   13:invokevirtual   #20  <Method zzaoh zzl(Context, Looper, zzg, com.google.android.gms.common.api.Api$ApiOptions$NoOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//    9   16:areturn         
		}

		public zzaoh zzl(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			return new zzaoh(context, looper, zzg, connectioncallbacks, onconnectionfailedlistener);
		//    0    0:new             #7   <Class zzaoh>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           5
		//    6    9:aload           6
		//    7   11:invokespecial   #23  <Method void zzaoh(Context, Looper, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//    8   14:areturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void com.google.android.gms.common.api.Api$zza()>
		//    2    4:return          
		}
	}


	public zzaoh(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 61, connectioncallbacks, onconnectionfailedlistener, zzg);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          61
	//    4    5:aload           4
	//    5    7:aload           5
	//    6    9:aload_3         
	//    7   10:invokespecial   #38  <Method void zzaob(Context, Looper, int, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, zzg)>
	//    8   13:return          
	}

	public zzaow zzcl(IBinder ibinder)
	{
		return zzaow.zza.zzcA(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method zzaow zzaow$zza.zzcA(IBinder)>
	//    2    4:areturn         
	}

	public String zzeA()
	{
		return "com.google.android.gms.fitness.internal.IGoogleFitInternalApi";
	//    0    0:ldc1            #49  <String "com.google.android.gms.fitness.internal.IGoogleFitInternalApi">
	//    1    2:areturn         
	}

	public String zzez()
	{
		return "com.google.android.gms.fitness.InternalApi";
	//    0    0:ldc1            #52  <String "com.google.android.gms.fitness.InternalApi">
	//    1    2:areturn         
	}

	public IInterface zzh(IBinder ibinder)
	{
		return ((IInterface) (zzcl(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method zzaow zzcl(IBinder)>
	//    3    5:areturn         
	}

	public static final Api API;
	public static final com.google.android.gms.common.api.Api.zzf zzaid;

	static 
	{
		zzaid = new com.google.android.gms.common.api.Api.zzf();
	//    0    0:new             #18  <Class com.google.android.gms.common.api.Api$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    3    7:putstatic       #23  <Field com.google.android.gms.common.api.Api$zzf zzaid>
		API = new Api("Fitness.INTERNAL_API", ((com.google.android.gms.common.api.Api.zza) (new zza())), zzaid);
	//    4   10:new             #25  <Class Api>
	//    5   13:dup             
	//    6   14:ldc1            #27  <String "Fitness.INTERNAL_API">
	//    7   16:new             #7   <Class zzaoh$zza>
	//    8   19:dup             
	//    9   20:invokespecial   #28  <Method void zzaoh$zza()>
	//   10   23:getstatic       #23  <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   11   26:invokespecial   #31  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   12   29:putstatic       #33  <Field Api API>
	//*  13   32:return          
	}
}
