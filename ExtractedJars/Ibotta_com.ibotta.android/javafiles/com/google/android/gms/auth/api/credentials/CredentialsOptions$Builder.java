// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialsOptions

public static final class CredentialsOptions$Builder extends com.google.android.gms.auth.api..Builder
{

	public final CredentialsOptions build()
	{
		return new CredentialsOptions(this, ((zzi) (null)));
	//    0    0:new             #6   <Class CredentialsOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #17  <Method void CredentialsOptions(CredentialsOptions$Builder, zzi)>
	//    5    9:areturn         
	}

	public final volatile com.google.android.gms.auth.api..Builder forceEnableSaveDialog()
	{
		return ((com.google.android.gms.auth.api..Builder) (forceEnableSaveDialog()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method CredentialsOptions$Builder forceEnableSaveDialog()>
	//    2    4:areturn         
	}

	public final CredentialsOptions$Builder forceEnableSaveDialog()
	{
		zzar = Boolean.valueOf(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #28  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #32  <Field Boolean zzar>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final com.google.android.gms.auth.api. zzh()
	{
		return ((com.google.android.gms.auth.api.) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method CredentialsOptions build()>
	//    2    4:areturn         
	}

	public CredentialsOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder()>
	//    2    4:return          
	}
}
