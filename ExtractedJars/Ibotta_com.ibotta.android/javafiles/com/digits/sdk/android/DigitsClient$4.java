// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import java.util.Locale;

// Referenced classes of package com.digits.sdk.android:
//			DigitsClient, DigitsApiClient, Verification

class DigitsClient$4 extends llbackWrapper
{

	public void success(Result result)
	{
		((DigitsApiClient)result.data).getDeviceService().register(val$phoneNumber, "third_party_confirmation_code", Boolean.valueOf(true), Locale.getDefault().getLanguage(), "digits_sdk", val$verificationType.name(), callback);
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field Object Result.data>
	//    2    4:checkcast       #38  <Class DigitsApiClient>
	//    3    7:invokevirtual   #42  <Method DigitsApiClient$DeviceService DigitsApiClient.getDeviceService()>
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field String val$phoneNumber>
	//    6   14:ldc1            #44  <String "third_party_confirmation_code">
	//    7   16:iconst_1        
	//    8   17:invokestatic    #50  <Method Boolean Boolean.valueOf(boolean)>
	//    9   20:invokestatic    #56  <Method Locale Locale.getDefault()>
	//   10   23:invokevirtual   #60  <Method String Locale.getLanguage()>
	//   11   26:ldc1            #62  <String "digits_sdk">
	//   12   28:aload_0         
	//   13   29:getfield        #24  <Field Verification val$verificationType>
	//   14   32:invokevirtual   #67  <Method String Verification.name()>
	//   15   35:aload_0         
	//   16   36:getfield        #71  <Field Callback callback>
	//   17   39:invokeinterface #77  <Method void DigitsApiClient$DeviceService.register(String, String, Boolean, String, String, String, Callback)>
	//   18   44:return          
	}

	final DigitsClient this$0;
	final String val$phoneNumber;
	final Verification val$verificationType;

	DigitsClient$4(Verification verification)
	{
		this$0 = final_digitsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field DigitsClient this$0>
		val$phoneNumber = String.this;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field String val$phoneNumber>
		val$verificationType = verification;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #24  <Field Verification val$verificationType>
		super(final_callback);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #27  <Method void DigitsClient$CallbackWrapper(Callback)>
	//   12   21:return          
	}
}
