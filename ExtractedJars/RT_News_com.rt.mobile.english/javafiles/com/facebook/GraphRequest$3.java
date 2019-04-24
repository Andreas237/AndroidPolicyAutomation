// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			GraphRequest, GraphResponse

static final class GraphRequest$3
	implements llback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		if(val$callback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
	//*   2    4:ifnull          39
		{
			Object obj = ((Object) (graphresponse.getJSONObject()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #29  <Method JSONObject GraphResponse.getJSONObject()>
	//    5   11:astore_2        
			if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          26
				obj = ((Object) (((JSONObject) (obj)).optJSONArray("data")));
	//    8   16:aload_2         
	//    9   17:ldc1            #31  <String "data">
	//   10   19:invokevirtual   #37  <Method org.json.JSONArray JSONObject.optJSONArray(String)>
	//   11   22:astore_2        
			else
	//*  12   23:goto            28
				obj = null;
	//   13   26:aconst_null     
	//   14   27:astore_2        
			val$callback.onCompleted(((org.json.JSONArray) (obj)), graphresponse);
	//   15   28:aload_0         
	//   16   29:getfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
	//   17   32:aload_2         
	//   18   33:aload_1         
	//   19   34:invokeinterface #42  <Method void GraphRequest$GraphJSONArrayCallback.onCompleted(org.json.JSONArray, GraphResponse)>
		}
	//   20   39:return          
	}

	final aphJSONArrayCallback val$callback;

	GraphRequest$3(aphJSONArrayCallback aphjsonarraycallback)
	{
		val$callback = aphjsonarraycallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
