// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			Request, VolleyError, Response

public interface ResponseDelivery
{

	public abstract void postError(Request request, VolleyError volleyerror);

	public abstract void postResponse(Request request, Response response);

	public abstract void postResponse(Request request, Response response, Runnable runnable);
}
