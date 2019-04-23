// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.*;
import com.appboy.models.outgoing.*;
import com.appboy.support.*;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			cw, dg, ch, dt, 
//			bp, dl, r, dh

public class dj extends cw
{

	public dj(Context context, bp bp1, dh dh1, dg dg1)
	{
		this(context, ((String) (null)), ((String) (null)), bp1, dh1, dg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:aload           4
	//    7    8:invokespecial   #34  <Method void dj(Context, String, String, bp, dh, dg)>
	//    8   11:return          
	}

	public dj(Context context, String s, String s1, bp bp1, dh dh1, dg dg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void cw()>
		s1 = StringUtils.getCacheFileSuffix(context, s, s1);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #42  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//    6   10:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #44  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #45  <Method void StringBuilder()>
	//   10   18:astore          7
		stringbuilder.append("com.appboy.storage.user_cache.v3");
	//   11   20:aload           7
	//   12   22:ldc1            #47  <String "com.appboy.storage.user_cache.v3">
	//   13   24:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append(s1);
	//   15   28:aload           7
	//   16   30:aload_3         
	//   17   31:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		a = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload           7
	//   22   39:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   23   42:iconst_0        
	//   24   43:invokevirtual   #61  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   25   46:putfield        #63  <Field SharedPreferences a>
		stringbuilder = new StringBuilder();
	//   26   49:new             #44  <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #45  <Method void StringBuilder()>
	//   29   56:astore          7
		stringbuilder.append("com.appboy.storage.user_cache.push_token_store");
	//   30   58:aload           7
	//   31   60:ldc1            #65  <String "com.appboy.storage.user_cache.push_token_store">
	//   32   62:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		stringbuilder.append(s1);
	//   34   66:aload           7
	//   35   68:aload_3         
	//   36   69:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   38   73:aload_0         
	//   39   74:aload_1         
	//   40   75:aload           7
	//   41   77:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   42   80:iconst_0        
	//   43   81:invokevirtual   #61  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   44   84:putfield        #67  <Field SharedPreferences b>
		d = bp1;
	//   45   87:aload_0         
	//   46   88:aload           4
	//   47   90:putfield        #69  <Field bp d>
		e = dh1;
	//   48   93:aload_0         
	//   49   94:aload           5
	//   50   96:putfield        #71  <Field dh e>
		f = s;
	//   51   99:aload_0         
	//   52  100:aload_2         
	//   53  101:putfield        #73  <Field String f>
		g = dg1;
	//   54  104:aload_0         
	//   55  105:aload           6
	//   56  107:putfield        #75  <Field dg g>
	//   57  110:return          
	}

	private boolean b(JSONObject jsonobject)
	{
		if(g.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field dg g>
	//*   2    4:invokevirtual   #81  <Method boolean dg.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(c, "SDK is disabled. Not writing to user cache.");
	//    4   10:getstatic       #28  <Field String c>
	//    5   13:ldc1            #83  <String "SDK is disabled. Not writing to user cache.">
	//    6   15:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
		} else
		{
			android.content.SharedPreferences.Editor editor = a.edit();
	//   10   21:aload_0         
	//   11   22:getfield        #63  <Field SharedPreferences a>
	//   12   25:invokeinterface #93  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   30:astore_2        
			editor.putString("user_cache_attributes_object", jsonobject.toString());
	//   14   31:aload_2         
	//   15   32:ldc1            #95  <String "user_cache_attributes_object">
	//   16   34:aload_1         
	//   17   35:invokevirtual   #98  <Method String JSONObject.toString()>
	//   18   38:invokeinterface #104 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   19   43:pop             
			editor.apply();
	//   20   44:aload_2         
	//   21   45:invokeinterface #107 <Method void android.content.SharedPreferences$Editor.apply()>
			return true;
	//   22   50:iconst_1        
	//   23   51:ireturn         
		}
	}

	private boolean c(String s, Object obj)
	{
		Object obj1 = ((Object) (f()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method JSONObject f()>
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
	//    7   11:getstatic       #117 <Field Object JSONObject.NULL>
	//    8   14:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//    9   17:pop             
			}
	//*  10   18:goto            28
	//*  11   21:aload_3         
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//*  15   27:pop             
	//*  16   28:aload_0         
	//*  17   29:aload_3         
	//*  18   30:invokespecial   #123 <Method boolean b(JSONObject)>
	//*  19   33:ireturn         
	//*  20   34:getstatic       #28  <Field String c>
	//*  21   37:astore_3        
	//*  22   38:new             #44  <Class StringBuilder>
	//*  23   41:dup             
	//*  24   42:invokespecial   #45  <Method void StringBuilder()>
	//*  25   45:astore          4
	//*  26   47:aload           4
	//*  27   49:ldc1            #125 <String "Failed to write to user object json from prefs with key: [">
	//*  28   51:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  29   54:pop             
	//*  30   55:aload           4
	//*  31   57:aload_1         
	//*  32   58:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  33   61:pop             
	//*  34   62:aload           4
	//*  35   64:ldc1            #127 <String "] value: [">
	//*  36   66:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  37   69:pop             
	//*  38   70:aload           4
	//*  39   72:aload_2         
	//*  40   73:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//*  41   76:pop             
	//*  42   77:aload           4
	//*  43   79:ldc1            #132 <String "] ">
	//*  44   81:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  45   84:pop             
	//*  46   85:aload_3         
	//*  47   86:aload           4
	//*  48   88:invokevirtual   #55  <Method String StringBuilder.toString()>
	//*  49   91:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
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
	//    1    1:invokevirtual   #113 <Method JSONObject f()>
	//    2    4:astore_1        
			if(((JSONObject) (obj)).has("custom"))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #134 <String "custom">
	//*   5    8:invokevirtual   #138 <Method boolean JSONObject.has(String)>
	//*   6   11:ifeq            35
				try
				{
					obj = ((Object) (((JSONObject) (obj)).getJSONObject("custom")));
	//    7   14:aload_1         
	//    8   15:ldc1            #134 <String "custom">
	//    9   17:invokevirtual   #142 <Method JSONObject JSONObject.getJSONObject(String)>
	//   10   20:astore_1        
					break label0;
	//   11   21:goto            37
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  12   24:astore_1        
				{
					AppboyLogger.e(c, "Could not create custom attributes json object from preferences.", ((Throwable) (obj)));
	//   13   25:getstatic       #28  <Field String c>
	//   14   28:ldc1            #144 <String "Could not create custom attributes json object from preferences.">
	//   15   30:aload_1         
	//   16   31:invokestatic    #147 <Method int AppboyLogger.e(String, String, Throwable)>
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
	//   24   43:new             #97  <Class JSONObject>
	//   25   46:dup             
	//   26   47:invokespecial   #148 <Method void JSONObject()>
	//   27   50:astore_2        
		return ((JSONObject) (obj1));
	//   28   51:aload_2         
	//   29   52:areturn         
	}

	public Object a()
	{
		return ((Object) (e()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method ch e()>
	//    2    4:areturn         
	}

	void a(ch ch1, boolean flag)
	{
		Object obj;
		if(ch1 == null || ch1.a() == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          197
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #159 <Method JSONObject ch.a()>
	//*   4    8:ifnonnull       14
			break MISSING_BLOCK_LABEL_197;
	//    5   11:goto            197
		obj = ((Object) (ch1.a()));
	//    6   14:aload_1         
	//    7   15:invokevirtual   #159 <Method JSONObject ch.a()>
	//    8   18:astore_3        
		if(flag)
	//*   9   19:iload_2         
	//*  10   20:ifeq            64
		{
			if(((JSONObject) (obj)).has("push_token"))
	//*  11   23:aload_3         
	//*  12   24:ldc1            #161 <String "push_token">
	//*  13   26:invokevirtual   #138 <Method boolean JSONObject.has(String)>
	//*  14   29:ifeq            63
			{
				ch1 = ((ch) (b.edit()));
	//   15   32:aload_0         
	//   16   33:getfield        #67  <Field SharedPreferences b>
	//   17   36:invokeinterface #93  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   18   41:astore_1        
				((android.content.SharedPreferences.Editor) (ch1)).putString("push_token", ((JSONObject) (obj)).optString("push_token"));
	//   19   42:aload_1         
	//   20   43:ldc1            #161 <String "push_token">
	//   21   45:aload_3         
	//   22   46:ldc1            #161 <String "push_token">
	//   23   48:invokevirtual   #165 <Method String JSONObject.optString(String)>
	//   24   51:invokeinterface #104 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   25   56:pop             
				((android.content.SharedPreferences.Editor) (ch1)).apply();
	//   26   57:aload_1         
	//   27   58:invokeinterface #107 <Method void android.content.SharedPreferences$Editor.apply()>
			}
			return;
	//   28   63:return          
		}
		JSONObject jsonobject = f();
	//   29   64:aload_0         
	//   30   65:invokevirtual   #113 <Method JSONObject f()>
	//   31   68:astore          4
		ch1 = ((ch) (dt.a(((JSONObject) (obj)), jsonobject)));
	//   32   70:aload_3         
	//   33   71:aload           4
	//   34   73:invokestatic    #170 <Method JSONObject dt.a(JSONObject, JSONObject)>
	//   35   76:astore_1        
		((JSONObject) (ch1)).remove("push_token");
	//   36   77:aload_1         
	//   37   78:ldc1            #161 <String "push_token">
	//   38   80:invokevirtual   #174 <Method Object JSONObject.remove(String)>
	//   39   83:pop             
		jsonobject = jsonobject.optJSONObject("custom");
	//   40   84:aload           4
	//   41   86:ldc1            #134 <String "custom">
	//   42   88:invokevirtual   #177 <Method JSONObject JSONObject.optJSONObject(String)>
	//   43   91:astore          4
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("custom")));
	//   44   93:aload_3         
	//   45   94:ldc1            #134 <String "custom">
	//   46   96:invokevirtual   #177 <Method JSONObject JSONObject.optJSONObject(String)>
	//   47   99:astore_3        
		if(jsonobject != null && obj != null)
	//*  48  100:aload           4
	//*  49  102:ifnull          125
	//*  50  105:aload_3         
	//*  51  106:ifnull          125
		{
			try
			{
				((JSONObject) (ch1)).put("custom", ((Object) (dt.a(((JSONObject) (obj)), jsonobject))));
	//   52  109:aload_1         
	//   53  110:ldc1            #134 <String "custom">
	//   54  112:aload_3         
	//   55  113:aload           4
	//   56  115:invokestatic    #170 <Method JSONObject dt.a(JSONObject, JSONObject)>
	//   57  118:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//   58  121:pop             
			}
	//*  59  122:goto            167
	//*  60  125:aload           4
	//*  61  127:ifnull          142
	//*  62  130:aload_1         
	//*  63  131:ldc1            #134 <String "custom">
	//*  64  133:aload           4
	//*  65  135:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//*  66  138:pop             
	//*  67  139:goto            167
	//*  68  142:aload_3         
	//*  69  143:ifnull          167
	//*  70  146:aload_1         
	//*  71  147:ldc1            #134 <String "custom">
	//*  72  149:aload_3         
	//*  73  150:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//*  74  153:pop             
	//*  75  154:goto            167
	//*  76  157:getstatic       #28  <Field String c>
	//*  77  160:ldc1            #179 <String "Failed to add merged custom attributes back to user object.">
	//*  78  162:aload_3         
	//*  79  163:invokestatic    #181 <Method int AppboyLogger.w(String, String, Throwable)>
	//*  80  166:pop             
	//*  81  167:aload_0         
	//*  82  168:getfield        #63  <Field SharedPreferences a>
	//*  83  171:invokeinterface #93  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//*  84  176:astore_3        
	//*  85  177:aload_3         
	//*  86  178:ldc1            #95  <String "user_cache_attributes_object">
	//*  87  180:aload_1         
	//*  88  181:invokevirtual   #98  <Method String JSONObject.toString()>
	//*  89  184:invokeinterface #104 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//*  90  189:pop             
	//*  91  190:aload_3         
	//*  92  191:invokeinterface #107 <Method void android.content.SharedPreferences$Editor.apply()>
	//*  93  196:return          
	//*  94  197:getstatic       #28  <Field String c>
	//*  95  200:ldc1            #183 <String "Tried to confirm with a null outbound user. Doing nothing.">
	//*  96  202:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//*  97  205:pop             
	//*  98  206:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				AppboyLogger.w(c, "Failed to add merged custom attributes back to user object.", ((Throwable) (obj)));
			}
			break MISSING_BLOCK_LABEL_167;
		}
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_142;
		((JSONObject) (ch1)).put("custom", ((Object) (jsonobject)));
		break MISSING_BLOCK_LABEL_167;
		if(obj == null)
			break MISSING_BLOCK_LABEL_167;
		((JSONObject) (ch1)).put("custom", obj);
		obj = ((Object) (a.edit()));
		((android.content.SharedPreferences.Editor) (obj)).putString("user_cache_attributes_object", ((JSONObject) (ch1)).toString());
		((android.content.SharedPreferences.Editor) (obj)).apply();
		return;
		AppboyLogger.d(c, "Tried to confirm with a null outbound user. Doing nothing.");
		return;
	//*  99  207:astore_3        
	//* 100  208:goto            157
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
	//    5    7:ldc1            #188 <String "gender">
	//    6    9:aconst_null     
	//    7   10:invokespecial   #190 <Method boolean c(String, Object)>
	//    8   13:pop             
		break MISSING_BLOCK_LABEL_28;
	//    9   14:goto            28
		c("gender", ((Object) (gender.forJsonPut())));
	//   10   17:aload_0         
	//   11   18:ldc1            #188 <String "gender">
	//   12   20:aload_1         
	//   13   21:invokevirtual   #195 <Method String Gender.forJsonPut()>
	//   14   24:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    5    7:ldc1            #198 <String "email_subscribe">
	//    6    9:aconst_null     
	//    7   10:invokespecial   #190 <Method boolean c(String, Object)>
	//    8   13:pop             
		break MISSING_BLOCK_LABEL_28;
	//    9   14:goto            28
		c("email_subscribe", ((Object) (notificationsubscriptiontype.forJsonPut())));
	//   10   17:aload_0         
	//   11   18:ldc1            #198 <String "email_subscribe">
	//   12   20:aload_1         
	//   13   21:invokevirtual   #201 <Method String NotificationSubscriptionType.forJsonPut()>
	//   14   24:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    5    7:invokevirtual   #206 <Method JSONObject AttributionData.forJsonPut()>
	//    6   10:astore_1        
	//*   7   11:goto            14
_L4:
		a("ab_install_attribution", ((JSONObject) (attributiondata)));
	//    8   14:aload_0         
	//    9   15:ldc1            #208 <String "ab_install_attribution">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #211 <Method boolean a(String, JSONObject)>
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
	//    5    7:invokevirtual   #215 <Method JSONObject FacebookUser.forJsonPut()>
	//    6   10:astore_1        
	//*   7   11:goto            14
_L4:
		a("facebook", ((JSONObject) (facebookuser)));
	//    8   14:aload_0         
	//    9   15:ldc1            #217 <String "facebook">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #211 <Method boolean a(String, JSONObject)>
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
	//    5    7:invokevirtual   #221 <Method JSONObject TwitterUser.forJsonPut()>
	//    6   10:astore_1        
	//*   7   11:goto            14
_L4:
		a("twitter", ((JSONObject) (twitteruser)));
	//    8   14:aload_0         
	//    9   15:ldc1            #223 <String "twitter">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #211 <Method boolean a(String, JSONObject)>
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
		a((ch)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #157 <Class ch>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #226 <Method void a(ch, boolean)>
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
	//    3    3:ldc1            #229 <String "user_id">
	//    4    5:aload_1         
	//    5    6:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    1    1:getfield        #69  <Field bp d>
	//    2    4:invokeinterface #234 <Method String bp.a()>
	//    3    9:astore_2        
		if(s == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       24
		{
			AppboyLogger.d(c, "Cannot add null push token to attributes object.");
	//    6   14:getstatic       #28  <Field String c>
	//    7   17:ldc1            #236 <String "Cannot add null push token to attributes object.">
	//    8   19:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//    9   22:pop             
			return;
	//   10   23:return          
		}
		String s1 = b.getString("push_token", ((String) (null)));
	//   11   24:aload_0         
	//   12   25:getfield        #67  <Field SharedPreferences b>
	//   13   28:ldc1            #161 <String "push_token">
	//   14   30:aconst_null     
	//   15   31:invokeinterface #240 <Method String SharedPreferences.getString(String, String)>
	//   16   36:astore_3        
		if(s1 == null || !s.equals(((Object) (s1))))
	//*  17   37:aload_3         
	//*  18   38:ifnull          49
	//*  19   41:aload_2         
	//*  20   42:aload_3         
	//*  21   43:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  22   46:ifne            57
			jsonobject.put("push_token", ((Object) (s)));
	//   23   49:aload_1         
	//   24   50:ldc1            #161 <String "push_token">
	//   25   52:aload_2         
	//   26   53:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
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
	//    4    6:getstatic       #28  <Field String c>
	//    5    9:ldc1            #249 <String "Month cannot be null.">
	//    6   11:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
	//    7   14:pop             
		this;
	//    8   15:aload_0         
		JVM INSTR monitorexit ;
	//    9   16:monitorexit     
		return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
		boolean flag = c("dob", ((Object) (dl.a(dl.a(k, month.getValue(), l), r.a))));
	//   12   19:aload_0         
	//   13   20:ldc1            #251 <String "dob">
	//   14   22:iload_1         
	//   15   23:aload_2         
	//   16   24:invokevirtual   #257 <Method int Month.getValue()>
	//   17   27:iload_3         
	//   18   28:invokestatic    #262 <Method Date dl.a(int, int, int)>
	//   19   31:getstatic       #267 <Field r r.a>
	//   20   34:invokestatic    #270 <Method String dl.a(Date, r)>
	//   21   37:invokespecial   #190 <Method boolean c(String, Object)>
	//   22   40:istore          4
		this;
	//   23   42:aload_0         
		JVM INSTR monitorexit ;
	//   24   43:monitorexit     
		return flag;
	//   25   44:iload           4
	//   26   46:ireturn         
		month;
	//   27   47:astore_2        
	//*  28   48:aload_0         
		throw month;
	//   29   49:monitorexit     
	//   30   50:aload_2         
	//   31   51:athrow          
	}

	public boolean a(String s, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = a(s, ((Object) (dl.a(l))));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:lload_2         
	//    5    5:invokestatic    #274 <Method Date dl.a(long)>
	//    6    8:invokevirtual   #276 <Method boolean a(String, Object)>
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
		if(CustomAttributeValidationUtils.isValidCustomAttributeKey(s, e.m()))
			break MISSING_BLOCK_LABEL_30;
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #71  <Field dh e>
	//    5    7:invokevirtual   #282 <Method java.util.Set dh.m()>
	//    6   10:invokestatic    #288 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//    7   13:ifne            30
		AppboyLogger.w(c, "Custom attribute key cannot be null.");
	//    8   16:getstatic       #28  <Field String c>
	//    9   19:ldc2            #290 <String "Custom attribute key cannot be null.">
	//   10   22:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
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
	//   17   31:invokestatic    #295 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   18   34:astore_1        
		if((obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Long) || (obj instanceof Double))
	//*  19   35:aload_2         
	//*  20   36:instanceof      #297 <Class Boolean>
	//*  21   39:ifne            212
	//*  22   42:aload_2         
	//*  23   43:instanceof      #299 <Class Integer>
	//*  24   46:ifne            212
	//*  25   49:aload_2         
	//*  26   50:instanceof      #301 <Class Float>
	//*  27   53:ifne            212
	//*  28   56:aload_2         
	//*  29   57:instanceof      #303 <Class Long>
	//*  30   60:ifne            212
	//*  31   63:aload_2         
	//*  32   64:instanceof      #305 <Class Double>
	//*  33   67:ifeq            73
			break MISSING_BLOCK_LABEL_212;
	//   34   70:goto            212
		boolean flag;
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_97;
	//   35   73:aload_2         
	//   36   74:instanceof      #242 <Class String>
	//   37   77:ifeq            97
		flag = b(s, ((Object) (ValidationUtils.ensureAppboyFieldLength((String)obj))));
	//   38   80:aload_0         
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:checkcast       #242 <Class String>
	//   42   86:invokestatic    #295 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   43   89:invokevirtual   #307 <Method boolean b(String, Object)>
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
	//   50   98:instanceof      #309 <Class Date>
	//   51  101:ifeq            124
		flag = b(s, ((Object) (dl.a((Date)obj, r.b))));
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:aload_2         
	//   55  107:checkcast       #309 <Class Date>
	//   56  110:getstatic       #311 <Field r r.b>
	//   57  113:invokestatic    #270 <Method String dl.a(Date, r)>
	//   58  116:invokevirtual   #307 <Method boolean b(String, Object)>
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
	//   65  125:instanceof      #313 <Class String[]>
	//   66  128:ifeq            151
		flag = b(s, ((Object) (dt.a(((Object []) ((String[])(String[])obj))))));
	//   67  131:aload_0         
	//   68  132:aload_1         
	//   69  133:aload_2         
	//   70  134:checkcast       #313 <Class String[]>
	//   71  137:checkcast       #313 <Class String[]>
	//   72  140:invokestatic    #316 <Method org.json.JSONArray dt.a(Object[])>
	//   73  143:invokevirtual   #307 <Method boolean b(String, Object)>
	//   74  146:istore_3        
		this;
	//   75  147:aload_0         
		JVM INSTR monitorexit ;
	//   76  148:monitorexit     
		return flag;
	//   77  149:iload_3         
	//   78  150:ireturn         
		String s1 = c;
	//   79  151:getstatic       #28  <Field String c>
	//   80  154:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   81  156:new             #44  <Class StringBuilder>
	//   82  159:dup             
	//   83  160:invokespecial   #45  <Method void StringBuilder()>
	//   84  163:astore          5
		stringbuilder.append("Could not add unsupported custom attribute type with key: ");
	//   85  165:aload           5
	//   86  167:ldc2            #318 <String "Could not add unsupported custom attribute type with key: ">
	//   87  170:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   88  173:pop             
		stringbuilder.append(s);
	//   89  174:aload           5
	//   90  176:aload_1         
	//   91  177:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   92  180:pop             
		stringbuilder.append(" and value: ");
	//   93  181:aload           5
	//   94  183:ldc2            #320 <String " and value: ">
	//   95  186:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
		stringbuilder.append(obj);
	//   97  190:aload           5
	//   98  192:aload_2         
	//   99  193:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//  100  196:pop             
		AppboyLogger.w(s1, stringbuilder.toString());
	//  101  197:aload           4
	//  102  199:aload           5
	//  103  201:invokevirtual   #55  <Method String StringBuilder.toString()>
	//  104  204:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
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
	//  113  215:invokevirtual   #307 <Method boolean b(String, Object)>
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
	//    1    1:invokevirtual   #113 <Method JSONObject f()>
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
	//    7   11:getstatic       #117 <Field Object JSONObject.NULL>
	//    8   14:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//    9   17:pop             
			}
	//*  10   18:goto            55
	//*  11   21:aload_3         
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #177 <Method JSONObject JSONObject.optJSONObject(String)>
	//*  14   26:astore          4
	//*  15   28:aload           4
	//*  16   30:ifnull          48
	//*  17   33:aload_3         
	//*  18   34:aload_1         
	//*  19   35:aload           4
	//*  20   37:aload_2         
	//*  21   38:invokestatic    #170 <Method JSONObject dt.a(JSONObject, JSONObject)>
	//*  22   41:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//*  23   44:pop             
	//*  24   45:goto            55
	//*  25   48:aload_3         
	//*  26   49:aload_1         
	//*  27   50:aload_2         
	//*  28   51:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//*  29   54:pop             
	//*  30   55:aload_0         
	//*  31   56:aload_3         
	//*  32   57:invokespecial   #123 <Method boolean b(JSONObject)>
	//*  33   60:ireturn         
	//*  34   61:getstatic       #28  <Field String c>
	//*  35   64:astore_3        
	//*  36   65:new             #44  <Class StringBuilder>
	//*  37   68:dup             
	//*  38   69:invokespecial   #45  <Method void StringBuilder()>
	//*  39   72:astore          4
	//*  40   74:aload           4
	//*  41   76:ldc1            #125 <String "Failed to write to user object json from prefs with key: [">
	//*  42   78:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  43   81:pop             
	//*  44   82:aload           4
	//*  45   84:aload_1         
	//*  46   85:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  47   88:pop             
	//*  48   89:aload           4
	//*  49   91:ldc1            #127 <String "] value: [">
	//*  50   93:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  51   96:pop             
	//*  52   97:aload           4
	//*  53   99:aload_2         
	//*  54  100:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//*  55  103:pop             
	//*  56  104:aload           4
	//*  57  106:ldc1            #132 <String "] ">
	//*  58  108:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  59  111:pop             
	//*  60  112:aload_3         
	//*  61  113:aload           4
	//*  62  115:invokevirtual   #55  <Method String StringBuilder.toString()>
	//*  63  118:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
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
		((JSONObject) (obj)).put(s, ((Object) (dt.a(((JSONObject) (obj1)), jsonobject))));
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
	//    5    7:ldc2            #322 <String "push_subscribe">
	//    6   10:aconst_null     
	//    7   11:invokespecial   #190 <Method boolean c(String, Object)>
	//    8   14:pop             
		break MISSING_BLOCK_LABEL_30;
	//    9   15:goto            30
		c("push_subscribe", ((Object) (notificationsubscriptiontype.forJsonPut())));
	//   10   18:aload_0         
	//   11   19:ldc2            #322 <String "push_subscribe">
	//   12   22:aload_1         
	//   13   23:invokevirtual   #201 <Method String NotificationSubscriptionType.forJsonPut()>
	//   14   26:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    3    3:ldc2            #324 <String "first_name">
	//    4    6:aload_1         
	//    5    7:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    1    1:invokespecial   #326 <Method JSONObject g()>
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
	//    7   11:getstatic       #117 <Field Object JSONObject.NULL>
	//    8   14:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//    9   17:pop             
			}
	//*  10   18:goto            28
	//*  11   21:aload_3         
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #121 <Method JSONObject JSONObject.put(String, Object)>
	//*  15   27:pop             
	//*  16   28:aload_0         
	//*  17   29:ldc1            #134 <String "custom">
	//*  18   31:aload_3         
	//*  19   32:invokespecial   #190 <Method boolean c(String, Object)>
	//*  20   35:ireturn         
			catch(JSONException jsonexception)
	//*  21   36:astore_3        
			{
				String s1 = c;
	//   22   37:getstatic       #28  <Field String c>
	//   23   40:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   24   42:new             #44  <Class StringBuilder>
	//   25   45:dup             
	//   26   46:invokespecial   #45  <Method void StringBuilder()>
	//   27   49:astore          5
				stringbuilder.append("Could not write to custom attributes json object with key: [");
	//   28   51:aload           5
	//   29   53:ldc2            #328 <String "Could not write to custom attributes json object with key: [">
	//   30   56:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
				stringbuilder.append(s);
	//   32   60:aload           5
	//   33   62:aload_1         
	//   34   63:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
				stringbuilder.append("] value: [");
	//   36   67:aload           5
	//   37   69:ldc1            #127 <String "] value: [">
	//   38   71:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
				stringbuilder.append(obj);
	//   40   75:aload           5
	//   41   77:aload_2         
	//   42   78:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//   43   81:pop             
				stringbuilder.append("] ");
	//   44   82:aload           5
	//   45   84:ldc1            #132 <String "] ">
	//   46   86:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
				AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   48   90:aload           4
	//   49   92:aload           5
	//   50   94:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   51   97:aload_3         
	//   52   98:invokestatic    #181 <Method int AppboyLogger.w(String, String, Throwable)>
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
	//    3    3:ldc2            #330 <String "last_name">
	//    4    6:aload_1         
	//    5    7:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    2    2:getstatic       #28  <Field String c>
	//    3    5:ldc2            #332 <String "Push token cache cleared.">
	//    4    8:invokestatic    #335 <Method int AppboyLogger.v(String, String)>
	//    5   11:pop             
		b.edit().clear().apply();
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field SharedPreferences b>
	//    8   16:invokeinterface #93  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   21:invokeinterface #338 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   10   26:invokeinterface #107 <Method void android.content.SharedPreferences$Editor.apply()>
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
	//    7    9:invokevirtual   #341 <Method String String.trim()>
	//    8   12:astore_3        
	//*   9   13:goto            16
		if(s1 == null)
			break MISSING_BLOCK_LABEL_73;
	//   10   16:aload_3         
	//   11   17:ifnull          73
		if(ValidationUtils.isValidEmailAddress(s1))
	//*  12   20:aload_3         
	//*  13   21:invokestatic    #344 <Method boolean ValidationUtils.isValidEmailAddress(String)>
	//*  14   24:ifeq            30
			break MISSING_BLOCK_LABEL_73;
	//   15   27:goto            73
		s = c;
	//   16   30:getstatic       #28  <Field String c>
	//   17   33:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   34:new             #44  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #45  <Method void StringBuilder()>
	//   21   41:astore          4
		stringbuilder.append("Email address is not valid: ");
	//   22   43:aload           4
	//   23   45:ldc2            #346 <String "Email address is not valid: ">
	//   24   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s1);
	//   26   52:aload           4
	//   27   54:aload_3         
	//   28   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   30   59:aload_1         
	//   31   60:aload           4
	//   32   62:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   33   65:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
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
	//   40   74:ldc2            #348 <String "email">
	//   41   77:aload_3         
	//   42   78:invokespecial   #190 <Method boolean c(String, Object)>
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

	public ch e()
	{
		if(!StringUtils.isNullOrEmpty(f))
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field String f>
	//*   2    4:invokestatic    #351 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   3    7:ifne            18
			a(f);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field String f>
	//    7   15:invokevirtual   #353 <Method void a(String)>
		JSONObject jsonobject = f();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #113 <Method JSONObject f()>
	//   10   22:astore_1        
		try
		{
			a(jsonobject);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #355 <Method void a(JSONObject)>
		}
	//*  14   28:goto            43
		catch(JSONException jsonexception)
	//*  15   31:astore_2        
		{
			AppboyLogger.e(c, "Couldn't add push token to outbound json", ((Throwable) (jsonexception)));
	//   16   32:getstatic       #28  <Field String c>
	//   17   35:ldc2            #357 <String "Couldn't add push token to outbound json">
	//   18   38:aload_2         
	//   19   39:invokestatic    #147 <Method int AppboyLogger.e(String, String, Throwable)>
	//   20   42:pop             
		}
		a.edit().clear().apply();
	//   21   43:aload_0         
	//   22   44:getfield        #63  <Field SharedPreferences a>
	//   23   47:invokeinterface #93  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   24   52:invokeinterface #338 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   25   57:invokeinterface #107 <Method void android.content.SharedPreferences$Editor.apply()>
		return new ch(jsonobject);
	//   26   62:new             #157 <Class ch>
	//   27   65:dup             
	//   28   66:aload_1         
	//   29   67:invokespecial   #359 <Method void ch(JSONObject)>
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
	//    3    3:ldc2            #361 <String "country">
	//    4    6:aload_1         
	//    5    7:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    1    1:getfield        #63  <Field SharedPreferences a>
	//    2    4:ldc1            #95  <String "user_cache_attributes_object">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #240 <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(s == null)
	//*   6   13:aload_1         
	//*   7   14:ifnonnull       25
			return new JSONObject();
	//    8   17:new             #97  <Class JSONObject>
	//    9   20:dup             
	//   10   21:invokespecial   #148 <Method void JSONObject()>
	//   11   24:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject(s);
	//   12   25:new             #97  <Class JSONObject>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokespecial   #363 <Method void JSONObject(String)>
	//   16   33:astore_2        
		}
	//*  17   34:aload_2         
	//*  18   35:areturn         
		catch(JSONException jsonexception)
	//*  19   36:astore_2        
		{
			String s1 = c;
	//   20   37:getstatic       #28  <Field String c>
	//   21   40:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   22   41:new             #44  <Class StringBuilder>
	//   23   44:dup             
	//   24   45:invokespecial   #45  <Method void StringBuilder()>
	//   25   48:astore          4
			stringbuilder.append("Failed to load user object json from prefs with json string: ");
	//   26   50:aload           4
	//   27   52:ldc2            #365 <String "Failed to load user object json from prefs with json string: ">
	//   28   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			stringbuilder.append(s);
	//   30   59:aload           4
	//   31   61:aload_1         
	//   32   62:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   34   66:aload_3         
	//   35   67:aload           4
	//   36   69:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   37   72:aload_2         
	//   38   73:invokestatic    #147 <Method int AppboyLogger.e(String, String, Throwable)>
	//   39   76:pop             
			return new JSONObject();
	//   40   77:new             #97  <Class JSONObject>
	//   41   80:dup             
	//   42   81:invokespecial   #148 <Method void JSONObject()>
	//   43   84:areturn         
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
	//    3    3:ldc2            #367 <String "home_city">
	//    4    6:aload_1         
	//    5    7:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    3    3:ldc2            #369 <String "language">
	//    4    6:aload_1         
	//    5    7:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    7    9:invokevirtual   #341 <Method String String.trim()>
	//    8   12:astore_3        
	//*   9   13:goto            16
		if(s1 == null)
			break MISSING_BLOCK_LABEL_73;
	//   10   16:aload_3         
	//   11   17:ifnull          73
		if(ValidationUtils.isValidPhoneNumber(s1))
	//*  12   20:aload_3         
	//*  13   21:invokestatic    #373 <Method boolean ValidationUtils.isValidPhoneNumber(String)>
	//*  14   24:ifeq            30
			break MISSING_BLOCK_LABEL_73;
	//   15   27:goto            73
		s = c;
	//   16   30:getstatic       #28  <Field String c>
	//   17   33:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   34:new             #44  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #45  <Method void StringBuilder()>
	//   21   41:astore          4
		stringbuilder.append("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ");
	//   22   43:aload           4
	//   23   45:ldc2            #375 <String "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ">
	//   24   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s1);
	//   26   52:aload           4
	//   27   54:aload_3         
	//   28   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   30   59:aload_1         
	//   31   60:aload           4
	//   32   62:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   33   65:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
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
	//   40   74:ldc2            #377 <String "phone">
	//   41   77:aload_3         
	//   42   78:invokespecial   #190 <Method boolean c(String, Object)>
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
	//    3    3:ldc2            #380 <String "image_url">
	//    4    6:aload_1         
	//    5    7:invokespecial   #190 <Method boolean c(String, Object)>
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
		if(CustomAttributeValidationUtils.isValidCustomAttributeKey(s, e.m()))
			break MISSING_BLOCK_LABEL_30;
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #71  <Field dh e>
	//    5    7:invokevirtual   #282 <Method java.util.Set dh.m()>
	//    6   10:invokestatic    #288 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//    7   13:ifne            30
		AppboyLogger.w(c, "Custom attribute key cannot be null.");
	//    8   16:getstatic       #28  <Field String c>
	//    9   19:ldc2            #290 <String "Custom attribute key cannot be null.">
	//   10   22:invokestatic    #87  <Method int AppboyLogger.w(String, String)>
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
	//   18   32:invokestatic    #295 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   19   35:getstatic       #117 <Field Object JSONObject.NULL>
	//   20   38:invokevirtual   #307 <Method boolean b(String, Object)>
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

	private static final String c = AppboyLogger.getAppboyLogTag(bo/app/dj);
	final SharedPreferences a;
	final SharedPreferences b;
	private final bp d;
	private final dh e;
	private final String f;
	private final dg g;

	static 
	{
	//    0    0:ldc1            #2   <Class dj>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String c>
	//*   3    8:return          
	}
}
