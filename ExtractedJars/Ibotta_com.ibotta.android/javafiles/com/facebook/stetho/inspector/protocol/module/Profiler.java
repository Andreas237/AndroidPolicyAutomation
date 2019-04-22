// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class Profiler
	implements ChromeDevtoolsDomain
{
	private static class ProfileHeader
	{

		String title;
		String typeId;
		int uid;

		private ProfileHeader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ProfileHeaderResponse
		implements JsonRpcResult
	{

		public List headers;

		private ProfileHeaderResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}


	public Profiler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public JsonRpcResult getProfileHeaders(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) (new ProfileHeaderResponse()));
	//    0    0:new             #13  <Class Profiler$ProfileHeaderResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #29  <Method void Profiler$ProfileHeaderResponse(Profiler$1)>
	//    4    8:astore_1        
		jsonrpcpeer.headers = Collections.emptyList();
	//    5    9:aload_1         
	//    6   10:invokestatic    #35  <Method List Collections.emptyList()>
	//    7   13:putfield        #39  <Field List Profiler$ProfileHeaderResponse.headers>
		return ((JsonRpcResult) (jsonrpcpeer));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public void setSamplingInterval(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}
}
