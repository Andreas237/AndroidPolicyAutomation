// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ey, fq, fr

public final class ev
	implements ey
{

	public ev(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = jsonobject.getJSONObject("data").getString("event_name");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #15  <String "data">
	//    5    8:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//    6   11:ldc1            #23  <String "event_name">
	//    7   13:invokevirtual   #27  <Method String JSONObject.getString(String)>
	//    8   16:putfield        #29  <Field String a>
	//    9   19:return          
	}

	public JSONObject a()
	{
		JSONException jsonexception;
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #17  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void JSONObject()>
	//    3    7:astore_1        
			jsonobject.put("type", "custom_event");
	//    4    8:aload_1         
	//    5    9:ldc1            #36  <String "type">
	//    6   11:ldc1            #38  <String "custom_event">
	//    7   13:invokevirtual   #42  <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
			JSONObject jsonobject1 = new JSONObject();
	//    9   17:new             #17  <Class JSONObject>
	//   10   20:dup             
	//   11   21:invokespecial   #34  <Method void JSONObject()>
	//   12   24:astore_2        
			jsonobject1.put("event_name", ((Object) (a)));
	//   13   25:aload_2         
	//   14   26:ldc1            #23  <String "event_name">
	//   15   28:aload_0         
	//   16   29:getfield        #29  <Field String a>
	//   17   32:invokevirtual   #42  <Method JSONObject JSONObject.put(String, Object)>
	//   18   35:pop             
			jsonobject.put("data", ((Object) (jsonobject1)));
	//   19   36:aload_1         
	//   20   37:ldc1            #15  <String "data">
	//   21   39:aload_2         
	//   22   40:invokevirtual   #42  <Method JSONObject JSONObject.put(String, Object)>
	//   23   43:pop             
		}
	//*  24   44:aload_1         
	//*  25   45:areturn         
	//*  26   46:aconst_null     
	//*  27   47:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  28   48:astore_1        
	//*  29   49:goto            46
	}

	public boolean a(fr fr)
	{
		if(fr instanceof fq)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #45  <Class fq>
	//*   2    4:ifeq            38
		{
			fr = ((fr) ((fq)fr));
	//    3    7:aload_1         
	//    4    8:checkcast       #45  <Class fq>
	//    5   11:astore_1        
			if(!StringUtils.isNullOrBlank(((fq) (fr)).a()) && ((fq) (fr)).a().equals(((Object) (a))))
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #48  <Method String fq.a()>
	//*   8   16:invokestatic    #54  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   9   19:ifne            38
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #48  <Method String fq.a()>
	//*  12   26:aload_0         
	//*  13   27:getfield        #29  <Field String a>
	//*  14   30:invokevirtual   #60  <Method boolean String.equals(Object)>
	//*  15   33:ifeq            38
				return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		}
		return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method JSONObject a()>
	//    2    4:areturn         
	}

	private String a;
}
