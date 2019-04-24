// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;

final class SetPasswordActivity$1$$Lambda$1
	implements android.content.DialogInterface$OnClickListener
{

	public static android.content.DialogInterface$OnClickListener lambdaFactory$(SetPasswordActivity._cls1 _pcls1)
	{
		return ((android.content.DialogInterface$OnClickListener) (new SetPasswordActivity$1$$Lambda$1(_pcls1)));
	//    0    0:new             #2   <Class SetPasswordActivity$1$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void SetPasswordActivity$1$$Lambda$1(SetPasswordActivity$1)>
	//    4    8:areturn         
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		SetPasswordActivity._cls1.lambda$onResponse$38(arg$1, dialoginterface, i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SetPasswordActivity$1 arg$1>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #28  <Method void SetPasswordActivity$1.lambda$onResponse$38(SetPasswordActivity$1, DialogInterface, int)>
	//    5    9:return          
	}

	private final SetPasswordActivity._cls1 arg$1;

	private SetPasswordActivity$1$$Lambda$1(SetPasswordActivity._cls1 _pcls1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = _pcls1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SetPasswordActivity$1 arg$1>
	//    5    9:return          
	}
}
