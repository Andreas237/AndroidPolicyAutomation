// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			DigitsCallback, PhoneNumberController, DeviceRegistrationResponse, AuthConfig, 
//			StateButton, DigitsController

class PhoneNumberController$2 extends DigitsCallback
{

	public void success(Result result)
	{
		Object obj = ((Object) ((DeviceRegistrationResponse)result.data));
	//    0    0:aload_1         
	//    1    1:getfield        #32  <Field Object Result.data>
	//    2    4:checkcast       #34  <Class DeviceRegistrationResponse>
	//    3    7:astore_2        
		Object obj1 = ((Object) (((DeviceRegistrationResponse) (obj)).authConfig));
	//    4    8:aload_2         
	//    5    9:getfield        #38  <Field AuthConfig DeviceRegistrationResponse.authConfig>
	//    6   12:astore_3        
		if(obj1 != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          28
			voiceEnabled = ((AuthConfig) (obj1)).isVoiceEnabled;
	//    9   17:aload_0         
	//   10   18:getfield        #18  <Field PhoneNumberController this$0>
	//   11   21:aload_3         
	//   12   22:getfield        #44  <Field boolean AuthConfig.isVoiceEnabled>
	//   13   25:putfield        #47  <Field boolean PhoneNumberController.voiceEnabled>
		obj1 = ((Object) (PhoneNumberController.this));
	//   14   28:aload_0         
	//   15   29:getfield        #18  <Field PhoneNumberController this$0>
	//   16   32:astore_3        
		if(((DeviceRegistrationResponse) (obj)).normalizedPhoneNumber == null)
	//*  17   33:aload_2         
	//*  18   34:getfield        #51  <Field String DeviceRegistrationResponse.normalizedPhoneNumber>
	//*  19   37:ifnonnull       51
			obj = ((Object) (phoneNumber));
	//   20   40:aload_0         
	//   21   41:getfield        #18  <Field PhoneNumberController this$0>
	//   22   44:getfield        #54  <Field String PhoneNumberController.phoneNumber>
	//   23   47:astore_2        
		else
	//*  24   48:goto            56
			obj = ((Object) (((DeviceRegistrationResponse) (obj)).normalizedPhoneNumber));
	//   25   51:aload_2         
	//   26   52:getfield        #51  <Field String DeviceRegistrationResponse.normalizedPhoneNumber>
	//   27   55:astore_2        
		obj1.phoneNumber = ((String) (obj));
	//   28   56:aload_3         
	//   29   57:aload_2         
	//   30   58:putfield        #54  <Field String PhoneNumberController.phoneNumber>
		sendButton.showFinish();
	//   31   61:aload_0         
	//   32   62:getfield        #18  <Field PhoneNumberController this$0>
	//   33   65:getfield        #58  <Field StateButton PhoneNumberController.sendButton>
	//   34   68:invokevirtual   #64  <Method void StateButton.showFinish()>
		PhoneNumberController.access$000(PhoneNumberController.this, val$context, (DeviceRegistrationResponse)result.data);
	//   35   71:aload_0         
	//   36   72:getfield        #18  <Field PhoneNumberController this$0>
	//   37   75:aload_0         
	//   38   76:getfield        #20  <Field Context val$context>
	//   39   79:aload_1         
	//   40   80:getfield        #32  <Field Object Result.data>
	//   41   83:checkcast       #34  <Class DeviceRegistrationResponse>
	//   42   86:invokestatic    #68  <Method void PhoneNumberController.access$000(PhoneNumberController, Context, DeviceRegistrationResponse)>
	//   43   89:return          
	}

	final PhoneNumberController this$0;
	final Context val$context;

	PhoneNumberController$2(DigitsController digitscontroller, Context context2)
	{
		this$0 = final_phonenumbercontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PhoneNumberController this$0>
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
