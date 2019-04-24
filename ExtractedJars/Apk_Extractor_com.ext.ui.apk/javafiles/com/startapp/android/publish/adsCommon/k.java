// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.android.publish.adsCommon.Utils.i;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class k
{

	public static SharedPreferences a(Context context)
	{
		if(a == null)
	//*   0    0:getstatic       #10  <Field SharedPreferences a>
	//*   1    3:ifnonnull       19
			a = context.getApplicationContext().getSharedPreferences("com.startapp.android.publish", 0);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #18  <Method Context Context.getApplicationContext()>
	//    4   10:ldc1            #20  <String "com.startapp.android.publish">
	//    5   12:iconst_0        
	//    6   13:invokevirtual   #24  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   16:putstatic       #10  <Field SharedPreferences a>
		return a;
	//    8   19:getstatic       #10  <Field SharedPreferences a>
	//    9   22:areturn         
	}

	public static Boolean a(Context context, String s, Boolean boolean1)
	{
		return Boolean.valueOf(a(context).getBoolean(s, boolean1.booleanValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #33  <Method boolean Boolean.booleanValue()>
	//    5    9:invokeinterface #39  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    6   14:invokestatic    #43  <Method Boolean Boolean.valueOf(boolean)>
	//    7   17:areturn         
	}

	public static Float a(Context context, String s, Float float1)
	{
		return Float.valueOf(a(context).getFloat(s, float1.floatValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #50  <Method float Float.floatValue()>
	//    5    9:invokeinterface #54  <Method float SharedPreferences.getFloat(String, float)>
	//    6   14:invokestatic    #57  <Method Float Float.valueOf(float)>
	//    7   17:areturn         
	}

	public static Integer a(Context context, String s, Integer integer)
	{
		return Integer.valueOf(a(context).getInt(s, integer.intValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #64  <Method int Integer.intValue()>
	//    5    9:invokeinterface #68  <Method int SharedPreferences.getInt(String, int)>
	//    6   14:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//    7   17:areturn         
	}

	public static Long a(Context context, String s, Long long1)
	{
		return Long.valueOf(a(context).getLong(s, long1.longValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #78  <Method long Long.longValue()>
	//    5    9:invokeinterface #82  <Method long SharedPreferences.getLong(String, long)>
	//    6   14:invokestatic    #85  <Method Long Long.valueOf(long)>
	//    7   17:areturn         
	}

	public static String a(Context context, String s, String s1)
	{
		return a(context).getString(s, s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #90  <Method String SharedPreferences.getString(String, String)>
	//    5   11:areturn         
	}

	public static void a(Context context, String s, Map map)
	{
		b(context, s, (new JSONObject(map)).toString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #93  <Class JSONObject>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #97  <Method void JSONObject(Map)>
	//    6   10:invokevirtual   #101 <Method String JSONObject.toString()>
	//    7   13:invokestatic    #105 <Method void b(Context, String, String)>
	//    8   16:return          
	}

	public static Map b(Context context, String s, Map map)
	{
		context = ((Context) (a(context).getString(s, ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokeinterface #90  <Method String SharedPreferences.getString(String, String)>
	//    5   11:astore_0        
		try
		{
			context = ((Context) (new JSONObject(((String) (context)))));
	//    6   12:new             #93  <Class JSONObject>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #113 <Method void JSONObject(String)>
	//   10   20:astore_0        
			String s1;
			for(s = ((String) (((JSONObject) (context)).keys())); ((Iterator) (s)).hasNext(); map.put(((Object) (s1)), ((Object) ((String)((JSONObject) (context)).get(s1)))))
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #117 <Method Iterator JSONObject.keys()>
	//*  13   25:astore_1        
	//*  14   26:aload_1         
	//*  15   27:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//*  16   32:ifeq            69
				s1 = (String)((Iterator) (s)).next();
	//   17   35:aload_1         
	//   18   36:invokeinterface #126 <Method Object Iterator.next()>
	//   19   41:checkcast       #128 <Class String>
	//   20   44:astore_3        

	//   21   45:aload_2         
	//   22   46:aload_3         
	//   23   47:aload_0         
	//   24   48:aload_3         
	//   25   49:invokevirtual   #132 <Method Object JSONObject.get(String)>
	//   26   52:checkcast       #128 <Class String>
	//   27   55:invokeinterface #138 <Method Object Map.put(Object, Object)>
	//   28   60:pop             
			break MISSING_BLOCK_LABEL_69;
	//   29   61:goto            26
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   30   64:astore_0        
		((JSONException) (context)).printStackTrace();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #141 <Method void JSONException.printStackTrace()>
		return map;
	//   33   69:aload_2         
	//   34   70:areturn         
		context;
	//   35   71:astore_0        
		return map;
	//   36   72:aload_2         
	//   37   73:areturn         
	}

	public static void b(Context context, String s, Boolean boolean1)
	{
		i.a(a(context).edit().putBoolean(s, boolean1.booleanValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:aload_2         
	//    5   11:invokevirtual   #33  <Method boolean Boolean.booleanValue()>
	//    6   14:invokeinterface #153 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    7   19:invokestatic    #158 <Method void i.a(android.content.SharedPreferences$Editor)>
	//    8   22:return          
	}

	public static void b(Context context, String s, Float float1)
	{
		i.a(a(context).edit().putFloat(s, float1.floatValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:aload_2         
	//    5   11:invokevirtual   #50  <Method float Float.floatValue()>
	//    6   14:invokeinterface #163 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//    7   19:invokestatic    #158 <Method void i.a(android.content.SharedPreferences$Editor)>
	//    8   22:return          
	}

	public static void b(Context context, String s, Integer integer)
	{
		i.a(a(context).edit().putInt(s, integer.intValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:aload_2         
	//    5   11:invokevirtual   #64  <Method int Integer.intValue()>
	//    6   14:invokeinterface #168 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    7   19:invokestatic    #158 <Method void i.a(android.content.SharedPreferences$Editor)>
	//    8   22:return          
	}

	public static void b(Context context, String s, Long long1)
	{
		i.a(a(context).edit().putLong(s, long1.longValue()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:aload_2         
	//    5   11:invokevirtual   #78  <Method long Long.longValue()>
	//    6   14:invokeinterface #173 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    7   19:invokestatic    #158 <Method void i.a(android.content.SharedPreferences$Editor)>
	//    8   22:return          
	}

	public static void b(Context context, String s, String s1)
	{
		i.a(a(context).edit().putString(s, s1));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences a(Context)>
	//    2    4:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:aload_2         
	//    5   11:invokeinterface #177 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    6   16:invokestatic    #158 <Method void i.a(android.content.SharedPreferences$Editor)>
	//    7   19:return          
	}

	private static SharedPreferences a = null;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #10  <Field SharedPreferences a>
	//*   2    4:return          
	}
}
