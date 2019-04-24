// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.*;

public class ApiExceptionUtil
{

	public ApiExceptionUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static ApiException fromStatus(Status status)
	{
		if(status.hasResolution())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #18  <Method boolean Status.hasResolution()>
	//*   2    4:ifeq            16
			return ((ApiException) (new ResolvableApiException(status)));
	//    3    7:new             #20  <Class ResolvableApiException>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #23  <Method void ResolvableApiException(Status)>
	//    7   15:areturn         
		else
			return new ApiException(status);
	//    8   16:new             #25  <Class ApiException>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #26  <Method void ApiException(Status)>
	//   12   24:areturn         
	}
}
