// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.jsonrpc.*;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory;
import com.facebook.stetho.json.ObjectMapper;
import java.lang.reflect.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public class Runtime
	implements ChromeDevtoolsDomain
{
	private static class CallArgument
	{

		public String objectId;
		public ObjectType type;
		public Object value;

		private CallArgument()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class CallFunctionOnRequest
	{

		public List arguments;
		public Boolean doNotPauseOnExceptionsAndMuteConsole;
		public String functionDeclaration;
		public Boolean generatePreview;
		public String objectId;
		public Boolean returnByValue;

		private CallFunctionOnRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class CallFunctionOnResponse
		implements JsonRpcResult
	{

		public RemoteObject result;
		public Boolean wasThrown;

		private CallFunctionOnResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class EvaluateRequest
		implements JsonRpcResult
	{

		public String expression;
		public String objectGroup;

		private EvaluateRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class EvaluateResponse
		implements JsonRpcResult
	{

		public ExceptionDetails exceptionDetails;
		public RemoteObject result;
		public boolean wasThrown;

		private EvaluateResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ExceptionDetails
	{

		public String text;

		private ExceptionDetails()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class GetPropertiesRequest
		implements JsonRpcResult
	{

		public String objectId;
		public boolean ownProperties;

		private GetPropertiesRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetPropertiesResponse
		implements JsonRpcResult
	{

		public List result;

		private GetPropertiesResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ObjectProtoContainer
	{

		public final Object object;

		public ObjectProtoContainer(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			object = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field Object object>
		//    5    9:return          
		}
	}

	public static final class ObjectSubType extends Enum
	{

		public static ObjectSubType valueOf(String s)
		{
			return (ObjectSubType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Runtime$ObjectSubType, s);
		//    0    0:ldc1            #2   <Class Runtime$ObjectSubType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #94  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Runtime$ObjectSubType>
		//    4    9:areturn         
		}

		public static ObjectSubType[] values()
		{
			return (ObjectSubType[])((ObjectSubType []) ($VALUES)).clone();
		//    0    0:getstatic       #81  <Field Runtime$ObjectSubType[] $VALUES>
		//    1    3:invokevirtual   #101 <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Runtime$ObjectSubType_3B_.clone()>
		//    2    6:checkcast       #97  <Class Runtime$ObjectSubType[]>
		//    3    9:areturn         
		}

		public String getProtocolValue()
		{
			return mProtocolValue;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field String mProtocolValue>
		//    2    4:areturn         
		}

		private static final ObjectSubType $VALUES[];
		public static final ObjectSubType ARRAY;
		public static final ObjectSubType DATE;
		public static final ObjectSubType ERROR;
		public static final ObjectSubType GENERATOR;
		public static final ObjectSubType ITERATOR;
		public static final ObjectSubType MAP;
		public static final ObjectSubType NODE;
		public static final ObjectSubType NULL;
		public static final ObjectSubType REGEXP;
		public static final ObjectSubType SET;
		private final String mProtocolValue;

		static 
		{
			ARRAY = new ObjectSubType("ARRAY", 0, "array");
		//    0    0:new             #2   <Class Runtime$ObjectSubType>
		//    1    3:dup             
		//    2    4:ldc1            #26  <String "ARRAY">
		//    3    6:iconst_0        
		//    4    7:ldc1            #28  <String "array">
		//    5    9:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//    6   12:putstatic       #34  <Field Runtime$ObjectSubType ARRAY>
			NULL = new ObjectSubType("NULL", 1, "null");
		//    7   15:new             #2   <Class Runtime$ObjectSubType>
		//    8   18:dup             
		//    9   19:ldc1            #35  <String "NULL">
		//   10   21:iconst_1        
		//   11   22:ldc1            #37  <String "null">
		//   12   24:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   13   27:putstatic       #39  <Field Runtime$ObjectSubType NULL>
			NODE = new ObjectSubType("NODE", 2, "node");
		//   14   30:new             #2   <Class Runtime$ObjectSubType>
		//   15   33:dup             
		//   16   34:ldc1            #40  <String "NODE">
		//   17   36:iconst_2        
		//   18   37:ldc1            #42  <String "node">
		//   19   39:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   20   42:putstatic       #44  <Field Runtime$ObjectSubType NODE>
			REGEXP = new ObjectSubType("REGEXP", 3, "regexp");
		//   21   45:new             #2   <Class Runtime$ObjectSubType>
		//   22   48:dup             
		//   23   49:ldc1            #45  <String "REGEXP">
		//   24   51:iconst_3        
		//   25   52:ldc1            #47  <String "regexp">
		//   26   54:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   27   57:putstatic       #49  <Field Runtime$ObjectSubType REGEXP>
			DATE = new ObjectSubType("DATE", 4, "date");
		//   28   60:new             #2   <Class Runtime$ObjectSubType>
		//   29   63:dup             
		//   30   64:ldc1            #50  <String "DATE">
		//   31   66:iconst_4        
		//   32   67:ldc1            #52  <String "date">
		//   33   69:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   34   72:putstatic       #54  <Field Runtime$ObjectSubType DATE>
			MAP = new ObjectSubType("MAP", 5, "map");
		//   35   75:new             #2   <Class Runtime$ObjectSubType>
		//   36   78:dup             
		//   37   79:ldc1            #55  <String "MAP">
		//   38   81:iconst_5        
		//   39   82:ldc1            #57  <String "map">
		//   40   84:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   41   87:putstatic       #59  <Field Runtime$ObjectSubType MAP>
			SET = new ObjectSubType("SET", 6, "set");
		//   42   90:new             #2   <Class Runtime$ObjectSubType>
		//   43   93:dup             
		//   44   94:ldc1            #60  <String "SET">
		//   45   96:bipush          6
		//   46   98:ldc1            #62  <String "set">
		//   47  100:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   48  103:putstatic       #64  <Field Runtime$ObjectSubType SET>
			ITERATOR = new ObjectSubType("ITERATOR", 7, "iterator");
		//   49  106:new             #2   <Class Runtime$ObjectSubType>
		//   50  109:dup             
		//   51  110:ldc1            #65  <String "ITERATOR">
		//   52  112:bipush          7
		//   53  114:ldc1            #67  <String "iterator">
		//   54  116:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   55  119:putstatic       #69  <Field Runtime$ObjectSubType ITERATOR>
			GENERATOR = new ObjectSubType("GENERATOR", 8, "generator");
		//   56  122:new             #2   <Class Runtime$ObjectSubType>
		//   57  125:dup             
		//   58  126:ldc1            #70  <String "GENERATOR">
		//   59  128:bipush          8
		//   60  130:ldc1            #72  <String "generator">
		//   61  132:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   62  135:putstatic       #74  <Field Runtime$ObjectSubType GENERATOR>
			ERROR = new ObjectSubType("ERROR", 9, "error");
		//   63  138:new             #2   <Class Runtime$ObjectSubType>
		//   64  141:dup             
		//   65  142:ldc1            #75  <String "ERROR">
		//   66  144:bipush          9
		//   67  146:ldc1            #77  <String "error">
		//   68  148:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
		//   69  151:putstatic       #79  <Field Runtime$ObjectSubType ERROR>
			$VALUES = (new ObjectSubType[] {
				ARRAY, NULL, NODE, REGEXP, DATE, MAP, SET, ITERATOR, GENERATOR, ERROR
			});
		//   70  154:bipush          10
		//   71  156:anewarray       ObjectSubType[]
		//   72  159:dup             
		//   73  160:iconst_0        
		//   74  161:getstatic       #34  <Field Runtime$ObjectSubType ARRAY>
		//   75  164:aastore         
		//   76  165:dup             
		//   77  166:iconst_1        
		//   78  167:getstatic       #39  <Field Runtime$ObjectSubType NULL>
		//   79  170:aastore         
		//   80  171:dup             
		//   81  172:iconst_2        
		//   82  173:getstatic       #44  <Field Runtime$ObjectSubType NODE>
		//   83  176:aastore         
		//   84  177:dup             
		//   85  178:iconst_3        
		//   86  179:getstatic       #49  <Field Runtime$ObjectSubType REGEXP>
		//   87  182:aastore         
		//   88  183:dup             
		//   89  184:iconst_4        
		//   90  185:getstatic       #54  <Field Runtime$ObjectSubType DATE>
		//   91  188:aastore         
		//   92  189:dup             
		//   93  190:iconst_5        
		//   94  191:getstatic       #59  <Field Runtime$ObjectSubType MAP>
		//   95  194:aastore         
		//   96  195:dup             
		//   97  196:bipush          6
		//   98  198:getstatic       #64  <Field Runtime$ObjectSubType SET>
		//   99  201:aastore         
		//  100  202:dup             
		//  101  203:bipush          7
		//  102  205:getstatic       #69  <Field Runtime$ObjectSubType ITERATOR>
		//  103  208:aastore         
		//  104  209:dup             
		//  105  210:bipush          8
		//  106  212:getstatic       #74  <Field Runtime$ObjectSubType GENERATOR>
		//  107  215:aastore         
		//  108  216:dup             
		//  109  217:bipush          9
		//  110  219:getstatic       #79  <Field Runtime$ObjectSubType ERROR>
		//  111  222:aastore         
		//  112  223:putstatic       #81  <Field Runtime$ObjectSubType[] $VALUES>
		//* 113  226:return          
		}

		private ObjectSubType(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #85  <Method void Enum(String, int)>
			mProtocolValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #87  <Field String mProtocolValue>
		//    7   11:return          
		}
	}

	public static final class ObjectType extends Enum
	{

		public static ObjectType valueOf(String s)
		{
			return (ObjectType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Runtime$ObjectType, s);
		//    0    0:ldc1            #2   <Class Runtime$ObjectType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Runtime$ObjectType>
		//    4    9:areturn         
		}

		public static ObjectType[] values()
		{
			return (ObjectType[])((ObjectType []) ($VALUES)).clone();
		//    0    0:getstatic       #63  <Field Runtime$ObjectType[] $VALUES>
		//    1    3:invokevirtual   #83  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Runtime$ObjectType_3B_.clone()>
		//    2    6:checkcast       #79  <Class Runtime$ObjectType[]>
		//    3    9:areturn         
		}

		public String getProtocolValue()
		{
			return mProtocolValue;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field String mProtocolValue>
		//    2    4:areturn         
		}

		private static final ObjectType $VALUES[];
		public static final ObjectType BOOLEAN;
		public static final ObjectType FUNCTION;
		public static final ObjectType NUMBER;
		public static final ObjectType OBJECT;
		public static final ObjectType STRING;
		public static final ObjectType SYMBOL;
		public static final ObjectType UNDEFINED;
		private final String mProtocolValue;

		static 
		{
			OBJECT = new ObjectType("OBJECT", 0, "object");
		//    0    0:new             #2   <Class Runtime$ObjectType>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "OBJECT">
		//    3    6:iconst_0        
		//    4    7:ldc1            #25  <String "object">
		//    5    9:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
		//    6   12:putstatic       #31  <Field Runtime$ObjectType OBJECT>
			FUNCTION = new ObjectType("FUNCTION", 1, "function");
		//    7   15:new             #2   <Class Runtime$ObjectType>
		//    8   18:dup             
		//    9   19:ldc1            #32  <String "FUNCTION">
		//   10   21:iconst_1        
		//   11   22:ldc1            #34  <String "function">
		//   12   24:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
		//   13   27:putstatic       #36  <Field Runtime$ObjectType FUNCTION>
			UNDEFINED = new ObjectType("UNDEFINED", 2, "undefined");
		//   14   30:new             #2   <Class Runtime$ObjectType>
		//   15   33:dup             
		//   16   34:ldc1            #37  <String "UNDEFINED">
		//   17   36:iconst_2        
		//   18   37:ldc1            #39  <String "undefined">
		//   19   39:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
		//   20   42:putstatic       #41  <Field Runtime$ObjectType UNDEFINED>
			STRING = new ObjectType("STRING", 3, "string");
		//   21   45:new             #2   <Class Runtime$ObjectType>
		//   22   48:dup             
		//   23   49:ldc1            #42  <String "STRING">
		//   24   51:iconst_3        
		//   25   52:ldc1            #44  <String "string">
		//   26   54:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
		//   27   57:putstatic       #46  <Field Runtime$ObjectType STRING>
			NUMBER = new ObjectType("NUMBER", 4, "number");
		//   28   60:new             #2   <Class Runtime$ObjectType>
		//   29   63:dup             
		//   30   64:ldc1            #47  <String "NUMBER">
		//   31   66:iconst_4        
		//   32   67:ldc1            #49  <String "number">
		//   33   69:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
		//   34   72:putstatic       #51  <Field Runtime$ObjectType NUMBER>
			BOOLEAN = new ObjectType("BOOLEAN", 5, "boolean");
		//   35   75:new             #2   <Class Runtime$ObjectType>
		//   36   78:dup             
		//   37   79:ldc1            #52  <String "BOOLEAN">
		//   38   81:iconst_5        
		//   39   82:ldc1            #54  <String "boolean">
		//   40   84:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
		//   41   87:putstatic       #56  <Field Runtime$ObjectType BOOLEAN>
			SYMBOL = new ObjectType("SYMBOL", 6, "symbol");
		//   42   90:new             #2   <Class Runtime$ObjectType>
		//   43   93:dup             
		//   44   94:ldc1            #57  <String "SYMBOL">
		//   45   96:bipush          6
		//   46   98:ldc1            #59  <String "symbol">
		//   47  100:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
		//   48  103:putstatic       #61  <Field Runtime$ObjectType SYMBOL>
			$VALUES = (new ObjectType[] {
				OBJECT, FUNCTION, UNDEFINED, STRING, NUMBER, BOOLEAN, SYMBOL
			});
		//   49  106:bipush          7
		//   50  108:anewarray       ObjectType[]
		//   51  111:dup             
		//   52  112:iconst_0        
		//   53  113:getstatic       #31  <Field Runtime$ObjectType OBJECT>
		//   54  116:aastore         
		//   55  117:dup             
		//   56  118:iconst_1        
		//   57  119:getstatic       #36  <Field Runtime$ObjectType FUNCTION>
		//   58  122:aastore         
		//   59  123:dup             
		//   60  124:iconst_2        
		//   61  125:getstatic       #41  <Field Runtime$ObjectType UNDEFINED>
		//   62  128:aastore         
		//   63  129:dup             
		//   64  130:iconst_3        
		//   65  131:getstatic       #46  <Field Runtime$ObjectType STRING>
		//   66  134:aastore         
		//   67  135:dup             
		//   68  136:iconst_4        
		//   69  137:getstatic       #51  <Field Runtime$ObjectType NUMBER>
		//   70  140:aastore         
		//   71  141:dup             
		//   72  142:iconst_5        
		//   73  143:getstatic       #56  <Field Runtime$ObjectType BOOLEAN>
		//   74  146:aastore         
		//   75  147:dup             
		//   76  148:bipush          6
		//   77  150:getstatic       #61  <Field Runtime$ObjectType SYMBOL>
		//   78  153:aastore         
		//   79  154:putstatic       #63  <Field Runtime$ObjectType[] $VALUES>
		//*  80  157:return          
		}

		private ObjectType(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #67  <Method void Enum(String, int)>
			mProtocolValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #69  <Field String mProtocolValue>
		//    7   11:return          
		}
	}

	private static class PropertyDescriptor
	{

		public final boolean configurable;
		public final boolean enumerable;
		public final boolean isOwn;
		public String name;
		public RemoteObject value;
		public final boolean writable;

		private PropertyDescriptor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			isOwn = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #25  <Field boolean isOwn>
			configurable = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #27  <Field boolean configurable>
			enumerable = true;
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:putfield        #29  <Field boolean enumerable>
			writable = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #31  <Field boolean writable>
		//   14   24:return          
		}

	}

	public static class RemoteObject
	{

		public String className;
		public String description;
		public String objectId;
		public ObjectSubType subtype;
		public ObjectType type;
		public Object value;

		public RemoteObject()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class Session
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

		private EvaluateResponse buildExceptionResponse(Object obj)
		{
			EvaluateResponse evaluateresponse = new EvaluateResponse();
		//    0    0:new             #105 <Class Runtime$EvaluateResponse>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #107 <Method void Runtime$EvaluateResponse(Runtime$1)>
		//    4    8:astore_2        
			evaluateresponse.wasThrown = true;
		//    5    9:aload_2         
		//    6   10:iconst_1        
		//    7   11:putfield        #111 <Field boolean Runtime$EvaluateResponse.wasThrown>
			evaluateresponse.result = objectForRemote(obj);
		//    8   14:aload_2         
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
		//   12   20:putfield        #119 <Field Runtime$RemoteObject Runtime$EvaluateResponse.result>
			evaluateresponse.exceptionDetails = new ExceptionDetails();
		//   13   23:aload_2         
		//   14   24:new             #121 <Class Runtime$ExceptionDetails>
		//   15   27:dup             
		//   16   28:aconst_null     
		//   17   29:invokespecial   #122 <Method void Runtime$ExceptionDetails(Runtime$1)>
		//   18   32:putfield        #126 <Field Runtime$ExceptionDetails Runtime$EvaluateResponse.exceptionDetails>
			evaluateresponse.exceptionDetails.text = obj.toString();
		//   19   35:aload_2         
		//   20   36:getfield        #126 <Field Runtime$ExceptionDetails Runtime$EvaluateResponse.exceptionDetails>
		//   21   39:aload_1         
		//   22   40:invokevirtual   #127 <Method String Object.toString()>
		//   23   43:putfield        #131 <Field String Runtime$ExceptionDetails.text>
			return evaluateresponse;
		//   24   46:aload_2         
		//   25   47:areturn         
		}

		private EvaluateResponse buildNormalResponse(Object obj)
		{
			EvaluateResponse evaluateresponse = new EvaluateResponse();
		//    0    0:new             #105 <Class Runtime$EvaluateResponse>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #107 <Method void Runtime$EvaluateResponse(Runtime$1)>
		//    4    8:astore_2        
			evaluateresponse.wasThrown = false;
		//    5    9:aload_2         
		//    6   10:iconst_0        
		//    7   11:putfield        #111 <Field boolean Runtime$EvaluateResponse.wasThrown>
			evaluateresponse.result = objectForRemote(obj);
		//    8   14:aload_2         
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
		//   12   20:putfield        #119 <Field Runtime$RemoteObject Runtime$EvaluateResponse.result>
			return evaluateresponse;
		//   13   23:aload_2         
		//   14   24:areturn         
		}

		private GetPropertiesResponse getPropertiesForIterable(Iterable iterable, boolean flag)
		{
			GetPropertiesResponse getpropertiesresponse = new GetPropertiesResponse();
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
			PropertyDescriptor propertydescriptor;
			for(; iterator.hasNext(); ((List) (arraylist)).add(((Object) (propertydescriptor))))
		//*  14   29:aload           7
		//*  15   31:invokeinterface #149 <Method boolean Iterator.hasNext()>
		//*  16   36:ifeq            110
			{
				Object obj = iterator.next();
		//   17   39:aload           7
		//   18   41:invokeinterface #153 <Method Object Iterator.next()>
		//   19   46:astore          8
				propertydescriptor = new PropertyDescriptor();
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
				propertydescriptor.name = ((String) (iterable));
		//   39   80:aload           9
		//   40   82:aload_1         
		//   41   83:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
				propertydescriptor.value = objectForRemote(obj);
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
			getpropertiesresponse.result = ((List) (arraylist));
		//   52  110:aload           5
		//   53  112:aload           6
		//   54  114:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
			return getpropertiesresponse;
		//   55  117:aload           5
		//   56  119:areturn         
		}

		private GetPropertiesResponse getPropertiesForMap(Object obj)
		{
			GetPropertiesResponse getpropertiesresponse = new GetPropertiesResponse();
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
			PropertyDescriptor propertydescriptor;
			for(obj = ((Object) (((Map)obj).entrySet().iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (propertydescriptor))))
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
				propertydescriptor = new PropertyDescriptor();
		//   21   52:new             #155 <Class Runtime$PropertyDescriptor>
		//   22   55:dup             
		//   23   56:aconst_null     
		//   24   57:invokespecial   #156 <Method void Runtime$PropertyDescriptor(Runtime$1)>
		//   25   60:astore          5
				propertydescriptor.name = String.valueOf(entry.getKey());
		//   26   62:aload           5
		//   27   64:aload           4
		//   28   66:invokeinterface #188 <Method Object java.util.Map$Entry.getKey()>
		//   29   71:invokestatic    #191 <Method String String.valueOf(Object)>
		//   30   74:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
				propertydescriptor.value = objectForRemote(entry.getValue());
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
			getpropertiesresponse.result = ((List) (arraylist));
		//   42  105:aload_2         
		//   43  106:aload_3         
		//   44  107:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
			return getpropertiesresponse;
		//   45  110:aload_2         
		//   46  111:areturn         
		}

		private GetPropertiesResponse getPropertiesForObject(Object obj)
		{
			GetPropertiesResponse getpropertiesresponse = new GetPropertiesResponse();
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
							PropertyDescriptor propertydescriptor = new PropertyDescriptor();
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
							propertydescriptor.name = stringbuilder.toString();
		//   86  188:aload           9
		//   87  190:aload           10
		//   88  192:invokevirtual   #96  <Method String StringBuilder.toString()>
		//   89  195:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
							propertydescriptor.value = objectForRemote(obj3);
		//   90  198:aload           9
		//   91  200:aload_0         
		//   92  201:aload           8
		//   93  203:invokevirtual   #115 <Method Runtime$RemoteObject objectForRemote(Object)>
		//   94  206:putfield        #168 <Field Runtime$RemoteObject Runtime$PropertyDescriptor.value>
							((List) (arraylist)).add(((Object) (propertydescriptor)));
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
			getpropertiesresponse.result = ((List) (arraylist));
		//  112  245:aload           4
		//  113  247:aload           5
		//  114  249:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
			return getpropertiesresponse;
		//  115  252:aload           4
		//  116  254:areturn         
		}

		private GetPropertiesResponse getPropertiesForProtoContainer(ObjectProtoContainer objectprotocontainer)
		{
			Object obj = objectprotocontainer.object;
		//    0    0:aload_1         
		//    1    1:getfield        #256 <Field Object Runtime$ObjectProtoContainer.object>
		//    2    4:astore_2        
			objectprotocontainer = ((ObjectProtoContainer) (new RemoteObject()));
		//    3    5:new             #258 <Class Runtime$RemoteObject>
		//    4    8:dup             
		//    5    9:invokespecial   #259 <Method void Runtime$RemoteObject()>
		//    6   12:astore_1        
			objectprotocontainer.type = ObjectType.OBJECT;
		//    7   13:aload_1         
		//    8   14:getstatic       #265 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
		//    9   17:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			objectprotocontainer.subtype = ObjectSubType.NODE;
		//   10   20:aload_1         
		//   11   21:getstatic       #274 <Field Runtime$ObjectSubType Runtime$ObjectSubType.NODE>
		//   12   24:putfield        #277 <Field Runtime$ObjectSubType Runtime$RemoteObject.subtype>
			objectprotocontainer.className = obj.getClass().getName();
		//   13   27:aload_1         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #37  <Method Class Object.getClass()>
		//   16   32:invokevirtual   #278 <Method String Class.getName()>
		//   17   35:putfield        #281 <Field String Runtime$RemoteObject.className>
			objectprotocontainer.description = Runtime.getPropertyClassName(obj);
		//   18   38:aload_1         
		//   19   39:aload_2         
		//   20   40:invokestatic    #284 <Method String Runtime.access$300(Object)>
		//   21   43:putfield        #287 <Field String Runtime$RemoteObject.description>
			objectprotocontainer.objectId = String.valueOf(mObjects.putObject(obj));
		//   22   46:aload_1         
		//   23   47:aload_0         
		//   24   48:getfield        #23  <Field ObjectIdMapper mObjects>
		//   25   51:aload_2         
		//   26   52:invokevirtual   #290 <Method int ObjectIdMapper.putObject(Object)>
		//   27   55:invokestatic    #162 <Method String String.valueOf(int)>
		//   28   58:putfield        #293 <Field String Runtime$RemoteObject.objectId>
			obj = ((Object) (new PropertyDescriptor()));
		//   29   61:new             #155 <Class Runtime$PropertyDescriptor>
		//   30   64:dup             
		//   31   65:aconst_null     
		//   32   66:invokespecial   #156 <Method void Runtime$PropertyDescriptor(Runtime$1)>
		//   33   69:astore_2        
			obj.name = "1";
		//   34   70:aload_2         
		//   35   71:ldc2            #295 <String "1">
		//   36   74:putfield        #165 <Field String Runtime$PropertyDescriptor.name>
			obj.value = ((RemoteObject) (objectprotocontainer));
		//   37   77:aload_2         
		//   38   78:aload_1         
		//   39   79:putfield        #168 <Field Runtime$RemoteObject Runtime$PropertyDescriptor.value>
			objectprotocontainer = ((ObjectProtoContainer) (new GetPropertiesResponse()));
		//   40   82:new             #136 <Class Runtime$GetPropertiesResponse>
		//   41   85:dup             
		//   42   86:aconst_null     
		//   43   87:invokespecial   #137 <Method void Runtime$GetPropertiesResponse(Runtime$1)>
		//   44   90:astore_1        
			objectprotocontainer.result = ((List) (new ArrayList(1)));
		//   45   91:aload_1         
		//   46   92:new             #65  <Class ArrayList>
		//   47   95:dup             
		//   48   96:iconst_1        
		//   49   97:invokespecial   #68  <Method void ArrayList(int)>
		//   50  100:putfield        #171 <Field List Runtime$GetPropertiesResponse.result>
			((GetPropertiesResponse) (objectprotocontainer)).result.add(obj);
		//   51  103:aload_1         
		//   52  104:getfield        #171 <Field List Runtime$GetPropertiesResponse.result>
		//   53  107:aload_2         
		//   54  108:invokeinterface #78  <Method boolean List.add(Object)>
		//   55  113:pop             
			return ((GetPropertiesResponse) (objectprotocontainer));
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

		public EvaluateResponse evaluate(RuntimeReplFactory runtimereplfactory, JSONObject jsonobject)
		{
			jsonobject = ((JSONObject) ((EvaluateRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Runtime$EvaluateRequest)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ObjectMapper mObjectMapper>
		//    2    4:aload_2         
		//    3    5:ldc2            #313 <Class Runtime$EvaluateRequest>
		//    4    8:invokevirtual   #317 <Method Object ObjectMapper.convertValue(Object, Class)>
		//    5   11:checkcast       #313 <Class Runtime$EvaluateRequest>
		//    6   14:astore_2        
			try
			{
				if(!((EvaluateRequest) (jsonobject)).objectGroup.equals("console"))
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
				runtimereplfactory = ((RuntimeReplFactory) (buildNormalResponse(getRepl(runtimereplfactory).evaluate(((EvaluateRequest) (jsonobject)).expression))));
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
			return ((EvaluateResponse) (runtimereplfactory));
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
				com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode errorcode = com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.INVALID_REQUEST;
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
				throw new JsonRpcException(new JsonRpcError(errorcode, stringbuilder.toString(), ((JSONObject) (null))));
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

		public GetPropertiesResponse getProperties(JSONObject jsonobject)
			throws JsonRpcException
		{
			jsonobject = ((JSONObject) ((GetPropertiesRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Runtime$GetPropertiesRequest)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ObjectMapper mObjectMapper>
		//    2    4:aload_1         
		//    3    5:ldc2            #379 <Class Runtime$GetPropertiesRequest>
		//    4    8:invokevirtual   #317 <Method Object ObjectMapper.convertValue(Object, Class)>
		//    5   11:checkcast       #379 <Class Runtime$GetPropertiesRequest>
		//    6   14:astore_1        
			if(!((GetPropertiesRequest) (jsonobject)).ownProperties)
		//*   7   15:aload_1         
		//*   8   16:getfield        #382 <Field boolean Runtime$GetPropertiesRequest.ownProperties>
		//*   9   19:ifne            44
			{
				jsonobject = ((JSONObject) (new GetPropertiesResponse()));
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
				return ((GetPropertiesResponse) (jsonobject));
		//   20   42:aload_1         
		//   21   43:areturn         
			}
			Object obj = getObjectOrThrow(((GetPropertiesRequest) (jsonobject)).objectId);
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
			if(jsonobject instanceof ObjectProtoContainer)
		//*  37   71:aload_1         
		//*  38   72:instanceof      #252 <Class Runtime$ObjectProtoContainer>
		//*  39   75:ifeq            87
				return getPropertiesForProtoContainer((ObjectProtoContainer)jsonobject);
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

		public RemoteObject objectForRemote(Object obj)
		{
			RemoteObject remoteobject = new RemoteObject();
		//    0    0:new             #258 <Class Runtime$RemoteObject>
		//    1    3:dup             
		//    2    4:invokespecial   #259 <Method void Runtime$RemoteObject()>
		//    3    7:astore_2        
			if(obj == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       35
			{
				remoteobject.type = ObjectType.OBJECT;
		//    6   12:aload_2         
		//    7   13:getstatic       #265 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
		//    8   16:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
				remoteobject.subtype = ObjectSubType.NULL;
		//    9   19:aload_2         
		//   10   20:getstatic       #398 <Field Runtime$ObjectSubType Runtime$ObjectSubType.NULL>
		//   11   23:putfield        #277 <Field Runtime$ObjectSubType Runtime$RemoteObject.subtype>
				remoteobject.value = JSONObject.NULL;
		//   12   26:aload_2         
		//   13   27:getstatic       #402 <Field Object JSONObject.NULL>
		//   14   30:putfield        #404 <Field Object Runtime$RemoteObject.value>
				return remoteobject;
		//   15   33:aload_2         
		//   16   34:areturn         
			}
			if(obj instanceof Boolean)
		//*  17   35:aload_1         
		//*  18   36:instanceof      #406 <Class Boolean>
		//*  19   39:ifeq            56
			{
				remoteobject.type = ObjectType.BOOLEAN;
		//   20   42:aload_2         
		//   21   43:getstatic       #409 <Field Runtime$ObjectType Runtime$ObjectType.BOOLEAN>
		//   22   46:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
				remoteobject.value = obj;
		//   23   49:aload_2         
		//   24   50:aload_1         
		//   25   51:putfield        #404 <Field Object Runtime$RemoteObject.value>
				return remoteobject;
		//   26   54:aload_2         
		//   27   55:areturn         
			}
			if(obj instanceof Number)
		//*  28   56:aload_1         
		//*  29   57:instanceof      #411 <Class Number>
		//*  30   60:ifeq            77
			{
				remoteobject.type = ObjectType.NUMBER;
		//   31   63:aload_2         
		//   32   64:getstatic       #414 <Field Runtime$ObjectType Runtime$ObjectType.NUMBER>
		//   33   67:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
				remoteobject.value = obj;
		//   34   70:aload_2         
		//   35   71:aload_1         
		//   36   72:putfield        #404 <Field Object Runtime$RemoteObject.value>
				return remoteobject;
		//   37   75:aload_2         
		//   38   76:areturn         
			}
			if(obj instanceof Character)
		//*  39   77:aload_1         
		//*  40   78:instanceof      #416 <Class Character>
		//*  41   81:ifeq            107
			{
				remoteobject.type = ObjectType.NUMBER;
		//   42   84:aload_2         
		//   43   85:getstatic       #414 <Field Runtime$ObjectType Runtime$ObjectType.NUMBER>
		//   44   88:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
				remoteobject.value = ((Object) (Integer.valueOf(((int) (((Character)obj).charValue())))));
		//   45   91:aload_2         
		//   46   92:aload_1         
		//   47   93:checkcast       #416 <Class Character>
		//   48   96:invokevirtual   #420 <Method char Character.charValue()>
		//   49   99:invokestatic    #423 <Method Integer Integer.valueOf(int)>
		//   50  102:putfield        #404 <Field Object Runtime$RemoteObject.value>
				return remoteobject;
		//   51  105:aload_2         
		//   52  106:areturn         
			}
			if(obj instanceof String)
		//*  53  107:aload_1         
		//*  54  108:instanceof      #158 <Class String>
		//*  55  111:ifeq            131
			{
				remoteobject.type = ObjectType.STRING;
		//   56  114:aload_2         
		//   57  115:getstatic       #426 <Field Runtime$ObjectType Runtime$ObjectType.STRING>
		//   58  118:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
				remoteobject.value = ((Object) (String.valueOf(obj)));
		//   59  121:aload_2         
		//   60  122:aload_1         
		//   61  123:invokestatic    #191 <Method String String.valueOf(Object)>
		//   62  126:putfield        #404 <Field Object Runtime$RemoteObject.value>
				return remoteobject;
		//   63  129:aload_2         
		//   64  130:areturn         
			}
			remoteobject.type = ObjectType.OBJECT;
		//   65  131:aload_2         
		//   66  132:getstatic       #265 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
		//   67  135:putfield        #268 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			remoteobject.className = "What??";
		//   68  138:aload_2         
		//   69  139:ldc2            #428 <String "What??">
		//   70  142:putfield        #281 <Field String Runtime$RemoteObject.className>
			remoteobject.objectId = String.valueOf(mObjects.putObject(obj));
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
				remoteobject.description = "array";
		//   82  170:aload_2         
		//   83  171:ldc2            #430 <String "array">
		//   84  174:putfield        #287 <Field String Runtime$RemoteObject.description>
				return remoteobject;
		//   85  177:aload_2         
		//   86  178:areturn         
			}
			if(obj instanceof List)
		//*  87  179:aload_1         
		//*  88  180:instanceof      #74  <Class List>
		//*  89  183:ifeq            195
			{
				remoteobject.description = "List";
		//   90  186:aload_2         
		//   91  187:ldc2            #432 <String "List">
		//   92  190:putfield        #287 <Field String Runtime$RemoteObject.description>
				return remoteobject;
		//   93  193:aload_2         
		//   94  194:areturn         
			}
			if(obj instanceof Set)
		//*  95  195:aload_1         
		//*  96  196:instanceof      #182 <Class Set>
		//*  97  199:ifeq            211
			{
				remoteobject.description = "Set";
		//   98  202:aload_2         
		//   99  203:ldc2            #434 <String "Set">
		//  100  206:putfield        #287 <Field String Runtime$RemoteObject.description>
				return remoteobject;
		//  101  209:aload_2         
		//  102  210:areturn         
			}
			if(obj instanceof Map)
		//* 103  211:aload_1         
		//* 104  212:instanceof      #176 <Class Map>
		//* 105  215:ifeq            227
			{
				remoteobject.description = "Map";
		//  106  218:aload_2         
		//  107  219:ldc2            #436 <String "Map">
		//  108  222:putfield        #287 <Field String Runtime$RemoteObject.description>
				return remoteobject;
		//  109  225:aload_2         
		//  110  226:areturn         
			} else
			{
				remoteobject.description = Runtime.getPropertyClassName(obj);
		//  111  227:aload_2         
		//  112  228:aload_1         
		//  113  229:invokestatic    #284 <Method String Runtime.access$300(Object)>
		//  114  232:putfield        #287 <Field String Runtime$RemoteObject.description>
				return remoteobject;
		//  115  235:aload_2         
		//  116  236:areturn         
			}
		}

		private final ObjectMapper mObjectMapper;
		private final ObjectIdMapper mObjects;
		private RuntimeRepl mRepl;

		private Session()
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

	}


	public Runtime()
	{
		this(new RuntimeReplFactory() {

			public RuntimeRepl newInstance()
			{
				return new RuntimeRepl() {

					public Object evaluate(String s)
						throws Throwable
					{
						return ((Object) ("Not supported with legacy Runtime module"));
					//    0    0:ldc1            #27  <String "Not supported with legacy Runtime module">
					//    1    2:areturn         
					}

					final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Runtime$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
;
			//    0    0:new             #13  <Class Runtime$1$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void Runtime$1$1(Runtime$1)>
			//    4    8:areturn         
			}

		}
);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class Runtime$1>
	//    2    4:dup             
	//    3    5:invokespecial   #79  <Method void Runtime$1()>
	//    4    8:invokespecial   #82  <Method void Runtime(RuntimeReplFactory)>
	//    5   11:return          
	}

	public Runtime(Context context)
	{
		this(((RuntimeReplFactory) (new RhinoDetectingRuntimeReplFactory(context))));
	//    0    0:aload_0         
	//    1    1:new             #86  <Class RhinoDetectingRuntimeReplFactory>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #88  <Method void RhinoDetectingRuntimeReplFactory(Context)>
	//    5    9:invokespecial   #82  <Method void Runtime(RuntimeReplFactory)>
	//    6   12:return          
	}

	public Runtime(RuntimeReplFactory runtimereplfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void Object()>
		mObjectMapper = new ObjectMapper();
	//    2    4:aload_0         
	//    3    5:new             #91  <Class ObjectMapper>
	//    4    8:dup             
	//    5    9:invokespecial   #92  <Method void ObjectMapper()>
	//    6   12:putfield        #94  <Field ObjectMapper mObjectMapper>
		mReplFactory = runtimereplfactory;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #96  <Field RuntimeReplFactory mReplFactory>
	//   10   20:return          
	}

	private static String getPropertyClassName(Object obj)
	{
		String s;
label0:
		{
			String s1 = obj.getClass().getSimpleName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #113 <Method String Class.getSimpleName()>
	//    3    7:astore_2        
			if(s1 != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          21
			{
				s = s1;
	//    6   12:aload_2         
	//    7   13:astore_1        
				if(s1.length() != 0)
					break label0;
	//    8   14:aload_2         
	//    9   15:invokevirtual   #119 <Method int String.length()>
	//   10   18:ifne            29
			}
			s = obj.getClass().getName();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #107 <Method Class Object.getClass()>
	//   13   25:invokevirtual   #122 <Method String Class.getName()>
	//   14   28:astore_1        
		}
		return s;
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	private static Session getSession(JsonRpcPeer jsonrpcpeer)
	{
		com/facebook/stetho/inspector/protocol/module/Runtime;
	//    0    0:ldc1            #2   <Class Runtime>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Session session1 = (Session)sSessions.get(((Object) (jsonrpcpeer)));
	//    2    3:getstatic       #76  <Field Map sSessions>
	//    3    6:aload_0         
	//    4    7:invokeinterface #131 <Method Object Map.get(Object)>
	//    5   12:checkcast       #53  <Class Runtime$Session>
	//    6   15:astore_2        
		Session session;
		session = session1;
	//    7   16:aload_2         
	//    8   17:astore_1        
		if(session1 != null)
			break MISSING_BLOCK_LABEL_54;
	//    9   18:aload_2         
	//   10   19:ifnonnull       54
		session = new Session();
	//   11   22:new             #53  <Class Runtime$Session>
	//   12   25:dup             
	//   13   26:aconst_null     
	//   14   27:invokespecial   #134 <Method void Runtime$Session(Runtime$1)>
	//   15   30:astore_1        
		sSessions.put(((Object) (jsonrpcpeer)), ((Object) (session)));
	//   16   31:getstatic       #76  <Field Map sSessions>
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokeinterface #138 <Method Object Map.put(Object, Object)>
	//   20   41:pop             
		jsonrpcpeer.registerDisconnectReceiver(new DisconnectReceiver(jsonrpcpeer) {

			public void onDisconnect()
			{
				Runtime.sSessions.remove(((Object) (peer)));
			//    0    0:invokestatic    #26  <Method Map Runtime.access$100()>
			//    1    3:aload_0         
			//    2    4:getfield        #17  <Field JsonRpcPeer val$peer>
			//    3    7:invokeinterface #32  <Method Object Map.remove(Object)>
			//    4   12:pop             
			//    5   13:return          
			}

			final JsonRpcPeer val$peer;

			
			{
				peer = jsonrpcpeer;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field JsonRpcPeer val$peer>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   21   42:aload_0         
	//   22   43:new             #12  <Class Runtime$2>
	//   23   46:dup             
	//   24   47:aload_0         
	//   25   48:invokespecial   #141 <Method void Runtime$2(JsonRpcPeer)>
	//   26   51:invokevirtual   #147 <Method void JsonRpcPeer.registerDisconnectReceiver(DisconnectReceiver)>
		com/facebook/stetho/inspector/protocol/module/Runtime;
	//   27   54:ldc1            #2   <Class Runtime>
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return session;
	//   29   57:aload_1         
	//   30   58:areturn         
		jsonrpcpeer;
	//   31   59:astore_0        
	//*  32   60:ldc1            #2   <Class Runtime>
		throw jsonrpcpeer;
	//   33   62:monitorexit     
	//   34   63:aload_0         
	//   35   64:athrow          
	}

	public static int mapObject(JsonRpcPeer jsonrpcpeer, Object obj)
	{
		return getSession(jsonrpcpeer).getObjects().putObject(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #151 <Method Runtime$Session getSession(JsonRpcPeer)>
	//    2    4:invokevirtual   #155 <Method ObjectIdMapper Runtime$Session.getObjects()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #161 <Method int ObjectIdMapper.putObject(Object)>
	//    5   11:ireturn         
	}

	public CallFunctionOnResponse callFunctionOn(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JsonRpcException
	{
		jsonobject = ((JSONObject) ((CallFunctionOnRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Runtime$CallFunctionOnRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #17  <Class Runtime$CallFunctionOnRequest>
	//    4    7:invokevirtual   #170 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #17  <Class Runtime$CallFunctionOnRequest>
	//    6   13:astore_2        
		jsonrpcpeer = ((JsonRpcPeer) (getSession(jsonrpcpeer)));
	//    7   14:aload_1         
	//    8   15:invokestatic    #151 <Method Runtime$Session getSession(JsonRpcPeer)>
	//    9   18:astore_1        
		Object obj = ((Session) (jsonrpcpeer)).getObjectOrThrow(((CallFunctionOnRequest) (jsonobject)).objectId);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:getfield        #174 <Field String Runtime$CallFunctionOnRequest.objectId>
	//   13   24:invokevirtual   #178 <Method Object Runtime$Session.getObjectOrThrow(String)>
	//   14   27:astore_3        
		if(((CallFunctionOnRequest) (jsonobject)).functionDeclaration.startsWith("function protoList("))
	//*  15   28:aload_2         
	//*  16   29:getfield        #181 <Field String Runtime$CallFunctionOnRequest.functionDeclaration>
	//*  17   32:ldc1            #183 <String "function protoList(">
	//*  18   34:invokevirtual   #187 <Method boolean String.startsWith(String)>
	//*  19   37:ifeq            131
		{
			ObjectProtoContainer objectprotocontainer = new ObjectProtoContainer(obj);
	//   20   40:new             #38  <Class Runtime$ObjectProtoContainer>
	//   21   43:dup             
	//   22   44:aload_3         
	//   23   45:invokespecial   #190 <Method void Runtime$ObjectProtoContainer(Object)>
	//   24   48:astore          4
			jsonobject = ((JSONObject) (new RemoteObject()));
	//   25   50:new             #50  <Class Runtime$RemoteObject>
	//   26   53:dup             
	//   27   54:invokespecial   #191 <Method void Runtime$RemoteObject()>
	//   28   57:astore_2        
			jsonobject.type = ObjectType.OBJECT;
	//   29   58:aload_2         
	//   30   59:getstatic       #195 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
	//   31   62:putfield        #198 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			jsonobject.subtype = ObjectSubType.NODE;
	//   32   65:aload_2         
	//   33   66:getstatic       #202 <Field Runtime$ObjectSubType Runtime$ObjectSubType.NODE>
	//   34   69:putfield        #205 <Field Runtime$ObjectSubType Runtime$RemoteObject.subtype>
			jsonobject.className = obj.getClass().getName();
	//   35   72:aload_2         
	//   36   73:aload_3         
	//   37   74:invokevirtual   #107 <Method Class Object.getClass()>
	//   38   77:invokevirtual   #122 <Method String Class.getName()>
	//   39   80:putfield        #208 <Field String Runtime$RemoteObject.className>
			jsonobject.description = getPropertyClassName(obj);
	//   40   83:aload_2         
	//   41   84:aload_3         
	//   42   85:invokestatic    #103 <Method String getPropertyClassName(Object)>
	//   43   88:putfield        #211 <Field String Runtime$RemoteObject.description>
			jsonobject.objectId = String.valueOf(((Session) (jsonrpcpeer)).getObjects().putObject(((Object) (objectprotocontainer))));
	//   44   91:aload_2         
	//   45   92:aload_1         
	//   46   93:invokevirtual   #155 <Method ObjectIdMapper Runtime$Session.getObjects()>
	//   47   96:aload           4
	//   48   98:invokevirtual   #161 <Method int ObjectIdMapper.putObject(Object)>
	//   49  101:invokestatic    #215 <Method String String.valueOf(int)>
	//   50  104:putfield        #216 <Field String Runtime$RemoteObject.objectId>
			jsonrpcpeer = ((JsonRpcPeer) (new CallFunctionOnResponse()));
	//   51  107:new             #20  <Class Runtime$CallFunctionOnResponse>
	//   52  110:dup             
	//   53  111:aconst_null     
	//   54  112:invokespecial   #217 <Method void Runtime$CallFunctionOnResponse(Runtime$1)>
	//   55  115:astore_1        
			jsonrpcpeer.result = ((RemoteObject) (jsonobject));
	//   56  116:aload_1         
	//   57  117:aload_2         
	//   58  118:putfield        #221 <Field Runtime$RemoteObject Runtime$CallFunctionOnResponse.result>
			jsonrpcpeer.wasThrown = Boolean.valueOf(false);
	//   59  121:aload_1         
	//   60  122:iconst_0        
	//   61  123:invokestatic    #226 <Method Boolean Boolean.valueOf(boolean)>
	//   62  126:putfield        #230 <Field Boolean Runtime$CallFunctionOnResponse.wasThrown>
			return ((CallFunctionOnResponse) (jsonrpcpeer));
	//   63  129:aload_1         
	//   64  130:areturn         
		} else
		{
			jsonrpcpeer = ((JsonRpcPeer) (com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.INTERNAL_ERROR));
	//   65  131:getstatic       #236 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.INTERNAL_ERROR>
	//   66  134:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   67  135:new             #238 <Class StringBuilder>
	//   68  138:dup             
	//   69  139:invokespecial   #239 <Method void StringBuilder()>
	//   70  142:astore_3        
			stringbuilder.append("Expected protoList, got: ");
	//   71  143:aload_3         
	//   72  144:ldc1            #241 <String "Expected protoList, got: ">
	//   73  146:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//   74  149:pop             
			stringbuilder.append(((CallFunctionOnRequest) (jsonobject)).functionDeclaration);
	//   75  150:aload_3         
	//   76  151:aload_2         
	//   77  152:getfield        #181 <Field String Runtime$CallFunctionOnRequest.functionDeclaration>
	//   78  155:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
			throw new JsonRpcException(new JsonRpcError(((com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode) (jsonrpcpeer)), stringbuilder.toString(), ((JSONObject) (null))));
	//   80  159:new             #165 <Class JsonRpcException>
	//   81  162:dup             
	//   82  163:new             #247 <Class JsonRpcError>
	//   83  166:dup             
	//   84  167:aload_1         
	//   85  168:aload_3         
	//   86  169:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   87  172:aconst_null     
	//   88  173:invokespecial   #253 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//   89  176:invokespecial   #256 <Method void JsonRpcException(JsonRpcError)>
	//   90  179:athrow          
		}
	}

	public JsonRpcResult evaluate(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		return ((JsonRpcResult) (getSession(jsonrpcpeer).evaluate(mReplFactory, jsonobject)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method Runtime$Session getSession(JsonRpcPeer)>
	//    2    4:aload_0         
	//    3    5:getfield        #96  <Field RuntimeReplFactory mReplFactory>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #262 <Method Runtime$EvaluateResponse Runtime$Session.evaluate(RuntimeReplFactory, JSONObject)>
	//    6   12:areturn         
	}

	public JsonRpcResult getProperties(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JsonRpcException
	{
		return ((JsonRpcResult) (getSession(jsonrpcpeer).getProperties(jsonobject)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method Runtime$Session getSession(JsonRpcPeer)>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #266 <Method Runtime$GetPropertiesResponse Runtime$Session.getProperties(JSONObject)>
	//    4    8:areturn         
	}

	public void releaseObject(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JSONException
	{
		jsonobject = ((JSONObject) (jsonobject.getString("objectId")));
	//    0    0:aload_2         
	//    1    1:ldc2            #271 <String "objectId">
	//    2    4:invokevirtual   #277 <Method String JSONObject.getString(String)>
	//    3    7:astore_2        
		getSession(jsonrpcpeer).getObjects().removeObjectById(Integer.parseInt(((String) (jsonobject))));
	//    4    8:aload_1         
	//    5    9:invokestatic    #151 <Method Runtime$Session getSession(JsonRpcPeer)>
	//    6   12:invokevirtual   #155 <Method ObjectIdMapper Runtime$Session.getObjects()>
	//    7   15:aload_2         
	//    8   16:invokestatic    #283 <Method int Integer.parseInt(String)>
	//    9   19:invokevirtual   #287 <Method Object ObjectIdMapper.removeObjectById(int)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void releaseObjectGroup(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) (new StringBuilder()));
	//    0    0:new             #238 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #239 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (jsonrpcpeer)).append("Ignoring request to releaseObjectGroup: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #290 <String "Ignoring request to releaseObjectGroup: ">
	//    6   12:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (jsonrpcpeer)).append(((Object) (jsonobject)));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #293 <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		LogUtil.w(((StringBuilder) (jsonrpcpeer)).toString());
	//   12   22:aload_1         
	//   13   23:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   14   26:invokestatic    #299 <Method void LogUtil.w(String)>
	//   15   29:return          
	}

	private static final Map sSessions = Collections.synchronizedMap(((Map) (new HashMap())));
	private final ObjectMapper mObjectMapper;
	private final RuntimeReplFactory mReplFactory;

	static 
	{
	//    0    0:new             #65  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void HashMap()>
	//    3    7:invokestatic    #74  <Method Map Collections.synchronizedMap(Map)>
	//    4   10:putstatic       #76  <Field Map sSessions>
	//*   5   13:return          
	}


/*
	static Map access$100()
	{
		return sSessions;
	//    0    0:getstatic       #76  <Field Map sSessions>
	//    1    3:areturn         
	}

*/


/*
	static String access$300(Object obj)
	{
		return getPropertyClassName(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #103 <Method String getPropertyClassName(Object)>
	//    2    4:areturn         
	}

*/
}
