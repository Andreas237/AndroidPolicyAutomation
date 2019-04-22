// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.EmptyResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.ObjectMapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public class MethodDispatcher
{
	private static class MethodDispatchHelper
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

		public MethodDispatchHelper(ObjectMapper objectmapper, ChromeDevtoolsDomain chromedevtoolsdomain, Method method)
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


	public MethodDispatcher(ObjectMapper objectmapper, Iterable iterable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mObjectMapper = objectmapper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field ObjectMapper mObjectMapper>
		mDomainHandlers = iterable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Iterable mDomainHandlers>
	//    8   14:return          
	}

	private static Map buildDispatchTable(ObjectMapper objectmapper, Iterable iterable)
	{
		Util.throwIfNull(((Object) (objectmapper)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		HashMap hashmap = new HashMap();
	//    3    5:new             #41  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void HashMap()>
	//    6   12:astore          4
		for(iterable = ((Iterable) (((Iterable)Util.throwIfNull(((Object) (iterable)))).iterator())); ((Iterator) (iterable)).hasNext();)
	//*   7   14:aload_1         
	//*   8   15:invokestatic    #39  <Method Object Util.throwIfNull(Object)>
	//*   9   18:checkcast       #44  <Class Iterable>
	//*  10   21:invokeinterface #48  <Method Iterator Iterable.iterator()>
	//*  11   26:astore_1        
	//*  12   27:aload_1         
	//*  13   28:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  14   33:ifeq            163
		{
			ChromeDevtoolsDomain chromedevtoolsdomain = (ChromeDevtoolsDomain)((Iterator) (iterable)).next();
	//   15   36:aload_1         
	//   16   37:invokeinterface #58  <Method Object Iterator.next()>
	//   17   42:checkcast       #60  <Class ChromeDevtoolsDomain>
	//   18   45:astore          5
			Class class1 = ((Object) (chromedevtoolsdomain)).getClass();
	//   19   47:aload           5
	//   20   49:invokevirtual   #64  <Method Class Object.getClass()>
	//   21   52:astore          7
			String s = class1.getSimpleName();
	//   22   54:aload           7
	//   23   56:invokevirtual   #70  <Method String Class.getSimpleName()>
	//   24   59:astore          6
			Method amethod[] = class1.getDeclaredMethods();
	//   25   61:aload           7
	//   26   63:invokevirtual   #74  <Method Method[] Class.getDeclaredMethods()>
	//   27   66:astore          7
			int j = amethod.length;
	//   28   68:aload           7
	//   29   70:arraylength     
	//   30   71:istore_3        
			int i = 0;
	//   31   72:iconst_0        
	//   32   73:istore_2        
			while(i < j) 
	//*  33   74:iload_2         
	//*  34   75:iload_3         
	//*  35   76:icmpge          27
			{
				Method method = amethod[i];
	//   36   79:aload           7
	//   37   81:iload_2         
	//   38   82:aaload          
	//   39   83:astore          8
				if(isDevtoolsMethod(method))
	//*  40   85:aload           8
	//*  41   87:invokestatic    #78  <Method boolean isDevtoolsMethod(Method)>
	//*  42   90:ifeq            156
				{
					MethodDispatchHelper methoddispatchhelper = new MethodDispatchHelper(objectmapper, chromedevtoolsdomain, method);
	//   43   93:new             #6   <Class MethodDispatcher$MethodDispatchHelper>
	//   44   96:dup             
	//   45   97:aload_0         
	//   46   98:aload           5
	//   47  100:aload           8
	//   48  102:invokespecial   #81  <Method void MethodDispatcher$MethodDispatchHelper(ObjectMapper, ChromeDevtoolsDomain, Method)>
	//   49  105:astore          9
					StringBuilder stringbuilder = new StringBuilder();
	//   50  107:new             #83  <Class StringBuilder>
	//   51  110:dup             
	//   52  111:invokespecial   #84  <Method void StringBuilder()>
	//   53  114:astore          10
					stringbuilder.append(s);
	//   54  116:aload           10
	//   55  118:aload           6
	//   56  120:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   57  123:pop             
					stringbuilder.append(".");
	//   58  124:aload           10
	//   59  126:ldc1            #90  <String ".">
	//   60  128:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   61  131:pop             
					stringbuilder.append(method.getName());
	//   62  132:aload           10
	//   63  134:aload           8
	//   64  136:invokevirtual   #95  <Method String Method.getName()>
	//   65  139:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   66  142:pop             
					hashmap.put(((Object) (stringbuilder.toString())), ((Object) (methoddispatchhelper)));
	//   67  143:aload           4
	//   68  145:aload           10
	//   69  147:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   70  150:aload           9
	//   71  152:invokevirtual   #102 <Method Object HashMap.put(Object, Object)>
	//   72  155:pop             
				}
				i++;
	//   73  156:iload_2         
	//   74  157:iconst_1        
	//   75  158:iadd            
	//   76  159:istore_2        
			}
		}

	//*  77  160:goto            74
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   78  163:aload           4
	//   79  165:invokestatic    #108 <Method Map Collections.unmodifiableMap(Map)>
	//   80  168:areturn         
	}

	private MethodDispatchHelper findMethodDispatcher(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mMethods == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #113 <Field Map mMethods>
	//*   4    6:ifnonnull       24
			mMethods = buildDispatchTable(mObjectMapper, mDomainHandlers);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #26  <Field ObjectMapper mObjectMapper>
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field Iterable mDomainHandlers>
	//   10   18:invokestatic    #115 <Method Map buildDispatchTable(ObjectMapper, Iterable)>
	//   11   21:putfield        #113 <Field Map mMethods>
		s = ((String) ((MethodDispatchHelper)mMethods.get(((Object) (s)))));
	//   12   24:aload_0         
	//   13   25:getfield        #113 <Field Map mMethods>
	//   14   28:aload_1         
	//   15   29:invokeinterface #120 <Method Object Map.get(Object)>
	//   16   34:checkcast       #6   <Class MethodDispatcher$MethodDispatchHelper>
	//   17   37:astore_1        
		this;
	//   18   38:aload_0         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return ((MethodDispatchHelper) (s));
	//   20   40:aload_1         
	//   21   41:areturn         
		s;
	//   22   42:astore_1        
	//*  23   43:aload_0         
		throw s;
	//   24   44:monitorexit     
	//   25   45:aload_1         
	//   26   46:athrow          
	}

	private static boolean isDevtoolsMethod(Method method)
		throws IllegalArgumentException
	{
		if(!method.isAnnotationPresent(com/facebook/stetho/inspector/protocol/ChromeDevtoolsMethod))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #124 <Class ChromeDevtoolsMethod>
	//*   2    3:invokevirtual   #128 <Method boolean Method.isAnnotationPresent(Class)>
	//*   3    6:ifne            11
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		Class aclass[] = method.getParameterTypes();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #132 <Method Class[] Method.getParameterTypes()>
	//    8   15:astore_2        
		Object obj = ((Object) (new StringBuilder()));
	//    9   16:new             #83  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #84  <Method void StringBuilder()>
	//   12   23:astore_3        
		((StringBuilder) (obj)).append(method.getDeclaringClass().getSimpleName());
	//   13   24:aload_3         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #135 <Method Class Method.getDeclaringClass()>
	//   16   29:invokevirtual   #70  <Method String Class.getSimpleName()>
	//   17   32:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		((StringBuilder) (obj)).append(".");
	//   19   36:aload_3         
	//   20   37:ldc1            #90  <String ".">
	//   21   39:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		((StringBuilder) (obj)).append(method.getName());
	//   23   43:aload_3         
	//   24   44:aload_0         
	//   25   45:invokevirtual   #95  <Method String Method.getName()>
	//   26   48:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   52:aload_3         
	//   29   53:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   30   56:astore_3        
		boolean flag;
		if(aclass.length == 2)
	//*  31   57:aload_2         
	//*  32   58:arraylength     
	//*  33   59:iconst_2        
	//*  34   60:icmpne          68
			flag = true;
	//   35   63:iconst_1        
	//   36   64:istore_1        
		else
	//*  37   65:goto            70
			flag = false;
	//   38   68:iconst_0        
	//   39   69:istore_1        
		Util.throwIfNot(flag, "%s: expected 2 args, got %s", new Object[] {
			obj, Integer.valueOf(aclass.length)
		});
	//   40   70:iload_1         
	//   41   71:ldc1            #137 <String "%s: expected 2 args, got %s">
	//   42   73:iconst_2        
	//   43   74:anewarray       Object[]
	//   44   77:dup             
	//   45   78:iconst_0        
	//   46   79:aload_3         
	//   47   80:aastore         
	//   48   81:dup             
	//   49   82:iconst_1        
	//   50   83:aload_2         
	//   51   84:arraylength     
	//   52   85:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//   53   88:aastore         
	//   54   89:invokestatic    #147 <Method void Util.throwIfNot(boolean, String, Object[])>
		Util.throwIfNot(((Object) (aclass[0])).equals(com/facebook/stetho/inspector/jsonrpc/JsonRpcPeer), "%s: expected 1st arg of JsonRpcPeer, got %s", new Object[] {
			obj, aclass[0].getName()
		});
	//   55   92:aload_2         
	//   56   93:iconst_0        
	//   57   94:aaload          
	//   58   95:ldc1            #149 <Class JsonRpcPeer>
	//   59   97:invokevirtual   #153 <Method boolean Object.equals(Object)>
	//   60  100:ldc1            #155 <String "%s: expected 1st arg of JsonRpcPeer, got %s">
	//   61  102:iconst_2        
	//   62  103:anewarray       Object[]
	//   63  106:dup             
	//   64  107:iconst_0        
	//   65  108:aload_3         
	//   66  109:aastore         
	//   67  110:dup             
	//   68  111:iconst_1        
	//   69  112:aload_2         
	//   70  113:iconst_0        
	//   71  114:aaload          
	//   72  115:invokevirtual   #156 <Method String Class.getName()>
	//   73  118:aastore         
	//   74  119:invokestatic    #147 <Method void Util.throwIfNot(boolean, String, Object[])>
		Util.throwIfNot(((Object) (aclass[1])).equals(org/json/JSONObject), "%s: expected 2nd arg of JSONObject, got %s", new Object[] {
			obj, aclass[1].getName()
		});
	//   75  122:aload_2         
	//   76  123:iconst_1        
	//   77  124:aaload          
	//   78  125:ldc1            #158 <Class JSONObject>
	//   79  127:invokevirtual   #153 <Method boolean Object.equals(Object)>
	//   80  130:ldc1            #160 <String "%s: expected 2nd arg of JSONObject, got %s">
	//   81  132:iconst_2        
	//   82  133:anewarray       Object[]
	//   83  136:dup             
	//   84  137:iconst_0        
	//   85  138:aload_3         
	//   86  139:aastore         
	//   87  140:dup             
	//   88  141:iconst_1        
	//   89  142:aload_2         
	//   90  143:iconst_1        
	//   91  144:aaload          
	//   92  145:invokevirtual   #156 <Method String Class.getName()>
	//   93  148:aastore         
	//   94  149:invokestatic    #147 <Method void Util.throwIfNot(boolean, String, Object[])>
		method = ((Method) (method.getReturnType()));
	//   95  152:aload_0         
	//   96  153:invokevirtual   #163 <Method Class Method.getReturnType()>
	//   97  156:astore_0        
		if(!((Object) (method)).equals(((Object) (Void.TYPE))))
	//*  98  157:aload_0         
	//*  99  158:getstatic       #169 <Field Class Void.TYPE>
	//* 100  161:invokevirtual   #153 <Method boolean Object.equals(Object)>
	//* 101  164:ifne            193
			Util.throwIfNot(((Class) (com/facebook/stetho/inspector/jsonrpc/JsonRpcResult)).isAssignableFrom(((Class) (method))), "%s: expected JsonRpcResult return type, got %s", new Object[] {
				obj, ((Class) (method)).getName()
			});
	//  102  167:ldc1            #171 <Class JsonRpcResult>
	//  103  169:aload_0         
	//  104  170:invokevirtual   #174 <Method boolean Class.isAssignableFrom(Class)>
	//  105  173:ldc1            #176 <String "%s: expected JsonRpcResult return type, got %s">
	//  106  175:iconst_2        
	//  107  176:anewarray       Object[]
	//  108  179:dup             
	//  109  180:iconst_0        
	//  110  181:aload_3         
	//  111  182:aastore         
	//  112  183:dup             
	//  113  184:iconst_1        
	//  114  185:aload_0         
	//  115  186:invokevirtual   #156 <Method String Class.getName()>
	//  116  189:aastore         
	//  117  190:invokestatic    #147 <Method void Util.throwIfNot(boolean, String, Object[])>
		return true;
	//  118  193:iconst_1        
	//  119  194:ireturn         
	}

	public JSONObject dispatch(JsonRpcPeer jsonrpcpeer, String s, JSONObject jsonobject)
		throws JsonRpcException
	{
		MethodDispatchHelper methoddispatchhelper = findMethodDispatcher(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #190 <Method MethodDispatcher$MethodDispatchHelper findMethodDispatcher(String)>
	//    3    5:astore          4
		if(methoddispatchhelper != null)
	//*   4    7:aload           4
	//*   5    9:ifnull          73
		{
			try
			{
				jsonrpcpeer = ((JsonRpcPeer) (methoddispatchhelper.invoke(jsonrpcpeer, jsonobject)));
	//    6   12:aload           4
	//    7   14:aload_1         
	//    8   15:aload_3         
	//    9   16:invokevirtual   #194 <Method JSONObject MethodDispatcher$MethodDispatchHelper.invoke(JsonRpcPeer, JSONObject)>
	//   10   19:astore_1        
			}
	//*  11   20:aload_1         
	//*  12   21:areturn         
	//*  13   22:astore_1        
	//*  14   23:new             #181 <Class JsonRpcException>
	//*  15   26:dup             
	//*  16   27:new             #196 <Class JsonRpcError>
	//*  17   30:dup             
	//*  18   31:getstatic       #202 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.INTERNAL_ERROR>
	//*  19   34:aload_1         
	//*  20   35:invokevirtual   #203 <Method String JSONException.toString()>
	//*  21   38:aconst_null     
	//*  22   39:invokespecial   #206 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//*  23   42:invokespecial   #209 <Method void JsonRpcException(JsonRpcError)>
	//*  24   45:athrow          
	//*  25   46:astore_1        
	//*  26   47:new             #211 <Class RuntimeException>
	//*  27   50:dup             
	//*  28   51:aload_1         
	//*  29   52:invokespecial   #214 <Method void RuntimeException(Throwable)>
	//*  30   55:athrow          
			// Misplaced declaration of an exception variable
			catch(JsonRpcPeer jsonrpcpeer)
	//*  31   56:astore_1        
			{
				jsonrpcpeer = ((JsonRpcPeer) (((InvocationTargetException) (jsonrpcpeer)).getCause()));
	//   32   57:aload_1         
	//   33   58:invokevirtual   #218 <Method Throwable InvocationTargetException.getCause()>
	//   34   61:astore_1        
				ExceptionUtil.propagateIfInstanceOf(((Throwable) (jsonrpcpeer)), com/facebook/stetho/inspector/jsonrpc/JsonRpcException);
	//   35   62:aload_1         
	//   36   63:ldc1            #181 <Class JsonRpcException>
	//   37   65:invokestatic    #224 <Method void ExceptionUtil.propagateIfInstanceOf(Throwable, Class)>
				throw ExceptionUtil.propagate(((Throwable) (jsonrpcpeer)));
	//   38   68:aload_1         
	//   39   69:invokestatic    #228 <Method RuntimeException ExceptionUtil.propagate(Throwable)>
	//   40   72:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(JsonRpcPeer jsonrpcpeer)
			{
				throw new RuntimeException(((Throwable) (jsonrpcpeer)));
			}
			// Misplaced declaration of an exception variable
			catch(JsonRpcPeer jsonrpcpeer)
			{
				throw new JsonRpcException(new JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.INTERNAL_ERROR, ((JSONException) (jsonrpcpeer)).toString(), ((JSONObject) (null))));
			}
			return ((JSONObject) (jsonrpcpeer));
		} else
		{
			jsonrpcpeer = ((JsonRpcPeer) (com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.METHOD_NOT_FOUND));
	//   41   73:getstatic       #231 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.METHOD_NOT_FOUND>
	//   42   76:astore_1        
			jsonobject = ((JSONObject) (new StringBuilder()));
	//   43   77:new             #83  <Class StringBuilder>
	//   44   80:dup             
	//   45   81:invokespecial   #84  <Method void StringBuilder()>
	//   46   84:astore_3        
			((StringBuilder) (jsonobject)).append("Not implemented: ");
	//   47   85:aload_3         
	//   48   86:ldc1            #233 <String "Not implemented: ">
	//   49   88:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   50   91:pop             
			((StringBuilder) (jsonobject)).append(s);
	//   51   92:aload_3         
	//   52   93:aload_2         
	//   53   94:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   54   97:pop             
			throw new JsonRpcException(new JsonRpcError(((com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode) (jsonrpcpeer)), ((StringBuilder) (jsonobject)).toString(), ((JSONObject) (null))));
	//   55   98:new             #181 <Class JsonRpcException>
	//   56  101:dup             
	//   57  102:new             #196 <Class JsonRpcError>
	//   58  105:dup             
	//   59  106:aload_1         
	//   60  107:aload_3         
	//   61  108:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   62  111:aconst_null     
	//   63  112:invokespecial   #206 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//   64  115:invokespecial   #209 <Method void JsonRpcException(JsonRpcError)>
	//   65  118:athrow          
		}
	}

	private final Iterable mDomainHandlers;
	private Map mMethods;
	private final ObjectMapper mObjectMapper;
}
