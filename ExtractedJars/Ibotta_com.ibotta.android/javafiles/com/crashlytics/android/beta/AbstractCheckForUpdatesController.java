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
	//    2    2:invokespecial   #32  <Method void AbstractCheckForUpdatesController(boolean)>
	//    3    5:return          
	}

	public AbstractCheckForUpdatesController(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		initialized = new AtomicBoolean();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void AtomicBoolean()>
	//    6   12:putfield        #40  <Field AtomicBoolean initialized>
		lastCheckTimeMillis = 0L;
	//    7   15:aload_0         
	//    8   16:lconst_0        
	//    9   17:putfield        #42  <Field long lastCheckTimeMillis>
		externallyReady = new AtomicBoolean(flag);
	//   10   20:aload_0         
	//   11   21:new             #37  <Class AtomicBoolean>
	//   12   24:dup             
	//   13   25:iload_1         
	//   14   26:invokespecial   #43  <Method void AtomicBoolean(boolean)>
	//   15   29:putfield        #45  <Field AtomicBoolean externallyReady>
	//   16   32:return          
	}

	private void performUpdateCheck()
	{
		Fabric.getLogger().d("Beta", "Performing update check");
	//    0    0:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #54  <String "Beta">
	//    2    5:ldc1            #56  <String "Performing update check">
	//    3    7:invokeinterface #62  <Method void Logger.d(String, String)>
		String s = (new ApiKey()).getValue(context);
	//    4   12:new             #64  <Class ApiKey>
	//    5   15:dup             
	//    6   16:invokespecial   #65  <Method void ApiKey()>
	//    7   19:aload_0         
	//    8   20:getfield        #67  <Field Context context>
	//    9   23:invokevirtual   #71  <Method String ApiKey.getValue(Context)>
	//   10   26:astore_1        
		String s1 = (String)idManager.getDeviceIdentifiers().get(((Object) (io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN)));
	//   11   27:aload_0         
	//   12   28:getfield        #73  <Field IdManager idManager>
	//   13   31:invokevirtual   #79  <Method Map IdManager.getDeviceIdentifiers()>
	//   14   34:getstatic       #85  <Field io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.FONT_TOKEN>
	//   15   37:invokeinterface #91  <Method Object Map.get(Object)>
	//   16   42:checkcast       #93  <Class String>
	//   17   45:astore_2        
		Beta beta1 = beta;
	//   18   46:aload_0         
	//   19   47:getfield        #95  <Field Beta beta>
	//   20   50:astore_3        
		(new CheckForUpdatesRequest(((io.fabric.sdk.android.Kit) (beta1)), beta1.getOverridenSpiEndpoint(), betaSettings.updateUrl, httpRequestFactory, new CheckForUpdatesResponseTransform())).invoke(s, s1, buildProps);
	//   21   51:new             #97  <Class CheckForUpdatesRequest>
	//   22   54:dup             
	//   23   55:aload_3         
	//   24   56:aload_3         
	//   25   57:invokevirtual   #103 <Method String Beta.getOverridenSpiEndpoint()>
	//   26   60:aload_0         
	//   27   61:getfield        #105 <Field BetaSettingsData betaSettings>
	//   28   64:getfield        #111 <Field String BetaSettingsData.updateUrl>
	//   29   67:aload_0         
	//   30   68:getfield        #113 <Field HttpRequestFactory httpRequestFactory>
	//   31   71:new             #115 <Class CheckForUpdatesResponseTransform>
	//   32   74:dup             
	//   33   75:invokespecial   #116 <Method void CheckForUpdatesResponseTransform()>
	//   34   78:invokespecial   #119 <Method void CheckForUpdatesRequest(io.fabric.sdk.android.Kit, String, String, HttpRequestFactory, CheckForUpdatesResponseTransform)>
	//   35   81:aload_1         
	//   36   82:aload_2         
	//   37   83:aload_0         
	//   38   84:getfield        #121 <Field BuildProperties buildProps>
	//   39   87:invokevirtual   #125 <Method CheckForUpdatesResponse CheckForUpdatesRequest.invoke(String, String, BuildProperties)>
	//   40   90:pop             
	//   41   91:return          
	}

	protected void checkForUpdates()
	{
		long l;
		synchronized(preferenceStore)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field PreferenceStore preferenceStore>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
		{
			if(preferenceStore.get().contains("last_update_check"))
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field PreferenceStore preferenceStore>
	//*   7   13:invokeinterface #136 <Method SharedPreferences PreferenceStore.get()>
	//*   8   18:ldc1            #138 <String "last_update_check">
	//*   9   20:invokeinterface #144 <Method boolean SharedPreferences.contains(String)>
	//*  10   25:ifeq            54
				preferenceStore.save(preferenceStore.edit().remove("last_update_check"));
	//   11   28:aload_0         
	//   12   29:getfield        #131 <Field PreferenceStore preferenceStore>
	//   13   32:aload_0         
	//   14   33:getfield        #131 <Field PreferenceStore preferenceStore>
	//   15   36:invokeinterface #148 <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//   16   41:ldc1            #138 <String "last_update_check">
	//   17   43:invokeinterface #154 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   18   48:invokeinterface #158 <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   19   53:pop             
		}
	//   20   54:aload           5
	//   21   56:monitorexit     
		l = currentTimeProvider.getCurrentTimeMillis();
	//   22   57:aload_0         
	//   23   58:getfield        #160 <Field CurrentTimeProvider currentTimeProvider>
	//   24   61:invokeinterface #166 <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   25   66:lstore_1        
		long l1 = (long)betaSettings.updateSuspendDurationSeconds * 1000L;
	//   26   67:aload_0         
	//   27   68:getfield        #105 <Field BetaSettingsData betaSettings>
	//   28   71:getfield        #170 <Field int BetaSettingsData.updateSuspendDurationSeconds>
	//   29   74:i2l             
	//   30   75:ldc2w           #171 <Long 1000L>
	//   31   78:lmul            
	//   32   79:lstore_3        
		obj = ((Object) (Fabric.getLogger()));
	//   33   80:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//   34   83:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   35   85:new             #174 <Class StringBuilder>
	//   36   88:dup             
	//   37   89:invokespecial   #175 <Method void StringBuilder()>
	//   38   92:astore          6
		stringbuilder.append("Check for updates delay: ");
	//   39   94:aload           6
	//   40   96:ldc1            #177 <String "Check for updates delay: ">
	//   41   98:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   42  101:pop             
		stringbuilder.append(l1);
	//   43  102:aload           6
	//   44  104:lload_3         
	//   45  105:invokevirtual   #184 <Method StringBuilder StringBuilder.append(long)>
	//   46  108:pop             
		((Logger) (obj)).d("Beta", stringbuilder.toString());
	//   47  109:aload           5
	//   48  111:ldc1            #54  <String "Beta">
	//   49  113:aload           6
	//   50  115:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   51  118:invokeinterface #62  <Method void Logger.d(String, String)>
		obj = ((Object) (Fabric.getLogger()));
	//   52  123:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//   53  126:astore          5
		stringbuilder = new StringBuilder();
	//   54  128:new             #174 <Class StringBuilder>
	//   55  131:dup             
	//   56  132:invokespecial   #175 <Method void StringBuilder()>
	//   57  135:astore          6
		stringbuilder.append("Check for updates last check time: ");
	//   58  137:aload           6
	//   59  139:ldc1            #189 <String "Check for updates last check time: ">
	//   60  141:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   61  144:pop             
		stringbuilder.append(getLastCheckTimeMillis());
	//   62  145:aload           6
	//   63  147:aload_0         
	//   64  148:invokevirtual   #192 <Method long getLastCheckTimeMillis()>
	//   65  151:invokevirtual   #184 <Method StringBuilder StringBuilder.append(long)>
	//   66  154:pop             
		((Logger) (obj)).d("Beta", stringbuilder.toString());
	//   67  155:aload           5
	//   68  157:ldc1            #54  <String "Beta">
	//   69  159:aload           6
	//   70  161:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   71  164:invokeinterface #62  <Method void Logger.d(String, String)>
		l1 = getLastCheckTimeMillis() + l1;
	//   72  169:aload_0         
	//   73  170:invokevirtual   #192 <Method long getLastCheckTimeMillis()>
	//   74  173:lload_3         
	//   75  174:ladd            
	//   76  175:lstore_3        
		obj = ((Object) (Fabric.getLogger()));
	//   77  176:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//   78  179:astore          5
		stringbuilder = new StringBuilder();
	//   79  181:new             #174 <Class StringBuilder>
	//   80  184:dup             
	//   81  185:invokespecial   #175 <Method void StringBuilder()>
	//   82  188:astore          6
		stringbuilder.append("Check for updates current time: ");
	//   83  190:aload           6
	//   84  192:ldc1            #194 <String "Check for updates current time: ">
	//   85  194:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   86  197:pop             
		stringbuilder.append(l);
	//   87  198:aload           6
	//   88  200:lload_1         
	//   89  201:invokevirtual   #184 <Method StringBuilder StringBuilder.append(long)>
	//   90  204:pop             
		stringbuilder.append(", next check time: ");
	//   91  205:aload           6
	//   92  207:ldc1            #196 <String ", next check time: ">
	//   93  209:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   94  212:pop             
		stringbuilder.append(l1);
	//   95  213:aload           6
	//   96  215:lload_3         
	//   97  216:invokevirtual   #184 <Method StringBuilder StringBuilder.append(long)>
	//   98  219:pop             
		((Logger) (obj)).d("Beta", stringbuilder.toString());
	//   99  220:aload           5
	//  100  222:ldc1            #54  <String "Beta">
	//  101  224:aload           6
	//  102  226:invokevirtual   #187 <Method String StringBuilder.toString()>
	//  103  229:invokeinterface #62  <Method void Logger.d(String, String)>
		if(l < l1)
			break MISSING_BLOCK_LABEL_260;
	//  104  234:lload_1         
	//  105  235:lload_3         
	//  106  236:lcmp            
	//  107  237:iflt            260
		performUpdateCheck();
	//  108  240:aload_0         
	//  109  241:invokespecial   #198 <Method void performUpdateCheck()>
		setLastCheckTimeMillis(l);
	//  110  244:aload_0         
	//  111  245:lload_1         
	//  112  246:invokevirtual   #202 <Method void setLastCheckTimeMillis(long)>
		return;
	//  113  249:return          
		obj;
	//  114  250:astore          5
		setLastCheckTimeMillis(l);
	//  115  252:aload_0         
	//  116  253:lload_1         
	//  117  254:invokevirtual   #202 <Method void setLastCheckTimeMillis(long)>
		throw obj;
	//  118  257:aload           5
	//  119  259:athrow          
		Fabric.getLogger().d("Beta", "Check for updates next check time was not passed");
	//  120  260:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//  121  263:ldc1            #54  <String "Beta">
	//  122  265:ldc1            #204 <String "Check for updates next check time was not passed">
	//  123  267:invokeinterface #62  <Method void Logger.d(String, String)>
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
	//    1    1:getfield        #42  <Field long lastCheckTimeMillis>
	//    2    4:lreturn         
	}

	public void initialize(Context context1, Beta beta1, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties, PreferenceStore preferencestore, CurrentTimeProvider currenttimeprovider, 
			HttpRequestFactory httprequestfactory)
	{
		context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Context context>
		beta = beta1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #95  <Field Beta beta>
		idManager = idmanager;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #73  <Field IdManager idManager>
		betaSettings = betasettingsdata;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #105 <Field BetaSettingsData betaSettings>
		buildProps = buildproperties;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #121 <Field BuildProperties buildProps>
		preferenceStore = preferencestore;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #131 <Field PreferenceStore preferenceStore>
		currentTimeProvider = currenttimeprovider;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #160 <Field CurrentTimeProvider currentTimeProvider>
		httpRequestFactory = httprequestfactory;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #113 <Field HttpRequestFactory httpRequestFactory>
		if(signalInitialized())
	//*  24   45:aload_0         
	//*  25   46:invokevirtual   #211 <Method boolean signalInitialized()>
	//*  26   49:ifeq            56
			checkForUpdates();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #213 <Method void checkForUpdates()>
	//   29   56:return          
	}

	void setLastCheckTimeMillis(long l)
	{
		lastCheckTimeMillis = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #42  <Field long lastCheckTimeMillis>
	//    3    5:return          
	}

	protected boolean signalExternallyReady()
	{
		externallyReady.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AtomicBoolean externallyReady>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #217 <Method void AtomicBoolean.set(boolean)>
		return initialized.get();
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field AtomicBoolean initialized>
	//    6   12:invokevirtual   #219 <Method boolean AtomicBoolean.get()>
	//    7   15:ireturn         
	}

	boolean signalInitialized()
	{
		initialized.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AtomicBoolean initialized>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #217 <Method void AtomicBoolean.set(boolean)>
		return externallyReady.get();
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field AtomicBoolean externallyReady>
	//    6   12:invokevirtual   #219 <Method boolean AtomicBoolean.get()>
	//    7   15:ireturn         
	}

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
