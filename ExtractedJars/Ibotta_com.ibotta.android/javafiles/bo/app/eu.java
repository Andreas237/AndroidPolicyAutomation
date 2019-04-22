// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.*;
import org.json.*;

// Referenced classes of package bo.app:
//			er, fn, gj, fr, 
//			ey, fl, eb, gi

public abstract class eu
	implements er
{

	protected eu(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:putfield        #38  <Field List d>
		b = jsonobject.getString("id");
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:ldc1            #40  <String "id">
	//   10   19:invokevirtual   #46  <Method String JSONObject.getString(String)>
	//   11   22:putfield        #48  <Field String b>
		c = ((fl) (new fn(jsonobject)));
	//   12   25:aload_0         
	//   13   26:new             #50  <Class fn>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:invokespecial   #52  <Method void fn(JSONObject)>
	//   17   34:putfield        #54  <Field fl c>
		JSONArray jsonarray = jsonobject.getJSONArray("trigger_condition");
	//   18   37:aload_1         
	//   19   38:ldc1            #56  <String "trigger_condition">
	//   20   40:invokevirtual   #60  <Method JSONArray JSONObject.getJSONArray(String)>
	//   21   43:astore_2        
		if(jsonarray != null && jsonarray.length() > 0)
	//*  22   44:aload_2         
	//*  23   45:ifnull          69
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #66  <Method int JSONArray.length()>
	//*  26   52:ifle            69
			d.addAll(((java.util.Collection) (gj.a(jsonarray))));
	//   27   55:aload_0         
	//   28   56:getfield        #38  <Field List d>
	//   29   59:aload_2         
	//   30   60:invokestatic    #71  <Method List gj.a(JSONArray)>
	//   31   63:invokeinterface #77  <Method boolean List.addAll(java.util.Collection)>
	//   32   68:pop             
		e = jsonobject.optBoolean("prefetch", true);
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:ldc1            #79  <String "prefetch">
	//   36   73:iconst_1        
	//   37   74:invokevirtual   #83  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   38   77:putfield        #85  <Field boolean e>
	//   39   80:return          
	}

	public void a(gi gi)
	{
		f = gi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field gi f>
	//    3    5:return          
	}

	public boolean a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean a(fr fr1)
	{
		if(!j())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #93  <Method boolean j()>
	//*   2    4:ifne            71
		{
			String s = a;
	//    3    7:getstatic       #28  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #95  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #96  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Triggered action ");
	//    9   19:aload_3         
	//   10   20:ldc1            #98  <String "Triggered action ">
	//   11   22:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(b);
	//   13   26:aload_3         
	//   14   27:aload_0         
	//   15   28:getfield        #48  <Field String b>
	//   16   31:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append("not eligible to be triggered by ");
	//   18   35:aload_3         
	//   19   36:ldc1            #104 <String "not eligible to be triggered by ">
	//   20   38:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(fr1.b());
	//   22   42:aload_3         
	//   23   43:aload_1         
	//   24   44:invokeinterface #109 <Method String fr.b()>
	//   25   49:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			stringbuilder.append(" event. Current device time outside triggered action time window.");
	//   27   53:aload_3         
	//   28   54:ldc1            #111 <String " event. Current device time outside triggered action time window.">
	//   29   56:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   31   60:aload_2         
	//   32   61:aload_3         
	//   33   62:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   34   65:invokestatic    #117 <Method int AppboyLogger.d(String, String)>
	//   35   68:pop             
			return false;
	//   36   69:iconst_0        
	//   37   70:ireturn         
		}
		for(Iterator iterator = d.iterator(); iterator.hasNext();)
	//*  38   71:aload_0         
	//*  39   72:getfield        #38  <Field List d>
	//*  40   75:invokeinterface #121 <Method Iterator List.iterator()>
	//*  41   80:astore_2        
	//*  42   81:aload_2         
	//*  43   82:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//*  44   87:ifeq            110
			if(((ey)iterator.next()).a(fr1))
	//*  45   90:aload_2         
	//*  46   91:invokeinterface #130 <Method Object Iterator.next()>
	//*  47   96:checkcast       #132 <Class ey>
	//*  48   99:aload_1         
	//*  49  100:invokeinterface #134 <Method boolean ey.a(fr)>
	//*  50  105:ifeq            81
				return true;
	//   51  108:iconst_1        
	//   52  109:ireturn         

		return false;
	//   53  110:iconst_0        
	//   54  111:ireturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String b>
	//    2    4:areturn         
	}

	public fl c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field fl c>
	//    2    4:areturn         
	}

	public gi e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field gi f>
	//    2    4:areturn         
	}

	public JSONObject f()
	{
		JSONObject jsonobject;
		JSONArray jsonarray;
		jsonobject = (JSONObject)c.forJsonPut();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field fl c>
	//    2    4:invokeinterface #144 <Method Object fl.forJsonPut()>
	//    3    9:checkcast       #42  <Class JSONObject>
	//    4   12:astore_1        
		jsonobject.put("id", ((Object) (b)));
	//    5   13:aload_1         
	//    6   14:ldc1            #40  <String "id">
	//    7   16:aload_0         
	//    8   17:getfield        #48  <Field String b>
	//    9   20:invokevirtual   #148 <Method JSONObject JSONObject.put(String, Object)>
	//   10   23:pop             
		if(d == null)
			break MISSING_BLOCK_LABEL_99;
	//   11   24:aload_0         
	//   12   25:getfield        #38  <Field List d>
	//   13   28:ifnull          99
		jsonarray = new JSONArray();
	//   14   31:new             #62  <Class JSONArray>
	//   15   34:dup             
	//   16   35:invokespecial   #149 <Method void JSONArray()>
	//   17   38:astore_2        
		for(Iterator iterator = d.iterator(); iterator.hasNext(); jsonarray.put(((ey)iterator.next()).forJsonPut()));
	//   18   39:aload_0         
	//   19   40:getfield        #38  <Field List d>
	//   20   43:invokeinterface #121 <Method Iterator List.iterator()>
	//   21   48:astore_3        
	//   22   49:aload_3         
	//   23   50:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//   24   55:ifeq            80
	//   25   58:aload_2         
	//   26   59:aload_3         
	//   27   60:invokeinterface #130 <Method Object Iterator.next()>
	//   28   65:checkcast       #132 <Class ey>
	//   29   68:invokeinterface #150 <Method Object ey.forJsonPut()>
	//   30   73:invokevirtual   #153 <Method JSONArray JSONArray.put(Object)>
	//   31   76:pop             
	//*  32   77:goto            49
		try
		{
			jsonobject.put("trigger_condition", ((Object) (jsonarray)));
	//   33   80:aload_1         
	//   34   81:ldc1            #56  <String "trigger_condition">
	//   35   83:aload_2         
	//   36   84:invokevirtual   #148 <Method JSONObject JSONObject.put(String, Object)>
	//   37   87:pop             
			jsonobject.put("prefetch", e);
	//   38   88:aload_1         
	//   39   89:ldc1            #79  <String "prefetch">
	//   40   91:aload_0         
	//   41   92:getfield        #85  <Field boolean e>
	//   42   95:invokevirtual   #156 <Method JSONObject JSONObject.put(String, boolean)>
	//   43   98:pop             
		}
	//*  44   99:aload_1         
	//*  45  100:areturn         
	//*  46  101:aconst_null     
	//*  47  102:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		JSONException jsonexception;
		return jsonobject;
	//*  48  103:astore_1        
	//*  49  104:goto            101
	}

	public Object forJsonPut()
	{
		return ((Object) (f()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method JSONObject f()>
	//    2    4:areturn         
	}

	boolean j()
	{
		return k() && l();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method boolean k()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #164 <Method boolean l()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	boolean k()
	{
		return c.a() == -1L || eb.a() > c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field fl c>
	//    2    4:invokeinterface #167 <Method long fl.a()>
	//    3    9:ldc2w           #168 <Long -1L>
	//    4   12:lcmp            
	//    5   13:ifeq            37
	//    6   16:invokestatic    #172 <Method long eb.a()>
	//    7   19:aload_0         
	//    8   20:getfield        #54  <Field fl c>
	//    9   23:invokeinterface #167 <Method long fl.a()>
	//   10   28:lcmp            
	//   11   29:ifle            35
	//   12   32:goto            37
	//   13   35:iconst_0        
	//   14   36:ireturn         
	//   15   37:iconst_1        
	//   16   38:ireturn         
	}

	boolean l()
	{
		return c.b() == -1L || eb.a() < c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field fl c>
	//    2    4:invokeinterface #174 <Method long fl.b()>
	//    3    9:ldc2w           #168 <Long -1L>
	//    4   12:lcmp            
	//    5   13:ifeq            37
	//    6   16:invokestatic    #172 <Method long eb.a()>
	//    7   19:aload_0         
	//    8   20:getfield        #54  <Field fl c>
	//    9   23:invokeinterface #174 <Method long fl.b()>
	//   10   28:lcmp            
	//   11   29:ifge            35
	//   12   32:goto            37
	//   13   35:iconst_0        
	//   14   36:ireturn         
	//   15   37:iconst_1        
	//   16   38:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/eu);
	private final String b;
	private final fl c;
	private final List d = new ArrayList();
	private boolean e;
	private gi f;

	static 
	{
	//    0    0:ldc1            #2   <Class eu>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String a>
	//*   3    8:return          
	}
}
