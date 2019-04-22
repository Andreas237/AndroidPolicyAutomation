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
//			AnswersPreferenceManager, AnswersLifecycleCallbacks, SessionEvent

class SessionAnalyticsManager
	implements BackgroundManager.Listener
{

	SessionAnalyticsManager(AnswersEventsHandler answerseventshandler, ActivityLifecycleManager activitylifecyclemanager, BackgroundManager backgroundmanager, AnswersPreferenceManager answerspreferencemanager, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		eventsHandler = answerseventshandler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field AnswersEventsHandler eventsHandler>
		lifecycleManager = activitylifecyclemanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field ActivityLifecycleManager lifecycleManager>
		backgroundManager = backgroundmanager;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field BackgroundManager backgroundManager>
		preferenceManager = answerspreferencemanager;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field AnswersPreferenceManager preferenceManager>
		installedAt = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #31  <Field long installedAt>
	//   17   31:return          
	}

	public static SessionAnalyticsManager build(Kit kit, Context context, IdManager idmanager, String s, String s1, long l)
	{
		idmanager = ((IdManager) (new SessionMetadataCollector(context, idmanager, s, s1)));
	//    0    0:new             #36  <Class SessionMetadataCollector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #39  <Method void SessionMetadataCollector(Context, IdManager, String, String)>
	//    7   12:astore_2        
		s = ((String) (new AnswersFilesManagerProvider(context, ((io.fabric.sdk.android.services.persistence.FileStore) (new FileStoreImpl(kit))))));
	//    8   13:new             #41  <Class AnswersFilesManagerProvider>
	//    9   16:dup             
	//   10   17:aload_1         
	//   11   18:new             #43  <Class FileStoreImpl>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #46  <Method void FileStoreImpl(Kit)>
	//   15   26:invokespecial   #49  <Method void AnswersFilesManagerProvider(Context, io.fabric.sdk.android.services.persistence.FileStore)>
	//   16   29:astore_3        
		s1 = ((String) (new DefaultHttpRequestFactory(Fabric.getLogger())));
	//   17   30:new             #51  <Class DefaultHttpRequestFactory>
	//   18   33:dup             
	//   19   34:invokestatic    #57  <Method Logger Fabric.getLogger()>
	//   20   37:invokespecial   #60  <Method void DefaultHttpRequestFactory(Logger)>
	//   21   40:astore          4
		ActivityLifecycleManager activitylifecyclemanager = new ActivityLifecycleManager(context);
	//   22   42:new             #62  <Class ActivityLifecycleManager>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #65  <Method void ActivityLifecycleManager(Context)>
	//   26   50:astore          7
		java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = ExecutorUtils.buildSingleThreadScheduledExecutorService("Answers Events Handler");
	//   27   52:ldc1            #67  <String "Answers Events Handler">
	//   28   54:invokestatic    #73  <Method java.util.concurrent.ScheduledExecutorService ExecutorUtils.buildSingleThreadScheduledExecutorService(String)>
	//   29   57:astore          8
		BackgroundManager backgroundmanager = new BackgroundManager(scheduledexecutorservice);
	//   30   59:new             #75  <Class BackgroundManager>
	//   31   62:dup             
	//   32   63:aload           8
	//   33   65:invokespecial   #78  <Method void BackgroundManager(java.util.concurrent.ScheduledExecutorService)>
	//   34   68:astore          9
		return new SessionAnalyticsManager(new AnswersEventsHandler(kit, context, ((AnswersFilesManagerProvider) (s)), ((SessionMetadataCollector) (idmanager)), ((io.fabric.sdk.android.services.network.HttpRequestFactory) (s1)), scheduledexecutorservice), activitylifecyclemanager, backgroundmanager, AnswersPreferenceManager.build(context), l);
	//   35   70:new             #2   <Class SessionAnalyticsManager>
	//   36   73:dup             
	//   37   74:new             #80  <Class AnswersEventsHandler>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:aload_3         
	//   42   81:aload_2         
	//   43   82:aload           4
	//   44   84:aload           8
	//   45   86:invokespecial   #83  <Method void AnswersEventsHandler(Kit, Context, AnswersFilesManagerProvider, SessionMetadataCollector, io.fabric.sdk.android.services.network.HttpRequestFactory, java.util.concurrent.ScheduledExecutorService)>
	//   46   89:aload           7
	//   47   91:aload           9
	//   48   93:aload_1         
	//   49   94:invokestatic    #88  <Method AnswersPreferenceManager AnswersPreferenceManager.build(Context)>
	//   50   97:lload           5
	//   51   99:invokespecial   #90  <Method void SessionAnalyticsManager(AnswersEventsHandler, ActivityLifecycleManager, BackgroundManager, AnswersPreferenceManager, long)>
	//   52  102:areturn         
	}

	public void disable()
	{
		lifecycleManager.resetCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ActivityLifecycleManager lifecycleManager>
	//    2    4:invokevirtual   #94  <Method void ActivityLifecycleManager.resetCallbacks()>
		eventsHandler.disable();
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field AnswersEventsHandler eventsHandler>
	//    5   11:invokevirtual   #96  <Method void AnswersEventsHandler.disable()>
	//    6   14:return          
	}

	public void enable()
	{
		eventsHandler.enable();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnswersEventsHandler eventsHandler>
	//    2    4:invokevirtual   #99  <Method void AnswersEventsHandler.enable()>
		lifecycleManager.registerCallbacks(((io.fabric.sdk.android.ActivityLifecycleManager.Callbacks) (new AnswersLifecycleCallbacks(this, backgroundManager))));
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field ActivityLifecycleManager lifecycleManager>
	//    5   11:new             #101 <Class AnswersLifecycleCallbacks>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field BackgroundManager backgroundManager>
	//   10   20:invokespecial   #104 <Method void AnswersLifecycleCallbacks(SessionAnalyticsManager, BackgroundManager)>
	//   11   23:invokevirtual   #108 <Method boolean ActivityLifecycleManager.registerCallbacks(io.fabric.sdk.android.ActivityLifecycleManager$Callbacks)>
	//   12   26:pop             
		backgroundManager.registerListener(((BackgroundManager.Listener) (this)));
	//   13   27:aload_0         
	//   14   28:getfield        #27  <Field BackgroundManager backgroundManager>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #112 <Method void BackgroundManager.registerListener(BackgroundManager$Listener)>
		if(isFirstLaunch())
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #116 <Method boolean isFirstLaunch()>
	//*  19   39:ifeq            57
		{
			onInstall(installedAt);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #31  <Field long installedAt>
	//   23   47:invokevirtual   #120 <Method void onInstall(long)>
			preferenceManager.setAnalyticsLaunched();
	//   24   50:aload_0         
	//   25   51:getfield        #29  <Field AnswersPreferenceManager preferenceManager>
	//   26   54:invokevirtual   #123 <Method void AnswersPreferenceManager.setAnalyticsLaunched()>
		}
	//   27   57:return          
	}

	boolean isFirstLaunch()
	{
		return preferenceManager.hasAnalyticsLaunched() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AnswersPreferenceManager preferenceManager>
	//    2    4:invokevirtual   #126 <Method boolean AnswersPreferenceManager.hasAnalyticsLaunched()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public void onBackground()
	{
		Fabric.getLogger().d("Answers", "Flush events when app is backgrounded");
	//    0    0:invokestatic    #57  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #129 <String "Answers">
	//    2    5:ldc1            #131 <String "Flush events when app is backgrounded">
	//    3    7:invokeinterface #137 <Method void Logger.d(String, String)>
		eventsHandler.flushEvents();
	//    4   12:aload_0         
	//    5   13:getfield        #23  <Field AnswersEventsHandler eventsHandler>
	//    6   16:invokevirtual   #140 <Method void AnswersEventsHandler.flushEvents()>
	//    7   19:return          
	}

	public void onCrash(String s, String s1)
	{
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #147 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #150 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       34
		{
			Fabric.getLogger().d("Answers", "Logged crash");
	//    3    9:invokestatic    #57  <Method Logger Fabric.getLogger()>
	//    4   12:ldc1            #129 <String "Answers">
	//    5   14:ldc1            #152 <String "Logged crash">
	//    6   16:invokeinterface #137 <Method void Logger.d(String, String)>
			eventsHandler.processEventSync(SessionEvent.crashEventBuilder(s, s1));
	//    7   21:aload_0         
	//    8   22:getfield        #23  <Field AnswersEventsHandler eventsHandler>
	//    9   25:aload_1         
	//   10   26:aload_2         
	//   11   27:invokestatic    #158 <Method SessionEvent$Builder SessionEvent.crashEventBuilder(String, String)>
	//   12   30:invokevirtual   #162 <Method void AnswersEventsHandler.processEventSync(SessionEvent$Builder)>
			return;
	//   13   33:return          
		} else
		{
			throw new IllegalStateException("onCrash called from main thread!!!");
	//   14   34:new             #164 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc1            #166 <String "onCrash called from main thread!!!">
	//   17   40:invokespecial   #169 <Method void IllegalStateException(String)>
	//   18   43:athrow          
		}
	}

	public void onInstall(long l)
	{
		Fabric.getLogger().d("Answers", "Logged install");
	//    0    0:invokestatic    #57  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #129 <String "Answers">
	//    2    5:ldc1            #171 <String "Logged install">
	//    3    7:invokeinterface #137 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(l));
	//    4   12:aload_0         
	//    5   13:getfield        #23  <Field AnswersEventsHandler eventsHandler>
	//    6   16:lload_1         
	//    7   17:invokestatic    #175 <Method SessionEvent$Builder SessionEvent.installEventBuilder(long)>
	//    8   20:invokevirtual   #178 <Method void AnswersEventsHandler.processEventAsyncAndFlush(SessionEvent$Builder)>
	//    9   23:return          
	}

	public void onLifecycle(Activity activity, SessionEvent.Type type)
	{
		Logger logger = Fabric.getLogger();
	//    0    0:invokestatic    #57  <Method Logger Fabric.getLogger()>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #182 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #183 <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Logged lifecycle event: ");
	//    6   13:aload           4
	//    7   15:ldc1            #185 <String "Logged lifecycle event: ">
	//    8   17:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(type.name());
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #195 <Method String SessionEvent$Type.name()>
	//   13   27:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		logger.d("Answers", stringbuilder.toString());
	//   15   31:aload_3         
	//   16   32:ldc1            #129 <String "Answers">
	//   17   34:aload           4
	//   18   36:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   19   39:invokeinterface #137 <Method void Logger.d(String, String)>
		eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
	//   20   44:aload_0         
	//   21   45:getfield        #23  <Field AnswersEventsHandler eventsHandler>
	//   22   48:aload_2         
	//   23   49:aload_1         
	//   24   50:invokestatic    #202 <Method SessionEvent$Builder SessionEvent.lifecycleEventBuilder(SessionEvent$Type, Activity)>
	//   25   53:invokevirtual   #205 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   26   56:return          
	}

	public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
	{
		backgroundManager.setFlushOnBackground(analyticssettingsdata.flushOnBackground);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BackgroundManager backgroundManager>
	//    2    4:aload_1         
	//    3    5:getfield        #213 <Field boolean AnalyticsSettingsData.flushOnBackground>
	//    4    8:invokevirtual   #217 <Method void BackgroundManager.setFlushOnBackground(boolean)>
		eventsHandler.setAnalyticsSettingsData(analyticssettingsdata, s);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field AnswersEventsHandler eventsHandler>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #219 <Method void AnswersEventsHandler.setAnalyticsSettingsData(AnalyticsSettingsData, String)>
	//   10   20:return          
	}

	final BackgroundManager backgroundManager;
	final AnswersEventsHandler eventsHandler;
	private final long installedAt;
	final ActivityLifecycleManager lifecycleManager;
	final AnswersPreferenceManager preferenceManager;
}
