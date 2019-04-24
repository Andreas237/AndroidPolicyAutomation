// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$PersistedAppSessionInfo$1
	implements Runnable
{

	public void run()
	{
		AppEventsLogger.PersistedAppSessionInfo.saveAppSessionInformation(AppEventsLogger.access$1000());
	//    0    0:invokestatic    #21  <Method android.content.Context AppEventsLogger.access$1000()>
	//    1    3:invokestatic    #25  <Method void AppEventsLogger$PersistedAppSessionInfo.saveAppSessionInformation(android.content.Context)>
	//    2    6:return          
	}

	AppEventsLogger$PersistedAppSessionInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
