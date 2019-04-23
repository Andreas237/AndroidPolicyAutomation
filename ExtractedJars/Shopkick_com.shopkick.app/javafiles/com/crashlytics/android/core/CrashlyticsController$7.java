// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.common.DataCollectionArbiter;
import io.fabric.sdk.android.services.settings.*;
import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, CrashlyticsCore

class CrashlyticsController$7
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		CrashlyticsController.access$400(CrashlyticsController.this).createCrashMarker();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field CrashlyticsController this$0>
	//    2    4:invokestatic    #54  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
	//    3    7:invokevirtual   #59  <Method void CrashlyticsCore.createCrashMarker()>
		CrashlyticsController.access$500(CrashlyticsController.this, val$time, val$thread, val$ex);
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field CrashlyticsController this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #30  <Field Date val$time>
	//    8   18:aload_0         
	//    9   19:getfield        #32  <Field Thread val$thread>
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field Throwable val$ex>
	//   12   26:invokestatic    #63  <Method void CrashlyticsController.access$500(CrashlyticsController, Date, Thread, Throwable)>
		SettingsData settingsdata = val$settingsDataProvider.getSettingsData();
	//   13   29:aload_0         
	//   14   30:getfield        #36  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider val$settingsDataProvider>
	//   15   33:invokeinterface #69  <Method SettingsData CrashlyticsUncaughtExceptionHandler$SettingsDataProvider.getSettingsData()>
	//   16   38:astore          5
		SessionSettingsData sessionsettingsdata;
		Object obj;
		if(settingsdata != null)
	//*  17   40:aload           5
	//*  18   42:ifnull          61
		{
			sessionsettingsdata = settingsdata.sessionData;
	//   19   45:aload           5
	//   20   47:getfield        #75  <Field SessionSettingsData SettingsData.sessionData>
	//   21   50:astore_3        
			obj = ((Object) (settingsdata.featuresData));
	//   22   51:aload           5
	//   23   53:getfield        #79  <Field FeaturesSettingsData SettingsData.featuresData>
	//   24   56:astore          4
		} else
	//*  25   58:goto            66
		{
			sessionsettingsdata = null;
	//   26   61:aconst_null     
	//   27   62:astore_3        
			obj = ((Object) (sessionsettingsdata));
	//   28   63:aload_3         
	//   29   64:astore          4
		}
		boolean flag1 = false;
	//   30   66:iconst_0        
	//   31   67:istore_2        
		boolean flag;
		if(obj != null && !((FeaturesSettingsData) (obj)).firebaseCrashlyticsEnabled)
	//*  32   68:aload           4
	//*  33   70:ifnull          89
	//*  34   73:aload           4
	//*  35   75:getfield        #84  <Field boolean FeaturesSettingsData.firebaseCrashlyticsEnabled>
	//*  36   78:ifeq            84
	//*  37   81:goto            89
			flag = false;
	//   38   84:iconst_0        
	//   39   85:istore_1        
		else
	//*  40   86:goto            91
			flag = true;
	//   41   89:iconst_1        
	//   42   90:istore_1        
		if(flag || val$firebaseCrashlyticsClientFlag)
	//*  43   91:iload_1         
	//*  44   92:ifne            102
	//*  45   95:aload_0         
	//*  46   96:getfield        #38  <Field boolean val$firebaseCrashlyticsClientFlag>
	//*  47   99:ifeq            116
			CrashlyticsController.access$600(CrashlyticsController.this, val$time.getTime());
	//   48  102:aload_0         
	//   49  103:getfield        #28  <Field CrashlyticsController this$0>
	//   50  106:aload_0         
	//   51  107:getfield        #30  <Field Date val$time>
	//   52  110:invokevirtual   #90  <Method long Date.getTime()>
	//   53  113:invokestatic    #94  <Method void CrashlyticsController.access$600(CrashlyticsController, long)>
		doCloseSessions(sessionsettingsdata);
	//   54  116:aload_0         
	//   55  117:getfield        #28  <Field CrashlyticsController this$0>
	//   56  120:aload_3         
	//   57  121:invokevirtual   #98  <Method void CrashlyticsController.doCloseSessions(SessionSettingsData)>
		CrashlyticsController.access$700(CrashlyticsController.this);
	//   58  124:aload_0         
	//   59  125:getfield        #28  <Field CrashlyticsController this$0>
	//   60  128:invokestatic    #102 <Method void CrashlyticsController.access$700(CrashlyticsController)>
		if(sessionsettingsdata != null)
	//*  61  131:aload_3         
	//*  62  132:ifnull          146
			trimSessionFiles(sessionsettingsdata.maxCompleteSessionsCount);
	//   63  135:aload_0         
	//   64  136:getfield        #28  <Field CrashlyticsController this$0>
	//   65  139:aload_3         
	//   66  140:getfield        #108 <Field int SessionSettingsData.maxCompleteSessionsCount>
	//   67  143:invokevirtual   #112 <Method void CrashlyticsController.trimSessionFiles(int)>
		flag = flag1;
	//   68  146:iload_2         
	//   69  147:istore_1        
		if(DataCollectionArbiter.getInstance(CrashlyticsController.access$400(CrashlyticsController.this).getContext()).isDataCollectionEnabled())
	//*  70  148:aload_0         
	//*  71  149:getfield        #28  <Field CrashlyticsController this$0>
	//*  72  152:invokestatic    #54  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
	//*  73  155:invokevirtual   #116 <Method android.content.Context CrashlyticsCore.getContext()>
	//*  74  158:invokestatic    #122 <Method DataCollectionArbiter DataCollectionArbiter.getInstance(android.content.Context)>
	//*  75  161:invokevirtual   #126 <Method boolean DataCollectionArbiter.isDataCollectionEnabled()>
	//*  76  164:ifeq            183
		{
			flag = flag1;
	//   77  167:iload_2         
	//   78  168:istore_1        
			if(!CrashlyticsController.access$800(CrashlyticsController.this, settingsdata))
	//*  79  169:aload_0         
	//*  80  170:getfield        #28  <Field CrashlyticsController this$0>
	//*  81  173:aload           5
	//*  82  175:invokestatic    #130 <Method boolean CrashlyticsController.access$800(CrashlyticsController, SettingsData)>
	//*  83  178:ifne            183
				flag = true;
	//   84  181:iconst_1        
	//   85  182:istore_1        
		}
		if(flag)
	//*  86  183:iload_1         
	//*  87  184:ifeq            196
			CrashlyticsController.access$900(CrashlyticsController.this, settingsdata);
	//   88  187:aload_0         
	//   89  188:getfield        #28  <Field CrashlyticsController this$0>
	//   90  191:aload           5
	//   91  193:invokestatic    #134 <Method void CrashlyticsController.access$900(CrashlyticsController, SettingsData)>
		return null;
	//   92  196:aconst_null     
	//   93  197:areturn         
	}

	final CrashlyticsController this$0;
	final Throwable val$ex;
	final boolean val$firebaseCrashlyticsClientFlag;
	final tionHandler.SettingsDataProvider val$settingsDataProvider;
	final Thread val$thread;
	final Date val$time;

	CrashlyticsController$7()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field CrashlyticsController this$0>
		val$time = date;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field Date val$time>
		val$thread = thread1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field Thread val$thread>
		val$ex = throwable;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field Throwable val$ex>
		val$settingsDataProvider = settingsdataprovider;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider val$settingsDataProvider>
		val$firebaseCrashlyticsClientFlag = Z.this;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #38  <Field boolean val$firebaseCrashlyticsClientFlag>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #41  <Method void Object()>
	//   20   37:return          
	}
}
