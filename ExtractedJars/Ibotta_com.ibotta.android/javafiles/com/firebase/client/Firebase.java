// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.firebase.client.authentication.AuthenticationManager;
import com.firebase.client.core.CompoundWrite;
import com.firebase.client.core.Context;
import com.firebase.client.core.Path;
import com.firebase.client.core.Repo;
import com.firebase.client.core.RepoManager;
import com.firebase.client.core.ValidationPath;
import com.firebase.client.core.view.QueryParams;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.Node;
import com.firebase.client.snapshot.NodeUtilities;
import com.firebase.client.snapshot.PriorityUtilities;
import com.firebase.client.utilities.ParsedUrl;
import com.firebase.client.utilities.PushIdGenerator;
import com.firebase.client.utilities.Utilities;
import com.firebase.client.utilities.Validation;
import com.firebase.client.utilities.encoding.JsonHelpers;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

// Referenced classes of package com.firebase.client:
//			Query, Config, FirebaseException, OnDisconnect, 
//			FirebaseApp, AuthData, FirebaseError

public class Firebase extends Query
{
	public static interface AuthListener
	{

		public abstract void onAuthError(FirebaseError firebaseerror);

		public abstract void onAuthRevoked(FirebaseError firebaseerror);

		public abstract void onAuthSuccess(Object obj);
	}

	public static interface AuthResultHandler
	{

		public abstract void onAuthenticated(AuthData authdata);

		public abstract void onAuthenticationError(FirebaseError firebaseerror);
	}

	public static interface AuthStateListener
	{

		public abstract void onAuthStateChanged(AuthData authdata);
	}

	public static interface CompletionListener
	{

		public abstract void onComplete(FirebaseError firebaseerror, Firebase firebase);
	}

	public static interface ResultHandler
	{

		public abstract void onError(FirebaseError firebaseerror);

		public abstract void onSuccess();
	}

	public static interface ValueResultHandler
	{

		public abstract void onError(FirebaseError firebaseerror);

		public abstract void onSuccess(Object obj);
	}


	public Firebase(Repo repo, Path path)
	{
		super(repo, path);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void Query(Repo, Path)>
	//    4    6:return          
	}

	private Firebase(ParsedUrl parsedurl)
	{
		this(parsedurl, getDefaultConfig());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #44  <Method Config getDefaultConfig()>
	//    3    5:invokespecial   #47  <Method void Firebase(ParsedUrl, Config)>
	//    4    8:return          
	}

	private Firebase(ParsedUrl parsedurl, Config config)
	{
		super(RepoManager.getRepo(((Context) (config)), parsedurl.repoInfo), parsedurl.path, QueryParams.DEFAULT_PARAMS, false);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:getfield        #53  <Field com.firebase.client.core.RepoInfo ParsedUrl.repoInfo>
	//    4    6:invokestatic    #59  <Method Repo RepoManager.getRepo(Context, com.firebase.client.core.RepoInfo)>
	//    5    9:aload_1         
	//    6   10:getfield        #63  <Field Path ParsedUrl.path>
	//    7   13:getstatic       #69  <Field QueryParams QueryParams.DEFAULT_PARAMS>
	//    8   16:iconst_0        
	//    9   17:invokespecial   #72  <Method void Query(Repo, Path, QueryParams, boolean)>
	//   10   20:return          
	}

	public Firebase(String s)
	{
		this(Utilities.parseUrl(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #79  <Method ParsedUrl Utilities.parseUrl(String)>
	//    3    5:invokespecial   #81  <Method void Firebase(ParsedUrl)>
	//    4    8:return          
	}

	Firebase(String s, Config config)
	{
		this(Utilities.parseUrl(s), config);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #79  <Method ParsedUrl Utilities.parseUrl(String)>
	//    3    5:aload_2         
	//    4    6:invokespecial   #47  <Method void Firebase(ParsedUrl, Config)>
	//    5    9:return          
	}

	private AuthenticationManager getAuthenticationManager()
	{
		return getRepo().getAuthenticationManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method Repo getRepo()>
	//    2    4:invokevirtual   #91  <Method AuthenticationManager Repo.getAuthenticationManager()>
	//    3    7:areturn         
	}

	public static Config getDefaultConfig()
	{
		com/firebase/client/Firebase;
	//    0    0:ldc1            #2   <Class Firebase>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Config config;
		if(defaultConfig == null)
	//*   2    3:getstatic       #93  <Field Config defaultConfig>
	//*   3    6:ifnonnull       19
			defaultConfig = new Config();
	//    4    9:new             #95  <Class Config>
	//    5   12:dup             
	//    6   13:invokespecial   #98  <Method void Config()>
	//    7   16:putstatic       #93  <Field Config defaultConfig>
		config = defaultConfig;
	//    8   19:getstatic       #93  <Field Config defaultConfig>
	//    9   22:astore_0        
		com/firebase/client/Firebase;
	//   10   23:ldc1            #2   <Class Firebase>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return config;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class Firebase>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	public static String getSdkVersion()
	{
		return "2.5.2";
	//    0    0:ldc1            #102 <String "2.5.2">
	//    1    2:areturn         
	}

	public static void goOffline()
	{
		goOffline(getDefaultConfig());
	//    0    0:invokestatic    #44  <Method Config getDefaultConfig()>
	//    1    3:invokestatic    #106 <Method void goOffline(Config)>
	//    2    6:return          
	}

	static void goOffline(Config config)
	{
		RepoManager.interrupt(((Context) (config)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #110 <Method void RepoManager.interrupt(Context)>
	//    2    4:return          
	}

	public static void goOnline()
	{
		goOnline(getDefaultConfig());
	//    0    0:invokestatic    #44  <Method Config getDefaultConfig()>
	//    1    3:invokestatic    #113 <Method void goOnline(Config)>
	//    2    6:return          
	}

	static void goOnline(Config config)
	{
		RepoManager.resume(((Context) (config)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #116 <Method void RepoManager.resume(Context)>
	//    2    4:return          
	}

	public static void setAndroidContext(android.content.Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
		{
			Context.setAndroidContext(context);
	//    2    4:aload_0         
	//    3    5:invokestatic    #122 <Method void Context.setAndroidContext(android.content.Context)>
			return;
	//    4    8:return          
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'context' in setAndroidContext()");
	//    5    9:new             #124 <Class NullPointerException>
	//    6   12:dup             
	//    7   13:ldc1            #126 <String "Can't pass null for argument 'context' in setAndroidContext()">
	//    8   15:invokespecial   #128 <Method void NullPointerException(String)>
	//    9   18:athrow          
		}
	}

	public static void setDefaultConfig(Config config)
	{
		com/firebase/client/Firebase;
	//    0    0:ldc1            #2   <Class Firebase>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(defaultConfig == null || !defaultConfig.isFrozen())
	//*   2    3:getstatic       #93  <Field Config defaultConfig>
	//*   3    6:ifnull          31
	//*   4    9:getstatic       #93  <Field Config defaultConfig>
	//*   5   12:invokevirtual   #133 <Method boolean Config.isFrozen()>
	//*   6   15:ifne            21
			break MISSING_BLOCK_LABEL_31;
	//    7   18:goto            31
		throw new FirebaseException("Modifications to Config objects must occur before they are in use");
	//    8   21:new             #135 <Class FirebaseException>
	//    9   24:dup             
	//   10   25:ldc1            #137 <String "Modifications to Config objects must occur before they are in use">
	//   11   27:invokespecial   #138 <Method void FirebaseException(String)>
	//   12   30:athrow          
		defaultConfig = config;
	//   13   31:aload_0         
	//   14   32:putstatic       #93  <Field Config defaultConfig>
		com/firebase/client/Firebase;
	//   15   35:ldc1            #2   <Class Firebase>
		JVM INSTR monitorexit ;
	//   16   37:monitorexit     
		return;
	//   17   38:return          
		config;
	//   18   39:astore_0        
	//*  19   40:ldc1            #2   <Class Firebase>
		throw config;
	//   20   42:monitorexit     
	//   21   43:aload_0         
	//   22   44:athrow          
	}

	private void setPriorityInternal(final Node priority, final CompletionListener listener)
	{
		Validation.validateWritablePath(getPath());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method Path getPath()>
	//    2    4:invokestatic    #150 <Method void Validation.validateWritablePath(Path)>
		repo.scheduleNow(new Runnable() {

			public void run()
			{
				repo.setValue(getPath().child(ChildKey.getPriorityKey()), priority, listener);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Firebase this$0>
			//    2    4:getfield        #34  <Field Repo Firebase.repo>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field Firebase this$0>
			//    5   11:invokevirtual   #38  <Method Path Firebase.getPath()>
			//    6   14:invokestatic    #44  <Method ChildKey ChildKey.getPriorityKey()>
			//    7   17:invokevirtual   #50  <Method Path Path.child(ChildKey)>
			//    8   20:aload_0         
			//    9   21:getfield        #23  <Field Node val$priority>
			//   10   24:aload_0         
			//   11   25:getfield        #25  <Field Firebase$CompletionListener val$listener>
			//   12   28:invokevirtual   #56  <Method void Repo.setValue(Path, Node, Firebase$CompletionListener)>
			//   13   31:return          
			}

			final Firebase this$0;
			final CompletionListener val$listener;
			final Node val$priority;

			
			{
				this$0 = Firebase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Firebase this$0>
				priority = node;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Node val$priority>
				listener = completionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Firebase$CompletionListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field Repo repo>
	//    5   11:new             #8   <Class Firebase$2>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #157 <Method void Firebase$2(Firebase, Node, Firebase$CompletionListener)>
	//   11   21:invokevirtual   #161 <Method void Repo.scheduleNow(Runnable)>
	//   12   24:return          
	}

	private void setValueInternal(final Object node, Node node1, final CompletionListener listener)
	{
		Validation.validateWritablePath(getPath());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method Path getPath()>
	//    2    4:invokestatic    #150 <Method void Validation.validateWritablePath(Path)>
		ValidationPath.validateWithObject(getPath(), node);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #144 <Method Path getPath()>
	//    5   11:aload_1         
	//    6   12:invokestatic    #171 <Method void ValidationPath.validateWithObject(Path, Object)>
		try
		{
			node = JsonHelpers.getMapper().convertValue(node, java/lang/Object);
	//    7   15:invokestatic    #177 <Method ObjectMapper JsonHelpers.getMapper()>
	//    8   18:aload_1         
	//    9   19:ldc1            #179 <Class Object>
	//   10   21:invokevirtual   #185 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   11   24:astore_1        
			Validation.validateWritableObject(node);
	//   12   25:aload_1         
	//   13   26:invokestatic    #189 <Method void Validation.validateWritableObject(Object)>
			node = ((Object) (NodeUtilities.NodeFromJSON(node, node1)));
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokestatic    #195 <Method Node NodeUtilities.NodeFromJSON(Object, Node)>
	//   17   34:astore_1        
			repo.scheduleNow(new Runnable() {

				public void run()
				{
					repo.setValue(getPath(), node, listener);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Firebase this$0>
				//    2    4:getfield        #34  <Field Repo Firebase.repo>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field Firebase this$0>
				//    5   11:invokevirtual   #38  <Method Path Firebase.getPath()>
				//    6   14:aload_0         
				//    7   15:getfield        #23  <Field Node val$node>
				//    8   18:aload_0         
				//    9   19:getfield        #25  <Field Firebase$CompletionListener val$listener>
				//   10   22:invokevirtual   #44  <Method void Repo.setValue(Path, Node, Firebase$CompletionListener)>
				//   11   25:return          
				}

				final Firebase this$0;
				final CompletionListener val$listener;
				final Node val$node;

			
			{
				this$0 = Firebase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Firebase this$0>
				node = node1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Node val$node>
				listener = completionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Firebase$CompletionListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   18   35:aload_0         
	//   19   36:getfield        #154 <Field Repo repo>
	//   20   39:new             #6   <Class Firebase$1>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:aload_3         
	//   25   46:invokespecial   #196 <Method void Firebase$1(Firebase, Node, Firebase$CompletionListener)>
	//   26   49:invokevirtual   #161 <Method void Repo.scheduleNow(Runnable)>
			return;
	//   27   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(final Object node)
	//*  28   53:astore_1        
		{
			throw new FirebaseException("Failed to parse to snapshot", ((Throwable) (node)));
	//   29   54:new             #135 <Class FirebaseException>
	//   30   57:dup             
	//   31   58:ldc1            #198 <String "Failed to parse to snapshot">
	//   32   60:aload_1         
	//   33   61:invokespecial   #201 <Method void FirebaseException(String, Throwable)>
	//   34   64:athrow          
		}
	}

	public AuthStateListener addAuthStateListener(AuthStateListener authstatelistener)
	{
		if(authstatelistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
		{
			getAuthenticationManager().addAuthStateListener(authstatelistener);
	//    2    4:aload_0         
	//    3    5:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #209 <Method void AuthenticationManager.addAuthStateListener(Firebase$AuthStateListener)>
			return authstatelistener;
	//    6   12:aload_1         
	//    7   13:areturn         
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'listener' in addAuthStateListener()");
	//    8   14:new             #124 <Class NullPointerException>
	//    9   17:dup             
	//   10   18:ldc1            #211 <String "Can't pass null for argument 'listener' in addAuthStateListener()">
	//   11   20:invokespecial   #128 <Method void NullPointerException(String)>
	//   12   23:athrow          
		}
	}

	public void auth(String s, AuthListener authlistener)
	{
		if(authlistener != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          28
		{
			if(s != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          18
			{
				getAuthenticationManager().authWithFirebaseToken(s, authlistener);
	//    4    8:aload_0         
	//    5    9:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #217 <Method void AuthenticationManager.authWithFirebaseToken(String, Firebase$AuthListener)>
				return;
	//    9   17:return          
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'credential' in auth()");
	//   10   18:new             #124 <Class NullPointerException>
	//   11   21:dup             
	//   12   22:ldc1            #219 <String "Can't pass null for argument 'credential' in auth()">
	//   13   24:invokespecial   #128 <Method void NullPointerException(String)>
	//   14   27:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'listener' in auth()");
	//   15   28:new             #124 <Class NullPointerException>
	//   16   31:dup             
	//   17   32:ldc1            #221 <String "Can't pass null for argument 'listener' in auth()">
	//   18   34:invokespecial   #128 <Method void NullPointerException(String)>
	//   19   37:athrow          
		}
	}

	public void authAnonymously(AuthResultHandler authresulthandler)
	{
		getAuthenticationManager().authAnonymously(authresulthandler);
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #226 <Method void AuthenticationManager.authAnonymously(Firebase$AuthResultHandler)>
	//    4    8:return          
	}

	public void authWithCustomToken(String s, AuthResultHandler authresulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
		{
			getAuthenticationManager().authWithCustomToken(s, authresulthandler);
	//    2    4:aload_0         
	//    3    5:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #230 <Method void AuthenticationManager.authWithCustomToken(String, Firebase$AuthResultHandler)>
			return;
	//    7   13:return          
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'token' in authWithCustomToken()");
	//    8   14:new             #124 <Class NullPointerException>
	//    9   17:dup             
	//   10   18:ldc1            #232 <String "Can't pass null for argument 'token' in authWithCustomToken()">
	//   11   20:invokespecial   #128 <Method void NullPointerException(String)>
	//   12   23:athrow          
		}
	}

	public void authWithOAuthToken(String s, String s1, AuthResultHandler authresulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			{
				getAuthenticationManager().authWithOAuthToken(s, s1, authresulthandler);
	//    4    8:aload_0         
	//    5    9:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #236 <Method void AuthenticationManager.authWithOAuthToken(String, String, Firebase$AuthResultHandler)>
				return;
	//   10   18:return          
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'token' in authWithOAuthToken()");
	//   11   19:new             #124 <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc1            #238 <String "Can't pass null for argument 'token' in authWithOAuthToken()">
	//   14   25:invokespecial   #128 <Method void NullPointerException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'provider' in authWithOAuthToken()");
	//   16   29:new             #124 <Class NullPointerException>
	//   17   32:dup             
	//   18   33:ldc1            #240 <String "Can't pass null for argument 'provider' in authWithOAuthToken()">
	//   19   35:invokespecial   #128 <Method void NullPointerException(String)>
	//   20   38:athrow          
		}
	}

	public void authWithOAuthToken(String s, Map map, AuthResultHandler authresulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
		{
			if(map != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			{
				getAuthenticationManager().authWithOAuthToken(s, map, authresulthandler);
	//    4    8:aload_0         
	//    5    9:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #243 <Method void AuthenticationManager.authWithOAuthToken(String, Map, Firebase$AuthResultHandler)>
				return;
	//   10   18:return          
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'options' in authWithOAuthToken()");
	//   11   19:new             #124 <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc1            #245 <String "Can't pass null for argument 'options' in authWithOAuthToken()">
	//   14   25:invokespecial   #128 <Method void NullPointerException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'provider' in authWithOAuthToken()");
	//   16   29:new             #124 <Class NullPointerException>
	//   17   32:dup             
	//   18   33:ldc1            #240 <String "Can't pass null for argument 'provider' in authWithOAuthToken()">
	//   19   35:invokespecial   #128 <Method void NullPointerException(String)>
	//   20   38:athrow          
		}
	}

	public void authWithPassword(String s, String s1, AuthResultHandler authresulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			{
				getAuthenticationManager().authWithPassword(s, s1, authresulthandler);
	//    4    8:aload_0         
	//    5    9:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #250 <Method void AuthenticationManager.authWithPassword(String, String, Firebase$AuthResultHandler)>
				return;
	//   10   18:return          
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'password' in authWithPassword()");
	//   11   19:new             #124 <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc1            #252 <String "Can't pass null for argument 'password' in authWithPassword()">
	//   14   25:invokespecial   #128 <Method void NullPointerException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'email' in authWithPassword()");
	//   16   29:new             #124 <Class NullPointerException>
	//   17   32:dup             
	//   18   33:ldc1            #254 <String "Can't pass null for argument 'email' in authWithPassword()">
	//   19   35:invokespecial   #128 <Method void NullPointerException(String)>
	//   20   38:athrow          
		}
	}

	public void changeEmail(String s, String s1, String s2, ResultHandler resulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          36
			{
				if(s2 != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          25
				{
					getAuthenticationManager().changeEmail(s, s1, s2, resulthandler);
	//    6   12:aload_0         
	//    7   13:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload           4
	//   12   21:invokevirtual   #258 <Method void AuthenticationManager.changeEmail(String, String, String, Firebase$ResultHandler)>
					return;
	//   13   24:return          
				} else
				{
					throw new NullPointerException("Can't pass null for argument 'newEmail' in changeEmail()");
	//   14   25:new             #124 <Class NullPointerException>
	//   15   28:dup             
	//   16   29:ldc2            #260 <String "Can't pass null for argument 'newEmail' in changeEmail()">
	//   17   32:invokespecial   #128 <Method void NullPointerException(String)>
	//   18   35:athrow          
				}
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'password' in changeEmail()");
	//   19   36:new             #124 <Class NullPointerException>
	//   20   39:dup             
	//   21   40:ldc2            #262 <String "Can't pass null for argument 'password' in changeEmail()">
	//   22   43:invokespecial   #128 <Method void NullPointerException(String)>
	//   23   46:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'oldEmail' in changeEmail()");
	//   24   47:new             #124 <Class NullPointerException>
	//   25   50:dup             
	//   26   51:ldc2            #264 <String "Can't pass null for argument 'oldEmail' in changeEmail()">
	//   27   54:invokespecial   #128 <Method void NullPointerException(String)>
	//   28   57:athrow          
		}
	}

	public void changePassword(String s, String s1, String s2, ResultHandler resulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          36
			{
				if(s2 != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          25
				{
					getAuthenticationManager().changePassword(s, s1, s2, resulthandler);
	//    6   12:aload_0         
	//    7   13:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload           4
	//   12   21:invokevirtual   #267 <Method void AuthenticationManager.changePassword(String, String, String, Firebase$ResultHandler)>
					return;
	//   13   24:return          
				} else
				{
					throw new NullPointerException("Can't pass null for argument 'newPassword' in changePassword()");
	//   14   25:new             #124 <Class NullPointerException>
	//   15   28:dup             
	//   16   29:ldc2            #269 <String "Can't pass null for argument 'newPassword' in changePassword()">
	//   17   32:invokespecial   #128 <Method void NullPointerException(String)>
	//   18   35:athrow          
				}
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'oldPassword' in changePassword()");
	//   19   36:new             #124 <Class NullPointerException>
	//   20   39:dup             
	//   21   40:ldc2            #271 <String "Can't pass null for argument 'oldPassword' in changePassword()">
	//   22   43:invokespecial   #128 <Method void NullPointerException(String)>
	//   23   46:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'email' in changePassword()");
	//   24   47:new             #124 <Class NullPointerException>
	//   25   50:dup             
	//   26   51:ldc2            #273 <String "Can't pass null for argument 'email' in changePassword()">
	//   27   54:invokespecial   #128 <Method void NullPointerException(String)>
	//   28   57:athrow          
		}
	}

	public Firebase child(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			if(getPath().isEmpty())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #144 <Method Path getPath()>
	//*   4    8:invokevirtual   #280 <Method boolean Path.isEmpty()>
	//*   5   11:ifeq            21
				Validation.validateRootPathString(s);
	//    6   14:aload_1         
	//    7   15:invokestatic    #283 <Method void Validation.validateRootPathString(String)>
			else
	//*   8   18:goto            25
				Validation.validatePathString(s);
	//    9   21:aload_1         
	//   10   22:invokestatic    #286 <Method void Validation.validatePathString(String)>
			s = ((String) (getPath().child(new Path(s))));
	//   11   25:aload_0         
	//   12   26:invokevirtual   #144 <Method Path getPath()>
	//   13   29:new             #277 <Class Path>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:invokespecial   #287 <Method void Path(String)>
	//   17   37:invokevirtual   #290 <Method Path Path.child(Path)>
	//   18   40:astore_1        
			return new Firebase(repo, ((Path) (s)));
	//   19   41:new             #2   <Class Firebase>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:getfield        #154 <Field Repo repo>
	//   23   49:aload_1         
	//   24   50:invokespecial   #291 <Method void Firebase(Repo, Path)>
	//   25   53:areturn         
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
	//   26   54:new             #124 <Class NullPointerException>
	//   27   57:dup             
	//   28   58:ldc2            #293 <String "Can't pass null for argument 'pathString' in child()">
	//   29   61:invokespecial   #128 <Method void NullPointerException(String)>
	//   30   64:athrow          
		}
	}

	public void createUser(String s, String s1, ResultHandler resulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			{
				getAuthenticationManager().createUser(s, s1, resulthandler);
	//    4    8:aload_0         
	//    5    9:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #297 <Method void AuthenticationManager.createUser(String, String, Firebase$ResultHandler)>
				return;
	//   10   18:return          
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'password' in createUser()");
	//   11   19:new             #124 <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc2            #299 <String "Can't pass null for argument 'password' in createUser()">
	//   14   26:invokespecial   #128 <Method void NullPointerException(String)>
	//   15   29:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'email' in createUser()");
	//   16   30:new             #124 <Class NullPointerException>
	//   17   33:dup             
	//   18   34:ldc2            #301 <String "Can't pass null for argument 'email' in createUser()">
	//   19   37:invokespecial   #128 <Method void NullPointerException(String)>
	//   20   40:athrow          
		}
	}

	public void createUser(String s, String s1, ValueResultHandler valueresulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			{
				getAuthenticationManager().createUser(s, s1, valueresulthandler);
	//    4    8:aload_0         
	//    5    9:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #304 <Method void AuthenticationManager.createUser(String, String, Firebase$ValueResultHandler)>
				return;
	//   10   18:return          
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'password' in createUser()");
	//   11   19:new             #124 <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc2            #299 <String "Can't pass null for argument 'password' in createUser()">
	//   14   26:invokespecial   #128 <Method void NullPointerException(String)>
	//   15   29:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'email' in createUser()");
	//   16   30:new             #124 <Class NullPointerException>
	//   17   33:dup             
	//   18   34:ldc2            #301 <String "Can't pass null for argument 'email' in createUser()">
	//   19   37:invokespecial   #128 <Method void NullPointerException(String)>
	//   20   40:athrow          
		}
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof Firebase) && toString().equals(((Object) (obj.toString())));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class Firebase>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:invokevirtual   #310 <Method String toString()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #311 <Method String Object.toString()>
	//    7   15:invokevirtual   #315 <Method boolean String.equals(Object)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public FirebaseApp getApp()
	{
		return repo.getFirebaseApp();
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field Repo repo>
	//    2    4:invokevirtual   #320 <Method FirebaseApp Repo.getFirebaseApp()>
	//    3    7:areturn         
	}

	public AuthData getAuth()
	{
		return getAuthenticationManager().getAuth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    2    4:invokevirtual   #324 <Method AuthData AuthenticationManager.getAuth()>
	//    3    7:areturn         
	}

	public String getKey()
	{
		if(getPath().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #144 <Method Path getPath()>
	//*   2    4:invokevirtual   #280 <Method boolean Path.isEmpty()>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return getPath().getBack().asString();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #144 <Method Path getPath()>
	//    8   16:invokevirtual   #329 <Method ChildKey Path.getBack()>
	//    9   19:invokevirtual   #334 <Method String ChildKey.asString()>
	//   10   22:areturn         
	}

	public Firebase getParent()
	{
		Path path = getPath().getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method Path getPath()>
	//    2    4:invokevirtual   #338 <Method Path Path.getParent()>
	//    3    7:astore_1        
		if(path != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          25
			return new Firebase(repo, path);
	//    6   12:new             #2   <Class Firebase>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #154 <Field Repo repo>
	//   10   20:aload_1         
	//   11   21:invokespecial   #291 <Method void Firebase(Repo, Path)>
	//   12   24:areturn         
		else
			return null;
	//   13   25:aconst_null     
	//   14   26:areturn         
	}

	public Firebase getRoot()
	{
		return new Firebase(repo, new Path(""));
	//    0    0:new             #2   <Class Firebase>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #154 <Field Repo repo>
	//    4    8:new             #277 <Class Path>
	//    5   11:dup             
	//    6   12:ldc2            #341 <String "">
	//    7   15:invokespecial   #287 <Method void Path(String)>
	//    8   18:invokespecial   #291 <Method void Firebase(Repo, Path)>
	//    9   21:areturn         
	}

	public int hashCode()
	{
		return toString().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #310 <Method String toString()>
	//    2    4:invokevirtual   #345 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public OnDisconnect onDisconnect()
	{
		Validation.validateWritablePath(getPath());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method Path getPath()>
	//    2    4:invokestatic    #150 <Method void Validation.validateWritablePath(Path)>
		return new OnDisconnect(repo, getPath());
	//    3    7:new             #349 <Class OnDisconnect>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #154 <Field Repo repo>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #144 <Method Path getPath()>
	//    9   19:invokespecial   #350 <Method void OnDisconnect(Repo, Path)>
	//   10   22:areturn         
	}

	public Firebase push()
	{
		ChildKey childkey = ChildKey.fromString(PushIdGenerator.generatePushChildName(repo.getServerTime()));
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field Repo repo>
	//    2    4:invokevirtual   #355 <Method long Repo.getServerTime()>
	//    3    7:invokestatic    #361 <Method String PushIdGenerator.generatePushChildName(long)>
	//    4   10:invokestatic    #365 <Method ChildKey ChildKey.fromString(String)>
	//    5   13:astore_1        
		return new Firebase(repo, getPath().child(childkey));
	//    6   14:new             #2   <Class Firebase>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #154 <Field Repo repo>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #144 <Method Path getPath()>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #368 <Method Path Path.child(ChildKey)>
	//   14   30:invokespecial   #291 <Method void Firebase(Repo, Path)>
	//   15   33:areturn         
	}

	public void removeAuthStateListener(AuthStateListener authstatelistener)
	{
		if(authstatelistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
		{
			getAuthenticationManager().removeAuthStateListener(authstatelistener);
	//    2    4:aload_0         
	//    3    5:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #371 <Method void AuthenticationManager.removeAuthStateListener(Firebase$AuthStateListener)>
			return;
	//    6   12:return          
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'listener' in removeAuthStateListener()");
	//    7   13:new             #124 <Class NullPointerException>
	//    8   16:dup             
	//    9   17:ldc2            #373 <String "Can't pass null for argument 'listener' in removeAuthStateListener()">
	//   10   20:invokespecial   #128 <Method void NullPointerException(String)>
	//   11   23:athrow          
		}
	}

	public void removeUser(String s, String s1, ResultHandler resulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			{
				getAuthenticationManager().removeUser(s, s1, resulthandler);
	//    4    8:aload_0         
	//    5    9:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #376 <Method void AuthenticationManager.removeUser(String, String, Firebase$ResultHandler)>
				return;
	//   10   18:return          
			} else
			{
				throw new NullPointerException("Can't pass null for argument 'password' in removeUser()");
	//   11   19:new             #124 <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc2            #378 <String "Can't pass null for argument 'password' in removeUser()">
	//   14   26:invokespecial   #128 <Method void NullPointerException(String)>
	//   15   29:athrow          
			}
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'email' in removeUser()");
	//   16   30:new             #124 <Class NullPointerException>
	//   17   33:dup             
	//   18   34:ldc2            #380 <String "Can't pass null for argument 'email' in removeUser()">
	//   19   37:invokespecial   #128 <Method void NullPointerException(String)>
	//   20   40:athrow          
		}
	}

	public void removeValue()
	{
		setValue(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #384 <Method void setValue(Object)>
	//    3    5:return          
	}

	public void removeValue(CompletionListener completionlistener)
	{
		setValue(((Object) (null)), completionlistener);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #388 <Method void setValue(Object, Firebase$CompletionListener)>
	//    4    6:return          
	}

	public void resetPassword(String s, ResultHandler resulthandler)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
		{
			getAuthenticationManager().resetPassword(s, resulthandler);
	//    2    4:aload_0         
	//    3    5:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #392 <Method void AuthenticationManager.resetPassword(String, Firebase$ResultHandler)>
			return;
	//    7   13:return          
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'email' in resetPassword()");
	//    8   14:new             #124 <Class NullPointerException>
	//    9   17:dup             
	//   10   18:ldc2            #394 <String "Can't pass null for argument 'email' in resetPassword()">
	//   11   21:invokespecial   #128 <Method void NullPointerException(String)>
	//   12   24:athrow          
		}
	}

	public void runTransaction(Transaction.Handler handler)
	{
		runTransaction(handler, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #399 <Method void runTransaction(Transaction$Handler, boolean)>
	//    4    6:return          
	}

	public void runTransaction(final Transaction.Handler handler, final boolean fireLocalEvents)
	{
		if(handler != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
		{
			Validation.validateWritablePath(getPath());
	//    2    4:aload_0         
	//    3    5:invokevirtual   #144 <Method Path getPath()>
	//    4    8:invokestatic    #150 <Method void Validation.validateWritablePath(Path)>
			repo.scheduleNow(new Runnable() {

				public void run()
				{
					repo.startTransaction(getPath(), handler, fireLocalEvents);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Firebase this$0>
				//    2    4:getfield        #34  <Field Repo Firebase.repo>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field Firebase this$0>
				//    5   11:invokevirtual   #38  <Method Path Firebase.getPath()>
				//    6   14:aload_0         
				//    7   15:getfield        #23  <Field Transaction$Handler val$handler>
				//    8   18:aload_0         
				//    9   19:getfield        #25  <Field boolean val$fireLocalEvents>
				//   10   22:invokevirtual   #44  <Method void Repo.startTransaction(Path, Transaction$Handler, boolean)>
				//   11   25:return          
				}

				final Firebase this$0;
				final boolean val$fireLocalEvents;
				final Transaction.Handler val$handler;

			
			{
				this$0 = Firebase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Firebase this$0>
				handler = handler1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Transaction$Handler val$handler>
				fireLocalEvents = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field boolean val$fireLocalEvents>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    5   11:aload_0         
	//    6   12:getfield        #154 <Field Repo repo>
	//    7   15:new             #12  <Class Firebase$4>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:invokespecial   #402 <Method void Firebase$4(Firebase, Transaction$Handler, boolean)>
	//   13   25:invokevirtual   #161 <Method void Repo.scheduleNow(Runnable)>
			return;
	//   14   28:return          
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
	//   15   29:new             #124 <Class NullPointerException>
	//   16   32:dup             
	//   17   33:ldc2            #404 <String "Can't pass null for argument 'handler' in runTransaction()">
	//   18   36:invokespecial   #128 <Method void NullPointerException(String)>
	//   19   39:athrow          
		}
	}

	void setHijackHash(final boolean hijackHash)
	{
		repo.scheduleNow(new Runnable() {

			public void run()
			{
				repo.setHijackHash(hijackHash);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Firebase this$0>
			//    2    4:getfield        #30  <Field Repo Firebase.repo>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field boolean val$hijackHash>
			//    5   11:invokevirtual   #33  <Method void Repo.setHijackHash(boolean)>
			//    6   14:return          
			}

			final Firebase this$0;
			final boolean val$hijackHash;

			
			{
				this$0 = Firebase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Firebase this$0>
				hijackHash = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$hijackHash>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field Repo repo>
	//    2    4:new             #14  <Class Firebase$5>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #409 <Method void Firebase$5(Firebase, boolean)>
	//    7   13:invokevirtual   #161 <Method void Repo.scheduleNow(Runnable)>
	//    8   16:return          
	}

	public void setPriority(Object obj)
	{
		setPriorityInternal(PriorityUtilities.parsePriority(obj), ((CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #416 <Method Node PriorityUtilities.parsePriority(Object)>
	//    3    5:aconst_null     
	//    4    6:invokespecial   #418 <Method void setPriorityInternal(Node, Firebase$CompletionListener)>
	//    5    9:return          
	}

	public void setPriority(Object obj, CompletionListener completionlistener)
	{
		setPriorityInternal(PriorityUtilities.parsePriority(obj), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #416 <Method Node PriorityUtilities.parsePriority(Object)>
	//    3    5:aload_2         
	//    4    6:invokespecial   #418 <Method void setPriorityInternal(Node, Firebase$CompletionListener)>
	//    5    9:return          
	}

	public void setValue(Object obj)
	{
		setValueInternal(obj, PriorityUtilities.parsePriority(((Object) (null))), ((CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #416 <Method Node PriorityUtilities.parsePriority(Object)>
	//    4    6:aconst_null     
	//    5    7:invokespecial   #420 <Method void setValueInternal(Object, Node, Firebase$CompletionListener)>
	//    6   10:return          
	}

	public void setValue(Object obj, CompletionListener completionlistener)
	{
		setValueInternal(obj, PriorityUtilities.parsePriority(((Object) (null))), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #416 <Method Node PriorityUtilities.parsePriority(Object)>
	//    4    6:aload_2         
	//    5    7:invokespecial   #420 <Method void setValueInternal(Object, Node, Firebase$CompletionListener)>
	//    6   10:return          
	}

	public void setValue(Object obj, Object obj1)
	{
		setValueInternal(obj, PriorityUtilities.parsePriority(obj1), ((CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #416 <Method Node PriorityUtilities.parsePriority(Object)>
	//    4    6:aconst_null     
	//    5    7:invokespecial   #420 <Method void setValueInternal(Object, Node, Firebase$CompletionListener)>
	//    6   10:return          
	}

	public void setValue(Object obj, Object obj1, CompletionListener completionlistener)
	{
		setValueInternal(obj, PriorityUtilities.parsePriority(obj1), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #416 <Method Node PriorityUtilities.parsePriority(Object)>
	//    4    6:aload_3         
	//    5    7:invokespecial   #420 <Method void setValueInternal(Object, Node, Firebase$CompletionListener)>
	//    6   10:return          
	}

	public String toString()
	{
		Object obj = ((Object) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #426 <Method Firebase getParent()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       17
			return repo.toString();
	//    5    9:aload_0         
	//    6   10:getfield        #154 <Field Repo repo>
	//    7   13:invokevirtual   #427 <Method String Repo.toString()>
	//    8   16:areturn         
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #429 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #430 <Method void StringBuilder()>
	//   12   24:astore_2        
			stringbuilder.append(((Firebase) (obj)).toString());
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #310 <Method String toString()>
	//   16   30:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append("/");
	//   18   34:aload_2         
	//   19   35:ldc2            #436 <String "/">
	//   20   38:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(URLEncoder.encode(getKey(), "UTF-8").replace("+", "%20"));
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #438 <Method String getKey()>
	//   25   47:ldc2            #440 <String "UTF-8">
	//   26   50:invokestatic    #446 <Method String URLEncoder.encode(String, String)>
	//   27   53:ldc2            #448 <String "+">
	//   28   56:ldc2            #450 <String "%20">
	//   29   59:invokevirtual   #454 <Method String String.replace(CharSequence, CharSequence)>
	//   30   62:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   32   66:aload_2         
	//   33   67:invokevirtual   #455 <Method String StringBuilder.toString()>
	//   34   70:astore_1        
		}
	//*  35   71:aload_1         
	//*  36   72:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  37   73:astore_1        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   38   74:new             #429 <Class StringBuilder>
	//   39   77:dup             
	//   40   78:invokespecial   #430 <Method void StringBuilder()>
	//   41   81:astore_2        
			stringbuilder1.append("Failed to URLEncode key: ");
	//   42   82:aload_2         
	//   43   83:ldc2            #457 <String "Failed to URLEncode key: ">
	//   44   86:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
			stringbuilder1.append(getKey());
	//   46   90:aload_2         
	//   47   91:aload_0         
	//   48   92:invokevirtual   #438 <Method String getKey()>
	//   49   95:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//   50   98:pop             
			throw new FirebaseException(stringbuilder1.toString(), ((Throwable) (unsupportedencodingexception)));
	//   51   99:new             #135 <Class FirebaseException>
	//   52  102:dup             
	//   53  103:aload_2         
	//   54  104:invokevirtual   #455 <Method String StringBuilder.toString()>
	//   55  107:aload_1         
	//   56  108:invokespecial   #201 <Method void FirebaseException(String, Throwable)>
	//   57  111:athrow          
		}
		return ((String) (obj));
	}

	public void unauth()
	{
		getAuthenticationManager().unauth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    2    4:invokevirtual   #460 <Method void AuthenticationManager.unauth()>
	//    3    7:return          
	}

	public void unauth(CompletionListener completionlistener)
	{
		if(completionlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
		{
			getAuthenticationManager().unauth(completionlistener);
	//    2    4:aload_0         
	//    3    5:invokespecial   #204 <Method AuthenticationManager getAuthenticationManager()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #462 <Method void AuthenticationManager.unauth(Firebase$CompletionListener)>
			return;
	//    6   12:return          
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'listener' in unauth()");
	//    7   13:new             #124 <Class NullPointerException>
	//    8   16:dup             
	//    9   17:ldc2            #464 <String "Can't pass null for argument 'listener' in unauth()">
	//   10   20:invokespecial   #128 <Method void NullPointerException(String)>
	//   11   23:athrow          
		}
	}

	public void updateChildren(Map map)
	{
		updateChildren(map, ((CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #469 <Method void updateChildren(Map, Firebase$CompletionListener)>
	//    4    6:return          
	}

	public void updateChildren(final Map update, final CompletionListener listener)
	{
		if(update != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          35
		{
			final CompoundWrite merge = CompoundWrite.fromPathMerge(Validation.parseAndValidateUpdate(getPath(), update));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #144 <Method Path getPath()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #474 <Method Map Validation.parseAndValidateUpdate(Path, Map)>
	//    6   12:invokestatic    #480 <Method CompoundWrite CompoundWrite.fromPathMerge(Map)>
	//    7   15:astore_3        
			repo.scheduleNow(new Runnable() {

				public void run()
				{
					repo.updateChildren(getPath(), merge, listener, update);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field Firebase this$0>
				//    2    4:getfield        #38  <Field Repo Firebase.repo>
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field Firebase this$0>
				//    5   11:invokevirtual   #42  <Method Path Firebase.getPath()>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field CompoundWrite val$merge>
				//    8   18:aload_0         
				//    9   19:getfield        #27  <Field Firebase$CompletionListener val$listener>
				//   10   22:aload_0         
				//   11   23:getfield        #29  <Field Map val$update>
				//   12   26:invokevirtual   #47  <Method void Repo.updateChildren(Path, CompoundWrite, Firebase$CompletionListener, Map)>
				//   13   29:return          
				}

				final Firebase this$0;
				final CompletionListener val$listener;
				final CompoundWrite val$merge;
				final Map val$update;

			
			{
				this$0 = Firebase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Firebase this$0>
				merge = compoundwrite;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CompoundWrite val$merge>
				listener = completionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Firebase$CompletionListener val$listener>
				update = map;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field Map val$update>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    8   16:aload_0         
	//    9   17:getfield        #154 <Field Repo repo>
	//   10   20:new             #10  <Class Firebase$3>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_3         
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokespecial   #483 <Method void Firebase$3(Firebase, CompoundWrite, Firebase$CompletionListener, Map)>
	//   17   31:invokevirtual   #161 <Method void Repo.scheduleNow(Runnable)>
			return;
	//   18   34:return          
		} else
		{
			throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
	//   19   35:new             #124 <Class NullPointerException>
	//   20   38:dup             
	//   21   39:ldc2            #485 <String "Can't pass null for argument 'update' in updateChildren()">
	//   22   42:invokespecial   #128 <Method void NullPointerException(String)>
	//   23   45:athrow          
		}
	}

	private static Config defaultConfig;
}
