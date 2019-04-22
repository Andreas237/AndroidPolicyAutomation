// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.ResultReceiver;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			DigitsControllerImpl

class DigitsControllerImpl$1
	implements Runnable
{

	public void run()
	{
		resultReceiver.send(200, getBundle(val$phoneNumber));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DigitsControllerImpl this$0>
	//    2    4:getfield        #34  <Field ResultReceiver DigitsControllerImpl.resultReceiver>
	//    3    7:sipush          200
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field DigitsControllerImpl this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field String val$phoneNumber>
	//    8   18:invokevirtual   #38  <Method android.os.Bundle DigitsControllerImpl.getBundle(String)>
	//    9   21:invokevirtual   #44  <Method void ResultReceiver.send(int, android.os.Bundle)>
		CommonUtils.finishAffinity((Activity)val$context, 200);
	//   10   24:aload_0         
	//   11   25:getfield        #25  <Field Context val$context>
	//   12   28:checkcast       #46  <Class Activity>
	//   13   31:sipush          200
	//   14   34:invokestatic    #52  <Method void CommonUtils.finishAffinity(Activity, int)>
	//   15   37:return          
	}

	final DigitsControllerImpl this$0;
	final Context val$context;
	final String val$phoneNumber;

	DigitsControllerImpl$1()
	{
		this$0 = final_digitscontrollerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DigitsControllerImpl this$0>
		val$phoneNumber = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$phoneNumber>
		val$context = Context.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Context val$context>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
