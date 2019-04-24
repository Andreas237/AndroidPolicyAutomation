// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;

import java.io.*;
import java.net.*;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.gigya.socialize:
//			GSArray, GSKeyNotFoundException

public class GSObject
	implements Serializable
{

	public GSObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		map = new TreeMap();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class TreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void TreeMap()>
	//    6   12:putfield        #22  <Field TreeMap map>
	//    7   15:return          
	}

	public GSObject(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		map = new TreeMap();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class TreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void TreeMap()>
	//    6   12:putfield        #22  <Field TreeMap map>
		processJsonObject(new JSONObject(s), this);
	//    7   15:new             #26  <Class JSONObject>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #28  <Method void JSONObject(String)>
	//   11   23:aload_0         
	//   12   24:invokestatic    #32  <Method void processJsonObject(JSONObject, GSObject)>
	//   13   27:return          
	}

	protected GSObject(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		map = new TreeMap();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class TreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void TreeMap()>
	//    6   12:putfield        #22  <Field TreeMap map>
		processJsonObject(jsonobject, this);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokestatic    #32  <Method void processJsonObject(JSONObject, GSObject)>
	//   10   20:return          
	}

	private static void processJsonObject(JSONObject jsonobject, GSObject gsobject)
	{
		Iterator iterator = jsonobject.keys();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method Iterator JSONObject.keys()>
	//    2    4:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    3    5:aload_2         
	//    4    6:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            252
			String s = iterator.next().toString();
	//    6   14:aload_2         
	//    7   15:invokeinterface #47  <Method Object Iterator.next()>
	//    8   20:invokevirtual   #51  <Method String Object.toString()>
	//    9   23:astore_3        
			Object obj = jsonobject.get(s);
	//   10   24:aload_0         
	//   11   25:aload_3         
	//   12   26:invokevirtual   #55  <Method Object JSONObject.get(String)>
	//   13   29:astore          4
			if(obj == null)
	//*  14   31:aload           4
	//*  15   33:ifnonnull       45
				gsobject.put(s, (String)null);
	//   16   36:aload_1         
	//   17   37:aload_3         
	//   18   38:aconst_null     
	//   19   39:checkcast       #57  <Class String>
	//   20   42:invokevirtual   #61  <Method void put(String, String)>
			if(obj == JSONObject.NULL)
	//*  21   45:aload           4
	//*  22   47:getstatic       #65  <Field Object JSONObject.NULL>
	//*  23   50:if_acmpne       61
				gsobject.put(s, JSONObject.NULL);
	//   24   53:aload_1         
	//   25   54:aload_3         
	//   26   55:getstatic       #65  <Field Object JSONObject.NULL>
	//   27   58:invokevirtual   #68  <Method void put(String, Object)>
			if(((Object) (obj.getClass())).equals(java/lang/String))
	//*  28   61:aload           4
	//*  29   63:invokevirtual   #72  <Method Class Object.getClass()>
	//*  30   66:ldc1            #57  <Class String>
	//*  31   68:invokevirtual   #76  <Method boolean Object.equals(Object)>
	//*  32   71:ifeq            84
				gsobject.put(s, (String)obj);
	//   33   74:aload_1         
	//   34   75:aload_3         
	//   35   76:aload           4
	//   36   78:checkcast       #57  <Class String>
	//   37   81:invokevirtual   #61  <Method void put(String, String)>
			if(((Object) (obj.getClass())).equals(java/lang/Boolean))
	//*  38   84:aload           4
	//*  39   86:invokevirtual   #72  <Method Class Object.getClass()>
	//*  40   89:ldc1            #78  <Class Boolean>
	//*  41   91:invokevirtual   #76  <Method boolean Object.equals(Object)>
	//*  42   94:ifeq            107
				gsobject.put(s, ((Object) ((Boolean)obj)));
	//   43   97:aload_1         
	//   44   98:aload_3         
	//   45   99:aload           4
	//   46  101:checkcast       #78  <Class Boolean>
	//   47  104:invokevirtual   #68  <Method void put(String, Object)>
			if(((Object) (obj.getClass())).equals(java/lang/Double))
	//*  48  107:aload           4
	//*  49  109:invokevirtual   #72  <Method Class Object.getClass()>
	//*  50  112:ldc1            #80  <Class Double>
	//*  51  114:invokevirtual   #76  <Method boolean Object.equals(Object)>
	//*  52  117:ifeq            130
				gsobject.put(s, ((Object) ((Double)obj)));
	//   53  120:aload_1         
	//   54  121:aload_3         
	//   55  122:aload           4
	//   56  124:checkcast       #80  <Class Double>
	//   57  127:invokevirtual   #68  <Method void put(String, Object)>
			if(((Object) (obj.getClass())).equals(java/lang/Integer))
	//*  58  130:aload           4
	//*  59  132:invokevirtual   #72  <Method Class Object.getClass()>
	//*  60  135:ldc1            #82  <Class Integer>
	//*  61  137:invokevirtual   #76  <Method boolean Object.equals(Object)>
	//*  62  140:ifeq            153
				gsobject.put(s, ((Object) ((Integer)obj)));
	//   63  143:aload_1         
	//   64  144:aload_3         
	//   65  145:aload           4
	//   66  147:checkcast       #82  <Class Integer>
	//   67  150:invokevirtual   #68  <Method void put(String, Object)>
			if(((Object) (obj.getClass())).equals(java/lang/Long))
	//*  68  153:aload           4
	//*  69  155:invokevirtual   #72  <Method Class Object.getClass()>
	//*  70  158:ldc1            #84  <Class Long>
	//*  71  160:invokevirtual   #76  <Method boolean Object.equals(Object)>
	//*  72  163:ifeq            176
				gsobject.put(s, ((Object) ((Long)obj)));
	//   73  166:aload_1         
	//   74  167:aload_3         
	//   75  168:aload           4
	//   76  170:checkcast       #84  <Class Long>
	//   77  173:invokevirtual   #68  <Method void put(String, Object)>
			if(((Object) (obj.getClass())).equals(org/json/JSONObject))
	//*  78  176:aload           4
	//*  79  178:invokevirtual   #72  <Method Class Object.getClass()>
	//*  80  181:ldc1            #26  <Class JSONObject>
	//*  81  183:invokevirtual   #76  <Method boolean Object.equals(Object)>
	//*  82  186:ifeq            219
			{
				JSONObject jsonobject1 = (JSONObject)obj;
	//   83  189:aload           4
	//   84  191:checkcast       #26  <Class JSONObject>
	//   85  194:astore          5
				GSObject gsobject1 = new GSObject();
	//   86  196:new             #2   <Class GSObject>
	//   87  199:dup             
	//   88  200:invokespecial   #85  <Method void GSObject()>
	//   89  203:astore          6
				processJsonObject(jsonobject1, gsobject1);
	//   90  205:aload           5
	//   91  207:aload           6
	//   92  209:invokestatic    #32  <Method void processJsonObject(JSONObject, GSObject)>
				gsobject.put(s, gsobject1);
	//   93  212:aload_1         
	//   94  213:aload_3         
	//   95  214:aload           6
	//   96  216:invokevirtual   #88  <Method void put(String, GSObject)>
			}
			if(((Object) (obj.getClass())).equals(org/json/JSONArray))
	//*  97  219:aload           4
	//*  98  221:invokevirtual   #72  <Method Class Object.getClass()>
	//*  99  224:ldc1            #90  <Class JSONArray>
	//* 100  226:invokevirtual   #76  <Method boolean Object.equals(Object)>
	//* 101  229:ifeq            5
				gsobject.put(s, new GSArray((JSONArray)obj));
	//  102  232:aload_1         
	//  103  233:aload_3         
	//  104  234:new             #92  <Class GSArray>
	//  105  237:dup             
	//  106  238:aload           4
	//  107  240:checkcast       #90  <Class JSONArray>
	//  108  243:invokespecial   #95  <Method void GSArray(JSONArray)>
	//  109  246:invokevirtual   #98  <Method void put(String, GSArray)>
		} while(true);
	//  110  249:goto            5
	//  111  252:return          
	}

	public void clear()
	{
		map.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TreeMap map>
	//    2    4:invokevirtual   #101 <Method void TreeMap.clear()>
	//    3    7:return          
	}

	public GSObject clone()
	{
		Object obj;
		try
		{
			obj = ((Object) (new ByteArrayOutputStream()));
	//    0    0:new             #107 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
	//    4    8:new             #110 <Class ObjectOutputStream>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #113 <Method void ObjectOutputStream(java.io.OutputStream)>
	//    8   16:astore_2        
			objectoutputstream.writeObject(((Object) (this)));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #117 <Method void ObjectOutputStream.writeObject(Object)>
			objectoutputstream.flush();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #120 <Method void ObjectOutputStream.flush()>
			objectoutputstream.close();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #123 <Method void ObjectOutputStream.close()>
			obj = ((Object) ((GSObject)(new ObjectInputStream(((java.io.InputStream) (new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray()))))).readObject()));
	//   16   30:new             #125 <Class ObjectInputStream>
	//   17   33:dup             
	//   18   34:new             #127 <Class ByteArrayInputStream>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokevirtual   #131 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   22   42:invokespecial   #134 <Method void ByteArrayInputStream(byte[])>
	//   23   45:invokespecial   #137 <Method void ObjectInputStream(java.io.InputStream)>
	//   24   48:invokevirtual   #140 <Method Object ObjectInputStream.readObject()>
	//   25   51:checkcast       #2   <Class GSObject>
	//   26   54:astore_1        
		}
	//*  27   55:aload_1         
	//*  28   56:areturn         
		catch(Exception exception)
	//*  29   57:astore_1        
		{
			exception.printStackTrace();
	//   30   58:aload_1         
	//   31   59:invokevirtual   #143 <Method void Exception.printStackTrace()>
			return this;
	//   32   62:aload_0         
	//   33   63:areturn         
		}
		return ((GSObject) (obj));
	}

	public volatile Object clone()
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method GSObject clone()>
	//    2    4:areturn         
	}

	public boolean containsKey(String s)
	{
		return map.containsKey(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TreeMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public Object get(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		Object obj = map.get(((Object) (s)));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_2        
		s = ((String) (obj));
	//   28   53:aload_2         
	//   29   54:astore_1        
		if(obj == null)
	//*  30   55:aload_2         
	//*  31   56:ifnonnull       61
			s = null;
	//   32   59:aconst_null     
	//   33   60:astore_1        
		return ((Object) (s));
	//   34   61:aload_1         
	//   35   62:areturn         
	}

	public Object get(String s, Object obj)
	{
		try
		{
			s = ((String) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method Object get(String)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:ifnull          12
	//*   6   10:aload_1         
	//*   7   11:areturn         
	//*   8   12:aload_2         
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   14:astore_1        
		{
			return obj;
	//   11   15:aload_2         
	//   12   16:areturn         
		}
		if(s != null)
			return ((Object) (s));
		else
			return obj;
	}

	public GSArray getArray(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		s = ((String) (map.get(((Object) (s)))));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_1        
		if(s == null)
	//*  28   53:aload_1         
	//*  29   54:ifnonnull       59
			return null;
	//   30   57:aconst_null     
	//   31   58:areturn         
		else
			return (GSArray)s;
	//   32   59:aload_1         
	//   33   60:checkcast       #92  <Class GSArray>
	//   34   63:areturn         
	}

	public GSArray getArray(String s, GSArray gsarray)
	{
		try
		{
			s = ((String) (getArray(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #170 <Method GSArray getArray(String)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:ifnull          12
	//*   6   10:aload_1         
	//*   7   11:areturn         
	//*   8   12:aload_2         
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   14:astore_1        
		{
			return gsarray;
	//   11   15:aload_2         
	//   12   16:areturn         
		}
		if(s != null)
			return ((GSArray) (s));
		else
			return gsarray;
	}

	public boolean getBool(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		Object obj = map.get(((Object) (s)));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_2        
		if(obj == null)
	//*  28   53:aload_2         
	//*  29   54:ifnonnull       90
		{
			obj = ((Object) (new StringBuilder()));
	//   30   57:new             #151 <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #152 <Method void StringBuilder()>
	//   33   64:astore_2        
			((StringBuilder) (obj)).append("GSObject does not contain a value for key ");
	//   34   65:aload_2         
	//   35   66:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   36   68:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			((StringBuilder) (obj)).append(s);
	//   38   72:aload_2         
	//   39   73:aload_1         
	//   40   74:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   42   78:new             #173 <Class NullPointerException>
	//   43   81:dup             
	//   44   82:aload_2         
	//   45   83:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   46   86:invokespecial   #174 <Method void NullPointerException(String)>
	//   47   89:athrow          
		}
		if(obj.getClass().isAssignableFrom(java/lang/Boolean))
	//*  48   90:aload_2         
	//*  49   91:invokevirtual   #72  <Method Class Object.getClass()>
	//*  50   94:ldc1            #78  <Class Boolean>
	//*  51   96:invokevirtual   #180 <Method boolean Class.isAssignableFrom(Class)>
	//*  52   99:ifeq            110
			return ((Boolean)obj).booleanValue();
	//   53  102:aload_2         
	//   54  103:checkcast       #78  <Class Boolean>
	//   55  106:invokevirtual   #183 <Method boolean Boolean.booleanValue()>
	//   56  109:ireturn         
		return obj.toString().toLowerCase().equals("true") || obj.toString().equals("1");
	//   57  110:aload_2         
	//   58  111:invokevirtual   #51  <Method String Object.toString()>
	//   59  114:invokevirtual   #186 <Method String String.toLowerCase()>
	//   60  117:ldc1            #188 <String "true">
	//   61  119:invokevirtual   #189 <Method boolean String.equals(Object)>
	//   62  122:ifne            142
	//   63  125:aload_2         
	//   64  126:invokevirtual   #51  <Method String Object.toString()>
	//   65  129:ldc1            #191 <String "1">
	//   66  131:invokevirtual   #189 <Method boolean String.equals(Object)>
	//   67  134:ifeq            140
	//   68  137:goto            142
	//   69  140:iconst_0        
	//   70  141:ireturn         
	//   71  142:iconst_1        
	//   72  143:ireturn         
	}

	public boolean getBool(String s, boolean flag)
	{
		boolean flag1;
		try
		{
			flag1 = getBool(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method boolean getBool(String)>
	//    3    5:istore_3        
		}
	//*   4    6:iload_3         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    8:astore_1        
		{
			return flag;
	//    7    9:iload_2         
	//    8   10:ireturn         
		}
		return flag1;
	}

	public double getDouble(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		Object obj = map.get(((Object) (s)));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_2        
		if(obj == null)
	//*  28   53:aload_2         
	//*  29   54:ifnonnull       90
		{
			obj = ((Object) (new StringBuilder()));
	//   30   57:new             #151 <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #152 <Method void StringBuilder()>
	//   33   64:astore_2        
			((StringBuilder) (obj)).append("GSObject does not contain a value for key ");
	//   34   65:aload_2         
	//   35   66:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   36   68:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			((StringBuilder) (obj)).append(s);
	//   38   72:aload_2         
	//   39   73:aload_1         
	//   40   74:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   42   78:new             #173 <Class NullPointerException>
	//   43   81:dup             
	//   44   82:aload_2         
	//   45   83:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   46   86:invokespecial   #174 <Method void NullPointerException(String)>
	//   47   89:athrow          
		}
		if(obj.getClass().isAssignableFrom(java/lang/Double))
	//*  48   90:aload_2         
	//*  49   91:invokevirtual   #72  <Method Class Object.getClass()>
	//*  50   94:ldc1            #80  <Class Double>
	//*  51   96:invokevirtual   #180 <Method boolean Class.isAssignableFrom(Class)>
	//*  52   99:ifeq            110
			return ((Double)obj).doubleValue();
	//   53  102:aload_2         
	//   54  103:checkcast       #80  <Class Double>
	//   55  106:invokevirtual   #200 <Method double Double.doubleValue()>
	//   56  109:dreturn         
		else
			return Double.parseDouble(getString(s));
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:invokevirtual   #204 <Method String getString(String)>
	//   60  115:invokestatic    #207 <Method double Double.parseDouble(String)>
	//   61  118:dreturn         
	}

	public double getDouble(String s, double d)
	{
		double d1;
		try
		{
			d1 = getDouble(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method double getDouble(String)>
	//    3    5:dstore          4
		}
	//*   4    7:dload           4
	//*   5    9:dreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   10:astore_1        
		{
			return d;
	//    7   11:dload_2         
	//    8   12:dreturn         
		}
		return d1;
	}

	public int getInt(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		Object obj = map.get(((Object) (s)));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_2        
		if(obj == null)
	//*  28   53:aload_2         
	//*  29   54:ifnonnull       90
		{
			obj = ((Object) (new StringBuilder()));
	//   30   57:new             #151 <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #152 <Method void StringBuilder()>
	//   33   64:astore_2        
			((StringBuilder) (obj)).append("GSObject does not contain a value for key ");
	//   34   65:aload_2         
	//   35   66:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   36   68:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			((StringBuilder) (obj)).append(s);
	//   38   72:aload_2         
	//   39   73:aload_1         
	//   40   74:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   42   78:new             #173 <Class NullPointerException>
	//   43   81:dup             
	//   44   82:aload_2         
	//   45   83:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   46   86:invokespecial   #174 <Method void NullPointerException(String)>
	//   47   89:athrow          
		}
		if(obj.getClass().isAssignableFrom(java/lang/Integer))
	//*  48   90:aload_2         
	//*  49   91:invokevirtual   #72  <Method Class Object.getClass()>
	//*  50   94:ldc1            #82  <Class Integer>
	//*  51   96:invokevirtual   #180 <Method boolean Class.isAssignableFrom(Class)>
	//*  52   99:ifeq            110
			return ((Integer)obj).intValue();
	//   53  102:aload_2         
	//   54  103:checkcast       #82  <Class Integer>
	//   55  106:invokevirtual   #216 <Method int Integer.intValue()>
	//   56  109:ireturn         
		else
			return Integer.parseInt(getString(s));
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:invokevirtual   #204 <Method String getString(String)>
	//   60  115:invokestatic    #219 <Method int Integer.parseInt(String)>
	//   61  118:ireturn         
	}

	public int getInt(String s, int i)
	{
		int j;
		try
		{
			j = getInt(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #222 <Method int getInt(String)>
	//    3    5:istore_3        
		}
	//*   4    6:iload_3         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    8:astore_1        
		{
			return i;
	//    7    9:iload_2         
	//    8   10:ireturn         
		}
		return j;
	}

	public String[] getKeys()
	{
		return (String[])map.keySet().toArray(((Object []) (new String[map.keySet().size()])));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TreeMap map>
	//    2    4:invokevirtual   #228 <Method Set TreeMap.keySet()>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field TreeMap map>
	//    5   11:invokevirtual   #228 <Method Set TreeMap.keySet()>
	//    6   14:invokeinterface #233 <Method int Set.size()>
	//    7   19:anewarray       String[]
	//    8   22:invokeinterface #237 <Method Object[] Set.toArray(Object[])>
	//    9   27:checkcast       #239 <Class String[]>
	//   10   30:areturn         
	}

	public long getLong(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		Object obj = map.get(((Object) (s)));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_2        
		if(obj == null)
	//*  28   53:aload_2         
	//*  29   54:ifnonnull       90
		{
			obj = ((Object) (new StringBuilder()));
	//   30   57:new             #151 <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #152 <Method void StringBuilder()>
	//   33   64:astore_2        
			((StringBuilder) (obj)).append("GSObject does not contain a value for key ");
	//   34   65:aload_2         
	//   35   66:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   36   68:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			((StringBuilder) (obj)).append(s);
	//   38   72:aload_2         
	//   39   73:aload_1         
	//   40   74:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   42   78:new             #173 <Class NullPointerException>
	//   43   81:dup             
	//   44   82:aload_2         
	//   45   83:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   46   86:invokespecial   #174 <Method void NullPointerException(String)>
	//   47   89:athrow          
		}
		if(obj.getClass().isAssignableFrom(java/lang/Long))
	//*  48   90:aload_2         
	//*  49   91:invokevirtual   #72  <Method Class Object.getClass()>
	//*  50   94:ldc1            #84  <Class Long>
	//*  51   96:invokevirtual   #180 <Method boolean Class.isAssignableFrom(Class)>
	//*  52   99:ifeq            110
			return ((Long)obj).longValue();
	//   53  102:aload_2         
	//   54  103:checkcast       #84  <Class Long>
	//   55  106:invokevirtual   #245 <Method long Long.longValue()>
	//   56  109:lreturn         
		else
			return Long.parseLong(getString(s));
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:invokevirtual   #204 <Method String getString(String)>
	//   60  115:invokestatic    #248 <Method long Long.parseLong(String)>
	//   61  118:lreturn         
	}

	public long getLong(String s, long l)
	{
		long l1;
		try
		{
			l1 = getLong(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #251 <Method long getLong(String)>
	//    3    5:lstore          4
		}
	//*   4    7:lload           4
	//*   5    9:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   10:astore_1        
		{
			return l;
	//    7   11:lload_2         
	//    8   12:lreturn         
		}
		return l1;
	}

	protected TreeMap getMap()
	{
		return map;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TreeMap map>
	//    2    4:areturn         
	}

	public GSObject getObject(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		s = ((String) (map.get(((Object) (s)))));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_1        
		if(s == null)
	//*  28   53:aload_1         
	//*  29   54:ifnonnull       59
			return null;
	//   30   57:aconst_null     
	//   31   58:areturn         
		else
			return (GSObject)s;
	//   32   59:aload_1         
	//   33   60:checkcast       #2   <Class GSObject>
	//   34   63:areturn         
	}

	public GSObject getObject(String s, GSObject gsobject)
	{
		try
		{
			s = ((String) (getObject(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #260 <Method GSObject getObject(String)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:ifnull          12
	//*   6   10:aload_1         
	//*   7   11:areturn         
	//*   8   12:aload_2         
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   14:astore_1        
		{
			return gsobject;
	//   11   15:aload_2         
	//   12   16:areturn         
		}
		if(s != null)
			return ((GSObject) (s));
		else
			return gsobject;
	}

	public String getString(String s)
	{
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TreeMap map>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #149 <Method boolean TreeMap.containsKey(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #151 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #152 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("GSObject does not contain a value for key ");
	//    9   19:aload_2         
	//   10   20:ldc1            #10  <String "GSObject does not contain a value for key ">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new GSKeyNotFoundException(stringbuilder.toString());
	//   17   32:new             #158 <Class GSKeyNotFoundException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #160 <Method void GSKeyNotFoundException(String)>
	//   22   43:athrow          
		}
		s = ((String) (map.get(((Object) (s)))));
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field TreeMap map>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   27   52:astore_1        
		if(s == null)
	//*  28   53:aload_1         
	//*  29   54:ifnonnull       59
			return null;
	//   30   57:aconst_null     
	//   31   58:areturn         
		else
			return ((Object) (s)).toString();
	//   32   59:aload_1         
	//   33   60:invokevirtual   #51  <Method String Object.toString()>
	//   34   63:areturn         
	}

	public String getString(String s, String s1)
	{
		try
		{
			s = getString(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method String getString(String)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:ifnull          12
	//*   6   10:aload_1         
	//*   7   11:areturn         
	//*   8   12:aload_2         
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   14:astore_1        
		{
			return s1;
	//   11   15:aload_2         
	//   12   16:areturn         
		}
		if(s != null)
			return s;
		else
			return s1;
	}

	public void parseQueryString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		String as[] = s.split("&");
	//    3    5:aload_1         
	//    4    6:ldc2            #264 <String "&">
	//    5    9:invokevirtual   #268 <Method String[] String.split(String)>
	//    6   12:astore          4
		int j = as.length;
	//    7   14:aload           4
	//    8   16:arraylength     
	//    9   17:istore_3        
		int i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		while(i < j) 
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:icmpge          75
		{
			String as1[] = as[i].split("=");
	//   15   25:aload           4
	//   16   27:iload_2         
	//   17   28:aaload          
	//   18   29:ldc2            #270 <String "=">
	//   19   32:invokevirtual   #268 <Method String[] String.split(String)>
	//   20   35:astore          5
			s = "";
	//   21   37:ldc2            #272 <String "">
	//   22   40:astore_1        
			try
			{
				if(as1.length > 1)
	//*  23   41:aload           5
	//*  24   43:arraylength     
	//*  25   44:iconst_1        
	//*  26   45:icmple          59
					s = URLDecoder.decode(as1[1], "UTF8");
	//   27   48:aload           5
	//   28   50:iconst_1        
	//   29   51:aaload          
	//   30   52:ldc2            #274 <String "UTF8">
	//   31   55:invokestatic    #279 <Method String URLDecoder.decode(String, String)>
	//   32   58:astore_1        
				put(as1[0], s);
	//   33   59:aload_0         
	//   34   60:aload           5
	//   35   62:iconst_0        
	//   36   63:aaload          
	//   37   64:aload_1         
	//   38   65:invokevirtual   #61  <Method void put(String, String)>
			}
	//*  39   68:iload_2         
	//*  40   69:iconst_1        
	//*  41   70:iadd            
	//*  42   71:istore_2        
	//*  43   72:goto            20
	//*  44   75:return          
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   45   76:astore_1        
			i++;
		}
	//*  46   77:goto            68
	}

	public void parseURL(String s)
	{
		try
		{
			s = ((String) (new URL(s)));
	//    0    0:new             #284 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #285 <Method void URL(String)>
	//    4    8:astore_1        
			parseQueryString(((URL) (s)).getQuery());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #288 <Method String URL.getQuery()>
	//    8   14:invokevirtual   #290 <Method void parseQueryString(String)>
			parseQueryString(((URL) (s)).getRef());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #293 <Method String URL.getRef()>
	//   12   22:invokevirtual   #290 <Method void parseQueryString(String)>
			return;
	//   13   25:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   26:astore_1        
		{
			return;
	//   15   27:return          
		}
	}

	public void put(String s, double d)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			map.put(((Object) (s)), ((Object) (Double.valueOf(d))));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field TreeMap map>
	//    5    9:aload_1         
	//    6   10:dload_2         
	//    7   11:invokestatic    #298 <Method Double Double.valueOf(double)>
	//    8   14:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
	}

	public void put(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			map.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field TreeMap map>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokestatic    #305 <Method Integer Integer.valueOf(int)>
	//    8   14:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
	}

	public void put(String s, long l)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			map.put(((Object) (s)), ((Object) (Long.valueOf(l))));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field TreeMap map>
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:invokestatic    #309 <Method Long Long.valueOf(long)>
	//    8   14:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
	}

	public void put(String s, GSArray gsarray)
	{
		map.put(((Object) (s)), ((Object) (gsarray)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TreeMap map>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void put(String s, GSObject gsobject)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			map.put(((Object) (s)), ((Object) (gsobject)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field TreeMap map>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    8   14:pop             
			return;
	//    9   15:return          
		}
	}

	public void put(String s, Object obj)
	{
		map.put(((Object) (s)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TreeMap map>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void put(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			map.put(((Object) (s)), ((Object) (s1)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field TreeMap map>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    8   14:pop             
			return;
	//    9   15:return          
		}
	}

	public void put(String s, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			map.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field TreeMap map>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokestatic    #313 <Method Boolean Boolean.valueOf(boolean)>
	//    8   14:invokevirtual   #301 <Method Object TreeMap.put(Object, Object)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
	}

	public void remove(String s)
	{
		map.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TreeMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #316 <Method Object TreeMap.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected JSONObject toJsonObject()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #26  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #319 <Method void JSONObject()>
	//    3    7:astore          4
		String as[] = getKeys();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #321 <Method String[] getKeys()>
	//    6   13:astore          5
		int j = as.length;
	//    7   15:aload           5
	//    8   17:arraylength     
	//    9   18:istore_2        
		int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_1        
label0:
		while(i < j) 
	//*  12   21:iload_1         
	//*  13   22:iload_2         
	//*  14   23:icmpge          113
		{
			String s = as[i];
	//   15   26:aload           5
	//   16   28:iload_1         
	//   17   29:aaload          
	//   18   30:astore          6
			Object obj = map.get(((Object) (s)));
	//   19   32:aload_0         
	//   20   33:getfield        #22  <Field TreeMap map>
	//   21   36:aload           6
	//   22   38:invokevirtual   #163 <Method Object TreeMap.get(Object)>
	//   23   41:astore_3        
			Class class1;
			if(obj != null)
	//*  24   42:aload_3         
	//*  25   43:ifnonnull       58
	//*  26   46:aload           4
	//*  27   48:aload           6
	//*  28   50:aload_3         
	//*  29   51:invokevirtual   #324 <Method JSONObject JSONObject.put(String, Object)>
	//*  30   54:pop             
	//*  31   55:goto            106
			{
				class1 = obj.getClass();
	//   32   58:aload_3         
	//   33   59:invokevirtual   #72  <Method Class Object.getClass()>
	//   34   62:astore          7
				if(class1 != com/gigya/socialize/GSObject)
					continue;
	//   35   64:aload           7
	//   36   66:ldc1            #2   <Class GSObject>
	//   37   68:if_acmpne       82
				obj = ((Object) (((GSObject)obj).toJsonObject()));
	//   38   71:aload_3         
	//   39   72:checkcast       #2   <Class GSObject>
	//   40   75:invokevirtual   #326 <Method JSONObject toJsonObject()>
	//   41   78:astore_3        
			}
			do
			{
				jsonobject.put(s, obj);
				continue label0;
			} while(class1 != com/gigya/socialize/GSArray);
	//   42   79:goto            46
	//   43   82:aload           7
	//   44   84:ldc1            #92  <Class GSArray>
	//   45   86:if_acmpne       46
			try
			{
				jsonobject.put(s, ((Object) (getArray(s).toJsonArray())));
	//   46   89:aload           4
	//   47   91:aload           6
	//   48   93:aload_0         
	//   49   94:aload           6
	//   50   96:invokevirtual   #170 <Method GSArray getArray(String)>
	//   51   99:invokevirtual   #330 <Method JSONArray GSArray.toJsonArray()>
	//   52  102:invokevirtual   #324 <Method JSONObject JSONObject.put(String, Object)>
	//   53  105:pop             
			}
	//*  54  106:iload_1         
	//*  55  107:iconst_1        
	//*  56  108:iadd            
	//*  57  109:istore_1        
	//*  58  110:goto            21
	//*  59  113:aload           4
	//*  60  115:areturn         
			catch(Exception exception) { }
	//   61  116:astore_3        
			i++;
		}
		return jsonobject;
	//*  62  117:goto            106
	}

	public String toJsonString()
	{
		String s;
		try
		{
			s = toJsonObject().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #326 <Method JSONObject toJsonObject()>
	//    2    4:invokevirtual   #332 <Method String JSONObject.toString()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(Exception exception)
	//*   6   10:astore_1        
		{
			exception.printStackTrace();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #143 <Method void Exception.printStackTrace()>
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		return s;
	}

	public String toString()
	{
		return toJsonString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method String toJsonString()>
	//    2    4:areturn         
	}

	private static final String NO_KEY_EX = "GSObject does not contain a value for key ";
	private TreeMap map;
}
