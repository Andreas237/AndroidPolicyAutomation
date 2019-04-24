// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.util;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

// Referenced classes of package com.pactforcure.app.util:
//			DialogUtils

final class DialogUtils$$Lambda$1
	implements android.content.Listener
{

	public static android.content.Listener lambdaFactory$(AlertDialog alertdialog)
	{
		return ((android.content.Listener) (new DialogUtils$$Lambda$1(alertdialog)));
	//    0    0:new             #2   <Class DialogUtils$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void DialogUtils$$Lambda$1(AlertDialog)>
	//    4    8:areturn         
	}

	public void onShow(DialogInterface dialoginterface)
	{
		DialogUtils.lambda$boldPositiveAndNegativeButtons$57(arg$1, dialoginterface);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AlertDialog arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void DialogUtils.lambda$boldPositiveAndNegativeButtons$57(AlertDialog, DialogInterface)>
	//    4    8:return          
	}

	private final AlertDialog arg$1;

	private DialogUtils$$Lambda$1(AlertDialog alertdialog)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = alertdialog;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field AlertDialog arg$1>
	//    5    9:return          
	}
}
