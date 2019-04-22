// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.credentials.PasswordSpecification;

// Referenced classes of package com.google.android.gms.auth.api:
//			Auth

public static class Auth$AuthCredentialsOptions$Builder
{

	public Auth$AuthCredentialsOptions$Builder forceEnableSaveDialog()
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

	public Auth$AuthCredentialsOptions$Builder()
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
