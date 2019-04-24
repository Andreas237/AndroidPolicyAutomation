// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			NetworkResponse

public class VolleyError extends Exception
{

	public VolleyError()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Exception()>
		networkResponse = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field NetworkResponse networkResponse>
	//    5    9:return          
	}

	public VolleyError(NetworkResponse networkresponse)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Exception()>
		networkResponse = networkresponse;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field NetworkResponse networkResponse>
	//    5    9:return          
	}

	public VolleyError(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void Exception(String)>
		networkResponse = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #14  <Field NetworkResponse networkResponse>
	//    6   10:return          
	}

	public VolleyError(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void Exception(String, Throwable)>
		networkResponse = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #14  <Field NetworkResponse networkResponse>
	//    7   11:return          
	}

	public VolleyError(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void Exception(Throwable)>
		networkResponse = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #14  <Field NetworkResponse networkResponse>
	//    6   10:return          
	}

	public long getNetworkTimeMs()
	{
		return networkTimeMs;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long networkTimeMs>
	//    2    4:lreturn         
	}

	void setNetworkTimeMs(long l)
	{
		networkTimeMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #29  <Field long networkTimeMs>
	//    3    5:return          
	}

	public final NetworkResponse networkResponse;
	private long networkTimeMs;
}
