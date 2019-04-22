// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			GetTokenLoginMethodHandler, LoginClient

class GetTokenLoginMethodHandler$2
	implements com.facebook.internal.heCallback
{

	public void onFailure(FacebookException facebookexception)
	{
		loginClient.complete(LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), "Caught exception", facebookexception.getMessage()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
	//    2    4:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
	//    5   11:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
	//    6   14:invokevirtual   #41  <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    7   17:ldc1            #43  <String "Caught exception">
	//    8   19:aload_1         
	//    9   20:invokevirtual   #49  <Method String FacebookException.getMessage()>
	//   10   23:invokestatic    #55  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   11   26:invokevirtual   #58  <Method void LoginClient.complete(LoginClient$Result)>
	//   12   29:return          
	}

	public void onSuccess(JSONObject jsonobject)
	{
		try
		{
			jsonobject = ((JSONObject) (jsonobject.getString("id")));
	//    0    0:aload_1         
	//    1    1:ldc1            #64  <String "id">
	//    2    3:invokevirtual   #70  <Method String JSONObject.getString(String)>
	//    3    6:astore_1        
			val$result.putString("com.facebook.platform.extra.USER_ID", ((String) (jsonobject)));
	//    4    7:aload_0         
	//    5    8:getfield        #23  <Field Bundle val$result>
	//    6   11:ldc1            #72  <String "com.facebook.platform.extra.USER_ID">
	//    7   13:aload_1         
	//    8   14:invokevirtual   #78  <Method void Bundle.putString(String, String)>
			onComplete(val$request, val$result);
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field LoginClient$Request val$request>
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field Bundle val$result>
	//   15   29:invokevirtual   #81  <Method void GetTokenLoginMethodHandler.onComplete(LoginClient$Request, Bundle)>
			return;
	//   16   32:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  17   33:astore_1        
		{
			loginClient.complete(LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), "Caught exception", ((JSONException) (jsonobject)).getMessage()));
	//   18   34:aload_0         
	//   19   35:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
	//   20   38:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
	//   21   41:aload_0         
	//   22   42:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
	//   23   45:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
	//   24   48:invokevirtual   #41  <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   25   51:ldc1            #43  <String "Caught exception">
	//   26   53:aload_1         
	//   27   54:invokevirtual   #82  <Method String JSONException.getMessage()>
	//   28   57:invokestatic    #55  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   29   60:invokevirtual   #58  <Method void LoginClient.complete(LoginClient$Result)>
		}
	//   30   63:return          
	}

	final GetTokenLoginMethodHandler this$0;
	final LoginClient.Request val$request;
	final Bundle val$result;

	GetTokenLoginMethodHandler$2()
	{
		this$0 = final_gettokenloginmethodhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GetTokenLoginMethodHandler this$0>
		val$result = bundle;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Bundle val$result>
		val$request = LoginClient.Request.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field LoginClient$Request val$request>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
