// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import com.facebook.stetho.server.SocketLike;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpRequest, LightHttpResponse

public interface HttpHandler
{

	public abstract boolean handleRequest(SocketLike socketlike, LightHttpRequest lighthttprequest, LightHttpResponse lighthttpresponse)
		throws IOException;
}
