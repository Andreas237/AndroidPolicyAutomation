// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.util.Map;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$19
	implements Runnable
{

	public void run()
	{
		String s = String.format("/auth/%s/token", new Object[] {
			val$provider
		});
	//    0    0:ldc1            #36  <String "/auth/%s/token">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #25  <Field String val$provider>
	//    7   12:aastore         
	//    8   13:invokestatic    #42  <Method String String.format(String, Object[])>
	//    9   16:astore_1        
		AuthenticationManager.access$2000(AuthenticationManager.this, s, val$params, val$handler);
	//   10   17:aload_0         
	//   11   18:getfield        #23  <Field AuthenticationManager this$0>
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:getfield        #27  <Field Map val$params>
	//   15   26:aload_0         
	//   16   27:getfield        #29  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
	//   17   30:invokestatic    #45  <Method void AuthenticationManager.access$2000(AuthenticationManager, String, Map, com.firebase.client.Firebase$AuthResultHandler)>
	//   18   33:return          
	}

	final AuthenticationManager this$0;
	final com.firebase.client.r val$handler;
	final Map val$params;
	final String val$provider;

	AuthenticationManager$19()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AuthenticationManager this$0>
		val$provider = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String val$provider>
		val$params = map;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Map val$params>
		val$handler = com.firebase.client.r.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
