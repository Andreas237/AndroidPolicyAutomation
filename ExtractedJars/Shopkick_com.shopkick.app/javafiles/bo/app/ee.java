// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.*;
import org.json.*;

// Referenced classes of package bo.app:
//			eb, ex, fs, fb, 
//			ei, ev, dl

public abstract class ee
	implements eb
{

	protected ee(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void ArrayList()>
	//    6   12:putfield        #36  <Field List d>
		b = jsonobject.getString("id");
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:ldc1            #38  <String "id">
	//   10   19:invokevirtual   #44  <Method String JSONObject.getString(String)>
	//   11   22:putfield        #46  <Field String b>
		c = ((ev) (new ex(jsonobject)));
	//   12   25:aload_0         
	//   13   26:new             #48  <Class ex>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:invokespecial   #50  <Method void ex(JSONObject)>
	//   17   34:putfield        #52  <Field ev c>
		JSONArray jsonarray = jsonobject.getJSONArray("trigger_condition");
	//   18   37:aload_1         
	//   19   38:ldc1            #54  <String "trigger_condition">
	//   20   40:invokevirtual   #58  <Method JSONArray JSONObject.getJSONArray(String)>
	//   21   43:astore_2        
		if(jsonarray != null && jsonarray.length() > 0)
	//*  22   44:aload_2         
	//*  23   45:ifnull          69
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #64  <Method int JSONArray.length()>
	//*  26   52:ifle            69
			d.addAll(((java.util.Collection) (fs.a(jsonarray))));
	//   27   55:aload_0         
	//   28   56:getfield        #36  <Field List d>
	//   29   59:aload_2         
	//   30   60:invokestatic    #69  <Method List fs.a(JSONArray)>
	//   31   63:invokeinterface #75  <Method boolean List.addAll(java.util.Collection)>
	//   32   68:pop             
		e = jsonobject.optBoolean("prefetch", true);
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:ldc1            #77  <String "prefetch">
	//   36   73:iconst_1        
	//   37   74:invokevirtual   #81  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   38   77:putfield        #83  <Field boolean e>
	//   39   80:return          
	}

	public boolean a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean a(fb fb1)
	{
		if(!i())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #88  <Method boolean i()>
	//*   2    4:ifne            71
		{
			String s = a;
	//    3    7:getstatic       #26  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #90  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #91  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Triggered action ");
	//    9   19:aload_3         
	//   10   20:ldc1            #93  <String "Triggered action ">
	//   11   22:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(b);
	//   13   26:aload_3         
	//   14   27:aload_0         
	//   15   28:getfield        #46  <Field String b>
	//   16   31:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append("not eligible to be triggered by ");
	//   18   35:aload_3         
	//   19   36:ldc1            #99  <String "not eligible to be triggered by ">
	//   20   38:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(fb1.b());
	//   22   42:aload_3         
	//   23   43:aload_1         
	//   24   44:invokeinterface #104 <Method String fb.b()>
	//   25   49:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			stringbuilder.append(" event. Current device time outside triggered action time window.");
	//   27   53:aload_3         
	//   28   54:ldc1            #106 <String " event. Current device time outside triggered action time window.">
	//   29   56:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   31   60:aload_2         
	//   32   61:aload_3         
	//   33   62:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   34   65:invokestatic    #112 <Method int AppboyLogger.d(String, String)>
	//   35   68:pop             
			return false;
	//   36   69:iconst_0        
	//   37   70:ireturn         
		}
		for(Iterator iterator = d.iterator(); iterator.hasNext();)
	//*  38   71:aload_0         
	//*  39   72:getfield        #36  <Field List d>
	//*  40   75:invokeinterface #116 <Method Iterator List.iterator()>
	//*  41   80:astore_2        
	//*  42   81:aload_2         
	//*  43   82:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//*  44   87:ifeq            110
			if(((ei)iterator.next()).a(fb1))
	//*  45   90:aload_2         
	//*  46   91:invokeinterface #125 <Method Object Iterator.next()>
	//*  47   96:checkcast       #127 <Class ei>
	//*  48   99:aload_1         
	//*  49  100:invokeinterface #129 <Method boolean ei.a(fb)>
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
	//    1    1:getfield        #46  <Field String b>
	//    2    4:areturn         
	}

	public ev c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ev c>
	//    2    4:areturn         
	}

	public JSONObject e()
	{
		JSONObject jsonobject;
		JSONArray jsonarray;
		jsonobject = (JSONObject)c.forJsonPut();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ev c>
	//    2    4:invokeinterface #138 <Method Object ev.forJsonPut()>
	//    3    9:checkcast       #40  <Class JSONObject>
	//    4   12:astore_1        
		jsonobject.put("id", ((Object) (b)));
	//    5   13:aload_1         
	//    6   14:ldc1            #38  <String "id">
	//    7   16:aload_0         
	//    8   17:getfield        #46  <Field String b>
	//    9   20:invokevirtual   #142 <Method JSONObject JSONObject.put(String, Object)>
	//   10   23:pop             
		if(d == null)
			break MISSING_BLOCK_LABEL_99;
	//   11   24:aload_0         
	//   12   25:getfield        #36  <Field List d>
	//   13   28:ifnull          99
		jsonarray = new JSONArray();
	//   14   31:new             #60  <Class JSONArray>
	//   15   34:dup             
	//   16   35:invokespecial   #143 <Method void JSONArray()>
	//   17   38:astore_2        
		for(Iterator iterator = d.iterator(); iterator.hasNext(); jsonarray.put(((ei)iterator.next()).forJsonPut()));
	//   18   39:aload_0         
	//   19   40:getfield        #36  <Field List d>
	//   20   43:invokeinterface #116 <Method Iterator List.iterator()>
	//   21   48:astore_3        
	//   22   49:aload_3         
	//   23   50:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//   24   55:ifeq            80
	//   25   58:aload_2         
	//   26   59:aload_3         
	//   27   60:invokeinterface #125 <Method Object Iterator.next()>
	//   28   65:checkcast       #127 <Class ei>
	//   29   68:invokeinterface #144 <Method Object ei.forJsonPut()>
	//   30   73:invokevirtual   #147 <Method JSONArray JSONArray.put(Object)>
	//   31   76:pop             
	//*  32   77:goto            49
		try
		{
			jsonobject.put("trigger_condition", ((Object) (jsonarray)));
	//   33   80:aload_1         
	//   34   81:ldc1            #54  <String "trigger_condition">
	//   35   83:aload_2         
	//   36   84:invokevirtual   #142 <Method JSONObject JSONObject.put(String, Object)>
	//   37   87:pop             
			jsonobject.put("prefetch", e);
	//   38   88:aload_1         
	//   39   89:ldc1            #77  <String "prefetch">
	//   40   91:aload_0         
	//   41   92:getfield        #83  <Field boolean e>
	//   42   95:invokevirtual   #150 <Method JSONObject JSONObject.put(String, boolean)>
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
		return ((Object) (e()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method JSONObject e()>
	//    2    4:areturn         
	}

	boolean i()
	{
		return j() && k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #155 <Method boolean j()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #158 <Method boolean k()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	boolean j()
	{
		return c.a() == -1L || dl.a() > c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ev c>
	//    2    4:invokeinterface #161 <Method long ev.a()>
	//    3    9:ldc2w           #162 <Long -1L>
	//    4   12:lcmp            
	//    5   13:ifeq            37
	//    6   16:invokestatic    #166 <Method long dl.a()>
	//    7   19:aload_0         
	//    8   20:getfield        #52  <Field ev c>
	//    9   23:invokeinterface #161 <Method long ev.a()>
	//   10   28:lcmp            
	//   11   29:ifle            35
	//   12   32:goto            37
	//   13   35:iconst_0        
	//   14   36:ireturn         
	//   15   37:iconst_1        
	//   16   38:ireturn         
	}

	boolean k()
	{
		return c.b() == -1L || dl.a() < c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ev c>
	//    2    4:invokeinterface #168 <Method long ev.b()>
	//    3    9:ldc2w           #162 <Long -1L>
	//    4   12:lcmp            
	//    5   13:ifeq            37
	//    6   16:invokestatic    #166 <Method long dl.a()>
	//    7   19:aload_0         
	//    8   20:getfield        #52  <Field ev c>
	//    9   23:invokeinterface #168 <Method long ev.b()>
	//   10   28:lcmp            
	//   11   29:ifge            35
	//   12   32:goto            37
	//   13   35:iconst_0        
	//   14   36:ireturn         
	//   15   37:iconst_1        
	//   16   38:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ee);
	private final String b;
	private final ev c;
	private final List d = new ArrayList();
	private boolean e;

	static 
	{
	//    0    0:ldc1            #2   <Class ee>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String a>
	//*   3    8:return          
	}
}
