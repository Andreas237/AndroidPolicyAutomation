// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.NotificationManager;
import android.content.*;
import android.os.AsyncTask;
import android.os.Bundle;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.push.AppboyNotificationActionUtils;
import com.appboy.push.AppboyNotificationUtils;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			IAppboyNotificationFactory, Appboy

public final class AppboyAdmReceiver extends BroadcastReceiver
{
	public class HandleAppboyAdmMessageTask extends AsyncTask
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
				handleAppboyAdmMessage(mContext, mIntent);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field AppboyAdmReceiver this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field Context mContext>
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field Intent mIntent>
		//    6   12:invokevirtual   #45  <Method boolean AppboyAdmReceiver.handleAppboyAdmMessage(Context, Intent)>
		//    7   15:pop             
			}
		//*   8   16:goto            30
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
		//*   9   19:astore_1        
			{
				AppboyLogger.e(AppboyAdmReceiver.TAG, "Failed to create and display notification.", ((Throwable) (avoid)));
		//   10   20:invokestatic    #49  <Method String AppboyAdmReceiver.access$000()>
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
		final AppboyAdmReceiver this$0;

		public HandleAppboyAdmMessageTask(Context context, Intent intent)
		{
			this$0 = AppboyAdmReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field AppboyAdmReceiver this$0>
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


	public AppboyAdmReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	boolean handleAppboyAdmMessage(Context context, Intent intent)
	{
		Object obj = ((Object) ((NotificationManager)context.getSystemService("notification")));
	//    0    0:aload_1         
	//    1    1:ldc1            #56  <String "notification">
	//    2    3:invokevirtual   #62  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #64  <Class NotificationManager>
	//    4    9:astore          5
		if("deleted_messages".equals(((Object) (intent.getStringExtra("message_type")))))
	//*   5   11:ldc1            #11  <String "deleted_messages">
	//*   6   13:aload_2         
	//*   7   14:ldc1            #17  <String "message_type">
	//*   8   16:invokevirtual   #70  <Method String Intent.getStringExtra(String)>
	//*   9   19:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  10   22:ifeq            124
		{
			int i = intent.getIntExtra("total_deleted", -1);
	//   11   25:aload_2         
	//   12   26:ldc1            #20  <String "total_deleted">
	//   13   28:iconst_m1       
	//   14   29:invokevirtual   #80  <Method int Intent.getIntExtra(String, int)>
	//   15   32:istore_3        
			if(i == -1)
	//*  16   33:iload_3         
	//*  17   34:iconst_m1       
	//*  18   35:icmpne          81
			{
				context = ((Context) (TAG));
	//   19   38:getstatic       #46  <Field String TAG>
	//   20   41:astore_1        
				obj = ((Object) (new StringBuilder()));
	//   21   42:new             #82  <Class StringBuilder>
	//   22   45:dup             
	//   23   46:invokespecial   #83  <Method void StringBuilder()>
	//   24   49:astore          5
				((StringBuilder) (obj)).append("Unable to parse ADM message. Intent: ");
	//   25   51:aload           5
	//   26   53:ldc1            #85  <String "Unable to parse ADM message. Intent: ">
	//   27   55:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
				((StringBuilder) (obj)).append(intent.toString());
	//   29   59:aload           5
	//   30   61:aload_2         
	//   31   62:invokevirtual   #92  <Method String Intent.toString()>
	//   32   65:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
				AppboyLogger.e(((String) (context)), ((StringBuilder) (obj)).toString());
	//   34   69:aload_1         
	//   35   70:aload           5
	//   36   72:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   37   75:invokestatic    #97  <Method int AppboyLogger.e(String, String)>
	//   38   78:pop             
				return false;
	//   39   79:iconst_0        
	//   40   80:ireturn         
			} else
			{
				context = ((Context) (TAG));
	//   41   81:getstatic       #46  <Field String TAG>
	//   42   84:astore_1        
				intent = ((Intent) (new StringBuilder()));
	//   43   85:new             #82  <Class StringBuilder>
	//   44   88:dup             
	//   45   89:invokespecial   #83  <Method void StringBuilder()>
	//   46   92:astore_2        
				((StringBuilder) (intent)).append("ADM deleted ");
	//   47   93:aload_2         
	//   48   94:ldc1            #99  <String "ADM deleted ">
	//   49   96:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   50   99:pop             
				((StringBuilder) (intent)).append(i);
	//   51  100:aload_2         
	//   52  101:iload_3         
	//   53  102:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   54  105:pop             
				((StringBuilder) (intent)).append(" messages. Fetch them from Appboy.");
	//   55  106:aload_2         
	//   56  107:ldc1            #104 <String " messages. Fetch them from Appboy.">
	//   57  109:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   58  112:pop             
				AppboyLogger.i(((String) (context)), ((StringBuilder) (intent)).toString());
	//   59  113:aload_1         
	//   60  114:aload_2         
	//   61  115:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   62  118:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   63  121:pop             
				return false;
	//   64  122:iconst_0        
	//   65  123:ireturn         
			}
		}
		Bundle bundle = intent.getExtras();
	//   66  124:aload_2         
	//   67  125:invokevirtual   #111 <Method Bundle Intent.getExtras()>
	//   68  128:astore          6
		Object obj1 = ((Object) (TAG));
	//   69  130:getstatic       #46  <Field String TAG>
	//   70  133:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   71  135:new             #82  <Class StringBuilder>
	//   72  138:dup             
	//   73  139:invokespecial   #83  <Method void StringBuilder()>
	//   74  142:astore          8
		stringbuilder.append("Push message payload received: ");
	//   75  144:aload           8
	//   76  146:ldc1            #113 <String "Push message payload received: ">
	//   77  148:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   78  151:pop             
		stringbuilder.append(((Object) (bundle)));
	//   79  152:aload           8
	//   80  154:aload           6
	//   81  156:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   82  159:pop             
		AppboyLogger.d(((String) (obj1)), stringbuilder.toString());
	//   83  160:aload           7
	//   84  162:aload           8
	//   85  164:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   86  167:invokestatic    #119 <Method int AppboyLogger.d(String, String)>
	//   87  170:pop             
		if(!bundle.containsKey("appboy_push_received_timestamp"))
	//*  88  171:aload           6
	//*  89  173:ldc1            #121 <String "appboy_push_received_timestamp">
	//*  90  175:invokevirtual   #127 <Method boolean Bundle.containsKey(String)>
	//*  91  178:ifne            191
			bundle.putLong("appboy_push_received_timestamp", System.currentTimeMillis());
	//   92  181:aload           6
	//   93  183:ldc1            #121 <String "appboy_push_received_timestamp">
	//   94  185:invokestatic    #133 <Method long System.currentTimeMillis()>
	//   95  188:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
		AppboyNotificationUtils.logPushDeliveryEvent(context, bundle);
	//   96  191:aload_1         
	//   97  192:aload           6
	//   98  194:invokestatic    #143 <Method void AppboyNotificationUtils.logPushDeliveryEvent(Context, Bundle)>
		obj1 = ((Object) (AppboyNotificationUtils.getAppboyExtrasWithoutPreprocessing(bundle)));
	//   99  197:aload           6
	//  100  199:invokestatic    #147 <Method Bundle AppboyNotificationUtils.getAppboyExtrasWithoutPreprocessing(Bundle)>
	//  101  202:astore          7
		bundle.putBundle("extra", ((Bundle) (obj1)));
	//  102  204:aload           6
	//  103  206:ldc1            #149 <String "extra">
	//  104  208:aload           7
	//  105  210:invokevirtual   #153 <Method void Bundle.putBundle(String, Bundle)>
		if(AppboyNotificationUtils.isNotificationMessage(intent))
	//* 106  213:aload_2         
	//* 107  214:invokestatic    #157 <Method boolean AppboyNotificationUtils.isNotificationMessage(Intent)>
	//* 108  217:ifeq            330
		{
			int j = AppboyNotificationUtils.getNotificationId(bundle);
	//  109  220:aload           6
	//  110  222:invokestatic    #161 <Method int AppboyNotificationUtils.getNotificationId(Bundle)>
	//  111  225:istore_3        
			bundle.putInt("nid", j);
	//  112  226:aload           6
	//  113  228:ldc1            #163 <String "nid">
	//  114  230:iload_3         
	//  115  231:invokevirtual   #167 <Method void Bundle.putInt(String, int)>
			intent = ((Intent) (new AppboyConfigurationProvider(context)));
	//  116  234:new             #169 <Class AppboyConfigurationProvider>
	//  117  237:dup             
	//  118  238:aload_1         
	//  119  239:invokespecial   #172 <Method void AppboyConfigurationProvider(Context)>
	//  120  242:astore_2        
			intent = ((Intent) (AppboyNotificationUtils.getActiveNotificationFactory().createNotification(((AppboyConfigurationProvider) (intent)), context, bundle, ((Bundle) (obj1)))));
	//  121  243:invokestatic    #176 <Method IAppboyNotificationFactory AppboyNotificationUtils.getActiveNotificationFactory()>
	//  122  246:aload_2         
	//  123  247:aload_1         
	//  124  248:aload           6
	//  125  250:aload           7
	//  126  252:invokeinterface #182 <Method android.app.Notification IAppboyNotificationFactory.createNotification(AppboyConfigurationProvider, Context, Bundle, Bundle)>
	//  127  257:astore_2        
			if(intent == null)
	//* 128  258:aload_2         
	//* 129  259:ifnonnull       273
			{
				AppboyLogger.d(TAG, "Notification created by notification factory was null. Not displaying notification.");
	//  130  262:getstatic       #46  <Field String TAG>
	//  131  265:ldc1            #184 <String "Notification created by notification factory was null. Not displaying notification.">
	//  132  267:invokestatic    #119 <Method int AppboyLogger.d(String, String)>
	//  133  270:pop             
				return false;
	//  134  271:iconst_0        
	//  135  272:ireturn         
			}
			((NotificationManager) (obj)).notify("appboy_notification", j, ((android.app.Notification) (intent)));
	//  136  273:aload           5
	//  137  275:ldc1            #186 <String "appboy_notification">
	//  138  277:iload_3         
	//  139  278:aload_2         
	//  140  279:invokevirtual   #190 <Method void NotificationManager.notify(String, int, android.app.Notification)>
			AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
	//  141  282:aload_1         
	//  142  283:aload           6
	//  143  285:invokestatic    #193 <Method void AppboyNotificationUtils.sendPushMessageReceivedBroadcast(Context, Bundle)>
			AppboyNotificationUtils.wakeScreenIfHasPermission(context, bundle);
	//  144  288:aload_1         
	//  145  289:aload           6
	//  146  291:invokestatic    #197 <Method boolean AppboyNotificationUtils.wakeScreenIfHasPermission(Context, Bundle)>
	//  147  294:pop             
			if(bundle.containsKey("nd"))
	//* 148  295:aload           6
	//* 149  297:ldc1            #199 <String "nd">
	//* 150  299:invokevirtual   #127 <Method boolean Bundle.containsKey(String)>
	//* 151  302:ifeq            328
			{
				int k = Integer.parseInt(bundle.getString("nd"));
	//  152  305:aload           6
	//  153  307:ldc1            #199 <String "nd">
	//  154  309:invokevirtual   #202 <Method String Bundle.getString(String)>
	//  155  312:invokestatic    #208 <Method int Integer.parseInt(String)>
	//  156  315:istore          4
				AppboyNotificationUtils.setNotificationDurationAlarm(context, ((Object)this).getClass(), j, k);
	//  157  317:aload_1         
	//  158  318:aload_0         
	//  159  319:invokevirtual   #214 <Method Class Object.getClass()>
	//  160  322:iload_3         
	//  161  323:iload           4
	//  162  325:invokestatic    #218 <Method void AppboyNotificationUtils.setNotificationDurationAlarm(Context, Class, int, int)>
			}
			return true;
	//  163  328:iconst_1        
	//  164  329:ireturn         
		} else
		{
			AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
	//  165  330:aload_1         
	//  166  331:aload           6
	//  167  333:invokestatic    #193 <Method void AppboyNotificationUtils.sendPushMessageReceivedBroadcast(Context, Bundle)>
			AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(context, bundle);
	//  168  336:aload_1         
	//  169  337:aload           6
	//  170  339:invokestatic    #221 <Method boolean AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(Context, Bundle)>
	//  171  342:pop             
			return false;
	//  172  343:iconst_0        
	//  173  344:ireturn         
		}
	}

	void handleAppboyAdmReceiveIntent(Context context, Intent intent)
	{
		if(AppboyNotificationUtils.isAppboyPushMessage(intent))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #226 <Method boolean AppboyNotificationUtils.isAppboyPushMessage(Intent)>
	//*   2    4:ifeq            18
			new HandleAppboyAdmMessageTask(context, intent);
	//    3    7:new             #6   <Class AppboyAdmReceiver$HandleAppboyAdmMessageTask>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #229 <Method void AppboyAdmReceiver$HandleAppboyAdmMessageTask(AppboyAdmReceiver, Context, Intent)>
	//    9   17:pop             
	//   10   18:return          
	}

	boolean handleRegistrationEventIfEnabled(AppboyConfigurationProvider appboyconfigurationprovider, Context context, Intent intent)
	{
		String s = TAG;
	//    0    0:getstatic       #46  <Field String TAG>
	//    1    3:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #82  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #83  <Method void StringBuilder()>
	//    5   12:astore          5
		stringbuilder.append("Received ADM registration. Message: ");
	//    6   14:aload           5
	//    7   16:ldc1            #233 <String "Received ADM registration. Message: ">
	//    8   18:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(intent.toString());
	//   10   22:aload           5
	//   11   24:aload_3         
	//   12   25:invokevirtual   #92  <Method String Intent.toString()>
	//   13   28:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   15   32:aload           4
	//   16   34:aload           5
	//   17   36:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   18   39:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   19   42:pop             
		if(appboyconfigurationprovider.isAdmMessagingRegistrationEnabled())
	//*  20   43:aload_1         
	//*  21   44:invokevirtual   #237 <Method boolean AppboyConfigurationProvider.isAdmMessagingRegistrationEnabled()>
	//*  22   47:ifeq            68
		{
			AppboyLogger.d(TAG, "ADM enabled in appboy.xml. Continuing to process ADM registration intent.");
	//   23   50:getstatic       #46  <Field String TAG>
	//   24   53:ldc1            #239 <String "ADM enabled in appboy.xml. Continuing to process ADM registration intent.">
	//   25   55:invokestatic    #119 <Method int AppboyLogger.d(String, String)>
	//   26   58:pop             
			handleRegistrationIntent(context, intent);
	//   27   59:aload_0         
	//   28   60:aload_2         
	//   29   61:aload_3         
	//   30   62:invokevirtual   #242 <Method boolean handleRegistrationIntent(Context, Intent)>
	//   31   65:pop             
			return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
		} else
		{
			AppboyLogger.w(TAG, "ADM not enabled in appboy.xml. Ignoring ADM registration intent. Note: you must set com_appboy_push_adm_messaging_registration_enabled to true in your appboy.xml to enable ADM.");
	//   34   68:getstatic       #46  <Field String TAG>
	//   35   71:ldc1            #244 <String "ADM not enabled in appboy.xml. Ignoring ADM registration intent. Note: you must set com_appboy_push_adm_messaging_registration_enabled to true in your appboy.xml to enable ADM.">
	//   36   73:invokestatic    #247 <Method int AppboyLogger.w(String, String)>
	//   37   76:pop             
			return false;
	//   38   77:iconst_0        
	//   39   78:ireturn         
		}
	}

	boolean handleRegistrationIntent(Context context, Intent intent)
	{
label0:
		{
			String s = intent.getStringExtra("error");
	//    0    0:aload_2         
	//    1    1:ldc1            #14  <String "error">
	//    2    3:invokevirtual   #70  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_3        
			String s1 = intent.getStringExtra("registration_id");
	//    4    7:aload_2         
	//    5    8:ldc1            #26  <String "registration_id">
	//    6   10:invokevirtual   #70  <Method String Intent.getStringExtra(String)>
	//    7   13:astore          4
			intent = ((Intent) (intent.getStringExtra("unregistered")));
	//    8   15:aload_2         
	//    9   16:ldc1            #32  <String "unregistered">
	//   10   18:invokevirtual   #70  <Method String Intent.getStringExtra(String)>
	//   11   21:astore_2        
			if(s != null)
	//*  12   22:aload_3         
	//*  13   23:ifnull          63
			{
				context = ((Context) (TAG));
	//   14   26:getstatic       #46  <Field String TAG>
	//   15   29:astore_1        
				intent = ((Intent) (new StringBuilder()));
	//   16   30:new             #82  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #83  <Method void StringBuilder()>
	//   19   37:astore_2        
				((StringBuilder) (intent)).append("Error during ADM registration: ");
	//   20   38:aload_2         
	//   21   39:ldc1            #249 <String "Error during ADM registration: ">
	//   22   41:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
				((StringBuilder) (intent)).append(s);
	//   24   45:aload_2         
	//   25   46:aload_3         
	//   26   47:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
				AppboyLogger.e(((String) (context)), ((StringBuilder) (intent)).toString());
	//   28   51:aload_1         
	//   29   52:aload_2         
	//   30   53:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   31   56:invokestatic    #97  <Method int AppboyLogger.e(String, String)>
	//   32   59:pop             
			} else
	//*  33   60:goto            154
			if(s1 != null)
	//*  34   63:aload           4
	//*  35   65:ifnull          115
			{
				intent = ((Intent) (TAG));
	//   36   68:getstatic       #46  <Field String TAG>
	//   37   71:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   38   72:new             #82  <Class StringBuilder>
	//   39   75:dup             
	//   40   76:invokespecial   #83  <Method void StringBuilder()>
	//   41   79:astore_3        
				stringbuilder.append("Registering for ADM messages with registrationId: ");
	//   42   80:aload_3         
	//   43   81:ldc1            #251 <String "Registering for ADM messages with registrationId: ">
	//   44   83:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   45   86:pop             
				stringbuilder.append(s1);
	//   46   87:aload_3         
	//   47   88:aload           4
	//   48   90:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   49   93:pop             
				AppboyLogger.i(((String) (intent)), stringbuilder.toString());
	//   50   94:aload_2         
	//   51   95:aload_3         
	//   52   96:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   53   99:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   54  102:pop             
				Appboy.getInstance(context).registerAppboyPushMessages(s1);
	//   55  103:aload_1         
	//   56  104:invokestatic    #257 <Method Appboy Appboy.getInstance(Context)>
	//   57  107:aload           4
	//   58  109:invokevirtual   #261 <Method void Appboy.registerAppboyPushMessages(String)>
			} else
	//*  59  112:goto            154
			{
				if(intent == null)
					break label0;
	//   60  115:aload_2         
	//   61  116:ifnull          156
				context = ((Context) (TAG));
	//   62  119:getstatic       #46  <Field String TAG>
	//   63  122:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   64  123:new             #82  <Class StringBuilder>
	//   65  126:dup             
	//   66  127:invokespecial   #83  <Method void StringBuilder()>
	//   67  130:astore_3        
				stringbuilder1.append("The device was un-registered from ADM: ");
	//   68  131:aload_3         
	//   69  132:ldc2            #263 <String "The device was un-registered from ADM: ">
	//   70  135:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   71  138:pop             
				stringbuilder1.append(((String) (intent)));
	//   72  139:aload_3         
	//   73  140:aload_2         
	//   74  141:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   75  144:pop             
				AppboyLogger.w(((String) (context)), stringbuilder1.toString());
	//   76  145:aload_1         
	//   77  146:aload_3         
	//   78  147:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   79  150:invokestatic    #247 <Method int AppboyLogger.w(String, String)>
	//   80  153:pop             
			}
			return true;
	//   81  154:iconst_1        
	//   82  155:ireturn         
		}
		AppboyLogger.w(TAG, "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.");
	//   83  156:getstatic       #46  <Field String TAG>
	//   84  159:ldc2            #265 <String "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.">
	//   85  162:invokestatic    #247 <Method int AppboyLogger.w(String, String)>
	//   86  165:pop             
		return false;
	//   87  166:iconst_0        
	//   88  167:ireturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		String s = TAG;
	//    0    0:getstatic       #46  <Field String TAG>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #82  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #83  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Received broadcast message. Message: ");
	//    6   13:aload           4
	//    7   15:ldc2            #268 <String "Received broadcast message. Message: ">
	//    8   18:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(intent.toString());
	//   10   22:aload           4
	//   11   24:aload_2         
	//   12   25:invokevirtual   #92  <Method String Intent.toString()>
	//   13   28:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   15   32:aload_3         
	//   16   33:aload           4
	//   17   35:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   18   38:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   19   41:pop             
		s = intent.getAction();
	//   20   42:aload_2         
	//   21   43:invokevirtual   #271 <Method String Intent.getAction()>
	//   22   46:astore_3        
		if("com.amazon.device.messaging.intent.REGISTRATION".equals(((Object) (s))))
	//*  23   47:ldc1            #29  <String "com.amazon.device.messaging.intent.REGISTRATION">
	//*  24   49:aload_3         
	//*  25   50:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  26   53:ifeq            72
		{
			handleRegistrationEventIfEnabled(new AppboyConfigurationProvider(context), context, intent);
	//   27   56:aload_0         
	//   28   57:new             #169 <Class AppboyConfigurationProvider>
	//   29   60:dup             
	//   30   61:aload_1         
	//   31   62:invokespecial   #172 <Method void AppboyConfigurationProvider(Context)>
	//   32   65:aload_1         
	//   33   66:aload_2         
	//   34   67:invokevirtual   #273 <Method boolean handleRegistrationEventIfEnabled(AppboyConfigurationProvider, Context, Intent)>
	//   35   70:pop             
			return;
	//   36   71:return          
		}
		if("com.amazon.device.messaging.intent.RECEIVE".equals(((Object) (s))))
	//*  37   72:ldc1            #23  <String "com.amazon.device.messaging.intent.RECEIVE">
	//*  38   74:aload_3         
	//*  39   75:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  40   78:ifeq            88
		{
			handleAppboyAdmReceiveIntent(context, intent);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #275 <Method void handleAppboyAdmReceiveIntent(Context, Intent)>
			return;
	//   45   87:return          
		}
		if("com.appboy.action.CANCEL_NOTIFICATION".equals(((Object) (s))))
	//*  46   88:ldc2            #277 <String "com.appboy.action.CANCEL_NOTIFICATION">
	//*  47   91:aload_3         
	//*  48   92:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  49   95:ifeq            104
		{
			AppboyNotificationUtils.handleCancelNotificationAction(context, intent);
	//   50   98:aload_1         
	//   51   99:aload_2         
	//   52  100:invokestatic    #280 <Method void AppboyNotificationUtils.handleCancelNotificationAction(Context, Intent)>
			return;
	//   53  103:return          
		}
		if("com.appboy.action.APPBOY_ACTION_CLICKED".equals(((Object) (s))))
	//*  54  104:ldc2            #282 <String "com.appboy.action.APPBOY_ACTION_CLICKED">
	//*  55  107:aload_3         
	//*  56  108:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  57  111:ifeq            120
		{
			AppboyNotificationActionUtils.handleNotificationActionClicked(context, intent);
	//   58  114:aload_1         
	//   59  115:aload_2         
	//   60  116:invokestatic    #287 <Method void AppboyNotificationActionUtils.handleNotificationActionClicked(Context, Intent)>
			return;
	//   61  119:return          
		}
		if("com.appboy.action.APPBOY_PUSH_CLICKED".equals(((Object) (s))))
	//*  62  120:ldc2            #289 <String "com.appboy.action.APPBOY_PUSH_CLICKED">
	//*  63  123:aload_3         
	//*  64  124:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  65  127:ifeq            136
		{
			AppboyNotificationUtils.handleNotificationOpened(context, intent);
	//   66  130:aload_1         
	//   67  131:aload_2         
	//   68  132:invokestatic    #292 <Method void AppboyNotificationUtils.handleNotificationOpened(Context, Intent)>
			return;
	//   69  135:return          
		}
		if("com.appboy.action.APPBOY_PUSH_DELETED".equals(((Object) (s))))
	//*  70  136:ldc2            #294 <String "com.appboy.action.APPBOY_PUSH_DELETED">
	//*  71  139:aload_3         
	//*  72  140:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  73  143:ifeq            152
		{
			AppboyNotificationUtils.handleNotificationDeleted(context, intent);
	//   74  146:aload_1         
	//   75  147:aload_2         
	//   76  148:invokestatic    #297 <Method void AppboyNotificationUtils.handleNotificationDeleted(Context, Intent)>
			return;
	//   77  151:return          
		} else
		{
			AppboyLogger.w(TAG, "The ADM receiver received a message not sent from Appboy. Ignoring the message.");
	//   78  152:getstatic       #46  <Field String TAG>
	//   79  155:ldc2            #299 <String "The ADM receiver received a message not sent from Appboy. Ignoring the message.">
	//   80  158:invokestatic    #247 <Method int AppboyLogger.w(String, String)>
	//   81  161:pop             
			return;
	//   82  162:return          
		}
	}

	private static final String ADM_DELETED_MESSAGES_KEY = "deleted_messages";
	private static final String ADM_ERROR_KEY = "error";
	private static final String ADM_MESSAGE_TYPE_KEY = "message_type";
	private static final String ADM_NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";
	private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
	private static final String ADM_REGISTRATION_ID_KEY = "registration_id";
	private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";
	private static final String ADM_UNREGISTERED_KEY = "unregistered";
	public static final String CAMPAIGN_ID_KEY = "cid";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/AppboyAdmReceiver);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyAdmReceiver>
	//    1    2:invokestatic    #44  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #46  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #46  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
