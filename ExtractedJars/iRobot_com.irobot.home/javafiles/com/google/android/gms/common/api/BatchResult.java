// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
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
		mStatus = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Status mStatus>
		zabc = apendingresult;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field PendingResult[] zabc>
	//    8   14:return          
	}

	public final Status getStatus()
	{
		return mStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Status mStatus>
	//    2    4:areturn         
	}

	public final Result take(BatchResultToken batchresulttoken)
	{
		boolean flag;
		if(batchresulttoken.mId < zabc.length)
	//*   0    0:aload_1         
	//*   1    1:getfield        #33  <Field int BatchResultToken.mId>
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field PendingResult[] zabc>
	//*   4    8:arraylength     
	//*   5    9:icmpge          17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		Preconditions.checkArgument(flag, "The result token does not belong to this batch");
	//   11   19:iload_2         
	//   12   20:ldc1            #35  <String "The result token does not belong to this batch">
	//   13   22:invokestatic    #41  <Method void Preconditions.checkArgument(boolean, Object)>
		return zabc[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field PendingResult[] zabc>
	//   16   29:aload_1         
	//   17   30:getfield        #33  <Field int BatchResultToken.mId>
	//   18   33:aaload          
	//   19   34:lconst_0        
	//   20   35:getstatic       #47  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   21   38:invokevirtual   #53  <Method Result PendingResult.await(long, TimeUnit)>
	//   22   41:areturn         
	}

	private final Status mStatus;
	private final PendingResult zabc[];
}
