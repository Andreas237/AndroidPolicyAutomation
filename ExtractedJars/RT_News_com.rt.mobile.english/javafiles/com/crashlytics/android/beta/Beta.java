// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.beta:
//			DeviceTokenLoader, BuildProperties, ActivityLifecycleCheckForUpdatesController, ImmediateCheckForUpdatesController, 
//			UpdatesController

public class Beta extends Kit
	implements DeviceIdentifierProvider
{

	public Beta()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Kit()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class MemoryValueCache>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void MemoryValueCache()>
	//    6   12:putfield        #36  <Field MemoryValueCache deviceTokenCache>
	//    7   15:aload_0         
	//    8   16:new             #38  <Class DeviceTokenLoader>
	//    9   19:dup             
	//   10   20:invokespecial   #39  <Method void DeviceTokenLoader()>
	//   11   23:putfield        #41  <Field DeviceTokenLoader deviceTokenLoader>
	//   12   26:return          
	}

	private String getBetaDeviceToken(Context context, String s)
	{
		if(isAppPossiblyInstalledByBeta(s, android.os.Build.VERSION.SDK_INT))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    5:invokevirtual   #56  <Method boolean isAppPossiblyInstalledByBeta(String, int)>
	//*   4    8:ifeq            70
		{
			Fabric.getLogger().d("Beta", "App was possibly installed by Beta. Getting device token");
	//    5   11:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//    6   14:ldc1            #20  <String "Beta">
	//    7   16:ldc1            #64  <String "App was possibly installed by Beta. Getting device token">
	//    8   18:invokeinterface #70  <Method void Logger.d(String, String)>
			boolean flag;
			try
			{
				context = ((Context) ((String)deviceTokenCache.get(context, ((io.fabric.sdk.android.services.cache.ValueLoader) (deviceTokenLoader)))));
	//    9   23:aload_0         
	//   10   24:getfield        #36  <Field MemoryValueCache deviceTokenCache>
	//   11   27:aload_1         
	//   12   28:aload_0         
	//   13   29:getfield        #41  <Field DeviceTokenLoader deviceTokenLoader>
	//   14   32:invokevirtual   #74  <Method Object MemoryValueCache.get(Context, io.fabric.sdk.android.services.cache.ValueLoader)>
	//   15   35:checkcast       #76  <Class String>
	//   16   38:astore_1        
				flag = "".equals(((Object) (context)));
	//   17   39:ldc1            #17  <String "">
	//   18   41:aload_1         
	//   19   42:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   20   45:istore_3        
			}
	//*  21   46:iload_3         
	//*  22   47:ifeq            52
	//*  23   50:aconst_null     
	//*  24   51:areturn         
	//*  25   52:aload_1         
	//*  26   53:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  27   54:astore_1        
			{
				Fabric.getLogger().e("Beta", "Failed to load the Beta device token", ((Throwable) (context)));
	//   28   55:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   29   58:ldc1            #20  <String "Beta">
	//   30   60:ldc1            #82  <String "Failed to load the Beta device token">
	//   31   62:aload_1         
	//   32   63:invokeinterface #86  <Method void Logger.e(String, String, Throwable)>
				return null;
	//   33   68:aconst_null     
	//   34   69:areturn         
			}
			if(flag)
				return null;
			else
				return ((String) (context));
		} else
		{
			Fabric.getLogger().d("Beta", "App was not installed by Beta. Skipping device token");
	//   35   70:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   36   73:ldc1            #20  <String "Beta">
	//   37   75:ldc1            #88  <String "App was not installed by Beta. Skipping device token">
	//   38   77:invokeinterface #70  <Method void Logger.d(String, String)>
			return null;
	//   39   82:aconst_null     
	//   40   83:areturn         
		}
	}

	private BetaSettingsData getBetaSettingsData()
	{
		SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
	//    0    0:invokestatic    #96  <Method Settings Settings.getInstance()>
	//    1    3:invokevirtual   #100 <Method SettingsData Settings.awaitSettingsData()>
	//    2    6:astore_1        
		if(settingsdata != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          16
			return settingsdata.betaSettingsData;
	//    5   11:aload_1         
	//    6   12:getfield        #106 <Field BetaSettingsData SettingsData.betaSettingsData>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public static Beta getInstance()
	{
		return (Beta)Fabric.getKit(com/crashlytics/android/beta/Beta);
	//    0    0:ldc1            #2   <Class Beta>
	//    1    2:invokestatic    #111 <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class Beta>
	//    3    8:areturn         
	}

	private BuildProperties loadBuildProperties(Context context)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Object obj1 = ((Object) (context.getAssets().open("crashlytics-build.properties")));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #121 <Method AssetManager Context.getAssets()>
	//    4    6:ldc1            #14  <String "crashlytics-build.properties">
	//    5    8:invokevirtual   #127 <Method InputStream AssetManager.open(String)>
	//    6   11:astore          4
		context = ((Context) (obj));
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_173;
	//    9   15:aload           4
	//   10   17:ifnull          173
		obj = obj1;
	//   11   20:aload           4
	//   12   22:astore_2        
		Exception exception;
		Logger logger;
		StringBuilder stringbuilder;
		try
		{
			context = ((Context) (BuildProperties.fromPropertiesStream(((InputStream) (obj1)))));
	//   13   23:aload           4
	//   14   25:invokestatic    #133 <Method BuildProperties BuildProperties.fromPropertiesStream(InputStream)>
	//   15   28:astore_1        
		}
	//*  16   29:aload           4
	//*  17   31:astore_2        
	//*  18   32:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//*  19   35:astore_3        
	//*  20   36:aload           4
	//*  21   38:astore_2        
	//*  22   39:new             #135 <Class StringBuilder>
	//*  23   42:dup             
	//*  24   43:invokespecial   #136 <Method void StringBuilder()>
	//*  25   46:astore          5
	//*  26   48:aload           4
	//*  27   50:astore_2        
	//*  28   51:aload           5
	//*  29   53:aload_1         
	//*  30   54:getfield        #139 <Field String BuildProperties.packageName>
	//*  31   57:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  32   60:pop             
	//*  33   61:aload           4
	//*  34   63:astore_2        
	//*  35   64:aload           5
	//*  36   66:ldc1            #145 <String " build properties: ">
	//*  37   68:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  38   71:pop             
	//*  39   72:aload           4
	//*  40   74:astore_2        
	//*  41   75:aload           5
	//*  42   77:aload_1         
	//*  43   78:getfield        #148 <Field String BuildProperties.versionName>
	//*  44   81:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  45   84:pop             
	//*  46   85:aload           4
	//*  47   87:astore_2        
	//*  48   88:aload           5
	//*  49   90:ldc1            #150 <String " (">
	//*  50   92:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  51   95:pop             
	//*  52   96:aload           4
	//*  53   98:astore_2        
	//*  54   99:aload           5
	//*  55  101:aload_1         
	//*  56  102:getfield        #153 <Field String BuildProperties.versionCode>
	//*  57  105:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  58  108:pop             
	//*  59  109:aload           4
	//*  60  111:astore_2        
	//*  61  112:aload           5
	//*  62  114:ldc1            #155 <String ")">
	//*  63  116:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  64  119:pop             
	//*  65  120:aload           4
	//*  66  122:astore_2        
	//*  67  123:aload           5
	//*  68  125:ldc1            #157 <String " - ">
	//*  69  127:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  70  130:pop             
	//*  71  131:aload           4
	//*  72  133:astore_2        
	//*  73  134:aload           5
	//*  74  136:aload_1         
	//*  75  137:getfield        #160 <Field String BuildProperties.buildId>
	//*  76  140:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  77  143:pop             
	//*  78  144:aload           4
	//*  79  146:astore_2        
	//*  80  147:aload_3         
	//*  81  148:ldc1            #20  <String "Beta">
	//*  82  150:aload           5
	//*  83  152:invokevirtual   #164 <Method String StringBuilder.toString()>
	//*  84  155:invokeinterface #70  <Method void Logger.d(String, String)>
	//*  85  160:goto            173
	//*  86  163:astore_3        
	//*  87  164:goto            215
		// Misplaced declaration of an exception variable
		catch(Exception exception)
	//*  88  167:astore_3        
		{
			context = null;
	//   89  168:aconst_null     
	//   90  169:astore_1        
			break MISSING_BLOCK_LABEL_215;
	//   91  170:goto            215
		}
		obj = obj1;
		logger = Fabric.getLogger();
		obj = obj1;
		stringbuilder = new StringBuilder();
		obj = obj1;
		stringbuilder.append(((BuildProperties) (context)).packageName);
		obj = obj1;
		stringbuilder.append(" build properties: ");
		obj = obj1;
		stringbuilder.append(((BuildProperties) (context)).versionName);
		obj = obj1;
		stringbuilder.append(" (");
		obj = obj1;
		stringbuilder.append(((BuildProperties) (context)).versionCode);
		obj = obj1;
		stringbuilder.append(")");
		obj = obj1;
		stringbuilder.append(" - ");
		obj = obj1;
		stringbuilder.append(((BuildProperties) (context)).buildId);
		obj = obj1;
		logger.d("Beta", stringbuilder.toString());
		break MISSING_BLOCK_LABEL_173;
		exception;
		break MISSING_BLOCK_LABEL_215;
		obj = ((Object) (context));
	//   92  173:aload_1         
	//   93  174:astore_2        
		if(obj1 != null)
	//*  94  175:aload           4
	//*  95  177:ifnull          260
		{
			try
			{
				((InputStream) (obj1)).close();
	//   96  180:aload           4
	//   97  182:invokevirtual   #169 <Method void InputStream.close()>
			}
	//*  98  185:aload_1         
	//*  99  186:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 100  187:astore_2        
			{
				Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
	//  101  188:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//  102  191:ldc1            #20  <String "Beta">
	//  103  193:ldc1            #171 <String "Error closing Beta build properties asset">
	//  104  195:aload_2         
	//  105  196:invokeinterface #86  <Method void Logger.e(String, String, Throwable)>
				return ((BuildProperties) (context));
	//  106  201:aload_1         
	//  107  202:areturn         
			}
			return ((BuildProperties) (context));
		}
		break MISSING_BLOCK_LABEL_260;
		context;
	//  108  203:astore_1        
		obj = null;
	//  109  204:aconst_null     
	//  110  205:astore_2        
		break MISSING_BLOCK_LABEL_263;
	//  111  206:goto            263
		exception;
	//  112  209:astore_3        
		context = null;
	//  113  210:aconst_null     
	//  114  211:astore_1        
		obj1 = ((Object) (context));
	//  115  212:aload_1         
	//  116  213:astore          4
		obj = obj1;
	//  117  215:aload           4
	//  118  217:astore_2        
		Fabric.getLogger().e("Beta", "Error reading Beta build properties", ((Throwable) (exception)));
	//  119  218:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//  120  221:ldc1            #20  <String "Beta">
	//  121  223:ldc1            #173 <String "Error reading Beta build properties">
	//  122  225:aload_3         
	//  123  226:invokeinterface #86  <Method void Logger.e(String, String, Throwable)>
		if(obj1 != null)
	//* 124  231:aload           4
	//* 125  233:ifnull          258
			try
			{
				((InputStream) (obj1)).close();
	//  126  236:aload           4
	//  127  238:invokevirtual   #169 <Method void InputStream.close()>
			}
	//* 128  241:goto            258
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 129  244:astore_2        
			{
				Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
	//  130  245:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//  131  248:ldc1            #20  <String "Beta">
	//  132  250:ldc1            #171 <String "Error closing Beta build properties asset">
	//  133  252:aload_2         
	//  134  253:invokeinterface #86  <Method void Logger.e(String, String, Throwable)>
			}
		obj = ((Object) (context));
	//  135  258:aload_1         
	//  136  259:astore_2        
		return ((BuildProperties) (obj));
	//  137  260:aload_2         
	//  138  261:areturn         
		context;
	//  139  262:astore_1        
		if(obj != null)
	//* 140  263:aload_2         
	//* 141  264:ifnull          288
			try
			{
				((InputStream) (obj)).close();
	//  142  267:aload_2         
	//  143  268:invokevirtual   #169 <Method void InputStream.close()>
			}
	//* 144  271:goto            288
			catch(IOException ioexception)
	//* 145  274:astore_2        
			{
				Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ((Throwable) (ioexception)));
	//  146  275:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//  147  278:ldc1            #20  <String "Beta">
	//  148  280:ldc1            #171 <String "Error closing Beta build properties asset">
	//  149  282:aload_2         
	//  150  283:invokeinterface #86  <Method void Logger.e(String, String, Throwable)>
			}
		throw context;
	//  151  288:aload_1         
	//  152  289:athrow          
	}

	boolean canCheckForUpdates(BetaSettingsData betasettingsdata, BuildProperties buildproperties)
	{
		return betasettingsdata != null && !TextUtils.isEmpty(((CharSequence) (betasettingsdata.updateUrl))) && buildproperties != null;
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:getfield        #180 <Field String BetaSettingsData.updateUrl>
	//    4    8:invokestatic    #186 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5   11:ifne            20
	//    6   14:aload_2         
	//    7   15:ifnull          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	UpdatesController createUpdatesController(int i, Application application)
	{
		if(i >= 14)
	//*   0    0:iload_1         
	//*   1    1:bipush          14
	//*   2    3:icmplt          28
			return ((UpdatesController) (new ActivityLifecycleCheckForUpdatesController(getFabric().getActivityLifecycleManager(), getFabric().getExecutorService())));
	//    3    6:new             #193 <Class ActivityLifecycleCheckForUpdatesController>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokevirtual   #197 <Method Fabric getFabric()>
	//    7   14:invokevirtual   #201 <Method io.fabric.sdk.android.ActivityLifecycleManager Fabric.getActivityLifecycleManager()>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #197 <Method Fabric getFabric()>
	//   10   21:invokevirtual   #205 <Method java.util.concurrent.ExecutorService Fabric.getExecutorService()>
	//   11   24:invokespecial   #208 <Method void ActivityLifecycleCheckForUpdatesController(io.fabric.sdk.android.ActivityLifecycleManager, java.util.concurrent.ExecutorService)>
	//   12   27:areturn         
		else
			return ((UpdatesController) (new ImmediateCheckForUpdatesController()));
	//   13   28:new             #210 <Class ImmediateCheckForUpdatesController>
	//   14   31:dup             
	//   15   32:invokespecial   #211 <Method void ImmediateCheckForUpdatesController()>
	//   16   35:areturn         
	}

	protected Boolean doInBackground()
	{
		Fabric.getLogger().d("Beta", "Beta kit initializing...");
	//    0    0:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #20  <String "Beta">
	//    2    5:ldc1            #216 <String "Beta kit initializing...">
	//    3    7:invokeinterface #70  <Method void Logger.d(String, String)>
		Context context = getContext();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #220 <Method Context getContext()>
	//    6   16:astore_1        
		IdManager idmanager = getIdManager();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #224 <Method IdManager getIdManager()>
	//    9   21:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (getBetaDeviceToken(context, idmanager.getInstallerPackageName())))))
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #229 <Method String IdManager.getInstallerPackageName()>
	//*  14   28:invokespecial   #231 <Method String getBetaDeviceToken(Context, String)>
	//*  15   31:invokestatic    #186 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   34:ifeq            54
		{
			Fabric.getLogger().d("Beta", "A Beta device token was not found for this app");
	//   17   37:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   18   40:ldc1            #20  <String "Beta">
	//   19   42:ldc1            #233 <String "A Beta device token was not found for this app">
	//   20   44:invokeinterface #70  <Method void Logger.d(String, String)>
			return Boolean.valueOf(false);
	//   21   49:iconst_0        
	//   22   50:invokestatic    #239 <Method Boolean Boolean.valueOf(boolean)>
	//   23   53:areturn         
		}
		Fabric.getLogger().d("Beta", "Beta device token is present, checking for app updates.");
	//   24   54:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   25   57:ldc1            #20  <String "Beta">
	//   26   59:ldc1            #241 <String "Beta device token is present, checking for app updates.">
	//   27   61:invokeinterface #70  <Method void Logger.d(String, String)>
		BetaSettingsData betasettingsdata = getBetaSettingsData();
	//   28   66:aload_0         
	//   29   67:invokespecial   #243 <Method BetaSettingsData getBetaSettingsData()>
	//   30   70:astore_3        
		BuildProperties buildproperties = loadBuildProperties(context);
	//   31   71:aload_0         
	//   32   72:aload_1         
	//   33   73:invokespecial   #245 <Method BuildProperties loadBuildProperties(Context)>
	//   34   76:astore          4
		if(canCheckForUpdates(betasettingsdata, buildproperties))
	//*  35   78:aload_0         
	//*  36   79:aload_3         
	//*  37   80:aload           4
	//*  38   82:invokevirtual   #247 <Method boolean canCheckForUpdates(BetaSettingsData, BuildProperties)>
	//*  39   85:ifeq            128
			updatesController.initialize(context, this, idmanager, betasettingsdata, buildproperties, ((io.fabric.sdk.android.services.persistence.PreferenceStore) (new PreferenceStoreImpl(((Kit) (this))))), ((io.fabric.sdk.android.services.common.CurrentTimeProvider) (new SystemCurrentTimeProvider())), ((io.fabric.sdk.android.services.network.HttpRequestFactory) (new DefaultHttpRequestFactory(Fabric.getLogger()))));
	//   40   88:aload_0         
	//   41   89:getfield        #249 <Field UpdatesController updatesController>
	//   42   92:aload_1         
	//   43   93:aload_0         
	//   44   94:aload_2         
	//   45   95:aload_3         
	//   46   96:aload           4
	//   47   98:new             #251 <Class PreferenceStoreImpl>
	//   48  101:dup             
	//   49  102:aload_0         
	//   50  103:invokespecial   #254 <Method void PreferenceStoreImpl(Kit)>
	//   51  106:new             #256 <Class SystemCurrentTimeProvider>
	//   52  109:dup             
	//   53  110:invokespecial   #257 <Method void SystemCurrentTimeProvider()>
	//   54  113:new             #259 <Class DefaultHttpRequestFactory>
	//   55  116:dup             
	//   56  117:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   57  120:invokespecial   #262 <Method void DefaultHttpRequestFactory(Logger)>
	//   58  123:invokeinterface #268 <Method void UpdatesController.initialize(Context, Beta, IdManager, BetaSettingsData, BuildProperties, io.fabric.sdk.android.services.persistence.PreferenceStore, io.fabric.sdk.android.services.common.CurrentTimeProvider, io.fabric.sdk.android.services.network.HttpRequestFactory)>
		return Boolean.valueOf(true);
	//   59  128:iconst_1        
	//   60  129:invokestatic    #239 <Method Boolean Boolean.valueOf(boolean)>
	//   61  132:areturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public Map getDeviceIdentifiers()
	{
		String s = getIdManager().getInstallerPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #224 <Method IdManager getIdManager()>
	//    2    4:invokevirtual   #229 <Method String IdManager.getInstallerPackageName()>
	//    3    7:astore_1        
		s = getBetaDeviceToken(getContext(), s);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #220 <Method Context getContext()>
	//    7   13:aload_1         
	//    8   14:invokespecial   #231 <Method String getBetaDeviceToken(Context, String)>
	//    9   17:astore_1        
		HashMap hashmap = new HashMap();
	//   10   18:new             #275 <Class HashMap>
	//   11   21:dup             
	//   12   22:invokespecial   #276 <Method void HashMap()>
	//   13   25:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #186 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   30:ifne            44
			((Map) (hashmap)).put(((Object) (io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN)), ((Object) (s)));
	//   17   33:aload_2         
	//   18   34:getstatic       #282 <Field io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.FONT_TOKEN>
	//   19   37:aload_1         
	//   20   38:invokeinterface #288 <Method Object Map.put(Object, Object)>
	//   21   43:pop             
		return ((Map) (hashmap));
	//   22   44:aload_2         
	//   23   45:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:beta";
	//    0    0:ldc2            #293 <String "com.crashlytics.sdk.android:beta">
	//    1    3:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method Context getContext()>
	//    2    4:ldc1            #11  <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #299 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4    9:areturn         
	}

	public String getVersion()
	{
		return "1.1.4.92";
	//    0    0:ldc2            #302 <String "1.1.4.92">
	//    1    3:areturn         
	}

	boolean isAppPossiblyInstalledByBeta(String s, int i)
	{
		if(i < 11)
	//*   0    0:iload_2         
	//*   1    1:bipush          11
	//*   2    3:icmpge          14
			return s == null;
	//    3    6:aload_1         
	//    4    7:ifnonnull       12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
		else
			return "io.crash.air".equals(((Object) (s)));
	//    9   14:ldc2            #305 <String "io.crash.air">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   12   21:ireturn         
	}

	protected boolean onPreExecute()
	{
		Application application = (Application)getContext().getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method Context getContext()>
	//    2    4:invokevirtual   #310 <Method Context Context.getApplicationContext()>
	//    3    7:checkcast       #312 <Class Application>
	//    4   10:astore_1        
		updatesController = createUpdatesController(android.os.Build.VERSION.SDK_INT, application);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #314 <Method UpdatesController createUpdatesController(int, Application)>
	//   10   20:putfield        #249 <Field UpdatesController updatesController>
		return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
	private static final String CRASHLYTICS_BUILD_PROPERTIES = "crashlytics-build.properties";
	static final String NO_DEVICE_TOKEN = "";
	public static final String TAG = "Beta";
	private final MemoryValueCache deviceTokenCache = new MemoryValueCache();
	private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
	private UpdatesController updatesController;
}
