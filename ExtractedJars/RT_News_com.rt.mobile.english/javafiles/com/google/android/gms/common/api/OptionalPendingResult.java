// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//			PendingResult, Result

public abstract class OptionalPendingResult extends PendingResult
{

	public OptionalPendingResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void PendingResult()>
	//    2    4:return          
	}

	public abstract Result get();

	public abstract boolean isDone();
}
