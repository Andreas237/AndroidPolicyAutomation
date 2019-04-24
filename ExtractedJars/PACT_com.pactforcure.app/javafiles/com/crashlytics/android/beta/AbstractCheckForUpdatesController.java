// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.beta:
//			UpdatesController, CheckForUpdatesRequest, Beta, CheckForUpdatesResponseTransform, 
//			BuildProperties

abstract class AbstractCheckForUpdatesController
	implements UpdatesController
{

	public AbstractCheckForUpdatesController()
	{
		this(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #42  <Method void AbstractCheckForUpdatesController(boolean)>
	//    3    5:return          
	}

	public AbstractCheckForUpdatesController(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		initialized = new AtomicBoolean();
	//    2    4:aload_0         
	//    3    5:new             #47  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void AtomicBoolean()>
	//    6   12:putfield        #50  <Field AtomicBoolean initialized>
		lastCheckTimeMillis = 0L;
	//    7   15:aload_0         
	//    8   16:lconst_0        
	//    9   17:putfield        #52  <Field long lastCheckTimeMillis>
		externallyReady = new AtomicBoolean(flag);
	//   10   20:aload_0         
	//   11   21:new             #47  <Class AtomicBoolean>
	//   12   24:dup             
	//   13   25:iload_1         
	//   14   26:invokespecial   #53  <Method void AtomicBoolean(boolean)>
	//   15   29:putfield        #55  <Field AtomicBoolean externallyReady>
	//   16   32:return          
	}

	private void performUpdateCheck()
	{
		Fabric.getLogger().d("Beta", "Performing update check");
	//    0    0:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #64  <String "Beta">
	//    2    5:ldc1            #66  <String "Performing update check">
	//    3    7:invokeinterface #72  <Method void Logger.d(String, String)>
		String s = (new ApiKey()).getValue(context);
	//    4   12:new             #74  <Class ApiKey>
	//    5   15:dup             
	//    6   16:invokespecial   #75  <Method void ApiKey()>
	//    7   19:aload_0         
	//    8   20:getfield        #77  <Field Context context>
	//    9   23:invokevirtual   #81  <Method String ApiKey.getValue(Context)>
	//   10   26:astore_1        
		String s1 = (String)idManager.getDeviceIdentifiers().get(((Object) (io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN)));
	//   11   27:aload_0         
	//   12   28:getfield        #83  <Field IdManager idManager>
	//   13   31:invokevirtual   #89  <Method Map IdManager.getDeviceIdentifiers()>
	//   14   34:getstatic       #95  <Field io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.FONT_TOKEN>
	//   15   37:invokeinterface #101 <Method Object Map.get(Object)>
	//   16   42:checkcast       #103 <Class String>
	//   17   45:astore_2        
		(new CheckForUpdatesRequest(((io.fabric.sdk.android.Kit) (beta)), beta.getOverridenSpiEndpoint(), betaSettings.updateUrl, httpRequestFactory, new CheckForUpdatesResponseTransform())).invoke(s, s1, buildProps);
	//   18   46:new             #105 <Class CheckForUpdatesRequest>
	//   19   49:dup             
	//   20   50:aload_0         
	//   21   51:getfield        #107 <Field Beta beta>
	//   22   54:aload_0         
	//   23   55:getfield        #107 <Field Beta beta>
	//   24   58:invokevirtual   #113 <Method String Beta.getOverridenSpiEndpoint()>
	//   25   61:aload_0         
	//   26   62:getfield        #115 <Field BetaSettingsData betaSettings>
	//   27   65:getfield        #120 <Field String BetaSettingsData.updateUrl>
	//   28   68:aload_0         
	//   29   69:getfield        #122 <Field HttpRequestFactory httpRequestFactory>
	//   30   72:new             #124 <Class CheckForUpdatesResponseTransform>
	//   31   75:dup             
	//   32   76:invokespecial   #125 <Method void CheckForUpdatesResponseTransform()>
	//   33   79:invokespecial   #128 <Method void CheckForUpdatesRequest(io.fabric.sdk.android.Kit, String, String, HttpRequestFactory, CheckForUpdatesResponseTransform)>
	//   34   82:aload_1         
	//   35   83:aload_2         
	//   36   84:aload_0         
	//   37   85:getfield        #130 <Field BuildProperties buildProps>
	//   38   88:invokevirtual   #134 <Method CheckForUpdatesResponse CheckForUpdatesRequest.invoke(String, String, BuildProperties)>
	//   39   91:pop             
	//   40   92:return          
	}

	protected void checkForUpdates()
	{
		long l;
		synchronized(preferenceStore)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field PreferenceStore preferenceStore>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
		{
			if(preferenceStore.get().contains("last_update_check"))
	//*   5    9:aload_0         
	//*   6   10:getfield        #140 <Field PreferenceStore preferenceStore>
	//*   7   13:invokeinterface #145 <Method SharedPreferences PreferenceStore.get()>
	//*   8   18:ldc1            #14  <String "last_update_check">
	//*   9   20:invokeinterface #151 <Method boolean SharedPreferences.contains(String)>
	//*  10   25:ifeq            54
				preferenceStore.save(preferenceStore.edit().remove("last_update_check"));
	//   11   28:aload_0         
	//   12   29:getfield        #140 <Field PreferenceStore preferenceStore>
	//   13   32:aload_0         
	//   14   33:getfield        #140 <Field PreferenceStore preferenceStore>
	//   15   36:invokeinterface #155 <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//   16   41:ldc1            #14  <String "last_update_check">
	//   17   43:invokeinterface #161 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   18   48:invokeinterface #165 <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   19   53:pop             
		}
	//   20   54:aload           5
	//   21   56:monitorexit     
		l = currentTimeProvider.getCurrentTimeMillis();
	//   22   57:aload_0         
	//   23   58:getfield        #167 <Field CurrentTimeProvider currentTimeProvider>
	//   24   61:invokeinterface #173 <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   25   66:lstore_1        
		long l1 = (long)betaSettings.updateSuspendDurationSeconds * 1000L;
	//   26   67:aload_0         
	//   27   68:getfield        #115 <Field BetaSettingsData betaSettings>
	//   28   71:getfield        #177 <Field int BetaSettingsData.updateSuspendDurationSeconds>
	//   29   74:i2l             
	//   30   75:ldc2w           #16  <Long 1000L>
	//   31   78:lmul            
	//   32   79:lstore_3        
		Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates delay: ").append(l1).toString());
	//   33   80:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   34   83:ldc1            #64  <String "Beta">
	//   35   85:new             #179 <Class StringBuilder>
	//   36   88:dup             
	//   37   89:invokespecial   #180 <Method void StringBuilder()>
	//   38   92:ldc1            #182 <String "Check for updates delay: ">
	//   39   94:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   40   97:lload_3         
	//   41   98:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   42  101:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   43  104:invokeinterface #72  <Method void Logger.d(String, String)>
		Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates last check time: ").append(getLastCheckTimeMillis()).toString());
	//   44  109:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   45  112:ldc1            #64  <String "Beta">
	//   46  114:new             #179 <Class StringBuilder>
	//   47  117:dup             
	//   48  118:invokespecial   #180 <Method void StringBuilder()>
	//   49  121:ldc1            #194 <String "Check for updates last check time: ">
	//   50  123:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   51  126:aload_0         
	//   52  127:invokevirtual   #197 <Method long getLastCheckTimeMillis()>
	//   53  130:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   54  133:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   55  136:invokeinterface #72  <Method void Logger.d(String, String)>
		l1 = getLastCheckTimeMillis() + l1;
	//   56  141:aload_0         
	//   57  142:invokevirtual   #197 <Method long getLastCheckTimeMillis()>
	//   58  145:lload_3         
	//   59  146:ladd            
	//   60  147:lstore_3        
		Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates current time: ").append(l).append(", next check time: ").append(l1).toString());
	//   61  148:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   62  151:ldc1            #64  <String "Beta">
	//   63  153:new             #179 <Class StringBuilder>
	//   64  156:dup             
	//   65  157:invokespecial   #180 <Method void StringBuilder()>
	//   66  160:ldc1            #199 <String "Check for updates current time: ">
	//   67  162:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   68  165:lload_1         
	//   69  166:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   70  169:ldc1            #201 <String ", next check time: ">
	//   71  171:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   72  174:lload_3         
	//   73  175:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   74  178:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   75  181:invokeinterface #72  <Method void Logger.d(String, String)>
		if(l < l1)
			break MISSING_BLOCK_LABEL_220;
	//   76  186:lload_1         
	//   77  187:lload_3         
	//   78  188:lcmp            
	//   79  189:iflt            220
		performUpdateCheck();
	//   80  192:aload_0         
	//   81  193:invokespecial   #203 <Method void performUpdateCheck()>
		setLastCheckTimeMillis(l);
	//   82  196:aload_0         
	//   83  197:lload_1         
	//   84  198:invokevirtual   #207 <Method void setLastCheckTimeMillis(long)>
		return;
	//   85  201:return          
		exception1;
	//   86  202:astore          6
		preferencestore;
	//   87  204:aload           5
		JVM INSTR monitorexit ;
	//   88  206:monitorexit     
		throw exception1;
	//   89  207:aload           6
	//   90  209:athrow          
		Exception exception;
		exception;
	//   91  210:astore          5
		setLastCheckTimeMillis(l);
	//   92  212:aload_0         
	//   93  213:lload_1         
	//   94  214:invokevirtual   #207 <Method void setLastCheckTimeMillis(long)>
		throw exception;
	//   95  217:aload           5
	//   96  219:athrow          
		Fabric.getLogger().d("Beta", "Check for updates next check time was not passed");
	//   97  220:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   98  223:ldc1            #64  <String "Beta">
	//   99  225:ldc1            #209 <String "Check for updates next check time was not passed">
	//  100  227:invokeinterface #72  <Method void Logger.d(String, String)>
		return;
	//  101  232:return          
	}

	long getLastCheckTimeMillis()
	{
		return lastCheckTimeMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long lastCheckTimeMillis>
	//    2    4:lreturn         
	}

	public void initialize(Context context1, Beta beta1, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties, PreferenceStore preferencestore, CurrentTimeProvider currenttimeprovider, 
			HttpRequestFactory httprequestfactory)
	{
		context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Context context>
		beta = beta1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #107 <Field Beta beta>
		idManager = idmanager;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #83  <Field IdManager idManager>
		betaSettings = betasettingsdata;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #115 <Field BetaSettingsData betaSettings>
		buildProps = buildproperties;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #130 <Field BuildProperties buildProps>
		preferenceStore = preferencestore;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #140 <Field PreferenceStore preferenceStore>
		currentTimeProvider = currenttimeprovider;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #167 <Field CurrentTimeProvider currentTimeProvider>
		httpRequestFactory = httprequestfactory;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #122 <Field HttpRequestFactory httpRequestFactory>
		if(signalInitialized())
	//*  24   45:aload_0         
	//*  25   46:invokevirtual   #216 <Method boolean signalInitialized()>
	//*  26   49:ifeq            56
			checkForUpdates();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #218 <Method void checkForUpdates()>
	//   29   56:return          
	}

	void setLastCheckTimeMillis(long l)
	{
		lastCheckTimeMillis = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #52  <Field long lastCheckTimeMillis>
	//    3    5:return          
	}

	protected boolean signalExternallyReady()
	{
		externallyReady.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field AtomicBoolean externallyReady>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #222 <Method void AtomicBoolean.set(boolean)>
		return initialized.get();
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field AtomicBoolean initialized>
	//    6   12:invokevirtual   #224 <Method boolean AtomicBoolean.get()>
	//    7   15:ireturn         
	}

	boolean signalInitialized()
	{
		initialized.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AtomicBoolean initialized>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #222 <Method void AtomicBoolean.set(boolean)>
		return externallyReady.get();
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field AtomicBoolean externallyReady>
	//    6   12:invokevirtual   #224 <Method boolean AtomicBoolean.get()>
	//    7   15:ireturn         
	}

	static final long LAST_UPDATE_CHECK_DEFAULT = 0L;
	static final String LAST_UPDATE_CHECK_KEY = "last_update_check";
	private static final long MILLIS_PER_SECOND = 1000L;
	private Beta beta;
	private BetaSettingsData betaSettings;
	private BuildProperties buildProps;
	private Context context;
	private CurrentTimeProvider currentTimeProvider;
	private final AtomicBoolean externallyReady;
	private HttpRequestFactory httpRequestFactory;
	private IdManager idManager;
	private final AtomicBoolean initialized;
	private long lastCheckTimeMillis;
	private PreferenceStore preferenceStore;
}
