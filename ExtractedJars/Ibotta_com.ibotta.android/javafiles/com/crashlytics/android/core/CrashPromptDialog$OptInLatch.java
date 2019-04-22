// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android.core:
//			CrashPromptDialog

private static class CrashPromptDialog$OptInLatch
{

	void await()
	{
		try
		{
			latch.await();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field CountDownLatch latch>
	//    2    4:invokevirtual   #32  <Method void CountDownLatch.await()>
			return;
	//    3    7:return          
		}
		catch(InterruptedException interruptedexception)
	//*   4    8:astore_1        
		{
			return;
	//    5    9:return          
		}
	}

	boolean getOptIn()
	{
		return send;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean send>
	//    2    4:ireturn         
	}

	void setOptIn(boolean flag)
	{
		send = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean send>
		latch.countDown();
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field CountDownLatch latch>
	//    5    9:invokevirtual   #39  <Method void CountDownLatch.countDown()>
	//    6   12:return          
	}

	private final CountDownLatch latch;
	private boolean send;

	private CrashPromptDialog$OptInLatch()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		send = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean send>
		latch = new CountDownLatch(1);
	//    5    9:aload_0         
	//    6   10:new             #19  <Class CountDownLatch>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #22  <Method void CountDownLatch(int)>
	//   10   18:putfield        #24  <Field CountDownLatch latch>
	//   11   21:return          
	}

	CrashPromptDialog$OptInLatch(CrashPromptDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void CrashPromptDialog$OptInLatch()>
	//    2    4:return          
	}
}
