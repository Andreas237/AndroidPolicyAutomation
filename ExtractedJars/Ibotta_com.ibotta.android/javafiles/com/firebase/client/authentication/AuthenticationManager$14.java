// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.util.Set;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$14
	implements Runnable
{

	public void run()
	{
		AuthenticationManager.access$1900(AuthenticationManager.this).remove(((Object) (val$listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AuthenticationManager this$0>
	//    2    4:invokestatic    #30  <Method Set AuthenticationManager.access$1900(AuthenticationManager)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
	//    5   11:invokeinterface #36  <Method boolean Set.remove(Object)>
	//    6   16:pop             
	//    7   17:return          
	}

	final AuthenticationManager this$0;
	final com.firebase.client.r val$listener;

	AuthenticationManager$14()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AuthenticationManager this$0>
		val$listener = com.firebase.client.r.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
