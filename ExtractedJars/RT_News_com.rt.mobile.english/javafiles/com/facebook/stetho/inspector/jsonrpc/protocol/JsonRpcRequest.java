// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc.protocol;

import org.json.JSONObject;

public class JsonRpcRequest
{

	public JsonRpcRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public JsonRpcRequest(Long long1, String s, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		id = long1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Long id>
		method = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String method>
		params = jsonobject;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field JSONObject params>
	//   11   19:return          
	}

	public Long id;
	public String method;
	public JSONObject params;
}
