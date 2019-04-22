// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialRequest, CredentialPickerConfig

public static final class CredentialRequest$Builder
{

	static boolean zzd(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzcu;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean zzcu>
	//    2    4:ireturn         
	}

	static String[] zze(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzcv;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String[] zzcv>
	//    2    4:areturn         
	}

	static CredentialPickerConfig zzf(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzcw;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field CredentialPickerConfig zzcw>
	//    2    4:areturn         
	}

	static CredentialPickerConfig zzg(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzcx;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field CredentialPickerConfig zzcx>
	//    2    4:areturn         
	}

	static boolean zzh(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean zzcy>
	//    2    4:ireturn         
	}

	static String zzi(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzcz;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzcz>
	//    2    4:areturn         
	}

	static String zzj(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzda;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzda>
	//    2    4:areturn         
	}

	public final CredentialRequest build()
	{
		if(zzcv == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field String[] zzcv>
	//*   2    4:ifnonnull       15
			zzcv = new String[0];
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:anewarray       String[]
	//    6   12:putfield        #39  <Field String[] zzcv>
		if(!zzcu && zzcv.length == 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #35  <Field boolean zzcu>
	//*   9   19:ifne            43
	//*  10   22:aload_0         
	//*  11   23:getfield        #39  <Field String[] zzcv>
	//*  12   26:arraylength     
	//*  13   27:ifeq            33
	//*  14   30:goto            43
			throw new IllegalStateException("At least one authentication method must be specified");
	//   15   33:new             #58  <Class IllegalStateException>
	//   16   36:dup             
	//   17   37:ldc1            #60  <String "At least one authentication method must be specified">
	//   18   39:invokespecial   #63  <Method void IllegalStateException(String)>
	//   19   42:athrow          
		else
			return new CredentialRequest(this, ((zzg) (null)));
	//   20   43:new             #6   <Class CredentialRequest>
	//   21   46:dup             
	//   22   47:aload_0         
	//   23   48:aconst_null     
	//   24   49:invokespecial   #66  <Method void CredentialRequest(CredentialRequest$Builder, zzg)>
	//   25   52:areturn         
	}

	public final transient CredentialRequest$Builder setAccountTypes(String as[])
	{
		String as1[] = as;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(as == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       11
			as1 = new String[0];
	//    4    6:iconst_0        
	//    5    7:anewarray       String[]
	//    6   10:astore_2        
		zzcv = as1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #39  <Field String[] zzcv>
		return this;
	//   10   16:aload_0         
	//   11   17:areturn         
	}

	public final CredentialRequest$Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
	{
		zzcx = credentialpickerconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field CredentialPickerConfig zzcx>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setCredentialPickerConfig(CredentialPickerConfig credentialpickerconfig)
	{
		zzcw = credentialpickerconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field CredentialPickerConfig zzcw>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setIdTokenNonce(String s)
	{
		zzda = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String zzda>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setIdTokenRequested(boolean flag)
	{
		zzcy = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean zzcy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setPasswordLoginSupported(boolean flag)
	{
		zzcu = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean zzcu>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setServerClientId(String s)
	{
		zzcz = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String zzcz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setSupportsPasswordLogin(boolean flag)
	{
		return setPasswordLoginSupported(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method CredentialRequest$Builder setPasswordLoginSupported(boolean)>
	//    3    5:areturn         
	}

	private boolean zzcu;
	private String zzcv[];
	private CredentialPickerConfig zzcw;
	private CredentialPickerConfig zzcx;
	private boolean zzcy;
	private String zzcz;
	private String zzda;
	private boolean zzdb;

	public CredentialRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzcy = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean zzcy>
		zzdb = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field boolean zzdb>
		zzcz = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field String zzcz>
	//   11   19:return          
	}
}
