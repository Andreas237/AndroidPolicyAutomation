// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.DialogInterface;

// Referenced classes of package com.crashlytics.android.core:
//			CrashPromptDialog

static final class CrashPromptDialog$3
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		val$alwaysSendCallback.sendUserReportsWithoutPrompting(true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CrashPromptDialog$AlwaysSendCallback val$alwaysSendCallback>
	//    2    4:iconst_1        
	//    3    5:invokeinterface #33  <Method void CrashPromptDialog$AlwaysSendCallback.sendUserReportsWithoutPrompting(boolean)>
		val$latch.setOptIn(true);
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field CrashPromptDialog$OptInLatch val$latch>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #38  <Method void CrashPromptDialog$OptInLatch.setOptIn(boolean)>
		dialoginterface.dismiss();
	//    8   18:aload_1         
	//    9   19:invokeinterface #43  <Method void DialogInterface.dismiss()>
	//   10   24:return          
	}

	final waysSendCallback val$alwaysSendCallback;
	final tInLatch val$latch;

	CrashPromptDialog$3(waysSendCallback wayssendcallback, tInLatch tinlatch)
	{
		val$alwaysSendCallback = wayssendcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrashPromptDialog$AlwaysSendCallback val$alwaysSendCallback>
		val$latch = tinlatch;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CrashPromptDialog$OptInLatch val$latch>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
