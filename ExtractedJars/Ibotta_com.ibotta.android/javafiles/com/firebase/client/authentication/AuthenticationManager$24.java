// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.util.Collections;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$24
	implements Runnable
{

	public void run()
	{
		String s = String.format("/users/%s/password", new Object[] {
			val$email
		});
	//    0    0:ldc1            #32  <String "/users/%s/password">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #23  <Field String val$email>
	//    7   12:aastore         
	//    8   13:invokestatic    #38  <Method String String.format(String, Object[])>
	//    9   16:astore_1        
		java.util.Map map = Collections.emptyMap();
	//   10   17:invokestatic    #44  <Method java.util.Map Collections.emptyMap()>
	//   11   20:astore_2        
		AuthenticationManager.access$2400(AuthenticationManager.this, s, com.firebase.client.utilities.Type.POST, map, map, val$handler, false);
	//   12   21:aload_0         
	//   13   22:getfield        #21  <Field AuthenticationManager this$0>
	//   14   25:aload_1         
	//   15   26:getstatic       #50  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.POST>
	//   16   29:aload_2         
	//   17   30:aload_2         
	//   18   31:aload_0         
	//   19   32:getfield        #25  <Field com.firebase.client.Firebase$ResultHandler val$handler>
	//   20   35:iconst_0        
	//   21   36:invokestatic    #54  <Method void AuthenticationManager.access$2400(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, java.util.Map, java.util.Map, com.firebase.client.Firebase$ResultHandler, boolean)>
	//   22   39:return          
	}

	final AuthenticationManager this$0;
	final String val$email;
	final com.firebase.client.Firebase.ResultHandler val$handler;

	AuthenticationManager$24()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AuthenticationManager this$0>
		val$email = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$email>
		val$handler = com.firebase.client.Firebase.ResultHandler.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field com.firebase.client.Firebase$ResultHandler val$handler>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
