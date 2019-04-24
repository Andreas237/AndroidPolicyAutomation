// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			SettingsJsonTransform, AnalyticsSettingsData, AppSettingsData, BetaSettingsData, 
//			SettingsJsonConstants, FeaturesSettingsData, AppIconSettingsData, PromptSettingsData, 
//			SessionSettingsData, SettingsData

class DefaultSettingsJsonTransform
	implements SettingsJsonTransform
{

	DefaultSettingsJsonTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private AnalyticsSettingsData buildAnalyticsSessionDataFrom(JSONObject jsonobject)
	{
		return new AnalyticsSettingsData(jsonobject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jsonobject.optInt("flush_interval_secs", 600), jsonobject.optInt("max_byte_size_per_file", 8000), jsonobject.optInt("max_file_count_per_send", 1), jsonobject.optInt("max_pending_send_file_count", 100), jsonobject.optBoolean("track_custom_events", true), jsonobject.optBoolean("track_predefined_events", true), jsonobject.optInt("sampling_rate", 1), jsonobject.optBoolean("flush_on_background", true));
	//    0    0:new             #15  <Class AnalyticsSettingsData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #17  <String "url">
	//    4    7:ldc1            #19  <String "https://e.crashlytics.com/spi/v2/events">
	//    5    9:invokevirtual   #25  <Method String JSONObject.optString(String, String)>
	//    6   12:aload_1         
	//    7   13:ldc1            #27  <String "flush_interval_secs">
	//    8   15:sipush          600
	//    9   18:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   10   21:aload_1         
	//   11   22:ldc1            #33  <String "max_byte_size_per_file">
	//   12   24:sipush          8000
	//   13   27:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   14   30:aload_1         
	//   15   31:ldc1            #35  <String "max_file_count_per_send">
	//   16   33:iconst_1        
	//   17   34:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   18   37:aload_1         
	//   19   38:ldc1            #37  <String "max_pending_send_file_count">
	//   20   40:bipush          100
	//   21   42:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   22   45:aload_1         
	//   23   46:ldc1            #39  <String "track_custom_events">
	//   24   48:iconst_1        
	//   25   49:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   26   52:aload_1         
	//   27   53:ldc1            #45  <String "track_predefined_events">
	//   28   55:iconst_1        
	//   29   56:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   30   59:aload_1         
	//   31   60:ldc1            #47  <String "sampling_rate">
	//   32   62:iconst_1        
	//   33   63:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   34   66:aload_1         
	//   35   67:ldc1            #49  <String "flush_on_background">
	//   36   69:iconst_1        
	//   37   70:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   38   73:invokespecial   #52  <Method void AnalyticsSettingsData(String, int, int, int, int, boolean, boolean, int, boolean)>
	//   39   76:areturn         
	}

	private AppSettingsData buildAppDataFrom(JSONObject jsonobject)
		throws JSONException
	{
		String s = jsonobject.getString("identifier");
	//    0    0:aload_1         
	//    1    1:ldc1            #58  <String "identifier">
	//    2    3:invokevirtual   #62  <Method String JSONObject.getString(String)>
	//    3    6:astore          5
		String s1 = jsonobject.getString("status");
	//    4    8:aload_1         
	//    5    9:ldc1            #64  <String "status">
	//    6   11:invokevirtual   #62  <Method String JSONObject.getString(String)>
	//    7   14:astore          6
		String s2 = jsonobject.getString("url");
	//    8   16:aload_1         
	//    9   17:ldc1            #17  <String "url">
	//   10   19:invokevirtual   #62  <Method String JSONObject.getString(String)>
	//   11   22:astore          7
		String s3 = jsonobject.getString("reports_url");
	//   12   24:aload_1         
	//   13   25:ldc1            #66  <String "reports_url">
	//   14   27:invokevirtual   #62  <Method String JSONObject.getString(String)>
	//   15   30:astore          8
		boolean flag = jsonobject.optBoolean("update_required", false);
	//   16   32:aload_1         
	//   17   33:ldc1            #68  <String "update_required">
	//   18   35:iconst_0        
	//   19   36:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   20   39:istore_2        
		Object obj = null;
	//   21   40:aconst_null     
	//   22   41:astore          4
		AppIconSettingsData appiconsettingsdata = ((AppIconSettingsData) (obj));
	//   23   43:aload           4
	//   24   45:astore_3        
		if(jsonobject.has("icon"))
	//*  25   46:aload_1         
	//*  26   47:ldc1            #70  <String "icon">
	//*  27   49:invokevirtual   #74  <Method boolean JSONObject.has(String)>
	//*  28   52:ifeq            83
		{
			appiconsettingsdata = ((AppIconSettingsData) (obj));
	//   29   55:aload           4
	//   30   57:astore_3        
			if(jsonobject.getJSONObject("icon").has("hash"))
	//*  31   58:aload_1         
	//*  32   59:ldc1            #70  <String "icon">
	//*  33   61:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//*  34   64:ldc1            #80  <String "hash">
	//*  35   66:invokevirtual   #74  <Method boolean JSONObject.has(String)>
	//*  36   69:ifeq            83
				appiconsettingsdata = buildIconDataFrom(jsonobject.getJSONObject("icon"));
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:ldc1            #70  <String "icon">
	//   40   76:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//   41   79:invokespecial   #84  <Method AppIconSettingsData buildIconDataFrom(JSONObject)>
	//   42   82:astore_3        
		}
		return new AppSettingsData(s, s1, s2, s3, flag, appiconsettingsdata);
	//   43   83:new             #86  <Class AppSettingsData>
	//   44   86:dup             
	//   45   87:aload           5
	//   46   89:aload           6
	//   47   91:aload           7
	//   48   93:aload           8
	//   49   95:iload_2         
	//   50   96:aload_3         
	//   51   97:invokespecial   #89  <Method void AppSettingsData(String, String, String, String, boolean, AppIconSettingsData)>
	//   52  100:areturn         
	}

	private BetaSettingsData buildBetaSettingsDataFrom(JSONObject jsonobject)
		throws JSONException
	{
		return new BetaSettingsData(jsonobject.optString("update_endpoint", SettingsJsonConstants.BETA_UPDATE_ENDPOINT_DEFAULT), jsonobject.optInt("update_suspend_duration", 3600));
	//    0    0:new             #94  <Class BetaSettingsData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #96  <String "update_endpoint">
	//    4    7:getstatic       #102 <Field String SettingsJsonConstants.BETA_UPDATE_ENDPOINT_DEFAULT>
	//    5   10:invokevirtual   #25  <Method String JSONObject.optString(String, String)>
	//    6   13:aload_1         
	//    7   14:ldc1            #104 <String "update_suspend_duration">
	//    8   16:sipush          3600
	//    9   19:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   10   22:invokespecial   #107 <Method void BetaSettingsData(String, int)>
	//   11   25:areturn         
	}

	private FeaturesSettingsData buildFeaturesSessionDataFrom(JSONObject jsonobject)
	{
		return new FeaturesSettingsData(jsonobject.optBoolean("prompt_enabled", false), jsonobject.optBoolean("collect_logged_exceptions", true), jsonobject.optBoolean("collect_reports", true), jsonobject.optBoolean("collect_analytics", false));
	//    0    0:new             #111 <Class FeaturesSettingsData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #113 <String "prompt_enabled">
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//    6   11:aload_1         
	//    7   12:ldc1            #115 <String "collect_logged_exceptions">
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   10   18:aload_1         
	//   11   19:ldc1            #117 <String "collect_reports">
	//   12   21:iconst_1        
	//   13   22:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   14   25:aload_1         
	//   15   26:ldc1            #119 <String "collect_analytics">
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   18   32:invokespecial   #122 <Method void FeaturesSettingsData(boolean, boolean, boolean, boolean)>
	//   19   35:areturn         
	}

	private AppIconSettingsData buildIconDataFrom(JSONObject jsonobject)
		throws JSONException
	{
		return new AppIconSettingsData(jsonobject.getString("hash"), jsonobject.getInt("width"), jsonobject.getInt("height"));
	//    0    0:new             #124 <Class AppIconSettingsData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #80  <String "hash">
	//    4    7:invokevirtual   #62  <Method String JSONObject.getString(String)>
	//    5   10:aload_1         
	//    6   11:ldc1            #126 <String "width">
	//    7   13:invokevirtual   #130 <Method int JSONObject.getInt(String)>
	//    8   16:aload_1         
	//    9   17:ldc1            #132 <String "height">
	//   10   19:invokevirtual   #130 <Method int JSONObject.getInt(String)>
	//   11   22:invokespecial   #135 <Method void AppIconSettingsData(String, int, int)>
	//   12   25:areturn         
	}

	private PromptSettingsData buildPromptDataFrom(JSONObject jsonobject)
		throws JSONException
	{
		return new PromptSettingsData(jsonobject.optString("title", "Send Crash Report?"), jsonobject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jsonobject.optString("send_button_title", "Send"), jsonobject.optBoolean("show_cancel_button", true), jsonobject.optString("cancel_button_title", "Don't Send"), jsonobject.optBoolean("show_always_send_button", true), jsonobject.optString("always_send_button_title", "Always Send"));
	//    0    0:new             #139 <Class PromptSettingsData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #141 <String "title">
	//    4    7:ldc1            #143 <String "Send Crash Report?">
	//    5    9:invokevirtual   #25  <Method String JSONObject.optString(String, String)>
	//    6   12:aload_1         
	//    7   13:ldc1            #145 <String "message">
	//    8   15:ldc1            #147 <String "Looks like we crashed! Please help us fix the problem by sending a crash report.">
	//    9   17:invokevirtual   #25  <Method String JSONObject.optString(String, String)>
	//   10   20:aload_1         
	//   11   21:ldc1            #149 <String "send_button_title">
	//   12   23:ldc1            #151 <String "Send">
	//   13   25:invokevirtual   #25  <Method String JSONObject.optString(String, String)>
	//   14   28:aload_1         
	//   15   29:ldc1            #153 <String "show_cancel_button">
	//   16   31:iconst_1        
	//   17   32:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   18   35:aload_1         
	//   19   36:ldc1            #155 <String "cancel_button_title">
	//   20   38:ldc1            #157 <String "Don't Send">
	//   21   40:invokevirtual   #25  <Method String JSONObject.optString(String, String)>
	//   22   43:aload_1         
	//   23   44:ldc1            #159 <String "show_always_send_button">
	//   24   46:iconst_1        
	//   25   47:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   26   50:aload_1         
	//   27   51:ldc1            #161 <String "always_send_button_title">
	//   28   53:ldc1            #163 <String "Always Send">
	//   29   55:invokevirtual   #25  <Method String JSONObject.optString(String, String)>
	//   30   58:invokespecial   #166 <Method void PromptSettingsData(String, String, String, boolean, String, boolean, String)>
	//   31   61:areturn         
	}

	private SessionSettingsData buildSessionDataFrom(JSONObject jsonobject)
		throws JSONException
	{
		return new SessionSettingsData(jsonobject.optInt("log_buffer_size", 64000), jsonobject.optInt("max_chained_exception_depth", 8), jsonobject.optInt("max_custom_exception_events", 64), jsonobject.optInt("max_custom_key_value_pairs", 64), jsonobject.optInt("identifier_mask", 255), jsonobject.optBoolean("send_session_without_crash", false));
	//    0    0:new             #170 <Class SessionSettingsData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #172 <String "log_buffer_size">
	//    4    7:ldc1            #173 <Int 64000>
	//    5    9:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//    6   12:aload_1         
	//    7   13:ldc1            #175 <String "max_chained_exception_depth">
	//    8   15:bipush          8
	//    9   17:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   10   20:aload_1         
	//   11   21:ldc1            #177 <String "max_custom_exception_events">
	//   12   23:bipush          64
	//   13   25:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   14   28:aload_1         
	//   15   29:ldc1            #179 <String "max_custom_key_value_pairs">
	//   16   31:bipush          64
	//   17   33:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   18   36:aload_1         
	//   19   37:ldc1            #181 <String "identifier_mask">
	//   20   39:sipush          255
	//   21   42:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//   22   45:aload_1         
	//   23   46:ldc1            #183 <String "send_session_without_crash">
	//   24   48:iconst_0        
	//   25   49:invokevirtual   #43  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   26   52:invokespecial   #186 <Method void SessionSettingsData(int, int, int, int, int, boolean)>
	//   27   55:areturn         
	}

	private long getExpiresAtFrom(CurrentTimeProvider currenttimeprovider, long l, JSONObject jsonobject)
		throws JSONException
	{
		if(jsonobject.has("expires_at"))
	//*   0    0:aload           4
	//*   1    2:ldc1            #190 <String "expires_at">
	//*   2    4:invokevirtual   #74  <Method boolean JSONObject.has(String)>
	//*   3    7:ifeq            18
			return jsonobject.getLong("expires_at");
	//    4   10:aload           4
	//    5   12:ldc1            #190 <String "expires_at">
	//    6   14:invokevirtual   #194 <Method long JSONObject.getLong(String)>
	//    7   17:lreturn         
		else
			return currenttimeprovider.getCurrentTimeMillis() + 1000L * l;
	//    8   18:aload_1         
	//    9   19:invokeinterface #200 <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   10   24:ldc2w           #201 <Long 1000L>
	//   11   27:lload_2         
	//   12   28:lmul            
	//   13   29:ladd            
	//   14   30:lreturn         
	}

	private JSONObject toAnalyticsJson(AnalyticsSettingsData analyticssettingsdata)
		throws JSONException
	{
		return (new JSONObject()).put("url", ((Object) (analyticssettingsdata.analyticsURL))).put("flush_interval_secs", analyticssettingsdata.flushIntervalSeconds).put("max_byte_size_per_file", analyticssettingsdata.maxByteSizePerFile).put("max_file_count_per_send", analyticssettingsdata.maxFileCountPerSend).put("max_pending_send_file_count", analyticssettingsdata.maxPendingSendFileCount);
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #17  <String "url">
	//    4    9:aload_1         
	//    5   10:getfield        #208 <Field String AnalyticsSettingsData.analyticsURL>
	//    6   13:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//    7   16:ldc1            #27  <String "flush_interval_secs">
	//    8   18:aload_1         
	//    9   19:getfield        #216 <Field int AnalyticsSettingsData.flushIntervalSeconds>
	//   10   22:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   11   25:ldc1            #33  <String "max_byte_size_per_file">
	//   12   27:aload_1         
	//   13   28:getfield        #222 <Field int AnalyticsSettingsData.maxByteSizePerFile>
	//   14   31:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   15   34:ldc1            #35  <String "max_file_count_per_send">
	//   16   36:aload_1         
	//   17   37:getfield        #225 <Field int AnalyticsSettingsData.maxFileCountPerSend>
	//   18   40:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   19   43:ldc1            #37  <String "max_pending_send_file_count">
	//   20   45:aload_1         
	//   21   46:getfield        #228 <Field int AnalyticsSettingsData.maxPendingSendFileCount>
	//   22   49:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   23   52:areturn         
	}

	private JSONObject toAppJson(AppSettingsData appsettingsdata)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("identifier", ((Object) (appsettingsdata.identifier))).put("status", ((Object) (appsettingsdata.status))).put("url", ((Object) (appsettingsdata.url))).put("reports_url", ((Object) (appsettingsdata.reportsUrl))).put("update_required", appsettingsdata.updateRequired);
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #58  <String "identifier">
	//    4    9:aload_1         
	//    5   10:getfield        #232 <Field String AppSettingsData.identifier>
	//    6   13:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//    7   16:ldc1            #64  <String "status">
	//    8   18:aload_1         
	//    9   19:getfield        #234 <Field String AppSettingsData.status>
	//   10   22:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   11   25:ldc1            #17  <String "url">
	//   12   27:aload_1         
	//   13   28:getfield        #236 <Field String AppSettingsData.url>
	//   14   31:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   15   34:ldc1            #66  <String "reports_url">
	//   16   36:aload_1         
	//   17   37:getfield        #239 <Field String AppSettingsData.reportsUrl>
	//   18   40:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   19   43:ldc1            #68  <String "update_required">
	//   20   45:aload_1         
	//   21   46:getfield        #243 <Field boolean AppSettingsData.updateRequired>
	//   22   49:invokevirtual   #246 <Method JSONObject JSONObject.put(String, boolean)>
	//   23   52:astore_2        
		if(appsettingsdata.icon != null)
	//*  24   53:aload_1         
	//*  25   54:getfield        #249 <Field AppIconSettingsData AppSettingsData.icon>
	//*  26   57:ifnull          75
			jsonobject.put("icon", ((Object) (toIconJson(appsettingsdata.icon))));
	//   27   60:aload_2         
	//   28   61:ldc1            #70  <String "icon">
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:getfield        #249 <Field AppIconSettingsData AppSettingsData.icon>
	//   32   68:invokespecial   #253 <Method JSONObject toIconJson(AppIconSettingsData)>
	//   33   71:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   34   74:pop             
		return jsonobject;
	//   35   75:aload_2         
	//   36   76:areturn         
	}

	private JSONObject toBetaJson(BetaSettingsData betasettingsdata)
		throws JSONException
	{
		return (new JSONObject()).put("update_endpoint", ((Object) (betasettingsdata.updateUrl))).put("update_suspend_duration", betasettingsdata.updateSuspendDurationSeconds);
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #96  <String "update_endpoint">
	//    4    9:aload_1         
	//    5   10:getfield        #258 <Field String BetaSettingsData.updateUrl>
	//    6   13:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//    7   16:ldc1            #104 <String "update_suspend_duration">
	//    8   18:aload_1         
	//    9   19:getfield        #261 <Field int BetaSettingsData.updateSuspendDurationSeconds>
	//   10   22:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   11   25:areturn         
	}

	private JSONObject toFeaturesJson(FeaturesSettingsData featuressettingsdata)
		throws JSONException
	{
		return (new JSONObject()).put("collect_logged_exceptions", featuressettingsdata.collectLoggedException).put("collect_reports", featuressettingsdata.collectReports).put("collect_analytics", featuressettingsdata.collectAnalytics);
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #115 <String "collect_logged_exceptions">
	//    4    9:aload_1         
	//    5   10:getfield        #266 <Field boolean FeaturesSettingsData.collectLoggedException>
	//    6   13:invokevirtual   #246 <Method JSONObject JSONObject.put(String, boolean)>
	//    7   16:ldc1            #117 <String "collect_reports">
	//    8   18:aload_1         
	//    9   19:getfield        #269 <Field boolean FeaturesSettingsData.collectReports>
	//   10   22:invokevirtual   #246 <Method JSONObject JSONObject.put(String, boolean)>
	//   11   25:ldc1            #119 <String "collect_analytics">
	//   12   27:aload_1         
	//   13   28:getfield        #272 <Field boolean FeaturesSettingsData.collectAnalytics>
	//   14   31:invokevirtual   #246 <Method JSONObject JSONObject.put(String, boolean)>
	//   15   34:areturn         
	}

	private JSONObject toIconJson(AppIconSettingsData appiconsettingsdata)
		throws JSONException
	{
		return (new JSONObject()).put("hash", ((Object) (appiconsettingsdata.hash))).put("width", appiconsettingsdata.width).put("height", appiconsettingsdata.height);
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #80  <String "hash">
	//    4    9:aload_1         
	//    5   10:getfield        #274 <Field String AppIconSettingsData.hash>
	//    6   13:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//    7   16:ldc1            #126 <String "width">
	//    8   18:aload_1         
	//    9   19:getfield        #276 <Field int AppIconSettingsData.width>
	//   10   22:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   11   25:ldc1            #132 <String "height">
	//   12   27:aload_1         
	//   13   28:getfield        #278 <Field int AppIconSettingsData.height>
	//   14   31:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   15   34:areturn         
	}

	private JSONObject toPromptJson(PromptSettingsData promptsettingsdata)
		throws JSONException
	{
		return (new JSONObject()).put("title", ((Object) (promptsettingsdata.title))).put("message", ((Object) (promptsettingsdata.message))).put("send_button_title", ((Object) (promptsettingsdata.sendButtonTitle))).put("show_cancel_button", promptsettingsdata.showCancelButton).put("cancel_button_title", ((Object) (promptsettingsdata.cancelButtonTitle))).put("show_always_send_button", promptsettingsdata.showAlwaysSendButton).put("always_send_button_title", ((Object) (promptsettingsdata.alwaysSendButtonTitle)));
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #141 <String "title">
	//    4    9:aload_1         
	//    5   10:getfield        #282 <Field String PromptSettingsData.title>
	//    6   13:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//    7   16:ldc1            #145 <String "message">
	//    8   18:aload_1         
	//    9   19:getfield        #284 <Field String PromptSettingsData.message>
	//   10   22:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   11   25:ldc1            #149 <String "send_button_title">
	//   12   27:aload_1         
	//   13   28:getfield        #287 <Field String PromptSettingsData.sendButtonTitle>
	//   14   31:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   15   34:ldc1            #153 <String "show_cancel_button">
	//   16   36:aload_1         
	//   17   37:getfield        #290 <Field boolean PromptSettingsData.showCancelButton>
	//   18   40:invokevirtual   #246 <Method JSONObject JSONObject.put(String, boolean)>
	//   19   43:ldc1            #155 <String "cancel_button_title">
	//   20   45:aload_1         
	//   21   46:getfield        #293 <Field String PromptSettingsData.cancelButtonTitle>
	//   22   49:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   23   52:ldc1            #159 <String "show_always_send_button">
	//   24   54:aload_1         
	//   25   55:getfield        #296 <Field boolean PromptSettingsData.showAlwaysSendButton>
	//   26   58:invokevirtual   #246 <Method JSONObject JSONObject.put(String, boolean)>
	//   27   61:ldc1            #161 <String "always_send_button_title">
	//   28   63:aload_1         
	//   29   64:getfield        #299 <Field String PromptSettingsData.alwaysSendButtonTitle>
	//   30   67:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   31   70:areturn         
	}

	private JSONObject toSessionJson(SessionSettingsData sessionsettingsdata)
		throws JSONException
	{
		return (new JSONObject()).put("log_buffer_size", sessionsettingsdata.logBufferSize).put("max_chained_exception_depth", sessionsettingsdata.maxChainedExceptionDepth).put("max_custom_exception_events", sessionsettingsdata.maxCustomExceptionEvents).put("max_custom_key_value_pairs", sessionsettingsdata.maxCustomKeyValuePairs).put("identifier_mask", sessionsettingsdata.identifierMask).put("send_session_without_crash", sessionsettingsdata.sendSessionWithoutCrash);
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #172 <String "log_buffer_size">
	//    4    9:aload_1         
	//    5   10:getfield        #304 <Field int SessionSettingsData.logBufferSize>
	//    6   13:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//    7   16:ldc1            #175 <String "max_chained_exception_depth">
	//    8   18:aload_1         
	//    9   19:getfield        #307 <Field int SessionSettingsData.maxChainedExceptionDepth>
	//   10   22:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   11   25:ldc1            #177 <String "max_custom_exception_events">
	//   12   27:aload_1         
	//   13   28:getfield        #310 <Field int SessionSettingsData.maxCustomExceptionEvents>
	//   14   31:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   15   34:ldc1            #179 <String "max_custom_key_value_pairs">
	//   16   36:aload_1         
	//   17   37:getfield        #313 <Field int SessionSettingsData.maxCustomKeyValuePairs>
	//   18   40:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   19   43:ldc1            #181 <String "identifier_mask">
	//   20   45:aload_1         
	//   21   46:getfield        #316 <Field int SessionSettingsData.identifierMask>
	//   22   49:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   23   52:ldc1            #183 <String "send_session_without_crash">
	//   24   54:aload_1         
	//   25   55:getfield        #319 <Field boolean SessionSettingsData.sendSessionWithoutCrash>
	//   26   58:invokevirtual   #246 <Method JSONObject JSONObject.put(String, boolean)>
	//   27   61:areturn         
	}

	public SettingsData buildFromJson(CurrentTimeProvider currenttimeprovider, JSONObject jsonobject)
		throws JSONException
	{
		int i = jsonobject.optInt("settings_version", 0);
	//    0    0:aload_2         
	//    1    1:ldc2            #323 <String "settings_version">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//    4    8:istore_3        
		int j = jsonobject.optInt("cache_duration", 3600);
	//    5    9:aload_2         
	//    6   10:ldc2            #325 <String "cache_duration">
	//    7   13:sipush          3600
	//    8   16:invokevirtual   #31  <Method int JSONObject.optInt(String, int)>
	//    9   19:istore          4
		AppSettingsData appsettingsdata = buildAppDataFrom(jsonobject.getJSONObject("app"));
	//   10   21:aload_0         
	//   11   22:aload_2         
	//   12   23:ldc2            #327 <String "app">
	//   13   26:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//   14   29:invokespecial   #329 <Method AppSettingsData buildAppDataFrom(JSONObject)>
	//   15   32:astore          5
		SessionSettingsData sessionsettingsdata = buildSessionDataFrom(jsonobject.getJSONObject("session"));
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:ldc2            #331 <String "session">
	//   19   39:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//   20   42:invokespecial   #333 <Method SessionSettingsData buildSessionDataFrom(JSONObject)>
	//   21   45:astore          6
		PromptSettingsData promptsettingsdata = buildPromptDataFrom(jsonobject.getJSONObject("prompt"));
	//   22   47:aload_0         
	//   23   48:aload_2         
	//   24   49:ldc2            #335 <String "prompt">
	//   25   52:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//   26   55:invokespecial   #337 <Method PromptSettingsData buildPromptDataFrom(JSONObject)>
	//   27   58:astore          7
		FeaturesSettingsData featuressettingsdata = buildFeaturesSessionDataFrom(jsonobject.getJSONObject("features"));
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:ldc2            #339 <String "features">
	//   31   65:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//   32   68:invokespecial   #341 <Method FeaturesSettingsData buildFeaturesSessionDataFrom(JSONObject)>
	//   33   71:astore          8
		AnalyticsSettingsData analyticssettingsdata = buildAnalyticsSessionDataFrom(jsonobject.getJSONObject("analytics"));
	//   34   73:aload_0         
	//   35   74:aload_2         
	//   36   75:ldc2            #343 <String "analytics">
	//   37   78:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//   38   81:invokespecial   #345 <Method AnalyticsSettingsData buildAnalyticsSessionDataFrom(JSONObject)>
	//   39   84:astore          9
		BetaSettingsData betasettingsdata = buildBetaSettingsDataFrom(jsonobject.getJSONObject("beta"));
	//   40   86:aload_0         
	//   41   87:aload_2         
	//   42   88:ldc2            #347 <String "beta">
	//   43   91:invokevirtual   #78  <Method JSONObject JSONObject.getJSONObject(String)>
	//   44   94:invokespecial   #349 <Method BetaSettingsData buildBetaSettingsDataFrom(JSONObject)>
	//   45   97:astore          10
		return new SettingsData(getExpiresAtFrom(currenttimeprovider, j, jsonobject), appsettingsdata, sessionsettingsdata, promptsettingsdata, featuressettingsdata, analyticssettingsdata, betasettingsdata, i, j);
	//   46   99:new             #351 <Class SettingsData>
	//   47  102:dup             
	//   48  103:aload_0         
	//   49  104:aload_1         
	//   50  105:iload           4
	//   51  107:i2l             
	//   52  108:aload_2         
	//   53  109:invokespecial   #353 <Method long getExpiresAtFrom(CurrentTimeProvider, long, JSONObject)>
	//   54  112:aload           5
	//   55  114:aload           6
	//   56  116:aload           7
	//   57  118:aload           8
	//   58  120:aload           9
	//   59  122:aload           10
	//   60  124:iload_3         
	//   61  125:iload           4
	//   62  127:invokespecial   #356 <Method void SettingsData(long, AppSettingsData, SessionSettingsData, PromptSettingsData, FeaturesSettingsData, AnalyticsSettingsData, BetaSettingsData, int, int)>
	//   63  130:areturn         
	}

	public JSONObject toJson(SettingsData settingsdata)
		throws JSONException
	{
		return (new JSONObject()).put("expires_at", settingsdata.expiresAtMillis).put("cache_duration", settingsdata.cacheDuration).put("settings_version", settingsdata.settingsVersion).put("features", ((Object) (toFeaturesJson(settingsdata.featuresData)))).put("analytics", ((Object) (toAnalyticsJson(settingsdata.analyticsSettingsData)))).put("beta", ((Object) (toBetaJson(settingsdata.betaSettingsData)))).put("app", ((Object) (toAppJson(settingsdata.appData)))).put("session", ((Object) (toSessionJson(settingsdata.sessionData)))).put("prompt", ((Object) (toPromptJson(settingsdata.promptData))));
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void JSONObject()>
	//    3    7:ldc1            #190 <String "expires_at">
	//    4    9:aload_1         
	//    5   10:getfield        #362 <Field long SettingsData.expiresAtMillis>
	//    6   13:invokevirtual   #365 <Method JSONObject JSONObject.put(String, long)>
	//    7   16:ldc2            #325 <String "cache_duration">
	//    8   19:aload_1         
	//    9   20:getfield        #368 <Field int SettingsData.cacheDuration>
	//   10   23:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   11   26:ldc2            #323 <String "settings_version">
	//   12   29:aload_1         
	//   13   30:getfield        #371 <Field int SettingsData.settingsVersion>
	//   14   33:invokevirtual   #219 <Method JSONObject JSONObject.put(String, int)>
	//   15   36:ldc2            #339 <String "features">
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:getfield        #375 <Field FeaturesSettingsData SettingsData.featuresData>
	//   19   44:invokespecial   #377 <Method JSONObject toFeaturesJson(FeaturesSettingsData)>
	//   20   47:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   21   50:ldc2            #343 <String "analytics">
	//   22   53:aload_0         
	//   23   54:aload_1         
	//   24   55:getfield        #381 <Field AnalyticsSettingsData SettingsData.analyticsSettingsData>
	//   25   58:invokespecial   #383 <Method JSONObject toAnalyticsJson(AnalyticsSettingsData)>
	//   26   61:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   27   64:ldc2            #347 <String "beta">
	//   28   67:aload_0         
	//   29   68:aload_1         
	//   30   69:getfield        #387 <Field BetaSettingsData SettingsData.betaSettingsData>
	//   31   72:invokespecial   #389 <Method JSONObject toBetaJson(BetaSettingsData)>
	//   32   75:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   33   78:ldc2            #327 <String "app">
	//   34   81:aload_0         
	//   35   82:aload_1         
	//   36   83:getfield        #393 <Field AppSettingsData SettingsData.appData>
	//   37   86:invokespecial   #395 <Method JSONObject toAppJson(AppSettingsData)>
	//   38   89:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   39   92:ldc2            #331 <String "session">
	//   40   95:aload_0         
	//   41   96:aload_1         
	//   42   97:getfield        #399 <Field SessionSettingsData SettingsData.sessionData>
	//   43  100:invokespecial   #401 <Method JSONObject toSessionJson(SessionSettingsData)>
	//   44  103:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   45  106:ldc2            #335 <String "prompt">
	//   46  109:aload_0         
	//   47  110:aload_1         
	//   48  111:getfield        #405 <Field PromptSettingsData SettingsData.promptData>
	//   49  114:invokespecial   #407 <Method JSONObject toPromptJson(PromptSettingsData)>
	//   50  117:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   51  120:areturn         
	}
}
