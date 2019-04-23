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
		aphJSONObjectCallback aphjsonobjectcallback = val$callback;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
	//    2    4:astore_2        
		if(aphjsonobjectcallback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          20
			aphjsonobjectcallback.onCompleted(graphresponse.getJSONObject(), graphresponse);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #29  <Method org.json.JSONObject GraphResponse.getJSONObject()>
	//    8   14:aload_1         
	//    9   15:invokeinterface #34  <Method void GraphRequest$GraphJSONObjectCallback.onCompleted(org.json.JSONObject, GraphResponse)>
	//   10   20:return          
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
