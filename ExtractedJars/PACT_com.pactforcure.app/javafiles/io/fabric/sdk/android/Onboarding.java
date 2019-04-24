// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.*;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AppRequestData;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.CreateAppSpiCall;
import io.fabric.sdk.android.services.settings.IconRequest;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import io.fabric.sdk.android.services.settings.UpdateAppSpiCall;
import java.util.*;
import java.util.concurrent.Future;

// Referenced classes of package io.fabric.sdk.android:
//			Kit, Fabric, Logger, KitInfo

class Onboarding extends Kit
{

	public Onboarding(Future future, Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Kit()>
	//    2    4:aload_0         
	//    3    5:new             #37  <Class DefaultHttpRequestFactory>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void DefaultHttpRequestFactory()>
	//    6   12:putfield        #40  <Field HttpRequestFactory requestFactory>
		kitsFinder = future;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #42  <Field Future kitsFinder>
		providedKits = collection;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #44  <Field Collection providedKits>
	//   13   25:return          
	}

	private AppRequestData buildAppRequest(IconRequest iconrequest, Collection collection)
	{
		Object obj = ((Object) (getContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Context getContext()>
	//    2    4:astore          5
		String s = (new ApiKey()).getValue(((Context) (obj)));
	//    3    6:new             #55  <Class ApiKey>
	//    4    9:dup             
	//    5   10:invokespecial   #56  <Method void ApiKey()>
	//    6   13:aload           5
	//    7   15:invokevirtual   #60  <Method String ApiKey.getValue(Context)>
	//    8   18:astore          4
		obj = ((Object) (CommonUtils.createInstanceIdFrom(new String[] {
			CommonUtils.resolveBuildId(((Context) (obj)))
		})));
	//    9   20:iconst_1        
	//   10   21:anewarray       String[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload           5
	//   14   28:invokestatic    #67  <Method String CommonUtils.resolveBuildId(Context)>
	//   15   31:aastore         
	//   16   32:invokestatic    #71  <Method String CommonUtils.createInstanceIdFrom(String[])>
	//   17   35:astore          5
		int i = DeliveryMechanism.determineFrom(installerPackageName).getId();
	//   18   37:aload_0         
	//   19   38:getfield        #73  <Field String installerPackageName>
	//   20   41:invokestatic    #79  <Method DeliveryMechanism DeliveryMechanism.determineFrom(String)>
	//   21   44:invokevirtual   #83  <Method int DeliveryMechanism.getId()>
	//   22   47:istore_3        
		return new AppRequestData(s, getIdManager().getAppIdentifier(), versionName, versionCode, ((String) (obj)), applicationLabel, i, targetAndroidSdkVersion, "0", iconrequest, collection);
	//   23   48:new             #85  <Class AppRequestData>
	//   24   51:dup             
	//   25   52:aload           4
	//   26   54:aload_0         
	//   27   55:invokevirtual   #89  <Method IdManager getIdManager()>
	//   28   58:invokevirtual   #95  <Method String IdManager.getAppIdentifier()>
	//   29   61:aload_0         
	//   30   62:getfield        #97  <Field String versionName>
	//   31   65:aload_0         
	//   32   66:getfield        #99  <Field String versionCode>
	//   33   69:aload           5
	//   34   71:aload_0         
	//   35   72:getfield        #101 <Field String applicationLabel>
	//   36   75:iload_3         
	//   37   76:aload_0         
	//   38   77:getfield        #103 <Field String targetAndroidSdkVersion>
	//   39   80:ldc1            #105 <String "0">
	//   40   82:aload_1         
	//   41   83:aload_2         
	//   42   84:invokespecial   #108 <Method void AppRequestData(String, String, String, String, String, String, int, String, String, IconRequest, Collection)>
	//   43   87:areturn         
	}

	private boolean performAutoConfigure(String s, AppSettingsData appsettingsdata, Collection collection)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(!"new".equals(((Object) (appsettingsdata.status)))) goto _L2; else goto _L1
	//    2    3:ldc1            #113 <String "new">
	//    3    5:aload_2         
	//    4    6:getfield        #118 <Field String AppSettingsData.status>
	//    5    9:invokevirtual   #122 <Method boolean String.equals(Object)>
	//    6   12:ifeq            51
_L1:
		if(!performCreateApp(s, appsettingsdata, collection)) goto _L4; else goto _L3
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokespecial   #125 <Method boolean performCreateApp(String, AppSettingsData, Collection)>
	//   12   22:ifeq            36
_L3:
		flag = Settings.getInstance().loadSettingsSkippingCache();
	//   13   25:invokestatic    #131 <Method Settings Settings.getInstance()>
	//   14   28:invokevirtual   #135 <Method boolean Settings.loadSettingsSkippingCache()>
	//   15   31:istore          4
_L6:
		return flag;
	//   16   33:iload           4
	//   17   35:ireturn         
_L4:
		Fabric.getLogger().e("Fabric", "Failed to create app with Crashlytics service.", ((Throwable) (null)));
	//   18   36:invokestatic    #141 <Method Logger Fabric.getLogger()>
	//   19   39:ldc1            #143 <String "Fabric">
	//   20   41:ldc1            #145 <String "Failed to create app with Crashlytics service.">
	//   21   43:aconst_null     
	//   22   44:invokeinterface #151 <Method void Logger.e(String, String, Throwable)>
		return false;
	//   23   49:iconst_0        
	//   24   50:ireturn         
_L2:
		if("configured".equals(((Object) (appsettingsdata.status))))
	//*  25   51:ldc1            #153 <String "configured">
	//*  26   53:aload_2         
	//*  27   54:getfield        #118 <Field String AppSettingsData.status>
	//*  28   57:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  29   60:ifeq            70
			return Settings.getInstance().loadSettingsSkippingCache();
	//   30   63:invokestatic    #131 <Method Settings Settings.getInstance()>
	//   31   66:invokevirtual   #135 <Method boolean Settings.loadSettingsSkippingCache()>
	//   32   69:ireturn         
		if(appsettingsdata.updateRequired)
	//*  33   70:aload_2         
	//*  34   71:getfield        #157 <Field boolean AppSettingsData.updateRequired>
	//*  35   74:ifeq            33
		{
			Fabric.getLogger().d("Fabric", "Server says an update is required - forcing a full App update.");
	//   36   77:invokestatic    #141 <Method Logger Fabric.getLogger()>
	//   37   80:ldc1            #143 <String "Fabric">
	//   38   82:ldc1            #159 <String "Server says an update is required - forcing a full App update.">
	//   39   84:invokeinterface #163 <Method void Logger.d(String, String)>
			performUpdateApp(s, appsettingsdata, collection);
	//   40   89:aload_0         
	//   41   90:aload_1         
	//   42   91:aload_2         
	//   43   92:aload_3         
	//   44   93:invokespecial   #166 <Method boolean performUpdateApp(String, AppSettingsData, Collection)>
	//   45   96:pop             
			return true;
	//   46   97:iconst_1        
	//   47   98:ireturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	private boolean performCreateApp(String s, AppSettingsData appsettingsdata, Collection collection)
	{
		s = ((String) (buildAppRequest(IconRequest.build(getContext(), s), collection)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #53  <Method Context getContext()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #173 <Method IconRequest IconRequest.build(Context, String)>
	//    5    9:aload_3         
	//    6   10:invokespecial   #175 <Method AppRequestData buildAppRequest(IconRequest, Collection)>
	//    7   13:astore_1        
		return (new CreateAppSpiCall(((Kit) (this)), getOverridenSpiEndpoint(), appsettingsdata.url, requestFactory)).invoke(((AppRequestData) (s)));
	//    8   14:new             #177 <Class CreateAppSpiCall>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #180 <Method String getOverridenSpiEndpoint()>
	//   13   23:aload_2         
	//   14   24:getfield        #183 <Field String AppSettingsData.url>
	//   15   27:aload_0         
	//   16   28:getfield        #40  <Field HttpRequestFactory requestFactory>
	//   17   31:invokespecial   #186 <Method void CreateAppSpiCall(Kit, String, String, HttpRequestFactory)>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #190 <Method boolean CreateAppSpiCall.invoke(AppRequestData)>
	//   20   38:ireturn         
	}

	private boolean performUpdateApp(AppSettingsData appsettingsdata, IconRequest iconrequest, Collection collection)
	{
		iconrequest = ((IconRequest) (buildAppRequest(iconrequest, collection)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #175 <Method AppRequestData buildAppRequest(IconRequest, Collection)>
	//    4    6:astore_2        
		return (new UpdateAppSpiCall(((Kit) (this)), getOverridenSpiEndpoint(), appsettingsdata.url, requestFactory)).invoke(((AppRequestData) (iconrequest)));
	//    5    7:new             #193 <Class UpdateAppSpiCall>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #180 <Method String getOverridenSpiEndpoint()>
	//   10   16:aload_1         
	//   11   17:getfield        #183 <Field String AppSettingsData.url>
	//   12   20:aload_0         
	//   13   21:getfield        #40  <Field HttpRequestFactory requestFactory>
	//   14   24:invokespecial   #194 <Method void UpdateAppSpiCall(Kit, String, String, HttpRequestFactory)>
	//   15   27:aload_2         
	//   16   28:invokevirtual   #195 <Method boolean UpdateAppSpiCall.invoke(AppRequestData)>
	//   17   31:ireturn         
	}

	private boolean performUpdateApp(String s, AppSettingsData appsettingsdata, Collection collection)
	{
		return performUpdateApp(appsettingsdata, IconRequest.build(getContext(), s), collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #53  <Method Context getContext()>
	//    4    6:aload_1         
	//    5    7:invokestatic    #173 <Method IconRequest IconRequest.build(Context, String)>
	//    6   10:aload_3         
	//    7   11:invokespecial   #198 <Method boolean performUpdateApp(AppSettingsData, IconRequest, Collection)>
	//    8   14:ireturn         
	}

	private SettingsData retrieveSettingsData()
	{
		SettingsData settingsdata;
		try
		{
			Settings.getInstance().initialize(((Kit) (this)), idManager, requestFactory, versionCode, versionName, getOverridenSpiEndpoint()).loadSettingsData();
	//    0    0:invokestatic    #131 <Method Settings Settings.getInstance()>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:getfield        #206 <Field IdManager idManager>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field HttpRequestFactory requestFactory>
	//    6   12:aload_0         
	//    7   13:getfield        #99  <Field String versionCode>
	//    8   16:aload_0         
	//    9   17:getfield        #97  <Field String versionName>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #180 <Method String getOverridenSpiEndpoint()>
	//   12   24:invokevirtual   #210 <Method Settings Settings.initialize(Kit, IdManager, HttpRequestFactory, String, String, String)>
	//   13   27:invokevirtual   #213 <Method boolean Settings.loadSettingsData()>
	//   14   30:pop             
			settingsdata = Settings.getInstance().awaitSettingsData();
	//   15   31:invokestatic    #131 <Method Settings Settings.getInstance()>
	//   16   34:invokevirtual   #216 <Method SettingsData Settings.awaitSettingsData()>
	//   17   37:astore_1        
		}
	//*  18   38:aload_1         
	//*  19   39:areturn         
		catch(Exception exception)
	//*  20   40:astore_1        
		{
			Fabric.getLogger().e("Fabric", "Error dealing with settings", ((Throwable) (exception)));
	//   21   41:invokestatic    #141 <Method Logger Fabric.getLogger()>
	//   22   44:ldc1            #143 <String "Fabric">
	//   23   46:ldc1            #218 <String "Error dealing with settings">
	//   24   48:aload_1         
	//   25   49:invokeinterface #151 <Method void Logger.e(String, String, Throwable)>
			return null;
	//   26   54:aconst_null     
	//   27   55:areturn         
		}
		return settingsdata;
	}

	protected Boolean doInBackground()
	{
		boolean flag;
		boolean flag1;
		String s;
		SettingsData settingsdata;
		s = CommonUtils.getAppIconHashOrNull(getContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Context getContext()>
	//    2    4:invokestatic    #223 <Method String CommonUtils.getAppIconHashOrNull(Context)>
	//    3    7:astore          4
		flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		settingsdata = retrieveSettingsData();
	//    6   11:aload_0         
	//    7   12:invokespecial   #225 <Method SettingsData retrieveSettingsData()>
	//    8   15:astore          5
		flag = flag1;
	//    9   17:iload_2         
	//   10   18:istore_1        
		if(settingsdata == null) goto _L2; else goto _L1
	//   11   19:aload           5
	//   12   21:ifnull          72
_L1:
		if(kitsFinder == null) goto _L4; else goto _L3
	//   13   24:aload_0         
	//   14   25:getfield        #42  <Field Future kitsFinder>
	//   15   28:ifnull          77
_L3:
		Object obj = ((Object) ((Map)kitsFinder.get()));
	//   16   31:aload_0         
	//   17   32:getfield        #42  <Field Future kitsFinder>
	//   18   35:invokeinterface #231 <Method Object Future.get()>
	//   19   40:checkcast       #233 <Class Map>
	//   20   43:astore_3        
_L5:
		obj = ((Object) (mergeKits(((Map) (obj)), providedKits)));
	//   21   44:aload_0         
	//   22   45:aload_3         
	//   23   46:aload_0         
	//   24   47:getfield        #44  <Field Collection providedKits>
	//   25   50:invokevirtual   #237 <Method Map mergeKits(Map, Collection)>
	//   26   53:astore_3        
		flag = performAutoConfigure(s, settingsdata.appData, ((Map) (obj)).values());
	//   27   54:aload_0         
	//   28   55:aload           4
	//   29   57:aload           5
	//   30   59:getfield        #243 <Field AppSettingsData SettingsData.appData>
	//   31   62:aload_3         
	//   32   63:invokeinterface #247 <Method Collection Map.values()>
	//   33   68:invokespecial   #249 <Method boolean performAutoConfigure(String, AppSettingsData, Collection)>
	//   34   71:istore_1        
_L2:
		return Boolean.valueOf(flag);
	//   35   72:iload_1         
	//   36   73:invokestatic    #255 <Method Boolean Boolean.valueOf(boolean)>
	//   37   76:areturn         
_L4:
		obj = ((Object) (new HashMap()));
	//   38   77:new             #257 <Class HashMap>
	//   39   80:dup             
	//   40   81:invokespecial   #258 <Method void HashMap()>
	//   41   84:astore_3        
		  goto _L5
	//*  42   85:goto            44
		Exception exception;
		exception;
	//   43   88:astore_3        
		Fabric.getLogger().e("Fabric", "Error performing auto configuration.", ((Throwable) (exception)));
	//   44   89:invokestatic    #141 <Method Logger Fabric.getLogger()>
	//   45   92:ldc1            #143 <String "Fabric">
	//   46   94:ldc2            #260 <String "Error performing auto configuration.">
	//   47   97:aload_3         
	//   48   98:invokeinterface #151 <Method void Logger.e(String, String, Throwable)>
		flag = flag1;
	//   49  103:iload_2         
	//   50  104:istore_1        
		  goto _L2
	//*  51  105:goto            72
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #262 <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "io.fabric.sdk.android:fabric";
	//    0    0:ldc2            #265 <String "io.fabric.sdk.android:fabric">
	//    1    3:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Context getContext()>
	//    2    4:ldc1            #12  <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #269 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4    9:areturn         
	}

	public String getVersion()
	{
		return "1.3.14.143";
	//    0    0:ldc2            #272 <String "1.3.14.143">
	//    1    3:areturn         
	}

	Map mergeKits(Map map, Collection collection)
	{
		collection = ((Collection) (collection.iterator()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #278 <Method Iterator Collection.iterator()>
	//    2    6:astore_2        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    3    7:aload_2         
	//    4    8:invokeinterface #283 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            70
			Kit kit = (Kit)((Iterator) (collection)).next();
	//    6   16:aload_2         
	//    7   17:invokeinterface #286 <Method Object Iterator.next()>
	//    8   22:checkcast       #5   <Class Kit>
	//    9   25:astore_3        
			if(!map.containsKey(((Object) (kit.getIdentifier()))))
	//*  10   26:aload_1         
	//*  11   27:aload_3         
	//*  12   28:invokevirtual   #288 <Method String Kit.getIdentifier()>
	//*  13   31:invokeinterface #291 <Method boolean Map.containsKey(Object)>
	//*  14   36:ifne            7
				map.put(((Object) (kit.getIdentifier())), ((Object) (new KitInfo(kit.getIdentifier(), kit.getVersion(), "binary"))));
	//   15   39:aload_1         
	//   16   40:aload_3         
	//   17   41:invokevirtual   #288 <Method String Kit.getIdentifier()>
	//   18   44:new             #293 <Class KitInfo>
	//   19   47:dup             
	//   20   48:aload_3         
	//   21   49:invokevirtual   #288 <Method String Kit.getIdentifier()>
	//   22   52:aload_3         
	//   23   53:invokevirtual   #295 <Method String Kit.getVersion()>
	//   24   56:ldc1            #9   <String "binary">
	//   25   58:invokespecial   #298 <Method void KitInfo(String, String, String)>
	//   26   61:invokeinterface #302 <Method Object Map.put(Object, Object)>
	//   27   66:pop             
		} while(true);
	//   28   67:goto            7
		return map;
	//   29   70:aload_1         
	//   30   71:areturn         
	}

	protected boolean onPreExecute()
	{
		installerPackageName = getIdManager().getInstallerPackageName();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #89  <Method IdManager getIdManager()>
	//    3    5:invokevirtual   #309 <Method String IdManager.getInstallerPackageName()>
	//    4    8:putfield        #73  <Field String installerPackageName>
		packageManager = getContext().getPackageManager();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #53  <Method Context getContext()>
	//    8   16:invokevirtual   #315 <Method PackageManager Context.getPackageManager()>
	//    9   19:putfield        #317 <Field PackageManager packageManager>
		packageName = getContext().getPackageName();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #53  <Method Context getContext()>
	//   13   27:invokevirtual   #320 <Method String Context.getPackageName()>
	//   14   30:putfield        #322 <Field String packageName>
		packageInfo = packageManager.getPackageInfo(packageName, 0);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #317 <Field PackageManager packageManager>
	//   18   38:aload_0         
	//   19   39:getfield        #322 <Field String packageName>
	//   20   42:iconst_0        
	//   21   43:invokevirtual   #328 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   22   46:putfield        #330 <Field PackageInfo packageInfo>
		versionCode = Integer.toString(packageInfo.versionCode);
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #330 <Field PackageInfo packageInfo>
	//   26   54:getfield        #335 <Field int PackageInfo.versionCode>
	//   27   57:invokestatic    #341 <Method String Integer.toString(int)>
	//   28   60:putfield        #99  <Field String versionCode>
		if(packageInfo.versionName != null)
			break MISSING_BLOCK_LABEL_124;
	//   29   63:aload_0         
	//   30   64:getfield        #330 <Field PackageInfo packageInfo>
	//   31   67:getfield        #342 <Field String PackageInfo.versionName>
	//   32   70:ifnonnull       124
		String s = "0.0";
	//   33   73:ldc2            #344 <String "0.0">
	//   34   76:astore_1        
_L1:
		try
		{
			versionName = s;
	//   35   77:aload_0         
	//   36   78:aload_1         
	//   37   79:putfield        #97  <Field String versionName>
			applicationLabel = packageManager.getApplicationLabel(getContext().getApplicationInfo()).toString();
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getfield        #317 <Field PackageManager packageManager>
	//   41   87:aload_0         
	//   42   88:invokevirtual   #53  <Method Context getContext()>
	//   43   91:invokevirtual   #348 <Method ApplicationInfo Context.getApplicationInfo()>
	//   44   94:invokevirtual   #352 <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//   45   97:invokeinterface #356 <Method String CharSequence.toString()>
	//   46  102:putfield        #101 <Field String applicationLabel>
			targetAndroidSdkVersion = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
	//   47  105:aload_0         
	//   48  106:aload_0         
	//   49  107:invokevirtual   #53  <Method Context getContext()>
	//   50  110:invokevirtual   #348 <Method ApplicationInfo Context.getApplicationInfo()>
	//   51  113:getfield        #361 <Field int ApplicationInfo.targetSdkVersion>
	//   52  116:invokestatic    #341 <Method String Integer.toString(int)>
	//   53  119:putfield        #103 <Field String targetAndroidSdkVersion>
		}
	//*  54  122:iconst_1        
	//*  55  123:ireturn         
	//*  56  124:aload_0         
	//*  57  125:getfield        #330 <Field PackageInfo packageInfo>
	//*  58  128:getfield        #342 <Field String PackageInfo.versionName>
	//*  59  131:astore_1        
	//*  60  132:goto            77
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  61  135:astore_1        
		{
			Fabric.getLogger().e("Fabric", "Failed init", ((Throwable) (namenotfoundexception)));
	//   62  136:invokestatic    #141 <Method Logger Fabric.getLogger()>
	//   63  139:ldc1            #143 <String "Fabric">
	//   64  141:ldc2            #363 <String "Failed init">
	//   65  144:aload_1         
	//   66  145:invokeinterface #151 <Method void Logger.e(String, String, Throwable)>
			return false;
	//   67  150:iconst_0        
	//   68  151:ireturn         
		}
		return true;
		s = packageInfo.versionName;
		  goto _L1
	}

	private static final String BINARY_BUILD_TYPE = "binary";
	static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
	private String applicationLabel;
	private String installerPackageName;
	private final Future kitsFinder;
	private PackageInfo packageInfo;
	private PackageManager packageManager;
	private String packageName;
	private final Collection providedKits;
	private final HttpRequestFactory requestFactory = new DefaultHttpRequestFactory();
	private String targetAndroidSdkVersion;
	private String versionCode;
	private String versionName;
}
