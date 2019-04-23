// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.configuration.AppboyConfig;
import com.appboy.support.AppboyLogger;
import org.json.JSONArray;

public class j
{

	public j(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		b = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #25  <String "com.appboy.override.configuration.cache">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #31  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   12:putfield        #33  <Field SharedPreferences b>
	//    8   15:return          
	}

	private static void a(android.content.SharedPreferences.Editor editor, String s, Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			editor.putBoolean(s, boolean1.booleanValue());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #40  <Method boolean Boolean.booleanValue()>
	//    7   11:invokeinterface #46  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   16:pop             
			return;
	//    9   17:return          
		}
	}

	private static void a(android.content.SharedPreferences.Editor editor, String s, Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			editor.putInt(s, integer.intValue());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #53  <Method int Integer.intValue()>
	//    7   11:invokeinterface #57  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    8   16:pop             
			return;
	//    9   17:return          
		}
	}

	private static void a(android.content.SharedPreferences.Editor editor, String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			editor.putString(s, s1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokeinterface #62  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    7   13:pop             
			return;
	//    8   14:return          
		}
	}

	public int a(String s, int i)
	{
		return b.getInt(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SharedPreferences b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #68  <Method int SharedPreferences.getInt(String, int)>
	//    5   11:ireturn         
	}

	public String a(String s, String s1)
	{
		return b.getString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SharedPreferences b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #72  <Method String SharedPreferences.getString(String, String)>
	//    5   11:areturn         
	}

	public void a()
	{
		AppboyLogger.d(a, "Clearing Braze Override configuration cache");
	//    0    0:getstatic       #18  <Field String a>
	//    1    3:ldc1            #74  <String "Clearing Braze Override configuration cache">
	//    2    5:invokestatic    #78  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		android.content.SharedPreferences.Editor editor = b.edit();
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field SharedPreferences b>
	//    6   13:invokeinterface #82  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   18:astore_1        
		editor.clear();
	//    8   19:aload_1         
	//    9   20:invokeinterface #85  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   10   25:pop             
		editor.apply();
	//   11   26:aload_1         
	//   12   27:invokeinterface #88  <Method void android.content.SharedPreferences$Editor.apply()>
	//   13   32:return          
	}

	void a(android.content.SharedPreferences.Editor editor, String s, Enum enum)
	{
		if(enum == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			a(editor, s, enum.toString());
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #96  <Method String Enum.toString()>
	//    7   11:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
			return;
	//    8   14:return          
		}
	}

	public void a(AppboyConfig appboyconfig)
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #18  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #102 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #103 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Setting Braze Override configuration with config: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #105 <String "Setting Braze Override configuration with config: ">
	//    8   15:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (appboyconfig)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #112 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #78  <Method int AppboyLogger.d(String, String)>
	//   18   33:pop             
		obj = ((Object) (b.edit()));
	//   19   34:aload_0         
	//   20   35:getfield        #33  <Field SharedPreferences b>
	//   21   38:invokeinterface #82  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   22   43:astore_2        
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_api_key", appboyconfig.getApiKey());
	//   23   44:aload_2         
	//   24   45:ldc1            #115 <String "com_appboy_api_key">
	//   25   47:aload_1         
	//   26   48:invokevirtual   #120 <Method String AppboyConfig.getApiKey()>
	//   27   51:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_server_target", appboyconfig.getServerTarget());
	//   28   54:aload_2         
	//   29   55:ldc1            #122 <String "com_appboy_server_target">
	//   30   57:aload_1         
	//   31   58:invokevirtual   #125 <Method String AppboyConfig.getServerTarget()>
	//   32   61:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_sdk_flavor", ((Enum) (appboyconfig.getSdkFlavor())));
	//   33   64:aload_0         
	//   34   65:aload_2         
	//   35   66:ldc1            #127 <String "com_appboy_sdk_flavor">
	//   36   68:aload_1         
	//   37   69:invokevirtual   #131 <Method com.appboy.enums.SdkFlavor AppboyConfig.getSdkFlavor()>
	//   38   72:invokevirtual   #133 <Method void a(android.content.SharedPreferences$Editor, String, Enum)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_enable_fresco_library_use", appboyconfig.getIsFrescoLibraryEnabled());
	//   39   75:aload_2         
	//   40   76:ldc1            #135 <String "com_appboy_enable_fresco_library_use">
	//   41   78:aload_1         
	//   42   79:invokevirtual   #139 <Method Boolean AppboyConfig.getIsFrescoLibraryEnabled()>
	//   43   82:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_newsfeed_unread_visual_indicator_on", appboyconfig.getIsNewsFeedVisualIndicatorOn());
	//   44   85:aload_2         
	//   45   86:ldc1            #143 <String "com_appboy_newsfeed_unread_visual_indicator_on">
	//   46   88:aload_1         
	//   47   89:invokevirtual   #146 <Method Boolean AppboyConfig.getIsNewsFeedVisualIndicatorOn()>
	//   48   92:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_push_gcm_sender_id", appboyconfig.getGcmSenderId());
	//   49   95:aload_2         
	//   50   96:ldc1            #148 <String "com_appboy_push_gcm_sender_id">
	//   51   98:aload_1         
	//   52   99:invokevirtual   #151 <Method String AppboyConfig.getGcmSenderId()>
	//   53  102:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_custom_endpoint", appboyconfig.getCustomEndpoint());
	//   54  105:aload_2         
	//   55  106:ldc1            #153 <String "com_appboy_custom_endpoint">
	//   56  108:aload_1         
	//   57  109:invokevirtual   #156 <Method String AppboyConfig.getCustomEndpoint()>
	//   58  112:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_push_small_notification_icon", appboyconfig.getSmallNotificationIcon());
	//   59  115:aload_2         
	//   60  116:ldc1            #158 <String "com_appboy_push_small_notification_icon">
	//   61  118:aload_1         
	//   62  119:invokevirtual   #161 <Method String AppboyConfig.getSmallNotificationIcon()>
	//   63  122:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_push_large_notification_icon", appboyconfig.getLargeNotificationIcon());
	//   64  125:aload_2         
	//   65  126:ldc1            #163 <String "com_appboy_push_large_notification_icon">
	//   66  128:aload_1         
	//   67  129:invokevirtual   #166 <Method String AppboyConfig.getLargeNotificationIcon()>
	//   68  132:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_session_timeout", appboyconfig.getSessionTimeout());
	//   69  135:aload_2         
	//   70  136:ldc1            #168 <String "com_appboy_session_timeout">
	//   71  138:aload_1         
	//   72  139:invokevirtual   #172 <Method Integer AppboyConfig.getSessionTimeout()>
	//   73  142:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_location_update_time_interval", appboyconfig.getLocationUpdateTimeIntervalSeconds());
	//   74  145:aload_2         
	//   75  146:ldc1            #176 <String "com_appboy_location_update_time_interval">
	//   76  148:aload_1         
	//   77  149:invokevirtual   #179 <Method Integer AppboyConfig.getLocationUpdateTimeIntervalSeconds()>
	//   78  152:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_default_notification_accent_color", appboyconfig.getDefaultNotificationAccentColor());
	//   79  155:aload_2         
	//   80  156:ldc1            #181 <String "com_appboy_default_notification_accent_color">
	//   81  158:aload_1         
	//   82  159:invokevirtual   #184 <Method Integer AppboyConfig.getDefaultNotificationAccentColor()>
	//   83  162:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_trigger_action_minimum_time_interval_seconds", appboyconfig.getTriggerActionMinimumTimeIntervalSeconds());
	//   84  165:aload_2         
	//   85  166:ldc1            #186 <String "com_appboy_trigger_action_minimum_time_interval_seconds">
	//   86  168:aload_1         
	//   87  169:invokevirtual   #189 <Method Integer AppboyConfig.getTriggerActionMinimumTimeIntervalSeconds()>
	//   88  172:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_push_gcm_messaging_registration_enabled", appboyconfig.getGcmMessagingRegistrationEnabled());
	//   89  175:aload_2         
	//   90  176:ldc1            #191 <String "com_appboy_push_gcm_messaging_registration_enabled">
	//   91  178:aload_1         
	//   92  179:invokevirtual   #194 <Method Boolean AppboyConfig.getGcmMessagingRegistrationEnabled()>
	//   93  182:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_push_adm_messaging_registration_enabled", appboyconfig.getAdmMessagingRegistrationEnabled());
	//   94  185:aload_2         
	//   95  186:ldc1            #196 <String "com_appboy_push_adm_messaging_registration_enabled">
	//   96  188:aload_1         
	//   97  189:invokevirtual   #199 <Method Boolean AppboyConfig.getAdmMessagingRegistrationEnabled()>
	//   98  192:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_handle_push_deep_links_automatically", appboyconfig.getHandlePushDeepLinksAutomatically());
	//   99  195:aload_2         
	//  100  196:ldc1            #201 <String "com_appboy_handle_push_deep_links_automatically">
	//  101  198:aload_1         
	//  102  199:invokevirtual   #204 <Method Boolean AppboyConfig.getHandlePushDeepLinksAutomatically()>
	//  103  202:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_notifications_enabled_tracking_on", appboyconfig.getNotificationsEnabledTrackingOn());
	//  104  205:aload_2         
	//  105  206:ldc1            #206 <String "com_appboy_notifications_enabled_tracking_on">
	//  106  208:aload_1         
	//  107  209:invokevirtual   #209 <Method Boolean AppboyConfig.getNotificationsEnabledTrackingOn()>
	//  108  212:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_disable_location_collection", appboyconfig.getDisableLocationCollection());
	//  109  215:aload_2         
	//  110  216:ldc1            #211 <String "com_appboy_disable_location_collection">
	//  111  218:aload_1         
	//  112  219:invokevirtual   #214 <Method Boolean AppboyConfig.getDisableLocationCollection()>
	//  113  222:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_enable_background_location_collection", appboyconfig.getEnableBackgroundLocationCollection());
	//  114  225:aload_2         
	//  115  226:ldc1            #216 <String "com_appboy_enable_background_location_collection">
	//  116  228:aload_1         
	//  117  229:invokevirtual   #219 <Method Boolean AppboyConfig.getEnableBackgroundLocationCollection()>
	//  118  232:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_location_update_distance", appboyconfig.getLocationUpdateDistance());
	//  119  235:aload_2         
	//  120  236:ldc1            #221 <String "com_appboy_location_update_distance">
	//  121  238:aload_1         
	//  122  239:invokevirtual   #224 <Method Integer AppboyConfig.getLocationUpdateDistance()>
	//  123  242:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_data_flush_interval_bad_network", appboyconfig.getBadNetworkDataFlushInterval());
	//  124  245:aload_2         
	//  125  246:ldc1            #226 <String "com_appboy_data_flush_interval_bad_network">
	//  126  248:aload_1         
	//  127  249:invokevirtual   #229 <Method Integer AppboyConfig.getBadNetworkDataFlushInterval()>
	//  128  252:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_data_flush_interval_good_network", appboyconfig.getGoodNetworkDataFlushInterval());
	//  129  255:aload_2         
	//  130  256:ldc1            #231 <String "com_appboy_data_flush_interval_good_network">
	//  131  258:aload_1         
	//  132  259:invokevirtual   #234 <Method Integer AppboyConfig.getGoodNetworkDataFlushInterval()>
	//  133  262:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_data_flush_interval_great_network", appboyconfig.getGreatNetworkDataFlushInterval());
	//  134  265:aload_2         
	//  135  266:ldc1            #236 <String "com_appboy_data_flush_interval_great_network">
	//  136  268:aload_1         
	//  137  269:invokevirtual   #239 <Method Integer AppboyConfig.getGreatNetworkDataFlushInterval()>
	//  138  272:invokestatic    #174 <Method void a(android.content.SharedPreferences$Editor, String, Integer)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_default_notification_channel_name", appboyconfig.getDefaultNotificationChannelName());
	//  139  275:aload_2         
	//  140  276:ldc1            #241 <String "com_appboy_default_notification_channel_name">
	//  141  278:aload_1         
	//  142  279:invokevirtual   #244 <Method String AppboyConfig.getDefaultNotificationChannelName()>
	//  143  282:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_default_notification_channel_description", appboyconfig.getDefaultNotificationChannelDescription());
	//  144  285:aload_2         
	//  145  286:ldc1            #246 <String "com_appboy_default_notification_channel_description">
	//  146  288:aload_1         
	//  147  289:invokevirtual   #249 <Method String AppboyConfig.getDefaultNotificationChannelDescription()>
	//  148  292:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_push_deep_link_back_stack_activity_enabled", appboyconfig.getPushDeepLinkBackStackActivityEnabled());
	//  149  295:aload_2         
	//  150  296:ldc1            #251 <String "com_appboy_push_deep_link_back_stack_activity_enabled">
	//  151  298:aload_1         
	//  152  299:invokevirtual   #254 <Method Boolean AppboyConfig.getPushDeepLinkBackStackActivityEnabled()>
	//  153  302:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_push_deep_link_back_stack_activity_class_name", appboyconfig.getPushDeepLinkBackStackActivityClassName());
	//  154  305:aload_2         
	//  155  306:ldc2            #256 <String "com_appboy_push_deep_link_back_stack_activity_class_name">
	//  156  309:aload_1         
	//  157  310:invokevirtual   #259 <Method String AppboyConfig.getPushDeepLinkBackStackActivityClassName()>
	//  158  313:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_session_start_based_timeout_enabled", appboyconfig.getIsSessionStartBasedTimeoutEnabled());
	//  159  316:aload_2         
	//  160  317:ldc2            #261 <String "com_appboy_session_start_based_timeout_enabled">
	//  161  320:aload_1         
	//  162  321:invokevirtual   #264 <Method Boolean AppboyConfig.getIsSessionStartBasedTimeoutEnabled()>
	//  163  324:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_firebase_cloud_messaging_registration_enabled", appboyconfig.getIsFirebaseCloudMessagingRegistrationEnabled());
	//  164  327:aload_2         
	//  165  328:ldc2            #266 <String "com_appboy_firebase_cloud_messaging_registration_enabled">
	//  166  331:aload_1         
	//  167  332:invokevirtual   #269 <Method Boolean AppboyConfig.getIsFirebaseCloudMessagingRegistrationEnabled()>
	//  168  335:invokestatic    #141 <Method void a(android.content.SharedPreferences$Editor, String, Boolean)>
		a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_firebase_cloud_messaging_sender_id", appboyconfig.getFirebaseCloudMessagingSenderIdKey());
	//  169  338:aload_2         
	//  170  339:ldc2            #271 <String "com_appboy_firebase_cloud_messaging_sender_id">
	//  171  342:aload_1         
	//  172  343:invokevirtual   #274 <Method String AppboyConfig.getFirebaseCloudMessagingSenderIdKey()>
	//  173  346:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		if(appboyconfig.getLocaleToApiMapping() != null)
	//* 174  349:aload_1         
	//* 175  350:invokevirtual   #278 <Method java.util.List AppboyConfig.getLocaleToApiMapping()>
	//* 176  353:ifnull          377
			a(((android.content.SharedPreferences.Editor) (obj)), "com_appboy_locale_api_key_map", (new JSONArray(((java.util.Collection) (appboyconfig.getLocaleToApiMapping())))).toString());
	//  177  356:aload_2         
	//  178  357:ldc2            #280 <String "com_appboy_locale_api_key_map">
	//  179  360:new             #282 <Class JSONArray>
	//  180  363:dup             
	//  181  364:aload_1         
	//  182  365:invokevirtual   #278 <Method java.util.List AppboyConfig.getLocaleToApiMapping()>
	//  183  368:invokespecial   #285 <Method void JSONArray(java.util.Collection)>
	//  184  371:invokevirtual   #286 <Method String JSONArray.toString()>
	//  185  374:invokestatic    #98  <Method void a(android.content.SharedPreferences$Editor, String, String)>
		((android.content.SharedPreferences.Editor) (obj)).apply();
	//  186  377:aload_2         
	//  187  378:invokeinterface #88  <Method void android.content.SharedPreferences$Editor.apply()>
	//  188  383:return          
	}

	public boolean a(String s)
	{
		return b.contains(s);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SharedPreferences b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #290 <Method boolean SharedPreferences.contains(String)>
	//    4   10:ireturn         
	}

	public boolean a(String s, boolean flag)
	{
		return b.getBoolean(s, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SharedPreferences b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #294 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   11:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/j);
	private final SharedPreferences b;

	static 
	{
	//    0    0:ldc1            #2   <Class j>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String a>
	//*   3    8:return          
	}
}
