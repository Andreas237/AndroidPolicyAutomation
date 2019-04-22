// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//			Batch, BatchResultToken, GoogleApiClient, PendingResult

public static final class Batch$Builder
{

	public final BatchResultToken add(PendingResult pendingresult)
	{
		BatchResultToken batchresulttoken = new BatchResultToken(zzci.size());
	//    0    0:new             #29  <Class BatchResultToken>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field List zzci>
	//    4    8:invokeinterface #35  <Method int List.size()>
	//    5   13:invokespecial   #38  <Method void BatchResultToken(int)>
	//    6   16:astore_2        
		zzci.add(((Object) (pendingresult)));
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field List zzci>
	//    9   21:aload_1         
	//   10   22:invokeinterface #41  <Method boolean List.add(Object)>
	//   11   27:pop             
		return batchresulttoken;
	//   12   28:aload_2         
	//   13   29:areturn         
	}

	public final Batch build()
	{
		return new Batch(zzci, zzcj, ((zza) (null)));
	//    0    0:new             #6   <Class Batch>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field List zzci>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field GoogleApiClient zzcj>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #48  <Method void Batch(List, GoogleApiClient, zza)>
	//    8   16:areturn         
	}

	private List zzci;
	private GoogleApiClient zzcj;

	public Batch$Builder(GoogleApiClient googleapiclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzci = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:putfield        #22  <Field List zzci>
		zzcj = googleapiclient;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #24  <Field GoogleApiClient zzcj>
	//   10   20:return          
	}
}
