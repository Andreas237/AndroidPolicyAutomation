// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;

// Referenced classes of package com.pactforcure.app.ui:
//			LoginActivity

final class LoginActivity$$Lambda$4
	implements android.content.istener
{

	public static android.content.istener lambdaFactory$()
	{
		return ((android.content.istener) (instance));
	//    0    0:getstatic       #15  <Field LoginActivity$$Lambda$4 instance>
	//    1    3:areturn         
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		LoginActivity.lambda$displayLoginFailureDialog$18(dialoginterface, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #26  <Method void LoginActivity.lambda$displayLoginFailureDialog$18(DialogInterface, int)>
	//    3    5:return          
	}

	private static final LoginActivity$$Lambda$4 instance = new LoginActivity$$Lambda$4();

	static 
	{
	//    0    0:new             #2   <Class LoginActivity$$Lambda$4>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void LoginActivity$$Lambda$4()>
	//    3    7:putstatic       #15  <Field LoginActivity$$Lambda$4 instance>
	//*   4   10:return          
	}

	private LoginActivity$$Lambda$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
