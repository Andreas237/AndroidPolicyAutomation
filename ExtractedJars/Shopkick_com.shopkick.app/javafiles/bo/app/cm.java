// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ci, cc, bu, v, 
//			bv, aa, bs

public final class cm extends ci
{

	public cm(String s, bv bv)
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
		stringbuilder.append("geofence/request");
	//    8   14:aload_3         
	//    9   15:ldc1            #31  <String "geofence/request">
	//   10   17:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(Uri.parse(stringbuilder.toString()), ((java.util.Map) (null)));
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   15   26:invokestatic    #41  <Method Uri Uri.parse(String)>
	//   16   29:aconst_null     
	//   17   30:invokespecial   #44  <Method void ci(Uri, java.util.Map)>
		c = ((bu) (cc.a(bv)));
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:invokestatic    #50  <Method cc cc.a(bv)>
	//   21   38:putfield        #52  <Field bu c>
	//   22   41:return          
	}

	public void a(aa aa, bs bs)
	{
		AppboyLogger.d(b, "GeofenceRefreshRequest executed successfully.");
	//    0    0:getstatic       #18  <Field String b>
	//    1    3:ldc1            #55  <String "GeofenceRefreshRequest executed successfully.">
	//    2    5:invokestatic    #59  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method JSONObject ci.g()>
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
	//*   8   12:getfield        #52  <Field bu c>
	//*   9   15:ifnull          34
				jsonobject.put("location_event", c.forJsonPut());
	//   10   18:aload_1         
	//   11   19:ldc1            #67  <String "location_event">
	//   12   21:aload_0         
	//   13   22:getfield        #52  <Field bu c>
	//   14   25:invokeinterface #73  <Method Object bu.forJsonPut()>
	//   15   30:invokevirtual   #79  <Method JSONObject JSONObject.put(String, Object)>
	//   16   33:pop             
		}
	//*  17   34:aload_1         
	//*  18   35:areturn         
		catch(JSONException jsonexception)
	//*  19   36:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while creating geofence refresh request. Returning null.", ((Throwable) (jsonexception)));
	//   20   37:getstatic       #18  <Field String b>
	//   21   40:ldc1            #81  <String "Experienced JSONException while creating geofence refresh request. Returning null.">
	//   22   42:aload_1         
	//   23   43:invokestatic    #85  <Method int AppboyLogger.w(String, String, Throwable)>
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

	public v i()
	{
		return v.b;
	//    0    0:getstatic       #94  <Field v v.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cm);
	private final bu c;

	static 
	{
	//    0    0:ldc1            #2   <Class cm>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String b>
	//*   3    8:return          
	}
}
