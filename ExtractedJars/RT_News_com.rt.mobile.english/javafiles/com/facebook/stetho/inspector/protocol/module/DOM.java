// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import org.json.JSONObject;

public class DOM
	implements ChromeDevtoolsDomain
{
	private static class Node
		implements JsonRpcResult
	{

		public String localName;
		public int nodeId;
		public String nodeName;
		public int nodeType;
		public String nodeValue;

		private Node()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}

	}


	public DOM()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public JsonRpcResult getDocument(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) (new Node()));
	//    0    0:new             #10  <Class DOM$Node>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #22  <Method void DOM$Node(DOM$1)>
	//    4    8:astore_1        
		jsonrpcpeer.nodeId = 1;
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:putfield        #26  <Field int DOM$Node.nodeId>
		jsonrpcpeer.nodeType = 1;
	//    8   14:aload_1         
	//    9   15:iconst_1        
	//   10   16:putfield        #29  <Field int DOM$Node.nodeType>
		jsonrpcpeer.nodeName = "";
	//   11   19:aload_1         
	//   12   20:ldc1            #31  <String "">
	//   13   22:putfield        #35  <Field String DOM$Node.nodeName>
		jsonrpcpeer.nodeValue = "";
	//   14   25:aload_1         
	//   15   26:ldc1            #31  <String "">
	//   16   28:putfield        #38  <Field String DOM$Node.nodeValue>
		return ((JsonRpcResult) (jsonrpcpeer));
	//   17   31:aload_1         
	//   18   32:areturn         
	}

	public void hideHighlight(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}
}
