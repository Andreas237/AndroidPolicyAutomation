// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$23
	implements Runnable
{

	public void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #38  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("password", ((Object) (val$password)));
	//    4    8:aload_1         
	//    5    9:ldc1            #41  <String "password">
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field String val$password>
	//    8   15:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		HashMap hashmap1 = new HashMap();
	//   10   21:new             #38  <Class HashMap>
	//   11   24:dup             
	//   12   25:invokespecial   #39  <Method void HashMap()>
	//   13   28:astore_2        
		((Map) (hashmap1)).put("email", ((Object) (val$newEmail)));
	//   14   29:aload_2         
	//   15   30:ldc1            #49  <String "email">
	//   16   32:aload_0         
	//   17   33:getfield        #27  <Field String val$newEmail>
	//   18   36:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   19   41:pop             
		String s = String.format("/users/%s/email", new Object[] {
			val$oldEmail
		});
	//   20   42:ldc1            #51  <String "/users/%s/email">
	//   21   44:iconst_1        
	//   22   45:anewarray       Object[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:aload_0         
	//   26   51:getfield        #29  <Field String val$oldEmail>
	//   27   54:aastore         
	//   28   55:invokestatic    #57  <Method String String.format(String, Object[])>
	//   29   58:astore_3        
		AuthenticationManager.access$2400(AuthenticationManager.this, s, com.firebase.client.utilities.Type.PUT, ((Map) (hashmap)), ((Map) (hashmap1)), val$handler, false);
	//   30   59:aload_0         
	//   31   60:getfield        #23  <Field AuthenticationManager this$0>
	//   32   63:aload_3         
	//   33   64:getstatic       #63  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.PUT>
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:aload_0         
	//   37   70:getfield        #31  <Field com.firebase.client.Firebase$ResultHandler val$handler>
	//   38   73:iconst_0        
	//   39   74:invokestatic    #67  <Method void AuthenticationManager.access$2400(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ResultHandler, boolean)>
	//   40   77:return          
	}

	final AuthenticationManager this$0;
	final com.firebase.client.Firebase.ResultHandler val$handler;
	final String val$newEmail;
	final String val$oldEmail;
	final String val$password;

	AuthenticationManager$23()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AuthenticationManager this$0>
		val$password = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String val$password>
		val$newEmail = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field String val$newEmail>
		val$oldEmail = s2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field String val$oldEmail>
		val$handler = com.firebase.client.Firebase.ResultHandler.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #31  <Field com.firebase.client.Firebase$ResultHandler val$handler>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void Object()>
	//   17   31:return          
	}
}
