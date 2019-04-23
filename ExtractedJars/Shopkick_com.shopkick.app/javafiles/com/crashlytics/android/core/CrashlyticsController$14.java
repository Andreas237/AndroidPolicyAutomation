// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$14
	implements Runnable
{

	public void run()
	{
		CrashlyticsController crashlyticscontroller = CrashlyticsController.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CrashlyticsController this$0>
	//    2    4:astore_1        
		crashlyticscontroller.doCleanInvalidTempFiles(CrashlyticsController.access$1500(crashlyticscontroller, ((java.io.FilenameFilter) (new alidPartFileFilter()))));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:new             #23  <Class CrashlyticsController$InvalidPartFileFilter>
	//    6   10:dup             
	//    7   11:invokespecial   #24  <Method void CrashlyticsController$InvalidPartFileFilter()>
	//    8   14:invokestatic    #28  <Method java.io.File[] CrashlyticsController.access$1500(CrashlyticsController, java.io.FilenameFilter)>
	//    9   17:invokevirtual   #32  <Method void CrashlyticsController.doCleanInvalidTempFiles(java.io.File[])>
	//   10   20:return          
	}

	final CrashlyticsController this$0;

	CrashlyticsController$14()
	{
		this$0 = CrashlyticsController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CrashlyticsController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
