// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzbaj, zzbat

public final class zzbah
{
	public static class zza
		implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
	{

		public Bundle zzPI()
		{
			return zzbEh;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Bundle zzbEh>
		//    2    4:areturn         
		}

		private final Bundle zzbEh;
	}


	public static final Api API;
	public static final Api zzaKN;
	public static final com.google.android.gms.common.api.Api.zzf zzaid;
	public static final com.google.android.gms.common.api.Api.zza zzaie;
	public static final Scope zzakh = new Scope("profile");
	public static final Scope zzaki = new Scope("email");
	public static final com.google.android.gms.common.api.Api.zzf zzbEf;
	static final com.google.android.gms.common.api.Api.zza zzbEg;

	static 
	{
		zzaid = new com.google.android.gms.common.api.Api.zzf();
	//    0    0:new             #32  <Class com.google.android.gms.common.api.Api$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    3    7:putstatic       #37  <Field com.google.android.gms.common.api.Api$zzf zzaid>
		zzbEf = new com.google.android.gms.common.api.Api.zzf();
	//    4   10:new             #32  <Class com.google.android.gms.common.api.Api$zzf>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    7   17:putstatic       #39  <Field com.google.android.gms.common.api.Api$zzf zzbEf>
		zzaie = ((com.google.android.gms.common.api.Api.zza) (new com.google.android.gms.common.api.Api.zza() {

			public volatile com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return ((com.google.android.gms.common.api.Api.zze) (zza(context, looper, zzg, (zzbaj)obj, connectioncallbacks, onconnectionfailedlistener)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:checkcast       #16  <Class zzbaj>
			//    6    9:aload           5
			//    7   11:aload           6
			//    8   13:invokevirtual   #19  <Method zzbat zza(Context, Looper, zzg, zzbaj, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    9   16:areturn         
			}

			public zzbat zza(Context context, Looper looper, zzg zzg, zzbaj zzbaj1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				zzbaj zzbaj2 = zzbaj1;
			//    0    0:aload           4
			//    1    2:astore          7
				if(zzbaj1 == null)
			//*   2    4:aload           4
			//*   3    6:ifnonnull       14
					zzbaj2 = zzbaj.zzbEi;
			//    4    9:getstatic       #23  <Field zzbaj zzbaj.zzbEi>
			//    5   12:astore          7
				return new zzbat(context, looper, true, zzg, zzbaj2, connectioncallbacks, onconnectionfailedlistener);
			//    6   14:new             #25  <Class zzbat>
			//    7   17:dup             
			//    8   18:aload_1         
			//    9   19:aload_2         
			//   10   20:iconst_1        
			//   11   21:aload_3         
			//   12   22:aload           7
			//   13   24:aload           5
			//   14   26:aload           6
			//   15   28:invokespecial   #28  <Method void zzbat(Context, Looper, boolean, zzg, zzbaj, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//   16   31:areturn         
			}

		}
));
	//    8   20:new             #6   <Class zzbah$1>
	//    9   23:dup             
	//   10   24:invokespecial   #40  <Method void zzbah$1()>
	//   11   27:putstatic       #42  <Field com.google.android.gms.common.api.Api$zza zzaie>
		zzbEg = ((com.google.android.gms.common.api.Api.zza) (new com.google.android.gms.common.api.Api.zza() {

			public volatile com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return ((com.google.android.gms.common.api.Api.zze) (zza(context, looper, zzg, (zza)obj, connectioncallbacks, onconnectionfailedlistener)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:checkcast       #16  <Class zzbah$zza>
			//    6    9:aload           5
			//    7   11:aload           6
			//    8   13:invokevirtual   #19  <Method zzbat zza(Context, Looper, zzg, zzbah$zza, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    9   16:areturn         
			}

			public zzbat zza(Context context, Looper looper, zzg zzg, zza zza1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return new zzbat(context, looper, false, zzg, zza1.zzPI(), connectioncallbacks, onconnectionfailedlistener);
			//    0    0:new             #21  <Class zzbat>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:iconst_0        
			//    5    7:aload_3         
			//    6    8:aload           4
			//    7   10:invokevirtual   #25  <Method Bundle zzbah$zza.zzPI()>
			//    8   13:aload           5
			//    9   15:aload           6
			//   10   17:invokespecial   #28  <Method void zzbat(Context, Looper, boolean, zzg, Bundle, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//   11   20:areturn         
			}

		}
));
	//   12   30:new             #8   <Class zzbah$2>
	//   13   33:dup             
	//   14   34:invokespecial   #43  <Method void zzbah$2()>
	//   15   37:putstatic       #45  <Field com.google.android.gms.common.api.Api$zza zzbEg>
	//   16   40:new             #47  <Class Scope>
	//   17   43:dup             
	//   18   44:ldc1            #49  <String "profile">
	//   19   46:invokespecial   #52  <Method void Scope(String)>
	//   20   49:putstatic       #54  <Field Scope zzakh>
	//   21   52:new             #47  <Class Scope>
	//   22   55:dup             
	//   23   56:ldc1            #56  <String "email">
	//   24   58:invokespecial   #52  <Method void Scope(String)>
	//   25   61:putstatic       #58  <Field Scope zzaki>
		API = new Api("SignIn.API", zzaie, zzaid);
	//   26   64:new             #60  <Class Api>
	//   27   67:dup             
	//   28   68:ldc1            #62  <String "SignIn.API">
	//   29   70:getstatic       #42  <Field com.google.android.gms.common.api.Api$zza zzaie>
	//   30   73:getstatic       #37  <Field com.google.android.gms.common.api.Api$zzf zzaid>
	//   31   76:invokespecial   #65  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   32   79:putstatic       #67  <Field Api API>
		zzaKN = new Api("SignIn.INTERNAL_API", zzbEg, zzbEf);
	//   33   82:new             #60  <Class Api>
	//   34   85:dup             
	//   35   86:ldc1            #69  <String "SignIn.INTERNAL_API">
	//   36   88:getstatic       #45  <Field com.google.android.gms.common.api.Api$zza zzbEg>
	//   37   91:getstatic       #39  <Field com.google.android.gms.common.api.Api$zzf zzbEf>
	//   38   94:invokespecial   #65  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   39   97:putstatic       #71  <Field Api zzaKN>
	//*  40  100:return          
	}
}
