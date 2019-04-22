// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.RetryState;

class RetryManager
{

	public RetryManager(RetryState retrystate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(retrystate != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			retryState = retrystate;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #15  <Field RetryState retryState>
			return;
	//    7   13:return          
		} else
		{
			throw new NullPointerException("retryState must not be null");
	//    8   14:new             #17  <Class NullPointerException>
	//    9   17:dup             
	//   10   18:ldc1            #19  <String "retryState must not be null">
	//   11   20:invokespecial   #22  <Method void NullPointerException(String)>
	//   12   23:athrow          
		}
	}

	public boolean canRetry(long l)
	{
		long l1 = retryState.getRetryDelay();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RetryState retryState>
	//    2    4:invokevirtual   #31  <Method long RetryState.getRetryDelay()>
	//    3    7:lstore_3        
		return l - lastRetry >= l1 * 0xf4240L;
	//    4    8:lload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field long lastRetry>
	//    7   13:lsub            
	//    8   14:lload_3         
	//    9   15:ldc2w           #34  <Long 0xf4240L>
	//   10   18:lmul            
	//   11   19:lcmp            
	//   12   20:iflt            25
	//   13   23:iconst_1        
	//   14   24:ireturn         
	//   15   25:iconst_0        
	//   16   26:ireturn         
	}

	public void recordRetry(long l)
	{
		lastRetry = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #33  <Field long lastRetry>
		retryState = retryState.nextRetryState();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field RetryState retryState>
	//    6   10:invokevirtual   #41  <Method RetryState RetryState.nextRetryState()>
	//    7   13:putfield        #15  <Field RetryState retryState>
	//    8   16:return          
	}

	public void reset()
	{
		lastRetry = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #33  <Field long lastRetry>
		retryState = retryState.initialRetryState();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field RetryState retryState>
	//    6   10:invokevirtual   #45  <Method RetryState RetryState.initialRetryState()>
	//    7   13:putfield        #15  <Field RetryState retryState>
	//    8   16:return          
	}

	long lastRetry;
	private RetryState retryState;
}
