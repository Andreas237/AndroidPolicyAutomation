// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zze;

// Referenced classes of package com.google.android.gms.location:
//			zza, ActivityRecognitionClient, ActivityRecognitionApi

public class ActivityRecognition
{
	public static abstract class zza extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
	{

		public zza(GoogleApiClient googleapiclient)
		{
			super(ActivityRecognition.API, googleapiclient);
		//    0    0:aload_0         
		//    1    1:getstatic       #14  <Field Api ActivityRecognition.API>
		//    2    4:aload_1         
		//    3    5:invokespecial   #17  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(Api, GoogleApiClient)>
		//    4    8:return          
		}
	}


	private ActivityRecognition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:return          
	}

	public static ActivityRecognitionClient getClient(Activity activity)
	{
		return new ActivityRecognitionClient(activity);
	//    0    0:new             #57  <Class ActivityRecognitionClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #60  <Method void ActivityRecognitionClient(Activity)>
	//    4    8:areturn         
	}

	public static ActivityRecognitionClient getClient(Context context)
	{
		return new ActivityRecognitionClient(context);
	//    0    0:new             #57  <Class ActivityRecognitionClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #64  <Method void ActivityRecognitionClient(Context)>
	//    4    8:areturn         
	}

	public static final Api API;
	public static final ActivityRecognitionApi ActivityRecognitionApi = new zze();
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	private static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
	public static final String CLIENT_NAME = "activity_recognition";

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #27  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #32  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new com.google.android.gms.location.zza()));
	//    4   10:new             #34  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void zza()>
	//    7   17:putstatic       #37  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("ActivityRecognition.API", CLIENT_BUILDER, CLIENT_KEY);
	//    8   20:new             #39  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #41  <String "ActivityRecognition.API">
	//   11   26:getstatic       #37  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//   12   29:getstatic       #32  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #44  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #46  <Field Api API>
	//   15   38:new             #48  <Class zze>
	//   16   41:dup             
	//   17   42:invokespecial   #49  <Method void zze()>
	//   18   45:putstatic       #51  <Field ActivityRecognitionApi ActivityRecognitionApi>
	//*  19   48:return          
	}
}
