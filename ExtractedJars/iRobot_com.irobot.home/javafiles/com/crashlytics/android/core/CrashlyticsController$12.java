// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$12
	implements Callable
{

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
	{
		CrashlyticsController.access$700(CrashlyticsController.this);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CrashlyticsController this$0>
	//    2    4:invokestatic    #29  <Method void CrashlyticsController.access$700(CrashlyticsController)>
		return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
	}

	final CrashlyticsController this$0;

	CrashlyticsController$12()
	{
		this$0 = CrashlyticsController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashlyticsController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
