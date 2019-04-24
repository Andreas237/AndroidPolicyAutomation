// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			f, j

class f$1
	implements j$a
{

	public void a(j j1)
	{
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void JSONObject()>
	//    3    7:astore_2        
			jsonobject.put("$ae_crashed_reason", ((Object) (a.toString())));
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "$ae_crashed_reason">
	//    6   11:aload_0         
	//    7   12:getfield        #21  <Field Throwable a>
	//    8   15:invokevirtual   #39  <Method String Throwable.toString()>
	//    9   18:invokevirtual   #43  <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
			j1.a("$ae_crashed", jsonobject, true);
	//   11   22:aload_1         
	//   12   23:ldc1            #45  <String "$ae_crashed">
	//   13   25:aload_2         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #50  <Method void j.a(String, JSONObject, boolean)>
			return;
	//   16   30:return          
		}
		// Misplaced declaration of an exception variable
		catch(j j1)
	//*  17   31:astore_1        
		{
			return;
	//   18   32:return          
		}
	}

	final Throwable a;
	final f b;

	f$1(f f1, Throwable throwable)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field f b>
		a = throwable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Throwable a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
