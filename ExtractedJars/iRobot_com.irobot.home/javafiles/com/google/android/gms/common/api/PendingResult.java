// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//			Result, ResultCallback, ResultTransform, TransformedResult, 
//			Status

public abstract class PendingResult
{
	public static interface StatusListener
	{

		public abstract void onComplete(Status status);
	}


	public PendingResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public void addStatusListener(StatusListener statuslistener)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #18  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract Result await();

	public abstract Result await(long l, TimeUnit timeunit);

	public abstract void cancel();

	public abstract boolean isCanceled();

	public abstract void setResultCallback(ResultCallback resultcallback);

	public abstract void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit);

	public TransformedResult then(ResultTransform resulttransform)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #18  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Integer zam()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #18  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}
}
