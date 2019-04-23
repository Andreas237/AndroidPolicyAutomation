// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventsHandler, DisabledSessionAnalyticsManagerStrategy, SessionAnalyticsManagerStrategy

class AnswersEventsHandler$2
	implements Runnable
{

	public void run()
	{
		try
		{
			SessionAnalyticsManagerStrategy sessionanalyticsmanagerstrategy = strategy;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnswersEventsHandler this$0>
	//    2    4:getfield        #27  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
	//    3    7:astore_1        
			strategy = ((SessionAnalyticsManagerStrategy) (new DisabledSessionAnalyticsManagerStrategy()));
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field AnswersEventsHandler this$0>
	//    6   12:new             #29  <Class DisabledSessionAnalyticsManagerStrategy>
	//    7   15:dup             
	//    8   16:invokespecial   #30  <Method void DisabledSessionAnalyticsManagerStrategy()>
	//    9   19:putfield        #27  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
			sessionanalyticsmanagerstrategy.deleteAllEvents();
	//   10   22:aload_1         
	//   11   23:invokeinterface #35  <Method void SessionAnalyticsManagerStrategy.deleteAllEvents()>
			return;
	//   12   28:return          
		}
		catch(Exception exception)
	//*  13   29:astore_1        
		{
			Fabric.getLogger().e("Answers", "Failed to disable events", ((Throwable) (exception)));
	//   14   30:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//   15   33:ldc1            #43  <String "Answers">
	//   16   35:ldc1            #45  <String "Failed to disable events">
	//   17   37:aload_1         
	//   18   38:invokeinterface #51  <Method void Logger.e(String, String, Throwable)>
		}
	//   19   43:return          
	}

	final AnswersEventsHandler this$0;

	AnswersEventsHandler$2()
	{
		this$0 = AnswersEventsHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AnswersEventsHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
