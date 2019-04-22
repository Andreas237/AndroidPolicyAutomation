// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			DigitsCallback, LoginCodeController, DigitsSessionResponse, DigitsSession, 
//			DigitsController

class LoginCodeController$1 extends DigitsCallback
{

	public void success(Result result)
	{
		if(((DigitsSessionResponse)result.data).isEmpty())
	//*   0    0:aload_1         
	//*   1    1:getfield        #32  <Field Object Result.data>
	//*   2    4:checkcast       #34  <Class DigitsSessionResponse>
	//*   3    7:invokevirtual   #38  <Method boolean DigitsSessionResponse.isEmpty()>
	//*   4   10:ifeq            25
		{
			LoginCodeController.access$000(LoginCodeController.this, val$context);
	//    5   13:aload_0         
	//    6   14:getfield        #18  <Field LoginCodeController this$0>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field Context val$context>
	//    9   21:invokestatic    #42  <Method void LoginCodeController.access$000(LoginCodeController, Context)>
			return;
	//   10   24:return          
		} else
		{
			result = ((Result) (DigitsSession.create((DigitsSessionResponse)result.data, LoginCodeController.access$100(LoginCodeController.this))));
	//   11   25:aload_1         
	//   12   26:getfield        #32  <Field Object Result.data>
	//   13   29:checkcast       #34  <Class DigitsSessionResponse>
	//   14   32:aload_0         
	//   15   33:getfield        #18  <Field LoginCodeController this$0>
	//   16   36:invokestatic    #46  <Method String LoginCodeController.access$100(LoginCodeController)>
	//   17   39:invokestatic    #52  <Method DigitsSession DigitsSession.create(DigitsSessionResponse, String)>
	//   18   42:astore_1        
			LoginCodeController logincodecontroller = LoginCodeController.this;
	//   19   43:aload_0         
	//   20   44:getfield        #18  <Field LoginCodeController this$0>
	//   21   47:astore_2        
			logincodecontroller.loginSuccess(val$context, ((DigitsSession) (result)), LoginCodeController.access$100(logincodecontroller));
	//   22   48:aload_2         
	//   23   49:aload_0         
	//   24   50:getfield        #20  <Field Context val$context>
	//   25   53:aload_1         
	//   26   54:aload_2         
	//   27   55:invokestatic    #46  <Method String LoginCodeController.access$100(LoginCodeController)>
	//   28   58:invokevirtual   #56  <Method void LoginCodeController.loginSuccess(Context, DigitsSession, String)>
			return;
	//   29   61:return          
		}
	}

	final LoginCodeController this$0;
	final Context val$context;

	LoginCodeController$1(DigitsController digitscontroller, Context context2)
	{
		this$0 = final_logincodecontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field LoginCodeController this$0>
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
