// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialPickerConfig

public static class CredentialPickerConfig$Builder
{

	static boolean zzc(CredentialPickerConfig$Builder credentialpickerconfig$builder)
	{
		return credentialpickerconfig$builder.zzv;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean zzv>
	//    2    4:ireturn         
	}

	static boolean zzd(CredentialPickerConfig$Builder credentialpickerconfig$builder)
	{
		return credentialpickerconfig$builder.mShowCancelButton;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean mShowCancelButton>
	//    2    4:ireturn         
	}

	static int zze(CredentialPickerConfig$Builder credentialpickerconfig$builder)
	{
		return credentialpickerconfig$builder.zzy;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int zzy>
	//    2    4:ireturn         
	}

	public CredentialPickerConfig build()
	{
		return new CredentialPickerConfig(this, ((zzd) (null)));
	//    0    0:new             #6   <Class CredentialPickerConfig>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #33  <Method void CredentialPickerConfig(CredentialPickerConfig$Builder, zzd)>
	//    5    9:areturn         
	}

	public CredentialPickerConfig$Builder setForNewAccount(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			i = 3;
	//    2    4:iconst_3        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			i = 1;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		zzy = i;
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:putfield        #22  <Field int zzy>
		return this;
	//   10   16:aload_0         
	//   11   17:areturn         
	}

	public CredentialPickerConfig$Builder setPrompt(int i)
	{
		zzy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int zzy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CredentialPickerConfig$Builder setShowAddAccountButton(boolean flag)
	{
		zzv = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field boolean zzv>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CredentialPickerConfig$Builder setShowCancelButton(boolean flag)
	{
		mShowCancelButton = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field boolean mShowCancelButton>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean mShowCancelButton;
	private boolean zzv;
	private int zzy;

	public CredentialPickerConfig$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzv = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean zzv>
		mShowCancelButton = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #20  <Field boolean mShowCancelButton>
		zzy = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #22  <Field int zzy>
	//   11   19:return          
	}
}
