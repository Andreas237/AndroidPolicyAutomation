// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.widget.EditText;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			AuthResponse, PhoneNumberController, DigitsCallback, StateButton, 
//			AuthConfig, DigitsController

class PhoneNumberController$1$1
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) ((AuthResponse)val$result.data));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Result val$result>
	//    2    4:getfield        #32  <Field Object Result.data>
	//    3    7:checkcast       #34  <Class AuthResponse>
	//    4   10:astore_1        
		PhoneNumberController phonenumbercontroller = this$0;
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field PhoneNumberController$1 this$1>
	//    7   15:getfield        #38  <Field PhoneNumberController PhoneNumberController$1.this$0>
	//    8   18:astore_2        
		if(((AuthResponse) (obj)).normalizedPhoneNumber == null)
	//*   9   19:aload_1         
	//*  10   20:getfield        #42  <Field String AuthResponse.normalizedPhoneNumber>
	//*  11   23:ifnonnull       40
			obj = ((Object) (phoneNumber));
	//   12   26:aload_0         
	//   13   27:getfield        #19  <Field PhoneNumberController$1 this$1>
	//   14   30:getfield        #38  <Field PhoneNumberController PhoneNumberController$1.this$0>
	//   15   33:getfield        #47  <Field String PhoneNumberController.phoneNumber>
	//   16   36:astore_1        
		else
	//*  17   37:goto            45
			obj = ((Object) (((AuthResponse) (obj)).normalizedPhoneNumber));
	//   18   40:aload_1         
	//   19   41:getfield        #42  <Field String AuthResponse.normalizedPhoneNumber>
	//   20   44:astore_1        
		phonenumbercontroller.phoneNumber = ((String) (obj));
	//   21   45:aload_2         
	//   22   46:aload_1         
	//   23   47:putfield        #47  <Field String PhoneNumberController.phoneNumber>
		startSignIn(val$context, (AuthResponse)val$result.data);
	//   24   50:aload_0         
	//   25   51:getfield        #19  <Field PhoneNumberController$1 this$1>
	//   26   54:getfield        #38  <Field PhoneNumberController PhoneNumberController$1.this$0>
	//   27   57:aload_0         
	//   28   58:getfield        #19  <Field PhoneNumberController$1 this$1>
	//   29   61:getfield        #51  <Field Context PhoneNumberController$1.val$context>
	//   30   64:aload_0         
	//   31   65:getfield        #21  <Field Result val$result>
	//   32   68:getfield        #32  <Field Object Result.data>
	//   33   71:checkcast       #34  <Class AuthResponse>
	//   34   74:invokevirtual   #55  <Method void PhoneNumberController.startSignIn(Context, AuthResponse)>
	//   35   77:return          
	}

	final PhoneNumberController._cls1 this$1;
	final Result val$result;

	PhoneNumberController$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PhoneNumberController$1 this$1>
		val$result = Result.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Result val$result>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/digits/sdk/android/PhoneNumberController$1

/* anonymous class */
	class PhoneNumberController._cls1 extends DigitsCallback
	{

		public void success(Result result1)
		{
			sendButton.showFinish();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field PhoneNumberController this$0>
		//    2    4:getfield        #32  <Field StateButton PhoneNumberController.sendButton>
		//    3    7:invokevirtual   #38  <Method void StateButton.showFinish()>
			AuthConfig authconfig = ((AuthResponse)result1.data).authConfig;
		//    4   10:aload_1         
		//    5   11:getfield        #44  <Field Object Result.data>
		//    6   14:checkcast       #46  <Class AuthResponse>
		//    7   17:getfield        #50  <Field AuthConfig AuthResponse.authConfig>
		//    8   20:astore_2        
			if(authconfig != null)
		//*   9   21:aload_2         
		//*  10   22:ifnull          36
				voiceEnabled = authconfig.isVoiceEnabled;
		//   11   25:aload_0         
		//   12   26:getfield        #20  <Field PhoneNumberController this$0>
		//   13   29:aload_2         
		//   14   30:getfield        #56  <Field boolean AuthConfig.isVoiceEnabled>
		//   15   33:putfield        #59  <Field boolean PhoneNumberController.voiceEnabled>
			editText.postDelayed(((Runnable) (((PhoneNumberController._cls1._cls1) (result1)). new PhoneNumberController._cls1._cls1())), 1500L);
		//   16   36:aload_0         
		//   17   37:getfield        #20  <Field PhoneNumberController this$0>
		//   18   40:getfield        #63  <Field EditText PhoneNumberController.editText>
		//   19   43:new             #12  <Class PhoneNumberController$1$1>
		//   20   46:dup             
		//   21   47:aload_0         
		//   22   48:aload_1         
		//   23   49:invokespecial   #66  <Method void PhoneNumberController$1$1(PhoneNumberController$1, Result)>
		//   24   52:ldc2w           #67  <Long 1500L>
		//   25   55:invokevirtual   #74  <Method boolean EditText.postDelayed(Runnable, long)>
		//   26   58:pop             
		//   27   59:return          
		}

		final PhoneNumberController this$0;
		final Context val$context;

			
			{
				this$0 = final_phonenumbercontroller;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field PhoneNumberController this$0>
				context = context2;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field Context val$context>
				super(Context.this, digitscontroller);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:aload_3         
			//    9   14:invokespecial   #25  <Method void DigitsCallback(Context, DigitsController)>
			//   10   17:return          
			}
	}

}
