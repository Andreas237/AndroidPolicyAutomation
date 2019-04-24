// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashlyticsFileMarker

class CrashlyticsCore$4
	implements Callable
{

	public Boolean call()
		throws Exception
	{
		return Boolean.valueOf(CrashlyticsCore.access$100(CrashlyticsCore.this).isPresent());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
	//    2    4:invokestatic    #30  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
	//    3    7:invokevirtual   #35  <Method boolean CrashlyticsFileMarker.isPresent()>
	//    4   10:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
	//    5   13:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Boolean call()>
	//    2    4:areturn         
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$4()
	{
		this$0 = CrashlyticsCore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
