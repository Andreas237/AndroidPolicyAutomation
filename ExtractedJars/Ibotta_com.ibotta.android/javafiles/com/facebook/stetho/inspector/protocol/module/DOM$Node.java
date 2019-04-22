// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

private static class DOM$Node
	implements JsonRpcResult
{

	public List attributes;
	public Integer childNodeCount;
	public List children;
	public String localName;
	public int nodeId;
	public String nodeName;
	public NodeType nodeType;
	public String nodeValue;

	private DOM$Node()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	DOM$Node(DOM._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void DOM$Node()>
	//    2    4:return          
	}
}
