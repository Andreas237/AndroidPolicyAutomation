// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.AuthData;
import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

private class AuthenticationManager$AuthAttempt
{

	public void fireError(final FirebaseError error)
	{
		if(legacyListener != null || handler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
	//*   5   11:ifnull          30
			AuthenticationManager.access$200(AuthenticationManager.this, new Runnable() {

				public void run()
				{
					if(legacyListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//*   2    4:invokestatic    #33  <Method com.firebase.client.Firebase$AuthListener AuthenticationManager$AuthAttempt.access$000(AuthenticationManager$AuthAttempt)>
				//*   3    7:ifnull          27
					{
						legacyListener.onAuthError(error);
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//    6   14:invokestatic    #33  <Method com.firebase.client.Firebase$AuthListener AuthenticationManager$AuthAttempt.access$000(AuthenticationManager$AuthAttempt)>
				//    7   17:aload_0         
				//    8   18:getfield        #24  <Field FirebaseError val$error>
				//    9   21:invokeinterface #38  <Method void com.firebase.client.Firebase$AuthListener.onAuthError(FirebaseError)>
						return;
				//   10   26:return          
					}
					if(handler != null)
				//*  11   27:aload_0         
				//*  12   28:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//*  13   31:invokestatic    #42  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$100(AuthenticationManager$AuthAttempt)>
				//*  14   34:ifnull          62
					{
						handler.onAuthenticationError(error);
				//   15   37:aload_0         
				//   16   38:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//   17   41:invokestatic    #42  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$100(AuthenticationManager$AuthAttempt)>
				//   18   44:aload_0         
				//   19   45:getfield        #24  <Field FirebaseError val$error>
				//   20   48:invokeinterface #47  <Method void com.firebase.client.Firebase$AuthResultHandler.onAuthenticationError(FirebaseError)>
						handler = null;
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

			
			{
				this$1 = AuthenticationManager.AuthAttempt.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				error = firebaseerror;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field FirebaseError val$error>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field AuthenticationManager this$0>
	//    8   18:new             #9   <Class AuthenticationManager$AuthAttempt$1>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #43  <Method void AuthenticationManager$AuthAttempt$1(AuthenticationManager$AuthAttempt, FirebaseError)>
	//   13   27:invokestatic    #47  <Method void AuthenticationManager.access$200(AuthenticationManager, Runnable)>
	//   14   30:return          
	}

	public void fireRevoked(final FirebaseError error)
	{
		if(legacyListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
	//*   2    4:ifnull          23
			AuthenticationManager.access$200(AuthenticationManager.this, new Runnable() {

				public void run()
				{
					legacyListener.onAuthRevoked(error);
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

			
			{
				this$1 = AuthenticationManager.AuthAttempt.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				error = firebaseerror;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field FirebaseError val$error>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field AuthenticationManager this$0>
	//    5   11:new             #13  <Class AuthenticationManager$AuthAttempt$3>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #49  <Method void AuthenticationManager$AuthAttempt$3(AuthenticationManager$AuthAttempt, FirebaseError)>
	//   10   20:invokestatic    #47  <Method void AuthenticationManager.access$200(AuthenticationManager, Runnable)>
	//   11   23:return          
	}

	public void fireSuccess(final AuthData authData)
	{
		if(legacyListener != null || handler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
	//*   5   11:ifnull          30
			AuthenticationManager.access$200(AuthenticationManager.this, new Runnable() {

				public void run()
				{
					if(legacyListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//*   2    4:invokestatic    #33  <Method com.firebase.client.Firebase$AuthListener AuthenticationManager$AuthAttempt.access$000(AuthenticationManager$AuthAttempt)>
				//*   3    7:ifnull          27
					{
						legacyListener.onAuthSuccess(((Object) (authData)));
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//    6   14:invokestatic    #33  <Method com.firebase.client.Firebase$AuthListener AuthenticationManager$AuthAttempt.access$000(AuthenticationManager$AuthAttempt)>
				//    7   17:aload_0         
				//    8   18:getfield        #24  <Field AuthData val$authData>
				//    9   21:invokeinterface #39  <Method void com.firebase.client.Firebase$AuthListener.onAuthSuccess(Object)>
						return;
				//   10   26:return          
					}
					if(handler != null)
				//*  11   27:aload_0         
				//*  12   28:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//*  13   31:invokestatic    #43  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$100(AuthenticationManager$AuthAttempt)>
				//*  14   34:ifnull          62
					{
						handler.onAuthenticated(authData);
				//   15   37:aload_0         
				//   16   38:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//   17   41:invokestatic    #43  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$100(AuthenticationManager$AuthAttempt)>
				//   18   44:aload_0         
				//   19   45:getfield        #24  <Field AuthData val$authData>
				//   20   48:invokeinterface #48  <Method void com.firebase.client.Firebase$AuthResultHandler.onAuthenticated(AuthData)>
						handler = null;
				//   21   53:aload_0         
				//   22   54:getfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				//   23   57:aconst_null     
				//   24   58:invokestatic    #52  <Method com.firebase.client.Firebase$AuthResultHandler AuthenticationManager$AuthAttempt.access$102(AuthenticationManager$AuthAttempt, com.firebase.client.Firebase$AuthResultHandler)>
				//   25   61:pop             
					}
				//   26   62:return          
				}

				final AuthenticationManager.AuthAttempt this$1;
				final AuthData val$authData;

			
			{
				this$1 = AuthenticationManager.AuthAttempt.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				authData = authdata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AuthData val$authData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field AuthenticationManager this$0>
	//    8   18:new             #11  <Class AuthenticationManager$AuthAttempt$2>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #54  <Method void AuthenticationManager$AuthAttempt$2(AuthenticationManager$AuthAttempt, AuthData)>
	//   13   27:invokestatic    #47  <Method void AuthenticationManager.access$200(AuthenticationManager, Runnable)>
	//   14   30:return          
	}

	private com.firebase.client.Firebase.AuthResultHandler handler;
	private final com.firebase.client.Firebase.AuthListener legacyListener;
	final AuthenticationManager this$0;


/*
	static com.firebase.client.Firebase.AuthListener access$000(AuthenticationManager$AuthAttempt authenticationmanager$authattempt)
	{
		return authenticationmanager$authattempt.legacyListener;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
	//    2    4:areturn         
	}

*/


/*
	static com.firebase.client.Firebase.AuthResultHandler access$100(AuthenticationManager$AuthAttempt authenticationmanager$authattempt)
	{
		return authenticationmanager$authattempt.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
	//    2    4:areturn         
	}

*/


/*
	static com.firebase.client.Firebase.AuthResultHandler access$102(AuthenticationManager$AuthAttempt authenticationmanager$authattempt, com.firebase.client.Firebase.AuthResultHandler authresulthandler)
	{
		authenticationmanager$authattempt.handler = authresulthandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
		return authresulthandler;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	AuthenticationManager$AuthAttempt(com.firebase.client.Firebase.AuthListener authlistener)
	{
		this$0 = AuthenticationManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AuthenticationManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		legacyListener = authlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
		handler = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
	//   11   19:return          
	}

	AuthenticationManager$AuthAttempt(com.firebase.client.Firebase.AuthResultHandler authresulthandler)
	{
		this$0 = AuthenticationManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AuthenticationManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		handler = authresulthandler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
		legacyListener = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
	//   11   19:return          
	}
}
