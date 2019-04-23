// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.facebook.login:
//			LoginBehavior, DefaultAudience, LoginResult, LoginLogger, 
//			LoginStatusClient, StartActivityDelegate, LoginClient, LoginMethodHandler

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
			return fragment.getActivity();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field FragmentWrapper fragment>
		//    2    4:invokevirtual   #33  <Method Activity FragmentWrapper.getActivity()>
		//    3    7:areturn         
		}

		public void startActivityForResult(Intent intent, int i)
		{
			fragment.startActivityForResult(intent, i);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field FragmentWrapper fragment>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #37  <Method void FragmentWrapper.startActivityForResult(Intent, int)>
		//    5    9:return          
		}

		private final FragmentWrapper fragment;

		FragmentStartActivityDelegate(FragmentWrapper fragmentwrapper)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			Validate.notNull(((Object) (fragmentwrapper)), "fragment");
		//    2    4:aload_1         
		//    3    5:ldc1            #17  <String "fragment">
		//    4    7:invokestatic    #23  <Method void Validate.notNull(Object, String)>
			fragment = fragmentwrapper;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field FragmentWrapper fragment>
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

		private static LoginLogger logger;


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
	//    1    1:invokespecial   #58  <Method void Object()>
		loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
	//    2    4:aload_0         
	//    3    5:getstatic       #63  <Field LoginBehavior LoginBehavior.NATIVE_WITH_FALLBACK>
	//    4    8:putfield        #65  <Field LoginBehavior loginBehavior>
		defaultAudience = DefaultAudience.FRIENDS;
	//    5   11:aload_0         
	//    6   12:getstatic       #70  <Field DefaultAudience DefaultAudience.FRIENDS>
	//    7   15:putfield        #72  <Field DefaultAudience defaultAudience>
		authType = "rerequest";
	//    8   18:aload_0         
	//    9   19:ldc1            #74  <String "rerequest">
	//   10   21:putfield        #76  <Field String authType>
		Validate.sdkInitialized();
	//   11   24:invokestatic    #81  <Method void Validate.sdkInitialized()>
	//   12   27:aload_0         
	//   13   28:invokestatic    #87  <Method Context FacebookSdk.getApplicationContext()>
	//   14   31:ldc1            #34  <String "com.facebook.loginManager">
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #93  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   37:putfield        #95  <Field SharedPreferences sharedPreferences>
	//   18   40:return          
	}

	static LoginResult computeLoginResult(LoginClient.Request request, AccessToken accesstoken)
	{
		Set set = request.getPermissions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method Set LoginClient$Request.getPermissions()>
	//    2    4:astore_3        
		HashSet hashset = new HashSet(((Collection) (accesstoken.getPermissions())));
	//    3    5:new             #114 <Class HashSet>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #117 <Method Set AccessToken.getPermissions()>
	//    7   13:invokespecial   #120 <Method void HashSet(Collection)>
	//    8   16:astore_2        
		if(request.isRerequest())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #124 <Method boolean LoginClient$Request.isRerequest()>
	//*  11   21:ifeq            32
			((Set) (hashset)).retainAll(((Collection) (set)));
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokeinterface #130 <Method boolean Set.retainAll(Collection)>
	//   15   31:pop             
		request = ((LoginClient.Request) (new HashSet(((Collection) (set)))));
	//   16   32:new             #114 <Class HashSet>
	//   17   35:dup             
	//   18   36:aload_3         
	//   19   37:invokespecial   #120 <Method void HashSet(Collection)>
	//   20   40:astore_0        
		((Set) (request)).removeAll(((Collection) (hashset)));
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokeinterface #133 <Method boolean Set.removeAll(Collection)>
	//   24   48:pop             
		return new LoginResult(accesstoken, ((Set) (hashset)), ((Set) (request)));
	//   25   49:new             #135 <Class LoginResult>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:aload_0         
	//   30   56:invokespecial   #138 <Method void LoginResult(AccessToken, Set, Set)>
	//   31   59:areturn         
	}

	private LoginClient.Request createLoginRequestFromResponse(GraphResponse graphresponse)
	{
		Validate.notNull(((Object) (graphresponse)), "response");
	//    0    0:aload_1         
	//    1    1:ldc1            #142 <String "response">
	//    2    3:invokestatic    #146 <Method void Validate.notNull(Object, String)>
		graphresponse = ((GraphResponse) (graphresponse.getRequest().getAccessToken()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #152 <Method GraphRequest GraphResponse.getRequest()>
	//    5   10:invokevirtual   #158 <Method AccessToken GraphRequest.getAccessToken()>
	//    6   13:astore_1        
		if(graphresponse != null)
	//*   7   14:aload_1         
	//*   8   15:ifnull          26
			graphresponse = ((GraphResponse) (((AccessToken) (graphresponse)).getPermissions()));
	//    9   18:aload_1         
	//   10   19:invokevirtual   #117 <Method Set AccessToken.getPermissions()>
	//   11   22:astore_1        
		else
	//*  12   23:goto            28
			graphresponse = null;
	//   13   26:aconst_null     
	//   14   27:astore_1        
		return createLoginRequest(((Collection) (graphresponse)));
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #162 <Method LoginClient$Request createLoginRequest(Collection)>
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
	//    3    5:invokestatic    #168 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
			Profile.fetchProfileForCurrentAccessToken();
	//    4    8:invokestatic    #173 <Method void Profile.fetchProfileForCurrentAccessToken()>
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
	//   11   22:invokestatic    #175 <Method LoginResult computeLoginResult(LoginClient$Request, AccessToken)>
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
	//*  21   41:invokevirtual   #178 <Method Set LoginResult.getRecentlyGrantedPermissions()>
	//*  22   44:invokeinterface #182 <Method int Set.size()>
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
	//   29   62:invokeinterface #188 <Method void FacebookCallback.onError(FacebookException)>
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
	//   35   74:invokespecial   #192 <Method void setExpressLoginStatus(boolean)>
					facebookcallback.onSuccess(((Object) (request)));
	//   36   77:aload           5
	//   37   79:aload_2         
	//   38   80:invokeinterface #196 <Method void FacebookCallback.onSuccess(Object)>
					return;
	//   39   85:return          
				}
			} else
			{
				facebookcallback.onCancel();
	//   40   86:aload           5
	//   41   88:invokeinterface #199 <Method void FacebookCallback.onCancel()>
			}
		}
	//   42   93:return          
	}

	static Map getExtraDataFromIntent(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		intent = ((Intent) ((LoginClient.Result)intent.getParcelableExtra("com.facebook.LoginFragment:Result")));
	//    4    6:aload_0         
	//    5    7:ldc1            #206 <String "com.facebook.LoginFragment:Result">
	//    6    9:invokevirtual   #212 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    7   12:checkcast       #214 <Class LoginClient$Result>
	//    8   15:astore_0        
		if(intent == null)
	//*   9   16:aload_0         
	//*  10   17:ifnonnull       22
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		else
			return ((LoginClient.Result) (intent)).extraData;
	//   13   22:aload_0         
	//   14   23:getfield        #218 <Field Map LoginClient$Result.extraData>
	//   15   26:areturn         
	}

	public static LoginManager getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #224 <Field LoginManager instance>
	//    1    3:ifnonnull       37
		com/facebook/login/LoginManager;
	//    2    6:ldc1            #2   <Class LoginManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #224 <Field LoginManager instance>
	//*   5   12:ifnonnull       25
			instance = new LoginManager();
	//    6   15:new             #2   <Class LoginManager>
	//    7   18:dup             
	//    8   19:invokespecial   #225 <Method void LoginManager()>
	//    9   22:putstatic       #224 <Field LoginManager instance>
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
	//   18   37:getstatic       #224 <Field LoginManager instance>
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
	//    2    4:invokespecial   #226 <Method void LoginManager$2()>
	//    3    7:invokestatic    #232 <Method Set Collections.unmodifiableSet(Set)>
	//    4   10:areturn         
	}

	private static Profile getProfileFromBundle(Bundle bundle)
	{
		String s = bundle.getString("com.facebook.platform.extra.PROFILE_NAME");
	//    0    0:aload_0         
	//    1    1:ldc1            #235 <String "com.facebook.platform.extra.PROFILE_NAME">
	//    2    3:invokevirtual   #241 <Method String Bundle.getString(String)>
	//    3    6:astore_1        
		String s1 = bundle.getString("com.facebook.platform.extra.PROFILE_FIRST_NAME");
	//    4    7:aload_0         
	//    5    8:ldc1            #243 <String "com.facebook.platform.extra.PROFILE_FIRST_NAME">
	//    6   10:invokevirtual   #241 <Method String Bundle.getString(String)>
	//    7   13:astore_2        
		String s2 = bundle.getString("com.facebook.platform.extra.PROFILE_MIDDLE_NAME");
	//    8   14:aload_0         
	//    9   15:ldc1            #245 <String "com.facebook.platform.extra.PROFILE_MIDDLE_NAME">
	//   10   17:invokevirtual   #241 <Method String Bundle.getString(String)>
	//   11   20:astore_3        
		String s3 = bundle.getString("com.facebook.platform.extra.PROFILE_LAST_NAME");
	//   12   21:aload_0         
	//   13   22:ldc1            #247 <String "com.facebook.platform.extra.PROFILE_LAST_NAME">
	//   14   24:invokevirtual   #241 <Method String Bundle.getString(String)>
	//   15   27:astore          4
		String s4 = bundle.getString("com.facebook.platform.extra.PROFILE_LINK");
	//   16   29:aload_0         
	//   17   30:ldc1            #249 <String "com.facebook.platform.extra.PROFILE_LINK">
	//   18   32:invokevirtual   #241 <Method String Bundle.getString(String)>
	//   19   35:astore          5
		bundle = ((Bundle) (bundle.getString("com.facebook.platform.extra.PROFILE_USER_ID")));
	//   20   37:aload_0         
	//   21   38:ldc1            #251 <String "com.facebook.platform.extra.PROFILE_USER_ID">
	//   22   40:invokevirtual   #241 <Method String Bundle.getString(String)>
	//   23   43:astore_0        
		if(s != null && s1 != null && s2 != null && s3 != null && s4 != null && bundle != null)
	//*  24   44:aload_1         
	//*  25   45:ifnull          89
	//*  26   48:aload_2         
	//*  27   49:ifnull          89
	//*  28   52:aload_3         
	//*  29   53:ifnull          89
	//*  30   56:aload           4
	//*  31   58:ifnull          89
	//*  32   61:aload           5
	//*  33   63:ifnull          89
	//*  34   66:aload_0         
	//*  35   67:ifnull          89
			return new Profile(((String) (bundle)), s1, s2, s3, s, Uri.parse(s4));
	//   36   70:new             #170 <Class Profile>
	//   37   73:dup             
	//   38   74:aload_0         
	//   39   75:aload_2         
	//   40   76:aload_3         
	//   41   77:aload           4
	//   42   79:aload_1         
	//   43   80:aload           5
	//   44   82:invokestatic    #257 <Method Uri Uri.parse(String)>
	//   45   85:invokespecial   #260 <Method void Profile(String, String, String, String, String, Uri)>
	//   46   88:areturn         
		else
			return null;
	//   47   89:aconst_null     
	//   48   90:areturn         
	}

	private static void handleLoginStatusError(String s, String s1, String s2, LoginLogger loginlogger, LoginStatusCallback loginstatuscallback)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #262 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #263 <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append(s);
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:invokevirtual   #267 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(": ");
	//    8   16:aload           5
	//    9   18:ldc2            #269 <String ": ">
	//   10   21:invokevirtual   #267 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(s1);
	//   12   25:aload           5
	//   13   27:aload_1         
	//   14   28:invokevirtual   #267 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		s = ((String) (new FacebookException(stringbuilder.toString())));
	//   16   32:new             #271 <Class FacebookException>
	//   17   35:dup             
	//   18   36:aload           5
	//   19   38:invokevirtual   #275 <Method String StringBuilder.toString()>
	//   20   41:invokespecial   #278 <Method void FacebookException(String)>
	//   21   44:astore_0        
		loginlogger.logLoginStatusError(s2, ((Exception) (s)));
	//   22   45:aload_3         
	//   23   46:aload_2         
	//   24   47:aload_0         
	//   25   48:invokevirtual   #284 <Method void LoginLogger.logLoginStatusError(String, Exception)>
		loginstatuscallback.onError(((Exception) (s)));
	//   26   51:aload           4
	//   27   53:aload_0         
	//   28   54:invokeinterface #289 <Method void LoginStatusCallback.onError(Exception)>
	//   29   59:return          
	}

	private boolean isExpressLoginAllowed()
	{
		return sharedPreferences.getBoolean("express_login_allowed", true);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field SharedPreferences sharedPreferences>
	//    2    4:ldc1            #25  <String "express_login_allowed">
	//    3    6:iconst_1        
	//    4    7:invokeinterface #296 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	static boolean isPublishPermission(String s)
	{
		return s != null && (s.startsWith("publish") || s.startsWith("manage") || OTHER_PUBLISH_PERMISSIONS.contains(((Object) (s))));
	//    0    0:aload_0         
	//    1    1:ifnull          36
	//    2    4:aload_0         
	//    3    5:ldc1            #37  <String "publish">
	//    4    7:invokevirtual   #303 <Method boolean String.startsWith(String)>
	//    5   10:ifne            34
	//    6   13:aload_0         
	//    7   14:ldc1            #28  <String "manage">
	//    8   16:invokevirtual   #303 <Method boolean String.startsWith(String)>
	//    9   19:ifne            34
	//   10   22:getstatic       #54  <Field Set OTHER_PUBLISH_PERMISSIONS>
	//   11   25:aload_0         
	//   12   26:invokeinterface #307 <Method boolean Set.contains(Object)>
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
	//    1    1:invokestatic    #313 <Method LoginLogger LoginManager$LoginLoggerHolder.access$000(Context)>
	//    2    4:astore          7
		if(loginlogger == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(request == null)
	//*   6   12:aload           6
	//*   7   14:ifnonnull       29
		{
			loginlogger.logUnexpectedError("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
	//    8   17:aload           7
	//    9   19:ldc2            #315 <String "fb_mobile_login_complete">
	//   10   22:ldc2            #317 <String "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.">
	//   11   25:invokevirtual   #321 <Method void LoginLogger.logUnexpectedError(String, String)>
			return;
	//   12   28:return          
		}
		HashMap hashmap = new HashMap();
	//   13   29:new             #323 <Class HashMap>
	//   14   32:dup             
	//   15   33:invokespecial   #324 <Method void HashMap()>
	//   16   36:astore          8
		if(flag)
	//*  17   38:iload           5
	//*  18   40:ifeq            50
			context = "1";
	//   19   43:ldc2            #326 <String "1">
	//   20   46:astore_1        
		else
	//*  21   47:goto            54
			context = "0";
	//   22   50:ldc2            #328 <String "0">
	//   23   53:astore_1        
		hashmap.put("try_login_activity", ((Object) (context)));
	//   24   54:aload           8
	//   25   56:ldc2            #330 <String "try_login_activity">
	//   26   59:aload_1         
	//   27   60:invokevirtual   #334 <Method Object HashMap.put(Object, Object)>
	//   28   63:pop             
		loginlogger.logCompleteLogin(request.getAuthId(), ((Map) (hashmap)), code, map, exception);
	//   29   64:aload           7
	//   30   66:aload           6
	//   31   68:invokevirtual   #337 <Method String LoginClient$Request.getAuthId()>
	//   32   71:aload           8
	//   33   73:aload_2         
	//   34   74:aload_3         
	//   35   75:aload           4
	//   36   77:invokevirtual   #340 <Method void LoginLogger.logCompleteLogin(String, Map, LoginClient$Result$Code, Map, Exception)>
	//   37   80:return          
	}

	private void logInWithPublishPermissions(FragmentWrapper fragmentwrapper, Collection collection)
	{
		validatePublishPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #346 <Method void validatePublishPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #162 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new FragmentStartActivityDelegate(fragmentwrapper))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #17  <Class LoginManager$FragmentStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #349 <Method void LoginManager$FragmentStartActivityDelegate(FragmentWrapper)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	private void logInWithReadPermissions(FragmentWrapper fragmentwrapper, Collection collection)
	{
		validateReadPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #358 <Method void validateReadPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #162 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new FragmentStartActivityDelegate(fragmentwrapper))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #17  <Class LoginManager$FragmentStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #349 <Method void LoginManager$FragmentStartActivityDelegate(FragmentWrapper)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	private void logStartLogin(Context context, LoginClient.Request request)
	{
		context = ((Context) (LoginLoggerHolder.getLogger(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #313 <Method LoginLogger LoginManager$LoginLoggerHolder.access$000(Context)>
	//    2    4:astore_1        
		if(context != null && request != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
			((LoginLogger) (context)).logStartLogin(request);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #363 <Method void LoginLogger.logStartLogin(LoginClient$Request)>
	//   10   18:return          
	}

	private void reauthorizeDataAccess(FragmentWrapper fragmentwrapper)
	{
		LoginClient.Request request = createReauthorizeRequest();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #368 <Method LoginClient$Request createReauthorizeRequest()>
	//    2    4:astore_2        
		startLogin(((StartActivityDelegate) (new FragmentStartActivityDelegate(fragmentwrapper))), request);
	//    3    5:aload_0         
	//    4    6:new             #17  <Class LoginManager$FragmentStartActivityDelegate>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #349 <Method void LoginManager$FragmentStartActivityDelegate(FragmentWrapper)>
	//    8   14:aload_2         
	//    9   15:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   10   18:return          
	}

	private void resolveError(FragmentWrapper fragmentwrapper, GraphResponse graphresponse)
	{
		startLogin(((StartActivityDelegate) (new FragmentStartActivityDelegate(fragmentwrapper))), createLoginRequestFromResponse(graphresponse));
	//    0    0:aload_0         
	//    1    1:new             #17  <Class LoginManager$FragmentStartActivityDelegate>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #349 <Method void LoginManager$FragmentStartActivityDelegate(FragmentWrapper)>
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #372 <Method LoginClient$Request createLoginRequestFromResponse(GraphResponse)>
	//    8   14:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//    9   17:return          
	}

	private boolean resolveIntent(Intent intent)
	{
		PackageManager packagemanager = FacebookSdk.getApplicationContext().getPackageManager();
	//    0    0:invokestatic    #87  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokevirtual   #378 <Method PackageManager Context.getPackageManager()>
	//    2    6:astore_3        
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		if(packagemanager.resolveActivity(intent, 0) != null)
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:iconst_0        
	//*   8   12:invokevirtual   #384 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*   9   15:ifnull          20
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
		return flag;
	//   12   20:iload_2         
	//   13   21:ireturn         
	}

	private void retrieveLoginStatusImpl(Context context, final LoginStatusCallback responseCallback, long l)
	{
		final String applicationId = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #389 <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore          5
		final String loggerRef = UUID.randomUUID().toString();
	//    2    5:invokestatic    #395 <Method UUID UUID.randomUUID()>
	//    3    8:invokevirtual   #396 <Method String UUID.toString()>
	//    4   11:astore          6
		final LoginLogger logger = new LoginLogger(context, applicationId);
	//    5   13:new             #280 <Class LoginLogger>
	//    6   16:dup             
	//    7   17:aload_1         
	//    8   18:aload           5
	//    9   20:invokespecial   #399 <Method void LoginLogger(Context, String)>
	//   10   23:astore          7
		if(!isExpressLoginAllowed())
	//*  11   25:aload_0         
	//*  12   26:invokespecial   #401 <Method boolean isExpressLoginAllowed()>
	//*  13   29:ifne            46
		{
			logger.logLoginStatusFailure(loggerRef);
	//   14   32:aload           7
	//   15   34:aload           6
	//   16   36:invokevirtual   #404 <Method void LoginLogger.logLoginStatusFailure(String)>
			responseCallback.onFailure();
	//   17   39:aload_2         
	//   18   40:invokeinterface #407 <Method void LoginStatusCallback.onFailure()>
			return;
	//   19   45:return          
		}
		context = ((Context) (new LoginStatusClient(context, applicationId, loggerRef, FacebookSdk.getGraphApiVersion(), l)));
	//   20   46:new             #409 <Class LoginStatusClient>
	//   21   49:dup             
	//   22   50:aload_1         
	//   23   51:aload           5
	//   24   53:aload           6
	//   25   55:invokestatic    #412 <Method String FacebookSdk.getGraphApiVersion()>
	//   26   58:lload_3         
	//   27   59:invokespecial   #415 <Method void LoginStatusClient(Context, String, String, String, long)>
	//   28   62:astore_1        
		((LoginStatusClient) (context)).setCompletedListener(new com.facebook.internal.PlatformServiceClient.CompletedListener() {

			public void completed(Bundle bundle)
			{
				if(bundle != null)
			//*   0    0:aload_1         
			//*   1    1:ifnull          227
				{
					Object obj = ((Object) (bundle.getString("com.facebook.platform.status.ERROR_TYPE")));
			//    2    4:aload_1         
			//    3    5:ldc1            #40  <String "com.facebook.platform.status.ERROR_TYPE">
			//    4    7:invokevirtual   #46  <Method String Bundle.getString(String)>
			//    5   10:astore_2        
					String s = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
			//    6   11:aload_1         
			//    7   12:ldc1            #48  <String "com.facebook.platform.status.ERROR_DESCRIPTION">
			//    8   14:invokevirtual   #46  <Method String Bundle.getString(String)>
			//    9   17:astore_3        
					if(obj != null)
			//*  10   18:aload_2         
			//*  11   19:ifnull          40
					{
						LoginManager.handleLoginStatusError(((String) (obj)), s, loggerRef, logger, responseCallback);
			//   12   22:aload_2         
			//   13   23:aload_3         
			//   14   24:aload_0         
			//   15   25:getfield        #26  <Field String val$loggerRef>
			//   16   28:aload_0         
			//   17   29:getfield        #28  <Field LoginLogger val$logger>
			//   18   32:aload_0         
			//   19   33:getfield        #30  <Field LoginStatusCallback val$responseCallback>
			//   20   36:invokestatic    #52  <Method void LoginManager.access$100(String, String, String, LoginLogger, LoginStatusCallback)>
						return;
			//   21   39:return          
					}
					s = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
			//   22   40:aload_1         
			//   23   41:ldc1            #54  <String "com.facebook.platform.extra.ACCESS_TOKEN">
			//   24   43:invokevirtual   #46  <Method String Bundle.getString(String)>
			//   25   46:astore_3        
					Date date = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
			//   26   47:aload_1         
			//   27   48:ldc1            #56  <String "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH">
			//   28   50:new             #58  <Class Date>
			//   29   53:dup             
			//   30   54:lconst_0        
			//   31   55:invokespecial   #61  <Method void Date(long)>
			//   32   58:invokestatic    #67  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
			//   33   61:astore          4
					ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
			//   34   63:aload_1         
			//   35   64:ldc1            #69  <String "com.facebook.platform.extra.PERMISSIONS">
			//   36   66:invokevirtual   #73  <Method ArrayList Bundle.getStringArrayList(String)>
			//   37   69:astore          5
					obj = ((Object) (bundle.getString("signed request")));
			//   38   71:aload_1         
			//   39   72:ldc1            #75  <String "signed request">
			//   40   74:invokevirtual   #46  <Method String Bundle.getString(String)>
			//   41   77:astore_2        
					Date date1 = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
			//   42   78:aload_1         
			//   43   79:ldc1            #77  <String "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME">
			//   44   81:new             #58  <Class Date>
			//   45   84:dup             
			//   46   85:lconst_0        
			//   47   86:invokespecial   #61  <Method void Date(long)>
			//   48   89:invokestatic    #67  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
			//   49   92:astore          6
					if(!Utility.isNullOrEmpty(((String) (obj))))
			//*  50   94:aload_2         
			//*  51   95:invokestatic    #81  <Method boolean Utility.isNullOrEmpty(String)>
			//*  52   98:ifne            109
						obj = ((Object) (LoginMethodHandler.getUserIDFromSignedRequest(((String) (obj)))));
			//   53  101:aload_2         
			//   54  102:invokestatic    #86  <Method String LoginMethodHandler.getUserIDFromSignedRequest(String)>
			//   55  105:astore_2        
					else
			//*  56  106:goto            111
						obj = null;
			//   57  109:aconst_null     
			//   58  110:astore_2        
					if(!Utility.isNullOrEmpty(s) && arraylist != null && !arraylist.isEmpty() && !Utility.isNullOrEmpty(((String) (obj))))
			//*  59  111:aload_3         
			//*  60  112:invokestatic    #81  <Method boolean Utility.isNullOrEmpty(String)>
			//*  61  115:ifne            206
			//*  62  118:aload           5
			//*  63  120:ifnull          206
			//*  64  123:aload           5
			//*  65  125:invokevirtual   #92  <Method boolean ArrayList.isEmpty()>
			//*  66  128:ifne            206
			//*  67  131:aload_2         
			//*  68  132:invokestatic    #81  <Method boolean Utility.isNullOrEmpty(String)>
			//*  69  135:ifne            206
					{
						obj = ((Object) (new AccessToken(s, applicationId, ((String) (obj)), ((Collection) (arraylist)), ((Collection) (null)), ((com.facebook.AccessTokenSource) (null)), date, ((Date) (null)), date1)));
			//   70  138:new             #94  <Class AccessToken>
			//   71  141:dup             
			//   72  142:aload_3         
			//   73  143:aload_0         
			//   74  144:getfield        #32  <Field String val$applicationId>
			//   75  147:aload_2         
			//   76  148:aload           5
			//   77  150:aconst_null     
			//   78  151:aconst_null     
			//   79  152:aload           4
			//   80  154:aconst_null     
			//   81  155:aload           6
			//   82  157:invokespecial   #97  <Method void AccessToken(String, String, String, Collection, Collection, com.facebook.AccessTokenSource, Date, Date, Date)>
			//   83  160:astore_2        
						AccessToken.setCurrentAccessToken(((AccessToken) (obj)));
			//   84  161:aload_2         
			//   85  162:invokestatic    #101 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
						bundle = ((Bundle) (LoginManager.getProfileFromBundle(bundle)));
			//   86  165:aload_1         
			//   87  166:invokestatic    #105 <Method Profile LoginManager.access$200(Bundle)>
			//   88  169:astore_1        
						if(bundle != null)
			//*  89  170:aload_1         
			//*  90  171:ifnull          181
							Profile.setCurrentProfile(((Profile) (bundle)));
			//   91  174:aload_1         
			//   92  175:invokestatic    #111 <Method void Profile.setCurrentProfile(Profile)>
						else
			//*  93  178:goto            184
							Profile.fetchProfileForCurrentAccessToken();
			//   94  181:invokestatic    #114 <Method void Profile.fetchProfileForCurrentAccessToken()>
						logger.logLoginStatusSuccess(loggerRef);
			//   95  184:aload_0         
			//   96  185:getfield        #28  <Field LoginLogger val$logger>
			//   97  188:aload_0         
			//   98  189:getfield        #26  <Field String val$loggerRef>
			//   99  192:invokevirtual   #120 <Method void LoginLogger.logLoginStatusSuccess(String)>
						responseCallback.onCompleted(((AccessToken) (obj)));
			//  100  195:aload_0         
			//  101  196:getfield        #30  <Field LoginStatusCallback val$responseCallback>
			//  102  199:aload_2         
			//  103  200:invokeinterface #125 <Method void LoginStatusCallback.onCompleted(AccessToken)>
						return;
			//  104  205:return          
					} else
					{
						logger.logLoginStatusFailure(loggerRef);
			//  105  206:aload_0         
			//  106  207:getfield        #28  <Field LoginLogger val$logger>
			//  107  210:aload_0         
			//  108  211:getfield        #26  <Field String val$loggerRef>
			//  109  214:invokevirtual   #128 <Method void LoginLogger.logLoginStatusFailure(String)>
						responseCallback.onFailure();
			//  110  217:aload_0         
			//  111  218:getfield        #30  <Field LoginStatusCallback val$responseCallback>
			//  112  221:invokeinterface #131 <Method void LoginStatusCallback.onFailure()>
						return;
			//  113  226:return          
					}
				} else
				{
					logger.logLoginStatusFailure(loggerRef);
			//  114  227:aload_0         
			//  115  228:getfield        #28  <Field LoginLogger val$logger>
			//  116  231:aload_0         
			//  117  232:getfield        #26  <Field String val$loggerRef>
			//  118  235:invokevirtual   #128 <Method void LoginLogger.logLoginStatusFailure(String)>
					responseCallback.onFailure();
			//  119  238:aload_0         
			//  120  239:getfield        #30  <Field LoginStatusCallback val$responseCallback>
			//  121  242:invokeinterface #131 <Method void LoginStatusCallback.onFailure()>
					return;
			//  122  247:return          
				}
			}

			final LoginManager this$0;
			final String val$applicationId;
			final LoginLogger val$logger;
			final String val$loggerRef;
			final LoginStatusCallback val$responseCallback;

			
			{
				this$0 = LoginManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field LoginManager this$0>
				loggerRef = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$loggerRef>
				logger = loginlogger;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field LoginLogger val$logger>
				responseCallback = loginstatuscallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field LoginStatusCallback val$responseCallback>
				applicationId = s1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field String val$applicationId>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #35  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//   29   63:aload_1         
	//   30   64:new             #12  <Class LoginManager$4>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:aload           6
	//   34   71:aload           7
	//   35   73:aload_2         
	//   36   74:aload           5
	//   37   76:invokespecial   #418 <Method void LoginManager$4(LoginManager, String, LoginLogger, LoginStatusCallback, String)>
	//   38   79:invokevirtual   #422 <Method void LoginStatusClient.setCompletedListener(com.facebook.internal.PlatformServiceClient$CompletedListener)>
		logger.logLoginStatusStart(loggerRef);
	//   39   82:aload           7
	//   40   84:aload           6
	//   41   86:invokevirtual   #425 <Method void LoginLogger.logLoginStatusStart(String)>
		if(!((LoginStatusClient) (context)).start())
	//*  42   89:aload_1         
	//*  43   90:invokevirtual   #428 <Method boolean LoginStatusClient.start()>
	//*  44   93:ifne            109
		{
			logger.logLoginStatusFailure(loggerRef);
	//   45   96:aload           7
	//   46   98:aload           6
	//   47  100:invokevirtual   #404 <Method void LoginLogger.logLoginStatusFailure(String)>
			responseCallback.onFailure();
	//   48  103:aload_2         
	//   49  104:invokeinterface #407 <Method void LoginStatusCallback.onFailure()>
		}
	//   50  109:return          
	}

	private void setExpressLoginStatus(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #432 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.putBoolean("express_login_allowed", flag);
	//    4   10:aload_2         
	//    5   11:ldc1            #25  <String "express_login_allowed">
	//    6   13:iload_1         
	//    7   14:invokeinterface #438 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   19:pop             
		editor.apply();
	//    9   20:aload_2         
	//   10   21:invokeinterface #441 <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   26:return          
	}

	private void startLogin(StartActivityDelegate startactivitydelegate, LoginClient.Request request)
		throws FacebookException
	{
		logStartLogin(((Context) (startactivitydelegate.getActivityContext())), request);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #447 <Method Activity StartActivityDelegate.getActivityContext()>
	//    3    7:aload_2         
	//    4    8:invokespecial   #449 <Method void logStartLogin(Context, LoginClient$Request)>
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
	//    5   11:getstatic       #455 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    6   14:invokevirtual   #458 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    7   17:new             #10  <Class LoginManager$3>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #461 <Method void LoginManager$3(LoginManager)>
	//   11   25:invokestatic    #467 <Method void CallbackManagerImpl.registerStaticCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
		if(tryFacebookActivity(startactivitydelegate, request))
	//*  12   28:aload_0         
	//*  13   29:aload_1         
	//*  14   30:aload_2         
	//*  15   31:invokespecial   #471 <Method boolean tryFacebookActivity(StartActivityDelegate, LoginClient$Request)>
	//*  16   34:ifeq            38
		{
			return;
	//   17   37:return          
		} else
		{
			FacebookException facebookexception = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
	//   18   38:new             #271 <Class FacebookException>
	//   19   41:dup             
	//   20   42:ldc2            #473 <String "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.">
	//   21   45:invokespecial   #278 <Method void FacebookException(String)>
	//   22   48:astore_3        
			logCompleteLogin(((Context) (startactivitydelegate.getActivityContext())), LoginClient.Result.Code.ERROR, ((Map) (null)), ((Exception) (facebookexception)), false, request);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokeinterface #447 <Method Activity StartActivityDelegate.getActivityContext()>
	//   26   56:getstatic       #479 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//   27   59:aconst_null     
	//   28   60:aload_3         
	//   29   61:iconst_0        
	//   30   62:aload_2         
	//   31   63:invokespecial   #481 <Method void logCompleteLogin(Context, LoginClient$Result$Code, Map, Exception, boolean, LoginClient$Request)>
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
	//    2    2:invokevirtual   #488 <Method Intent getFacebookActivityIntent(LoginClient$Request)>
	//    3    5:astore_2        
		if(!resolveIntent(((Intent) (request))))
	//*   4    6:aload_0         
	//*   5    7:aload_2         
	//*   6    8:invokespecial   #490 <Method boolean resolveIntent(Intent)>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		try
		{
			startactivitydelegate.startActivityForResult(((Intent) (request)), LoginClient.getLoginRequestCode());
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokestatic    #495 <Method int LoginClient.getLoginRequestCode()>
	//   13   21:invokeinterface #499 <Method void StartActivityDelegate.startActivityForResult(Intent, int)>
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
	//*   4    6:invokeinterface #505 <Method Iterator Collection.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #510 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            63
		{
			String s = (String)((Iterator) (collection)).next();
	//    9   21:aload_1         
	//   10   22:invokeinterface #514 <Method Object Iterator.next()>
	//   11   27:checkcast       #300 <Class String>
	//   12   30:astore_2        
			if(!isPublishPermission(s))
	//*  13   31:aload_2         
	//*  14   32:invokestatic    #516 <Method boolean isPublishPermission(String)>
	//*  15   35:ifeq            41
	//*  16   38:goto            12
				throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[] {
					s
				}));
	//   17   41:new             #271 <Class FacebookException>
	//   18   44:dup             
	//   19   45:ldc2            #518 <String "Cannot pass a read permission (%s) to a request for publish authorization">
	//   20   48:iconst_1        
	//   21   49:anewarray       Object[]
	//   22   52:dup             
	//   23   53:iconst_0        
	//   24   54:aload_2         
	//   25   55:aastore         
	//   26   56:invokestatic    #522 <Method String String.format(String, Object[])>
	//   27   59:invokespecial   #278 <Method void FacebookException(String)>
	//   28   62:athrow          
		}

	//   29   63:return          
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
	//*   4    6:invokeinterface #505 <Method Iterator Collection.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #510 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            63
		{
			String s = (String)((Iterator) (collection)).next();
	//    9   21:aload_1         
	//   10   22:invokeinterface #514 <Method Object Iterator.next()>
	//   11   27:checkcast       #300 <Class String>
	//   12   30:astore_2        
			if(isPublishPermission(s))
	//*  13   31:aload_2         
	//*  14   32:invokestatic    #516 <Method boolean isPublishPermission(String)>
	//*  15   35:ifne            41
	//*  16   38:goto            12
				throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
					s
				}));
	//   17   41:new             #271 <Class FacebookException>
	//   18   44:dup             
	//   19   45:ldc2            #525 <String "Cannot pass a publish or manage permission (%s) to a request for read authorization">
	//   20   48:iconst_1        
	//   21   49:anewarray       Object[]
	//   22   52:dup             
	//   23   53:iconst_0        
	//   24   54:aload_2         
	//   25   55:aastore         
	//   26   56:invokestatic    #522 <Method String String.format(String, Object[])>
	//   27   59:invokespecial   #278 <Method void FacebookException(String)>
	//   28   62:athrow          
		}

	//   29   63:return          
	}

	protected LoginClient.Request createLoginRequest(Collection collection)
	{
		LoginBehavior loginbehavior = loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LoginBehavior loginBehavior>
	//    2    4:astore_2        
		if(collection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			collection = ((Collection) (new HashSet(collection)));
	//    5    9:new             #114 <Class HashSet>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #120 <Method void HashSet(Collection)>
	//    9   17:astore_1        
		else
	//*  10   18:goto            29
			collection = ((Collection) (new HashSet()));
	//   11   21:new             #114 <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #526 <Method void HashSet()>
	//   14   28:astore_1        
		collection = ((Collection) (new LoginClient.Request(loginbehavior, Collections.unmodifiableSet(((Set) (collection))), defaultAudience, authType, FacebookSdk.getApplicationId(), UUID.randomUUID().toString())));
	//   15   29:new             #109 <Class LoginClient$Request>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokestatic    #232 <Method Set Collections.unmodifiableSet(Set)>
	//   20   38:aload_0         
	//   21   39:getfield        #72  <Field DefaultAudience defaultAudience>
	//   22   42:aload_0         
	//   23   43:getfield        #76  <Field String authType>
	//   24   46:invokestatic    #389 <Method String FacebookSdk.getApplicationId()>
	//   25   49:invokestatic    #395 <Method UUID UUID.randomUUID()>
	//   26   52:invokevirtual   #396 <Method String UUID.toString()>
	//   27   55:invokespecial   #529 <Method void LoginClient$Request(LoginBehavior, Set, DefaultAudience, String, String, String)>
	//   28   58:astore_1        
		((LoginClient.Request) (collection)).setRerequest(AccessToken.isCurrentAccessTokenActive());
	//   29   59:aload_1         
	//   30   60:invokestatic    #532 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//   31   63:invokevirtual   #535 <Method void LoginClient$Request.setRerequest(boolean)>
		return ((LoginClient.Request) (collection));
	//   32   66:aload_1         
	//   33   67:areturn         
	}

	protected LoginClient.Request createReauthorizeRequest()
	{
		return new LoginClient.Request(LoginBehavior.DIALOG_ONLY, ((Set) (new HashSet())), defaultAudience, "reauthorize", FacebookSdk.getApplicationId(), UUID.randomUUID().toString());
	//    0    0:new             #109 <Class LoginClient$Request>
	//    1    3:dup             
	//    2    4:getstatic       #539 <Field LoginBehavior LoginBehavior.DIALOG_ONLY>
	//    3    7:new             #114 <Class HashSet>
	//    4   10:dup             
	//    5   11:invokespecial   #526 <Method void HashSet()>
	//    6   14:aload_0         
	//    7   15:getfield        #72  <Field DefaultAudience defaultAudience>
	//    8   18:ldc2            #541 <String "reauthorize">
	//    9   21:invokestatic    #389 <Method String FacebookSdk.getApplicationId()>
	//   10   24:invokestatic    #395 <Method UUID UUID.randomUUID()>
	//   11   27:invokevirtual   #396 <Method String UUID.toString()>
	//   12   30:invokespecial   #529 <Method void LoginClient$Request(LoginBehavior, Set, DefaultAudience, String, String, String)>
	//   13   33:areturn         
	}

	public String getAuthType()
	{
		return authType;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String authType>
	//    2    4:areturn         
	}

	public DefaultAudience getDefaultAudience()
	{
		return defaultAudience;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field DefaultAudience defaultAudience>
	//    2    4:areturn         
	}

	protected Intent getFacebookActivityIntent(LoginClient.Request request)
	{
		Intent intent = new Intent();
	//    0    0:new             #208 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #545 <Method void Intent()>
	//    3    7:astore_2        
		intent.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//    4    8:aload_2         
	//    5    9:invokestatic    #87  <Method Context FacebookSdk.getApplicationContext()>
	//    6   12:ldc2            #547 <Class FacebookActivity>
	//    7   15:invokevirtual   #551 <Method Intent Intent.setClass(Context, Class)>
	//    8   18:pop             
		intent.setAction(request.getLoginBehavior().toString());
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #555 <Method LoginBehavior LoginClient$Request.getLoginBehavior()>
	//   12   24:invokevirtual   #556 <Method String LoginBehavior.toString()>
	//   13   27:invokevirtual   #560 <Method Intent Intent.setAction(String)>
	//   14   30:pop             
		Bundle bundle = new Bundle();
	//   15   31:new             #237 <Class Bundle>
	//   16   34:dup             
	//   17   35:invokespecial   #561 <Method void Bundle()>
	//   18   38:astore_3        
		bundle.putParcelable("request", ((android.os.Parcelable) (request)));
	//   19   39:aload_3         
	//   20   40:ldc2            #563 <String "request">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #567 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtra("com.facebook.LoginFragment:Request", bundle);
	//   23   47:aload_2         
	//   24   48:ldc2            #569 <String "com.facebook.LoginFragment:Request">
	//   25   51:aload_3         
	//   26   52:invokevirtual   #573 <Method Intent Intent.putExtra(String, Bundle)>
	//   27   55:pop             
		return intent;
	//   28   56:aload_2         
	//   29   57:areturn         
	}

	public LoginBehavior getLoginBehavior()
	{
		return loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LoginBehavior loginBehavior>
	//    2    4:areturn         
	}

	public void logInWithPublishPermissions(Activity activity, Collection collection)
	{
		validatePublishPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #346 <Method void validatePublishPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #162 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #14  <Class LoginManager$ActivityStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #577 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	public void logInWithPublishPermissions(Fragment fragment, Collection collection)
	{
		logInWithPublishPermissions(new FragmentWrapper(fragment), collection);
	//    0    0:aload_0         
	//    1    1:new             #581 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #584 <Method void FragmentWrapper(Fragment)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #586 <Method void logInWithPublishPermissions(FragmentWrapper, Collection)>
	//    7   13:return          
	}

	public void logInWithPublishPermissions(android.support.v4.app.Fragment fragment, Collection collection)
	{
		logInWithPublishPermissions(new FragmentWrapper(fragment), collection);
	//    0    0:aload_0         
	//    1    1:new             #581 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #591 <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #586 <Method void logInWithPublishPermissions(FragmentWrapper, Collection)>
	//    7   13:return          
	}

	public void logInWithReadPermissions(Activity activity, Collection collection)
	{
		validateReadPermissions(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #358 <Method void validateReadPermissions(Collection)>
		collection = ((Collection) (createLoginRequest(collection)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #162 <Method LoginClient$Request createLoginRequest(Collection)>
	//    6   10:astore_2        
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), ((LoginClient.Request) (collection)));
	//    7   11:aload_0         
	//    8   12:new             #14  <Class LoginManager$ActivityStartActivityDelegate>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #577 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//   12   20:aload_2         
	//   13   21:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   14   24:return          
	}

	public void logInWithReadPermissions(Fragment fragment, Collection collection)
	{
		logInWithReadPermissions(new FragmentWrapper(fragment), collection);
	//    0    0:aload_0         
	//    1    1:new             #581 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #584 <Method void FragmentWrapper(Fragment)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #594 <Method void logInWithReadPermissions(FragmentWrapper, Collection)>
	//    7   13:return          
	}

	public void logInWithReadPermissions(android.support.v4.app.Fragment fragment, Collection collection)
	{
		logInWithReadPermissions(new FragmentWrapper(fragment), collection);
	//    0    0:aload_0         
	//    1    1:new             #581 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #591 <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #594 <Method void logInWithReadPermissions(FragmentWrapper, Collection)>
	//    7   13:return          
	}

	public void logOut()
	{
		AccessToken.setCurrentAccessToken(((AccessToken) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #168 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
		Profile.setCurrentProfile(((Profile) (null)));
	//    2    4:aconst_null     
	//    3    5:invokestatic    #599 <Method void Profile.setCurrentProfile(Profile)>
		setExpressLoginStatus(false);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #192 <Method void setExpressLoginStatus(boolean)>
	//    7   13:return          
	}

	boolean onActivityResult(int i, Intent intent)
	{
		return onActivityResult(i, intent, ((FacebookCallback) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #604 <Method boolean onActivityResult(int, Intent, FacebookCallback)>
	//    5    7:ireturn         
	}

	boolean onActivityResult(int i, Intent intent, FacebookCallback facebookcallback)
	{
		LoginClient.Result.Code code = LoginClient.Result.Code.ERROR;
	//    0    0:getstatic       #479 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
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
	//*  13   21:ifnull          161
		{
			obj1 = ((Object) ((LoginClient.Result)intent.getParcelableExtra("com.facebook.LoginFragment:Result")));
	//   14   24:aload_2         
	//   15   25:ldc1            #206 <String "com.facebook.LoginFragment:Result">
	//   16   27:invokevirtual   #212 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   17   30:checkcast       #214 <Class LoginClient$Result>
	//   18   33:astore          9
			if(obj1 != null)
	//*  19   35:aload           9
	//*  20   37:ifnull          140
			{
				obj2 = ((Object) (((LoginClient.Result) (obj1)).request));
	//   21   40:aload           9
	//   22   42:getfield        #607 <Field LoginClient$Request LoginClient$Result.request>
	//   23   45:astore          10
				code = ((LoginClient.Result) (obj1)).code;
	//   24   47:aload           9
	//   25   49:getfield        #610 <Field LoginClient$Result$Code LoginClient$Result.code>
	//   26   52:astore          8
				if(i == -1)
	//*  27   54:iload_1         
	//*  28   55:iconst_m1       
	//*  29   56:icmpne          102
				{
					if(((LoginClient.Result) (obj1)).code == LoginClient.Result.Code.SUCCESS)
	//*  30   59:aload           9
	//*  31   61:getfield        #610 <Field LoginClient$Result$Code LoginClient$Result.code>
	//*  32   64:getstatic       #613 <Field LoginClient$Result$Code LoginClient$Result$Code.SUCCESS>
	//*  33   67:if_acmpne       83
					{
						intent = ((Intent) (((LoginClient.Result) (obj1)).token));
	//   34   70:aload           9
	//   35   72:getfield        #617 <Field AccessToken LoginClient$Result.token>
	//   36   75:astore_2        
						obj = ((Object) (intent1));
	//   37   76:aload           7
	//   38   78:astore          6
					} else
	//*  39   80:goto            124
					{
						obj = ((Object) (new FacebookAuthorizationException(((LoginClient.Result) (obj1)).errorMessage)));
	//   40   83:new             #619 <Class FacebookAuthorizationException>
	//   41   86:dup             
	//   42   87:aload           9
	//   43   89:getfield        #622 <Field String LoginClient$Result.errorMessage>
	//   44   92:invokespecial   #623 <Method void FacebookAuthorizationException(String)>
	//   45   95:astore          6
						intent = null;
	//   46   97:aconst_null     
	//   47   98:astore_2        
					}
				} else
	//*  48   99:goto            124
				if(i == 0)
	//*  49  102:iload_1         
	//*  50  103:ifne            118
				{
					flag = true;
	//   51  106:iconst_1        
	//   52  107:istore          4
					intent = null;
	//   53  109:aconst_null     
	//   54  110:astore_2        
					obj = ((Object) (intent1));
	//   55  111:aload           7
	//   56  113:astore          6
				} else
	//*  57  115:goto            124
				{
					intent = null;
	//   58  118:aconst_null     
	//   59  119:astore_2        
					obj = ((Object) (intent1));
	//   60  120:aload           7
	//   61  122:astore          6
				}
				obj1 = ((Object) (((LoginClient.Result) (obj1)).loggingExtras));
	//   62  124:aload           9
	//   63  126:getfield        #626 <Field Map LoginClient$Result.loggingExtras>
	//   64  129:astore          9
				intent1 = intent;
	//   65  131:aload_2         
	//   66  132:astore          7
				intent = ((Intent) (obj2));
	//   67  134:aload           10
	//   68  136:astore_2        
			} else
	//*  69  137:goto            158
			{
				intent1 = null;
	//   70  140:aconst_null     
	//   71  141:astore          7
				obj1 = ((Object) (intent1));
	//   72  143:aload           7
	//   73  145:astore          9
				intent = ((Intent) (obj1));
	//   74  147:aload           9
	//   75  149:astore_2        
				flag = flag1;
	//   76  150:iload           5
	//   77  152:istore          4
				obj = obj2;
	//   78  154:aload           10
	//   79  156:astore          6
			}
		} else
	//*  80  158:goto            197
		if(i == 0)
	//*  81  161:iload_1         
	//*  82  162:ifne            185
		{
			code = LoginClient.Result.Code.CANCEL;
	//   83  165:getstatic       #629 <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
	//   84  168:astore          8
			flag = true;
	//   85  170:iconst_1        
	//   86  171:istore          4
			intent = null;
	//   87  173:aconst_null     
	//   88  174:astore_2        
			intent1 = intent;
	//   89  175:aload_2         
	//   90  176:astore          7
			obj1 = ((Object) (intent1));
	//   91  178:aload           7
	//   92  180:astore          9
		} else
	//*  93  182:goto            197
		{
			intent = null;
	//   94  185:aconst_null     
	//   95  186:astore_2        
			intent1 = intent;
	//   96  187:aload_2         
	//   97  188:astore          7
			obj1 = ((Object) (intent1));
	//   98  190:aload           7
	//   99  192:astore          9
			flag = false;
	//  100  194:iconst_0        
	//  101  195:istore          4
		}
		obj2 = obj;
	//  102  197:aload           6
	//  103  199:astore          10
		if(obj == null)
	//* 104  201:aload           6
	//* 105  203:ifnonnull       236
		{
			obj2 = obj;
	//  106  206:aload           6
	//  107  208:astore          10
			if(intent1 == null)
	//* 108  210:aload           7
	//* 109  212:ifnonnull       236
			{
				obj2 = obj;
	//  110  215:aload           6
	//  111  217:astore          10
				if(!flag)
	//* 112  219:iload           4
	//* 113  221:ifne            236
					obj2 = ((Object) (new FacebookException("Unexpected call to LoginManager.onActivityResult")));
	//  114  224:new             #271 <Class FacebookException>
	//  115  227:dup             
	//  116  228:ldc2            #631 <String "Unexpected call to LoginManager.onActivityResult">
	//  117  231:invokespecial   #278 <Method void FacebookException(String)>
	//  118  234:astore          10
			}
		}
		logCompleteLogin(((Context) (null)), code, ((Map) (obj1)), ((Exception) (obj2)), true, ((LoginClient.Request) (intent)));
	//  119  236:aload_0         
	//  120  237:aconst_null     
	//  121  238:aload           8
	//  122  240:aload           9
	//  123  242:aload           10
	//  124  244:iconst_1        
	//  125  245:aload_2         
	//  126  246:invokespecial   #481 <Method void logCompleteLogin(Context, LoginClient$Result$Code, Map, Exception, boolean, LoginClient$Request)>
		finishLogin(((AccessToken) (intent1)), ((LoginClient.Request) (intent)), ((FacebookException) (obj2)), flag, facebookcallback);
	//  127  249:aload_0         
	//  128  250:aload           7
	//  129  252:aload_2         
	//  130  253:aload           10
	//  131  255:iload           4
	//  132  257:aload_3         
	//  133  258:invokespecial   #633 <Method void finishLogin(AccessToken, LoginClient$Request, FacebookException, boolean, FacebookCallback)>
		return true;
	//  134  261:iconst_1        
	//  135  262:ireturn         
	}

	public void reauthorizeDataAccess(Activity activity)
	{
		LoginClient.Request request = createReauthorizeRequest();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #368 <Method LoginClient$Request createReauthorizeRequest()>
	//    2    4:astore_2        
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), request);
	//    3    5:aload_0         
	//    4    6:new             #14  <Class LoginManager$ActivityStartActivityDelegate>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #577 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//    8   14:aload_2         
	//    9   15:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//   10   18:return          
	}

	public void reauthorizeDataAccess(android.support.v4.app.Fragment fragment)
	{
		reauthorizeDataAccess(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #581 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #591 <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:invokespecial   #636 <Method void reauthorizeDataAccess(FragmentWrapper)>
	//    6   12:return          
	}

	public void registerCallback(CallbackManager callbackmanager, final FacebookCallback callback)
	{
		if(callbackmanager instanceof CallbackManagerImpl)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #463 <Class CallbackManagerImpl>
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
	//    4    8:checkcast       #463 <Class CallbackManagerImpl>
	//    5   11:getstatic       #455 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    6   14:invokevirtual   #458 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    7   17:new             #6   <Class LoginManager$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:invokespecial   #641 <Method void LoginManager$1(LoginManager, FacebookCallback)>
	//   12   26:invokevirtual   #643 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
			return;
	//   13   29:return          
		} else
		{
			throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
	//   14   30:new             #271 <Class FacebookException>
	//   15   33:dup             
	//   16   34:ldc2            #645 <String "Unexpected CallbackManager, please use the provided Factory.">
	//   17   37:invokespecial   #278 <Method void FacebookException(String)>
	//   18   40:athrow          
		}
	}

	public void resolveError(Activity activity, GraphResponse graphresponse)
	{
		startLogin(((StartActivityDelegate) (new ActivityStartActivityDelegate(activity))), createLoginRequestFromResponse(graphresponse));
	//    0    0:aload_0         
	//    1    1:new             #14  <Class LoginManager$ActivityStartActivityDelegate>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #577 <Method void LoginManager$ActivityStartActivityDelegate(Activity)>
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #372 <Method LoginClient$Request createLoginRequestFromResponse(GraphResponse)>
	//    8   14:invokespecial   #353 <Method void startLogin(StartActivityDelegate, LoginClient$Request)>
	//    9   17:return          
	}

	public void resolveError(Fragment fragment, GraphResponse graphresponse)
	{
		resolveError(new FragmentWrapper(fragment), graphresponse);
	//    0    0:aload_0         
	//    1    1:new             #581 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #584 <Method void FragmentWrapper(Fragment)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #650 <Method void resolveError(FragmentWrapper, GraphResponse)>
	//    7   13:return          
	}

	public void resolveError(android.support.v4.app.Fragment fragment, GraphResponse graphresponse)
	{
		resolveError(new FragmentWrapper(fragment), graphresponse);
	//    0    0:aload_0         
	//    1    1:new             #581 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #591 <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #650 <Method void resolveError(FragmentWrapper, GraphResponse)>
	//    7   13:return          
	}

	public void retrieveLoginStatus(Context context, long l, LoginStatusCallback loginstatuscallback)
	{
		retrieveLoginStatusImpl(context, loginstatuscallback, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           4
	//    3    4:lload_2         
	//    4    5:invokespecial   #655 <Method void retrieveLoginStatusImpl(Context, LoginStatusCallback, long)>
	//    5    8:return          
	}

	public void retrieveLoginStatus(Context context, LoginStatusCallback loginstatuscallback)
	{
		retrieveLoginStatus(context, 5000L, loginstatuscallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #657 <Long 5000L>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #660 <Method void retrieveLoginStatus(Context, long, LoginStatusCallback)>
	//    5    9:return          
	}

	public LoginManager setAuthType(String s)
	{
		authType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String authType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LoginManager setDefaultAudience(DefaultAudience defaultaudience)
	{
		defaultAudience = defaultaudience;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field DefaultAudience defaultAudience>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LoginManager setLoginBehavior(LoginBehavior loginbehavior)
	{
		loginBehavior = loginbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field LoginBehavior loginBehavior>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void unregisterCallback(CallbackManager callbackmanager)
	{
		if(callbackmanager instanceof CallbackManagerImpl)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #463 <Class CallbackManagerImpl>
	//*   2    4:ifeq            21
		{
			((CallbackManagerImpl)callbackmanager).unregisterCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
	//    3    7:aload_1         
	//    4    8:checkcast       #463 <Class CallbackManagerImpl>
	//    5   11:getstatic       #455 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    6   14:invokevirtual   #458 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    7   17:invokevirtual   #671 <Method void CallbackManagerImpl.unregisterCallback(int)>
			return;
	//    8   20:return          
		} else
		{
			throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
	//    9   21:new             #271 <Class FacebookException>
	//   10   24:dup             
	//   11   25:ldc2            #645 <String "Unexpected CallbackManager, please use the provided Factory.">
	//   12   28:invokespecial   #278 <Method void FacebookException(String)>
	//   13   31:athrow          
		}
	}

	private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";
	private static final String MANAGE_PERMISSION_PREFIX = "manage";
	private static final Set OTHER_PUBLISH_PERMISSIONS = getOtherPublishPermissions();
	private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";
	private static final String PUBLISH_PERMISSION_PREFIX = "publish";
	private static volatile LoginManager instance;
	private String authType;
	private DefaultAudience defaultAudience;
	private LoginBehavior loginBehavior;
	private final SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.loginManager", 0);

	static 
	{
	//    0    0:invokestatic    #52  <Method Set getOtherPublishPermissions()>
	//    1    3:putstatic       #54  <Field Set OTHER_PUBLISH_PERMISSIONS>
	//*   2    6:return          
	}


/*
	static void access$100(String s, String s1, String s2, LoginLogger loginlogger, LoginStatusCallback loginstatuscallback)
	{
		handleLoginStatusError(s, s1, s2, loginlogger, loginstatuscallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #100 <Method void handleLoginStatusError(String, String, String, LoginLogger, LoginStatusCallback)>
		return;
	//    6    9:return          
	}

*/


/*
	static Profile access$200(Bundle bundle)
	{
		return getProfileFromBundle(bundle);
	//    0    0:aload_0         
	//    1    1:invokestatic    #105 <Method Profile getProfileFromBundle(Bundle)>
	//    2    4:areturn         
	}

*/
}
