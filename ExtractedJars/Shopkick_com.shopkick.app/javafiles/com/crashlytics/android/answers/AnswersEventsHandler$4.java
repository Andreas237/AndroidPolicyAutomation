// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventsHandler, SessionMetadataCollector, AnswersFilesManagerProvider, SessionAnalyticsFilesManager, 
//			EnabledSessionAnalyticsManagerStrategy

class AnswersEventsHandler$4
	implements Runnable
{

	public void run()
	{
		try
		{
			SessionEventMetadata sessioneventmetadata = AnswersEventsHandler.access$000(AnswersEventsHandler.this).getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnswersEventsHandler this$0>
	//    2    4:invokestatic    #27  <Method SessionMetadataCollector AnswersEventsHandler.access$000(AnswersEventsHandler)>
	//    3    7:invokevirtual   #33  <Method SessionEventMetadata SessionMetadataCollector.getMetadata()>
	//    4   10:astore_1        
			SessionAnalyticsFilesManager sessionanalyticsfilesmanager = AnswersEventsHandler.access$100(AnswersEventsHandler.this).getAnalyticsFilesManager();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field AnswersEventsHandler this$0>
	//    7   15:invokestatic    #37  <Method AnswersFilesManagerProvider AnswersEventsHandler.access$100(AnswersEventsHandler)>
	//    8   18:invokevirtual   #43  <Method SessionAnalyticsFilesManager AnswersFilesManagerProvider.getAnalyticsFilesManager()>
	//    9   21:astore_2        
			sessionanalyticsfilesmanager.registerRollOverListener(((io.fabric.sdk.android.services.events.EventsStorageListener) (AnswersEventsHandler.this)));
	//   10   22:aload_2         
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field AnswersEventsHandler this$0>
	//   13   27:invokevirtual   #49  <Method void SessionAnalyticsFilesManager.registerRollOverListener(io.fabric.sdk.android.services.events.EventsStorageListener)>
			strategy = ((SessionAnalyticsManagerStrategy) (new EnabledSessionAnalyticsManagerStrategy(AnswersEventsHandler.access$200(AnswersEventsHandler.this), AnswersEventsHandler.access$300(AnswersEventsHandler.this), executor, sessionanalyticsfilesmanager, AnswersEventsHandler.access$400(AnswersEventsHandler.this), sessioneventmetadata, AnswersEventsHandler.access$500(AnswersEventsHandler.this))));
	//   14   30:aload_0         
	//   15   31:getfield        #17  <Field AnswersEventsHandler this$0>
	//   16   34:new             #51  <Class EnabledSessionAnalyticsManagerStrategy>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:getfield        #17  <Field AnswersEventsHandler this$0>
	//   20   42:invokestatic    #55  <Method io.fabric.sdk.android.Kit AnswersEventsHandler.access$200(AnswersEventsHandler)>
	//   21   45:aload_0         
	//   22   46:getfield        #17  <Field AnswersEventsHandler this$0>
	//   23   49:invokestatic    #59  <Method android.content.Context AnswersEventsHandler.access$300(AnswersEventsHandler)>
	//   24   52:aload_0         
	//   25   53:getfield        #17  <Field AnswersEventsHandler this$0>
	//   26   56:getfield        #63  <Field java.util.concurrent.ScheduledExecutorService AnswersEventsHandler.executor>
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #17  <Field AnswersEventsHandler this$0>
	//   30   64:invokestatic    #67  <Method io.fabric.sdk.android.services.network.HttpRequestFactory AnswersEventsHandler.access$400(AnswersEventsHandler)>
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #17  <Field AnswersEventsHandler this$0>
	//   34   72:invokestatic    #71  <Method FirebaseAnalyticsApiAdapter AnswersEventsHandler.access$500(AnswersEventsHandler)>
	//   35   75:invokespecial   #74  <Method void EnabledSessionAnalyticsManagerStrategy(io.fabric.sdk.android.Kit, android.content.Context, java.util.concurrent.ScheduledExecutorService, SessionAnalyticsFilesManager, io.fabric.sdk.android.services.network.HttpRequestFactory, SessionEventMetadata, FirebaseAnalyticsApiAdapter)>
	//   36   78:putfield        #78  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
			return;
	//   37   81:return          
		}
		catch(Exception exception)
	//*  38   82:astore_1        
		{
			Fabric.getLogger().e("Answers", "Failed to enable events", ((Throwable) (exception)));
	//   39   83:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//   40   86:ldc1            #86  <String "Answers">
	//   41   88:ldc1            #88  <String "Failed to enable events">
	//   42   90:aload_1         
	//   43   91:invokeinterface #94  <Method void Logger.e(String, String, Throwable)>
		}
	//   44   96:return          
	}

	final AnswersEventsHandler this$0;

	AnswersEventsHandler$4()
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
