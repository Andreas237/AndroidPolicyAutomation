// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$2
	implements Runnable
{

	public void run()
	{
		val$handler.onError(val$error);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field FirebaseError val$error>
	//    4    8:invokeinterface #36  <Method void com.firebase.client.Firebase$ValueResultHandler.onError(FirebaseError)>
	//    5   13:return          
	}

	final AuthenticationManager this$0;
	final FirebaseError val$error;
	final com.firebase.client.ler val$handler;

	AuthenticationManager$2()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AuthenticationManager this$0>
		val$handler = ler;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
		val$error = FirebaseError.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field FirebaseError val$error>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
