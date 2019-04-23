// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.List;
import org.json.*;

// Referenced classes of package bo.app:
//			ci, v, aa, bs

public class cv extends ci
{

	public cv(String s, List list, long l, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(s);
	//    4    9:aload           6
	//    5   11:aload_1         
	//    6   12:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("data");
	//    8   16:aload           6
	//    9   18:ldc1            #36  <String "data">
	//   10   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		super(Uri.parse(stringbuilder.toString()), ((java.util.Map) (null)));
	//   12   24:aload_0         
	//   13   25:aload           6
	//   14   27:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   15   30:invokestatic    #46  <Method Uri Uri.parse(String)>
	//   16   33:aconst_null     
	//   17   34:invokespecial   #49  <Method void ci(Uri, java.util.Map)>
		c = l;
	//   18   37:aload_0         
	//   19   38:lload_3         
	//   20   39:putfield        #51  <Field long c>
		d = list;
	//   21   42:aload_0         
	//   22   43:aload_2         
	//   23   44:putfield        #53  <Field List d>
		e = s1;
	//   24   47:aload_0         
	//   25   48:aload           5
	//   26   50:putfield        #55  <Field String e>
	//   27   53:return          
	}

	public void a(aa aa, bs bs)
	{
	//    0    0:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method JSONObject ci.g()>
	//    2    4:astore_1        
		if(jsonobject == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			JSONObject jsonobject1 = new JSONObject();
	//    7   11:new             #68  <Class JSONObject>
	//    8   14:dup             
	//    9   15:invokespecial   #69  <Method void JSONObject()>
	//   10   18:astore_2        
			jsonobject1.put("time", c);
	//   11   19:aload_2         
	//   12   20:ldc1            #71  <String "time">
	//   13   22:aload_0         
	//   14   23:getfield        #51  <Field long c>
	//   15   26:invokevirtual   #75  <Method JSONObject JSONObject.put(String, long)>
	//   16   29:pop             
			if(!StringUtils.isNullOrBlank(e))
	//*  17   30:aload_0         
	//*  18   31:getfield        #55  <Field String e>
	//*  19   34:invokestatic    #81  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  20   37:ifne            51
				jsonobject1.put("user_id", ((Object) (e)));
	//   21   40:aload_2         
	//   22   41:ldc1            #83  <String "user_id">
	//   23   43:aload_0         
	//   24   44:getfield        #55  <Field String e>
	//   25   47:invokevirtual   #86  <Method JSONObject JSONObject.put(String, Object)>
	//   26   50:pop             
			if(!d.isEmpty())
	//*  27   51:aload_0         
	//*  28   52:getfield        #53  <Field List d>
	//*  29   55:invokeinterface #92  <Method boolean List.isEmpty()>
	//*  30   60:ifne            81
				jsonobject1.put("device_logs", ((Object) (new JSONArray(((java.util.Collection) (d))))));
	//   31   63:aload_2         
	//   32   64:ldc1            #94  <String "device_logs">
	//   33   66:new             #96  <Class JSONArray>
	//   34   69:dup             
	//   35   70:aload_0         
	//   36   71:getfield        #53  <Field List d>
	//   37   74:invokespecial   #99  <Method void JSONArray(java.util.Collection)>
	//   38   77:invokevirtual   #86  <Method JSONObject JSONObject.put(String, Object)>
	//   39   80:pop             
			JSONArray jsonarray = new JSONArray();
	//   40   81:new             #96  <Class JSONArray>
	//   41   84:dup             
	//   42   85:invokespecial   #100 <Method void JSONArray()>
	//   43   88:astore_3        
			jsonarray.put(((Object) (jsonobject1)));
	//   44   89:aload_3         
	//   45   90:aload_2         
	//   46   91:invokevirtual   #103 <Method JSONArray JSONArray.put(Object)>
	//   47   94:pop             
			jsonobject.put("test_user_data", ((Object) (jsonarray)));
	//   48   95:aload_1         
	//   49   96:ldc1            #105 <String "test_user_data">
	//   50   98:aload_3         
	//   51   99:invokevirtual   #86  <Method JSONObject JSONObject.put(String, Object)>
	//   52  102:pop             
		}
	//*  53  103:aload_1         
	//*  54  104:areturn         
		catch(JSONException jsonexception)
	//*  55  105:astore_1        
		{
			AppboyLogger.e(b, "Experienced JSONException while retrieving parameters. Returning null.", ((Throwable) (jsonexception)));
	//   56  106:getstatic       #22  <Field String b>
	//   57  109:ldc1            #107 <String "Experienced JSONException while retrieving parameters. Returning null.">
	//   58  111:aload_1         
	//   59  112:invokestatic    #110 <Method int AppboyLogger.e(String, String, Throwable)>
	//   60  115:pop             
			return null;
	//   61  116:aconst_null     
	//   62  117:areturn         
		}
		return jsonobject;
	}

	public boolean h()
	{
		return d.isEmpty() && super.h();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field List d>
	//    2    4:invokeinterface #92  <Method boolean List.isEmpty()>
	//    3    9:ifeq            21
	//    4   12:aload_0         
	//    5   13:invokespecial   #113 <Method boolean ci.h()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public v i()
	{
		return v.b;
	//    0    0:getstatic       #120 <Field v v.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cv);
	private final long c;
	private final List d;
	private final String e;

	static 
	{
	//    0    0:ldc1            #2   <Class cv>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String b>
	//*   3    8:return          
	}
}
