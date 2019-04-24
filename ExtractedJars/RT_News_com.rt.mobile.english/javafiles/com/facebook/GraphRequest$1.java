// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			GraphRequest, GraphResponse

static final class GraphRequest$1
	implements llback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		if(val$callback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
	//*   2    4:ifnull          21
			val$callback.onCompleted(graphresponse.getJSONObject(), graphresponse);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #29  <Method org.json.JSONObject GraphResponse.getJSONObject()>
	//    7   15:aload_1         
	//    8   16:invokeinterface #34  <Method void GraphRequest$GraphJSONObjectCallback.onCompleted(org.json.JSONObject, GraphResponse)>
	//    9   21:return          
	}

	final aphJSONObjectCallback val$callback;

	GraphRequest$1(aphJSONObjectCallback aphjsonobjectcallback)
	{
		val$callback = aphjsonobjectcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
