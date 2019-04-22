// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$5
	implements tionHandler.CrashListener
{

	public void onUncaughtException(Thread thread, Throwable throwable)
	{
		handleUncaughtException(thread, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CrashlyticsController this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #26  <Method void CrashlyticsController.handleUncaughtException(Thread, Throwable)>
	//    5    9:return          
	}

	final CrashlyticsController this$0;

	CrashlyticsController$5()
	{
		this$0 = CrashlyticsController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CrashlyticsController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
