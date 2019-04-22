// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.EmptyResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector:
//			MethodDispatcher

private static class MethodDispatcher$MethodDispatchHelper
{

	public JSONObject invoke(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws InvocationTargetException, IllegalAccessException, JSONException, JsonRpcException
	{
		jsonrpcpeer = ((JsonRpcPeer) (mMethod.invoke(((Object) (mInstance)), new Object[] {
			jsonrpcpeer, jsonobject
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Method mMethod>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ChromeDevtoolsDomain mInstance>
	//    4    8:iconst_2        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
	//   15   23:astore_1        
		if(jsonrpcpeer != null && !(jsonrpcpeer instanceof EmptyResult))
	//*  16   24:aload_1         
	//*  17   25:ifnull          57
	//*  18   28:aload_1         
	//*  19   29:instanceof      #43  <Class EmptyResult>
	//*  20   32:ifeq            38
	//*  21   35:goto            57
		{
			jsonrpcpeer = ((JsonRpcPeer) ((JsonRpcResult)jsonrpcpeer));
	//   22   38:aload_1         
	//   23   39:checkcast       #45  <Class JsonRpcResult>
	//   24   42:astore_1        
			return (JSONObject)mObjectMapper.convertValue(((Object) (jsonrpcpeer)), org/json/JSONObject);
	//   25   43:aload_0         
	//   26   44:getfield        #20  <Field ObjectMapper mObjectMapper>
	//   27   47:aload_1         
	//   28   48:ldc1            #47  <Class JSONObject>
	//   29   50:invokevirtual   #53  <Method Object ObjectMapper.convertValue(Object, Class)>
	//   30   53:checkcast       #47  <Class JSONObject>
	//   31   56:areturn         
		} else
		{
			return new JSONObject();
	//   32   57:new             #47  <Class JSONObject>
	//   33   60:dup             
	//   34   61:invokespecial   #54  <Method void JSONObject()>
	//   35   64:areturn         
		}
	}

	private final ChromeDevtoolsDomain mInstance;
	private final Method mMethod;
	private final ObjectMapper mObjectMapper;

	public MethodDispatcher$MethodDispatchHelper(ObjectMapper objectmapper, ChromeDevtoolsDomain chromedevtoolsdomain, Method method)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mObjectMapper = objectmapper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ObjectMapper mObjectMapper>
		mInstance = chromedevtoolsdomain;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ChromeDevtoolsDomain mInstance>
		mMethod = method;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Method mMethod>
	//   11   19:return          
	}
}
