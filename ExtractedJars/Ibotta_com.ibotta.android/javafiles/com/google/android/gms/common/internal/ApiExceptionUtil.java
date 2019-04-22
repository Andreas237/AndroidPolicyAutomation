// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.*;

public class ApiExceptionUtil
{

	public ApiExceptionUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ApiException fromConnectionResult(ConnectionResult connectionresult)
	{
		return fromStatus(new Status(connectionresult.getErrorCode(), connectionresult.getErrorMessage(), connectionresult.getResolution()));
	//    0    0:new             #14  <Class Status>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method int ConnectionResult.getErrorCode()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #24  <Method String ConnectionResult.getErrorMessage()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #28  <Method android.app.PendingIntent ConnectionResult.getResolution()>
	//    8   16:invokespecial   #31  <Method void Status(int, String, android.app.PendingIntent)>
	//    9   19:invokestatic    #35  <Method ApiException fromStatus(Status)>
	//   10   22:areturn         
	}

	public static ApiException fromStatus(Status status)
	{
		if(status.hasResolution())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #41  <Method boolean Status.hasResolution()>
	//*   2    4:ifeq            16
			return ((ApiException) (new ResolvableApiException(status)));
	//    3    7:new             #43  <Class ResolvableApiException>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #46  <Method void ResolvableApiException(Status)>
	//    7   15:areturn         
		else
			return new ApiException(status);
	//    8   16:new             #48  <Class ApiException>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #49  <Method void ApiException(Status)>
	//   12   24:areturn         
	}
}
