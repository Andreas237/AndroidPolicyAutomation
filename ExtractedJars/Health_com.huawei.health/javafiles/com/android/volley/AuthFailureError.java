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

	public AuthFailureError(Intent intent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void VolleyError()>
		mResolutionIntent = intent;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Intent mResolutionIntent>
	//    5    9:return          
	}

	public AuthFailureError(NetworkResponse networkresponse)
	{
		super(networkresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void VolleyError(NetworkResponse)>
	//    3    5:return          
	}

	public AuthFailureError(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void VolleyError(String)>
	//    3    5:return          
	}

	public AuthFailureError(String s, Exception exception)
	{
		super(s, ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void VolleyError(String, Throwable)>
	//    4    6:return          
	}

	public String getMessage()
	{
		if(mResolutionIntent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Intent mResolutionIntent>
	//*   2    4:ifnull          10
			return "User needs to (re)enter credentials.";
	//    3    7:ldc1            #28  <String "User needs to (re)enter credentials.">
	//    4    9:areturn         
		else
			return super.getMessage();
	//    5   10:aload_0         
	//    6   11:invokespecial   #30  <Method String VolleyError.getMessage()>
	//    7   14:areturn         
	}

	public Intent getResolutionIntent()
	{
		return mResolutionIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Intent mResolutionIntent>
	//    2    4:areturn         
	}

	private Intent mResolutionIntent;
}
