// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResults, Status, Result

private static final class PendingResults$zza extends BasePendingResult
{

	protected final Result createFailedResult(Status status)
	{
		if(status.getStatusCode() == zzdl.getStatus().getStatusCode())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #35  <Method int Status.getStatusCode()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field Result zzdl>
	//*   4    8:invokeinterface #41  <Method Status Result.getStatus()>
	//*   5   13:invokevirtual   #35  <Method int Status.getStatusCode()>
	//*   6   16:icmpne          24
			return zzdl;
	//    7   19:aload_0         
	//    8   20:getfield        #24  <Field Result zzdl>
	//    9   23:areturn         
		else
			throw new UnsupportedOperationException("Creating failed results is not supported");
	//   10   24:new             #43  <Class UnsupportedOperationException>
	//   11   27:dup             
	//   12   28:ldc1            #45  <String "Creating failed results is not supported">
	//   13   30:invokespecial   #48  <Method void UnsupportedOperationException(String)>
	//   14   33:athrow          
	}

	private final Result zzdl;

	public PendingResults$zza(Result result)
	{
		super(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #22  <Method void BasePendingResult(Looper)>
		zzdl = result;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #24  <Field Result zzdl>
	//    6   12:return          
	}
}
