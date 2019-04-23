// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ca, dl

public class by
	implements IPutIntoJson
{

	public by(ca ca1, double d1)
	{
		this(ca1, d1, ((Double) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:invokespecial   #33  <Method void by(ca, double, Double, boolean)>
	//    6    8:return          
	}

	public by(ca ca1, double d1, Double double1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		e = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field boolean e>
		b = ca1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field ca b>
		c = d1;
	//    8   14:aload_0         
	//    9   15:dload_2         
	//   10   16:putfield        #41  <Field double c>
		e = flag;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #37  <Field boolean e>
		d = double1;
	//   14   25:aload_0         
	//   15   26:aload           4
	//   16   28:putfield        #43  <Field Double d>
	//   17   31:return          
	}

	public by(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		e = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field boolean e>
		b = ca.a(jsonobject.getString("session_id"));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #47  <String "session_id">
	//    8   13:invokevirtual   #53  <Method String JSONObject.getString(String)>
	//    9   16:invokestatic    #58  <Method ca ca.a(String)>
	//   10   19:putfield        #39  <Field ca b>
		c = jsonobject.getDouble("start_time");
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:ldc1            #60  <String "start_time">
	//   14   26:invokevirtual   #64  <Method double JSONObject.getDouble(String)>
	//   15   29:putfield        #41  <Field double c>
		e = jsonobject.getBoolean("is_sealed");
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:ldc1            #66  <String "is_sealed">
	//   19   36:invokevirtual   #70  <Method boolean JSONObject.getBoolean(String)>
	//   20   39:putfield        #37  <Field boolean e>
		if(jsonobject.has("end_time"))
	//*  21   42:aload_1         
	//*  22   43:ldc1            #72  <String "end_time">
	//*  23   45:invokevirtual   #75  <Method boolean JSONObject.has(String)>
	//*  24   48:ifeq            64
			d = Double.valueOf(jsonobject.getDouble("end_time"));
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:ldc1            #72  <String "end_time">
	//   28   55:invokevirtual   #64  <Method double JSONObject.getDouble(String)>
	//   29   58:invokestatic    #81  <Method Double Double.valueOf(double)>
	//   30   61:putfield        #43  <Field Double d>
	//   31   64:return          
	}

	public ca a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ca b>
	//    2    4:areturn         
	}

	public void a(Double double1)
	{
		d = double1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field Double d>
	//    3    5:return          
	}

	public double b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field double c>
	//    2    4:dreturn         
	}

	public Double c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Double d>
	//    2    4:areturn         
	}

	public boolean d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean e>
	//    2    4:ireturn         
	}

	public void e()
	{
		e = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #37  <Field boolean e>
		a(Double.valueOf(dl.b()));
	//    3    5:aload_0         
	//    4    6:invokestatic    #91  <Method double dl.b()>
	//    5    9:invokestatic    #81  <Method Double Double.valueOf(double)>
	//    6   12:invokevirtual   #93  <Method void a(Double)>
	//    7   15:return          
	}

	public long f()
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Double d>
	//*   2    4:ifnonnull       11
			return -1L;
	//    3    7:ldc2w           #96  <Long -1L>
	//    4   10:lreturn         
		long l = (long)(d.doubleValue() - c);
	//    5   11:aload_0         
	//    6   12:getfield        #43  <Field Double d>
	//    7   15:invokevirtual   #100 <Method double Double.doubleValue()>
	//    8   18:aload_0         
	//    9   19:getfield        #41  <Field double c>
	//   10   22:dsub            
	//   11   23:d2l             
	//   12   24:lstore_1        
		if(l < 0L)
	//*  13   25:lload_1         
	//*  14   26:lconst_0        
	//*  15   27:lcmp            
	//*  16   28:ifge            98
		{
			String s = a;
	//   17   31:getstatic       #27  <Field String a>
	//   18   34:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   19   35:new             #102 <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #103 <Method void StringBuilder()>
	//   22   42:astore          4
			stringbuilder.append("End time '");
	//   23   44:aload           4
	//   24   46:ldc1            #105 <String "End time '">
	//   25   48:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
			stringbuilder.append(((Object) (d)));
	//   27   52:aload           4
	//   28   54:aload_0         
	//   29   55:getfield        #43  <Field Double d>
	//   30   58:invokevirtual   #112 <Method StringBuilder StringBuilder.append(Object)>
	//   31   61:pop             
			stringbuilder.append("' for session is less than the start time '");
	//   32   62:aload           4
	//   33   64:ldc1            #114 <String "' for session is less than the start time '">
	//   34   66:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
			stringbuilder.append(c);
	//   36   70:aload           4
	//   37   72:aload_0         
	//   38   73:getfield        #41  <Field double c>
	//   39   76:invokevirtual   #117 <Method StringBuilder StringBuilder.append(double)>
	//   40   79:pop             
			stringbuilder.append("' for this session.");
	//   41   80:aload           4
	//   42   82:ldc1            #119 <String "' for this session.">
	//   43   84:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   45   88:aload_3         
	//   46   89:aload           4
	//   47   91:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   48   94:invokestatic    #127 <Method int AppboyLogger.w(String, String)>
	//   49   97:pop             
		}
		return l;
	//   50   98:lload_1         
	//   51   99:lreturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (g()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method JSONObject g()>
	//    2    4:areturn         
	}

	public JSONObject g()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #49  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #136 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("session_id", ((Object) (b)));
	//    4    8:aload_1         
	//    5    9:ldc1            #47  <String "session_id">
	//    6   11:aload_0         
	//    7   12:getfield        #39  <Field ca b>
	//    8   15:invokevirtual   #140 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		jsonobject.put("start_time", c);
	//   10   19:aload_1         
	//   11   20:ldc1            #60  <String "start_time">
	//   12   22:aload_0         
	//   13   23:getfield        #41  <Field double c>
	//   14   26:invokevirtual   #143 <Method JSONObject JSONObject.put(String, double)>
	//   15   29:pop             
		jsonobject.put("is_sealed", e);
	//   16   30:aload_1         
	//   17   31:ldc1            #66  <String "is_sealed">
	//   18   33:aload_0         
	//   19   34:getfield        #37  <Field boolean e>
	//   20   37:invokevirtual   #146 <Method JSONObject JSONObject.put(String, boolean)>
	//   21   40:pop             
		if(d == null)
			break MISSING_BLOCK_LABEL_72;
	//   22   41:aload_0         
	//   23   42:getfield        #43  <Field Double d>
	//   24   45:ifnull          72
		jsonobject.put("end_time", ((Object) (d)));
	//   25   48:aload_1         
	//   26   49:ldc1            #72  <String "end_time">
	//   27   51:aload_0         
	//   28   52:getfield        #43  <Field Double d>
	//   29   55:invokevirtual   #140 <Method JSONObject JSONObject.put(String, Object)>
	//   30   58:pop             
		return jsonobject;
	//   31   59:aload_1         
	//   32   60:areturn         
		JSONException jsonexception;
		jsonexception;
	//   33   61:astore_2        
		AppboyLogger.e(a, "Caught exception creating Session Json.", ((Throwable) (jsonexception)));
	//   34   62:getstatic       #27  <Field String a>
	//   35   65:ldc1            #148 <String "Caught exception creating Session Json.">
	//   36   67:aload_2         
	//   37   68:invokestatic    #151 <Method int AppboyLogger.e(String, String, Throwable)>
	//   38   71:pop             
		return jsonobject;
	//   39   72:aload_1         
	//   40   73:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/by);
	private final ca b;
	private final double c;
	private volatile Double d;
	private volatile boolean e;

	static 
	{
	//    0    0:ldc1            #2   <Class by>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String a>
	//*   3    8:return          
	}
}
