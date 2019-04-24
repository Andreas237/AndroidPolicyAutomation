// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			SimpleBooleanResult

public class Worker
	implements ChromeDevtoolsDomain
{

	public Worker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public JsonRpcResult canInspectWorkers(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		return ((JsonRpcResult) (new SimpleBooleanResult(true)));
	//    0    0:new             #16  <Class SimpleBooleanResult>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #19  <Method void SimpleBooleanResult(boolean)>
	//    4    8:areturn         
	}
}
