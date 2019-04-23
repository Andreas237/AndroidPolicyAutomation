// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ci, cg, v, aa, 
//			bs

public final class ck extends ci
{

	public ck(String s)
	{
		this(s, (new cg.a()).c());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #23  <Class cg$a>
	//    3    5:dup             
	//    4    6:invokespecial   #25  <Method void cg$a()>
	//    5    9:invokevirtual   #28  <Method cg cg$a.c()>
	//    6   12:invokespecial   #31  <Method void ck(String, cg)>
	//    7   15:return          
	}

	public ck(String s, cg cg1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("data");
	//    8   14:aload_3         
	//    9   15:ldc1            #40  <String "data">
	//   10   17:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(Uri.parse(stringbuilder.toString()), ((Map) (null)));
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   15   26:invokestatic    #50  <Method Uri Uri.parse(String)>
	//   16   29:aconst_null     
	//   17   30:invokespecial   #53  <Method void ci(Uri, Map)>
		c = cg1;
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #55  <Field cg c>
		a(cg1);
	//   21   38:aload_0         
	//   22   39:aload_2         
	//   23   40:invokevirtual   #59  <Method void a(cg)>
	//   24   43:return          
	}

	public void a(aa aa, bs bs)
	{
	//    0    0:return          
	}

	public void a(Map map)
	{
		super.a(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void ci.a(Map)>
		if(c.b())
	//*   3    5:aload_0         
	//*   4    6:getfield        #55  <Field cg c>
	//*   5    9:invokevirtual   #68  <Method boolean cg.b()>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		map.put("X-Braze-DataRequest", "true");
	//    8   16:aload_1         
	//    9   17:ldc1            #70  <String "X-Braze-DataRequest">
	//   10   19:ldc1            #72  <String "true">
	//   11   21:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   12   26:pop             
		if(c.e())
	//*  13   27:aload_0         
	//*  14   28:getfield        #55  <Field cg c>
	//*  15   31:invokevirtual   #81  <Method boolean cg.e()>
	//*  16   34:ifeq            48
			map.put("X-Braze-FeedRequest", "true");
	//   17   37:aload_1         
	//   18   38:ldc1            #83  <String "X-Braze-FeedRequest">
	//   19   40:ldc1            #72  <String "true">
	//   20   42:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   21   47:pop             
		if(c.d())
	//*  22   48:aload_0         
	//*  23   49:getfield        #55  <Field cg c>
	//*  24   52:invokevirtual   #86  <Method boolean cg.d()>
	//*  25   55:ifeq            69
			map.put("X-Braze-TriggersRequest", "true");
	//   26   58:aload_1         
	//   27   59:ldc1            #88  <String "X-Braze-TriggersRequest">
	//   28   61:ldc1            #72  <String "true">
	//   29   63:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   30   68:pop             
	//   31   69:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method JSONObject ci.g()>
	//    2    4:astore_1        
		if(jsonobject == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			if(!c.b())
	//*   7   11:aload_0         
	//*   8   12:getfield        #55  <Field cg c>
	//*   9   15:invokevirtual   #68  <Method boolean cg.b()>
	//*  10   18:ifne            35
				jsonobject.put("respond_with", ((Object) (c.a())));
	//   11   21:aload_1         
	//   12   22:ldc1            #98  <String "respond_with">
	//   13   24:aload_0         
	//   14   25:getfield        #55  <Field cg c>
	//   15   28:invokevirtual   #100 <Method JSONObject cg.a()>
	//   16   31:invokevirtual   #105 <Method JSONObject JSONObject.put(String, Object)>
	//   17   34:pop             
		}
	//*  18   35:aload_1         
	//*  19   36:areturn         
		catch(JSONException jsonexception)
	//*  20   37:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while retrieving parameters. Returning null.", ((Throwable) (jsonexception)));
	//   21   38:getstatic       #18  <Field String b>
	//   22   41:ldc1            #107 <String "Experienced JSONException while retrieving parameters. Returning null.">
	//   23   43:aload_1         
	//   24   44:invokestatic    #111 <Method int AppboyLogger.w(String, String, Throwable)>
	//   25   47:pop             
			return null;
	//   26   48:aconst_null     
	//   27   49:areturn         
		}
		return jsonobject;
	}

	public boolean h()
	{
		return c.b() && super.h();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field cg c>
	//    2    4:invokevirtual   #68  <Method boolean cg.b()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokespecial   #114 <Method boolean ci.h()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public v i()
	{
		return v.b;
	//    0    0:getstatic       #121 <Field v v.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/ck);
	private final cg c;

	static 
	{
	//    0    0:ldc1            #2   <Class ck>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String b>
	//*   3    8:return          
	}
}
