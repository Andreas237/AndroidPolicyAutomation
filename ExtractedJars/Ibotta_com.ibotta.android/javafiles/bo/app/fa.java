// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ey, fu, fr

public final class fa
	implements ey
{

	public fa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
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
	//    2    4:invokespecial   #18  <Method void JSONObject()>
	//    3    7:astore_1        
			jsonobject.put("type", "open");
	//    4    8:aload_1         
	//    5    9:ldc1            #20  <String "type">
	//    6   11:ldc1            #22  <String "open">
	//    7   13:invokevirtual   #26  <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		}
	//*   9   17:aload_1         
	//*  10   18:areturn         
	//*  11   19:aconst_null     
	//*  12   20:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  13   21:astore_1        
	//*  14   22:goto            19
	}

	public boolean a(fr fr)
	{
		return fr instanceof fu;
	//    0    0:aload_1         
	//    1    1:instanceof      #29  <Class fu>
	//    2    4:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method JSONObject a()>
	//    2    4:areturn         
	}
}
