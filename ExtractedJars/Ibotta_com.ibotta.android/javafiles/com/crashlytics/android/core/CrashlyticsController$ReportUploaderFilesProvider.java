// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

private final class CrashlyticsController$ReportUploaderFilesProvider
	implements ReportUploader.ReportFilesProvider
{

	public File[] getCompleteSessionFiles()
	{
		return listCompleteSessionFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CrashlyticsController this$0>
	//    2    4:invokevirtual   #27  <Method File[] CrashlyticsController.listCompleteSessionFiles()>
	//    3    7:areturn         
	}

	public File[] getInvalidSessionFiles()
	{
		return getInvalidFilesDir().listFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CrashlyticsController this$0>
	//    2    4:invokevirtual   #32  <Method File CrashlyticsController.getInvalidFilesDir()>
	//    3    7:invokevirtual   #37  <Method File[] File.listFiles()>
	//    4   10:areturn         
	}

	final CrashlyticsController this$0;

	private CrashlyticsController$ReportUploaderFilesProvider()
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

	CrashlyticsController$ReportUploaderFilesProvider(CrashlyticsController._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void CrashlyticsController$ReportUploaderFilesProvider(CrashlyticsController)>
	//    3    5:return          
	}
}
