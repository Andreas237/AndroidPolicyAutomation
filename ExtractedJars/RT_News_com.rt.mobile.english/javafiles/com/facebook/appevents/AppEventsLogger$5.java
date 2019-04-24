// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Context;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$5
	implements Runnable
{

	public void run()
	{
		AppEventsLogger.access$600(val$context, val$accessTokenAppId).addEvent(val$event);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context val$context>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
	//    4    8:invokestatic    #34  <Method AppEventsLogger$SessionEventsState AppEventsLogger.access$600(Context, AppEventsLogger$AccessTokenAppIdPair)>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field AppEventsLogger$AppEvent val$event>
	//    7   15:invokevirtual   #40  <Method void AppEventsLogger$SessionEventsState.addEvent(AppEventsLogger$AppEvent)>
		AppEventsLogger.access$700();
	//    8   18:invokestatic    #43  <Method void AppEventsLogger.access$700()>
	//    9   21:return          
	}

	final cessTokenAppIdPair val$accessTokenAppId;
	final Context val$context;
	final pEvent val$event;

	AppEventsLogger$5(Context context1, cessTokenAppIdPair cesstokenappidpair, pEvent pevent)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Context val$context>
		val$accessTokenAppId = cesstokenappidpair;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
		val$event = pevent;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field AppEventsLogger$AppEvent val$event>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
