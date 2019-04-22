// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			DigitsCallback, PinCodeController, DigitsSessionResponse, DigitsSession, 
//			DigitsController

class PinCodeController$1 extends DigitsCallback
{

	public void success(Result result)
	{
		result = ((Result) (DigitsSession.create((DigitsSessionResponse)result.data, PinCodeController.access$000(PinCodeController.this))));
	//    0    0:aload_1         
	//    1    1:getfield        #32  <Field Object Result.data>
	//    2    4:checkcast       #34  <Class DigitsSessionResponse>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field PinCodeController this$0>
	//    5   11:invokestatic    #38  <Method String PinCodeController.access$000(PinCodeController)>
	//    6   14:invokestatic    #44  <Method DigitsSession DigitsSession.create(DigitsSessionResponse, String)>
	//    7   17:astore_1        
		PinCodeController pincodecontroller = PinCodeController.this;
	//    8   18:aload_0         
	//    9   19:getfield        #18  <Field PinCodeController this$0>
	//   10   22:astore_2        
		pincodecontroller.loginSuccess(val$context, ((DigitsSession) (result)), PinCodeController.access$000(pincodecontroller));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field Context val$context>
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokestatic    #38  <Method String PinCodeController.access$000(PinCodeController)>
	//   17   33:invokevirtual   #48  <Method void PinCodeController.loginSuccess(Context, DigitsSession, String)>
	//   18   36:return          
	}

	final PinCodeController this$0;
	final Context val$context;

	PinCodeController$1(DigitsController digitscontroller, Context context2)
	{
		this$0 = final_pincodecontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PinCodeController this$0>
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
