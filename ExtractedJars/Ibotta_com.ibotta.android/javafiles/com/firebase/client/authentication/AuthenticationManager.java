// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.firebase.client.*;
import com.firebase.client.core.*;
import com.firebase.client.utilities.*;
import com.firebase.client.utilities.encoding.JsonHelpers;
import com.newrelic.agent.android.instrumentation.ApacheInstrumentation;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.concurrent.Semaphore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.*;

// Referenced classes of package com.firebase.client.authentication:
//			RequestHandler, JsonBasicResponseHandler

public class AuthenticationManager
{
	private class AuthAttempt
	{

		public void fireError(FirebaseError firebaseerror)
		{
			if(legacyListener != null || handler != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
		//*   2    4:ifnonnull       14
		//*   3    7:aload_0         
		//*   4    8:getfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
		//*   5   11:ifnull          30
				fireEvent(((_cls1) (firebaseerror)). new Runnable() {

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

					final AuthAttempt this$1;
					final FirebaseError val$error;

			
			{
				this$1 = final_authattempt;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				error = FirebaseError.this;
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

		public void fireRevoked(FirebaseError firebaseerror)
		{
			if(legacyListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
		//*   2    4:ifnull          23
				fireEvent(((_cls3) (firebaseerror)). new Runnable() {

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

					final AuthAttempt this$1;
					final FirebaseError val$error;

			
			{
				this$1 = final_authattempt;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				error = FirebaseError.this;
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

		public void fireSuccess(AuthData authdata)
		{
			if(legacyListener != null || handler != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
		//*   2    4:ifnonnull       14
		//*   3    7:aload_0         
		//*   4    8:getfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
		//*   5   11:ifnull          30
				fireEvent(((_cls2) (authdata)). new Runnable() {

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

					final AuthAttempt this$1;
					final AuthData val$authData;

			
			{
				this$1 = final_authattempt;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager$AuthAttempt this$1>
				authData = AuthData.this;
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
		static com.firebase.client.Firebase.AuthListener access$000(AuthAttempt authattempt)
		{
			return authattempt.legacyListener;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field com.firebase.client.Firebase$AuthListener legacyListener>
		//    2    4:areturn         
		}

*/


/*
		static com.firebase.client.Firebase.AuthResultHandler access$100(AuthAttempt authattempt)
		{
			return authattempt.handler;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
		//    2    4:areturn         
		}

*/


/*
		static com.firebase.client.Firebase.AuthResultHandler access$102(AuthAttempt authattempt, com.firebase.client.Firebase.AuthResultHandler authresulthandler)
		{
			authattempt.handler = authresulthandler;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field com.firebase.client.Firebase$AuthResultHandler handler>
			return authresulthandler;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		AuthAttempt(com.firebase.client.Firebase.AuthListener authlistener)
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

		AuthAttempt(com.firebase.client.Firebase.AuthResultHandler authresulthandler)
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


	public AuthenticationManager(Context context1, Repo repo1, RepoInfo repoinfo, PersistentConnection persistentconnection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #125 <Field Context context>
		repo = repo1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #127 <Field Repo repo>
		repoInfo = repoinfo;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #129 <Field RepoInfo repoInfo>
		connection = persistentconnection;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #131 <Field PersistentConnection connection>
		authData = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #133 <Field AuthData authData>
		store = context1.getCredentialStore();
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:invokevirtual   #139 <Method CredentialStore Context.getCredentialStore()>
	//   20   35:putfield        #141 <Field CredentialStore store>
		logger = context1.getLogger("AuthenticationManager");
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:ldc1            #92  <String "AuthenticationManager">
	//   24   42:invokevirtual   #145 <Method LogWrapper Context.getLogger(String)>
	//   25   45:putfield        #147 <Field LogWrapper logger>
	//   26   48:aload_0         
	//   27   49:new             #149 <Class HashSet>
	//   28   52:dup             
	//   29   53:invokespecial   #150 <Method void HashSet()>
	//   30   56:putfield        #152 <Field Set listenerSet>
	//   31   59:return          
	}

	private boolean attemptHasBeenPreempted(AuthAttempt authattempt)
	{
		return authattempt != currentAuthAttempt;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
	//    3    5:if_acmpeq       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private void authWithCredential(final String credential, final Map optionalUserData, final AuthAttempt attempt)
	{
		if(attempt == currentAuthAttempt)
	//*   0    0:aload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
	//*   3    5:if_acmpne       87
		{
			if(logger.logsDebug())
	//*   4    8:aload_0         
	//*   5    9:getfield        #147 <Field LogWrapper logger>
	//*   6   12:invokevirtual   #273 <Method boolean LogWrapper.logsDebug()>
	//*   7   15:ifeq            62
			{
				LogWrapper logwrapper = logger;
	//    8   18:aload_0         
	//    9   19:getfield        #147 <Field LogWrapper logger>
	//   10   22:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   11   24:new             #275 <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #276 <Method void StringBuilder()>
	//   14   31:astore          5
				stringbuilder.append("Authenticating with credential of length ");
	//   15   33:aload           5
	//   16   35:ldc2            #278 <String "Authenticating with credential of length ">
	//   17   38:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
				stringbuilder.append(credential.length());
	//   19   42:aload           5
	//   20   44:aload_1         
	//   21   45:invokevirtual   #288 <Method int String.length()>
	//   22   48:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   23   51:pop             
				logwrapper.debug(stringbuilder.toString());
	//   24   52:aload           4
	//   25   54:aload           5
	//   26   56:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   27   59:invokevirtual   #299 <Method void LogWrapper.debug(String)>
			}
			currentAuthAttempt = null;
	//   28   62:aload_0         
	//   29   63:aconst_null     
	//   30   64:putfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
			connection.auth(credential, new com.firebase.client.Firebase.AuthListener() {

				public void onAuthError(FirebaseError firebaseerror)
				{
					handleBadAuthStatus(firebaseerror, attempt, false);
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
					handleBadAuthStatus(firebaseerror, attempt, true);
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
					handleAuthSuccess(credential, (Map)obj, optionalUserData, true, attempt);
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
				final AuthAttempt val$attempt;
				final String val$credential;
				final Map val$optionalUserData;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AuthenticationManager this$0>
				credential = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String val$credential>
				optionalUserData = map;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Map val$optionalUserData>
				attempt = authattempt;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field AuthenticationManager$AuthAttempt val$attempt>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   31   67:aload_0         
	//   32   68:getfield        #131 <Field PersistentConnection connection>
	//   33   71:aload_1         
	//   34   72:new             #12  <Class AuthenticationManager$11>
	//   35   75:dup             
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:aload_3         
	//   40   80:invokespecial   #301 <Method void AuthenticationManager$11(AuthenticationManager, String, Map, AuthenticationManager$AuthAttempt)>
	//   41   83:invokevirtual   #307 <Method void PersistentConnection.auth(String, com.firebase.client.Firebase$AuthListener)>
			return;
	//   42   86:return          
		} else
		{
			throw new IllegalStateException("Ooops. We messed up tracking which authentications are running!");
	//   43   87:new             #309 <Class IllegalStateException>
	//   44   90:dup             
	//   45   91:ldc2            #311 <String "Ooops. We messed up tracking which authentications are running!">
	//   46   94:invokespecial   #313 <Method void IllegalStateException(String)>
	//   47   97:athrow          
		}
	}

	private String buildUrlPath(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #275 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #276 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("/v2/");
	//    4    8:aload_2         
	//    5    9:ldc2            #319 <String "/v2/">
	//    6   12:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(repoInfo.namespace);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #129 <Field RepoInfo repoInfo>
	//   11   21:getfield        #324 <Field String RepoInfo.namespace>
	//   12   24:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		if(!s.startsWith("/"))
	//*  14   28:aload_1         
	//*  15   29:ldc2            #326 <String "/">
	//*  16   32:invokevirtual   #330 <Method boolean String.startsWith(String)>
	//*  17   35:ifne            46
			stringbuilder.append("/");
	//   18   38:aload_2         
	//   19   39:ldc2            #326 <String "/">
	//   20   42:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
		stringbuilder.append(s);
	//   22   46:aload_2         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		return stringbuilder.toString();
	//   26   52:aload_2         
	//   27   53:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   28   56:areturn         
	}

	private void checkServerSettings()
	{
		if(repoInfo.isDemoHost())
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field RepoInfo repoInfo>
	//*   2    4:invokevirtual   #334 <Method boolean RepoInfo.isDemoHost()>
	//*   3    7:ifeq            21
		{
			logger.warn("Firebase authentication is supported on production Firebases only (*.firebaseio.com). To secure your Firebase, create a production Firebase at https://www.firebase.com.");
	//    4   10:aload_0         
	//    5   11:getfield        #147 <Field LogWrapper logger>
	//    6   14:ldc2            #336 <String "Firebase authentication is supported on production Firebases only (*.firebaseio.com). To secure your Firebase, create a production Firebase at https://www.firebase.com.">
	//    7   17:invokevirtual   #339 <Method void LogWrapper.warn(String)>
			return;
	//    8   20:return          
		}
		if(repoInfo.isCustomHost())
	//*   9   21:aload_0         
	//*  10   22:getfield        #129 <Field RepoInfo repoInfo>
	//*  11   25:invokevirtual   #342 <Method boolean RepoInfo.isCustomHost()>
	//*  12   28:ifeq            53
		{
			if(context.isCustomAuthenticationServerSet())
	//*  13   31:aload_0         
	//*  14   32:getfield        #125 <Field Context context>
	//*  15   35:invokevirtual   #345 <Method boolean Context.isCustomAuthenticationServerSet()>
	//*  16   38:ifeq            42
				return;
	//   17   41:return          
			else
				throw new IllegalStateException("For a custom firebase host you must first set your authentication server before using authentication features!");
	//   18   42:new             #309 <Class IllegalStateException>
	//   19   45:dup             
	//   20   46:ldc2            #347 <String "For a custom firebase host you must first set your authentication server before using authentication features!">
	//   21   49:invokespecial   #313 <Method void IllegalStateException(String)>
	//   22   52:athrow          
		} else
		{
			return;
	//   23   53:return          
		}
	}

	private boolean clearSession()
	{
		String s = getFirebaseCredentialIdentifier();
	//    0    0:aload_0         
	//    1    1:invokespecial   #350 <Method String getFirebaseCredentialIdentifier()>
	//    2    4:astore_1        
		String s1 = context.getSessionPersistenceKey();
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field Context context>
	//    5    9:invokevirtual   #353 <Method String Context.getSessionPersistenceKey()>
	//    6   12:astore_2        
		if(logger.logsDebug())
	//*   7   13:aload_0         
	//*   8   14:getfield        #147 <Field LogWrapper logger>
	//*   9   17:invokevirtual   #273 <Method boolean LogWrapper.logsDebug()>
	//*  10   20:ifeq            87
		{
			LogWrapper logwrapper = logger;
	//   11   23:aload_0         
	//   12   24:getfield        #147 <Field LogWrapper logger>
	//   13   27:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #275 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #276 <Method void StringBuilder()>
	//   17   35:astore          4
			stringbuilder.append("Clearing credentials for Firebase \"");
	//   18   37:aload           4
	//   19   39:ldc2            #355 <String "Clearing credentials for Firebase \"">
	//   20   42:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(s);
	//   22   46:aload           4
	//   23   48:aload_1         
	//   24   49:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
			stringbuilder.append("\" and session \"");
	//   26   53:aload           4
	//   27   55:ldc2            #357 <String "\" and session \"">
	//   28   58:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append(s1);
	//   30   62:aload           4
	//   31   64:aload_2         
	//   32   65:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
			stringbuilder.append("\".");
	//   34   69:aload           4
	//   35   71:ldc2            #359 <String "\".">
	//   36   74:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			logwrapper.debug(stringbuilder.toString());
	//   38   78:aload_3         
	//   39   79:aload           4
	//   40   81:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   41   84:invokevirtual   #299 <Method void LogWrapper.debug(String)>
		}
		return store.clearCredential(s, s1);
	//   42   87:aload_0         
	//   43   88:getfield        #141 <Field CredentialStore store>
	//   44   91:aload_1         
	//   45   92:aload_2         
	//   46   93:invokeinterface #365 <Method boolean CredentialStore.clearCredential(String, String)>
	//   47   98:ireturn         
	}

	private FirebaseError decodeErrorResponse(Object obj)
	{
		String s2 = (String)Utilities.getOrNull(obj, "code", java/lang/String);
	//    0    0:aload_1         
	//    1    1:ldc2            #367 <String "code">
	//    2    4:ldc2            #284 <Class String>
	//    3    7:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//    4   10:checkcast       #284 <Class String>
	//    5   13:astore          4
		String s = (String)Utilities.getOrNull(obj, "message", java/lang/String);
	//    6   15:aload_1         
	//    7   16:ldc2            #375 <String "message">
	//    8   19:ldc2            #284 <Class String>
	//    9   22:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   10   25:checkcast       #284 <Class String>
	//   11   28:astore_2        
		String s1 = (String)Utilities.getOrNull(obj, "details", java/lang/String);
	//   12   29:aload_1         
	//   13   30:ldc2            #377 <String "details">
	//   14   33:ldc2            #284 <Class String>
	//   15   36:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   16   39:checkcast       #284 <Class String>
	//   17   42:astore_3        
		if(s2 != null)
	//*  18   43:aload           4
	//*  19   45:ifnull          56
			return FirebaseError.fromStatus(s2, s, s1);
	//   20   48:aload           4
	//   21   50:aload_2         
	//   22   51:aload_3         
	//   23   52:invokestatic    #383 <Method FirebaseError FirebaseError.fromStatus(String, String, String)>
	//   24   55:areturn         
		obj = ((Object) (s));
	//   25   56:aload_2         
	//   26   57:astore_1        
		if(s == null)
	//*  27   58:aload_2         
	//*  28   59:ifnonnull       66
			obj = "Error while authenticating.";
	//   29   62:ldc2            #385 <String "Error while authenticating.">
	//   30   65:astore_1        
		return new FirebaseError(-999, ((String) (obj)), s1);
	//   31   66:new             #379 <Class FirebaseError>
	//   32   69:dup             
	//   33   70:sipush          -999
	//   34   73:aload_1         
	//   35   74:aload_3         
	//   36   75:invokespecial   #388 <Method void FirebaseError(int, String, String)>
	//   37   78:areturn         
	}

	private void fireAuthErrorIfNotPreempted(final FirebaseError error, final AuthAttempt attempt)
	{
		if(!attemptHasBeenPreempted(attempt))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokespecial   #254 <Method boolean attemptHasBeenPreempted(AuthenticationManager$AuthAttempt)>
	//*   3    5:ifne            31
		{
			if(attempt != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          26
				fireEvent(new Runnable() {

					public void run()
					{
						attempt.fireError(error);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field AuthenticationManager$AuthAttempt val$attempt>
					//    2    4:aload_0         
					//    3    5:getfield        #25  <Field FirebaseError val$error>
					//    4    8:invokevirtual   #36  <Method void AuthenticationManager$AuthAttempt.fireError(FirebaseError)>
					//    5   11:return          
					}

					final AuthenticationManager this$0;
					final AuthAttempt val$attempt;
					final FirebaseError val$error;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				attempt = authattempt;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AuthenticationManager$AuthAttempt val$attempt>
				error = firebaseerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field FirebaseError val$error>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//    6   12:aload_0         
	//    7   13:new             #48  <Class AuthenticationManager$4>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokespecial   #391 <Method void AuthenticationManager$4(AuthenticationManager, AuthenticationManager$AuthAttempt, FirebaseError)>
	//   13   23:invokespecial   #201 <Method void fireEvent(Runnable)>
			currentAuthAttempt = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
		}
	//   17   31:return          
	}

	private void fireEvent(Runnable runnable)
	{
		context.getEventTarget().postEvent(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Context context>
	//    2    4:invokevirtual   #395 <Method EventTarget Context.getEventTarget()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #400 <Method void EventTarget.postEvent(Runnable)>
	//    5   13:return          
	}

	private void fireOnError(final com.firebase.client.Firebase.ValueResultHandler handler, final FirebaseError error)
	{
		if(handler != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			fireEvent(new Runnable() {

				public void run()
				{
					handler.onError(error);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field FirebaseError val$error>
				//    4    8:invokeinterface #36  <Method void com.firebase.client.Firebase$ValueResultHandler.onError(FirebaseError)>
				//    5   13:return          
				}

				final AuthenticationManager this$0;
				final FirebaseError val$error;
				final com.firebase.client.Firebase.ValueResultHandler val$handler;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				handler = valueresulthandler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
				error = firebaseerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field FirebaseError val$error>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    2    4:aload_0         
	//    3    5:new             #34  <Class AuthenticationManager$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #402 <Method void AuthenticationManager$2(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, FirebaseError)>
	//    9   15:invokespecial   #201 <Method void fireEvent(Runnable)>
	//   10   18:return          
	}

	private void fireOnSuccess(final com.firebase.client.Firebase.ValueResultHandler handler, final Object result)
	{
		if(handler != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			fireEvent(new Runnable() {

				public void run()
				{
					handler.onSuccess(result);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field Object val$result>
				//    4    8:invokeinterface #36  <Method void com.firebase.client.Firebase$ValueResultHandler.onSuccess(Object)>
				//    5   13:return          
				}

				final AuthenticationManager this$0;
				final com.firebase.client.Firebase.ValueResultHandler val$handler;
				final Object val$result;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				handler = valueresulthandler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
				result = obj;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Object val$result>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class AuthenticationManager$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #404 <Method void AuthenticationManager$1(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, Object)>
	//    9   15:invokespecial   #201 <Method void fireEvent(Runnable)>
	//   10   18:return          
	}

	private String getFirebaseCredentialIdentifier()
	{
		return repoInfo.host;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field RepoInfo repoInfo>
	//    2    4:getfield        #407 <Field String RepoInfo.host>
	//    3    7:areturn         
	}

	private void handleAuthSuccess(String s, Map map, Map map1, boolean flag, AuthAttempt authattempt)
	{
		if(flag && (map.get("auth") != null || map.get("expires") != null) && !saveSession(s, map, map1))
	//*   0    0:iload           4
	//*   1    2:ifeq            49
	//*   2    5:aload_2         
	//*   3    6:ldc2            #408 <String "auth">
	//*   4    9:invokeinterface #414 <Method Object Map.get(Object)>
	//*   5   14:ifnonnull       29
	//*   6   17:aload_2         
	//*   7   18:ldc2            #416 <String "expires">
	//*   8   21:invokeinterface #414 <Method Object Map.get(Object)>
	//*   9   26:ifnull          49
	//*  10   29:aload_0         
	//*  11   30:aload_1         
	//*  12   31:aload_2         
	//*  13   32:aload_3         
	//*  14   33:invokespecial   #420 <Method boolean saveSession(String, Map, Map)>
	//*  15   36:ifne            49
			logger.warn("Failed to store credentials! Authentication will not be persistent!");
	//   16   39:aload_0         
	//   17   40:getfield        #147 <Field LogWrapper logger>
	//   18   43:ldc2            #422 <String "Failed to store credentials! Authentication will not be persistent!">
	//   19   46:invokevirtual   #339 <Method void LogWrapper.warn(String)>
		s = ((String) (parseAuthData(s, map, map1)));
	//   20   49:aload_0         
	//   21   50:aload_1         
	//   22   51:aload_2         
	//   23   52:aload_3         
	//   24   53:invokespecial   #426 <Method AuthData parseAuthData(String, Map, Map)>
	//   25   56:astore_1        
		updateAuthState(((AuthData) (s)));
	//   26   57:aload_0         
	//   27   58:aload_1         
	//   28   59:invokespecial   #183 <Method void updateAuthState(AuthData)>
		if(authattempt != null)
	//*  29   62:aload           5
	//*  30   64:ifnull          73
			authattempt.fireSuccess(((AuthData) (s)));
	//   31   67:aload           5
	//   32   69:aload_1         
	//   33   70:invokevirtual   #429 <Method void AuthenticationManager$AuthAttempt.fireSuccess(AuthData)>
		if(connection.writesPaused())
	//*  34   73:aload_0         
	//*  35   74:getfield        #131 <Field PersistentConnection connection>
	//*  36   77:invokevirtual   #432 <Method boolean PersistentConnection.writesPaused()>
	//*  37   80:ifeq            110
		{
			if(logger.logsDebug())
	//*  38   83:aload_0         
	//*  39   84:getfield        #147 <Field LogWrapper logger>
	//*  40   87:invokevirtual   #273 <Method boolean LogWrapper.logsDebug()>
	//*  41   90:ifeq            103
				logger.debug("Unpausing writes after successful login.");
	//   42   93:aload_0         
	//   43   94:getfield        #147 <Field LogWrapper logger>
	//   44   97:ldc2            #434 <String "Unpausing writes after successful login.">
	//   45  100:invokevirtual   #299 <Method void LogWrapper.debug(String)>
			connection.unpauseWrites();
	//   46  103:aload_0         
	//   47  104:getfield        #131 <Field PersistentConnection connection>
	//   48  107:invokevirtual   #437 <Method void PersistentConnection.unpauseWrites()>
		}
	//   49  110:return          
	}

	private void handleBadAuthStatus(FirebaseError firebaseerror, AuthAttempt authattempt, boolean flag)
	{
		boolean flag1;
		if(firebaseerror.getCode() == -6)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #441 <Method int FirebaseError.getCode()>
	//*   2    4:bipush          -6
	//*   3    6:icmpne          15
			flag1 = true;
	//    4    9:iconst_1        
	//    5   10:istore          4
		else
	//*   6   12:goto            18
			flag1 = false;
	//    7   15:iconst_0        
	//    8   16:istore          4
		if(flag1 && context.getAuthExpirationBehavior() == AuthExpirationBehavior.PAUSE_WRITES_UNTIL_REAUTH)
	//*   9   18:iload           4
	//*  10   20:ifeq            66
	//*  11   23:aload_0         
	//*  12   24:getfield        #125 <Field Context context>
	//*  13   27:invokevirtual   #445 <Method AuthExpirationBehavior Context.getAuthExpirationBehavior()>
	//*  14   30:getstatic       #451 <Field AuthExpirationBehavior AuthExpirationBehavior.PAUSE_WRITES_UNTIL_REAUTH>
	//*  15   33:if_acmpne       66
		{
			if(logger.logsDebug())
	//*  16   36:aload_0         
	//*  17   37:getfield        #147 <Field LogWrapper logger>
	//*  18   40:invokevirtual   #273 <Method boolean LogWrapper.logsDebug()>
	//*  19   43:ifeq            56
				logger.debug("Pausing writes due to expired token.");
	//   20   46:aload_0         
	//   21   47:getfield        #147 <Field LogWrapper logger>
	//   22   50:ldc2            #453 <String "Pausing writes due to expired token.">
	//   23   53:invokevirtual   #299 <Method void LogWrapper.debug(String)>
			connection.pauseWrites();
	//   24   56:aload_0         
	//   25   57:getfield        #131 <Field PersistentConnection connection>
	//   26   60:invokevirtual   #456 <Method void PersistentConnection.pauseWrites()>
		} else
	//*  27   63:goto            104
		if(connection.writesPaused())
	//*  28   66:aload_0         
	//*  29   67:getfield        #131 <Field PersistentConnection connection>
	//*  30   70:invokevirtual   #432 <Method boolean PersistentConnection.writesPaused()>
	//*  31   73:ifeq            99
		{
			if(logger.logsDebug())
	//*  32   76:aload_0         
	//*  33   77:getfield        #147 <Field LogWrapper logger>
	//*  34   80:invokevirtual   #273 <Method boolean LogWrapper.logsDebug()>
	//*  35   83:ifeq            104
				logger.debug("Invalid auth while writes are paused; keeping existing session.");
	//   36   86:aload_0         
	//   37   87:getfield        #147 <Field LogWrapper logger>
	//   38   90:ldc2            #458 <String "Invalid auth while writes are paused; keeping existing session.">
	//   39   93:invokevirtual   #299 <Method void LogWrapper.debug(String)>
		} else
	//*  40   96:goto            104
		{
			clearSession();
	//   41   99:aload_0         
	//   42  100:invokespecial   #189 <Method boolean clearSession()>
	//   43  103:pop             
		}
		updateAuthState(((AuthData) (null)));
	//   44  104:aload_0         
	//   45  105:aconst_null     
	//   46  106:invokespecial   #183 <Method void updateAuthState(AuthData)>
		if(authattempt != null)
	//*  47  109:aload_2         
	//*  48  110:ifnull          128
		{
			if(flag)
	//*  49  113:iload_3         
	//*  50  114:ifeq            123
			{
				authattempt.fireRevoked(firebaseerror);
	//   51  117:aload_2         
	//   52  118:aload_1         
	//   53  119:invokevirtual   #462 <Method void AuthenticationManager$AuthAttempt.fireRevoked(FirebaseError)>
				return;
	//   54  122:return          
			}
			authattempt.fireError(firebaseerror);
	//   55  123:aload_2         
	//   56  124:aload_1         
	//   57  125:invokevirtual   #465 <Method void AuthenticationManager$AuthAttempt.fireError(FirebaseError)>
		}
	//   58  128:return          
	}

	private com.firebase.client.Firebase.ValueResultHandler ignoreResultValueHandler(final com.firebase.client.Firebase.ResultHandler handler)
	{
		return new com.firebase.client.Firebase.ValueResultHandler() {

			public void onError(FirebaseError firebaseerror)
			{
				handler.onError(firebaseerror);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field com.firebase.client.Firebase$ResultHandler val$handler>
			//    2    4:aload_1         
			//    3    5:invokeinterface #31  <Method void com.firebase.client.Firebase$ResultHandler.onError(FirebaseError)>
			//    4   10:return          
			}

			public void onSuccess(Object obj)
			{
				handler.onSuccess();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field com.firebase.client.Firebase$ResultHandler val$handler>
			//    2    4:invokeinterface #35  <Method void com.firebase.client.Firebase$ResultHandler.onSuccess()>
			//    3    9:return          
			}

			final AuthenticationManager this$0;
			final com.firebase.client.Firebase.ResultHandler val$handler;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager this$0>
				handler = resulthandler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.firebase.client.Firebase$ResultHandler val$handler>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #46  <Class AuthenticationManager$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #470 <Method void AuthenticationManager$3(AuthenticationManager, com.firebase.client.Firebase$ResultHandler)>
	//    5    9:areturn         
	}

	private void makeAuthenticationRequest(String s, Map map, final com.firebase.client.Firebase.AuthResultHandler attempt)
	{
		attempt = ((com.firebase.client.Firebase.AuthResultHandler) (newAuthAttempt(attempt)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #213 <Method AuthenticationManager$AuthAttempt newAuthAttempt(com.firebase.client.Firebase$AuthResultHandler)>
	//    3    5:astore_3        
		makeRequest(s, com.firebase.client.utilities.HttpUtilities.HttpRequestType.GET, map, Collections.emptyMap(), new RequestHandler() {

			public void onError(IOException ioexception)
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #29  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #30  <Method void StringBuilder()>
			//    3    7:astore_2        
				stringbuilder.append("There was an exception while connecting to the authentication server: ");
			//    4    8:aload_2         
			//    5    9:ldc1            #32  <String "There was an exception while connecting to the authentication server: ">
			//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(ioexception.getLocalizedMessage());
			//    8   15:aload_2         
			//    9   16:aload_1         
			//   10   17:invokevirtual   #42  <Method String IOException.getLocalizedMessage()>
			//   11   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//   12   23:pop             
				ioexception = ((IOException) (new FirebaseError(-24, stringbuilder.toString())));
			//   13   24:new             #44  <Class FirebaseError>
			//   14   27:dup             
			//   15   28:bipush          -24
			//   16   30:aload_2         
			//   17   31:invokevirtual   #47  <Method String StringBuilder.toString()>
			//   18   34:invokespecial   #50  <Method void FirebaseError(int, String)>
			//   19   37:astore_1        
				fireAuthErrorIfNotPreempted(((FirebaseError) (ioexception)), attempt);
			//   20   38:aload_0         
			//   21   39:getfield        #19  <Field AuthenticationManager this$0>
			//   22   42:aload_1         
			//   23   43:aload_0         
			//   24   44:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
			//   25   47:invokestatic    #54  <Method void AuthenticationManager.access$1000(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt)>
			//   26   50:return          
			}

			public void onResult(Map map1)
			{
				Object obj = map1.get("error");
			//    0    0:aload_1         
			//    1    1:ldc1            #58  <String "error">
			//    2    3:invokeinterface #64  <Method Object Map.get(Object)>
			//    3    8:astore_2        
				String s1 = (String)Utilities.getOrNull(((Object) (map1)), "token", java/lang/String);
			//    4    9:aload_1         
			//    5   10:ldc1            #66  <String "token">
			//    6   12:ldc1            #68  <Class String>
			//    7   14:invokestatic    #74  <Method Object Utilities.getOrNull(Object, String, Class)>
			//    8   17:checkcast       #68  <Class String>
			//    9   20:astore_3        
				if(obj == null && s1 != null)
			//*  10   21:aload_2         
			//*  11   22:ifnonnull       57
			//*  12   25:aload_3         
			//*  13   26:ifnull          57
				{
					if(!attemptHasBeenPreempted(attempt))
			//*  14   29:aload_0         
			//*  15   30:getfield        #19  <Field AuthenticationManager this$0>
			//*  16   33:aload_0         
			//*  17   34:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
			//*  18   37:invokestatic    #78  <Method boolean AuthenticationManager.access$700(AuthenticationManager, AuthenticationManager$AuthAttempt)>
			//*  19   40:ifne            78
					{
						authWithCredential(s1, map1, attempt);
			//   20   43:aload_0         
			//   21   44:getfield        #19  <Field AuthenticationManager this$0>
			//   22   47:aload_3         
			//   23   48:aload_1         
			//   24   49:aload_0         
			//   25   50:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
			//   26   53:invokestatic    #82  <Method void AuthenticationManager.access$800(AuthenticationManager, String, Map, AuthenticationManager$AuthAttempt)>
						return;
			//   27   56:return          
					}
				} else
				{
					map1 = ((Map) (decodeErrorResponse(obj)));
			//   28   57:aload_0         
			//   29   58:getfield        #19  <Field AuthenticationManager this$0>
			//   30   61:aload_2         
			//   31   62:invokestatic    #86  <Method FirebaseError AuthenticationManager.access$900(AuthenticationManager, Object)>
			//   32   65:astore_1        
					fireAuthErrorIfNotPreempted(((FirebaseError) (map1)), attempt);
			//   33   66:aload_0         
			//   34   67:getfield        #19  <Field AuthenticationManager this$0>
			//   35   70:aload_1         
			//   36   71:aload_0         
			//   37   72:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
			//   38   75:invokestatic    #54  <Method void AuthenticationManager.access$1000(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt)>
				}
			//   39   78:return          
			}

			final AuthenticationManager this$0;
			final AuthAttempt val$attempt;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager this$0>
				attempt = authattempt;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getstatic       #476 <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.GET>
	//    7   11:aload_2         
	//    8   12:invokestatic    #482 <Method Map Collections.emptyMap()>
	//    9   15:new             #64  <Class AuthenticationManager$9>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:invokespecial   #485 <Method void AuthenticationManager$9(AuthenticationManager, AuthenticationManager$AuthAttempt)>
	//   14   24:invokespecial   #489 <Method void makeRequest(String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, RequestHandler)>
	//   15   27:return          
	}

	private void makeOperationRequest(String s, com.firebase.client.utilities.HttpUtilities.HttpRequestType httprequesttype, Map map, Map map1, com.firebase.client.Firebase.ResultHandler resulthandler, boolean flag)
	{
		makeOperationRequestWithResult(s, httprequesttype, map, map1, ignoreResultValueHandler(resulthandler), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload_0         
	//    6    7:aload           5
	//    7    9:invokespecial   #492 <Method com.firebase.client.Firebase$ValueResultHandler ignoreResultValueHandler(com.firebase.client.Firebase$ResultHandler)>
	//    8   12:iload           6
	//    9   14:invokespecial   #224 <Method void makeOperationRequestWithResult(String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ValueResultHandler, boolean)>
	//   10   17:return          
	}

	private void makeOperationRequestWithResult(String s, com.firebase.client.utilities.HttpUtilities.HttpRequestType httprequesttype, Map map, Map map1, final com.firebase.client.Firebase.ValueResultHandler handler, final boolean logUserOut)
	{
		makeRequest(s, httprequesttype, map, map1, new RequestHandler() {

			public void onError(IOException ioexception)
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #35  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #36  <Method void StringBuilder()>
			//    3    7:astore_2        
				stringbuilder.append("There was an exception while performing the request: ");
			//    4    8:aload_2         
			//    5    9:ldc1            #38  <String "There was an exception while performing the request: ">
			//    6   11:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(ioexception.getLocalizedMessage());
			//    8   15:aload_2         
			//    9   16:aload_1         
			//   10   17:invokevirtual   #48  <Method String IOException.getLocalizedMessage()>
			//   11   20:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
			//   12   23:pop             
				ioexception = ((IOException) (new FirebaseError(-24, stringbuilder.toString())));
			//   13   24:new             #50  <Class FirebaseError>
			//   14   27:dup             
			//   15   28:bipush          -24
			//   16   30:aload_2         
			//   17   31:invokevirtual   #53  <Method String StringBuilder.toString()>
			//   18   34:invokespecial   #56  <Method void FirebaseError(int, String)>
			//   19   37:astore_1        
				fireOnError(handler, ((FirebaseError) (ioexception)));
			//   20   38:aload_0         
			//   21   39:getfield        #23  <Field AuthenticationManager this$0>
			//   22   42:aload_0         
			//   23   43:getfield        #27  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
			//   24   46:aload_1         
			//   25   47:invokestatic    #60  <Method void AuthenticationManager.access$1300(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, FirebaseError)>
			//   26   50:return          
			}

			public void onResult(Map map2)
			{
				Object obj = map2.get("error");
			//    0    0:aload_1         
			//    1    1:ldc1            #64  <String "error">
			//    2    3:invokeinterface #70  <Method Object Map.get(Object)>
			//    3    8:astore_2        
				if(obj == null)
			//*   4    9:aload_2         
			//*   5   10:ifnonnull       89
				{
					if(logUserOut)
			//*   6   13:aload_0         
			//*   7   14:getfield        #25  <Field boolean val$logUserOut>
			//*   8   17:ifeq            72
					{
						obj = ((Object) ((String)Utilities.getOrNull(((Object) (map2)), "uid", java/lang/String)));
			//    9   20:aload_1         
			//   10   21:ldc1            #72  <String "uid">
			//   11   23:ldc1            #74  <Class String>
			//   12   25:invokestatic    #80  <Method Object Utilities.getOrNull(Object, String, Class)>
			//   13   28:checkcast       #74  <Class String>
			//   14   31:astore_2        
						if(obj != null && authData != null && ((String) (obj)).equals(((Object) (authData.getUid()))))
			//*  15   32:aload_2         
			//*  16   33:ifnull          72
			//*  17   36:aload_0         
			//*  18   37:getfield        #23  <Field AuthenticationManager this$0>
			//*  19   40:invokestatic    #84  <Method AuthData AuthenticationManager.access$1100(AuthenticationManager)>
			//*  20   43:ifnull          72
			//*  21   46:aload_2         
			//*  22   47:aload_0         
			//*  23   48:getfield        #23  <Field AuthenticationManager this$0>
			//*  24   51:invokestatic    #84  <Method AuthData AuthenticationManager.access$1100(AuthenticationManager)>
			//*  25   54:invokevirtual   #89  <Method String AuthData.getUid()>
			//*  26   57:invokevirtual   #93  <Method boolean String.equals(Object)>
			//*  27   60:ifeq            72
							unauth(((com.firebase.client.Firebase.CompletionListener) (null)), false);
			//   28   63:aload_0         
			//   29   64:getfield        #23  <Field AuthenticationManager this$0>
			//   30   67:aconst_null     
			//   31   68:iconst_0        
			//   32   69:invokevirtual   #97  <Method void AuthenticationManager.unauth(com.firebase.client.Firebase$CompletionListener, boolean)>
					}
					scheduleNow(((_cls1) (map2)). new Runnable() {

						public void run()
						{
							fireOnSuccess(handler, ((Object) (result)));
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field AuthenticationManager$10 this$1>
						//    2    4:getfield        #30  <Field AuthenticationManager AuthenticationManager$10.this$0>
						//    3    7:aload_0         
						//    4    8:getfield        #19  <Field AuthenticationManager$10 this$1>
						//    5   11:getfield        #34  <Field com.firebase.client.Firebase$ValueResultHandler AuthenticationManager$10.val$handler>
						//    6   14:aload_0         
						//    7   15:getfield        #21  <Field Map val$result>
						//    8   18:invokestatic    #40  <Method void AuthenticationManager.access$1200(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, Object)>
						//    9   21:return          
						}

						final _cls10 this$1;
						final Map val$result;

			
			{
				this$1 = final__pcls10;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager$10 this$1>
				result = Map.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Map val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//   33   72:aload_0         
			//   34   73:getfield        #23  <Field AuthenticationManager this$0>
			//   35   76:new             #13  <Class AuthenticationManager$10$1>
			//   36   79:dup             
			//   37   80:aload_0         
			//   38   81:aload_1         
			//   39   82:invokespecial   #100 <Method void AuthenticationManager$10$1(AuthenticationManager$10, Map)>
			//   40   85:invokestatic    #104 <Method void AuthenticationManager.access$600(AuthenticationManager, Runnable)>
					return;
			//   41   88:return          
				} else
				{
					map2 = ((Map) (decodeErrorResponse(obj)));
			//   42   89:aload_0         
			//   43   90:getfield        #23  <Field AuthenticationManager this$0>
			//   44   93:aload_2         
			//   45   94:invokestatic    #108 <Method FirebaseError AuthenticationManager.access$900(AuthenticationManager, Object)>
			//   46   97:astore_1        
					fireOnError(handler, ((FirebaseError) (map2)));
			//   47   98:aload_0         
			//   48   99:getfield        #23  <Field AuthenticationManager this$0>
			//   49  102:aload_0         
			//   50  103:getfield        #27  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
			//   51  106:aload_1         
			//   52  107:invokestatic    #60  <Method void AuthenticationManager.access$1300(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, FirebaseError)>
					return;
			//   53  110:return          
				}
			}

			final AuthenticationManager this$0;
			final com.firebase.client.Firebase.ValueResultHandler val$handler;
			final boolean val$logUserOut;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AuthenticationManager this$0>
				logUserOut = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field boolean val$logUserOut>
				handler = valueresulthandler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:new             #8   <Class AuthenticationManager$10>
	//    6    9:dup             
	//    7   10:aload_0         
	//    8   11:iload           6
	//    9   13:aload           5
	//   10   15:invokespecial   #496 <Method void AuthenticationManager$10(AuthenticationManager, boolean, com.firebase.client.Firebase$ValueResultHandler)>
	//   11   18:invokespecial   #489 <Method void makeRequest(String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, RequestHandler)>
	//   12   21:return          
	}

	private void makeRequest(final String request, com.firebase.client.utilities.HttpUtilities.HttpRequestType httprequesttype, Map map, Map map1, final RequestHandler handler)
	{
		map = ((Map) (new HashMap(map)));
	//    0    0:new             #499 <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #502 <Method void HashMap(Map)>
	//    4    8:astore_3        
		map.put("transport", "json");
	//    5    9:aload_3         
	//    6   10:ldc2            #504 <String "transport">
	//    7   13:ldc2            #506 <String "json">
	//    8   16:invokeinterface #510 <Method Object Map.put(Object, Object)>
	//    9   21:pop             
		map.put("v", ((Object) (context.getPlatformVersion())));
	//   10   22:aload_3         
	//   11   23:ldc2            #512 <String "v">
	//   12   26:aload_0         
	//   13   27:getfield        #125 <Field Context context>
	//   14   30:invokevirtual   #515 <Method String Context.getPlatformVersion()>
	//   15   33:invokeinterface #510 <Method Object Map.put(Object, Object)>
	//   16   38:pop             
		request = ((String) (HttpUtilities.requestWithType(context.getAuthenticationServer(), buildUrlPath(request), httprequesttype, map, map1)));
	//   17   39:aload_0         
	//   18   40:getfield        #125 <Field Context context>
	//   19   43:invokevirtual   #518 <Method String Context.getAuthenticationServer()>
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:invokespecial   #520 <Method String buildUrlPath(String)>
	//   23   51:aload_2         
	//   24   52:aload_3         
	//   25   53:aload           4
	//   26   55:invokestatic    #526 <Method HttpUriRequest HttpUtilities.requestWithType(String, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map)>
	//   27   58:astore_1        
		if(logger.logsDebug())
	//*  28   59:aload_0         
	//*  29   60:getfield        #147 <Field LogWrapper logger>
	//*  30   63:invokevirtual   #273 <Method boolean LogWrapper.logsDebug()>
	//*  31   66:ifeq            145
		{
			httprequesttype = ((com.firebase.client.utilities.HttpUtilities.HttpRequestType) (((HttpUriRequest) (request)).getURI()));
	//   32   69:aload_1         
	//   33   70:invokeinterface #532 <Method URI HttpUriRequest.getURI()>
	//   34   75:astore_2        
			map = ((Map) (((URI) (httprequesttype)).getScheme()));
	//   35   76:aload_2         
	//   36   77:invokevirtual   #537 <Method String URI.getScheme()>
	//   37   80:astore_3        
			map1 = ((Map) (((URI) (httprequesttype)).getAuthority()));
	//   38   81:aload_2         
	//   39   82:invokevirtual   #540 <Method String URI.getAuthority()>
	//   40   85:astore          4
			String s = ((URI) (httprequesttype)).getPath();
	//   41   87:aload_2         
	//   42   88:invokevirtual   #543 <Method String URI.getPath()>
	//   43   91:astore          7
			int i = ((URI) (httprequesttype)).getQuery().split("&").length;
	//   44   93:aload_2         
	//   45   94:invokevirtual   #546 <Method String URI.getQuery()>
	//   46   97:ldc2            #548 <String "&">
	//   47  100:invokevirtual   #552 <Method String[] String.split(String)>
	//   48  103:arraylength     
	//   49  104:istore          6
			logger.debug(String.format("Sending request to %s://%s%s with %d query params", new Object[] {
				map, map1, s, Integer.valueOf(i)
			}));
	//   50  106:aload_0         
	//   51  107:getfield        #147 <Field LogWrapper logger>
	//   52  110:ldc2            #554 <String "Sending request to %s://%s%s with %d query params">
	//   53  113:iconst_4        
	//   54  114:anewarray       Object[]
	//   55  117:dup             
	//   56  118:iconst_0        
	//   57  119:aload_3         
	//   58  120:aastore         
	//   59  121:dup             
	//   60  122:iconst_1        
	//   61  123:aload           4
	//   62  125:aastore         
	//   63  126:dup             
	//   64  127:iconst_2        
	//   65  128:aload           7
	//   66  130:aastore         
	//   67  131:dup             
	//   68  132:iconst_3        
	//   69  133:iload           6
	//   70  135:invokestatic    #560 <Method Integer Integer.valueOf(int)>
	//   71  138:aastore         
	//   72  139:invokestatic    #564 <Method String String.format(String, Object[])>
	//   73  142:invokevirtual   #299 <Method void LogWrapper.debug(String)>
		}
		context.runBackgroundTask(new Runnable() {

			public void run()
			{
				Object obj;
				obj = ((Object) (new BasicHttpParams()));
			//    0    0:new             #39  <Class BasicHttpParams>
			//    1    3:dup             
			//    2    4:invokespecial   #40  <Method void BasicHttpParams()>
			//    3    7:astore_1        
				HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 20000);
			//    4    8:aload_1         
			//    5    9:sipush          20000
			//    6   12:invokestatic    #46  <Method void HttpConnectionParams.setConnectionTimeout(HttpParams, int)>
				HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 20000);
			//    7   15:aload_1         
			//    8   16:sipush          20000
			//    9   19:invokestatic    #49  <Method void HttpConnectionParams.setSoTimeout(HttpParams, int)>
				obj = ((Object) (new DefaultHttpClient(((HttpParams) (obj)))));
			//   10   22:new             #51  <Class DefaultHttpClient>
			//   11   25:dup             
			//   12   26:aload_1         
			//   13   27:invokespecial   #54  <Method void DefaultHttpClient(HttpParams)>
			//   14   30:astore_1        
				((DefaultHttpClient) (obj)).getParams().setParameter("http.protocol.cookie-policy", "compatibility");
			//   15   31:aload_1         
			//   16   32:invokevirtual   #58  <Method HttpParams DefaultHttpClient.getParams()>
			//   17   35:ldc1            #60  <String "http.protocol.cookie-policy">
			//   18   37:ldc1            #62  <String "compatibility">
			//   19   39:invokeinterface #68  <Method HttpParams HttpParams.setParameter(String, Object)>
			//   20   44:pop             
				HttpUriRequest httpurirequest;
				JsonBasicResponseHandler jsonbasicresponsehandler;
				httpurirequest = request;
			//   21   45:aload_0         
			//   22   46:getfield        #28  <Field HttpUriRequest val$request>
			//   23   49:astore_2        
				jsonbasicresponsehandler = new JsonBasicResponseHandler();
			//   24   50:new             #70  <Class JsonBasicResponseHandler>
			//   25   53:dup             
			//   26   54:invokespecial   #71  <Method void JsonBasicResponseHandler()>
			//   27   57:astore_3        
				if(!(obj instanceof HttpClient))
			//*  28   58:aload_1         
			//*  29   59:instanceof      #73  <Class HttpClient>
			//*  30   62:ifne            75
				{
					obj = ((DefaultHttpClient) (obj)).execute(httpurirequest, ((org.apache.http.client.ResponseHandler) (jsonbasicresponsehandler)));
			//   31   65:aload_1         
			//   32   66:aload_2         
			//   33   67:aload_3         
			//   34   68:invokevirtual   #77  <Method Object DefaultHttpClient.execute(HttpUriRequest, org.apache.http.client.ResponseHandler)>
			//   35   71:astore_1        
					break MISSING_BLOCK_LABEL_85;
			//   36   72:goto            85
				}
				obj = ApacheInstrumentation.execute((HttpClient)obj, httpurirequest, ((org.apache.http.client.ResponseHandler) (jsonbasicresponsehandler)));
			//   37   75:aload_1         
			//   38   76:checkcast       #73  <Class HttpClient>
			//   39   79:aload_2         
			//   40   80:aload_3         
			//   41   81:invokestatic    #82  <Method Object ApacheInstrumentation.execute(HttpClient, HttpUriRequest, org.apache.http.client.ResponseHandler)>
			//   42   84:astore_1        
				obj = ((Object) ((Map)obj));
			//   43   85:aload_1         
			//   44   86:checkcast       #84  <Class Map>
			//   45   89:astore_1        
				if(obj != null)
			//*  46   90:aload_1         
			//*  47   91:ifnull          111
				{
					try
					{
						scheduleNow(((_cls1) (obj)). new Runnable() {

							public void run()
							{
								handler.onResult(result);
							//    0    0:aload_0         
							//    1    1:getfield        #19  <Field AuthenticationManager$8 this$1>
							//    2    4:getfield        #28  <Field RequestHandler AuthenticationManager$8.val$handler>
							//    3    7:aload_0         
							//    4    8:getfield        #21  <Field Map val$result>
							//    5   11:invokeinterface #34  <Method void RequestHandler.onResult(Map)>
							//    6   16:return          
							}

							final _cls8 this$1;
							final Map val$result;

			
			{
				this$1 = final__pcls8;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager$8 this$1>
				result = Map.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Map val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
						}
);
			//   48   94:aload_0         
			//   49   95:getfield        #26  <Field AuthenticationManager this$0>
			//   50   98:new             #13  <Class AuthenticationManager$8$1>
			//   51  101:dup             
			//   52  102:aload_0         
			//   53  103:aload_1         
			//   54  104:invokespecial   #87  <Method void AuthenticationManager$8$1(AuthenticationManager$8, Map)>
			//   55  107:invokestatic    #91  <Method void AuthenticationManager.access$600(AuthenticationManager, Runnable)>
						return;
			//   56  110:return          
					}
			//*  57  111:new             #37  <Class IOException>
			//*  58  114:dup             
			//*  59  115:ldc1            #93  <String "Authentication server did not respond with a valid response">
			//*  60  117:invokespecial   #96  <Method void IOException(String)>
			//*  61  120:athrow          
					catch(IOException ioexception)
			//*  62  121:astore_1        
					{
						scheduleNow(((_cls2) (ioexception)). new Runnable() {

							public void run()
							{
								handler.onError(e);
							//    0    0:aload_0         
							//    1    1:getfield        #19  <Field AuthenticationManager$8 this$1>
							//    2    4:getfield        #28  <Field RequestHandler AuthenticationManager$8.val$handler>
							//    3    7:aload_0         
							//    4    8:getfield        #21  <Field IOException val$e>
							//    5   11:invokeinterface #34  <Method void RequestHandler.onError(IOException)>
							//    6   16:return          
							}

							final _cls8 this$1;
							final IOException val$e;

			
			{
				this$1 = final__pcls8;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager$8 this$1>
				e = IOException.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
						}
);
			//   63  122:aload_0         
			//   64  123:getfield        #26  <Field AuthenticationManager this$0>
			//   65  126:new             #15  <Class AuthenticationManager$8$2>
			//   66  129:dup             
			//   67  130:aload_0         
			//   68  131:aload_1         
			//   69  132:invokespecial   #99  <Method void AuthenticationManager$8$2(AuthenticationManager$8, IOException)>
			//   70  135:invokestatic    #91  <Method void AuthenticationManager.access$600(AuthenticationManager, Runnable)>
					}
					break MISSING_BLOCK_LABEL_138;
				}
				throw new IOException("Authentication server did not respond with a valid response");
			//   71  138:return          
			}

			final AuthenticationManager this$0;
			final RequestHandler val$handler;
			final HttpUriRequest val$request;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field AuthenticationManager this$0>
				request = httpurirequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field HttpUriRequest val$request>
				handler = requesthandler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field RequestHandler val$handler>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #33  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   74  145:aload_0         
	//   75  146:getfield        #125 <Field Context context>
	//   76  149:new             #58  <Class AuthenticationManager$8>
	//   77  152:dup             
	//   78  153:aload_0         
	//   79  154:aload_1         
	//   80  155:aload           5
	//   81  157:invokespecial   #567 <Method void AuthenticationManager$8(AuthenticationManager, HttpUriRequest, RequestHandler)>
	//   82  160:invokevirtual   #570 <Method void Context.runBackgroundTask(Runnable)>
	//   83  163:return          
	}

	private AuthAttempt newAuthAttempt(com.firebase.client.Firebase.AuthListener authlistener)
	{
		preemptAnyExistingAttempts();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void preemptAnyExistingAttempts()>
		currentAuthAttempt = new AuthAttempt(authlistener);
	//    2    4:aload_0         
	//    3    5:new             #66  <Class AuthenticationManager$AuthAttempt>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #574 <Method void AuthenticationManager$AuthAttempt(AuthenticationManager, com.firebase.client.Firebase$AuthListener)>
	//    8   14:putfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
		return currentAuthAttempt;
	//    9   17:aload_0         
	//   10   18:getfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
	//   11   21:areturn         
	}

	private AuthAttempt newAuthAttempt(com.firebase.client.Firebase.AuthResultHandler authresulthandler)
	{
		preemptAnyExistingAttempts();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void preemptAnyExistingAttempts()>
		currentAuthAttempt = new AuthAttempt(authresulthandler);
	//    2    4:aload_0         
	//    3    5:new             #66  <Class AuthenticationManager$AuthAttempt>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #577 <Method void AuthenticationManager$AuthAttempt(AuthenticationManager, com.firebase.client.Firebase$AuthResultHandler)>
	//    8   14:putfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
		return currentAuthAttempt;
	//    9   17:aload_0         
	//   10   18:getfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
	//   11   21:areturn         
	}

	private AuthData parseAuthData(String s, Map map, Map map1)
	{
		Map map2 = (Map)Utilities.getOrNull(((Object) (map)), "auth", java/util/Map);
	//    0    0:aload_2         
	//    1    1:ldc2            #408 <String "auth">
	//    2    4:ldc2            #410 <Class Map>
	//    3    7:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//    4   10:checkcast       #410 <Class Map>
	//    5   13:astore          8
		if(map2 == null)
	//*   6   15:aload           8
	//*   7   17:ifnonnull       61
		{
			LogWrapper logwrapper = logger;
	//    8   20:aload_0         
	//    9   21:getfield        #147 <Field LogWrapper logger>
	//   10   24:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   11   26:new             #275 <Class StringBuilder>
	//   12   29:dup             
	//   13   30:invokespecial   #276 <Method void StringBuilder()>
	//   14   33:astore          7
			stringbuilder.append("Received invalid auth data: ");
	//   15   35:aload           7
	//   16   37:ldc2            #579 <String "Received invalid auth data: ">
	//   17   40:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:pop             
			stringbuilder.append(((Object) (map)));
	//   19   44:aload           7
	//   20   46:aload_2         
	//   21   47:invokevirtual   #582 <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:pop             
			logwrapper.warn(stringbuilder.toString());
	//   23   51:aload           6
	//   24   53:aload           7
	//   25   55:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   26   58:invokevirtual   #339 <Method void LogWrapper.warn(String)>
		}
		map = ((Map) (map.get("expires")));
	//   27   61:aload_2         
	//   28   62:ldc2            #416 <String "expires">
	//   29   65:invokeinterface #414 <Method Object Map.get(Object)>
	//   30   70:astore_2        
		long l;
		if(map == null)
	//*  31   71:aload_2         
	//*  32   72:ifnonnull       81
			l = 0L;
	//   33   75:lconst_0        
	//   34   76:lstore          4
		else
	//*  35   78:goto            142
		if(map instanceof Integer)
	//*  36   81:aload_2         
	//*  37   82:instanceof      #556 <Class Integer>
	//*  38   85:ifeq            101
			l = ((Integer)map).intValue();
	//   39   88:aload_2         
	//   40   89:checkcast       #556 <Class Integer>
	//   41   92:invokevirtual   #585 <Method int Integer.intValue()>
	//   42   95:i2l             
	//   43   96:lstore          4
		else
	//*  44   98:goto            142
		if(map instanceof Long)
	//*  45  101:aload_2         
	//*  46  102:instanceof      #587 <Class Long>
	//*  47  105:ifeq            120
			l = ((Long)map).longValue();
	//   48  108:aload_2         
	//   49  109:checkcast       #587 <Class Long>
	//   50  112:invokevirtual   #591 <Method long Long.longValue()>
	//   51  115:lstore          4
		else
	//*  52  117:goto            142
		if(map instanceof Double)
	//*  53  120:aload_2         
	//*  54  121:instanceof      #593 <Class Double>
	//*  55  124:ifeq            139
			l = ((Double)map).longValue();
	//   56  127:aload_2         
	//   57  128:checkcast       #593 <Class Double>
	//   58  131:invokevirtual   #594 <Method long Double.longValue()>
	//   59  134:lstore          4
		else
	//*  60  136:goto            142
			l = 0L;
	//   61  139:lconst_0        
	//   62  140:lstore          4
		String s1 = (String)Utilities.getOrNull(((Object) (map2)), "uid", java/lang/String);
	//   63  142:aload           8
	//   64  144:ldc2            #596 <String "uid">
	//   65  147:ldc2            #284 <Class String>
	//   66  150:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   67  153:checkcast       #284 <Class String>
	//   68  156:astore          6
		if(s1 == null)
	//*  69  158:aload           6
	//*  70  160:ifnonnull       181
			s1 = (String)Utilities.getOrNull(((Object) (map1)), "uid", java/lang/String);
	//   71  163:aload_3         
	//   72  164:ldc2            #596 <String "uid">
	//   73  167:ldc2            #284 <Class String>
	//   74  170:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   75  173:checkcast       #284 <Class String>
	//   76  176:astore          6
	//*  77  178:goto            181
		String s2 = (String)Utilities.getOrNull(((Object) (map2)), "provider", java/lang/String);
	//   78  181:aload           8
	//   79  183:ldc2            #598 <String "provider">
	//   80  186:ldc2            #284 <Class String>
	//   81  189:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   82  192:checkcast       #284 <Class String>
	//   83  195:astore          7
		map = ((Map) (s2));
	//   84  197:aload           7
	//   85  199:astore_2        
		if(s2 == null)
	//*  86  200:aload           7
	//*  87  202:ifnonnull       219
			map = ((Map) ((String)Utilities.getOrNull(((Object) (map1)), "provider", java/lang/String)));
	//   88  205:aload_3         
	//   89  206:ldc2            #598 <String "provider">
	//   90  209:ldc2            #284 <Class String>
	//   91  212:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   92  215:checkcast       #284 <Class String>
	//   93  218:astore_2        
		if(map == null)
	//*  94  219:aload_2         
	//*  95  220:ifnonnull       229
			map = "custom";
	//   96  223:ldc1            #86  <String "custom">
	//   97  225:astore_2        
	//*  98  226:goto            229
		if(s1 == null || s1.isEmpty())
	//*  99  229:aload           6
	//* 100  231:ifnull          242
	//* 101  234:aload           6
	//* 102  236:invokevirtual   #601 <Method boolean String.isEmpty()>
	//* 103  239:ifeq            284
		{
			LogWrapper logwrapper1 = logger;
	//  104  242:aload_0         
	//  105  243:getfield        #147 <Field LogWrapper logger>
	//  106  246:astore          7
			StringBuilder stringbuilder1 = new StringBuilder();
	//  107  248:new             #275 <Class StringBuilder>
	//  108  251:dup             
	//  109  252:invokespecial   #276 <Method void StringBuilder()>
	//  110  255:astore          9
			stringbuilder1.append("Received invalid auth data: ");
	//  111  257:aload           9
	//  112  259:ldc2            #579 <String "Received invalid auth data: ">
	//  113  262:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  114  265:pop             
			stringbuilder1.append(((Object) (map2)));
	//  115  266:aload           9
	//  116  268:aload           8
	//  117  270:invokevirtual   #582 <Method StringBuilder StringBuilder.append(Object)>
	//  118  273:pop             
			logwrapper1.warn(stringbuilder1.toString());
	//  119  274:aload           7
	//  120  276:aload           9
	//  121  278:invokevirtual   #295 <Method String StringBuilder.toString()>
	//  122  281:invokevirtual   #339 <Method void LogWrapper.warn(String)>
		}
		map1 = (Map)Utilities.getOrNull(((Object) (map1)), ((String) (map)), java/util/Map);
	//  123  284:aload_3         
	//  124  285:aload_2         
	//  125  286:ldc2            #410 <Class Map>
	//  126  289:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//  127  292:checkcast       #410 <Class Map>
	//  128  295:astore_3        
		if(map1 == null)
	//* 129  296:aload_3         
	//* 130  297:ifnonnull       311
			map1 = ((Map) (new HashMap()));
	//  131  300:new             #499 <Class HashMap>
	//  132  303:dup             
	//  133  304:invokespecial   #602 <Method void HashMap()>
	//  134  307:astore_3        
	//* 135  308:goto            311
		return new AuthData(s, l, s1, ((String) (map)), map2, map1);
	//  136  311:new             #604 <Class AuthData>
	//  137  314:dup             
	//  138  315:aload_1         
	//  139  316:lload           4
	//  140  318:aload           6
	//  141  320:aload_2         
	//  142  321:aload           8
	//  143  323:aload_3         
	//  144  324:invokespecial   #607 <Method void AuthData(String, long, String, String, Map, Map)>
	//  145  327:areturn         
	}

	private void preemptAnyExistingAttempts()
	{
		if(currentAuthAttempt != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
	//*   2    4:ifnull          33
		{
			FirebaseError firebaseerror = new FirebaseError(-5, "Due to another authentication attempt, this authentication attempt was aborted before it could complete.");
	//    3    7:new             #379 <Class FirebaseError>
	//    4   10:dup             
	//    5   11:bipush          -5
	//    6   13:ldc2            #610 <String "Due to another authentication attempt, this authentication attempt was aborted before it could complete.">
	//    7   16:invokespecial   #613 <Method void FirebaseError(int, String)>
	//    8   19:astore_1        
			currentAuthAttempt.fireError(firebaseerror);
	//    9   20:aload_0         
	//   10   21:getfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #465 <Method void AuthenticationManager$AuthAttempt.fireError(FirebaseError)>
			currentAuthAttempt = null;
	//   13   28:aload_0         
	//   14   29:aconst_null     
	//   15   30:putfield        #268 <Field AuthenticationManager$AuthAttempt currentAuthAttempt>
		}
	//   16   33:return          
	}

	private boolean saveSession(String s, Map map, Map map1)
	{
		String s1 = getFirebaseCredentialIdentifier();
	//    0    0:aload_0         
	//    1    1:invokespecial   #350 <Method String getFirebaseCredentialIdentifier()>
	//    2    4:astore          5
		String s2 = context.getSessionPersistenceKey();
	//    3    6:aload_0         
	//    4    7:getfield        #125 <Field Context context>
	//    5   10:invokevirtual   #353 <Method String Context.getSessionPersistenceKey()>
	//    6   13:astore          6
		store.clearCredential(s1, s2);
	//    7   15:aload_0         
	//    8   16:getfield        #141 <Field CredentialStore store>
	//    9   19:aload           5
	//   10   21:aload           6
	//   11   23:invokeinterface #365 <Method boolean CredentialStore.clearCredential(String, String)>
	//   12   28:pop             
		HashMap hashmap = new HashMap();
	//   13   29:new             #499 <Class HashMap>
	//   14   32:dup             
	//   15   33:invokespecial   #602 <Method void HashMap()>
	//   16   36:astore          7
		((Map) (hashmap)).put("token", ((Object) (s)));
	//   17   38:aload           7
	//   18   40:ldc1            #95  <String "token">
	//   19   42:aload_1         
	//   20   43:invokeinterface #510 <Method Object Map.put(Object, Object)>
	//   21   48:pop             
		((Map) (hashmap)).put("authData", ((Object) (map)));
	//   22   49:aload           7
	//   23   51:ldc1            #80  <String "authData">
	//   24   53:aload_2         
	//   25   54:invokeinterface #510 <Method Object Map.put(Object, Object)>
	//   26   59:pop             
		((Map) (hashmap)).put("userData", ((Object) (map1)));
	//   27   60:aload           7
	//   28   62:ldc1            #98  <String "userData">
	//   29   64:aload_3         
	//   30   65:invokeinterface #510 <Method Object Map.put(Object, Object)>
	//   31   70:pop             
		boolean flag;
		try
		{
			if(logger.logsDebug())
	//*  32   71:aload_0         
	//*  33   72:getfield        #147 <Field LogWrapper logger>
	//*  34   75:invokevirtual   #273 <Method boolean LogWrapper.logsDebug()>
	//*  35   78:ifeq            140
			{
				s = ((String) (logger));
	//   36   81:aload_0         
	//   37   82:getfield        #147 <Field LogWrapper logger>
	//   38   85:astore_1        
				map = ((Map) (new StringBuilder()));
	//   39   86:new             #275 <Class StringBuilder>
	//   40   89:dup             
	//   41   90:invokespecial   #276 <Method void StringBuilder()>
	//   42   93:astore_2        
				((StringBuilder) (map)).append("Storing credentials for Firebase \"");
	//   43   94:aload_2         
	//   44   95:ldc2            #617 <String "Storing credentials for Firebase \"">
	//   45   98:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   46  101:pop             
				((StringBuilder) (map)).append(s1);
	//   47  102:aload_2         
	//   48  103:aload           5
	//   49  105:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   50  108:pop             
				((StringBuilder) (map)).append("\" and session \"");
	//   51  109:aload_2         
	//   52  110:ldc2            #357 <String "\" and session \"">
	//   53  113:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   54  116:pop             
				((StringBuilder) (map)).append(s2);
	//   55  117:aload_2         
	//   56  118:aload           6
	//   57  120:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   58  123:pop             
				((StringBuilder) (map)).append("\".");
	//   59  124:aload_2         
	//   60  125:ldc2            #359 <String "\".">
	//   61  128:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   62  131:pop             
				((LogWrapper) (s)).debug(((StringBuilder) (map)).toString());
	//   63  132:aload_1         
	//   64  133:aload_2         
	//   65  134:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   66  137:invokevirtual   #299 <Method void LogWrapper.debug(String)>
			}
			s = JsonHelpers.getMapper().writeValueAsString(((Object) (hashmap)));
	//   67  140:invokestatic    #623 <Method ObjectMapper JsonHelpers.getMapper()>
	//   68  143:aload           7
	//   69  145:invokevirtual   #629 <Method String ObjectMapper.writeValueAsString(Object)>
	//   70  148:astore_1        
			flag = store.storeCredential(s1, s2, s);
	//   71  149:aload_0         
	//   72  150:getfield        #141 <Field CredentialStore store>
	//   73  153:aload           5
	//   74  155:aload           6
	//   75  157:aload_1         
	//   76  158:invokeinterface #633 <Method boolean CredentialStore.storeCredential(String, String, String)>
	//   77  163:istore          4
		}
	//*  78  165:iload           4
	//*  79  167:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  80  168:astore_1        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   81  169:new             #635 <Class RuntimeException>
	//   82  172:dup             
	//   83  173:aload_1         
	//   84  174:invokespecial   #638 <Method void RuntimeException(Throwable)>
	//   85  177:athrow          
		}
		return flag;
	}

	private void scheduleNow(Runnable runnable)
	{
		context.getRunLoop().scheduleNow(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Context context>
	//    2    4:invokevirtual   #643 <Method RunLoop Context.getRunLoop()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #646 <Method void RunLoop.scheduleNow(Runnable)>
	//    5   13:return          
	}

	private void updateAuthState(AuthData authdata)
	{
		AuthData authdata1 = authData;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field AuthData authData>
	//    2    4:astore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(authdata1 != null ? authdata1.equals(((Object) (authdata))) : authdata == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       18
	//*   7   11:aload_1         
	//*   8   12:ifnull          29
	//*   9   15:goto            31
	//*  10   18:aload_3         
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #650 <Method boolean AuthData.equals(Object)>
	//*  13   23:ifne            29
	//*  14   26:goto            31
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		authData = authdata;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:putfield        #133 <Field AuthData authData>
		if(flag)
	//*  20   36:iload_2         
	//*  21   37:ifeq            84
		{
			for(Iterator iterator = listenerSet.iterator(); iterator.hasNext(); fireEvent(new Runnable() {

		public void run()
		{
			listener.onAuthStateChanged(authData);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field AuthData val$authData>
		//    4    8:invokeinterface #35  <Method void com.firebase.client.Firebase$AuthStateListener.onAuthStateChanged(AuthData)>
		//    5   13:return          
		}

		final AuthenticationManager this$0;
		final AuthData val$authData;
		final com.firebase.client.Firebase.AuthStateListener val$listener;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				listener = authstatelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
				authData = authdata;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field AuthData val$authData>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
	}
));
	//   22   40:aload_0         
	//   23   41:getfield        #152 <Field Set listenerSet>
	//   24   44:invokeinterface #656 <Method Iterator Set.iterator()>
	//   25   49:astore_3        
	//   26   50:aload_3         
	//   27   51:invokeinterface #661 <Method boolean Iterator.hasNext()>
	//   28   56:ifeq            84
	//   29   59:aload_0         
	//   30   60:new             #56  <Class AuthenticationManager$7>
	//   31   63:dup             
	//   32   64:aload_0         
	//   33   65:aload_3         
	//   34   66:invokeinterface #665 <Method Object Iterator.next()>
	//   35   71:checkcast       #667 <Class com.firebase.client.Firebase$AuthStateListener>
	//   36   74:aload_1         
	//   37   75:invokespecial   #670 <Method void AuthenticationManager$7(AuthenticationManager, com.firebase.client.Firebase$AuthStateListener, AuthData)>
	//   38   78:invokespecial   #201 <Method void fireEvent(Runnable)>
		}
	//*  39   81:goto            50
	//   40   84:return          
	}

	public void addAuthStateListener(final com.firebase.client.Firebase.AuthStateListener listener)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				listenerSet.add(((Object) (listener)));
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AuthenticationManager this$0>
			//    2    4:invokestatic    #32  <Method Set AuthenticationManager.access$1900(AuthenticationManager)>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
			//    5   11:invokeinterface #38  <Method boolean Set.add(Object)>
			//    6   16:pop             
				AuthData authdata = authData;
			//    7   17:aload_0         
			//    8   18:getfield        #21  <Field AuthenticationManager this$0>
			//    9   21:invokestatic    #42  <Method AuthData AuthenticationManager.access$1100(AuthenticationManager)>
			//   10   24:astore_1        
				fireEvent(((_cls1) (authdata)). new Runnable() {

					public void run()
					{
						listener.onAuthStateChanged(authData);
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field AuthenticationManager$13 this$1>
					//    2    4:getfield        #28  <Field com.firebase.client.Firebase$AuthStateListener AuthenticationManager$13.val$listener>
					//    3    7:aload_0         
					//    4    8:getfield        #21  <Field AuthData val$authData>
					//    5   11:invokeinterface #34  <Method void com.firebase.client.Firebase$AuthStateListener.onAuthStateChanged(AuthData)>
					//    6   16:return          
					}

					final _cls13 this$1;
					final AuthData val$authData;

			
			{
				this$1 = final__pcls13;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager$13 this$1>
				authData = AuthData.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AuthData val$authData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
);
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
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				listener = authstatelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class AuthenticationManager$13>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #677 <Method void AuthenticationManager$13(AuthenticationManager, com.firebase.client.Firebase$AuthStateListener)>
	//    8   14:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//    9   17:return          
	}

	public void authAnonymously(final com.firebase.client.Firebase.AuthResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				HashMap hashmap = new HashMap();
			//    0    0:new             #28  <Class HashMap>
			//    1    3:dup             
			//    2    4:invokespecial   #29  <Method void HashMap()>
			//    3    7:astore_1        
				makeAuthenticationRequest("/auth/anonymous", ((Map) (hashmap)), handler);
			//    4    8:aload_0         
			//    5    9:getfield        #19  <Field AuthenticationManager this$0>
			//    6   12:ldc1            #31  <String "/auth/anonymous">
			//    7   14:aload_1         
			//    8   15:aload_0         
			//    9   16:getfield        #21  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
			//   10   19:invokestatic    #35  <Method void AuthenticationManager.access$2000(AuthenticationManager, String, Map, com.firebase.client.Firebase$AuthResultHandler)>
			//   11   22:return          
			}

			final AuthenticationManager this$0;
			final com.firebase.client.Firebase.AuthResultHandler val$handler;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager this$0>
				handler = authresulthandler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #24  <Class AuthenticationManager$15>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #680 <Method void AuthenticationManager$15(AuthenticationManager, com.firebase.client.Firebase$AuthResultHandler)>
	//    8   14:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//    9   17:return          
	}

	public void authWithCustomToken(final String token, final com.firebase.client.Firebase.AuthResultHandler handler)
	{
		scheduleNow(new Runnable() {

			public void run()
			{
				AuthAttempt authattempt = newAuthAttempt(handler);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AuthenticationManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
			//    4    8:invokestatic    #34  <Method AuthenticationManager$AuthAttempt AuthenticationManager.access$2100(AuthenticationManager, com.firebase.client.Firebase$AuthResultHandler)>
			//    5   11:astore_1        
				authWithCredential(token, ((Map) (null)), authattempt);
			//    6   12:aload_0         
			//    7   13:getfield        #21  <Field AuthenticationManager this$0>
			//    8   16:aload_0         
			//    9   17:getfield        #25  <Field String val$token>
			//   10   20:aconst_null     
			//   11   21:aload_1         
			//   12   22:invokestatic    #38  <Method void AuthenticationManager.access$800(AuthenticationManager, String, Map, AuthenticationManager$AuthAttempt)>
			//   13   25:return          
			}

			final AuthenticationManager this$0;
			final com.firebase.client.Firebase.AuthResultHandler val$handler;
			final String val$token;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				handler = authresulthandler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
				token = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$token>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #28  <Class AuthenticationManager$17>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokespecial   #685 <Method void AuthenticationManager$17(AuthenticationManager, com.firebase.client.Firebase$AuthResultHandler, String)>
	//    7   11:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//    8   14:return          
	}

	public void authWithFirebaseToken(final String token, final com.firebase.client.Firebase.AuthListener listener)
	{
		scheduleNow(new Runnable() {

			public void run()
			{
				AuthAttempt authattempt = newAuthAttempt(listener);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AuthenticationManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field com.firebase.client.Firebase$AuthListener val$listener>
			//    4    8:invokestatic    #34  <Method AuthenticationManager$AuthAttempt AuthenticationManager.access$2200(AuthenticationManager, com.firebase.client.Firebase$AuthListener)>
			//    5   11:astore_1        
				authWithCredential(token, ((Map) (null)), authattempt);
			//    6   12:aload_0         
			//    7   13:getfield        #21  <Field AuthenticationManager this$0>
			//    8   16:aload_0         
			//    9   17:getfield        #25  <Field String val$token>
			//   10   20:aconst_null     
			//   11   21:aload_1         
			//   12   22:invokestatic    #38  <Method void AuthenticationManager.access$800(AuthenticationManager, String, Map, AuthenticationManager$AuthAttempt)>
			//   13   25:return          
			}

			final AuthenticationManager this$0;
			final com.firebase.client.Firebase.AuthListener val$listener;
			final String val$token;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				listener = authlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.firebase.client.Firebase$AuthListener val$listener>
				token = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$token>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #30  <Class AuthenticationManager$18>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokespecial   #689 <Method void AuthenticationManager$18(AuthenticationManager, com.firebase.client.Firebase$AuthListener, String)>
	//    7   11:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//    8   14:return          
	}

	public void authWithOAuthToken(String s, String s1, com.firebase.client.Firebase.AuthResultHandler authresulthandler)
	{
		if(s1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          34
		{
			HashMap hashmap = new HashMap();
	//    2    4:new             #499 <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #602 <Method void HashMap()>
	//    5   11:astore          4
			((Map) (hashmap)).put("access_token", ((Object) (s1)));
	//    6   13:aload           4
	//    7   15:ldc2            #693 <String "access_token">
	//    8   18:aload_2         
	//    9   19:invokeinterface #510 <Method Object Map.put(Object, Object)>
	//   10   24:pop             
			authWithOAuthToken(s, ((Map) (hashmap)), authresulthandler);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload           4
	//   14   29:aload_3         
	//   15   30:invokevirtual   #695 <Method void authWithOAuthToken(String, Map, com.firebase.client.Firebase$AuthResultHandler)>
			return;
	//   16   33:return          
		} else
		{
			throw new IllegalArgumentException("Token must not be null!");
	//   17   34:new             #697 <Class IllegalArgumentException>
	//   18   37:dup             
	//   19   38:ldc2            #699 <String "Token must not be null!">
	//   20   41:invokespecial   #700 <Method void IllegalArgumentException(String)>
	//   21   44:athrow          
		}
	}

	public void authWithOAuthToken(final String provider, final Map params, final com.firebase.client.Firebase.AuthResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				String s = String.format("/auth/%s/token", new Object[] {
					provider
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
				makeAuthenticationRequest(s, params, handler);
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
			final com.firebase.client.Firebase.AuthResultHandler val$handler;
			final Map val$params;
			final String val$provider;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AuthenticationManager this$0>
				provider = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String val$provider>
				params = map;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Map val$params>
				handler = authresulthandler;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #32  <Class AuthenticationManager$19>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #702 <Method void AuthenticationManager$19(AuthenticationManager, String, Map, com.firebase.client.Firebase$AuthResultHandler)>
	//   10   16:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//   11   19:return          
	}

	public void authWithPassword(final String email, final String password, final com.firebase.client.Firebase.AuthResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				HashMap hashmap = new HashMap();
			//    0    0:new             #35  <Class HashMap>
			//    1    3:dup             
			//    2    4:invokespecial   #36  <Method void HashMap()>
			//    3    7:astore_1        
				((Map) (hashmap)).put("email", ((Object) (email)));
			//    4    8:aload_1         
			//    5    9:ldc1            #38  <String "email">
			//    6   11:aload_0         
			//    7   12:getfield        #24  <Field String val$email>
			//    8   15:invokeinterface #44  <Method Object Map.put(Object, Object)>
			//    9   20:pop             
				((Map) (hashmap)).put("password", ((Object) (password)));
			//   10   21:aload_1         
			//   11   22:ldc1            #46  <String "password">
			//   12   24:aload_0         
			//   13   25:getfield        #26  <Field String val$password>
			//   14   28:invokeinterface #44  <Method Object Map.put(Object, Object)>
			//   15   33:pop             
				makeAuthenticationRequest("/auth/password", ((Map) (hashmap)), handler);
			//   16   34:aload_0         
			//   17   35:getfield        #22  <Field AuthenticationManager this$0>
			//   18   38:ldc1            #48  <String "/auth/password">
			//   19   40:aload_1         
			//   20   41:aload_0         
			//   21   42:getfield        #28  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
			//   22   45:invokestatic    #52  <Method void AuthenticationManager.access$2000(AuthenticationManager, String, Map, com.firebase.client.Firebase$AuthResultHandler)>
			//   23   48:return          
			}

			final AuthenticationManager this$0;
			final String val$email;
			final com.firebase.client.Firebase.AuthResultHandler val$handler;
			final String val$password;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager this$0>
				email = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$email>
				password = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String val$password>
				handler = authresulthandler;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field com.firebase.client.Firebase$AuthResultHandler val$handler>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #26  <Class AuthenticationManager$16>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #706 <Method void AuthenticationManager$16(AuthenticationManager, String, String, com.firebase.client.Firebase$AuthResultHandler)>
	//   10   16:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//   11   19:return          
	}

	public void changeEmail(final String oldEmail, final String password, final String newEmail, final com.firebase.client.Firebase.ResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				HashMap hashmap = new HashMap();
			//    0    0:new             #38  <Class HashMap>
			//    1    3:dup             
			//    2    4:invokespecial   #39  <Method void HashMap()>
			//    3    7:astore_1        
				((Map) (hashmap)).put("password", ((Object) (password)));
			//    4    8:aload_1         
			//    5    9:ldc1            #41  <String "password">
			//    6   11:aload_0         
			//    7   12:getfield        #25  <Field String val$password>
			//    8   15:invokeinterface #47  <Method Object Map.put(Object, Object)>
			//    9   20:pop             
				HashMap hashmap1 = new HashMap();
			//   10   21:new             #38  <Class HashMap>
			//   11   24:dup             
			//   12   25:invokespecial   #39  <Method void HashMap()>
			//   13   28:astore_2        
				((Map) (hashmap1)).put("email", ((Object) (newEmail)));
			//   14   29:aload_2         
			//   15   30:ldc1            #49  <String "email">
			//   16   32:aload_0         
			//   17   33:getfield        #27  <Field String val$newEmail>
			//   18   36:invokeinterface #47  <Method Object Map.put(Object, Object)>
			//   19   41:pop             
				String s = String.format("/users/%s/email", new Object[] {
					oldEmail
				});
			//   20   42:ldc1            #51  <String "/users/%s/email">
			//   21   44:iconst_1        
			//   22   45:anewarray       Object[]
			//   23   48:dup             
			//   24   49:iconst_0        
			//   25   50:aload_0         
			//   26   51:getfield        #29  <Field String val$oldEmail>
			//   27   54:aastore         
			//   28   55:invokestatic    #57  <Method String String.format(String, Object[])>
			//   29   58:astore_3        
				makeOperationRequest(s, com.firebase.client.utilities.HttpUtilities.HttpRequestType.PUT, ((Map) (hashmap)), ((Map) (hashmap1)), handler, false);
			//   30   59:aload_0         
			//   31   60:getfield        #23  <Field AuthenticationManager this$0>
			//   32   63:aload_3         
			//   33   64:getstatic       #63  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.PUT>
			//   34   67:aload_1         
			//   35   68:aload_2         
			//   36   69:aload_0         
			//   37   70:getfield        #31  <Field com.firebase.client.Firebase$ResultHandler val$handler>
			//   38   73:iconst_0        
			//   39   74:invokestatic    #67  <Method void AuthenticationManager.access$2400(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ResultHandler, boolean)>
			//   40   77:return          
			}

			final AuthenticationManager this$0;
			final com.firebase.client.Firebase.ResultHandler val$handler;
			final String val$newEmail;
			final String val$oldEmail;
			final String val$password;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AuthenticationManager this$0>
				password = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String val$password>
				newEmail = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String val$newEmail>
				oldEmail = s2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field String val$oldEmail>
				handler = resulthandler;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #31  <Field com.firebase.client.Firebase$ResultHandler val$handler>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #42  <Class AuthenticationManager$23>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload_1         
	//    9   13:aload           4
	//   10   15:invokespecial   #711 <Method void AuthenticationManager$23(AuthenticationManager, String, String, String, com.firebase.client.Firebase$ResultHandler)>
	//   11   18:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//   12   21:return          
	}

	public void changePassword(final String email, final String oldPassword, final String newPassword, final com.firebase.client.Firebase.ResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				HashMap hashmap = new HashMap();
			//    0    0:new             #38  <Class HashMap>
			//    1    3:dup             
			//    2    4:invokespecial   #39  <Method void HashMap()>
			//    3    7:astore_1        
				((Map) (hashmap)).put("oldPassword", ((Object) (oldPassword)));
			//    4    8:aload_1         
			//    5    9:ldc1            #41  <String "oldPassword">
			//    6   11:aload_0         
			//    7   12:getfield        #25  <Field String val$oldPassword>
			//    8   15:invokeinterface #47  <Method Object Map.put(Object, Object)>
			//    9   20:pop             
				HashMap hashmap1 = new HashMap();
			//   10   21:new             #38  <Class HashMap>
			//   11   24:dup             
			//   12   25:invokespecial   #39  <Method void HashMap()>
			//   13   28:astore_2        
				((Map) (hashmap1)).put("password", ((Object) (newPassword)));
			//   14   29:aload_2         
			//   15   30:ldc1            #49  <String "password">
			//   16   32:aload_0         
			//   17   33:getfield        #27  <Field String val$newPassword>
			//   18   36:invokeinterface #47  <Method Object Map.put(Object, Object)>
			//   19   41:pop             
				String s = String.format("/users/%s/password", new Object[] {
					email
				});
			//   20   42:ldc1            #51  <String "/users/%s/password">
			//   21   44:iconst_1        
			//   22   45:anewarray       Object[]
			//   23   48:dup             
			//   24   49:iconst_0        
			//   25   50:aload_0         
			//   26   51:getfield        #29  <Field String val$email>
			//   27   54:aastore         
			//   28   55:invokestatic    #57  <Method String String.format(String, Object[])>
			//   29   58:astore_3        
				makeOperationRequest(s, com.firebase.client.utilities.HttpUtilities.HttpRequestType.PUT, ((Map) (hashmap)), ((Map) (hashmap1)), handler, false);
			//   30   59:aload_0         
			//   31   60:getfield        #23  <Field AuthenticationManager this$0>
			//   32   63:aload_3         
			//   33   64:getstatic       #63  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.PUT>
			//   34   67:aload_1         
			//   35   68:aload_2         
			//   36   69:aload_0         
			//   37   70:getfield        #31  <Field com.firebase.client.Firebase$ResultHandler val$handler>
			//   38   73:iconst_0        
			//   39   74:invokestatic    #67  <Method void AuthenticationManager.access$2400(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ResultHandler, boolean)>
			//   40   77:return          
			}

			final AuthenticationManager this$0;
			final String val$email;
			final com.firebase.client.Firebase.ResultHandler val$handler;
			final String val$newPassword;
			final String val$oldPassword;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AuthenticationManager this$0>
				oldPassword = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String val$oldPassword>
				newPassword = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String val$newPassword>
				email = s2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field String val$email>
				handler = resulthandler;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #31  <Field com.firebase.client.Firebase$ResultHandler val$handler>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #40  <Class AuthenticationManager$22>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload_1         
	//    9   13:aload           4
	//   10   15:invokespecial   #713 <Method void AuthenticationManager$22(AuthenticationManager, String, String, String, com.firebase.client.Firebase$ResultHandler)>
	//   11   18:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//   12   21:return          
	}

	public void createUser(String s, String s1, com.firebase.client.Firebase.ResultHandler resulthandler)
	{
		createUser(s, s1, ignoreResultValueHandler(resulthandler));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_3         
	//    5    5:invokespecial   #492 <Method com.firebase.client.Firebase$ValueResultHandler ignoreResultValueHandler(com.firebase.client.Firebase$ResultHandler)>
	//    6    8:invokevirtual   #718 <Method void createUser(String, String, com.firebase.client.Firebase$ValueResultHandler)>
	//    7   11:return          
	}

	public void createUser(final String email, final String password, final com.firebase.client.Firebase.ValueResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				HashMap hashmap = new HashMap();
			//    0    0:new             #35  <Class HashMap>
			//    1    3:dup             
			//    2    4:invokespecial   #36  <Method void HashMap()>
			//    3    7:astore_1        
				((Map) (hashmap)).put("email", ((Object) (email)));
			//    4    8:aload_1         
			//    5    9:ldc1            #38  <String "email">
			//    6   11:aload_0         
			//    7   12:getfield        #24  <Field String val$email>
			//    8   15:invokeinterface #44  <Method Object Map.put(Object, Object)>
			//    9   20:pop             
				((Map) (hashmap)).put("password", ((Object) (password)));
			//   10   21:aload_1         
			//   11   22:ldc1            #46  <String "password">
			//   12   24:aload_0         
			//   13   25:getfield        #26  <Field String val$password>
			//   14   28:invokeinterface #44  <Method Object Map.put(Object, Object)>
			//   15   33:pop             
				makeOperationRequestWithResult("/users", com.firebase.client.utilities.HttpUtilities.HttpRequestType.POST, Collections.emptyMap(), ((Map) (hashmap)), handler, false);
			//   16   34:aload_0         
			//   17   35:getfield        #22  <Field AuthenticationManager this$0>
			//   18   38:ldc1            #48  <String "/users">
			//   19   40:getstatic       #54  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.POST>
			//   20   43:invokestatic    #60  <Method Map Collections.emptyMap()>
			//   21   46:aload_1         
			//   22   47:aload_0         
			//   23   48:getfield        #28  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
			//   24   51:iconst_0        
			//   25   52:invokestatic    #64  <Method void AuthenticationManager.access$2300(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ValueResultHandler, boolean)>
			//   26   55:return          
			}

			final AuthenticationManager this$0;
			final String val$email;
			final com.firebase.client.Firebase.ValueResultHandler val$handler;
			final String val$password;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager this$0>
				email = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$email>
				password = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String val$password>
				handler = valueresulthandler;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #36  <Class AuthenticationManager$20>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #721 <Method void AuthenticationManager$20(AuthenticationManager, String, String, com.firebase.client.Firebase$ValueResultHandler)>
	//   10   16:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//   11   19:return          
	}

	public AuthData getAuth()
	{
		return authData;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field AuthData authData>
	//    2    4:areturn         
	}

	public void removeAuthStateListener(final com.firebase.client.Firebase.AuthStateListener listener)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				listenerSet.remove(((Object) (listener)));
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
			final com.firebase.client.Firebase.AuthStateListener val$listener;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager this$0>
				listener = authstatelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.firebase.client.Firebase$AuthStateListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #22  <Class AuthenticationManager$14>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #726 <Method void AuthenticationManager$14(AuthenticationManager, com.firebase.client.Firebase$AuthStateListener)>
	//    8   14:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//    9   17:return          
	}

	public void removeUser(final String email, final String password, final com.firebase.client.Firebase.ResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				HashMap hashmap = new HashMap();
			//    0    0:new             #35  <Class HashMap>
			//    1    3:dup             
			//    2    4:invokespecial   #36  <Method void HashMap()>
			//    3    7:astore_1        
				((Map) (hashmap)).put("password", ((Object) (password)));
			//    4    8:aload_1         
			//    5    9:ldc1            #38  <String "password">
			//    6   11:aload_0         
			//    7   12:getfield        #24  <Field String val$password>
			//    8   15:invokeinterface #44  <Method Object Map.put(Object, Object)>
			//    9   20:pop             
				String s = String.format("/users/%s", new Object[] {
					email
				});
			//   10   21:ldc1            #46  <String "/users/%s">
			//   11   23:iconst_1        
			//   12   24:anewarray       Object[]
			//   13   27:dup             
			//   14   28:iconst_0        
			//   15   29:aload_0         
			//   16   30:getfield        #26  <Field String val$email>
			//   17   33:aastore         
			//   18   34:invokestatic    #52  <Method String String.format(String, Object[])>
			//   19   37:astore_2        
				makeOperationRequest(s, com.firebase.client.utilities.HttpUtilities.HttpRequestType.DELETE, ((Map) (hashmap)), Collections.emptyMap(), handler, true);
			//   20   38:aload_0         
			//   21   39:getfield        #22  <Field AuthenticationManager this$0>
			//   22   42:aload_2         
			//   23   43:getstatic       #58  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.DELETE>
			//   24   46:aload_1         
			//   25   47:invokestatic    #64  <Method Map Collections.emptyMap()>
			//   26   50:aload_0         
			//   27   51:getfield        #28  <Field com.firebase.client.Firebase$ResultHandler val$handler>
			//   28   54:iconst_1        
			//   29   55:invokestatic    #68  <Method void AuthenticationManager.access$2400(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ResultHandler, boolean)>
			//   30   58:return          
			}

			final AuthenticationManager this$0;
			final String val$email;
			final com.firebase.client.Firebase.ResultHandler val$handler;
			final String val$password;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AuthenticationManager this$0>
				password = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$password>
				email = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String val$email>
				handler = resulthandler;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field com.firebase.client.Firebase$ResultHandler val$handler>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #38  <Class AuthenticationManager$21>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:aload_3         
	//    9   13:invokespecial   #730 <Method void AuthenticationManager$21(AuthenticationManager, String, String, com.firebase.client.Firebase$ResultHandler)>
	//   10   16:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//   11   19:return          
	}

	public void resetPassword(final String email, final com.firebase.client.Firebase.ResultHandler handler)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		scheduleNow(new Runnable() {

			public void run()
			{
				String s = String.format("/users/%s/password", new Object[] {
					email
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
				Map map = Collections.emptyMap();
			//   10   17:invokestatic    #44  <Method Map Collections.emptyMap()>
			//   11   20:astore_2        
				makeOperationRequest(s, com.firebase.client.utilities.HttpUtilities.HttpRequestType.POST, map, map, handler, false);
			//   12   21:aload_0         
			//   13   22:getfield        #21  <Field AuthenticationManager this$0>
			//   14   25:aload_1         
			//   15   26:getstatic       #50  <Field com.firebase.client.utilities.HttpUtilities$HttpRequestType com.firebase.client.utilities.HttpUtilities$HttpRequestType.POST>
			//   16   29:aload_2         
			//   17   30:aload_2         
			//   18   31:aload_0         
			//   19   32:getfield        #25  <Field com.firebase.client.Firebase$ResultHandler val$handler>
			//   20   35:iconst_0        
			//   21   36:invokestatic    #54  <Method void AuthenticationManager.access$2400(AuthenticationManager, String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ResultHandler, boolean)>
			//   22   39:return          
			}

			final AuthenticationManager this$0;
			final String val$email;
			final com.firebase.client.Firebase.ResultHandler val$handler;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AuthenticationManager this$0>
				email = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$email>
				handler = resulthandler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field com.firebase.client.Firebase$ResultHandler val$handler>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    2    4:aload_0         
	//    3    5:new             #44  <Class AuthenticationManager$24>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #735 <Method void AuthenticationManager$24(AuthenticationManager, String, com.firebase.client.Firebase$ResultHandler)>
	//    9   15:invokespecial   #248 <Method void scheduleNow(Runnable)>
	//   10   18:return          
	}

	public void resumeSession()
	{
		final String tokenString = store.loadCredential(getFirebaseCredentialIdentifier(), context.getSessionPersistenceKey());
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field CredentialStore store>
	//    2    4:aload_0         
	//    3    5:invokespecial   #350 <Method String getFirebaseCredentialIdentifier()>
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field Context context>
	//    6   12:invokevirtual   #353 <Method String Context.getSessionPersistenceKey()>
	//    7   15:invokeinterface #742 <Method String CredentialStore.loadCredential(String, String)>
	//    8   20:astore_1        
		if(tokenString == null)
			break MISSING_BLOCK_LABEL_139;
	//    9   21:aload_1         
	//   10   22:ifnull          139
		final Map authDataObj;
		final Map userData;
		userData = (Map)JsonHelpers.getMapper().readValue(tokenString, ((TypeReference) (new TypeReference() {

			final AuthenticationManager this$0;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AuthenticationManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void TypeReference()>
			//    5    9:return          
			}
		}
)));
	//   11   25:invokestatic    #623 <Method ObjectMapper JsonHelpers.getMapper()>
	//   12   28:aload_1         
	//   13   29:new             #50  <Class AuthenticationManager$5>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #744 <Method void AuthenticationManager$5(AuthenticationManager)>
	//   17   37:invokevirtual   #748 <Method Object ObjectMapper.readValue(String, TypeReference)>
	//   18   40:checkcast       #410 <Class Map>
	//   19   43:astore_3        
		tokenString = (String)Utilities.getOrNull(((Object) (userData)), "token", java/lang/String);
	//   20   44:aload_3         
	//   21   45:ldc1            #95  <String "token">
	//   22   47:ldc2            #284 <Class String>
	//   23   50:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   24   53:checkcast       #284 <Class String>
	//   25   56:astore_1        
		authDataObj = (Map)Utilities.getOrNull(((Object) (userData)), "authData", java/util/Map);
	//   26   57:aload_3         
	//   27   58:ldc1            #80  <String "authData">
	//   28   60:ldc2            #410 <Class Map>
	//   29   63:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   30   66:checkcast       #410 <Class Map>
	//   31   69:astore_2        
		userData = (Map)Utilities.getOrNull(((Object) (userData)), "userData", java/util/Map);
	//   32   70:aload_3         
	//   33   71:ldc1            #98  <String "userData">
	//   34   73:ldc2            #410 <Class Map>
	//   35   76:invokestatic    #373 <Method Object Utilities.getOrNull(Object, String, Class)>
	//   36   79:checkcast       #410 <Class Map>
	//   37   82:astore_3        
		if(authDataObj != null)
	//*  38   83:aload_2         
	//*  39   84:ifnull          139
		{
			try
			{
				updateAuthState(parseAuthData(tokenString, authDataObj, userData));
	//   40   87:aload_0         
	//   41   88:aload_0         
	//   42   89:aload_1         
	//   43   90:aload_2         
	//   44   91:aload_3         
	//   45   92:invokespecial   #426 <Method AuthData parseAuthData(String, Map, Map)>
	//   46   95:invokespecial   #183 <Method void updateAuthState(AuthData)>
				context.getRunLoop().scheduleNow(new Runnable() {

					public void run()
					{
						connection.auth(tokenString, new com.firebase.client.Firebase.AuthListener() {

							public void onAuthError(FirebaseError firebaseerror)
							{
								handleBadAuthStatus(firebaseerror, ((AuthAttempt) (null)), false);
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
								handleBadAuthStatus(firebaseerror, ((AuthAttempt) (null)), true);
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
								handleAuthSuccess(tokenString, authDataObj, userData, false, ((AuthAttempt) (null)));
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

							final _cls6 this$1;

			
			{
				this$1 = _cls6.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AuthenticationManager$6 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
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
				this$0 = AuthenticationManager.this;
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
				userData = map1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Map val$userData>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
				}
);
	//   47   98:aload_0         
	//   48   99:getfield        #125 <Field Context context>
	//   49  102:invokevirtual   #643 <Method RunLoop Context.getRunLoop()>
	//   50  105:new             #52  <Class AuthenticationManager$6>
	//   51  108:dup             
	//   52  109:aload_0         
	//   53  110:aload_1         
	//   54  111:aload_2         
	//   55  112:aload_3         
	//   56  113:invokespecial   #751 <Method void AuthenticationManager$6(AuthenticationManager, String, Map, Map)>
	//   57  116:invokeinterface #646 <Method void RunLoop.scheduleNow(Runnable)>
				return;
	//   58  121:return          
			}
			catch(IOException ioexception)
	//*  59  122:astore_1        
			{
				logger.warn("Failed resuming authentication session!", ((Throwable) (ioexception)));
	//   60  123:aload_0         
	//   61  124:getfield        #147 <Field LogWrapper logger>
	//   62  127:ldc2            #753 <String "Failed resuming authentication session!">
	//   63  130:aload_1         
	//   64  131:invokevirtual   #756 <Method void LogWrapper.warn(String, Throwable)>
			}
			clearSession();
	//   65  134:aload_0         
	//   66  135:invokespecial   #189 <Method boolean clearSession()>
	//   67  138:pop             
		}
	//   68  139:return          
	}

	public void unauth()
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		unauth(((com.firebase.client.Firebase.CompletionListener) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #760 <Method void unauth(com.firebase.client.Firebase$CompletionListener)>
	//    5    9:return          
	}

	public void unauth(com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		unauth(completionlistener, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #763 <Method void unauth(com.firebase.client.Firebase$CompletionListener, boolean)>
	//    4    6:return          
	}

	public void unauth(final com.firebase.client.Firebase.CompletionListener listener, boolean flag)
	{
		checkServerSettings();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void checkServerSettings()>
		final Semaphore semaphore = new Semaphore(0);
	//    2    4:new             #767 <Class Semaphore>
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:invokespecial   #770 <Method void Semaphore(int)>
	//    6   12:astore_3        
		scheduleNow(new Runnable() {

			public void run()
			{
				preemptAnyExistingAttempts();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field AuthenticationManager this$0>
			//    2    4:invokestatic    #36  <Method void AuthenticationManager.access$1400(AuthenticationManager)>
				updateAuthState(((AuthData) (null)));
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field AuthenticationManager this$0>
			//    5   11:aconst_null     
			//    6   12:invokestatic    #40  <Method void AuthenticationManager.access$1500(AuthenticationManager, AuthData)>
				semaphore.release();
			//    7   15:aload_0         
			//    8   16:getfield        #25  <Field Semaphore val$semaphore>
			//    9   19:invokevirtual   #45  <Method void Semaphore.release()>
				clearSession();
			//   10   22:aload_0         
			//   11   23:getfield        #23  <Field AuthenticationManager this$0>
			//   12   26:invokestatic    #49  <Method boolean AuthenticationManager.access$1600(AuthenticationManager)>
			//   13   29:pop             
				connection.unauth(new com.firebase.client.Firebase.CompletionListener() {

					public void onComplete(FirebaseError firebaseerror, Firebase firebase)
					{
						if(listener != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #17  <Field AuthenticationManager$12 this$1>
					//*   2    4:getfield        #26  <Field com.firebase.client.Firebase$CompletionListener AuthenticationManager$12.val$listener>
					//*   3    7:ifnull          51
						{
							firebase = new Firebase(repo, new Path(""));
					//    4   10:new             #28  <Class Firebase>
					//    5   13:dup             
					//    6   14:aload_0         
					//    7   15:getfield        #17  <Field AuthenticationManager$12 this$1>
					//    8   18:getfield        #32  <Field AuthenticationManager AuthenticationManager$12.this$0>
					//    9   21:invokestatic    #38  <Method Repo AuthenticationManager.access$1700(AuthenticationManager)>
					//   10   24:new             #40  <Class Path>
					//   11   27:dup             
					//   12   28:ldc1            #42  <String "">
					//   13   30:invokespecial   #45  <Method void Path(String)>
					//   14   33:invokespecial   #48  <Method void Firebase(Repo, Path)>
					//   15   36:astore_2        
							listener.onComplete(firebaseerror, firebase);
					//   16   37:aload_0         
					//   17   38:getfield        #17  <Field AuthenticationManager$12 this$1>
					//   18   41:getfield        #26  <Field com.firebase.client.Firebase$CompletionListener AuthenticationManager$12.val$listener>
					//   19   44:aload_1         
					//   20   45:aload_2         
					//   21   46:invokeinterface #50  <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
						}
					//   22   51:return          
					}

					final _cls12 this$1;

			
			{
				this$1 = _cls12.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AuthenticationManager$12 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//   14   30:aload_0         
			//   15   31:getfield        #23  <Field AuthenticationManager this$0>
			//   16   34:invokestatic    #53  <Method PersistentConnection AuthenticationManager.access$500(AuthenticationManager)>
			//   17   37:new             #13  <Class AuthenticationManager$12$1>
			//   18   40:dup             
			//   19   41:aload_0         
			//   20   42:invokespecial   #56  <Method void AuthenticationManager$12$1(AuthenticationManager$12)>
			//   21   45:invokevirtual   #61  <Method void PersistentConnection.unauth(com.firebase.client.Firebase$CompletionListener)>
				if(connection.writesPaused())
			//*  22   48:aload_0         
			//*  23   49:getfield        #23  <Field AuthenticationManager this$0>
			//*  24   52:invokestatic    #53  <Method PersistentConnection AuthenticationManager.access$500(AuthenticationManager)>
			//*  25   55:invokevirtual   #65  <Method boolean PersistentConnection.writesPaused()>
			//*  26   58:ifeq            96
				{
					if(logger.logsDebug())
			//*  27   61:aload_0         
			//*  28   62:getfield        #23  <Field AuthenticationManager this$0>
			//*  29   65:invokestatic    #69  <Method LogWrapper AuthenticationManager.access$1800(AuthenticationManager)>
			//*  30   68:invokevirtual   #74  <Method boolean LogWrapper.logsDebug()>
			//*  31   71:ifeq            86
						logger.debug("Unpausing writes after explicit unauth.");
			//   32   74:aload_0         
			//   33   75:getfield        #23  <Field AuthenticationManager this$0>
			//   34   78:invokestatic    #69  <Method LogWrapper AuthenticationManager.access$1800(AuthenticationManager)>
			//   35   81:ldc1            #76  <String "Unpausing writes after explicit unauth.">
			//   36   83:invokevirtual   #80  <Method void LogWrapper.debug(String)>
					connection.unpauseWrites();
			//   37   86:aload_0         
			//   38   87:getfield        #23  <Field AuthenticationManager this$0>
			//   39   90:invokestatic    #53  <Method PersistentConnection AuthenticationManager.access$500(AuthenticationManager)>
			//   40   93:invokevirtual   #83  <Method void PersistentConnection.unpauseWrites()>
				}
			//   41   96:return          
			}

			final AuthenticationManager this$0;
			final com.firebase.client.Firebase.CompletionListener val$listener;
			final Semaphore val$semaphore;

			
			{
				this$0 = AuthenticationManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AuthenticationManager this$0>
				semaphore = semaphore1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Semaphore val$semaphore>
				listener = completionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field com.firebase.client.Firebase$CompletionListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    7   13:aload_0         
	//    8   14:new             #14  <Class AuthenticationManager$12>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_1         
	//   13   21:invokespecial   #773 <Method void AuthenticationManager$12(AuthenticationManager, Semaphore, com.firebase.client.Firebase$CompletionListener)>
	//   14   24:invokespecial   #248 <Method void scheduleNow(Runnable)>
		if(flag)
	//*  15   27:iload_2         
	//*  16   28:ifeq            46
			try
			{
				semaphore.acquire();
	//   17   31:aload_3         
	//   18   32:invokevirtual   #776 <Method void Semaphore.acquire()>
				return;
	//   19   35:return          
			}
			// Misplaced declaration of an exception variable
			catch(final com.firebase.client.Firebase.CompletionListener listener)
	//*  20   36:astore_1        
			{
				throw new RuntimeException(((Throwable) (listener)));
	//   21   37:new             #635 <Class RuntimeException>
	//   22   40:dup             
	//   23   41:aload_1         
	//   24   42:invokespecial   #638 <Method void RuntimeException(Throwable)>
	//   25   45:athrow          
			}
		else
			return;
	//   26   46:return          
	}

	static final boolean $assertionsDisabled = false;
	private static final String AUTH_DATA_KEY = "authData";
	private static final int CONNECTION_TIMEOUT = 20000;
	private static final String CUSTOM_PROVIDER = "custom";
	private static final String ERROR_KEY = "error";
	private static final String LOG_TAG = "AuthenticationManager";
	private static final String TOKEN_KEY = "token";
	private static final String USER_DATA_KEY = "userData";
	private AuthData authData;
	private final PersistentConnection connection;
	private final Context context;
	private AuthAttempt currentAuthAttempt;
	private final Set listenerSet = new HashSet();
	private final LogWrapper logger;
	private final Repo repo;
	private final RepoInfo repoInfo;
	private final CredentialStore store;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$1000(AuthenticationManager authenticationmanager, FirebaseError firebaseerror, AuthAttempt authattempt)
	{
		authenticationmanager.fireAuthErrorIfNotPreempted(firebaseerror, authattempt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #158 <Method void fireAuthErrorIfNotPreempted(FirebaseError, AuthenticationManager$AuthAttempt)>
		return;
	//    4    6:return          
	}

*/


/*
	static AuthData access$1100(AuthenticationManager authenticationmanager)
	{
		return authenticationmanager.authData;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field AuthData authData>
	//    2    4:areturn         
	}

*/


/*
	static void access$1200(AuthenticationManager authenticationmanager, com.firebase.client.Firebase.ValueResultHandler valueresulthandler, Object obj)
	{
		authenticationmanager.fireOnSuccess(valueresulthandler, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #166 <Method void fireOnSuccess(com.firebase.client.Firebase$ValueResultHandler, Object)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$1300(AuthenticationManager authenticationmanager, com.firebase.client.Firebase.ValueResultHandler valueresulthandler, FirebaseError firebaseerror)
	{
		authenticationmanager.fireOnError(valueresulthandler, firebaseerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #172 <Method void fireOnError(com.firebase.client.Firebase$ValueResultHandler, FirebaseError)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$1400(AuthenticationManager authenticationmanager)
	{
		authenticationmanager.preemptAnyExistingAttempts();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void preemptAnyExistingAttempts()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1500(AuthenticationManager authenticationmanager, AuthData authdata)
	{
		authenticationmanager.updateAuthState(authdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void updateAuthState(AuthData)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$1600(AuthenticationManager authenticationmanager)
	{
		return authenticationmanager.clearSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method boolean clearSession()>
	//    2    4:ireturn         
	}

*/


/*
	static Repo access$1700(AuthenticationManager authenticationmanager)
	{
		return authenticationmanager.repo;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Repo repo>
	//    2    4:areturn         
	}

*/


/*
	static LogWrapper access$1800(AuthenticationManager authenticationmanager)
	{
		return authenticationmanager.logger;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field LogWrapper logger>
	//    2    4:areturn         
	}

*/


/*
	static Set access$1900(AuthenticationManager authenticationmanager)
	{
		return authenticationmanager.listenerSet;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field Set listenerSet>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(AuthenticationManager authenticationmanager, Runnable runnable)
	{
		authenticationmanager.fireEvent(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void fireEvent(Runnable)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$2000(AuthenticationManager authenticationmanager, String s, Map map, com.firebase.client.Firebase.AuthResultHandler authresulthandler)
	{
		authenticationmanager.makeAuthenticationRequest(s, map, authresulthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #207 <Method void makeAuthenticationRequest(String, Map, com.firebase.client.Firebase$AuthResultHandler)>
		return;
	//    5    7:return          
	}

*/


/*
	static AuthAttempt access$2100(AuthenticationManager authenticationmanager, com.firebase.client.Firebase.AuthResultHandler authresulthandler)
	{
		return authenticationmanager.newAuthAttempt(authresulthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method AuthenticationManager$AuthAttempt newAuthAttempt(com.firebase.client.Firebase$AuthResultHandler)>
	//    3    5:areturn         
	}

*/


/*
	static AuthAttempt access$2200(AuthenticationManager authenticationmanager, com.firebase.client.Firebase.AuthListener authlistener)
	{
		return authenticationmanager.newAuthAttempt(authlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #218 <Method AuthenticationManager$AuthAttempt newAuthAttempt(com.firebase.client.Firebase$AuthListener)>
	//    3    5:areturn         
	}

*/


/*
	static void access$2300(AuthenticationManager authenticationmanager, String s, com.firebase.client.utilities.HttpUtilities.HttpRequestType httprequesttype, Map map, Map map1, com.firebase.client.Firebase.ValueResultHandler valueresulthandler, boolean flag)
	{
		authenticationmanager.makeOperationRequestWithResult(s, httprequesttype, map, map1, valueresulthandler, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #224 <Method void makeOperationRequestWithResult(String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ValueResultHandler, boolean)>
		return;
	//    8   13:return          
	}

*/


/*
	static void access$2400(AuthenticationManager authenticationmanager, String s, com.firebase.client.utilities.HttpUtilities.HttpRequestType httprequesttype, Map map, Map map1, com.firebase.client.Firebase.ResultHandler resulthandler, boolean flag)
	{
		authenticationmanager.makeOperationRequest(s, httprequesttype, map, map1, resulthandler, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #230 <Method void makeOperationRequest(String, com.firebase.client.utilities.HttpUtilities$HttpRequestType, Map, Map, com.firebase.client.Firebase$ResultHandler, boolean)>
		return;
	//    8   13:return          
	}

*/


/*
	static void access$300(AuthenticationManager authenticationmanager, FirebaseError firebaseerror, AuthAttempt authattempt, boolean flag)
	{
		authenticationmanager.handleBadAuthStatus(firebaseerror, authattempt, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #236 <Method void handleBadAuthStatus(FirebaseError, AuthenticationManager$AuthAttempt, boolean)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$400(AuthenticationManager authenticationmanager, String s, Map map, Map map1, boolean flag, AuthAttempt authattempt)
	{
		authenticationmanager.handleAuthSuccess(s, map, map1, flag, authattempt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #242 <Method void handleAuthSuccess(String, Map, Map, boolean, AuthenticationManager$AuthAttempt)>
		return;
	//    7   11:return          
	}

*/


/*
	static PersistentConnection access$500(AuthenticationManager authenticationmanager)
	{
		return authenticationmanager.connection;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field PersistentConnection connection>
	//    2    4:areturn         
	}

*/


/*
	static void access$600(AuthenticationManager authenticationmanager, Runnable runnable)
	{
		authenticationmanager.scheduleNow(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #248 <Method void scheduleNow(Runnable)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$700(AuthenticationManager authenticationmanager, AuthAttempt authattempt)
	{
		return authenticationmanager.attemptHasBeenPreempted(authattempt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #254 <Method boolean attemptHasBeenPreempted(AuthenticationManager$AuthAttempt)>
	//    3    5:ireturn         
	}

*/


/*
	static void access$800(AuthenticationManager authenticationmanager, String s, Map map, AuthAttempt authattempt)
	{
		authenticationmanager.authWithCredential(s, map, authattempt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #260 <Method void authWithCredential(String, Map, AuthenticationManager$AuthAttempt)>
		return;
	//    5    7:return          
	}

*/


/*
	static FirebaseError access$900(AuthenticationManager authenticationmanager, Object obj)
	{
		return authenticationmanager.decodeErrorResponse(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #266 <Method FirebaseError decodeErrorResponse(Object)>
	//    3    5:areturn         
	}

*/
}
