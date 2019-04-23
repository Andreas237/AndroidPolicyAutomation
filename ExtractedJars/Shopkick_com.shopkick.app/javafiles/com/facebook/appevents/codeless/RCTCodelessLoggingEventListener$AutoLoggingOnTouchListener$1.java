// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

// Referenced classes of package com.facebook.appevents.codeless:
//			RCTCodelessLoggingEventListener

class RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener$1
	implements Runnable
{

	public void run()
	{
		AppEventsLogger.newLogger(FacebookSdk.getApplicationContext()).logEvent(val$eventName, val$params);
	//    0    0:invokestatic    #38  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #44  <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context)>
	//    2    6:aload_0         
	//    3    7:getfield        #26  <Field String val$eventName>
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field Bundle val$params>
	//    6   14:invokevirtual   #47  <Method void AppEventsLogger.logEvent(String, Bundle)>
	//    7   17:return          
	}

	final RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener this$0;
	final String val$eventName;
	final Bundle val$params;

	RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener$1()
	{
		this$0 = final_autologgingontouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener this$0>
		val$eventName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String val$eventName>
		val$params = Bundle.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Bundle val$params>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
