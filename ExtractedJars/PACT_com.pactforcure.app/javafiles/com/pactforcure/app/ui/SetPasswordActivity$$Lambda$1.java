// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			SetPasswordActivity

final class SetPasswordActivity$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(SetPasswordActivity setpasswordactivity)
	{
		return ((android.view.View.OnClickListener) (new SetPasswordActivity$$Lambda$1(setpasswordactivity)));
	//    0    0:new             #2   <Class SetPasswordActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void SetPasswordActivity$$Lambda$1(SetPasswordActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		SetPasswordActivity.lambda$onCreate$36(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SetPasswordActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void SetPasswordActivity.lambda$onCreate$36(SetPasswordActivity, View)>
	//    4    8:return          
	}

	private final SetPasswordActivity arg$1;

	private SetPasswordActivity$$Lambda$1(SetPasswordActivity setpasswordactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = setpasswordactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SetPasswordActivity arg$1>
	//    5    9:return          
	}
}
