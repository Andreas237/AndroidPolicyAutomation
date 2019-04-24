// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			AttributionHandler

class AttributionHandler$2
	implements Runnable
{

	public void run()
	{
		AttributionHandler.access$100(AttributionHandler.this, val$jsonResponse);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AttributionHandler this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field JSONObject val$jsonResponse>
	//    4    8:invokestatic    #29  <Method void AttributionHandler.access$100(AttributionHandler, JSONObject)>
	//    5   11:return          
	}

	final AttributionHandler this$0;
	final JSONObject val$jsonResponse;

	AttributionHandler$2()
	{
		this$0 = final_attributionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AttributionHandler this$0>
		val$jsonResponse = JSONObject.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field JSONObject val$jsonResponse>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
