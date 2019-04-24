// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventsHandler, SessionAnalyticsManagerStrategy

class AnswersEventsHandler$6
	implements Runnable
{

	public void run()
	{
		try
		{
			strategy.processEvent(val$eventBuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnswersEventsHandler this$0>
	//    2    4:getfield        #36  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field SessionEvent$Builder val$eventBuilder>
	//    5   11:invokeinterface #41  <Method void SessionAnalyticsManagerStrategy.processEvent(SessionEvent$Builder)>
			if(val$flush)
	//*   6   16:aload_0         
	//*   7   17:getfield        #25  <Field boolean val$flush>
	//*   8   20:ifeq            36
				strategy.rollFileOver();
	//    9   23:aload_0         
	//   10   24:getfield        #21  <Field AnswersEventsHandler this$0>
	//   11   27:getfield        #36  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
	//   12   30:invokeinterface #45  <Method boolean SessionAnalyticsManagerStrategy.rollFileOver()>
	//   13   35:pop             
			return;
	//   14   36:return          
		}
		catch(Exception exception)
	//*  15   37:astore_1        
		{
			Fabric.getLogger().e("Answers", "Failed to process event", ((Throwable) (exception)));
	//   16   38:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   17   41:ldc1            #53  <String "Answers">
	//   18   43:ldc1            #55  <String "Failed to process event">
	//   19   45:aload_1         
	//   20   46:invokeinterface #61  <Method void Logger.e(String, String, Throwable)>
		}
	//   21   51:return          
	}

	final AnswersEventsHandler this$0;
	final SessionEvent.Builder val$eventBuilder;
	final boolean val$flush;

	AnswersEventsHandler$6()
	{
		this$0 = final_answerseventshandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AnswersEventsHandler this$0>
		val$eventBuilder = builder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field SessionEvent$Builder val$eventBuilder>
		val$flush = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field boolean val$flush>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
