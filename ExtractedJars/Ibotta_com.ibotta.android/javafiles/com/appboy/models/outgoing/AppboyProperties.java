// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.outgoing;

import bo.app.eb;
import bo.app.u;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppboyProperties
	implements IPutIntoJson
{

	public AppboyProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = new JSONObject();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void JSONObject()>
	//    6   12:putfield        #30  <Field JSONObject b>
	//    7   15:return          
	}

	public AppboyProperties(JSONObject jsonobject)
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = new JSONObject();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void JSONObject()>
	//    6   12:putfield        #30  <Field JSONObject b>
		b = jsonobject;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #30  <Field JSONObject b>
		obj = ((Object) (new ArrayList()));
	//   10   20:new             #35  <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #36  <Method void ArrayList()>
	//   13   27:astore_2        
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); ((List) (obj)).add(iterator.next()));
	//   14   28:aload_1         
	//   15   29:invokevirtual   #40  <Method Iterator JSONObject.keys()>
	//   16   32:astore_3        
	//   17   33:aload_3         
	//   18   34:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   19   39:ifeq            58
	//   20   42:aload_2         
	//   21   43:aload_3         
	//   22   44:invokeinterface #50  <Method Object Iterator.next()>
	//   23   49:invokeinterface #56  <Method boolean List.add(Object)>
	//   24   54:pop             
	//*  25   55:goto            33
		obj = ((Object) (((List) (obj)).iterator()));
	//   26   58:aload_2         
	//   27   59:invokeinterface #59  <Method Iterator List.iterator()>
	//   28   64:astore_2        
_L2:
		String s;
		if(!((Iterator) (obj)).hasNext())
			break; /* Loop/switch isn't completed */
	//   29   65:aload_2         
	//   30   66:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   31   71:ifeq            207
		s = (String)((Iterator) (obj)).next();
	//   32   74:aload_2         
	//   33   75:invokeinterface #50  <Method Object Iterator.next()>
	//   34   80:checkcast       #61  <Class String>
	//   35   83:astore_3        
		if(!a(s))
	//*  36   84:aload_3         
	//*  37   85:invokestatic    #64  <Method boolean a(String)>
	//*  38   88:ifne            103
		{
			b.remove(s);
	//   39   91:aload_0         
	//   40   92:getfield        #30  <Field JSONObject b>
	//   41   95:aload_3         
	//   42   96:invokevirtual   #68  <Method Object JSONObject.remove(String)>
	//   43   99:pop             
			continue; /* Loop/switch isn't completed */
	//   44  100:goto            65
		}
		if(jsonobject.get(s) instanceof String)
	//*  45  103:aload_1         
	//*  46  104:aload_3         
	//*  47  105:invokevirtual   #71  <Method Object JSONObject.get(String)>
	//*  48  108:instanceof      #61  <Class String>
	//*  49  111:ifeq            137
		{
			if(!b(jsonobject.getString(s)))
	//*  50  114:aload_1         
	//*  51  115:aload_3         
	//*  52  116:invokevirtual   #75  <Method String JSONObject.getString(String)>
	//*  53  119:invokestatic    #77  <Method boolean b(String)>
	//*  54  122:ifne            65
				b.remove(s);
	//   55  125:aload_0         
	//   56  126:getfield        #30  <Field JSONObject b>
	//   57  129:aload_3         
	//   58  130:invokevirtual   #68  <Method Object JSONObject.remove(String)>
	//   59  133:pop             
			continue; /* Loop/switch isn't completed */
	//   60  134:goto            65
		}
		try
		{
			if(jsonobject.get(s) == JSONObject.NULL)
	//*  61  137:aload_1         
	//*  62  138:aload_3         
	//*  63  139:invokevirtual   #71  <Method Object JSONObject.get(String)>
	//*  64  142:getstatic       #81  <Field Object JSONObject.NULL>
	//*  65  145:if_acmpne       65
				b.remove(s);
	//   66  148:aload_0         
	//   67  149:getfield        #30  <Field JSONObject b>
	//   68  152:aload_3         
	//   69  153:invokevirtual   #68  <Method Object JSONObject.remove(String)>
	//   70  156:pop             
		}
	//*  71  157:goto            65
		catch(JSONException jsonexception)
	//*  72  160:astore          4
		{
			String s1 = a;
	//   73  162:getstatic       #21  <Field String a>
	//   74  165:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   75  167:new             #83  <Class StringBuilder>
	//   76  170:dup             
	//   77  171:invokespecial   #84  <Method void StringBuilder()>
	//   78  174:astore          6
			stringbuilder.append("Caught json exception validating property with key name: ");
	//   79  176:aload           6
	//   80  178:ldc1            #86  <String "Caught json exception validating property with key name: ">
	//   81  180:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   82  183:pop             
			stringbuilder.append(s);
	//   83  184:aload           6
	//   84  186:aload_3         
	//   85  187:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   86  190:pop             
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   87  191:aload           5
	//   88  193:aload           6
	//   89  195:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   90  198:aload           4
	//   91  200:invokestatic    #98  <Method int AppboyLogger.e(String, String, Throwable)>
	//   92  203:pop             
		}
		if(true) goto _L2; else goto _L1
	//   93  204:goto            65
_L1:
	//   94  207:return          
	}

	static boolean a(String s)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #104 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            18
		{
			AppboyLogger.w(a, "The AppboyProperties key cannot be null or contain only whitespaces. Not adding property.");
	//    3    7:getstatic       #21  <Field String a>
	//    4   10:ldc1            #106 <String "The AppboyProperties key cannot be null or contain only whitespaces. Not adding property.">
	//    5   12:invokestatic    #110 <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(s.startsWith("$"))
	//*   9   18:aload_0         
	//*  10   19:ldc1            #112 <String "$">
	//*  11   21:invokevirtual   #115 <Method boolean String.startsWith(String)>
	//*  12   24:ifeq            38
		{
			AppboyLogger.w(a, "The leading character in the key string may not be '$'. Not adding property.");
	//   13   27:getstatic       #21  <Field String a>
	//   14   30:ldc1            #117 <String "The leading character in the key string may not be '$'. Not adding property.">
	//   15   32:invokestatic    #110 <Method int AppboyLogger.w(String, String)>
	//   16   35:pop             
			return false;
	//   17   36:iconst_0        
	//   18   37:ireturn         
		} else
		{
			return true;
	//   19   38:iconst_1        
	//   20   39:ireturn         
		}
	}

	static boolean b(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(a, "The AppboyProperties value cannot be null. Not adding property.");
	//    2    4:getstatic       #21  <Field String a>
	//    3    7:ldc1            #120 <String "The AppboyProperties value cannot be null. Not adding property.">
	//    4    9:invokestatic    #110 <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		} else
		{
			return true;
	//    8   15:iconst_1        
	//    9   16:ireturn         
		}
	}

	public AppboyProperties addProperty(String s, double d)
	{
		if(!a(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #64  <Method boolean a(String)>
	//*   2    4:ifne            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		try
		{
			b.put(ValidationUtils.ensureAppboyFieldLength(s), d);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field JSONObject b>
	//    7   13:aload_1         
	//    8   14:invokestatic    #127 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//    9   17:dload_2         
	//   10   18:invokevirtual   #131 <Method JSONObject JSONObject.put(String, double)>
	//   11   21:pop             
		}
	//*  12   22:aload_0         
	//*  13   23:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   24:astore_1        
		{
			AppboyLogger.e(a, "Caught json exception trying to add property.", ((Throwable) (s)));
	//   15   25:getstatic       #21  <Field String a>
	//   16   28:ldc1            #133 <String "Caught json exception trying to add property.">
	//   17   30:aload_1         
	//   18   31:invokestatic    #98  <Method int AppboyLogger.e(String, String, Throwable)>
	//   19   34:pop             
			return this;
	//   20   35:aload_0         
	//   21   36:areturn         
		}
		return this;
	}

	public AppboyProperties addProperty(String s, int i)
	{
		if(!a(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #64  <Method boolean a(String)>
	//*   2    4:ifne            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		try
		{
			b.put(ValidationUtils.ensureAppboyFieldLength(s), i);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field JSONObject b>
	//    7   13:aload_1         
	//    8   14:invokestatic    #127 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #137 <Method JSONObject JSONObject.put(String, int)>
	//   11   21:pop             
		}
	//*  12   22:aload_0         
	//*  13   23:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   24:astore_1        
		{
			AppboyLogger.e(a, "Caught json exception trying to add property.", ((Throwable) (s)));
	//   15   25:getstatic       #21  <Field String a>
	//   16   28:ldc1            #133 <String "Caught json exception trying to add property.">
	//   17   30:aload_1         
	//   18   31:invokestatic    #98  <Method int AppboyLogger.e(String, String, Throwable)>
	//   19   34:pop             
			return this;
	//   20   35:aload_0         
	//   21   36:areturn         
		}
		return this;
	}

	public AppboyProperties addProperty(String s, String s1)
	{
		if(a(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #64  <Method boolean a(String)>
	//*   2    4:ifeq            47
		{
			if(!b(s1))
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #77  <Method boolean b(String)>
	//*   5   11:ifne            16
				return this;
	//    6   14:aload_0         
	//    7   15:areturn         
			try
			{
				b.put(ValidationUtils.ensureAppboyFieldLength(s), ((Object) (ValidationUtils.ensureAppboyFieldLength(s1))));
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field JSONObject b>
	//   10   20:aload_1         
	//   11   21:invokestatic    #127 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   12   24:aload_2         
	//   13   25:invokestatic    #127 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   14   28:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   15   31:pop             
			}
	//*  16   32:aload_0         
	//*  17   33:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  18   34:astore_1        
			{
				AppboyLogger.e(a, "Caught json exception trying to add property.", ((Throwable) (s)));
	//   19   35:getstatic       #21  <Field String a>
	//   20   38:ldc1            #133 <String "Caught json exception trying to add property.">
	//   21   40:aload_1         
	//   22   41:invokestatic    #98  <Method int AppboyLogger.e(String, String, Throwable)>
	//   23   44:pop             
				return this;
	//   24   45:aload_0         
	//   25   46:areturn         
			}
			return this;
		} else
		{
			return this;
	//   26   47:aload_0         
	//   27   48:areturn         
		}
	}

	public AppboyProperties addProperty(String s, Date date)
	{
		if(!a(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #64  <Method boolean a(String)>
	//*   2    4:ifne            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(date == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		try
		{
			date = ((Date) (eb.a(date, u.b)));
	//    9   15:aload_2         
	//   10   16:getstatic       #147 <Field u u.b>
	//   11   19:invokestatic    #152 <Method String eb.a(Date, u)>
	//   12   22:astore_2        
			b.put(ValidationUtils.ensureAppboyFieldLength(s), ((Object) (date)));
	//   13   23:aload_0         
	//   14   24:getfield        #30  <Field JSONObject b>
	//   15   27:aload_1         
	//   16   28:invokestatic    #127 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   17   31:aload_2         
	//   18   32:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   19   35:pop             
		}
	//*  20   36:aload_0         
	//*  21   37:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  22   38:astore_1        
		{
			AppboyLogger.e(a, "Caught json exception trying to add property.", ((Throwable) (s)));
	//   23   39:getstatic       #21  <Field String a>
	//   24   42:ldc1            #133 <String "Caught json exception trying to add property.">
	//   25   44:aload_1         
	//   26   45:invokestatic    #98  <Method int AppboyLogger.e(String, String, Throwable)>
	//   27   48:pop             
			return this;
	//   28   49:aload_0         
	//   29   50:areturn         
		}
		return this;
	}

	public AppboyProperties addProperty(String s, boolean flag)
	{
		if(!a(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #64  <Method boolean a(String)>
	//*   2    4:ifne            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		try
		{
			b.put(ValidationUtils.ensureAppboyFieldLength(s), flag);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field JSONObject b>
	//    7   13:aload_1         
	//    8   14:invokestatic    #127 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #156 <Method JSONObject JSONObject.put(String, boolean)>
	//   11   21:pop             
		}
	//*  12   22:aload_0         
	//*  13   23:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   24:astore_1        
		{
			AppboyLogger.e(a, "Caught json exception trying to add property.", ((Throwable) (s)));
	//   15   25:getstatic       #21  <Field String a>
	//   16   28:ldc1            #133 <String "Caught json exception trying to add property.">
	//   17   30:aload_1         
	//   18   31:invokestatic    #98  <Method int AppboyLogger.e(String, String, Throwable)>
	//   19   34:pop             
			return this;
	//   20   35:aload_0         
	//   21   36:areturn         
		}
		return this;
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JSONObject b>
	//    2    4:areturn         
	}

	public int size()
	{
		return b.length();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JSONObject b>
	//    2    4:invokevirtual   #165 <Method int JSONObject.length()>
	//    3    7:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/outgoing/AppboyProperties);
	private JSONObject b;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyProperties>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String a>
	//*   3    8:return          
	}
}
