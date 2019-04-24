// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

private static class AppEventsLogger$FlushStatistics
{

	public int numEvents;
	public AppEventsLogger.FlushResult result;

	private AppEventsLogger$FlushStatistics()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		numEvents = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int numEvents>
		result = AppEventsLogger.FlushResult.SUCCESS;
	//    5    9:aload_0         
	//    6   10:getstatic       #22  <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.SUCCESS>
	//    7   13:putfield        #24  <Field AppEventsLogger$FlushResult result>
	//    8   16:return          
	}

	AppEventsLogger$FlushStatistics(AppEventsLogger._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AppEventsLogger$FlushStatistics()>
	//    2    4:return          
	}
}
