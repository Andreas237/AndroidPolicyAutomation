// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//			ProxyRequest, ProxyResponse

public interface ProxyApi
{
	public static interface ProxyResult
		extends Result
	{

		public abstract ProxyResponse getResponse();
	}


	public abstract PendingResult performProxyRequest(GoogleApiClient googleapiclient, ProxyRequest proxyrequest);
}
