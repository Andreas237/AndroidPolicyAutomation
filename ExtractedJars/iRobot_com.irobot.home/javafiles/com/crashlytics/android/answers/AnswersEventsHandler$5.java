// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import b.a.a.a.c;
import b.a.a.a.l;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventsHandler, SessionAnalyticsManagerStrategy

class AnswersEventsHandler$5
	implements Runnable
{

	public void run()
	{
		try
		{
			strategy.rollFileOver();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnswersEventsHandler this$0>
	//    2    4:getfield        #27  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
	//    3    7:invokeinterface #33  <Method boolean SessionAnalyticsManagerStrategy.rollFileOver()>
	//    4   12:pop             
			return;
	//    5   13:return          
		}
		catch(Exception exception)
	//*   6   14:astore_1        
		{
			c.g().e("Answers", "Failed to flush events", ((Throwable) (exception)));
	//    7   15:invokestatic    #39  <Method l c.g()>
	//    8   18:ldc1            #41  <String "Answers">
	//    9   20:ldc1            #43  <String "Failed to flush events">
	//   10   22:aload_1         
	//   11   23:invokeinterface #49  <Method void l.e(String, String, Throwable)>
		}
	//   12   28:return          
	}

	final AnswersEventsHandler this$0;

	AnswersEventsHandler$5()
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
