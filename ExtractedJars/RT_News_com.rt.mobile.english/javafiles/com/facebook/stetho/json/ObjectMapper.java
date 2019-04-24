// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.json;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import java.lang.reflect.*;
import java.util.*;
import org.json.*;

public class ObjectMapper
{

	public ObjectMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private Object _convertFromJSONObject(JSONObject jsonobject, Class class1)
		throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, JSONException
	{
		Constructor constructor = class1.getDeclaredConstructor((Class[])null);
	//    0    0:aload_2         
	//    1    1:aconst_null     
	//    2    2:checkcast       #25  <Class Class[]>
	//    3    5:invokevirtual   #31  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    4    8:astore          4
		constructor.setAccessible(true);
	//    5   10:aload           4
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #37  <Method void Constructor.setAccessible(boolean)>
		int i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		Object obj1 = constructor.newInstance(new Object[0]);
	//   10   18:aload           4
	//   11   20:iconst_0        
	//   12   21:anewarray       Object[]
	//   13   24:invokevirtual   #41  <Method Object Constructor.newInstance(Object[])>
	//   14   27:astore          6
		Field afield[] = class1.getFields();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #45  <Method Field[] Class.getFields()>
	//   17   33:astore          7
		do
		{
			if(i >= afield.length)
				break;
	//   18   35:iload_3         
	//   19   36:aload           7
	//   20   38:arraylength     
	//   21   39:icmpge          182
			Field field = afield[i];
	//   22   42:aload           7
	//   23   44:iload_3         
	//   24   45:aaload          
	//   25   46:astore          4
			Object obj2 = jsonobject.opt(field.getName());
	//   26   48:aload_1         
	//   27   49:aload           4
	//   28   51:invokevirtual   #51  <Method String Field.getName()>
	//   29   54:invokevirtual   #57  <Method Object JSONObject.opt(String)>
	//   30   57:astore          8
			Object obj = getValueForField(field, obj2);
	//   31   59:aload_0         
	//   32   60:aload           4
	//   33   62:aload           8
	//   34   64:invokespecial   #61  <Method Object getValueForField(Field, Object)>
	//   35   67:astore          5
			try
			{
				field.set(obj1, getValueForField(field, obj2));
	//   36   69:aload           4
	//   37   71:aload           6
	//   38   73:aload_0         
	//   39   74:aload           4
	//   40   76:aload           8
	//   41   78:invokespecial   #61  <Method Object getValueForField(Field, Object)>
	//   42   81:invokevirtual   #65  <Method void Field.set(Object, Object)>
			}
	//*  43   84:iload_3         
	//*  44   85:iconst_1        
	//*  45   86:iadd            
	//*  46   87:istore_3        
	//*  47   88:goto            35
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  48   91:astore_1        
			{
				obj1 = ((Object) (new StringBuilder()));
	//   49   92:new             #67  <Class StringBuilder>
	//   50   95:dup             
	//   51   96:invokespecial   #68  <Method void StringBuilder()>
	//   52   99:astore          6
				((StringBuilder) (obj1)).append("Class: ");
	//   53  101:aload           6
	//   54  103:ldc1            #70  <String "Class: ">
	//   55  105:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   56  108:pop             
				((StringBuilder) (obj1)).append(class1.getSimpleName());
	//   57  109:aload           6
	//   58  111:aload_2         
	//   59  112:invokevirtual   #77  <Method String Class.getSimpleName()>
	//   60  115:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   61  118:pop             
				((StringBuilder) (obj1)).append(" ");
	//   62  119:aload           6
	//   63  121:ldc1            #79  <String " ">
	//   64  123:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
				((StringBuilder) (obj1)).append("Field: ");
	//   66  127:aload           6
	//   67  129:ldc1            #81  <String "Field: ">
	//   68  131:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   69  134:pop             
				((StringBuilder) (obj1)).append(field.getName());
	//   70  135:aload           6
	//   71  137:aload           4
	//   72  139:invokevirtual   #51  <Method String Field.getName()>
	//   73  142:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   74  145:pop             
				((StringBuilder) (obj1)).append(" type ");
	//   75  146:aload           6
	//   76  148:ldc1            #83  <String " type ">
	//   77  150:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   78  153:pop             
				((StringBuilder) (obj1)).append(obj.getClass().getName());
	//   79  154:aload           6
	//   80  156:aload           5
	//   81  158:invokevirtual   #87  <Method Class Object.getClass()>
	//   82  161:invokevirtual   #88  <Method String Class.getName()>
	//   83  164:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   84  167:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj1)).toString(), ((Throwable) (jsonobject)));
	//   85  168:new             #23  <Class IllegalArgumentException>
	//   86  171:dup             
	//   87  172:aload           6
	//   88  174:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   89  177:aload_1         
	//   90  178:invokespecial   #94  <Method void IllegalArgumentException(String, Throwable)>
	//   91  181:athrow          
			}
			i++;
		} while(true);
		return obj1;
	//   92  182:aload           6
	//   93  184:areturn         
	}

	private JSONObject _convertToJSONObject(Object obj)
		throws JSONException, InvocationTargetException, IllegalAccessException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #53  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void JSONObject()>
	//    3    7:astore          5
		Field afield[] = obj.getClass().getFields();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #87  <Method Class Object.getClass()>
	//    6   13:invokevirtual   #45  <Method Field[] Class.getFields()>
	//    7   16:astore          6
		for(int i = 0; i < afield.length; i++)
	//*   8   18:iconst_0        
	//*   9   19:istore_2        
	//*  10   20:iload_2         
	//*  11   21:aload           6
	//*  12   23:arraylength     
	//*  13   24:icmpge          148
		{
			JsonProperty jsonproperty = (JsonProperty)afield[i].getAnnotation(com/facebook/stetho/json/annotation/JsonProperty);
	//   14   27:aload           6
	//   15   29:iload_2         
	//   16   30:aaload          
	//   17   31:ldc1            #102 <Class JsonProperty>
	//   18   33:invokevirtual   #106 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//   19   36:checkcast       #102 <Class JsonProperty>
	//   20   39:astore          8
			if(jsonproperty == null)
				continue;
	//   21   41:aload           8
	//   22   43:ifnull          141
			Object obj2 = afield[i].get(obj);
	//   23   46:aload           6
	//   24   48:iload_2         
	//   25   49:aaload          
	//   26   50:aload_1         
	//   27   51:invokevirtual   #110 <Method Object Field.get(Object)>
	//   28   54:astore          4
			Object obj1 = ((Object) (afield[i].getType()));
	//   29   56:aload           6
	//   30   58:iload_2         
	//   31   59:aaload          
	//   32   60:invokevirtual   #113 <Method Class Field.getType()>
	//   33   63:astore_3        
			if(obj2 != null)
	//*  34   64:aload           4
	//*  35   66:ifnull          75
				obj1 = ((Object) (obj2.getClass()));
	//   36   69:aload           4
	//   37   71:invokevirtual   #87  <Method Class Object.getClass()>
	//   38   74:astore_3        
			String s = afield[i].getName();
	//   39   75:aload           6
	//   40   77:iload_2         
	//   41   78:aaload          
	//   42   79:invokevirtual   #51  <Method String Field.getName()>
	//   43   82:astore          7
			if(jsonproperty.required() && obj2 == null)
	//*  44   84:aload           8
	//*  45   86:invokeinterface #117 <Method boolean JsonProperty.required()>
	//*  46   91:ifeq            106
	//*  47   94:aload           4
	//*  48   96:ifnonnull       106
				obj1 = JSONObject.NULL;
	//   49   99:getstatic       #121 <Field Object JSONObject.NULL>
	//   50  102:astore_3        
			else
	//*  51  103:goto            132
			if(obj2 == JSONObject.NULL)
	//*  52  106:aload           4
	//*  53  108:getstatic       #121 <Field Object JSONObject.NULL>
	//*  54  111:if_acmpne       120
				obj1 = obj2;
	//   55  114:aload           4
	//   56  116:astore_3        
			else
	//*  57  117:goto            132
				obj1 = getJsonValue(obj2, ((Class) (obj1)), afield[i]);
	//   58  120:aload_0         
	//   59  121:aload           4
	//   60  123:aload_3         
	//   61  124:aload           6
	//   62  126:iload_2         
	//   63  127:aaload          
	//   64  128:invokespecial   #125 <Method Object getJsonValue(Object, Class, Field)>
	//   65  131:astore_3        
			jsonobject.put(s, obj1);
	//   66  132:aload           5
	//   67  134:aload           7
	//   68  136:aload_3         
	//   69  137:invokevirtual   #129 <Method JSONObject JSONObject.put(String, Object)>
	//   70  140:pop             
		}

	//   71  141:iload_2         
	//   72  142:iconst_1        
	//   73  143:iadd            
	//   74  144:istore_2        
	//*  75  145:goto            20
		return jsonobject;
	//   76  148:aload           5
	//   77  150:areturn         
	}

	private static boolean canDirectlySerializeClass(Class class1)
	{
		return isWrapperOrPrimitiveType(class1) || ((Object) (class1)).equals(java/lang/String);
	//    0    0:aload_0         
	//    1    1:invokestatic    #134 <Method boolean isWrapperOrPrimitiveType(Class)>
	//    2    4:ifne            21
	//    3    7:aload_0         
	//    4    8:ldc1            #136 <Class String>
	//    5   10:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//    6   13:ifeq            19
	//    7   16:goto            21
	//    8   19:iconst_0        
	//    9   20:ireturn         
	//   10   21:iconst_1        
	//   11   22:ireturn         
	}

	private List convertArrayToList(Field field, JSONArray jsonarray)
		throws IllegalAccessException, JSONException
	{
		if(((Class) (java/util/List)).isAssignableFrom(field.getType()))
	//*   0    0:ldc1            #144 <Class List>
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #113 <Method Class Field.getType()>
	//*   3    6:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//*   4    9:ifeq            196
		{
			java.lang.reflect.Type atype[] = ((ParameterizedType)field.getGenericType()).getActualTypeArguments();
	//    5   12:aload_1         
	//    6   13:invokevirtual   #151 <Method java.lang.reflect.Type Field.getGenericType()>
	//    7   16:checkcast       #153 <Class ParameterizedType>
	//    8   19:invokeinterface #157 <Method java.lang.reflect.Type[] ParameterizedType.getActualTypeArguments()>
	//    9   24:astore          4
			if(atype.length != 1)
	//*  10   26:aload           4
	//*  11   28:arraylength     
	//*  12   29:iconst_1        
	//*  13   30:icmpeq          69
			{
				jsonarray = ((JSONArray) (new StringBuilder()));
	//   14   33:new             #67  <Class StringBuilder>
	//   15   36:dup             
	//   16   37:invokespecial   #68  <Method void StringBuilder()>
	//   17   40:astore_2        
				((StringBuilder) (jsonarray)).append("Only able to handle a single type in a list ");
	//   18   41:aload_2         
	//   19   42:ldc1            #159 <String "Only able to handle a single type in a list ">
	//   20   44:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
				((StringBuilder) (jsonarray)).append(field.getName());
	//   22   48:aload_2         
	//   23   49:aload_1         
	//   24   50:invokevirtual   #51  <Method String Field.getName()>
	//   25   53:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				throw new IllegalArgumentException(((StringBuilder) (jsonarray)).toString());
	//   27   57:new             #23  <Class IllegalArgumentException>
	//   28   60:dup             
	//   29   61:aload_2         
	//   30   62:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   31   65:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   32   68:athrow          
			}
			int i = 0;
	//   33   69:iconst_0        
	//   34   70:istore_3        
			field = ((Field) ((Class)atype[0]));
	//   35   71:aload           4
	//   36   73:iconst_0        
	//   37   74:aaload          
	//   38   75:checkcast       #27  <Class Class>
	//   39   78:astore_1        
			ArrayList arraylist = new ArrayList();
	//   40   79:new             #164 <Class ArrayList>
	//   41   82:dup             
	//   42   83:invokespecial   #165 <Method void ArrayList()>
	//   43   86:astore          4
			for(; i < jsonarray.length(); i++)
	//*  44   88:iload_3         
	//*  45   89:aload_2         
	//*  46   90:invokevirtual   #171 <Method int JSONArray.length()>
	//*  47   93:icmpge          193
			{
				if(((Class) (field)).isEnum())
	//*  48   96:aload_1         
	//*  49   97:invokevirtual   #174 <Method boolean Class.isEnum()>
	//*  50  100:ifeq            124
				{
					((List) (arraylist)).add(((Object) (getEnumValue(jsonarray.getString(i), ((Class) (field))))));
	//   51  103:aload           4
	//   52  105:aload_0         
	//   53  106:aload_2         
	//   54  107:iload_3         
	//   55  108:invokevirtual   #178 <Method String JSONArray.getString(int)>
	//   56  111:aload_1         
	//   57  112:invokespecial   #182 <Method Enum getEnumValue(String, Class)>
	//   58  115:invokeinterface #185 <Method boolean List.add(Object)>
	//   59  120:pop             
					continue;
	//   60  121:goto            186
				}
				if(canDirectlySerializeClass(((Class) (field))))
	//*  61  124:aload_1         
	//*  62  125:invokestatic    #187 <Method boolean canDirectlySerializeClass(Class)>
	//*  63  128:ifeq            147
				{
					((List) (arraylist)).add(jsonarray.get(i));
	//   64  131:aload           4
	//   65  133:aload_2         
	//   66  134:iload_3         
	//   67  135:invokevirtual   #190 <Method Object JSONArray.get(int)>
	//   68  138:invokeinterface #185 <Method boolean List.add(Object)>
	//   69  143:pop             
					continue;
	//   70  144:goto            186
				}
				JSONObject jsonobject = jsonarray.getJSONObject(i);
	//   71  147:aload_2         
	//   72  148:iload_3         
	//   73  149:invokevirtual   #194 <Method JSONObject JSONArray.getJSONObject(int)>
	//   74  152:astore          5
				if(jsonobject == null)
	//*  75  154:aload           5
	//*  76  156:ifnonnull       171
					((List) (arraylist)).add(((Object) (null)));
	//   77  159:aload           4
	//   78  161:aconst_null     
	//   79  162:invokeinterface #185 <Method boolean List.add(Object)>
	//   80  167:pop             
				else
	//*  81  168:goto            186
					((List) (arraylist)).add(convertValue(((Object) (jsonobject)), ((Class) (field))));
	//   82  171:aload           4
	//   83  173:aload_0         
	//   84  174:aload           5
	//   85  176:aload_1         
	//   86  177:invokevirtual   #198 <Method Object convertValue(Object, Class)>
	//   87  180:invokeinterface #185 <Method boolean List.add(Object)>
	//   88  185:pop             
			}

	//   89  186:iload_3         
	//   90  187:iconst_1        
	//   91  188:iadd            
	//   92  189:istore_3        
	//*  93  190:goto            88
			return ((List) (arraylist));
	//   94  193:aload           4
	//   95  195:areturn         
		} else
		{
			jsonarray = ((JSONArray) (new StringBuilder()));
	//   96  196:new             #67  <Class StringBuilder>
	//   97  199:dup             
	//   98  200:invokespecial   #68  <Method void StringBuilder()>
	//   99  203:astore_2        
			((StringBuilder) (jsonarray)).append("only know how to deserialize List<?> on field ");
	//  100  204:aload_2         
	//  101  205:ldc1            #200 <String "only know how to deserialize List<?> on field ">
	//  102  207:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  103  210:pop             
			((StringBuilder) (jsonarray)).append(field.getName());
	//  104  211:aload_2         
	//  105  212:aload_1         
	//  106  213:invokevirtual   #51  <Method String Field.getName()>
	//  107  216:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  108  219:pop             
			throw new IllegalArgumentException(((StringBuilder) (jsonarray)).toString());
	//  109  220:new             #23  <Class IllegalArgumentException>
	//  110  223:dup             
	//  111  224:aload_2         
	//  112  225:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  113  228:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//  114  231:athrow          
		}
	}

	private JSONArray convertListToJsonArray(Object obj)
		throws InvocationTargetException, IllegalAccessException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #167 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #204 <Method void JSONArray()>
	//    3    7:astore_2        
		for(Iterator iterator = ((List)obj).iterator(); iterator.hasNext(); jsonarray.put(obj))
	//*   4    8:aload_1         
	//*   5    9:checkcast       #144 <Class List>
	//*   6   12:invokeinterface #208 <Method Iterator List.iterator()>
	//*   7   17:astore_3        
	//*   8   18:aload_3         
	//*   9   19:invokeinterface #213 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            64
		{
			Object obj1 = iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #217 <Method Object Iterator.next()>
	//   13   33:astore          4
			obj = null;
	//   14   35:aconst_null     
	//   15   36:astore_1        
			if(obj1 != null)
	//*  16   37:aload           4
	//*  17   39:ifnull          55
				obj = getJsonValue(obj1, obj1.getClass(), ((Field) (null)));
	//   18   42:aload_0         
	//   19   43:aload           4
	//   20   45:aload           4
	//   21   47:invokevirtual   #87  <Method Class Object.getClass()>
	//   22   50:aconst_null     
	//   23   51:invokespecial   #125 <Method Object getJsonValue(Object, Class, Field)>
	//   24   54:astore_1        
		}

	//   25   55:aload_2         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #219 <Method JSONArray JSONArray.put(Object)>
	//   28   60:pop             
	//*  29   61:goto            18
		return jsonarray;
	//   30   64:aload_2         
	//   31   65:areturn         
	}

	private Enum getEnumByMethod(String s, Class class1, Method method)
	{
		int i;
		Enum aenum[];
		aenum = (Enum[])class1.getEnumConstants();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #227 <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #229 <Class Enum[]>
	//    3    7:astore          6
		i = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
_L3:
		if(i >= aenum.length) goto _L2; else goto _L1
	//    6   12:iload           4
	//    7   14:aload           6
	//    8   16:arraylength     
	//    9   17:icmpge          82
_L1:
		Enum enum = aenum[i];
	//   10   20:aload           6
	//   11   22:iload           4
	//   12   24:aaload          
	//   13   25:astore          7
		boolean flag;
		Object obj;
		try
		{
			obj = method.invoke(((Object) (enum)), new Object[0]);
	//   14   27:aload_3         
	//   15   28:aload           7
	//   16   30:iconst_0        
	//   17   31:anewarray       Object[]
	//   18   34:invokevirtual   #235 <Method Object Method.invoke(Object, Object[])>
	//   19   37:astore          8
		}
	//*  20   39:aload           8
	//*  21   41:ifnull          63
	//*  22   44:aload           8
	//*  23   46:invokevirtual   #236 <Method String Object.toString()>
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #237 <Method boolean String.equals(Object)>
	//*  26   53:istore          5
	//*  27   55:iload           5
	//*  28   57:ifeq            63
	//*  29   60:aload           7
	//*  30   62:areturn         
	//*  31   63:iload           4
	//*  32   65:iconst_1        
	//*  33   66:iadd            
	//*  34   67:istore          4
	//*  35   69:goto            12
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  36   72:astore_1        
		{
			throw new IllegalArgumentException(((Throwable) (s)));
	//   37   73:new             #23  <Class IllegalArgumentException>
	//   38   76:dup             
	//   39   77:aload_1         
	//   40   78:invokespecial   #240 <Method void IllegalArgumentException(Throwable)>
	//   41   81:athrow          
		}
		if(obj == null)
			continue; /* Loop/switch isn't completed */
		flag = obj.toString().equals(((Object) (s)));
		if(flag)
			return enum;
		i++;
		  goto _L3
_L2:
		method = ((Method) (new StringBuilder()));
	//   42   82:new             #67  <Class StringBuilder>
	//   43   85:dup             
	//   44   86:invokespecial   #68  <Method void StringBuilder()>
	//   45   89:astore_3        
		((StringBuilder) (method)).append("No enum constant ");
	//   46   90:aload_3         
	//   47   91:ldc1            #242 <String "No enum constant ">
	//   48   93:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   49   96:pop             
		((StringBuilder) (method)).append(class1.getName());
	//   50   97:aload_3         
	//   51   98:aload_2         
	//   52   99:invokevirtual   #88  <Method String Class.getName()>
	//   53  102:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   54  105:pop             
		((StringBuilder) (method)).append(".");
	//   55  106:aload_3         
	//   56  107:ldc1            #244 <String ".">
	//   57  109:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   58  112:pop             
		((StringBuilder) (method)).append(s);
	//   59  113:aload_3         
	//   60  114:aload_1         
	//   61  115:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   62  118:pop             
		throw new IllegalArgumentException(((StringBuilder) (method)).toString());
	//   63  119:new             #23  <Class IllegalArgumentException>
	//   64  122:dup             
	//   65  123:aload_3         
	//   66  124:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   67  127:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   68  130:athrow          
	}

	private Enum getEnumValue(String s, Class class1)
	{
		Method method = getJsonValueMethod(class1);
	//    0    0:aload_2         
	//    1    1:invokestatic    #249 <Method Method getJsonValueMethod(Class)>
	//    2    4:astore_3        
		if(method != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			return getEnumByMethod(s, class1, method);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #251 <Method Enum getEnumByMethod(String, Class, Method)>
	//   10   16:areturn         
		else
			return Enum.valueOf(class1, s);
	//   11   17:aload_2         
	//   12   18:aload_1         
	//   13   19:invokestatic    #257 <Method Enum Enum.valueOf(Class, String)>
	//   14   22:areturn         
	}

	private Object getJsonValue(Object obj, Class class1, Field field)
		throws InvocationTargetException, IllegalAccessException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(((Class) (java/util/List)).isAssignableFrom(class1))
	//*   4    6:ldc1            #144 <Class List>
	//*   5    8:aload_2         
	//*   6    9:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//*   7   12:ifeq            21
			return ((Object) (convertListToJsonArray(obj)));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokespecial   #260 <Method JSONArray convertListToJsonArray(Object)>
	//   11   20:areturn         
		field = ((Field) (getJsonValueMethod(class1)));
	//   12   21:aload_2         
	//   13   22:invokestatic    #249 <Method Method getJsonValueMethod(Class)>
	//   14   25:astore_3        
		if(field != null)
	//*  15   26:aload_3         
	//*  16   27:ifnull          40
			return ((Method) (field)).invoke(obj, new Object[0]);
	//   17   30:aload_3         
	//   18   31:aload_1         
	//   19   32:iconst_0        
	//   20   33:anewarray       Object[]
	//   21   36:invokevirtual   #235 <Method Object Method.invoke(Object, Object[])>
	//   22   39:areturn         
		if(!canDirectlySerializeClass(class1))
	//*  23   40:aload_2         
	//*  24   41:invokestatic    #187 <Method boolean canDirectlySerializeClass(Class)>
	//*  25   44:ifne            55
			return convertValue(obj, org/json/JSONObject);
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:ldc1            #53  <Class JSONObject>
	//   29   51:invokevirtual   #198 <Method Object convertValue(Object, Class)>
	//   30   54:areturn         
		else
			return obj;
	//   31   55:aload_1         
	//   32   56:areturn         
	}

	private static Method getJsonValueMethod(Class class1)
	{
		class1 = ((Class) (class1.getMethods()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method Method[] Class.getMethods()>
	//    2    4:astore_0        
		for(int i = 0; i < class1.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:icmpge          36
			if(((Method) (class1[i])).getAnnotation(com/facebook/stetho/json/annotation/JsonValue) != null)
	//*   9   13:aload_0         
	//*  10   14:iload_1         
	//*  11   15:aaload          
	//*  12   16:ldc2            #268 <Class JsonValue>
	//*  13   19:invokevirtual   #269 <Method java.lang.annotation.Annotation Method.getAnnotation(Class)>
	//*  14   22:ifnull          29
				return ((Method) (class1[i]));
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:aaload          
	//   18   28:areturn         

	//   19   29:iload_1         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_1        
	//*  23   33:goto            7
		return null;
	//   24   36:aconst_null     
	//   25   37:areturn         
	}

	private Object getValueForField(Field field, Object obj)
		throws JSONException
	{
		if(obj == null)
			break MISSING_BLOCK_LABEL_348;
	//    0    0:aload_2         
	//    1    1:ifnull          348
		if(obj == JSONObject.NULL)
	//*   2    4:aload_2         
	//*   3    5:getstatic       #121 <Field Object JSONObject.NULL>
	//*   4    8:if_acmpne       13
			return ((Object) (null));
	//    5   11:aconst_null     
	//    6   12:areturn         
		if(obj.getClass() == field.getType())
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #87  <Method Class Object.getClass()>
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #113 <Method Class Field.getType()>
	//*  11   21:if_acmpne       26
			return obj;
	//   12   24:aload_2         
	//   13   25:areturn         
		int i;
		Object obj1;
		try
		{
			if(obj instanceof JSONObject)
	//*  14   26:aload_2         
	//*  15   27:instanceof      #53  <Class JSONObject>
	//*  16   30:ifeq            43
				return convertValue(obj, field.getType());
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #113 <Method Class Field.getType()>
	//   21   39:invokevirtual   #198 <Method Object convertValue(Object, Class)>
	//   22   42:areturn         
			if(field.getType().isEnum())
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #113 <Method Class Field.getType()>
	//*  25   47:invokevirtual   #174 <Method boolean Class.isEnum()>
	//*  26   50:ifeq            71
				return ((Object) (getEnumValue((String)obj, field.getType().asSubclass(java/lang/Enum))));
	//   27   53:aload_0         
	//   28   54:aload_2         
	//   29   55:checkcast       #136 <Class String>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #113 <Method Class Field.getType()>
	//   32   62:ldc1            #253 <Class Enum>
	//   33   64:invokevirtual   #275 <Method Class Class.asSubclass(Class)>
	//   34   67:invokespecial   #182 <Method Enum getEnumValue(String, Class)>
	//   35   70:areturn         
			if(obj instanceof JSONArray)
	//*  36   71:aload_2         
	//*  37   72:instanceof      #167 <Class JSONArray>
	//*  38   75:ifeq            88
				return ((Object) (convertArrayToList(field, (JSONArray)obj)));
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:aload_2         
	//   42   81:checkcast       #167 <Class JSONArray>
	//   43   84:invokespecial   #277 <Method List convertArrayToList(Field, JSONArray)>
	//   44   87:areturn         
			if(!(obj instanceof Number))
				break MISSING_BLOCK_LABEL_348;
	//   45   88:aload_2         
	//   46   89:instanceof      #279 <Class Number>
	//   47   92:ifeq            348
			obj1 = ((Object) ((Number)obj));
	//   48   95:aload_2         
	//   49   96:checkcast       #279 <Class Number>
	//   50   99:astore          4
			obj = ((Object) (field.getType()));
	//   51  101:aload_1         
	//   52  102:invokevirtual   #113 <Method Class Field.getType()>
	//   53  105:astore_2        
		}
	//*  54  106:aload_2         
	//*  55  107:ldc2            #281 <Class Integer>
	//*  56  110:if_acmpeq       294
	//*  57  113:aload_2         
	//*  58  114:getstatic       #285 <Field Class Integer.TYPE>
	//*  59  117:if_acmpne       123
	//*  60  120:goto            294
	//*  61  123:aload_2         
	//*  62  124:ldc2            #287 <Class Long>
	//*  63  127:if_acmpeq       285
	//*  64  130:aload_2         
	//*  65  131:getstatic       #288 <Field Class Long.TYPE>
	//*  66  134:if_acmpne       140
	//*  67  137:goto            285
	//*  68  140:aload_2         
	//*  69  141:ldc2            #290 <Class Double>
	//*  70  144:if_acmpeq       276
	//*  71  147:aload_2         
	//*  72  148:getstatic       #291 <Field Class Double.TYPE>
	//*  73  151:if_acmpne       157
	//*  74  154:goto            276
	//*  75  157:aload_2         
	//*  76  158:ldc2            #293 <Class Float>
	//*  77  161:if_acmpeq       267
	//*  78  164:aload_2         
	//*  79  165:getstatic       #294 <Field Class Float.TYPE>
	//*  80  168:if_acmpne       174
	//*  81  171:goto            267
	//*  82  174:aload_2         
	//*  83  175:ldc2            #296 <Class Byte>
	//*  84  178:if_acmpeq       258
	//*  85  181:aload_2         
	//*  86  182:getstatic       #297 <Field Class Byte.TYPE>
	//*  87  185:if_acmpne       191
	//*  88  188:goto            258
	//*  89  191:aload_2         
	//*  90  192:ldc2            #299 <Class Short>
	//*  91  195:if_acmpeq       249
	//*  92  198:aload_2         
	//*  93  199:getstatic       #300 <Field Class Short.TYPE>
	//*  94  202:if_acmpne       208
	//*  95  205:goto            249
	//*  96  208:new             #67  <Class StringBuilder>
	//*  97  211:dup             
	//*  98  212:invokespecial   #68  <Method void StringBuilder()>
	//*  99  215:astore          4
	//* 100  217:aload           4
	//* 101  219:ldc2            #302 <String "Not setup to handle class ">
	//* 102  222:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//* 103  225:pop             
	//* 104  226:aload           4
	//* 105  228:aload_2         
	//* 106  229:invokevirtual   #88  <Method String Class.getName()>
	//* 107  232:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//* 108  235:pop             
	//* 109  236:new             #23  <Class IllegalArgumentException>
	//* 110  239:dup             
	//* 111  240:aload           4
	//* 112  242:invokevirtual   #91  <Method String StringBuilder.toString()>
	//* 113  245:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//* 114  248:athrow          
	//* 115  249:aload           4
	//* 116  251:invokevirtual   #306 <Method short Number.shortValue()>
	//* 117  254:invokestatic    #309 <Method Short Short.valueOf(short)>
	//* 118  257:areturn         
	//* 119  258:aload           4
	//* 120  260:invokevirtual   #313 <Method byte Number.byteValue()>
	//* 121  263:invokestatic    #316 <Method Byte Byte.valueOf(byte)>
	//* 122  266:areturn         
	//* 123  267:aload           4
	//* 124  269:invokevirtual   #320 <Method float Number.floatValue()>
	//* 125  272:invokestatic    #323 <Method Float Float.valueOf(float)>
	//* 126  275:areturn         
	//* 127  276:aload           4
	//* 128  278:invokevirtual   #327 <Method double Number.doubleValue()>
	//* 129  281:invokestatic    #330 <Method Double Double.valueOf(double)>
	//* 130  284:areturn         
	//* 131  285:aload           4
	//* 132  287:invokevirtual   #334 <Method long Number.longValue()>
	//* 133  290:invokestatic    #337 <Method Long Long.valueOf(long)>
	//* 134  293:areturn         
	//* 135  294:aload           4
	//* 136  296:invokevirtual   #340 <Method int Number.intValue()>
	//* 137  299:istore_3        
	//* 138  300:iload_3         
	//* 139  301:invokestatic    #343 <Method Integer Integer.valueOf(int)>
	//* 140  304:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 141  305:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  142  306:new             #67  <Class StringBuilder>
	//  143  309:dup             
	//  144  310:invokespecial   #68  <Method void StringBuilder()>
	//  145  313:astore          4
			stringbuilder.append("Unable to set value for field ");
	//  146  315:aload           4
	//  147  317:ldc2            #345 <String "Unable to set value for field ">
	//  148  320:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  149  323:pop             
			stringbuilder.append(field.getName());
	//  150  324:aload           4
	//  151  326:aload_1         
	//  152  327:invokevirtual   #51  <Method String Field.getName()>
	//  153  330:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  154  333:pop             
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//  155  334:new             #23  <Class IllegalArgumentException>
	//  156  337:dup             
	//  157  338:aload           4
	//  158  340:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  159  343:aload_2         
	//  160  344:invokespecial   #94  <Method void IllegalArgumentException(String, Throwable)>
	//  161  347:athrow          
		}
		if(obj == java/lang/Integer)
			break MISSING_BLOCK_LABEL_294;
		if(obj == Integer.TYPE)
			break MISSING_BLOCK_LABEL_294;
		if(obj == java/lang/Long)
			break MISSING_BLOCK_LABEL_285;
		if(obj == Long.TYPE)
			break MISSING_BLOCK_LABEL_285;
		if(obj == java/lang/Double)
			break MISSING_BLOCK_LABEL_276;
		if(obj == Double.TYPE)
			break MISSING_BLOCK_LABEL_276;
		if(obj == java/lang/Float)
			break MISSING_BLOCK_LABEL_267;
		if(obj == Float.TYPE)
			break MISSING_BLOCK_LABEL_267;
		if(obj == java/lang/Byte)
			break MISSING_BLOCK_LABEL_258;
		if(obj == Byte.TYPE)
			break MISSING_BLOCK_LABEL_258;
		if(obj == java/lang/Short)
			break MISSING_BLOCK_LABEL_249;
		if(obj == Short.TYPE)
			break MISSING_BLOCK_LABEL_249;
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("Not setup to handle class ");
		((StringBuilder) (obj1)).append(((Class) (obj)).getName());
		throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
		return ((Object) (Short.valueOf(((Number) (obj1)).shortValue())));
		return ((Object) (Byte.valueOf(((Number) (obj1)).byteValue())));
		return ((Object) (Float.valueOf(((Number) (obj1)).floatValue())));
		return ((Object) (Double.valueOf(((Number) (obj1)).doubleValue())));
		return ((Object) (Long.valueOf(((Number) (obj1)).longValue())));
		i = ((Number) (obj1)).intValue();
		return ((Object) (Integer.valueOf(i)));
		return obj;
	//  162  348:aload_2         
	//  163  349:areturn         
	}

	private static boolean isWrapperOrPrimitiveType(Class class1)
	{
		return class1.isPrimitive() || ((Object) (class1)).equals(java/lang/Boolean) || ((Object) (class1)).equals(java/lang/Integer) || ((Object) (class1)).equals(java/lang/Character) || ((Object) (class1)).equals(java/lang/Byte) || ((Object) (class1)).equals(java/lang/Short) || ((Object) (class1)).equals(java/lang/Double) || ((Object) (class1)).equals(java/lang/Long) || ((Object) (class1)).equals(java/lang/Float);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #348 <Method boolean Class.isPrimitive()>
	//    2    4:ifne            92
	//    3    7:aload_0         
	//    4    8:ldc2            #350 <Class Boolean>
	//    5   11:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//    6   14:ifne            92
	//    7   17:aload_0         
	//    8   18:ldc2            #281 <Class Integer>
	//    9   21:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   10   24:ifne            92
	//   11   27:aload_0         
	//   12   28:ldc2            #352 <Class Character>
	//   13   31:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   14   34:ifne            92
	//   15   37:aload_0         
	//   16   38:ldc2            #296 <Class Byte>
	//   17   41:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   18   44:ifne            92
	//   19   47:aload_0         
	//   20   48:ldc2            #299 <Class Short>
	//   21   51:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   22   54:ifne            92
	//   23   57:aload_0         
	//   24   58:ldc2            #290 <Class Double>
	//   25   61:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   26   64:ifne            92
	//   27   67:aload_0         
	//   28   68:ldc2            #287 <Class Long>
	//   29   71:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   30   74:ifne            92
	//   31   77:aload_0         
	//   32   78:ldc2            #293 <Class Float>
	//   33   81:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   34   84:ifeq            90
	//   35   87:goto            92
	//   36   90:iconst_0        
	//   37   91:ireturn         
	//   38   92:iconst_1        
	//   39   93:ireturn         
	}

	public Object convertValue(Object obj, Class class1)
		throws IllegalArgumentException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(class1 != java/lang/Object && class1.isAssignableFrom(obj.getClass()))
	//*   4    6:aload_2         
	//*   5    7:ldc1            #4   <Class Object>
	//*   6    9:if_acmpeq       25
	//*   7   12:aload_2         
	//*   8   13:aload_1         
	//*   9   14:invokevirtual   #87  <Method Class Object.getClass()>
	//*  10   17:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//*  11   20:ifeq            25
			return obj;
	//   12   23:aload_1         
	//   13   24:areturn         
		try
		{
			if(obj instanceof JSONObject)
	//*  14   25:aload_1         
	//*  15   26:instanceof      #53  <Class JSONObject>
	//*  16   29:ifeq            42
				return _convertFromJSONObject((JSONObject)obj, class1);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:checkcast       #53  <Class JSONObject>
	//   20   37:aload_2         
	//   21   38:invokespecial   #355 <Method Object _convertFromJSONObject(JSONObject, Class)>
	//   22   41:areturn         
		}
	//*  23   42:aload_2         
	//*  24   43:ldc1            #53  <Class JSONObject>
	//*  25   45:if_acmpne       54
	//*  26   48:aload_0         
	//*  27   49:aload_1         
	//*  28   50:invokespecial   #357 <Method JSONObject _convertToJSONObject(Object)>
	//*  29   53:areturn         
	//*  30   54:new             #23  <Class IllegalArgumentException>
	//*  31   57:dup             
	//*  32   58:ldc2            #359 <String "Expecting either fromValue or toValueType to be a JSONObject">
	//*  33   61:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//*  34   64:athrow          
	//*  35   65:astore_1        
	//*  36   66:aload_1         
	//*  37   67:invokevirtual   #363 <Method Throwable InvocationTargetException.getCause()>
	//*  38   70:invokestatic    #369 <Method RuntimeException ExceptionUtil.propagate(Throwable)>
	//*  39   73:athrow          
	//*  40   74:astore_1        
	//*  41   75:new             #23  <Class IllegalArgumentException>
	//*  42   78:dup             
	//*  43   79:aload_1         
	//*  44   80:invokespecial   #240 <Method void IllegalArgumentException(Throwable)>
	//*  45   83:athrow          
	//*  46   84:astore_1        
	//*  47   85:new             #23  <Class IllegalArgumentException>
	//*  48   88:dup             
	//*  49   89:aload_1         
	//*  50   90:invokespecial   #240 <Method void IllegalArgumentException(Throwable)>
	//*  51   93:athrow          
	//*  52   94:astore_1        
	//*  53   95:new             #23  <Class IllegalArgumentException>
	//*  54   98:dup             
	//*  55   99:aload_1         
	//*  56  100:invokespecial   #240 <Method void IllegalArgumentException(Throwable)>
	//*  57  103:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  58  104:astore_1        
		{
			throw new IllegalArgumentException(((Throwable) (obj)));
	//   59  105:new             #23  <Class IllegalArgumentException>
	//   60  108:dup             
	//   61  109:aload_1         
	//   62  110:invokespecial   #240 <Method void IllegalArgumentException(Throwable)>
	//   63  113:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new IllegalArgumentException(((Throwable) (obj)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new IllegalArgumentException(((Throwable) (obj)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new IllegalArgumentException(((Throwable) (obj)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw ExceptionUtil.propagate(((InvocationTargetException) (obj)).getCause());
		}
		if(class1 != org/json/JSONObject)
			break MISSING_BLOCK_LABEL_54;
		return ((Object) (_convertToJSONObject(obj)));
		throw new IllegalArgumentException("Expecting either fromValue or toValueType to be a JSONObject");
	}
}
