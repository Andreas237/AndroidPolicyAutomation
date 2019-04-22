// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			DigitsClient, DigitsApiClient, Verification

class DigitsClient$1 extends llbackWrapper
{

	public void success(Result result)
	{
		((DigitsApiClient)result.data).getSdkService().auth(val$phoneNumber, val$verificationType.name(), callback);
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field Object Result.data>
	//    2    4:checkcast       #38  <Class DigitsApiClient>
	//    3    7:invokevirtual   #42  <Method DigitsApiClient$SdkService DigitsApiClient.getSdkService()>
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field String val$phoneNumber>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field Verification val$verificationType>
	//    8   18:invokevirtual   #48  <Method String Verification.name()>
	//    9   21:aload_0         
	//   10   22:getfield        #52  <Field Callback callback>
	//   11   25:invokeinterface #58  <Method void DigitsApiClient$SdkService.auth(String, String, Callback)>
	//   12   30:return          
	}

	final DigitsClient this$0;
	final String val$phoneNumber;
	final Verification val$verificationType;

	DigitsClient$1(Verification verification)
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
