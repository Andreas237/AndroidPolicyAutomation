// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

private final class CrashlyticsController$ReportUploaderHandlingExceptionCheck
	implements ReportUploader.HandlingExceptionCheck
{

	public boolean isHandlingException()
	{
		return CrashlyticsController.this.isHandlingException();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CrashlyticsController this$0>
	//    2    4:invokevirtual   #26  <Method boolean CrashlyticsController.isHandlingException()>
	//    3    7:ireturn         
	}

	final CrashlyticsController this$0;

	private CrashlyticsController$ReportUploaderHandlingExceptionCheck()
	{
		this$0 = CrashlyticsController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CrashlyticsController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	CrashlyticsController$ReportUploaderHandlingExceptionCheck(CrashlyticsController._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void CrashlyticsController$ReportUploaderHandlingExceptionCheck(CrashlyticsController)>
	//    3    5:return          
	}
}
