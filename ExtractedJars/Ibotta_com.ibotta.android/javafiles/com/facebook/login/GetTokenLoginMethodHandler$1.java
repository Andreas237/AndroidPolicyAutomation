// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Bundle;

// Referenced classes of package com.facebook.login:
//			GetTokenLoginMethodHandler

class GetTokenLoginMethodHandler$1
	implements com.facebook.internal.edListener
{

	public void completed(Bundle bundle)
	{
		getTokenCompleted(val$request, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GetTokenLoginMethodHandler this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field LoginClient$Request val$request>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #31  <Method void GetTokenLoginMethodHandler.getTokenCompleted(LoginClient$Request, Bundle)>
	//    6   12:return          
	}

	final GetTokenLoginMethodHandler this$0;
	final LoginClient.Request val$request;

	GetTokenLoginMethodHandler$1()
	{
		this$0 = final_gettokenloginmethodhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GetTokenLoginMethodHandler this$0>
		val$request = LoginClient.Request.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field LoginClient$Request val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
