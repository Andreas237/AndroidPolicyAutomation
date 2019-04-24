// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import android.content.SharedPreferences;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			SettingsController, SettingsCacheBehavior, CachedSettingsIo, SettingsJsonTransform, 
//			SettingsData, SettingsSpiCall, SettingsRequest

class DefaultSettingsController
	implements SettingsController
{

	public DefaultSettingsController(Kit kit1, SettingsRequest settingsrequest, CurrentTimeProvider currenttimeprovider, SettingsJsonTransform settingsjsontransform, CachedSettingsIo cachedsettingsio, SettingsSpiCall settingsspicall)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		kit = kit1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Kit kit>
		settingsRequest = settingsrequest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field SettingsRequest settingsRequest>
		currentTimeProvider = currenttimeprovider;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #38  <Field CurrentTimeProvider currentTimeProvider>
		settingsJsonTransform = settingsjsontransform;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #40  <Field SettingsJsonTransform settingsJsonTransform>
		cachedSettingsIo = cachedsettingsio;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #42  <Field CachedSettingsIo cachedSettingsIo>
		settingsSpiCall = settingsspicall;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #44  <Field SettingsSpiCall settingsSpiCall>
		preferenceStore = ((PreferenceStore) (new PreferenceStoreImpl(kit)));
	//   20   37:aload_0         
	//   21   38:new             #46  <Class PreferenceStoreImpl>
	//   22   41:dup             
	//   23   42:aload_0         
	//   24   43:getfield        #34  <Field Kit kit>
	//   25   46:invokespecial   #49  <Method void PreferenceStoreImpl(Kit)>
	//   26   49:putfield        #51  <Field PreferenceStore preferenceStore>
	//   27   52:return          
	}

	private SettingsData getCachedSettingsData(SettingsCacheBehavior settingscachebehavior)
	{
		SettingsCacheBehavior settingscachebehavior1;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
	//    2    3:aload           5
	//    3    5:astore          4
		if(SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(((Object) (settingscachebehavior))))
			break MISSING_BLOCK_LABEL_206;
	//    4    7:getstatic       #62  <Field SettingsCacheBehavior SettingsCacheBehavior.SKIP_CACHE_LOOKUP>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #66  <Method boolean SettingsCacheBehavior.equals(Object)>
	//    7   14:ifne            206
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
	//    8   17:aload           5
	//    9   19:astore          4
		long l;
		SettingsData settingsdata;
		JSONObject jsonobject;
		try
		{
			jsonobject = cachedSettingsIo.readCachedSettings();
	//   10   21:aload_0         
	//   11   22:getfield        #42  <Field CachedSettingsIo cachedSettingsIo>
	//   12   25:invokeinterface #72  <Method JSONObject CachedSettingsIo.readCachedSettings()>
	//   13   30:astore          7
		}
	//*  14   32:aload           7
	//*  15   34:ifnull          190
	//*  16   37:aload           5
	//*  17   39:astore          4
	//*  18   41:aload_0         
	//*  19   42:getfield        #40  <Field SettingsJsonTransform settingsJsonTransform>
	//*  20   45:aload_0         
	//*  21   46:getfield        #38  <Field CurrentTimeProvider currentTimeProvider>
	//*  22   49:aload           7
	//*  23   51:invokeinterface #78  <Method SettingsData SettingsJsonTransform.buildFromJson(CurrentTimeProvider, JSONObject)>
	//*  24   56:astore          6
	//*  25   58:aload           6
	//*  26   60:ifnull          171
	//*  27   63:aload           5
	//*  28   65:astore          4
	//*  29   67:aload_0         
	//*  30   68:aload           7
	//*  31   70:ldc1            #80  <String "Loaded cached settings: ">
	//*  32   72:invokespecial   #84  <Method void logSettings(JSONObject, String)>
	//*  33   75:aload           5
	//*  34   77:astore          4
	//*  35   79:aload_0         
	//*  36   80:getfield        #38  <Field CurrentTimeProvider currentTimeProvider>
	//*  37   83:invokeinterface #90  <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//*  38   88:lstore_2        
	//*  39   89:aload           5
	//*  40   91:astore          4
	//*  41   93:getstatic       #93  <Field SettingsCacheBehavior SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION>
	//*  42   96:aload_1         
	//*  43   97:invokevirtual   #66  <Method boolean SettingsCacheBehavior.equals(Object)>
	//*  44  100:ifne            116
	//*  45  103:aload           5
	//*  46  105:astore          4
	//*  47  107:aload           6
	//*  48  109:lload_2         
	//*  49  110:invokevirtual   #99  <Method boolean SettingsData.isExpired(long)>
	//*  50  113:ifne            136
	//*  51  116:aload           6
	//*  52  118:astore_1        
	//*  53  119:aload_1         
	//*  54  120:astore          4
	//*  55  122:invokestatic    #105 <Method Logger Fabric.getLogger()>
	//*  56  125:ldc1            #107 <String "Fabric">
	//*  57  127:ldc1            #109 <String "Returning cached settings.">
	//*  58  129:invokeinterface #115 <Method void Logger.d(String, String)>
	//*  59  134:aload_1         
	//*  60  135:areturn         
	//*  61  136:aload           5
	//*  62  138:astore          4
	//*  63  140:invokestatic    #105 <Method Logger Fabric.getLogger()>
	//*  64  143:ldc1            #107 <String "Fabric">
	//*  65  145:ldc1            #117 <String "Cached settings have expired.">
	//*  66  147:invokeinterface #115 <Method void Logger.d(String, String)>
	//*  67  152:aconst_null     
	//*  68  153:areturn         
		// Misplaced declaration of an exception variable
		catch(SettingsCacheBehavior settingscachebehavior)
	//*  69  154:astore_1        
		{
			Fabric.getLogger().e("Fabric", "Failed to get cached settings", ((Throwable) (settingscachebehavior)));
	//   70  155:invokestatic    #105 <Method Logger Fabric.getLogger()>
	//   71  158:ldc1            #107 <String "Fabric">
	//   72  160:ldc1            #119 <String "Failed to get cached settings">
	//   73  162:aload_1         
	//   74  163:invokeinterface #123 <Method void Logger.e(String, String, Throwable)>
			return ((SettingsData) (settingscachebehavior1));
	//   75  168:aload           4
	//   76  170:areturn         
		}
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_190;
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
		settingsdata = settingsJsonTransform.buildFromJson(currentTimeProvider, jsonobject);
		if(settingsdata == null)
			break MISSING_BLOCK_LABEL_171;
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
		logSettings(jsonobject, "Loaded cached settings: ");
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
		l = currentTimeProvider.getCurrentTimeMillis();
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
		if(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(((Object) (settingscachebehavior))))
			break MISSING_BLOCK_LABEL_116;
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
		if(settingsdata.isExpired(l))
			break MISSING_BLOCK_LABEL_136;
		settingscachebehavior = ((SettingsCacheBehavior) (settingsdata));
		settingscachebehavior1 = settingscachebehavior;
		Fabric.getLogger().d("Fabric", "Returning cached settings.");
		return ((SettingsData) (settingscachebehavior));
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
		Fabric.getLogger().d("Fabric", "Cached settings have expired.");
		return null;
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
	//   77  171:aload           5
	//   78  173:astore          4
		Fabric.getLogger().e("Fabric", "Failed to transform cached settings data.", ((Throwable) (null)));
	//   79  175:invokestatic    #105 <Method Logger Fabric.getLogger()>
	//   80  178:ldc1            #107 <String "Fabric">
	//   81  180:ldc1            #125 <String "Failed to transform cached settings data.">
	//   82  182:aconst_null     
	//   83  183:invokeinterface #123 <Method void Logger.e(String, String, Throwable)>
		return null;
	//   84  188:aconst_null     
	//   85  189:areturn         
		settingscachebehavior1 = ((SettingsCacheBehavior) (obj));
	//   86  190:aload           5
	//   87  192:astore          4
		Fabric.getLogger().d("Fabric", "No cached settings data found.");
	//   88  194:invokestatic    #105 <Method Logger Fabric.getLogger()>
	//   89  197:ldc1            #107 <String "Fabric">
	//   90  199:ldc1            #127 <String "No cached settings data found.">
	//   91  201:invokeinterface #115 <Method void Logger.d(String, String)>
		return null;
	//   92  206:aconst_null     
	//   93  207:areturn         
	}

	private void logSettings(JSONObject jsonobject, String s)
		throws JSONException
	{
		Fabric.getLogger().d("Fabric", (new StringBuilder()).append(s).append(jsonobject.toString()).toString());
	//    0    0:invokestatic    #105 <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #107 <String "Fabric">
	//    2    5:new             #131 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #132 <Method void StringBuilder()>
	//    5   12:aload_2         
	//    6   13:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #142 <Method String JSONObject.toString()>
	//    9   20:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   11   26:invokeinterface #115 <Method void Logger.d(String, String)>
	//   12   31:return          
	}

	boolean buildInstanceIdentifierChanged()
	{
		return !getStoredBuildInstanceIdentifier().equals(((Object) (getBuildInstanceIdentifierFromContext())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method String getStoredBuildInstanceIdentifier()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #152 <Method String getBuildInstanceIdentifierFromContext()>
	//    4    8:invokevirtual   #155 <Method boolean String.equals(Object)>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	String getBuildInstanceIdentifierFromContext()
	{
		return CommonUtils.createInstanceIdFrom(new String[] {
			CommonUtils.resolveBuildId(kit.getContext())
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field Kit kit>
	//    6   10:invokevirtual   #161 <Method android.content.Context Kit.getContext()>
	//    7   13:invokestatic    #167 <Method String CommonUtils.resolveBuildId(android.content.Context)>
	//    8   16:aastore         
	//    9   17:invokestatic    #171 <Method String CommonUtils.createInstanceIdFrom(String[])>
	//   10   20:areturn         
	}

	String getStoredBuildInstanceIdentifier()
	{
		return preferenceStore.get().getString("existing_instance_identifier", "");
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field PreferenceStore preferenceStore>
	//    2    4:invokeinterface #177 <Method SharedPreferences PreferenceStore.get()>
	//    3    9:ldc1            #13  <String "existing_instance_identifier">
	//    4   11:ldc1            #179 <String "">
	//    5   13:invokeinterface #185 <Method String SharedPreferences.getString(String, String)>
	//    6   18:areturn         
	}

	public SettingsData loadSettingsData()
	{
		return loadSettingsData(SettingsCacheBehavior.USE_CACHE);
	//    0    0:aload_0         
	//    1    1:getstatic       #190 <Field SettingsCacheBehavior SettingsCacheBehavior.USE_CACHE>
	//    2    4:invokevirtual   #192 <Method SettingsData loadSettingsData(SettingsCacheBehavior)>
	//    3    7:areturn         
	}

	public SettingsData loadSettingsData(SettingsCacheBehavior settingscachebehavior)
	{
		Object obj;
		SettingsData settingsdata;
		Object obj1;
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		settingsdata = ((SettingsData) (obj1));
	//    4    6:aload           4
	//    5    8:astore_3        
		obj = ((Object) (obj2));
	//    6    9:aload           5
	//    7   11:astore_2        
		if(Fabric.isDebuggable())
			break MISSING_BLOCK_LABEL_40;
	//    8   12:invokestatic    #195 <Method boolean Fabric.isDebuggable()>
	//    9   15:ifne            40
		settingsdata = ((SettingsData) (obj1));
	//   10   18:aload           4
	//   11   20:astore_3        
		obj = ((Object) (obj2));
	//   12   21:aload           5
	//   13   23:astore_2        
		if(!buildInstanceIdentifierChanged())
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #197 <Method boolean buildInstanceIdentifierChanged()>
	//*  16   28:ifne            40
		{
			obj = ((Object) (obj2));
	//   17   31:aload           5
	//   18   33:astore_2        
			JSONObject jsonobject;
			try
			{
				settingsdata = getCachedSettingsData(settingscachebehavior);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokespecial   #199 <Method SettingsData getCachedSettingsData(SettingsCacheBehavior)>
	//   22   39:astore_3        
			}
	//*  23   40:aload_3         
	//*  24   41:astore_2        
	//*  25   42:aload_3         
	//*  26   43:ifnonnull       128
	//*  27   46:aload_3         
	//*  28   47:astore_2        
	//*  29   48:aload_0         
	//*  30   49:getfield        #44  <Field SettingsSpiCall settingsSpiCall>
	//*  31   52:aload_0         
	//*  32   53:getfield        #36  <Field SettingsRequest settingsRequest>
	//*  33   56:invokeinterface #205 <Method JSONObject SettingsSpiCall.invoke(SettingsRequest)>
	//*  34   61:astore          4
	//*  35   63:aload_3         
	//*  36   64:astore_2        
	//*  37   65:aload           4
	//*  38   67:ifnull          128
	//*  39   70:aload_3         
	//*  40   71:astore_2        
	//*  41   72:aload_0         
	//*  42   73:getfield        #40  <Field SettingsJsonTransform settingsJsonTransform>
	//*  43   76:aload_0         
	//*  44   77:getfield        #38  <Field CurrentTimeProvider currentTimeProvider>
	//*  45   80:aload           4
	//*  46   82:invokeinterface #78  <Method SettingsData SettingsJsonTransform.buildFromJson(CurrentTimeProvider, JSONObject)>
	//*  47   87:astore_1        
	//*  48   88:aload_1         
	//*  49   89:astore_2        
	//*  50   90:aload_0         
	//*  51   91:getfield        #42  <Field CachedSettingsIo cachedSettingsIo>
	//*  52   94:aload_1         
	//*  53   95:getfield        #209 <Field long SettingsData.expiresAtMillis>
	//*  54   98:aload           4
	//*  55  100:invokeinterface #213 <Method void CachedSettingsIo.writeCachedSettings(long, JSONObject)>
	//*  56  105:aload_1         
	//*  57  106:astore_2        
	//*  58  107:aload_0         
	//*  59  108:aload           4
	//*  60  110:ldc1            #215 <String "Loaded settings: ">
	//*  61  112:invokespecial   #84  <Method void logSettings(JSONObject, String)>
	//*  62  115:aload_1         
	//*  63  116:astore_2        
	//*  64  117:aload_0         
	//*  65  118:aload_0         
	//*  66  119:invokevirtual   #152 <Method String getBuildInstanceIdentifierFromContext()>
	//*  67  122:invokevirtual   #219 <Method boolean setStoredBuildInstanceIdentifier(String)>
	//*  68  125:pop             
	//*  69  126:aload_1         
	//*  70  127:astore_2        
	//*  71  128:aload_2         
	//*  72  129:astore_1        
	//*  73  130:aload_2         
	//*  74  131:ifnonnull       142
	//*  75  134:aload_0         
	//*  76  135:getstatic       #93  <Field SettingsCacheBehavior SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION>
	//*  77  138:invokespecial   #199 <Method SettingsData getCachedSettingsData(SettingsCacheBehavior)>
	//*  78  141:astore_1        
	//*  79  142:aload_1         
	//*  80  143:areturn         
			// Misplaced declaration of an exception variable
			catch(SettingsCacheBehavior settingscachebehavior)
	//*  81  144:astore_1        
			{
				Fabric.getLogger().e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", ((Throwable) (settingscachebehavior)));
	//   82  145:invokestatic    #105 <Method Logger Fabric.getLogger()>
	//   83  148:ldc1            #107 <String "Fabric">
	//   84  150:ldc1            #10  <String "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.">
	//   85  152:aload_1         
	//   86  153:invokeinterface #123 <Method void Logger.e(String, String, Throwable)>
				return ((SettingsData) (obj));
	//   87  158:aload_2         
	//   88  159:areturn         
			}
		}
		obj = ((Object) (settingsdata));
		if(settingsdata != null)
			break MISSING_BLOCK_LABEL_128;
		obj = ((Object) (settingsdata));
		jsonobject = settingsSpiCall.invoke(settingsRequest);
		obj = ((Object) (settingsdata));
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_128;
		obj = ((Object) (settingsdata));
		settingscachebehavior = ((SettingsCacheBehavior) (settingsJsonTransform.buildFromJson(currentTimeProvider, jsonobject)));
		obj = ((Object) (settingscachebehavior));
		cachedSettingsIo.writeCachedSettings(((SettingsData) (settingscachebehavior)).expiresAtMillis, jsonobject);
		obj = ((Object) (settingscachebehavior));
		logSettings(jsonobject, "Loaded settings: ");
		obj = ((Object) (settingscachebehavior));
		setStoredBuildInstanceIdentifier(getBuildInstanceIdentifierFromContext());
		obj = ((Object) (settingscachebehavior));
		settingscachebehavior = ((SettingsCacheBehavior) (obj));
		if(obj != null)
			break MISSING_BLOCK_LABEL_142;
		settingscachebehavior = ((SettingsCacheBehavior) (getCachedSettingsData(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION)));
		return ((SettingsData) (settingscachebehavior));
	}

	boolean setStoredBuildInstanceIdentifier(String s)
	{
		android.content.SharedPreferences.Editor editor = preferenceStore.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field PreferenceStore preferenceStore>
	//    2    4:invokeinterface #226 <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    3    9:astore_2        
		editor.putString("existing_instance_identifier", s);
	//    4   10:aload_2         
	//    5   11:ldc1            #13  <String "existing_instance_identifier">
	//    6   13:aload_1         
	//    7   14:invokeinterface #232 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   19:pop             
		return preferenceStore.save(editor);
	//    9   20:aload_0         
	//   10   21:getfield        #51  <Field PreferenceStore preferenceStore>
	//   11   24:aload_2         
	//   12   25:invokeinterface #236 <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   13   30:ireturn         
	}

	private static final String LOAD_ERROR_MESSAGE = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.";
	private static final String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
	private final CachedSettingsIo cachedSettingsIo;
	private final CurrentTimeProvider currentTimeProvider;
	private final Kit kit;
	private final PreferenceStore preferenceStore;
	private final SettingsJsonTransform settingsJsonTransform;
	private final SettingsRequest settingsRequest;
	private final SettingsSpiCall settingsSpiCall;
}
