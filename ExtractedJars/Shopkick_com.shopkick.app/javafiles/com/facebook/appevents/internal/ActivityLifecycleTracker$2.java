// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;


// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, SessionInfo

static final class ActivityLifecycleTracker$2
	implements Runnable
{

	public void run()
	{
		if(ActivityLifecycleTracker.access$200() == null)
	//*   0    0:invokestatic    #21  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//*   1    3:ifnonnull       13
		{
			SessionInfo _tmp = ActivityLifecycleTracker.access$202(SessionInfo.getStoredSessionInfo());
	//    2    6:invokestatic    #26  <Method SessionInfo SessionInfo.getStoredSessionInfo()>
	//    3    9:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
	//    4   12:pop             
		}
	//    5   13:return          
	}

	ActivityLifecycleTracker$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
