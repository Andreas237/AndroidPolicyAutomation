// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			bw

public class ch
	implements bw, IPutIntoJson
{

	public ch(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = jsonobject;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field JSONObject a>
	//    5    9:aload_0         
	//    6   10:new             #22  <Class JSONArray>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void JSONArray()>
	//    9   17:putfield        #25  <Field JSONArray b>
		b.put(((Object) (a)));
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JSONArray b>
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field JSONObject a>
	//   14   28:invokevirtual   #29  <Method JSONArray JSONArray.put(Object)>
	//   15   31:pop             
	//   16   32:return          
	}

	public JSONObject a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field JSONObject a>
	//    2    4:areturn         
	}

	public boolean b()
	{
		JSONObject jsonobject = a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field JSONObject a>
	//    2    4:astore_1        
		if(jsonobject != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          45
		{
			if(jsonobject.length() == 0)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #38  <Method int JSONObject.length()>
	//*   7   13:ifne            18
				return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
			return a.length() == 1 && a.has("user_id");
	//   10   18:aload_0         
	//   11   19:getfield        #20  <Field JSONObject a>
	//   12   22:invokevirtual   #38  <Method int JSONObject.length()>
	//   13   25:iconst_1        
	//   14   26:icmpne          43
	//   15   29:aload_0         
	//   16   30:getfield        #20  <Field JSONObject a>
	//   17   33:ldc1            #40  <String "user_id">
	//   18   35:invokevirtual   #44  <Method boolean JSONObject.has(String)>
	//   19   38:ifeq            43
	//   20   41:iconst_1        
	//   21   42:ireturn         
	//   22   43:iconst_0        
	//   23   44:ireturn         
		} else
		{
			return true;
	//   24   45:iconst_1        
	//   25   46:ireturn         
		}
	}

	public JSONArray c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JSONArray b>
	//    2    4:areturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (c()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method JSONArray c()>
	//    2    4:areturn         
	}

	private final JSONObject a;
	private final JSONArray b = new JSONArray();
}
