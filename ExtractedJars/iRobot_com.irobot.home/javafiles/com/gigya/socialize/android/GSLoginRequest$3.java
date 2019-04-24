// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.*;

// Referenced classes of package com.gigya.socialize.android:
//			GSLoginRequest

class GSLoginRequest$3
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		val$finalResponse.getData().put("data", gsresponse.getObject("data", ((GSObject) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GSResponse val$finalResponse>
	//    2    4:invokevirtual   #33  <Method GSObject GSResponse.getData()>
	//    3    7:ldc1            #35  <String "data">
	//    4    9:aload_2         
	//    5   10:ldc1            #35  <String "data">
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #39  <Method GSObject GSResponse.getObject(String, GSObject)>
	//    8   16:invokevirtual   #45  <Method void GSObject.put(String, GSObject)>
		val$finalResponse.getData().put("profile", gsresponse.getObject("profile", ((GSObject) (null))));
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field GSResponse val$finalResponse>
	//   11   23:invokevirtual   #33  <Method GSObject GSResponse.getData()>
	//   12   26:ldc1            #47  <String "profile">
	//   13   28:aload_2         
	//   14   29:ldc1            #47  <String "profile">
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #39  <Method GSObject GSResponse.getObject(String, GSObject)>
	//   17   35:invokevirtual   #45  <Method void GSObject.put(String, GSObject)>
		responseListener.onGSResponse(type.toString().toLowerCase(), val$finalResponse, obj);
	//   18   38:aload_0         
	//   19   39:getfield        #19  <Field GSLoginRequest this$0>
	//   20   42:getfield        #51  <Field GSResponseListener GSLoginRequest.responseListener>
	//   21   45:aload_0         
	//   22   46:getfield        #19  <Field GSLoginRequest this$0>
	//   23   49:getfield        #55  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
	//   24   52:invokevirtual   #61  <Method String GSLoginRequest$LoginRequestType.toString()>
	//   25   55:invokevirtual   #66  <Method String String.toLowerCase()>
	//   26   58:aload_0         
	//   27   59:getfield        #21  <Field GSResponse val$finalResponse>
	//   28   62:aload_3         
	//   29   63:invokeinterface #68  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
	//   30   68:return          
	}

	final GSLoginRequest this$0;
	final GSResponse val$finalResponse;

	GSLoginRequest$3()
	{
		this$0 = final_gsloginrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSLoginRequest this$0>
		val$finalResponse = GSResponse.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field GSResponse val$finalResponse>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
