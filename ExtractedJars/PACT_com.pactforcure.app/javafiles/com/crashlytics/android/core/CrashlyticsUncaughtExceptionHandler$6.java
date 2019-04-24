// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler, LogFileManager

class CrashlyticsUncaughtExceptionHandler$6
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		if(!CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//*   2    4:invokestatic    #42  <Method AtomicBoolean CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler)>
	//*   3    7:invokevirtual   #48  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifne            31
			CrashlyticsUncaughtExceptionHandler.access$300(CrashlyticsUncaughtExceptionHandler.this).writeToLog(val$timestamp, val$msg);
	//    5   13:aload_0         
	//    6   14:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    7   17:invokestatic    #52  <Method LogFileManager CrashlyticsUncaughtExceptionHandler.access$300(CrashlyticsUncaughtExceptionHandler)>
	//    8   20:aload_0         
	//    9   21:getfield        #24  <Field long val$timestamp>
	//   10   24:aload_0         
	//   11   25:getfield        #26  <Field String val$msg>
	//   12   28:invokevirtual   #55  <Method void LogFileManager.writeToLog(long, String)>
		return null;
	//   13   31:aconst_null     
	//   14   32:areturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final String val$msg;
	final long val$timestamp;

	CrashlyticsUncaughtExceptionHandler$6()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
		val$timestamp = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #24  <Field long val$timestamp>
		val$msg = String.this;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #26  <Field String val$msg>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #29  <Method void Object()>
	//   11   20:return          
	}
}
