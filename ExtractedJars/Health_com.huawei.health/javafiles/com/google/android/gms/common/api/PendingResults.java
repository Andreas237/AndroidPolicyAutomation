// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.*;

// Referenced classes of package com.google.android.gms.common.api:
//			Result, Status, PendingResult, OptionalPendingResult, 
//			GoogleApiClient

public final class PendingResults
{
	static final class zza extends zzaaf
	{

		public Result zzc(Status status)
		{
			if(status.getStatusCode() != zzazs.getStatus().getStatusCode())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #35  <Method int Status.getStatusCode()>
		//*   2    4:aload_0         
		//*   3    5:getfield        #24  <Field Result zzazs>
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
				return zzazs;
		//   12   29:aload_0         
		//   13   30:getfield        #24  <Field Result zzazs>
		//   14   33:areturn         
		}

		private final Result zzazs;

		public zza(Result result)
		{
			super(Looper.getMainLooper());
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method Looper Looper.getMainLooper()>
		//    2    4:invokespecial   #22  <Method void zzaaf(Looper)>
			zzazs = result;
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:putfield        #24  <Field Result zzazs>
		//    6   12:return          
		}
	}

	static final class zzb extends zzaaf
	{

		public Result zzc(Status status)
		{
			return zzazt;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Result zzazt>
		//    2    4:areturn         
		}

		private final Result zzazt;

		public zzb(GoogleApiClient googleapiclient, Result result)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void zzaaf(GoogleApiClient)>
			zzazt = result;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #18  <Field Result zzazt>
		//    6   10:return          
		}
	}

	static final class zzc extends zzaaf
	{

		public Result zzc(Status status)
		{
			throw new UnsupportedOperationException("Creating failed results is not supported");
		//    0    0:new             #16  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "Creating failed results is not supported">
		//    3    6:invokespecial   #21  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public zzc(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzaaf(GoogleApiClient)>
		//    3    5:return          
		}
	}


	private PendingResults()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static PendingResult canceledPendingResult()
	{
		zzabt zzabt1 = new zzabt(Looper.getMainLooper());
	//    0    0:new             #22  <Class zzabt>
	//    1    3:dup             
	//    2    4:invokestatic    #28  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #31  <Method void zzabt(Looper)>
	//    4   10:astore_0        
		zzabt1.cancel();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #34  <Method void zzabt.cancel()>
		return ((PendingResult) (zzabt1));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public static PendingResult canceledPendingResult(Result result)
	{
		zzac.zzb(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "Result must not be null">
	//    2    3:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(result.getStatus().getStatusCode() == 16)
	//*   4    7:aload_0         
	//*   5    8:invokeinterface #50  <Method Status Result.getStatus()>
	//*   6   13:invokevirtual   #56  <Method int Status.getStatusCode()>
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
		zzac.zzb(flag, "Status code must be CommonStatusCodes.CANCELED");
	//   14   28:iload_1         
	//   15   29:ldc1            #58  <String "Status code must be CommonStatusCodes.CANCELED">
	//   16   31:invokestatic    #61  <Method void zzac.zzb(boolean, Object)>
		result = ((Result) (new zza(result)));
	//   17   34:new             #6   <Class PendingResults$zza>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:invokespecial   #64  <Method void PendingResults$zza(Result)>
	//   21   42:astore_0        
		((zza) (result)).cancel();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #65  <Method void PendingResults$zza.cancel()>
		return ((PendingResult) (result));
	//   24   47:aload_0         
	//   25   48:areturn         
	}

	public static OptionalPendingResult immediatePendingResult(Result result)
	{
		zzac.zzb(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "Result must not be null">
	//    2    3:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzc zzc1 = new zzc(((GoogleApiClient) (null)));
	//    4    7:new             #12  <Class PendingResults$zzc>
	//    5   10:dup             
	//    6   11:aconst_null     
	//    7   12:invokespecial   #71  <Method void PendingResults$zzc(GoogleApiClient)>
	//    8   15:astore_1        
		zzc1.zzb(result);
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #73  <Method void PendingResults$zzc.zzb(Result)>
		return ((OptionalPendingResult) (new zzabk(((PendingResult) (zzc1)))));
	//   12   21:new             #75  <Class zzabk>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:invokespecial   #78  <Method void zzabk(PendingResult)>
	//   16   29:areturn         
	}

	public static PendingResult immediatePendingResult(Status status)
	{
		zzac.zzb(((Object) (status)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "Result must not be null">
	//    2    3:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzabt zzabt1 = new zzabt(Looper.getMainLooper());
	//    4    7:new             #22  <Class zzabt>
	//    5   10:dup             
	//    6   11:invokestatic    #28  <Method Looper Looper.getMainLooper()>
	//    7   14:invokespecial   #31  <Method void zzabt(Looper)>
	//    8   17:astore_1        
		zzabt1.zzb(((Result) (status)));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #81  <Method void zzabt.zzb(Result)>
		return ((PendingResult) (zzabt1));
	//   12   23:aload_1         
	//   13   24:areturn         
	}

	public static PendingResult zza(Result result, GoogleApiClient googleapiclient)
	{
		zzac.zzb(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "Result must not be null">
	//    2    3:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(!result.getStatus().isSuccess())
	//*   4    7:aload_0         
	//*   5    8:invokeinterface #50  <Method Status Result.getStatus()>
	//*   6   13:invokevirtual   #87  <Method boolean Status.isSuccess()>
	//*   7   16:ifne            24
			flag = true;
	//    8   19:iconst_1        
	//    9   20:istore_2        
		else
	//*  10   21:goto            26
			flag = false;
	//   11   24:iconst_0        
	//   12   25:istore_2        
		zzac.zzb(flag, "Status code must not be SUCCESS");
	//   13   26:iload_2         
	//   14   27:ldc1            #89  <String "Status code must not be SUCCESS">
	//   15   29:invokestatic    #61  <Method void zzac.zzb(boolean, Object)>
		googleapiclient = ((GoogleApiClient) (new zzb(googleapiclient, result)));
	//   16   32:new             #9   <Class PendingResults$zzb>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:invokespecial   #92  <Method void PendingResults$zzb(GoogleApiClient, Result)>
	//   21   41:astore_1        
		((zzb) (googleapiclient)).zzb(result);
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #93  <Method void PendingResults$zzb.zzb(Result)>
		return ((PendingResult) (googleapiclient));
	//   25   47:aload_1         
	//   26   48:areturn         
	}

	public static PendingResult zza(Status status, GoogleApiClient googleapiclient)
	{
		zzac.zzb(((Object) (status)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "Result must not be null">
	//    2    3:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		googleapiclient = ((GoogleApiClient) (new zzabt(googleapiclient)));
	//    4    7:new             #22  <Class zzabt>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:invokespecial   #96  <Method void zzabt(GoogleApiClient)>
	//    8   15:astore_1        
		((zzabt) (googleapiclient)).zzb(((Result) (status)));
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #81  <Method void zzabt.zzb(Result)>
		return ((PendingResult) (googleapiclient));
	//   12   21:aload_1         
	//   13   22:areturn         
	}

	public static OptionalPendingResult zzb(Result result, GoogleApiClient googleapiclient)
	{
		zzac.zzb(((Object) (result)), "Result must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "Result must not be null">
	//    2    3:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		googleapiclient = ((GoogleApiClient) (new zzc(googleapiclient)));
	//    4    7:new             #12  <Class PendingResults$zzc>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:invokespecial   #71  <Method void PendingResults$zzc(GoogleApiClient)>
	//    8   15:astore_1        
		((zzc) (googleapiclient)).zzb(result);
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #73  <Method void PendingResults$zzc.zzb(Result)>
		return ((OptionalPendingResult) (new zzabk(((PendingResult) (googleapiclient)))));
	//   12   21:new             #75  <Class zzabk>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:invokespecial   #78  <Method void zzabk(PendingResult)>
	//   16   29:areturn         
	}
}
