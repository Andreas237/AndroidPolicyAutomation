// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.g.p;
import b.a.a.a.c;
import b.a.a.a.l;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$13
	implements Callable
{

	public Boolean call()
	{
		if(isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CrashlyticsController this$0>
	//*   2    4:invokevirtual   #32  <Method boolean CrashlyticsController.isHandlingException()>
	//*   3    7:ifeq            26
		{
			c.g().a("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
	//    4   10:invokestatic    #38  <Method l c.g()>
	//    5   13:ldc1            #40  <String "CrashlyticsCore">
	//    6   15:ldc1            #42  <String "Skipping session finalization because a crash has already occurred.">
	//    7   17:invokeinterface #48  <Method void l.a(String, String)>
			return Boolean.FALSE;
	//    8   22:getstatic       #54  <Field Boolean Boolean.FALSE>
	//    9   25:areturn         
		} else
		{
			c.g().a("CrashlyticsCore", "Finalizing previously open sessions.");
	//   10   26:invokestatic    #38  <Method l c.g()>
	//   11   29:ldc1            #40  <String "CrashlyticsCore">
	//   12   31:ldc1            #56  <String "Finalizing previously open sessions.">
	//   13   33:invokeinterface #48  <Method void l.a(String, String)>
			CrashlyticsController.access$1300(CrashlyticsController.this, val$sessionSettingsData, true);
	//   14   38:aload_0         
	//   15   39:getfield        #20  <Field CrashlyticsController this$0>
	//   16   42:aload_0         
	//   17   43:getfield        #22  <Field p val$sessionSettingsData>
	//   18   46:iconst_1        
	//   19   47:invokestatic    #60  <Method void CrashlyticsController.access$1300(CrashlyticsController, p, boolean)>
			c.g().a("CrashlyticsCore", "Closed all previously open sessions");
	//   20   50:invokestatic    #38  <Method l c.g()>
	//   21   53:ldc1            #40  <String "CrashlyticsCore">
	//   22   55:ldc1            #62  <String "Closed all previously open sessions">
	//   23   57:invokeinterface #48  <Method void l.a(String, String)>
			return Boolean.TRUE;
	//   24   62:getstatic       #65  <Field Boolean Boolean.TRUE>
	//   25   65:areturn         
		}
	}

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method Boolean call()>
	//    2    4:areturn         
	}

	final CrashlyticsController this$0;
	final p val$sessionSettingsData;

	CrashlyticsController$13()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsController this$0>
		val$sessionSettingsData = p.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field p val$sessionSettingsData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
