// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;

// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, SessionInfo, SessionLogger, SourceApplicationInfo

static final class ActivityLifecycleTracker$2
	implements Runnable
{

	public void run()
	{
		if(ActivityLifecycleTracker.access$200() == null)
	//*   0    0:invokestatic    #38  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//*   1    3:ifnonnull       76
		{
			SessionInfo sessioninfo = SessionInfo.getStoredSessionInfo();
	//    2    6:invokestatic    #43  <Method SessionInfo SessionInfo.getStoredSessionInfo()>
	//    3    9:astore_1        
			if(sessioninfo != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          29
				SessionLogger.logDeactivateApp(val$applicationContext, val$activityName, sessioninfo, ActivityLifecycleTracker.access$300());
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field Context val$applicationContext>
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field String val$activityName>
	//   10   22:aload_1         
	//   11   23:invokestatic    #47  <Method String ActivityLifecycleTracker.access$300()>
	//   12   26:invokestatic    #53  <Method void SessionLogger.logDeactivateApp(Context, String, SessionInfo, String)>
			SessionInfo _tmp = ActivityLifecycleTracker.access$202(new SessionInfo(Long.valueOf(val$currentTime), ((Long) (null))));
	//   13   29:new             #40  <Class SessionInfo>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:getfield        #27  <Field long val$currentTime>
	//   17   37:invokestatic    #59  <Method Long Long.valueOf(long)>
	//   18   40:aconst_null     
	//   19   41:invokespecial   #62  <Method void SessionInfo(Long, Long)>
	//   20   44:invokestatic    #66  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
	//   21   47:pop             
			ActivityLifecycleTracker.access$200().setSourceApplicationInfo(val$sourceApplicationInfo);
	//   22   48:invokestatic    #38  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   23   51:aload_0         
	//   24   52:getfield        #29  <Field SourceApplicationInfo val$sourceApplicationInfo>
	//   25   55:invokevirtual   #70  <Method void SessionInfo.setSourceApplicationInfo(SourceApplicationInfo)>
			SessionLogger.logActivateApp(val$applicationContext, val$activityName, val$sourceApplicationInfo, ActivityLifecycleTracker.access$300());
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

	ActivityLifecycleTracker$2(Context context, String s, long l, SourceApplicationInfo sourceapplicationinfo)
	{
		val$applicationContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Context val$applicationContext>
		val$activityName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String val$activityName>
		val$currentTime = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #27  <Field long val$currentTime>
		val$sourceApplicationInfo = sourceapplicationinfo;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #29  <Field SourceApplicationInfo val$sourceApplicationInfo>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
