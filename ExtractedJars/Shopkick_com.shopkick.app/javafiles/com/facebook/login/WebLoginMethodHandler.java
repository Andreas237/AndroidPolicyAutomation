// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.*;
import com.facebook.internal.Utility;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, LoginClient, DefaultAudience

abstract class WebLoginMethodHandler extends LoginMethodHandler
{

	WebLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void LoginMethodHandler(Parcel)>
	//    3    5:return          
	}

	WebLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void LoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	private static final String getRedirectUri()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append("fb");
	//    4    8:aload_0         
	//    5    9:ldc1            #29  <String "fb">
	//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(FacebookSdk.getApplicationId());
	//    8   15:aload_0         
	//    9   16:invokestatic    #38  <Method String FacebookSdk.getApplicationId()>
	//   10   19:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append("://authorize");
	//   12   23:aload_0         
	//   13   24:ldc1            #40  <String "://authorize">
	//   14   26:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		return stringbuilder.toString();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   18   34:areturn         
	}

	private String loadCookieToken()
	{
		return ((Context) (loginClient.getActivity())).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #54  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    3    7:ldc1            #8   <String "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY">
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #60  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   13:ldc1            #11  <String "TOKEN">
	//    7   15:ldc1            #62  <String "">
	//    8   17:invokeinterface #68  <Method String SharedPreferences.getString(String, String)>
	//    9   22:areturn         
	}

	private void saveCookieToken(String s)
	{
		((Context) (loginClient.getActivity())).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", s).apply();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #54  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    3    7:ldc1            #8   <String "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY">
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #60  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   13:invokeinterface #74  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   18:ldc1            #11  <String "TOKEN">
	//    8   20:aload_1         
	//    9   21:invokeinterface #80  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   26:invokeinterface #83  <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   31:return          
	}

	protected Bundle addExtraParameters(Bundle bundle, LoginClient.Request request)
	{
		bundle.putString("redirect_uri", getRedirectUri());
	//    0    0:aload_1         
	//    1    1:ldc1            #87  <String "redirect_uri">
	//    2    3:invokestatic    #89  <Method String getRedirectUri()>
	//    3    6:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("client_id", request.getApplicationId());
	//    4    9:aload_1         
	//    5   10:ldc1            #96  <String "client_id">
	//    6   12:aload_2         
	//    7   13:invokevirtual   #99  <Method String LoginClient$Request.getApplicationId()>
	//    8   16:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		LoginClient loginclient = loginClient;
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field LoginClient loginClient>
	//   11   23:astore_3        
		bundle.putString("e2e", LoginClient.getE2E());
	//   12   24:aload_1         
	//   13   25:ldc1            #100 <String "e2e">
	//   14   27:invokestatic    #103 <Method String LoginClient.getE2E()>
	//   15   30:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("response_type", "token,signed_request");
	//   16   33:aload_1         
	//   17   34:ldc1            #105 <String "response_type">
	//   18   36:ldc1            #107 <String "token,signed_request">
	//   19   38:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("return_scopes", "true");
	//   20   41:aload_1         
	//   21   42:ldc1            #109 <String "return_scopes">
	//   22   44:ldc1            #111 <String "true">
	//   23   46:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("auth_type", request.getAuthType());
	//   24   49:aload_1         
	//   25   50:ldc1            #113 <String "auth_type">
	//   26   52:aload_2         
	//   27   53:invokevirtual   #116 <Method String LoginClient$Request.getAuthType()>
	//   28   56:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		if(getSSODevice() != null)
	//*  29   59:aload_0         
	//*  30   60:invokevirtual   #119 <Method String getSSODevice()>
	//*  31   63:ifnull          76
			bundle.putString("sso", getSSODevice());
	//   32   66:aload_1         
	//   33   67:ldc1            #121 <String "sso">
	//   34   69:aload_0         
	//   35   70:invokevirtual   #119 <Method String getSSODevice()>
	//   36   73:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		return bundle;
	//   37   76:aload_1         
	//   38   77:areturn         
	}

	protected Bundle getParameters(LoginClient.Request request)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #91  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void Bundle()>
	//    3    7:astore_2        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (request.getPermissions()))))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #128 <Method java.util.Set LoginClient$Request.getPermissions()>
	//*   6   12:invokestatic    #134 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*   7   15:ifne            42
		{
			String s = TextUtils.join(",", ((Iterable) (request.getPermissions())));
	//    8   18:ldc1            #136 <String ",">
	//    9   20:aload_1         
	//   10   21:invokevirtual   #128 <Method java.util.Set LoginClient$Request.getPermissions()>
	//   11   24:invokestatic    #142 <Method String TextUtils.join(CharSequence, Iterable)>
	//   12   27:astore_3        
			bundle.putString("scope", s);
	//   13   28:aload_2         
	//   14   29:ldc1            #144 <String "scope">
	//   15   31:aload_3         
	//   16   32:invokevirtual   #94  <Method void Bundle.putString(String, String)>
			addLoggingExtra("scope", ((Object) (s)));
	//   17   35:aload_0         
	//   18   36:ldc1            #144 <String "scope">
	//   19   38:aload_3         
	//   20   39:invokevirtual   #148 <Method void addLoggingExtra(String, Object)>
		}
		bundle.putString("default_audience", request.getDefaultAudience().getNativeProtocolAudience());
	//   21   42:aload_2         
	//   22   43:ldc1            #150 <String "default_audience">
	//   23   45:aload_1         
	//   24   46:invokevirtual   #154 <Method DefaultAudience LoginClient$Request.getDefaultAudience()>
	//   25   49:invokevirtual   #159 <Method String DefaultAudience.getNativeProtocolAudience()>
	//   26   52:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("state", getClientState(request.getAuthId()));
	//   27   55:aload_2         
	//   28   56:ldc1            #161 <String "state">
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #164 <Method String LoginClient$Request.getAuthId()>
	//   32   63:invokevirtual   #168 <Method String getClientState(String)>
	//   33   66:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		request = ((LoginClient.Request) (AccessToken.getCurrentAccessToken()));
	//   34   69:invokestatic    #174 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   35   72:astore_1        
		if(request != null)
	//*  36   73:aload_1         
	//*  37   74:ifnull          85
			request = ((LoginClient.Request) (((AccessToken) (request)).getToken()));
	//   38   77:aload_1         
	//   39   78:invokevirtual   #177 <Method String AccessToken.getToken()>
	//   40   81:astore_1        
		else
	//*  41   82:goto            87
			request = null;
	//   42   85:aconst_null     
	//   43   86:astore_1        
		if(request != null && ((String) (request)).equals(((Object) (loadCookieToken()))))
	//*  44   87:aload_1         
	//*  45   88:ifnull          119
	//*  46   91:aload_1         
	//*  47   92:aload_0         
	//*  48   93:invokespecial   #179 <Method String loadCookieToken()>
	//*  49   96:invokevirtual   #185 <Method boolean String.equals(Object)>
	//*  50   99:ifeq            119
		{
			bundle.putString("access_token", ((String) (request)));
	//   51  102:aload_2         
	//   52  103:ldc1            #187 <String "access_token">
	//   53  105:aload_1         
	//   54  106:invokevirtual   #94  <Method void Bundle.putString(String, String)>
			addLoggingExtra("access_token", "1");
	//   55  109:aload_0         
	//   56  110:ldc1            #187 <String "access_token">
	//   57  112:ldc1            #189 <String "1">
	//   58  114:invokevirtual   #148 <Method void addLoggingExtra(String, Object)>
			return bundle;
	//   59  117:aload_2         
	//   60  118:areturn         
		} else
		{
			Utility.clearFacebookCookies(((Context) (loginClient.getActivity())));
	//   61  119:aload_0         
	//   62  120:getfield        #48  <Field LoginClient loginClient>
	//   63  123:invokevirtual   #54  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//   64  126:invokestatic    #193 <Method void Utility.clearFacebookCookies(Context)>
			addLoggingExtra("access_token", "0");
	//   65  129:aload_0         
	//   66  130:ldc1            #187 <String "access_token">
	//   67  132:ldc1            #195 <String "0">
	//   68  134:invokevirtual   #148 <Method void addLoggingExtra(String, Object)>
			return bundle;
	//   69  137:aload_2         
	//   70  138:areturn         
		}
	}

	protected String getSSODevice()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	abstract AccessTokenSource getTokenSource();

	protected void onComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookexception)
	{
		e2e = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #203 <Field String e2e>
		if(bundle != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          101
		{
			if(bundle.containsKey("e2e"))
	//*   5    9:aload_2         
	//*   6   10:ldc1            #100 <String "e2e">
	//*   7   12:invokevirtual   #207 <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				e2e = bundle.getString("e2e");
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:ldc1            #100 <String "e2e">
	//   12   22:invokevirtual   #209 <Method String Bundle.getString(String)>
	//   13   25:putfield        #203 <Field String e2e>
			try
			{
				bundle = ((Bundle) (createAccessTokenFromWebBundle(((java.util.Collection) (request.getPermissions())), bundle, getTokenSource(), request.getApplicationId())));
	//   14   28:aload_1         
	//   15   29:invokevirtual   #128 <Method java.util.Set LoginClient$Request.getPermissions()>
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #211 <Method AccessTokenSource getTokenSource()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #99  <Method String LoginClient$Request.getApplicationId()>
	//   21   41:invokestatic    #215 <Method AccessToken createAccessTokenFromWebBundle(java.util.Collection, Bundle, AccessTokenSource, String)>
	//   22   44:astore_2        
				request = ((LoginClient.Request) (LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), ((AccessToken) (bundle)))));
	//   23   45:aload_0         
	//   24   46:getfield        #48  <Field LoginClient loginClient>
	//   25   49:invokevirtual   #219 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   26   52:aload_2         
	//   27   53:invokestatic    #225 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, AccessToken)>
	//   28   56:astore_1        
				CookieSyncManager.createInstance(((Context) (loginClient.getActivity()))).sync();
	//   29   57:aload_0         
	//   30   58:getfield        #48  <Field LoginClient loginClient>
	//   31   61:invokevirtual   #54  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//   32   64:invokestatic    #231 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//   33   67:invokevirtual   #234 <Method void CookieSyncManager.sync()>
				saveCookieToken(((AccessToken) (bundle)).getToken());
	//   34   70:aload_0         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #177 <Method String AccessToken.getToken()>
	//   37   75:invokespecial   #236 <Method void saveCookieToken(String)>
			}
	//*  38   78:goto            197
			// Misplaced declaration of an exception variable
			catch(LoginClient.Request request)
	//*  39   81:astore_1        
			{
				request = ((LoginClient.Request) (LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), ((String) (null)), ((FacebookException) (request)).getMessage())));
	//   40   82:aload_0         
	//   41   83:getfield        #48  <Field LoginClient loginClient>
	//   42   86:invokevirtual   #219 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   43   89:aconst_null     
	//   44   90:aload_1         
	//   45   91:invokevirtual   #239 <Method String FacebookException.getMessage()>
	//   46   94:invokestatic    #243 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   47   97:astore_1        
			}
		} else
	//*  48   98:goto            197
		if(facebookexception instanceof FacebookOperationCanceledException)
	//*  49  101:aload_3         
	//*  50  102:instanceof      #245 <Class FacebookOperationCanceledException>
	//*  51  105:ifeq            124
		{
			request = ((LoginClient.Request) (LoginClient.Result.createCancelResult(loginClient.getPendingRequest(), "User canceled log in.")));
	//   52  108:aload_0         
	//   53  109:getfield        #48  <Field LoginClient loginClient>
	//   54  112:invokevirtual   #219 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   55  115:ldc1            #247 <String "User canceled log in.">
	//   56  117:invokestatic    #251 <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//   57  120:astore_1        
		} else
	//*  58  121:goto            197
		{
			e2e = null;
	//   59  124:aload_0         
	//   60  125:aconst_null     
	//   61  126:putfield        #203 <Field String e2e>
			request = ((LoginClient.Request) (facebookexception.getMessage()));
	//   62  129:aload_3         
	//   63  130:invokevirtual   #239 <Method String FacebookException.getMessage()>
	//   64  133:astore_1        
			if(facebookexception instanceof FacebookServiceException)
	//*  65  134:aload_3         
	//*  66  135:instanceof      #253 <Class FacebookServiceException>
	//*  67  138:ifeq            181
			{
				request = ((LoginClient.Request) (((FacebookServiceException)facebookexception).getRequestError()));
	//   68  141:aload_3         
	//   69  142:checkcast       #253 <Class FacebookServiceException>
	//   70  145:invokevirtual   #257 <Method FacebookRequestError FacebookServiceException.getRequestError()>
	//   71  148:astore_1        
				bundle = ((Bundle) (String.format(Locale.ROOT, "%d", new Object[] {
					Integer.valueOf(((FacebookRequestError) (request)).getErrorCode())
				})));
	//   72  149:getstatic       #263 <Field Locale Locale.ROOT>
	//   73  152:ldc2            #265 <String "%d">
	//   74  155:iconst_1        
	//   75  156:anewarray       Object[]
	//   76  159:dup             
	//   77  160:iconst_0        
	//   78  161:aload_1         
	//   79  162:invokevirtual   #273 <Method int FacebookRequestError.getErrorCode()>
	//   80  165:invokestatic    #279 <Method Integer Integer.valueOf(int)>
	//   81  168:aastore         
	//   82  169:invokestatic    #283 <Method String String.format(Locale, String, Object[])>
	//   83  172:astore_2        
				request = ((LoginClient.Request) (((FacebookRequestError) (request)).toString()));
	//   84  173:aload_1         
	//   85  174:invokevirtual   #284 <Method String FacebookRequestError.toString()>
	//   86  177:astore_1        
			} else
	//*  87  178:goto            183
			{
				bundle = null;
	//   88  181:aconst_null     
	//   89  182:astore_2        
			}
			request = ((LoginClient.Request) (LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), ((String) (null)), ((String) (request)), ((String) (bundle)))));
	//   90  183:aload_0         
	//   91  184:getfield        #48  <Field LoginClient loginClient>
	//   92  187:invokevirtual   #219 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   93  190:aconst_null     
	//   94  191:aload_1         
	//   95  192:aload_2         
	//   96  193:invokestatic    #287 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String, String)>
	//   97  196:astore_1        
		}
		if(!Utility.isNullOrEmpty(e2e))
	//*  98  197:aload_0         
	//*  99  198:getfield        #203 <Field String e2e>
	//* 100  201:invokestatic    #289 <Method boolean Utility.isNullOrEmpty(String)>
	//* 101  204:ifne            215
			logWebLoginCompleted(e2e);
	//  102  207:aload_0         
	//  103  208:aload_0         
	//  104  209:getfield        #203 <Field String e2e>
	//  105  212:invokevirtual   #292 <Method void logWebLoginCompleted(String)>
		loginClient.completeAndValidate(((LoginClient.Result) (request)));
	//  106  215:aload_0         
	//  107  216:getfield        #48  <Field LoginClient loginClient>
	//  108  219:aload_1         
	//  109  220:invokevirtual   #296 <Method void LoginClient.completeAndValidate(LoginClient$Result)>
	//  110  223:return          
	}

	private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
	private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
	private String e2e;
}
