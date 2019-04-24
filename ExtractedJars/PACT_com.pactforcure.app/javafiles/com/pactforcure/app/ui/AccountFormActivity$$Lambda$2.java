// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;

// Referenced classes of package com.pactforcure.app.ui:
//			AccountFormActivity

final class AccountFormActivity$$Lambda$2
	implements android.content.r
{

	public static android.content.r lambdaFactory$(AccountFormActivity accountformactivity)
	{
		return ((android.content.r) (new AccountFormActivity$$Lambda$2(accountformactivity)));
	//    0    0:new             #2   <Class AccountFormActivity$$Lambda$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void AccountFormActivity$$Lambda$2(AccountFormActivity)>
	//    4    8:areturn         
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		AccountFormActivity.lambda$registrationSuccessDialog$5(arg$1, dialoginterface, i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccountFormActivity arg$1>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #28  <Method void AccountFormActivity.lambda$registrationSuccessDialog$5(AccountFormActivity, DialogInterface, int)>
	//    5    9:return          
	}

	private final AccountFormActivity arg$1;

	private AccountFormActivity$$Lambda$2(AccountFormActivity accountformactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = accountformactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field AccountFormActivity arg$1>
	//    5    9:return          
	}
}
