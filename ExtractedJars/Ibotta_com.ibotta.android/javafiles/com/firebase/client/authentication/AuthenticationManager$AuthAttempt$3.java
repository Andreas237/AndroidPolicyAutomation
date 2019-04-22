// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$AuthAttempt$3
	implements Runnable
{

	public void run()
	{
		AuthenticationManager.AuthAttempt.access$000(AuthenticationManager.AuthAttempt.this).onAuthRevoked(val$error);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
	//    2    4:invokestatic    #33  <Method com.firebase.client.Firebase$AuthListener AuthenticationManager$AuthAttempt.access$000(AuthenticationManager$AuthAttempt)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field FirebaseError val$error>
	//    5   11:invokeinterface #38  <Method void com.firebase.client.Firebase$AuthListener.onAuthRevoked(FirebaseError)>
	//    6   16:return          
	}

	final AuthenticationManager.AuthAttempt this$1;
	final FirebaseError val$error;

	AuthenticationManager$AuthAttempt$3()
	{
		this$1 = final_authattempt;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
		val$error = FirebaseError.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field FirebaseError val$error>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
