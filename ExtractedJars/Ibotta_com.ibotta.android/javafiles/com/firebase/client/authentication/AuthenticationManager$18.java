// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;


// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$18
	implements Runnable
{

	public void run()
	{
		hAttempt hattempt = AuthenticationManager.access$2200(AuthenticationManager.this, val$listener);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AuthenticationManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field com.firebase.client.Firebase$AuthListener val$listener>
	//    4    8:invokestatic    #34  <Method AuthenticationManager$AuthAttempt AuthenticationManager.access$2200(AuthenticationManager, com.firebase.client.Firebase$AuthListener)>
	//    5   11:astore_1        
		AuthenticationManager.access$800(AuthenticationManager.this, val$token, ((java.util.Map) (null)), hattempt);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field AuthenticationManager this$0>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field String val$token>
	//   10   20:aconst_null     
	//   11   21:aload_1         
	//   12   22:invokestatic    #38  <Method void AuthenticationManager.access$800(AuthenticationManager, String, java.util.Map, AuthenticationManager$AuthAttempt)>
	//   13   25:return          
	}

	final AuthenticationManager this$0;
	final com.firebase.client.Firebase.AuthListener val$listener;
	final String val$token;

	AuthenticationManager$18()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AuthenticationManager this$0>
		val$listener = authlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field com.firebase.client.Firebase$AuthListener val$listener>
		val$token = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$token>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
