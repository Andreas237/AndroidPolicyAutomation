// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.zzzx;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResults, GoogleApiClient, Status, Result

private static final class PendingResults$zzc extends zzzx
{

	protected Result zzc(Status status)
	{
		throw new UnsupportedOperationException("Creating failed results is not supported");
	//    0    0:new             #16  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Creating failed results is not supported">
	//    3    6:invokespecial   #21  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public PendingResults$zzc(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void zzzx(GoogleApiClient)>
	//    3    5:return          
	}
}
