// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			DigitsCallback, ConfirmationCodeController, DigitsSession, DigitsController

class ConfirmationCodeController$1 extends DigitsCallback
{

	public void success(Result result)
	{
		result = ((Result) (DigitsSession.create(result, ConfirmationCodeController.access$000(ConfirmationCodeController.this))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field ConfirmationCodeController this$0>
	//    3    5:invokestatic    #30  <Method String ConfirmationCodeController.access$000(ConfirmationCodeController)>
	//    4    8:invokestatic    #36  <Method DigitsSession DigitsSession.create(Result, String)>
	//    5   11:astore_1        
		ConfirmationCodeController confirmationcodecontroller = ConfirmationCodeController.this;
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field ConfirmationCodeController this$0>
	//    8   16:astore_2        
		confirmationcodecontroller.loginSuccess(val$context, ((DigitsSession) (result)), ConfirmationCodeController.access$000(confirmationcodecontroller));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #20  <Field Context val$context>
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #30  <Method String ConfirmationCodeController.access$000(ConfirmationCodeController)>
	//   15   27:invokevirtual   #40  <Method void ConfirmationCodeController.loginSuccess(Context, DigitsSession, String)>
	//   16   30:return          
	}

	final ConfirmationCodeController this$0;
	final Context val$context;

	ConfirmationCodeController$1(DigitsController digitscontroller, Context context2)
	{
		this$0 = final_confirmationcodecontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ConfirmationCodeController this$0>
		val$context = context2;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #20  <Field Context val$context>
		super(Context.this, digitscontroller);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:aload_3         
	//    9   14:invokespecial   #23  <Method void DigitsCallback(Context, DigitsController)>
	//   10   17:return          
	}
}
