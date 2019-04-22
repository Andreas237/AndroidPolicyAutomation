// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.*;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.push.AppboyNotificationActionUtils;
import com.appboy.push.AppboyNotificationUtils;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.appboy:
//			IAppboyNotificationFactory

public final class AppboyFcmReceiver extends BroadcastReceiver
{
	public class HandleAppboyFcmMessageTask extends AsyncTask
		implements TraceFieldInterface
	{

		public void _nr_setTrace(Trace trace)
		{
			try
			{
				_nr_trace = trace;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #48  <Field Trace _nr_trace>
				return;
		//    3    5:return          
			}
			// Misplaced declaration of an exception variable
			catch(Trace trace)
		//*   4    6:astore_1        
			{
				return;
		//    5    7:return          
			}
		}

		protected volatile Object doInBackground(Object aobj[])
		{
			TraceMachine.enterMethod(_nr_trace, "AppboyFcmReceiver$HandleAppboyFcmMessageTask#doInBackground", ((java.util.ArrayList) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field Trace _nr_trace>
		//    2    4:ldc1            #54  <String "AppboyFcmReceiver$HandleAppboyFcmMessageTask#doInBackground">
		//    3    6:aconst_null     
		//    4    7:invokestatic    #60  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
			  goto _L1
		//*   5   10:goto            20
_L3:
			TraceMachine.enterMethod(((Trace) (null)), "AppboyFcmReceiver$HandleAppboyFcmMessageTask#doInBackground", ((java.util.ArrayList) (null)));
		//    6   13:aconst_null     
		//    7   14:ldc1            #54  <String "AppboyFcmReceiver$HandleAppboyFcmMessageTask#doInBackground">
		//    8   16:aconst_null     
		//    9   17:invokestatic    #60  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
			aobj = ((Object []) (doInBackground((Void[])aobj)));
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:checkcast       #62  <Class Void[]>
		//   13   25:invokevirtual   #65  <Method Void doInBackground(Void[])>
		//   14   28:astore_1        
			TraceMachine.exitMethod();
		//   15   29:invokestatic    #68  <Method void TraceMachine.exitMethod()>
			TraceMachine.unloadTraceContext(((Object) (this)));
		//   16   32:aload_0         
		//   17   33:invokestatic    #72  <Method void TraceMachine.unloadTraceContext(Object)>
			return ((Object) (aobj));
		//   18   36:aload_1         
		//   19   37:areturn         
			NoSuchFieldError nosuchfielderror;
			nosuchfielderror;
		//   20   38:astore_2        
			if(true) goto _L3; else goto _L2
_L2:
		//*  21   39:goto            13
		}

		protected transient Void doInBackground(Void avoid[])
		{
			try
			{
				handleAppboyFcmMessage(mContext, mIntent);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field AppboyFcmReceiver this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field Context mContext>
		//    4    8:aload_0         
		//    5    9:getfield        #30  <Field Intent mIntent>
		//    6   12:invokevirtual   #76  <Method boolean AppboyFcmReceiver.handleAppboyFcmMessage(Context, Intent)>
		//    7   15:pop             
			}
		//*   8   16:goto            30
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
		//*   9   19:astore_1        
			{
				AppboyLogger.e(AppboyFcmReceiver.TAG, "Failed to create and display notification.", ((Throwable) (avoid)));
		//   10   20:invokestatic    #80  <Method String AppboyFcmReceiver.access$000()>
		//   11   23:ldc1            #82  <String "Failed to create and display notification.">
		//   12   25:aload_1         
		//   13   26:invokestatic    #88  <Method int AppboyLogger.e(String, String, Throwable)>
		//   14   29:pop             
			}
			return null;
		//   15   30:aconst_null     
		//   16   31:areturn         
		}

		public Trace _nr_trace;
		private final Context mContext;
		private final Intent mIntent;
		final AppboyFcmReceiver this$0;

		public HandleAppboyFcmMessageTask(Context context, Intent intent)
		{
			this$0 = AppboyFcmReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field AppboyFcmReceiver this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void AsyncTask()>
			mContext = context;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field Context mContext>
			mIntent = intent;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field Intent mIntent>
			appboyfcmreceiver = ((AppboyFcmReceiver) (new Void[0]));
		//   11   19:iconst_0        
		//   12   20:anewarray       Void[]
		//   13   23:astore_1        
			if(!(this instanceof AsyncTask))
		//*  14   24:aload_0         
		//*  15   25:instanceof      #5   <Class AsyncTask>
		//*  16   28:ifne            38
			{
				execute(((Object []) (AppboyFcmReceiver.this)));
		//   17   31:aload_0         
		//   18   32:aload_1         
		//   19   33:invokevirtual   #36  <Method AsyncTask execute(Object[])>
		//   20   36:pop             
				return;
		//   21   37:return          
			} else
			{
				AsyncTaskInstrumentation.execute((AsyncTask)this, ((Object []) (AppboyFcmReceiver.this)));
		//   22   38:aload_0         
		//   23   39:checkcast       #5   <Class AsyncTask>
		//   24   42:aload_1         
		//   25   43:invokestatic    #41  <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
		//   26   46:pop             
				return;
		//   27   47:return          
			}
		}
	}


	public AppboyFcmReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	boolean handleAppboyFcmMessage(Context context, Intent intent)
	{
		Object obj = ((Object) (NotificationManagerCompat.from(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method NotificationManagerCompat NotificationManagerCompat.from(Context)>
	//    2    4:astore          5
		if("deleted_messages".equals(((Object) (intent.getStringExtra("message_type")))))
	//*   3    6:ldc1            #11  <String "deleted_messages">
	//*   4    8:aload_2         
	//*   5    9:ldc1            #14  <String "message_type">
	//*   6   11:invokevirtual   #51  <Method String Intent.getStringExtra(String)>
	//*   7   14:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*   8   17:ifeq            119
		{
			int i = intent.getIntExtra("total_deleted", -1);
	//    9   20:aload_2         
	//   10   21:ldc1            #17  <String "total_deleted">
	//   11   23:iconst_m1       
	//   12   24:invokevirtual   #61  <Method int Intent.getIntExtra(String, int)>
	//   13   27:istore_3        
			if(i == -1)
	//*  14   28:iload_3         
	//*  15   29:iconst_m1       
	//*  16   30:icmpne          76
			{
				context = ((Context) (TAG));
	//   17   33:getstatic       #31  <Field String TAG>
	//   18   36:astore_1        
				obj = ((Object) (new StringBuilder()));
	//   19   37:new             #63  <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #64  <Method void StringBuilder()>
	//   22   44:astore          5
				((StringBuilder) (obj)).append("Unable to parse FCM message. Intent: ");
	//   23   46:aload           5
	//   24   48:ldc1            #66  <String "Unable to parse FCM message. Intent: ">
	//   25   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
				((StringBuilder) (obj)).append(intent.toString());
	//   27   54:aload           5
	//   28   56:aload_2         
	//   29   57:invokevirtual   #73  <Method String Intent.toString()>
	//   30   60:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
				AppboyLogger.e(((String) (context)), ((StringBuilder) (obj)).toString());
	//   32   64:aload_1         
	//   33   65:aload           5
	//   34   67:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   35   70:invokestatic    #78  <Method int AppboyLogger.e(String, String)>
	//   36   73:pop             
				return false;
	//   37   74:iconst_0        
	//   38   75:ireturn         
			} else
			{
				context = ((Context) (TAG));
	//   39   76:getstatic       #31  <Field String TAG>
	//   40   79:astore_1        
				intent = ((Intent) (new StringBuilder()));
	//   41   80:new             #63  <Class StringBuilder>
	//   42   83:dup             
	//   43   84:invokespecial   #64  <Method void StringBuilder()>
	//   44   87:astore_2        
				((StringBuilder) (intent)).append("FCM deleted ");
	//   45   88:aload_2         
	//   46   89:ldc1            #80  <String "FCM deleted ">
	//   47   91:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   48   94:pop             
				((StringBuilder) (intent)).append(i);
	//   49   95:aload_2         
	//   50   96:iload_3         
	//   51   97:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   52  100:pop             
				((StringBuilder) (intent)).append(" messages. Fetch them from Appboy.");
	//   53  101:aload_2         
	//   54  102:ldc1            #85  <String " messages. Fetch them from Appboy.">
	//   55  104:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   56  107:pop             
				AppboyLogger.i(((String) (context)), ((StringBuilder) (intent)).toString());
	//   57  108:aload_1         
	//   58  109:aload_2         
	//   59  110:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   60  113:invokestatic    #88  <Method int AppboyLogger.i(String, String)>
	//   61  116:pop             
				return false;
	//   62  117:iconst_0        
	//   63  118:ireturn         
			}
		}
		Bundle bundle = intent.getExtras();
	//   64  119:aload_2         
	//   65  120:invokevirtual   #92  <Method Bundle Intent.getExtras()>
	//   66  123:astore          6
		Object obj1 = ((Object) (TAG));
	//   67  125:getstatic       #31  <Field String TAG>
	//   68  128:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   69  130:new             #63  <Class StringBuilder>
	//   70  133:dup             
	//   71  134:invokespecial   #64  <Method void StringBuilder()>
	//   72  137:astore          8
		stringbuilder.append("Push message payload received: ");
	//   73  139:aload           8
	//   74  141:ldc1            #94  <String "Push message payload received: ">
	//   75  143:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   76  146:pop             
		stringbuilder.append(((Object) (bundle)));
	//   77  147:aload           8
	//   78  149:aload           6
	//   79  151:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   80  154:pop             
		AppboyLogger.i(((String) (obj1)), stringbuilder.toString());
	//   81  155:aload           7
	//   82  157:aload           8
	//   83  159:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   84  162:invokestatic    #88  <Method int AppboyLogger.i(String, String)>
	//   85  165:pop             
		if(AppboyNotificationUtils.isUninstallTrackingPush(bundle))
	//*  86  166:aload           6
	//*  87  168:invokestatic    #103 <Method boolean AppboyNotificationUtils.isUninstallTrackingPush(Bundle)>
	//*  88  171:ifeq            185
		{
			AppboyLogger.i(TAG, "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.");
	//   89  174:getstatic       #31  <Field String TAG>
	//   90  177:ldc1            #105 <String "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.">
	//   91  179:invokestatic    #88  <Method int AppboyLogger.i(String, String)>
	//   92  182:pop             
			return false;
	//   93  183:iconst_0        
	//   94  184:ireturn         
		}
		obj1 = ((Object) (AppboyNotificationUtils.getAppboyExtrasWithoutPreprocessing(bundle)));
	//   95  185:aload           6
	//   96  187:invokestatic    #109 <Method Bundle AppboyNotificationUtils.getAppboyExtrasWithoutPreprocessing(Bundle)>
	//   97  190:astore          7
		bundle.putBundle("extra", ((Bundle) (obj1)));
	//   98  192:aload           6
	//   99  194:ldc1            #111 <String "extra">
	//  100  196:aload           7
	//  101  198:invokevirtual   #117 <Method void Bundle.putBundle(String, Bundle)>
		if(!bundle.containsKey("appboy_push_received_timestamp"))
	//* 102  201:aload           6
	//* 103  203:ldc1            #119 <String "appboy_push_received_timestamp">
	//* 104  205:invokevirtual   #123 <Method boolean Bundle.containsKey(String)>
	//* 105  208:ifne            221
			bundle.putLong("appboy_push_received_timestamp", System.currentTimeMillis());
	//  106  211:aload           6
	//  107  213:ldc1            #119 <String "appboy_push_received_timestamp">
	//  108  215:invokestatic    #129 <Method long System.currentTimeMillis()>
	//  109  218:invokevirtual   #133 <Method void Bundle.putLong(String, long)>
		AppboyNotificationUtils.handleContentCardsSerializedCardIfPresent(context, bundle);
	//  110  221:aload_1         
	//  111  222:aload           6
	//  112  224:invokestatic    #137 <Method void AppboyNotificationUtils.handleContentCardsSerializedCardIfPresent(Context, Bundle)>
		if(AppboyNotificationUtils.isNotificationMessage(intent))
	//* 113  227:aload_2         
	//* 114  228:invokestatic    #141 <Method boolean AppboyNotificationUtils.isNotificationMessage(Intent)>
	//* 115  231:ifeq            418
		{
			AppboyLogger.d(TAG, "Received notification push");
	//  116  234:getstatic       #31  <Field String TAG>
	//  117  237:ldc1            #143 <String "Received notification push">
	//  118  239:invokestatic    #146 <Method int AppboyLogger.d(String, String)>
	//  119  242:pop             
			int j = AppboyNotificationUtils.getNotificationId(bundle);
	//  120  243:aload           6
	//  121  245:invokestatic    #150 <Method int AppboyNotificationUtils.getNotificationId(Bundle)>
	//  122  248:istore_3        
			bundle.putInt("nid", j);
	//  123  249:aload           6
	//  124  251:ldc1            #152 <String "nid">
	//  125  253:iload_3         
	//  126  254:invokevirtual   #156 <Method void Bundle.putInt(String, int)>
			intent = ((Intent) (new AppboyConfigurationProvider(context)));
	//  127  257:new             #158 <Class AppboyConfigurationProvider>
	//  128  260:dup             
	//  129  261:aload_1         
	//  130  262:invokespecial   #161 <Method void AppboyConfigurationProvider(Context)>
	//  131  265:astore_2        
			IAppboyNotificationFactory iappboynotificationfactory = AppboyNotificationUtils.getActiveNotificationFactory();
	//  132  266:invokestatic    #165 <Method IAppboyNotificationFactory AppboyNotificationUtils.getActiveNotificationFactory()>
	//  133  269:astore          8
			if(bundle.containsKey("ab_c"))
	//* 134  271:aload           6
	//* 135  273:ldc1            #167 <String "ab_c">
	//* 136  275:invokevirtual   #123 <Method boolean Bundle.containsKey(String)>
	//* 137  278:ifeq            317
			{
				if(!bundle.containsKey("appboy_story_newly_received"))
	//* 138  281:aload           6
	//* 139  283:ldc1            #169 <String "appboy_story_newly_received">
	//* 140  285:invokevirtual   #123 <Method boolean Bundle.containsKey(String)>
	//* 141  288:ifne            323
				{
					AppboyLogger.d(TAG, "Received the initial push story notification.");
	//  142  291:getstatic       #31  <Field String TAG>
	//  143  294:ldc1            #171 <String "Received the initial push story notification.">
	//  144  296:invokestatic    #146 <Method int AppboyLogger.d(String, String)>
	//  145  299:pop             
					bundle.putBoolean("appboy_story_newly_received", true);
	//  146  300:aload           6
	//  147  302:ldc1            #169 <String "appboy_story_newly_received">
	//  148  304:iconst_1        
	//  149  305:invokevirtual   #175 <Method void Bundle.putBoolean(String, boolean)>
					AppboyNotificationUtils.logPushDeliveryEvent(context, bundle);
	//  150  308:aload_1         
	//  151  309:aload           6
	//  152  311:invokestatic    #178 <Method void AppboyNotificationUtils.logPushDeliveryEvent(Context, Bundle)>
				}
			} else
	//* 153  314:goto            323
			{
				AppboyNotificationUtils.logPushDeliveryEvent(context, bundle);
	//  154  317:aload_1         
	//  155  318:aload           6
	//  156  320:invokestatic    #178 <Method void AppboyNotificationUtils.logPushDeliveryEvent(Context, Bundle)>
			}
			obj1 = ((Object) (iappboynotificationfactory.createNotification(((AppboyConfigurationProvider) (intent)), context, bundle, ((Bundle) (obj1)))));
	//  157  323:aload           8
	//  158  325:aload_2         
	//  159  326:aload_1         
	//  160  327:aload           6
	//  161  329:aload           7
	//  162  331:invokeinterface #184 <Method android.app.Notification IAppboyNotificationFactory.createNotification(AppboyConfigurationProvider, Context, Bundle, Bundle)>
	//  163  336:astore          7
			if(obj1 == null)
	//* 164  338:aload           7
	//* 165  340:ifnonnull       354
			{
				AppboyLogger.d(TAG, "Notification created by notification factory was null. Not displaying notification.");
	//  166  343:getstatic       #31  <Field String TAG>
	//  167  346:ldc1            #186 <String "Notification created by notification factory was null. Not displaying notification.">
	//  168  348:invokestatic    #146 <Method int AppboyLogger.d(String, String)>
	//  169  351:pop             
				return false;
	//  170  352:iconst_0        
	//  171  353:ireturn         
			}
			((NotificationManagerCompat) (obj)).notify("appboy_notification", j, ((android.app.Notification) (obj1)));
	//  172  354:aload           5
	//  173  356:ldc1            #188 <String "appboy_notification">
	//  174  358:iload_3         
	//  175  359:aload           7
	//  176  361:invokevirtual   #192 <Method void NotificationManagerCompat.notify(String, int, android.app.Notification)>
			AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
	//  177  364:aload_1         
	//  178  365:aload           6
	//  179  367:invokestatic    #195 <Method void AppboyNotificationUtils.sendPushMessageReceivedBroadcast(Context, Bundle)>
			AppboyNotificationUtils.wakeScreenIfAppropriate(context, ((AppboyConfigurationProvider) (intent)), bundle);
	//  180  370:aload_1         
	//  181  371:aload_2         
	//  182  372:aload           6
	//  183  374:invokestatic    #199 <Method boolean AppboyNotificationUtils.wakeScreenIfAppropriate(Context, AppboyConfigurationProvider, Bundle)>
	//  184  377:pop             
			if(bundle != null && bundle.containsKey("nd"))
	//* 185  378:aload           6
	//* 186  380:ifnull          416
	//* 187  383:aload           6
	//* 188  385:ldc1            #201 <String "nd">
	//* 189  387:invokevirtual   #123 <Method boolean Bundle.containsKey(String)>
	//* 190  390:ifeq            416
			{
				int k = Integer.parseInt(bundle.getString("nd"));
	//  191  393:aload           6
	//  192  395:ldc1            #201 <String "nd">
	//  193  397:invokevirtual   #204 <Method String Bundle.getString(String)>
	//  194  400:invokestatic    #210 <Method int Integer.parseInt(String)>
	//  195  403:istore          4
				AppboyNotificationUtils.setNotificationDurationAlarm(context, ((Object)this).getClass(), j, k);
	//  196  405:aload_1         
	//  197  406:aload_0         
	//  198  407:invokevirtual   #216 <Method Class Object.getClass()>
	//  199  410:iload_3         
	//  200  411:iload           4
	//  201  413:invokestatic    #220 <Method void AppboyNotificationUtils.setNotificationDurationAlarm(Context, Class, int, int)>
			}
			return true;
	//  202  416:iconst_1        
	//  203  417:ireturn         
		} else
		{
			AppboyLogger.d(TAG, "Received data push");
	//  204  418:getstatic       #31  <Field String TAG>
	//  205  421:ldc1            #222 <String "Received data push">
	//  206  423:invokestatic    #146 <Method int AppboyLogger.d(String, String)>
	//  207  426:pop             
			AppboyNotificationUtils.logPushDeliveryEvent(context, bundle);
	//  208  427:aload_1         
	//  209  428:aload           6
	//  210  430:invokestatic    #178 <Method void AppboyNotificationUtils.logPushDeliveryEvent(Context, Bundle)>
			AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
	//  211  433:aload_1         
	//  212  434:aload           6
	//  213  436:invokestatic    #195 <Method void AppboyNotificationUtils.sendPushMessageReceivedBroadcast(Context, Bundle)>
			AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(context, bundle);
	//  214  439:aload_1         
	//  215  440:aload           6
	//  216  442:invokestatic    #226 <Method boolean AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(Context, Bundle)>
	//  217  445:pop             
			return false;
	//  218  446:iconst_0        
	//  219  447:ireturn         
		}
	}

	void handleAppboyFcmReceiveIntent(Context context, Intent intent)
	{
		if(AppboyNotificationUtils.isAppboyPushMessage(intent))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #231 <Method boolean AppboyNotificationUtils.isAppboyPushMessage(Intent)>
	//*   2    4:ifeq            18
			new HandleAppboyFcmMessageTask(context, intent);
	//    3    7:new             #6   <Class AppboyFcmReceiver$HandleAppboyFcmMessageTask>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #234 <Method void AppboyFcmReceiver$HandleAppboyFcmMessageTask(AppboyFcmReceiver, Context, Intent)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		String s = TAG;
	//    0    0:getstatic       #31  <Field String TAG>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #63  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #64  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Received broadcast message. Message: ");
	//    6   13:aload           4
	//    7   15:ldc1            #237 <String "Received broadcast message. Message: ">
	//    8   17:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(intent.toString());
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #73  <Method String Intent.toString()>
	//   13   27:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   15   31:aload_3         
	//   16   32:aload           4
	//   17   34:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   18   37:invokestatic    #88  <Method int AppboyLogger.i(String, String)>
	//   19   40:pop             
		s = intent.getAction();
	//   20   41:aload_2         
	//   21   42:invokevirtual   #240 <Method String Intent.getAction()>
	//   22   45:astore_3        
		if("com.google.android.c2dm.intent.RECEIVE".equals(((Object) (s))))
	//*  23   46:ldc1            #20  <String "com.google.android.c2dm.intent.RECEIVE">
	//*  24   48:aload_3         
	//*  25   49:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  26   52:ifeq            62
		{
			handleAppboyFcmReceiveIntent(context, intent);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:aload_2         
	//   30   58:invokevirtual   #242 <Method void handleAppboyFcmReceiveIntent(Context, Intent)>
			return;
	//   31   61:return          
		}
		if("com.appboy.action.CANCEL_NOTIFICATION".equals(((Object) (s))))
	//*  32   62:ldc1            #244 <String "com.appboy.action.CANCEL_NOTIFICATION">
	//*  33   64:aload_3         
	//*  34   65:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  35   68:ifeq            77
		{
			AppboyNotificationUtils.handleCancelNotificationAction(context, intent);
	//   36   71:aload_1         
	//   37   72:aload_2         
	//   38   73:invokestatic    #247 <Method void AppboyNotificationUtils.handleCancelNotificationAction(Context, Intent)>
			return;
	//   39   76:return          
		}
		if("com.appboy.action.APPBOY_ACTION_CLICKED".equals(((Object) (s))))
	//*  40   77:ldc1            #249 <String "com.appboy.action.APPBOY_ACTION_CLICKED">
	//*  41   79:aload_3         
	//*  42   80:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  43   83:ifeq            92
		{
			AppboyNotificationActionUtils.handleNotificationActionClicked(context, intent);
	//   44   86:aload_1         
	//   45   87:aload_2         
	//   46   88:invokestatic    #254 <Method void AppboyNotificationActionUtils.handleNotificationActionClicked(Context, Intent)>
			return;
	//   47   91:return          
		}
		if("com.appboy.action.STORY_TRAVERSE".equals(((Object) (s))))
	//*  48   92:ldc2            #256 <String "com.appboy.action.STORY_TRAVERSE">
	//*  49   95:aload_3         
	//*  50   96:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  51   99:ifeq            109
		{
			handleAppboyFcmReceiveIntent(context, intent);
	//   52  102:aload_0         
	//   53  103:aload_1         
	//   54  104:aload_2         
	//   55  105:invokevirtual   #242 <Method void handleAppboyFcmReceiveIntent(Context, Intent)>
			return;
	//   56  108:return          
		}
		if("com.appboy.action.APPBOY_STORY_CLICKED".equals(((Object) (s))))
	//*  57  109:ldc2            #258 <String "com.appboy.action.APPBOY_STORY_CLICKED">
	//*  58  112:aload_3         
	//*  59  113:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  60  116:ifeq            125
		{
			AppboyNotificationUtils.handlePushStoryPageClicked(context, intent);
	//   61  119:aload_1         
	//   62  120:aload_2         
	//   63  121:invokestatic    #261 <Method void AppboyNotificationUtils.handlePushStoryPageClicked(Context, Intent)>
			return;
	//   64  124:return          
		}
		if("com.appboy.action.APPBOY_PUSH_CLICKED".equals(((Object) (s))))
	//*  65  125:ldc2            #263 <String "com.appboy.action.APPBOY_PUSH_CLICKED">
	//*  66  128:aload_3         
	//*  67  129:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  68  132:ifeq            141
		{
			AppboyNotificationUtils.handleNotificationOpened(context, intent);
	//   69  135:aload_1         
	//   70  136:aload_2         
	//   71  137:invokestatic    #266 <Method void AppboyNotificationUtils.handleNotificationOpened(Context, Intent)>
			return;
	//   72  140:return          
		}
		if("com.appboy.action.APPBOY_PUSH_DELETED".equals(((Object) (s))))
	//*  73  141:ldc2            #268 <String "com.appboy.action.APPBOY_PUSH_DELETED">
	//*  74  144:aload_3         
	//*  75  145:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  76  148:ifeq            157
		{
			AppboyNotificationUtils.handleNotificationDeleted(context, intent);
	//   77  151:aload_1         
	//   78  152:aload_2         
	//   79  153:invokestatic    #271 <Method void AppboyNotificationUtils.handleNotificationDeleted(Context, Intent)>
			return;
	//   80  156:return          
		} else
		{
			AppboyLogger.w(TAG, "The FCM receiver received a message not sent from Appboy. Ignoring the message.");
	//   81  157:getstatic       #31  <Field String TAG>
	//   82  160:ldc2            #273 <String "The FCM receiver received a message not sent from Appboy. Ignoring the message.">
	//   83  163:invokestatic    #276 <Method int AppboyLogger.w(String, String)>
	//   84  166:pop             
			return;
	//   85  167:return          
		}
	}

	private static final String FCM_DELETED_MESSAGES_KEY = "deleted_messages";
	private static final String FCM_MESSAGE_TYPE_KEY = "message_type";
	private static final String FCM_NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";
	private static final String FCM_RECEIVE_INTENT_ACTION = "com.google.android.c2dm.intent.RECEIVE";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/AppboyFcmReceiver);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyFcmReceiver>
	//    1    2:invokestatic    #29  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #31  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #31  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
