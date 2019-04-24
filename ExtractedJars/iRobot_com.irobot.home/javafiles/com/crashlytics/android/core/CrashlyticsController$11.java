// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, MetaDataStore

class CrashlyticsController$11
	implements Callable
{

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
	{
		String s = CrashlyticsController.access$1200(CrashlyticsController.this);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field CrashlyticsController this$0>
	//    2    4:invokestatic    #35  <Method String CrashlyticsController.access$1200(CrashlyticsController)>
	//    3    7:astore_1        
		(new MetaDataStore(getFilesDir())).writeKeyData(s, val$keyData);
	//    4    8:new             #37  <Class MetaDataStore>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field CrashlyticsController this$0>
	//    8   16:invokevirtual   #41  <Method java.io.File CrashlyticsController.getFilesDir()>
	//    9   19:invokespecial   #44  <Method void MetaDataStore(java.io.File)>
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field Map val$keyData>
	//   13   27:invokevirtual   #48  <Method void MetaDataStore.writeKeyData(String, Map)>
		return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	final CrashlyticsController this$0;
	final Map val$keyData;

	CrashlyticsController$11()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsController this$0>
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
