// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzabz, zzaby, zzacb

public final class zzabx
{

	public static final Api API;
	public static final zzaby zzaFp = new zzabz();
	public static final com.google.android.gms.common.api.Api.zzf zzahc;
	private static final com.google.android.gms.common.api.Api.zza zzahd;

	static 
	{
		zzahc = new com.google.android.gms.common.api.Api.zzf();
	//    0    0:new             #21  <Class com.google.android.gms.common.api.Api$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    3    7:putstatic       #26  <Field com.google.android.gms.common.api.Api$zzf zzahc>
		zzahd = ((com.google.android.gms.common.api.Api.zza) (new com.google.android.gms.common.api.Api.zza() {

			public com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return ((com.google.android.gms.common.api.Api.zze) (zzf(context, looper, zzg, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:checkcast       #16  <Class com.google.android.gms.common.api.Api$ApiOptions$NoOptions>
			//    6    9:aload           5
			//    7   11:aload           6
			//    8   13:invokevirtual   #20  <Method zzacb zzf(Context, Looper, zzg, com.google.android.gms.common.api.Api$ApiOptions$NoOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    9   16:areturn         
			}

			public zzacb zzf(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return new zzacb(context, looper, zzg, connectioncallbacks, onconnectionfailedlistener);
			//    0    0:new             #22  <Class zzacb>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:aload           5
			//    6    9:aload           6
			//    7   11:invokespecial   #25  <Method void zzacb(Context, Looper, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    8   14:areturn         
			}

		}
));
	//    4   10:new             #6   <Class zzabx$1>
	//    5   13:dup             
	//    6   14:invokespecial   #27  <Method void zzabx$1()>
	//    7   17:putstatic       #29  <Field com.google.android.gms.common.api.Api$zza zzahd>
		API = new Api("Common.API", zzahd, zzahc);
	//    8   20:new             #31  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #33  <String "Common.API">
	//   11   26:getstatic       #29  <Field com.google.android.gms.common.api.Api$zza zzahd>
	//   12   29:getstatic       #26  <Field com.google.android.gms.common.api.Api$zzf zzahc>
	//   13   32:invokespecial   #36  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   14   35:putstatic       #38  <Field Api API>
	//   15   38:new             #40  <Class zzabz>
	//   16   41:dup             
	//   17   42:invokespecial   #41  <Method void zzabz()>
	//   18   45:putstatic       #43  <Field zzaby zzaFp>
	//*  19   48:return          
	}
}
