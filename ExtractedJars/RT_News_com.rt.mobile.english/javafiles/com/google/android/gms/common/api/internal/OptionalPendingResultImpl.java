// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult

public final class OptionalPendingResultImpl extends OptionalPendingResult
{

	public OptionalPendingResultImpl(PendingResult pendingresult)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void OptionalPendingResult()>
		zzlo = (BasePendingResult)pendingresult;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:checkcast       #16  <Class BasePendingResult>
	//    5    9:putfield        #18  <Field BasePendingResult zzlo>
	//    6   12:return          
	}

	public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statuslistener)
	{
		((PendingResult) (zzlo)).addStatusListener(statuslistener);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void PendingResult.addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener)>
	//    4    8:return          
	}

	public final Result await()
	{
		return ((PendingResult) (zzlo)).await();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:invokevirtual   #31  <Method Result PendingResult.await()>
	//    3    7:areturn         
	}

	public final Result await(long l, TimeUnit timeunit)
	{
		return ((PendingResult) (zzlo)).await(l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #35  <Method Result PendingResult.await(long, TimeUnit)>
	//    5    9:areturn         
	}

	public final void cancel()
	{
		((PendingResult) (zzlo)).cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:invokevirtual   #39  <Method void PendingResult.cancel()>
	//    3    7:return          
	}

	public final Result get()
	{
		if(((OptionalPendingResult)this).isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #44  <Method boolean OptionalPendingResult.isDone()>
	//*   2    4:ifeq            16
			return ((PendingResult)this).await(0L, TimeUnit.MILLISECONDS);
	//    3    7:aload_0         
	//    4    8:lconst_0        
	//    5    9:getstatic       #50  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    6   12:invokevirtual   #35  <Method Result PendingResult.await(long, TimeUnit)>
	//    7   15:areturn         
		else
			throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
	//    8   16:new             #52  <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc1            #54  <String "Result is not available. Check that isDone() returns true before calling get().">
	//   11   22:invokespecial   #57  <Method void IllegalStateException(String)>
	//   12   25:athrow          
	}

	public final boolean isCanceled()
	{
		return ((PendingResult) (zzlo)).isCanceled();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:invokevirtual   #60  <Method boolean PendingResult.isCanceled()>
	//    3    7:ireturn         
	}

	public final boolean isDone()
	{
		return zzlo.isReady();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:invokevirtual   #63  <Method boolean BasePendingResult.isReady()>
	//    3    7:ireturn         
	}

	public final void setResultCallback(ResultCallback resultcallback)
	{
		((PendingResult) (zzlo)).setResultCallback(resultcallback);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method void PendingResult.setResultCallback(ResultCallback)>
	//    4    8:return          
	}

	public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
	{
		((PendingResult) (zzlo)).setResultCallback(resultcallback, l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:aload           4
	//    5    8:invokevirtual   #71  <Method void PendingResult.setResultCallback(ResultCallback, long, TimeUnit)>
	//    6   11:return          
	}

	public final TransformedResult then(ResultTransform resulttransform)
	{
		return ((PendingResult) (zzlo)).then(resulttransform);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method TransformedResult PendingResult.then(ResultTransform)>
	//    4    8:areturn         
	}

	public final Integer zzo()
	{
		return ((PendingResult) (zzlo)).zzo();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BasePendingResult zzlo>
	//    2    4:invokevirtual   #84  <Method Integer PendingResult.zzo()>
	//    3    7:areturn         
	}

	private final BasePendingResult zzlo;
}
