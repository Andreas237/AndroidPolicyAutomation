// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;

// Referenced classes of package com.google.android.gms.auth.api:
//			Auth

public static class Auth$AuthCredentialsOptions
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
	public static class Builder
	{

		public Builder forceEnableSaveDialog()
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

		public Auth.AuthCredentialsOptions zzh()
		{
			return new Auth.AuthCredentialsOptions(this);
		//    0    0:new             #6   <Class Auth$AuthCredentialsOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #43  <Method void Auth$AuthCredentialsOptions(Auth$AuthCredentialsOptions$Builder)>
		//    4    8:areturn         
		}

		protected PasswordSpecification zzap;
		protected Boolean zzar;

		public Builder()
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

	private static final Auth$AuthCredentialsOptions zzan = (new Builder()).zzh();
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

	public Auth$AuthCredentialsOptions(Builder builder)
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
