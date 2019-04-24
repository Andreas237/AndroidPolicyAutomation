// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.core;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import com.birbit.android.jobqueue.JobManager;
import com.pactforcure.app.api.*;
import com.pactforcure.app.tip.TipOfTheWeekNotificationScheduler;
import com.raizlabs.android.dbflow.config.FlowManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import org.researchstack.backbone.StorageAccess;
import org.researchstack.backbone.storage.database.sqlite.DatabaseHelper;
import org.researchstack.backbone.storage.file.*;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

// Referenced classes of package com.pactforcure.app.core:
//			JobManagerFactory

public class BackboneApplication extends Application
{

	public BackboneApplication()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Application()>
	//    2    4:return          
	}

	public static BackboneApplication get()
	{
		return context;
	//    0    0:getstatic       #21  <Field BackboneApplication context>
	//    1    3:areturn         
	}

	protected void attachBaseContext(Context context1)
	{
		super.attachBaseContext(context1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void Application.attachBaseContext(Context)>
		MultiDex.install(((Context) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #30  <Method void MultiDex.install(Context)>
	//    5    9:return          
	}

	public ApiService getApi()
	{
		return api;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ApiService api>
	//    2    4:areturn         
	}

	public AuthorizedApiService getAuthorizedApi()
	{
		return authorizedApi;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field AuthorizedApiService authorizedApi>
	//    2    4:areturn         
	}

	public JobManager getJobManager()
	{
		return jobManager;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field JobManager jobManager>
	//    2    4:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Application.onCreate()>
		Fabric.with(((Context) (this)), new Kit[] {
			(new com.crashlytics.android.Crashlytics.Builder()).core((new com.crashlytics.android.core.CrashlyticsCore.Builder()).disabled(false).build()).build()
		});
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:anewarray       Kit[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:new             #49  <Class com.crashlytics.android.Crashlytics$Builder>
	//    8   14:dup             
	//    9   15:invokespecial   #50  <Method void com.crashlytics.android.Crashlytics$Builder()>
	//   10   18:new             #52  <Class com.crashlytics.android.core.CrashlyticsCore$Builder>
	//   11   21:dup             
	//   12   22:invokespecial   #53  <Method void com.crashlytics.android.core.CrashlyticsCore$Builder()>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #57  <Method com.crashlytics.android.core.CrashlyticsCore$Builder com.crashlytics.android.core.CrashlyticsCore$Builder.disabled(boolean)>
	//   15   29:invokevirtual   #61  <Method com.crashlytics.android.core.CrashlyticsCore com.crashlytics.android.core.CrashlyticsCore$Builder.build()>
	//   16   32:invokevirtual   #65  <Method com.crashlytics.android.Crashlytics$Builder com.crashlytics.android.Crashlytics$Builder.core(com.crashlytics.android.core.CrashlyticsCore)>
	//   17   35:invokevirtual   #68  <Method com.crashlytics.android.Crashlytics com.crashlytics.android.Crashlytics$Builder.build()>
	//   18   38:aastore         
	//   19   39:invokestatic    #74  <Method Fabric Fabric.with(Context, Kit[])>
	//   20   42:pop             
		FlowManager.init((new com.raizlabs.android.dbflow.config.FlowConfig.Builder(((Context) (this)))).openDatabasesOnInit(true).build());
	//   21   43:new             #76  <Class com.raizlabs.android.dbflow.config.FlowConfig$Builder>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:invokespecial   #78  <Method void com.raizlabs.android.dbflow.config.FlowConfig$Builder(Context)>
	//   25   51:iconst_1        
	//   26   52:invokevirtual   #82  <Method com.raizlabs.android.dbflow.config.FlowConfig$Builder com.raizlabs.android.dbflow.config.FlowConfig$Builder.openDatabasesOnInit(boolean)>
	//   27   55:invokevirtual   #85  <Method com.raizlabs.android.dbflow.config.FlowConfig com.raizlabs.android.dbflow.config.FlowConfig$Builder.build()>
	//   28   58:invokestatic    #91  <Method void FlowManager.init(com.raizlabs.android.dbflow.config.FlowConfig)>
		context = this;
	//   29   61:aload_0         
	//   30   62:putstatic       #21  <Field BackboneApplication context>
		api = ApiServiceFactory.newApiService();
	//   31   65:aload_0         
	//   32   66:invokestatic    #96  <Method ApiService ApiServiceFactory.newApiService()>
	//   33   69:putfield        #34  <Field ApiService api>
		authorizedApi = ApiServiceFactory.newAuthorizedApiService();
	//   34   72:aload_0         
	//   35   73:invokestatic    #99  <Method AuthorizedApiService ApiServiceFactory.newAuthorizedApiService()>
	//   36   76:putfield        #38  <Field AuthorizedApiService authorizedApi>
		jobManager = JobManagerFactory.buildJobManager(((Context) (this)));
	//   37   79:aload_0         
	//   38   80:aload_0         
	//   39   81:invokestatic    #105 <Method JobManager JobManagerFactory.buildJobManager(Context)>
	//   40   84:putfield        #42  <Field JobManager jobManager>
		CalligraphyConfig.initDefault((new uk.co.chrisjenx.calligraphy.CalligraphyConfig.Builder()).setDefaultFontPath("fonts/Roboto-Regular.ttf").setFontAttrId(0x7f010001).build());
	//   41   87:new             #107 <Class uk.co.chrisjenx.calligraphy.CalligraphyConfig$Builder>
	//   42   90:dup             
	//   43   91:invokespecial   #108 <Method void uk.co.chrisjenx.calligraphy.CalligraphyConfig$Builder()>
	//   44   94:ldc1            #110 <String "fonts/Roboto-Regular.ttf">
	//   45   96:invokevirtual   #114 <Method uk.co.chrisjenx.calligraphy.CalligraphyConfig$Builder uk.co.chrisjenx.calligraphy.CalligraphyConfig$Builder.setDefaultFontPath(String)>
	//   46   99:ldc1            #115 <Int 0x7f010001>
	//   47  101:invokevirtual   #119 <Method uk.co.chrisjenx.calligraphy.CalligraphyConfig$Builder uk.co.chrisjenx.calligraphy.CalligraphyConfig$Builder.setFontAttrId(int)>
	//   48  104:invokevirtual   #122 <Method CalligraphyConfig uk.co.chrisjenx.calligraphy.CalligraphyConfig$Builder.build()>
	//   49  107:invokestatic    #128 <Method void CalligraphyConfig.initDefault(CalligraphyConfig)>
		PinCodeConfig pincodeconfig = new PinCodeConfig();
	//   50  110:new             #130 <Class PinCodeConfig>
	//   51  113:dup             
	//   52  114:invokespecial   #131 <Method void PinCodeConfig()>
	//   53  117:astore_1        
		UnencryptedProvider unencryptedprovider = new UnencryptedProvider();
	//   54  118:new             #133 <Class UnencryptedProvider>
	//   55  121:dup             
	//   56  122:invokespecial   #134 <Method void UnencryptedProvider()>
	//   57  125:astore_2        
		SimpleFileAccess simplefileaccess = new SimpleFileAccess();
	//   58  126:new             #136 <Class SimpleFileAccess>
	//   59  129:dup             
	//   60  130:invokespecial   #137 <Method void SimpleFileAccess()>
	//   61  133:astore_3        
		DatabaseHelper databasehelper = new DatabaseHelper(((Context) (this)), "appdb", ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 1);
	//   62  134:new             #139 <Class DatabaseHelper>
	//   63  137:dup             
	//   64  138:aload_0         
	//   65  139:ldc1            #141 <String "appdb">
	//   66  141:aconst_null     
	//   67  142:iconst_1        
	//   68  143:invokespecial   #144 <Method void DatabaseHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//   69  146:astore          4
		StorageAccess.getInstance().init(pincodeconfig, ((org.researchstack.backbone.storage.file.EncryptionProvider) (unencryptedprovider)), ((org.researchstack.backbone.storage.file.FileAccess) (simplefileaccess)), ((org.researchstack.backbone.storage.database.AppDatabase) (databasehelper)));
	//   70  148:invokestatic    #150 <Method StorageAccess StorageAccess.getInstance()>
	//   71  151:aload_1         
	//   72  152:aload_2         
	//   73  153:aload_3         
	//   74  154:aload           4
	//   75  156:invokevirtual   #153 <Method void StorageAccess.init(PinCodeConfig, org.researchstack.backbone.storage.file.EncryptionProvider, org.researchstack.backbone.storage.file.FileAccess, org.researchstack.backbone.storage.database.AppDatabase)>
		TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(((Context) (this)));
	//   76  159:aload_0         
	//   77  160:invokestatic    #158 <Method void TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(Context)>
	//   78  163:return          
	}

	private static BackboneApplication context;
	private ApiService api;
	private AuthorizedApiService authorizedApi;
	private JobManager jobManager;
}
