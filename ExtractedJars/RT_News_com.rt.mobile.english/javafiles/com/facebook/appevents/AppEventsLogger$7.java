// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$7
	implements com.facebook.ack
{

	public void onCompleted(GraphResponse graphresponse)
	{
		AppEventsLogger.access$900(val$accessTokenAppId, val$postRequest, graphresponse, val$sessionEventsState, val$flushState);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field GraphRequest val$postRequest>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field AppEventsLogger$SessionEventsState val$sessionEventsState>
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field AppEventsLogger$FlushStatistics val$flushState>
	//    9   17:invokestatic    #39  <Method void AppEventsLogger.access$900(AppEventsLogger$AccessTokenAppIdPair, GraphRequest, GraphResponse, AppEventsLogger$SessionEventsState, AppEventsLogger$FlushStatistics)>
	//   10   20:return          
	}

	final cessTokenAppIdPair val$accessTokenAppId;
	final ushStatistics val$flushState;
	final GraphRequest val$postRequest;
	final ssionEventsState val$sessionEventsState;

	AppEventsLogger$7(cessTokenAppIdPair cesstokenappidpair, GraphRequest graphrequest, ssionEventsState ssioneventsstate, ushStatistics ushstatistics)
	{
		val$accessTokenAppId = cesstokenappidpair;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
		val$postRequest = graphrequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field GraphRequest val$postRequest>
		val$sessionEventsState = ssioneventsstate;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field AppEventsLogger$SessionEventsState val$sessionEventsState>
		val$flushState = ushstatistics;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field AppEventsLogger$FlushStatistics val$flushState>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
