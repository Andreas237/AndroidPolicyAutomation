// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			fk

public class fm
	implements fk
{

	public fm(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = jsonobject.optInt("re_eligibility", -1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #15  <String "re_eligibility">
	//    5    8:iconst_m1       
	//    6    9:invokevirtual   #21  <Method int JSONObject.optInt(String, int)>
	//    7   12:putfield        #23  <Field int a>
	//    8   15:return          
	}

	public boolean a()
	{
		return a == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int a>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean b()
	{
		return a == -1;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int a>
	//    2    4:iconst_m1       
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Integer c()
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int a>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            14
			return Integer.valueOf(i);
	//    5    9:iload_1         
	//    6   10:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public JSONObject d()
	{
		JSONException jsonexception;
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #17  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void JSONObject()>
	//    3    7:astore_1        
			jsonobject.put("re_eligibility", a);
	//    4    8:aload_1         
	//    5    9:ldc1            #15  <String "re_eligibility">
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field int a>
	//    8   15:invokevirtual   #43  <Method JSONObject JSONObject.put(String, int)>
	//    9   18:pop             
		}
	//*  10   19:aload_1         
	//*  11   20:areturn         
	//*  12   21:aconst_null     
	//*  13   22:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  14   23:astore_1        
	//*  15   24:goto            21
	}

	public Object forJsonPut()
	{
		return ((Object) (d()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method JSONObject d()>
	//    2    4:areturn         
	}

	private final int a;
}
