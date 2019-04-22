// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.*;
import com.appboy.models.outgoing.*;
import com.appboy.support.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			dk, dw, cn, ek, 
//			bx, eb, u, dx

public class ea extends dk
{

	public ea(Context context, bx bx1, dx dx1, dw dw1)
	{
		this(context, ((String) (null)), ((String) (null)), bx1, dx1, dw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:aload           4
	//    7    8:invokespecial   #35  <Method void ea(Context, String, String, bx, dx, dw)>
	//    8   11:return          
	}

	public ea(Context context, String s, String s1, bx bx1, dx dx1, dw dw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void dk()>
		s1 = StringUtils.getCacheFileSuffix(context, s, s1);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #43  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//    6   10:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #45  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #46  <Method void StringBuilder()>
	//   10   18:astore          7
		stringbuilder.append("com.appboy.storage.user_cache.v3");
	//   11   20:aload           7
	//   12   22:ldc1            #48  <String "com.appboy.storage.user_cache.v3">
	//   13   24:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append(s1);
	//   15   28:aload           7
	//   16   30:aload_3         
	//   17   31:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		a = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload           7
	//   22   39:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   23   42:iconst_0        
	//   24   43:invokevirtual   #62  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   25   46:putfield        #64  <Field SharedPreferences a>
		stringbuilder = new StringBuilder();
	//   26   49:new             #45  <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #46  <Method void StringBuilder()>
	//   29   56:astore          7
		stringbuilder.append("com.appboy.storage.user_cache.push_token_store");
	//   30   58:aload           7
	//   31   60:ldc1            #66  <String "com.appboy.storage.user_cache.push_token_store">
	//   32   62:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		stringbuilder.append(s1);
	//   34   66:aload           7
	//   35   68:aload_3         
	//   36   69:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   38   73:aload_0         
	//   39   74:aload_1         
	//   40   75:aload           7
	//   41   77:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   42   80:iconst_0        
	//   43   81:invokevirtual   #62  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   44   84:putfield        #68  <Field SharedPreferences b>
		d = bx1;
	//   45   87:aload_0         
	//   46   88:aload           4
	//   47   90:putfield        #70  <Field bx d>
		e = dx1;
	//   48   93:aload_0         
	//   49   94:aload           5
	//   50   96:putfield        #72  <Field dx e>
		f = s;
	//   51   99:aload_0         
	//   52  100:aload_2         
	//   53  101:putfield        #74  <Field String f>
		g = dw1;
	//   54  104:aload_0         
	//   55  105:aload           6
	//   56  107:putfield        #76  <Field dw g>
	//   57  110:return          
	}

	private boolean b(JSONObject jsonobject)
	{
		if(g.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field dw g>
	//*   2    4:invokevirtual   #82  <Method boolean dw.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(c, "SDK is disabled. Not writing to user cache.");
	//    4   10:getstatic       #29  <Field String c>
	//    5   13:ldc1            #84  <String "SDK is disabled. Not writing to user cache.">
	//    6   15:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
		}
		android.content.SharedPreferences.Editor editor = a.edit();
	//   10   21:aload_0         
	//   11   22:getfield        #64  <Field SharedPreferences a>
	//   12   25:invokeinterface #94  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   30:astore_2        
		if(!(jsonobject instanceof JSONObject))
	//*  14   31:aload_1         
	//*  15   32:instanceof      #96  <Class JSONObject>
	//*  16   35:ifne            46
			jsonobject = ((JSONObject) (jsonobject.toString()));
	//   17   38:aload_1         
	//   18   39:invokevirtual   #97  <Method String JSONObject.toString()>
	//   19   42:astore_1        
		else
	//*  20   43:goto            54
			jsonobject = ((JSONObject) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   21   46:aload_1         
	//   22   47:checkcast       #96  <Class JSONObject>
	//   23   50:invokestatic    #102 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   24   53:astore_1        
		editor.putString("user_cache_attributes_object", ((String) (jsonobject)));
	//   25   54:aload_2         
	//   26   55:ldc1            #104 <String "user_cache_attributes_object">
	//   27   57:aload_1         
	//   28   58:invokeinterface #110 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   29   63:pop             
		editor.apply();
	//   30   64:aload_2         
	//   31   65:invokeinterface #113 <Method void android.content.SharedPreferences$Editor.apply()>
		return true;
	//   32   70:iconst_1        
	//   33   71:ireturn         
	}

	private boolean c(String s, Object obj)
	{
		Object obj1 = ((Object) (f()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method JSONObject f()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       21
		{
			StringBuilder stringbuilder;
			try
			{
				((JSONObject) (obj1)).put(s, JSONObject.NULL);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:getstatic       #123 <Field Object JSONObject.NULL>
	//    8   14:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    9   17:pop             
			}
	//*  10   18:goto            28
	//*  11   21:aload_3         
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//*  15   27:pop             
	//*  16   28:aload_0         
	//*  17   29:aload_3         
	//*  18   30:invokespecial   #129 <Method boolean b(JSONObject)>
	//*  19   33:ireturn         
	//*  20   34:getstatic       #29  <Field String c>
	//*  21   37:astore_3        
	//*  22   38:new             #45  <Class StringBuilder>
	//*  23   41:dup             
	//*  24   42:invokespecial   #46  <Method void StringBuilder()>
	//*  25   45:astore          4
	//*  26   47:aload           4
	//*  27   49:ldc1            #131 <String "Failed to write to user object json from prefs with key: [">
	//*  28   51:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  29   54:pop             
	//*  30   55:aload           4
	//*  31   57:aload_1         
	//*  32   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  33   61:pop             
	//*  34   62:aload           4
	//*  35   64:ldc1            #133 <String "] value: [">
	//*  36   66:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  37   69:pop             
	//*  38   70:aload           4
	//*  39   72:aload_2         
	//*  40   73:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//*  41   76:pop             
	//*  42   77:aload           4
	//*  43   79:ldc1            #138 <String "] ">
	//*  44   81:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  45   84:pop             
	//*  46   85:aload_3         
	//*  47   86:aload           4
	//*  48   88:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  49   91:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//*  50   94:pop             
	//*  51   95:iconst_0        
	//*  52   96:ireturn         
			// Misplaced declaration of an exception variable
			catch(JSONException jsonexception)
			{
				obj1 = ((Object) (c));
				stringbuilder = new StringBuilder();
				stringbuilder.append("Failed to write to user object json from prefs with key: [");
				stringbuilder.append(s);
				stringbuilder.append("] value: [");
				stringbuilder.append(obj);
				stringbuilder.append("] ");
				AppboyLogger.w(((String) (obj1)), stringbuilder.toString());
				return false;
			}
			break MISSING_BLOCK_LABEL_28;
		}
		((JSONObject) (obj1)).put(s, obj);
		JSONException jsonexception;
		return b(((JSONObject) (obj1)));
	//*  53   97:astore_3        
	//*  54   98:goto            34
	}

	private JSONObject g()
	{
		Object obj;
label0:
		{
			obj = ((Object) (f()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method JSONObject f()>
	//    2    4:astore_1        
			if(((JSONObject) (obj)).has("custom"))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #140 <String "custom">
	//*   5    8:invokevirtual   #144 <Method boolean JSONObject.has(String)>
	//*   6   11:ifeq            35
				try
				{
					obj = ((Object) (((JSONObject) (obj)).getJSONObject("custom")));
	//    7   14:aload_1         
	//    8   15:ldc1            #140 <String "custom">
	//    9   17:invokevirtual   #148 <Method JSONObject JSONObject.getJSONObject(String)>
	//   10   20:astore_1        
					break label0;
	//   11   21:goto            37
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  12   24:astore_1        
				{
					AppboyLogger.e(c, "Could not create custom attributes json object from preferences.", ((Throwable) (obj)));
	//   13   25:getstatic       #29  <Field String c>
	//   14   28:ldc1            #150 <String "Could not create custom attributes json object from preferences.">
	//   15   30:aload_1         
	//   16   31:invokestatic    #153 <Method int AppboyLogger.e(String, String, Throwable)>
	//   17   34:pop             
				}
			obj = null;
	//   18   35:aconst_null     
	//   19   36:astore_1        
		}
		Object obj1 = obj;
	//   20   37:aload_1         
	//   21   38:astore_2        
		if(obj == null)
	//*  22   39:aload_1         
	//*  23   40:ifnonnull       51
			obj1 = ((Object) (new JSONObject()));
	//   24   43:new             #96  <Class JSONObject>
	//   25   46:dup             
	//   26   47:invokespecial   #154 <Method void JSONObject()>
	//   27   50:astore_2        
		return ((JSONObject) (obj1));
	//   28   51:aload_2         
	//   29   52:areturn         
	}

	public Object a()
	{
		return ((Object) (e()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method cn e()>
	//    2    4:areturn         
	}

	void a(cn cn1, boolean flag)
	{
		Object obj;
		if(cn1 == null || cn1.a() == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          217
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #165 <Method JSONObject cn.a()>
	//*   4    8:ifnonnull       14
			break MISSING_BLOCK_LABEL_217;
	//    5   11:goto            217
		obj = ((Object) (cn1.a()));
	//    6   14:aload_1         
	//    7   15:invokevirtual   #165 <Method JSONObject cn.a()>
	//    8   18:astore_3        
		if(flag)
	//*   9   19:iload_2         
	//*  10   20:ifeq            64
		{
			if(((JSONObject) (obj)).has("push_token"))
	//*  11   23:aload_3         
	//*  12   24:ldc1            #167 <String "push_token">
	//*  13   26:invokevirtual   #144 <Method boolean JSONObject.has(String)>
	//*  14   29:ifeq            63
			{
				cn1 = ((cn) (b.edit()));
	//   15   32:aload_0         
	//   16   33:getfield        #68  <Field SharedPreferences b>
	//   17   36:invokeinterface #94  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   18   41:astore_1        
				((android.content.SharedPreferences.Editor) (cn1)).putString("push_token", ((JSONObject) (obj)).optString("push_token"));
	//   19   42:aload_1         
	//   20   43:ldc1            #167 <String "push_token">
	//   21   45:aload_3         
	//   22   46:ldc1            #167 <String "push_token">
	//   23   48:invokevirtual   #171 <Method String JSONObject.optString(String)>
	//   24   51:invokeinterface #110 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   25   56:pop             
				((android.content.SharedPreferences.Editor) (cn1)).apply();
	//   26   57:aload_1         
	//   27   58:invokeinterface #113 <Method void android.content.SharedPreferences$Editor.apply()>
			}
			return;
	//   28   63:return          
		}
		JSONObject jsonobject = f();
	//   29   64:aload_0         
	//   30   65:invokevirtual   #119 <Method JSONObject f()>
	//   31   68:astore          4
		cn1 = ((cn) (ek.a(((JSONObject) (obj)), jsonobject)));
	//   32   70:aload_3         
	//   33   71:aload           4
	//   34   73:invokestatic    #176 <Method JSONObject ek.a(JSONObject, JSONObject)>
	//   35   76:astore_1        
		((JSONObject) (cn1)).remove("push_token");
	//   36   77:aload_1         
	//   37   78:ldc1            #167 <String "push_token">
	//   38   80:invokevirtual   #180 <Method Object JSONObject.remove(String)>
	//   39   83:pop             
		jsonobject = jsonobject.optJSONObject("custom");
	//   40   84:aload           4
	//   41   86:ldc1            #140 <String "custom">
	//   42   88:invokevirtual   #183 <Method JSONObject JSONObject.optJSONObject(String)>
	//   43   91:astore          4
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("custom")));
	//   44   93:aload_3         
	//   45   94:ldc1            #140 <String "custom">
	//   46   96:invokevirtual   #183 <Method JSONObject JSONObject.optJSONObject(String)>
	//   47   99:astore_3        
		if(jsonobject != null && obj != null)
	//*  48  100:aload           4
	//*  49  102:ifnull          125
	//*  50  105:aload_3         
	//*  51  106:ifnull          125
		{
			try
			{
				((JSONObject) (cn1)).put("custom", ((Object) (ek.a(((JSONObject) (obj)), jsonobject))));
	//   52  109:aload_1         
	//   53  110:ldc1            #140 <String "custom">
	//   54  112:aload_3         
	//   55  113:aload           4
	//   56  115:invokestatic    #176 <Method JSONObject ek.a(JSONObject, JSONObject)>
	//   57  118:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   58  121:pop             
			}
	//*  59  122:goto            167
	//*  60  125:aload           4
	//*  61  127:ifnull          142
	//*  62  130:aload_1         
	//*  63  131:ldc1            #140 <String "custom">
	//*  64  133:aload           4
	//*  65  135:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//*  66  138:pop             
	//*  67  139:goto            167
	//*  68  142:aload_3         
	//*  69  143:ifnull          167
	//*  70  146:aload_1         
	//*  71  147:ldc1            #140 <String "custom">
	//*  72  149:aload_3         
	//*  73  150:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//*  74  153:pop             
	//*  75  154:goto            167
	//*  76  157:getstatic       #29  <Field String c>
	//*  77  160:ldc1            #185 <String "Failed to add merged custom attributes back to user object.">
	//*  78  162:aload_3         
	//*  79  163:invokestatic    #187 <Method int AppboyLogger.w(String, String, Throwable)>
	//*  80  166:pop             
	//*  81  167:aload_0         
	//*  82  168:getfield        #64  <Field SharedPreferences a>
	//*  83  171:invokeinterface #94  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//*  84  176:astore_3        
	//*  85  177:aload_1         
	//*  86  178:instanceof      #96  <Class JSONObject>
	//*  87  181:ifne            192
	//*  88  184:aload_1         
	//*  89  185:invokevirtual   #97  <Method String JSONObject.toString()>
	//*  90  188:astore_1        
	//*  91  189:goto            200
	//*  92  192:aload_1         
	//*  93  193:checkcast       #96  <Class JSONObject>
	//*  94  196:invokestatic    #102 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  95  199:astore_1        
	//*  96  200:aload_3         
	//*  97  201:ldc1            #104 <String "user_cache_attributes_object">
	//*  98  203:aload_1         
	//*  99  204:invokeinterface #110 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 100  209:pop             
	//* 101  210:aload_3         
	//* 102  211:invokeinterface #113 <Method void android.content.SharedPreferences$Editor.apply()>
	//* 103  216:return          
	//* 104  217:getstatic       #29  <Field String c>
	//* 105  220:ldc1            #189 <String "Tried to confirm with a null outbound user. Doing nothing.">
	//* 106  222:invokestatic    #191 <Method int AppboyLogger.d(String, String)>
	//* 107  225:pop             
	//* 108  226:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				AppboyLogger.w(c, "Failed to add merged custom attributes back to user object.", ((Throwable) (obj)));
			}
			break MISSING_BLOCK_LABEL_167;
		}
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_142;
		((JSONObject) (cn1)).put("custom", ((Object) (jsonobject)));
		break MISSING_BLOCK_LABEL_167;
		if(obj == null)
			break MISSING_BLOCK_LABEL_167;
		((JSONObject) (cn1)).put("custom", obj);
		obj = ((Object) (a.edit()));
		if(!(cn1 instanceof JSONObject))
			cn1 = ((cn) (((JSONObject) (cn1)).toString()));
		else
			cn1 = ((cn) (JSONObjectInstrumentation.toString((JSONObject)cn1)));
		((android.content.SharedPreferences.Editor) (obj)).putString("user_cache_attributes_object", ((String) (cn1)));
		((android.content.SharedPreferences.Editor) (obj)).apply();
		return;
		AppboyLogger.d(c, "Tried to confirm with a null outbound user. Doing nothing.");
		return;
	//* 109  227:astore_3        
	//* 110  228:goto            157
	}

	public void a(Gender gender)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(gender != null)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_1         
	//    3    3:ifnonnull       17
		c("gender", ((Object) (null)));
	//    4    6:aload_0         
	//    5    7:ldc1            #194 <String "gender">
	//    6    9:aconst_null     
	//    7   10:invokespecial   #196 <Method boolean c(String, Object)>
	//    8   13:pop             
		break MISSING_BLOCK_LABEL_28;
	//    9   14:goto            28
		c("gender", ((Object) (gender.forJsonPut())));
	//   10   17:aload_0         
	//   11   18:ldc1            #194 <String "gender">
	//   12   20:aload_1         
	//   13   21:invokevirtual   #201 <Method String Gender.forJsonPut()>
	//   14   24:invokespecial   #196 <Method boolean c(String, Object)>
	//   15   27:pop             
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return;
	//   18   30:return          
		gender;
	//   19   31:astore_1        
	//*  20   32:aload_0         
		throw gender;
	//   21   33:monitorexit     
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public void a(NotificationSubscriptionType notificationsubscriptiontype)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(notificationsubscriptiontype != null)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_1         
	//    3    3:ifnonnull       17
		c("email_subscribe", ((Object) (null)));
	//    4    6:aload_0         
	//    5    7:ldc1            #204 <String "email_subscribe">
	//    6    9:aconst_null     
	//    7   10:invokespecial   #196 <Method boolean c(String, Object)>
	//    8   13:pop             
		break MISSING_BLOCK_LABEL_28;
	//    9   14:goto            28
		c("email_subscribe", ((Object) (notificationsubscriptiontype.forJsonPut())));
	//   10   17:aload_0         
	//   11   18:ldc1            #204 <String "email_subscribe">
	//   12   20:aload_1         
	//   13   21:invokevirtual   #207 <Method String NotificationSubscriptionType.forJsonPut()>
	//   14   24:invokespecial   #196 <Method boolean c(String, Object)>
	//   15   27:pop             
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return;
	//   18   30:return          
		notificationsubscriptiontype;
	//   19   31:astore_1        
	//*  20   32:aload_0         
		throw notificationsubscriptiontype;
	//   21   33:monitorexit     
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public void a(AttributionData attributiondata)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(attributiondata == null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnull          30
_L1:
		attributiondata = ((AttributionData) (attributiondata.forJsonPut()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #212 <Method JSONObject AttributionData.forJsonPut()>
	//    6   10:astore_1        
	//*   7   11:goto            14
_L4:
		a("ab_install_attribution", ((JSONObject) (attributiondata)));
	//    8   14:aload_0         
	//    9   15:ldc1            #214 <String "ab_install_attribution">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #217 <Method boolean a(String, JSONObject)>
	//   12   21:pop             
		this;
	//   13   22:aload_0         
		JVM INSTR monitorexit ;
	//   14   23:monitorexit     
		return;
	//   15   24:return          
		attributiondata;
	//   16   25:astore_1        
	//*  17   26:aload_0         
		throw attributiondata;
	//   18   27:monitorexit     
	//   19   28:aload_1         
	//   20   29:athrow          
_L2:
		attributiondata = null;
	//   21   30:aconst_null     
	//   22   31:astore_1        
		if(true) goto _L4; else goto _L3
	//   23   32:goto            14
_L3:
	}

	public void a(FacebookUser facebookuser)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(facebookuser == null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnull          30
_L1:
		facebookuser = ((FacebookUser) (facebookuser.forJsonPut()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #221 <Method JSONObject FacebookUser.forJsonPut()>
	//    6   10:astore_1        
	//*   7   11:goto            14
_L4:
		a("facebook", ((JSONObject) (facebookuser)));
	//    8   14:aload_0         
	//    9   15:ldc1            #223 <String "facebook">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #217 <Method boolean a(String, JSONObject)>
	//   12   21:pop             
		this;
	//   13   22:aload_0         
		JVM INSTR monitorexit ;
	//   14   23:monitorexit     
		return;
	//   15   24:return          
		facebookuser;
	//   16   25:astore_1        
	//*  17   26:aload_0         
		throw facebookuser;
	//   18   27:monitorexit     
	//   19   28:aload_1         
	//   20   29:athrow          
_L2:
		facebookuser = null;
	//   21   30:aconst_null     
	//   22   31:astore_1        
		if(true) goto _L4; else goto _L3
	//   23   32:goto            14
_L3:
	}

	public void a(TwitterUser twitteruser)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(twitteruser == null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnull          30
_L1:
		twitteruser = ((TwitterUser) (twitteruser.forJsonPut()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #227 <Method JSONObject TwitterUser.forJsonPut()>
	//    6   10:astore_1        
	//*   7   11:goto            14
_L4:
		a("twitter", ((JSONObject) (twitteruser)));
	//    8   14:aload_0         
	//    9   15:ldc1            #229 <String "twitter">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #217 <Method boolean a(String, JSONObject)>
	//   12   21:pop             
		this;
	//   13   22:aload_0         
		JVM INSTR monitorexit ;
	//   14   23:monitorexit     
		return;
	//   15   24:return          
		twitteruser;
	//   16   25:astore_1        
	//*  17   26:aload_0         
		throw twitteruser;
	//   18   27:monitorexit     
	//   19   28:aload_1         
	//   20   29:athrow          
_L2:
		twitteruser = null;
	//   21   30:aconst_null     
	//   22   31:astore_1        
		if(true) goto _L4; else goto _L3
	//   23   32:goto            14
_L3:
	}

	volatile void a(Object obj, boolean flag)
	{
		a((cn)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #163 <Class cn>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #232 <Method void a(cn, boolean)>
	//    5    9:return          
	}

	public void a(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c("user_id", ((Object) (s)));
	//    2    2:aload_0         
	//    3    3:ldc1            #235 <String "user_id">
	//    4    5:aload_1         
	//    5    6:invokespecial   #196 <Method boolean c(String, Object)>
	//    6    9:pop             
		this;
	//    7   10:aload_0         
		JVM INSTR monitorexit ;
	//    8   11:monitorexit     
		return;
	//    9   12:return          
		s;
	//   10   13:astore_1        
	//*  11   14:aload_0         
		throw s;
	//   12   15:monitorexit     
	//   13   16:aload_1         
	//   14   17:athrow          
	}

	void a(JSONObject jsonobject)
	{
		String s = d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field bx d>
	//    2    4:invokeinterface #240 <Method String bx.a()>
	//    3    9:astore_2        
		if(s == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       24
		{
			AppboyLogger.d(c, "Cannot add null push token to attributes object.");
	//    6   14:getstatic       #29  <Field String c>
	//    7   17:ldc1            #242 <String "Cannot add null push token to attributes object.">
	//    8   19:invokestatic    #191 <Method int AppboyLogger.d(String, String)>
	//    9   22:pop             
			return;
	//   10   23:return          
		}
		String s1 = b.getString("push_token", ((String) (null)));
	//   11   24:aload_0         
	//   12   25:getfield        #68  <Field SharedPreferences b>
	//   13   28:ldc1            #167 <String "push_token">
	//   14   30:aconst_null     
	//   15   31:invokeinterface #246 <Method String SharedPreferences.getString(String, String)>
	//   16   36:astore_3        
		if(s1 == null || !s.equals(((Object) (s1))))
	//*  17   37:aload_3         
	//*  18   38:ifnull          49
	//*  19   41:aload_2         
	//*  20   42:aload_3         
	//*  21   43:invokevirtual   #252 <Method boolean String.equals(Object)>
	//*  22   46:ifne            57
			jsonobject.put("push_token", ((Object) (s)));
	//   23   49:aload_1         
	//   24   50:ldc1            #167 <String "push_token">
	//   25   52:aload_2         
	//   26   53:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   27   56:pop             
	//   28   57:return          
	}

	public boolean a(int k, Month month, int l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(month != null)
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_2         
	//    3    3:ifnonnull       19
		AppboyLogger.w(c, "Month cannot be null.");
	//    4    6:getstatic       #29  <Field String c>
	//    5    9:ldc1            #255 <String "Month cannot be null.">
	//    6   11:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//    7   14:pop             
		this;
	//    8   15:aload_0         
		JVM INSTR monitorexit ;
	//    9   16:monitorexit     
		return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
		boolean flag = c("dob", ((Object) (eb.a(eb.a(k, month.getValue(), l), u.a))));
	//   12   19:aload_0         
	//   13   20:ldc2            #257 <String "dob">
	//   14   23:iload_1         
	//   15   24:aload_2         
	//   16   25:invokevirtual   #263 <Method int Month.getValue()>
	//   17   28:iload_3         
	//   18   29:invokestatic    #268 <Method Date eb.a(int, int, int)>
	//   19   32:getstatic       #273 <Field u u.a>
	//   20   35:invokestatic    #276 <Method String eb.a(Date, u)>
	//   21   38:invokespecial   #196 <Method boolean c(String, Object)>
	//   22   41:istore          4
		this;
	//   23   43:aload_0         
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		return flag;
	//   25   45:iload           4
	//   26   47:ireturn         
		month;
	//   27   48:astore_2        
	//*  28   49:aload_0         
		throw month;
	//   29   50:monitorexit     
	//   30   51:aload_2         
	//   31   52:athrow          
	}

	public boolean a(String s, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = a(s, ((Object) (eb.a(l))));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:lload_2         
	//    5    5:invokestatic    #280 <Method Date eb.a(long)>
	//    6    8:invokevirtual   #282 <Method boolean a(String, Object)>
	//    7   11:istore          4
		this;
	//    8   13:aload_0         
		JVM INSTR monitorexit ;
	//    9   14:monitorexit     
		return flag;
	//   10   15:iload           4
	//   11   17:ireturn         
		s;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw s;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public boolean a(String s, Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(CustomAttributeValidationUtils.isValidCustomAttributeKey(s, e.i()))
			break MISSING_BLOCK_LABEL_30;
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #72  <Field dx e>
	//    5    7:invokevirtual   #288 <Method java.util.Set dx.i()>
	//    6   10:invokestatic    #294 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//    7   13:ifne            30
		AppboyLogger.w(c, "Custom attribute key cannot be null.");
	//    8   16:getstatic       #29  <Field String c>
	//    9   19:ldc2            #296 <String "Custom attribute key cannot be null.">
	//   10   22:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//   11   25:pop             
		this;
	//   12   26:aload_0         
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		s = ValidationUtils.ensureAppboyFieldLength(s);
	//   16   30:aload_1         
	//   17   31:invokestatic    #301 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   18   34:astore_1        
		if((obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Long) || (obj instanceof Double))
	//*  19   35:aload_2         
	//*  20   36:instanceof      #303 <Class Boolean>
	//*  21   39:ifne            212
	//*  22   42:aload_2         
	//*  23   43:instanceof      #305 <Class Integer>
	//*  24   46:ifne            212
	//*  25   49:aload_2         
	//*  26   50:instanceof      #307 <Class Float>
	//*  27   53:ifne            212
	//*  28   56:aload_2         
	//*  29   57:instanceof      #309 <Class Long>
	//*  30   60:ifne            212
	//*  31   63:aload_2         
	//*  32   64:instanceof      #311 <Class Double>
	//*  33   67:ifeq            73
			break MISSING_BLOCK_LABEL_212;
	//   34   70:goto            212
		boolean flag;
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_97;
	//   35   73:aload_2         
	//   36   74:instanceof      #248 <Class String>
	//   37   77:ifeq            97
		flag = b(s, ((Object) (ValidationUtils.ensureAppboyFieldLength((String)obj))));
	//   38   80:aload_0         
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:checkcast       #248 <Class String>
	//   42   86:invokestatic    #301 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   43   89:invokevirtual   #313 <Method boolean b(String, Object)>
	//   44   92:istore_3        
		this;
	//   45   93:aload_0         
		JVM INSTR monitorexit ;
	//   46   94:monitorexit     
		return flag;
	//   47   95:iload_3         
	//   48   96:ireturn         
		if(!(obj instanceof Date))
			break MISSING_BLOCK_LABEL_124;
	//   49   97:aload_2         
	//   50   98:instanceof      #315 <Class Date>
	//   51  101:ifeq            124
		flag = b(s, ((Object) (eb.a((Date)obj, u.b))));
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:aload_2         
	//   55  107:checkcast       #315 <Class Date>
	//   56  110:getstatic       #317 <Field u u.b>
	//   57  113:invokestatic    #276 <Method String eb.a(Date, u)>
	//   58  116:invokevirtual   #313 <Method boolean b(String, Object)>
	//   59  119:istore_3        
		this;
	//   60  120:aload_0         
		JVM INSTR monitorexit ;
	//   61  121:monitorexit     
		return flag;
	//   62  122:iload_3         
	//   63  123:ireturn         
		if(!(obj instanceof String[]))
			break MISSING_BLOCK_LABEL_151;
	//   64  124:aload_2         
	//   65  125:instanceof      #319 <Class String[]>
	//   66  128:ifeq            151
		flag = b(s, ((Object) (ek.a(((Object []) ((String[])(String[])obj))))));
	//   67  131:aload_0         
	//   68  132:aload_1         
	//   69  133:aload_2         
	//   70  134:checkcast       #319 <Class String[]>
	//   71  137:checkcast       #319 <Class String[]>
	//   72  140:invokestatic    #322 <Method org.json.JSONArray ek.a(Object[])>
	//   73  143:invokevirtual   #313 <Method boolean b(String, Object)>
	//   74  146:istore_3        
		this;
	//   75  147:aload_0         
		JVM INSTR monitorexit ;
	//   76  148:monitorexit     
		return flag;
	//   77  149:iload_3         
	//   78  150:ireturn         
		String s1 = c;
	//   79  151:getstatic       #29  <Field String c>
	//   80  154:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   81  156:new             #45  <Class StringBuilder>
	//   82  159:dup             
	//   83  160:invokespecial   #46  <Method void StringBuilder()>
	//   84  163:astore          5
		stringbuilder.append("Could not add unsupported custom attribute type with key: ");
	//   85  165:aload           5
	//   86  167:ldc2            #324 <String "Could not add unsupported custom attribute type with key: ">
	//   87  170:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   88  173:pop             
		stringbuilder.append(s);
	//   89  174:aload           5
	//   90  176:aload_1         
	//   91  177:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   92  180:pop             
		stringbuilder.append(" and value: ");
	//   93  181:aload           5
	//   94  183:ldc2            #326 <String " and value: ">
	//   95  186:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
		stringbuilder.append(obj);
	//   97  190:aload           5
	//   98  192:aload_2         
	//   99  193:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//  100  196:pop             
		AppboyLogger.w(s1, stringbuilder.toString());
	//  101  197:aload           4
	//  102  199:aload           5
	//  103  201:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  104  204:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//  105  207:pop             
		this;
	//  106  208:aload_0         
		JVM INSTR monitorexit ;
	//  107  209:monitorexit     
		return false;
	//  108  210:iconst_0        
	//  109  211:ireturn         
		flag = b(s, obj);
	//  110  212:aload_0         
	//  111  213:aload_1         
	//  112  214:aload_2         
	//  113  215:invokevirtual   #313 <Method boolean b(String, Object)>
	//  114  218:istore_3        
		this;
	//  115  219:aload_0         
		JVM INSTR monitorexit ;
	//  116  220:monitorexit     
		return flag;
	//  117  221:iload_3         
	//  118  222:ireturn         
		s;
	//  119  223:astore_1        
	//* 120  224:aload_0         
		throw s;
	//  121  225:monitorexit     
	//  122  226:aload_1         
	//  123  227:athrow          
	}

	boolean a(String s, JSONObject jsonobject)
	{
		Object obj = ((Object) (f()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method JSONObject f()>
	//    2    4:astore_3        
		if(jsonobject == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       21
		{
			Object obj1;
			try
			{
				((JSONObject) (obj)).put(s, JSONObject.NULL);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:getstatic       #123 <Field Object JSONObject.NULL>
	//    8   14:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    9   17:pop             
			}
	//*  10   18:goto            55
	//*  11   21:aload_3         
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #183 <Method JSONObject JSONObject.optJSONObject(String)>
	//*  14   26:astore          4
	//*  15   28:aload           4
	//*  16   30:ifnull          48
	//*  17   33:aload_3         
	//*  18   34:aload_1         
	//*  19   35:aload           4
	//*  20   37:aload_2         
	//*  21   38:invokestatic    #176 <Method JSONObject ek.a(JSONObject, JSONObject)>
	//*  22   41:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//*  23   44:pop             
	//*  24   45:goto            55
	//*  25   48:aload_3         
	//*  26   49:aload_1         
	//*  27   50:aload_2         
	//*  28   51:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//*  29   54:pop             
	//*  30   55:aload_0         
	//*  31   56:aload_3         
	//*  32   57:invokespecial   #129 <Method boolean b(JSONObject)>
	//*  33   60:ireturn         
	//*  34   61:getstatic       #29  <Field String c>
	//*  35   64:astore_3        
	//*  36   65:new             #45  <Class StringBuilder>
	//*  37   68:dup             
	//*  38   69:invokespecial   #46  <Method void StringBuilder()>
	//*  39   72:astore          4
	//*  40   74:aload           4
	//*  41   76:ldc1            #131 <String "Failed to write to user object json from prefs with key: [">
	//*  42   78:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  43   81:pop             
	//*  44   82:aload           4
	//*  45   84:aload_1         
	//*  46   85:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  47   88:pop             
	//*  48   89:aload           4
	//*  49   91:ldc1            #133 <String "] value: [">
	//*  50   93:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  51   96:pop             
	//*  52   97:aload           4
	//*  53   99:aload_2         
	//*  54  100:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//*  55  103:pop             
	//*  56  104:aload           4
	//*  57  106:ldc1            #138 <String "] ">
	//*  58  108:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//*  59  111:pop             
	//*  60  112:aload_3         
	//*  61  113:aload           4
	//*  62  115:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  63  118:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//*  64  121:pop             
	//*  65  122:iconst_0        
	//*  66  123:ireturn         
			// Misplaced declaration of an exception variable
			catch(JSONException jsonexception)
			{
				obj = ((Object) (c));
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("Failed to write to user object json from prefs with key: [");
				((StringBuilder) (obj1)).append(s);
				((StringBuilder) (obj1)).append("] value: [");
				((StringBuilder) (obj1)).append(((Object) (jsonobject)));
				((StringBuilder) (obj1)).append("] ");
				AppboyLogger.w(((String) (obj)), ((StringBuilder) (obj1)).toString());
				return false;
			}
			break MISSING_BLOCK_LABEL_55;
		}
		obj1 = ((Object) (((JSONObject) (obj)).optJSONObject(s)));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_48;
		((JSONObject) (obj)).put(s, ((Object) (ek.a(((JSONObject) (obj1)), jsonobject))));
		break MISSING_BLOCK_LABEL_55;
		((JSONObject) (obj)).put(s, ((Object) (jsonobject)));
		JSONException jsonexception;
		return b(((JSONObject) (obj)));
	//*  67  124:astore_3        
	//*  68  125:goto            61
	}

	public void b(NotificationSubscriptionType notificationsubscriptiontype)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(notificationsubscriptiontype != null)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_1         
	//    3    3:ifnonnull       18
		c("push_subscribe", ((Object) (null)));
	//    4    6:aload_0         
	//    5    7:ldc2            #328 <String "push_subscribe">
	//    6   10:aconst_null     
	//    7   11:invokespecial   #196 <Method boolean c(String, Object)>
	//    8   14:pop             
		break MISSING_BLOCK_LABEL_30;
	//    9   15:goto            30
		c("push_subscribe", ((Object) (notificationsubscriptiontype.forJsonPut())));
	//   10   18:aload_0         
	//   11   19:ldc2            #328 <String "push_subscribe">
	//   12   22:aload_1         
	//   13   23:invokevirtual   #207 <Method String NotificationSubscriptionType.forJsonPut()>
	//   14   26:invokespecial   #196 <Method boolean c(String, Object)>
	//   15   29:pop             
		this;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		notificationsubscriptiontype;
	//   19   33:astore_1        
	//*  20   34:aload_0         
		throw notificationsubscriptiontype;
	//   21   35:monitorexit     
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public void b(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c("first_name", ((Object) (s)));
	//    2    2:aload_0         
	//    3    3:ldc2            #330 <String "first_name">
	//    4    6:aload_1         
	//    5    7:invokespecial   #196 <Method boolean c(String, Object)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	boolean b(String s, Object obj)
	{
		JSONObject jsonobject = g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #332 <Method JSONObject g()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       21
		{
			try
			{
				jsonobject.put(s, JSONObject.NULL);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:getstatic       #123 <Field Object JSONObject.NULL>
	//    8   14:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    9   17:pop             
			}
	//*  10   18:goto            28
	//*  11   21:aload_3         
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//*  15   27:pop             
	//*  16   28:aload_0         
	//*  17   29:ldc1            #140 <String "custom">
	//*  18   31:aload_3         
	//*  19   32:invokespecial   #196 <Method boolean c(String, Object)>
	//*  20   35:ireturn         
			catch(JSONException jsonexception)
	//*  21   36:astore_3        
			{
				String s1 = c;
	//   22   37:getstatic       #29  <Field String c>
	//   23   40:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   24   42:new             #45  <Class StringBuilder>
	//   25   45:dup             
	//   26   46:invokespecial   #46  <Method void StringBuilder()>
	//   27   49:astore          5
				stringbuilder.append("Could not write to custom attributes json object with key: [");
	//   28   51:aload           5
	//   29   53:ldc2            #334 <String "Could not write to custom attributes json object with key: [">
	//   30   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
				stringbuilder.append(s);
	//   32   60:aload           5
	//   33   62:aload_1         
	//   34   63:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
				stringbuilder.append("] value: [");
	//   36   67:aload           5
	//   37   69:ldc1            #133 <String "] value: [">
	//   38   71:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
				stringbuilder.append(obj);
	//   40   75:aload           5
	//   41   77:aload_2         
	//   42   78:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   43   81:pop             
				stringbuilder.append("] ");
	//   44   82:aload           5
	//   45   84:ldc1            #138 <String "] ">
	//   46   86:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
				AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   48   90:aload           4
	//   49   92:aload           5
	//   50   94:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   51   97:aload_3         
	//   52   98:invokestatic    #187 <Method int AppboyLogger.w(String, String, Throwable)>
	//   53  101:pop             
				return false;
	//   54  102:iconst_0        
	//   55  103:ireturn         
			}
			break MISSING_BLOCK_LABEL_28;
		}
		jsonobject.put(s, obj);
		return c("custom", ((Object) (jsonobject)));
	}

	public void c(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c("last_name", ((Object) (s)));
	//    2    2:aload_0         
	//    3    3:ldc2            #336 <String "last_name">
	//    4    6:aload_1         
	//    5    7:invokespecial   #196 <Method boolean c(String, Object)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		AppboyLogger.v(c, "Push token cache cleared.");
	//    2    2:getstatic       #29  <Field String c>
	//    3    5:ldc2            #338 <String "Push token cache cleared.">
	//    4    8:invokestatic    #341 <Method int AppboyLogger.v(String, String)>
	//    5   11:pop             
		b.edit().clear().apply();
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field SharedPreferences b>
	//    8   16:invokeinterface #94  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   21:invokeinterface #344 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   10   26:invokeinterface #113 <Method void android.content.SharedPreferences$Editor.apply()>
		this;
	//   11   31:aload_0         
		JVM INSTR monitorexit ;
	//   12   32:monitorexit     
		return;
	//   13   33:return          
		Exception exception;
		exception;
	//   14   34:astore_1        
	//*  15   35:aload_0         
		throw exception;
	//   16   36:monitorexit     
	//   17   37:aload_1         
	//   18   38:athrow          
	}

	public boolean d(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1;
		s1 = s;
	//    2    2:aload_1         
	//    3    3:astore_3        
		if(s == null)
			break MISSING_BLOCK_LABEL_16;
	//    4    4:aload_1         
	//    5    5:ifnull          16
		s1 = s.trim();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #347 <Method String String.trim()>
	//    8   12:astore_3        
	//*   9   13:goto            16
		if(s1 == null)
			break MISSING_BLOCK_LABEL_73;
	//   10   16:aload_3         
	//   11   17:ifnull          73
		if(ValidationUtils.isValidEmailAddress(s1))
	//*  12   20:aload_3         
	//*  13   21:invokestatic    #350 <Method boolean ValidationUtils.isValidEmailAddress(String)>
	//*  14   24:ifeq            30
			break MISSING_BLOCK_LABEL_73;
	//   15   27:goto            73
		s = c;
	//   16   30:getstatic       #29  <Field String c>
	//   17   33:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   34:new             #45  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #46  <Method void StringBuilder()>
	//   21   41:astore          4
		stringbuilder.append("Email address is not valid: ");
	//   22   43:aload           4
	//   23   45:ldc2            #352 <String "Email address is not valid: ">
	//   24   48:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s1);
	//   26   52:aload           4
	//   27   54:aload_3         
	//   28   55:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   30   59:aload_1         
	//   31   60:aload           4
	//   32   62:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   33   65:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//   34   68:pop             
		this;
	//   35   69:aload_0         
		JVM INSTR monitorexit ;
	//   36   70:monitorexit     
		return false;
	//   37   71:iconst_0        
	//   38   72:ireturn         
		boolean flag = c("email", ((Object) (s1)));
	//   39   73:aload_0         
	//   40   74:ldc2            #354 <String "email">
	//   41   77:aload_3         
	//   42   78:invokespecial   #196 <Method boolean c(String, Object)>
	//   43   81:istore_2        
		this;
	//   44   82:aload_0         
		JVM INSTR monitorexit ;
	//   45   83:monitorexit     
		return flag;
	//   46   84:iload_2         
	//   47   85:ireturn         
	//*  48   86:aload_0         
_L2:
		throw s;
	//   49   87:monitorexit     
	//   50   88:aload_1         
	//   51   89:athrow          
		s;
	//   52   90:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  53   91:goto            86
	}

	public cn e()
	{
		if(!StringUtils.isNullOrEmpty(f))
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field String f>
	//*   2    4:invokestatic    #357 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   3    7:ifne            18
			a(f);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field String f>
	//    7   15:invokevirtual   #359 <Method void a(String)>
		JSONObject jsonobject = f();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #119 <Method JSONObject f()>
	//   10   22:astore_1        
		try
		{
			a(jsonobject);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #361 <Method void a(JSONObject)>
		}
	//*  14   28:goto            43
		catch(JSONException jsonexception)
	//*  15   31:astore_2        
		{
			AppboyLogger.e(c, "Couldn't add push token to outbound json", ((Throwable) (jsonexception)));
	//   16   32:getstatic       #29  <Field String c>
	//   17   35:ldc2            #363 <String "Couldn't add push token to outbound json">
	//   18   38:aload_2         
	//   19   39:invokestatic    #153 <Method int AppboyLogger.e(String, String, Throwable)>
	//   20   42:pop             
		}
		a.edit().clear().apply();
	//   21   43:aload_0         
	//   22   44:getfield        #64  <Field SharedPreferences a>
	//   23   47:invokeinterface #94  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   24   52:invokeinterface #344 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   25   57:invokeinterface #113 <Method void android.content.SharedPreferences$Editor.apply()>
		return new cn(jsonobject);
	//   26   62:new             #163 <Class cn>
	//   27   65:dup             
	//   28   66:aload_1         
	//   29   67:invokespecial   #365 <Method void cn(JSONObject)>
	//   30   70:areturn         
	}

	public void e(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c("country", ((Object) (s)));
	//    2    2:aload_0         
	//    3    3:ldc2            #367 <String "country">
	//    4    6:aload_1         
	//    5    7:invokespecial   #196 <Method boolean c(String, Object)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	JSONObject f()
	{
		String s = a.getString("user_cache_attributes_object", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field SharedPreferences a>
	//    2    4:ldc1            #104 <String "user_cache_attributes_object">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #246 <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(s == null)
	//*   6   13:aload_1         
	//*   7   14:ifnonnull       25
			return new JSONObject();
	//    8   17:new             #96  <Class JSONObject>
	//    9   20:dup             
	//   10   21:invokespecial   #154 <Method void JSONObject()>
	//   11   24:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = JSONObjectInstrumentation.init(s);
	//   12   25:aload_1         
	//   13   26:invokestatic    #370 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   14   29:astore_2        
		}
	//*  15   30:aload_2         
	//*  16   31:areturn         
		catch(JSONException jsonexception)
	//*  17   32:astore_2        
		{
			String s1 = c;
	//   18   33:getstatic       #29  <Field String c>
	//   19   36:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   20   37:new             #45  <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #46  <Method void StringBuilder()>
	//   23   44:astore          4
			stringbuilder.append("Failed to load user object json from prefs with json string: ");
	//   24   46:aload           4
	//   25   48:ldc2            #372 <String "Failed to load user object json from prefs with json string: ">
	//   26   51:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
			stringbuilder.append(s);
	//   28   55:aload           4
	//   29   57:aload_1         
	//   30   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   32   62:aload_3         
	//   33   63:aload           4
	//   34   65:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   35   68:aload_2         
	//   36   69:invokestatic    #153 <Method int AppboyLogger.e(String, String, Throwable)>
	//   37   72:pop             
			return new JSONObject();
	//   38   73:new             #96  <Class JSONObject>
	//   39   76:dup             
	//   40   77:invokespecial   #154 <Method void JSONObject()>
	//   41   80:areturn         
		}
		return jsonobject;
	}

	public void f(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c("home_city", ((Object) (s)));
	//    2    2:aload_0         
	//    3    3:ldc2            #374 <String "home_city">
	//    4    6:aload_1         
	//    5    7:invokespecial   #196 <Method boolean c(String, Object)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void g(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c("language", ((Object) (s)));
	//    2    2:aload_0         
	//    3    3:ldc2            #376 <String "language">
	//    4    6:aload_1         
	//    5    7:invokespecial   #196 <Method boolean c(String, Object)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public boolean h(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1;
		s1 = s;
	//    2    2:aload_1         
	//    3    3:astore_3        
		if(s == null)
			break MISSING_BLOCK_LABEL_16;
	//    4    4:aload_1         
	//    5    5:ifnull          16
		s1 = s.trim();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #347 <Method String String.trim()>
	//    8   12:astore_3        
	//*   9   13:goto            16
		if(s1 == null)
			break MISSING_BLOCK_LABEL_73;
	//   10   16:aload_3         
	//   11   17:ifnull          73
		if(ValidationUtils.isValidPhoneNumber(s1))
	//*  12   20:aload_3         
	//*  13   21:invokestatic    #380 <Method boolean ValidationUtils.isValidPhoneNumber(String)>
	//*  14   24:ifeq            30
			break MISSING_BLOCK_LABEL_73;
	//   15   27:goto            73
		s = c;
	//   16   30:getstatic       #29  <Field String c>
	//   17   33:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   34:new             #45  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #46  <Method void StringBuilder()>
	//   21   41:astore          4
		stringbuilder.append("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ");
	//   22   43:aload           4
	//   23   45:ldc2            #382 <String "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ">
	//   24   48:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s1);
	//   26   52:aload           4
	//   27   54:aload_3         
	//   28   55:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   30   59:aload_1         
	//   31   60:aload           4
	//   32   62:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   33   65:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//   34   68:pop             
		this;
	//   35   69:aload_0         
		JVM INSTR monitorexit ;
	//   36   70:monitorexit     
		return false;
	//   37   71:iconst_0        
	//   38   72:ireturn         
		boolean flag = c("phone", ((Object) (s1)));
	//   39   73:aload_0         
	//   40   74:ldc2            #384 <String "phone">
	//   41   77:aload_3         
	//   42   78:invokespecial   #196 <Method boolean c(String, Object)>
	//   43   81:istore_2        
		this;
	//   44   82:aload_0         
		JVM INSTR monitorexit ;
	//   45   83:monitorexit     
		return flag;
	//   46   84:iload_2         
	//   47   85:ireturn         
	//*  48   86:aload_0         
_L2:
		throw s;
	//   49   87:monitorexit     
	//   50   88:aload_1         
	//   51   89:athrow          
		s;
	//   52   90:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  53   91:goto            86
	}

	public void i(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c("image_url", ((Object) (s)));
	//    2    2:aload_0         
	//    3    3:ldc2            #386 <String "image_url">
	//    4    6:aload_1         
	//    5    7:invokespecial   #196 <Method boolean c(String, Object)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public boolean j(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(CustomAttributeValidationUtils.isValidCustomAttributeKey(s, e.i()))
			break MISSING_BLOCK_LABEL_30;
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #72  <Field dx e>
	//    5    7:invokevirtual   #288 <Method java.util.Set dx.i()>
	//    6   10:invokestatic    #294 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//    7   13:ifne            30
		AppboyLogger.w(c, "Custom attribute key cannot be null.");
	//    8   16:getstatic       #29  <Field String c>
	//    9   19:ldc2            #296 <String "Custom attribute key cannot be null.">
	//   10   22:invokestatic    #88  <Method int AppboyLogger.w(String, String)>
	//   11   25:pop             
		this;
	//   12   26:aload_0         
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		boolean flag = b(ValidationUtils.ensureAppboyFieldLength(s), JSONObject.NULL);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokestatic    #301 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   19   35:getstatic       #123 <Field Object JSONObject.NULL>
	//   20   38:invokevirtual   #313 <Method boolean b(String, Object)>
	//   21   41:istore_2        
		this;
	//   22   42:aload_0         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		return flag;
	//   24   44:iload_2         
	//   25   45:ireturn         
		s;
	//   26   46:astore_1        
	//*  27   47:aload_0         
		throw s;
	//   28   48:monitorexit     
	//   29   49:aload_1         
	//   30   50:athrow          
	}

	private static final String c = AppboyLogger.getAppboyLogTag(bo/app/ea);
	final SharedPreferences a;
	final SharedPreferences b;
	private final bx d;
	private final dx e;
	private final String f;
	private final dw g;

	static 
	{
	//    0    0:ldc1            #2   <Class ea>
	//    1    2:invokestatic    #27  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #29  <Field String c>
	//*   3    8:return          
	}
}
