// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

// Referenced classes of package com.facebook.appevents:
//			AppEventQueue, AccessTokenAppIdPair, SessionEventsState, FlushStatistics

static final class AppEventQueue$5
	implements com.facebook.lback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		AppEventQueue.access$400(val$accessTokenAppId, val$postRequest, graphresponse, val$appEvents, val$flushState);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AccessTokenAppIdPair val$accessTokenAppId>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field GraphRequest val$postRequest>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field SessionEventsState val$appEvents>
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field FlushStatistics val$flushState>
	//    9   17:invokestatic    #39  <Method void AppEventQueue.access$400(AccessTokenAppIdPair, GraphRequest, GraphResponse, SessionEventsState, FlushStatistics)>
	//   10   20:return          
	}

	final AccessTokenAppIdPair val$accessTokenAppId;
	final SessionEventsState val$appEvents;
	final FlushStatistics val$flushState;
	final GraphRequest val$postRequest;

	AppEventQueue$5(AccessTokenAppIdPair accesstokenappidpair, GraphRequest graphrequest, SessionEventsState sessioneventsstate, FlushStatistics flushstatistics)
	{
		val$accessTokenAppId = accesstokenappidpair;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AccessTokenAppIdPair val$accessTokenAppId>
		val$postRequest = graphrequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field GraphRequest val$postRequest>
		val$appEvents = sessioneventsstate;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field SessionEventsState val$appEvents>
		val$flushState = flushstatistics;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field FlushStatistics val$flushState>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
