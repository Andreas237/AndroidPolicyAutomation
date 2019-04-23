// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.auth.api:
//			Auth

public static class Auth$AuthCredentialsOptions
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
	public static class Builder
	{

		public Builder forceEnableSaveDialog()
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

		public Auth.AuthCredentialsOptions zzc()
		{
			return new Auth.AuthCredentialsOptions(this);
		//    0    0:new             #6   <Class Auth$AuthCredentialsOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #33  <Method void Auth$AuthCredentialsOptions(Auth$AuthCredentialsOptions$Builder)>
		//    4    8:areturn         
		}

		protected Boolean zzn;

		public Builder()
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

	private static final Auth$AuthCredentialsOptions zzk = (new Builder()).zzc();
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

	public Auth$AuthCredentialsOptions(Builder builder)
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
