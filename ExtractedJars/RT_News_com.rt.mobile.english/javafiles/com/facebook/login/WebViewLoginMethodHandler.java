// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.*;
import com.facebook.internal.*;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, LoginClient, DefaultAudience

class WebViewLoginMethodHandler extends LoginMethodHandler
{
	static class AuthDialogBuilder extends com.facebook.internal.WebDialog.Builder
	{

		public WebDialog build()
		{
			Bundle bundle = getParameters();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #29  <Method Bundle getParameters()>
		//    2    4:astore_1        
			bundle.putString("redirect_uri", "fbconnect://success");
		//    3    5:aload_1         
		//    4    6:ldc1            #31  <String "redirect_uri">
		//    5    8:ldc1            #14  <String "fbconnect://success">
		//    6   10:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("client_id", getApplicationId());
		//    7   13:aload_1         
		//    8   14:ldc1            #39  <String "client_id">
		//    9   16:aload_0         
		//   10   17:invokevirtual   #43  <Method String getApplicationId()>
		//   11   20:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("e2e", e2e);
		//   12   23:aload_1         
		//   13   24:ldc1            #44  <String "e2e">
		//   14   26:aload_0         
		//   15   27:getfield        #46  <Field String e2e>
		//   16   30:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("response_type", "token,signed_request");
		//   17   33:aload_1         
		//   18   34:ldc1            #48  <String "response_type">
		//   19   36:ldc1            #50  <String "token,signed_request">
		//   20   38:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("return_scopes", "true");
		//   21   41:aload_1         
		//   22   42:ldc1            #52  <String "return_scopes">
		//   23   44:ldc1            #54  <String "true">
		//   24   46:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			if(isRerequest)
		//*  25   49:aload_0         
		//*  26   50:getfield        #56  <Field boolean isRerequest>
		//*  27   53:ifeq            64
				bundle.putString("auth_type", "rerequest");
		//   28   56:aload_1         
		//   29   57:ldc1            #58  <String "auth_type">
		//   30   59:ldc1            #60  <String "rerequest">
		//   31   61:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			return new WebDialog(getContext(), "oauth", bundle, getTheme(), getListener());
		//   32   64:new             #62  <Class WebDialog>
		//   33   67:dup             
		//   34   68:aload_0         
		//   35   69:invokevirtual   #66  <Method Context getContext()>
		//   36   72:ldc1            #11  <String "oauth">
		//   37   74:aload_1         
		//   38   75:aload_0         
		//   39   76:invokevirtual   #70  <Method int getTheme()>
		//   40   79:aload_0         
		//   41   80:invokevirtual   #74  <Method com.facebook.internal.WebDialog$OnCompleteListener getListener()>
		//   42   83:invokespecial   #77  <Method void WebDialog(Context, String, Bundle, int, com.facebook.internal.WebDialog$OnCompleteListener)>
		//   43   86:areturn         
		}

		public AuthDialogBuilder setE2E(String s)
		{
			e2e = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field String e2e>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public AuthDialogBuilder setIsRerequest(boolean flag)
		{
			isRerequest = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #56  <Field boolean isRerequest>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private static final String OAUTH_DIALOG = "oauth";
		static final String REDIRECT_URI = "fbconnect://success";
		private String e2e;
		private boolean isRerequest;

		public AuthDialogBuilder(Context context, String s, Bundle bundle)
		{
			super(context, s, "oauth", bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #11  <String "oauth">
		//    4    5:aload_3         
		//    5    6:invokespecial   #22  <Method void com.facebook.internal.WebDialog$Builder(Context, String, String, Bundle)>
		//    6    9:return          
		}
	}


	WebViewLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void LoginMethodHandler(Parcel)>
		e2e = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #41  <Method String Parcel.readString()>
	//    6   10:putfield        #43  <Field String e2e>
	//    7   13:return          
	}

	WebViewLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void LoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	private String loadCookieToken()
	{
		return ((Context) (loginClient.getActivity())).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #57  <Method FragmentActivity LoginClient.getActivity()>
	//    3    7:ldc1            #18  <String "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY">
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #63  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   13:ldc1            #21  <String "TOKEN">
	//    7   15:ldc1            #65  <String "">
	//    8   17:invokeinterface #71  <Method String SharedPreferences.getString(String, String)>
	//    9   22:areturn         
	}

	private void saveCookieToken(String s)
	{
		((Context) (loginClient.getActivity())).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", s).apply();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #57  <Method FragmentActivity LoginClient.getActivity()>
	//    3    7:ldc1            #18  <String "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY">
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #63  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   13:invokeinterface #77  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   18:ldc1            #21  <String "TOKEN">
	//    8   20:aload_1         
	//    9   21:invokeinterface #83  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   26:invokeinterface #86  <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   31:return          
	}

	void cancel()
	{
		if(loginDialog != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field WebDialog loginDialog>
	//*   2    4:ifnull          19
		{
			loginDialog.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field WebDialog loginDialog>
	//    5   11:invokevirtual   #93  <Method void WebDialog.cancel()>
			loginDialog = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #89  <Field WebDialog loginDialog>
		}
	//    9   19:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getNameForLogging()
	{
		return "web_view";
	//    0    0:ldc1            #98  <String "web_view">
	//    1    2:areturn         
	}

	boolean needsInternetPermission()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void onWebDialogComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookexception)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          95
		{
			if(bundle.containsKey("e2e"))
	//*   2    4:aload_2         
	//*   3    5:ldc1            #105 <String "e2e">
	//*   4    7:invokevirtual   #111 <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifeq            23
				e2e = bundle.getString("e2e");
	//    6   13:aload_0         
	//    7   14:aload_2         
	//    8   15:ldc1            #105 <String "e2e">
	//    9   17:invokevirtual   #114 <Method String Bundle.getString(String)>
	//   10   20:putfield        #43  <Field String e2e>
			try
			{
				bundle = ((Bundle) (createAccessTokenFromWebBundle(((java.util.Collection) (request.getPermissions())), bundle, AccessTokenSource.WEB_VIEW, request.getApplicationId())));
	//   11   23:aload_1         
	//   12   24:invokevirtual   #120 <Method java.util.Set LoginClient$Request.getPermissions()>
	//   13   27:aload_2         
	//   14   28:getstatic       #126 <Field AccessTokenSource AccessTokenSource.WEB_VIEW>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #129 <Method String LoginClient$Request.getApplicationId()>
	//   17   35:invokestatic    #133 <Method AccessToken createAccessTokenFromWebBundle(java.util.Collection, Bundle, AccessTokenSource, String)>
	//   18   38:astore_2        
				request = ((LoginClient.Request) (LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), ((AccessToken) (bundle)))));
	//   19   39:aload_0         
	//   20   40:getfield        #51  <Field LoginClient loginClient>
	//   21   43:invokevirtual   #137 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   22   46:aload_2         
	//   23   47:invokestatic    #143 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, AccessToken)>
	//   24   50:astore_1        
				CookieSyncManager.createInstance(((Context) (loginClient.getActivity()))).sync();
	//   25   51:aload_0         
	//   26   52:getfield        #51  <Field LoginClient loginClient>
	//   27   55:invokevirtual   #57  <Method FragmentActivity LoginClient.getActivity()>
	//   28   58:invokestatic    #149 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//   29   61:invokevirtual   #152 <Method void CookieSyncManager.sync()>
				saveCookieToken(((AccessToken) (bundle)).getToken());
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:invokevirtual   #157 <Method String AccessToken.getToken()>
	//   33   69:invokespecial   #159 <Method void saveCookieToken(String)>
			}
	//*  34   72:goto            190
			// Misplaced declaration of an exception variable
			catch(LoginClient.Request request)
	//*  35   75:astore_1        
			{
				request = ((LoginClient.Request) (LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), ((String) (null)), ((FacebookException) (request)).getMessage())));
	//   36   76:aload_0         
	//   37   77:getfield        #51  <Field LoginClient loginClient>
	//   38   80:invokevirtual   #137 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   39   83:aconst_null     
	//   40   84:aload_1         
	//   41   85:invokevirtual   #162 <Method String FacebookException.getMessage()>
	//   42   88:invokestatic    #166 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   43   91:astore_1        
			}
		} else
	//*  44   92:goto            190
		if(facebookexception instanceof FacebookOperationCanceledException)
	//*  45   95:aload_3         
	//*  46   96:instanceof      #168 <Class FacebookOperationCanceledException>
	//*  47   99:ifeq            118
		{
			request = ((LoginClient.Request) (LoginClient.Result.createCancelResult(loginClient.getPendingRequest(), "User canceled log in.")));
	//   48  102:aload_0         
	//   49  103:getfield        #51  <Field LoginClient loginClient>
	//   50  106:invokevirtual   #137 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   51  109:ldc1            #170 <String "User canceled log in.">
	//   52  111:invokestatic    #174 <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//   53  114:astore_1        
		} else
	//*  54  115:goto            190
		{
			e2e = null;
	//   55  118:aload_0         
	//   56  119:aconst_null     
	//   57  120:putfield        #43  <Field String e2e>
			request = ((LoginClient.Request) (facebookexception.getMessage()));
	//   58  123:aload_3         
	//   59  124:invokevirtual   #162 <Method String FacebookException.getMessage()>
	//   60  127:astore_1        
			if(facebookexception instanceof FacebookServiceException)
	//*  61  128:aload_3         
	//*  62  129:instanceof      #176 <Class FacebookServiceException>
	//*  63  132:ifeq            174
			{
				request = ((LoginClient.Request) (((FacebookServiceException)facebookexception).getRequestError()));
	//   64  135:aload_3         
	//   65  136:checkcast       #176 <Class FacebookServiceException>
	//   66  139:invokevirtual   #180 <Method FacebookRequestError FacebookServiceException.getRequestError()>
	//   67  142:astore_1        
				bundle = ((Bundle) (String.format(Locale.ROOT, "%d", new Object[] {
					Integer.valueOf(((FacebookRequestError) (request)).getErrorCode())
				})));
	//   68  143:getstatic       #186 <Field Locale Locale.ROOT>
	//   69  146:ldc1            #188 <String "%d">
	//   70  148:iconst_1        
	//   71  149:anewarray       Object[]
	//   72  152:dup             
	//   73  153:iconst_0        
	//   74  154:aload_1         
	//   75  155:invokevirtual   #195 <Method int FacebookRequestError.getErrorCode()>
	//   76  158:invokestatic    #201 <Method Integer Integer.valueOf(int)>
	//   77  161:aastore         
	//   78  162:invokestatic    #207 <Method String String.format(Locale, String, Object[])>
	//   79  165:astore_2        
				request = ((LoginClient.Request) (((FacebookRequestError) (request)).toString()));
	//   80  166:aload_1         
	//   81  167:invokevirtual   #210 <Method String FacebookRequestError.toString()>
	//   82  170:astore_1        
			} else
	//*  83  171:goto            176
			{
				bundle = null;
	//   84  174:aconst_null     
	//   85  175:astore_2        
			}
			request = ((LoginClient.Request) (LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), ((String) (null)), ((String) (request)), ((String) (bundle)))));
	//   86  176:aload_0         
	//   87  177:getfield        #51  <Field LoginClient loginClient>
	//   88  180:invokevirtual   #137 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   89  183:aconst_null     
	//   90  184:aload_1         
	//   91  185:aload_2         
	//   92  186:invokestatic    #213 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String, String)>
	//   93  189:astore_1        
		}
		if(!Utility.isNullOrEmpty(e2e))
	//*  94  190:aload_0         
	//*  95  191:getfield        #43  <Field String e2e>
	//*  96  194:invokestatic    #218 <Method boolean Utility.isNullOrEmpty(String)>
	//*  97  197:ifne            208
			logWebLoginCompleted(e2e);
	//   98  200:aload_0         
	//   99  201:aload_0         
	//  100  202:getfield        #43  <Field String e2e>
	//  101  205:invokevirtual   #221 <Method void logWebLoginCompleted(String)>
		loginClient.completeAndValidate(((LoginClient.Result) (request)));
	//  102  208:aload_0         
	//  103  209:getfield        #51  <Field LoginClient loginClient>
	//  104  212:aload_1         
	//  105  213:invokevirtual   #225 <Method void LoginClient.completeAndValidate(LoginClient$Result)>
	//  106  216:return          
	}

	boolean tryAuthorize(final LoginClient.Request request)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #107 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void Bundle()>
	//    3    7:astore_3        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (request.getPermissions()))))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #120 <Method java.util.Set LoginClient$Request.getPermissions()>
	//*   6   12:invokestatic    #231 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*   7   15:ifne            42
		{
			String s = TextUtils.join(",", ((Iterable) (request.getPermissions())));
	//    8   18:ldc1            #233 <String ",">
	//    9   20:aload_1         
	//   10   21:invokevirtual   #120 <Method java.util.Set LoginClient$Request.getPermissions()>
	//   11   24:invokestatic    #239 <Method String TextUtils.join(CharSequence, Iterable)>
	//   12   27:astore_2        
			bundle.putString("scope", s);
	//   13   28:aload_3         
	//   14   29:ldc1            #241 <String "scope">
	//   15   31:aload_2         
	//   16   32:invokevirtual   #244 <Method void Bundle.putString(String, String)>
			addLoggingExtra("scope", ((Object) (s)));
	//   17   35:aload_0         
	//   18   36:ldc1            #241 <String "scope">
	//   19   38:aload_2         
	//   20   39:invokevirtual   #248 <Method void addLoggingExtra(String, Object)>
		}
		bundle.putString("default_audience", request.getDefaultAudience().getNativeProtocolAudience());
	//   21   42:aload_3         
	//   22   43:ldc1            #250 <String "default_audience">
	//   23   45:aload_1         
	//   24   46:invokevirtual   #254 <Method DefaultAudience LoginClient$Request.getDefaultAudience()>
	//   25   49:invokevirtual   #259 <Method String DefaultAudience.getNativeProtocolAudience()>
	//   26   52:invokevirtual   #244 <Method void Bundle.putString(String, String)>
		Object obj = ((Object) (AccessToken.getCurrentAccessToken()));
	//   27   55:invokestatic    #263 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   28   58:astore_2        
		if(obj != null)
	//*  29   59:aload_2         
	//*  30   60:ifnull          71
			obj = ((Object) (((AccessToken) (obj)).getToken()));
	//   31   63:aload_2         
	//   32   64:invokevirtual   #157 <Method String AccessToken.getToken()>
	//   33   67:astore_2        
		else
	//*  34   68:goto            73
			obj = null;
	//   35   71:aconst_null     
	//   36   72:astore_2        
		if(obj != null && ((String) (obj)).equals(((Object) (loadCookieToken()))))
	//*  37   73:aload_2         
	//*  38   74:ifnull          109
	//*  39   77:aload_2         
	//*  40   78:aload_0         
	//*  41   79:invokespecial   #265 <Method String loadCookieToken()>
	//*  42   82:invokevirtual   #269 <Method boolean String.equals(Object)>
	//*  43   85:ifeq            109
		{
			bundle.putString("access_token", ((String) (obj)));
	//   44   88:aload_3         
	//   45   89:ldc2            #271 <String "access_token">
	//   46   92:aload_2         
	//   47   93:invokevirtual   #244 <Method void Bundle.putString(String, String)>
			addLoggingExtra("access_token", "1");
	//   48   96:aload_0         
	//   49   97:ldc2            #271 <String "access_token">
	//   50  100:ldc2            #273 <String "1">
	//   51  103:invokevirtual   #248 <Method void addLoggingExtra(String, Object)>
		} else
	//*  52  106:goto            129
		{
			Utility.clearFacebookCookies(((Context) (loginClient.getActivity())));
	//   53  109:aload_0         
	//   54  110:getfield        #51  <Field LoginClient loginClient>
	//   55  113:invokevirtual   #57  <Method FragmentActivity LoginClient.getActivity()>
	//   56  116:invokestatic    #277 <Method void Utility.clearFacebookCookies(Context)>
			addLoggingExtra("access_token", "0");
	//   57  119:aload_0         
	//   58  120:ldc2            #271 <String "access_token">
	//   59  123:ldc2            #279 <String "0">
	//   60  126:invokevirtual   #248 <Method void addLoggingExtra(String, Object)>
		}
		com.facebook.internal.WebDialog.OnCompleteListener oncompletelistener = new com.facebook.internal.WebDialog.OnCompleteListener() {

			public void onComplete(Bundle bundle1, FacebookException facebookexception)
			{
				onWebDialogComplete(request, bundle1, facebookexception);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field WebViewLoginMethodHandler this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field LoginClient$Request val$request>
			//    4    8:aload_1         
			//    5    9:aload_2         
			//    6   10:invokevirtual   #31  <Method void WebViewLoginMethodHandler.onWebDialogComplete(LoginClient$Request, Bundle, FacebookException)>
			//    7   13:return          
			}

			final WebViewLoginMethodHandler this$0;
			final LoginClient.Request val$request;

			
			{
				this$0 = WebViewLoginMethodHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field WebViewLoginMethodHandler this$0>
				request = request1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LoginClient$Request val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   61  129:new             #6   <Class WebViewLoginMethodHandler$1>
	//   62  132:dup             
	//   63  133:aload_0         
	//   64  134:aload_1         
	//   65  135:invokespecial   #282 <Method void WebViewLoginMethodHandler$1(WebViewLoginMethodHandler, LoginClient$Request)>
	//   66  138:astore          4
		e2e = LoginClient.getE2E();
	//   67  140:aload_0         
	//   68  141:invokestatic    #285 <Method String LoginClient.getE2E()>
	//   69  144:putfield        #43  <Field String e2e>
		addLoggingExtra("e2e", ((Object) (e2e)));
	//   70  147:aload_0         
	//   71  148:ldc1            #105 <String "e2e">
	//   72  150:aload_0         
	//   73  151:getfield        #43  <Field String e2e>
	//   74  154:invokevirtual   #248 <Method void addLoggingExtra(String, Object)>
		obj = ((Object) (loginClient.getActivity()));
	//   75  157:aload_0         
	//   76  158:getfield        #51  <Field LoginClient loginClient>
	//   77  161:invokevirtual   #57  <Method FragmentActivity LoginClient.getActivity()>
	//   78  164:astore_2        
		loginDialog = (new AuthDialogBuilder(((Context) (obj)), request.getApplicationId(), bundle)).setE2E(e2e).setIsRerequest(request.isRerequest()).setOnCompleteListener(oncompletelistener).setTheme(FacebookSdk.getWebDialogTheme()).build();
	//   79  165:aload_0         
	//   80  166:new             #10  <Class WebViewLoginMethodHandler$AuthDialogBuilder>
	//   81  169:dup             
	//   82  170:aload_2         
	//   83  171:aload_1         
	//   84  172:invokevirtual   #129 <Method String LoginClient$Request.getApplicationId()>
	//   85  175:aload_3         
	//   86  176:invokespecial   #288 <Method void WebViewLoginMethodHandler$AuthDialogBuilder(Context, String, Bundle)>
	//   87  179:aload_0         
	//   88  180:getfield        #43  <Field String e2e>
	//   89  183:invokevirtual   #292 <Method WebViewLoginMethodHandler$AuthDialogBuilder WebViewLoginMethodHandler$AuthDialogBuilder.setE2E(String)>
	//   90  186:aload_1         
	//   91  187:invokevirtual   #295 <Method boolean LoginClient$Request.isRerequest()>
	//   92  190:invokevirtual   #299 <Method WebViewLoginMethodHandler$AuthDialogBuilder WebViewLoginMethodHandler$AuthDialogBuilder.setIsRerequest(boolean)>
	//   93  193:aload           4
	//   94  195:invokevirtual   #303 <Method com.facebook.internal.WebDialog$Builder WebViewLoginMethodHandler$AuthDialogBuilder.setOnCompleteListener(com.facebook.internal.WebDialog$OnCompleteListener)>
	//   95  198:invokestatic    #308 <Method int FacebookSdk.getWebDialogTheme()>
	//   96  201:invokevirtual   #314 <Method com.facebook.internal.WebDialog$Builder com.facebook.internal.WebDialog$Builder.setTheme(int)>
	//   97  204:invokevirtual   #318 <Method WebDialog com.facebook.internal.WebDialog$Builder.build()>
	//   98  207:putfield        #89  <Field WebDialog loginDialog>
		request = ((LoginClient.Request) (new FacebookDialogFragment()));
	//   99  210:new             #320 <Class FacebookDialogFragment>
	//  100  213:dup             
	//  101  214:invokespecial   #321 <Method void FacebookDialogFragment()>
	//  102  217:astore_1        
		((FacebookDialogFragment) (request)).setRetainInstance(true);
	//  103  218:aload_1         
	//  104  219:iconst_1        
	//  105  220:invokevirtual   #325 <Method void FacebookDialogFragment.setRetainInstance(boolean)>
		((FacebookDialogFragment) (request)).setDialog(((android.app.Dialog) (loginDialog)));
	//  106  223:aload_1         
	//  107  224:aload_0         
	//  108  225:getfield        #89  <Field WebDialog loginDialog>
	//  109  228:invokevirtual   #329 <Method void FacebookDialogFragment.setDialog(android.app.Dialog)>
		((FacebookDialogFragment) (request)).show(((FragmentActivity) (obj)).getSupportFragmentManager(), "FacebookDialogFragment");
	//  110  231:aload_1         
	//  111  232:aload_2         
	//  112  233:invokevirtual   #335 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//  113  236:ldc2            #337 <String "FacebookDialogFragment">
	//  114  239:invokevirtual   #341 <Method void FacebookDialogFragment.show(android.support.v4.app.FragmentManager, String)>
		return true;
	//  115  242:iconst_1        
	//  116  243:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #345 <Method void LoginMethodHandler.writeToParcel(Parcel, int)>
		parcel.writeString(e2e);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #43  <Field String e2e>
	//    7   11:invokevirtual   #348 <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public WebViewLoginMethodHandler createFromParcel(Parcel parcel)
		{
			return new WebViewLoginMethodHandler(parcel);
		//    0    0:new             #8   <Class WebViewLoginMethodHandler>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #18  <Method void WebViewLoginMethodHandler(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method WebViewLoginMethodHandler createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public WebViewLoginMethodHandler[] newArray(int i)
		{
			return new WebViewLoginMethodHandler[i];
		//    0    0:iload_1         
		//    1    1:anewarray       WebViewLoginMethodHandler[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method WebViewLoginMethodHandler[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
	private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
	private String e2e;
	private WebDialog loginDialog;

	static 
	{
	//    0    0:new             #8   <Class WebViewLoginMethodHandler$2>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void WebViewLoginMethodHandler$2()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
