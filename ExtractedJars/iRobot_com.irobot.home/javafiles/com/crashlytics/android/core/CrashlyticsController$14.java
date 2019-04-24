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
		doCleanInvalidTempFiles(CrashlyticsController.access$1500(CrashlyticsController.this, ((java.io.FilenameFilter) (new alidPartFileFilter()))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CrashlyticsController this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field CrashlyticsController this$0>
	//    4    8:new             #23  <Class CrashlyticsController$InvalidPartFileFilter>
	//    5   11:dup             
	//    6   12:invokespecial   #24  <Method void CrashlyticsController$InvalidPartFileFilter()>
	//    7   15:invokestatic    #28  <Method java.io.File[] CrashlyticsController.access$1500(CrashlyticsController, java.io.FilenameFilter)>
	//    8   18:invokevirtual   #32  <Method void CrashlyticsController.doCleanInvalidTempFiles(java.io.File[])>
	//    9   21:return          
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
