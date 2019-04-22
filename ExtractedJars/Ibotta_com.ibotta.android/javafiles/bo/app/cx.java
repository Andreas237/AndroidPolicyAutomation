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
//			cu, cm, y, ad, 
//			cp

public final class cx extends cu
{

	public cx(String s)
	{
		this(s, (new cm.a()).c());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #23  <Class cm$a>
	//    3    5:dup             
	//    4    6:invokespecial   #25  <Method void cm$a()>
	//    5    9:invokevirtual   #28  <Method cm cm$a.c()>
	//    6   12:invokespecial   #31  <Method void cx(String, cm)>
	//    7   15:return          
	}

	public cx(String s, cm cm1)
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
	//   17   30:invokespecial   #53  <Method void cu(Uri, Map)>
		c = cm1;
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #55  <Field cm c>
		a(cm1);
	//   21   38:aload_0         
	//   22   39:aload_2         
	//   23   40:invokevirtual   #59  <Method void a(cm)>
	//   24   43:return          
	}

	public void a(ad ad, cp cp)
	{
	//    0    0:return          
	}

	public void a(Map map)
	{
		super.a(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void cu.a(Map)>
		if(c.b())
	//*   3    5:aload_0         
	//*   4    6:getfield        #55  <Field cm c>
	//*   5    9:invokevirtual   #68  <Method boolean cm.b()>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		boolean flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		if(c.e())
	//*  10   18:aload_0         
	//*  11   19:getfield        #55  <Field cm c>
	//*  12   22:invokevirtual   #71  <Method boolean cm.e()>
	//*  13   25:ifeq            41
		{
			map.put("X-Braze-FeedRequest", "true");
	//   14   28:aload_1         
	//   15   29:ldc1            #73  <String "X-Braze-FeedRequest">
	//   16   31:ldc1            #75  <String "true">
	//   17   33:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
			flag = true;
	//   19   39:iconst_1        
	//   20   40:istore_2        
		}
		if(c.d())
	//*  21   41:aload_0         
	//*  22   42:getfield        #55  <Field cm c>
	//*  23   45:invokevirtual   #84  <Method boolean cm.d()>
	//*  24   48:ifeq            64
		{
			map.put("X-Braze-TriggersRequest", "true");
	//   25   51:aload_1         
	//   26   52:ldc1            #86  <String "X-Braze-TriggersRequest">
	//   27   54:ldc1            #75  <String "true">
	//   28   56:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   29   61:pop             
			flag = true;
	//   30   62:iconst_1        
	//   31   63:istore_2        
		}
		if(flag)
	//*  32   64:iload_2         
	//*  33   65:ifeq            79
			map.put("X-Braze-DataRequest", "true");
	//   34   68:aload_1         
	//   35   69:ldc1            #88  <String "X-Braze-DataRequest">
	//   36   71:ldc1            #75  <String "true">
	//   37   73:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   38   78:pop             
	//   39   79:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method JSONObject cu.g()>
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
	//*   8   12:getfield        #55  <Field cm c>
	//*   9   15:invokevirtual   #68  <Method boolean cm.b()>
	//*  10   18:ifne            35
				jsonobject.put("respond_with", ((Object) (c.a())));
	//   11   21:aload_1         
	//   12   22:ldc1            #98  <String "respond_with">
	//   13   24:aload_0         
	//   14   25:getfield        #55  <Field cm c>
	//   15   28:invokevirtual   #100 <Method JSONObject cm.a()>
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
	//    1    1:getfield        #55  <Field cm c>
	//    2    4:invokevirtual   #68  <Method boolean cm.b()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokespecial   #114 <Method boolean cu.h()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public y i()
	{
		return y.b;
	//    0    0:getstatic       #121 <Field y y.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cx);
	private final cm c;

	static 
	{
	//    0    0:ldc1            #2   <Class cx>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String b>
	//*   3    8:return          
	}
}
