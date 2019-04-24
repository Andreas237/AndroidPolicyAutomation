// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.pactforcure.app.ui:
//			SetPasswordActivity

final class SetPasswordActivity$$Lambda$2
	implements android.widget.r
{

	public static android.widget.r lambdaFactory$(SetPasswordActivity setpasswordactivity)
	{
		return ((android.widget.r) (new SetPasswordActivity$$Lambda$2(setpasswordactivity)));
	//    0    0:new             #2   <Class SetPasswordActivity$$Lambda$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void SetPasswordActivity$$Lambda$2(SetPasswordActivity)>
	//    4    8:areturn         
	}

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		return SetPasswordActivity.lambda$onCreate$37(arg$1, textview, i, keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SetPasswordActivity arg$1>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #28  <Method boolean SetPasswordActivity.lambda$onCreate$37(SetPasswordActivity, TextView, int, KeyEvent)>
	//    6   10:ireturn         
	}

	private final SetPasswordActivity arg$1;

	private SetPasswordActivity$$Lambda$2(SetPasswordActivity setpasswordactivity)
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
