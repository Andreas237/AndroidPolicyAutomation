// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import b.a.a.a.a.b.i;
import b.a.a.a.c;
import b.a.a.a.l;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, ReportUploader, Report

private static final class CrashlyticsController$SendReportRunnable
	implements Runnable
{

	public void run()
	{
		if(!i.n(context))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Context context>
	//*   2    4:invokestatic    #34  <Method boolean i.n(Context)>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			c.g().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
	//    5   11:invokestatic    #40  <Method l c.g()>
	//    6   14:ldc1            #42  <String "CrashlyticsCore">
	//    7   16:ldc1            #44  <String "Attempting to send crash report at time of crash...">
	//    8   18:invokeinterface #50  <Method void l.a(String, String)>
			reportUploader.forceUpload(report);
	//    9   23:aload_0         
	//   10   24:getfield        #26  <Field ReportUploader reportUploader>
	//   11   27:aload_0         
	//   12   28:getfield        #24  <Field Report report>
	//   13   31:invokevirtual   #56  <Method boolean ReportUploader.forceUpload(Report)>
	//   14   34:pop             
			return;
	//   15   35:return          
		}
	}

	private final Context context;
	private final Report report;
	private final ReportUploader reportUploader;

	public CrashlyticsController$SendReportRunnable(Context context1, Report report1, ReportUploader reportuploader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context context>
		report = report1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Report report>
		reportUploader = reportuploader;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field ReportUploader reportUploader>
	//   11   19:return          
	}
}
