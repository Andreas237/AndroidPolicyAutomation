// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$4
	implements Runnable
{

	public void run()
	{
		val$attempt.fireError(val$error);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AuthenticationManager$AuthAttempt val$attempt>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field FirebaseError val$error>
	//    4    8:invokevirtual   #36  <Method void AuthenticationManager$AuthAttempt.fireError(FirebaseError)>
	//    5   11:return          
	}

	final AuthenticationManager this$0;
	final thAttempt val$attempt;
	final FirebaseError val$error;

	AuthenticationManager$4()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AuthenticationManager this$0>
		val$attempt = thattempt;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AuthenticationManager$AuthAttempt val$attempt>
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
