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
		obj = ((Object) (Fabric.getLogger()));
	//   33   80:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   34   83:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   35   85:new             #179 <Class StringBuilder>
	//   36   88:dup             
	//   37   89:invokespecial   #180 <Method void StringBuilder()>
	//   38   92:astore          6
		stringbuilder.append("Check for updates delay: ");
	//   39   94:aload           6
	//   40   96:ldc1            #182 <String "Check for updates delay: ">
	//   41   98:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   42  101:pop             
		stringbuilder.append(l1);
	//   43  102:aload           6
	//   44  104:lload_3         
	//   45  105:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   46  108:pop             
		((Logger) (obj)).d("Beta", stringbuilder.toString());
	//   47  109:aload           5
	//   48  111:ldc1            #64  <String "Beta">
	//   49  113:aload           6
	//   50  115:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   51  118:invokeinterface #72  <Method void Logger.d(String, String)>
		obj = ((Object) (Fabric.getLogger()));
	//   52  123:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   53  126:astore          5
		stringbuilder = new StringBuilder();
	//   54  128:new             #179 <Class StringBuilder>
	//   55  131:dup             
	//   56  132:invokespecial   #180 <Method void StringBuilder()>
	//   57  135:astore          6
		stringbuilder.append("Check for updates last check time: ");
	//   58  137:aload           6
	//   59  139:ldc1            #194 <String "Check for updates last check time: ">
	//   60  141:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   61  144:pop             
		stringbuilder.append(getLastCheckTimeMillis());
	//   62  145:aload           6
	//   63  147:aload_0         
	//   64  148:invokevirtual   #197 <Method long getLastCheckTimeMillis()>
	//   65  151:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   66  154:pop             
		((Logger) (obj)).d("Beta", stringbuilder.toString());
	//   67  155:aload           5
	//   68  157:ldc1            #64  <String "Beta">
	//   69  159:aload           6
	//   70  161:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   71  164:invokeinterface #72  <Method void Logger.d(String, String)>
		l1 = getLastCheckTimeMillis() + l1;
	//   72  169:aload_0         
	//   73  170:invokevirtual   #197 <Method long getLastCheckTimeMillis()>
	//   74  173:lload_3         
	//   75  174:ladd            
	//   76  175:lstore_3        
		obj = ((Object) (Fabric.getLogger()));
	//   77  176:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//   78  179:astore          5
		stringbuilder = new StringBuilder();
	//   79  181:new             #179 <Class StringBuilder>
	//   80  184:dup             
	//   81  185:invokespecial   #180 <Method void StringBuilder()>
	//   82  188:astore          6
		stringbuilder.append("Check for updates current time: ");
	//   83  190:aload           6
	//   84  192:ldc1            #199 <String "Check for updates current time: ">
	//   85  194:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   86  197:pop             
		stringbuilder.append(l);
	//   87  198:aload           6
	//   88  200:lload_1         
	//   89  201:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   90  204:pop             
		stringbuilder.append(", next check time: ");
	//   91  205:aload           6
	//   92  207:ldc1            #201 <String ", next check time: ">
	//   93  209:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   94  212:pop             
		stringbuilder.append(l1);
	//   95  213:aload           6
	//   96  215:lload_3         
	//   97  216:invokevirtual   #189 <Method StringBuilder StringBuilder.append(long)>
	//   98  219:pop             
		((Logger) (obj)).d("Beta", stringbuilder.toString());
	//   99  220:aload           5
	//  100  222:ldc1            #64  <String "Beta">
	//  101  224:aload           6
	//  102  226:invokevirtual   #192 <Method String StringBuilder.toString()>
	//  103  229:invokeinterface #72  <Method void Logger.d(String, String)>
		if(l < l1)
			break MISSING_BLOCK_LABEL_260;
	//  104  234:lload_1         
	//  105  235:lload_3         
	//  106  236:lcmp            
	//  107  237:iflt            260
		performUpdateCheck();
	//  108  240:aload_0         
	//  109  241:invokespecial   #203 <Method void performUpdateCheck()>
		setLastCheckTimeMillis(l);
	//  110  244:aload_0         
	//  111  245:lload_1         
	//  112  246:invokevirtual   #207 <Method void setLastCheckTimeMillis(long)>
		return;
	//  113  249:return          
		obj;
	//  114  250:astore          5
		setLastCheckTimeMillis(l);
	//  115  252:aload_0         
	//  116  253:lload_1         
	//  117  254:invokevirtual   #207 <Method void setLastCheckTimeMillis(long)>
		throw obj;
	//  118  257:aload           5
	//  119  259:athrow          
		Fabric.getLogger().d("Beta", "Check for updates next check time was not passed");
	//  120  260:invokestatic    #62  <Method Logger Fabric.getLogger()>
	//  121  263:ldc1            #64  <String "Beta">
	//  122  265:ldc1            #209 <String "Check for updates next check time was not passed">
	//  123  267:invokeinterface #72  <Method void Logger.d(String, String)>
		return;
	//  124  272:return          
		exception;
	//  125  273:astore          6
		obj;
	//  126  275:aload           5
		JVM INSTR monitorexit ;
	//  127  277:monitorexit     
		throw exception;
	//  128  278:aload           6
	//  129  280:athrow          
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
