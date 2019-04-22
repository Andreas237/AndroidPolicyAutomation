// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.*;

// Referenced classes of package bo.app:
//			ec

public final class ek extends JSONObject
{

	public ek()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void JSONObject()>
	//    2    4:return          
	}

	public static Enum a(JSONObject jsonobject, String s, Class class1)
	{
		return ec.a(jsonobject.getString(s).toUpperCase(Locale.US), class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #26  <Method String JSONObject.getString(String)>
	//    3    5:getstatic       #32  <Field Locale Locale.US>
	//    4    8:invokevirtual   #38  <Method String String.toUpperCase(Locale)>
	//    5   11:aload_2         
	//    6   12:invokestatic    #43  <Method Enum ec.a(String, Class)>
	//    7   15:areturn         
	}

	public static Enum a(JSONObject jsonobject, String s, Class class1, Enum enum)
	{
		try
		{
			jsonobject = ((JSONObject) (a(jsonobject, s, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #50  <Method Enum a(JSONObject, String, Class)>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*   7    9:astore_0        
		{
			return enum;
	//    8   10:aload_3         
	//    9   11:areturn         
		}
		return ((Enum) (jsonobject));
	}

	public static String a(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #56  <String "">
	//    3    6:areturn         
		String s;
		try
		{
			if(!(jsonobject instanceof JSONObject))
	//*   4    7:aload_0         
	//*   5    8:instanceof      #4   <Class JSONObject>
	//*   6   11:ifne            20
				return jsonobject.toString(2);
	//    7   14:aload_0         
	//    8   15:iconst_2        
	//    9   16:invokevirtual   #60  <Method String JSONObject.toString(int)>
	//   10   19:areturn         
			s = JSONObjectInstrumentation.toString((JSONObject)jsonobject, 2);
	//   11   20:aload_0         
	//   12   21:checkcast       #4   <Class JSONObject>
	//   13   24:iconst_2        
	//   14   25:invokestatic    #65  <Method String JSONObjectInstrumentation.toString(JSONObject, int)>
	//   15   28:astore_1        
		}
	//*  16   29:aload_1         
	//*  17   30:areturn         
		catch(JSONException jsonexception)
	//*  18   31:astore_1        
		{
			AppboyLogger.e(a, "Caught JSONException while generating pretty printed json. Returning standard toString().", ((Throwable) (jsonexception)));
	//   19   32:getstatic       #17  <Field String a>
	//   20   35:ldc1            #67  <String "Caught JSONException while generating pretty printed json. Returning standard toString().">
	//   21   37:aload_1         
	//   22   38:invokestatic    #71  <Method int AppboyLogger.e(String, String, Throwable)>
	//   23   41:pop             
			if(!(jsonobject instanceof JSONObject))
	//*  24   42:aload_0         
	//*  25   43:instanceof      #4   <Class JSONObject>
	//*  26   46:ifne            54
				return jsonobject.toString();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #74  <Method String JSONObject.toString()>
	//   29   53:areturn         
			else
				return JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	//   30   54:aload_0         
	//   31   55:checkcast       #4   <Class JSONObject>
	//   32   58:invokestatic    #76  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   33   61:areturn         
		}
		return s;
	}

	public static String a(JSONObject jsonobject, String s)
	{
		if(jsonobject.has(s) && !jsonobject.isNull(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #81  <Method boolean JSONObject.has(String)>
	//*   3    5:ifeq            23
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #84  <Method boolean JSONObject.isNull(String)>
	//*   7   13:ifne            23
			return jsonobject.optString(s, ((String) (null)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #88  <Method String JSONObject.optString(String, String)>
	//   12   22:areturn         
		else
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public static Map a(JSONObject jsonobject, Map map)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       29
			if(map != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          10
			{
				return map;
	//    4    8:aload_1         
	//    5    9:areturn         
			} else
			{
				AppboyLogger.d(a, "Cannot convert JSONObject to Map because JSONObject is null and no default was provided.");
	//    6   10:getstatic       #17  <Field String a>
	//    7   13:ldc1            #91  <String "Cannot convert JSONObject to Map because JSONObject is null and no default was provided.">
	//    8   15:invokestatic    #95  <Method int AppboyLogger.d(String, String)>
	//    9   18:pop             
				throw new JSONException("Cannot convert JSONObject to Map because JSONObject is null and no default was provided.");
	//   10   19:new             #54  <Class JSONException>
	//   11   22:dup             
	//   12   23:ldc1            #91  <String "Cannot convert JSONObject to Map because JSONObject is null and no default was provided.">
	//   13   25:invokespecial   #98  <Method void JSONException(String)>
	//   14   28:athrow          
			}
		map = ((Map) (new HashMap()));
	//   15   29:new             #100 <Class HashMap>
	//   16   32:dup             
	//   17   33:invokespecial   #101 <Method void HashMap()>
	//   18   36:astore_1        
		String s;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); map.put(((Object) (s)), ((Object) (jsonobject.getString(s)))))
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #105 <Method Iterator JSONObject.keys()>
	//*  21   41:astore_2        
	//*  22   42:aload_2         
	//*  23   43:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//*  24   48:ifeq            77
			s = (String)iterator.next();
	//   25   51:aload_2         
	//   26   52:invokeinterface #115 <Method Object Iterator.next()>
	//   27   57:checkcast       #34  <Class String>
	//   28   60:astore_3        

	//   29   61:aload_1         
	//   30   62:aload_3         
	//   31   63:aload_0         
	//   32   64:aload_3         
	//   33   65:invokevirtual   #26  <Method String JSONObject.getString(String)>
	//   34   68:invokeinterface #121 <Method Object Map.put(Object, Object)>
	//   35   73:pop             
	//*  36   74:goto            42
		return map;
	//   37   77:aload_1         
	//   38   78:areturn         
	}

	public static JSONArray a(Collection collection)
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #125 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void JSONArray()>
	//    3    7:astore_1        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); jsonarray.put(((IPutIntoJson)((Iterator) (collection)).next()).forJsonPut()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #131 <Method Iterator Collection.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            46
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:invokeinterface #115 <Method Object Iterator.next()>
	//   13   31:checkcast       #133 <Class IPutIntoJson>
	//   14   34:invokeinterface #136 <Method Object IPutIntoJson.forJsonPut()>
	//   15   39:invokevirtual   #139 <Method JSONArray JSONArray.put(Object)>
	//   16   42:pop             
	//*  17   43:goto            15
		return jsonarray;
	//   18   46:aload_1         
	//   19   47:areturn         
	}

	public static JSONArray a(Object aobj[])
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #125 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void JSONArray()>
	//    3    7:astore_3        
		int j = aobj.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          33
			jsonarray.put(aobj[i]);
	//   12   18:aload_3         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:invokevirtual   #139 <Method JSONArray JSONArray.put(Object)>
	//   17   25:pop             

	//   18   26:iload_1         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_1        
	//*  22   30:goto            13
		return jsonarray;
	//   23   33:aload_3         
	//   24   34:areturn         
	}

	public static JSONObject a(JSONObject jsonobject, JSONObject jsonobject1)
	{
		JSONObject jsonobject2;
		String s;
		try
		{
			jsonobject2 = new JSONObject();
	//    0    0:new             #4   <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void JSONObject()>
	//    3    7:astore_2        
			String s1;
			for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject2.put(s1, jsonobject.get(s1)))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #105 <Method Iterator JSONObject.keys()>
	//*   6   12:astore_3        
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            49
				s1 = (String)iterator.next();
	//   10   22:aload_3         
	//   11   23:invokeinterface #115 <Method Object Iterator.next()>
	//   12   28:checkcast       #34  <Class String>
	//   13   31:astore          4

	//   14   33:aload_2         
	//   15   34:aload           4
	//   16   36:aload_0         
	//   17   37:aload           4
	//   18   39:invokevirtual   #147 <Method Object JSONObject.get(String)>
	//   19   42:invokevirtual   #150 <Method JSONObject JSONObject.put(String, Object)>
	//   20   45:pop             
		}
	//*  21   46:goto            13
	//*  22   49:aload_1         
	//*  23   50:invokevirtual   #105 <Method Iterator JSONObject.keys()>
	//*  24   53:astore_0        
	//*  25   54:aload_0         
	//*  26   55:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//*  27   60:ifeq            87
	//*  28   63:aload_0         
	//*  29   64:invokeinterface #115 <Method Object Iterator.next()>
	//*  30   69:checkcast       #34  <Class String>
	//*  31   72:astore_3        
	//*  32   73:aload_2         
	//*  33   74:aload_3         
	//*  34   75:aload_1         
	//*  35   76:aload_3         
	//*  36   77:invokevirtual   #147 <Method Object JSONObject.get(String)>
	//*  37   80:invokevirtual   #150 <Method JSONObject JSONObject.put(String, Object)>
	//*  38   83:pop             
	//*  39   84:goto            54
	//*  40   87:aload_2         
	//*  41   88:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  42   89:astore_0        
		{
			AppboyLogger.e(a, "Caught exception merging Json objects.", ((Throwable) (jsonobject)));
	//   43   90:getstatic       #17  <Field String a>
	//   44   93:ldc1            #152 <String "Caught exception merging Json objects.">
	//   45   95:aload_0         
	//   46   96:invokestatic    #71  <Method int AppboyLogger.e(String, String, Throwable)>
	//   47   99:pop             
			return null;
	//   48  100:aconst_null     
	//   49  101:areturn         
		}
		for(jsonobject = ((JSONObject) (jsonobject1.keys())); ((Iterator) (jsonobject)).hasNext(); jsonobject2.put(s, jsonobject1.get(s)))
			s = (String)((Iterator) (jsonobject)).next();

		return jsonobject2;
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ek);

	static 
	{
	//    0    0:ldc1            #2   <Class ek>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String a>
	//*   3    8:return          
	}
}
