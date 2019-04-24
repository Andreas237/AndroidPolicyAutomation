// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;

// Referenced classes of package com.pactforcure.app.ui:
//			FormActivity

final class FormActivity$$Lambda$1
	implements android.content.Listener
{

	public static android.content.Listener lambdaFactory$(FormActivity formactivity)
	{
		return ((android.content.Listener) (new FormActivity$$Lambda$1(formactivity)));
	//    0    0:new             #2   <Class FormActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void FormActivity$$Lambda$1(FormActivity)>
	//    4    8:areturn         
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		FormActivity.lambda$onOptionsItemSelected$3(arg$1, dialoginterface, i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FormActivity arg$1>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #28  <Method void FormActivity.lambda$onOptionsItemSelected$3(FormActivity, DialogInterface, int)>
	//    5    9:return          
	}

	private final FormActivity arg$1;

	private FormActivity$$Lambda$1(FormActivity formactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = formactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field FormActivity arg$1>
	//    5    9:return          
	}
}
