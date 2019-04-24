// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.zzd;
import com.google.android.gms.fitness.result.DailyTotalResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapm, zzaog, zzaov

class zzapm$7 extends a
{

	protected DailyTotalResult zzY(Status status)
	{
		return DailyTotalResult.zza(status, zzaUS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field DataType zzaUS>
	//    3    5:invokestatic    #33  <Method DailyTotalResult DailyTotalResult.zza(Status, DataType)>
	//    4    8:areturn         
	}

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaog)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class zzaog>
	//    3    5:invokevirtual   #41  <Method void zza(zzaog)>
	//    4    8:return          
	}

	protected void zza(zzaog zzaog1)
		throws RemoteException
	{
		zzd zzd1 = new zzd(((zzaol) (new zzaol.zza() {

			public void zza(DailyTotalResult dailytotalresult)
				throws RemoteException
			{
				zzaUU.zzb(((Result) (dailytotalresult)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field zzapm$7 zzaUU>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #26  <Method void zzapm$7.zzb(Result)>
			//    4    8:return          
			}

			final zzapm._cls7 zzaUU;

			
			{
				zzaUU = zzapm._cls7.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzapm$7 zzaUU>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void zzaol$zza()>
			//    5    9:return          
			}
		}
)), zzaUS, zzaUT);
	//    0    0:new             #44  <Class zzd>
	//    1    3:dup             
	//    2    4:new             #12  <Class zzapm$7$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #47  <Method void zzapm$7$1(zzapm$7)>
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field DataType zzaUS>
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field boolean zzaUT>
	//   10   20:invokespecial   #50  <Method void zzd(zzaol, DataType, boolean)>
	//   11   23:astore_2        
		((zzaov)zzaog1.zzxD()).zza(zzd1);
	//   12   24:aload_1         
	//   13   25:invokevirtual   #54  <Method android.os.IInterface zzaog.zzxD()>
	//   14   28:checkcast       #56  <Class zzaov>
	//   15   31:aload_2         
	//   16   32:invokeinterface #59  <Method void zzaov.zza(zzd)>
	//   17   37:return          
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzY(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #63  <Method DailyTotalResult zzY(Status)>
	//    3    5:areturn         
	}

	final DataType zzaUS;
	final boolean zzaUT;

	zzapm$7(zzapm zzapm1, GoogleApiClient googleapiclient, DataType datatype, boolean flag)
	{
		zzaUS = datatype;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #20  <Field DataType zzaUS>
		zzaUT = flag;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #22  <Field boolean zzaUT>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #25  <Method void zzaog$zza(GoogleApiClient)>
	//    9   16:return          
	}
}
