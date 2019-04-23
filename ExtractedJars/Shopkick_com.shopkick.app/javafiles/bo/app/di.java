// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			de, dl, by, ca

public class di
	implements de
{

	public di(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #27  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #28  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("com.appboy.storage.session_storage");
	//    6   13:aload           4
	//    7   15:ldc1            #30  <String "com.appboy.storage.session_storage">
	//    8   17:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokestatic    #40  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   15   29:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload           4
	//   20   37:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #50  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   23   44:putfield        #52  <Field SharedPreferences b>
	//   24   47:return          
	}

	private void a(JSONObject jsonobject)
	{
		if(!jsonobject.has("end_time"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #57  <String "end_time">
	//*   2    3:invokevirtual   #63  <Method boolean JSONObject.has(String)>
	//*   3    6:ifne            29
			try
			{
				jsonobject.put("end_time", dl.b());
	//    4    9:aload_1         
	//    5   10:ldc1            #57  <String "end_time">
	//    6   12:invokestatic    #68  <Method double dl.b()>
	//    7   15:invokevirtual   #72  <Method JSONObject JSONObject.put(String, double)>
	//    8   18:pop             
				return;
	//    9   19:return          
			}
	//*  10   20:getstatic       #20  <Field String a>
	//*  11   23:ldc1            #74  <String "Failed to set end time to now for session json data">
	//*  12   25:invokestatic    #78  <Method int AppboyLogger.e(String, String)>
	//*  13   28:pop             
	//*  14   29:return          
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
			{
				AppboyLogger.e(a, "Failed to set end time to now for session json data");
			}
	//*  15   30:astore_1        
	//*  16   31:goto            20
	}

	public by a()
	{
		if(!b.contains("current_open_session"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SharedPreferences b>
	//*   2    4:ldc1            #81  <String "current_open_session">
	//*   3    6:invokeinterface #86  <Method boolean SharedPreferences.contains(String)>
	//*   4   11:ifne            25
		{
			AppboyLogger.d(a, "No stored open session in storage.");
	//    5   14:getstatic       #20  <Field String a>
	//    6   17:ldc1            #88  <String "No stored open session in storage.">
	//    7   19:invokestatic    #91  <Method int AppboyLogger.d(String, String)>
	//    8   22:pop             
			return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
		}
		String s = b.getString("current_open_session", "");
	//   11   25:aload_0         
	//   12   26:getfield        #52  <Field SharedPreferences b>
	//   13   29:ldc1            #81  <String "current_open_session">
	//   14   31:ldc1            #93  <String "">
	//   15   33:invokeinterface #97  <Method String SharedPreferences.getString(String, String)>
	//   16   38:astore_3        
		Object obj;
		by by1;
		JSONException jsonexception;
		try
		{
			obj = ((Object) (new JSONObject(b.getString(s, ""))));
	//   17   39:new             #59  <Class JSONObject>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:getfield        #52  <Field SharedPreferences b>
	//   21   47:aload_3         
	//   22   48:ldc1            #93  <String "">
	//   23   50:invokeinterface #97  <Method String SharedPreferences.getString(String, String)>
	//   24   55:invokespecial   #100 <Method void JSONObject(String)>
	//   25   58:astore_1        
		}
	//*  26   59:new             #102 <Class by>
	//*  27   62:dup             
	//*  28   63:aload_1         
	//*  29   64:invokespecial   #104 <Method void by(JSONObject)>
	//*  30   67:astore_2        
	//*  31   68:aload_2         
	//*  32   69:areturn         
	//*  33   70:astore_2        
	//*  34   71:goto            85
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
	//*  35   74:astore_2        
		{
			obj = null;
	//   36   75:aconst_null     
	//   37   76:astore_1        
			break MISSING_BLOCK_LABEL_85;
	//   38   77:goto            85
		}
		by1 = new by(((JSONObject) (obj)));
		return by1;
		jsonexception;
		break MISSING_BLOCK_LABEL_85;
		jsonexception;
	//   39   80:astore_2        
		s = null;
	//   40   81:aconst_null     
	//   41   82:astore_3        
		obj = ((Object) (s));
	//   42   83:aload_3         
	//   43   84:astore_1        
		String s1 = a;
	//   44   85:getstatic       #20  <Field String a>
	//   45   88:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   46   90:new             #27  <Class StringBuilder>
	//   47   93:dup             
	//   48   94:invokespecial   #28  <Method void StringBuilder()>
	//   49   97:astore          5
		stringbuilder.append("Could not create new mutable session for open session with id: ");
	//   50   99:aload           5
	//   51  101:ldc1            #106 <String "Could not create new mutable session for open session with id: ">
	//   52  103:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
		stringbuilder.append(s);
	//   54  107:aload           5
	//   55  109:aload_3         
	//   56  110:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   57  113:pop             
		stringbuilder.append(" and json data: ");
	//   58  114:aload           5
	//   59  116:ldc1            #108 <String " and json data: ">
	//   60  118:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   61  121:pop             
		stringbuilder.append(obj);
	//   62  122:aload           5
	//   63  124:aload_1         
	//   64  125:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
	//   65  128:pop             
		AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   66  129:aload           4
	//   67  131:aload           5
	//   68  133:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   69  136:aload_2         
	//   70  137:invokestatic    #114 <Method int AppboyLogger.e(String, String, Throwable)>
	//   71  140:pop             
		return null;
	//   72  141:aconst_null     
	//   73  142:areturn         
	}

	public void a(by by1)
	{
		String s = by1.a().toString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #118 <Method ca by.a()>
	//    2    4:invokevirtual   #121 <Method String ca.toString()>
	//    3    7:astore_2        
		JSONObject jsonobject = by1.g();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #125 <Method JSONObject by.g()>
	//    6   12:astore_3        
		android.content.SharedPreferences.Editor editor = b.edit();
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field SharedPreferences b>
	//    9   17:invokeinterface #129 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   22:astore          4
		a(jsonobject);
	//   11   24:aload_0         
	//   12   25:aload_3         
	//   13   26:invokespecial   #131 <Method void a(JSONObject)>
		editor.putString(s, jsonobject.toString());
	//   14   29:aload           4
	//   15   31:aload_2         
	//   16   32:aload_3         
	//   17   33:invokevirtual   #132 <Method String JSONObject.toString()>
	//   18   36:invokeinterface #138 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   19   41:pop             
		if(!by1.d())
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #141 <Method boolean by.d()>
	//*  22   46:ifne            63
			editor.putString("current_open_session", s);
	//   23   49:aload           4
	//   24   51:ldc1            #81  <String "current_open_session">
	//   25   53:aload_2         
	//   26   54:invokeinterface #138 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   27   59:pop             
		else
	//*  28   60:goto            93
		if(b.getString("current_open_session", "").equals(((Object) (s))))
	//*  29   63:aload_0         
	//*  30   64:getfield        #52  <Field SharedPreferences b>
	//*  31   67:ldc1            #81  <String "current_open_session">
	//*  32   69:ldc1            #93  <String "">
	//*  33   71:invokeinterface #97  <Method String SharedPreferences.getString(String, String)>
	//*  34   76:aload_2         
	//*  35   77:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  36   80:ifeq            93
			editor.remove("current_open_session");
	//   37   83:aload           4
	//   38   85:ldc1            #81  <String "current_open_session">
	//   39   87:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   40   92:pop             
		editor.apply();
	//   41   93:aload           4
	//   42   95:invokeinterface #154 <Method void android.content.SharedPreferences$Editor.apply()>
	//   43  100:return          
	}

	public void b(by by1)
	{
		String s = b.getString("current_open_session", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SharedPreferences b>
	//    2    4:ldc1            #81  <String "current_open_session">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #97  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_2        
		by1 = ((by) (by1.a().toString()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #118 <Method ca by.a()>
	//    8   17:invokevirtual   #121 <Method String ca.toString()>
	//    9   20:astore_1        
		android.content.SharedPreferences.Editor editor = b.edit();
	//   10   21:aload_0         
	//   11   22:getfield        #52  <Field SharedPreferences b>
	//   12   25:invokeinterface #129 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   30:astore_3        
		editor.remove(((String) (by1)));
	//   14   31:aload_3         
	//   15   32:aload_1         
	//   16   33:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   17   38:pop             
		if(((String) (by1)).equals(((Object) (s))))
	//*  18   39:aload_1         
	//*  19   40:aload_2         
	//*  20   41:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  21   44:ifeq            56
			editor.remove("current_open_session");
	//   22   47:aload_3         
	//   23   48:ldc1            #81  <String "current_open_session">
	//   24   50:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   25   55:pop             
		editor.apply();
	//   26   56:aload_3         
	//   27   57:invokeinterface #154 <Method void android.content.SharedPreferences$Editor.apply()>
	//   28   62:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/di);
	private final SharedPreferences b;

	static 
	{
	//    0    0:ldc1            #2   <Class di>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}
