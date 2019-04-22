// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.util.*;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$20
	implements Runnable
{

	public void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #35  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("email", ((Object) (val$email)));
	//    4    8:aload_1         
	//    5    9:ldc1            #38  <String "email">
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field String val$email>
	//    8   15:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("password", ((Object) (val$password)));
	//   10   21:aload_1         
	//   11   22:ldc1            #46  <String "password">
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field String val$password>
	//   14   28:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		AuthenticationManager.access$2300(AuthenticationManager.this, "/users", com.firebase.client.utilities.Type.POST, Collections.emptyMap(), ((Map) (hashmap)), val$handler, false);
	//   16   34:aload_0         
	//   17   35:getfield        #22  <Field AuthenticationManager this$0>
	//   18   38:ldc1            #48  <String "/users">
	//   19   40:getstatic       #54  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.POST>
	//   20   43:invokestatic    #60  <Method Map Collections.emptyMap()>
	//   21   46:aload_1         
	//   22   47:aload_0         
	//   23   48:getfield        #28  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
	//   24   51:iconst_0        
	//   25   52:invokestatic    #64  <Method void AuthenticationManager.access$2300(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ValueResultHandler, boolean)>
	//   26   55:return          
	}

	final AuthenticationManager this$0;
	final String val$email;
	final com.firebase.client.er val$handler;
	final String val$password;

	AuthenticationManager$20()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AuthenticationManager this$0>
		val$email = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$email>
		val$password = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field String val$password>
		val$handler = com.firebase.client.er.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
