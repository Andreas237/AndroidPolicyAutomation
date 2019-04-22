// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			CSS

private static class CSS$GetMatchedStylesForNodeRequest
	implements JsonRpcResult
{

	public Boolean excludeInherited;
	public Boolean excludePseudo;
	public int nodeId;

	private CSS$GetMatchedStylesForNodeRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
