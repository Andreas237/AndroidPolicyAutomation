// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$3
	implements com.firebase.client.ler
{

	public void onError(FirebaseError firebaseerror)
	{
		val$handler.onError(firebaseerror);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field com.firebase.client.Firebase$ResultHandler val$handler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method void com.firebase.client.Firebase$ResultHandler.onError(FirebaseError)>
	//    4   10:return          
	}

	public void onSuccess(Object obj)
	{
		val$handler.onSuccess();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field com.firebase.client.Firebase$ResultHandler val$handler>
	//    2    4:invokeinterface #35  <Method void com.firebase.client.Firebase$ResultHandler.onSuccess()>
	//    3    9:return          
	}

	final AuthenticationManager this$0;
	final com.firebase.client.Firebase.ResultHandler val$handler;

	AuthenticationManager$3()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AuthenticationManager this$0>
		val$handler = com.firebase.client.Firebase.ResultHandler.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.firebase.client.Firebase$ResultHandler val$handler>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
