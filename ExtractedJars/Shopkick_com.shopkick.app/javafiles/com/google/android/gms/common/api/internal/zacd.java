// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

public final class zacd extends PendingResult
{

	public zacd(Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void PendingResult()>
		Preconditions.checkNotNull(((Object) (status)), "Status must not be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #14  <String "Status must not be null">
	//    4    7:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkArgument(status.isSuccess() ^ true, "Status must not be success");
	//    6   11:aload_1         
	//    7   12:invokevirtual   #26  <Method boolean Status.isSuccess()>
	//    8   15:iconst_1        
	//    9   16:ixor            
	//   10   17:ldc1            #28  <String "Status must not be success">
	//   11   19:invokestatic    #32  <Method void Preconditions.checkArgument(boolean, Object)>
		mStatus = status;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #34  <Field Status mStatus>
	//   15   27:return          
	}

	public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statuslistener)
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final Result await()
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final Result await(long l, TimeUnit timeunit)
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final void cancel()
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	final Status getStatus()
	{
		return mStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Status mStatus>
	//    2    4:areturn         
	}

	public final boolean isCanceled()
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final void setResultCallback(ResultCallback resultcallback)
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final TransformedResult then(ResultTransform resulttransform)
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final Integer zam()
	{
		throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Operation not supported on PendingResults generated by ResultTransform.createFailedResult()">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	private final Status mStatus;
}
