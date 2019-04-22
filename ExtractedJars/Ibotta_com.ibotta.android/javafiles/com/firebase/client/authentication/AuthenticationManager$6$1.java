// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.PersistentConnection;
import java.util.Map;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$6$1
	implements com.firebase.client.Firebase.AuthListener
{

	public void onAuthError(FirebaseError firebaseerror)
	{
		AuthenticationManager.access$300(this$0, firebaseerror, ((Attempt) (null)), false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AuthenticationManager$6 this$1>
	//    2    4:getfield        #26  <Field AuthenticationManager AuthenticationManager$6.this$0>
	//    3    7:aload_1         
	//    4    8:aconst_null     
	//    5    9:iconst_0        
	//    6   10:invokestatic    #32  <Method void AuthenticationManager.access$300(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt, boolean)>
	//    7   13:return          
	}

	public void onAuthRevoked(FirebaseError firebaseerror)
	{
		AuthenticationManager.access$300(this$0, firebaseerror, ((Attempt) (null)), true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AuthenticationManager$6 this$1>
	//    2    4:getfield        #26  <Field AuthenticationManager AuthenticationManager$6.this$0>
	//    3    7:aload_1         
	//    4    8:aconst_null     
	//    5    9:iconst_1        
	//    6   10:invokestatic    #32  <Method void AuthenticationManager.access$300(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt, boolean)>
	//    7   13:return          
	}

	public void onAuthSuccess(Object obj)
	{
		AuthenticationManager.access$400(this$0, val$tokenString, val$authDataObj, val$userData, false, ((Attempt) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AuthenticationManager$6 this$1>
	//    2    4:getfield        #26  <Field AuthenticationManager AuthenticationManager$6.this$0>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field AuthenticationManager$6 this$1>
	//    5   11:getfield        #39  <Field String AuthenticationManager$6.val$tokenString>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field AuthenticationManager$6 this$1>
	//    8   18:getfield        #43  <Field Map AuthenticationManager$6.val$authDataObj>
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field AuthenticationManager$6 this$1>
	//   11   25:getfield        #46  <Field Map AuthenticationManager$6.val$userData>
	//   12   28:iconst_0        
	//   13   29:aconst_null     
	//   14   30:invokestatic    #50  <Method void AuthenticationManager.access$400(AuthenticationManager, String, Map, Map, boolean, AuthenticationManager$AuthAttempt)>
	//   15   33:return          
	}

	final AuthenticationManager._cls6 this$1;

	AuthenticationManager$6$1()
	{
		this$1 = AuthenticationManager._cls6.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AuthenticationManager$6 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/firebase/client/authentication/AuthenticationManager$6

/* anonymous class */
	class AuthenticationManager._cls6
		implements Runnable
	{

		public void run()
		{
			AuthenticationManager.access$500(AuthenticationManager.this).auth(tokenString, ((com.firebase.client.Firebase.AuthListener) (new AuthenticationManager._cls6._cls1())));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AuthenticationManager this$0>
		//    2    4:invokestatic    #38  <Method PersistentConnection AuthenticationManager.access$500(AuthenticationManager)>
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field String val$tokenString>
		//    5   11:new             #13  <Class AuthenticationManager$6$1>
		//    6   14:dup             
		//    7   15:aload_0         
		//    8   16:invokespecial   #41  <Method void AuthenticationManager$6$1(AuthenticationManager$6)>
		//    9   19:invokevirtual   #47  <Method void PersistentConnection.auth(String, com.firebase.client.Firebase$AuthListener)>
		//   10   22:return          
		}

		final AuthenticationManager this$0;
		final Map val$authDataObj;
		final String val$tokenString;
		final Map val$userData;

			
			{
				this$0 = final_authenticationmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AuthenticationManager this$0>
				tokenString = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$tokenString>
				authDataObj = map;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Map val$authDataObj>
				userData = Map.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Map val$userData>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
	}

}
