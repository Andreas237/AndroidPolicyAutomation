// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore

class CrashlyticsCore$7
	implements AlwaysSendCallback
{

	public void sendUserReportsWithoutPrompting(boolean flag)
	{
		setShouldSendUserReportsWithoutPrompting(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CrashlyticsCore this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method void CrashlyticsCore.setShouldSendUserReportsWithoutPrompting(boolean)>
	//    4    8:return          
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$7()
	{
		this$0 = CrashlyticsCore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CrashlyticsCore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
