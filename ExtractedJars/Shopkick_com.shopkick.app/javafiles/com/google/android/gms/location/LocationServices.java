// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.*;

// Referenced classes of package com.google.android.gms.location:
//			zzad, FusedLocationProviderClient, GeofencingClient, SettingsClient, 
//			FusedLocationProviderApi, GeofencingApi, SettingsApi

public class LocationServices
{
	public static abstract class zza extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
	{

		public zza(GoogleApiClient googleapiclient)
		{
			super(LocationServices.API, googleapiclient);
		//    0    0:aload_0         
		//    1    1:getstatic       #14  <Field Api LocationServices.API>
		//    2    4:aload_1         
		//    3    5:invokespecial   #17  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(Api, GoogleApiClient)>
		//    4    8:return          
		}
	}


	private LocationServices()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	public static FusedLocationProviderClient getFusedLocationProviderClient(Activity activity)
	{
		return new FusedLocationProviderClient(activity);
	//    0    0:new             #68  <Class FusedLocationProviderClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #71  <Method void FusedLocationProviderClient(Activity)>
	//    4    8:areturn         
	}

	public static FusedLocationProviderClient getFusedLocationProviderClient(Context context)
	{
		return new FusedLocationProviderClient(context);
	//    0    0:new             #68  <Class FusedLocationProviderClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method void FusedLocationProviderClient(Context)>
	//    4    8:areturn         
	}

	public static GeofencingClient getGeofencingClient(Activity activity)
	{
		return new GeofencingClient(activity);
	//    0    0:new             #80  <Class GeofencingClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #81  <Method void GeofencingClient(Activity)>
	//    4    8:areturn         
	}

	public static GeofencingClient getGeofencingClient(Context context)
	{
		return new GeofencingClient(context);
	//    0    0:new             #80  <Class GeofencingClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #83  <Method void GeofencingClient(Context)>
	//    4    8:areturn         
	}

	public static SettingsClient getSettingsClient(Activity activity)
	{
		return new SettingsClient(activity);
	//    0    0:new             #87  <Class SettingsClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #88  <Method void SettingsClient(Activity)>
	//    4    8:areturn         
	}

	public static SettingsClient getSettingsClient(Context context)
	{
		return new SettingsClient(context);
	//    0    0:new             #87  <Class SettingsClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #90  <Method void SettingsClient(Context)>
	//    4    8:areturn         
	}

	public static zzaz zza(GoogleApiClient googleapiclient)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		boolean flag;
		if(googleapiclient != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_1        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		Preconditions.checkArgument(flag, "GoogleApiClient parameter is required.");
	//    9   13:iload_1         
	//   10   14:ldc1            #93  <String "GoogleApiClient parameter is required.">
	//   11   16:invokestatic    #99  <Method void Preconditions.checkArgument(boolean, Object)>
		googleapiclient = ((GoogleApiClient) ((zzaz)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (CLIENT_KEY)))));
	//   12   19:aload_0         
	//   13   20:getstatic       #32  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   14   23:invokevirtual   #105 <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
	//   15   26:checkcast       #107 <Class zzaz>
	//   16   29:astore_0        
		if(googleapiclient != null)
	//*  17   30:aload_0         
	//*  18   31:ifnull          39
			flag = flag1;
	//   19   34:iload_2         
	//   20   35:istore_1        
		else
	//*  21   36:goto            41
			flag = false;
	//   22   39:iconst_0        
	//   23   40:istore_1        
		Preconditions.checkState(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
	//   24   41:iload_1         
	//   25   42:ldc1            #109 <String "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.">
	//   26   44:invokestatic    #112 <Method void Preconditions.checkState(boolean, Object)>
		return ((zzaz) (googleapiclient));
	//   27   47:aload_0         
	//   28   48:areturn         
	}

	public static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	private static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
	public static final FusedLocationProviderApi FusedLocationApi = new zzq();
	public static final GeofencingApi GeofencingApi = new zzaf();
	public static final SettingsApi SettingsApi = new zzbk();

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #27  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #32  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzad()));
	//    4   10:new             #34  <Class zzad>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void zzad()>
	//    7   17:putstatic       #37  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("LocationServices.API", CLIENT_BUILDER, CLIENT_KEY);
	//    8   20:new             #39  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #41  <String "LocationServices.API">
	//   11   26:getstatic       #37  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//   12   29:getstatic       #32  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #44  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #46  <Field Api API>
	//   15   38:new             #48  <Class zzq>
	//   16   41:dup             
	//   17   42:invokespecial   #49  <Method void zzq()>
	//   18   45:putstatic       #51  <Field FusedLocationProviderApi FusedLocationApi>
	//   19   48:new             #53  <Class zzaf>
	//   20   51:dup             
	//   21   52:invokespecial   #54  <Method void zzaf()>
	//   22   55:putstatic       #56  <Field GeofencingApi GeofencingApi>
	//   23   58:new             #58  <Class zzbk>
	//   24   61:dup             
	//   25   62:invokespecial   #59  <Method void zzbk()>
	//   26   65:putstatic       #61  <Field SettingsApi SettingsApi>
	//*  27   68:return          
	}
}
