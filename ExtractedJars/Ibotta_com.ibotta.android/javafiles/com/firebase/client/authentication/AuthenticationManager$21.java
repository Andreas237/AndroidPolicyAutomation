// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.util.*;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$21
	implements Runnable
{

	public void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #35  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("password", ((Object) (val$password)));
	//    4    8:aload_1         
	//    5    9:ldc1            #38  <String "password">
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field String val$password>
	//    8   15:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		String s = String.format("/users/%s", new Object[] {
			val$email
		});
	//   10   21:ldc1            #46  <String "/users/%s">
	//   11   23:iconst_1        
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:aload_0         
	//   16   30:getfield        #26  <Field String val$email>
	//   17   33:aastore         
	//   18   34:invokestatic    #52  <Method String String.format(String, Object[])>
	//   19   37:astore_2        
		AuthenticationManager.access$2400(AuthenticationManager.this, s, com.firebase.client.utilities.Type.DELETE, ((Map) (hashmap)), Collections.emptyMap(), val$handler, true);
	//   20   38:aload_0         
	//   21   39:getfield        #22  <Field AuthenticationManager this$0>
	//   22   42:aload_2         
	//   23   43:getstatic       #58  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.DELETE>
	//   24   46:aload_1         
	//   25   47:invokestatic    #64  <Method Map Collections.emptyMap()>
	//   26   50:aload_0         
	//   27   51:getfield        #28  <Field com.firebase.client.Firebase$ResultHandler val$handler>
	//   28   54:iconst_1        
	//   29   55:invokestatic    #68  <Method void AuthenticationManager.access$2400(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ResultHandler, boolean)>
	//   30   58:return          
	}

	final AuthenticationManager this$0;
	final String val$email;
	final com.firebase.client.Firebase.ResultHandler val$handler;
	final String val$password;

	AuthenticationManager$21()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AuthenticationManager this$0>
		val$password = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$password>
		val$email = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field String val$email>
		val$handler = com.firebase.client.Firebase.ResultHandler.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field com.firebase.client.Firebase$ResultHandler val$handler>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
