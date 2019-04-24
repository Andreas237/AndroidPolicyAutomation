// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventsHandler, SessionAnalyticsManagerStrategy

class AnswersEventsHandler$3
	implements Runnable
{

	public void run()
	{
		try
		{
			strategy.sendEvents();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnswersEventsHandler this$0>
	//    2    4:getfield        #28  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
	//    3    7:invokeinterface #33  <Method void SessionAnalyticsManagerStrategy.sendEvents()>
			return;
	//    4   12:return          
		}
		catch(Exception exception)
	//*   5   13:astore_1        
		{
			Fabric.getLogger().e("Answers", "Failed to send events files", ((Throwable) (exception)));
	//    6   14:invokestatic    #39  <Method Logger Fabric.getLogger()>
	//    7   17:ldc1            #41  <String "Answers">
	//    8   19:ldc1            #43  <String "Failed to send events files">
	//    9   21:aload_1         
	//   10   22:invokeinterface #49  <Method void Logger.e(String, String, Throwable)>
		}
	//   11   27:return          
	}

	final AnswersEventsHandler this$0;

	AnswersEventsHandler$3()
	{
		this$0 = AnswersEventsHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AnswersEventsHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
