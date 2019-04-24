// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

class CrashlyticsUncaughtExceptionHandler$5
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		CrashlyticsUncaughtExceptionHandler.access$100(CrashlyticsUncaughtExceptionHandler.this, val$now, val$thread, val$ex);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Date val$now>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Thread val$thread>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Throwable val$ex>
	//    8   16:invokestatic    #45  <Method void CrashlyticsUncaughtExceptionHandler.access$100(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
		return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final Throwable val$ex;
	final Date val$now;
	final Thread val$thread;

	CrashlyticsUncaughtExceptionHandler$5()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field CrashlyticsUncaughtExceptionHandler this$0>
		val$now = date;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Date val$now>
		val$thread = thread1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Thread val$thread>
		val$ex = Throwable.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Throwable val$ex>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
