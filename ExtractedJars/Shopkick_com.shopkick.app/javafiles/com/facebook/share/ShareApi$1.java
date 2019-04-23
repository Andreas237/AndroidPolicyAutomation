// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.FacebookCallback;
import com.facebook.GraphResponse;
import com.facebook.share.internal.ShareInternalUtility;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$1
	implements com.facebook.t.Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getJSONObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       14
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		else
	//*   7   11:goto            21
			obj = ((Object) (((JSONObject) (obj)).optString("id")));
	//    8   14:aload_2         
	//    9   15:ldc1            #35  <String "id">
	//   10   17:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   11   20:astore_2        
		ShareInternalUtility.invokeCallbackWithResults(val$callback, ((String) (obj)), graphresponse);
	//   12   21:aload_0         
	//   13   22:getfield        #21  <Field FacebookCallback val$callback>
	//   14   25:aload_2         
	//   15   26:aload_1         
	//   16   27:invokestatic    #47  <Method void ShareInternalUtility.invokeCallbackWithResults(FacebookCallback, String, GraphResponse)>
	//   17   30:return          
	}

	final ShareApi this$0;
	final FacebookCallback val$callback;

	ShareApi$1()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ShareApi this$0>
		val$callback = FacebookCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FacebookCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
