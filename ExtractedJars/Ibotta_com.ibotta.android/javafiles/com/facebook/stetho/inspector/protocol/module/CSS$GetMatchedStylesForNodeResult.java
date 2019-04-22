// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			CSS

private static class CSS$GetMatchedStylesForNodeResult
	implements JsonRpcResult
{

	public List inherited;
	public List matchedCSSRules;
	public List pseudoElements;

	private CSS$GetMatchedStylesForNodeResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	CSS$GetMatchedStylesForNodeResult(CSS._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void CSS$GetMatchedStylesForNodeResult()>
	//    2    4:return          
	}
}
