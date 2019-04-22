// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Network

private static class Network$GetResponseBodyResponse
	implements JsonRpcResult
{

	public boolean base64Encoded;
	public String body;

	private Network$GetResponseBodyResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	Network$GetResponseBodyResponse(Network._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Network$GetResponseBodyResponse()>
	//    2    4:return          
	}
}
