// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.*;
import com.facebook.internal.*;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

// Referenced classes of package com.facebook.appevents:
//			AppEventCollection, AccessTokenAppIdPair, AppEventsLogger, SessionEventsState, 
//			FlushStatistics, AppEventStore, FlushResult, FlushReason, 
//			AppEvent

class AppEventQueue
{

	AppEventQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
	//    2    4:return          
	}

	public static void add(AccessTokenAppIdPair accesstokenappidpair, AppEvent appevent)
	{
		singleThreadExecutor.execute(new Runnable(accesstokenappidpair, appevent) {

			public void run()
			{
				AppEventQueue.appEventCollection.addEvent(accessTokenAppId, appEvent);
			//    0    0:invokestatic    #29  <Method AppEventCollection AppEventQueue.access$100()>
			//    1    3:aload_0         
			//    2    4:getfield        #18  <Field AccessTokenAppIdPair val$accessTokenAppId>
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field AppEvent val$appEvent>
			//    5   11:invokevirtual   #34  <Method void AppEventCollection.addEvent(AccessTokenAppIdPair, AppEvent)>
				if(AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && AppEventQueue.appEventCollection.getEventCount() > 100)
			//*   6   14:invokestatic    #40  <Method AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
			//*   7   17:getstatic       #46  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
			//*   8   20:if_acmpeq       41
			//*   9   23:invokestatic    #29  <Method AppEventCollection AppEventQueue.access$100()>
			//*  10   26:invokevirtual   #50  <Method int AppEventCollection.getEventCount()>
			//*  11   29:bipush          100
			//*  12   31:icmple          41
				{
					AppEventQueue.flushAndWait(FlushReason.EVENT_THRESHOLD);
			//   13   34:getstatic       #56  <Field FlushReason FlushReason.EVENT_THRESHOLD>
			//   14   37:invokestatic    #60  <Method void AppEventQueue.flushAndWait(FlushReason)>
					return;
			//   15   40:return          
				}
				if(AppEventQueue.scheduledFuture == null)
			//*  16   41:invokestatic    #64  <Method ScheduledFuture AppEventQueue.access$000()>
			//*  17   44:ifnonnull       68
					AppEventQueue.scheduledFuture = AppEventQueue.singleThreadExecutor.schedule(AppEventQueue.flushRunnable, 15L, TimeUnit.SECONDS);
			//   18   47:invokestatic    #68  <Method ScheduledExecutorService AppEventQueue.access$300()>
			//   19   50:invokestatic    #72  <Method Runnable AppEventQueue.access$200()>
			//   20   53:ldc2w           #73  <Long 15L>
			//   21   56:getstatic       #80  <Field TimeUnit TimeUnit.SECONDS>
			//   22   59:invokeinterface #86  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
			//   23   64:invokestatic    #90  <Method ScheduledFuture AppEventQueue.access$002(ScheduledFuture)>
			//   24   67:pop             
			//   25   68:return          
			}

			final AccessTokenAppIdPair val$accessTokenAppId;
			final AppEvent val$appEvent;

			
			{
				accessTokenAppId = accesstokenappidpair;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AccessTokenAppIdPair val$accessTokenAppId>
				appEvent = appevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field AppEvent val$appEvent>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:getstatic       #50  <Field ScheduledExecutorService singleThreadExecutor>
	//    1    3:new             #12  <Class AppEventQueue$4>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #77  <Method void AppEventQueue$4(AccessTokenAppIdPair, AppEvent)>
	//    6   12:invokeinterface #83  <Method void ScheduledExecutorService.execute(Runnable)>
	//    7   17:return          
	}

	private static GraphRequest buildRequestForSession(AccessTokenAppIdPair accesstokenappidpair, SessionEventsState sessioneventsstate, boolean flag, FlushStatistics flushstatistics)
	{
		Object obj = ((Object) (accesstokenappidpair.getApplicationId()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method String AccessTokenAppIdPair.getApplicationId()>
	//    2    4:astore          6
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.queryAppSettings(((String) (obj)), false);
	//    5    9:aload           6
	//    6   11:iconst_0        
	//    7   12:invokestatic    #97  <Method FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
	//    8   15:astore          8
		GraphRequest graphrequest = GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), String.format("%s/activities", new Object[] {
			obj
		}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
	//    9   17:aconst_null     
	//   10   18:ldc1            #99  <String "%s/activities">
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload           6
	//   16   28:aastore         
	//   17   29:invokestatic    #105 <Method String String.format(String, Object[])>
	//   18   32:aconst_null     
	//   19   33:aconst_null     
	//   20   34:invokestatic    #111 <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//   21   37:astore          9
		Object obj1 = ((Object) (graphrequest.getParameters()));
	//   22   39:aload           9
	//   23   41:invokevirtual   #115 <Method Bundle GraphRequest.getParameters()>
	//   24   44:astore          7
		obj = obj1;
	//   25   46:aload           7
	//   26   48:astore          6
		if(obj1 == null)
	//*  27   50:aload           7
	//*  28   52:ifnonnull       64
			obj = ((Object) (new Bundle()));
	//   29   55:new             #117 <Class Bundle>
	//   30   58:dup             
	//   31   59:invokespecial   #118 <Method void Bundle()>
	//   32   62:astore          6
		((Bundle) (obj)).putString("access_token", accesstokenappidpair.getAccessTokenString());
	//   33   64:aload           6
	//   34   66:ldc1            #120 <String "access_token">
	//   35   68:aload_0         
	//   36   69:invokevirtual   #123 <Method String AccessTokenAppIdPair.getAccessTokenString()>
	//   37   72:invokevirtual   #127 <Method void Bundle.putString(String, String)>
		obj1 = ((Object) (AppEventsLogger.getPushNotificationsRegistrationId()));
	//   38   75:invokestatic    #132 <Method String AppEventsLogger.getPushNotificationsRegistrationId()>
	//   39   78:astore          7
		if(obj1 != null)
	//*  40   80:aload           7
	//*  41   82:ifnull          94
			((Bundle) (obj)).putString("device_token", ((String) (obj1)));
	//   42   85:aload           6
	//   43   87:ldc1            #134 <String "device_token">
	//   44   89:aload           7
	//   45   91:invokevirtual   #127 <Method void Bundle.putString(String, String)>
		graphrequest.setParameters(((Bundle) (obj)));
	//   46   94:aload           9
	//   47   96:aload           6
	//   48   98:invokevirtual   #138 <Method void GraphRequest.setParameters(Bundle)>
		if(fetchedappsettings != null)
	//*  49  101:aload           8
	//*  50  103:ifnull          113
			flag1 = fetchedappsettings.supportsImplicitLogging();
	//   51  106:aload           8
	//   52  108:invokevirtual   #144 <Method boolean FetchedAppSettings.supportsImplicitLogging()>
	//   53  111:istore          5
		int i = sessioneventsstate.populateRequest(graphrequest, FacebookSdk.getApplicationContext(), flag1, flag);
	//   54  113:aload_1         
	//   55  114:aload           9
	//   56  116:invokestatic    #150 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   57  119:iload           5
	//   58  121:iload_2         
	//   59  122:invokevirtual   #156 <Method int SessionEventsState.populateRequest(GraphRequest, android.content.Context, boolean, boolean)>
	//   60  125:istore          4
		if(i == 0)
	//*  61  127:iload           4
	//*  62  129:ifne            134
		{
			return null;
	//   63  132:aconst_null     
	//   64  133:areturn         
		} else
		{
			flushstatistics.numEvents = flushstatistics.numEvents + i;
	//   65  134:aload_3         
	//   66  135:aload_3         
	//   67  136:getfield        #161 <Field int FlushStatistics.numEvents>
	//   68  139:iload           4
	//   69  141:iadd            
	//   70  142:putfield        #161 <Field int FlushStatistics.numEvents>
			graphrequest.setCallback(new com.facebook.GraphRequest.Callback(accesstokenappidpair, graphrequest, sessioneventsstate, flushstatistics) {

				public void onCompleted(GraphResponse graphresponse)
				{
					AppEventQueue.handleResponse(accessTokenAppId, postRequest, graphresponse, appEvents, flushState);
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

			
			{
				accessTokenAppId = accesstokenappidpair;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AccessTokenAppIdPair val$accessTokenAppId>
				postRequest = graphrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field GraphRequest val$postRequest>
				appEvents = sessioneventsstate;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field SessionEventsState val$appEvents>
				flushState = flushstatistics;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field FlushStatistics val$flushState>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   71  145:aload           9
	//   72  147:new             #14  <Class AppEventQueue$5>
	//   73  150:dup             
	//   74  151:aload_0         
	//   75  152:aload           9
	//   76  154:aload_1         
	//   77  155:aload_3         
	//   78  156:invokespecial   #164 <Method void AppEventQueue$5(AccessTokenAppIdPair, GraphRequest, SessionEventsState, FlushStatistics)>
	//   79  159:invokevirtual   #168 <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
			return graphrequest;
	//   80  162:aload           9
	//   81  164:areturn         
		}
	}

	public static void flush(FlushReason flushreason)
	{
		singleThreadExecutor.execute(new Runnable(flushreason) {

			public void run()
			{
				AppEventQueue.flushAndWait(reason);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field FlushReason val$reason>
			//    2    4:invokestatic    #24  <Method void AppEventQueue.flushAndWait(FlushReason)>
			//    3    7:return          
			}

			final FlushReason val$reason;

			
			{
				reason = flushreason;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field FlushReason val$reason>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:getstatic       #50  <Field ScheduledExecutorService singleThreadExecutor>
	//    1    3:new             #10  <Class AppEventQueue$3>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #172 <Method void AppEventQueue$3(FlushReason)>
	//    5   11:invokeinterface #83  <Method void ScheduledExecutorService.execute(Runnable)>
	//    6   16:return          
	}

	static void flushAndWait(FlushReason flushreason)
	{
		PersistedEvents persistedevents = AppEventStore.readAndClearStore();
	//    0    0:invokestatic    #181 <Method PersistedEvents AppEventStore.readAndClearStore()>
	//    1    3:astore_1        
		appEventCollection.addPersistedEvents(persistedevents);
	//    2    4:getstatic       #42  <Field AppEventCollection appEventCollection>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #185 <Method void AppEventCollection.addPersistedEvents(PersistedEvents)>
		try
		{
			flushreason = ((FlushReason) (sendEventsToServer(flushreason, appEventCollection)));
	//    5   11:aload_0         
	//    6   12:getstatic       #42  <Field AppEventCollection appEventCollection>
	//    7   15:invokestatic    #189 <Method FlushStatistics sendEventsToServer(FlushReason, AppEventCollection)>
	//    8   18:astore_0        
		}
	//*   9   19:aload_0         
	//*  10   20:ifnull          66
	//*  11   23:new             #191 <Class Intent>
	//*  12   26:dup             
	//*  13   27:ldc1            #193 <String "com.facebook.sdk.APP_EVENTS_FLUSHED">
	//*  14   29:invokespecial   #196 <Method void Intent(String)>
	//*  15   32:astore_1        
	//*  16   33:aload_1         
	//*  17   34:ldc1            #198 <String "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED">
	//*  18   36:aload_0         
	//*  19   37:getfield        #161 <Field int FlushStatistics.numEvents>
	//*  20   40:invokevirtual   #202 <Method Intent Intent.putExtra(String, int)>
	//*  21   43:pop             
	//*  22   44:aload_1         
	//*  23   45:ldc1            #204 <String "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT">
	//*  24   47:aload_0         
	//*  25   48:getfield        #208 <Field FlushResult FlushStatistics.result>
	//*  26   51:invokevirtual   #211 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//*  27   54:pop             
	//*  28   55:invokestatic    #150 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//*  29   58:invokestatic    #217 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//*  30   61:aload_1         
	//*  31   62:invokevirtual   #221 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//*  32   65:pop             
	//*  33   66:return          
		// Misplaced declaration of an exception variable
		catch(FlushReason flushreason)
	//*  34   67:astore_0        
		{
			Log.w(TAG, "Caught unexpected exception while flushing app events: ", ((Throwable) (flushreason)));
	//   35   68:getstatic       #223 <Field String TAG>
	//   36   71:ldc1            #225 <String "Caught unexpected exception while flushing app events: ">
	//   37   73:aload_0         
	//   38   74:invokestatic    #231 <Method int Log.w(String, String, Throwable)>
	//   39   77:pop             
			return;
	//   40   78:return          
		}
		if(flushreason != null)
		{
			Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
			intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((FlushStatistics) (flushreason)).numEvents);
			intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((java.io.Serializable) (((FlushStatistics) (flushreason)).result)));
			LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()).sendBroadcast(intent);
		}
	}

	public static Set getKeySet()
	{
		return appEventCollection.keySet();
	//    0    0:getstatic       #42  <Field AppEventCollection appEventCollection>
	//    1    3:invokevirtual   #236 <Method Set AppEventCollection.keySet()>
	//    2    6:areturn         
	}

	private static void handleResponse(AccessTokenAppIdPair accesstokenappidpair, GraphRequest graphrequest, GraphResponse graphresponse, SessionEventsState sessioneventsstate, FlushStatistics flushstatistics)
	{
		FacebookRequestError facebookrequesterror = graphresponse.getError();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #246 <Method FacebookRequestError GraphResponse.getError()>
	//    2    4:astore          8
		String s = "Success";
	//    3    6:ldc1            #248 <String "Success">
	//    4    8:astore          6
		FlushResult flushresult = FlushResult.SUCCESS;
	//    5   10:getstatic       #253 <Field FlushResult FlushResult.SUCCESS>
	//    6   13:astore          7
		boolean flag = true;
	//    7   15:iconst_1        
	//    8   16:istore          5
		if(facebookrequesterror != null)
	//*   9   18:aload           8
	//*  10   20:ifnull          77
			if(facebookrequesterror.getErrorCode() == -1)
	//*  11   23:aload           8
	//*  12   25:invokevirtual   #259 <Method int FacebookRequestError.getErrorCode()>
	//*  13   28:iconst_m1       
	//*  14   29:icmpne          45
			{
				s = "Failed: No Connectivity";
	//   15   32:ldc2            #261 <String "Failed: No Connectivity">
	//   16   35:astore          6
				flushresult = FlushResult.NO_CONNECTIVITY;
	//   17   37:getstatic       #264 <Field FlushResult FlushResult.NO_CONNECTIVITY>
	//   18   40:astore          7
			} else
	//*  19   42:goto            77
			{
				s = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] {
					graphresponse.toString(), facebookrequesterror.toString()
				});
	//   20   45:ldc2            #266 <String "Failed:\n  Response: %s\n  Error %s">
	//   21   48:iconst_2        
	//   22   49:anewarray       Object[]
	//   23   52:dup             
	//   24   53:iconst_0        
	//   25   54:aload_2         
	//   26   55:invokevirtual   #269 <Method String GraphResponse.toString()>
	//   27   58:aastore         
	//   28   59:dup             
	//   29   60:iconst_1        
	//   30   61:aload           8
	//   31   63:invokevirtual   #270 <Method String FacebookRequestError.toString()>
	//   32   66:aastore         
	//   33   67:invokestatic    #105 <Method String String.format(String, Object[])>
	//   34   70:astore          6
				flushresult = FlushResult.SERVER_ERROR;
	//   35   72:getstatic       #273 <Field FlushResult FlushResult.SERVER_ERROR>
	//   36   75:astore          7
			}
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS))
	//*  37   77:getstatic       #279 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//*  38   80:invokestatic    #283 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*  39   83:ifeq            149
		{
			graphresponse = ((GraphResponse) ((String)graphrequest.getTag()));
	//   40   86:aload_1         
	//   41   87:invokevirtual   #287 <Method Object GraphRequest.getTag()>
	//   42   90:checkcast       #101 <Class String>
	//   43   93:astore_2        
			try
			{
				graphresponse = ((GraphResponse) ((new JSONArray(((String) (graphresponse)))).toString(2)));
	//   44   94:new             #289 <Class JSONArray>
	//   45   97:dup             
	//   46   98:aload_2         
	//   47   99:invokespecial   #290 <Method void JSONArray(String)>
	//   48  102:iconst_2        
	//   49  103:invokevirtual   #293 <Method String JSONArray.toString(int)>
	//   50  106:astore_2        
			}
	//*  51  107:goto            114
	//*  52  110:ldc2            #295 <String "<Can't encode events for debug logging>">
	//*  53  113:astore_2        
	//*  54  114:getstatic       #279 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//*  55  117:getstatic       #223 <Field String TAG>
	//*  56  120:ldc2            #297 <String "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s">
	//*  57  123:iconst_3        
	//*  58  124:anewarray       Object[]
	//*  59  127:dup             
	//*  60  128:iconst_0        
	//*  61  129:aload_1         
	//*  62  130:invokevirtual   #301 <Method JSONObject GraphRequest.getGraphObject()>
	//*  63  133:invokevirtual   #304 <Method String JSONObject.toString()>
	//*  64  136:aastore         
	//*  65  137:dup             
	//*  66  138:iconst_1        
	//*  67  139:aload           6
	//*  68  141:aastore         
	//*  69  142:dup             
	//*  70  143:iconst_2        
	//*  71  144:aload_2         
	//*  72  145:aastore         
	//*  73  146:invokestatic    #310 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
	//*  74  149:aload           8
	//*  75  151:ifnull          157
	//*  76  154:goto            160
	//*  77  157:iconst_0        
	//*  78  158:istore          5
	//*  79  160:aload_3         
	//*  80  161:iload           5
	//*  81  163:invokevirtual   #314 <Method void SessionEventsState.clearInFlightAndStats(boolean)>
	//*  82  166:aload           7
	//*  83  168:getstatic       #264 <Field FlushResult FlushResult.NO_CONNECTIVITY>
	//*  84  171:if_acmpne       191
	//*  85  174:invokestatic    #318 <Method Executor FacebookSdk.getExecutor()>
	//*  86  177:new             #16  <Class AppEventQueue$6>
	//*  87  180:dup             
	//*  88  181:aload_0         
	//*  89  182:aload_3         
	//*  90  183:invokespecial   #321 <Method void AppEventQueue$6(AccessTokenAppIdPair, SessionEventsState)>
	//*  91  186:invokeinterface #324 <Method void Executor.execute(Runnable)>
	//*  92  191:aload           7
	//*  93  193:getstatic       #253 <Field FlushResult FlushResult.SUCCESS>
	//*  94  196:if_acmpeq       217
	//*  95  199:aload           4
	//*  96  201:getfield        #208 <Field FlushResult FlushStatistics.result>
	//*  97  204:getstatic       #264 <Field FlushResult FlushResult.NO_CONNECTIVITY>
	//*  98  207:if_acmpeq       217
	//*  99  210:aload           4
	//* 100  212:aload           7
	//* 101  214:putfield        #208 <Field FlushResult FlushStatistics.result>
	//* 102  217:return          
			// Misplaced declaration of an exception variable
			catch(GraphResponse graphresponse)
			{
				graphresponse = "<Can't encode events for debug logging>";
			}
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] {
				graphrequest.getGraphObject().toString(), s, graphresponse
			});
		}
		if(facebookrequesterror == null)
			flag = false;
		sessioneventsstate.clearInFlightAndStats(flag);
		if(flushresult == FlushResult.NO_CONNECTIVITY)
			FacebookSdk.getExecutor().execute(new Runnable(accesstokenappidpair, sessioneventsstate) {

				public void run()
				{
					AppEventStore.persistEvents(accessTokenAppId, appEvents);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AccessTokenAppIdPair val$accessTokenAppId>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field SessionEventsState val$appEvents>
				//    4    8:invokestatic    #31  <Method void AppEventStore.persistEvents(AccessTokenAppIdPair, SessionEventsState)>
				//    5   11:return          
				}

				final AccessTokenAppIdPair val$accessTokenAppId;
				final SessionEventsState val$appEvents;

			
			{
				accessTokenAppId = accesstokenappidpair;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AccessTokenAppIdPair val$accessTokenAppId>
				appEvents = sessioneventsstate;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SessionEventsState val$appEvents>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
		if(flushresult != FlushResult.SUCCESS && flushstatistics.result != FlushResult.NO_CONNECTIVITY)
			flushstatistics.result = flushresult;
	//* 103  218:astore_2        
	//* 104  219:goto            110
	}

	public static void persistToDisk()
	{
		singleThreadExecutor.execute(new Runnable() {

			public void run()
			{
				AppEventStore.persistEvents(AppEventQueue.appEventCollection);
			//    0    0:invokestatic    #20  <Method AppEventCollection AppEventQueue.access$100()>
			//    1    3:invokestatic    #26  <Method void AppEventStore.persistEvents(AppEventCollection)>
				AppEventQueue.appEventCollection = new AppEventCollection();
			//    2    6:new             #28  <Class AppEventCollection>
			//    3    9:dup             
			//    4   10:invokespecial   #29  <Method void AppEventCollection()>
			//    5   13:invokestatic    #33  <Method AppEventCollection AppEventQueue.access$102(AppEventCollection)>
			//    6   16:pop             
			//    7   17:return          
			}

		}
);
	//    0    0:getstatic       #50  <Field ScheduledExecutorService singleThreadExecutor>
	//    1    3:new             #8   <Class AppEventQueue$2>
	//    2    6:dup             
	//    3    7:invokespecial   #326 <Method void AppEventQueue$2()>
	//    4   10:invokeinterface #83  <Method void ScheduledExecutorService.execute(Runnable)>
	//    5   15:return          
	}

	private static FlushStatistics sendEventsToServer(FlushReason flushreason, AppEventCollection appeventcollection)
	{
		FlushStatistics flushstatistics = new FlushStatistics();
	//    0    0:new             #158 <Class FlushStatistics>
	//    1    3:dup             
	//    2    4:invokespecial   #327 <Method void FlushStatistics()>
	//    3    7:astore_3        
		boolean flag = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
	//    4    8:invokestatic    #150 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    5   11:invokestatic    #331 <Method boolean FacebookSdk.getLimitEventAndDataUsage(android.content.Context)>
	//    6   14:istore_2        
		ArrayList arraylist = new ArrayList();
	//    7   15:new             #333 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #334 <Method void ArrayList()>
	//   10   22:astore          4
		Iterator iterator = appeventcollection.keySet().iterator();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #236 <Method Set AppEventCollection.keySet()>
	//   13   28:invokeinterface #340 <Method Iterator Set.iterator()>
	//   14   33:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   35:aload           5
	//   16   37:invokeinterface #345 <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            90
			Object obj = ((Object) ((AccessTokenAppIdPair)iterator.next()));
	//   18   45:aload           5
	//   19   47:invokeinterface #348 <Method Object Iterator.next()>
	//   20   52:checkcast       #87  <Class AccessTokenAppIdPair>
	//   21   55:astore          6
			obj = ((Object) (buildRequestForSession(((AccessTokenAppIdPair) (obj)), appeventcollection.get(((AccessTokenAppIdPair) (obj))), flag, flushstatistics)));
	//   22   57:aload           6
	//   23   59:aload_1         
	//   24   60:aload           6
	//   25   62:invokevirtual   #352 <Method SessionEventsState AppEventCollection.get(AccessTokenAppIdPair)>
	//   26   65:iload_2         
	//   27   66:aload_3         
	//   28   67:invokestatic    #354 <Method GraphRequest buildRequestForSession(AccessTokenAppIdPair, SessionEventsState, boolean, FlushStatistics)>
	//   29   70:astore          6
			if(obj != null)
	//*  30   72:aload           6
	//*  31   74:ifnull          35
				((List) (arraylist)).add(obj);
	//   32   77:aload           4
	//   33   79:aload           6
	//   34   81:invokeinterface #359 <Method boolean List.add(Object)>
	//   35   86:pop             
		} while(true);
	//   36   87:goto            35
		if(((List) (arraylist)).size() > 0)
	//*  37   90:aload           4
	//*  38   92:invokeinterface #362 <Method int List.size()>
	//*  39   97:ifle            168
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Flushing %d events due to %s.", new Object[] {
				Integer.valueOf(flushstatistics.numEvents), flushreason.toString()
			});
	//   40  100:getstatic       #279 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   41  103:getstatic       #223 <Field String TAG>
	//   42  106:ldc2            #364 <String "Flushing %d events due to %s.">
	//   43  109:iconst_2        
	//   44  110:anewarray       Object[]
	//   45  113:dup             
	//   46  114:iconst_0        
	//   47  115:aload_3         
	//   48  116:getfield        #161 <Field int FlushStatistics.numEvents>
	//   49  119:invokestatic    #370 <Method Integer Integer.valueOf(int)>
	//   50  122:aastore         
	//   51  123:dup             
	//   52  124:iconst_1        
	//   53  125:aload_0         
	//   54  126:invokevirtual   #373 <Method String FlushReason.toString()>
	//   55  129:aastore         
	//   56  130:invokestatic    #310 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
			for(flushreason = ((FlushReason) (((List) (arraylist)).iterator())); ((Iterator) (flushreason)).hasNext(); ((GraphRequest)((Iterator) (flushreason)).next()).executeAndWait());
	//   57  133:aload           4
	//   58  135:invokeinterface #374 <Method Iterator List.iterator()>
	//   59  140:astore_0        
	//   60  141:aload_0         
	//   61  142:invokeinterface #345 <Method boolean Iterator.hasNext()>
	//   62  147:ifeq            166
	//   63  150:aload_0         
	//   64  151:invokeinterface #348 <Method Object Iterator.next()>
	//   65  156:checkcast       #107 <Class GraphRequest>
	//   66  159:invokevirtual   #378 <Method GraphResponse GraphRequest.executeAndWait()>
	//   67  162:pop             
	//*  68  163:goto            141
			return flushstatistics;
	//   69  166:aload_3         
	//   70  167:areturn         
		} else
		{
			return null;
	//   71  168:aconst_null     
	//   72  169:areturn         
		}
	}

	private static final int FLUSH_PERIOD_IN_SECONDS = 15;
	private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
	private static final String TAG = "com.facebook.appevents.AppEventQueue";
	private static volatile AppEventCollection appEventCollection = new AppEventCollection();
	private static final Runnable flushRunnable = new Runnable() {

		public void run()
		{
			AppEventQueue.scheduledFuture = null;
		//    0    0:aconst_null     
		//    1    1:invokestatic    #18  <Method ScheduledFuture AppEventQueue.access$002(ScheduledFuture)>
		//    2    4:pop             
			if(AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY)
		//*   3    5:invokestatic    #24  <Method AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
		//*   4    8:getstatic       #30  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
		//*   5   11:if_acmpeq       20
				AppEventQueue.flushAndWait(FlushReason.TIMER);
		//    6   14:getstatic       #36  <Field FlushReason FlushReason.TIMER>
		//    7   17:invokestatic    #40  <Method void AppEventQueue.flushAndWait(FlushReason)>
		//    8   20:return          
		}

	}
;
	private static ScheduledFuture scheduledFuture;
	private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

	static 
	{
	//    0    0:new             #37  <Class AppEventCollection>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void AppEventCollection()>
	//    3    7:putstatic       #42  <Field AppEventCollection appEventCollection>
	//    4   10:invokestatic    #48  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//    5   13:putstatic       #50  <Field ScheduledExecutorService singleThreadExecutor>
	//    6   16:new             #6   <Class AppEventQueue$1>
	//    7   19:dup             
	//    8   20:invokespecial   #51  <Method void AppEventQueue$1()>
	//    9   23:putstatic       #53  <Field Runnable flushRunnable>
	//*  10   26:return          
	}


/*
	static ScheduledFuture access$000()
	{
		return scheduledFuture;
	//    0    0:getstatic       #59  <Field ScheduledFuture scheduledFuture>
	//    1    3:areturn         
	}

*/


/*
	static ScheduledFuture access$002(ScheduledFuture scheduledfuture)
	{
		scheduledFuture = scheduledfuture;
	//    0    0:aload_0         
	//    1    1:putstatic       #59  <Field ScheduledFuture scheduledFuture>
		return scheduledfuture;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static AppEventCollection access$100()
	{
		return appEventCollection;
	//    0    0:getstatic       #42  <Field AppEventCollection appEventCollection>
	//    1    3:areturn         
	}

*/


/*
	static AppEventCollection access$102(AppEventCollection appeventcollection)
	{
		appEventCollection = appeventcollection;
	//    0    0:aload_0         
	//    1    1:putstatic       #42  <Field AppEventCollection appEventCollection>
		return appeventcollection;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static Runnable access$200()
	{
		return flushRunnable;
	//    0    0:getstatic       #53  <Field Runnable flushRunnable>
	//    1    3:areturn         
	}

*/


/*
	static ScheduledExecutorService access$300()
	{
		return singleThreadExecutor;
	//    0    0:getstatic       #50  <Field ScheduledExecutorService singleThreadExecutor>
	//    1    3:areturn         
	}

*/


/*
	static void access$400(AccessTokenAppIdPair accesstokenappidpair, GraphRequest graphrequest, GraphResponse graphresponse, SessionEventsState sessioneventsstate, FlushStatistics flushstatistics)
	{
		handleResponse(accesstokenappidpair, graphrequest, graphresponse, sessioneventsstate, flushstatistics);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #73  <Method void handleResponse(AccessTokenAppIdPair, GraphRequest, GraphResponse, SessionEventsState, FlushStatistics)>
		return;
	//    6    9:return          
	}

*/
}
