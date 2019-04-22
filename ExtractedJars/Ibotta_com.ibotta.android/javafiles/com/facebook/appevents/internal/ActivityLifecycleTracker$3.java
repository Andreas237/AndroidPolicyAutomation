// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;

// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, SessionInfo, SessionLogger

static final class ActivityLifecycleTracker$3
	implements Runnable
{

	public void run()
	{
		if(ActivityLifecycleTracker.access$200() == null)
	//*   0    0:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//*   1    3:ifnonnull       43
		{
			SessionInfo _tmp = ActivityLifecycleTracker.access$202(new SessionInfo(Long.valueOf(val$currentTime), ((Long) (null))));
	//    2    6:new             #36  <Class SessionInfo>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field long val$currentTime>
	//    6   14:invokestatic    #42  <Method Long Long.valueOf(long)>
	//    7   17:aconst_null     
	//    8   18:invokespecial   #45  <Method void SessionInfo(Long, Long)>
	//    9   21:invokestatic    #49  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
	//   10   24:pop             
			SessionLogger.logActivateApp(val$applicationContext, val$activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.access$300());
	//   11   25:aload_0         
	//   12   26:getfield        #23  <Field Context val$applicationContext>
	//   13   29:aload_0         
	//   14   30:getfield        #25  <Field String val$activityName>
	//   15   33:aconst_null     
	//   16   34:invokestatic    #53  <Method String ActivityLifecycleTracker.access$300()>
	//   17   37:invokestatic    #59  <Method void SessionLogger.logActivateApp(Context, String, SourceApplicationInfo, String)>
		} else
	//*  18   40:goto            148
		if(ActivityLifecycleTracker.access$200().getSessionLastEventTime() != null)
	//*  19   43:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//*  20   46:invokevirtual   #63  <Method Long SessionInfo.getSessionLastEventTime()>
	//*  21   49:ifnull          148
		{
			long l = val$currentTime - ActivityLifecycleTracker.access$200().getSessionLastEventTime().longValue();
	//   22   52:aload_0         
	//   23   53:getfield        #21  <Field long val$currentTime>
	//   24   56:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   25   59:invokevirtual   #63  <Method Long SessionInfo.getSessionLastEventTime()>
	//   26   62:invokevirtual   #67  <Method long Long.longValue()>
	//   27   65:lsub            
	//   28   66:lstore_1        
			if(l > (long)(ActivityLifecycleTracker.access$400() * 1000))
	//*  29   67:lload_1         
	//*  30   68:invokestatic    #71  <Method int ActivityLifecycleTracker.access$400()>
	//*  31   71:sipush          1000
	//*  32   74:imul            
	//*  33   75:i2l             
	//*  34   76:lcmp            
	//*  35   77:ifle            134
			{
				SessionLogger.logDeactivateApp(val$applicationContext, val$activityName, ActivityLifecycleTracker.access$200(), ActivityLifecycleTracker.access$300());
	//   36   80:aload_0         
	//   37   81:getfield        #23  <Field Context val$applicationContext>
	//   38   84:aload_0         
	//   39   85:getfield        #25  <Field String val$activityName>
	//   40   88:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   41   91:invokestatic    #53  <Method String ActivityLifecycleTracker.access$300()>
	//   42   94:invokestatic    #75  <Method void SessionLogger.logDeactivateApp(Context, String, SessionInfo, String)>
				SessionLogger.logActivateApp(val$applicationContext, val$activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.access$300());
	//   43   97:aload_0         
	//   44   98:getfield        #23  <Field Context val$applicationContext>
	//   45  101:aload_0         
	//   46  102:getfield        #25  <Field String val$activityName>
	//   47  105:aconst_null     
	//   48  106:invokestatic    #53  <Method String ActivityLifecycleTracker.access$300()>
	//   49  109:invokestatic    #59  <Method void SessionLogger.logActivateApp(Context, String, SourceApplicationInfo, String)>
				SessionInfo _tmp1 = ActivityLifecycleTracker.access$202(new SessionInfo(Long.valueOf(val$currentTime), ((Long) (null))));
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
			if(l > 1000L)
	//*  60  134:lload_1         
	//*  61  135:ldc2w           #76  <Long 1000L>
	//*  62  138:lcmp            
	//*  63  139:ifle            148
				ActivityLifecycleTracker.access$200().incrementInterruptionCount();
	//   64  142:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   65  145:invokevirtual   #80  <Method void SessionInfo.incrementInterruptionCount()>
		}
		ActivityLifecycleTracker.access$200().setSessionLastEventTime(Long.valueOf(val$currentTime));
	//   66  148:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   67  151:aload_0         
	//   68  152:getfield        #21  <Field long val$currentTime>
	//   69  155:invokestatic    #42  <Method Long Long.valueOf(long)>
	//   70  158:invokevirtual   #84  <Method void SessionInfo.setSessionLastEventTime(Long)>
		ActivityLifecycleTracker.access$200().writeSessionToDisk();
	//   71  161:invokestatic    #34  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   72  164:invokevirtual   #87  <Method void SessionInfo.writeSessionToDisk()>
	//   73  167:return          
	}

	final String val$activityName;
	final Context val$applicationContext;
	final long val$currentTime;

	ActivityLifecycleTracker$3(long l, Context context, String s)
	{
		val$currentTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #21  <Field long val$currentTime>
		val$applicationContext = context;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field Context val$applicationContext>
		val$activityName = s;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #25  <Field String val$activityName>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #28  <Method void Object()>
	//   11   20:return          
	}
}
