// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			HintRequest, CredentialPickerConfig

public static final class HintRequest$Builder
{

	static CredentialPickerConfig zzd(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzdc;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field CredentialPickerConfig zzdc>
	//    2    4:areturn         
	}

	static boolean zze(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzdd;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzdd>
	//    2    4:ireturn         
	}

	static boolean zzf(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzde;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean zzde>
	//    2    4:ireturn         
	}

	static String[] zzg(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzcv;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String[] zzcv>
	//    2    4:areturn         
	}

	static boolean zzh(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean zzcy>
	//    2    4:ireturn         
	}

	static String zzi(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzcz;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzcz>
	//    2    4:areturn         
	}

	static String zzj(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzda;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzda>
	//    2    4:areturn         
	}

	public final HintRequest build()
	{
		if(zzcv == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field String[] zzcv>
	//*   2    4:ifnonnull       15
			zzcv = new String[0];
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:anewarray       String[]
	//    6   12:putfield        #47  <Field String[] zzcv>
		if(!zzdd && !zzde && zzcv.length == 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #40  <Field boolean zzdd>
	//*   9   19:ifne            50
	//*  10   22:aload_0         
	//*  11   23:getfield        #43  <Field boolean zzde>
	//*  12   26:ifne            50
	//*  13   29:aload_0         
	//*  14   30:getfield        #47  <Field String[] zzcv>
	//*  15   33:arraylength     
	//*  16   34:ifeq            40
	//*  17   37:goto            50
			throw new IllegalStateException("At least one authentication method must be specified");
	//   18   40:new             #60  <Class IllegalStateException>
	//   19   43:dup             
	//   20   44:ldc1            #62  <String "At least one authentication method must be specified">
	//   21   46:invokespecial   #65  <Method void IllegalStateException(String)>
	//   22   49:athrow          
		else
			return new HintRequest(this, ((zzj) (null)));
	//   23   50:new             #6   <Class HintRequest>
	//   24   53:dup             
	//   25   54:aload_0         
	//   26   55:aconst_null     
	//   27   56:invokespecial   #68  <Method void HintRequest(HintRequest$Builder, zzj)>
	//   28   59:areturn         
	}

	public final transient HintRequest$Builder setAccountTypes(String as[])
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
	//    9   13:putfield        #47  <Field String[] zzcv>
		return this;
	//   10   16:aload_0         
	//   11   17:areturn         
	}

	public final HintRequest$Builder setEmailAddressIdentifierSupported(boolean flag)
	{
		zzdd = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean zzdd>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
	{
		zzdc = (CredentialPickerConfig)Preconditions.checkNotNull(((Object) (credentialpickerconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #81  <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #83  <Class CredentialPickerConfig>
	//    4    8:putfield        #31  <Field CredentialPickerConfig zzdc>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public final HintRequest$Builder setIdTokenNonce(String s)
	{
		zzda = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field String zzda>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setIdTokenRequested(boolean flag)
	{
		zzcy = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean zzcy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setPhoneNumberIdentifierSupported(boolean flag)
	{
		zzde = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean zzde>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setServerClientId(String s)
	{
		zzcz = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String zzcz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String zzcv[];
	private boolean zzcy;
	private String zzcz;
	private String zzda;
	private CredentialPickerConfig zzdc;
	private boolean zzdd;
	private boolean zzde;

	public HintRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzdc = (new ig.Builder()).build();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class CredentialPickerConfig$Builder>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void CredentialPickerConfig$Builder()>
	//    6   12:invokevirtual   #29  <Method CredentialPickerConfig CredentialPickerConfig$Builder.build()>
	//    7   15:putfield        #31  <Field CredentialPickerConfig zzdc>
		zzcy = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #33  <Field boolean zzcy>
	//   11   23:return          
	}
}
