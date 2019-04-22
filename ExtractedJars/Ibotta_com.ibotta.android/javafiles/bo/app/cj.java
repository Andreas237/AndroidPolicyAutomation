// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			cd

public final class cj
	implements cd
{

	public cj(double d1, double d2, Double double1, Double double2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		if(ValidationUtils.isValidLocation(d1, d2))
	//*   2    4:dload_1         
	//*   3    5:dload_3         
	//*   4    6:invokestatic    #35  <Method boolean ValidationUtils.isValidLocation(double, double)>
	//*   5    9:ifeq            35
		{
			b = d1;
	//    6   12:aload_0         
	//    7   13:dload_1         
	//    8   14:putfield        #37  <Field double b>
			c = d2;
	//    9   17:aload_0         
	//   10   18:dload_3         
	//   11   19:putfield        #39  <Field double c>
			d = double1;
	//   12   22:aload_0         
	//   13   23:aload           5
	//   14   25:putfield        #41  <Field Double d>
			e = double2;
	//   15   28:aload_0         
	//   16   29:aload           6
	//   17   31:putfield        #43  <Field Double e>
			return;
	//   18   34:return          
		} else
		{
			throw new IllegalArgumentException("Unable to create AppboyLocation. Latitude and longitude values are bounded by \26190 and \261180 respectively");
	//   19   35:new             #45  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:ldc1            #47  <String "Unable to create AppboyLocation. Latitude and longitude values are bounded by \26190 and \261180 respectively">
	//   22   41:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   23   44:athrow          
		}
	}

	public double a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field double b>
	//    2    4:dreturn         
	}

	public double b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field double c>
	//    2    4:dreturn         
	}

	public Double c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Double d>
	//    2    4:areturn         
	}

	public Double d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Double e>
	//    2    4:areturn         
	}

	public boolean e()
	{
		return d != null;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Double d>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean f()
	{
		return e != null;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Double e>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (g()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method JSONObject g()>
	//    2    4:areturn         
	}

	public JSONObject g()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #64  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("latitude", b);
	//    4    8:aload_1         
	//    5    9:ldc1            #67  <String "latitude">
	//    6   11:aload_0         
	//    7   12:getfield        #37  <Field double b>
	//    8   15:invokevirtual   #71  <Method JSONObject JSONObject.put(String, double)>
	//    9   18:pop             
		jsonobject.put("longitude", c);
	//   10   19:aload_1         
	//   11   20:ldc1            #73  <String "longitude">
	//   12   22:aload_0         
	//   13   23:getfield        #39  <Field double c>
	//   14   26:invokevirtual   #71  <Method JSONObject JSONObject.put(String, double)>
	//   15   29:pop             
		if(e())
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #75  <Method boolean e()>
	//*  18   34:ifeq            48
			jsonobject.put("altitude", ((Object) (d)));
	//   19   37:aload_1         
	//   20   38:ldc1            #77  <String "altitude">
	//   21   40:aload_0         
	//   22   41:getfield        #41  <Field Double d>
	//   23   44:invokevirtual   #80  <Method JSONObject JSONObject.put(String, Object)>
	//   24   47:pop             
		if(!f())
			break MISSING_BLOCK_LABEL_79;
	//   25   48:aload_0         
	//   26   49:invokevirtual   #82  <Method boolean f()>
	//   27   52:ifeq            79
		jsonobject.put("ll_accuracy", ((Object) (e)));
	//   28   55:aload_1         
	//   29   56:ldc1            #84  <String "ll_accuracy">
	//   30   58:aload_0         
	//   31   59:getfield        #43  <Field Double e>
	//   32   62:invokevirtual   #80  <Method JSONObject JSONObject.put(String, Object)>
	//   33   65:pop             
		return jsonobject;
	//   34   66:aload_1         
	//   35   67:areturn         
		JSONException jsonexception;
		jsonexception;
	//   36   68:astore_2        
		AppboyLogger.e(a, "Caught exception creating location Json.", ((Throwable) (jsonexception)));
	//   37   69:getstatic       #24  <Field String a>
	//   38   72:ldc1            #86  <String "Caught exception creating location Json.">
	//   39   74:aload_2         
	//   40   75:invokestatic    #89  <Method int AppboyLogger.e(String, String, Throwable)>
	//   41   78:pop             
		return jsonobject;
	//   42   79:aload_1         
	//   43   80:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cj);
	private final double b;
	private final double c;
	private final Double d;
	private final Double e;

	static 
	{
	//    0    0:ldc1            #2   <Class cj>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String a>
	//*   3    8:return          
	}
}
