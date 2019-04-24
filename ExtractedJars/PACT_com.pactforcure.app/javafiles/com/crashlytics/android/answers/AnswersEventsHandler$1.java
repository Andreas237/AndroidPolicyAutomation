// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventsHandler, SessionAnalyticsManagerStrategy

class AnswersEventsHandler$1
	implements Runnable
{

	public void run()
	{
		try
		{
			strategy.setAnalyticsSettingsData(val$analyticsSettingsData, val$protocolAndHostOverride);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnswersEventsHandler this$0>
	//    2    4:getfield        #36  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field AnalyticsSettingsData val$analyticsSettingsData>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field String val$protocolAndHostOverride>
	//    7   15:invokeinterface #39  <Method void SessionAnalyticsManagerStrategy.setAnalyticsSettingsData(AnalyticsSettingsData, String)>
			return;
	//    8   20:return          
		}
		catch(Exception exception)
	//*   9   21:astore_1        
		{
			Fabric.getLogger().e("Answers", "Failed to set analytics settings data", ((Throwable) (exception)));
	//   10   22:invokestatic    #45  <Method Logger Fabric.getLogger()>
	//   11   25:ldc1            #47  <String "Answers">
	//   12   27:ldc1            #49  <String "Failed to set analytics settings data">
	//   13   29:aload_1         
	//   14   30:invokeinterface #55  <Method void Logger.e(String, String, Throwable)>
		}
	//   15   35:return          
	}

	final AnswersEventsHandler this$0;
	final AnalyticsSettingsData val$analyticsSettingsData;
	final String val$protocolAndHostOverride;

	AnswersEventsHandler$1()
	{
		this$0 = final_answerseventshandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AnswersEventsHandler this$0>
		val$analyticsSettingsData = analyticssettingsdata;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AnalyticsSettingsData val$analyticsSettingsData>
		val$protocolAndHostOverride = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$protocolAndHostOverride>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
