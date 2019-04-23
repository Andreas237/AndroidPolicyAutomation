// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ev, ew, eu

public class ex
	implements ev
{

	public ex(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = jsonobject.optLong("start_time", -1L);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #23  <String "start_time">
	//    5    8:ldc2w           #24  <Long -1L>
	//    6   11:invokevirtual   #31  <Method long JSONObject.optLong(String, long)>
	//    7   14:putfield        #33  <Field long a>
		b = jsonobject.optLong("end_time", -1L);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:ldc1            #35  <String "end_time">
	//   11   21:ldc2w           #24  <Long -1L>
	//   12   24:invokevirtual   #31  <Method long JSONObject.optLong(String, long)>
	//   13   27:putfield        #37  <Field long b>
		c = jsonobject.optInt("priority", 0);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:ldc1            #39  <String "priority">
	//   17   34:iconst_0        
	//   18   35:invokevirtual   #43  <Method int JSONObject.optInt(String, int)>
	//   19   38:putfield        #45  <Field int c>
		g = jsonobject.optInt("min_seconds_since_last_trigger", -1);
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:ldc1            #47  <String "min_seconds_since_last_trigger">
	//   23   45:iconst_m1       
	//   24   46:invokevirtual   #43  <Method int JSONObject.optInt(String, int)>
	//   25   49:putfield        #49  <Field int g>
		d = jsonobject.optInt("delay", 0);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:ldc1            #51  <String "delay">
	//   29   56:iconst_0        
	//   30   57:invokevirtual   #43  <Method int JSONObject.optInt(String, int)>
	//   31   60:putfield        #53  <Field int d>
		e = jsonobject.optInt("timeout", -1);
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:ldc1            #55  <String "timeout">
	//   35   67:iconst_m1       
	//   36   68:invokevirtual   #43  <Method int JSONObject.optInt(String, int)>
	//   37   71:putfield        #57  <Field int e>
		f = ((eu) (new ew(jsonobject)));
	//   38   74:aload_0         
	//   39   75:new             #59  <Class ew>
	//   40   78:dup             
	//   41   79:aload_1         
	//   42   80:invokespecial   #61  <Method void ew(JSONObject)>
	//   43   83:putfield        #63  <Field eu f>
	//   44   86:return          
	}

	public long a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long a>
	//    2    4:lreturn         
	}

	public long b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long b>
	//    2    4:lreturn         
	}

	public int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int c>
	//    2    4:ireturn         
	}

	public int d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int d>
	//    2    4:ireturn         
	}

	public int e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int e>
	//    2    4:ireturn         
	}

	public eu f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field eu f>
	//    2    4:areturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (h()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method JSONObject h()>
	//    2    4:areturn         
	}

	public int g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int g>
	//    2    4:ireturn         
	}

	public JSONObject h()
	{
		JSONException jsonexception;
		JSONObject jsonobject;
		try
		{
			jsonobject = (JSONObject)f.forJsonPut();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field eu f>
	//    2    4:invokeinterface #79  <Method Object eu.forJsonPut()>
	//    3    9:checkcast       #27  <Class JSONObject>
	//    4   12:astore_1        
			jsonobject.put("start_time", a);
	//    5   13:aload_1         
	//    6   14:ldc1            #23  <String "start_time">
	//    7   16:aload_0         
	//    8   17:getfield        #33  <Field long a>
	//    9   20:invokevirtual   #83  <Method JSONObject JSONObject.put(String, long)>
	//   10   23:pop             
			jsonobject.put("end_time", b);
	//   11   24:aload_1         
	//   12   25:ldc1            #35  <String "end_time">
	//   13   27:aload_0         
	//   14   28:getfield        #37  <Field long b>
	//   15   31:invokevirtual   #83  <Method JSONObject JSONObject.put(String, long)>
	//   16   34:pop             
			jsonobject.put("priority", c);
	//   17   35:aload_1         
	//   18   36:ldc1            #39  <String "priority">
	//   19   38:aload_0         
	//   20   39:getfield        #45  <Field int c>
	//   21   42:invokevirtual   #86  <Method JSONObject JSONObject.put(String, int)>
	//   22   45:pop             
			jsonobject.put("min_seconds_since_last_trigger", g);
	//   23   46:aload_1         
	//   24   47:ldc1            #47  <String "min_seconds_since_last_trigger">
	//   25   49:aload_0         
	//   26   50:getfield        #49  <Field int g>
	//   27   53:invokevirtual   #86  <Method JSONObject JSONObject.put(String, int)>
	//   28   56:pop             
			jsonobject.put("timeout", e);
	//   29   57:aload_1         
	//   30   58:ldc1            #55  <String "timeout">
	//   31   60:aload_0         
	//   32   61:getfield        #57  <Field int e>
	//   33   64:invokevirtual   #86  <Method JSONObject JSONObject.put(String, int)>
	//   34   67:pop             
			jsonobject.put("delay", d);
	//   35   68:aload_1         
	//   36   69:ldc1            #51  <String "delay">
	//   37   71:aload_0         
	//   38   72:getfield        #53  <Field int d>
	//   39   75:invokevirtual   #86  <Method JSONObject JSONObject.put(String, int)>
	//   40   78:pop             
		}
	//*  41   79:aload_1         
	//*  42   80:areturn         
	//*  43   81:aconst_null     
	//*  44   82:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  45   83:astore_1        
	//*  46   84:goto            81
	}

	private final long a;
	private final long b;
	private final int c;
	private final int d;
	private final int e;
	private final eu f;
	private final int g;
}
