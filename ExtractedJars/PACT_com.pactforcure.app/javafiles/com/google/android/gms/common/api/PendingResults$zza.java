// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.internal.zzzx;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResults, Status, Result

private static final class PendingResults$zza extends zzzx
{

	protected Result zzc(Status status)
	{
		if(status.getStatusCode() != zzayc.getStatus().getStatusCode())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #35  <Method int Status.getStatusCode()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field Result zzayc>
	//*   4    8:invokeinterface #41  <Method Status Result.getStatus()>
	//*   5   13:invokevirtual   #35  <Method int Status.getStatusCode()>
	//*   6   16:icmpeq          29
			throw new UnsupportedOperationException("Creating failed results is not supported");
	//    7   19:new             #43  <Class UnsupportedOperationException>
	//    8   22:dup             
	//    9   23:ldc1            #45  <String "Creating failed results is not supported">
	//   10   25:invokespecial   #48  <Method void UnsupportedOperationException(String)>
	//   11   28:athrow          
		else
			return zzayc;
	//   12   29:aload_0         
	//   13   30:getfield        #24  <Field Result zzayc>
	//   14   33:areturn         
	}

	private final Result zzayc;

	public PendingResults$zza(Result result)
	{
		super(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #22  <Method void zzzx(Looper)>
		zzayc = result;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #24  <Field Result zzayc>
	//    6   12:return          
	}
}
