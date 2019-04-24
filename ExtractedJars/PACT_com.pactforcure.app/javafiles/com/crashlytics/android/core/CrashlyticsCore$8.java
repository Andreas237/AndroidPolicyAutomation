// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashPromptDialog

class CrashlyticsCore$8
	implements Runnable
{

	public void run()
	{
		val$dialog.show();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CrashPromptDialog val$dialog>
	//    2    4:invokevirtual   #31  <Method void CrashPromptDialog.show()>
	//    3    7:return          
	}

	final CrashlyticsCore this$0;
	final CrashPromptDialog val$dialog;

	CrashlyticsCore$8()
	{
		this$0 = final_crashlyticscore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrashlyticsCore this$0>
		val$dialog = CrashPromptDialog.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CrashPromptDialog val$dialog>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
