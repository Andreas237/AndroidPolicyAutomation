// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;

// Referenced classes of package com.digits.sdk.android:
//			DigitsClient, DigitsApiClient

class DigitsClient$3 extends llbackWrapper
{

	public void success(Result result)
	{
		((DigitsApiClient)result.data).getSdkService().login(val$requestId, val$userId, val$code, callback);
	//    0    0:aload_1         
	//    1    1:getfield        #39  <Field Object Result.data>
	//    2    4:checkcast       #41  <Class DigitsApiClient>
	//    3    7:invokevirtual   #45  <Method DigitsApiClient$SdkService DigitsApiClient.getSdkService()>
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field String val$requestId>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field long val$userId>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field String val$code>
	//   10   22:aload_0         
	//   11   23:getfield        #49  <Field Callback callback>
	//   12   26:invokeinterface #54  <Method void DigitsApiClient$SdkService.login(String, long, String, Callback)>
	//   13   31:return          
	}

	final DigitsClient this$0;
	final String val$code;
	final String val$requestId;
	final long val$userId;

	DigitsClient$3(String s1)
	{
		this$0 = final_digitsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DigitsClient this$0>
		val$requestId = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field String val$requestId>
		val$userId = J.this;
	//    6   10:aload_0         
	//    7   11:lload           4
	//    8   13:putfield        #25  <Field long val$userId>
		val$code = s1;
	//    9   16:aload_0         
	//   10   17:aload           6
	//   11   19:putfield        #27  <Field String val$code>
		super(final_callback);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #30  <Method void DigitsClient$CallbackWrapper(Callback)>
	//   15   27:return          
	}
}
