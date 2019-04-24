// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			SettingsData, DefaultSettingsJsonTransform, DefaultCachedSettingsIo, DefaultSettingsSpiCall, 
//			DefaultSettingsController, SettingsRequest, SettingsController, SettingsCacheBehavior

public class Settings
{
	static class LazyHolder
	{

		private static final Settings INSTANCE = new Settings();

		static 
		{
		//    0    0:new             #6   <Class Settings>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #15  <Method void Settings(Settings$1)>
		//    4    8:putstatic       #17  <Field Settings INSTANCE>
		//*   5   11:return          
		}


/*
		static Settings access$100()
		{
			return INSTANCE;
		//    0    0:getstatic       #17  <Field Settings INSTANCE>
		//    1    3:areturn         
		}

*/

		LazyHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface SettingsAccess
	{

		public abstract Object usingSettings(SettingsData settingsdata);
	}


	private Settings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		settingsData = new AtomicReference();
	//    2    4:aload_0         
	//    3    5:new             #34  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void AtomicReference()>
	//    6   12:putfield        #37  <Field AtomicReference settingsData>
		settingsDataLatch = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #39  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #42  <Method void CountDownLatch(int)>
	//   12   24:putfield        #44  <Field CountDownLatch settingsDataLatch>
		initialized = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #46  <Field boolean initialized>
	//   16   32:return          
	}


	public static Settings getInstance()
	{
		return LazyHolder.INSTANCE;
	//    0    0:invokestatic    #54  <Method Settings Settings$LazyHolder.access$100()>
	//    1    3:areturn         
	}

	private void setSettingsData(SettingsData settingsdata)
	{
		settingsData.set(((Object) (settingsdata)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AtomicReference settingsData>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method void AtomicReference.set(Object)>
		settingsDataLatch.countDown();
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field CountDownLatch settingsDataLatch>
	//    6   12:invokevirtual   #63  <Method void CountDownLatch.countDown()>
	//    7   15:return          
	}

	public SettingsData awaitSettingsData()
	{
		SettingsData settingsdata;
		try
		{
			settingsDataLatch.await();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field CountDownLatch settingsDataLatch>
	//    2    4:invokevirtual   #70  <Method void CountDownLatch.await()>
			settingsdata = (SettingsData)settingsData.get();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field AtomicReference settingsData>
	//    5   11:invokevirtual   #74  <Method Object AtomicReference.get()>
	//    6   14:checkcast       #76  <Class SettingsData>
	//    7   17:astore_1        
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		catch(InterruptedException interruptedexception)
	//*  10   20:astore_1        
		{
			Fabric.getLogger().e("Fabric", "Interrupted while waiting for settings data.");
	//   11   21:invokestatic    #82  <Method Logger Fabric.getLogger()>
	//   12   24:ldc1            #84  <String "Fabric">
	//   13   26:ldc1            #86  <String "Interrupted while waiting for settings data.">
	//   14   28:invokeinterface #92  <Method void Logger.e(String, String)>
			return null;
	//   15   33:aconst_null     
	//   16   34:areturn         
		}
		return settingsdata;
	}

	public void clearSettings()
	{
		settingsData.set(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AtomicReference settingsData>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #60  <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	public Settings initialize(Kit kit, IdManager idmanager, HttpRequestFactory httprequestfactory, String s, String s1, String s2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = initialized;
	//    2    2:aload_0         
	//    3    3:getfield        #46  <Field boolean initialized>
	//    4    6:istore          7
		if(!flag) goto _L2; else goto _L1
	//    5    8:iload           7
	//    6   10:ifeq            17
_L1:
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
_L2:
		if(settingsController == null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #97  <Field SettingsController settingsController>
	//*  13   21:ifnonnull       201
		{
			android.content.Context context = kit.getContext();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #103 <Method android.content.Context Kit.getContext()>
	//   16   28:astore          8
			String s6 = idmanager.getAppIdentifier();
	//   17   30:aload_2         
	//   18   31:invokevirtual   #109 <Method String IdManager.getAppIdentifier()>
	//   19   34:astore          15
			String s3 = (new ApiKey()).getValue(context);
	//   20   36:new             #111 <Class ApiKey>
	//   21   39:dup             
	//   22   40:invokespecial   #112 <Method void ApiKey()>
	//   23   43:aload           8
	//   24   45:invokevirtual   #116 <Method String ApiKey.getValue(android.content.Context)>
	//   25   48:astore          9
			String s4 = idmanager.getInstallerPackageName();
	//   26   50:aload_2         
	//   27   51:invokevirtual   #119 <Method String IdManager.getInstallerPackageName()>
	//   28   54:astore          10
			SystemCurrentTimeProvider systemcurrenttimeprovider = new SystemCurrentTimeProvider();
	//   29   56:new             #121 <Class SystemCurrentTimeProvider>
	//   30   59:dup             
	//   31   60:invokespecial   #122 <Method void SystemCurrentTimeProvider()>
	//   32   63:astore          11
			DefaultSettingsJsonTransform defaultsettingsjsontransform = new DefaultSettingsJsonTransform();
	//   33   65:new             #124 <Class DefaultSettingsJsonTransform>
	//   34   68:dup             
	//   35   69:invokespecial   #125 <Method void DefaultSettingsJsonTransform()>
	//   36   72:astore          12
			DefaultCachedSettingsIo defaultcachedsettingsio = new DefaultCachedSettingsIo(kit);
	//   37   74:new             #127 <Class DefaultCachedSettingsIo>
	//   38   77:dup             
	//   39   78:aload_1         
	//   40   79:invokespecial   #130 <Method void DefaultCachedSettingsIo(Kit)>
	//   41   82:astore          13
			String s5 = CommonUtils.getAppIconHashOrNull(context);
	//   42   84:aload           8
	//   43   86:invokestatic    #135 <Method String CommonUtils.getAppIconHashOrNull(android.content.Context)>
	//   44   89:astore          14
			httprequestfactory = ((HttpRequestFactory) (new DefaultSettingsSpiCall(kit, s2, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
				s6
			}), httprequestfactory)));
	//   45   91:new             #137 <Class DefaultSettingsSpiCall>
	//   46   94:dup             
	//   47   95:aload_1         
	//   48   96:aload           6
	//   49   98:getstatic       #143 <Field Locale Locale.US>
	//   50  101:ldc1            #19  <String "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings">
	//   51  103:iconst_1        
	//   52  104:anewarray       Object[]
	//   53  107:dup             
	//   54  108:iconst_0        
	//   55  109:aload           15
	//   56  111:aastore         
	//   57  112:invokestatic    #149 <Method String String.format(Locale, String, Object[])>
	//   58  115:aload_3         
	//   59  116:invokespecial   #152 <Method void DefaultSettingsSpiCall(Kit, String, String, HttpRequestFactory)>
	//   60  119:astore_3        
			settingsController = ((SettingsController) (new DefaultSettingsController(kit, new SettingsRequest(s3, idmanager.getModelName(), idmanager.getOsBuildVersionString(), idmanager.getOsDisplayVersionString(), idmanager.getAdvertisingId(), idmanager.getAppInstallIdentifier(), idmanager.getAndroidId(), CommonUtils.createInstanceIdFrom(new String[] {
				CommonUtils.resolveBuildId(context)
			}), s1, s, DeliveryMechanism.determineFrom(s4).getId(), s5), ((io.fabric.sdk.android.services.common.CurrentTimeProvider) (systemcurrenttimeprovider)), ((SettingsJsonTransform) (defaultsettingsjsontransform)), ((CachedSettingsIo) (defaultcachedsettingsio)), ((SettingsSpiCall) (httprequestfactory)))));
	//   61  120:aload_0         
	//   62  121:new             #154 <Class DefaultSettingsController>
	//   63  124:dup             
	//   64  125:aload_1         
	//   65  126:new             #156 <Class SettingsRequest>
	//   66  129:dup             
	//   67  130:aload           9
	//   68  132:aload_2         
	//   69  133:invokevirtual   #159 <Method String IdManager.getModelName()>
	//   70  136:aload_2         
	//   71  137:invokevirtual   #162 <Method String IdManager.getOsBuildVersionString()>
	//   72  140:aload_2         
	//   73  141:invokevirtual   #165 <Method String IdManager.getOsDisplayVersionString()>
	//   74  144:aload_2         
	//   75  145:invokevirtual   #168 <Method String IdManager.getAdvertisingId()>
	//   76  148:aload_2         
	//   77  149:invokevirtual   #171 <Method String IdManager.getAppInstallIdentifier()>
	//   78  152:aload_2         
	//   79  153:invokevirtual   #174 <Method String IdManager.getAndroidId()>
	//   80  156:iconst_1        
	//   81  157:anewarray       String[]
	//   82  160:dup             
	//   83  161:iconst_0        
	//   84  162:aload           8
	//   85  164:invokestatic    #177 <Method String CommonUtils.resolveBuildId(android.content.Context)>
	//   86  167:aastore         
	//   87  168:invokestatic    #181 <Method String CommonUtils.createInstanceIdFrom(String[])>
	//   88  171:aload           5
	//   89  173:aload           4
	//   90  175:aload           10
	//   91  177:invokestatic    #187 <Method DeliveryMechanism DeliveryMechanism.determineFrom(String)>
	//   92  180:invokevirtual   #191 <Method int DeliveryMechanism.getId()>
	//   93  183:aload           14
	//   94  185:invokespecial   #194 <Method void SettingsRequest(String, String, String, String, String, String, String, String, String, String, int, String)>
	//   95  188:aload           11
	//   96  190:aload           12
	//   97  192:aload           13
	//   98  194:aload_3         
	//   99  195:invokespecial   #197 <Method void DefaultSettingsController(Kit, SettingsRequest, io.fabric.sdk.android.services.common.CurrentTimeProvider, SettingsJsonTransform, CachedSettingsIo, SettingsSpiCall)>
	//  100  198:putfield        #97  <Field SettingsController settingsController>
		}
		initialized = true;
	//  101  201:aload_0         
	//  102  202:iconst_1        
	//  103  203:putfield        #46  <Field boolean initialized>
		if(true) goto _L1; else goto _L3
	//  104  206:goto            13
_L3:
		kit;
	//  105  209:astore_1        
	//* 106  210:aload_0         
		throw kit;
	//  107  211:monitorexit     
	//  108  212:aload_1         
	//  109  213:athrow          
	}

	public boolean loadSettingsData()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SettingsData settingsdata;
		settingsdata = settingsController.loadSettingsData();
	//    2    2:aload_0         
	//    3    3:getfield        #97  <Field SettingsController settingsController>
	//    4    6:invokeinterface #203 <Method SettingsData SettingsController.loadSettingsData()>
	//    5   11:astore_2        
		setSettingsData(settingsdata);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #205 <Method void setSettingsData(SettingsData)>
		boolean flag;
		if(settingsdata != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          27
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
		else
	//*  13   23:aload_0         
	//*  14   24:monitorexit     
	//*  15   25:iload_1         
	//*  16   26:ireturn         
			flag = false;
	//   17   27:iconst_0        
	//   18   28:istore_1        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  19   29:goto            23
		Exception exception;
		exception;
	//   20   32:astore_2        
	//*  21   33:aload_0         
		throw exception;
	//   22   34:monitorexit     
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	public boolean loadSettingsSkippingCache()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SettingsData settingsdata;
		settingsdata = settingsController.loadSettingsData(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
	//    2    2:aload_0         
	//    3    3:getfield        #97  <Field SettingsController settingsController>
	//    4    6:getstatic       #212 <Field SettingsCacheBehavior SettingsCacheBehavior.SKIP_CACHE_LOOKUP>
	//    5    9:invokeinterface #215 <Method SettingsData SettingsController.loadSettingsData(SettingsCacheBehavior)>
	//    6   14:astore_2        
		setSettingsData(settingsdata);
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokespecial   #205 <Method void setSettingsData(SettingsData)>
		if(settingsdata != null)
			break MISSING_BLOCK_LABEL_37;
	//   10   20:aload_2         
	//   11   21:ifnonnull       37
		Fabric.getLogger().e("Fabric", "Failed to force reload of settings from Crashlytics.", ((Throwable) (null)));
	//   12   24:invokestatic    #82  <Method Logger Fabric.getLogger()>
	//   13   27:ldc1            #84  <String "Fabric">
	//   14   29:ldc1            #217 <String "Failed to force reload of settings from Crashlytics.">
	//   15   31:aconst_null     
	//   16   32:invokeinterface #220 <Method void Logger.e(String, String, Throwable)>
		boolean flag;
		if(settingsdata != null)
	//*  17   37:aload_2         
	//*  18   38:ifnull          47
			flag = true;
	//   19   41:iconst_1        
	//   20   42:istore_1        
		else
	//*  21   43:aload_0         
	//*  22   44:monitorexit     
	//*  23   45:iload_1         
	//*  24   46:ireturn         
			flag = false;
	//   25   47:iconst_0        
	//   26   48:istore_1        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  27   49:goto            43
		Exception exception;
		exception;
	//   28   52:astore_2        
	//*  29   53:aload_0         
		throw exception;
	//   30   54:monitorexit     
	//   31   55:aload_2         
	//   32   56:athrow          
	}

	public void setSettingsController(SettingsController settingscontroller)
	{
		settingsController = settingscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field SettingsController settingsController>
	//    3    5:return          
	}

	public Object withSettings(SettingsAccess settingsaccess, Object obj)
	{
		SettingsData settingsdata = (SettingsData)settingsData.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AtomicReference settingsData>
	//    2    4:invokevirtual   #74  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #76  <Class SettingsData>
	//    4   10:astore_3        
		if(settingsdata == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       17
			return obj;
	//    7   15:aload_2         
	//    8   16:areturn         
		else
			return settingsaccess.usingSettings(settingsdata);
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:invokeinterface #228 <Method Object Settings$SettingsAccess.usingSettings(SettingsData)>
	//   12   24:areturn         
	}

	public static final String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
	private static final String SETTINGS_URL_FORMAT = "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings";
	private boolean initialized;
	private SettingsController settingsController;
	private final AtomicReference settingsData;
	private final CountDownLatch settingsDataLatch;
}
