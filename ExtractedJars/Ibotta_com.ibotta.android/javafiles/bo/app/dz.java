// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			du, eb, cf, cg

public class dz
	implements du
{

	public dz(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #28  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #29  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("com.appboy.storage.session_storage");
	//    6   13:aload           4
	//    7   15:ldc1            #31  <String "com.appboy.storage.session_storage">
	//    8   17:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokestatic    #41  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   15   29:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload           4
	//   20   37:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #51  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   23   44:putfield        #53  <Field SharedPreferences b>
	//   24   47:return          
	}

	private void a(JSONObject jsonobject)
	{
		if(!jsonobject.has("end_time"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #58  <String "end_time">
	//*   2    3:invokevirtual   #64  <Method boolean JSONObject.has(String)>
	//*   3    6:ifne            29
			try
			{
				jsonobject.put("end_time", eb.b());
	//    4    9:aload_1         
	//    5   10:ldc1            #58  <String "end_time">
	//    6   12:invokestatic    #69  <Method double eb.b()>
	//    7   15:invokevirtual   #73  <Method JSONObject JSONObject.put(String, double)>
	//    8   18:pop             
				return;
	//    9   19:return          
			}
	//*  10   20:getstatic       #21  <Field String a>
	//*  11   23:ldc1            #75  <String "Failed to set end time to now for session json data">
	//*  12   25:invokestatic    #79  <Method int AppboyLogger.e(String, String)>
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

	public cf a()
	{
		if(!b.contains("current_open_session"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field SharedPreferences b>
	//*   2    4:ldc1            #82  <String "current_open_session">
	//*   3    6:invokeinterface #87  <Method boolean SharedPreferences.contains(String)>
	//*   4   11:ifne            25
		{
			AppboyLogger.d(a, "No stored open session in storage.");
	//    5   14:getstatic       #21  <Field String a>
	//    6   17:ldc1            #89  <String "No stored open session in storage.">
	//    7   19:invokestatic    #92  <Method int AppboyLogger.d(String, String)>
	//    8   22:pop             
			return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
		}
		String s = b.getString("current_open_session", "");
	//   11   25:aload_0         
	//   12   26:getfield        #53  <Field SharedPreferences b>
	//   13   29:ldc1            #82  <String "current_open_session">
	//   14   31:ldc1            #94  <String "">
	//   15   33:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//   16   38:astore_3        
		Object obj;
		cf cf1;
		JSONException jsonexception;
		try
		{
			obj = ((Object) (JSONObjectInstrumentation.init(b.getString(s, ""))));
	//   17   39:aload_0         
	//   18   40:getfield        #53  <Field SharedPreferences b>
	//   19   43:aload_3         
	//   20   44:ldc1            #94  <String "">
	//   21   46:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//   22   51:invokestatic    #104 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   23   54:astore_1        
		}
	//*  24   55:new             #106 <Class cf>
	//*  25   58:dup             
	//*  26   59:aload_1         
	//*  27   60:invokespecial   #108 <Method void cf(JSONObject)>
	//*  28   63:astore_2        
	//*  29   64:aload_2         
	//*  30   65:areturn         
	//*  31   66:astore_2        
	//*  32   67:goto            81
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
	//*  33   70:astore_2        
		{
			obj = null;
	//   34   71:aconst_null     
	//   35   72:astore_1        
			break MISSING_BLOCK_LABEL_81;
	//   36   73:goto            81
		}
		cf1 = new cf(((JSONObject) (obj)));
		return cf1;
		jsonexception;
		break MISSING_BLOCK_LABEL_81;
		jsonexception;
	//   37   76:astore_2        
		s = null;
	//   38   77:aconst_null     
	//   39   78:astore_3        
		obj = ((Object) (s));
	//   40   79:aload_3         
	//   41   80:astore_1        
		String s1 = a;
	//   42   81:getstatic       #21  <Field String a>
	//   43   84:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   44   86:new             #28  <Class StringBuilder>
	//   45   89:dup             
	//   46   90:invokespecial   #29  <Method void StringBuilder()>
	//   47   93:astore          5
		stringbuilder.append("Could not create new mutable session for open session with id: ");
	//   48   95:aload           5
	//   49   97:ldc1            #110 <String "Could not create new mutable session for open session with id: ">
	//   50   99:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
		stringbuilder.append(s);
	//   52  103:aload           5
	//   53  105:aload_3         
	//   54  106:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   55  109:pop             
		stringbuilder.append(" and json data: ");
	//   56  110:aload           5
	//   57  112:ldc1            #112 <String " and json data: ">
	//   58  114:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
		stringbuilder.append(obj);
	//   60  118:aload           5
	//   61  120:aload_1         
	//   62  121:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   63  124:pop             
		AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   64  125:aload           4
	//   65  127:aload           5
	//   66  129:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   67  132:aload_2         
	//   68  133:invokestatic    #118 <Method int AppboyLogger.e(String, String, Throwable)>
	//   69  136:pop             
		return null;
	//   70  137:aconst_null     
	//   71  138:areturn         
	}

	public void a(cf cf1)
	{
		String s = cf1.a().toString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #122 <Method cg cf.a()>
	//    2    4:invokevirtual   #125 <Method String cg.toString()>
	//    3    7:astore_3        
		Object obj = ((Object) (cf1.g()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #129 <Method JSONObject cf.g()>
	//    6   12:astore_2        
		android.content.SharedPreferences.Editor editor = b.edit();
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field SharedPreferences b>
	//    9   17:invokeinterface #133 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   22:astore          4
		a(((JSONObject) (obj)));
	//   11   24:aload_0         
	//   12   25:aload_2         
	//   13   26:invokespecial   #135 <Method void a(JSONObject)>
		if(!(obj instanceof JSONObject))
	//*  14   29:aload_2         
	//*  15   30:instanceof      #60  <Class JSONObject>
	//*  16   33:ifne            44
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//   17   36:aload_2         
	//   18   37:invokevirtual   #136 <Method String JSONObject.toString()>
	//   19   40:astore_2        
		else
	//*  20   41:goto            52
			obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//   21   44:aload_2         
	//   22   45:checkcast       #60  <Class JSONObject>
	//   23   48:invokestatic    #139 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   24   51:astore_2        
		editor.putString(s, ((String) (obj)));
	//   25   52:aload           4
	//   26   54:aload_3         
	//   27   55:aload_2         
	//   28   56:invokeinterface #145 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   29   61:pop             
		if(!cf1.d())
	//*  30   62:aload_1         
	//*  31   63:invokevirtual   #148 <Method boolean cf.d()>
	//*  32   66:ifne            83
			editor.putString("current_open_session", s);
	//   33   69:aload           4
	//   34   71:ldc1            #82  <String "current_open_session">
	//   35   73:aload_3         
	//   36   74:invokeinterface #145 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   37   79:pop             
		else
	//*  38   80:goto            113
		if(b.getString("current_open_session", "").equals(((Object) (s))))
	//*  39   83:aload_0         
	//*  40   84:getfield        #53  <Field SharedPreferences b>
	//*  41   87:ldc1            #82  <String "current_open_session">
	//*  42   89:ldc1            #94  <String "">
	//*  43   91:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//*  44   96:aload_3         
	//*  45   97:invokevirtual   #154 <Method boolean String.equals(Object)>
	//*  46  100:ifeq            113
			editor.remove("current_open_session");
	//   47  103:aload           4
	//   48  105:ldc1            #82  <String "current_open_session">
	//   49  107:invokeinterface #158 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   50  112:pop             
		editor.apply();
	//   51  113:aload           4
	//   52  115:invokeinterface #161 <Method void android.content.SharedPreferences$Editor.apply()>
	//   53  120:return          
	}

	public void b(cf cf1)
	{
		String s = b.getString("current_open_session", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field SharedPreferences b>
	//    2    4:ldc1            #82  <String "current_open_session">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_2        
		cf1 = ((cf) (cf1.a().toString()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #122 <Method cg cf.a()>
	//    8   17:invokevirtual   #125 <Method String cg.toString()>
	//    9   20:astore_1        
		android.content.SharedPreferences.Editor editor = b.edit();
	//   10   21:aload_0         
	//   11   22:getfield        #53  <Field SharedPreferences b>
	//   12   25:invokeinterface #133 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   30:astore_3        
		editor.remove(((String) (cf1)));
	//   14   31:aload_3         
	//   15   32:aload_1         
	//   16   33:invokeinterface #158 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   17   38:pop             
		if(((String) (cf1)).equals(((Object) (s))))
	//*  18   39:aload_1         
	//*  19   40:aload_2         
	//*  20   41:invokevirtual   #154 <Method boolean String.equals(Object)>
	//*  21   44:ifeq            56
			editor.remove("current_open_session");
	//   22   47:aload_3         
	//   23   48:ldc1            #82  <String "current_open_session">
	//   24   50:invokeinterface #158 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   25   55:pop             
		editor.apply();
	//   26   56:aload_3         
	//   27   57:invokeinterface #161 <Method void android.content.SharedPreferences$Editor.apply()>
	//   28   62:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dz);
	private final SharedPreferences b;

	static 
	{
	//    0    0:ldc1            #2   <Class dz>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String a>
	//*   3    8:return          
	}
}
