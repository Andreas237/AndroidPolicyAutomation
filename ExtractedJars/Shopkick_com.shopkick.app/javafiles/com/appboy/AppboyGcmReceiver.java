// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.*;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.push.AppboyNotificationActionUtils;
import com.appboy.push.AppboyNotificationUtils;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			IAppboyNotificationFactory, Appboy

public final class AppboyGcmReceiver extends BroadcastReceiver
{
	public class HandleAppboyGcmMessageTask extends AsyncTask
	{

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class Void[]>
		//    3    5:invokevirtual   #39  <Method Void doInBackground(Void[])>
		//    4    8:areturn         
		}

		protected transient Void doInBackground(Void avoid[])
		{
			try
			{
				handleAppboyGcmMessage(mContext, mIntent);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field AppboyGcmReceiver this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field Context mContext>
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field Intent mIntent>
		//    6   12:invokevirtual   #45  <Method boolean AppboyGcmReceiver.handleAppboyGcmMessage(Context, Intent)>
		//    7   15:pop             
			}
		//*   8   16:goto            30
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
		//*   9   19:astore_1        
			{
				AppboyLogger.e(AppboyGcmReceiver.TAG, "Failed to create and display notification.", ((Throwable) (avoid)));
		//   10   20:invokestatic    #49  <Method String AppboyGcmReceiver.access$000()>
		//   11   23:ldc1            #51  <String "Failed to create and display notification.">
		//   12   25:aload_1         
		//   13   26:invokestatic    #57  <Method int AppboyLogger.e(String, String, Throwable)>
		//   14   29:pop             
			}
			return null;
		//   15   30:aconst_null     
		//   16   31:areturn         
		}

		private final Context mContext;
		private final Intent mIntent;
		final AppboyGcmReceiver this$0;

		public HandleAppboyGcmMessageTask(Context context, Intent intent)
		{
			this$0 = AppboyGcmReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field AppboyGcmReceiver this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void AsyncTask()>
			mContext = context;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Context mContext>
			mIntent = intent;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field Intent mIntent>
			execute(((Object []) (new Void[0])));
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:anewarray       Void[]
		//   14   24:invokevirtual   #31  <Method AsyncTask execute(Object[])>
		//   15   27:pop             
		//   16   28:return          
		}
	}


	public AppboyGcmReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	boolean handleAppboyGcmMessage(Context context, Intent intent)
	{
		Object obj = ((Object) (NotificationManagerCompat.from(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #61  <Method NotificationManagerCompat NotificationManagerCompat.from(Context)>
	//    2    4:astore          5
		if("deleted_messages".equals(((Object) (intent.getStringExtra("message_type")))))
	//*   3    6:ldc1            #15  <String "deleted_messages">
	//*   4    8:aload_2         
	//*   5    9:ldc1            #21  <String "message_type">
	//*   6   11:invokevirtual   #67  <Method String Intent.getStringExtra(String)>
	//*   7   14:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*   8   17:ifeq            119
		{
			int i = intent.getIntExtra("total_deleted", -1);
	//    9   20:aload_2         
	//   10   21:ldc1            #24  <String "total_deleted">
	//   11   23:iconst_m1       
	//   12   24:invokevirtual   #77  <Method int Intent.getIntExtra(String, int)>
	//   13   27:istore_3        
			if(i == -1)
	//*  14   28:iload_3         
	//*  15   29:iconst_m1       
	//*  16   30:icmpne          76
			{
				context = ((Context) (TAG));
	//   17   33:getstatic       #47  <Field String TAG>
	//   18   36:astore_1        
				obj = ((Object) (new StringBuilder()));
	//   19   37:new             #79  <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #80  <Method void StringBuilder()>
	//   22   44:astore          5
				((StringBuilder) (obj)).append("Unable to parse GCM message. Intent: ");
	//   23   46:aload           5
	//   24   48:ldc1            #82  <String "Unable to parse GCM message. Intent: ">
	//   25   50:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
				((StringBuilder) (obj)).append(intent.toString());
	//   27   54:aload           5
	//   28   56:aload_2         
	//   29   57:invokevirtual   #89  <Method String Intent.toString()>
	//   30   60:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
				Log.e(((String) (context)), ((StringBuilder) (obj)).toString());
	//   32   64:aload_1         
	//   33   65:aload           5
	//   34   67:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   35   70:invokestatic    #96  <Method int Log.e(String, String)>
	//   36   73:pop             
				return false;
	//   37   74:iconst_0        
	//   38   75:ireturn         
			} else
			{
				context = ((Context) (TAG));
	//   39   76:getstatic       #47  <Field String TAG>
	//   40   79:astore_1        
				intent = ((Intent) (new StringBuilder()));
	//   41   80:new             #79  <Class StringBuilder>
	//   42   83:dup             
	//   43   84:invokespecial   #80  <Method void StringBuilder()>
	//   44   87:astore_2        
				((StringBuilder) (intent)).append("GCM deleted ");
	//   45   88:aload_2         
	//   46   89:ldc1            #98  <String "GCM deleted ">
	//   47   91:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   48   94:pop             
				((StringBuilder) (intent)).append(i);
	//   49   95:aload_2         
	//   50   96:iload_3         
	//   51   97:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   52  100:pop             
				((StringBuilder) (intent)).append(" messages. Fetch them from Appboy.");
	//   53  101:aload_2         
	//   54  102:ldc1            #103 <String " messages. Fetch them from Appboy.">
	//   55  104:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   56  107:pop             
				AppboyLogger.i(((String) (context)), ((StringBuilder) (intent)).toString());
	//   57  108:aload_1         
	//   58  109:aload_2         
	//   59  110:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   60  113:invokestatic    #106 <Method int AppboyLogger.i(String, String)>
	//   61  116:pop             
				return false;
	//   62  117:iconst_0        
	//   63  118:ireturn         
			}
		}
		Bundle bundle = intent.getExtras();
	//   64  119:aload_2         
	//   65  120:invokevirtual   #110 <Method Bundle Intent.getExtras()>
	//   66  123:astore          6
		Object obj1 = ((Object) (TAG));
	//   67  125:getstatic       #47  <Field String TAG>
	//   68  128:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   69  130:new             #79  <Class StringBuilder>
	//   70  133:dup             
	//   71  134:invokespecial   #80  <Method void StringBuilder()>
	//   72  137:astore          8
		stringbuilder.append("Push message payload received: ");
	//   73  139:aload           8
	//   74  141:ldc1            #112 <String "Push message payload received: ">
	//   75  143:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   76  146:pop             
		stringbuilder.append(((Object) (bundle)));
	//   77  147:aload           8
	//   78  149:aload           6
	//   79  151:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   80  154:pop             
		AppboyLogger.i(((String) (obj1)), stringbuilder.toString());
	//   81  155:aload           7
	//   82  157:aload           8
	//   83  159:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   84  162:invokestatic    #106 <Method int AppboyLogger.i(String, String)>
	//   85  165:pop             
		obj1 = ((Object) (AppboyNotificationUtils.getAppboyExtrasWithoutPreprocessing(bundle)));
	//   86  166:aload           6
	//   87  168:invokestatic    #121 <Method Bundle AppboyNotificationUtils.getAppboyExtrasWithoutPreprocessing(Bundle)>
	//   88  171:astore          7
		bundle.putBundle("extra", ((Bundle) (obj1)));
	//   89  173:aload           6
	//   90  175:ldc1            #123 <String "extra">
	//   91  177:aload           7
	//   92  179:invokevirtual   #129 <Method void Bundle.putBundle(String, Bundle)>
		if(!bundle.containsKey("appboy_push_received_timestamp"))
	//*  93  182:aload           6
	//*  94  184:ldc1            #131 <String "appboy_push_received_timestamp">
	//*  95  186:invokevirtual   #135 <Method boolean Bundle.containsKey(String)>
	//*  96  189:ifne            202
			bundle.putLong("appboy_push_received_timestamp", System.currentTimeMillis());
	//   97  192:aload           6
	//   98  194:ldc1            #131 <String "appboy_push_received_timestamp">
	//   99  196:invokestatic    #141 <Method long System.currentTimeMillis()>
	//  100  199:invokevirtual   #145 <Method void Bundle.putLong(String, long)>
		if(AppboyNotificationUtils.isNotificationMessage(intent))
	//* 101  202:aload_2         
	//* 102  203:invokestatic    #149 <Method boolean AppboyNotificationUtils.isNotificationMessage(Intent)>
	//* 103  206:ifeq            389
		{
			AppboyLogger.d(TAG, "Received notification push");
	//  104  209:getstatic       #47  <Field String TAG>
	//  105  212:ldc1            #151 <String "Received notification push">
	//  106  214:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//  107  217:pop             
			int j = AppboyNotificationUtils.getNotificationId(bundle);
	//  108  218:aload           6
	//  109  220:invokestatic    #158 <Method int AppboyNotificationUtils.getNotificationId(Bundle)>
	//  110  223:istore_3        
			bundle.putInt("nid", j);
	//  111  224:aload           6
	//  112  226:ldc1            #160 <String "nid">
	//  113  228:iload_3         
	//  114  229:invokevirtual   #164 <Method void Bundle.putInt(String, int)>
			intent = ((Intent) (new AppboyConfigurationProvider(context)));
	//  115  232:new             #166 <Class AppboyConfigurationProvider>
	//  116  235:dup             
	//  117  236:aload_1         
	//  118  237:invokespecial   #169 <Method void AppboyConfigurationProvider(Context)>
	//  119  240:astore_2        
			IAppboyNotificationFactory iappboynotificationfactory = AppboyNotificationUtils.getActiveNotificationFactory();
	//  120  241:invokestatic    #173 <Method IAppboyNotificationFactory AppboyNotificationUtils.getActiveNotificationFactory()>
	//  121  244:astore          8
			if(bundle.containsKey("ab_c"))
	//* 122  246:aload           6
	//* 123  248:ldc1            #175 <String "ab_c">
	//* 124  250:invokevirtual   #135 <Method boolean Bundle.containsKey(String)>
	//* 125  253:ifeq            292
			{
				if(!bundle.containsKey("appboy_story_newly_received"))
	//* 126  256:aload           6
	//* 127  258:ldc1            #177 <String "appboy_story_newly_received">
	//* 128  260:invokevirtual   #135 <Method boolean Bundle.containsKey(String)>
	//* 129  263:ifne            298
				{
					AppboyLogger.d(TAG, "Received the initial push story notification.");
	//  130  266:getstatic       #47  <Field String TAG>
	//  131  269:ldc1            #179 <String "Received the initial push story notification.">
	//  132  271:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//  133  274:pop             
					bundle.putBoolean("appboy_story_newly_received", true);
	//  134  275:aload           6
	//  135  277:ldc1            #177 <String "appboy_story_newly_received">
	//  136  279:iconst_1        
	//  137  280:invokevirtual   #183 <Method void Bundle.putBoolean(String, boolean)>
					AppboyNotificationUtils.logPushDeliveryEvent(context, bundle);
	//  138  283:aload_1         
	//  139  284:aload           6
	//  140  286:invokestatic    #187 <Method void AppboyNotificationUtils.logPushDeliveryEvent(Context, Bundle)>
				}
			} else
	//* 141  289:goto            298
			{
				AppboyNotificationUtils.logPushDeliveryEvent(context, bundle);
	//  142  292:aload_1         
	//  143  293:aload           6
	//  144  295:invokestatic    #187 <Method void AppboyNotificationUtils.logPushDeliveryEvent(Context, Bundle)>
			}
			intent = ((Intent) (iappboynotificationfactory.createNotification(((AppboyConfigurationProvider) (intent)), context, bundle, ((Bundle) (obj1)))));
	//  145  298:aload           8
	//  146  300:aload_2         
	//  147  301:aload_1         
	//  148  302:aload           6
	//  149  304:aload           7
	//  150  306:invokeinterface #193 <Method android.app.Notification IAppboyNotificationFactory.createNotification(AppboyConfigurationProvider, Context, Bundle, Bundle)>
	//  151  311:astore_2        
			if(intent == null)
	//* 152  312:aload_2         
	//* 153  313:ifnonnull       327
			{
				AppboyLogger.d(TAG, "Notification created by notification factory was null. Not displaying notification.");
	//  154  316:getstatic       #47  <Field String TAG>
	//  155  319:ldc1            #195 <String "Notification created by notification factory was null. Not displaying notification.">
	//  156  321:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//  157  324:pop             
				return false;
	//  158  325:iconst_0        
	//  159  326:ireturn         
			}
			((NotificationManagerCompat) (obj)).notify("appboy_notification", j, ((android.app.Notification) (intent)));
	//  160  327:aload           5
	//  161  329:ldc1            #197 <String "appboy_notification">
	//  162  331:iload_3         
	//  163  332:aload_2         
	//  164  333:invokevirtual   #201 <Method void NotificationManagerCompat.notify(String, int, android.app.Notification)>
			AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
	//  165  336:aload_1         
	//  166  337:aload           6
	//  167  339:invokestatic    #204 <Method void AppboyNotificationUtils.sendPushMessageReceivedBroadcast(Context, Bundle)>
			AppboyNotificationUtils.wakeScreenIfHasPermission(context, bundle);
	//  168  342:aload_1         
	//  169  343:aload           6
	//  170  345:invokestatic    #208 <Method boolean AppboyNotificationUtils.wakeScreenIfHasPermission(Context, Bundle)>
	//  171  348:pop             
			if(bundle != null && bundle.containsKey("nd"))
	//* 172  349:aload           6
	//* 173  351:ifnull          387
	//* 174  354:aload           6
	//* 175  356:ldc1            #210 <String "nd">
	//* 176  358:invokevirtual   #135 <Method boolean Bundle.containsKey(String)>
	//* 177  361:ifeq            387
			{
				int k = Integer.parseInt(bundle.getString("nd"));
	//  178  364:aload           6
	//  179  366:ldc1            #210 <String "nd">
	//  180  368:invokevirtual   #213 <Method String Bundle.getString(String)>
	//  181  371:invokestatic    #219 <Method int Integer.parseInt(String)>
	//  182  374:istore          4
				AppboyNotificationUtils.setNotificationDurationAlarm(context, ((Object)this).getClass(), j, k);
	//  183  376:aload_1         
	//  184  377:aload_0         
	//  185  378:invokevirtual   #225 <Method Class Object.getClass()>
	//  186  381:iload_3         
	//  187  382:iload           4
	//  188  384:invokestatic    #229 <Method void AppboyNotificationUtils.setNotificationDurationAlarm(Context, Class, int, int)>
			}
			return true;
	//  189  387:iconst_1        
	//  190  388:ireturn         
		} else
		{
			AppboyLogger.d(TAG, "Received data push");
	//  191  389:getstatic       #47  <Field String TAG>
	//  192  392:ldc1            #231 <String "Received data push">
	//  193  394:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//  194  397:pop             
			AppboyNotificationUtils.logPushDeliveryEvent(context, bundle);
	//  195  398:aload_1         
	//  196  399:aload           6
	//  197  401:invokestatic    #187 <Method void AppboyNotificationUtils.logPushDeliveryEvent(Context, Bundle)>
			AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
	//  198  404:aload_1         
	//  199  405:aload           6
	//  200  407:invokestatic    #204 <Method void AppboyNotificationUtils.sendPushMessageReceivedBroadcast(Context, Bundle)>
			AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(context, bundle);
	//  201  410:aload_1         
	//  202  411:aload           6
	//  203  413:invokestatic    #234 <Method boolean AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(Context, Bundle)>
	//  204  416:pop             
			return false;
	//  205  417:iconst_0        
	//  206  418:ireturn         
		}
	}

	void handleAppboyGcmReceiveIntent(Context context, Intent intent)
	{
		if(AppboyNotificationUtils.isAppboyPushMessage(intent))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #239 <Method boolean AppboyNotificationUtils.isAppboyPushMessage(Intent)>
	//*   2    4:ifeq            18
			new HandleAppboyGcmMessageTask(context, intent);
	//    3    7:new             #6   <Class AppboyGcmReceiver$HandleAppboyGcmMessageTask>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #242 <Method void AppboyGcmReceiver$HandleAppboyGcmMessageTask(AppboyGcmReceiver, Context, Intent)>
	//    9   17:pop             
	//   10   18:return          
	}

	boolean handleRegistrationEventIfEnabled(AppboyConfigurationProvider appboyconfigurationprovider, Context context, Intent intent)
	{
		if(appboyconfigurationprovider.isGcmMessagingRegistrationEnabled())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #248 <Method boolean AppboyConfigurationProvider.isGcmMessagingRegistrationEnabled()>
	//*   2    4:ifeq            16
		{
			handleRegistrationIntent(context, intent);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #251 <Method boolean handleRegistrationIntent(Context, Intent)>
	//    7   13:pop             
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		} else
		{
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
	}

	boolean handleRegistrationIntent(Context context, Intent intent)
	{
label0:
		{
			String s = intent.getStringExtra("error");
	//    0    0:aload_2         
	//    1    1:ldc1            #18  <String "error">
	//    2    3:invokevirtual   #67  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_3        
			String s1 = intent.getStringExtra("registration_id");
	//    4    7:aload_2         
	//    5    8:ldc1            #30  <String "registration_id">
	//    6   10:invokevirtual   #67  <Method String Intent.getStringExtra(String)>
	//    7   13:astore          4
			if(s != null)
	//*   8   15:aload_3         
	//*   9   16:ifnull          193
			{
				if("SERVICE_NOT_AVAILABLE".equals(((Object) (s))))
	//*  10   19:ldc1            #253 <String "SERVICE_NOT_AVAILABLE">
	//*  11   21:aload_3         
	//*  12   22:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  13   25:ifeq            40
					Log.e(TAG, "Unable to connect to the GCM registration server. Try again later.");
	//   14   28:getstatic       #47  <Field String TAG>
	//   15   31:ldc1            #255 <String "Unable to connect to the GCM registration server. Try again later.">
	//   16   33:invokestatic    #96  <Method int Log.e(String, String)>
	//   17   36:pop             
				else
	//*  18   37:goto            229
				if("ACCOUNT_MISSING".equals(((Object) (s))))
	//*  19   40:ldc2            #257 <String "ACCOUNT_MISSING">
	//*  20   43:aload_3         
	//*  21   44:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  22   47:ifeq            63
					Log.e(TAG, "No Google account found on the phone. For pre-3.0 devices, a Google account is required on the device.");
	//   23   50:getstatic       #47  <Field String TAG>
	//   24   53:ldc2            #259 <String "No Google account found on the phone. For pre-3.0 devices, a Google account is required on the device.">
	//   25   56:invokestatic    #96  <Method int Log.e(String, String)>
	//   26   59:pop             
				else
	//*  27   60:goto            229
				if("AUTHENTICATION_FAILED".equals(((Object) (s))))
	//*  28   63:ldc2            #261 <String "AUTHENTICATION_FAILED">
	//*  29   66:aload_3         
	//*  30   67:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  31   70:ifeq            86
					Log.e(TAG, "Unable to authenticate Google account. For Android versions <4.0.4, a valid Google Play account is required for Google Cloud Messaging to function. This phone will be unable to receive Google Cloud Messages until the user logs in with a valid Google Play account or upgrades the operating system on this device.");
	//   32   73:getstatic       #47  <Field String TAG>
	//   33   76:ldc2            #263 <String "Unable to authenticate Google account. For Android versions <4.0.4, a valid Google Play account is required for Google Cloud Messaging to function. This phone will be unable to receive Google Cloud Messages until the user logs in with a valid Google Play account or upgrades the operating system on this device.">
	//   34   79:invokestatic    #96  <Method int Log.e(String, String)>
	//   35   82:pop             
				else
	//*  36   83:goto            229
				if("INVALID_SENDER".equals(((Object) (s))))
	//*  37   86:ldc2            #265 <String "INVALID_SENDER">
	//*  38   89:aload_3         
	//*  39   90:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  40   93:ifeq            109
					Log.e(TAG, "One or multiple of the sender IDs provided are invalid.");
	//   41   96:getstatic       #47  <Field String TAG>
	//   42   99:ldc2            #267 <String "One or multiple of the sender IDs provided are invalid.">
	//   43  102:invokestatic    #96  <Method int Log.e(String, String)>
	//   44  105:pop             
				else
	//*  45  106:goto            229
				if("PHONE_REGISTRATION_ERROR".equals(((Object) (s))))
	//*  46  109:ldc2            #269 <String "PHONE_REGISTRATION_ERROR">
	//*  47  112:aload_3         
	//*  48  113:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  49  116:ifeq            132
					Log.e(TAG, "Device does not support GCM.");
	//   50  119:getstatic       #47  <Field String TAG>
	//   51  122:ldc2            #271 <String "Device does not support GCM.">
	//   52  125:invokestatic    #96  <Method int Log.e(String, String)>
	//   53  128:pop             
				else
	//*  54  129:goto            229
				if("INVALID_PARAMETERS".equals(((Object) (s))))
	//*  55  132:ldc2            #273 <String "INVALID_PARAMETERS">
	//*  56  135:aload_3         
	//*  57  136:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  58  139:ifeq            155
				{
					Log.e(TAG, "The request sent by the device does not contain the expected parameters. This phone does not currently support GCM.");
	//   59  142:getstatic       #47  <Field String TAG>
	//   60  145:ldc2            #275 <String "The request sent by the device does not contain the expected parameters. This phone does not currently support GCM.">
	//   61  148:invokestatic    #96  <Method int Log.e(String, String)>
	//   62  151:pop             
				} else
	//*  63  152:goto            229
				{
					context = ((Context) (TAG));
	//   64  155:getstatic       #47  <Field String TAG>
	//   65  158:astore_1        
					intent = ((Intent) (new StringBuilder()));
	//   66  159:new             #79  <Class StringBuilder>
	//   67  162:dup             
	//   68  163:invokespecial   #80  <Method void StringBuilder()>
	//   69  166:astore_2        
					((StringBuilder) (intent)).append("Received an unrecognised GCM registration error type. Ignoring. Error: ");
	//   70  167:aload_2         
	//   71  168:ldc2            #277 <String "Received an unrecognised GCM registration error type. Ignoring. Error: ">
	//   72  171:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   73  174:pop             
					((StringBuilder) (intent)).append(s);
	//   74  175:aload_2         
	//   75  176:aload_3         
	//   76  177:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   77  180:pop             
					AppboyLogger.w(((String) (context)), ((StringBuilder) (intent)).toString());
	//   78  181:aload_1         
	//   79  182:aload_2         
	//   80  183:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   81  186:invokestatic    #280 <Method int AppboyLogger.w(String, String)>
	//   82  189:pop             
				}
			} else
	//*  83  190:goto            229
			if(s1 != null)
	//*  84  193:aload           4
	//*  85  195:ifnull          210
			{
				Appboy.getInstance(context).registerAppboyPushMessages(s1);
	//   86  198:aload_1         
	//   87  199:invokestatic    #286 <Method Appboy Appboy.getInstance(Context)>
	//   88  202:aload           4
	//   89  204:invokevirtual   #290 <Method void Appboy.registerAppboyPushMessages(String)>
			} else
	//*  90  207:goto            229
			{
				if(!intent.hasExtra("unregistered"))
					break label0;
	//   91  210:aload_2         
	//   92  211:ldc1            #36  <String "unregistered">
	//   93  213:invokevirtual   #293 <Method boolean Intent.hasExtra(String)>
	//   94  216:ifeq            231
				AppboyLogger.w(TAG, "The device was un-registered from GCM.");
	//   95  219:getstatic       #47  <Field String TAG>
	//   96  222:ldc2            #295 <String "The device was un-registered from GCM.">
	//   97  225:invokestatic    #280 <Method int AppboyLogger.w(String, String)>
	//   98  228:pop             
			}
			return true;
	//   99  229:iconst_1        
	//  100  230:ireturn         
		}
		AppboyLogger.w(TAG, "The GCM registration message is missing error information, registration id, and unregistration confirmation. Ignoring.");
	//  101  231:getstatic       #47  <Field String TAG>
	//  102  234:ldc2            #297 <String "The GCM registration message is missing error information, registration id, and unregistration confirmation. Ignoring.">
	//  103  237:invokestatic    #280 <Method int AppboyLogger.w(String, String)>
	//  104  240:pop             
		return false;
	//  105  241:iconst_0        
	//  106  242:ireturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		String s = TAG;
	//    0    0:getstatic       #47  <Field String TAG>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #79  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #80  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Received broadcast message. Message: ");
	//    6   13:aload           4
	//    7   15:ldc2            #300 <String "Received broadcast message. Message: ">
	//    8   18:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(intent.toString());
	//   10   22:aload           4
	//   11   24:aload_2         
	//   12   25:invokevirtual   #89  <Method String Intent.toString()>
	//   13   28:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   15   32:aload_3         
	//   16   33:aload           4
	//   17   35:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   18   38:invokestatic    #106 <Method int AppboyLogger.i(String, String)>
	//   19   41:pop             
		s = intent.getAction();
	//   20   42:aload_2         
	//   21   43:invokevirtual   #303 <Method String Intent.getAction()>
	//   22   46:astore_3        
		if("com.google.android.c2dm.intent.REGISTRATION".equals(((Object) (s))))
	//*  23   47:ldc1            #33  <String "com.google.android.c2dm.intent.REGISTRATION">
	//*  24   49:aload_3         
	//*  25   50:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  26   53:ifeq            72
		{
			handleRegistrationEventIfEnabled(new AppboyConfigurationProvider(context), context, intent);
	//   27   56:aload_0         
	//   28   57:new             #166 <Class AppboyConfigurationProvider>
	//   29   60:dup             
	//   30   61:aload_1         
	//   31   62:invokespecial   #169 <Method void AppboyConfigurationProvider(Context)>
	//   32   65:aload_1         
	//   33   66:aload_2         
	//   34   67:invokevirtual   #305 <Method boolean handleRegistrationEventIfEnabled(AppboyConfigurationProvider, Context, Intent)>
	//   35   70:pop             
			return;
	//   36   71:return          
		}
		if("com.google.android.c2dm.intent.RECEIVE".equals(((Object) (s))))
	//*  37   72:ldc1            #27  <String "com.google.android.c2dm.intent.RECEIVE">
	//*  38   74:aload_3         
	//*  39   75:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  40   78:ifeq            88
		{
			handleAppboyGcmReceiveIntent(context, intent);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #307 <Method void handleAppboyGcmReceiveIntent(Context, Intent)>
			return;
	//   45   87:return          
		}
		if("com.appboy.action.CANCEL_NOTIFICATION".equals(((Object) (s))))
	//*  46   88:ldc2            #309 <String "com.appboy.action.CANCEL_NOTIFICATION">
	//*  47   91:aload_3         
	//*  48   92:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  49   95:ifeq            104
		{
			AppboyNotificationUtils.handleCancelNotificationAction(context, intent);
	//   50   98:aload_1         
	//   51   99:aload_2         
	//   52  100:invokestatic    #312 <Method void AppboyNotificationUtils.handleCancelNotificationAction(Context, Intent)>
			return;
	//   53  103:return          
		}
		if("com.appboy.action.APPBOY_ACTION_CLICKED".equals(((Object) (s))))
	//*  54  104:ldc2            #314 <String "com.appboy.action.APPBOY_ACTION_CLICKED">
	//*  55  107:aload_3         
	//*  56  108:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  57  111:ifeq            120
		{
			AppboyNotificationActionUtils.handleNotificationActionClicked(context, intent);
	//   58  114:aload_1         
	//   59  115:aload_2         
	//   60  116:invokestatic    #319 <Method void AppboyNotificationActionUtils.handleNotificationActionClicked(Context, Intent)>
			return;
	//   61  119:return          
		}
		if("com.appboy.action.STORY_TRAVERSE".equals(((Object) (s))))
	//*  62  120:ldc2            #321 <String "com.appboy.action.STORY_TRAVERSE">
	//*  63  123:aload_3         
	//*  64  124:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  65  127:ifeq            137
		{
			handleAppboyGcmReceiveIntent(context, intent);
	//   66  130:aload_0         
	//   67  131:aload_1         
	//   68  132:aload_2         
	//   69  133:invokevirtual   #307 <Method void handleAppboyGcmReceiveIntent(Context, Intent)>
			return;
	//   70  136:return          
		}
		if("com.appboy.action.APPBOY_STORY_CLICKED".equals(((Object) (s))))
	//*  71  137:ldc2            #323 <String "com.appboy.action.APPBOY_STORY_CLICKED">
	//*  72  140:aload_3         
	//*  73  141:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  74  144:ifeq            153
		{
			AppboyNotificationUtils.handlePushStoryPageClicked(context, intent);
	//   75  147:aload_1         
	//   76  148:aload_2         
	//   77  149:invokestatic    #326 <Method void AppboyNotificationUtils.handlePushStoryPageClicked(Context, Intent)>
			return;
	//   78  152:return          
		}
		if("com.appboy.action.APPBOY_PUSH_CLICKED".equals(((Object) (s))))
	//*  79  153:ldc2            #328 <String "com.appboy.action.APPBOY_PUSH_CLICKED">
	//*  80  156:aload_3         
	//*  81  157:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  82  160:ifeq            169
		{
			AppboyNotificationUtils.handleNotificationOpened(context, intent);
	//   83  163:aload_1         
	//   84  164:aload_2         
	//   85  165:invokestatic    #331 <Method void AppboyNotificationUtils.handleNotificationOpened(Context, Intent)>
			return;
	//   86  168:return          
		}
		if("com.appboy.action.APPBOY_PUSH_DELETED".equals(((Object) (s))))
	//*  87  169:ldc2            #333 <String "com.appboy.action.APPBOY_PUSH_DELETED">
	//*  88  172:aload_3         
	//*  89  173:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  90  176:ifeq            185
		{
			AppboyNotificationUtils.handleNotificationDeleted(context, intent);
	//   91  179:aload_1         
	//   92  180:aload_2         
	//   93  181:invokestatic    #336 <Method void AppboyNotificationUtils.handleNotificationDeleted(Context, Intent)>
			return;
	//   94  184:return          
		} else
		{
			AppboyLogger.w(TAG, "The GCM receiver received a message not sent from Appboy. Ignoring the message.");
	//   95  185:getstatic       #47  <Field String TAG>
	//   96  188:ldc2            #338 <String "The GCM receiver received a message not sent from Appboy. Ignoring the message.">
	//   97  191:invokestatic    #280 <Method int AppboyLogger.w(String, String)>
	//   98  194:pop             
			return;
	//   99  195:return          
		}
	}

	public static final String CAMPAIGN_ID_KEY = "cid";
	private static final String GCM_DELETED_MESSAGES_KEY = "deleted_messages";
	private static final String GCM_ERROR_KEY = "error";
	private static final String GCM_MESSAGE_TYPE_KEY = "message_type";
	private static final String GCM_NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";
	private static final String GCM_RECEIVE_INTENT_ACTION = "com.google.android.c2dm.intent.RECEIVE";
	private static final String GCM_REGISTRATION_ID_KEY = "registration_id";
	private static final String GCM_REGISTRATION_INTENT_ACTION = "com.google.android.c2dm.intent.REGISTRATION";
	private static final String GCM_UNREGISTERED_KEY = "unregistered";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/AppboyGcmReceiver);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyGcmReceiver>
	//    1    2:invokestatic    #45  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #47  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #47  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
