// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			DigitsClient, DigitsApiClient

class DigitsClient$2 extends llbackWrapper
{

	public void success(Result result)
	{
		((DigitsApiClient)result.data).getSdkService().account(val$phoneNumber, val$pin, callback);
	//    0    0:aload_1         
	//    1    1:getfield        #35  <Field Object Result.data>
	//    2    4:checkcast       #37  <Class DigitsApiClient>
	//    3    7:invokevirtual   #41  <Method DigitsApiClient$SdkService DigitsApiClient.getSdkService()>
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field String val$phoneNumber>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field String val$pin>
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field Callback callback>
	//   10   22:invokeinterface #50  <Method void DigitsApiClient$SdkService.account(String, String, Callback)>
	//   11   27:return          
	}

	final DigitsClient this$0;
	final String val$phoneNumber;
	final String val$pin;

	DigitsClient$2(String s1)
	{
		this$0 = final_digitsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DigitsClient this$0>
		val$phoneNumber = String.this;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field String val$phoneNumber>
		val$pin = s1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #23  <Field String val$pin>
		super(final_callback);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #26  <Method void DigitsClient$CallbackWrapper(Callback)>
	//   12   21:return          
	}
}
