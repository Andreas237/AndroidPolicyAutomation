// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSLoginRequest, GSAPI

class GSLoginRequest$4
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(responseListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field GSLoginRequest this$0>
	//*   2    4:getfield        #31  <Field GSResponseListener GSLoginRequest.responseListener>
	//*   3    7:ifnull          37
			responseListener.onGSResponse(type.toString().toLowerCase(), gsresponse, obj);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field GSLoginRequest this$0>
	//    6   14:getfield        #31  <Field GSResponseListener GSLoginRequest.responseListener>
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field GSLoginRequest this$0>
	//    9   21:getfield        #35  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
	//   10   24:invokevirtual   #41  <Method String GSLoginRequest$LoginRequestType.toString()>
	//   11   27:invokevirtual   #46  <Method String String.toLowerCase()>
	//   12   30:aload_2         
	//   13   31:aload_3         
	//   14   32:invokeinterface #48  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
		if(gsresponse.getErrorCode() == 0)
	//*  15   37:aload_2         
	//*  16   38:invokevirtual   #54  <Method int GSResponse.getErrorCode()>
	//*  17   41:ifne            125
		{
			if(type.equals(((Object) (ginRequestType.login))))
	//*  18   44:aload_0         
	//*  19   45:getfield        #19  <Field GSLoginRequest this$0>
	//*  20   48:getfield        #35  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
	//*  21   51:getstatic       #57  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
	//*  22   54:invokevirtual   #61  <Method boolean GSLoginRequest$LoginRequestType.equals(Object)>
	//*  23   57:ifeq            75
			{
				val$api.setLastLoginProvider(provider);
	//   24   60:aload_0         
	//   25   61:getfield        #21  <Field GSAPI val$api>
	//   26   64:aload_0         
	//   27   65:getfield        #19  <Field GSLoginRequest this$0>
	//   28   68:getfield        #65  <Field String GSLoginRequest.provider>
	//   29   71:invokevirtual   #71  <Method void GSAPI.setLastLoginProvider(String)>
				return;
	//   30   74:return          
			}
			if(type.equals(((Object) (ginRequestType.addConnection))))
	//*  31   75:aload_0         
	//*  32   76:getfield        #19  <Field GSLoginRequest this$0>
	//*  33   79:getfield        #35  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
	//*  34   82:getstatic       #74  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
	//*  35   85:invokevirtual   #61  <Method boolean GSLoginRequest$LoginRequestType.equals(Object)>
	//*  36   88:ifeq            125
				val$api.invokeSocializeListeners("connectionAdded", new Object[] {
					provider, gsresponse.getData(), obj
				});
	//   37   91:aload_0         
	//   38   92:getfield        #21  <Field GSAPI val$api>
	//   39   95:ldc1            #76  <String "connectionAdded">
	//   40   97:iconst_3        
	//   41   98:anewarray       Object[]
	//   42  101:dup             
	//   43  102:iconst_0        
	//   44  103:aload_0         
	//   45  104:getfield        #19  <Field GSLoginRequest this$0>
	//   46  107:getfield        #65  <Field String GSLoginRequest.provider>
	//   47  110:aastore         
	//   48  111:dup             
	//   49  112:iconst_1        
	//   50  113:aload_2         
	//   51  114:invokevirtual   #80  <Method com.gigya.socialize.GSObject GSResponse.getData()>
	//   52  117:aastore         
	//   53  118:dup             
	//   54  119:iconst_2        
	//   55  120:aload_3         
	//   56  121:aastore         
	//   57  122:invokevirtual   #84  <Method void GSAPI.invokeSocializeListeners(String, Object[])>
		}
	//   58  125:return          
	}

	final GSLoginRequest this$0;
	final GSAPI val$api;

	GSLoginRequest$4()
	{
		this$0 = final_gsloginrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSLoginRequest this$0>
		val$api = GSAPI.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field GSAPI val$api>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
