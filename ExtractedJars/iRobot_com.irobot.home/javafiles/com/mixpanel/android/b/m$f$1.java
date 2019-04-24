// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import com.mixpanel.android.a.f;
import com.mixpanel.android.mpmetrics.r;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.b:
//			m

class m$f$1
	implements r
{

	public JSONObject a(JSONObject jsonobject)
	{
		try
		{
			jsonobject.put("$experiments", ((Object) (a)));
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "$experiments">
	//    2    3:aload_0         
	//    3    4:getfield        #23  <Field JSONObject a>
	//    4    7:invokevirtual   #38  <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		}
	//*   6   11:aload_1         
	//*   7   12:areturn         
		catch(JSONException jsonexception)
	//*   8   13:astore_2        
		{
			com.mixpanel.android.a.f.f("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", ((Throwable) (jsonexception)));
	//    9   14:ldc1            #40  <String "MixpanelAPI.ViewCrawler">
	//   10   16:ldc1            #42  <String "Can't write $experiments super property">
	//   11   18:aload_2         
	//   12   19:invokestatic    #47  <Method void f.f(String, String, Throwable)>
			return jsonobject;
	//   13   22:aload_1         
	//   14   23:areturn         
		}
		return jsonobject;
	}

	final JSONObject a;
	final m.f b;

	m$f$1(m.f f1, JSONObject jsonobject)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field m$f b>
		a = jsonobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field JSONObject a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
