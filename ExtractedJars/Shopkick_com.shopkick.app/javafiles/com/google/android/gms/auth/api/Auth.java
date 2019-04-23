// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth-api.zzi;

// Referenced classes of package com.google.android.gms.auth.api:
//			zzc, zzd, AuthProxy

public final class Auth
{
	public static class AuthCredentialsOptions
		implements com.google.android.gms.common.api.Api.ApiOptions.Optional
	{

		public final Bundle toBundle()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #51  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #52  <Method void Bundle()>
		//    3    7:astore_1        
			bundle.putString("consumer_package", ((String) (null)));
		//    4    8:aload_1         
		//    5    9:ldc1            #54  <String "consumer_package">
		//    6   11:aconst_null     
		//    7   12:invokevirtual   #58  <Method void Bundle.putString(String, String)>
			bundle.putBoolean("force_save_dialog", zzm);
		//    8   15:aload_1         
		//    9   16:ldc1            #60  <String "force_save_dialog">
		//   10   18:aload_0         
		//   11   19:getfield        #47  <Field boolean zzm>
		//   12   22:invokevirtual   #64  <Method void Bundle.putBoolean(String, boolean)>
			return bundle;
		//   13   25:aload_1         
		//   14   26:areturn         
		}

		private static final AuthCredentialsOptions zzk = (new Builder()).zzc();
		private final String zzl = null;
		private final boolean zzm;

		static 
		{
		//    0    0:new             #11  <Class Auth$AuthCredentialsOptions$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void Auth$AuthCredentialsOptions$Builder()>
		//    3    7:invokevirtual   #28  <Method Auth$AuthCredentialsOptions Auth$AuthCredentialsOptions$Builder.zzc()>
		//    4   10:putstatic       #30  <Field Auth$AuthCredentialsOptions zzk>
		//*   5   13:return          
		}

		public AuthCredentialsOptions(Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #35  <Field String zzl>
			zzm = builder.zzn.booleanValue();
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #39  <Field Boolean Auth$AuthCredentialsOptions$Builder.zzn>
		//    8   14:invokevirtual   #45  <Method boolean Boolean.booleanValue()>
		//    9   17:putfield        #47  <Field boolean zzm>
		//   10   20:return          
		}
	}

	public static class AuthCredentialsOptions.Builder
	{

		public AuthCredentialsOptions.Builder forceEnableSaveDialog()
		{
			zzn = Boolean.valueOf(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokestatic    #23  <Method Boolean Boolean.valueOf(boolean)>
		//    3    5:putfield        #25  <Field Boolean zzn>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public AuthCredentialsOptions zzc()
		{
			return new AuthCredentialsOptions(this);
		//    0    0:new             #6   <Class Auth$AuthCredentialsOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #33  <Method void Auth$AuthCredentialsOptions(Auth$AuthCredentialsOptions$Builder)>
		//    4    8:areturn         
		}

		protected Boolean zzn;

		public AuthCredentialsOptions.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzn = Boolean.valueOf(false);
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokestatic    #23  <Method Boolean Boolean.valueOf(boolean)>
		//    5    9:putfield        #25  <Field Boolean zzn>
		//    6   12:return          
		}
	}


	private Auth()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void Object()>
	//    2    4:return          
	}

	public static final Api CREDENTIALS_API;
	public static final CredentialsApi CredentialsApi = new zzi();
	public static final Api GOOGLE_SIGN_IN_API;
	public static final GoogleSignInApi GoogleSignInApi = new zzf();
	public static final Api PROXY_API;
	public static final ProxyApi ProxyApi;
	public static final com.google.android.gms.common.api.Api.ClientKey zzg;
	public static final com.google.android.gms.common.api.Api.ClientKey zzh;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzi;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzj;

	static 
	{
		zzg = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #39  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #44  <Field com.google.android.gms.common.api.Api$ClientKey zzg>
		zzh = new com.google.android.gms.common.api.Api.ClientKey();
	//    4   10:new             #39  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    5   13:dup             
	//    6   14:invokespecial   #42  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    7   17:putstatic       #46  <Field com.google.android.gms.common.api.Api$ClientKey zzh>
		zzi = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzc()));
	//    8   20:new             #48  <Class zzc>
	//    9   23:dup             
	//   10   24:invokespecial   #49  <Method void zzc()>
	//   11   27:putstatic       #51  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzi>
		zzj = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzd()));
	//   12   30:new             #53  <Class zzd>
	//   13   33:dup             
	//   14   34:invokespecial   #54  <Method void zzd()>
	//   15   37:putstatic       #56  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzj>
		PROXY_API = AuthProxy.API;
	//   16   40:getstatic       #61  <Field Api AuthProxy.API>
	//   17   43:putstatic       #63  <Field Api PROXY_API>
		CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzi, zzg);
	//   18   46:new             #65  <Class Api>
	//   19   49:dup             
	//   20   50:ldc1            #67  <String "Auth.CREDENTIALS_API">
	//   21   52:getstatic       #51  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzi>
	//   22   55:getstatic       #44  <Field com.google.android.gms.common.api.Api$ClientKey zzg>
	//   23   58:invokespecial   #70  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   24   61:putstatic       #72  <Field Api CREDENTIALS_API>
		GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzj, zzh);
	//   25   64:new             #65  <Class Api>
	//   26   67:dup             
	//   27   68:ldc1            #74  <String "Auth.GOOGLE_SIGN_IN_API">
	//   28   70:getstatic       #56  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzj>
	//   29   73:getstatic       #46  <Field com.google.android.gms.common.api.Api$ClientKey zzh>
	//   30   76:invokespecial   #70  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   31   79:putstatic       #76  <Field Api GOOGLE_SIGN_IN_API>
		ProxyApi = com.google.android.gms.auth.api.AuthProxy.ProxyApi;
	//   32   82:getstatic       #78  <Field ProxyApi com.google.android.gms.auth.api.AuthProxy.ProxyApi>
	//   33   85:putstatic       #79  <Field ProxyApi ProxyApi>
	//   34   88:new             #81  <Class zzi>
	//   35   91:dup             
	//   36   92:invokespecial   #82  <Method void zzi()>
	//   37   95:putstatic       #84  <Field CredentialsApi CredentialsApi>
	//   38   98:new             #86  <Class zzf>
	//   39  101:dup             
	//   40  102:invokespecial   #87  <Method void zzf()>
	//   41  105:putstatic       #89  <Field GoogleSignInApi GoogleSignInApi>
	//*  42  108:return          
	}
}
