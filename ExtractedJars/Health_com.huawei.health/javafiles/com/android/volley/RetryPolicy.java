// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			VolleyError

public interface RetryPolicy
{

	public abstract int getCurrentRetryCount();

	public abstract int getCurrentTimeout();

	public abstract void retry(VolleyError volleyerror)
		throws VolleyError;
}
