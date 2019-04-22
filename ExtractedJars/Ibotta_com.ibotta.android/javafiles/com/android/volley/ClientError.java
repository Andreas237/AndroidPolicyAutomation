// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			ServerError, NetworkResponse

public class ClientError extends ServerError
{

	public ClientError()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ServerError()>
	//    2    4:return          
	}

	public ClientError(NetworkResponse networkresponse)
	{
		super(networkresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ServerError(NetworkResponse)>
	//    3    5:return          
	}
}
