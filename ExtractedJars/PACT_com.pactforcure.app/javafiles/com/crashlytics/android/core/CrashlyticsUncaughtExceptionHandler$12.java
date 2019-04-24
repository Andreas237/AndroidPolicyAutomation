// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

class CrashlyticsUncaughtExceptionHandler$12
	implements Runnable
{

	public void run()
	{
		doCleanInvalidTempFiles(CrashlyticsUncaughtExceptionHandler.access$1000(CrashlyticsUncaughtExceptionHandler.this, ((java.io.FilenameFilter) (new alidPartFileFilter()))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    4    8:new             #23  <Class CrashlyticsUncaughtExceptionHandler$InvalidPartFileFilter>
	//    5   11:dup             
	//    6   12:invokespecial   #24  <Method void CrashlyticsUncaughtExceptionHandler$InvalidPartFileFilter()>
	//    7   15:invokestatic    #28  <Method java.io.File[] CrashlyticsUncaughtExceptionHandler.access$1000(CrashlyticsUncaughtExceptionHandler, java.io.FilenameFilter)>
	//    8   18:invokevirtual   #32  <Method void CrashlyticsUncaughtExceptionHandler.doCleanInvalidTempFiles(java.io.File[])>
	//    9   21:return          
	}

	final CrashlyticsUncaughtExceptionHandler this$0;

	CrashlyticsUncaughtExceptionHandler$12()
	{
		this$0 = CrashlyticsUncaughtExceptionHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
