// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc.protocol;

import org.json.JSONObject;

public class JsonRpcEvent
{

	public JsonRpcEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public JsonRpcEvent(String s, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		method = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String method>
		params = jsonobject;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field JSONObject params>
	//    8   14:return          
	}

	public String method;
	public JSONObject params;
}
