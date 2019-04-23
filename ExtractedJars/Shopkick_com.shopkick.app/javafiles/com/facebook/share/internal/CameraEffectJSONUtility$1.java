// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			CameraEffectJSONUtility

static final class CameraEffectJSONUtility$1
	implements tter
{

	public void setOnArgumentsBuilder(com.facebook.share.model.der der, String s, Object obj)
		throws JSONException
	{
		der.putArgument(s, (String)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:checkcast       #19  <Class String>
	//    4    6:invokevirtual   #25  <Method com.facebook.share.model.CameraEffectArguments$Builder com.facebook.share.model.CameraEffectArguments$Builder.putArgument(String, String)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setOnJSON(JSONObject jsonobject, String s, Object obj)
		throws JSONException
	{
		jsonobject.put(s, obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #34  <Method JSONObject JSONObject.put(String, Object)>
	//    4    6:pop             
	//    5    7:return          
	}

	CameraEffectJSONUtility$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
