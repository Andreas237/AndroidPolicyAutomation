// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import b.a.a.a.a.d.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.g.b;
import b.a.a.a.*;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//			DisabledSessionAnalyticsManagerStrategy, AnswersFilesManagerProvider, FirebaseAnalyticsApiAdapter, SessionMetadataCollector, 
//			SessionAnalyticsManagerStrategy, SessionAnalyticsFilesManager, EnabledSessionAnalyticsManagerStrategy

class AnswersEventsHandler
	implements d
{

	public AnswersEventsHandler(i i, Context context1, AnswersFilesManagerProvider answersfilesmanagerprovider, SessionMetadataCollector sessionmetadatacollector, e e, ScheduledExecutorService scheduledexecutorservice, FirebaseAnalyticsApiAdapter firebaseanalyticsapiadapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		strategy = ((SessionAnalyticsManagerStrategy) (new DisabledSessionAnalyticsManagerStrategy()));
	//    2    4:aload_0         
	//    3    5:new             #41  <Class DisabledSessionAnalyticsManagerStrategy>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void DisabledSessionAnalyticsManagerStrategy()>
	//    6   12:putfield        #44  <Field SessionAnalyticsManagerStrategy strategy>
		kit = i;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #46  <Field i kit>
		context = context1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #48  <Field Context context>
		filesManagerProvider = answersfilesmanagerprovider;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #50  <Field AnswersFilesManagerProvider filesManagerProvider>
		metadataCollector = sessionmetadatacollector;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #52  <Field SessionMetadataCollector metadataCollector>
		requestFactory = e;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #54  <Field e requestFactory>
		executor = scheduledexecutorservice;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #56  <Field ScheduledExecutorService executor>
		firebaseAnalyticsApiAdapter = firebaseanalyticsapiadapter;
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:putfield        #58  <Field FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter>
	//   28   54:return          
	}

	private void executeAsync(Runnable runnable)
	{
		try
		{
			executor.submit(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ScheduledExecutorService executor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method Future ScheduledExecutorService.submit(Runnable)>
	//    4   10:pop             
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Runnable runnable)
	//*   6   12:astore_1        
		{
			c.g().e("Answers", "Failed to submit events task", ((Throwable) (runnable)));
	//    7   13:invokestatic    #87  <Method l c.g()>
	//    8   16:ldc1            #89  <String "Answers">
	//    9   18:ldc1            #91  <String "Failed to submit events task">
	//   10   20:aload_1         
	//   11   21:invokeinterface #97  <Method void l.e(String, String, Throwable)>
		}
	//   12   26:return          
	}

	private void executeSync(Runnable runnable)
	{
		try
		{
			executor.submit(runnable).get();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ScheduledExecutorService executor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method Future ScheduledExecutorService.submit(Runnable)>
	//    4   10:invokeinterface #104 <Method Object Future.get()>
	//    5   15:pop             
			return;
	//    6   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(Runnable runnable)
	//*   7   17:astore_1        
		{
			c.g().e("Answers", "Failed to run events task", ((Throwable) (runnable)));
	//    8   18:invokestatic    #87  <Method l c.g()>
	//    9   21:ldc1            #89  <String "Answers">
	//   10   23:ldc1            #106 <String "Failed to run events task">
	//   11   25:aload_1         
	//   12   26:invokeinterface #97  <Method void l.e(String, String, Throwable)>
		}
	//   13   31:return          
	}

	public void disable()
	{
		executeAsync(new Runnable() {

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
					c.g().e("Answers", "Failed to disable events", ((Throwable) (exception)));
			//   14   30:invokestatic    #41  <Method l c.g()>
			//   15   33:ldc1            #43  <String "Answers">
			//   16   35:ldc1            #45  <String "Failed to disable events">
			//   17   37:aload_1         
			//   18   38:invokeinterface #51  <Method void l.e(String, String, Throwable)>
				}
			//   19   43:return          
			}

			final AnswersEventsHandler this$0;

			
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
);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class AnswersEventsHandler$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #110 <Method void AnswersEventsHandler$2(AnswersEventsHandler)>
	//    5    9:invokespecial   #112 <Method void executeAsync(Runnable)>
	//    6   12:return          
	}

	public void enable()
	{
		executeAsync(new Runnable() {

			public void run()
			{
				try
				{
					SessionEventMetadata sessioneventmetadata = metadataCollector.getMetadata();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AnswersEventsHandler this$0>
			//    2    4:invokestatic    #27  <Method SessionMetadataCollector AnswersEventsHandler.access$000(AnswersEventsHandler)>
			//    3    7:invokevirtual   #33  <Method SessionEventMetadata SessionMetadataCollector.getMetadata()>
			//    4   10:astore_1        
					SessionAnalyticsFilesManager sessionanalyticsfilesmanager = filesManagerProvider.getAnalyticsFilesManager();
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field AnswersEventsHandler this$0>
			//    7   15:invokestatic    #37  <Method AnswersFilesManagerProvider AnswersEventsHandler.access$100(AnswersEventsHandler)>
			//    8   18:invokevirtual   #43  <Method SessionAnalyticsFilesManager AnswersFilesManagerProvider.getAnalyticsFilesManager()>
			//    9   21:astore_2        
					sessionanalyticsfilesmanager.registerRollOverListener(((d) (AnswersEventsHandler.this)));
			//   10   22:aload_2         
			//   11   23:aload_0         
			//   12   24:getfield        #17  <Field AnswersEventsHandler this$0>
			//   13   27:invokevirtual   #49  <Method void SessionAnalyticsFilesManager.registerRollOverListener(d)>
					strategy = ((SessionAnalyticsManagerStrategy) (new EnabledSessionAnalyticsManagerStrategy(kit, context, executor, sessionanalyticsfilesmanager, requestFactory, sessioneventmetadata, firebaseAnalyticsApiAdapter)));
			//   14   30:aload_0         
			//   15   31:getfield        #17  <Field AnswersEventsHandler this$0>
			//   16   34:new             #51  <Class EnabledSessionAnalyticsManagerStrategy>
			//   17   37:dup             
			//   18   38:aload_0         
			//   19   39:getfield        #17  <Field AnswersEventsHandler this$0>
			//   20   42:invokestatic    #55  <Method i AnswersEventsHandler.access$200(AnswersEventsHandler)>
			//   21   45:aload_0         
			//   22   46:getfield        #17  <Field AnswersEventsHandler this$0>
			//   23   49:invokestatic    #59  <Method Context AnswersEventsHandler.access$300(AnswersEventsHandler)>
			//   24   52:aload_0         
			//   25   53:getfield        #17  <Field AnswersEventsHandler this$0>
			//   26   56:getfield        #63  <Field ScheduledExecutorService AnswersEventsHandler.executor>
			//   27   59:aload_2         
			//   28   60:aload_0         
			//   29   61:getfield        #17  <Field AnswersEventsHandler this$0>
			//   30   64:invokestatic    #67  <Method e AnswersEventsHandler.access$400(AnswersEventsHandler)>
			//   31   67:aload_1         
			//   32   68:aload_0         
			//   33   69:getfield        #17  <Field AnswersEventsHandler this$0>
			//   34   72:invokestatic    #71  <Method FirebaseAnalyticsApiAdapter AnswersEventsHandler.access$500(AnswersEventsHandler)>
			//   35   75:invokespecial   #74  <Method void EnabledSessionAnalyticsManagerStrategy(i, Context, ScheduledExecutorService, SessionAnalyticsFilesManager, e, SessionEventMetadata, FirebaseAnalyticsApiAdapter)>
			//   36   78:putfield        #78  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
					return;
			//   37   81:return          
				}
				catch(Exception exception)
			//*  38   82:astore_1        
				{
					c.g().e("Answers", "Failed to enable events", ((Throwable) (exception)));
			//   39   83:invokestatic    #84  <Method l c.g()>
			//   40   86:ldc1            #86  <String "Answers">
			//   41   88:ldc1            #88  <String "Failed to enable events">
			//   42   90:aload_1         
			//   43   91:invokeinterface #94  <Method void l.e(String, String, Throwable)>
				}
			//   44   96:return          
			}

			final AnswersEventsHandler this$0;

			
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
);
	//    0    0:aload_0         
	//    1    1:new             #14  <Class AnswersEventsHandler$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #114 <Method void AnswersEventsHandler$4(AnswersEventsHandler)>
	//    5    9:invokespecial   #112 <Method void executeAsync(Runnable)>
	//    6   12:return          
	}

	public void flushEvents()
	{
		executeAsync(new Runnable() {

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
);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class AnswersEventsHandler$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #116 <Method void AnswersEventsHandler$5(AnswersEventsHandler)>
	//    5    9:invokespecial   #112 <Method void executeAsync(Runnable)>
	//    6   12:return          
	}

	public void onRollOver(String s)
	{
		executeAsync(new Runnable() {

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
					c.g().e("Answers", "Failed to send events files", ((Throwable) (exception)));
			//    6   14:invokestatic    #39  <Method l c.g()>
			//    7   17:ldc1            #41  <String "Answers">
			//    8   19:ldc1            #43  <String "Failed to send events files">
			//    9   21:aload_1         
			//   10   22:invokeinterface #49  <Method void l.e(String, String, Throwable)>
				}
			//   11   27:return          
			}

			final AnswersEventsHandler this$0;

			
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
);
	//    0    0:aload_0         
	//    1    1:new             #12  <Class AnswersEventsHandler$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #119 <Method void AnswersEventsHandler$3(AnswersEventsHandler)>
	//    5    9:invokespecial   #112 <Method void executeAsync(Runnable)>
	//    6   12:return          
	}

	void processEvent(final SessionEvent.Builder eventBuilder, boolean flag, final boolean flush)
	{
		eventBuilder = ((SessionEvent.Builder) (new Runnable() {

			public void run()
			{
				try
				{
					strategy.processEvent(eventBuilder);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AnswersEventsHandler this$0>
			//    2    4:getfield        #36  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field SessionEvent$Builder val$eventBuilder>
			//    5   11:invokeinterface #41  <Method void SessionAnalyticsManagerStrategy.processEvent(SessionEvent$Builder)>
					if(flush)
			//*   6   16:aload_0         
			//*   7   17:getfield        #25  <Field boolean val$flush>
			//*   8   20:ifeq            51
					{
						strategy.rollFileOver();
			//    9   23:aload_0         
			//   10   24:getfield        #21  <Field AnswersEventsHandler this$0>
			//   11   27:getfield        #36  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
			//   12   30:invokeinterface #45  <Method boolean SessionAnalyticsManagerStrategy.rollFileOver()>
			//   13   35:pop             
						return;
			//   14   36:return          
					}
				}
				catch(Exception exception)
			//*  15   37:astore_1        
				{
					c.g().e("Answers", "Failed to process event", ((Throwable) (exception)));
			//   16   38:invokestatic    #51  <Method l c.g()>
			//   17   41:ldc1            #53  <String "Answers">
			//   18   43:ldc1            #55  <String "Failed to process event">
			//   19   45:aload_1         
			//   20   46:invokeinterface #61  <Method void l.e(String, String, Throwable)>
				}
			//   21   51:return          
			}

			final AnswersEventsHandler this$0;
			final SessionEvent.Builder val$eventBuilder;
			final boolean val$flush;

			
			{
				this$0 = AnswersEventsHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AnswersEventsHandler this$0>
				eventBuilder = builder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field SessionEvent$Builder val$eventBuilder>
				flush = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field boolean val$flush>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//    0    0:new             #18  <Class AnswersEventsHandler$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:invokespecial   #124 <Method void AnswersEventsHandler$6(AnswersEventsHandler, SessionEvent$Builder, boolean)>
	//    6   10:astore_1        
		if(flag)
	//*   7   11:iload_2         
	//*   8   12:ifeq            21
		{
			executeSync(((Runnable) (eventBuilder)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #126 <Method void executeSync(Runnable)>
			return;
	//   12   20:return          
		} else
		{
			executeAsync(((Runnable) (eventBuilder)));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokespecial   #112 <Method void executeAsync(Runnable)>
			return;
	//   16   26:return          
		}
	}

	public void processEventAsync(SessionEvent.Builder builder)
	{
		processEvent(builder, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #130 <Method void processEvent(SessionEvent$Builder, boolean, boolean)>
	//    5    7:return          
	}

	public void processEventAsyncAndFlush(SessionEvent.Builder builder)
	{
		processEvent(builder, false, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #130 <Method void processEvent(SessionEvent$Builder, boolean, boolean)>
	//    5    7:return          
	}

	public void processEventSync(SessionEvent.Builder builder)
	{
		processEvent(builder, true, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #130 <Method void processEvent(SessionEvent$Builder, boolean, boolean)>
	//    5    7:return          
	}

	public void setAnalyticsSettingsData(final b analyticsSettingsData, final String protocolAndHostOverride)
	{
		executeAsync(new Runnable() {

			public void run()
			{
				try
				{
					strategy.setAnalyticsSettingsData(analyticsSettingsData, protocolAndHostOverride);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AnswersEventsHandler this$0>
			//    2    4:getfield        #36  <Field SessionAnalyticsManagerStrategy AnswersEventsHandler.strategy>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field b val$analyticsSettingsData>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field String val$protocolAndHostOverride>
			//    7   15:invokeinterface #39  <Method void SessionAnalyticsManagerStrategy.setAnalyticsSettingsData(b, String)>
					return;
			//    8   20:return          
				}
				catch(Exception exception)
			//*   9   21:astore_1        
				{
					c.g().e("Answers", "Failed to set analytics settings data", ((Throwable) (exception)));
			//   10   22:invokestatic    #45  <Method l c.g()>
			//   11   25:ldc1            #47  <String "Answers">
			//   12   27:ldc1            #49  <String "Failed to set analytics settings data">
			//   13   29:aload_1         
			//   14   30:invokeinterface #55  <Method void l.e(String, String, Throwable)>
				}
			//   15   35:return          
			}

			final AnswersEventsHandler this$0;
			final b val$analyticsSettingsData;
			final String val$protocolAndHostOverride;

			
			{
				this$0 = AnswersEventsHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AnswersEventsHandler this$0>
				analyticsSettingsData = b;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field b val$analyticsSettingsData>
				protocolAndHostOverride = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$protocolAndHostOverride>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class AnswersEventsHandler$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #137 <Method void AnswersEventsHandler$1(AnswersEventsHandler, b, String)>
	//    7   11:invokespecial   #112 <Method void executeAsync(Runnable)>
	//    8   14:return          
	}

	private final Context context;
	final ScheduledExecutorService executor;
	private final AnswersFilesManagerProvider filesManagerProvider;
	private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
	private final i kit;
	private final SessionMetadataCollector metadataCollector;
	private final e requestFactory;
	SessionAnalyticsManagerStrategy strategy;


/*
	static SessionMetadataCollector access$000(AnswersEventsHandler answerseventshandler)
	{
		return answerseventshandler.metadataCollector;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SessionMetadataCollector metadataCollector>
	//    2    4:areturn         
	}

*/


/*
	static AnswersFilesManagerProvider access$100(AnswersEventsHandler answerseventshandler)
	{
		return answerseventshandler.filesManagerProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnswersFilesManagerProvider filesManagerProvider>
	//    2    4:areturn         
	}

*/


/*
	static i access$200(AnswersEventsHandler answerseventshandler)
	{
		return answerseventshandler.kit;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field i kit>
	//    2    4:areturn         
	}

*/


/*
	static Context access$300(AnswersEventsHandler answerseventshandler)
	{
		return answerseventshandler.context;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static e access$400(AnswersEventsHandler answerseventshandler)
	{
		return answerseventshandler.requestFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field e requestFactory>
	//    2    4:areturn         
	}

*/


/*
	static FirebaseAnalyticsApiAdapter access$500(AnswersEventsHandler answerseventshandler)
	{
		return answerseventshandler.firebaseAnalyticsApiAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter>
	//    2    4:areturn         
	}

*/
}
