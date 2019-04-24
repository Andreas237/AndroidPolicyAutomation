// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import b.a.a.a.a;
import b.a.a.a.a.b.n;
import b.a.a.a.a.b.p;
import b.a.a.a.a.f.b;
import b.a.a.a.c;
import b.a.a.a.i;
import b.a.a.a.l;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionMetadataCollector, AnswersFilesManagerProvider, BackgroundManager, AnswersEventsHandler, 
//			FirebaseAnalyticsApiAdapter, AnswersPreferenceManager, AnswersLifecycleCallbacks, SessionEvent, 
//			CustomEvent, PredefinedEvent

class SessionAnalyticsManager
	implements BackgroundManager.Listener
{

	SessionAnalyticsManager(AnswersEventsHandler answerseventshandler, a a1, BackgroundManager backgroundmanager, AnswersPreferenceManager answerspreferencemanager, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		eventsHandler = answerseventshandler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field AnswersEventsHandler eventsHandler>
		lifecycleManager = a1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field a lifecycleManager>
		backgroundManager = backgroundmanager;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field BackgroundManager backgroundManager>
		preferenceManager = answerspreferencemanager;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field AnswersPreferenceManager preferenceManager>
		installedAt = l1;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #38  <Field long installedAt>
	//   17   31:return          
	}

	public static SessionAnalyticsManager build(i i, Context context, p p, String s, String s1, long l1)
	{
		p = ((p) (new SessionMetadataCollector(context, p, s, s1)));
	//    0    0:new             #43  <Class SessionMetadataCollector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #46  <Method void SessionMetadataCollector(Context, p, String, String)>
	//    7   12:astore_2        
		s = ((String) (new AnswersFilesManagerProvider(context, ((b.a.a.a.a.f.a) (new b(i))))));
	//    8   13:new             #48  <Class AnswersFilesManagerProvider>
	//    9   16:dup             
	//   10   17:aload_1         
	//   11   18:new             #50  <Class b>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #53  <Method void b(i)>
	//   15   26:invokespecial   #56  <Method void AnswersFilesManagerProvider(Context, b.a.a.a.a.f.a)>
	//   16   29:astore_3        
		s1 = ((String) (new b.a.a.a.a.e.b(c.g())));
	//   17   30:new             #58  <Class b.a.a.a.a.e.b>
	//   18   33:dup             
	//   19   34:invokestatic    #64  <Method l c.g()>
	//   20   37:invokespecial   #67  <Method void b.a.a.a.a.e.b(l)>
	//   21   40:astore          4
		a a1 = new a(context);
	//   22   42:new             #69  <Class a>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #72  <Method void a(Context)>
	//   26   50:astore          7
		java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = n.b("Answers Events Handler");
	//   27   52:ldc1            #10  <String "Answers Events Handler">
	//   28   54:invokestatic    #78  <Method java.util.concurrent.ScheduledExecutorService n.b(String)>
	//   29   57:astore          8
		BackgroundManager backgroundmanager = new BackgroundManager(scheduledexecutorservice);
	//   30   59:new             #80  <Class BackgroundManager>
	//   31   62:dup             
	//   32   63:aload           8
	//   33   65:invokespecial   #83  <Method void BackgroundManager(java.util.concurrent.ScheduledExecutorService)>
	//   34   68:astore          9
		return new SessionAnalyticsManager(new AnswersEventsHandler(i, context, ((AnswersFilesManagerProvider) (s)), ((SessionMetadataCollector) (p)), ((b.a.a.a.a.e.e) (s1)), scheduledexecutorservice, new FirebaseAnalyticsApiAdapter(context)), a1, backgroundmanager, AnswersPreferenceManager.build(context), l1);
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
	//   49   94:invokespecial   #91  <Method void AnswersEventsHandler(i, Context, AnswersFilesManagerProvider, SessionMetadataCollector, b.a.a.a.a.e.e, java.util.concurrent.ScheduledExecutorService, FirebaseAnalyticsApiAdapter)>
	//   50   97:aload           7
	//   51   99:aload           9
	//   52  101:aload_1         
	//   53  102:invokestatic    #96  <Method AnswersPreferenceManager AnswersPreferenceManager.build(Context)>
	//   54  105:lload           5
	//   55  107:invokespecial   #98  <Method void SessionAnalyticsManager(AnswersEventsHandler, a, BackgroundManager, AnswersPreferenceManager, long)>
	//   56  110:areturn         
	}

	public void disable()
	{
		lifecycleManager.a();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field a lifecycleManager>
	//    2    4:invokevirtual   #102 <Method void a.a()>
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
		lifecycleManager.a(((b.a.a.a.a.b) (new AnswersLifecycleCallbacks(this, backgroundManager))));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field a lifecycleManager>
	//    5   11:new             #109 <Class AnswersLifecycleCallbacks>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field BackgroundManager backgroundManager>
	//   10   20:invokespecial   #112 <Method void AnswersLifecycleCallbacks(SessionAnalyticsManager, BackgroundManager)>
	//   11   23:invokevirtual   #115 <Method boolean a.a(b.a.a.a.a$b)>
	//   12   26:pop             
		backgroundManager.registerListener(((BackgroundManager.Listener) (this)));
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field BackgroundManager backgroundManager>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #119 <Method void BackgroundManager.registerListener(BackgroundManager$Listener)>
		if(isFirstLaunch())
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #123 <Method boolean isFirstLaunch()>
	//*  19   39:ifeq            57
		{
			onInstall(installedAt);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #38  <Field long installedAt>
	//   23   47:invokevirtual   #127 <Method void onInstall(long)>
			preferenceManager.setAnalyticsLaunched();
	//   24   50:aload_0         
	//   25   51:getfield        #36  <Field AnswersPreferenceManager preferenceManager>
	//   26   54:invokevirtual   #130 <Method void AnswersPreferenceManager.setAnalyticsLaunched()>
		}
	//   27   57:return          
	}

	boolean isFirstLaunch()
	{
		return preferenceManager.hasAnalyticsLaunched() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AnswersPreferenceManager preferenceManager>
	//    2    4:invokevirtual   #133 <Method boolean AnswersPreferenceManager.hasAnalyticsLaunched()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public void onBackground()
	{
		c.g().a("Answers", "Flush events when app is backgrounded");
	//    0    0:invokestatic    #64  <Method l c.g()>
	//    1    3:ldc1            #136 <String "Answers">
	//    2    5:ldc1            #138 <String "Flush events when app is backgrounded">
	//    3    7:invokeinterface #143 <Method void l.a(String, String)>
		eventsHandler.flushEvents();
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    6   16:invokevirtual   #146 <Method void AnswersEventsHandler.flushEvents()>
	//    7   19:return          
	}

	public void onCrash(String s, String s1)
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #153 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #156 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
		{
			throw new IllegalStateException("onCrash called from main thread!!!");
	//    3    9:new             #158 <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #13  <String "onCrash called from main thread!!!">
	//    6   15:invokespecial   #161 <Method void IllegalStateException(String)>
	//    7   18:athrow          
		} else
		{
			c.g().a("Answers", "Logged crash");
	//    8   19:invokestatic    #64  <Method l c.g()>
	//    9   22:ldc1            #136 <String "Answers">
	//   10   24:ldc1            #163 <String "Logged crash">
	//   11   26:invokeinterface #143 <Method void l.a(String, String)>
			eventsHandler.processEventSync(SessionEvent.crashEventBuilder(s, s1));
	//   12   31:aload_0         
	//   13   32:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   14   35:aload_1         
	//   15   36:aload_2         
	//   16   37:invokestatic    #169 <Method SessionEvent$Builder SessionEvent.crashEventBuilder(String, String)>
	//   17   40:invokevirtual   #173 <Method void AnswersEventsHandler.processEventSync(SessionEvent$Builder)>
			return;
	//   18   43:return          
		}
	}

	public void onCustom(CustomEvent customevent)
	{
		l l1 = c.g();
	//    0    0:invokestatic    #64  <Method l c.g()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #177 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Logged custom event: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #180 <String "Logged custom event: ">
	//    8   15:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (customevent)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #187 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		l1.a("Answers", stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:ldc1            #136 <String "Answers">
	//   16   28:aload_3         
	//   17   29:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   18   32:invokeinterface #143 <Method void l.a(String, String)>
		eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customevent));
	//   19   37:aload_0         
	//   20   38:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   21   41:aload_1         
	//   22   42:invokestatic    #195 <Method SessionEvent$Builder SessionEvent.customEventBuilder(CustomEvent)>
	//   23   45:invokevirtual   #198 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   24   48:return          
	}

	public void onError(String s)
	{
	//    0    0:return          
	}

	public void onInstall(long l1)
	{
		c.g().a("Answers", "Logged install");
	//    0    0:invokestatic    #64  <Method l c.g()>
	//    1    3:ldc1            #136 <String "Answers">
	//    2    5:ldc1            #201 <String "Logged install">
	//    3    7:invokeinterface #143 <Method void l.a(String, String)>
		eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(l1));
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    6   16:lload_1         
	//    7   17:invokestatic    #205 <Method SessionEvent$Builder SessionEvent.installEventBuilder(long)>
	//    8   20:invokevirtual   #208 <Method void AnswersEventsHandler.processEventAsyncAndFlush(SessionEvent$Builder)>
	//    9   23:return          
	}

	public void onLifecycle(Activity activity, SessionEvent.Type type)
	{
		l l1 = c.g();
	//    0    0:invokestatic    #64  <Method l c.g()>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #177 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Logged lifecycle event: ");
	//    6   13:aload           4
	//    7   15:ldc1            #212 <String "Logged lifecycle event: ">
	//    8   17:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(type.name());
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #217 <Method String SessionEvent$Type.name()>
	//   13   27:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		l1.a("Answers", stringbuilder.toString());
	//   15   31:aload_3         
	//   16   32:ldc1            #136 <String "Answers">
	//   17   34:aload           4
	//   18   36:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   19   39:invokeinterface #143 <Method void l.a(String, String)>
		eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
	//   20   44:aload_0         
	//   21   45:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   22   48:aload_2         
	//   23   49:aload_1         
	//   24   50:invokestatic    #221 <Method SessionEvent$Builder SessionEvent.lifecycleEventBuilder(SessionEvent$Type, Activity)>
	//   25   53:invokevirtual   #198 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   26   56:return          
	}

	public void onPredefined(PredefinedEvent predefinedevent)
	{
		l l1 = c.g();
	//    0    0:invokestatic    #64  <Method l c.g()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #177 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Logged predefined event: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #225 <String "Logged predefined event: ">
	//    8   15:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (predefinedevent)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #187 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		l1.a("Answers", stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:ldc1            #136 <String "Answers">
	//   16   28:aload_3         
	//   17   29:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   18   32:invokeinterface #143 <Method void l.a(String, String)>
		eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedevent));
	//   19   37:aload_0         
	//   20   38:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//   21   41:aload_1         
	//   22   42:invokestatic    #229 <Method SessionEvent$Builder SessionEvent.predefinedEventBuilder(PredefinedEvent)>
	//   23   45:invokevirtual   #198 <Method void AnswersEventsHandler.processEventAsync(SessionEvent$Builder)>
	//   24   48:return          
	}

	public void setAnalyticsSettingsData(b.a.a.a.a.g.b b1, String s)
	{
		backgroundManager.setFlushOnBackground(b1.j);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field BackgroundManager backgroundManager>
	//    2    4:aload_1         
	//    3    5:getfield        #237 <Field boolean b.a.a.a.a.g.b.j>
	//    4    8:invokevirtual   #241 <Method void BackgroundManager.setFlushOnBackground(boolean)>
		eventsHandler.setAnalyticsSettingsData(b1, s);
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field AnswersEventsHandler eventsHandler>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #243 <Method void AnswersEventsHandler.setAnalyticsSettingsData(b.a.a.a.a.g.b, String)>
	//   10   20:return          
	}

	static final String EXECUTOR_SERVICE = "Answers Events Handler";
	static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
	final BackgroundManager backgroundManager;
	final AnswersEventsHandler eventsHandler;
	private final long installedAt;
	final a lifecycleManager;
	final AnswersPreferenceManager preferenceManager;
}
