// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.push;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import com.appboy.*;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.enums.Channel;
import com.appboy.support.*;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.support.UriUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.push:
//			AppboyNotificationFactory, AppboyNotificationActionUtils, AppboyNotificationStyleFactory

public class AppboyNotificationUtils
{

	public AppboyNotificationUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static String bundleOptString(Bundle bundle, String s, String s1)
	{
		return bundle.getString(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #41  <Method String Bundle.getString(String, String)>
	//    4    6:areturn         
	}

	public static void cancelNotification(Context context, int i)
	{
		try
		{
			Object obj = ((Object) (TAG));
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #48  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #49  <Method void StringBuilder()>
	//    5   11:astore_3        
			stringbuilder.append("Cancelling notification action with id: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #51  <String "Cancelling notification action with id: ">
	//    8   15:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			stringbuilder.append(i);
	//   10   19:aload_3         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   13   24:pop             
			AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   18   33:pop             
			obj = ((Object) ((new Intent("com.appboy.action.CANCEL_NOTIFICATION")).setClass(context, getNotificationReceiverClass())));
	//   19   34:new             #68  <Class Intent>
	//   20   37:dup             
	//   21   38:ldc1            #70  <String "com.appboy.action.CANCEL_NOTIFICATION">
	//   22   40:invokespecial   #73  <Method void Intent(String)>
	//   23   43:aload_0         
	//   24   44:invokestatic    #77  <Method Class getNotificationReceiverClass()>
	//   25   47:invokevirtual   #81  <Method Intent Intent.setClass(Context, Class)>
	//   26   50:astore_2        
			((Intent) (obj)).putExtra("nid", i);
	//   27   51:aload_2         
	//   28   52:ldc1            #83  <String "nid">
	//   29   54:iload_1         
	//   30   55:invokevirtual   #87  <Method Intent Intent.putExtra(String, int)>
	//   31   58:pop             
			IntentUtils.addComponentAndSendBroadcast(context, ((Intent) (obj)));
	//   32   59:aload_0         
	//   33   60:aload_2         
	//   34   61:invokestatic    #93  <Method void IntentUtils.addComponentAndSendBroadcast(Context, Intent)>
			return;
	//   35   64:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   65:astore_0        
		{
			AppboyLogger.e(TAG, "Exception occurred attempting to cancel notification.", ((Throwable) (context)));
	//   37   66:getstatic       #28  <Field String TAG>
	//   38   69:ldc1            #95  <String "Exception occurred attempting to cancel notification.">
	//   39   71:aload_0         
	//   40   72:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   41   75:pop             
		}
	//   42   76:return          
	}

	public static IAppboyNotificationFactory getActiveNotificationFactory()
	{
		IAppboyNotificationFactory iappboynotificationfactory = Appboy.getCustomAppboyNotificationFactory();
	//    0    0:invokestatic    #106 <Method IAppboyNotificationFactory Appboy.getCustomAppboyNotificationFactory()>
	//    1    3:astore_0        
		if(iappboynotificationfactory == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       12
			return ((IAppboyNotificationFactory) (AppboyNotificationFactory.getInstance()));
	//    4    8:invokestatic    #112 <Method AppboyNotificationFactory AppboyNotificationFactory.getInstance()>
	//    5   11:areturn         
		else
			return iappboynotificationfactory;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public static Bundle getAppboyExtrasWithoutPreprocessing(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(bundle.containsKey("appboy_story_newly_received") && !bundle.getBoolean("appboy_story_newly_received"))
	//*   4    6:aload_0         
	//*   5    7:ldc1            #116 <String "appboy_story_newly_received">
	//*   6    9:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   7   12:ifeq            31
	//*   8   15:aload_0         
	//*   9   16:ldc1            #116 <String "appboy_story_newly_received">
	//*  10   18:invokevirtual   #123 <Method boolean Bundle.getBoolean(String)>
	//*  11   21:ifne            31
			return bundle.getBundle("extra");
	//   12   24:aload_0         
	//   13   25:ldc1            #125 <String "extra">
	//   14   27:invokevirtual   #129 <Method Bundle Bundle.getBundle(String)>
	//   15   30:areturn         
		if(!Constants.IS_AMAZON.booleanValue())
	//*  16   31:getstatic       #135 <Field Boolean Constants.IS_AMAZON>
	//*  17   34:invokevirtual   #141 <Method boolean Boolean.booleanValue()>
	//*  18   37:ifne            52
			return parseJSONStringDictionaryIntoBundle(bundle.getString("extra", "{}"));
	//   19   40:aload_0         
	//   20   41:ldc1            #125 <String "extra">
	//   21   43:ldc1            #143 <String "{}">
	//   22   45:invokevirtual   #41  <Method String Bundle.getString(String, String)>
	//   23   48:invokestatic    #146 <Method Bundle parseJSONStringDictionaryIntoBundle(String)>
	//   24   51:areturn         
		else
			return new Bundle(bundle);
	//   25   52:new             #37  <Class Bundle>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:invokespecial   #149 <Method void Bundle(Bundle)>
	//   29   60:areturn         
	}

	private static int getNotificationChannelImportance(NotificationChannel notificationchannel)
	{
		return notificationchannel.getImportance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method int NotificationChannel.getImportance()>
	//    2    4:ireturn         
	}

	public static int getNotificationId(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          150
		{
			if(bundle.containsKey("n"))
	//*   2    4:aload_0         
	//*   3    5:ldc1            #167 <String "n">
	//*   4    7:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifeq            72
			{
				int i;
				try
				{
					i = Integer.parseInt(bundle.getString("n"));
	//    6   13:aload_0         
	//    7   14:ldc1            #167 <String "n">
	//    8   16:invokevirtual   #170 <Method String Bundle.getString(String)>
	//    9   19:invokestatic    #176 <Method int Integer.parseInt(String)>
	//   10   22:istore_1        
					bundle = ((Bundle) (TAG));
	//   11   23:getstatic       #28  <Field String TAG>
	//   12   26:astore_0        
					StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #48  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #49  <Method void StringBuilder()>
	//   16   34:astore_2        
					stringbuilder.append("Using notification id provided in the message's extras bundle: ");
	//   17   35:aload_2         
	//   18   36:ldc1            #178 <String "Using notification id provided in the message's extras bundle: ">
	//   19   38:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
					stringbuilder.append(i);
	//   21   42:aload_2         
	//   22   43:iload_1         
	//   23   44:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   24   47:pop             
					AppboyLogger.d(((String) (bundle)), stringbuilder.toString());
	//   25   48:aload_0         
	//   26   49:aload_2         
	//   27   50:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   28   53:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   29   56:pop             
				}
	//*  30   57:iload_1         
	//*  31   58:ireturn         
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
	//*  32   59:astore_0        
				{
					AppboyLogger.e(TAG, "Unable to parse notification id provided in the message's extras bundle. Using default notification id instead: -1", ((Throwable) (bundle)));
	//   33   60:getstatic       #28  <Field String TAG>
	//   34   63:ldc1            #180 <String "Unable to parse notification id provided in the message's extras bundle. Using default notification id instead: -1">
	//   35   65:aload_0         
	//   36   66:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   37   69:pop             
					return -1;
	//   38   70:iconst_m1       
	//   39   71:ireturn         
				}
				return i;
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   40   72:new             #48  <Class StringBuilder>
	//   41   75:dup             
	//   42   76:invokespecial   #49  <Method void StringBuilder()>
	//   43   79:astore_2        
				stringbuilder1.append(bundle.getString("t", ""));
	//   44   80:aload_2         
	//   45   81:aload_0         
	//   46   82:ldc1            #182 <String "t">
	//   47   84:ldc1            #184 <String "">
	//   48   86:invokevirtual   #41  <Method String Bundle.getString(String, String)>
	//   49   89:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
				stringbuilder1.append(bundle.getString("a", ""));
	//   51   93:aload_2         
	//   52   94:aload_0         
	//   53   95:ldc1            #186 <String "a">
	//   54   97:ldc1            #184 <String "">
	//   55   99:invokevirtual   #41  <Method String Bundle.getString(String, String)>
	//   56  102:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   57  105:pop             
				int j = stringbuilder1.toString().hashCode();
	//   58  106:aload_2         
	//   59  107:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   60  110:invokevirtual   #191 <Method int String.hashCode()>
	//   61  113:istore_1        
				bundle = ((Bundle) (TAG));
	//   62  114:getstatic       #28  <Field String TAG>
	//   63  117:astore_0        
				stringbuilder1 = new StringBuilder();
	//   64  118:new             #48  <Class StringBuilder>
	//   65  121:dup             
	//   66  122:invokespecial   #49  <Method void StringBuilder()>
	//   67  125:astore_2        
				stringbuilder1.append("Message without notification id provided in the extras bundle received. Using a hash of the message: ");
	//   68  126:aload_2         
	//   69  127:ldc1            #193 <String "Message without notification id provided in the extras bundle received. Using a hash of the message: ">
	//   70  129:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   71  132:pop             
				stringbuilder1.append(j);
	//   72  133:aload_2         
	//   73  134:iload_1         
	//   74  135:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   75  138:pop             
				AppboyLogger.d(((String) (bundle)), stringbuilder1.toString());
	//   76  139:aload_0         
	//   77  140:aload_2         
	//   78  141:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   79  144:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   80  147:pop             
				return j;
	//   81  148:iload_1         
	//   82  149:ireturn         
			}
		} else
		{
			AppboyLogger.d(TAG, "Message without extras bundle received. Using default notification id: ");
	//   83  150:getstatic       #28  <Field String TAG>
	//   84  153:ldc1            #195 <String "Message without extras bundle received. Using default notification id: ">
	//   85  155:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   86  158:pop             
			return -1;
	//   87  159:iconst_m1       
	//   88  160:ireturn         
		}
	}

	public static int getNotificationPriority(Bundle bundle)
	{
		if(bundle == null || !bundle.containsKey("p"))
			break MISSING_BLOCK_LABEL_80;
	//    0    0:aload_0         
	//    1    1:ifnull          80
	//    2    4:aload_0         
	//    3    5:ldc1            #199 <String "p">
	//    4    7:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//    5   10:ifeq            80
		int i = Integer.parseInt(bundle.getString("p"));
	//    6   13:aload_0         
	//    7   14:ldc1            #199 <String "p">
	//    8   16:invokevirtual   #170 <Method String Bundle.getString(String)>
	//    9   19:invokestatic    #176 <Method int Integer.parseInt(String)>
	//   10   22:istore_1        
		if(isValidNotificationPriority(i))
	//*  11   23:iload_1         
	//*  12   24:invokestatic    #203 <Method boolean isValidNotificationPriority(int)>
	//*  13   27:ifeq            32
			return i;
	//   14   30:iload_1         
	//   15   31:ireturn         
		try
		{
			bundle = ((Bundle) (TAG));
	//   16   32:getstatic       #28  <Field String TAG>
	//   17   35:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #48  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #49  <Method void StringBuilder()>
	//   21   43:astore_2        
			stringbuilder.append("Received invalid notification priority ");
	//   22   44:aload_2         
	//   23   45:ldc1            #205 <String "Received invalid notification priority ">
	//   24   47:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			stringbuilder.append(i);
	//   26   51:aload_2         
	//   27   52:iload_1         
	//   28   53:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   29   56:pop             
			AppboyLogger.e(((String) (bundle)), stringbuilder.toString());
	//   30   57:aload_0         
	//   31   58:aload_2         
	//   32   59:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   33   62:invokestatic    #207 <Method int AppboyLogger.e(String, String)>
	//   34   65:pop             
		}
	//*  35   66:goto            80
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  36   69:astore_0        
		{
			AppboyLogger.e(TAG, "Unable to parse custom priority. Returning default priority of 0", ((Throwable) (bundle)));
	//   37   70:getstatic       #28  <Field String TAG>
	//   38   73:ldc1            #209 <String "Unable to parse custom priority. Returning default priority of 0">
	//   39   75:aload_0         
	//   40   76:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   41   79:pop             
		}
		return 0;
	//   42   80:iconst_0        
	//   43   81:ireturn         
	}

	public static Class getNotificationReceiverClass()
	{
		if(Constants.IS_AMAZON.booleanValue())
	//*   0    0:getstatic       #135 <Field Boolean Constants.IS_AMAZON>
	//*   1    3:invokevirtual   #141 <Method boolean Boolean.booleanValue()>
	//*   2    6:ifeq            12
			return com/appboy/AppboyAdmReceiver;
	//    3    9:ldc1            #211 <Class AppboyAdmReceiver>
	//    4   11:areturn         
		else
			return com/appboy/AppboyGcmReceiver;
	//    5   12:ldc1            #213 <Class AppboyGcmReceiver>
	//    6   14:areturn         
	}

	static String getOptionalStringResource(Resources resources, int i, String s)
	{
		try
		{
			resources = ((Resources) (resources.getString(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #224 <Method String Resources.getString(int)>
	//    3    5:astore_0        
		}
	//*   4    6:aload_0         
	//*   5    7:areturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*   6    8:astore_0        
		{
			return s;
	//    7    9:aload_2         
	//    8   10:areturn         
		}
		return ((String) (resources));
	}

	private static PendingIntent getPushActionPendingIntent(Context context, String s, Bundle bundle)
	{
		s = ((String) ((new Intent(s)).setClass(context, getNotificationReceiverClass())));
	//    0    0:new             #68  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #73  <Method void Intent(String)>
	//    4    8:aload_0         
	//    5    9:invokestatic    #77  <Method Class getNotificationReceiverClass()>
	//    6   12:invokevirtual   #81  <Method Intent Intent.setClass(Context, Class)>
	//    7   15:astore_1        
		if(bundle != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          26
			((Intent) (s)).putExtras(bundle);
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #230 <Method Intent Intent.putExtras(Bundle)>
	//   13   25:pop             
		return PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), ((Intent) (s)), 0x40000000);
	//   14   26:aload_0         
	//   15   27:invokestatic    #233 <Method int IntentUtils.getRequestCode()>
	//   16   30:aload_1         
	//   17   31:ldc1            #234 <Int 0x40000000>
	//   18   33:invokestatic    #240 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   19   36:areturn         
	}

	static NotificationChannel getValidNotificationChannel(NotificationManager notificationmanager, Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.d(TAG, "Notification extras bundle was null. Could not find a valid notification channel");
	//    2    4:getstatic       #28  <Field String TAG>
	//    3    7:ldc1            #244 <String "Notification extras bundle was null. Could not find a valid notification channel">
	//    4    9:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		bundle = ((Bundle) (bundle.getString("ab_nc", ((String) (null)))));
	//    8   15:aload_1         
	//    9   16:ldc1            #246 <String "ab_nc">
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #41  <Method String Bundle.getString(String, String)>
	//   12   22:astore_1        
		if(!StringUtils.isNullOrBlank(((String) (bundle))))
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #251 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  15   27:ifne            112
		{
			Object obj = ((Object) (notificationmanager.getNotificationChannel(((String) (bundle)))));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #257 <Method NotificationChannel NotificationManager.getNotificationChannel(String)>
	//   19   35:astore_2        
			if(obj != null)
	//*  20   36:aload_2         
	//*  21   37:ifnull          77
			{
				notificationmanager = ((NotificationManager) (TAG));
	//   22   40:getstatic       #28  <Field String TAG>
	//   23   43:astore_0        
				StringBuilder stringbuilder = new StringBuilder();
	//   24   44:new             #48  <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #49  <Method void StringBuilder()>
	//   27   51:astore_3        
				stringbuilder.append("Found notification channel in extras with id: ");
	//   28   52:aload_3         
	//   29   53:ldc2            #259 <String "Found notification channel in extras with id: ">
	//   30   56:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
				stringbuilder.append(((String) (bundle)));
	//   32   60:aload_3         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
				AppboyLogger.d(((String) (notificationmanager)), stringbuilder.toString());
	//   36   66:aload_0         
	//   37   67:aload_3         
	//   38   68:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   39   71:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   40   74:pop             
				return ((NotificationChannel) (obj));
	//   41   75:aload_2         
	//   42   76:areturn         
			}
			obj = ((Object) (TAG));
	//   43   77:getstatic       #28  <Field String TAG>
	//   44   80:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   45   81:new             #48  <Class StringBuilder>
	//   46   84:dup             
	//   47   85:invokespecial   #49  <Method void StringBuilder()>
	//   48   88:astore_3        
			stringbuilder1.append("Notification channel from extras is invalid, no channel found with id: ");
	//   49   89:aload_3         
	//   50   90:ldc2            #261 <String "Notification channel from extras is invalid, no channel found with id: ">
	//   51   93:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   52   96:pop             
			stringbuilder1.append(((String) (bundle)));
	//   53   97:aload_3         
	//   54   98:aload_1         
	//   55   99:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   56  102:pop             
			AppboyLogger.d(((String) (obj)), stringbuilder1.toString());
	//   57  103:aload_2         
	//   58  104:aload_3         
	//   59  105:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   60  108:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   61  111:pop             
		}
		notificationmanager = ((NotificationManager) (notificationmanager.getNotificationChannel("com_appboy_default_notification_channel")));
	//   62  112:aload_0         
	//   63  113:ldc2            #263 <String "com_appboy_default_notification_channel">
	//   64  116:invokevirtual   #257 <Method NotificationChannel NotificationManager.getNotificationChannel(String)>
	//   65  119:astore_0        
		if(notificationmanager != null)
	//*  66  120:aload_0         
	//*  67  121:ifnull          126
		{
			return ((NotificationChannel) (notificationmanager));
	//   68  124:aload_0         
	//   69  125:areturn         
		} else
		{
			AppboyLogger.d(TAG, "Appboy default notification channel does not exist on device.");
	//   70  126:getstatic       #28  <Field String TAG>
	//   71  129:ldc2            #265 <String "Appboy default notification channel does not exist on device.">
	//   72  132:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   73  135:pop             
			return null;
	//   74  136:aconst_null     
	//   75  137:areturn         
		}
	}

	public static void handleCancelNotificationAction(Context context, Intent intent)
	{
		try
		{
			if(intent.hasExtra("nid"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #83  <String "nid">
	//*   2    3:invokevirtual   #269 <Method boolean Intent.hasExtra(String)>
	//*   3    6:ifeq            81
			{
				int i = intent.getIntExtra("nid", -1);
	//    4    9:aload_1         
	//    5   10:ldc1            #83  <String "nid">
	//    6   12:iconst_m1       
	//    7   13:invokevirtual   #273 <Method int Intent.getIntExtra(String, int)>
	//    8   16:istore_2        
				intent = ((Intent) (TAG));
	//    9   17:getstatic       #28  <Field String TAG>
	//   10   20:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #48  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #49  <Method void StringBuilder()>
	//   14   28:astore_3        
				stringbuilder.append("Cancelling notification action with id: ");
	//   15   29:aload_3         
	//   16   30:ldc1            #51  <String "Cancelling notification action with id: ">
	//   17   32:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
				stringbuilder.append(i);
	//   19   36:aload_3         
	//   20   37:iload_2         
	//   21   38:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   22   41:pop             
				AppboyLogger.d(((String) (intent)), stringbuilder.toString());
	//   23   42:aload_1         
	//   24   43:aload_3         
	//   25   44:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   26   47:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   27   50:pop             
				((NotificationManager)context.getSystemService("notification")).cancel("appboy_notification", i);
	//   28   51:aload_0         
	//   29   52:ldc2            #275 <String "notification">
	//   30   55:invokevirtual   #281 <Method Object Context.getSystemService(String)>
	//   31   58:checkcast       #253 <Class NotificationManager>
	//   32   61:ldc2            #283 <String "appboy_notification">
	//   33   64:iload_2         
	//   34   65:invokevirtual   #287 <Method void NotificationManager.cancel(String, int)>
				return;
	//   35   68:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   69:astore_0        
		{
			AppboyLogger.e(TAG, "Exception occurred handling cancel notification intent.", ((Throwable) (context)));
	//   37   70:getstatic       #28  <Field String TAG>
	//   38   73:ldc2            #289 <String "Exception occurred handling cancel notification intent.">
	//   39   76:aload_0         
	//   40   77:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   41   80:pop             
		}
	//   42   81:return          
	}

	public static void handleNotificationDeleted(Context context, Intent intent)
	{
		try
		{
			AppboyLogger.d(TAG, "Sending notification deleted broadcast");
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:ldc2            #292 <String "Sending notification deleted broadcast">
	//    2    6:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
			sendPushActionIntent(context, ".intent.APPBOY_PUSH_DELETED", intent.getExtras());
	//    4   10:aload_0         
	//    5   11:ldc1            #8   <String ".intent.APPBOY_PUSH_DELETED">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #296 <Method Bundle Intent.getExtras()>
	//    8   17:invokestatic    #300 <Method void sendPushActionIntent(Context, String, Bundle)>
			return;
	//    9   20:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   21:astore_0        
		{
			AppboyLogger.e(TAG, "Exception occurred attempting to handle notification delete intent.", ((Throwable) (context)));
	//   11   22:getstatic       #28  <Field String TAG>
	//   12   25:ldc2            #302 <String "Exception occurred attempting to handle notification delete intent.">
	//   13   28:aload_0         
	//   14   29:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   15   32:pop             
		}
	//   16   33:return          
	}

	public static void handleNotificationOpened(Context context, Intent intent)
	{
		try
		{
			logNotificationOpened(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #306 <Method void logNotificationOpened(Context, Intent)>
			sendNotificationOpenedBroadcast(context, intent);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #309 <Method void sendNotificationOpenedBroadcast(Context, Intent)>
			if((new AppboyConfigurationProvider(context)).getHandlePushDeepLinksAutomatically())
	//*   6   10:new             #311 <Class AppboyConfigurationProvider>
	//*   7   13:dup             
	//*   8   14:aload_0         
	//*   9   15:invokespecial   #314 <Method void AppboyConfigurationProvider(Context)>
	//*  10   18:invokevirtual   #317 <Method boolean AppboyConfigurationProvider.getHandlePushDeepLinksAutomatically()>
	//*  11   21:ifeq            42
			{
				routeUserWithNotificationOpenedIntent(context, intent);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokestatic    #320 <Method void routeUserWithNotificationOpenedIntent(Context, Intent)>
				return;
	//   15   29:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  16   30:astore_0        
		{
			AppboyLogger.e(TAG, "Exception occurred attempting to handle notification opened intent.", ((Throwable) (context)));
	//   17   31:getstatic       #28  <Field String TAG>
	//   18   34:ldc2            #322 <String "Exception occurred attempting to handle notification opened intent.">
	//   19   37:aload_0         
	//   20   38:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   21   41:pop             
		}
	//   22   42:return          
	}

	public static void handlePushStoryPageClicked(Context context, Intent intent)
	{
		Appboy.getInstance(context).logPushStoryPageClicked(intent.getStringExtra("appboy_campaign_id"), intent.getStringExtra("appboy_story_page_id"));
	//    0    0:aload_0         
	//    1    1:invokestatic    #326 <Method Appboy Appboy.getInstance(Context)>
	//    2    4:aload_1         
	//    3    5:ldc2            #328 <String "appboy_campaign_id">
	//    4    8:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//    5   11:aload_1         
	//    6   12:ldc2            #333 <String "appboy_story_page_id">
	//    7   15:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//    8   18:invokevirtual   #337 <Method void Appboy.logPushStoryPageClicked(String, String)>
		if(!StringUtils.isNullOrBlank(intent.getStringExtra("appboy_action_uri")))
	//*   9   21:aload_1         
	//*  10   22:ldc2            #339 <String "appboy_action_uri">
	//*  11   25:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//*  12   28:invokestatic    #251 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  13   31:ifne            76
		{
			intent.putExtra("uri", intent.getStringExtra("appboy_action_uri"));
	//   14   34:aload_1         
	//   15   35:ldc2            #341 <String "uri">
	//   16   38:aload_1         
	//   17   39:ldc2            #339 <String "appboy_action_uri">
	//   18   42:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//   19   45:invokevirtual   #344 <Method Intent Intent.putExtra(String, String)>
	//   20   48:pop             
			String s = intent.getStringExtra("appboy_action_use_webview");
	//   21   49:aload_1         
	//   22   50:ldc2            #346 <String "appboy_action_use_webview">
	//   23   53:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//   24   56:astore_2        
			if(!StringUtils.isNullOrBlank(s))
	//*  25   57:aload_2         
	//*  26   58:invokestatic    #251 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  27   61:ifne            83
				intent.putExtra("ab_use_webview", s);
	//   28   64:aload_1         
	//   29   65:ldc2            #348 <String "ab_use_webview">
	//   30   68:aload_2         
	//   31   69:invokevirtual   #344 <Method Intent Intent.putExtra(String, String)>
	//   32   72:pop             
			break MISSING_BLOCK_LABEL_83;
	//   33   73:goto            83
		}
		intent.removeExtra("uri");
	//   34   76:aload_1         
	//   35   77:ldc2            #341 <String "uri">
	//   36   80:invokevirtual   #351 <Method void Intent.removeExtra(String)>
		context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
	//   37   83:aload_0         
	//   38   84:new             #68  <Class Intent>
	//   39   87:dup             
	//   40   88:ldc2            #353 <String "android.intent.action.CLOSE_SYSTEM_DIALOGS">
	//   41   91:invokespecial   #73  <Method void Intent(String)>
	//   42   94:invokevirtual   #357 <Method void Context.sendBroadcast(Intent)>
		sendNotificationOpenedBroadcast(context, intent);
	//   43   97:aload_0         
	//   44   98:aload_1         
	//   45   99:invokestatic    #309 <Method void sendNotificationOpenedBroadcast(Context, Intent)>
		if((new AppboyConfigurationProvider(context)).getHandlePushDeepLinksAutomatically())
	//*  46  102:new             #311 <Class AppboyConfigurationProvider>
	//*  47  105:dup             
	//*  48  106:aload_0         
	//*  49  107:invokespecial   #314 <Method void AppboyConfigurationProvider(Context)>
	//*  50  110:invokevirtual   #317 <Method boolean AppboyConfigurationProvider.getHandlePushDeepLinksAutomatically()>
	//*  51  113:ifeq            134
		{
			routeUserWithNotificationOpenedIntent(context, intent);
	//   52  116:aload_0         
	//   53  117:aload_1         
	//   54  118:invokestatic    #320 <Method void routeUserWithNotificationOpenedIntent(Context, Intent)>
			return;
	//   55  121:return          
		}
		break MISSING_BLOCK_LABEL_134;
		context;
	//   56  122:astore_0        
		AppboyLogger.e(TAG, "Caught exception while handling story click.", ((Throwable) (context)));
	//   57  123:getstatic       #28  <Field String TAG>
	//   58  126:ldc2            #359 <String "Caught exception while handling story click.">
	//   59  129:aload_0         
	//   60  130:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   61  133:pop             
	//   62  134:return          
	}

	public static boolean isAppboyPushMessage(Intent intent)
	{
		intent = ((Intent) (intent.getExtras()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #296 <Method Bundle Intent.getExtras()>
	//    2    4:astore_0        
		return intent != null && "true".equals(((Object) (((Bundle) (intent)).getString("_ab"))));
	//    3    5:aload_0         
	//    4    6:ifnull          27
	//    5    9:ldc2            #363 <String "true">
	//    6   12:aload_0         
	//    7   13:ldc2            #365 <String "_ab">
	//    8   16:invokevirtual   #170 <Method String Bundle.getString(String)>
	//    9   19:invokevirtual   #369 <Method boolean String.equals(Object)>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public static boolean isNotificationMessage(Intent intent)
	{
		intent = ((Intent) (intent.getExtras()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #296 <Method Bundle Intent.getExtras()>
	//    2    4:astore_0        
		return intent != null && ((Bundle) (intent)).containsKey("t") && ((Bundle) (intent)).containsKey("a");
	//    3    5:aload_0         
	//    4    6:ifnull          29
	//    5    9:aload_0         
	//    6   10:ldc1            #182 <String "t">
	//    7   12:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//    8   15:ifeq            29
	//    9   18:aload_0         
	//   10   19:ldc1            #186 <String "a">
	//   11   21:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//   12   24:ifeq            29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public static boolean isUninstallTrackingPush(Bundle bundle)
	{
		AppboyLogger.w(TAG, "Uninstall tracking no longer sends a silent push notification to devices. This method should not be used. Returning false.");
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:ldc2            #374 <String "Uninstall tracking no longer sends a silent push notification to devices. This method should not be used. Returning false.">
	//    2    6:invokestatic    #377 <Method int AppboyLogger.w(String, String)>
	//    3    9:pop             
		return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
	}

	public static boolean isValidNotificationPriority(int i)
	{
		return i >= -2 && i <= 2;
	//    0    0:iload_0         
	//    1    1:bipush          -2
	//    2    3:icmplt          13
	//    3    6:iload_0         
	//    4    7:iconst_2        
	//    5    8:icmpgt          13
	//    6   11:iconst_1        
	//    7   12:ireturn         
	//    8   13:iconst_0        
	//    9   14:ireturn         
	}

	public static boolean isValidNotificationVisibility(int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		boolean flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		if(i != -1)
	//*   4    4:iload_0         
	//*   5    5:iconst_m1       
	//*   6    6:icmpeq          24
		{
			flag = flag1;
	//    7    9:iload_2         
	//    8   10:istore_1        
			if(i != 0)
	//*   9   11:iload_0         
	//*  10   12:ifeq            24
			{
				if(i == 1)
	//*  11   15:iload_0         
	//*  12   16:iconst_1        
	//*  13   17:icmpne          22
					return true;
	//   14   20:iconst_1        
	//   15   21:ireturn         
				flag = false;
	//   16   22:iconst_0        
	//   17   23:istore_1        
			}
		}
		return flag;
	//   18   24:iload_1         
	//   19   25:ireturn         
	}

	public static void logBaiduNotificationClick(Context context, String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(TAG, "customContentString was null. Doing nothing.");
	//    2    4:getstatic       #28  <Field String TAG>
	//    3    7:ldc2            #383 <String "customContentString was null. Doing nothing.">
	//    4   10:invokestatic    #377 <Method int AppboyLogger.w(String, String)>
	//    5   13:pop             
			return;
	//    6   14:return          
		}
		String s1;
		Object obj;
		obj = ((Object) (new JSONObject(s)));
	//    7   15:new             #385 <Class JSONObject>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #386 <Method void JSONObject(String)>
	//   11   23:astore_3        
		s1 = ((JSONObject) (obj)).optString("source", ((String) (null)));
	//   12   24:aload_3         
	//   13   25:ldc1            #17  <String "source">
	//   14   27:aconst_null     
	//   15   28:invokevirtual   #389 <Method String JSONObject.optString(String, String)>
	//   16   31:astore_2        
		obj = ((Object) (((JSONObject) (obj)).optString("cid", ((String) (null)))));
	//   17   32:aload_3         
	//   18   33:ldc2            #391 <String "cid">
	//   19   36:aconst_null     
	//   20   37:invokevirtual   #389 <Method String JSONObject.optString(String, String)>
	//   21   40:astore_3        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_105;
	//   22   41:aload_2         
	//   23   42:ifnull          105
		if("Appboy".equals(((Object) (s1))) && obj != null)
	//*  24   45:ldc2            #393 <String "Appboy">
	//*  25   48:aload_2         
	//*  26   49:invokevirtual   #369 <Method boolean String.equals(Object)>
	//*  27   52:ifeq            105
	//*  28   55:aload_3         
	//*  29   56:ifnull          105
		{
			String s2;
			try
			{
				Appboy.getInstance(context).logPushNotificationOpened(((String) (obj)));
	//   30   59:aload_0         
	//   31   60:invokestatic    #326 <Method Appboy Appboy.getInstance(Context)>
	//   32   63:aload_3         
	//   33   64:invokevirtual   #396 <Method void Appboy.logPushNotificationOpened(String)>
				return;
	//   34   67:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  35   68:astore_0        
			{
				s2 = TAG;
	//   36   69:getstatic       #28  <Field String TAG>
	//   37   72:astore_2        
			}
			obj = ((Object) (new StringBuilder()));
	//   38   73:new             #48  <Class StringBuilder>
	//   39   76:dup             
	//   40   77:invokespecial   #49  <Method void StringBuilder()>
	//   41   80:astore_3        
			((StringBuilder) (obj)).append("Caught an exception processing customContentString: ");
	//   42   81:aload_3         
	//   43   82:ldc2            #398 <String "Caught an exception processing customContentString: ">
	//   44   85:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   45   88:pop             
			((StringBuilder) (obj)).append(s);
	//   46   89:aload_3         
	//   47   90:aload_1         
	//   48   91:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
			AppboyLogger.e(s2, ((StringBuilder) (obj)).toString(), ((Throwable) (context)));
	//   50   95:aload_2         
	//   51   96:aload_3         
	//   52   97:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   53  100:aload_0         
	//   54  101:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   55  104:pop             
		}
	//   56  105:return          
	}

	private static void logNotificationOpened(Context context, Intent intent)
	{
		Appboy.getInstance(context).logPushNotificationOpened(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #326 <Method Appboy Appboy.getInstance(Context)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #400 <Method void Appboy.logPushNotificationOpened(Intent)>
	//    4    8:return          
	}

	public static void logPushDeliveryEvent(Context context, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          64
		{
			String s = bundle.getString("cid");
	//    2    4:aload_1         
	//    3    5:ldc2            #391 <String "cid">
	//    4    8:invokevirtual   #170 <Method String Bundle.getString(String)>
	//    5   11:astore_2        
			if(!StringUtils.isNullOrBlank(s))
	//*   6   12:aload_2         
	//*   7   13:invokestatic    #251 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   16:ifne            28
			{
				Appboy.getInstance(context).logPushDeliveryEvent(s);
	//    9   19:aload_0         
	//   10   20:invokestatic    #326 <Method Appboy Appboy.getInstance(Context)>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #404 <Method void Appboy.logPushDeliveryEvent(String)>
				return;
	//   13   27:return          
			} else
			{
				context = ((Context) (TAG));
	//   14   28:getstatic       #28  <Field String TAG>
	//   15   31:astore_0        
				StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #48  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #49  <Method void StringBuilder()>
	//   19   39:astore_2        
				stringbuilder.append("Could not log push delivery event due to null or blank campaign id in push extras bundle: ");
	//   20   40:aload_2         
	//   21   41:ldc2            #406 <String "Could not log push delivery event due to null or blank campaign id in push extras bundle: ">
	//   22   44:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				stringbuilder.append(((Object) (bundle)));
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #409 <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
				AppboyLogger.d(((String) (context)), stringbuilder.toString());
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   31   59:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   32   62:pop             
				return;
	//   33   63:return          
			}
		} else
		{
			AppboyLogger.d(TAG, "Could not log push delivery event due to null push extras bundle.");
	//   34   64:getstatic       #28  <Field String TAG>
	//   35   67:ldc2            #411 <String "Could not log push delivery event due to null push extras bundle.">
	//   36   70:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   37   73:pop             
			return;
	//   38   74:return          
		}
	}

	public static Bundle parseJSONStringDictionaryIntoBundle(String s)
	{
		Bundle bundle;
		try
		{
			bundle = new Bundle();
	//    0    0:new             #37  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #414 <Method void Bundle()>
	//    3    7:astore_1        
			s = ((String) (new JSONObject(s)));
	//    4    8:new             #385 <Class JSONObject>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #386 <Method void JSONObject(String)>
	//    8   16:astore_0        
			String s1;
			for(Iterator iterator = ((JSONObject) (s)).keys(); iterator.hasNext(); bundle.putString(s1, ((JSONObject) (s)).getString(s1)))
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #418 <Method Iterator JSONObject.keys()>
	//*  11   21:astore_2        
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #423 <Method boolean Iterator.hasNext()>
	//*  14   28:ifeq            54
				s1 = (String)iterator.next();
	//   15   31:aload_2         
	//   16   32:invokeinterface #427 <Method Object Iterator.next()>
	//   17   37:checkcast       #188 <Class String>
	//   18   40:astore_3        

	//   19   41:aload_1         
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokevirtual   #428 <Method String JSONObject.getString(String)>
	//   24   48:invokevirtual   #431 <Method void Bundle.putString(String, String)>
		}
	//*  25   51:goto            22
	//*  26   54:aload_1         
	//*  27   55:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  28   56:astore_0        
		{
			AppboyLogger.e(TAG, "Unable parse JSON into a bundle.", ((Throwable) (s)));
	//   29   57:getstatic       #28  <Field String TAG>
	//   30   60:ldc2            #433 <String "Unable parse JSON into a bundle.">
	//   31   63:aload_0         
	//   32   64:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   33   67:pop             
			return null;
	//   34   68:aconst_null     
	//   35   69:areturn         
		}
		return bundle;
	}

	public static void prefetchBitmapsIfNewlyReceivedStoryPush(Context context, Bundle bundle)
	{
		if(!bundle.containsKey("ab_c"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #436 <String "ab_c">
	//*   2    4:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(bundle.getBoolean("appboy_story_newly_received", false))
	//*   5   11:aload_1         
	//*   6   12:ldc1            #116 <String "appboy_story_newly_received">
	//*   7   14:iconst_0        
	//*   8   15:invokevirtual   #439 <Method boolean Bundle.getBoolean(String, boolean)>
	//*   9   18:ifeq            121
		{
			String s = AppboyNotificationActionUtils.getActionFieldAtIndex(0, bundle, "ab_c*_i");
	//   10   21:iconst_0        
	//   11   22:aload_1         
	//   12   23:ldc2            #441 <String "ab_c*_i">
	//   13   26:invokestatic    #447 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String)>
	//   14   29:astore_3        
			int i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_2        
			for(; !StringUtils.isNullOrBlank(s); s = AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_i"))
	//*  17   32:aload_3         
	//*  18   33:invokestatic    #251 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  19   36:ifne            114
			{
				String s1 = TAG;
	//   20   39:getstatic       #28  <Field String TAG>
	//   21   42:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   22   44:new             #48  <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #49  <Method void StringBuilder()>
	//   25   51:astore          5
				stringbuilder.append("Pre-fetching bitmap at URL: ");
	//   26   53:aload           5
	//   27   55:ldc2            #449 <String "Pre-fetching bitmap at URL: ">
	//   28   58:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
				stringbuilder.append(s);
	//   30   62:aload           5
	//   31   64:aload_3         
	//   32   65:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
				AppboyLogger.v(s1, stringbuilder.toString());
	//   34   69:aload           4
	//   35   71:aload           5
	//   36   73:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   37   76:invokestatic    #452 <Method int AppboyLogger.v(String, String)>
	//   38   79:pop             
				Appboy.getInstance(context).getAppboyImageLoader().getBitmapFromUrl(context, s, AppboyViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
	//   39   80:aload_0         
	//   40   81:invokestatic    #326 <Method Appboy Appboy.getInstance(Context)>
	//   41   84:invokevirtual   #456 <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   42   87:aload_0         
	//   43   88:aload_3         
	//   44   89:getstatic       #462 <Field AppboyViewBounds AppboyViewBounds.NOTIFICATION_ONE_IMAGE_STORY>
	//   45   92:invokeinterface #468 <Method android.graphics.Bitmap IAppboyImageLoader.getBitmapFromUrl(Context, String, AppboyViewBounds)>
	//   46   97:pop             
				i++;
	//   47   98:iload_2         
	//   48   99:iconst_1        
	//   49  100:iadd            
	//   50  101:istore_2        
			}

	//   51  102:iload_2         
	//   52  103:aload_1         
	//   53  104:ldc2            #441 <String "ab_c*_i">
	//   54  107:invokestatic    #447 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String)>
	//   55  110:astore_3        
	//*  56  111:goto            32
			bundle.putBoolean("appboy_story_newly_received", false);
	//   57  114:aload_1         
	//   58  115:ldc1            #116 <String "appboy_story_newly_received">
	//   59  117:iconst_0        
	//   60  118:invokevirtual   #472 <Method void Bundle.putBoolean(String, boolean)>
		}
	//   61  121:return          
	}

	public static boolean requestGeofenceRefreshIfAppropriate(Context context, Bundle bundle)
	{
		if(bundle.containsKey("ab_sync_geos"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #476 <String "ab_sync_geos">
	//*   2    4:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   3    7:ifeq            43
		{
			if(Boolean.parseBoolean(bundle.getString("ab_sync_geos")))
	//*   4   10:aload_1         
	//*   5   11:ldc2            #476 <String "ab_sync_geos">
	//*   6   14:invokevirtual   #170 <Method String Bundle.getString(String)>
	//*   7   17:invokestatic    #479 <Method boolean Boolean.parseBoolean(String)>
	//*   8   20:ifeq            30
			{
				AppboyInternal.requestGeofenceRefresh(context, true);
	//    9   23:aload_0         
	//   10   24:iconst_1        
	//   11   25:invokestatic    #485 <Method void AppboyInternal.requestGeofenceRefresh(Context, boolean)>
				return true;
	//   12   28:iconst_1        
	//   13   29:ireturn         
			}
			AppboyLogger.d(TAG, "Geofence sync key was false. Not syncing geofences.");
	//   14   30:getstatic       #28  <Field String TAG>
	//   15   33:ldc2            #487 <String "Geofence sync key was false. Not syncing geofences.">
	//   16   36:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   17   39:pop             
		} else
	//*  18   40:goto            53
		{
			AppboyLogger.d(TAG, "Geofence sync key not included in push payload. Not syncing geofences.");
	//   19   43:getstatic       #28  <Field String TAG>
	//   20   46:ldc2            #489 <String "Geofence sync key not included in push payload. Not syncing geofences.">
	//   21   49:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   22   52:pop             
		}
		return false;
	//   23   53:iconst_0        
	//   24   54:ireturn         
	}

	public static void routeUserWithNotificationOpenedIntent(Context context, Intent intent)
	{
		Object obj = ((Object) (intent.getBundleExtra("extra")));
	//    0    0:aload_1         
	//    1    1:ldc1            #125 <String "extra">
	//    2    3:invokevirtual   #492 <Method Bundle Intent.getBundleExtra(String)>
	//    3    6:astore          4
		Bundle bundle = ((Bundle) (obj));
	//    4    8:aload           4
	//    5   10:astore_3        
		if(obj == null)
	//*   6   11:aload           4
	//*   7   13:ifnonnull       24
			bundle = new Bundle();
	//    8   16:new             #37  <Class Bundle>
	//    9   19:dup             
	//   10   20:invokespecial   #414 <Method void Bundle()>
	//   11   23:astore_3        
		bundle.putString("cid", intent.getStringExtra("cid"));
	//   12   24:aload_3         
	//   13   25:ldc2            #391 <String "cid">
	//   14   28:aload_1         
	//   15   29:ldc2            #391 <String "cid">
	//   16   32:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//   17   35:invokevirtual   #431 <Method void Bundle.putString(String, String)>
		bundle.putString("source", "Appboy");
	//   18   38:aload_3         
	//   19   39:ldc1            #17  <String "source">
	//   20   41:ldc2            #393 <String "Appboy">
	//   21   44:invokevirtual   #431 <Method void Bundle.putString(String, String)>
		obj = ((Object) (intent.getStringExtra("uri")));
	//   22   47:aload_1         
	//   23   48:ldc2            #341 <String "uri">
	//   24   51:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//   25   54:astore          4
		if(!StringUtils.isNullOrBlank(((String) (obj))))
	//*  26   56:aload           4
	//*  27   58:invokestatic    #251 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  28   61:ifne            198
		{
			Object obj1 = ((Object) (TAG));
	//   29   64:getstatic       #28  <Field String TAG>
	//   30   67:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   31   69:new             #48  <Class StringBuilder>
	//   32   72:dup             
	//   33   73:invokespecial   #49  <Method void StringBuilder()>
	//   34   76:astore          6
			stringbuilder.append("Found a deep link ");
	//   35   78:aload           6
	//   36   80:ldc2            #494 <String "Found a deep link ">
	//   37   83:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   38   86:pop             
			stringbuilder.append(((String) (obj)));
	//   39   87:aload           6
	//   40   89:aload           4
	//   41   91:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   42   94:pop             
			Log.d(((String) (obj1)), stringbuilder.toString());
	//   43   95:aload           5
	//   44   97:aload           6
	//   45   99:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   46  102:invokestatic    #497 <Method int Log.d(String, String)>
	//   47  105:pop             
			boolean flag = "true".equalsIgnoreCase(intent.getStringExtra("ab_use_webview"));
	//   48  106:ldc2            #363 <String "true">
	//   49  109:aload_1         
	//   50  110:ldc2            #348 <String "ab_use_webview">
	//   51  113:invokevirtual   #331 <Method String Intent.getStringExtra(String)>
	//   52  116:invokevirtual   #500 <Method boolean String.equalsIgnoreCase(String)>
	//   53  119:istore_2        
			intent = ((Intent) (TAG));
	//   54  120:getstatic       #28  <Field String TAG>
	//   55  123:astore_1        
			obj1 = ((Object) (new StringBuilder()));
	//   56  124:new             #48  <Class StringBuilder>
	//   57  127:dup             
	//   58  128:invokespecial   #49  <Method void StringBuilder()>
	//   59  131:astore          5
			((StringBuilder) (obj1)).append("Use webview set to: ");
	//   60  133:aload           5
	//   61  135:ldc2            #502 <String "Use webview set to: ">
	//   62  138:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   63  141:pop             
			((StringBuilder) (obj1)).append(flag);
	//   64  142:aload           5
	//   65  144:iload_2         
	//   66  145:invokevirtual   #505 <Method StringBuilder StringBuilder.append(boolean)>
	//   67  148:pop             
			Log.d(((String) (intent)), ((StringBuilder) (obj1)).toString());
	//   68  149:aload_1         
	//   69  150:aload           5
	//   70  152:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   71  155:invokestatic    #497 <Method int Log.d(String, String)>
	//   72  158:pop             
			bundle.putString("uri", ((String) (obj)));
	//   73  159:aload_3         
	//   74  160:ldc2            #341 <String "uri">
	//   75  163:aload           4
	//   76  165:invokevirtual   #431 <Method void Bundle.putString(String, String)>
			bundle.putBoolean("ab_use_webview", flag);
	//   77  168:aload_3         
	//   78  169:ldc2            #348 <String "ab_use_webview">
	//   79  172:iload_2         
	//   80  173:invokevirtual   #472 <Method void Bundle.putBoolean(String, boolean)>
			intent = ((Intent) (ActionFactory.createUriActionFromUrlString(((String) (obj)), bundle, flag, Channel.PUSH)));
	//   81  176:aload           4
	//   82  178:aload_3         
	//   83  179:iload_2         
	//   84  180:getstatic       #511 <Field Channel Channel.PUSH>
	//   85  183:invokestatic    #517 <Method com.appboy.ui.actions.UriAction ActionFactory.createUriActionFromUrlString(String, Bundle, boolean, Channel)>
	//   86  186:astore_1        
			AppboyNavigator.getAppboyNavigator().gotoUri(context, ((com.appboy.ui.actions.UriAction) (intent)));
	//   87  187:invokestatic    #523 <Method IAppboyNavigator AppboyNavigator.getAppboyNavigator()>
	//   88  190:aload_0         
	//   89  191:aload_1         
	//   90  192:invokeinterface #529 <Method void IAppboyNavigator.gotoUri(Context, com.appboy.ui.actions.UriAction)>
			return;
	//   91  197:return          
		} else
		{
			Log.d(TAG, "Push notification had no deep link. Opening main activity.");
	//   92  198:getstatic       #28  <Field String TAG>
	//   93  201:ldc2            #531 <String "Push notification had no deep link. Opening main activity.">
	//   94  204:invokestatic    #497 <Method int Log.d(String, String)>
	//   95  207:pop             
			context.startActivity(UriUtils.getMainActivityIntent(context, bundle));
	//   96  208:aload_0         
	//   97  209:aload_0         
	//   98  210:aload_3         
	//   99  211:invokestatic    #537 <Method Intent UriUtils.getMainActivityIntent(Context, Bundle)>
	//  100  214:invokevirtual   #540 <Method void Context.startActivity(Intent)>
			return;
	//  101  217:return          
		}
	}

	static void sendNotificationOpenedBroadcast(Context context, Intent intent)
	{
		AppboyLogger.d(TAG, "Sending notification opened broadcast");
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:ldc2            #542 <String "Sending notification opened broadcast">
	//    2    6:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		sendPushActionIntent(context, ".intent.APPBOY_NOTIFICATION_OPENED", intent.getExtras());
	//    4   10:aload_0         
	//    5   11:ldc1            #11  <String ".intent.APPBOY_NOTIFICATION_OPENED">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #296 <Method Bundle Intent.getExtras()>
	//    8   17:invokestatic    #300 <Method void sendPushActionIntent(Context, String, Bundle)>
	//    9   20:return          
	}

	private static void sendPushActionIntent(Context context, String s, Bundle bundle)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #48  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(context.getPackageName());
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #545 <Method String Context.getPackageName()>
	//    7   13:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(s);
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		s = ((String) (new Intent(stringbuilder.toString())));
	//   13   23:new             #68  <Class Intent>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   17   31:invokespecial   #73  <Method void Intent(String)>
	//   18   34:astore_1        
		if(bundle != null)
	//*  19   35:aload_2         
	//*  20   36:ifnull          45
			((Intent) (s)).putExtras(bundle);
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #230 <Method Intent Intent.putExtras(Bundle)>
	//   24   44:pop             
		IntentUtils.addComponentAndSendBroadcast(context, ((Intent) (s)));
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:invokestatic    #93  <Method void IntentUtils.addComponentAndSendBroadcast(Context, Intent)>
	//   28   50:return          
	}

	public static void sendPushMessageReceivedBroadcast(Context context, Bundle bundle)
	{
		AppboyLogger.d(TAG, "Sending push message received broadcast");
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:ldc2            #548 <String "Sending push message received broadcast">
	//    2    6:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		sendPushActionIntent(context, ".intent.APPBOY_PUSH_RECEIVED", bundle);
	//    4   10:aload_0         
	//    5   11:ldc1            #14  <String ".intent.APPBOY_PUSH_RECEIVED">
	//    6   13:aload_1         
	//    7   14:invokestatic    #300 <Method void sendPushActionIntent(Context, String, Bundle)>
	//    8   17:return          
	}

	public static void setAccentColorIfPresentAndSupported(AppboyConfigurationProvider appboyconfigurationprovider, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          68
		{
			if(bundle != null && bundle.containsKey("ac"))
	//*   3    8:aload_2         
	//*   4    9:ifnull          49
	//*   5   12:aload_2         
	//*   6   13:ldc2            #558 <String "ac">
	//*   7   16:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   8   19:ifeq            49
			{
				AppboyLogger.d(TAG, "Using accent color for notification from extras bundle");
	//    9   22:getstatic       #28  <Field String TAG>
	//   10   25:ldc2            #560 <String "Using accent color for notification from extras bundle">
	//   11   28:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   12   31:pop             
				builder.setColor((int)Long.parseLong(bundle.getString("ac")));
	//   13   32:aload_1         
	//   14   33:aload_2         
	//   15   34:ldc2            #558 <String "ac">
	//   16   37:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   17   40:invokestatic    #566 <Method long Long.parseLong(String)>
	//   18   43:l2i             
	//   19   44:invokevirtual   #572 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setColor(int)>
	//   20   47:pop             
				return;
	//   21   48:return          
			}
			AppboyLogger.d(TAG, "Using default accent color for notification");
	//   22   49:getstatic       #28  <Field String TAG>
	//   23   52:ldc2            #574 <String "Using default accent color for notification">
	//   24   55:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   25   58:pop             
			builder.setColor(appboyconfigurationprovider.getDefaultNotificationAccentColor());
	//   26   59:aload_1         
	//   27   60:aload_0         
	//   28   61:invokevirtual   #577 <Method int AppboyConfigurationProvider.getDefaultNotificationAccentColor()>
	//   29   64:invokevirtual   #572 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setColor(int)>
	//   30   67:pop             
		}
	//   31   68:return          
	}

	public static void setCategoryIfPresentAndSupported(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          56
		{
			if(bundle != null && bundle.containsKey("ab_ct"))
	//*   3    8:aload_1         
	//*   4    9:ifnull          45
	//*   5   12:aload_1         
	//*   6   13:ldc2            #581 <String "ab_ct">
	//*   7   16:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   8   19:ifeq            45
			{
				AppboyLogger.d(TAG, "Setting category for notification");
	//    9   22:getstatic       #28  <Field String TAG>
	//   10   25:ldc2            #583 <String "Setting category for notification">
	//   11   28:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   12   31:pop             
				builder.setCategory(bundle.getString("ab_ct"));
	//   13   32:aload_0         
	//   14   33:aload_1         
	//   15   34:ldc2            #581 <String "ab_ct">
	//   16   37:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   17   40:invokevirtual   #587 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setCategory(String)>
	//   18   43:pop             
				return;
	//   19   44:return          
			} else
			{
				AppboyLogger.d(TAG, "Category not present in notification extras. Not setting category for notification.");
	//   20   45:getstatic       #28  <Field String TAG>
	//   21   48:ldc2            #589 <String "Category not present in notification extras. Not setting category for notification.">
	//   22   51:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   23   54:pop             
				return;
	//   24   55:return          
			}
		} else
		{
			AppboyLogger.d(TAG, "Notification category not supported on this android version. Not setting category for notification.");
	//   25   56:getstatic       #28  <Field String TAG>
	//   26   59:ldc2            #591 <String "Notification category not supported on this android version. Not setting category for notification.">
	//   27   62:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   28   65:pop             
			return;
	//   29   66:return          
		}
	}

	public static void setContentIfPresent(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
		{
			AppboyLogger.d(TAG, "Setting content for notification");
	//    2    4:getstatic       #28  <Field String TAG>
	//    3    7:ldc2            #594 <String "Setting content for notification">
	//    4   10:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    5   13:pop             
			builder.setContentText(((CharSequence) (bundle.getString("a"))));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:ldc1            #186 <String "a">
	//    9   18:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   10   21:invokevirtual   #598 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//   11   24:pop             
		}
	//   12   25:return          
	}

	public static void setContentIntentIfPresent(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		try
		{
			builder.setContentIntent(getPushActionPendingIntent(context, "com.appboy.action.APPBOY_PUSH_CLICKED", bundle));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:ldc2            #602 <String "com.appboy.action.APPBOY_PUSH_CLICKED">
	//    3    5:aload_2         
	//    4    6:invokestatic    #604 <Method PendingIntent getPushActionPendingIntent(Context, String, Bundle)>
	//    5    9:invokevirtual   #608 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//    6   12:pop             
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   14:astore_0        
		{
			AppboyLogger.e(TAG, "Error setting content intent.", ((Throwable) (context)));
	//    9   15:getstatic       #28  <Field String TAG>
	//   10   18:ldc2            #610 <String "Error setting content intent.">
	//   11   21:aload_0         
	//   12   22:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   13   25:pop             
		}
	//   14   26:return          
	}

	public static void setDeleteIntent(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		AppboyLogger.d(TAG, "Setting delete intent.");
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:ldc2            #613 <String "Setting delete intent.">
	//    2    6:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		try
		{
			builder.setDeleteIntent(getPushActionPendingIntent(context, "com.appboy.action.APPBOY_PUSH_DELETED", bundle));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:ldc2            #615 <String "com.appboy.action.APPBOY_PUSH_DELETED">
	//    7   15:aload_2         
	//    8   16:invokestatic    #604 <Method PendingIntent getPushActionPendingIntent(Context, String, Bundle)>
	//    9   19:invokevirtual   #617 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setDeleteIntent(PendingIntent)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  12   24:astore_0        
		{
			AppboyLogger.e(TAG, "Error setting delete intent.", ((Throwable) (context)));
	//   13   25:getstatic       #28  <Field String TAG>
	//   14   28:ldc2            #619 <String "Error setting delete intent.">
	//   15   31:aload_0         
	//   16   32:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   17   35:pop             
		}
	//   18   36:return          
	}

	public static boolean setLargeIconIfPresentAndSupported(Context context, AppboyConfigurationProvider appboyconfigurationprovider, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(bundle.containsKey("ab_c"))
	//*   0    0:aload_3         
	//*   1    1:ldc2            #436 <String "ab_c">
	//*   2    4:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   3    7:ifeq            22
		{
			AppboyLogger.d(TAG, "Large icon not supported in story push.");
	//    4   10:getstatic       #28  <Field String TAG>
	//    5   13:ldc2            #623 <String "Large icon not supported in story push.">
	//    6   16:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    7   19:pop             
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		}
		if(bundle == null)
			break MISSING_BLOCK_LABEL_70;
	//   10   22:aload_3         
	//   11   23:ifnull          70
		if(!bundle.containsKey("ab_li"))
			break MISSING_BLOCK_LABEL_70;
	//   12   26:aload_3         
	//   13   27:ldc2            #625 <String "ab_li">
	//   14   30:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//   15   33:ifeq            70
		AppboyLogger.d(TAG, "Setting large icon for notification");
	//   16   36:getstatic       #28  <Field String TAG>
	//   17   39:ldc2            #627 <String "Setting large icon for notification">
	//   18   42:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   19   45:pop             
		builder.setLargeIcon(AppboyImageUtils.getBitmap(context, Uri.parse(bundle.getString("ab_li")), AppboyViewBounds.NOTIFICATION_LARGE_ICON));
	//   20   46:aload_2         
	//   21   47:aload_0         
	//   22   48:aload_3         
	//   23   49:ldc2            #625 <String "ab_li">
	//   24   52:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   25   55:invokestatic    #633 <Method Uri Uri.parse(String)>
	//   26   58:getstatic       #636 <Field AppboyViewBounds AppboyViewBounds.NOTIFICATION_LARGE_ICON>
	//   27   61:invokestatic    #642 <Method android.graphics.Bitmap AppboyImageUtils.getBitmap(Context, Uri, AppboyViewBounds)>
	//   28   64:invokevirtual   #646 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLargeIcon(android.graphics.Bitmap)>
	//   29   67:pop             
		return true;
	//   30   68:iconst_1        
	//   31   69:ireturn         
		int i;
		AppboyLogger.d(TAG, "Large icon bitmap url not present in extras. Attempting to use resource id instead.");
	//   32   70:getstatic       #28  <Field String TAG>
	//   33   73:ldc2            #648 <String "Large icon bitmap url not present in extras. Attempting to use resource id instead.">
	//   34   76:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   35   79:pop             
		i = appboyconfigurationprovider.getLargeNotificationIconResourceId();
	//   36   80:aload_1         
	//   37   81:invokevirtual   #651 <Method int AppboyConfigurationProvider.getLargeNotificationIconResourceId()>
	//   38   84:istore          4
		if(i == 0)
			break MISSING_BLOCK_LABEL_107;
	//   39   86:iload           4
	//   40   88:ifeq            107
		builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), i));
	//   41   91:aload_2         
	//   42   92:aload_0         
	//   43   93:invokevirtual   #655 <Method Resources Context.getResources()>
	//   44   96:iload           4
	//   45   98:invokestatic    #661 <Method android.graphics.Bitmap BitmapFactory.decodeResource(Resources, int)>
	//   46  101:invokevirtual   #646 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLargeIcon(android.graphics.Bitmap)>
	//   47  104:pop             
		return true;
	//   48  105:iconst_1        
	//   49  106:ireturn         
		try
		{
			AppboyLogger.d(TAG, "Large icon resource id not present for notification");
	//   50  107:getstatic       #28  <Field String TAG>
	//   51  110:ldc2            #663 <String "Large icon resource id not present for notification">
	//   52  113:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   53  116:pop             
		}
	//*  54  117:goto            132
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  55  120:astore_0        
		{
			AppboyLogger.e(TAG, "Error setting large notification icon", ((Throwable) (context)));
	//   56  121:getstatic       #28  <Field String TAG>
	//   57  124:ldc2            #665 <String "Error setting large notification icon">
	//   58  127:aload_0         
	//   59  128:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   60  131:pop             
		}
		AppboyLogger.d(TAG, "Large icon not set for notification");
	//   61  132:getstatic       #28  <Field String TAG>
	//   62  135:ldc2            #667 <String "Large icon not set for notification">
	//   63  138:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   64  141:pop             
		return false;
	//   65  142:iconst_0        
	//   66  143:ireturn         
	}

	public static void setNotificationBadgeNumberIfPresent(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          46
		{
			bundle = ((Bundle) (bundle.getString("ab_bc", ((String) (null)))));
	//    3    8:aload_1         
	//    4    9:ldc2            #670 <String "ab_bc">
	//    5   12:aconst_null     
	//    6   13:invokevirtual   #41  <Method String Bundle.getString(String, String)>
	//    7   16:astore_1        
			if(!StringUtils.isNullOrBlank(((String) (bundle))))
	//*   8   17:aload_1         
	//*   9   18:invokestatic    #251 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  10   21:ifne            46
				try
				{
					builder.setNumber(Integer.parseInt(((String) (bundle))));
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokestatic    #176 <Method int Integer.parseInt(String)>
	//   14   29:invokevirtual   #673 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setNumber(int)>
	//   15   32:pop             
					return;
	//   16   33:return          
				}
				// Misplaced declaration of an exception variable
				catch(android.support.v4.app.NotificationCompat.Builder builder)
	//*  17   34:astore_0        
				{
					AppboyLogger.e(TAG, "Caught exception while setting number on notification.", ((Throwable) (builder)));
	//   18   35:getstatic       #28  <Field String TAG>
	//   19   38:ldc2            #675 <String "Caught exception while setting number on notification.">
	//   20   41:aload_0         
	//   21   42:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   22   45:pop             
				}
		}
	//   23   46:return          
	}

	public static void setNotificationChannelIfSupported(Context context, AppboyConfigurationProvider appboyconfigurationprovider, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          141
		{
			context = ((Context) ((NotificationManager)context.getSystemService("notification")));
	//    3    8:aload_0         
	//    4    9:ldc2            #275 <String "notification">
	//    5   12:invokevirtual   #281 <Method Object Context.getSystemService(String)>
	//    6   15:checkcast       #253 <Class NotificationManager>
	//    7   18:astore_0        
			bundle = ((Bundle) (getValidNotificationChannel(((NotificationManager) (context)), bundle)));
	//    8   19:aload_0         
	//    9   20:aload_3         
	//   10   21:invokestatic    #682 <Method NotificationChannel getValidNotificationChannel(NotificationManager, Bundle)>
	//   11   24:astore_3        
			if(bundle != null)
	//*  12   25:aload_3         
	//*  13   26:ifnull          77
			{
				context = ((Context) (TAG));
	//   14   29:getstatic       #28  <Field String TAG>
	//   15   32:astore_0        
				appboyconfigurationprovider = ((AppboyConfigurationProvider) (new StringBuilder()));
	//   16   33:new             #48  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #49  <Method void StringBuilder()>
	//   19   40:astore_1        
				((StringBuilder) (appboyconfigurationprovider)).append("Using notification channel with id: ");
	//   20   41:aload_1         
	//   21   42:ldc2            #684 <String "Using notification channel with id: ">
	//   22   45:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
				((StringBuilder) (appboyconfigurationprovider)).append(((NotificationChannel) (bundle)).getId());
	//   24   49:aload_1         
	//   25   50:aload_3         
	//   26   51:invokevirtual   #687 <Method String NotificationChannel.getId()>
	//   27   54:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
				AppboyLogger.d(((String) (context)), ((StringBuilder) (appboyconfigurationprovider)).toString());
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   32   63:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   33   66:pop             
				builder.setChannelId(((NotificationChannel) (bundle)).getId());
	//   34   67:aload_2         
	//   35   68:aload_3         
	//   36   69:invokevirtual   #687 <Method String NotificationChannel.getId()>
	//   37   72:invokevirtual   #690 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setChannelId(String)>
	//   38   75:pop             
				return;
	//   39   76:return          
			}
			if(bundle == null || ((NotificationChannel) (bundle)).getId().equals("com_appboy_default_notification_channel"))
	//*  40   77:aload_3         
	//*  41   78:ifnull          94
	//*  42   81:aload_3         
	//*  43   82:invokevirtual   #687 <Method String NotificationChannel.getId()>
	//*  44   85:ldc2            #263 <String "com_appboy_default_notification_channel">
	//*  45   88:invokevirtual   #369 <Method boolean String.equals(Object)>
	//*  46   91:ifeq            141
			{
				bundle = ((Bundle) (new NotificationChannel("com_appboy_default_notification_channel", ((CharSequence) (appboyconfigurationprovider.getDefaultNotificationChannelName())), 3)));
	//   47   94:new             #156 <Class NotificationChannel>
	//   48   97:dup             
	//   49   98:ldc2            #263 <String "com_appboy_default_notification_channel">
	//   50  101:aload_1         
	//   51  102:invokevirtual   #693 <Method String AppboyConfigurationProvider.getDefaultNotificationChannelName()>
	//   52  105:iconst_3        
	//   53  106:invokespecial   #696 <Method void NotificationChannel(String, CharSequence, int)>
	//   54  109:astore_3        
				((NotificationChannel) (bundle)).setDescription(appboyconfigurationprovider.getDefaultNotificationChannelDescription());
	//   55  110:aload_3         
	//   56  111:aload_1         
	//   57  112:invokevirtual   #699 <Method String AppboyConfigurationProvider.getDefaultNotificationChannelDescription()>
	//   58  115:invokevirtual   #702 <Method void NotificationChannel.setDescription(String)>
				((NotificationManager) (context)).createNotificationChannel(((NotificationChannel) (bundle)));
	//   59  118:aload_0         
	//   60  119:aload_3         
	//   61  120:invokevirtual   #706 <Method void NotificationManager.createNotificationChannel(NotificationChannel)>
				builder.setChannelId("com_appboy_default_notification_channel");
	//   62  123:aload_2         
	//   63  124:ldc2            #263 <String "com_appboy_default_notification_channel">
	//   64  127:invokevirtual   #690 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setChannelId(String)>
	//   65  130:pop             
				AppboyLogger.d(TAG, "Using default notification channel with id: com_appboy_default_notification_channel");
	//   66  131:getstatic       #28  <Field String TAG>
	//   67  134:ldc2            #708 <String "Using default notification channel with id: com_appboy_default_notification_channel">
	//   68  137:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   69  140:pop             
			}
		}
	//   70  141:return          
	}

	public static void setNotificationDurationAlarm(Context context, Class class1, int i, int j)
	{
		class1 = ((Class) (new Intent(context, class1)));
	//    0    0:new             #68  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #713 <Method void Intent(Context, Class)>
	//    5    9:astore_1        
		((Intent) (class1)).setAction("com.appboy.action.CANCEL_NOTIFICATION");
	//    6   10:aload_1         
	//    7   11:ldc1            #70  <String "com.appboy.action.CANCEL_NOTIFICATION">
	//    8   13:invokevirtual   #717 <Method Intent Intent.setAction(String)>
	//    9   16:pop             
		((Intent) (class1)).putExtra("nid", i);
	//   10   17:aload_1         
	//   11   18:ldc1            #83  <String "nid">
	//   12   20:iload_2         
	//   13   21:invokevirtual   #87  <Method Intent Intent.putExtra(String, int)>
	//   14   24:pop             
		class1 = ((Class) (PendingIntent.getBroadcast(context, 0, ((Intent) (class1)), 0x8000000)));
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:aload_1         
	//   18   28:ldc2            #718 <Int 0x8000000>
	//   19   31:invokestatic    #240 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   20   34:astore_1        
		context = ((Context) ((AlarmManager)context.getSystemService("alarm")));
	//   21   35:aload_0         
	//   22   36:ldc2            #720 <String "alarm">
	//   23   39:invokevirtual   #281 <Method Object Context.getSystemService(String)>
	//   24   42:checkcast       #722 <Class AlarmManager>
	//   25   45:astore_0        
		if(j >= 1000)
	//*  26   46:iload_3         
	//*  27   47:sipush          1000
	//*  28   50:icmplt          115
		{
			String s = TAG;
	//   29   53:getstatic       #28  <Field String TAG>
	//   30   56:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   31   58:new             #48  <Class StringBuilder>
	//   32   61:dup             
	//   33   62:invokespecial   #49  <Method void StringBuilder()>
	//   34   65:astore          5
			stringbuilder.append("Setting Notification duration alarm for ");
	//   35   67:aload           5
	//   36   69:ldc2            #724 <String "Setting Notification duration alarm for ">
	//   37   72:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
			stringbuilder.append(j);
	//   39   76:aload           5
	//   40   78:iload_3         
	//   41   79:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   42   82:pop             
			stringbuilder.append(" ms");
	//   43   83:aload           5
	//   44   85:ldc2            #726 <String " ms">
	//   45   88:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   47   92:aload           4
	//   48   94:aload           5
	//   49   96:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   50   99:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   51  102:pop             
			((AlarmManager) (context)).set(3, SystemClock.elapsedRealtime() + (long)j, ((PendingIntent) (class1)));
	//   52  103:aload_0         
	//   53  104:iconst_3        
	//   54  105:invokestatic    #732 <Method long SystemClock.elapsedRealtime()>
	//   55  108:iload_3         
	//   56  109:i2l             
	//   57  110:ladd            
	//   58  111:aload_1         
	//   59  112:invokevirtual   #736 <Method void AlarmManager.set(int, long, PendingIntent)>
		}
	//   60  115:return          
	}

	public static void setPriorityIfPresentAndSupported(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16 && bundle != null)
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          31
	//*   3    8:aload_1         
	//*   4    9:ifnull          31
		{
			AppboyLogger.d(TAG, "Setting priority for notification");
	//    5   12:getstatic       #28  <Field String TAG>
	//    6   15:ldc2            #740 <String "Setting priority for notification">
	//    7   18:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    8   21:pop             
			builder.setPriority(getNotificationPriority(bundle));
	//    9   22:aload_0         
	//   10   23:aload_1         
	//   11   24:invokestatic    #742 <Method int getNotificationPriority(Bundle)>
	//   12   27:invokevirtual   #745 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setPriority(int)>
	//   13   30:pop             
		}
	//   14   31:return          
	}

	public static void setPublicVersionIfPresentAndSupported(Context context, AppboyConfigurationProvider appboyconfigurationprovider, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && bundle != null && bundle.containsKey("ab_pn"))
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          78
	//*   3    8:aload_3         
	//*   4    9:ifnull          78
	//*   5   12:aload_3         
	//*   6   13:ldc2            #748 <String "ab_pn">
	//*   7   16:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   8   19:ifeq            78
		{
			bundle = parseJSONStringDictionaryIntoBundle(bundle.getString("ab_pn"));
	//    9   22:aload_3         
	//   10   23:ldc2            #748 <String "ab_pn">
	//   11   26:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   12   29:invokestatic    #146 <Method Bundle parseJSONStringDictionaryIntoBundle(String)>
	//   13   32:astore_3        
			context = ((Context) (new android.support.v4.app.NotificationCompat.Builder(context)));
	//   14   33:new             #568 <Class android.support.v4.app.NotificationCompat$Builder>
	//   15   36:dup             
	//   16   37:aload_0         
	//   17   38:invokespecial   #749 <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//   18   41:astore_0        
			setContentIfPresent(((android.support.v4.app.NotificationCompat.Builder) (context)), bundle);
	//   19   42:aload_0         
	//   20   43:aload_3         
	//   21   44:invokestatic    #751 <Method void setContentIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
			setTitleIfPresent(((android.support.v4.app.NotificationCompat.Builder) (context)), bundle);
	//   22   47:aload_0         
	//   23   48:aload_3         
	//   24   49:invokestatic    #754 <Method void setTitleIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
			setSummaryTextIfPresentAndSupported(((android.support.v4.app.NotificationCompat.Builder) (context)), bundle);
	//   25   52:aload_0         
	//   26   53:aload_3         
	//   27   54:invokestatic    #757 <Method void setSummaryTextIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
			setSmallIcon(appboyconfigurationprovider, ((android.support.v4.app.NotificationCompat.Builder) (context)));
	//   28   57:aload_1         
	//   29   58:aload_0         
	//   30   59:invokestatic    #761 <Method int setSmallIcon(AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder)>
	//   31   62:pop             
			setAccentColorIfPresentAndSupported(appboyconfigurationprovider, ((android.support.v4.app.NotificationCompat.Builder) (context)), bundle);
	//   32   63:aload_1         
	//   33   64:aload_0         
	//   34   65:aload_3         
	//   35   66:invokestatic    #763 <Method void setAccentColorIfPresentAndSupported(AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
			builder.setPublicVersion(((android.support.v4.app.NotificationCompat.Builder) (context)).build());
	//   36   69:aload_2         
	//   37   70:aload_0         
	//   38   71:invokevirtual   #767 <Method android.app.Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//   39   74:invokevirtual   #771 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setPublicVersion(android.app.Notification)>
	//   40   77:pop             
		}
	//   41   78:return          
	}

	public static void setSetShowWhen(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(bundle.containsKey("ab_c"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #436 <String "ab_c">
	//*   2    4:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   3    7:ifeq            26
		{
			AppboyLogger.d(TAG, "Set show when not supported in story push.");
	//    4   10:getstatic       #28  <Field String TAG>
	//    5   13:ldc2            #774 <String "Set show when not supported in story push.">
	//    6   16:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    7   19:pop             
			builder.setShowWhen(false);
	//    8   20:aload_0         
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #778 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setShowWhen(boolean)>
	//   11   25:pop             
		}
	//   12   26:return          
	}

	public static int setSmallIcon(AppboyConfigurationProvider appboyconfigurationprovider, android.support.v4.app.NotificationCompat.Builder builder)
	{
		int i = appboyconfigurationprovider.getSmallNotificationIconResourceId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #781 <Method int AppboyConfigurationProvider.getSmallNotificationIconResourceId()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            27
		{
			AppboyLogger.d(TAG, "Small notification icon resource was not found. Will use the app icon when displaying notifications.");
	//    5    9:getstatic       #28  <Field String TAG>
	//    6   12:ldc2            #783 <String "Small notification icon resource was not found. Will use the app icon when displaying notifications.">
	//    7   15:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    8   18:pop             
			i = appboyconfigurationprovider.getApplicationIconResourceId();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #786 <Method int AppboyConfigurationProvider.getApplicationIconResourceId()>
	//   11   23:istore_2        
		} else
	//*  12   24:goto            37
		{
			AppboyLogger.d(TAG, "Setting small icon for notification via resource id");
	//   13   27:getstatic       #28  <Field String TAG>
	//   14   30:ldc2            #788 <String "Setting small icon for notification via resource id">
	//   15   33:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   16   36:pop             
		}
		builder.setSmallIcon(i);
	//   17   37:aload_1         
	//   18   38:iload_2         
	//   19   39:invokevirtual   #790 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   20   42:pop             
		return i;
	//   21   43:iload_2         
	//   22   44:ireturn         
	}

	public static void setSoundIfPresentAndSupported(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(bundle != null && bundle.containsKey("sd"))
	//*   0    0:aload_1         
	//*   1    1:ifnull          73
	//*   2    4:aload_1         
	//*   3    5:ldc2            #793 <String "sd">
	//*   4    8:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   5   11:ifeq            73
		{
			bundle = ((Bundle) (bundle.getString("sd")));
	//    6   14:aload_1         
	//    7   15:ldc2            #793 <String "sd">
	//    8   18:invokevirtual   #170 <Method String Bundle.getString(String)>
	//    9   21:astore_1        
			if(bundle != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          83
				if(((String) (bundle)).equals("d"))
	//*  12   26:aload_1         
	//*  13   27:ldc2            #794 <String "d">
	//*  14   30:invokevirtual   #369 <Method boolean String.equals(Object)>
	//*  15   33:ifeq            53
				{
					AppboyLogger.d(TAG, "Setting default sound for notification.");
	//   16   36:getstatic       #28  <Field String TAG>
	//   17   39:ldc2            #796 <String "Setting default sound for notification.">
	//   18   42:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   19   45:pop             
					builder.setDefaults(1);
	//   20   46:aload_0         
	//   21   47:iconst_1        
	//   22   48:invokevirtual   #799 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setDefaults(int)>
	//   23   51:pop             
					return;
	//   24   52:return          
				} else
				{
					AppboyLogger.d(TAG, "Setting sound for notification via uri.");
	//   25   53:getstatic       #28  <Field String TAG>
	//   26   56:ldc2            #801 <String "Setting sound for notification via uri.">
	//   27   59:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   28   62:pop             
					builder.setSound(Uri.parse(((String) (bundle))));
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:invokestatic    #633 <Method Uri Uri.parse(String)>
	//   32   68:invokevirtual   #805 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSound(Uri)>
	//   33   71:pop             
					return;
	//   34   72:return          
				}
		} else
		{
			AppboyLogger.d(TAG, "Sound key not present in notification extras. Not setting sound for notification.");
	//   35   73:getstatic       #28  <Field String TAG>
	//   36   76:ldc2            #807 <String "Sound key not present in notification extras. Not setting sound for notification.">
	//   37   79:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   38   82:pop             
		}
	//   39   83:return          
	}

	public static void setStyleIfSupported(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle, Bundle bundle1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16 && bundle != null)
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          34
	//*   3    8:aload_2         
	//*   4    9:ifnull          34
		{
			AppboyLogger.d(TAG, "Setting style for notification");
	//    5   12:getstatic       #28  <Field String TAG>
	//    6   15:ldc2            #811 <String "Setting style for notification">
	//    7   18:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    8   21:pop             
			builder.setStyle(AppboyNotificationStyleFactory.getBigNotificationStyle(context, bundle, bundle1, builder));
	//    9   22:aload_1         
	//   10   23:aload_0         
	//   11   24:aload_2         
	//   12   25:aload_3         
	//   13   26:aload_1         
	//   14   27:invokestatic    #817 <Method android.support.v4.app.NotificationCompat$Style AppboyNotificationStyleFactory.getBigNotificationStyle(Context, Bundle, Bundle, android.support.v4.app.NotificationCompat$Builder)>
	//   15   30:invokevirtual   #821 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//   16   33:pop             
		}
	//   17   34:return          
	}

	public static void setSummaryTextIfPresentAndSupported(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          61
			if(bundle != null && bundle.containsKey("s"))
	//*   3    8:aload_1         
	//*   4    9:ifnull          51
	//*   5   12:aload_1         
	//*   6   13:ldc2            #823 <String "s">
	//*   7   16:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//*   8   19:ifeq            51
			{
				bundle = ((Bundle) (bundle.getString("s")));
	//    9   22:aload_1         
	//   10   23:ldc2            #823 <String "s">
	//   11   26:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   12   29:astore_1        
				if(bundle != null)
	//*  13   30:aload_1         
	//*  14   31:ifnull          61
				{
					AppboyLogger.d(TAG, "Setting summary text for notification");
	//   15   34:getstatic       #28  <Field String TAG>
	//   16   37:ldc2            #825 <String "Setting summary text for notification">
	//   17   40:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   18   43:pop             
					builder.setSubText(((CharSequence) (bundle)));
	//   19   44:aload_0         
	//   20   45:aload_1         
	//   21   46:invokevirtual   #828 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSubText(CharSequence)>
	//   22   49:pop             
					return;
	//   23   50:return          
				}
			} else
			{
				AppboyLogger.d(TAG, "Summary text not present in notification extras. Not setting summary text for notification.");
	//   24   51:getstatic       #28  <Field String TAG>
	//   25   54:ldc2            #830 <String "Summary text not present in notification extras. Not setting summary text for notification.">
	//   26   57:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   27   60:pop             
			}
	//   28   61:return          
	}

	public static void setTickerIfPresent(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
		{
			AppboyLogger.d(TAG, "Setting ticker for notification");
	//    2    4:getstatic       #28  <Field String TAG>
	//    3    7:ldc2            #833 <String "Setting ticker for notification">
	//    4   10:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    5   13:pop             
			builder.setTicker(((CharSequence) (bundle.getString("t"))));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:ldc1            #182 <String "t">
	//    9   18:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   10   21:invokevirtual   #836 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setTicker(CharSequence)>
	//   11   24:pop             
		}
	//   12   25:return          
	}

	public static void setTitleIfPresent(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
		{
			AppboyLogger.d(TAG, "Setting title for notification");
	//    2    4:getstatic       #28  <Field String TAG>
	//    3    7:ldc2            #838 <String "Setting title for notification">
	//    4   10:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//    5   13:pop             
			builder.setContentTitle(((CharSequence) (bundle.getString("t"))));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:ldc1            #182 <String "t">
	//    9   18:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   10   21:invokevirtual   #841 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   11   24:pop             
		}
	//   12   25:return          
	}

	public static void setVisibilityIfPresentAndSupported(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_106;
	//    0    0:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          106
		if(bundle == null || !bundle.containsKey("ab_vs"))
			break MISSING_BLOCK_LABEL_116;
	//    3    8:aload_1         
	//    4    9:ifnull          116
	//    5   12:aload_1         
	//    6   13:ldc2            #844 <String "ab_vs">
	//    7   16:invokevirtual   #120 <Method boolean Bundle.containsKey(String)>
	//    8   19:ifeq            116
		int i;
		i = Integer.parseInt(bundle.getString("ab_vs"));
	//    9   22:aload_1         
	//   10   23:ldc2            #844 <String "ab_vs">
	//   11   26:invokevirtual   #170 <Method String Bundle.getString(String)>
	//   12   29:invokestatic    #176 <Method int Integer.parseInt(String)>
	//   13   32:istore_2        
		if(isValidNotificationVisibility(i))
	//*  14   33:iload_2         
	//*  15   34:invokestatic    #846 <Method boolean isValidNotificationVisibility(int)>
	//*  16   37:ifeq            57
		{
			AppboyLogger.d(TAG, "Setting visibility for notification");
	//   17   40:getstatic       #28  <Field String TAG>
	//   18   43:ldc2            #848 <String "Setting visibility for notification">
	//   19   46:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   20   49:pop             
			builder.setVisibility(i);
	//   21   50:aload_0         
	//   22   51:iload_2         
	//   23   52:invokevirtual   #851 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setVisibility(int)>
	//   24   55:pop             
			return;
	//   25   56:return          
		}
		try
		{
			builder = ((android.support.v4.app.NotificationCompat.Builder) (TAG));
	//   26   57:getstatic       #28  <Field String TAG>
	//   27   60:astore_0        
			bundle = ((Bundle) (new StringBuilder()));
	//   28   61:new             #48  <Class StringBuilder>
	//   29   64:dup             
	//   30   65:invokespecial   #49  <Method void StringBuilder()>
	//   31   68:astore_1        
			((StringBuilder) (bundle)).append("Received invalid notification visibility ");
	//   32   69:aload_1         
	//   33   70:ldc2            #853 <String "Received invalid notification visibility ">
	//   34   73:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   35   76:pop             
			((StringBuilder) (bundle)).append(i);
	//   36   77:aload_1         
	//   37   78:iload_2         
	//   38   79:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   39   82:pop             
			AppboyLogger.e(((String) (builder)), ((StringBuilder) (bundle)).toString());
	//   40   83:aload_0         
	//   41   84:aload_1         
	//   42   85:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   43   88:invokestatic    #207 <Method int AppboyLogger.e(String, String)>
	//   44   91:pop             
			return;
	//   45   92:return          
		}
		// Misplaced declaration of an exception variable
		catch(android.support.v4.app.NotificationCompat.Builder builder)
	//*  46   93:astore_0        
		{
			AppboyLogger.e(TAG, "Failed to parse visibility from notificationExtras", ((Throwable) (builder)));
	//   47   94:getstatic       #28  <Field String TAG>
	//   48   97:ldc2            #855 <String "Failed to parse visibility from notificationExtras">
	//   49  100:aload_0         
	//   50  101:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//   51  104:pop             
		}
		return;
	//   52  105:return          
		AppboyLogger.d(TAG, "Notification visibility not supported on this android version. Not setting visibility for notification.");
	//   53  106:getstatic       #28  <Field String TAG>
	//   54  109:ldc2            #857 <String "Notification visibility not supported on this android version. Not setting visibility for notification.">
	//   55  112:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   56  115:pop             
	//   57  116:return          
	}

	public static boolean wakeScreenIfHasPermission(Context context, Bundle bundle)
	{
		if(!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #860 <String "android.permission.WAKE_LOCK">
	//*   2    4:invokestatic    #866 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   6   12:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          26
	//*   8   17:icmplt          98
		{
			bundle = ((Bundle) (getValidNotificationChannel((NotificationManager)context.getSystemService("notification"), bundle)));
	//    9   20:aload_0         
	//   10   21:ldc2            #275 <String "notification">
	//   11   24:invokevirtual   #281 <Method Object Context.getSystemService(String)>
	//   12   27:checkcast       #253 <Class NotificationManager>
	//   13   30:aload_1         
	//   14   31:invokestatic    #682 <Method NotificationChannel getValidNotificationChannel(NotificationManager, Bundle)>
	//   15   34:astore_1        
			if(bundle == null)
	//*  16   35:aload_1         
	//*  17   36:ifnonnull       51
			{
				AppboyLogger.d(TAG, "Not waking screen on Android O+ device, could not find notification channel.");
	//   18   39:getstatic       #28  <Field String TAG>
	//   19   42:ldc2            #868 <String "Not waking screen on Android O+ device, could not find notification channel.">
	//   20   45:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   21   48:pop             
				return false;
	//   22   49:iconst_0        
	//   23   50:ireturn         
			}
			int i = getNotificationChannelImportance(((NotificationChannel) (bundle)));
	//   24   51:aload_1         
	//   25   52:invokestatic    #870 <Method int getNotificationChannelImportance(NotificationChannel)>
	//   26   55:istore_2        
			if(i == 1)
	//*  27   56:iload_2         
	//*  28   57:iconst_1        
	//*  29   58:icmpne          117
			{
				context = ((Context) (TAG));
	//   30   61:getstatic       #28  <Field String TAG>
	//   31   64:astore_0        
				bundle = ((Bundle) (new StringBuilder()));
	//   32   65:new             #48  <Class StringBuilder>
	//   33   68:dup             
	//   34   69:invokespecial   #49  <Method void StringBuilder()>
	//   35   72:astore_1        
				((StringBuilder) (bundle)).append("Not acquiring wake-lock for Android O+ notification with importance: ");
	//   36   73:aload_1         
	//   37   74:ldc2            #872 <String "Not acquiring wake-lock for Android O+ notification with importance: ">
	//   38   77:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
				((StringBuilder) (bundle)).append(i);
	//   40   81:aload_1         
	//   41   82:iload_2         
	//   42   83:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   43   86:pop             
				AppboyLogger.d(((String) (context)), ((StringBuilder) (bundle)).toString());
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   47   92:invokestatic    #66  <Method int AppboyLogger.d(String, String)>
	//   48   95:pop             
				return false;
	//   49   96:iconst_0        
	//   50   97:ireturn         
			}
		} else
		if(android.os.Build.VERSION.SDK_INT >= 16 && getNotificationPriority(bundle) == -2)
	//*  51   98:getstatic       #556 <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  101:bipush          16
	//*  53  103:icmplt          117
	//*  54  106:aload_1         
	//*  55  107:invokestatic    #742 <Method int getNotificationPriority(Bundle)>
	//*  56  110:bipush          -2
	//*  57  112:icmpne          117
			return false;
	//   58  115:iconst_0        
	//   59  116:ireturn         
		context = ((Context) (((PowerManager)context.getSystemService("power")).newWakeLock(0x1000001a, TAG)));
	//   60  117:aload_0         
	//   61  118:ldc2            #874 <String "power">
	//   62  121:invokevirtual   #281 <Method Object Context.getSystemService(String)>
	//   63  124:checkcast       #876 <Class PowerManager>
	//   64  127:ldc2            #877 <Int 0x1000001a>
	//   65  130:getstatic       #28  <Field String TAG>
	//   66  133:invokevirtual   #881 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   67  136:astore_0        
		((android.os.PowerManager.WakeLock) (context)).acquire();
	//   68  137:aload_0         
	//   69  138:invokevirtual   #886 <Method void android.os.PowerManager$WakeLock.acquire()>
		((android.os.PowerManager.WakeLock) (context)).release();
	//   70  141:aload_0         
	//   71  142:invokevirtual   #889 <Method void android.os.PowerManager$WakeLock.release()>
		return true;
	//   72  145:iconst_1        
	//   73  146:ireturn         
	}

	public static final String APPBOY_NOTIFICATION_DELETED_SUFFIX = ".intent.APPBOY_PUSH_DELETED";
	public static final String APPBOY_NOTIFICATION_OPENED_SUFFIX = ".intent.APPBOY_NOTIFICATION_OPENED";
	public static final String APPBOY_NOTIFICATION_RECEIVED_SUFFIX = ".intent.APPBOY_PUSH_RECEIVED";
	private static final String SOURCE_KEY = "source";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/push/AppboyNotificationUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyNotificationUtils>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String TAG>
	//*   3    8:return          
	}
}
