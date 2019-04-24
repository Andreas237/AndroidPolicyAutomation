// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

class CrashlyticsUncaughtExceptionHandler$7
	implements Runnable
{

	public void run()
	{
		if(!CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//*   2    4:invokestatic    #38  <Method AtomicBoolean CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler)>
	//*   3    7:invokevirtual   #44  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifne            32
			CrashlyticsUncaughtExceptionHandler.access$400(CrashlyticsUncaughtExceptionHandler.this, val$now, val$thread, val$ex);
	//    5   13:aload_0         
	//    6   14:getfield        #23  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    7   17:aload_0         
	//    8   18:getfield        #25  <Field Date val$now>
	//    9   21:aload_0         
	//   10   22:getfield        #27  <Field Thread val$thread>
	//   11   25:aload_0         
	//   12   26:getfield        #29  <Field Throwable val$ex>
	//   13   29:invokestatic    #47  <Method void CrashlyticsUncaughtExceptionHandler.access$400(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
	//   14   32:return          
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final Throwable val$ex;
	final Date val$now;
	final Thread val$thread;

	CrashlyticsUncaughtExceptionHandler$7()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CrashlyticsUncaughtExceptionHandler this$0>
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
