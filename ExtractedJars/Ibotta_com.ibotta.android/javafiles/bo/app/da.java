// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			cu, cc, y, ad, 
//			cp

public final class da extends cu
{

	public da(String s, cc cc1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("geofence/report");
	//    8   14:aload_3         
	//    9   15:ldc1            #31  <String "geofence/report">
	//   10   17:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(Uri.parse(stringbuilder.toString()), ((java.util.Map) (null)));
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   15   26:invokestatic    #41  <Method Uri Uri.parse(String)>
	//   16   29:aconst_null     
	//   17   30:invokespecial   #44  <Method void cu(Uri, java.util.Map)>
		c = cc1;
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #46  <Field cc c>
	//   21   38:return          
	}

	public void a(ad ad, cp cp)
	{
		AppboyLogger.d(b, "GeofenceReportRequest executed successfully.");
	//    0    0:getstatic       #18  <Field String b>
	//    1    3:ldc1            #50  <String "GeofenceReportRequest executed successfully.">
	//    2    5:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method JSONObject cu.g()>
	//    2    4:astore_1        
		if(jsonobject == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			if(c != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #46  <Field cc c>
	//*   9   15:ifnull          34
				jsonobject.put("geofence_event", c.forJsonPut());
	//   10   18:aload_1         
	//   11   19:ldc1            #62  <String "geofence_event">
	//   12   21:aload_0         
	//   13   22:getfield        #46  <Field cc c>
	//   14   25:invokeinterface #68  <Method Object cc.forJsonPut()>
	//   15   30:invokevirtual   #74  <Method JSONObject JSONObject.put(String, Object)>
	//   16   33:pop             
		}
	//*  17   34:aload_1         
	//*  18   35:areturn         
		catch(JSONException jsonexception)
	//*  19   36:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while creating geofence report request. Returning null.", ((Throwable) (jsonexception)));
	//   20   37:getstatic       #18  <Field String b>
	//   21   40:ldc1            #76  <String "Experienced JSONException while creating geofence report request. Returning null.">
	//   22   42:aload_1         
	//   23   43:invokestatic    #80  <Method int AppboyLogger.w(String, String, Throwable)>
	//   24   46:pop             
			return null;
	//   25   47:aconst_null     
	//   26   48:areturn         
		}
		return jsonobject;
	}

	public boolean h()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public y i()
	{
		return y.b;
	//    0    0:getstatic       #89  <Field y y.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/da);
	private final cc c;

	static 
	{
	//    0    0:ldc1            #2   <Class da>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String b>
	//*   3    8:return          
	}
}
