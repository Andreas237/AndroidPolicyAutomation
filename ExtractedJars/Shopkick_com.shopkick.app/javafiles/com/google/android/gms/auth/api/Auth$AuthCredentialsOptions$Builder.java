// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api;


// Referenced classes of package com.google.android.gms.auth.api:
//			Auth

public static class Auth$AuthCredentialsOptions$Builder
{

	public Auth$AuthCredentialsOptions$Builder forceEnableSaveDialog()
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

	public Auth$AuthCredentialsOptions$Builder()
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
