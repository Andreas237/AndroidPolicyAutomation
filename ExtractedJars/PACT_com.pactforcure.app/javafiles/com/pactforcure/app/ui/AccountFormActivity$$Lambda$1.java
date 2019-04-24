// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			AccountFormActivity

final class AccountFormActivity$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(AccountFormActivity accountformactivity)
	{
		return ((android.view.View.OnClickListener) (new AccountFormActivity$$Lambda$1(accountformactivity)));
	//    0    0:new             #2   <Class AccountFormActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void AccountFormActivity$$Lambda$1(AccountFormActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		AccountFormActivity.lambda$onCreate$4(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccountFormActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void AccountFormActivity.lambda$onCreate$4(AccountFormActivity, View)>
	//    4    8:return          
	}

	private final AccountFormActivity arg$1;

	private AccountFormActivity$$Lambda$1(AccountFormActivity accountformactivity)
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
