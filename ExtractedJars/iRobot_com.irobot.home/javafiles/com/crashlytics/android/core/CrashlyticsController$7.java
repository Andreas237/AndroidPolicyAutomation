// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.g.*;
import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, CrashlyticsCore

class CrashlyticsController$7
	implements Callable
{

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
	{
		CrashlyticsController.access$400(CrashlyticsController.this).createCrashMarker();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field CrashlyticsController this$0>
	//    2    4:invokestatic    #51  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
	//    3    7:invokevirtual   #56  <Method void CrashlyticsCore.createCrashMarker()>
		CrashlyticsController.access$500(CrashlyticsController.this, val$time, val$thread, val$ex);
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field CrashlyticsController this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #30  <Field Date val$time>
	//    8   18:aload_0         
	//    9   19:getfield        #32  <Field Thread val$thread>
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field Throwable val$ex>
	//   12   26:invokestatic    #60  <Method void CrashlyticsController.access$500(CrashlyticsController, Date, Thread, Throwable)>
		t t1 = val$settingsDataProvider.getSettingsData();
	//   13   29:aload_0         
	//   14   30:getfield        #36  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider val$settingsDataProvider>
	//   15   33:invokeinterface #66  <Method t CrashlyticsUncaughtExceptionHandler$SettingsDataProvider.getSettingsData()>
	//   16   38:astore          4
		p p1;
		Object obj;
		if(t1 != null)
	//*  17   40:aload           4
	//*  18   42:ifnull          60
		{
			p1 = t1.b;
	//   19   45:aload           4
	//   20   47:getfield        #72  <Field p t.b>
	//   21   50:astore_2        
			obj = ((Object) (t1.d));
	//   22   51:aload           4
	//   23   53:getfield        #76  <Field m t.d>
	//   24   56:astore_3        
		} else
	//*  25   57:goto            64
		{
			p1 = null;
	//   26   60:aconst_null     
	//   27   61:astore_2        
			obj = ((Object) (p1));
	//   28   62:aload_2         
	//   29   63:astore_3        
		}
		boolean flag;
		if(obj != null && !((m) (obj)).e)
	//*  30   64:aload_3         
	//*  31   65:ifnull          83
	//*  32   68:aload_3         
	//*  33   69:getfield        #81  <Field boolean m.e>
	//*  34   72:ifeq            78
	//*  35   75:goto            83
			flag = false;
	//   36   78:iconst_0        
	//   37   79:istore_1        
		else
	//*  38   80:goto            85
			flag = true;
	//   39   83:iconst_1        
	//   40   84:istore_1        
		if(flag || val$firebaseCrashlyticsClientFlag)
	//*  41   85:iload_1         
	//*  42   86:ifne            96
	//*  43   89:aload_0         
	//*  44   90:getfield        #38  <Field boolean val$firebaseCrashlyticsClientFlag>
	//*  45   93:ifeq            110
			CrashlyticsController.access$600(CrashlyticsController.this, val$time.getTime());
	//   46   96:aload_0         
	//   47   97:getfield        #28  <Field CrashlyticsController this$0>
	//   48  100:aload_0         
	//   49  101:getfield        #30  <Field Date val$time>
	//   50  104:invokevirtual   #87  <Method long Date.getTime()>
	//   51  107:invokestatic    #91  <Method void CrashlyticsController.access$600(CrashlyticsController, long)>
		doCloseSessions(p1);
	//   52  110:aload_0         
	//   53  111:getfield        #28  <Field CrashlyticsController this$0>
	//   54  114:aload_2         
	//   55  115:invokevirtual   #95  <Method void CrashlyticsController.doCloseSessions(p)>
		CrashlyticsController.access$700(CrashlyticsController.this);
	//   56  118:aload_0         
	//   57  119:getfield        #28  <Field CrashlyticsController this$0>
	//   58  122:invokestatic    #99  <Method void CrashlyticsController.access$700(CrashlyticsController)>
		if(p1 != null)
	//*  59  125:aload_2         
	//*  60  126:ifnull          140
			trimSessionFiles(p1.g);
	//   61  129:aload_0         
	//   62  130:getfield        #28  <Field CrashlyticsController this$0>
	//   63  133:aload_2         
	//   64  134:getfield        #105 <Field int p.g>
	//   65  137:invokevirtual   #109 <Method void CrashlyticsController.trimSessionFiles(int)>
		if(!CrashlyticsController.access$800(CrashlyticsController.this, t1))
	//*  66  140:aload_0         
	//*  67  141:getfield        #28  <Field CrashlyticsController this$0>
	//*  68  144:aload           4
	//*  69  146:invokestatic    #113 <Method boolean CrashlyticsController.access$800(CrashlyticsController, t)>
	//*  70  149:ifne            161
			CrashlyticsController.access$900(CrashlyticsController.this, t1);
	//   71  152:aload_0         
	//   72  153:getfield        #28  <Field CrashlyticsController this$0>
	//   73  156:aload           4
	//   74  158:invokestatic    #117 <Method void CrashlyticsController.access$900(CrashlyticsController, t)>
		return null;
	//   75  161:aconst_null     
	//   76  162:areturn         
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
