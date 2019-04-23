// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult

public class StatusPendingResult extends BasePendingResult
{

	public StatusPendingResult(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void BasePendingResult(Looper)>
	//    3    5:return          
	}

	public StatusPendingResult(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void BasePendingResult(GoogleApiClient)>
	//    3    5:return          
	}

	protected Result createFailedResult(Status status)
	{
		return ((Result) (status));
	//    0    0:aload_1         
	//    1    1:areturn         
	}
}
