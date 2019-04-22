// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.settings.*;
import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, CrashlyticsCore

class CrashlyticsController$6
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		CrashlyticsController.access$300(CrashlyticsController.this).createCrashMarker();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field CrashlyticsController this$0>
	//    2    4:invokestatic    #46  <Method CrashlyticsCore CrashlyticsController.access$300(CrashlyticsController)>
	//    3    7:invokevirtual   #51  <Method void CrashlyticsCore.createCrashMarker()>
		CrashlyticsController.access$400(CrashlyticsController.this, val$time, val$thread, val$ex);
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field CrashlyticsController this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #26  <Field Date val$time>
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field Thread val$thread>
	//   10   22:aload_0         
	//   11   23:getfield        #30  <Field Throwable val$ex>
	//   12   26:invokestatic    #54  <Method void CrashlyticsController.access$400(CrashlyticsController, Date, Thread, Throwable)>
		SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
	//   13   29:invokestatic    #60  <Method Settings Settings.getInstance()>
	//   14   32:invokevirtual   #64  <Method SettingsData Settings.awaitSettingsData()>
	//   15   35:astore_2        
		SessionSettingsData sessionsettingsdata;
		if(settingsdata != null)
	//*  16   36:aload_2         
	//*  17   37:ifnull          48
			sessionsettingsdata = settingsdata.sessionData;
	//   18   40:aload_2         
	//   19   41:getfield        #70  <Field SessionSettingsData SettingsData.sessionData>
	//   20   44:astore_1        
		else
	//*  21   45:goto            50
			sessionsettingsdata = null;
	//   22   48:aconst_null     
	//   23   49:astore_1        
		doCloseSessions(sessionsettingsdata);
	//   24   50:aload_0         
	//   25   51:getfield        #24  <Field CrashlyticsController this$0>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #74  <Method void CrashlyticsController.doCloseSessions(SessionSettingsData)>
		CrashlyticsController.access$500(CrashlyticsController.this);
	//   28   58:aload_0         
	//   29   59:getfield        #24  <Field CrashlyticsController this$0>
	//   30   62:invokestatic    #78  <Method void CrashlyticsController.access$500(CrashlyticsController)>
		if(sessionsettingsdata != null)
	//*  31   65:aload_1         
	//*  32   66:ifnull          80
			trimSessionFiles(sessionsettingsdata.maxCompleteSessionsCount);
	//   33   69:aload_0         
	//   34   70:getfield        #24  <Field CrashlyticsController this$0>
	//   35   73:aload_1         
	//   36   74:getfield        #84  <Field int SessionSettingsData.maxCompleteSessionsCount>
	//   37   77:invokevirtual   #88  <Method void CrashlyticsController.trimSessionFiles(int)>
		if(!CrashlyticsController.access$600(CrashlyticsController.this, settingsdata))
	//*  38   80:aload_0         
	//*  39   81:getfield        #24  <Field CrashlyticsController this$0>
	//*  40   84:aload_2         
	//*  41   85:invokestatic    #92  <Method boolean CrashlyticsController.access$600(CrashlyticsController, SettingsData)>
	//*  42   88:ifne            99
			CrashlyticsController.access$700(CrashlyticsController.this, settingsdata);
	//   43   91:aload_0         
	//   44   92:getfield        #24  <Field CrashlyticsController this$0>
	//   45   95:aload_2         
	//   46   96:invokestatic    #96  <Method void CrashlyticsController.access$700(CrashlyticsController, SettingsData)>
		return null;
	//   47   99:aconst_null     
	//   48  100:areturn         
	}

	final CrashlyticsController this$0;
	final Throwable val$ex;
	final Thread val$thread;
	final Date val$time;

	CrashlyticsController$6()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field CrashlyticsController this$0>
		val$time = date;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Date val$time>
		val$thread = thread1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Thread val$thread>
		val$ex = Throwable.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Throwable val$ex>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
