// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$AuthAttempt$1
	implements Runnable
{

	public void run()
	{
		if(AuthenticationManager.AuthAttempt.access$000(AuthenticationManager.AuthAttempt.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
	//*   2    4:invokestatic    #33  <Method com.firebase.client.Firebase$AuthListener AuthenticationManager$AuthAttempt.access$000(AuthenticationManager$AuthAttempt)>
	//*   3    7:ifnull          27
		{
			AuthenticationManager.AuthAttempt.access$000(AuthenticationManager.AuthAttempt.this).onAuthError(val$error);
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
	//    6   14:invokestatic    #33  <Method com.firebase.client.Firebase$AuthListener AuthenticationManager$AuthAttempt.access$000(AuthenticationManager$AuthAttempt)>
	//    7   17:aload_0         
	//    8   18:getfield        #24  <Field FirebaseError val$error>
	//    9   21:invokeinterface #38  <Method void com.firebase.client.Firebase$AuthListener.onAuthError(FirebaseError)>
			return;
	//   10   26:return          
		}
		if(AuthenticationManager.AuthAttempt.access$100(AuthenticationManager.AuthAttempt.this) != null)
	//*  11   27:aload_0         
	//*  12   28:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
	//*  13   31:invokestatic    #42  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$100(AuthenticationManager$AuthAttempt)>
	//*  14   34:ifnull          62
		{
			AuthenticationManager.AuthAttempt.access$100(AuthenticationManager.AuthAttempt.this).onAuthenticationError(val$error);
	//   15   37:aload_0         
	//   16   38:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
	//   17   41:invokestatic    #42  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$100(AuthenticationManager$AuthAttempt)>
	//   18   44:aload_0         
	//   19   45:getfield        #24  <Field FirebaseError val$error>
	//   20   48:invokeinterface #47  <Method void com.firebase.client.Firebase$AuthResultHandler.onAuthenticationError(FirebaseError)>
			AuthenticationManager.AuthAttempt.access$102(AuthenticationManager.AuthAttempt.this, ((com.firebase.client.Firebase.AuthResultHandler) (null)));
	//   21   53:aload_0         
	//   22   54:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
	//   23   57:aconst_null     
	//   24   58:invokestatic    #51  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$102(AuthenticationManager$AuthAttempt, com.firebase.client.Firebase$AuthResultHandler)>
	//   25   61:pop             
		}
	//   26   62:return          
	}

	final AuthenticationManager.AuthAttempt this$1;
	final FirebaseError val$error;

	AuthenticationManager$AuthAttempt$1()
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
