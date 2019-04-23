// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Iterator;
import org.json.*;

// Referenced classes of package bo.app:
//			cw, ce, dt, fx, 
//			fw, fy

public class cz extends cw
{

	public cz(Context context)
	{
		this(context, ((String) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #28  <Method void cz(Context, String, String)>
	//    5    7:return          
	}

	public cz(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void cw()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field ce c>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #34  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #35  <Method void StringBuilder()>
	//    8   16:astore          4
		stringbuilder.append("com.appboy.storage.device_cache.v3");
	//    9   18:aload           4
	//   10   20:ldc1            #37  <String "com.appboy.storage.device_cache.v3">
	//   11   22:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   13   26:aload           4
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokestatic    #47  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   18   34:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		a = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:aload           4
	//   23   42:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   24   45:iconst_0        
	//   25   46:invokevirtual   #57  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   26   49:putfield        #59  <Field SharedPreferences a>
	//   27   52:return          
	}

	Object a()
	{
		return ((Object) (d()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method ce d()>
	//    2    4:areturn         
	}

	public void a(ce ce1)
	{
		c = ce1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field ce c>
	//    3    5:return          
	}

	void a(ce ce1, boolean flag)
	{
		if(flag && ce1 != null)
	//*   0    0:iload_2         
	//*   1    1:ifeq            82
	//*   2    4:aload_1         
	//*   3    5:ifnull          82
			try
			{
				JSONObject jsonobject = new JSONObject(a.getString("cached_device", "{}"));
	//    4    8:new             #72  <Class JSONObject>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #59  <Field SharedPreferences a>
	//    8   16:ldc1            #74  <String "cached_device">
	//    9   18:ldc1            #76  <String "{}">
	//   10   20:invokeinterface #82  <Method String SharedPreferences.getString(String, String)>
	//   11   25:invokespecial   #85  <Method void JSONObject(String)>
	//   12   28:astore_3        
				ce1 = ((ce) (ce1.a()));
	//   13   29:aload_1         
	//   14   30:invokevirtual   #90  <Method JSONObject ce.a()>
	//   15   33:astore_1        
				android.content.SharedPreferences.Editor editor = a.edit();
	//   16   34:aload_0         
	//   17   35:getfield        #59  <Field SharedPreferences a>
	//   18   38:invokeinterface #94  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   19   43:astore          4
				editor.putString("cached_device", dt.a(jsonobject, ((JSONObject) (ce1))).toString());
	//   20   45:aload           4
	//   21   47:ldc1            #74  <String "cached_device">
	//   22   49:aload_3         
	//   23   50:aload_1         
	//   24   51:invokestatic    #99  <Method JSONObject dt.a(JSONObject, JSONObject)>
	//   25   54:invokevirtual   #100 <Method String JSONObject.toString()>
	//   26   57:invokeinterface #106 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   27   62:pop             
				editor.apply();
	//   28   63:aload           4
	//   29   65:invokeinterface #109 <Method void android.content.SharedPreferences$Editor.apply()>
				return;
	//   30   70:return          
			}
			// Misplaced declaration of an exception variable
			catch(ce ce1)
	//*  31   71:astore_1        
			{
				AppboyLogger.d(b, "Caught exception confirming and unlocking device cache.", ((Throwable) (ce1)));
	//   32   72:getstatic       #22  <Field String b>
	//   33   75:ldc1            #111 <String "Caught exception confirming and unlocking device cache.">
	//   34   77:aload_1         
	//   35   78:invokestatic    #114 <Method int AppboyLogger.d(String, String, Throwable)>
	//   36   81:pop             
			}
	//   37   82:return          
	}

	volatile void a(Object obj, boolean flag)
	{
		a((ce)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #87  <Class ce>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #117 <Method void a(ce, boolean)>
	//    5    9:return          
	}

	ce d()
	{
		JSONObject jsonobject;
		JSONObject jsonobject2;
		jsonobject2 = c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ce c>
	//    2    4:invokevirtual   #90  <Method JSONObject ce.a()>
	//    3    7:astore_3        
		jsonobject = new JSONObject();
	//    4    8:new             #72  <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #118 <Method void JSONObject()>
	//    7   15:astore_1        
		JSONObject jsonobject1 = new JSONObject(a.getString("cached_device", "{}"));
	//    8   16:new             #72  <Class JSONObject>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field SharedPreferences a>
	//   12   24:ldc1            #74  <String "cached_device">
	//   13   26:ldc1            #76  <String "{}">
	//   14   28:invokeinterface #82  <Method String SharedPreferences.getString(String, String)>
	//   15   33:invokespecial   #85  <Method void JSONObject(String)>
	//   16   36:astore_2        
		jsonobject = jsonobject1;
	//   17   37:aload_2         
	//   18   38:astore_1        
		break MISSING_BLOCK_LABEL_53;
	//   19   39:goto            53
		JSONException jsonexception3;
		jsonexception3;
	//   20   42:astore_2        
		AppboyLogger.e(b, "Caught exception confirming and unlocking Json objects.", ((Throwable) (jsonexception3)));
	//   21   43:getstatic       #22  <Field String b>
	//   22   46:ldc1            #120 <String "Caught exception confirming and unlocking Json objects.">
	//   23   48:aload_2         
	//   24   49:invokestatic    #123 <Method int AppboyLogger.e(String, String, Throwable)>
	//   25   52:pop             
		Iterator iterator;
		jsonexception3 = ((JSONException) (new JSONObject()));
	//   26   53:new             #72  <Class JSONObject>
	//   27   56:dup             
	//   28   57:invokespecial   #118 <Method void JSONObject()>
	//   29   60:astore_2        
		iterator = jsonobject2.keys();
	//   30   61:aload_3         
	//   31   62:invokevirtual   #127 <Method Iterator JSONObject.keys()>
	//   32   65:astore          4
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
					break MISSING_BLOCK_LABEL_217;
	//   33   67:aload           4
	//   34   69:invokeinterface #133 <Method boolean Iterator.hasNext()>
	//   35   74:ifeq            217
				s = (String)iterator.next();
	//   36   77:aload           4
	//   37   79:invokeinterface #136 <Method Object Iterator.next()>
	//   38   84:checkcast       #138 <Class String>
	//   39   87:astore          5
				obj = jsonobject2.opt(s);
	//   40   89:aload_3         
	//   41   90:aload           5
	//   42   92:invokevirtual   #142 <Method Object JSONObject.opt(String)>
	//   43   95:astore          6
				obj1 = jsonobject.opt(s);
	//   44   97:aload_1         
	//   45   98:aload           5
	//   46  100:invokevirtual   #142 <Method Object JSONObject.opt(String)>
	//   47  103:astore          7
				if((obj instanceof JSONObject) || (obj instanceof JSONArray))
	//*  48  105:aload           6
	//*  49  107:instanceof      #72  <Class JSONObject>
	//*  50  110:ifne            162
	//*  51  113:aload           6
	//*  52  115:instanceof      #144 <Class JSONArray>
	//*  53  118:ifeq            124
					break label1;
	//   54  121:goto            162
				if(!obj.equals(obj1))
	//*  55  124:aload           6
	//*  56  126:aload           7
	//*  57  128:invokevirtual   #150 <Method boolean Object.equals(Object)>
	//*  58  131:ifne            67
					try
					{
						((JSONObject) (jsonexception3)).put(s, obj);
	//   59  134:aload_2         
	//   60  135:aload           5
	//   61  137:aload           6
	//   62  139:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//   63  142:pop             
					}
	//*  64  143:goto            67
					catch(JSONException jsonexception)
	//*  65  146:astore_1        
					{
						AppboyLogger.e(b, "Caught json exception creating dirty outbound device. Returning the whole device.", ((Throwable) (jsonexception)));
	//   66  147:getstatic       #22  <Field String b>
	//   67  150:ldc1            #156 <String "Caught json exception creating dirty outbound device. Returning the whole device.">
	//   68  152:aload_1         
	//   69  153:invokestatic    #123 <Method int AppboyLogger.e(String, String, Throwable)>
	//   70  156:pop             
						return c;
	//   71  157:aload_0         
	//   72  158:getfield        #32  <Field ce c>
	//   73  161:areturn         
					}
			}
		} while(true);
		if(obj1 == null) goto _L2; else goto _L1
	//   74  162:aload           7
	//   75  164:ifnull          189
_L1:
		if(!fw.a(String.valueOf(obj), String.valueOf(obj1), fx.c).b()) goto _L3; else goto _L2
	//   76  167:aload           6
	//   77  169:invokestatic    #160 <Method String String.valueOf(Object)>
	//   78  172:aload           7
	//   79  174:invokestatic    #160 <Method String String.valueOf(Object)>
	//   80  177:getstatic       #165 <Field fx fx.c>
	//   81  180:invokestatic    #170 <Method fy fw.a(String, String, fx)>
	//   82  183:invokevirtual   #174 <Method boolean fy.b()>
	//   83  186:ifeq            67
_L2:
		((JSONObject) (jsonexception3)).put(s, obj);
	//   84  189:aload_2         
	//   85  190:aload           5
	//   86  192:aload           6
	//   87  194:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//   88  197:pop             
		  goto _L3
	//*  89  198:goto            67
		JSONException jsonexception1;
		jsonexception1;
	//   90  201:astore_1        
		AppboyLogger.d(b, "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.", ((Throwable) (jsonexception1)));
	//   91  202:getstatic       #22  <Field String b>
	//   92  205:ldc1            #176 <String "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.">
	//   93  207:aload_1         
	//   94  208:invokestatic    #114 <Method int AppboyLogger.d(String, String, Throwable)>
	//   95  211:pop             
		return c;
	//   96  212:aload_0         
	//   97  213:getfield        #32  <Field ce c>
	//   98  216:areturn         
		ce ce1;
		try
		{
			ce1 = ce.a(((JSONObject) (jsonexception3)));
	//   99  217:aload_2         
	//  100  218:invokestatic    #179 <Method ce ce.a(JSONObject)>
	//  101  221:astore_1        
		}
	//* 102  222:aload_1         
	//* 103  223:areturn         
		catch(JSONException jsonexception2)
	//* 104  224:astore_1        
		{
			AppboyLogger.d(b, "Caught json exception creating device from json. Returning the whole device.", ((Throwable) (jsonexception2)));
	//  105  225:getstatic       #22  <Field String b>
	//  106  228:ldc1            #181 <String "Caught json exception creating device from json. Returning the whole device.">
	//  107  230:aload_1         
	//  108  231:invokestatic    #114 <Method int AppboyLogger.d(String, String, Throwable)>
	//  109  234:pop             
			return c;
	//  110  235:aload_0         
	//  111  236:getfield        #32  <Field ce c>
	//  112  239:areturn         
		}
		return ce1;
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cz);
	final SharedPreferences a;
	private ce c;

	static 
	{
	//    0    0:ldc1            #2   <Class cz>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String b>
	//*   3    8:return          
	}
}
