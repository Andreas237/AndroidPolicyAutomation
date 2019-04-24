// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Activity;
import android.content.*;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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

	private static class FragmentStartActivityDelegate
		implements StartActivityDelegate
	{

		public Activity getActivityContext()
		{
			return ((Activity) (fragment.getActivity()));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Fragment fragment>
		//    2    4:invokevirtual   #34  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
		//    3    7:areturn         
		}

		public void startActivityForResult(Intent intent, int i)
		{
			fragment.startActivityForResult(intent, i);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Fragment fragment>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #38  <Method void Fragment.startActivityForResult(Intent, int)>
		//    5    9:return          
		}

		private final Fragment fragment;

		FragmentStartActivityDelegate(Fragment fragment1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			Validate.notNull(((Object) (fragment1)), "fragment");
		//    2    4:aload_1         
		//    3    5:ldc1            #17  <String "fragment">
		//    4    7:invokestatic    #23  <Method void Validate.notNull(Object, String)>
			fragment = fragment1;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment fragment>
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
		//    5   10:invokestatic    #25  <Method Context FacebookSdk.getApplicationContext()>
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
		//*  13   23:getstatic       #27  <Field LoginLogger logger>
		//*  14   26:ifnonnull       43
				logger = new LoginLogger(context, FacebookSdk.getApplicationId());
		//   15   29:new             #29  <Class LoginLogger>
		//   16   32:dup             
		//   17   33:aload_0         
		//   18   34:invokestatic    #33  <Method String FacebookSdk.getApplicationId()>
		//   19   37:invokespecial   #36  <Method void LoginLogger(Context, String)>
		//   20   40:putstatic       #27  <Field LoginLogger logger>
			context = ((Context) (logger));
		//   21   43:getstatic       #27  <Field LoginLogger logger>
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

		private static volatile LoginLogger logger;


/*
		static LoginLogger access$000(Context context)
		{
			return getLogger(context);
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method LoginLogger getLogger(Context)>
		//    2    4:areturn         
		}

*/

		private LoginLoggerHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	LoginManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
	//    2    4:aload_0         
	//    3    5:getstatic       #52  <Field LoginBehavior LoginBehavior.NATIVE_WITH_FALLBACK>
	//    4    8:putfield        #54  <Field LoginBehavior loginBehavior>
		defaultAudience = DefaultAudience.FRIENDS;
	//    5   11:aload_0         
	//    6   12:getstatic       #59  <Field DefaultAudience DefaultAudience.FRIENDS>
	//    7   15:putfield        #61  <Field DefaultAudience defaultAudience>
		Validate.sdkInitialized();
	//    8   18:invokestatic    #66  <Method void Validate.sdkInitialized()>
	//    9   21:return          
	}

	static LoginResult computeLoginResult(LoginClient.Request request, AccessToken accesstoken)
	{
		Set set = request.getPermissions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method Set LoginClient$Request.getPermissions()>
	//    2    4:astore_3        
		HashSet hashset = new HashSet(((Collection) (accesstoken.getPermissions())));
	//    3    5:new             #75  <Class HashSet>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #78  <Method Set AccessToken.getPermissions()>
	//    7   13:invokespecial   #81  <Method void HashSet(Collection)>
	//    8   16:astore_2        
		if(request.isRerequest())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #85  <Method boolean LoginClient$Request.isRerequest()>
	//*  11   21:ifeq            32
			((Set) (hashset)).retainAll(((Collection) (set)));
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokeinterface #91  <Method boolean Set.retainAll(Collection)>
	//   15   31:pop             
		request = ((LoginClient.Request) (new HashSet(((Collection) (set)))));
	//   16   32:new             #75  <Class HashSet>
	//   17   35:dup             
	//   18   36:aload_3         
	//   19   37:invokespecial   #81  <Method void HashSet(Collection)>
	//   20   40:astore_0        
		((Set) (request)).removeAll(((Collection) (hashset)));
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokeinterface #94  <Method boolean Set.removeAll(Collection)>
	//   24   48:pop             
		return new LoginResult(accesstoken, ((Set) (hashset)), ((Set) (request)));
	//   25   49:new             #96  <Class LoginResult>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:aload_0         
	//   30   56:invokespecial   #99  <Method void LoginResult(AccessToken, Set, Set)>
	//   31   59:areturn         
	}

	private LoginClient.Request createLoginRequest(Collection collection)
	{
		LoginBehavior loginbehavior = loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LoginBehavior loginBehavior>
	//    2    4:astore_3        
		if(collection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			collection = ((Collection) (new HashSet(collection)));
	//    5    9:new             #75  <Class HashSet>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #81  <Method void HashSet(Collection)>
	//    9   17:astore_1        
		else
	//*  10   18:goto            29
			collection = ((Collection) (new HashSet()));
	//   11   21:new             #75  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #102 <Method void HashSet()>
	//   14   28:astore_1        
		collection = ((Collection) (new LoginClient.Request(loginbehavior, Collections.unmodifiableSet(((Set) (collection))), defaultAudience, FacebookSdk.getApplicationId(), UUID.randomUUID().toString())));
	//   15   29:new             #70  <Class LoginClient$Request>
	//   16   32:dup             
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokestatic    #108 <Method Set Collections.unmodifiableSet(Set)>
	//   20   38:aload_0         
	//   21   39:getfield        #61  <Field DefaultAudience defaultAudience>
	//   22   42:invokestatic    #114 <Method String FacebookSdk.getApplicationId()>
	//   23   45:invokestatic    #120 <Method UUID UUID.randomUUID()>
	//   24   48:invokevirtual   #123 <Method String UUID.toString()>
	//   25   51:invokespecial   #126 <Method void LoginClient$Request(LoginBehavior, Set, DefaultAudience, String, String)>
	//   26   54:astore_1        
		boolean flag;
		if(AccessToken.getCurrentAccessToken() != null)
	//*  27   55:invokestatic    #130 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//*  28   58:ifnull          66
			flag = true;
	//   29   61:iconst_1        
	//   30   62:istore_2        
		else
	//*  31   63:goto            68
			flag = false;
	//   32   66:iconst_0        
	//   33   67:istore_2        
		((LoginClient.Request) (collection)).setRerequest(flag);
	//   34   68:aload_1         
	//   35   69:iload_2         
	//   36   70:invokevirtual   #134 <Method void LoginClient$Request.setRerequest(boolean)>
		return ((LoginClient.Request) (collection));
	//   37   73:aload_1         
	//   38   74:areturn         
	}

	private LoginClient.Request createLoginRequestFromResponse(GraphResponse graphresponse)
	{
		Validate.notNull(((Object) (graphresponse)), "response");
	//    0    0:aload_1         
	//    1    1:ldc1            #140 <String "response">
	//    2    3:invokestatic    #144 <Method void Validate.notNull(Object, String)>
		graphresponse = ((GraphResponse) (graphresponse.getRequest().getAccessToken()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #150 <Method GraphRequest GraphResponse.getRequest()>
	//    5   10:invokevirtual   #155 <Method AccessToken GraphRequest.getAccessToken()>
	//    6   13:astore_1        
		if(graphresponse != null)
	//*   7   14:aload_1         
	//*   8   15:ifnull          26
			graphresponse = ((GraphResponse) (((AccessToken) (graphresponse)).getPermissions()));
	//    9   18:aload_1         
	//   10   19:invokevirtual   #78  <Method Set AccessToken.getPermissions()>
	//   11   22:astore_1        
		else
	//*  12   23:goto            28
			graphresponse = null;
	//   13   26:aconst_null     
	//   14   27:astore_1        
		return createLoginRequest(((Collection) (graphresponse)));
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:invokespecial   #157 <Method LoginClient$Request createLoginRequest(Collection)>
	//   18   33:areturn         
	}

	private void finishLogin(AccessToken accesstoken, LoginClient.Request request, FacebookException facebookexception, boolean flag, FacebookCallback facebookcallback)
	{
		if(accesstoken != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
		{
			AccessToken.setCurrentAccessToken(accesstoken);
	//    2    4:aload_1         
	//    3    5:invokestatic    #163 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
			Profile.fetchProfileForCurrentAccessToken();
	//    4    8:invokestatic    #168 <Method void Profile.fetchProfileForCurrentAccessToken()>
		}
		if(facebookcallback != null)
	//*   5   11:aload           5
	//*   6   13:ifnull          88
		{
			if(accesstoken != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				request = ((LoginClient.Request) (computeLoginResult(request, accesstoken)));
	//    9   20:aload_2         
	//   10   21:aload_1         
	//   11   22:invokestatic    #170 <Method LoginResult computeLoginResult(LoginClient$Request, AccessToken)>
	//   12   25:astore_2        
			else
	//*  13   26:goto            31
				request = null;
	//   14   29:aconst_null     
	//   15   30:astore_2        
			if(!flag && (request == null || ((LoginResult) (request)).getRecentlyGrantedPermissions().size() != 0))
	//*  16   31:iload           4
	//*  17   33:ifne            81
	//*  18   36:aload_2         
	//*  19   37:ifnull          55
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #173 <Method Set LoginResult.getRecentlyGrantedPermissions()>
	//*  22   44:invokeinterface #177 <Method int Set.size()>
	//*  23   49:ifne            55
	//*  24   52:goto            81
			{
				if(facebookexception != null)
	//*  25   55:aload_3         
	//*  26   56:ifnull          68
				{
					facebookcallback.onError(facebookexception);
	//   27   59:aload           5
	//   28   61:aload_3         
	//   29   62:invokeinterface #183 <Method void FacebookCallback.onError(FacebookException)>
					return;
	//   30   67:return          
				}
				if(accesstoken != null)
	//*  31   68:aload_1         
	//*  32   69:ifnull          88
				{
					facebookcallback.onSuccess(((Object) (request)));
	//   33   72:aload           5
	//   34   74:aload_2         
	//   35   75:invokeinterface #187 <Method void FacebookCallback.onSuccess(Object)>
					return;
	//   36   80:return          
				}
			} else
			{
				facebookcallback.onCancel();
	//   37   81:aload           5
	//   38   83:invokeinterface #190 <Method void FacebookCallback.onCancel()>
			}
		}
	//   39   88:return          
	}

	private Intent getFacebookActivityIntent(LoginClient.Request request)
	{
		Intent intent = new Intent();
	//    0    0:new             #195 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #196 <Method void Intent()>
	//    3    7:astore_2        
		intent.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//    4    8:aload_2         
	//    5    9:invokestatic    #200 <Method Context FacebookSdk.getApplicationContext()>
	//    6   12:ldc1            #202 <Class FacebookActivity>
	//    7   14:invokevirtual   #206 <Method Intent Intent.setClass(Context, Class)>
	//    8   17:pop             
		intent.setAction(request.getLoginBehavior().toString());
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #210 <Method LoginBehavior LoginClient$Request.getLoginBehavior()>
	//   12   23:invokevirtual   #211 <Method String LoginBehavior.toString()>
	//   13   26:invokevirtual   #215 <Method Intent Intent.setAction(String)>
	//   14   29:pop             
		Bundle bundle = new Bundle();
	//   15   30:new             #217 <Class Bundle>
	//   16   33:dup             
	//   17   34:invokespecial   #218 <Method void Bundle()>
	//   18   37:astore_3        
		bundle.putParcelable("request", ((android.os.Parcelable) (request)));
	//   19   38:aload_3         
	//   20   39:ldc1            #220 <String "request">
	//   21   41:aload_1         
	//   22   42:invokevirtual   #224 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtras(bundle);
	//   23   45:aload_2         
	//   24   46:aload_3         
	//   25   47:invokevirtual   #228 <Method Intent Intent.putExtras(Bundle)>
	//   26   50:pop             
		return intent;
	//   27   51:aload_2         
	//   28   52:areturn         
	}

	public static LoginManager getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #232 <Field LoginManager instance>
	//    1    3:ifnonnull       37
		com/facebook/login/LoginManager;
	//    2    6:ldc1            #2   <Class LoginManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #232 <Field LoginManager instance>
	//*   5   12:ifnonnull       25
			instance = new LoginManager();
	//    6   15:new             #2   <Class LoginManager>
	//    7   18:dup             
	//    8   19:invokespecial   #233 <Method void LoginManager()>
	//    9   22:putstatic       #232 <Field LoginManager instance>
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
	//   18   37:getstatic       #232 <Field LoginManager instance>
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
	//    2    4:invokespecial   #234 <Method void LoginManager$2()>
	//    3    7:invokestatic    #108 <Method Set Collections.unmodifiableSet(Set)>
	//    4   10:areturn         
	}

	static boolean isPublishPermission(String s)
	{
		return s != null && (s.startsWith("publish") || s.startsWith("manage") || OTHER_PUBLISH_PERMISSIONS.contains(((Object) (s))));
	//    0    0:aload_0         
	//    1    1:ifnull          36
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <String "publish">
	//    4    7:invokevirtual   #242 <Method boolean String.startsWith(String)>
	//    5   10:ifne            34
	//    6   13:aload_0         
	//    7   14:ldc1            #23  <String "manage">
	//    8   16:invokevirtual   #242 <Method boolean String.startsWith(String)>
	//    9   19:ifne            34
	//   10   22:getstatic       #43  <Field Set OTHER_PUBLISH_PERMISSIONS>
	//   11   25:aload_0         
	//   12   26:invokeinterface #246 <Method boolean Set.contains(Object)>
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
	//    1    1:invokestatic    #252 <Method LoginLogger LoginManager$LoginLoggerHolder.access$000(Context)>
	//    2    4:astore          7
		if(loginlogger == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(request == null)
	//*   6   12:aload           6
	//*   7   14:ifnonnull       28
		{
			loginlogger.logUnexpectedError("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
	//    8   17:aload           7
	//    9   19:ldc1            #254 <String "fb_mobile_login_complete">
	//   10   21:ldc2            #256 <String "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.">
	//   11   24:invokevirtual   #262 <Method void LoginLogger.logUnexpectedError(String, String)>
			return;
	//   12   27:return          
		}
		HashMap hashmap = new HashMap();
	//   13   28:new             #264 <Class HashMap>
	//   14   31:dup             
	//   15   32:invokespecial   #265 <Method void HashMap()>
	//   16   35:astore          8
		if(flag)
	//*  17   37:iload           5
	//*  18   39:ifeq            49
			context = "1";
	//   19   42:ldc2            #267 <String "1">
	//   20   45:astore_1        
		else
	//*  21   46:goto            53
			context = "0";
	//   22   49:ldc2            #269 <String "0">
	//   23   52:astore_1        
		hashmap.put("try_login_activity", ((Object) (context)));
	//   24   53:aload           8
	//   25   55:ldc2            #271 <String "try_login_activity">
	//   26   58:aload_1         
	//   27   59:invokevirtual   #275 <Method Object HashMap.put(Object, Object)>
	//   28   62:pop             
		loginlogger.logCompleteLogin(request.getAuthId(), ((Map) (hashmap)), code, map, exception);
	//   29   63:aload           7
	//   30   65:aload           6
	//   31   67:invokevirtual   #278 <Method String LoginClient$Request.getAuthId()>
	//   32   70:aload           8
	//   33   72:aload_2         
	//   34   73:aload_3         
	//   35   74:aload           4
	//   36   76:invokevirtual   #281 <Method void LoginLogger.logCompleteLogin(String, Map, LoginClient$Result$Code, Map, Exception)>
	//   37   79:return          
	}

	private void logStartLogin(Context context, LoginClient.Request request)
	{
		context = ((Context) (LoginLoggerHolder.getLogger(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #252 <Method LoginLogger LoginManager$LoginLoggerHolder.access$000(Context)>
	//    2    4:astore_1        
		if(context != null && request != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
			((LoginLogger) (context)).logStartLogin(request);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #287 <Method void LoginLogger.logStartLogin(LoginClient$Request)>
	//   10   18:return          
	}

	private boolean resolveIntent(Intent intent)
	{
		return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
	//    0    0:invokestatic    #200 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokevirtual   #295 <Method PackageManager Context.getPackageManager()>
	//    2    6:aload_1         
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #301 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//    5   11:ifnonnull       16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	private void startLogin(StartActivityDelegate startactivitydelegate, LoginClient.Request request)
		throws FacebookException
	{
		logStartLogin(((Context) (startactivitydelegate.getActivityContext())), request);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #311 <Method Activity StartActivityDelegate.getActivityContext()>
	//    3    7:aload_2         
	//    4    8:invokespecial   #313 <Method void logStartLogin(Context, LoginClient$Request)>
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
	//    5   11:getstatic       #319 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    6   14:invokevirtual   #322 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    7   17:new             #10  <Class LoginManager$3>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #325 <Method void LoginManager$3(LoginManager)>
	//   11   25:invokestatic    #331 <Method void CallbackManagerImpl.registerStaticCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
		if(!tryFacebookActivity(startactivitydelegate, request))
	//*  12   28:aload_0         
	//*  13   29:aload_1         
	//*  14   30:aload_2         
	//*  15   31:invokespecial   #335 <Method boolean tryFacebookActivity(StartActivityDelegate, LoginClient$Request)>
	//*  16   34:ifne            67
		{
			FacebookException facebookexception = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
	//   17   37:new             #305 <Class FacebookException>
	//   18   40:dup             
	//   19   41:ldc2            #337 <String "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.">
	//   20   44:invokespecial   #340 <Method void FacebookException(String)>
	//   21   47:astore_3        
			logCompleteLogin(((Context) (startactivitydelegate.getActivityContext())), LoginClient.Result.Code.ERROR, ((Map) (null)), ((Exception) (facebookexception)), false, request);
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:invokeinterface #311 <Method Activity StartActivityDelegate.getActivityContext()>
	//   25   55:getstatic       #346 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//   26   58:aconst_null     
	//   27   59:aload_3         
	//   28   60:iconst_0        
	//   29   61:aload_2         
	//   30   62:invokespecial   #348 <Method void logCompleteLogin(Context, LoginClient$Result$Code, Map, Exception, boolean, LoginClient$Request)>
			throw facebookexception;
	//   31   65:aload_3         
	//   32   66:athrow          
		} else
		{
			return;
	//   33   67:return          
		}
	}

	private boolean tryFacebookActivity(StartActivityDelegate startactivitydelegate, LoginClient.Request request)
	{
		request = ((LoginClient.Request) (getFacebookActivityIntent(request)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #353 <Method Intent getFacebookActivityIntent(LoginClient$Request)>
	//    3    5:astore_2        
		if(!resolveIntent(((Intent) (request))))
	//*   4    6:aload_0         
	//*   5    7:aload_2         
	//*   6    8:invokespecial   #355 <Method boolean resolveIntent(Intent)>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		try
		{
			startactivitydelegate.startActivityForResult(((Intent) (request)), LoginClient.getLoginRequestCode());
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokestatic    #360 <Method int LoginClient.getLoginRequestCode()>
	//   13   21:invokeinterface #364 <Method void StartActivityDelegate.startActivityForResult(Intent, int)>
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

	private void validatePublishPermissions(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #371 <Method Iterator Collection.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #376 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            60
		{
			String s = (String)((Iterator) (collection)).next();
	//    9   21:aload_1         
	//   10   22:invokeinterface #380 <Method Object Iterator.next()>
	//   11   27:checkcast       #239 <Class String>
	//   12   30:astore_2        
			if(!isPublishPermission(s))
	//*  13   31:aload_2         
	//*  14   32:invokestatic    #382 <Method boolean isPublishPermission(String)>
	//*  15   35:ifne            12
				throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[] {
					s
				}));
	//   16   38:new             #305 <Class FacebookException>
	//   17   41:dup             
	//   18   42:ldc2            #384 <String "Cannot pass a read permission (%s) to a request for publish authorization">
	//   19   45:iconst_1        
	//   20   46:anewarray       Object[]
	//   21   49:dup             
	//   22   50:iconst_0        
	//   23   51:aload_2         
	//   24   52:aastore         
	//   25   53:invokestatic    #388 <Method String String.format(String, Object[])>
	//   26   56:invokespecial   #340 <Method void FacebookException(String)>
	//   27   59:athrow          
		}

	//   28   60:return          
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
	//*   4    6:invokeinterface #371 <Method Iterator Collection.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #376 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            60
		{
			String s = (String)((Iterator) (collection)).next();
	//    9   21:aload_1         
	//   10   22:invokeinterface #380 <Method Object Iterator.next()>
	//   11   27:checkcast       #239 <Class String>
	//   12   30:astore_2        
			if(isPublishPermission(s))
	//*  13   31:aload_2         
	//*  14   32:invokestatic    #382 <Method boolean isPublishPermission(String)>
	//*  15   35:ifeq            12
				throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
					s
				}));
	//   16   38:new             #305 <Class FacebookException>
	//   17   41:dup             
	//   18   42:ldc2            #392 <String "Cannot pass a publish or manage permission (%s) to a request for read authorization">
	//   19   45:iconst_1        
	//   20   46:anewarray       Object[]
	//   21   49:dup             
	//   22   50:iconst_0        
	//   23   51:aload_2         
	//   24   52:aastore         
	//   25   53:invokestatic    #388 <Method String String.format(String, Object[])>
	//   26   56:invokespecial   #340 <Method void FacebookException(String)>
	//   27   59:athrow          
		}

	//   28   60:return          
	}

	public DefaultAudience getDefaultAudience()
	{
		return defaultAudience;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DefaultAudience defaultAudience>
	//    2    4:areturn         
	}

	public LoginBehavior getLoginBehavior()
	{
		return loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LoginBehavior loginBehavior>
	//    2    4:areturn         
	}

	public void logInWithPublishPermissions(Activity activity, Collection collection)
	{
		validatePublishPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #398 <Method void validatePublishPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #157 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #12  <Class LoginManager$ActivityStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #401 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #403 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	public void logInWithPublishPermissions(Fragment fragment, Collection collection)
	{
		validatePublishPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #398 <Method void validatePublishPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #157 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new FragmentStartActivityDelegate(fragment))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #15  <Class LoginManager$FragmentStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #408 <Method void LoginManager$FragmentStartActivityDelegate(Fragment)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #403 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	public void logInWithReadPermissions(Activity activity, Collection collection)
	{
		validateReadPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #412 <Method void validateReadPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #157 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #12  <Class LoginManager$ActivityStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #401 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #403 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	public void logInWithReadPermissions(Fragment fragment, Collection collection)
	{
		validateReadPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #412 <Method void validateReadPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #157 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new FragmentStartActivityDelegate(fragment))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #15  <Class LoginManager$FragmentStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #408 <Method void LoginManager$FragmentStartActivityDelegate(Fragment)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #403 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	public void logOut()
	{
		AccessToken.setCurrentAccessToken(((AccessToken) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #163 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
		Profile.setCurrentProfile(((Profile) (null)));
	//    2    4:aconst_null     
	//    3    5:invokestatic    #417 <Method void Profile.setCurrentProfile(Profile)>
	//    4    8:return          
	}

	boolean onActivityResult(int i, Intent intent)
	{
		return onActivityResult(i, intent, ((FacebookCallback) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #422 <Method boolean onActivityResult(int, Intent, FacebookCallback)>
	//    5    7:ireturn         
	}

	boolean onActivityResult(int i, Intent intent, FacebookCallback facebookcallback)
	{
		LoginClient.Result.Code code = LoginClient.Result.Code.ERROR;
	//    0    0:getstatic       #346 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//    1    3:astore          9
		Object obj2 = null;
	//    2    5:aconst_null     
	//    3    6:astore          11
		Object obj = null;
	//    4    8:aconst_null     
	//    5    9:astore          7
		Intent intent1 = null;
	//    6   11:aconst_null     
	//    7   12:astore          8
		boolean flag1 = false;
	//    8   14:iconst_0        
	//    9   15:istore          5
		boolean flag2 = false;
	//   10   17:iconst_0        
	//   11   18:istore          6
		boolean flag = false;
	//   12   20:iconst_0        
	//   13   21:istore          4
		Object obj1;
		if(intent != null)
	//*  14   23:aload_2         
	//*  15   24:ifnull          164
		{
			obj1 = ((Object) ((LoginClient.Result)intent.getParcelableExtra("com.facebook.LoginFragment:Result")));
	//   16   27:aload_2         
	//   17   28:ldc2            #424 <String "com.facebook.LoginFragment:Result">
	//   18   31:invokevirtual   #428 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   19   34:checkcast       #430 <Class LoginClient$Result>
	//   20   37:astore          10
			if(obj1 != null)
	//*  21   39:aload           10
	//*  22   41:ifnull          143
			{
				obj2 = ((Object) (((LoginClient.Result) (obj1)).request));
	//   23   44:aload           10
	//   24   46:getfield        #433 <Field LoginClient$Request LoginClient$Result.request>
	//   25   49:astore          11
				code = ((LoginClient.Result) (obj1)).code;
	//   26   51:aload           10
	//   27   53:getfield        #436 <Field LoginClient$Result$Code LoginClient$Result.code>
	//   28   56:astore          9
				if(i == -1)
	//*  29   58:iload_1         
	//*  30   59:iconst_m1       
	//*  31   60:icmpne          114
				{
					if(((LoginClient.Result) (obj1)).code == LoginClient.Result.Code.SUCCESS)
	//*  32   63:aload           10
	//*  33   65:getfield        #436 <Field LoginClient$Result$Code LoginClient$Result.code>
	//*  34   68:getstatic       #439 <Field LoginClient$Result$Code LoginClient$Result$Code.SUCCESS>
	//*  35   71:if_acmpne       91
					{
						intent = ((Intent) (((LoginClient.Result) (obj1)).token));
	//   36   74:aload           10
	//   37   76:getfield        #443 <Field AccessToken LoginClient$Result.token>
	//   38   79:astore_2        
						obj = ((Object) (intent1));
	//   39   80:aload           8
	//   40   82:astore          7
						flag = flag1;
	//   41   84:iload           5
	//   42   86:istore          4
					} else
	//*  43   88:goto            127
					{
						obj = ((Object) (new FacebookAuthorizationException(((LoginClient.Result) (obj1)).errorMessage)));
	//   44   91:new             #445 <Class FacebookAuthorizationException>
	//   45   94:dup             
	//   46   95:aload           10
	//   47   97:getfield        #448 <Field String LoginClient$Result.errorMessage>
	//   48  100:invokespecial   #449 <Method void FacebookAuthorizationException(String)>
	//   49  103:astore          7
						intent = null;
	//   50  105:aconst_null     
	//   51  106:astore_2        
						flag = flag1;
	//   52  107:iload           5
	//   53  109:istore          4
					}
				} else
	//*  54  111:goto            127
				{
					if(i == 0)
	//*  55  114:iload_1         
	//*  56  115:ifne            121
						flag = true;
	//   57  118:iconst_1        
	//   58  119:istore          4
					intent = null;
	//   59  121:aconst_null     
	//   60  122:astore_2        
					obj = ((Object) (intent1));
	//   61  123:aload           8
	//   62  125:astore          7
				}
				obj1 = ((Object) (((LoginClient.Result) (obj1)).loggingExtras));
	//   63  127:aload           10
	//   64  129:getfield        #453 <Field Map LoginClient$Result.loggingExtras>
	//   65  132:astore          10
				intent1 = intent;
	//   66  134:aload_2         
	//   67  135:astore          8
				intent = ((Intent) (obj2));
	//   68  137:aload           11
	//   69  139:astore_2        
			} else
	//*  70  140:goto            161
			{
				intent1 = null;
	//   71  143:aconst_null     
	//   72  144:astore          8
				obj1 = ((Object) (intent1));
	//   73  146:aload           8
	//   74  148:astore          10
				intent = ((Intent) (obj1));
	//   75  150:aload           10
	//   76  152:astore_2        
				flag = flag2;
	//   77  153:iload           6
	//   78  155:istore          4
				obj = obj2;
	//   79  157:aload           11
	//   80  159:astore          7
			}
		} else
	//*  81  161:goto            200
		if(i == 0)
	//*  82  164:iload_1         
	//*  83  165:ifne            188
		{
			code = LoginClient.Result.Code.CANCEL;
	//   84  168:getstatic       #456 <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
	//   85  171:astore          9
			flag = true;
	//   86  173:iconst_1        
	//   87  174:istore          4
			intent = null;
	//   88  176:aconst_null     
	//   89  177:astore_2        
			intent1 = intent;
	//   90  178:aload_2         
	//   91  179:astore          8
			obj1 = ((Object) (intent1));
	//   92  181:aload           8
	//   93  183:astore          10
		} else
	//*  94  185:goto            200
		{
			intent = null;
	//   95  188:aconst_null     
	//   96  189:astore_2        
			intent1 = intent;
	//   97  190:aload_2         
	//   98  191:astore          8
			obj1 = ((Object) (intent1));
	//   99  193:aload           8
	//  100  195:astore          10
			flag = false;
	//  101  197:iconst_0        
	//  102  198:istore          4
		}
		obj2 = obj;
	//  103  200:aload           7
	//  104  202:astore          11
		if(obj == null)
	//* 105  204:aload           7
	//* 106  206:ifnonnull       239
		{
			obj2 = obj;
	//  107  209:aload           7
	//  108  211:astore          11
			if(intent1 == null)
	//* 109  213:aload           8
	//* 110  215:ifnonnull       239
			{
				obj2 = obj;
	//  111  218:aload           7
	//  112  220:astore          11
				if(!flag)
	//* 113  222:iload           4
	//* 114  224:ifne            239
					obj2 = ((Object) (new FacebookException("Unexpected call to LoginManager.onActivityResult")));
	//  115  227:new             #305 <Class FacebookException>
	//  116  230:dup             
	//  117  231:ldc2            #458 <String "Unexpected call to LoginManager.onActivityResult">
	//  118  234:invokespecial   #340 <Method void FacebookException(String)>
	//  119  237:astore          11
			}
		}
		logCompleteLogin(((Context) (null)), code, ((Map) (obj1)), ((Exception) (obj2)), true, ((LoginClient.Request) (intent)));
	//  120  239:aload_0         
	//  121  240:aconst_null     
	//  122  241:aload           9
	//  123  243:aload           10
	//  124  245:aload           11
	//  125  247:iconst_1        
	//  126  248:aload_2         
	//  127  249:invokespecial   #348 <Method void logCompleteLogin(Context, LoginClient$Result$Code, Map, Exception, boolean, LoginClient$Request)>
		finishLogin(((AccessToken) (intent1)), ((LoginClient.Request) (intent)), ((FacebookException) (obj2)), flag, facebookcallback);
	//  128  252:aload_0         
	//  129  253:aload           8
	//  130  255:aload_2         
	//  131  256:aload           11
	//  132  258:iload           4
	//  133  260:aload_3         
	//  134  261:invokespecial   #460 <Method void finishLogin(AccessToken, LoginClient$Request, FacebookException, boolean, FacebookCallback)>
		return true;
	//  135  264:iconst_1        
	//  136  265:ireturn         
	}

	public void registerCallback(CallbackManager callbackmanager, final FacebookCallback callback)
	{
		if(!(callbackmanager instanceof CallbackManagerImpl))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #327 <Class CallbackManagerImpl>
	//*   2    4:ifne            18
		{
			throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
	//    3    7:new             #305 <Class FacebookException>
	//    4   10:dup             
	//    5   11:ldc2            #465 <String "Unexpected CallbackManager, please use the provided Factory.">
	//    6   14:invokespecial   #340 <Method void FacebookException(String)>
	//    7   17:athrow          
		} else
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
	//    8   18:aload_1         
	//    9   19:checkcast       #327 <Class CallbackManagerImpl>
	//   10   22:getstatic       #319 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//   11   25:invokevirtual   #322 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//   12   28:new             #6   <Class LoginManager$1>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:aload_2         
	//   16   34:invokespecial   #468 <Method void LoginManager$1(LoginManager, FacebookCallback)>
	//   17   37:invokevirtual   #470 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
			return;
	//   18   40:return          
		}
	}

	public void resolveError(Activity activity, GraphResponse graphresponse)
	{
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), createLoginRequestFromResponse(graphresponse));
	//    0    0:aload_0         
	//    1    1:new             #12  <Class LoginManager$ActivityStartActivityDelegate>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #401 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #475 <Method LoginClient$Request createLoginRequestFromResponse(GraphResponse)>
	//    8   14:invokespecial   #403 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//    9   17:return          
	}

	public void resolveError(Fragment fragment, GraphResponse graphresponse)
	{
		startLogin(((StartActivityDelegate) (new FragmentStartActivityDelegate(fragment))), createLoginRequestFromResponse(graphresponse));
	//    0    0:aload_0         
	//    1    1:new             #15  <Class LoginManager$FragmentStartActivityDelegate>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #408 <Method void LoginManager$FragmentStartActivityDelegate(Fragment)>
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #475 <Method LoginClient$Request createLoginRequestFromResponse(GraphResponse)>
	//    8   14:invokespecial   #403 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//    9   17:return          
	}

	public LoginManager setDefaultAudience(DefaultAudience defaultaudience)
	{
		defaultAudience = defaultaudience;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field DefaultAudience defaultAudience>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LoginManager setLoginBehavior(LoginBehavior loginbehavior)
	{
		loginBehavior = loginbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field LoginBehavior loginBehavior>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final String MANAGE_PERMISSION_PREFIX = "manage";
	private static final Set OTHER_PUBLISH_PERMISSIONS = getOtherPublishPermissions();
	private static final String PUBLISH_PERMISSION_PREFIX = "publish";
	private static volatile LoginManager instance;
	private DefaultAudience defaultAudience;
	private LoginBehavior loginBehavior;

	static 
	{
	//    0    0:invokestatic    #41  <Method Set getOtherPublishPermissions()>
	//    1    3:putstatic       #43  <Field Set OTHER_PUBLISH_PERMISSIONS>
	//*   2    6:return          
	}
}
