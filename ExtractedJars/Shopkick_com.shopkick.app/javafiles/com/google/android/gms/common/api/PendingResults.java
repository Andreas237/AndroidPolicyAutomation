// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResult, Result, Status, GoogleApiClient, 
//			OptionalPendingResult

public final class PendingResults
{
	private static final class zaa extends BasePendingResult
	{

		protected final Result createFailedResult(Status status)
		{
			if(status.getStatusCode() == zach.getStatus().getStatusCode())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #35  <Method int Status.getStatusCode()>
		//*   2    4:aload_0         
		//*   3    5:getfield        #24  <Field Result zach>
		//*   4    8:invokeinterface #41  <Method Status Result.getStatus()>
		//*   5   13:invokevirtual   #35  <Method int Status.getStatusCode()>
		//*   6   16:icmpne          24
				return zach;
		//    7   19:aload_0         
		//    8   20:getfield        #24  <Field Result zach>
		//    9   23:areturn         
			else
				throw new UnsupportedOperationException("Creating failed results is not supported");
		//   10   24:new             #43  <Class UnsupportedOperationException>
		//   11   27:dup             
		//   12   28:ldc1            #45  <String "Creating failed results is not supported">
		//   13   30:invokespecial   #48  <Method void UnsupportedOperationException(String)>
		//   14   33:athrow          
		}

		private final Result zach;

		public zaa(Result result)
		{
			super(Looper.getMainLooper());
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method Looper Looper.getMainLooper()>
		//    2    4:invokespecial   #22  <Method void BasePendingResult(Looper)>
			zach = result;
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:putfield        #24  <Field Result zach>
		//    6   12:return          
		}
	}

	private static final class zab extends BasePendingResult
	{

		protected final Result createFailedResult(Status status)
		{
			return zaci;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Result zaci>
		//    2    4:areturn         
		}

		private final Result zaci;

		public zab(GoogleApiClient googleapiclient, Result result)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void BasePendingResult(GoogleApiClient)>
			zaci = result;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #18  <Field Result zaci>
		//    6   10:return          
		}
	}

	private static final class zac extends BasePendingResult
	{

		protected final Result createFailedResult(Status status)
		{
			throw new UnsupportedOperationException("Creating failed results is not supported");
		//    0    0:new             #17  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "Creating failed results is not supported">
		//    3    6:invokespecial   #22  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public zac(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void BasePendingResult(GoogleApiClient)>
		//    3    5:return          
		}
	}


	private PendingResults()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static PendingResult canceledPendingResult()
	{
		StatusPendingResult statuspendingresult = new StatusPendingResult(Looper.getMainLooper());
	//    0    0:new             #24  <Class StatusPendingResult>
	//    1    3:dup             
	//    2    4:invokestatic    #30  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #33  <Method void StatusPendingResult(Looper)>
	//    4   10:astore_0        
		((PendingResult) (statuspendingresult)).cancel();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #38  <Method void PendingResult.cancel()>
		return ((PendingResult) (statuspendingresult));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public static PendingResult canceledPendingResult(Result result)
	{
		Preconditions.checkNotNull(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "Result must not be null">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(result.getStatus().getStatusCode() == 16)
	//*   4    7:aload_0         
	//*   5    8:invokeinterface #55  <Method Status Result.getStatus()>
	//*   6   13:invokevirtual   #61  <Method int Status.getStatusCode()>
	//*   7   16:bipush          16
	//*   8   18:icmpne          26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		Preconditions.checkArgument(flag, "Status code must be CommonStatusCodes.CANCELED");
	//   14   28:iload_1         
	//   15   29:ldc1            #63  <String "Status code must be CommonStatusCodes.CANCELED">
	//   16   31:invokestatic    #67  <Method void Preconditions.checkArgument(boolean, Object)>
		result = ((Result) (new zaa(result)));
	//   17   34:new             #6   <Class PendingResults$zaa>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:invokespecial   #70  <Method void PendingResults$zaa(Result)>
	//   21   42:astore_0        
		((PendingResult) (result)).cancel();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #38  <Method void PendingResult.cancel()>
		return ((PendingResult) (result));
	//   24   47:aload_0         
	//   25   48:areturn         
	}

	public static PendingResult immediateFailedResult(Result result, GoogleApiClient googleapiclient)
	{
		Preconditions.checkNotNull(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "Result must not be null">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkArgument(result.getStatus().isSuccess() ^ true, "Status code must not be SUCCESS");
	//    4    7:aload_0         
	//    5    8:invokeinterface #55  <Method Status Result.getStatus()>
	//    6   13:invokevirtual   #77  <Method boolean Status.isSuccess()>
	//    7   16:iconst_1        
	//    8   17:ixor            
	//    9   18:ldc1            #79  <String "Status code must not be SUCCESS">
	//   10   20:invokestatic    #67  <Method void Preconditions.checkArgument(boolean, Object)>
		googleapiclient = ((GoogleApiClient) (new zab(googleapiclient, result)));
	//   11   23:new             #9   <Class PendingResults$zab>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokespecial   #82  <Method void PendingResults$zab(GoogleApiClient, Result)>
	//   16   32:astore_1        
		((BasePendingResult) (googleapiclient)).setResult(result);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #87  <Method void BasePendingResult.setResult(Result)>
		return ((PendingResult) (googleapiclient));
	//   20   38:aload_1         
	//   21   39:areturn         
	}

	public static OptionalPendingResult immediatePendingResult(Result result)
	{
		Preconditions.checkNotNull(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "Result must not be null">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		zac zac1 = new zac(((GoogleApiClient) (null)));
	//    4    7:new             #12  <Class PendingResults$zac>
	//    5   10:dup             
	//    6   11:aconst_null     
	//    7   12:invokespecial   #93  <Method void PendingResults$zac(GoogleApiClient)>
	//    8   15:astore_1        
		((BasePendingResult) (zac1)).setResult(result);
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #87  <Method void BasePendingResult.setResult(Result)>
		return ((OptionalPendingResult) (new OptionalPendingResultImpl(((PendingResult) (zac1)))));
	//   12   21:new             #95  <Class OptionalPendingResultImpl>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:invokespecial   #98  <Method void OptionalPendingResultImpl(PendingResult)>
	//   16   29:areturn         
	}

	public static OptionalPendingResult immediatePendingResult(Result result, GoogleApiClient googleapiclient)
	{
		Preconditions.checkNotNull(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "Result must not be null">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		googleapiclient = ((GoogleApiClient) (new zac(googleapiclient)));
	//    4    7:new             #12  <Class PendingResults$zac>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:invokespecial   #93  <Method void PendingResults$zac(GoogleApiClient)>
	//    8   15:astore_1        
		((BasePendingResult) (googleapiclient)).setResult(result);
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #87  <Method void BasePendingResult.setResult(Result)>
		return ((OptionalPendingResult) (new OptionalPendingResultImpl(((PendingResult) (googleapiclient)))));
	//   12   21:new             #95  <Class OptionalPendingResultImpl>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:invokespecial   #98  <Method void OptionalPendingResultImpl(PendingResult)>
	//   16   29:areturn         
	}

	public static PendingResult immediatePendingResult(Status status)
	{
		Preconditions.checkNotNull(((Object) (status)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "Result must not be null">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		StatusPendingResult statuspendingresult = new StatusPendingResult(Looper.getMainLooper());
	//    4    7:new             #24  <Class StatusPendingResult>
	//    5   10:dup             
	//    6   11:invokestatic    #30  <Method Looper Looper.getMainLooper()>
	//    7   14:invokespecial   #33  <Method void StatusPendingResult(Looper)>
	//    8   17:astore_1        
		((BasePendingResult) (statuspendingresult)).setResult(((Result) (status)));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #87  <Method void BasePendingResult.setResult(Result)>
		return ((PendingResult) (statuspendingresult));
	//   12   23:aload_1         
	//   13   24:areturn         
	}

	public static PendingResult immediatePendingResult(Status status, GoogleApiClient googleapiclient)
	{
		Preconditions.checkNotNull(((Object) (status)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "Result must not be null">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		googleapiclient = ((GoogleApiClient) (new StatusPendingResult(googleapiclient)));
	//    4    7:new             #24  <Class StatusPendingResult>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:invokespecial   #105 <Method void StatusPendingResult(GoogleApiClient)>
	//    8   15:astore_1        
		((BasePendingResult) (googleapiclient)).setResult(((Result) (status)));
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #87  <Method void BasePendingResult.setResult(Result)>
		return ((PendingResult) (googleapiclient));
	//   12   21:aload_1         
	//   13   22:areturn         
	}
}
