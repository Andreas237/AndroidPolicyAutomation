// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ey, fv, fr

public final class fc
	implements ey
{

	fc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public fc(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		jsonobject = jsonobject.optJSONObject("data");
	//    2    4:aload_1         
	//    3    5:ldc1            #16  <String "data">
	//    4    7:invokevirtual   #22  <Method JSONObject JSONObject.optJSONObject(String)>
	//    5   10:astore_1        
		if(jsonobject != null && !jsonobject.isNull("product_id"))
	//*   6   11:aload_1         
	//*   7   12:ifnull          35
	//*   8   15:aload_1         
	//*   9   16:ldc1            #24  <String "product_id">
	//*  10   18:invokevirtual   #28  <Method boolean JSONObject.isNull(String)>
	//*  11   21:ifne            35
			a = jsonobject.optString("product_id", ((String) (null)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #24  <String "product_id">
	//   15   28:aconst_null     
	//   16   29:invokevirtual   #32  <Method String JSONObject.optString(String, String)>
	//   17   32:putfield        #34  <Field String a>
	//   18   35:return          
	}

	public JSONObject a()
	{
		JSONException jsonexception;
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #18  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void JSONObject()>
	//    3    7:astore_1        
			jsonobject.put("type", "purchase");
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "type">
	//    6   11:ldc1            #42  <String "purchase">
	//    7   13:invokevirtual   #46  <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
			if(a != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #34  <Field String a>
	//*  11   21:ifnull          51
			{
				JSONObject jsonobject1 = new JSONObject();
	//   12   24:new             #18  <Class JSONObject>
	//   13   27:dup             
	//   14   28:invokespecial   #38  <Method void JSONObject()>
	//   15   31:astore_2        
				jsonobject1.putOpt("product_id", ((Object) (a)));
	//   16   32:aload_2         
	//   17   33:ldc1            #24  <String "product_id">
	//   18   35:aload_0         
	//   19   36:getfield        #34  <Field String a>
	//   20   39:invokevirtual   #49  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   21   42:pop             
				jsonobject.putOpt("data", ((Object) (jsonobject1)));
	//   22   43:aload_1         
	//   23   44:ldc1            #16  <String "data">
	//   24   46:aload_2         
	//   25   47:invokevirtual   #49  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   26   50:pop             
			}
		}
	//*  27   51:aload_1         
	//*  28   52:areturn         
	//*  29   53:aconst_null     
	//*  30   54:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  31   55:astore_1        
	//*  32   56:goto            53
	}

	public boolean a(fr fr)
	{
		if(fr instanceof fv)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #52  <Class fv>
	//*   2    4:ifeq            50
		{
			if(StringUtils.isNullOrBlank(a))
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field String a>
	//*   5   11:invokestatic    #57  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   6   14:ifeq            19
				return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
			fr = ((fr) ((fv)fr));
	//    9   19:aload_1         
	//   10   20:checkcast       #52  <Class fv>
	//   11   23:astore_1        
			if(!StringUtils.isNullOrBlank(((fv) (fr)).a()) && ((fv) (fr)).a().equals(((Object) (a))))
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #60  <Method String fv.a()>
	//*  14   28:invokestatic    #57  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  15   31:ifne            50
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #60  <Method String fv.a()>
	//*  18   38:aload_0         
	//*  19   39:getfield        #34  <Field String a>
	//*  20   42:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  21   45:ifeq            50
				return true;
	//   22   48:iconst_1        
	//   23   49:ireturn         
		}
		return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method JSONObject a()>
	//    2    4:areturn         
	}

	String a;
}
