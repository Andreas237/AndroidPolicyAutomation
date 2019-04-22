// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzao;
import com.google.android.gms.internal.auth.zzbn;

// Referenced classes of package com.google.android.gms.auth.api:
//			zzd, zze, zzf

public final class Auth
{
	public static class AuthCredentialsOptions
		implements com.google.android.gms.common.api.Api.ApiOptions.Optional
	{

		public final Bundle toBundle()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #56  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #57  <Method void Bundle()>
		//    3    7:astore_1        
			bundle.putString("consumer_package", ((String) (null)));
		//    4    8:aload_1         
		//    5    9:ldc1            #59  <String "consumer_package">
		//    6   11:aconst_null     
		//    7   12:invokevirtual   #63  <Method void Bundle.putString(String, String)>
			bundle.putParcelable("password_specification", ((android.os.Parcelable) (zzap)));
		//    8   15:aload_1         
		//    9   16:ldc1            #65  <String "password_specification">
		//   10   18:aload_0         
		//   11   19:getfield        #40  <Field PasswordSpecification zzap>
		//   12   22:invokevirtual   #69  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle.putBoolean("force_save_dialog", zzaq);
		//   13   25:aload_1         
		//   14   26:ldc1            #71  <String "force_save_dialog">
		//   15   28:aload_0         
		//   16   29:getfield        #52  <Field boolean zzaq>
		//   17   32:invokevirtual   #75  <Method void Bundle.putBoolean(String, boolean)>
			return bundle;
		//   18   35:aload_1         
		//   19   36:areturn         
		}

		public final PasswordSpecification zzg()
		{
			return zzap;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field PasswordSpecification zzap>
		//    2    4:areturn         
		}

		private static final AuthCredentialsOptions zzan = (new Builder()).zzh();
		private final String zzao = null;
		private final PasswordSpecification zzap;
		private final boolean zzaq;

		static 
		{
		//    0    0:new             #11  <Class Auth$AuthCredentialsOptions$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void Auth$AuthCredentialsOptions$Builder()>
		//    3    7:invokevirtual   #30  <Method Auth$AuthCredentialsOptions Auth$AuthCredentialsOptions$Builder.zzh()>
		//    4   10:putstatic       #32  <Field Auth$AuthCredentialsOptions zzan>
		//*   5   13:return          
		}

		public AuthCredentialsOptions(Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #37  <Field String zzao>
			zzap = builder.zzap;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #39  <Field PasswordSpecification Auth$AuthCredentialsOptions$Builder.zzap>
		//    8   14:putfield        #40  <Field PasswordSpecification zzap>
			zzaq = builder.zzar.booleanValue();
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #44  <Field Boolean Auth$AuthCredentialsOptions$Builder.zzar>
		//   12   22:invokevirtual   #50  <Method boolean Boolean.booleanValue()>
		//   13   25:putfield        #52  <Field boolean zzaq>
		//   14   28:return          
		}
	}

	public static class AuthCredentialsOptions.Builder
	{

		public AuthCredentialsOptions.Builder forceEnableSaveDialog()
		{
			zzar = Boolean.valueOf(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokestatic    #33  <Method Boolean Boolean.valueOf(boolean)>
		//    3    5:putfield        #35  <Field Boolean zzar>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public AuthCredentialsOptions zzh()
		{
			return new AuthCredentialsOptions(this);
		//    0    0:new             #6   <Class Auth$AuthCredentialsOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #43  <Method void Auth$AuthCredentialsOptions(Auth$AuthCredentialsOptions$Builder)>
		//    4    8:areturn         
		}

		protected PasswordSpecification zzap;
		protected Boolean zzar;

		public AuthCredentialsOptions.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			zzap = PasswordSpecification.zzdg;
		//    2    4:aload_0         
		//    3    5:getstatic       #25  <Field PasswordSpecification PasswordSpecification.zzdg>
		//    4    8:putfield        #27  <Field PasswordSpecification zzap>
			zzar = Boolean.valueOf(false);
		//    5   11:aload_0         
		//    6   12:iconst_0        
		//    7   13:invokestatic    #33  <Method Boolean Boolean.valueOf(boolean)>
		//    8   16:putfield        #35  <Field Boolean zzar>
		//    9   19:return          
		}
	}


	private Auth()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
	//    2    4:return          
	}

	public static final Api CREDENTIALS_API;
	public static final CredentialsApi CredentialsApi = new zzao();
	public static final Api GOOGLE_SIGN_IN_API;
	public static final GoogleSignInApi GoogleSignInApi = new zzg();
	public static final Api PROXY_API;
	public static final ProxyApi ProxyApi = new zzbn();
	public static final com.google.android.gms.common.api.Api.ClientKey zzaj;
	public static final com.google.android.gms.common.api.Api.ClientKey zzak;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzal;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzam;

	static 
	{
		zzaj = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #38  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #43  <Field com.google.android.gms.common.api.Api$ClientKey zzaj>
		zzak = new com.google.android.gms.common.api.Api.ClientKey();
	//    4   10:new             #38  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    7   17:putstatic       #45  <Field com.google.android.gms.common.api.Api$ClientKey zzak>
		zzal = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzd()));
	//    8   20:new             #47  <Class zzd>
	//    9   23:dup             
	//   10   24:invokespecial   #48  <Method void zzd()>
	//   11   27:putstatic       #50  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzal>
		zzam = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zze()));
	//   12   30:new             #52  <Class zze>
	//   13   33:dup             
	//   14   34:invokespecial   #53  <Method void zze()>
	//   15   37:putstatic       #55  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzam>
		PROXY_API = zzf.API;
	//   16   40:getstatic       #60  <Field Api zzf.API>
	//   17   43:putstatic       #62  <Field Api PROXY_API>
		CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzal, zzaj);
	//   18   46:new             #64  <Class Api>
	//   19   49:dup             
	//   20   50:ldc1            #66  <String "Auth.CREDENTIALS_API">
	//   21   52:getstatic       #50  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzal>
	//   22   55:getstatic       #43  <Field com.google.android.gms.common.api.Api$ClientKey zzaj>
	//   23   58:invokespecial   #69  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   24   61:putstatic       #71  <Field Api CREDENTIALS_API>
		GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzam, zzak);
	//   25   64:new             #64  <Class Api>
	//   26   67:dup             
	//   27   68:ldc1            #73  <String "Auth.GOOGLE_SIGN_IN_API">
	//   28   70:getstatic       #55  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzam>
	//   29   73:getstatic       #45  <Field com.google.android.gms.common.api.Api$ClientKey zzak>
	//   30   76:invokespecial   #69  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   31   79:putstatic       #75  <Field Api GOOGLE_SIGN_IN_API>
	//   32   82:new             #77  <Class zzbn>
	//   33   85:dup             
	//   34   86:invokespecial   #78  <Method void zzbn()>
	//   35   89:putstatic       #80  <Field ProxyApi ProxyApi>
	//   36   92:new             #82  <Class zzao>
	//   37   95:dup             
	//   38   96:invokespecial   #83  <Method void zzao()>
	//   39   99:putstatic       #85  <Field CredentialsApi CredentialsApi>
	//   40  102:new             #87  <Class zzg>
	//   41  105:dup             
	//   42  106:invokespecial   #88  <Method void zzg()>
	//   43  109:putstatic       #90  <Field GoogleSignInApi GoogleSignInApi>
	//*  44  112:return          
	}
}
