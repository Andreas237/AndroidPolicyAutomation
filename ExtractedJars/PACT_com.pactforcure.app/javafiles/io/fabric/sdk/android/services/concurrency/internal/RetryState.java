// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//			Backoff, RetryPolicy

public class RetryState
{

	public RetryState(int i, Backoff backoff1, RetryPolicy retrypolicy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		retryCount = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int retryCount>
		backoff = backoff1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Backoff backoff>
		retryPolicy = retrypolicy;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field RetryPolicy retryPolicy>
	//   11   19:return          
	}

	public RetryState(Backoff backoff1, RetryPolicy retrypolicy)
	{
		this(0, backoff1, retrypolicy);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #25  <Method void RetryState(int, Backoff, RetryPolicy)>
	//    5    7:return          
	}

	public Backoff getBackoff()
	{
		return backoff;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Backoff backoff>
	//    2    4:areturn         
	}

	public int getRetryCount()
	{
		return retryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int retryCount>
	//    2    4:ireturn         
	}

	public long getRetryDelay()
	{
		return backoff.getDelayMillis(retryCount);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Backoff backoff>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field int retryCount>
	//    4    8:invokeinterface #37  <Method long Backoff.getDelayMillis(int)>
	//    5   13:lreturn         
	}

	public RetryPolicy getRetryPolicy()
	{
		return retryPolicy;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RetryPolicy retryPolicy>
	//    2    4:areturn         
	}

	public RetryState initialRetryState()
	{
		return new RetryState(backoff, retryPolicy);
	//    0    0:new             #2   <Class RetryState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Backoff backoff>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field RetryPolicy retryPolicy>
	//    6   12:invokespecial   #43  <Method void RetryState(Backoff, RetryPolicy)>
	//    7   15:areturn         
	}

	public RetryState nextRetryState()
	{
		return new RetryState(retryCount + 1, backoff, retryPolicy);
	//    0    0:new             #2   <Class RetryState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field int retryCount>
	//    4    8:iconst_1        
	//    5    9:iadd            
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field Backoff backoff>
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field RetryPolicy retryPolicy>
	//   10   18:invokespecial   #25  <Method void RetryState(int, Backoff, RetryPolicy)>
	//   11   21:areturn         
	}

	private final Backoff backoff;
	private final int retryCount;
	private final RetryPolicy retryPolicy;
}
