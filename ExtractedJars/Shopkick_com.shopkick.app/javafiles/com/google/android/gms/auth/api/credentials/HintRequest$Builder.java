// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			HintRequest, CredentialPickerConfig

public static final class HintRequest$Builder
{

	static CredentialPickerConfig zzc(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzah;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field CredentialPickerConfig zzah>
	//    2    4:areturn         
	}

	static boolean zzd(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzai;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzai>
	//    2    4:ireturn         
	}

	static boolean zze(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzaj;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean zzaj>
	//    2    4:ireturn         
	}

	static String[] zzf(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzaa;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String[] zzaa>
	//    2    4:areturn         
	}

	static boolean zzg(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean zzad>
	//    2    4:ireturn         
	}

	static String zzh(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzae;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzae>
	//    2    4:areturn         
	}

	static String zzi(HintRequest$Builder hintrequest$builder)
	{
		return hintrequest$builder.zzaf;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzaf>
	//    2    4:areturn         
	}

	public final HintRequest build()
	{
		if(zzaa == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field String[] zzaa>
	//*   2    4:ifnonnull       15
			zzaa = new String[0];
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:anewarray       String[]
	//    6   12:putfield        #47  <Field String[] zzaa>
		if(!zzai && !zzaj && zzaa.length == 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #40  <Field boolean zzai>
	//*   9   19:ifne            50
	//*  10   22:aload_0         
	//*  11   23:getfield        #43  <Field boolean zzaj>
	//*  12   26:ifne            50
	//*  13   29:aload_0         
	//*  14   30:getfield        #47  <Field String[] zzaa>
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
			return new HintRequest(this, ((zzi) (null)));
	//   23   50:new             #6   <Class HintRequest>
	//   24   53:dup             
	//   25   54:aload_0         
	//   26   55:aconst_null     
	//   27   56:invokespecial   #68  <Method void HintRequest(HintRequest$Builder, zzi)>
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
		zzaa = as1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #47  <Field String[] zzaa>
		return this;
	//   10   16:aload_0         
	//   11   17:areturn         
	}

	public final HintRequest$Builder setEmailAddressIdentifierSupported(boolean flag)
	{
		zzai = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean zzai>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
	{
		zzah = (CredentialPickerConfig)Preconditions.checkNotNull(((Object) (credentialpickerconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #81  <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #83  <Class CredentialPickerConfig>
	//    4    8:putfield        #31  <Field CredentialPickerConfig zzah>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public final HintRequest$Builder setIdTokenNonce(String s)
	{
		zzaf = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field String zzaf>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setIdTokenRequested(boolean flag)
	{
		zzad = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean zzad>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setPhoneNumberIdentifierSupported(boolean flag)
	{
		zzaj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean zzaj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final HintRequest$Builder setServerClientId(String s)
	{
		zzae = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String zzae>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String zzaa[];
	private boolean zzad;
	private String zzae;
	private String zzaf;
	private CredentialPickerConfig zzah;
	private boolean zzai;
	private boolean zzaj;

	public HintRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzah = (new ig.Builder()).build();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class CredentialPickerConfig$Builder>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void CredentialPickerConfig$Builder()>
	//    6   12:invokevirtual   #29  <Method CredentialPickerConfig CredentialPickerConfig$Builder.build()>
	//    7   15:putfield        #31  <Field CredentialPickerConfig zzah>
		zzad = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #33  <Field boolean zzad>
	//   11   23:return          
	}
}
