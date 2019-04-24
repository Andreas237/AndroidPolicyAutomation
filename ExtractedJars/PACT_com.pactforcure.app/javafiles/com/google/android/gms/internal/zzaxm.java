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
//			zzaxo, zzaxy

public final class zzaxm
{
	public static class zza
		implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
	{

		public Bundle zzOd()
		{
			return zzbCf;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Bundle zzbCf>
		//    2    4:areturn         
		}

		private final Bundle zzbCf;
	}


	public static final Api API;
	public static final Api zzaJq;
	public static final com.google.android.gms.common.api.Api.zzf zzahc;
	public static final com.google.android.gms.common.api.Api.zza zzahd;
	public static final Scope zzajd = new Scope("profile");
	public static final Scope zzaje = new Scope("email");
	public static final com.google.android.gms.common.api.Api.zzf zzbCd;
	static final com.google.android.gms.common.api.Api.zza zzbCe;

	static 
	{
		zzahc = new com.google.android.gms.common.api.Api.zzf();
	//    0    0:new             #32  <Class com.google.android.gms.common.api.Api$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    3    7:putstatic       #37  <Field com.google.android.gms.common.api.Api$zzf zzahc>
		zzbCd = new com.google.android.gms.common.api.Api.zzf();
	//    4   10:new             #32  <Class com.google.android.gms.common.api.Api$zzf>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void com.google.android.gms.common.api.Api$zzf()>
	//    7   17:putstatic       #39  <Field com.google.android.gms.common.api.Api$zzf zzbCd>
		zzahd = ((com.google.android.gms.common.api.Api.zza) (new com.google.android.gms.common.api.Api.zza() {

			public volatile com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return ((com.google.android.gms.common.api.Api.zze) (zza(context, looper, zzg, (zzaxo)obj, connectioncallbacks, onconnectionfailedlistener)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:checkcast       #16  <Class zzaxo>
			//    6    9:aload           5
			//    7   11:aload           6
			//    8   13:invokevirtual   #19  <Method zzaxy zza(Context, Looper, zzg, zzaxo, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    9   16:areturn         
			}

			public zzaxy zza(Context context, Looper looper, zzg zzg, zzaxo zzaxo1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				if(zzaxo1 == null)
			//*   0    0:aload           4
			//*   1    2:ifnonnull       28
					zzaxo1 = zzaxo.zzbCg;
			//    2    5:getstatic       #23  <Field zzaxo zzaxo.zzbCg>
			//    3    8:astore          4
				return new zzaxy(context, looper, true, zzg, zzaxo1, connectioncallbacks, onconnectionfailedlistener);
			//    4   10:new             #25  <Class zzaxy>
			//    5   13:dup             
			//    6   14:aload_1         
			//    7   15:aload_2         
			//    8   16:iconst_1        
			//    9   17:aload_3         
			//   10   18:aload           4
			//   11   20:aload           5
			//   12   22:aload           6
			//   13   24:invokespecial   #28  <Method void zzaxy(Context, Looper, boolean, zzg, zzaxo, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//   14   27:areturn         
			//*  15   28:goto            10
			}

		}
));
	//    8   20:new             #6   <Class zzaxm$1>
	//    9   23:dup             
	//   10   24:invokespecial   #40  <Method void zzaxm$1()>
	//   11   27:putstatic       #42  <Field com.google.android.gms.common.api.Api$zza zzahd>
		zzbCe = ((com.google.android.gms.common.api.Api.zza) (new com.google.android.gms.common.api.Api.zza() {

			public volatile com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return ((com.google.android.gms.common.api.Api.zze) (zza(context, looper, zzg, (zza)obj, connectioncallbacks, onconnectionfailedlistener)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:checkcast       #16  <Class zzaxm$zza>
			//    6    9:aload           5
			//    7   11:aload           6
			//    8   13:invokevirtual   #19  <Method zzaxy zza(Context, Looper, zzg, zzaxm$zza, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//    9   16:areturn         
			}

			public zzaxy zza(Context context, Looper looper, zzg zzg, zza zza1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
			{
				return new zzaxy(context, looper, false, zzg, zza1.zzOd(), connectioncallbacks, onconnectionfailedlistener);
			//    0    0:new             #21  <Class zzaxy>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:iconst_0        
			//    5    7:aload_3         
			//    6    8:aload           4
			//    7   10:invokevirtual   #25  <Method Bundle zzaxm$zza.zzOd()>
			//    8   13:aload           5
			//    9   15:aload           6
			//   10   17:invokespecial   #28  <Method void zzaxy(Context, Looper, boolean, zzg, Bundle, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			//   11   20:areturn         
			}

		}
));
	//   12   30:new             #8   <Class zzaxm$2>
	//   13   33:dup             
	//   14   34:invokespecial   #43  <Method void zzaxm$2()>
	//   15   37:putstatic       #45  <Field com.google.android.gms.common.api.Api$zza zzbCe>
	//   16   40:new             #47  <Class Scope>
	//   17   43:dup             
	//   18   44:ldc1            #49  <String "profile">
	//   19   46:invokespecial   #52  <Method void Scope(String)>
	//   20   49:putstatic       #54  <Field Scope zzajd>
	//   21   52:new             #47  <Class Scope>
	//   22   55:dup             
	//   23   56:ldc1            #56  <String "email">
	//   24   58:invokespecial   #52  <Method void Scope(String)>
	//   25   61:putstatic       #58  <Field Scope zzaje>
		API = new Api("SignIn.API", zzahd, zzahc);
	//   26   64:new             #60  <Class Api>
	//   27   67:dup             
	//   28   68:ldc1            #62  <String "SignIn.API">
	//   29   70:getstatic       #42  <Field com.google.android.gms.common.api.Api$zza zzahd>
	//   30   73:getstatic       #37  <Field com.google.android.gms.common.api.Api$zzf zzahc>
	//   31   76:invokespecial   #65  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   32   79:putstatic       #67  <Field Api API>
		zzaJq = new Api("SignIn.INTERNAL_API", zzbCe, zzbCd);
	//   33   82:new             #60  <Class Api>
	//   34   85:dup             
	//   35   86:ldc1            #69  <String "SignIn.INTERNAL_API">
	//   36   88:getstatic       #45  <Field com.google.android.gms.common.api.Api$zza zzbCe>
	//   37   91:getstatic       #39  <Field com.google.android.gms.common.api.Api$zzf zzbCd>
	//   38   94:invokespecial   #65  <Method void Api(String, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zzf)>
	//   39   97:putstatic       #71  <Field Api zzaJq>
	//*  40  100:return          
	}
}
