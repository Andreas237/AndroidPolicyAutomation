// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;

// Referenced classes of package com.pactforcure.app.ui:
//			SetPasswordActivity

final class SetPasswordActivity$$Lambda$3
	implements android.content.r
{

	public static android.content.r lambdaFactory$()
	{
		return ((android.content.r) (instance));
	//    0    0:getstatic       #15  <Field SetPasswordActivity$$Lambda$3 instance>
	//    1    3:areturn         
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		SetPasswordActivity.lambda$displaySetPasswordFailureDialog$39(dialoginterface, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #26  <Method void SetPasswordActivity.lambda$displaySetPasswordFailureDialog$39(DialogInterface, int)>
	//    3    5:return          
	}

	private static final SetPasswordActivity$$Lambda$3 instance = new SetPasswordActivity$$Lambda$3();

	static 
	{
	//    0    0:new             #2   <Class SetPasswordActivity$$Lambda$3>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void SetPasswordActivity$$Lambda$3()>
	//    3    7:putstatic       #15  <Field SetPasswordActivity$$Lambda$3 instance>
	//*   4   10:return          
	}

	private SetPasswordActivity$$Lambda$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
