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
	//    1    1:invokespecial   #18  <Method void Kit()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class MemoryValueCache>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void MemoryValueCache()>
	//    6   12:putfield        #23  <Field MemoryValueCache deviceTokenCache>
	//    7   15:aload_0         
	//    8   16:new             #25  <Class DeviceTokenLoader>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void DeviceTokenLoader()>
	//   11   23:putfield        #28  <Field DeviceTokenLoader deviceTokenLoader>
	//   12   26:return          
	}

	private String getBetaDeviceToken(Context context, String s)
	{
		s = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		boolean flag;
		context = ((Context) ((String)deviceTokenCache.get(context, ((io.fabric.sdk.android.services.cache.ValueLoader) (deviceTokenLoader)))));
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field MemoryValueCache deviceTokenCache>
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field DeviceTokenLoader deviceTokenLoader>
	//    7   11:invokevirtual   #37  <Method Object MemoryValueCache.get(Context, io.fabric.sdk.android.services.cache.ValueLoader)>
	//    8   14:checkcast       #39  <Class String>
	//    9   17:astore_1        
		flag = "".equals(((Object) (context)));
	//   10   18:ldc1            #41  <String "">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #45  <Method boolean String.equals(Object)>
	//   13   24:istore_3        
		if(flag)
	//*  14   25:iload_3         
	//*  15   26:ifeq            34
			context = ((Context) (s));
	//   16   29:aload_2         
	//   17   30:astore_1        
		break MISSING_BLOCK_LABEL_53;
	//   18   31:goto            53
	//*  19   34:goto            53
		context;
	//   20   37:astore_1        
		Fabric.getLogger().e("Beta", "Failed to load the Beta device token", ((Throwable) (context)));
	//   21   38:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   22   41:ldc1            #53  <String "Beta">
	//   23   43:ldc1            #55  <String "Failed to load the Beta device token">
	//   24   45:aload_1         
	//   25   46:invokeinterface #61  <Method void Logger.e(String, String, Throwable)>
		context = ((Context) (s));
	//   26   51:aload_2         
	//   27   52:astore_1        
		s = ((String) (Fabric.getLogger()));
	//   28   53:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   29   56:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   30   57:new             #63  <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #64  <Method void StringBuilder()>
	//   33   64:astore          4
		stringbuilder.append("Beta device token present: ");
	//   34   66:aload           4
	//   35   68:ldc1            #66  <String "Beta device token present: ">
	//   36   70:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		stringbuilder.append(TextUtils.isEmpty(((CharSequence) (context))) ^ true);
	//   38   74:aload           4
	//   39   76:aload_1         
	//   40   77:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   41   80:iconst_1        
	//   42   81:ixor            
	//   43   82:invokevirtual   #79  <Method StringBuilder StringBuilder.append(boolean)>
	//   44   85:pop             
		((Logger) (s)).d("Beta", stringbuilder.toString());
	//   45   86:aload_2         
	//   46   87:ldc1            #53  <String "Beta">
	//   47   89:aload           4
	//   48   91:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   49   94:invokeinterface #87  <Method void Logger.d(String, String)>
		return ((String) (context));
	//   50   99:aload_1         
	//   51  100:areturn         
	}

	private BetaSettingsData getBetaSettingsData()
	{
		SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
	//    0    0:invokestatic    #95  <Method Settings Settings.getInstance()>
	//    1    3:invokevirtual   #99  <Method SettingsData Settings.awaitSettingsData()>
	//    2    6:astore_1        
		if(settingsdata != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          16
			return settingsdata.betaSettingsData;
	//    5   11:aload_1         
	//    6   12:getfield        #105 <Field BetaSettingsData SettingsData.betaSettingsData>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	private BuildProperties loadBuildProperties(Context context)
	{
		Object obj;
		Logger logger;
		StringBuilder stringbuilder;
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore_2        
		stringbuilder = null;
	//    4    5:aconst_null     
	//    5    6:astore          5
		logger = null;
	//    6    8:aconst_null     
	//    7    9:astore          4
		Object obj1 = ((Object) (context.getAssets().open("crashlytics-build.properties")));
	//    8   11:aload_1         
	//    9   12:invokevirtual   #115 <Method AssetManager Context.getAssets()>
	//   10   15:ldc1            #117 <String "crashlytics-build.properties">
	//   11   17:invokevirtual   #123 <Method InputStream AssetManager.open(String)>
	//   12   20:astore_3        
		obj = ((Object) (obj2));
	//   13   21:aload           6
	//   14   23:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_168;
	//   15   24:aload_3         
	//   16   25:ifnull          168
		context = ((Context) (logger));
	//   17   28:aload           4
	//   18   30:astore_1        
		obj = ((Object) (BuildProperties.fromPropertiesStream(((InputStream) (obj1)))));
	//   19   31:aload_3         
	//   20   32:invokestatic    #129 <Method BuildProperties BuildProperties.fromPropertiesStream(InputStream)>
	//   21   35:astore_2        
		context = ((Context) (obj));
	//   22   36:aload_2         
	//   23   37:astore_1        
		logger = Fabric.getLogger();
	//   24   38:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   25   41:astore          4
		context = ((Context) (obj));
	//   26   43:aload_2         
	//   27   44:astore_1        
		stringbuilder = new StringBuilder();
	//   28   45:new             #63  <Class StringBuilder>
	//   29   48:dup             
	//   30   49:invokespecial   #64  <Method void StringBuilder()>
	//   31   52:astore          5
		context = ((Context) (obj));
	//   32   54:aload_2         
	//   33   55:astore_1        
		stringbuilder.append(((BuildProperties) (obj)).packageName);
	//   34   56:aload           5
	//   35   58:aload_2         
	//   36   59:getfield        #133 <Field String BuildProperties.packageName>
	//   37   62:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   38   65:pop             
		context = ((Context) (obj));
	//   39   66:aload_2         
	//   40   67:astore_1        
		stringbuilder.append(" build properties: ");
	//   41   68:aload           5
	//   42   70:ldc1            #135 <String " build properties: ">
	//   43   72:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   44   75:pop             
		context = ((Context) (obj));
	//   45   76:aload_2         
	//   46   77:astore_1        
		stringbuilder.append(((BuildProperties) (obj)).versionName);
	//   47   78:aload           5
	//   48   80:aload_2         
	//   49   81:getfield        #138 <Field String BuildProperties.versionName>
	//   50   84:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   51   87:pop             
		context = ((Context) (obj));
	//   52   88:aload_2         
	//   53   89:astore_1        
		stringbuilder.append(" (");
	//   54   90:aload           5
	//   55   92:ldc1            #140 <String " (">
	//   56   94:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   57   97:pop             
		context = ((Context) (obj));
	//   58   98:aload_2         
	//   59   99:astore_1        
		stringbuilder.append(((BuildProperties) (obj)).versionCode);
	//   60  100:aload           5
	//   61  102:aload_2         
	//   62  103:getfield        #143 <Field String BuildProperties.versionCode>
	//   63  106:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   64  109:pop             
		context = ((Context) (obj));
	//   65  110:aload_2         
	//   66  111:astore_1        
		stringbuilder.append(") - ");
	//   67  112:aload           5
	//   68  114:ldc1            #145 <String ") - ">
	//   69  116:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   70  119:pop             
		context = ((Context) (obj));
	//   71  120:aload_2         
	//   72  121:astore_1        
		stringbuilder.append(((BuildProperties) (obj)).buildId);
	//   73  122:aload           5
	//   74  124:aload_2         
	//   75  125:getfield        #148 <Field String BuildProperties.buildId>
	//   76  128:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   77  131:pop             
		context = ((Context) (obj));
	//   78  132:aload_2         
	//   79  133:astore_1        
		logger.d("Beta", stringbuilder.toString());
	//   80  134:aload           4
	//   81  136:ldc1            #53  <String "Beta">
	//   82  138:aload           5
	//   83  140:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   84  143:invokeinterface #87  <Method void Logger.d(String, String)>
		break MISSING_BLOCK_LABEL_168;
	//   85  148:goto            168
		context;
	//   86  151:astore_1        
		obj = obj1;
	//   87  152:aload_3         
	//   88  153:astore_2        
		break MISSING_BLOCK_LABEL_248;
	//   89  154:goto            248
		Exception exception;
		exception;
	//   90  157:astore          4
		obj = obj1;
	//   91  159:aload_3         
	//   92  160:astore_2        
		obj1 = ((Object) (context));
	//   93  161:aload_1         
	//   94  162:astore_3        
		context = ((Context) (obj));
	//   95  163:aload_2         
	//   96  164:astore_1        
		break MISSING_BLOCK_LABEL_206;
	//   97  165:goto            206
		if(obj1 != null)
	//*  98  168:aload_3         
	//*  99  169:ifnull          193
			try
			{
				((InputStream) (obj1)).close();
	//  100  172:aload_3         
	//  101  173:invokevirtual   #153 <Method void InputStream.close()>
			}
	//* 102  176:goto            193
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 103  179:astore_1        
			{
				Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ((Throwable) (context)));
	//  104  180:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//  105  183:ldc1            #53  <String "Beta">
	//  106  185:ldc1            #155 <String "Error closing Beta build properties asset">
	//  107  187:aload_1         
	//  108  188:invokeinterface #61  <Method void Logger.e(String, String, Throwable)>
			}
		return ((BuildProperties) (obj));
	//  109  193:aload_2         
	//  110  194:areturn         
		context;
	//  111  195:astore_1        
		break MISSING_BLOCK_LABEL_248;
	//  112  196:goto            248
		exception;
	//  113  199:astore          4
		obj1 = null;
	//  114  201:aconst_null     
	//  115  202:astore_3        
		context = ((Context) (stringbuilder));
	//  116  203:aload           5
	//  117  205:astore_1        
		obj = ((Object) (context));
	//  118  206:aload_1         
	//  119  207:astore_2        
		Fabric.getLogger().e("Beta", "Error reading Beta build properties", ((Throwable) (exception)));
	//  120  208:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//  121  211:ldc1            #53  <String "Beta">
	//  122  213:ldc1            #157 <String "Error reading Beta build properties">
	//  123  215:aload           4
	//  124  217:invokeinterface #61  <Method void Logger.e(String, String, Throwable)>
		if(context == null)
			break MISSING_BLOCK_LABEL_246;
	//  125  222:aload_1         
	//  126  223:ifnull          246
		((InputStream) (context)).close();
	//  127  226:aload_1         
	//  128  227:invokevirtual   #153 <Method void InputStream.close()>
		return ((BuildProperties) (obj1));
	//  129  230:aload_3         
	//  130  231:areturn         
		context;
	//  131  232:astore_1        
		Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ((Throwable) (context)));
	//  132  233:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//  133  236:ldc1            #53  <String "Beta">
	//  134  238:ldc1            #155 <String "Error closing Beta build properties asset">
	//  135  240:aload_1         
	//  136  241:invokeinterface #61  <Method void Logger.e(String, String, Throwable)>
		return ((BuildProperties) (obj1));
	//  137  246:aload_3         
	//  138  247:areturn         
		if(obj != null)
	//* 139  248:aload_2         
	//* 140  249:ifnull          273
			try
			{
				((InputStream) (obj)).close();
	//  141  252:aload_2         
	//  142  253:invokevirtual   #153 <Method void InputStream.close()>
			}
	//* 143  256:goto            273
			catch(IOException ioexception)
	//* 144  259:astore_2        
			{
				Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ((Throwable) (ioexception)));
	//  145  260:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//  146  263:ldc1            #53  <String "Beta">
	//  147  265:ldc1            #155 <String "Error closing Beta build properties asset">
	//  148  267:aload_2         
	//  149  268:invokeinterface #61  <Method void Logger.e(String, String, Throwable)>
			}
		throw context;
	//  150  273:aload_1         
	//  151  274:athrow          
	}

	boolean canCheckForUpdates(BetaSettingsData betasettingsdata, BuildProperties buildproperties)
	{
		return betasettingsdata != null && !TextUtils.isEmpty(((CharSequence) (betasettingsdata.updateUrl))) && buildproperties != null;
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:getfield        #164 <Field String BetaSettingsData.updateUrl>
	//    4    8:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//    3    6:new             #171 <Class ActivityLifecycleCheckForUpdatesController>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokevirtual   #175 <Method Fabric getFabric()>
	//    7   14:invokevirtual   #179 <Method io.fabric.sdk.android.ActivityLifecycleManager Fabric.getActivityLifecycleManager()>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #175 <Method Fabric getFabric()>
	//   10   21:invokevirtual   #183 <Method java.util.concurrent.ExecutorService Fabric.getExecutorService()>
	//   11   24:invokespecial   #186 <Method void ActivityLifecycleCheckForUpdatesController(io.fabric.sdk.android.ActivityLifecycleManager, java.util.concurrent.ExecutorService)>
	//   12   27:areturn         
		else
			return ((UpdatesController) (new ImmediateCheckForUpdatesController()));
	//   13   28:new             #188 <Class ImmediateCheckForUpdatesController>
	//   14   31:dup             
	//   15   32:invokespecial   #189 <Method void ImmediateCheckForUpdatesController()>
	//   16   35:areturn         
	}

	protected Boolean doInBackground()
	{
		Fabric.getLogger().d("Beta", "Beta kit initializing...");
	//    0    0:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #53  <String "Beta">
	//    2    5:ldc1            #194 <String "Beta kit initializing...">
	//    3    7:invokeinterface #87  <Method void Logger.d(String, String)>
		Context context = getContext();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #198 <Method Context getContext()>
	//    6   16:astore_1        
		IdManager idmanager = getIdManager();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #202 <Method IdManager getIdManager()>
	//    9   21:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (getBetaDeviceToken(context, idmanager.getInstallerPackageName())))))
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #207 <Method String IdManager.getInstallerPackageName()>
	//*  14   28:invokespecial   #209 <Method String getBetaDeviceToken(Context, String)>
	//*  15   31:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   34:ifeq            54
		{
			Fabric.getLogger().d("Beta", "A Beta device token was not found for this app");
	//   17   37:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   18   40:ldc1            #53  <String "Beta">
	//   19   42:ldc1            #211 <String "A Beta device token was not found for this app">
	//   20   44:invokeinterface #87  <Method void Logger.d(String, String)>
			return Boolean.valueOf(false);
	//   21   49:iconst_0        
	//   22   50:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//   23   53:areturn         
		}
		Fabric.getLogger().d("Beta", "Beta device token is present, checking for app updates.");
	//   24   54:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   25   57:ldc1            #53  <String "Beta">
	//   26   59:ldc1            #219 <String "Beta device token is present, checking for app updates.">
	//   27   61:invokeinterface #87  <Method void Logger.d(String, String)>
		BetaSettingsData betasettingsdata = getBetaSettingsData();
	//   28   66:aload_0         
	//   29   67:invokespecial   #221 <Method BetaSettingsData getBetaSettingsData()>
	//   30   70:astore_3        
		BuildProperties buildproperties = loadBuildProperties(context);
	//   31   71:aload_0         
	//   32   72:aload_1         
	//   33   73:invokespecial   #223 <Method BuildProperties loadBuildProperties(Context)>
	//   34   76:astore          4
		if(canCheckForUpdates(betasettingsdata, buildproperties))
	//*  35   78:aload_0         
	//*  36   79:aload_3         
	//*  37   80:aload           4
	//*  38   82:invokevirtual   #225 <Method boolean canCheckForUpdates(BetaSettingsData, BuildProperties)>
	//*  39   85:ifeq            128
			updatesController.initialize(context, this, idmanager, betasettingsdata, buildproperties, ((io.fabric.sdk.android.services.persistence.PreferenceStore) (new PreferenceStoreImpl(((Kit) (this))))), ((io.fabric.sdk.android.services.common.CurrentTimeProvider) (new SystemCurrentTimeProvider())), ((io.fabric.sdk.android.services.network.HttpRequestFactory) (new DefaultHttpRequestFactory(Fabric.getLogger()))));
	//   40   88:aload_0         
	//   41   89:getfield        #227 <Field UpdatesController updatesController>
	//   42   92:aload_1         
	//   43   93:aload_0         
	//   44   94:aload_2         
	//   45   95:aload_3         
	//   46   96:aload           4
	//   47   98:new             #229 <Class PreferenceStoreImpl>
	//   48  101:dup             
	//   49  102:aload_0         
	//   50  103:invokespecial   #232 <Method void PreferenceStoreImpl(Kit)>
	//   51  106:new             #234 <Class SystemCurrentTimeProvider>
	//   52  109:dup             
	//   53  110:invokespecial   #235 <Method void SystemCurrentTimeProvider()>
	//   54  113:new             #237 <Class DefaultHttpRequestFactory>
	//   55  116:dup             
	//   56  117:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   57  120:invokespecial   #240 <Method void DefaultHttpRequestFactory(Logger)>
	//   58  123:invokeinterface #246 <Method void UpdatesController.initialize(Context, Beta, IdManager, BetaSettingsData, BuildProperties, io.fabric.sdk.android.services.persistence.PreferenceStore, io.fabric.sdk.android.services.common.CurrentTimeProvider, io.fabric.sdk.android.services.network.HttpRequestFactory)>
		return Boolean.valueOf(true);
	//   59  128:iconst_1        
	//   60  129:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//   61  132:areturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public Map getDeviceIdentifiers()
	{
		String s = getIdManager().getInstallerPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method IdManager getIdManager()>
	//    2    4:invokevirtual   #207 <Method String IdManager.getInstallerPackageName()>
	//    3    7:astore_1        
		s = getBetaDeviceToken(getContext(), s);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #198 <Method Context getContext()>
	//    7   13:aload_1         
	//    8   14:invokespecial   #209 <Method String getBetaDeviceToken(Context, String)>
	//    9   17:astore_1        
		HashMap hashmap = new HashMap();
	//   10   18:new             #253 <Class HashMap>
	//   11   21:dup             
	//   12   22:invokespecial   #254 <Method void HashMap()>
	//   13   25:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   30:ifne            44
			((Map) (hashmap)).put(((Object) (io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN)), ((Object) (s)));
	//   17   33:aload_2         
	//   18   34:getstatic       #260 <Field io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.FONT_TOKEN>
	//   19   37:aload_1         
	//   20   38:invokeinterface #266 <Method Object Map.put(Object, Object)>
	//   21   43:pop             
		return ((Map) (hashmap));
	//   22   44:aload_2         
	//   23   45:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:beta";
	//    0    0:ldc2            #271 <String "com.crashlytics.sdk.android:beta">
	//    1    3:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method Context getContext()>
	//    2    4:ldc2            #274 <String "com.crashlytics.ApiEndpoint">
	//    3    7:invokestatic    #279 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4   10:areturn         
	}

	public String getVersion()
	{
		return "1.2.5.dev";
	//    0    0:ldc2            #282 <String "1.2.5.dev">
	//    1    3:areturn         
	}

	protected boolean onPreExecute()
	{
		Application application = (Application)getContext().getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method Context getContext()>
	//    2    4:invokevirtual   #287 <Method Context Context.getApplicationContext()>
	//    3    7:checkcast       #289 <Class Application>
	//    4   10:astore_1        
		updatesController = createUpdatesController(android.os.Build.VERSION.SDK_INT, application);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getstatic       #295 <Field int android.os.Build$VERSION.SDK_INT>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #297 <Method UpdatesController createUpdatesController(int, Application)>
	//   10   20:putfield        #227 <Field UpdatesController updatesController>
		return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	private final MemoryValueCache deviceTokenCache = new MemoryValueCache();
	private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
	private UpdatesController updatesController;
}
