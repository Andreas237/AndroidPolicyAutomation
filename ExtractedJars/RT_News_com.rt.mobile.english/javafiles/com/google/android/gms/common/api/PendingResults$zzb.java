// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResults, Result, GoogleApiClient, Status

private static final class PendingResults$zzb extends BasePendingResult
{

	protected final Result createFailedResult(Status status)
	{
		return zzdm;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Result zzdm>
	//    2    4:areturn         
	}

	private final Result zzdm;

	public PendingResults$zzb(GoogleApiClient googleapiclient, Result result)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void BasePendingResult(GoogleApiClient)>
		zzdm = result;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Result zzdm>
	//    6   10:return          
	}
}
