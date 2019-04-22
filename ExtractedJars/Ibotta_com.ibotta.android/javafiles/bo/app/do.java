// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.Iterator;
import org.json.*;

// Referenced classes of package bo.app:
//			dk, ck, ek, go, 
//			gn, gp

public class do extends dk
{

	public do(Context context)
	{
		this(context, ((String) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #31  <Method void do(Context, String, String)>
	//    5    7:return          
	}

	public do(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void dk()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field ck d>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #37  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #38  <Method void StringBuilder()>
	//    8   16:astore          4
		stringbuilder.append("com.appboy.storage.device_cache.v3");
	//    9   18:aload           4
	//   10   20:ldc1            #40  <String "com.appboy.storage.device_cache.v3">
	//   11   22:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   13   26:aload           4
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokestatic    #50  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   18   34:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		a = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:aload           4
	//   23   42:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   24   45:iconst_0        
	//   25   46:invokevirtual   #60  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   26   49:putfield        #62  <Field SharedPreferences a>
		c = new AppboyConfigurationProvider(context);
	//   27   52:aload_0         
	//   28   53:new             #64  <Class AppboyConfigurationProvider>
	//   29   56:dup             
	//   30   57:aload_1         
	//   31   58:invokespecial   #66  <Method void AppboyConfigurationProvider(Context)>
	//   32   61:putfield        #68  <Field AppboyConfigurationProvider c>
	//   33   64:return          
	}

	Object a()
	{
		return ((Object) (d()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method ck d()>
	//    2    4:areturn         
	}

	public void a(ck ck1)
	{
		d = ck1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field ck d>
	//    3    5:return          
	}

	void a(ck ck1, boolean flag)
	{
		if(!flag || ck1 == null)
			break MISSING_BLOCK_LABEL_99;
	//    0    0:iload_2         
	//    1    1:ifeq            99
	//    2    4:aload_1         
	//    3    5:ifnull          99
		android.content.SharedPreferences.Editor editor;
		JSONObject jsonobject = JSONObjectInstrumentation.init(a.getString("cached_device", "{}"));
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field SharedPreferences a>
	//    6   12:ldc1            #80  <String "cached_device">
	//    7   14:ldc1            #82  <String "{}">
	//    8   16:invokeinterface #88  <Method String SharedPreferences.getString(String, String)>
	//    9   21:invokestatic    #94  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   10   24:astore          4
		ck1 = ((ck) (ck1.a()));
	//   11   26:aload_1         
	//   12   27:invokevirtual   #99  <Method JSONObject ck.a()>
	//   13   30:astore_1        
		editor = a.edit();
	//   14   31:aload_0         
	//   15   32:getfield        #62  <Field SharedPreferences a>
	//   16   35:invokeinterface #103 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   17   40:astore_3        
		ck1 = ((ck) (ek.a(jsonobject, ((JSONObject) (ck1)))));
	//   18   41:aload           4
	//   19   43:aload_1         
	//   20   44:invokestatic    #108 <Method JSONObject ek.a(JSONObject, JSONObject)>
	//   21   47:astore_1        
		if(!(ck1 instanceof JSONObject))
	//*  22   48:aload_1         
	//*  23   49:instanceof      #110 <Class JSONObject>
	//*  24   52:ifne            63
		{
			ck1 = ((ck) (((JSONObject) (ck1)).toString()));
	//   25   55:aload_1         
	//   26   56:invokevirtual   #111 <Method String JSONObject.toString()>
	//   27   59:astore_1        
			break MISSING_BLOCK_LABEL_71;
	//   28   60:goto            71
		}
		ck1 = ((ck) (JSONObjectInstrumentation.toString((JSONObject)ck1)));
	//   29   63:aload_1         
	//   30   64:checkcast       #110 <Class JSONObject>
	//   31   67:invokestatic    #114 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   32   70:astore_1        
		editor.putString("cached_device", ((String) (ck1)));
	//   33   71:aload_3         
	//   34   72:ldc1            #80  <String "cached_device">
	//   35   74:aload_1         
	//   36   75:invokeinterface #120 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   37   80:pop             
		editor.apply();
	//   38   81:aload_3         
	//   39   82:invokeinterface #123 <Method void android.content.SharedPreferences$Editor.apply()>
		return;
	//   40   87:return          
		ck1;
	//   41   88:astore_1        
		AppboyLogger.d(b, "Caught exception confirming and unlocking device cache.", ((Throwable) (ck1)));
	//   42   89:getstatic       #25  <Field String b>
	//   43   92:ldc1            #125 <String "Caught exception confirming and unlocking device cache.">
	//   44   94:aload_1         
	//   45   95:invokestatic    #128 <Method int AppboyLogger.d(String, String, Throwable)>
	//   46   98:pop             
	//   47   99:return          
	}

	volatile void a(Object obj, boolean flag)
	{
		a((ck)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #96  <Class ck>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #131 <Method void a(ck, boolean)>
	//    5    9:return          
	}

	ck d()
	{
		JSONObject jsonobject;
		JSONObject jsonobject2;
		jsonobject2 = d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ck d>
	//    2    4:invokevirtual   #99  <Method JSONObject ck.a()>
	//    3    7:astore_3        
		jsonobject = new JSONObject();
	//    4    8:new             #110 <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #132 <Method void JSONObject()>
	//    7   15:astore_1        
		JSONObject jsonobject1 = JSONObjectInstrumentation.init(a.getString("cached_device", "{}"));
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field SharedPreferences a>
	//   10   20:ldc1            #80  <String "cached_device">
	//   11   22:ldc1            #82  <String "{}">
	//   12   24:invokeinterface #88  <Method String SharedPreferences.getString(String, String)>
	//   13   29:invokestatic    #94  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   14   32:astore_2        
		jsonobject = jsonobject1;
	//   15   33:aload_2         
	//   16   34:astore_1        
		break MISSING_BLOCK_LABEL_49;
	//   17   35:goto            49
		JSONException jsonexception2;
		jsonexception2;
	//   18   38:astore_2        
		AppboyLogger.e(b, "Caught exception confirming and unlocking Json objects.", ((Throwable) (jsonexception2)));
	//   19   39:getstatic       #25  <Field String b>
	//   20   42:ldc1            #134 <String "Caught exception confirming and unlocking Json objects.">
	//   21   44:aload_2         
	//   22   45:invokestatic    #137 <Method int AppboyLogger.e(String, String, Throwable)>
	//   23   48:pop             
		Iterator iterator;
		jsonexception2 = ((JSONException) (new JSONObject()));
	//   24   49:new             #110 <Class JSONObject>
	//   25   52:dup             
	//   26   53:invokespecial   #132 <Method void JSONObject()>
	//   27   56:astore_2        
		iterator = jsonobject2.keys();
	//   28   57:aload_3         
	//   29   58:invokevirtual   #141 <Method Iterator JSONObject.keys()>
	//   30   61:astore          4
_L3:
		String s;
		Object obj;
		Object obj1;
label0:
		do
		{
label1:
			{
				if(!iterator.hasNext())
					break MISSING_BLOCK_LABEL_213;
	//   31   63:aload           4
	//   32   65:invokeinterface #147 <Method boolean Iterator.hasNext()>
	//   33   70:ifeq            213
				s = (String)iterator.next();
	//   34   73:aload           4
	//   35   75:invokeinterface #150 <Method Object Iterator.next()>
	//   36   80:checkcast       #152 <Class String>
	//   37   83:astore          5
				obj = jsonobject2.opt(s);
	//   38   85:aload_3         
	//   39   86:aload           5
	//   40   88:invokevirtual   #156 <Method Object JSONObject.opt(String)>
	//   41   91:astore          6
				obj1 = jsonobject.opt(s);
	//   42   93:aload_1         
	//   43   94:aload           5
	//   44   96:invokevirtual   #156 <Method Object JSONObject.opt(String)>
	//   45   99:astore          7
				if((obj instanceof JSONObject) || (obj instanceof JSONArray))
	//*  46  101:aload           6
	//*  47  103:instanceof      #110 <Class JSONObject>
	//*  48  106:ifne            158
	//*  49  109:aload           6
	//*  50  111:instanceof      #158 <Class JSONArray>
	//*  51  114:ifeq            120
					break label1;
	//   52  117:goto            158
				if(!obj.equals(obj1))
	//*  53  120:aload           6
	//*  54  122:aload           7
	//*  55  124:invokevirtual   #164 <Method boolean Object.equals(Object)>
	//*  56  127:ifne            63
					try
					{
						((JSONObject) (jsonexception2)).put(s, obj);
	//   57  130:aload_2         
	//   58  131:aload           5
	//   59  133:aload           6
	//   60  135:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
	//   61  138:pop             
					}
	//*  62  139:goto            63
					catch(JSONException jsonexception)
	//*  63  142:astore_1        
					{
						AppboyLogger.e(b, "Caught json exception creating dirty outbound device. Returning the whole device.", ((Throwable) (jsonexception)));
	//   64  143:getstatic       #25  <Field String b>
	//   65  146:ldc1            #170 <String "Caught json exception creating dirty outbound device. Returning the whole device.">
	//   66  148:aload_1         
	//   67  149:invokestatic    #137 <Method int AppboyLogger.e(String, String, Throwable)>
	//   68  152:pop             
						return d;
	//   69  153:aload_0         
	//   70  154:getfield        #35  <Field ck d>
	//   71  157:areturn         
					}
			}
		} while(true);
		if(obj1 == null) goto _L2; else goto _L1
	//   72  158:aload           7
	//   73  160:ifnull          185
_L1:
		if(!gn.a(String.valueOf(obj), String.valueOf(obj1), go.c).b()) goto _L3; else goto _L2
	//   74  163:aload           6
	//   75  165:invokestatic    #174 <Method String String.valueOf(Object)>
	//   76  168:aload           7
	//   77  170:invokestatic    #174 <Method String String.valueOf(Object)>
	//   78  173:getstatic       #179 <Field go go.c>
	//   79  176:invokestatic    #184 <Method gp gn.a(String, String, go)>
	//   80  179:invokevirtual   #188 <Method boolean gp.b()>
	//   81  182:ifeq            63
_L2:
		((JSONObject) (jsonexception2)).put(s, obj);
	//   82  185:aload_2         
	//   83  186:aload           5
	//   84  188:aload           6
	//   85  190:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
	//   86  193:pop             
		  goto _L3
	//*  87  194:goto            63
		JSONException jsonexception1;
		jsonexception1;
	//   88  197:astore_1        
		AppboyLogger.d(b, "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.", ((Throwable) (jsonexception1)));
	//   89  198:getstatic       #25  <Field String b>
	//   90  201:ldc1            #190 <String "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.">
	//   91  203:aload_1         
	//   92  204:invokestatic    #128 <Method int AppboyLogger.d(String, String, Throwable)>
	//   93  207:pop             
		return d;
	//   94  208:aload_0         
	//   95  209:getfield        #35  <Field ck d>
	//   96  212:areturn         
		return ck.a(c, ((JSONObject) (jsonexception2)));
	//   97  213:aload_0         
	//   98  214:getfield        #68  <Field AppboyConfigurationProvider c>
	//   99  217:aload_2         
	//  100  218:invokestatic    #193 <Method ck ck.a(AppboyConfigurationProvider, JSONObject)>
	//  101  221:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/do);
	final SharedPreferences a;
	private final AppboyConfigurationProvider c;
	private ck d;

	static 
	{
	//    0    0:ldc1            #2   <Class do>
	//    1    2:invokestatic    #23  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #25  <Field String b>
	//*   3    8:return          
	}
}
