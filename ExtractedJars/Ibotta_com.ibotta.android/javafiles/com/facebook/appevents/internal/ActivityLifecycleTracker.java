// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.internal.*;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.appevents.internal:
//			SessionInfo, Constants, AppEventUtility, SessionLogger, 
//			SourceApplicationInfo, AutomaticAnalyticsLogger

public class ActivityLifecycleTracker
{

	public ActivityLifecycleTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	private static void cancelCurrentTask()
	{
		synchronized(currentFutureLock)
	//*   0    0:getstatic       #56  <Field Object currentFutureLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(currentFuture != null)
	//*   4    6:getstatic       #104 <Field ScheduledFuture currentFuture>
	//*   5    9:ifnull          22
				currentFuture.cancel(false);
	//    6   12:getstatic       #104 <Field ScheduledFuture currentFuture>
	//    7   15:iconst_0        
	//    8   16:invokeinterface #116 <Method boolean ScheduledFuture.cancel(boolean)>
	//    9   21:pop             
			currentFuture = null;
	//   10   22:aconst_null     
	//   11   23:putstatic       #104 <Field ScheduledFuture currentFuture>
		}
	//   12   26:aload_0         
	//   13   27:monitorexit     
		return;
	//   14   28:return          
		exception;
	//   15   29:astore_1        
		obj;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		throw exception;
	//   18   32:aload_1         
	//   19   33:athrow          
	}

	public static UUID getCurrentSessionGuid()
	{
		if(currentSession != null)
	//*   0    0:getstatic       #86  <Field SessionInfo currentSession>
	//*   1    3:ifnull          13
			return currentSession.getSessionId();
	//    2    6:getstatic       #86  <Field SessionInfo currentSession>
	//    3    9:invokevirtual   #123 <Method UUID SessionInfo.getSessionId()>
	//    4   12:areturn         
		else
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
	}

	private static int getSessionTimeoutInSeconds()
	{
		FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
	//    0    0:invokestatic    #128 <Method String FacebookSdk.getApplicationId()>
	//    1    3:invokestatic    #134 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    2    6:astore_0        
		if(fetchedappsettings == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       15
			return Constants.getDefaultAppEventsSessionTimeoutInSeconds();
	//    5   11:invokestatic    #139 <Method int Constants.getDefaultAppEventsSessionTimeoutInSeconds()>
	//    6   14:ireturn         
		else
			return fetchedappsettings.getSessionTimeoutInSeconds();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #142 <Method int FetchedAppSettings.getSessionTimeoutInSeconds()>
	//    9   19:ireturn         
	}

	public static void onActivityCreated(Activity activity)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #148 <Method long System.currentTimeMillis()>
	//    1    3:lstore_1        
		activity = ((Activity) (new Runnable(activity.getApplicationContext(), Utility.getActivityName(((Context) (activity))), l, SourceApplicationInfo.Factory.create(activity)) {

			public void run()
			{
				if(ActivityLifecycleTracker.currentSession == null)
			//*   0    0:invokestatic    #38  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*   1    3:ifnonnull       76
				{
					SessionInfo sessioninfo = SessionInfo.getStoredSessionInfo();
			//    2    6:invokestatic    #43  <Method SessionInfo SessionInfo.getStoredSessionInfo()>
			//    3    9:astore_1        
					if(sessioninfo != null)
			//*   4   10:aload_1         
			//*   5   11:ifnull          29
						SessionLogger.logDeactivateApp(applicationContext, activityName, sessioninfo, ActivityLifecycleTracker.appId);
			//    6   14:aload_0         
			//    7   15:getfield        #23  <Field Context val$applicationContext>
			//    8   18:aload_0         
			//    9   19:getfield        #25  <Field String val$activityName>
			//   10   22:aload_1         
			//   11   23:invokestatic    #47  <Method String ActivityLifecycleTracker.access$300()>
			//   12   26:invokestatic    #53  <Method void SessionLogger.logDeactivateApp(Context, String, SessionInfo, String)>
					ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTime), ((Long) (null)));
			//   13   29:new             #40  <Class SessionInfo>
			//   14   32:dup             
			//   15   33:aload_0         
			//   16   34:getfield        #27  <Field long val$currentTime>
			//   17   37:invokestatic    #59  <Method Long Long.valueOf(long)>
			//   18   40:aconst_null     
			//   19   41:invokespecial   #62  <Method void SessionInfo(Long, Long)>
			//   20   44:invokestatic    #66  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//   21   47:pop             
					ActivityLifecycleTracker.currentSession.setSourceApplicationInfo(sourceApplicationInfo);
			//   22   48:invokestatic    #38  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   23   51:aload_0         
			//   24   52:getfield        #29  <Field SourceApplicationInfo val$sourceApplicationInfo>
			//   25   55:invokevirtual   #70  <Method void SessionInfo.setSourceApplicationInfo(SourceApplicationInfo)>
					SessionLogger.logActivateApp(applicationContext, activityName, sourceApplicationInfo, ActivityLifecycleTracker.appId);
			//   26   58:aload_0         
			//   27   59:getfield        #23  <Field Context val$applicationContext>
			//   28   62:aload_0         
			//   29   63:getfield        #25  <Field String val$activityName>
			//   30   66:aload_0         
			//   31   67:getfield        #29  <Field SourceApplicationInfo val$sourceApplicationInfo>
			//   32   70:invokestatic    #47  <Method String ActivityLifecycleTracker.access$300()>
			//   33   73:invokestatic    #74  <Method void SessionLogger.logActivateApp(Context, String, SourceApplicationInfo, String)>
				}
			//   34   76:return          
			}

			final String val$activityName;
			final Context val$applicationContext;
			final long val$currentTime;
			final SourceApplicationInfo val$sourceApplicationInfo;

			
			{
				applicationContext = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Context val$applicationContext>
				activityName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String val$activityName>
				currentTime = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #27  <Field long val$currentTime>
				sourceApplicationInfo = sourceapplicationinfo;
			//    9   15:aload_0         
			//   10   16:aload           5
			//   11   18:putfield        #29  <Field SourceApplicationInfo val$sourceApplicationInfo>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
));
	//    2    4:new             #8   <Class ActivityLifecycleTracker$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokevirtual   #154 <Method Context Activity.getApplicationContext()>
	//    6   12:aload_0         
	//    7   13:invokestatic    #160 <Method String Utility.getActivityName(Context)>
	//    8   16:lload_1         
	//    9   17:aload_0         
	//   10   18:invokestatic    #166 <Method SourceApplicationInfo SourceApplicationInfo$Factory.create(Activity)>
	//   11   21:invokespecial   #169 <Method void ActivityLifecycleTracker$2(Context, String, long, SourceApplicationInfo)>
	//   12   24:astore_0        
		singleThreadExecutor.execute(((Runnable) (activity)));
	//   13   25:getstatic       #51  <Field ScheduledExecutorService singleThreadExecutor>
	//   14   28:aload_0         
	//   15   29:invokeinterface #175 <Method void ScheduledExecutorService.execute(Runnable)>
	//   16   34:return          
	}

	private static void onActivityPaused(Activity activity)
	{
		if(foregroundActivityCount.decrementAndGet() < 0)
	//*   0    0:getstatic       #63  <Field AtomicInteger foregroundActivityCount>
	//*   1    3:invokevirtual   #178 <Method int AtomicInteger.decrementAndGet()>
	//*   2    6:ifge            25
		{
			foregroundActivityCount.set(0);
	//    3    9:getstatic       #63  <Field AtomicInteger foregroundActivityCount>
	//    4   12:iconst_0        
	//    5   13:invokevirtual   #181 <Method void AtomicInteger.set(int)>
			Log.w(TAG, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
	//    6   16:getstatic       #43  <Field String TAG>
	//    7   19:ldc1            #183 <String "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method">
	//    8   21:invokestatic    #189 <Method int Log.w(String, String)>
	//    9   24:pop             
		}
		cancelCurrentTask();
	//   10   25:invokestatic    #191 <Method void cancelCurrentTask()>
		long l = System.currentTimeMillis();
	//   11   28:invokestatic    #148 <Method long System.currentTimeMillis()>
	//   12   31:lstore_1        
		Context context = activity.getApplicationContext();
	//   13   32:aload_0         
	//   14   33:invokevirtual   #154 <Method Context Activity.getApplicationContext()>
	//   15   36:astore_3        
		String s = Utility.getActivityName(((Context) (activity)));
	//   16   37:aload_0         
	//   17   38:invokestatic    #160 <Method String Utility.getActivityName(Context)>
	//   18   41:astore          4
		codelessMatcher.remove(activity);
	//   19   43:getstatic       #75  <Field CodelessMatcher codelessMatcher>
	//   20   46:aload_0         
	//   21   47:invokevirtual   #194 <Method void CodelessMatcher.remove(Activity)>
		activity = ((Activity) (new Runnable(l, context, s) {

			public void run()
			{
				if(ActivityLifecycleTracker.currentSession == null)
			//*   0    0:invokestatic    #36  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*   1    3:ifnonnull       25
					ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTime), ((Long) (null)));
			//    2    6:new             #38  <Class SessionInfo>
			//    3    9:dup             
			//    4   10:aload_0         
			//    5   11:getfield        #23  <Field long val$currentTime>
			//    6   14:invokestatic    #44  <Method Long Long.valueOf(long)>
			//    7   17:aconst_null     
			//    8   18:invokespecial   #47  <Method void SessionInfo(Long, Long)>
			//    9   21:invokestatic    #51  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//   10   24:pop             
				ActivityLifecycleTracker.currentSession.setSessionLastEventTime(Long.valueOf(currentTime));
			//   11   25:invokestatic    #36  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   12   28:aload_0         
			//   13   29:getfield        #23  <Field long val$currentTime>
			//   14   32:invokestatic    #44  <Method Long Long.valueOf(long)>
			//   15   35:invokevirtual   #55  <Method void SessionInfo.setSessionLastEventTime(Long)>
				if(ActivityLifecycleTracker.foregroundActivityCount.get() <= 0)
			//*  16   38:invokestatic    #59  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
			//*  17   41:invokevirtual   #65  <Method int AtomicInteger.get()>
			//*  18   44:ifgt            100
				{
					Runnable runnable = new Runnable() {

						public void run()
						{
							if(ActivityLifecycleTracker.foregroundActivityCount.get() <= 0)
						//*   0    0:invokestatic    #26  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
						//*   1    3:invokevirtual   #32  <Method int AtomicInteger.get()>
						//*   2    6:ifgt            40
							{
								SessionLogger.logDeactivateApp(applicationContext, activityName, ActivityLifecycleTracker.currentSession, ActivityLifecycleTracker.appId);
						//    3    9:aload_0         
						//    4   10:getfield        #17  <Field ActivityLifecycleTracker$4 this$0>
						//    5   13:getfield        #36  <Field Context ActivityLifecycleTracker$4.val$applicationContext>
						//    6   16:aload_0         
						//    7   17:getfield        #17  <Field ActivityLifecycleTracker$4 this$0>
						//    8   20:getfield        #40  <Field String ActivityLifecycleTracker$4.val$activityName>
						//    9   23:invokestatic    #44  <Method SessionInfo ActivityLifecycleTracker.access$200()>
						//   10   26:invokestatic    #48  <Method String ActivityLifecycleTracker.access$300()>
						//   11   29:invokestatic    #54  <Method void SessionLogger.logDeactivateApp(Context, String, SessionInfo, String)>
								SessionInfo.clearSavedSessionFromDisk();
						//   12   32:invokestatic    #59  <Method void SessionInfo.clearSavedSessionFromDisk()>
								ActivityLifecycleTracker.currentSession = null;
						//   13   35:aconst_null     
						//   14   36:invokestatic    #63  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
						//   15   39:pop             
							}
							synchronized(ActivityLifecycleTracker.currentFutureLock)
						//*  16   40:invokestatic    #67  <Method Object ActivityLifecycleTracker.access$600()>
						//*  17   43:astore_1        
						//*  18   44:aload_1         
						//*  19   45:monitorenter    
							{
								ActivityLifecycleTracker.currentFuture = null;
						//   20   46:aconst_null     
						//   21   47:invokestatic    #71  <Method ScheduledFuture ActivityLifecycleTracker.access$702(ScheduledFuture)>
						//   22   50:pop             
							}
						//   23   51:aload_1         
						//   24   52:monitorexit     
							return;
						//   25   53:return          
							exception;
						//   26   54:astore_2        
							obj;
						//   27   55:aload_1         
							JVM INSTR monitorexit ;
						//   28   56:monitorexit     
							throw exception;
						//   29   57:aload_2         
						//   30   58:athrow          
						}

						final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ActivityLifecycleTracker$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
;
			//   19   47:new             #13  <Class ActivityLifecycleTracker$4$1>
			//   20   50:dup             
			//   21   51:aload_0         
			//   22   52:invokespecial   #68  <Method void ActivityLifecycleTracker$4$1(ActivityLifecycleTracker$4)>
			//   23   55:astore          6
					synchronized(ActivityLifecycleTracker.currentFutureLock)
			//*  24   57:invokestatic    #72  <Method Object ActivityLifecycleTracker.access$600()>
			//*  25   60:astore          5
			//*  26   62:aload           5
			//*  27   64:monitorenter    
					{
						ActivityLifecycleTracker.currentFuture = ActivityLifecycleTracker.singleThreadExecutor.schedule(runnable, ActivityLifecycleTracker.getSessionTimeoutInSeconds(), TimeUnit.SECONDS);
			//   28   65:invokestatic    #76  <Method ScheduledExecutorService ActivityLifecycleTracker.access$800()>
			//   29   68:aload           6
			//   30   70:invokestatic    #79  <Method int ActivityLifecycleTracker.access$400()>
			//   31   73:i2l             
			//   32   74:getstatic       #85  <Field TimeUnit TimeUnit.SECONDS>
			//   33   77:invokeinterface #91  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
			//   34   82:invokestatic    #95  <Method ScheduledFuture ActivityLifecycleTracker.access$702(ScheduledFuture)>
			//   35   85:pop             
					}
			//   36   86:aload           5
			//   37   88:monitorexit     
				}
				break MISSING_BLOCK_LABEL_100;
			//   38   89:goto            100
				exception;
			//   39   92:astore          6
				obj;
			//   40   94:aload           5
				JVM INSTR monitorexit ;
			//   41   96:monitorexit     
				throw exception;
			//   42   97:aload           6
			//   43   99:athrow          
				long l2 = ActivityLifecycleTracker.currentActivityAppearTime;
			//   44  100:invokestatic    #99  <Method long ActivityLifecycleTracker.access$900()>
			//   45  103:lstore_3        
				long l1 = 0L;
			//   46  104:lconst_0        
			//   47  105:lstore_1        
				if(l2 > 0L)
			//*  48  106:lload_3         
			//*  49  107:lconst_0        
			//*  50  108:lcmp            
			//*  51  109:ifle            123
					l1 = (currentTime - l2) / 1000L;
			//   52  112:aload_0         
			//   53  113:getfield        #23  <Field long val$currentTime>
			//   54  116:lload_3         
			//   55  117:lsub            
			//   56  118:ldc2w           #100 <Long 1000L>
			//   57  121:ldiv            
			//   58  122:lstore_1        
				AutomaticAnalyticsLogger.logActivityTimeSpentEvent(activityName, l1);
			//   59  123:aload_0         
			//   60  124:getfield        #27  <Field String val$activityName>
			//   61  127:lload_1         
			//   62  128:invokestatic    #107 <Method void AutomaticAnalyticsLogger.logActivityTimeSpentEvent(String, long)>
				ActivityLifecycleTracker.currentSession.writeSessionToDisk();
			//   63  131:invokestatic    #36  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   64  134:invokevirtual   #110 <Method void SessionInfo.writeSessionToDisk()>
				return;
			//   65  137:return          
			}

			final String val$activityName;
			final Context val$applicationContext;
			final long val$currentTime;

			
			{
				currentTime = l;
			//    0    0:aload_0         
			//    1    1:lload_1         
			//    2    2:putfield        #23  <Field long val$currentTime>
				applicationContext = context;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #25  <Field Context val$applicationContext>
				activityName = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #27  <Field String val$activityName>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #30  <Method void Object()>
			//   11   20:return          
			}
		}
));
	//   22   50:new             #12  <Class ActivityLifecycleTracker$4>
	//   23   53:dup             
	//   24   54:lload_1         
	//   25   55:aload_3         
	//   26   56:aload           4
	//   27   58:invokespecial   #197 <Method void ActivityLifecycleTracker$4(long, Context, String)>
	//   28   61:astore_0        
		singleThreadExecutor.execute(((Runnable) (activity)));
	//   29   62:getstatic       #51  <Field ScheduledExecutorService singleThreadExecutor>
	//   30   65:aload_0         
	//   31   66:invokeinterface #175 <Method void ScheduledExecutorService.execute(Runnable)>
	//   32   71:return          
	}

	public static void onActivityResumed(Activity activity)
	{
		foregroundActivityCount.incrementAndGet();
	//    0    0:getstatic       #63  <Field AtomicInteger foregroundActivityCount>
	//    1    3:invokevirtual   #201 <Method int AtomicInteger.incrementAndGet()>
	//    2    6:pop             
		cancelCurrentTask();
	//    3    7:invokestatic    #191 <Method void cancelCurrentTask()>
		long l = System.currentTimeMillis();
	//    4   10:invokestatic    #148 <Method long System.currentTimeMillis()>
	//    5   13:lstore_1        
		currentActivityAppearTime = l;
	//    6   14:lload_1         
	//    7   15:putstatic       #109 <Field long currentActivityAppearTime>
		Context context = activity.getApplicationContext();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #154 <Method Context Activity.getApplicationContext()>
	//   10   22:astore_3        
		String s = Utility.getActivityName(((Context) (activity)));
	//   11   23:aload_0         
	//   12   24:invokestatic    #160 <Method String Utility.getActivityName(Context)>
	//   13   27:astore          4
		codelessMatcher.add(activity);
	//   14   29:getstatic       #75  <Field CodelessMatcher codelessMatcher>
	//   15   32:aload_0         
	//   16   33:invokevirtual   #204 <Method void CodelessMatcher.add(Activity)>
		activity = ((Activity) (new Runnable(l, context, s) {

			public void run()
			{
				if(ActivityLifecycleTracker.currentSession == null)
			//*   0    0:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*   1    3:ifnonnull       43
				{
					ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTime), ((Long) (null)));
			//    2    6:new             #36  <Class SessionInfo>
			//    3    9:dup             
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field long val$currentTime>
			//    6   14:invokestatic    #42  <Method Long Long.valueOf(long)>
			//    7   17:aconst_null     
			//    8   18:invokespecial   #45  <Method void SessionInfo(Long, Long)>
			//    9   21:invokestatic    #49  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//   10   24:pop             
					SessionLogger.logActivateApp(applicationContext, activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.appId);
			//   11   25:aload_0         
			//   12   26:getfield        #23  <Field Context val$applicationContext>
			//   13   29:aload_0         
			//   14   30:getfield        #25  <Field String val$activityName>
			//   15   33:aconst_null     
			//   16   34:invokestatic    #53  <Method String ActivityLifecycleTracker.access$300()>
			//   17   37:invokestatic    #59  <Method void SessionLogger.logActivateApp(Context, String, SourceApplicationInfo, String)>
				} else
			//*  18   40:goto            148
				if(ActivityLifecycleTracker.currentSession.getSessionLastEventTime() != null)
			//*  19   43:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*  20   46:invokevirtual   #63  <Method Long SessionInfo.getSessionLastEventTime()>
			//*  21   49:ifnull          148
				{
					long l1 = currentTime - ActivityLifecycleTracker.currentSession.getSessionLastEventTime().longValue();
			//   22   52:aload_0         
			//   23   53:getfield        #21  <Field long val$currentTime>
			//   24   56:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   25   59:invokevirtual   #63  <Method Long SessionInfo.getSessionLastEventTime()>
			//   26   62:invokevirtual   #67  <Method long Long.longValue()>
			//   27   65:lsub            
			//   28   66:lstore_1        
					if(l1 > (long)(ActivityLifecycleTracker.getSessionTimeoutInSeconds() * 1000))
			//*  29   67:lload_1         
			//*  30   68:invokestatic    #71  <Method int ActivityLifecycleTracker.access$400()>
			//*  31   71:sipush          1000
			//*  32   74:imul            
			//*  33   75:i2l             
			//*  34   76:lcmp            
			//*  35   77:ifle            134
					{
						SessionLogger.logDeactivateApp(applicationContext, activityName, ActivityLifecycleTracker.currentSession, ActivityLifecycleTracker.appId);
			//   36   80:aload_0         
			//   37   81:getfield        #23  <Field Context val$applicationContext>
			//   38   84:aload_0         
			//   39   85:getfield        #25  <Field String val$activityName>
			//   40   88:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   41   91:invokestatic    #53  <Method String ActivityLifecycleTracker.access$300()>
			//   42   94:invokestatic    #75  <Method void SessionLogger.logDeactivateApp(Context, String, SessionInfo, String)>
						SessionLogger.logActivateApp(applicationContext, activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.appId);
			//   43   97:aload_0         
			//   44   98:getfield        #23  <Field Context val$applicationContext>
			//   45  101:aload_0         
			//   46  102:getfield        #25  <Field String val$activityName>
			//   47  105:aconst_null     
			//   48  106:invokestatic    #53  <Method String ActivityLifecycleTracker.access$300()>
			//   49  109:invokestatic    #59  <Method void SessionLogger.logActivateApp(Context, String, SourceApplicationInfo, String)>
						ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTime), ((Long) (null)));
			//   50  112:new             #36  <Class SessionInfo>
			//   51  115:dup             
			//   52  116:aload_0         
			//   53  117:getfield        #21  <Field long val$currentTime>
			//   54  120:invokestatic    #42  <Method Long Long.valueOf(long)>
			//   55  123:aconst_null     
			//   56  124:invokespecial   #45  <Method void SessionInfo(Long, Long)>
			//   57  127:invokestatic    #49  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//   58  130:pop             
					} else
			//*  59  131:goto            148
					if(l1 > 1000L)
			//*  60  134:lload_1         
			//*  61  135:ldc2w           #76  <Long 1000L>
			//*  62  138:lcmp            
			//*  63  139:ifle            148
						ActivityLifecycleTracker.currentSession.incrementInterruptionCount();
			//   64  142:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   65  145:invokevirtual   #80  <Method void SessionInfo.incrementInterruptionCount()>
				}
				ActivityLifecycleTracker.currentSession.setSessionLastEventTime(Long.valueOf(currentTime));
			//   66  148:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   67  151:aload_0         
			//   68  152:getfield        #21  <Field long val$currentTime>
			//   69  155:invokestatic    #42  <Method Long Long.valueOf(long)>
			//   70  158:invokevirtual   #84  <Method void SessionInfo.setSessionLastEventTime(Long)>
				ActivityLifecycleTracker.currentSession.writeSessionToDisk();
			//   71  161:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   72  164:invokevirtual   #87  <Method void SessionInfo.writeSessionToDisk()>
			//   73  167:return          
			}

			final String val$activityName;
			final Context val$applicationContext;
			final long val$currentTime;

			
			{
				currentTime = l;
			//    0    0:aload_0         
			//    1    1:lload_1         
			//    2    2:putfield        #21  <Field long val$currentTime>
				applicationContext = context;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field Context val$applicationContext>
				activityName = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #25  <Field String val$activityName>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #28  <Method void Object()>
			//   11   20:return          
			}
		}
));
	//   17   36:new             #10  <Class ActivityLifecycleTracker$3>
	//   18   39:dup             
	//   19   40:lload_1         
	//   20   41:aload_3         
	//   21   42:aload           4
	//   22   44:invokespecial   #205 <Method void ActivityLifecycleTracker$3(long, Context, String)>
	//   23   47:astore_0        
		singleThreadExecutor.execute(((Runnable) (activity)));
	//   24   48:getstatic       #51  <Field ScheduledExecutorService singleThreadExecutor>
	//   25   51:aload_0         
	//   26   52:invokeinterface #175 <Method void ScheduledExecutorService.execute(Runnable)>
	//   27   57:return          
	}

	public static void startTracking(Application application, String s)
	{
		if(!tracking.compareAndSet(false, true))
	//*   0    0:getstatic       #70  <Field AtomicBoolean tracking>
	//*   1    3:iconst_0        
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #211 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			appId = s;
	//    6   12:aload_1         
	//    7   13:putstatic       #91  <Field String appId>
			application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

				public void onActivityCreated(Activity activity, Bundle bundle)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityCreated");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #29  <String "onActivityCreated">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventUtility.assertIsMainThread();
				//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
					ActivityLifecycleTracker.onActivityCreated(activity);
				//    5   14:aload_1         
				//    6   15:invokestatic    #43  <Method void ActivityLifecycleTracker.onActivityCreated(Activity)>
				//    7   18:return          
				}

				public void onActivityDestroyed(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityDestroyed");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #45  <String "onActivityDestroyed">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
				//    4   11:return          
				}

				public void onActivityPaused(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityPaused");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #47  <String "onActivityPaused">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventUtility.assertIsMainThread();
				//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
					ActivityLifecycleTracker.onActivityPaused(activity);
				//    5   14:aload_1         
				//    6   15:invokestatic    #50  <Method void ActivityLifecycleTracker.access$100(Activity)>
				//    7   18:return          
				}

				public void onActivityResumed(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityResumed");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #52  <String "onActivityResumed">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventUtility.assertIsMainThread();
				//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
					ActivityLifecycleTracker.onActivityResumed(activity);
				//    5   14:aload_1         
				//    6   15:invokestatic    #54  <Method void ActivityLifecycleTracker.onActivityResumed(Activity)>
				//    7   18:return          
				}

				public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivitySaveInstanceState");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #56  <String "onActivitySaveInstanceState">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
				//    4   11:return          
				}

				public void onActivityStarted(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStarted");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #58  <String "onActivityStarted">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
				//    4   11:return          
				}

				public void onActivityStopped(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStopped");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #60  <String "onActivityStopped">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventsLogger.onContextStop();
				//    4   11:invokestatic    #65  <Method void AppEventsLogger.onContextStop()>
				//    5   14:return          
				}

			}
);
	//    8   16:aload_0         
	//    9   17:new             #6   <Class ActivityLifecycleTracker$1>
	//   10   20:dup             
	//   11   21:invokespecial   #212 <Method void ActivityLifecycleTracker$1()>
	//   12   24:invokevirtual   #218 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			return;
	//   13   27:return          
		}
	}

	private static final String TAG = ((Class) (com/facebook/appevents/internal/ActivityLifecycleTracker)).getCanonicalName();
	private static String appId;
	private static final CodelessMatcher codelessMatcher = new CodelessMatcher();
	private static long currentActivityAppearTime;
	private static volatile ScheduledFuture currentFuture;
	private static final Object currentFutureLock = new Object();
	private static volatile SessionInfo currentSession;
	private static AtomicInteger foregroundActivityCount = new AtomicInteger(0);
	private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
	private static AtomicBoolean tracking = new AtomicBoolean(false);

	static 
	{
	//    0    0:ldc1            #2   <Class ActivityLifecycleTracker>
	//    1    2:invokevirtual   #41  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #43  <Field String TAG>
	//    3    8:invokestatic    #49  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//    4   11:putstatic       #51  <Field ScheduledExecutorService singleThreadExecutor>
	//    5   14:new             #4   <Class Object>
	//    6   17:dup             
	//    7   18:invokespecial   #54  <Method void Object()>
	//    8   21:putstatic       #56  <Field Object currentFutureLock>
	//    9   24:new             #58  <Class AtomicInteger>
	//   10   27:dup             
	//   11   28:iconst_0        
	//   12   29:invokespecial   #61  <Method void AtomicInteger(int)>
	//   13   32:putstatic       #63  <Field AtomicInteger foregroundActivityCount>
	//   14   35:new             #65  <Class AtomicBoolean>
	//   15   38:dup             
	//   16   39:iconst_0        
	//   17   40:invokespecial   #68  <Method void AtomicBoolean(boolean)>
	//   18   43:putstatic       #70  <Field AtomicBoolean tracking>
	//   19   46:new             #72  <Class CodelessMatcher>
	//   20   49:dup             
	//   21   50:invokespecial   #73  <Method void CodelessMatcher()>
	//   22   53:putstatic       #75  <Field CodelessMatcher codelessMatcher>
	//*  23   56:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #43  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static void access$100(Activity activity)
	{
		onActivityPaused(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method void onActivityPaused(Activity)>
		return;
	//    2    4:return          
	}

*/


/*
	static SessionInfo access$200()
	{
		return currentSession;
	//    0    0:getstatic       #86  <Field SessionInfo currentSession>
	//    1    3:areturn         
	}

*/


/*
	static SessionInfo access$202(SessionInfo sessioninfo)
	{
		currentSession = sessioninfo;
	//    0    0:aload_0         
	//    1    1:putstatic       #86  <Field SessionInfo currentSession>
		return sessioninfo;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static String access$300()
	{
		return appId;
	//    0    0:getstatic       #91  <Field String appId>
	//    1    3:areturn         
	}

*/


/*
	static int access$400()
	{
		return getSessionTimeoutInSeconds();
	//    0    0:invokestatic    #96  <Method int getSessionTimeoutInSeconds()>
	//    1    3:ireturn         
	}

*/


/*
	static AtomicInteger access$500()
	{
		return foregroundActivityCount;
	//    0    0:getstatic       #63  <Field AtomicInteger foregroundActivityCount>
	//    1    3:areturn         
	}

*/


/*
	static Object access$600()
	{
		return currentFutureLock;
	//    0    0:getstatic       #56  <Field Object currentFutureLock>
	//    1    3:areturn         
	}

*/


/*
	static ScheduledFuture access$702(ScheduledFuture scheduledfuture)
	{
		currentFuture = scheduledfuture;
	//    0    0:aload_0         
	//    1    1:putstatic       #104 <Field ScheduledFuture currentFuture>
		return scheduledfuture;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static ScheduledExecutorService access$800()
	{
		return singleThreadExecutor;
	//    0    0:getstatic       #51  <Field ScheduledExecutorService singleThreadExecutor>
	//    1    3:areturn         
	}

*/


/*
	static long access$900()
	{
		return currentActivityAppearTime;
	//    0    0:getstatic       #109 <Field long currentActivityAppearTime>
	//    1    3:lreturn         
	}

*/
}
