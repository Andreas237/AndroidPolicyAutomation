// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.content.Intent;

// Referenced classes of package com.android.volley:
//			VolleyError, NetworkResponse

public class AuthFailureError extends VolleyError
{

	public AuthFailureError()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void VolleyError()>
	//    2    4:return          
	}

	public AuthFailureError(NetworkResponse networkresponse)
	{
		super(networkresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void VolleyError(NetworkResponse)>
	//    3    5:return          
	}

	public String getMessage()
	{
		if(mResolutionIntent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Intent mResolutionIntent>
	//*   2    4:ifnull          10
			return "User needs to (re)enter credentials.";
	//    3    7:ldc1            #20  <String "User needs to (re)enter credentials.">
	//    4    9:areturn         
		else
			return super.getMessage();
	//    5   10:aload_0         
	//    6   11:invokespecial   #22  <Method String VolleyError.getMessage()>
	//    7   14:areturn         
	}

	private Intent mResolutionIntent;
}
