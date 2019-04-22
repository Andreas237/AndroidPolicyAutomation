// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import java.lang.reflect.Array;
import java.util.*;
import org.json.*;

public class AFHelper
{

	public static JSONObject convertToJsonObject(Map map)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          17
			return new JSONObject(map);
	//    3    8:new             #14  <Class JSONObject>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #18  <Method void JSONObject(Map)>
	//    7   16:areturn         
		else
			return toJsonObject(map);
	//    8   17:aload_0         
	//    9   18:invokestatic    #21  <Method JSONObject toJsonObject(Map)>
	//   10   21:areturn         
	}

	public static JSONObject toJsonObject(Map map)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #14  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void JSONObject()>
	//    3    7:astore_1        
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #35  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #41  <Method Iterator Set.iterator()>
	//*   7   19:astore_0        
	//*   8   20:aload_0         
	//*   9   21:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            70
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   29:aload_0         
	//   12   30:invokeinterface #51  <Method Object Iterator.next()>
	//   13   35:checkcast       #53  <Class java.util.Map$Entry>
	//   14   38:astore_2        
			Object obj = _mth02CF(entry.getValue());
	//   15   39:aload_2         
	//   16   40:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
	//   17   45:invokestatic    #60  <Method Object _mth02CF(Object)>
	//   18   48:astore_3        
			try
			{
				jsonobject.put((String)entry.getKey(), obj);
	//   19   49:aload_1         
	//   20   50:aload_2         
	//   21   51:invokeinterface #63  <Method Object java.util.Map$Entry.getKey()>
	//   22   56:checkcast       #65  <Class String>
	//   23   59:aload_3         
	//   24   60:invokevirtual   #69  <Method JSONObject JSONObject.put(String, Object)>
	//   25   63:pop             
			}
	//*  26   64:goto            20
	//*  27   67:goto            20
	//*  28   70:aload_1         
	//*  29   71:areturn         
			catch(JSONException jsonexception) { }
	//   30   72:astore_2        
		}

		return jsonobject;
	//*  31   73:goto            67
	}

	private static Object _mth02CF(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return JSONObject.NULL;
	//    2    4:getstatic       #75  <Field Object JSONObject.NULL>
	//    3    7:areturn         
		if(obj instanceof JSONArray)
			break MISSING_BLOCK_LABEL_232;
	//    4    8:aload_0         
	//    5    9:instanceof      #77  <Class JSONArray>
	//    6   12:ifne            232
		if(obj instanceof JSONObject)
	//*   7   15:aload_0         
	//*   8   16:instanceof      #14  <Class JSONObject>
	//*   9   19:ifeq            24
			return obj;
	//   10   22:aload_0         
	//   11   23:areturn         
		if(obj.equals(JSONObject.NULL))
	//*  12   24:aload_0         
	//*  13   25:getstatic       #75  <Field Object JSONObject.NULL>
	//*  14   28:invokevirtual   #81  <Method boolean Object.equals(Object)>
	//*  15   31:ifeq            36
			return obj;
	//   16   34:aload_0         
	//   17   35:areturn         
		JSONArray jsonarray;
		if(obj instanceof Collection)
	//*  18   36:aload_0         
	//*  19   37:instanceof      #83  <Class Collection>
	//*  20   40:ifeq            87
		{
			jsonarray = new JSONArray();
	//   21   43:new             #77  <Class JSONArray>
	//   22   46:dup             
	//   23   47:invokespecial   #84  <Method void JSONArray()>
	//   24   50:astore_3        
			for(obj = ((Object) (((Collection)obj).iterator())); ((Iterator) (obj)).hasNext(); jsonarray.put(_mth02CF(((Iterator) (obj)).next())));
	//   25   51:aload_0         
	//   26   52:checkcast       #83  <Class Collection>
	//   27   55:invokeinterface #85  <Method Iterator Collection.iterator()>
	//   28   60:astore_0        
	//   29   61:aload_0         
	//   30   62:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//   31   67:ifeq            238
	//   32   70:aload_3         
	//   33   71:aload_0         
	//   34   72:invokeinterface #51  <Method Object Iterator.next()>
	//   35   77:invokestatic    #60  <Method Object _mth02CF(Object)>
	//   36   80:invokevirtual   #88  <Method JSONArray JSONArray.put(Object)>
	//   37   83:pop             
			break MISSING_BLOCK_LABEL_238;
	//   38   84:goto            61
		}
		int j;
		if(!obj.getClass().isArray())
			break MISSING_BLOCK_LABEL_137;
	//   39   87:aload_0         
	//   40   88:invokevirtual   #92  <Method Class Object.getClass()>
	//   41   91:invokevirtual   #97  <Method boolean Class.isArray()>
	//   42   94:ifeq            137
		j = Array.getLength(obj);
	//   43   97:aload_0         
	//   44   98:invokestatic    #103 <Method int Array.getLength(Object)>
	//   45  101:istore_2        
		jsonarray = new JSONArray();
	//   46  102:new             #77  <Class JSONArray>
	//   47  105:dup             
	//   48  106:invokespecial   #84  <Method void JSONArray()>
	//   49  109:astore_3        
		int i = 0;
	//   50  110:iconst_0        
	//   51  111:istore_1        
		while(i < j) 
	//*  52  112:iload_1         
	//*  53  113:iload_2         
	//*  54  114:icmpge          240
		{
			try
			{
				jsonarray.put(_mth02CF(Array.get(obj, i)));
	//   55  117:aload_3         
	//   56  118:aload_0         
	//   57  119:iload_1         
	//   58  120:invokestatic    #107 <Method Object Array.get(Object, int)>
	//   59  123:invokestatic    #60  <Method Object _mth02CF(Object)>
	//   60  126:invokevirtual   #88  <Method JSONArray JSONArray.put(Object)>
	//   61  129:pop             
			}
	//*  62  130:iload_1         
	//*  63  131:iconst_1        
	//*  64  132:iadd            
	//*  65  133:istore_1        
	//*  66  134:goto            112
	//*  67  137:aload_0         
	//*  68  138:instanceof      #31  <Class Map>
	//*  69  141:ifeq            154
	//*  70  144:aload_0         
	//*  71  145:checkcast       #31  <Class Map>
	//*  72  148:invokestatic    #21  <Method JSONObject toJsonObject(Map)>
	//*  73  151:astore_0        
	//*  74  152:aload_0         
	//*  75  153:areturn         
	//*  76  154:aload_0         
	//*  77  155:instanceof      #109 <Class Boolean>
	//*  78  158:ifne            226
	//*  79  161:aload_0         
	//*  80  162:instanceof      #111 <Class Byte>
	//*  81  165:ifne            226
	//*  82  168:aload_0         
	//*  83  169:instanceof      #113 <Class Character>
	//*  84  172:ifne            226
	//*  85  175:aload_0         
	//*  86  176:instanceof      #115 <Class Double>
	//*  87  179:ifne            226
	//*  88  182:aload_0         
	//*  89  183:instanceof      #117 <Class Float>
	//*  90  186:ifne            226
	//*  91  189:aload_0         
	//*  92  190:instanceof      #119 <Class Integer>
	//*  93  193:ifne            226
	//*  94  196:aload_0         
	//*  95  197:instanceof      #121 <Class Long>
	//*  96  200:ifne            226
	//*  97  203:aload_0         
	//*  98  204:instanceof      #123 <Class Short>
	//*  99  207:ifne            226
	//* 100  210:aload_0         
	//* 101  211:instanceof      #65  <Class String>
	//* 102  214:ifeq            219
	//* 103  217:aload_0         
	//* 104  218:areturn         
	//* 105  219:aload_0         
	//* 106  220:invokevirtual   #127 <Method String Object.toString()>
	//* 107  223:astore_0        
	//* 108  224:aload_0         
	//* 109  225:areturn         
	//* 110  226:aload_0         
	//* 111  227:areturn         
	//* 112  228:getstatic       #75  <Field Object JSONObject.NULL>
	//* 113  231:areturn         
	//* 114  232:aload_0         
	//* 115  233:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				return JSONObject.NULL;
			}
			i++;
		}
		break MISSING_BLOCK_LABEL_240;
		if(!(obj instanceof Map))
			break MISSING_BLOCK_LABEL_154;
		obj = ((Object) (toJsonObject((Map)obj)));
		return obj;
		if((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short))
			break MISSING_BLOCK_LABEL_226;
		if(obj instanceof String)
			return obj;
		obj = ((Object) (obj.toString()));
		return obj;
		return obj;
		return obj;
	//* 116  234:astore_0        
	//* 117  235:goto            228
		return ((Object) (jsonarray));
	//  118  238:aload_3         
	//  119  239:areturn         
		return ((Object) (jsonarray));
	//  120  240:aload_3         
	//  121  241:areturn         
	}
}
