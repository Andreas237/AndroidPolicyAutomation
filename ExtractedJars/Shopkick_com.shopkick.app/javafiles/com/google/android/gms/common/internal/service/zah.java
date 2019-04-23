// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			zag

abstract class zah extends zag
{

	public zah(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void zag(GoogleApiClient)>
	//    3    5:return          
	}

	public Result createFailedResult(Status status)
	{
		return ((Result) (status));
	//    0    0:aload_1         
	//    1    1:areturn         
	}
}
