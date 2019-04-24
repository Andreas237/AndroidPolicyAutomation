// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.SessionEventData;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

class CrashlyticsUncaughtExceptionHandler$14
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		if(!CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//*   2    4:invokestatic    #38  <Method AtomicBoolean CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler)>
	//*   3    7:invokevirtual   #44  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifne            24
			CrashlyticsUncaughtExceptionHandler.access$1100(CrashlyticsUncaughtExceptionHandler.this, val$crashEventData);
	//    5   13:aload_0         
	//    6   14:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field SessionEventData val$crashEventData>
	//    9   21:invokestatic    #47  <Method void CrashlyticsUncaughtExceptionHandler.access$1100(CrashlyticsUncaughtExceptionHandler, SessionEventData)>
		return null;
	//   10   24:aconst_null     
	//   11   25:areturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final SessionEventData val$crashEventData;

	CrashlyticsUncaughtExceptionHandler$14()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
		val$crashEventData = SessionEventData.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field SessionEventData val$crashEventData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
