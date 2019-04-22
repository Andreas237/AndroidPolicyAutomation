// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.SessionEventData;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$15
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
		if(!isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CrashlyticsController this$0>
	//*   2    4:invokevirtual   #38  <Method boolean CrashlyticsController.isHandlingException()>
	//*   3    7:ifne            21
			CrashlyticsController.access$1400(CrashlyticsController.this, val$crashEventData);
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field CrashlyticsController this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field SessionEventData val$crashEventData>
	//    8   18:invokestatic    #41  <Method void CrashlyticsController.access$1400(CrashlyticsController, SessionEventData)>
		return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	final CrashlyticsController this$0;
	final SessionEventData val$crashEventData;

	CrashlyticsController$15()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsController this$0>
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
