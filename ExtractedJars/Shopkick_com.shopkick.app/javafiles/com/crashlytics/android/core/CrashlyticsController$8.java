// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, LogFileManager

class CrashlyticsController$8
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
		if(!isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field CrashlyticsController this$0>
	//*   2    4:invokevirtual   #42  <Method boolean CrashlyticsController.isHandlingException()>
	//*   3    7:ifne            28
			CrashlyticsController.access$1000(CrashlyticsController.this).writeToLog(val$timestamp, val$msg);
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field CrashlyticsController this$0>
	//    6   14:invokestatic    #46  <Method LogFileManager CrashlyticsController.access$1000(CrashlyticsController)>
	//    7   17:aload_0         
	//    8   18:getfield        #24  <Field long val$timestamp>
	//    9   21:aload_0         
	//   10   22:getfield        #26  <Field String val$msg>
	//   11   25:invokevirtual   #49  <Method void LogFileManager.writeToLog(long, String)>
		return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
	}

	final CrashlyticsController this$0;
	final String val$msg;
	final long val$timestamp;

	CrashlyticsController$8()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CrashlyticsController this$0>
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
