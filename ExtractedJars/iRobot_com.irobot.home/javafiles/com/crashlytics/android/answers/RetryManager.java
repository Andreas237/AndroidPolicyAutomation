// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import b.a.a.a.a.c.a.e;

class RetryManager
{

	public RetryManager(e e1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		if(e1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new NullPointerException("retryState must not be null");
	//    4    8:new             #18  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:ldc1            #20  <String "retryState must not be null">
	//    7   14:invokespecial   #23  <Method void NullPointerException(String)>
	//    8   17:athrow          
		} else
		{
			retryState = e1;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #25  <Field e retryState>
			return;
	//   12   23:return          
		}
	}

	public boolean canRetry(long l)
	{
		long l1 = retryState.a();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field e retryState>
	//    2    4:invokevirtual   #34  <Method long e.a()>
	//    3    7:lstore_3        
		return l - lastRetry >= l1 * 0xf4240L;
	//    4    8:lload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field long lastRetry>
	//    7   13:lsub            
	//    8   14:lload_3         
	//    9   15:ldc2w           #7   <Long 0xf4240L>
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
	//    2    2:putfield        #36  <Field long lastRetry>
		retryState = retryState.b();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field e retryState>
	//    6   10:invokevirtual   #42  <Method e e.b()>
	//    7   13:putfield        #25  <Field e retryState>
	//    8   16:return          
	}

	public void reset()
	{
		lastRetry = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #36  <Field long lastRetry>
		retryState = retryState.c();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field e retryState>
	//    6   10:invokevirtual   #46  <Method e e.c()>
	//    7   13:putfield        #25  <Field e retryState>
	//    8   16:return          
	}

	private static final long NANOSECONDS_IN_MS = 0xf4240L;
	long lastRetry;
	private e retryState;
}
