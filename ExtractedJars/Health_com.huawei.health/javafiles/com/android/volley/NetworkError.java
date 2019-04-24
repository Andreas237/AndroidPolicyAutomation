// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			VolleyError, NetworkResponse

public class NetworkError extends VolleyError
{

	public NetworkError()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void VolleyError()>
	//    2    4:return          
	}

	public NetworkError(NetworkResponse networkresponse)
	{
		super(networkresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void VolleyError(NetworkResponse)>
	//    3    5:return          
	}

	public NetworkError(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void VolleyError(Throwable)>
	//    3    5:return          
	}
}
