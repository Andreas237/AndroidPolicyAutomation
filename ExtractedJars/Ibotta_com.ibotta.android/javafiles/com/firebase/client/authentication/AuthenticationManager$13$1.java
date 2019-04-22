// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.AuthData;
import java.util.Set;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$13$1
	implements Runnable
{

	public void run()
	{
		val$listener.onAuthStateChanged(val$authData);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AuthenticationManager$13 this$1>
	//    2    4:getfield        #28  <Field com.firebase.client.Firebase$AuthStateListener AuthenticationManager$13.val$listener>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field AuthData val$authData>
	//    5   11:invokeinterface #34  <Method void com.firebase.client.Firebase$AuthStateListener.onAuthStateChanged(AuthData)>
	//    6   16:return          
	}

	final AuthenticationManager._cls13 this$1;
	final AuthData val$authData;

	AuthenticationManager$13$1()
	{
		this$1 = final__pcls13;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AuthenticationManager$13 this$1>
		val$authData = AuthData.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AuthData val$authData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/firebase/client/authentication/AuthenticationManager$13

/* anonymous class */
	class AuthenticationManager._cls13
		implements Runnable
	{

		public void run()
		{
			AuthenticationManager.access$1900(AuthenticationManager.this).add(((Object) (listener)));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field AuthenticationManager this$0>
		//    2    4:invokestatic    #32  <Method Set AuthenticationManager.access$1900(AuthenticationManager)>
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
		//    5   11:invokeinterface #38  <Method boolean Set.add(Object)>
		//    6   16:pop             
			AuthData authdata = AuthenticationManager.access$1100(AuthenticationManager.this);
		//    7   17:aload_0         
		//    8   18:getfield        #21  <Field AuthenticationManager this$0>
		//    9   21:invokestatic    #42  <Method AuthData AuthenticationManager.access$1100(AuthenticationManager)>
		//   10   24:astore_1        
			AuthenticationManager.access$200(AuthenticationManager.this, ((Runnable) (((AuthenticationManager._cls13._cls1) (authdata)). new AuthenticationManager._cls13._cls1())));
		//   11   25:aload_0         
		//   12   26:getfield        #21  <Field AuthenticationManager this$0>
		//   13   29:new             #13  <Class AuthenticationManager$13$1>
		//   14   32:dup             
		//   15   33:aload_0         
		//   16   34:aload_1         
		//   17   35:invokespecial   #45  <Method void AuthenticationManager$13$1(AuthenticationManager$13, AuthData)>
		//   18   38:invokestatic    #49  <Method void AuthenticationManager.access$200(AuthenticationManager, Runnable)>
		//   19   41:return          
		}

		final AuthenticationManager this$0;
		final com.firebase.client.Firebase.AuthStateListener val$listener;

			
			{
				this$0 = final_authenticationmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				listener = com.firebase.client.Firebase.AuthStateListener.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
