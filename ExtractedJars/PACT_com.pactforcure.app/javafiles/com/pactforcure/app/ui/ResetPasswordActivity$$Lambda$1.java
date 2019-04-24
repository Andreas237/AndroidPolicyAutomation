// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			ResetPasswordActivity

final class ResetPasswordActivity$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(ResetPasswordActivity resetpasswordactivity)
	{
		return ((android.view.View.OnClickListener) (new ResetPasswordActivity$$Lambda$1(resetpasswordactivity)));
	//    0    0:new             #2   <Class ResetPasswordActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void ResetPasswordActivity$$Lambda$1(ResetPasswordActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		ResetPasswordActivity.lambda$onCreate$25(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ResetPasswordActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void ResetPasswordActivity.lambda$onCreate$25(ResetPasswordActivity, View)>
	//    4    8:return          
	}

	private final ResetPasswordActivity arg$1;

	private ResetPasswordActivity$$Lambda$1(ResetPasswordActivity resetpasswordactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = resetpasswordactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ResetPasswordActivity arg$1>
	//    5    9:return          
	}
}
