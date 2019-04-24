// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//			RetryPolicy

public class DefaultRetryPolicy
	implements RetryPolicy
{

	public DefaultRetryPolicy()
	{
		this(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #13  <Method void DefaultRetryPolicy(int)>
	//    3    5:return          
	}

	public DefaultRetryPolicy(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		maxRetries = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int maxRetries>
	//    5    9:return          
	}

	public boolean shouldRetry(int i, Throwable throwable)
	{
		return i < maxRetries;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field int maxRetries>
	//    3    5:icmpge          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private final int maxRetries;
}
