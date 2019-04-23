// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;


// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, SessionInfo, SessionLogger

static final class ActivityLifecycleTracker$3
	implements Runnable
{

	public void run()
	{
		if(ActivityLifecycleTracker.access$200() == null)
	//*   0    0:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//*   1    3:ifnonnull       39
		{
			SessionInfo _tmp = ActivityLifecycleTracker.access$202(new SessionInfo(Long.valueOf(val$currentTime), ((Long) (null))));
	//    2    6:new             #32  <Class SessionInfo>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field long val$currentTime>
	//    6   14:invokestatic    #38  <Method Long Long.valueOf(long)>
	//    7   17:aconst_null     
	//    8   18:invokespecial   #41  <Method void SessionInfo(Long, Long)>
	//    9   21:invokestatic    #45  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
	//   10   24:pop             
			SessionLogger.logActivateApp(val$activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.access$300());
	//   11   25:aload_0         
	//   12   26:getfield        #21  <Field String val$activityName>
	//   13   29:aconst_null     
	//   14   30:invokestatic    #49  <Method String ActivityLifecycleTracker.access$300()>
	//   15   33:invokestatic    #55  <Method void SessionLogger.logActivateApp(String, SourceApplicationInfo, String)>
		} else
	//*  16   36:goto            136
		if(ActivityLifecycleTracker.access$200().getSessionLastEventTime() != null)
	//*  17   39:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//*  18   42:invokevirtual   #59  <Method Long SessionInfo.getSessionLastEventTime()>
	//*  19   45:ifnull          136
		{
			long l = val$currentTime - ActivityLifecycleTracker.access$200().getSessionLastEventTime().longValue();
	//   20   48:aload_0         
	//   21   49:getfield        #19  <Field long val$currentTime>
	//   22   52:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   23   55:invokevirtual   #59  <Method Long SessionInfo.getSessionLastEventTime()>
	//   24   58:invokevirtual   #63  <Method long Long.longValue()>
	//   25   61:lsub            
	//   26   62:lstore_1        
			if(l > (long)(ActivityLifecycleTracker.access$400() * 1000))
	//*  27   63:lload_1         
	//*  28   64:invokestatic    #67  <Method int ActivityLifecycleTracker.access$400()>
	//*  29   67:sipush          1000
	//*  30   70:imul            
	//*  31   71:i2l             
	//*  32   72:lcmp            
	//*  33   73:ifle            122
			{
				SessionLogger.logDeactivateApp(val$activityName, ActivityLifecycleTracker.access$200(), ActivityLifecycleTracker.access$300());
	//   34   76:aload_0         
	//   35   77:getfield        #21  <Field String val$activityName>
	//   36   80:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   37   83:invokestatic    #49  <Method String ActivityLifecycleTracker.access$300()>
	//   38   86:invokestatic    #71  <Method void SessionLogger.logDeactivateApp(String, SessionInfo, String)>
				SessionLogger.logActivateApp(val$activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.access$300());
	//   39   89:aload_0         
	//   40   90:getfield        #21  <Field String val$activityName>
	//   41   93:aconst_null     
	//   42   94:invokestatic    #49  <Method String ActivityLifecycleTracker.access$300()>
	//   43   97:invokestatic    #55  <Method void SessionLogger.logActivateApp(String, SourceApplicationInfo, String)>
				SessionInfo _tmp1 = ActivityLifecycleTracker.access$202(new SessionInfo(Long.valueOf(val$currentTime), ((Long) (null))));
	//   44  100:new             #32  <Class SessionInfo>
	//   45  103:dup             
	//   46  104:aload_0         
	//   47  105:getfield        #19  <Field long val$currentTime>
	//   48  108:invokestatic    #38  <Method Long Long.valueOf(long)>
	//   49  111:aconst_null     
	//   50  112:invokespecial   #41  <Method void SessionInfo(Long, Long)>
	//   51  115:invokestatic    #45  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
	//   52  118:pop             
			} else
	//*  53  119:goto            136
			if(l > 1000L)
	//*  54  122:lload_1         
	//*  55  123:ldc2w           #72  <Long 1000L>
	//*  56  126:lcmp            
	//*  57  127:ifle            136
				ActivityLifecycleTracker.access$200().incrementInterruptionCount();
	//   58  130:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   59  133:invokevirtual   #76  <Method void SessionInfo.incrementInterruptionCount()>
		}
		ActivityLifecycleTracker.access$200().setSessionLastEventTime(Long.valueOf(val$currentTime));
	//   60  136:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   61  139:aload_0         
	//   62  140:getfield        #19  <Field long val$currentTime>
	//   63  143:invokestatic    #38  <Method Long Long.valueOf(long)>
	//   64  146:invokevirtual   #80  <Method void SessionInfo.setSessionLastEventTime(Long)>
		ActivityLifecycleTracker.access$200().writeSessionToDisk();
	//   65  149:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   66  152:invokevirtual   #83  <Method void SessionInfo.writeSessionToDisk()>
	//   67  155:return          
	}

	final String val$activityName;
	final long val$currentTime;

	ActivityLifecycleTracker$3(long l, String s)
	{
		val$currentTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #19  <Field long val$currentTime>
		val$activityName = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field String val$activityName>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
