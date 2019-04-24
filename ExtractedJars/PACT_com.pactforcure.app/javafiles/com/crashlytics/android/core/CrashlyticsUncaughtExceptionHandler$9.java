// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler, MetaDataStore

class CrashlyticsUncaughtExceptionHandler$9
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		String s = CrashlyticsUncaughtExceptionHandler.access$500(CrashlyticsUncaughtExceptionHandler.this);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    2    4:invokestatic    #38  <Method String CrashlyticsUncaughtExceptionHandler.access$500(CrashlyticsUncaughtExceptionHandler)>
	//    3    7:astore_1        
		(new MetaDataStore(CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler.this))).writeKeyData(s, val$keyData);
	//    4    8:new             #40  <Class MetaDataStore>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    8   16:invokestatic    #44  <Method java.io.File CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler)>
	//    9   19:invokespecial   #47  <Method void MetaDataStore(java.io.File)>
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field Map val$keyData>
	//   13   27:invokevirtual   #51  <Method void MetaDataStore.writeKeyData(String, Map)>
		return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final Map val$keyData;

	CrashlyticsUncaughtExceptionHandler$9()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
		val$keyData = Map.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Map val$keyData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
