// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialRequest, CredentialPickerConfig

public static final class CredentialRequest$Builder
{

	static boolean zzc(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzz;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean zzz>
	//    2    4:ireturn         
	}

	static String[] zzd(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzaa;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String[] zzaa>
	//    2    4:areturn         
	}

	static CredentialPickerConfig zze(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzab;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field CredentialPickerConfig zzab>
	//    2    4:areturn         
	}

	static CredentialPickerConfig zzf(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzac;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field CredentialPickerConfig zzac>
	//    2    4:areturn         
	}

	static boolean zzg(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean zzad>
	//    2    4:ireturn         
	}

	static String zzh(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzae;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzae>
	//    2    4:areturn         
	}

	static String zzi(CredentialRequest$Builder credentialrequest$builder)
	{
		return credentialrequest$builder.zzaf;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzaf>
	//    2    4:areturn         
	}

	public final CredentialRequest build()
	{
		if(zzaa == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field String[] zzaa>
	//*   2    4:ifnonnull       15
			zzaa = new String[0];
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:anewarray       String[]
	//    6   12:putfield        #39  <Field String[] zzaa>
		if(!zzz && zzaa.length == 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #35  <Field boolean zzz>
	//*   9   19:ifne            43
	//*  10   22:aload_0         
	//*  11   23:getfield        #39  <Field String[] zzaa>
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
			return new CredentialRequest(this, ((zzf) (null)));
	//   20   43:new             #6   <Class CredentialRequest>
	//   21   46:dup             
	//   22   47:aload_0         
	//   23   48:aconst_null     
	//   24   49:invokespecial   #66  <Method void CredentialRequest(CredentialRequest$Builder, zzf)>
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
		zzaa = as1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #39  <Field String[] zzaa>
		return this;
	//   10   16:aload_0         
	//   11   17:areturn         
	}

	public final CredentialRequest$Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
	{
		zzac = credentialpickerconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field CredentialPickerConfig zzac>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setCredentialPickerConfig(CredentialPickerConfig credentialpickerconfig)
	{
		zzab = credentialpickerconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field CredentialPickerConfig zzab>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setIdTokenNonce(String s)
	{
		zzaf = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String zzaf>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setIdTokenRequested(boolean flag)
	{
		zzad = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean zzad>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setPasswordLoginSupported(boolean flag)
	{
		zzz = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean zzz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CredentialRequest$Builder setServerClientId(String s)
	{
		zzae = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String zzae>
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

	private String zzaa[];
	private CredentialPickerConfig zzab;
	private CredentialPickerConfig zzac;
	private boolean zzad;
	private String zzae;
	private String zzaf;
	private boolean zzag;
	private boolean zzz;

	public CredentialRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzad = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean zzad>
		zzag = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field boolean zzag>
		zzae = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field String zzae>
	//   11   19:return          
	}
}
