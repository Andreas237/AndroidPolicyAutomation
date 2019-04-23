// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionMetadataCollector, AnswersFilesManagerProvider, BackgroundManager, AnswersEventsHandler, 
//			FirebaseAnalyticsApiAdapter, AnswersPreferenceManager, AnswersLifecycleCallbacks, SessionEvent, 
//			CustomEvent, PredefinedEvent

class SessionAnalyticsManager
	implements BackgroundManager.Listener
{

	SessionAnalyticsManager(AnswersEventsHandler answerseventshandler, ActivityLifecycleManager activitylifecyclemanager, BackgroundManager backgroundmanager, AnswersPreferenceManager answerspreferencemanager, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		eventsHandler = answerseventshandler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field AnswersEventsHandler eventsHandler>
		lifecycleManager = activitylifecyclemanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field ActivityLifecycleManager lifecycleManager>
		backgroundManager = backgroundmanager;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field BackgroundManager backgroundManager>
		preferenceManager = answerspreferencemanager;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field AnswersPreferenceManager preferenceManager>
		installedAt = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #38  <Field long installedAt>
	//   17   31:return          
	}

	public static SessionAnalyticsManager build(Kit kit, Context context, IdManager idmanager, String s, String s1, long l)
	{
		idmanager = ((IdManager) (new SessionMetadataCollector(context, idmanager, s, s1)));
	//    0    0:new             #43  <Class SessionMetadataCollector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #46  <Method void SessionMetadataCollector(Context, IdManager, String, String)>
	//    7   12:astore_2        
		s = ((String) (new AnswersFilesManagerProvider(context, ((io.fabric.sdk.android.services.persistence.FileStore) (new FileStoreImpl(kit))))));
	//    8   13:new             #48  <Class AnswersFilesManagerProvider>
	//    9   16:dup             
	//   10   17:aload_1         
	//   11   18:new             #50  <Class FileStoreImpl>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #53  <Method void FileStoreImpl(Kit)>
	//   15   26:invokespecial   #56  <Method void AnswersFilesManagerProvider(Context, io.fabric.sdk.android.services.persistence.FileStore)>
	//   16   29:astore_3        
		s1 = ((String) (new DefaultHttpRequestFactory(Fabric.getLogger())));
	//   17   30:new             #58  <Class DefaultHttpRequestFactory>
	//   18   33:dup             
	//   19   34:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//   20   37:invokespecial   #67  <Method void DefaultHttpRequestFactory(Logger)>
	//   21   40:astore          4
		ActivityLifecycleManager activitylifecyclemanager = new ActivityLifecycleManager(context);
	//   22   42:new             #69  <Class ActivityLifecycleManager>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #72  <Method void ActivityLifecycleManager(Context)>
	//   26   50:astore          7
		java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = ExecutorUtils.buildSingleThreadScheduledExecutorService("Answers Events Handler");
	//   27   52:ldc1            #10  <String "Answers Events Handler">
	//   28   54:invokestatic    #78  <Method java.util.concurrent.ScheduledExecutorService ExecutorUtils.buildSingleThreadScheduledExecutorService(String)>
	//   29   57:astore          8
		BackgroundManager backgroundmanager = new BackgroundManager(scheduledexecutorservice);
	//   30   59:new             #80  <Class BackgroundManager>
	//   31   62:dup             
	//   32   63:aload           8
	//   33   65:invokespecial   #83  <Method void BackgroundManager(java.util.concurrent.ScheduledExecutorService)>
	//   34   68:astore          9
		return new SessionAnalyticsManager(new AnswersEventsHandler(kit, context, ((AnswersFilesManagerProvider) (s)), ((SessionMetadataCollector) (idmanager)), ((io.fabric.sdk.android.services.network.HttpRequestFactory) (s1)), scheduledexecutorservice, new FirebaseAnalyticsApiAdapter(context)), activitylifecyclemanager, backgroundmanager, AnswersPreferenceManager.build(context), l);
	//   35   70:new             #2   <Class SessionAnalyticsManager>
	//   36   73:dup             
	//   37   74:new             #85  <Class AnswersEventsHandler>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:aload_3         
	//   42   81:aload_2         
	//   43   82:aload           4
	//   44   84:aload           8
	//   45   86:new             #87  <Class FirebaseAnalyticsApiAdapter>
	//   46   89:dup             
	//   47   90:aload_1         
	//   48   91:invokespecial   #88  <Method void FirebaseAnalyticsApiAdapter(Context)>
	//   49   94:invokespecial   #91  <Method void AnswersEventsHandler(Kit, Context, AnswersFilesManagerProvider, SessionMetadataCollector, io.fabric.sdk.android.services.network.HttpRequestFactory, java.util.concurrent.ScheduledExecutorService, FirebaseAnalyticsApiAdapter)>
	//   50   97:aload           7
	//   51   99:aload           9
	//   52  101:aload_1         
	//   53  102:invokestatic    #96  <Method AnswersPreferenceManager AnswersPreferenceManager.build(Context)>
	//   54  105:lload           5
	//   55  107:invokespecial   #98  <Method void SessionAnalyticsManager(AnswersEventsHandler, ActivityLifecycleManager, BackgroundManager, AnswersPreferenceManager, long)>
	//   56  110:areturn         
	}

	public void disable()
	{
		lifecycleManager.resetCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ActivityLifecycleManager lifecycleManager>
	//    2    4:invokevirtual   #102 <Method void ActivityLifecycleManager.resetCallbacks()>
		eventsHandler.disable();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    5   11:invokevirtual   #104 <Method void AnswersEventsHandler.disable()>
	//    6   14:return          
	}

	public void enable()
	{
		eventsHandler.enable();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    2    4:invokevirtual   #107 <Method void AnswersEventsHandler.enable()>
		lifecycleManager.registerCallbacks(((io.fabric.sdk.android.ActivityLifecycleManager.Callbacks) (new AnswersLifecycleCallbacks(this, backgroundManager))));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field ActivityLifecycleManager lifecycleManager>
	//    5   11:new             #109 <Class AnswersLifecycleCallbacks>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field BackgroundManager backgroundManager>
	//   10   20:invokespecial   #112 <Method void AnswersLifecycleCallbacks(SessionAnalyticsManager, BackgroundManager)>
	//   11   23:invokevirtual   #116 <Method boolean ActivityLifecycleManager.registerCallbacks(io.fabric.sdk.android.ActivityLifecycleManager$Callbacks)>
	//   12   26:pop             
		backgroundManager.registerListener(((BackgroundManager.Listener) (this)));
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field BackgroundManager backgroundManager>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #120 <Method void BackgroundManager.registerListener(BackgroundManager$Listener)>
		if(isFirstLaunch())
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #124 <Method boolean isFirstLaunch()>
	//*  19   39:ifeq            57
		{
			onInstall(installedAt);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #38  <Field long installedAt>
	//   23   47:invokevirtual   #128 <Method void onInstall(long)>
			preferenceManager.setAnalyticsLaunched();
	//   24   50:aload_0         
	//   25   51:getfield        #36  <Field AnswersPreferenceManager preferenceManager>
	//   26   54:invokevirtual   #131 <Method void AnswersPreferenceManager.setAnalyticsLaunched()>
		}
	//   27   57:return          
	}

	boolean isFirstLaunch()
	{
		return preferenceManager.hasAnalyticsLaunched() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AnswersPreferenceManager preferenceManager>
	//    2    4:invokevirtual   #134 <Method boolean AnswersPreferenceManager.hasAnalyticsLaunched()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public void onBackground()
	{
		Fabric.getLogger().d("Answers", "Flush events when app is backgrounded");
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #137 <String "Answers">
	//    2    5:ldc1            #139 <String "Flush events when app is backgrounded">
	//    3    7:invokeinterface #145 <Method void Logger.d(String, String)>
		eventsHandler.flushEvents();
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    6   16:invokevirtual   #148 <Method void AnswersEventsHandler.flushEvents()>
	//    7   19:return          
	}

	public void onCrash(String s, String s1)
	{
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #155 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #158 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       34
		{
			Fabric.getLogger().d("Answers", "Logged crash");
	//    3    9:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    4   12:ldc1            #137 <String "Answers">
	//    5   14:ldc1            #160 <String "Logged crash">
	//    6   16:invokeinterface #145 <Method void Logger.d(String, String)>
			eventsHandler.processEventSync(SessionEvent.crashEventBuilder(s, s1));
	//    7   21:aload_0         
	//    8   22:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    9   25:aload_1         
	//   10   26:aload_2         
	//   11   27:invokestatic    #166 <Method SessionEvent$Builder SessionEvent.crashEventBuilder(String, String)>
	//   12   30:invokevirtual   #170 <Method void AnswersEventsHandler.processEventSync(SessionEvent$Builder)>
			return;
	//   13   33:return          
		} else
		{
			throw new IllegalStateException("onCrash called from main thread!!!");
	//   14   34:new             #172 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc1            #13  <String "onCrash called from main thread!!!">
	//   17   40:invokespecial   #175 <Method void IllegalStateException(String)>
	//   18   43:athrow          
		}
	}

	public void onCustom(CustomEvent customevent)
	{
		Logger logger = Fabric.getLogger();
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #179 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #180 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Logged custom event: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #182 <String "Logged custom event: ">
	//    8   15:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (customevent)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		logger.d("Answers", stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:ldc1            #137 <String "Answers">
	//   16   28:aload_3         
	//   17   29:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   18   32:invokeinterface #145 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customevent));
	//   19   37:aload_0         
	//   20   38:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   21   41:aload_1         
	//   22   42:invokestatic    #197 <Method SessionEvent$Builder SessionEvent.customEventBuilder(CustomEvent)>
	//   23   45:invokevirtual   #200 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   24   48:return          
	}

	public void onError(String s)
	{
	//    0    0:return          
	}

	public void onInstall(long l)
	{
		Fabric.getLogger().d("Answers", "Logged install");
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #137 <String "Answers">
	//    2    5:ldc1            #203 <String "Logged install">
	//    3    7:invokeinterface #145 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(l));
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    6   16:lload_1         
	//    7   17:invokestatic    #207 <Method SessionEvent$Builder SessionEvent.installEventBuilder(long)>
	//    8   20:invokevirtual   #210 <Method void AnswersEventsHandler.processEventAsyncAndFlush(SessionEvent$Builder)>
	//    9   23:return          
	}

	public void onLifecycle(Activity activity, SessionEvent.Type type)
	{
		Logger logger = Fabric.getLogger();
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #179 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #180 <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Logged lifecycle event: ");
	//    6   13:aload           4
	//    7   15:ldc1            #214 <String "Logged lifecycle event: ">
	//    8   17:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(type.name());
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #219 <Method String SessionEvent$Type.name()>
	//   13   27:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		logger.d("Answers", stringbuilder.toString());
	//   15   31:aload_3         
	//   16   32:ldc1            #137 <String "Answers">
	//   17   34:aload           4
	//   18   36:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   19   39:invokeinterface #145 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
	//   20   44:aload_0         
	//   21   45:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   22   48:aload_2         
	//   23   49:aload_1         
	//   24   50:invokestatic    #223 <Method SessionEvent$Builder SessionEvent.lifecycleEventBuilder(SessionEvent$Type, Activity)>
	//   25   53:invokevirtual   #200 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   26   56:return          
	}

	public void onPredefined(PredefinedEvent predefinedevent)
	{
		Logger logger = Fabric.getLogger();
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #179 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #180 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Logged predefined event: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #227 <String "Logged predefined event: ">
	//    8   15:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (predefinedevent)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		logger.d("Answers", stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:ldc1            #137 <String "Answers">
	//   16   28:aload_3         
	//   17   29:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   18   32:invokeinterface #145 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedevent));
	//   19   37:aload_0         
	//   20   38:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   21   41:aload_1         
	//   22   42:invokestatic    #231 <Method SessionEvent$Builder SessionEvent.predefinedEventBuilder(PredefinedEvent)>
	//   23   45:invokevirtual   #200 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   24   48:return          
	}

	public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
	{
		backgroundManager.setFlushOnBackground(analyticssettingsdata.flushOnBackground);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field BackgroundManager backgroundManager>
	//    2    4:aload_1         
	//    3    5:getfield        #239 <Field boolean AnalyticsSettingsData.flushOnBackground>
	//    4    8:invokevirtual   #243 <Method void BackgroundManager.setFlushOnBackground(boolean)>
		eventsHandler.setAnalyticsSettingsData(analyticssettingsdata, s);
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #245 <Method void AnswersEventsHandler.setAnalyticsSettingsData(AnalyticsSettingsData, String)>
	//   10   20:return          
	}

	static final String EXECUTOR_SERVICE = "Answers Events Handler";
	static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
	final BackgroundManager backgroundManager;
	final AnswersEventsHandler eventsHandler;
	private final long installedAt;
	final ActivityLifecycleManager lifecycleManager;
	final AnswersPreferenceManager preferenceManager;
}
