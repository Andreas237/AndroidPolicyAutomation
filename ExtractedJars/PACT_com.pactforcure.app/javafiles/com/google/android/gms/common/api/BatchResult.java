// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzac;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//			Result, BatchResultToken, PendingResult, Status

public final class BatchResult
	implements Result
{

	BatchResult(Status status, PendingResult apendingresult[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzahq = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Status zzahq>
		zzaxC = apendingresult;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field PendingResult[] zzaxC>
	//    8   14:return          
	}

	public Status getStatus()
	{
		return zzahq;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Status zzahq>
	//    2    4:areturn         
	}

	public Result take(BatchResultToken batchresulttoken)
	{
		boolean flag;
		if(batchresulttoken.mId < zzaxC.length)
	//*   0    0:aload_1         
	//*   1    1:getfield        #33  <Field int BatchResultToken.mId>
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field PendingResult[] zzaxC>
	//*   4    8:arraylength     
	//*   5    9:icmpge          37
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:iload_2         
	//*   9   15:ldc1            #35  <String "The result token does not belong to this batch">
	//*  10   17:invokestatic    #41  <Method void zzac.zzb(boolean, Object)>
	//*  11   20:aload_0         
	//*  12   21:getfield        #20  <Field PendingResult[] zzaxC>
	//*  13   24:aload_1         
	//*  14   25:getfield        #33  <Field int BatchResultToken.mId>
	//*  15   28:aaload          
	//*  16   29:lconst_0        
	//*  17   30:getstatic       #47  <Field TimeUnit TimeUnit.MILLISECONDS>
	//*  18   33:invokevirtual   #53  <Method Result PendingResult.await(long, TimeUnit)>
	//*  19   36:areturn         
			flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_2        
		zzac.zzb(flag, "The result token does not belong to this batch");
		return zzaxC[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
	//*  22   39:goto            14
	}

	private final Status zzahq;
	private final PendingResult zzaxC[];
}
