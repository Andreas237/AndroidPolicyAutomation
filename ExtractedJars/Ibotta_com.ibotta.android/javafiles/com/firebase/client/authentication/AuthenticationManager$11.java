// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;
import java.util.Map;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$11
	implements com.firebase.client.Firebase.AuthListener
{

	public void onAuthError(FirebaseError firebaseerror)
	{
		AuthenticationManager.access$300(AuthenticationManager.this, firebaseerror, val$attempt, false);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AuthenticationManager this$0>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field AuthenticationManager$AuthAttempt val$attempt>
	//    5    9:iconst_0        
	//    6   10:invokestatic    #39  <Method void AuthenticationManager.access$300(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt, boolean)>
	//    7   13:return          
	}

	public void onAuthRevoked(FirebaseError firebaseerror)
	{
		AuthenticationManager.access$300(AuthenticationManager.this, firebaseerror, val$attempt, true);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AuthenticationManager this$0>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field AuthenticationManager$AuthAttempt val$attempt>
	//    5    9:iconst_1        
	//    6   10:invokestatic    #39  <Method void AuthenticationManager.access$300(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt, boolean)>
	//    7   13:return          
	}

	public void onAuthSuccess(Object obj)
	{
		AuthenticationManager.access$400(AuthenticationManager.this, val$credential, (Map)obj, val$optionalUserData, true, val$attempt);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AuthenticationManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field String val$credential>
	//    4    8:aload_1         
	//    5    9:checkcast       #44  <Class Map>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Map val$optionalUserData>
	//    8   16:iconst_1        
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field AuthenticationManager$AuthAttempt val$attempt>
	//   11   21:invokestatic    #48  <Method void AuthenticationManager.access$400(AuthenticationManager, String, Map, Map, boolean, AuthenticationManager$AuthAttempt)>
	//   12   24:return          
	}

	final AuthenticationManager this$0;
	final hAttempt val$attempt;
	final String val$credential;
	final Map val$optionalUserData;

	AuthenticationManager$11()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AuthenticationManager this$0>
		val$credential = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String val$credential>
		val$optionalUserData = map;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Map val$optionalUserData>
		val$attempt = hAttempt.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field AuthenticationManager$AuthAttempt val$attempt>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
