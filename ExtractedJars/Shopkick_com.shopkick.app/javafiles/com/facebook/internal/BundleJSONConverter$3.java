// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			BundleJSONConverter

static final class BundleJSONConverter$3
	implements tter
{

	public void setOnBundle(Bundle bundle, String s, Object obj)
		throws JSONException
	{
		bundle.putLong(s, ((Long)obj).longValue());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:checkcast       #19  <Class Long>
	//    4    6:invokevirtual   #23  <Method long Long.longValue()>
	//    5    9:invokevirtual   #29  <Method void Bundle.putLong(String, long)>
	//    6   12:return          
	}

	public void setOnJSON(JSONObject jsonobject, String s, Object obj)
		throws JSONException
	{
		jsonobject.put(s, obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #38  <Method JSONObject JSONObject.put(String, Object)>
	//    4    6:pop             
	//    5    7:return          
	}

	BundleJSONConverter$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
