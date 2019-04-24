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
//			AnswersPreferenceManager, AnswersLifecycleCallbacks, SessionEvent, CustomEvent, 
//			PredefinedEvent

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
		return new SessionAnalyticsManager(new AnswersEventsHandler(kit, context, ((AnswersFilesManagerProvider) (s)), ((SessionMetadataCollector) (idmanager)), ((io.fabric.sdk.android.services.network.HttpRequestFactory) (s1)), scheduledexecutorservice), activitylifecyclemanager, backgroundmanager, AnswersPreferenceManager.build(context), l);
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
	//   45   86:invokespecial   #88  <Method void AnswersEventsHandler(Kit, Context, AnswersFilesManagerProvider, SessionMetadataCollector, io.fabric.sdk.android.services.network.HttpRequestFactory, java.util.concurrent.ScheduledExecutorService)>
	//   46   89:aload           7
	//   47   91:aload           9
	//   48   93:aload_1         
	//   49   94:invokestatic    #93  <Method AnswersPreferenceManager AnswersPreferenceManager.build(Context)>
	//   50   97:lload           5
	//   51   99:invokespecial   #95  <Method void SessionAnalyticsManager(AnswersEventsHandler, ActivityLifecycleManager, BackgroundManager, AnswersPreferenceManager, long)>
	//   52  102:areturn         
	}

	public void disable()
	{
		lifecycleManager.resetCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ActivityLifecycleManager lifecycleManager>
	//    2    4:invokevirtual   #99  <Method void ActivityLifecycleManager.resetCallbacks()>
		eventsHandler.disable();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    5   11:invokevirtual   #101 <Method void AnswersEventsHandler.disable()>
	//    6   14:return          
	}

	public void enable()
	{
		eventsHandler.enable();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    2    4:invokevirtual   #104 <Method void AnswersEventsHandler.enable()>
		lifecycleManager.registerCallbacks(((io.fabric.sdk.android.ActivityLifecycleManager.Callbacks) (new AnswersLifecycleCallbacks(this, backgroundManager))));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field ActivityLifecycleManager lifecycleManager>
	//    5   11:new             #106 <Class AnswersLifecycleCallbacks>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field BackgroundManager backgroundManager>
	//   10   20:invokespecial   #109 <Method void AnswersLifecycleCallbacks(SessionAnalyticsManager, BackgroundManager)>
	//   11   23:invokevirtual   #113 <Method boolean ActivityLifecycleManager.registerCallbacks(io.fabric.sdk.android.ActivityLifecycleManager$Callbacks)>
	//   12   26:pop             
		backgroundManager.registerListener(((BackgroundManager.Listener) (this)));
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field BackgroundManager backgroundManager>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #117 <Method void BackgroundManager.registerListener(BackgroundManager$Listener)>
		if(isFirstLaunch())
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #121 <Method boolean isFirstLaunch()>
	//*  19   39:ifeq            57
		{
			onInstall(installedAt);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #38  <Field long installedAt>
	//   23   47:invokevirtual   #125 <Method void onInstall(long)>
			preferenceManager.setAnalyticsLaunched();
	//   24   50:aload_0         
	//   25   51:getfield        #36  <Field AnswersPreferenceManager preferenceManager>
	//   26   54:invokevirtual   #128 <Method void AnswersPreferenceManager.setAnalyticsLaunched()>
		}
	//   27   57:return          
	}

	boolean isFirstLaunch()
	{
		return !preferenceManager.hasAnalyticsLaunched();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AnswersPreferenceManager preferenceManager>
	//    2    4:invokevirtual   #131 <Method boolean AnswersPreferenceManager.hasAnalyticsLaunched()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void onBackground()
	{
		Fabric.getLogger().d("Answers", "Flush events when app is backgrounded");
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #134 <String "Answers">
	//    2    5:ldc1            #136 <String "Flush events when app is backgrounded">
	//    3    7:invokeinterface #142 <Method void Logger.d(String, String)>
		eventsHandler.flushEvents();
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    6   16:invokevirtual   #145 <Method void AnswersEventsHandler.flushEvents()>
	//    7   19:return          
	}

	public void onCrash(String s, String s1)
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #152 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #155 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
		{
			throw new IllegalStateException("onCrash called from main thread!!!");
	//    3    9:new             #157 <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #13  <String "onCrash called from main thread!!!">
	//    6   15:invokespecial   #160 <Method void IllegalStateException(String)>
	//    7   18:athrow          
		} else
		{
			Fabric.getLogger().d("Answers", "Logged crash");
	//    8   19:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    9   22:ldc1            #134 <String "Answers">
	//   10   24:ldc1            #162 <String "Logged crash">
	//   11   26:invokeinterface #142 <Method void Logger.d(String, String)>
			eventsHandler.processEventSync(SessionEvent.crashEventBuilder(s, s1));
	//   12   31:aload_0         
	//   13   32:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   14   35:aload_1         
	//   15   36:aload_2         
	//   16   37:invokestatic    #168 <Method SessionEvent$Builder SessionEvent.crashEventBuilder(String, String)>
	//   17   40:invokevirtual   #172 <Method void AnswersEventsHandler.processEventSync(SessionEvent$Builder)>
			return;
	//   18   43:return          
		}
	}

	public void onCustom(CustomEvent customevent)
	{
		Fabric.getLogger().d("Answers", (new StringBuilder()).append("Logged custom event: ").append(((Object) (customevent))).toString());
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #134 <String "Answers">
	//    2    5:new             #176 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #177 <Method void StringBuilder()>
	//    5   12:ldc1            #179 <String "Logged custom event: ">
	//    6   14:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #186 <Method StringBuilder StringBuilder.append(Object)>
	//    9   21:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   10   24:invokeinterface #142 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customevent));
	//   11   29:aload_0         
	//   12   30:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   13   33:aload_1         
	//   14   34:invokestatic    #194 <Method SessionEvent$Builder SessionEvent.customEventBuilder(CustomEvent)>
	//   15   37:invokevirtual   #197 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   16   40:return          
	}

	public void onError(String s)
	{
	//    0    0:return          
	}

	public void onInstall(long l)
	{
		Fabric.getLogger().d("Answers", "Logged install");
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #134 <String "Answers">
	//    2    5:ldc1            #200 <String "Logged install">
	//    3    7:invokeinterface #142 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(l));
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    6   16:lload_1         
	//    7   17:invokestatic    #204 <Method SessionEvent$Builder SessionEvent.installEventBuilder(long)>
	//    8   20:invokevirtual   #207 <Method void AnswersEventsHandler.processEventAsyncAndFlush(SessionEvent$Builder)>
	//    9   23:return          
	}

	public void onLifecycle(Activity activity, SessionEvent.Type type)
	{
		Fabric.getLogger().d("Answers", (new StringBuilder()).append("Logged lifecycle event: ").append(type.name()).toString());
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #134 <String "Answers">
	//    2    5:new             #176 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #177 <Method void StringBuilder()>
	//    5   12:ldc1            #211 <String "Logged lifecycle event: ">
	//    6   14:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_2         
	//    8   18:invokevirtual   #216 <Method String SessionEvent$Type.name()>
	//    9   21:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   11   27:invokeinterface #142 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
	//   12   32:aload_0         
	//   13   33:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   14   36:aload_2         
	//   15   37:aload_1         
	//   16   38:invokestatic    #220 <Method SessionEvent$Builder SessionEvent.lifecycleEventBuilder(SessionEvent$Type, Activity)>
	//   17   41:invokevirtual   #197 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   18   44:return          
	}

	public void onPredefined(PredefinedEvent predefinedevent)
	{
		Fabric.getLogger().d("Answers", (new StringBuilder()).append("Logged predefined event: ").append(((Object) (predefinedevent))).toString());
	//    0    0:invokestatic    #64  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #134 <String "Answers">
	//    2    5:new             #176 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #177 <Method void StringBuilder()>
	//    5   12:ldc1            #224 <String "Logged predefined event: ">
	//    6   14:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #186 <Method StringBuilder StringBuilder.append(Object)>
	//    9   21:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   10   24:invokeinterface #142 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedevent));
	//   11   29:aload_0         
	//   12   30:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   13   33:aload_1         
	//   14   34:invokestatic    #228 <Method SessionEvent$Builder SessionEvent.predefinedEventBuilder(PredefinedEvent)>
	//   15   37:invokevirtual   #197 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   16   40:return          
	}

	public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
	{
		backgroundManager.setFlushOnBackground(analyticssettingsdata.flushOnBackground);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field BackgroundManager backgroundManager>
	//    2    4:aload_1         
	//    3    5:getfield        #236 <Field boolean AnalyticsSettingsData.flushOnBackground>
	//    4    8:invokevirtual   #240 <Method void BackgroundManager.setFlushOnBackground(boolean)>
		eventsHandler.setAnalyticsSettingsData(analyticssettingsdata, s);
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #242 <Method void AnswersEventsHandler.setAnalyticsSettingsData(AnalyticsSettingsData, String)>
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
