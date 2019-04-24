// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import com.pactforcure.app.participant.login.CredentialsValidationError;

// Referenced classes of package com.pactforcure.app.ui:
//			ResetPasswordActivity

static class ResetPasswordActivity$2
{

	static final int $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[];

	static 
	{
		$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError = new int[CredentialsValidationError.values().length];
	//    0    0:invokestatic    #18  <Method CredentialsValidationError[] CredentialsValidationError.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
		try
		{
			$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.EMPTY_EMAIL.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
	//    5   12:getstatic       #24  <Field CredentialsValidationError CredentialsValidationError.EMPTY_EMAIL>
	//    6   15:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
	//*  10   23:getstatic       #31  <Field CredentialsValidationError CredentialsValidationError.INVALID_EMAIL>
	//*  11   26:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
	//*  15   32:astore_0        
	//*  16   33:return          
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   34:astore_0        
		try
		{
			$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.INVALID_EMAIL.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  18   35:goto            20
	}
}
