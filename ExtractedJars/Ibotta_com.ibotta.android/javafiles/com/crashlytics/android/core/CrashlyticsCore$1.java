// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore

class CrashlyticsCore$1 extends PriorityCallable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		return doInBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CrashlyticsCore this$0>
	//    2    4:invokevirtual   #30  <Method Void CrashlyticsCore.doInBackground()>
	//    3    7:areturn         
	}

	public Priority getPriority()
	{
		return Priority.IMMEDIATE;
	//    0    0:getstatic       #38  <Field Priority Priority.IMMEDIATE>
	//    1    3:areturn         
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$1()
	{
		this$0 = CrashlyticsCore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CrashlyticsCore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void PriorityCallable()>
	//    5    9:return          
	}
}
