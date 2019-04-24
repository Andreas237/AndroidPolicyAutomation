// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import com.gigya.socialize.GSObject;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GoogleProvider

class GoogleProvider$3
	implements com.google.android.gms.common.api.nConnectionFailedListener
{

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		if(!val$silent.booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Boolean val$silent>
	//*   2    4:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
	//*   3    7:ifne            23
		{
			GoogleProvider.access$400(GoogleProvider.this, connectionresult, val$callback);
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field GoogleProvider this$0>
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//    9   19:invokestatic    #41  <Method void GoogleProvider.access$400(GoogleProvider, ConnectionResult, LoginProvider$ProviderCallback)>
			return;
	//   10   22:return          
		} else
		{
			connectionresult = ((ConnectionResult) (new GSObject()));
	//   11   23:new             #43  <Class GSObject>
	//   12   26:dup             
	//   13   27:invokespecial   #44  <Method void GSObject()>
	//   14   30:astore_1        
			((GSObject) (connectionresult)).put("errorCode", 0x62644);
	//   15   31:aload_1         
	//   16   32:ldc1            #46  <String "errorCode">
	//   17   34:ldc1            #47  <Int 0x62644>
	//   18   36:invokevirtual   #51  <Method void GSObject.put(String, int)>
			((GSObject) (connectionresult)).put("errorMessage", "Login failed - user has not authorized Google+ app.");
	//   19   39:aload_1         
	//   20   40:ldc1            #53  <String "errorMessage">
	//   21   42:ldc1            #55  <String "Login failed - user has not authorized Google+ app.">
	//   22   44:invokevirtual   #58  <Method void GSObject.put(String, String)>
			fail(val$callback, ((GSObject) (connectionresult)));
	//   23   47:aload_0         
	//   24   48:getfield        #21  <Field GoogleProvider this$0>
	//   25   51:aload_0         
	//   26   52:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #62  <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, GSObject)>
			return;
	//   29   59:return          
		}
	}

	final GoogleProvider this$0;
	final viderCallback val$callback;
	final Boolean val$silent;

	GoogleProvider$3()
	{
		this$0 = final_googleprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GoogleProvider this$0>
		val$silent = boolean1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Boolean val$silent>
		val$callback = viderCallback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field LoginProvider$ProviderCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
