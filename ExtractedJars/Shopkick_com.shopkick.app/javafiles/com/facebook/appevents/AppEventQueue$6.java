// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventQueue, AppEventStore, AccessTokenAppIdPair, SessionEventsState

static final class AppEventQueue$6
	implements Runnable
{

	public void run()
	{
		AppEventStore.persistEvents(val$accessTokenAppId, val$appEvents);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccessTokenAppIdPair val$accessTokenAppId>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field SessionEventsState val$appEvents>
	//    4    8:invokestatic    #31  <Method void AppEventStore.persistEvents(AccessTokenAppIdPair, SessionEventsState)>
	//    5   11:return          
	}

	final AccessTokenAppIdPair val$accessTokenAppId;
	final SessionEventsState val$appEvents;

	AppEventQueue$6(AccessTokenAppIdPair accesstokenappidpair, SessionEventsState sessioneventsstate)
	{
		val$accessTokenAppId = accesstokenappidpair;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AccessTokenAppIdPair val$accessTokenAppId>
		val$appEvents = sessioneventsstate;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SessionEventsState val$appEvents>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
