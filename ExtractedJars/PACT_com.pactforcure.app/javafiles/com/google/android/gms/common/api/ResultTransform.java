// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.zzabh;

// Referenced classes of package com.google.android.gms.common.api:
//			Status, PendingResult, Result

public abstract class ResultTransform
{

	public ResultTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public final PendingResult createFailedResult(Status status)
	{
		return ((PendingResult) (new zzabh(status)));
	//    0    0:new             #15  <Class zzabh>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void zzabh(Status)>
	//    4    8:areturn         
	}

	public Status onFailure(Status status)
	{
		return status;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public abstract PendingResult onSuccess(Result result);
}
