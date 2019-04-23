// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			zzh

public final class CredentialsOptions extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions
{
	public static final class Builder extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
	{

		public final CredentialsOptions build()
		{
			return new CredentialsOptions(this, ((zzh) (null)));
		//    0    0:new             #6   <Class CredentialsOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #17  <Method void CredentialsOptions(CredentialsOptions$Builder, zzh)>
		//    5    9:areturn         
		}

		public final volatile com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog()
		{
			return ((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder) (forceEnableSaveDialog()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #22  <Method CredentialsOptions$Builder forceEnableSaveDialog()>
		//    2    4:areturn         
		}

		public final Builder forceEnableSaveDialog()
		{
			zzn = Boolean.valueOf(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokestatic    #28  <Method Boolean Boolean.valueOf(boolean)>
		//    3    5:putfield        #32  <Field Boolean zzn>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzc()
		{
			return ((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #36  <Method CredentialsOptions build()>
		//    2    4:areturn         
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder()>
		//    2    4:return          
		}
	}


	private CredentialsOptions(Builder builder)
	{
		super(((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void com.google.android.gms.auth.api.Auth$AuthCredentialsOptions(com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder)>
	//    3    5:return          
	}

	CredentialsOptions(Builder builder, zzh zzh)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void CredentialsOptions(CredentialsOptions$Builder)>
	//    3    5:return          
	}

	public static final CredentialsOptions DEFAULT = (CredentialsOptions)((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder) (new Builder())).zzc();

	static 
	{
	//    0    0:new             #6   <Class CredentialsOptions$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void CredentialsOptions$Builder()>
	//    3    7:invokevirtual   #20  <Method com.google.android.gms.auth.api.Auth$AuthCredentialsOptions com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder.zzc()>
	//    4   10:checkcast       #2   <Class CredentialsOptions>
	//    5   13:putstatic       #22  <Field CredentialsOptions DEFAULT>
	//*   6   16:return          
	}
}
