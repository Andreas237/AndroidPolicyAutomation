// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zzaru;
import com.google.android.gms.internal.zzash;

// Referenced classes of package com.google.android.gms.location:
//			ActivityRecognitionApi

public class ActivityRecognition
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
			super(ActivityRecognition.API, googleapiclient);
		//    0    0:aload_0         
		//    1    1:getstatic       #14  <Field Api ActivityRecognition.API>
		//    2    4:aload_1         
		//    3    5:invokespecial   #17  <Method void com.google.android.gms.internal.zzaad$zza(Api, GoogleApiClient)>
		//    4    8:return          
		}
	}


	private ActivityRecognition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static final Api API;
	public static final ActivityRecognitionApi ActivityRecognitionApi = new zzaru();
	public static final String CLIENT_NAME = "activity_recognition";
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
				return new zzash(context, looper, connectioncallbacks, onconnectionfailedlistener, "activity_recognition");
			//    0    0:new             #22  <Class zzash>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload           5
			//    5    8:aload           6
			//    6   10:ldc1            #24  <String "activity_recognition">
			//    7   12:invokespecial   #27  <Method void zzash(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, String)>
			//    8   15:areturn         
			}

		}
));
	//    4   10:new             #6   <Class ActivityRecognition$1>
	//    5   13:dup             
	//    6   14:invokespecial   #34  <Method void ActivityRecognition$1()>
	//    7   17:putstatic       #36  <Field com.google.android.gms.common.api.Api$zza zzaie>
		API = new Api("ActivityRecognition.API", zzaie, zzaid);
	//    8   20:new             #38  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #40  <String "ActivityRecognition.API">
	//   11   26:getstatic       #36  <Field com.google.android.gms.common.api.Api$zza zzaie>
	//   12   29:getstatic       #33  <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   13   32:invokespecial   #43  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   14   35:putstatic       #45  <Field Api API>
	//   15   38:new             #47  <Class zzaru>
	//   16   41:dup             
	//   17   42:invokespecial   #48  <Method void zzaru()>
	//   18   45:putstatic       #50  <Field ActivityRecognitionApi ActivityRecognitionApi>
	//*  19   48:return          
	}
}
