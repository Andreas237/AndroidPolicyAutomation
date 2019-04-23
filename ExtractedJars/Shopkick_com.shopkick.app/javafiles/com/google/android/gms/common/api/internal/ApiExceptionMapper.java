// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			StatusExceptionMapper

public class ApiExceptionMapper
	implements StatusExceptionMapper
{

	public ApiExceptionMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Exception getException(Status status)
	{
		return ((Exception) (ApiExceptionUtil.fromStatus(status)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method com.google.android.gms.common.api.ApiException ApiExceptionUtil.fromStatus(Status)>
	//    2    4:areturn         
	}
}
