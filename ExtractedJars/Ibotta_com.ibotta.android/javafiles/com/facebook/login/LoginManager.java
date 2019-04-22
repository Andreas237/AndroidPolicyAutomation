// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Activity;
import android.content.*;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Validate;
import java.util.*;

// Referenced classes of package com.facebook.login:
//			LoginBehavior, DefaultAudience, LoginResult, LoginLogger, 
//			StartActivityDelegate, LoginClient

public class LoginManager
{
	private static class ActivityStartActivityDelegate
		implements StartActivityDelegate
	{

		public Activity getActivityContext()
		{
			return activity;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Activity activity>
		//    2    4:areturn         
		}

		public void startActivityForResult(Intent intent, int i)
		{
			activity.startActivityForResult(intent, i);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Activity activity>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #34  <Method void Activity.startActivityForResult(Intent, int)>
		//    5    9:return          
		}

		private final Activity activity;

		ActivityStartActivityDelegate(Activity activity1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			Validate.notNull(((Object) (activity1)), "activity");
		//    2    4:aload_1         
		//    3    5:ldc1            #17  <String "activity">
		//    4    7:invokestatic    #23  <Method void Validate.notNull(Object, String)>
			activity = activity1;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Activity activity>
		//    8   15:return          
		}
	}

	private static class LoginLoggerHolder
	{

		private static LoginLogger getLogger(Context context)
		{
			com/facebook/login/LoginManager$LoginLoggerHolder;
		//    0    0:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
			JVM INSTR monitorenter ;
		//    1    2:monitorenter    
			if(context != null)
		//*   2    3:aload_0         
		//*   3    4:ifnull          10
				break MISSING_BLOCK_LABEL_14;
		//    4    7:goto            14
			context = FacebookSdk.getApplicationContext();
		//    5   10:invokestatic    #21  <Method Context FacebookSdk.getApplicationContext()>
		//    6   13:astore_0        
			if(context != null)
				break MISSING_BLOCK_LABEL_23;
		//    7   14:aload_0         
		//    8   15:ifnonnull       23
			com/facebook/login/LoginManager$LoginLoggerHolder;
		//    9   18:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
			JVM INSTR monitorexit ;
		//   10   20:monitorexit     
			return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
			if(logger == null)
		//*  13   23:getstatic       #23  <Field LoginLogger logger>
		//*  14   26:ifnonnull       43
				logger = new LoginLogger(context, FacebookSdk.getApplicationId());
		//   15   29:new             #25  <Class LoginLogger>
		//   16   32:dup             
		//   17   33:aload_0         
		//   18   34:invokestatic    #29  <Method String FacebookSdk.getApplicationId()>
		//   19   37:invokespecial   #33  <Method void LoginLogger(Context, String)>
		//   20   40:putstatic       #23  <Field LoginLogger logger>
			context = ((Context) (logger));
		//   21   43:getstatic       #23  <Field LoginLogger logger>
		//   22   46:astore_0        
			com/facebook/login/LoginManager$LoginLoggerHolder;
		//   23   47:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
			JVM INSTR monitorexit ;
		//   24   49:monitorexit     
			return ((LoginLogger) (context));
		//   25   50:aload_0         
		//   26   51:areturn         
			context;
		//   27   52:astore_0        
		//*  28   53:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
			throw context;
		//   29   55:monitorexit     
		//   30   56:aload_0         
		//   31   57:athrow          
		}

		private static LoginLogger logger;


/*
		static LoginLogger access$000(Context context)
		{
			return getLogger(context);
		//    0    0:aload_0         
		//    1    1:invokestatic    #14  <Method LoginLogger getLogger(Context)>
		//    2    4:areturn         
		}

*/
	}


	LoginManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
	//    2    4:aload_0         
	//    3    5:getstatic       #46  <Field LoginBehavior LoginBehavior.NATIVE_WITH_FALLBACK>
	//    4    8:putfield        #48  <Field LoginBehavior loginBehavior>
		defaultAudience = DefaultAudience.FRIENDS;
	//    5   11:aload_0         
	//    6   12:getstatic       #53  <Field DefaultAudience DefaultAudience.FRIENDS>
	//    7   15:putfield        #55  <Field DefaultAudience defaultAudience>
		authType = "rerequest";
	//    8   18:aload_0         
	//    9   19:ldc1            #57  <String "rerequest">
	//   10   21:putfield        #59  <Field String authType>
		Validate.sdkInitialized();
	//   11   24:invokestatic    #64  <Method void Validate.sdkInitialized()>
	//   12   27:aload_0         
	//   13   28:invokestatic    #70  <Method Context FacebookSdk.getApplicationContext()>
	//   14   31:ldc1            #72  <String "com.facebook.loginManager">
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #78  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   37:putfield        #80  <Field SharedPreferences sharedPreferences>
	//   18   40:return          
	}

	static LoginResult computeLoginResult(LoginClient.Request request, AccessToken accesstoken)
	{
		Set set = request.getPermissions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method Set LoginClient$Request.getPermissions()>
	//    2    4:astore_3        
		HashSet hashset = new HashSet(((Collection) (accesstoken.getPermissions())));
	//    3    5:new             #89  <Class HashSet>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #92  <Method Set AccessToken.getPermissions()>
	//    7   13:invokespecial   #95  <Method void HashSet(Collection)>
	//    8   16:astore_2        
		if(request.isRerequest())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #99  <Method boolean LoginClient$Request.isRerequest()>
	//*  11   21:ifeq            32
			((Set) (hashset)).retainAll(((Collection) (set)));
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokeinterface #105 <Method boolean Set.retainAll(Collection)>
	//   15   31:pop             
		request = ((LoginClient.Request) (new HashSet(((Collection) (set)))));
	//   16   32:new             #89  <Class HashSet>
	//   17   35:dup             
	//   18   36:aload_3         
	//   19   37:invokespecial   #95  <Method void HashSet(Collection)>
	//   20   40:astore_0        
		((Set) (request)).removeAll(((Collection) (hashset)));
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokeinterface #108 <Method boolean Set.removeAll(Collection)>
	//   24   48:pop             
		return new LoginResult(accesstoken, ((Set) (hashset)), ((Set) (request)));
	//   25   49:new             #110 <Class LoginResult>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:aload_0         
	//   30   56:invokespecial   #113 <Method void LoginResult(AccessToken, Set, Set)>
	//   31   59:areturn         
	}

	private void finishLogin(AccessToken accesstoken, LoginClient.Request request, FacebookException facebookexception, boolean flag, FacebookCallback facebookcallback)
	{
		if(accesstoken != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
		{
			AccessToken.setCurrentAccessToken(accesstoken);
	//    2    4:aload_1         
	//    3    5:invokestatic    #119 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
			Profile.fetchProfileForCurrentAccessToken();
	//    4    8:invokestatic    #124 <Method void Profile.fetchProfileForCurrentAccessToken()>
		}
		if(facebookcallback != null)
	//*   5   11:aload           5
	//*   6   13:ifnull          93
		{
			if(accesstoken != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				request = ((LoginClient.Request) (computeLoginResult(request, accesstoken)));
	//    9   20:aload_2         
	//   10   21:aload_1         
	//   11   22:invokestatic    #126 <Method LoginResult computeLoginResult(LoginClient$Request, AccessToken)>
	//   12   25:astore_2        
			else
	//*  13   26:goto            31
				request = null;
	//   14   29:aconst_null     
	//   15   30:astore_2        
			if(!flag && (request == null || ((LoginResult) (request)).getRecentlyGrantedPermissions().size() != 0))
	//*  16   31:iload           4
	//*  17   33:ifne            86
	//*  18   36:aload_2         
	//*  19   37:ifnull          55
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #129 <Method Set LoginResult.getRecentlyGrantedPermissions()>
	//*  22   44:invokeinterface #133 <Method int Set.size()>
	//*  23   49:ifne            55
	//*  24   52:goto            86
			{
				if(facebookexception != null)
	//*  25   55:aload_3         
	//*  26   56:ifnull          68
				{
					facebookcallback.onError(facebookexception);
	//   27   59:aload           5
	//   28   61:aload_3         
	//   29   62:invokeinterface #139 <Method void FacebookCallback.onError(FacebookException)>
					return;
	//   30   67:return          
				}
				if(accesstoken != null)
	//*  31   68:aload_1         
	//*  32   69:ifnull          93
				{
					setExpressLoginStatus(true);
	//   33   72:aload_0         
	//   34   73:iconst_1        
	//   35   74:invokespecial   #143 <Method void setExpressLoginStatus(boolean)>
					facebookcallback.onSuccess(((Object) (request)));
	//   36   77:aload           5
	//   37   79:aload_2         
	//   38   80:invokeinterface #147 <Method void FacebookCallback.onSuccess(Object)>
					return;
	//   39   85:return          
				}
			} else
			{
				facebookcallback.onCancel();
	//   40   86:aload           5
	//   41   88:invokeinterface #150 <Method void FacebookCallback.onCancel()>
			}
		}
	//   42   93:return          
	}

	public static LoginManager getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #156 <Field LoginManager instance>
	//    1    3:ifnonnull       37
		com/facebook/login/LoginManager;
	//    2    6:ldc1            #2   <Class LoginManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #156 <Field LoginManager instance>
	//*   5   12:ifnonnull       25
			instance = new LoginManager();
	//    6   15:new             #2   <Class LoginManager>
	//    7   18:dup             
	//    8   19:invokespecial   #157 <Method void LoginManager()>
	//    9   22:putstatic       #156 <Field LoginManager instance>
		com/facebook/login/LoginManager;
	//   10   25:ldc1            #2   <Class LoginManager>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/facebook/login/LoginManager;
	//   14   32:ldc1            #2   <Class LoginManager>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return instance;
	//   18   37:getstatic       #156 <Field LoginManager instance>
	//   19   40:areturn         
	}

	private static Set getOtherPublishPermissions()
	{
		return Collections.unmodifiableSet(((Set) (new HashSet() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void HashSet()>
				add("ads_management");
			//    2    4:aload_0         
			//    3    5:ldc1            #16  <String "ads_management">
			//    4    7:invokevirtual   #20  <Method boolean add(Object)>
			//    5   10:pop             
				add("create_event");
			//    6   11:aload_0         
			//    7   12:ldc1            #22  <String "create_event">
			//    8   14:invokevirtual   #20  <Method boolean add(Object)>
			//    9   17:pop             
				add("rsvp_event");
			//   10   18:aload_0         
			//   11   19:ldc1            #24  <String "rsvp_event">
			//   12   21:invokevirtual   #20  <Method boolean add(Object)>
			//   13   24:pop             
			//   14   25:return          
			}
		}
)));
	//    0    0:new             #8   <Class LoginManager$2>
	//    1    3:dup             
	//    2    4:invokespecial   #158 <Method void LoginManager$2()>
	//    3    7:invokestatic    #164 <Method Set Collections.unmodifiableSet(Set)>
	//    4   10:areturn         
	}

	static boolean isPublishPermission(String s)
	{
		return s != null && (s.startsWith("publish") || s.startsWith("manage") || OTHER_PUBLISH_PERMISSIONS.contains(((Object) (s))));
	//    0    0:aload_0         
	//    1    1:ifnull          36
	//    2    4:aload_0         
	//    3    5:ldc1            #169 <String "publish">
	//    4    7:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//    5   10:ifne            34
	//    6   13:aload_0         
	//    7   14:ldc1            #176 <String "manage">
	//    8   16:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//    9   19:ifne            34
	//   10   22:getstatic       #37  <Field Set OTHER_PUBLISH_PERMISSIONS>
	//   11   25:aload_0         
	//   12   26:invokeinterface #180 <Method boolean Set.contains(Object)>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	private void logCompleteLogin(Context context, LoginClient.Result.Code code, Map map, Exception exception, boolean flag, LoginClient.Request request)
	{
		LoginLogger loginlogger = LoginLoggerHolder.getLogger(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #186 <Method LoginLogger LoginManager$LoginLoggerHolder.access$000(Context)>
	//    2    4:astore          7
		if(loginlogger == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(request == null)
	//*   6   12:aload           6
	//*   7   14:ifnonnull       27
		{
			loginlogger.logUnexpectedError("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
	//    8   17:aload           7
	//    9   19:ldc1            #188 <String "fb_mobile_login_complete">
	//   10   21:ldc1            #190 <String "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.">
	//   11   23:invokevirtual   #196 <Method void LoginLogger.logUnexpectedError(String, String)>
			return;
	//   12   26:return          
		}
		HashMap hashmap = new HashMap();
	//   13   27:new             #198 <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #199 <Method void HashMap()>
	//   16   34:astore          8
		if(flag)
	//*  17   36:iload           5
	//*  18   38:ifeq            47
			context = "1";
	//   19   41:ldc1            #201 <String "1">
	//   20   43:astore_1        
		else
	//*  21   44:goto            50
			context = "0";
	//   22   47:ldc1            #203 <String "0">
	//   23   49:astore_1        
		hashmap.put("try_login_activity", ((Object) (context)));
	//   24   50:aload           8
	//   25   52:ldc1            #205 <String "try_login_activity">
	//   26   54:aload_1         
	//   27   55:invokevirtual   #209 <Method Object HashMap.put(Object, Object)>
	//   28   58:pop             
		loginlogger.logCompleteLogin(request.getAuthId(), ((Map) (hashmap)), code, map, exception);
	//   29   59:aload           7
	//   30   61:aload           6
	//   31   63:invokevirtual   #213 <Method String LoginClient$Request.getAuthId()>
	//   32   66:aload           8
	//   33   68:aload_2         
	//   34   69:aload_3         
	//   35   70:aload           4
	//   36   72:invokevirtual   #216 <Method void LoginLogger.logCompleteLogin(String, Map, LoginClient$Result$Code, Map, Exception)>
	//   37   75:return          
	}

	private void logStartLogin(Context context, LoginClient.Request request)
	{
		context = ((Context) (LoginLoggerHolder.getLogger(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #186 <Method LoginLogger LoginManager$LoginLoggerHolder.access$000(Context)>
	//    2    4:astore_1        
		if(context != null && request != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
			((LoginLogger) (context)).logStartLogin(request);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #222 <Method void LoginLogger.logStartLogin(LoginClient$Request)>
	//   10   18:return          
	}

	private boolean resolveIntent(Intent intent)
	{
		PackageManager packagemanager = FacebookSdk.getApplicationContext().getPackageManager();
	//    0    0:invokestatic    #70  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokevirtual   #228 <Method PackageManager Context.getPackageManager()>
	//    2    6:astore_3        
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		if(packagemanager.resolveActivity(intent, 0) != null)
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:iconst_0        
	//*   8   12:invokevirtual   #234 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*   9   15:ifnull          20
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
		return flag;
	//   12   20:iload_2         
	//   13   21:ireturn         
	}

	private void setExpressLoginStatus(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #240 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.putBoolean("express_login_allowed", flag);
	//    4   10:aload_2         
	//    5   11:ldc1            #242 <String "express_login_allowed">
	//    6   13:iload_1         
	//    7   14:invokeinterface #248 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   19:pop             
		editor.apply();
	//    9   20:aload_2         
	//   10   21:invokeinterface #251 <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   26:return          
	}

	private void startLogin(StartActivityDelegate startactivitydelegate, LoginClient.Request request)
		throws FacebookException
	{
		logStartLogin(((Context) (startactivitydelegate.getActivityContext())), request);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #261 <Method Activity StartActivityDelegate.getActivityContext()>
	//    3    7:aload_2         
	//    4    8:invokespecial   #263 <Method void logStartLogin(Context, LoginClient$Request)>
		CallbackManagerImpl.registerStaticCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

			public boolean onActivityResult(int i, Intent intent)
			{
				return LoginManager.this.onActivityResult(i, intent);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LoginManager this$0>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #25  <Method boolean LoginManager.onActivityResult(int, Intent)>
			//    5    9:ireturn         
			}

			final LoginManager this$0;

			
			{
				this$0 = LoginManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LoginManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    5   11:getstatic       #269 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    6   14:invokevirtual   #272 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    7   17:new             #10  <Class LoginManager$3>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #275 <Method void LoginManager$3(LoginManager)>
	//   11   25:invokestatic    #281 <Method void CallbackManagerImpl.registerStaticCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
		if(tryFacebookActivity(startactivitydelegate, request))
	//*  12   28:aload_0         
	//*  13   29:aload_1         
	//*  14   30:aload_2         
	//*  15   31:invokespecial   #285 <Method boolean tryFacebookActivity(StartActivityDelegate, LoginClient$Request)>
	//*  16   34:ifeq            38
		{
			return;
	//   17   37:return          
		} else
		{
			FacebookException facebookexception = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
	//   18   38:new             #255 <Class FacebookException>
	//   19   41:dup             
	//   20   42:ldc2            #287 <String "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.">
	//   21   45:invokespecial   #290 <Method void FacebookException(String)>
	//   22   48:astore_3        
			logCompleteLogin(((Context) (startactivitydelegate.getActivityContext())), LoginClient.Result.Code.ERROR, ((Map) (null)), ((Exception) (facebookexception)), false, request);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokeinterface #261 <Method Activity StartActivityDelegate.getActivityContext()>
	//   26   56:getstatic       #296 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//   27   59:aconst_null     
	//   28   60:aload_3         
	//   29   61:iconst_0        
	//   30   62:aload_2         
	//   31   63:invokespecial   #298 <Method void logCompleteLogin(Context, LoginClient$Result$Code, Map, Exception, boolean, LoginClient$Request)>
			throw facebookexception;
	//   32   66:aload_3         
	//   33   67:athrow          
		}
	}

	private boolean tryFacebookActivity(StartActivityDelegate startactivitydelegate, LoginClient.Request request)
	{
		request = ((LoginClient.Request) (getFacebookActivityIntent(request)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #305 <Method Intent getFacebookActivityIntent(LoginClient$Request)>
	//    3    5:astore_2        
		if(!resolveIntent(((Intent) (request))))
	//*   4    6:aload_0         
	//*   5    7:aload_2         
	//*   6    8:invokespecial   #307 <Method boolean resolveIntent(Intent)>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		try
		{
			startactivitydelegate.startActivityForResult(((Intent) (request)), LoginClient.getLoginRequestCode());
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokestatic    #312 <Method int LoginClient.getLoginRequestCode()>
	//   13   21:invokeinterface #316 <Method void StartActivityDelegate.startActivityForResult(Intent, int)>
		}
	//*  14   26:iconst_1        
	//*  15   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(StartActivityDelegate startactivitydelegate)
	//*  16   28:astore_1        
		{
			return false;
	//   17   29:iconst_0        
	//   18   30:ireturn         
		}
		return true;
	}

	private void validateReadPermissions(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #323 <Method Iterator Collection.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #328 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            63
		{
			String s = (String)((Iterator) (collection)).next();
	//    9   21:aload_1         
	//   10   22:invokeinterface #332 <Method Object Iterator.next()>
	//   11   27:checkcast       #171 <Class String>
	//   12   30:astore_2        
			if(isPublishPermission(s))
	//*  13   31:aload_2         
	//*  14   32:invokestatic    #334 <Method boolean isPublishPermission(String)>
	//*  15   35:ifne            41
	//*  16   38:goto            12
				throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
					s
				}));
	//   17   41:new             #255 <Class FacebookException>
	//   18   44:dup             
	//   19   45:ldc2            #336 <String "Cannot pass a publish or manage permission (%s) to a request for read authorization">
	//   20   48:iconst_1        
	//   21   49:anewarray       Object[]
	//   22   52:dup             
	//   23   53:iconst_0        
	//   24   54:aload_2         
	//   25   55:aastore         
	//   26   56:invokestatic    #340 <Method String String.format(String, Object[])>
	//   27   59:invokespecial   #290 <Method void FacebookException(String)>
	//   28   62:athrow          
		}

	//   29   63:return          
	}

	protected LoginClient.Request createLoginRequest(Collection collection)
	{
		LoginBehavior loginbehavior = loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field LoginBehavior loginBehavior>
	//    2    4:astore_2        
		if(collection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			collection = ((Collection) (new HashSet(collection)));
	//    5    9:new             #89  <Class HashSet>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #95  <Method void HashSet(Collection)>
	//    9   17:astore_1        
		else
	//*  10   18:goto            29
			collection = ((Collection) (new HashSet()));
	//   11   21:new             #89  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #344 <Method void HashSet()>
	//   14   28:astore_1        
		collection = ((Collection) (new LoginClient.Request(loginbehavior, Collections.unmodifiableSet(((Set) (collection))), defaultAudience, authType, FacebookSdk.getApplicationId(), UUID.randomUUID().toString())));
	//   15   29:new             #84  <Class LoginClient$Request>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokestatic    #164 <Method Set Collections.unmodifiableSet(Set)>
	//   20   38:aload_0         
	//   21   39:getfield        #55  <Field DefaultAudience defaultAudience>
	//   22   42:aload_0         
	//   23   43:getfield        #59  <Field String authType>
	//   24   46:invokestatic    #347 <Method String FacebookSdk.getApplicationId()>
	//   25   49:invokestatic    #353 <Method UUID UUID.randomUUID()>
	//   26   52:invokevirtual   #356 <Method String UUID.toString()>
	//   27   55:invokespecial   #359 <Method void LoginClient$Request(LoginBehavior, Set, DefaultAudience, String, String, String)>
	//   28   58:astore_1        
		((LoginClient.Request) (collection)).setRerequest(AccessToken.isCurrentAccessTokenActive());
	//   29   59:aload_1         
	//   30   60:invokestatic    #362 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//   31   63:invokevirtual   #365 <Method void LoginClient$Request.setRerequest(boolean)>
		return ((LoginClient.Request) (collection));
	//   32   66:aload_1         
	//   33   67:areturn         
	}

	protected Intent getFacebookActivityIntent(LoginClient.Request request)
	{
		Intent intent = new Intent();
	//    0    0:new             #368 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #369 <Method void Intent()>
	//    3    7:astore_2        
		intent.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//    4    8:aload_2         
	//    5    9:invokestatic    #70  <Method Context FacebookSdk.getApplicationContext()>
	//    6   12:ldc2            #371 <Class FacebookActivity>
	//    7   15:invokevirtual   #375 <Method Intent Intent.setClass(Context, Class)>
	//    8   18:pop             
		intent.setAction(request.getLoginBehavior().toString());
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #379 <Method LoginBehavior LoginClient$Request.getLoginBehavior()>
	//   12   24:invokevirtual   #380 <Method String LoginBehavior.toString()>
	//   13   27:invokevirtual   #384 <Method Intent Intent.setAction(String)>
	//   14   30:pop             
		Bundle bundle = new Bundle();
	//   15   31:new             #386 <Class Bundle>
	//   16   34:dup             
	//   17   35:invokespecial   #387 <Method void Bundle()>
	//   18   38:astore_3        
		bundle.putParcelable("request", ((android.os.Parcelable) (request)));
	//   19   39:aload_3         
	//   20   40:ldc2            #389 <String "request">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #393 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtra("com.facebook.LoginFragment:Request", bundle);
	//   23   47:aload_2         
	//   24   48:ldc2            #395 <String "com.facebook.LoginFragment:Request">
	//   25   51:aload_3         
	//   26   52:invokevirtual   #399 <Method Intent Intent.putExtra(String, Bundle)>
	//   27   55:pop             
		return intent;
	//   28   56:aload_2         
	//   29   57:areturn         
	}

	public void logInWithReadPermissions(Activity activity, Collection collection)
	{
		validateReadPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #403 <Method void validateReadPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #405 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #12  <Class LoginManager$ActivityStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #408 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #410 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	public void logOut()
	{
		AccessToken.setCurrentAccessToken(((AccessToken) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #119 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
		Profile.setCurrentProfile(((Profile) (null)));
	//    2    4:aconst_null     
	//    3    5:invokestatic    #416 <Method void Profile.setCurrentProfile(Profile)>
		setExpressLoginStatus(false);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #143 <Method void setExpressLoginStatus(boolean)>
	//    7   13:return          
	}

	boolean onActivityResult(int i, Intent intent)
	{
		return onActivityResult(i, intent, ((FacebookCallback) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #421 <Method boolean onActivityResult(int, Intent, FacebookCallback)>
	//    5    7:ireturn         
	}

	boolean onActivityResult(int i, Intent intent, FacebookCallback facebookcallback)
	{
		LoginClient.Result.Code code = LoginClient.Result.Code.ERROR;
	//    0    0:getstatic       #296 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//    1    3:astore          8
		Object obj2 = null;
	//    2    5:aconst_null     
	//    3    6:astore          10
		Object obj = null;
	//    4    8:aconst_null     
	//    5    9:astore          6
		Intent intent1 = null;
	//    6   11:aconst_null     
	//    7   12:astore          7
		boolean flag1 = false;
	//    8   14:iconst_0        
	//    9   15:istore          5
		boolean flag = false;
	//   10   17:iconst_0        
	//   11   18:istore          4
		Object obj1;
		if(intent != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          162
		{
			obj1 = ((Object) ((LoginClient.Result)intent.getParcelableExtra("com.facebook.LoginFragment:Result")));
	//   14   24:aload_2         
	//   15   25:ldc2            #423 <String "com.facebook.LoginFragment:Result">
	//   16   28:invokevirtual   #427 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   17   31:checkcast       #429 <Class LoginClient$Result>
	//   18   34:astore          9
			if(obj1 != null)
	//*  19   36:aload           9
	//*  20   38:ifnull          141
			{
				obj2 = ((Object) (((LoginClient.Result) (obj1)).request));
	//   21   41:aload           9
	//   22   43:getfield        #432 <Field LoginClient$Request LoginClient$Result.request>
	//   23   46:astore          10
				code = ((LoginClient.Result) (obj1)).code;
	//   24   48:aload           9
	//   25   50:getfield        #435 <Field LoginClient$Result$Code LoginClient$Result.code>
	//   26   53:astore          8
				if(i == -1)
	//*  27   55:iload_1         
	//*  28   56:iconst_m1       
	//*  29   57:icmpne          103
				{
					if(((LoginClient.Result) (obj1)).code == LoginClient.Result.Code.SUCCESS)
	//*  30   60:aload           9
	//*  31   62:getfield        #435 <Field LoginClient$Result$Code LoginClient$Result.code>
	//*  32   65:getstatic       #438 <Field LoginClient$Result$Code LoginClient$Result$Code.SUCCESS>
	//*  33   68:if_acmpne       84
					{
						intent = ((Intent) (((LoginClient.Result) (obj1)).token));
	//   34   71:aload           9
	//   35   73:getfield        #442 <Field AccessToken LoginClient$Result.token>
	//   36   76:astore_2        
						obj = ((Object) (intent1));
	//   37   77:aload           7
	//   38   79:astore          6
					} else
	//*  39   81:goto            125
					{
						obj = ((Object) (new FacebookAuthorizationException(((LoginClient.Result) (obj1)).errorMessage)));
	//   40   84:new             #444 <Class FacebookAuthorizationException>
	//   41   87:dup             
	//   42   88:aload           9
	//   43   90:getfield        #447 <Field String LoginClient$Result.errorMessage>
	//   44   93:invokespecial   #448 <Method void FacebookAuthorizationException(String)>
	//   45   96:astore          6
						intent = null;
	//   46   98:aconst_null     
	//   47   99:astore_2        
					}
				} else
	//*  48  100:goto            125
				if(i == 0)
	//*  49  103:iload_1         
	//*  50  104:ifne            119
				{
					intent = null;
	//   51  107:aconst_null     
	//   52  108:astore_2        
					flag = true;
	//   53  109:iconst_1        
	//   54  110:istore          4
					obj = ((Object) (intent1));
	//   55  112:aload           7
	//   56  114:astore          6
				} else
	//*  57  116:goto            125
				{
					intent = null;
	//   58  119:aconst_null     
	//   59  120:astore_2        
					obj = ((Object) (intent1));
	//   60  121:aload           7
	//   61  123:astore          6
				}
				obj1 = ((Object) (((LoginClient.Result) (obj1)).loggingExtras));
	//   62  125:aload           9
	//   63  127:getfield        #452 <Field Map LoginClient$Result.loggingExtras>
	//   64  130:astore          9
				intent1 = intent;
	//   65  132:aload_2         
	//   66  133:astore          7
				intent = ((Intent) (obj2));
	//   67  135:aload           10
	//   68  137:astore_2        
			} else
	//*  69  138:goto            159
			{
				intent1 = null;
	//   70  141:aconst_null     
	//   71  142:astore          7
				obj1 = ((Object) (intent1));
	//   72  144:aload           7
	//   73  146:astore          9
				intent = ((Intent) (obj1));
	//   74  148:aload           9
	//   75  150:astore_2        
				flag = flag1;
	//   76  151:iload           5
	//   77  153:istore          4
				obj = obj2;
	//   78  155:aload           10
	//   79  157:astore          6
			}
		} else
	//*  80  159:goto            198
		if(i == 0)
	//*  81  162:iload_1         
	//*  82  163:ifne            186
		{
			code = LoginClient.Result.Code.CANCEL;
	//   83  166:getstatic       #455 <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
	//   84  169:astore          8
			intent = null;
	//   85  171:aconst_null     
	//   86  172:astore_2        
			intent1 = intent;
	//   87  173:aload_2         
	//   88  174:astore          7
			obj1 = ((Object) (intent1));
	//   89  176:aload           7
	//   90  178:astore          9
			flag = true;
	//   91  180:iconst_1        
	//   92  181:istore          4
		} else
	//*  93  183:goto            198
		{
			intent = null;
	//   94  186:aconst_null     
	//   95  187:astore_2        
			intent1 = intent;
	//   96  188:aload_2         
	//   97  189:astore          7
			obj1 = ((Object) (intent1));
	//   98  191:aload           7
	//   99  193:astore          9
			flag = false;
	//  100  195:iconst_0        
	//  101  196:istore          4
		}
		obj2 = obj;
	//  102  198:aload           6
	//  103  200:astore          10
		if(obj == null)
	//* 104  202:aload           6
	//* 105  204:ifnonnull       237
		{
			obj2 = obj;
	//  106  207:aload           6
	//  107  209:astore          10
			if(intent1 == null)
	//* 108  211:aload           7
	//* 109  213:ifnonnull       237
			{
				obj2 = obj;
	//  110  216:aload           6
	//  111  218:astore          10
				if(!flag)
	//* 112  220:iload           4
	//* 113  222:ifne            237
					obj2 = ((Object) (new FacebookException("Unexpected call to LoginManager.onActivityResult")));
	//  114  225:new             #255 <Class FacebookException>
	//  115  228:dup             
	//  116  229:ldc2            #457 <String "Unexpected call to LoginManager.onActivityResult">
	//  117  232:invokespecial   #290 <Method void FacebookException(String)>
	//  118  235:astore          10
			}
		}
		logCompleteLogin(((Context) (null)), code, ((Map) (obj1)), ((Exception) (obj2)), true, ((LoginClient.Request) (intent)));
	//  119  237:aload_0         
	//  120  238:aconst_null     
	//  121  239:aload           8
	//  122  241:aload           9
	//  123  243:aload           10
	//  124  245:iconst_1        
	//  125  246:aload_2         
	//  126  247:invokespecial   #298 <Method void logCompleteLogin(Context, LoginClient$Result$Code, Map, Exception, boolean, LoginClient$Request)>
		finishLogin(((AccessToken) (intent1)), ((LoginClient.Request) (intent)), ((FacebookException) (obj2)), flag, facebookcallback);
	//  127  250:aload_0         
	//  128  251:aload           7
	//  129  253:aload_2         
	//  130  254:aload           10
	//  131  256:iload           4
	//  132  258:aload_3         
	//  133  259:invokespecial   #459 <Method void finishLogin(AccessToken, LoginClient$Request, FacebookException, boolean, FacebookCallback)>
		return true;
	//  134  262:iconst_1        
	//  135  263:ireturn         
	}

	public void registerCallback(CallbackManager callbackmanager, final FacebookCallback callback)
	{
		if(callbackmanager instanceof CallbackManagerImpl)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #277 <Class CallbackManagerImpl>
	//*   2    4:ifeq            30
		{
			((CallbackManagerImpl)callbackmanager).registerCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

				public boolean onActivityResult(int i, Intent intent)
				{
					return LoginManager.this.onActivityResult(i, intent, callback);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field LoginManager this$0>
				//    2    4:iload_1         
				//    3    5:aload_2         
				//    4    6:aload_0         
				//    5    7:getfield        #21  <Field FacebookCallback val$callback>
				//    6   10:invokevirtual   #30  <Method boolean LoginManager.onActivityResult(int, Intent, FacebookCallback)>
				//    7   13:ireturn         
				}

				final LoginManager this$0;
				final FacebookCallback val$callback;

			
			{
				this$0 = LoginManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LoginManager this$0>
				callback = facebookcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FacebookCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_1         
	//    4    8:checkcast       #277 <Class CallbackManagerImpl>
	//    5   11:getstatic       #269 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    6   14:invokevirtual   #272 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    7   17:new             #6   <Class LoginManager$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:invokespecial   #465 <Method void LoginManager$1(LoginManager, FacebookCallback)>
	//   12   26:invokevirtual   #467 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
			return;
	//   13   29:return          
		} else
		{
			throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
	//   14   30:new             #255 <Class FacebookException>
	//   15   33:dup             
	//   16   34:ldc2            #469 <String "Unexpected CallbackManager, please use the provided Factory.">
	//   17   37:invokespecial   #290 <Method void FacebookException(String)>
	//   18   40:athrow          
		}
	}

	private static final Set OTHER_PUBLISH_PERMISSIONS = getOtherPublishPermissions();
	private static volatile LoginManager instance;
	private String authType;
	private DefaultAudience defaultAudience;
	private LoginBehavior loginBehavior;
	private final SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.loginManager", 0);

	static 
	{
	//    0    0:invokestatic    #35  <Method Set getOtherPublishPermissions()>
	//    1    3:putstatic       #37  <Field Set OTHER_PUBLISH_PERMISSIONS>
	//*   2    6:return          
	}
}
