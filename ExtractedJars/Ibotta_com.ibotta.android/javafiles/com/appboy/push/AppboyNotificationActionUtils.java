// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.Appboy;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.*;

// Referenced classes of package com.appboy.push:
//			AppboyNotificationRoutingActivity, AppboyNotificationUtils

public class AppboyNotificationActionUtils
{

	public AppboyNotificationActionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private static void addNotificationAction(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle, int i)
	{
		Bundle bundle1 = new Bundle(bundle);
	//    0    0:new             #24  <Class Bundle>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #27  <Method void Bundle(Bundle)>
	//    4    8:astore          4
		Object obj = ((Object) (getActionFieldAtIndex(i, bundle, "ab_a*_a")));
	//    5   10:iload_3         
	//    6   11:aload_2         
	//    7   12:ldc1            #29  <String "ab_a*_a">
	//    8   14:invokestatic    #33  <Method String getActionFieldAtIndex(int, Bundle, String)>
	//    9   17:astore          5
		bundle1.putInt("appboy_action_index", i);
	//   10   19:aload           4
	//   11   21:ldc1            #35  <String "appboy_action_index">
	//   12   23:iload_3         
	//   13   24:invokevirtual   #39  <Method void Bundle.putInt(String, int)>
		bundle1.putString("appboy_action_type", ((String) (obj)));
	//   14   27:aload           4
	//   15   29:ldc1            #41  <String "appboy_action_type">
	//   16   31:aload           5
	//   17   33:invokevirtual   #45  <Method void Bundle.putString(String, String)>
		bundle1.putString("appboy_action_id", getActionFieldAtIndex(i, bundle, "ab_a*_id"));
	//   18   36:aload           4
	//   19   38:ldc1            #47  <String "appboy_action_id">
	//   20   40:iload_3         
	//   21   41:aload_2         
	//   22   42:ldc1            #49  <String "ab_a*_id">
	//   23   44:invokestatic    #33  <Method String getActionFieldAtIndex(int, Bundle, String)>
	//   24   47:invokevirtual   #45  <Method void Bundle.putString(String, String)>
		bundle1.putString("appboy_action_uri", getActionFieldAtIndex(i, bundle, "ab_a*_uri"));
	//   25   50:aload           4
	//   26   52:ldc1            #51  <String "appboy_action_uri">
	//   27   54:iload_3         
	//   28   55:aload_2         
	//   29   56:ldc1            #53  <String "ab_a*_uri">
	//   30   58:invokestatic    #33  <Method String getActionFieldAtIndex(int, Bundle, String)>
	//   31   61:invokevirtual   #45  <Method void Bundle.putString(String, String)>
		bundle1.putString("appboy_action_use_webview", getActionFieldAtIndex(i, bundle, "ab_a*_use_webview"));
	//   32   64:aload           4
	//   33   66:ldc1            #55  <String "appboy_action_use_webview">
	//   34   68:iload_3         
	//   35   69:aload_2         
	//   36   70:ldc1            #57  <String "ab_a*_use_webview">
	//   37   72:invokestatic    #33  <Method String getActionFieldAtIndex(int, Bundle, String)>
	//   38   75:invokevirtual   #45  <Method void Bundle.putString(String, String)>
		obj = ((Object) ((new Intent("com.appboy.action.APPBOY_ACTION_CLICKED")).setClass(context, com/appboy/push/AppboyNotificationRoutingActivity)));
	//   39   78:new             #59  <Class Intent>
	//   40   81:dup             
	//   41   82:ldc1            #61  <String "com.appboy.action.APPBOY_ACTION_CLICKED">
	//   42   84:invokespecial   #64  <Method void Intent(String)>
	//   43   87:aload_0         
	//   44   88:ldc1            #66  <Class AppboyNotificationRoutingActivity>
	//   45   90:invokevirtual   #70  <Method Intent Intent.setClass(Context, Class)>
	//   46   93:astore          5
		((Intent) (obj)).putExtras(bundle1);
	//   47   95:aload           5
	//   48   97:aload           4
	//   49   99:invokevirtual   #74  <Method Intent Intent.putExtras(Bundle)>
	//   50  102:pop             
		context = ((Context) (PendingIntent.getActivity(context, IntentUtils.getRequestCode(), ((Intent) (obj)), 0x8000000)));
	//   51  103:aload_0         
	//   52  104:invokestatic    #80  <Method int IntentUtils.getRequestCode()>
	//   53  107:aload           5
	//   54  109:ldc1            #81  <Int 0x8000000>
	//   55  111:invokestatic    #87  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   56  114:astore_0        
		context = ((Context) (new android.support.v4.app.NotificationCompat.Action.Builder(0, ((CharSequence) (getActionFieldAtIndex(i, bundle, "ab_a*_t"))), ((PendingIntent) (context)))));
	//   57  115:new             #89  <Class android.support.v4.app.NotificationCompat$Action$Builder>
	//   58  118:dup             
	//   59  119:iconst_0        
	//   60  120:iload_3         
	//   61  121:aload_2         
	//   62  122:ldc1            #91  <String "ab_a*_t">
	//   63  124:invokestatic    #33  <Method String getActionFieldAtIndex(int, Bundle, String)>
	//   64  127:aload_0         
	//   65  128:invokespecial   #94  <Method void android.support.v4.app.NotificationCompat$Action$Builder(int, CharSequence, PendingIntent)>
	//   66  131:astore_0        
		((android.support.v4.app.NotificationCompat.Action.Builder) (context)).addExtras(new Bundle(bundle1));
	//   67  132:aload_0         
	//   68  133:new             #24  <Class Bundle>
	//   69  136:dup             
	//   70  137:aload           4
	//   71  139:invokespecial   #27  <Method void Bundle(Bundle)>
	//   72  142:invokevirtual   #98  <Method android.support.v4.app.NotificationCompat$Action$Builder android.support.v4.app.NotificationCompat$Action$Builder.addExtras(Bundle)>
	//   73  145:pop             
		builder.addAction(((android.support.v4.app.NotificationCompat.Action.Builder) (context)).build());
	//   74  146:aload_1         
	//   75  147:aload_0         
	//   76  148:invokevirtual   #102 <Method android.support.v4.app.NotificationCompat$Action android.support.v4.app.NotificationCompat$Action$Builder.build()>
	//   77  151:invokevirtual   #108 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.addAction(android.support.v4.app.NotificationCompat$Action)>
	//   78  154:pop             
	//   79  155:return          
	}

	public static void addNotificationActions(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
	{
		if(bundle != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnonnull       56
_L1:
		int i;
		try
		{
			AppboyLogger.w(TAG, "Notification extras were null. Doing nothing.");
	//    2    4:getstatic       #16  <Field String TAG>
	//    3    7:ldc1            #114 <String "Notification extras were null. Doing nothing.">
	//    4    9:invokestatic    #118 <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		}
	//*   7   14:iload_3         
	//*   8   15:aload_2         
	//*   9   16:ldc1            #29  <String "ab_a*_a">
	//*  10   18:invokestatic    #33  <Method String getActionFieldAtIndex(int, Bundle, String)>
	//*  11   21:invokestatic    #124 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  12   24:ifne            51
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:aload_2         
	//*  16   30:iload_3         
	//*  17   31:invokestatic    #126 <Method void addNotificationAction(Context, android.support.v4.app.NotificationCompat$Builder, Bundle, int)>
	//*  18   34:iload_3         
	//*  19   35:iconst_1        
	//*  20   36:iadd            
	//*  21   37:istore_3        
	//*  22   38:goto            14
	//*  23   41:getstatic       #16  <Field String TAG>
	//*  24   44:ldc1            #128 <String "Caught exception while adding notification action buttons.">
	//*  25   46:aload_0         
	//*  26   47:invokestatic    #132 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  27   50:pop             
	//*  28   51:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			AppboyLogger.e(TAG, "Caught exception while adding notification action buttons.", ((Throwable) (context)));
		}
		  goto _L3
_L6:
		if(StringUtils.isNullOrBlank(getActionFieldAtIndex(i, bundle, "ab_a*_a"))) goto _L3; else goto _L4
_L4:
		addNotificationAction(context, builder, bundle, i);
		i++;
		continue; /* Loop/switch isn't completed */
_L3:
		return;
	//*  29   52:astore_0        
	//*  30   53:goto            41
_L2:
		i = 0;
	//   31   56:iconst_0        
	//   32   57:istore_3        
		if(true) goto _L6; else goto _L5
	//   33   58:goto            14
_L5:
	}

	public static String getActionFieldAtIndex(int i, Bundle bundle, String s)
	{
		return getActionFieldAtIndex(i, bundle, s, "");
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #134 <String "">
	//    4    5:invokestatic    #137 <Method String getActionFieldAtIndex(int, Bundle, String, String)>
	//    5    8:areturn         
	}

	public static String getActionFieldAtIndex(int i, Bundle bundle, String s, String s1)
	{
		bundle = ((Bundle) (bundle.getString(s.replace("*", ((CharSequence) (String.valueOf(i)))))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #139 <String "*">
	//    3    4:iload_0         
	//    4    5:invokestatic    #145 <Method String String.valueOf(int)>
	//    5    8:invokevirtual   #149 <Method String String.replace(CharSequence, CharSequence)>
	//    6   11:invokevirtual   #153 <Method String Bundle.getString(String)>
	//    7   14:astore_1        
		if(bundle == null)
	//*   8   15:aload_1         
	//*   9   16:ifnonnull       21
			return s1;
	//   10   19:aload_3         
	//   11   20:areturn         
		else
			return ((String) (bundle));
	//   12   21:aload_1         
	//   13   22:areturn         
	}

	public static void handleNotificationActionClicked(Context context, Intent intent)
	{
		String s;
		s = intent.getStringExtra("appboy_action_type");
	//    0    0:aload_1         
	//    1    1:ldc1            #41  <String "appboy_action_type">
	//    2    3:invokevirtual   #158 <Method String Intent.getStringExtra(String)>
	//    3    6:astore_3        
		if(StringUtils.isNullOrBlank(s))
	//*   4    7:aload_3         
	//*   5    8:invokestatic    #124 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   6   11:ifeq            24
		{
			AppboyLogger.w(TAG, "Notification action button type was blank or null. Doing nothing.");
	//    7   14:getstatic       #16  <Field String TAG>
	//    8   17:ldc1            #160 <String "Notification action button type was blank or null. Doing nothing.">
	//    9   19:invokestatic    #118 <Method int AppboyLogger.w(String, String)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
		int i;
		i = intent.getIntExtra("nid", -1);
	//   12   24:aload_1         
	//   13   25:ldc1            #162 <String "nid">
	//   14   27:iconst_m1       
	//   15   28:invokevirtual   #166 <Method int Intent.getIntExtra(String, int)>
	//   16   31:istore_2        
		logNotificationActionClicked(context, intent);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokestatic    #169 <Method void logNotificationActionClicked(Context, Intent)>
		if(s.equals("ab_uri") || s.equals("ab_open"))
	//*  20   37:aload_3         
	//*  21   38:ldc1            #171 <String "ab_uri">
	//*  22   40:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  23   43:ifne            83
	//*  24   46:aload_3         
	//*  25   47:ldc1            #177 <String "ab_open">
	//*  26   49:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  27   52:ifeq            58
			break MISSING_BLOCK_LABEL_83;
	//   28   55:goto            83
		if(s.equals("ab_none"))
	//*  29   58:aload_3         
	//*  30   59:ldc1            #179 <String "ab_none">
	//*  31   61:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  32   64:ifeq            73
		{
			AppboyNotificationUtils.cancelNotification(context, i);
	//   33   67:aload_0         
	//   34   68:iload_2         
	//   35   69:invokestatic    #185 <Method void AppboyNotificationUtils.cancelNotification(Context, int)>
			return;
	//   36   72:return          
		}
		try
		{
			AppboyLogger.w(TAG, "Unknown notification action button clicked. Doing nothing.");
	//   37   73:getstatic       #16  <Field String TAG>
	//   38   76:ldc1            #187 <String "Unknown notification action button clicked. Doing nothing.">
	//   39   78:invokestatic    #118 <Method int AppboyLogger.w(String, String)>
	//   40   81:pop             
			return;
	//   41   82:return          
		}
	//*  42   83:aload_0         
	//*  43   84:iload_2         
	//*  44   85:invokestatic    #185 <Method void AppboyNotificationUtils.cancelNotification(Context, int)>
	//*  45   88:aload_0         
	//*  46   89:new             #59  <Class Intent>
	//*  47   92:dup             
	//*  48   93:ldc1            #189 <String "android.intent.action.CLOSE_SYSTEM_DIALOGS">
	//*  49   95:invokespecial   #64  <Method void Intent(String)>
	//*  50   98:invokevirtual   #195 <Method void Context.sendBroadcast(Intent)>
	//*  51  101:aload_3         
	//*  52  102:ldc1            #171 <String "ab_uri">
	//*  53  104:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  54  107:ifeq            163
	//*  55  110:aload_1         
	//*  56  111:invokevirtual   #199 <Method Bundle Intent.getExtras()>
	//*  57  114:ldc1            #51  <String "appboy_action_uri">
	//*  58  116:invokevirtual   #202 <Method boolean Bundle.containsKey(String)>
	//*  59  119:ifeq            163
	//*  60  122:aload_1         
	//*  61  123:ldc1            #204 <String "uri">
	//*  62  125:aload_1         
	//*  63  126:ldc1            #51  <String "appboy_action_uri">
	//*  64  128:invokevirtual   #158 <Method String Intent.getStringExtra(String)>
	//*  65  131:invokevirtual   #208 <Method Intent Intent.putExtra(String, String)>
	//*  66  134:pop             
	//*  67  135:aload_1         
	//*  68  136:invokevirtual   #199 <Method Bundle Intent.getExtras()>
	//*  69  139:ldc1            #55  <String "appboy_action_use_webview">
	//*  70  141:invokevirtual   #202 <Method boolean Bundle.containsKey(String)>
	//*  71  144:ifeq            169
	//*  72  147:aload_1         
	//*  73  148:ldc1            #210 <String "ab_use_webview">
	//*  74  150:aload_1         
	//*  75  151:ldc1            #55  <String "appboy_action_use_webview">
	//*  76  153:invokevirtual   #158 <Method String Intent.getStringExtra(String)>
	//*  77  156:invokevirtual   #208 <Method Intent Intent.putExtra(String, String)>
	//*  78  159:pop             
	//*  79  160:goto            169
	//*  80  163:aload_1         
	//*  81  164:ldc1            #204 <String "uri">
	//*  82  166:invokevirtual   #213 <Method void Intent.removeExtra(String)>
	//*  83  169:aload_0         
	//*  84  170:aload_1         
	//*  85  171:invokestatic    #216 <Method void AppboyNotificationUtils.sendNotificationOpenedBroadcast(Context, Intent)>
	//*  86  174:new             #218 <Class AppboyConfigurationProvider>
	//*  87  177:dup             
	//*  88  178:aload_0         
	//*  89  179:invokespecial   #221 <Method void AppboyConfigurationProvider(Context)>
	//*  90  182:invokevirtual   #225 <Method boolean AppboyConfigurationProvider.getHandlePushDeepLinksAutomatically()>
	//*  91  185:ifeq            205
	//*  92  188:aload_0         
	//*  93  189:aload_1         
	//*  94  190:invokestatic    #228 <Method void AppboyNotificationUtils.routeUserWithNotificationOpenedIntent(Context, Intent)>
	//*  95  193:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  96  194:astore_0        
		{
			AppboyLogger.e(TAG, "Caught exception while handling notification action button click.", ((Throwable) (context)));
	//   97  195:getstatic       #16  <Field String TAG>
	//   98  198:ldc1            #230 <String "Caught exception while handling notification action button click.">
	//   99  200:aload_0         
	//  100  201:invokestatic    #132 <Method int AppboyLogger.e(String, String, Throwable)>
	//  101  204:pop             
		}
		break MISSING_BLOCK_LABEL_205;
		AppboyNotificationUtils.cancelNotification(context, i);
		context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
		if(s.equals("ab_uri") && intent.getExtras().containsKey("appboy_action_uri"))
		{
			intent.putExtra("uri", intent.getStringExtra("appboy_action_uri"));
			if(intent.getExtras().containsKey("appboy_action_use_webview"))
				intent.putExtra("ab_use_webview", intent.getStringExtra("appboy_action_use_webview"));
			break MISSING_BLOCK_LABEL_169;
		}
		intent.removeExtra("uri");
		AppboyNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
		if((new AppboyConfigurationProvider(context)).getHandlePushDeepLinksAutomatically())
		{
			AppboyNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
			return;
		}
	//  102  205:return          
	}

	private static void logNotificationActionClicked(Context context, Intent intent)
	{
		String s = intent.getStringExtra("cid");
	//    0    0:aload_1         
	//    1    1:ldc1            #232 <String "cid">
	//    2    3:invokevirtual   #158 <Method String Intent.getStringExtra(String)>
	//    3    6:astore_2        
		intent = ((Intent) (intent.getStringExtra("appboy_action_id")));
	//    4    7:aload_1         
	//    5    8:ldc1            #47  <String "appboy_action_id">
	//    6   10:invokevirtual   #158 <Method String Intent.getStringExtra(String)>
	//    7   13:astore_1        
		Appboy.getInstance(context).logPushNotificationActionClicked(s, ((String) (intent)));
	//    8   14:aload_0         
	//    9   15:invokestatic    #238 <Method Appboy Appboy.getInstance(Context)>
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #241 <Method void Appboy.logPushNotificationActionClicked(String, String)>
	//   13   23:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/push/AppboyNotificationActionUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyNotificationActionUtils>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String TAG>
	//*   3    8:return          
	}
}
