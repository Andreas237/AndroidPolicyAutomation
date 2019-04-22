// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class cl
	implements IPutIntoJson
{

	public cl(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		b = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #28  <Field long b>
	//    5    9:return          
	}

	public JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #33  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("config_time", b);
	//    4    8:aload_1         
	//    5    9:ldc1            #36  <String "config_time">
	//    6   11:aload_0         
	//    7   12:getfield        #28  <Field long b>
	//    8   15:invokevirtual   #40  <Method JSONObject JSONObject.put(String, long)>
	//    9   18:pop             
		}
	//*  10   19:aload_1         
	//*  11   20:areturn         
		catch(JSONException jsonexception)
	//*  12   21:astore_1        
		{
			AppboyLogger.d(a, "Caught exception creating config params json.", ((Throwable) (jsonexception)));
	//   13   22:getstatic       #21  <Field String a>
	//   14   25:ldc1            #42  <String "Caught exception creating config params json.">
	//   15   27:aload_1         
	//   16   28:invokestatic    #46  <Method int AppboyLogger.d(String, String, Throwable)>
	//   17   31:pop             
			return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
		}
		return jsonobject;
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method JSONObject a()>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cl);
	private final long b;

	static 
	{
	//    0    0:ldc1            #2   <Class cl>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String a>
	//*   3    8:return          
	}
}
