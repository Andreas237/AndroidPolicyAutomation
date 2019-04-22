// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.util.HashMap;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$15
	implements Runnable
{

	public void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #28  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void HashMap()>
	//    3    7:astore_1        
		AuthenticationManager.access$2000(AuthenticationManager.this, "/auth/anonymous", ((java.util.Map) (hashmap)), val$handler);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field AuthenticationManager this$0>
	//    6   12:ldc1            #31  <String "/auth/anonymous">
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:getfield        #21  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
	//   10   19:invokestatic    #35  <Method void AuthenticationManager.access$2000(AuthenticationManager, String, java.util.Map, com.firebase.client.Firebase$AuthResultHandler)>
	//   11   22:return          
	}

	final AuthenticationManager this$0;
	final com.firebase.client.r val$handler;

	AuthenticationManager$15()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AuthenticationManager this$0>
		val$handler = com.firebase.client.r.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
