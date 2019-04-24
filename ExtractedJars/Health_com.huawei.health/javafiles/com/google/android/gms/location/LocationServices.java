// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.*;

// Referenced classes of package com.google.android.gms.location:
//			FusedLocationProviderApi, GeofencingApi, SettingsApi

public class LocationServices
{
	public static abstract class zza extends com.google.android.gms.internal.zzaad.zza
	{

		public void setResult(Object obj)
		{
			super.zzb((Result)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Result>
		//    3    5:invokespecial   #26  <Method void com.google.android.gms.internal.zzaad$zza.zzb(Result)>
		//    4    8:return          
		}

		public zza(GoogleApiClient googleapiclient)
		{
			super(LocationServices.API, googleapiclient);
		//    0    0:aload_0         
		//    1    1:getstatic       #14  <Field Api LocationServices.API>
		//    2    4:aload_1         
		//    3    5:invokespecial   #17  <Method void com.google.android.gms.internal.zzaad$zza(Api, GoogleApiClient)>
		//    4    8:return          
		}
	}


	private LocationServices()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:return          
	}

	public static zzash zzj(GoogleApiClient googleapiclient)
	{
		boolean flag;
		if(googleapiclient != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_1        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		zzac.zzb(flag, "GoogleApiClient parameter is required.");
	//    7   11:iload_1         
	//    8   12:ldc1            #66  <String "GoogleApiClient parameter is required.">
	//    9   14:invokestatic    #72  <Method void zzac.zzb(boolean, Object)>
		googleapiclient = ((GoogleApiClient) ((zzash)googleapiclient.zza(((com.google.android.gms.common.api.Api.zzc) (zzaid)))));
	//   10   17:aload_0         
	//   11   18:getstatic       #33  <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   12   21:invokevirtual   #77  <Method com.google.android.gms.common.api.Api$zze GoogleApiClient.zza(com.google.android.gms.common.api.Api$zzc)>
	//   13   24:checkcast       #79  <Class zzash>
	//   14   27:astore_0        
		if(googleapiclient != null)
	//*  15   28:aload_0         
	//*  16   29:ifnull          37
			flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_1        
		else
	//*  19   34:goto            39
			flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_1        
		zzac.zza(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
	//   22   39:iload_1         
	//   23   40:ldc1            #81  <String "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.">
	//   24   42:invokestatic    #83  <Method void zzac.zza(boolean, Object)>
		return ((zzash) (googleapiclient));
	//   25   45:aload_0         
	//   26   46:areturn         
	}

	public static final Api API;
	public static final FusedLocationProviderApi FusedLocationApi = new zzary();
	public static final GeofencingApi GeofencingApi = new zzasb();
	public static final SettingsApi SettingsApi = new zzasp();
	private static final com.google.android.gms.common.api.Api.zzf zzaid;
	private static final com.google.android.gms.common.api.Api.zza zzaie;

	static 
	{
		zzaid = new com.google.android.gms.common.api.Api.zzf();
	//    0    0:new             #28  <Class com.google.android.gms.common.api.Api$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    3    7:putstatic       #33  <Field com.google.android.gms.common.api.Api$zzf zzaid>
		zzaie = ((com.google.android.gms.common.api.Api.zza) (new com.google.android.gms.common.api.Api.zza() {

			public com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return ((com.google.android.gms.common.api.Api.zze) (zzq(context, looper, zzg, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:checkcast       #16  <Class com.google.android.gms.common.api.Api$ApiOptions$NoOptions>
			//    6    9:aload           5
			//    7   11:aload           6
			//    8   13:invokevirtual   #20  <Method zzash zzq(Context, Looper, zzg, com.google.android.gms.common.api.Api$ApiOptions$NoOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    9   16:areturn         
			}

			public zzash zzq(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return new zzash(context, looper, connectioncallbacks, onconnectionfailedlistener, "locationServices", zzg);
			//    0    0:new             #22  <Class zzash>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload           5
			//    5    8:aload           6
			//    6   10:ldc1            #24  <String "locationServices">
			//    7   12:aload_3         
			//    8   13:invokespecial   #27  <Method void zzash(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, String, zzg)>
			//    9   16:areturn         
			}

		}
));
	//    4   10:new             #6   <Class LocationServices$1>
	//    5   13:dup             
	//    6   14:invokespecial   #34  <Method void LocationServices$1()>
	//    7   17:putstatic       #36  <Field com.google.android.gms.common.api.Api$zza zzaie>
		API = new Api("LocationServices.API", zzaie, zzaid);
	//    8   20:new             #38  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #40  <String "LocationServices.API">
	//   11   26:getstatic       #36  <Field com.google.android.gms.common.api.Api$zza zzaie>
	//   12   29:getstatic       #33  <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   13   32:invokespecial   #43  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   14   35:putstatic       #45  <Field Api API>
	//   15   38:new             #47  <Class zzary>
	//   16   41:dup             
	//   17   42:invokespecial   #48  <Method void zzary()>
	//   18   45:putstatic       #50  <Field FusedLocationProviderApi FusedLocationApi>
	//   19   48:new             #52  <Class zzasb>
	//   20   51:dup             
	//   21   52:invokespecial   #53  <Method void zzasb()>
	//   22   55:putstatic       #55  <Field GeofencingApi GeofencingApi>
	//   23   58:new             #57  <Class zzasp>
	//   24   61:dup             
	//   25   62:invokespecial   #58  <Method void zzasp()>
	//   26   65:putstatic       #60  <Field SettingsApi SettingsApi>
	//*  27   68:return          
	}
}
