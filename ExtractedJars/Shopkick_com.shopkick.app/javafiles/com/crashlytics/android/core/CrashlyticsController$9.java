// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.Date;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$9
	implements Runnable
{

	public void run()
	{
		if(!isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field CrashlyticsController this$0>
	//*   2    4:invokevirtual   #38  <Method boolean CrashlyticsController.isHandlingException()>
	//*   3    7:ifne            29
			CrashlyticsController.access$1100(CrashlyticsController.this, val$now, val$thread, val$ex);
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field CrashlyticsController this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field Date val$now>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field Thread val$thread>
	//   10   22:aload_0         
	//   11   23:getfield        #29  <Field Throwable val$ex>
	//   12   26:invokestatic    #41  <Method void CrashlyticsController.access$1100(CrashlyticsController, Date, Thread, Throwable)>
	//   13   29:return          
	}

	final CrashlyticsController this$0;
	final Throwable val$ex;
	final Date val$now;
	final Thread val$thread;

	CrashlyticsController$9()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CrashlyticsController this$0>
		val$now = date;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Date val$now>
		val$thread = thread1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Thread val$thread>
		val$ex = Throwable.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field Throwable val$ex>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
