// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.util;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.widget.Button;

public class DialogUtils
{

	public DialogUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static void boldButtonIfItExists(AlertDialog alertdialog, int i)
	{
		alertdialog = ((AlertDialog) (alertdialog.getButton(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #17  <Method Button AlertDialog.getButton(int)>
	//    3    5:astore_0        
		if(alertdialog != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          18
			((Button) (alertdialog)).setTypeface(Typeface.DEFAULT, 1);
	//    6   10:aload_0         
	//    7   11:getstatic       #23  <Field Typeface Typeface.DEFAULT>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #29  <Method void Button.setTypeface(Typeface, int)>
	//   10   18:return          
	}

	public static void boldPositiveAndNegativeButtons(AlertDialog alertdialog)
	{
		class .Lambda._cls1
			implements android.content.DialogInterface.OnShowListener
		{

			public static android.content.DialogInterface.OnShowListener lambdaFactory$(AlertDialog alertdialog1)
			{
				return ((android.content.DialogInterface.OnShowListener) (new .Lambda._cls1(alertdialog1)));
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

			private .Lambda._cls1(AlertDialog alertdialog)
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

		alertdialog.setOnShowListener(.Lambda._cls1.lambdaFactory.(alertdialog));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #37  <Method android.content.DialogInterface$OnShowListener DialogUtils$$Lambda$1.lambdaFactory$(AlertDialog)>
	//    3    5:invokevirtual   #41  <Method void AlertDialog.setOnShowListener(android.content.DialogInterface$OnShowListener)>
	//    4    8:return          
	}

	static void lambda$boldPositiveAndNegativeButtons$57(AlertDialog alertdialog, DialogInterface dialoginterface)
	{
		boldButtonIfItExists(alertdialog, -2);
	//    0    0:aload_0         
	//    1    1:bipush          -2
	//    2    3:invokestatic    #45  <Method void boldButtonIfItExists(AlertDialog, int)>
		boldButtonIfItExists(alertdialog, -1);
	//    3    6:aload_0         
	//    4    7:iconst_m1       
	//    5    8:invokestatic    #45  <Method void boldButtonIfItExists(AlertDialog, int)>
	//    6   11:return          
	}
}
