// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.DialogInterface;

// Referenced classes of package com.crashlytics.android.core:
//			CrashPromptDialog

static final class CrashPromptDialog$1
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		val$latch.setOptIn(true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CrashPromptDialog$OptInLatch val$latch>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #29  <Method void CrashPromptDialog$OptInLatch.setOptIn(boolean)>
		dialoginterface.dismiss();
	//    4    8:aload_1         
	//    5    9:invokeinterface #34  <Method void DialogInterface.dismiss()>
	//    6   14:return          
	}

	final tInLatch val$latch;

	CrashPromptDialog$1(tInLatch tinlatch)
	{
		val$latch = tinlatch;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CrashPromptDialog$OptInLatch val$latch>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
