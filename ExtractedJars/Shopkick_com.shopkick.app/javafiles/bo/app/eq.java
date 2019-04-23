// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

// Referenced classes of package bo.app:
//			ei, el, et, er, 
//			fb

public abstract class eq
	implements ei
{

	public eq(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		jsonobject = ((JSONObject) (jsonobject.getJSONObject("data").getJSONArray("property_filters")));
	//    2    4:aload_1         
	//    3    5:ldc1            #27  <String "data">
	//    4    7:invokevirtual   #33  <Method JSONObject JSONObject.getJSONObject(String)>
	//    5   10:ldc1            #35  <String "property_filters">
	//    6   12:invokevirtual   #39  <Method JSONArray JSONObject.getJSONArray(String)>
	//    7   15:astore_1        
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #41  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #42  <Method void ArrayList()>
	//   11   23:astore          4
		for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  12   25:iconst_0        
	//*  13   26:istore_2        
	//*  14   27:iload_2         
	//*  15   28:aload_1         
	//*  16   29:invokevirtual   #48  <Method int JSONArray.length()>
	//*  17   32:icmpge          114
		{
			JSONArray jsonarray = ((JSONArray) (jsonobject)).getJSONArray(i);
	//   18   35:aload_1         
	//   19   36:iload_2         
	//   20   37:invokevirtual   #51  <Method JSONArray JSONArray.getJSONArray(int)>
	//   21   40:astore          5
			ArrayList arraylist1 = new ArrayList();
	//   22   42:new             #41  <Class ArrayList>
	//   23   45:dup             
	//   24   46:invokespecial   #42  <Method void ArrayList()>
	//   25   49:astore          6
			for(int j = 0; j < jsonarray.length(); j++)
	//*  26   51:iconst_0        
	//*  27   52:istore_3        
	//*  28   53:iload_3         
	//*  29   54:aload           5
	//*  30   56:invokevirtual   #48  <Method int JSONArray.length()>
	//*  31   59:icmpge          90
				((List) (arraylist1)).add(((Object) (new el(jsonarray.getJSONObject(j)))));
	//   32   62:aload           6
	//   33   64:new             #53  <Class el>
	//   34   67:dup             
	//   35   68:aload           5
	//   36   70:iload_3         
	//   37   71:invokevirtual   #56  <Method JSONObject JSONArray.getJSONObject(int)>
	//   38   74:invokespecial   #58  <Method void el(JSONObject)>
	//   39   77:invokeinterface #64  <Method boolean List.add(Object)>
	//   40   82:pop             

	//   41   83:iload_3         
	//   42   84:iconst_1        
	//   43   85:iadd            
	//   44   86:istore_3        
	//*  45   87:goto            53
			((List) (arraylist)).add(((Object) (new et(((List) (arraylist1))))));
	//   46   90:aload           4
	//   47   92:new             #66  <Class et>
	//   48   95:dup             
	//   49   96:aload           6
	//   50   98:invokespecial   #69  <Method void et(List)>
	//   51  101:invokeinterface #64  <Method boolean List.add(Object)>
	//   52  106:pop             
		}

	//   53  107:iload_2         
	//   54  108:iconst_1        
	//   55  109:iadd            
	//   56  110:istore_2        
	//*  57  111:goto            27
		a = new er(((List) (arraylist)));
	//   58  114:aload_0         
	//   59  115:new             #71  <Class er>
	//   60  118:dup             
	//   61  119:aload           4
	//   62  121:invokespecial   #72  <Method void er(List)>
	//   63  124:putfield        #74  <Field er a>
	//   64  127:return          
	}

	public JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #29  <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #78  <Method void JSONObject()>
	//    7   15:astore_2        
			jsonobject1.put("property_filters", ((Object) (a.a())));
	//    8   16:aload_2         
	//    9   17:ldc1            #35  <String "property_filters">
	//   10   19:aload_0         
	//   11   20:getfield        #74  <Field er a>
	//   12   23:invokevirtual   #81  <Method JSONArray er.a()>
	//   13   26:invokevirtual   #85  <Method JSONObject JSONObject.put(String, Object)>
	//   14   29:pop             
			jsonobject.put("data", ((Object) (jsonobject1)));
	//   15   30:aload_1         
	//   16   31:ldc1            #27  <String "data">
	//   17   33:aload_2         
	//   18   34:invokevirtual   #85  <Method JSONObject JSONObject.put(String, Object)>
	//   19   37:pop             
		}
	//*  20   38:aload_1         
	//*  21   39:areturn         
		catch(JSONException jsonexception)
	//*  22   40:astore_2        
		{
			AppboyLogger.e(b, "Caught exception creating Json.", ((Throwable) (jsonexception)));
	//   23   41:getstatic       #20  <Field String b>
	//   24   44:ldc1            #87  <String "Caught exception creating Json.">
	//   25   46:aload_2         
	//   26   47:invokestatic    #91  <Method int AppboyLogger.e(String, String, Throwable)>
	//   27   50:pop             
			return jsonobject;
	//   28   51:aload_1         
	//   29   52:areturn         
		}
		return jsonobject;
	}

	public boolean a(fb fb)
	{
		return a.a(fb);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field er a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method boolean er.a(fb)>
	//    4    8:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method JSONObject a()>
	//    2    4:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/eq);
	er a;

	static 
	{
	//    0    0:ldc1            #2   <Class eq>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String b>
	//*   3    8:return          
	}
}
