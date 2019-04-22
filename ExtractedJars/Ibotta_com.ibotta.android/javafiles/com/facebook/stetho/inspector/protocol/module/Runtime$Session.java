// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.json.ObjectMapper;
import java.lang.reflect.*;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Runtime

private static class Runtime$Session
{

	private List arrayToList(Object obj)
	{
		Object obj1 = ((Object) (obj.getClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method Class Object.getClass()>
	//    2    4:astore          4
		if(((Class) (obj1)).isArray())
	//*   3    6:aload           4
	//*   4    8:invokevirtual   #43  <Method boolean Class.isArray()>
	//*   5   11:ifeq            78
		{
			if(!((Class) (obj1)).getComponentType().isPrimitive())
	//*   6   14:aload           4
	//*   7   16:invokevirtual   #46  <Method Class Class.getComponentType()>
	//*   8   19:invokevirtual   #49  <Method boolean Class.isPrimitive()>
	//*   9   22:ifne            33
				return Arrays.asList((Object[])obj);
	//   10   25:aload_1         
	//   11   26:checkcast       #51  <Class Object[]>
	//   12   29:invokestatic    #57  <Method List Arrays.asList(Object[])>
	//   13   32:areturn         
			int j = Array.getLength(obj);
	//   14   33:aload_1         
	//   15   34:invokestatic    #63  <Method int Array.getLength(Object)>
	//   16   37:istore_3        
			obj1 = ((Object) (new ArrayList(j)));
	//   17   38:new             #65  <Class ArrayList>
	//   18   41:dup             
	//   19   42:iload_3         
	//   20   43:invokespecial   #68  <Method void ArrayList(int)>
	//   21   46:astore          4
			for(int i = 0; i < j; i++)
	//*  22   48:iconst_0        
	//*  23   49:istore_2        
	//*  24   50:iload_2         
	//*  25   51:iload_3         
	//*  26   52:icmpge          75
				((List) (obj1)).add(Array.get(obj, i));
	//   27   55:aload           4
	//   28   57:aload_1         
	//   29   58:iload_2         
	//   30   59:invokestatic    #72  <Method Object Array.get(Object, int)>
	//   31   62:invokeinterface #78  <Method boolean List.add(Object)>
	//   32   67:pop             

	//   33   68:iload_2         
	//   34   69:iconst_1        
	//   35   70:iadd            
	//   36   71:istore_2        
	//*  37   72:goto            50
			return ((List) (obj1));
	//   38   75:aload           4
	//   39   77:areturn         
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//   40   78:new             #80  <Class StringBuilder>
	//   41   81:dup             
	//   42   82:invokespecial   #81  <Method void StringBuilder()>
	//   43   85:astore_1        
			((StringBuilder) (obj)).append("Argument must be an array.  Was ");
	//   44   86:aload_1         
	//   45   87:ldc1            #83  <String "Argument must be an array.  Was ">
	//   46   89:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
			((StringBuilder) (obj)).append(obj1);
	//   48   93:aload_1         
	//   49   94:aload           4
	//   50   96:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   51   99:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   52  100:new             #92  <Class IllegalArgumentException>
	//   53  103:dup             
	//   54  104:aload_1         
	//   55  105:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   56  108:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   57  111:athrow          
		}
	}

	private Response buildExceptionResponse(Object obj)
	{
		Response response = new Response(((Runtime._cls1) (null)));
	//    0    0:new             #105 <Class Runtime$EvaluateResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #107 <Method void Runtime$EvaluateResponse(Runtime$1)>
	//    4    8:astore_2        
		response.wasThrown = true;
	//    5    9:aload_2         
	//    6   10:iconst_1        
	//    7   11:putfield        #111 <Field boolean Runtime$EvaluateResponse.wasThrown>
		response.result = objectForRemote(obj);
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
	//   12   20:putfield        #119 <Field Runtime$RemoteObject Runtime$EvaluateResponse.result>
		response.exceptionDetails = new nDetails(((Runtime._cls1) (null)));
	//   13   23:aload_2         
	//   14   24:new             #121 <Class Runtime$ExceptionDetails>
	//   15   27:dup             
	//   16   28:aconst_null     
	//   17   29:invokespecial   #122 <Method void Runtime$ExceptionDetails(Runtime$1)>
	//   18   32:putfield        #126 <Field Runtime$ExceptionDetails Runtime$EvaluateResponse.exceptionDetails>
		response.exceptionDetails.text = obj.toString();
	//   19   35:aload_2         
	//   20   36:getfield        #126 <Field Runtime$ExceptionDetails Runtime$EvaluateResponse.exceptionDetails>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #127 <Method String Object.toString()>
	//   23   43:putfield        #131 <Field String Runtime$ExceptionDetails.text>
		return response;
	//   24   46:aload_2         
	//   25   47:areturn         
	}

	private Response buildNormalResponse(Object obj)
	{
		Response response = new Response(((Runtime._cls1) (null)));
	//    0    0:new             #105 <Class Runtime$EvaluateResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #107 <Method void Runtime$EvaluateResponse(Runtime$1)>
	//    4    8:astore_2        
		response.wasThrown = false;
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:putfield        #111 <Field boolean Runtime$EvaluateResponse.wasThrown>
		response.result = objectForRemote(obj);
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
	//   12   20:putfield        #119 <Field Runtime$RemoteObject Runtime$EvaluateResponse.result>
		return response;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	private rtiesResponse getPropertiesForIterable(Iterable iterable, boolean flag)
	{
		rtiesResponse rtiesresponse = new rtiesResponse(((Runtime._cls1) (null)));
	//    0    0:new             #136 <Class Runtime$GetPropertiesResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #137 <Method void Runtime$GetPropertiesResponse(Runtime$1)>
	//    4    8:astore          5
		ArrayList arraylist = new ArrayList();
	//    5   10:new             #65  <Class ArrayList>
	//    6   13:dup             
	//    7   14:invokespecial   #138 <Method void ArrayList()>
	//    8   17:astore          6
		Iterator iterator = iterable.iterator();
	//    9   19:aload_1         
	//   10   20:invokeinterface #144 <Method Iterator Iterable.iterator()>
	//   11   25:astore          7
		int i = 0;
	//   12   27:iconst_0        
	//   13   28:istore_3        
		Descriptor descriptor;
		for(; iterator.hasNext(); ((List) (arraylist)).add(((Object) (descriptor))))
	//*  14   29:aload           7
	//*  15   31:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            110
		{
			Object obj = iterator.next();
	//   17   39:aload           7
	//   18   41:invokeinterface #153 <Method Object Iterator.next()>
	//   19   46:astore          8
			descriptor = new Descriptor(((Runtime._cls1) (null)));
	//   20   48:new             #155 <Class Runtime$PropertyDescriptor>
	//   21   51:dup             
	//   22   52:aconst_null     
	//   23   53:invokespecial   #156 <Method void Runtime$PropertyDescriptor(Runtime$1)>
	//   24   56:astore          9
			if(flag)
	//*  25   58:iload_2         
	//*  26   59:ifeq            78
			{
				int j = i + 1;
	//   27   62:iload_3         
	//   28   63:iconst_1        
	//   29   64:iadd            
	//   30   65:istore          4
				iterable = ((Iterable) (String.valueOf(i)));
	//   31   67:iload_3         
	//   32   68:invokestatic    #162 <Method String String.valueOf(int)>
	//   33   71:astore_1        
				i = j;
	//   34   72:iload           4
	//   35   74:istore_3        
			} else
	//*  36   75:goto            80
			{
				iterable = null;
	//   37   78:aconst_null     
	//   38   79:astore_1        
			}
			descriptor.name = ((String) (iterable));
	//   39   80:aload           9
	//   40   82:aload_1         
	//   41   83:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
			descriptor.value = objectForRemote(obj);
	//   42   86:aload           9
	//   43   88:aload_0         
	//   44   89:aload           8
	//   45   91:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
	//   46   94:putfield        #168 <Field Runtime$RemoteObject Runtime$PropertyDescriptor.value>
		}

	//   47   97:aload           6
	//   48   99:aload           9
	//   49  101:invokeinterface #78  <Method boolean List.add(Object)>
	//   50  106:pop             
	//*  51  107:goto            29
		rtiesresponse.result = ((List) (arraylist));
	//   52  110:aload           5
	//   53  112:aload           6
	//   54  114:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
		return rtiesresponse;
	//   55  117:aload           5
	//   56  119:areturn         
	}

	private rtiesResponse getPropertiesForMap(Object obj)
	{
		rtiesResponse rtiesresponse = new rtiesResponse(((Runtime._cls1) (null)));
	//    0    0:new             #136 <Class Runtime$GetPropertiesResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #137 <Method void Runtime$GetPropertiesResponse(Runtime$1)>
	//    4    8:astore_2        
		ArrayList arraylist = new ArrayList();
	//    5    9:new             #65  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #138 <Method void ArrayList()>
	//    8   16:astore_3        
		Descriptor descriptor;
		for(obj = ((Object) (((Map)obj).entrySet().iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (descriptor))))
	//*   9   17:aload_1         
	//*  10   18:checkcast       #176 <Class Map>
	//*  11   21:invokeinterface #180 <Method Set Map.entrySet()>
	//*  12   26:invokeinterface #183 <Method Iterator Set.iterator()>
	//*  13   31:astore_1        
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            105
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   17   41:aload_1         
	//   18   42:invokeinterface #153 <Method Object Iterator.next()>
	//   19   47:checkcast       #185 <Class java.util.Map$Entry>
	//   20   50:astore          4
			descriptor = new Descriptor(((Runtime._cls1) (null)));
	//   21   52:new             #155 <Class Runtime$PropertyDescriptor>
	//   22   55:dup             
	//   23   56:aconst_null     
	//   24   57:invokespecial   #156 <Method void Runtime$PropertyDescriptor(Runtime$1)>
	//   25   60:astore          5
			descriptor.name = String.valueOf(entry.getKey());
	//   26   62:aload           5
	//   27   64:aload           4
	//   28   66:invokeinterface #188 <Method Object java.util.Map$Entry.getKey()>
	//   29   71:invokestatic    #191 <Method String String.valueOf(Object)>
	//   30   74:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
			descriptor.value = objectForRemote(entry.getValue());
	//   31   77:aload           5
	//   32   79:aload_0         
	//   33   80:aload           4
	//   34   82:invokeinterface #194 <Method Object java.util.Map$Entry.getValue()>
	//   35   87:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
	//   36   90:putfield        #168 <Field Runtime$RemoteObject Runtime$PropertyDescriptor.value>
		}

	//   37   93:aload_3         
	//   38   94:aload           5
	//   39   96:invokeinterface #78  <Method boolean List.add(Object)>
	//   40  101:pop             
	//*  41  102:goto            32
		rtiesresponse.result = ((List) (arraylist));
	//   42  105:aload_2         
	//   43  106:aload_3         
	//   44  107:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
		return rtiesresponse;
	//   45  110:aload_2         
	//   46  111:areturn         
	}

	private rtiesResponse getPropertiesForObject(Object obj)
	{
		rtiesResponse rtiesresponse = new rtiesResponse(((Runtime._cls1) (null)));
	//    0    0:new             #136 <Class Runtime$GetPropertiesResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #137 <Method void Runtime$GetPropertiesResponse(Runtime$1)>
	//    4    8:astore          4
		ArrayList arraylist = new ArrayList();
	//    5   10:new             #65  <Class ArrayList>
	//    6   13:dup             
	//    7   14:invokespecial   #138 <Method void ArrayList()>
	//    8   17:astore          5
label0:
		for(Class class1 = obj.getClass(); class1 != null; class1 = class1.getSuperclass())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   23:astore_2        
	//*  12   24:aload_2         
	//*  13   25:ifnull          240
		{
			Object obj2 = ((Object) (new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (class1.getDeclaredFields()))))))));
	//   14   28:new             #65  <Class ArrayList>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:invokevirtual   #201 <Method Field[] Class.getDeclaredFields()>
	//   18   36:invokestatic    #57  <Method List Arrays.asList(Object[])>
	//   19   39:invokespecial   #204 <Method void ArrayList(java.util.Collection)>
	//   20   42:astore          6
			Collections.reverse(((List) (obj2)));
	//   21   44:aload           6
	//   22   46:invokestatic    #210 <Method void Collections.reverse(List)>
			Object obj1;
			if(class1 == obj.getClass())
	//*  23   49:aload_2         
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #37  <Method Class Object.getClass()>
	//*  26   54:if_acmpne       63
			{
				obj1 = "";
	//   27   57:ldc1            #212 <String "">
	//   28   59:astore_3        
			} else
	//*  29   60:goto            92
			{
				obj1 = ((Object) (new StringBuilder()));
	//   30   63:new             #80  <Class StringBuilder>
	//   31   66:dup             
	//   32   67:invokespecial   #81  <Method void StringBuilder()>
	//   33   70:astore_3        
				((StringBuilder) (obj1)).append(class1.getSimpleName());
	//   34   71:aload_3         
	//   35   72:aload_2         
	//   36   73:invokevirtual   #215 <Method String Class.getSimpleName()>
	//   37   76:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
				((StringBuilder) (obj1)).append(".");
	//   39   80:aload_3         
	//   40   81:ldc1            #217 <String ".">
	//   41   83:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   43   87:aload_3         
	//   44   88:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   45   91:astore_3        
			}
			obj2 = ((Object) (((List) (obj2)).iterator()));
	//   46   92:aload           6
	//   47   94:invokeinterface #218 <Method Iterator List.iterator()>
	//   48   99:astore          6
			do
			{
				if(!((Iterator) (obj2)).hasNext())
					continue label0;
	//   49  101:aload           6
	//   50  103:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//   51  108:ifeq            232
				Field field = (Field)((Iterator) (obj2)).next();
	//   52  111:aload           6
	//   53  113:invokeinterface #153 <Method Object Iterator.next()>
	//   54  118:checkcast       #220 <Class Field>
	//   55  121:astore          7
				if(!Modifier.isStatic(field.getModifiers()))
	//*  56  123:aload           7
	//*  57  125:invokevirtual   #224 <Method int Field.getModifiers()>
	//*  58  128:invokestatic    #230 <Method boolean Modifier.isStatic(int)>
	//*  59  131:ifeq            137
	//*  60  134:goto            101
				{
					field.setAccessible(true);
	//   61  137:aload           7
	//   62  139:iconst_1        
	//   63  140:invokevirtual   #234 <Method void Field.setAccessible(boolean)>
					try
					{
						Object obj3 = field.get(obj);
	//   64  143:aload           7
	//   65  145:aload_1         
	//   66  146:invokevirtual   #237 <Method Object Field.get(Object)>
	//   67  149:astore          8
						Descriptor descriptor = new Descriptor(((Runtime._cls1) (null)));
	//   68  151:new             #155 <Class Runtime$PropertyDescriptor>
	//   69  154:dup             
	//   70  155:aconst_null     
	//   71  156:invokespecial   #156 <Method void Runtime$PropertyDescriptor(Runtime$1)>
	//   72  159:astore          9
						StringBuilder stringbuilder = new StringBuilder();
	//   73  161:new             #80  <Class StringBuilder>
	//   74  164:dup             
	//   75  165:invokespecial   #81  <Method void StringBuilder()>
	//   76  168:astore          10
						stringbuilder.append(((String) (obj1)));
	//   77  170:aload           10
	//   78  172:aload_3         
	//   79  173:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   80  176:pop             
						stringbuilder.append(field.getName());
	//   81  177:aload           10
	//   82  179:aload           7
	//   83  181:invokevirtual   #240 <Method String Field.getName()>
	//   84  184:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   85  187:pop             
						descriptor.name = stringbuilder.toString();
	//   86  188:aload           9
	//   87  190:aload           10
	//   88  192:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   89  195:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
						descriptor.value = objectForRemote(obj3);
	//   90  198:aload           9
	//   91  200:aload_0         
	//   92  201:aload           8
	//   93  203:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
	//   94  206:putfield        #168 <Field Runtime$RemoteObject Runtime$PropertyDescriptor.value>
						((List) (arraylist)).add(((Object) (descriptor)));
	//   95  209:aload           5
	//   96  211:aload           9
	//   97  213:invokeinterface #78  <Method boolean List.add(Object)>
	//   98  218:pop             
					}
	//*  99  219:goto            101
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//* 100  222:astore_1        
					{
						throw new RuntimeException(((Throwable) (obj)));
	//  101  223:new             #242 <Class RuntimeException>
	//  102  226:dup             
	//  103  227:aload_1         
	//  104  228:invokespecial   #245 <Method void RuntimeException(Throwable)>
	//  105  231:athrow          
					}
				}
			} while(true);
		}

	//  106  232:aload_2         
	//  107  233:invokevirtual   #248 <Method Class Class.getSuperclass()>
	//  108  236:astore_2        
	//* 109  237:goto            24
		Collections.reverse(((List) (arraylist)));
	//  110  240:aload           5
	//  111  242:invokestatic    #210 <Method void Collections.reverse(List)>
		rtiesresponse.result = ((List) (arraylist));
	//  112  245:aload           4
	//  113  247:aload           5
	//  114  249:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
		return rtiesresponse;
	//  115  252:aload           4
	//  116  254:areturn         
	}

	private rtiesResponse getPropertiesForProtoContainer(otoContainer otocontainer)
	{
		Object obj = otocontainer.object;
	//    0    0:aload_1         
	//    1    1:getfield        #256 <Field Object Runtime$ObjectProtoContainer.object>
	//    2    4:astore_2        
		otocontainer = ((otoContainer) (new ject()));
	//    3    5:new             #258 <Class Runtime$RemoteObject>
	//    4    8:dup             
	//    5    9:invokespecial   #259 <Method void Runtime$RemoteObject()>
	//    6   12:astore_1        
		otocontainer.type = pe.OBJECT;
	//    7   13:aload_1         
	//    8   14:getstatic       #265 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
	//    9   17:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
		otocontainer.subtype = bType.NODE;
	//   10   20:aload_1         
	//   11   21:getstatic       #274 <Field Runtime$ObjectSubType Runtime$ObjectSubType.NODE>
	//   12   24:putfield        #277 <Field Runtime$ObjectSubType Runtime$RemoteObject.subtype>
		otocontainer.className = obj.getClass().getName();
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #37  <Method Class Object.getClass()>
	//   16   32:invokevirtual   #278 <Method String Class.getName()>
	//   17   35:putfield        #281 <Field String Runtime$RemoteObject.className>
		otocontainer.description = Runtime.access$300(obj);
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokestatic    #284 <Method String Runtime.access$300(Object)>
	//   21   43:putfield        #287 <Field String Runtime$RemoteObject.description>
		otocontainer.objectId = String.valueOf(mObjects.putObject(obj));
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #23  <Field ObjectIdMapper mObjects>
	//   25   51:aload_2         
	//   26   52:invokevirtual   #290 <Method int ObjectIdMapper.putObject(Object)>
	//   27   55:invokestatic    #162 <Method String String.valueOf(int)>
	//   28   58:putfield        #293 <Field String Runtime$RemoteObject.objectId>
		obj = ((Object) (new Descriptor(((Runtime._cls1) (null)))));
	//   29   61:new             #155 <Class Runtime$PropertyDescriptor>
	//   30   64:dup             
	//   31   65:aconst_null     
	//   32   66:invokespecial   #156 <Method void Runtime$PropertyDescriptor(Runtime$1)>
	//   33   69:astore_2        
		obj.name = "1";
	//   34   70:aload_2         
	//   35   71:ldc2            #295 <String "1">
	//   36   74:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
		obj.value = ((ject) (otocontainer));
	//   37   77:aload_2         
	//   38   78:aload_1         
	//   39   79:putfield        #168 <Field Runtime$RemoteObject Runtime$PropertyDescriptor.value>
		otocontainer = ((otoContainer) (new rtiesResponse(((Runtime._cls1) (null)))));
	//   40   82:new             #136 <Class Runtime$GetPropertiesResponse>
	//   41   85:dup             
	//   42   86:aconst_null     
	//   43   87:invokespecial   #137 <Method void Runtime$GetPropertiesResponse(Runtime$1)>
	//   44   90:astore_1        
		otocontainer.result = ((List) (new ArrayList(1)));
	//   45   91:aload_1         
	//   46   92:new             #65  <Class ArrayList>
	//   47   95:dup             
	//   48   96:iconst_1        
	//   49   97:invokespecial   #68  <Method void ArrayList(int)>
	//   50  100:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
		((rtiesResponse) (otocontainer)).result.add(obj);
	//   51  103:aload_1         
	//   52  104:getfield        #171 <Field List Runtime$GetPropertiesResponse.result>
	//   53  107:aload_2         
	//   54  108:invokeinterface #78  <Method boolean List.add(Object)>
	//   55  113:pop             
		return ((rtiesResponse) (otocontainer));
	//   56  114:aload_1         
	//   57  115:areturn         
	}

	private RuntimeRepl getRepl(RuntimeReplFactory runtimereplfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mRepl == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #300 <Field RuntimeRepl mRepl>
	//*   4    6:ifnonnull       19
			mRepl = runtimereplfactory.newInstance();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #306 <Method RuntimeRepl RuntimeReplFactory.newInstance()>
	//    8   16:putfield        #300 <Field RuntimeRepl mRepl>
		runtimereplfactory = ((RuntimeReplFactory) (mRepl));
	//    9   19:aload_0         
	//   10   20:getfield        #300 <Field RuntimeRepl mRepl>
	//   11   23:astore_1        
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return ((RuntimeRepl) (runtimereplfactory));
	//   14   26:aload_1         
	//   15   27:areturn         
		runtimereplfactory;
	//   16   28:astore_1        
	//*  17   29:aload_0         
		throw runtimereplfactory;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	public Response evaluate(RuntimeReplFactory runtimereplfactory, JSONObject jsonobject)
	{
		jsonobject = ((JSONObject) ((Request)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Runtime$EvaluateRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc2            #313 <Class Runtime$EvaluateRequest>
	//    4    8:invokevirtual   #317 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   11:checkcast       #313 <Class Runtime$EvaluateRequest>
	//    6   14:astore_2        
		try
		{
			if(!((Request) (jsonobject)).objectGroup.equals("console"))
	//*   7   15:aload_2         
	//*   8   16:getfield        #320 <Field String Runtime$EvaluateRequest.objectGroup>
	//*   9   19:ldc2            #322 <String "console">
	//*  10   22:invokevirtual   #325 <Method boolean String.equals(Object)>
	//*  11   25:ifne            36
				return buildExceptionResponse("Not supported by FAB");
	//   12   28:aload_0         
	//   13   29:ldc2            #327 <String "Not supported by FAB">
	//   14   32:invokespecial   #329 <Method Runtime$EvaluateResponse buildExceptionResponse(Object)>
	//   15   35:areturn         
			runtimereplfactory = ((RuntimeReplFactory) (buildNormalResponse(getRepl(runtimereplfactory).evaluate(((Request) (jsonobject)).expression))));
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokespecial   #331 <Method RuntimeRepl getRepl(RuntimeReplFactory)>
	//   20   42:aload_2         
	//   21   43:getfield        #334 <Field String Runtime$EvaluateRequest.expression>
	//   22   46:invokeinterface #339 <Method Object RuntimeRepl.evaluate(String)>
	//   23   51:invokespecial   #341 <Method Runtime$EvaluateResponse buildNormalResponse(Object)>
	//   24   54:astore_1        
		}
	//*  25   55:aload_1         
	//*  26   56:areturn         
		// Misplaced declaration of an exception variable
		catch(RuntimeReplFactory runtimereplfactory)
	//*  27   57:astore_1        
		{
			return buildExceptionResponse(((Object) (runtimereplfactory)));
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokespecial   #329 <Method Runtime$EvaluateResponse buildExceptionResponse(Object)>
	//   31   63:areturn         
		}
		return ((Response) (runtimereplfactory));
	}

	public Object getObjectOrThrow(String s)
		throws JsonRpcException
	{
		Object obj = getObjects().getObjectForId(Integer.parseInt(s));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #348 <Method ObjectIdMapper getObjects()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #354 <Method int Integer.parseInt(String)>
	//    4    8:invokevirtual   #358 <Method Object ObjectIdMapper.getObjectForId(int)>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          18
		{
			return obj;
	//    8   16:aload_2         
	//    9   17:areturn         
		} else
		{
			com.facebook.stetho.inspector.jsonrpc.protocol.orCode orcode = com.facebook.stetho.inspector.jsonrpc.protocol.orCode.INVALID_REQUEST;
	//   10   18:getstatic       #364 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.INVALID_REQUEST>
	//   11   21:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #80  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #81  <Method void StringBuilder()>
	//   15   29:astore_3        
			stringbuilder.append("No object found for ");
	//   16   30:aload_3         
	//   17   31:ldc2            #366 <String "No object found for ">
	//   18   34:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(s);
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			throw new JsonRpcException(new JsonRpcError(orcode, stringbuilder.toString(), ((JSONObject) (null))));
	//   24   44:new             #344 <Class JsonRpcException>
	//   25   47:dup             
	//   26   48:new             #368 <Class JsonRpcError>
	//   27   51:dup             
	//   28   52:aload_2         
	//   29   53:aload_3         
	//   30   54:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   31   57:aconst_null     
	//   32   58:invokespecial   #371 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//   33   61:invokespecial   #374 <Method void JsonRpcException(JsonRpcError)>
	//   34   64:athrow          
		}
	}

	public ObjectIdMapper getObjects()
	{
		return mObjects;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ObjectIdMapper mObjects>
	//    2    4:areturn         
	}

	public rtiesResponse getProperties(JSONObject jsonobject)
		throws JsonRpcException
	{
		jsonobject = ((JSONObject) ((rtiesRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Runtime$GetPropertiesRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_1         
	//    3    5:ldc2            #379 <Class Runtime$GetPropertiesRequest>
	//    4    8:invokevirtual   #317 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   11:checkcast       #379 <Class Runtime$GetPropertiesRequest>
	//    6   14:astore_1        
		if(!((rtiesRequest) (jsonobject)).ownProperties)
	//*   7   15:aload_1         
	//*   8   16:getfield        #382 <Field boolean Runtime$GetPropertiesRequest.ownProperties>
	//*   9   19:ifne            44
		{
			jsonobject = ((JSONObject) (new rtiesResponse(((Runtime._cls1) (null)))));
	//   10   22:new             #136 <Class Runtime$GetPropertiesResponse>
	//   11   25:dup             
	//   12   26:aconst_null     
	//   13   27:invokespecial   #137 <Method void Runtime$GetPropertiesResponse(Runtime$1)>
	//   14   30:astore_1        
			jsonobject.result = ((List) (new ArrayList()));
	//   15   31:aload_1         
	//   16   32:new             #65  <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #138 <Method void ArrayList()>
	//   19   39:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
			return ((rtiesResponse) (jsonobject));
	//   20   42:aload_1         
	//   21   43:areturn         
		}
		Object obj = getObjectOrThrow(((rtiesRequest) (jsonobject)).objectId);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #383 <Field String Runtime$GetPropertiesRequest.objectId>
	//   25   49:invokevirtual   #385 <Method Object getObjectOrThrow(String)>
	//   26   52:astore_2        
		jsonobject = ((JSONObject) (obj));
	//   27   53:aload_2         
	//   28   54:astore_1        
		if(obj.getClass().isArray())
	//*  29   55:aload_2         
	//*  30   56:invokevirtual   #37  <Method Class Object.getClass()>
	//*  31   59:invokevirtual   #43  <Method boolean Class.isArray()>
	//*  32   62:ifeq            71
			jsonobject = ((JSONObject) (arrayToList(obj)));
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokespecial   #387 <Method List arrayToList(Object)>
	//   36   70:astore_1        
		if(jsonobject instanceof otoContainer)
	//*  37   71:aload_1         
	//*  38   72:instanceof      #252 <Class Runtime$ObjectProtoContainer>
	//*  39   75:ifeq            87
			return getPropertiesForProtoContainer((otoContainer)jsonobject);
	//   40   78:aload_0         
	//   41   79:aload_1         
	//   42   80:checkcast       #252 <Class Runtime$ObjectProtoContainer>
	//   43   83:invokespecial   #389 <Method Runtime$GetPropertiesResponse getPropertiesForProtoContainer(Runtime$ObjectProtoContainer)>
	//   44   86:areturn         
		if(jsonobject instanceof List)
	//*  45   87:aload_1         
	//*  46   88:instanceof      #74  <Class List>
	//*  47   91:ifeq            104
			return getPropertiesForIterable(((Iterable) ((List)jsonobject)), true);
	//   48   94:aload_0         
	//   49   95:aload_1         
	//   50   96:checkcast       #74  <Class List>
	//   51   99:iconst_1        
	//   52  100:invokespecial   #391 <Method Runtime$GetPropertiesResponse getPropertiesForIterable(Iterable, boolean)>
	//   53  103:areturn         
		if(jsonobject instanceof Set)
	//*  54  104:aload_1         
	//*  55  105:instanceof      #182 <Class Set>
	//*  56  108:ifeq            121
			return getPropertiesForIterable(((Iterable) ((Set)jsonobject)), false);
	//   57  111:aload_0         
	//   58  112:aload_1         
	//   59  113:checkcast       #182 <Class Set>
	//   60  116:iconst_0        
	//   61  117:invokespecial   #391 <Method Runtime$GetPropertiesResponse getPropertiesForIterable(Iterable, boolean)>
	//   62  120:areturn         
		if(jsonobject instanceof Map)
	//*  63  121:aload_1         
	//*  64  122:instanceof      #176 <Class Map>
	//*  65  125:ifeq            134
			return getPropertiesForMap(((Object) (jsonobject)));
	//   66  128:aload_0         
	//   67  129:aload_1         
	//   68  130:invokespecial   #393 <Method Runtime$GetPropertiesResponse getPropertiesForMap(Object)>
	//   69  133:areturn         
		else
			return getPropertiesForObject(((Object) (jsonobject)));
	//   70  134:aload_0         
	//   71  135:aload_1         
	//   72  136:invokespecial   #395 <Method Runtime$GetPropertiesResponse getPropertiesForObject(Object)>
	//   73  139:areturn         
	}

	public ject objectForRemote(Object obj)
	{
		ject ject = new ject();
	//    0    0:new             #258 <Class Runtime$RemoteObject>
	//    1    3:dup             
	//    2    4:invokespecial   #259 <Method void Runtime$RemoteObject()>
	//    3    7:astore_2        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       35
		{
			ject.type = pe.OBJECT;
	//    6   12:aload_2         
	//    7   13:getstatic       #265 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
	//    8   16:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			ject.subtype = bType.NULL;
	//    9   19:aload_2         
	//   10   20:getstatic       #398 <Field Runtime$ObjectSubType Runtime$ObjectSubType.NULL>
	//   11   23:putfield        #277 <Field Runtime$ObjectSubType Runtime$RemoteObject.subtype>
			ject.value = JSONObject.NULL;
	//   12   26:aload_2         
	//   13   27:getstatic       #402 <Field Object JSONObject.NULL>
	//   14   30:putfield        #404 <Field Object Runtime$RemoteObject.value>
			return ject;
	//   15   33:aload_2         
	//   16   34:areturn         
		}
		if(obj instanceof Boolean)
	//*  17   35:aload_1         
	//*  18   36:instanceof      #406 <Class Boolean>
	//*  19   39:ifeq            56
		{
			ject.type = pe.BOOLEAN;
	//   20   42:aload_2         
	//   21   43:getstatic       #409 <Field Runtime$ObjectType Runtime$ObjectType.BOOLEAN>
	//   22   46:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			ject.value = obj;
	//   23   49:aload_2         
	//   24   50:aload_1         
	//   25   51:putfield        #404 <Field Object Runtime$RemoteObject.value>
			return ject;
	//   26   54:aload_2         
	//   27   55:areturn         
		}
		if(obj instanceof Number)
	//*  28   56:aload_1         
	//*  29   57:instanceof      #411 <Class Number>
	//*  30   60:ifeq            77
		{
			ject.type = pe.NUMBER;
	//   31   63:aload_2         
	//   32   64:getstatic       #414 <Field Runtime$ObjectType Runtime$ObjectType.NUMBER>
	//   33   67:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			ject.value = obj;
	//   34   70:aload_2         
	//   35   71:aload_1         
	//   36   72:putfield        #404 <Field Object Runtime$RemoteObject.value>
			return ject;
	//   37   75:aload_2         
	//   38   76:areturn         
		}
		if(obj instanceof Character)
	//*  39   77:aload_1         
	//*  40   78:instanceof      #416 <Class Character>
	//*  41   81:ifeq            107
		{
			ject.type = pe.NUMBER;
	//   42   84:aload_2         
	//   43   85:getstatic       #414 <Field Runtime$ObjectType Runtime$ObjectType.NUMBER>
	//   44   88:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			ject.value = ((Object) (Integer.valueOf(((int) (((Character)obj).charValue())))));
	//   45   91:aload_2         
	//   46   92:aload_1         
	//   47   93:checkcast       #416 <Class Character>
	//   48   96:invokevirtual   #420 <Method char Character.charValue()>
	//   49   99:invokestatic    #423 <Method Integer Integer.valueOf(int)>
	//   50  102:putfield        #404 <Field Object Runtime$RemoteObject.value>
			return ject;
	//   51  105:aload_2         
	//   52  106:areturn         
		}
		if(obj instanceof String)
	//*  53  107:aload_1         
	//*  54  108:instanceof      #158 <Class String>
	//*  55  111:ifeq            131
		{
			ject.type = pe.STRING;
	//   56  114:aload_2         
	//   57  115:getstatic       #426 <Field Runtime$ObjectType Runtime$ObjectType.STRING>
	//   58  118:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			ject.value = ((Object) (String.valueOf(obj)));
	//   59  121:aload_2         
	//   60  122:aload_1         
	//   61  123:invokestatic    #191 <Method String String.valueOf(Object)>
	//   62  126:putfield        #404 <Field Object Runtime$RemoteObject.value>
			return ject;
	//   63  129:aload_2         
	//   64  130:areturn         
		}
		ject.type = pe.OBJECT;
	//   65  131:aload_2         
	//   66  132:getstatic       #265 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
	//   67  135:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
		ject.className = "What??";
	//   68  138:aload_2         
	//   69  139:ldc2            #428 <String "What??">
	//   70  142:putfield        #281 <Field String Runtime$RemoteObject.className>
		ject.objectId = String.valueOf(mObjects.putObject(obj));
	//   71  145:aload_2         
	//   72  146:aload_0         
	//   73  147:getfield        #23  <Field ObjectIdMapper mObjects>
	//   74  150:aload_1         
	//   75  151:invokevirtual   #290 <Method int ObjectIdMapper.putObject(Object)>
	//   76  154:invokestatic    #162 <Method String String.valueOf(int)>
	//   77  157:putfield        #293 <Field String Runtime$RemoteObject.objectId>
		if(obj.getClass().isArray())
	//*  78  160:aload_1         
	//*  79  161:invokevirtual   #37  <Method Class Object.getClass()>
	//*  80  164:invokevirtual   #43  <Method boolean Class.isArray()>
	//*  81  167:ifeq            179
		{
			ject.description = "array";
	//   82  170:aload_2         
	//   83  171:ldc2            #430 <String "array">
	//   84  174:putfield        #287 <Field String Runtime$RemoteObject.description>
			return ject;
	//   85  177:aload_2         
	//   86  178:areturn         
		}
		if(obj instanceof List)
	//*  87  179:aload_1         
	//*  88  180:instanceof      #74  <Class List>
	//*  89  183:ifeq            195
		{
			ject.description = "List";
	//   90  186:aload_2         
	//   91  187:ldc2            #432 <String "List">
	//   92  190:putfield        #287 <Field String Runtime$RemoteObject.description>
			return ject;
	//   93  193:aload_2         
	//   94  194:areturn         
		}
		if(obj instanceof Set)
	//*  95  195:aload_1         
	//*  96  196:instanceof      #182 <Class Set>
	//*  97  199:ifeq            211
		{
			ject.description = "Set";
	//   98  202:aload_2         
	//   99  203:ldc2            #434 <String "Set">
	//  100  206:putfield        #287 <Field String Runtime$RemoteObject.description>
			return ject;
	//  101  209:aload_2         
	//  102  210:areturn         
		}
		if(obj instanceof Map)
	//* 103  211:aload_1         
	//* 104  212:instanceof      #176 <Class Map>
	//* 105  215:ifeq            227
		{
			ject.description = "Map";
	//  106  218:aload_2         
	//  107  219:ldc2            #436 <String "Map">
	//  108  222:putfield        #287 <Field String Runtime$RemoteObject.description>
			return ject;
	//  109  225:aload_2         
	//  110  226:areturn         
		} else
		{
			ject.description = Runtime.access$300(obj);
	//  111  227:aload_2         
	//  112  228:aload_1         
	//  113  229:invokestatic    #284 <Method String Runtime.access$300(Object)>
	//  114  232:putfield        #287 <Field String Runtime$RemoteObject.description>
			return ject;
	//  115  235:aload_2         
	//  116  236:areturn         
		}
	}

	private final ObjectMapper mObjectMapper;
	private final ObjectIdMapper mObjects;
	private RuntimeRepl mRepl;

	private Runtime$Session()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mObjects = new ObjectIdMapper();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ObjectIdMapper>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ObjectIdMapper()>
	//    6   12:putfield        #23  <Field ObjectIdMapper mObjects>
		mObjectMapper = new ObjectMapper();
	//    7   15:aload_0         
	//    8   16:new             #25  <Class ObjectMapper>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void ObjectMapper()>
	//   11   23:putfield        #28  <Field ObjectMapper mObjectMapper>
	//   12   26:return          
	}

	Runtime$Session(Runtime._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Runtime$Session()>
	//    2    4:return          
	}
}
