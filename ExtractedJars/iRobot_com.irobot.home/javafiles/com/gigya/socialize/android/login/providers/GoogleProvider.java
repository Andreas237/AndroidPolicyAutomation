// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.*;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.*;
import java.util.*;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			LoginProvider

public class GoogleProvider extends LoginProvider
{

	public GoogleProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void LoginProvider()>
	//    2    4:return          
	}

	private GoogleApiClient buildGoogleApiClient(GSObject gsobject, final Boolean silent, final LoginProvider.ProviderCallback callback)
	{
		silent = ((Boolean) (new com.google.android.gms.common.api.GoogleApiClient.Builder(GSAPI.getInstance().getContext(), new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks() {

			public void onConnected(Bundle bundle)
			{
				googleAccountSignIn(silent, callback);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field GoogleProvider this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field Boolean val$silent>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
			//    6   12:invokestatic    #34  <Method void GoogleProvider.access$300(GoogleProvider, Boolean, LoginProvider$ProviderCallback)>
			//    7   15:return          
			}

			public void onConnectionSuspended(int i)
			{
			//    0    0:return          
			}

			final GoogleProvider this$0;
			final LoginProvider.ProviderCallback val$callback;
			final Boolean val$silent;

			
			{
				this$0 = GoogleProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GoogleProvider this$0>
				silent = boolean1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Boolean val$silent>
				callback = providercallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
, new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener() {

			public void onConnectionFailed(ConnectionResult connectionresult)
			{
				if(!silent.booleanValue())
			//*   0    0:aload_0         
			//*   1    1:getfield        #23  <Field Boolean val$silent>
			//*   2    4:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
			//*   3    7:ifne            23
				{
					tryResolveConnectionFailed(connectionresult, callback);
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field GoogleProvider this$0>
			//    6   14:aload_1         
			//    7   15:aload_0         
			//    8   16:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
			//    9   19:invokestatic    #41  <Method void GoogleProvider.access$400(GoogleProvider, ConnectionResult, LoginProvider$ProviderCallback)>
					return;
			//   10   22:return          
				} else
				{
					connectionresult = ((ConnectionResult) (new GSObject()));
			//   11   23:new             #43  <Class GSObject>
			//   12   26:dup             
			//   13   27:invokespecial   #44  <Method void GSObject()>
			//   14   30:astore_1        
					((GSObject) (connectionresult)).put("errorCode", 0x62644);
			//   15   31:aload_1         
			//   16   32:ldc1            #46  <String "errorCode">
			//   17   34:ldc1            #47  <Int 0x62644>
			//   18   36:invokevirtual   #51  <Method void GSObject.put(String, int)>
					((GSObject) (connectionresult)).put("errorMessage", "Login failed - user has not authorized Google+ app.");
			//   19   39:aload_1         
			//   20   40:ldc1            #53  <String "errorMessage">
			//   21   42:ldc1            #55  <String "Login failed - user has not authorized Google+ app.">
			//   22   44:invokevirtual   #58  <Method void GSObject.put(String, String)>
					fail(callback, ((GSObject) (connectionresult)));
			//   23   47:aload_0         
			//   24   48:getfield        #21  <Field GoogleProvider this$0>
			//   25   51:aload_0         
			//   26   52:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
			//   27   55:aload_1         
			//   28   56:invokevirtual   #62  <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, GSObject)>
					return;
			//   29   59:return          
				}
			}

			final GoogleProvider this$0;
			final LoginProvider.ProviderCallback val$callback;
			final Boolean val$silent;

			
			{
				this$0 = GoogleProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GoogleProvider this$0>
				silent = boolean1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Boolean val$silent>
				callback = providercallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #59  <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//    1    3:dup             
	//    2    4:invokestatic    #65  <Method GSAPI GSAPI.getInstance()>
	//    3    7:invokevirtual   #69  <Method android.content.Context GSAPI.getContext()>
	//    4   10:new             #8   <Class GoogleProvider$2>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokespecial   #71  <Method void GoogleProvider$2(GoogleProvider, Boolean, LoginProvider$ProviderCallback)>
	//   10   20:new             #10  <Class GoogleProvider$3>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:invokespecial   #72  <Method void GoogleProvider$3(GoogleProvider, Boolean, LoginProvider$ProviderCallback)>
	//   16   30:invokespecial   #75  <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(android.content.Context, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   17   33:astore_2        
		callback = ((LoginProvider.ProviderCallback) ((new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)).requestEmail()));
	//   18   34:new             #77  <Class com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder>
	//   19   37:dup             
	//   20   38:getstatic       #83  <Field GoogleSignInOptions GoogleSignInOptions.DEFAULT_SIGN_IN>
	//   21   41:invokespecial   #86  <Method void com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder(GoogleSignInOptions)>
	//   22   44:invokevirtual   #90  <Method com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder.requestEmail()>
	//   23   47:astore_3        
		for(gsobject = ((GSObject) (getScopes(gsobject).iterator())); ((Iterator) (gsobject)).hasNext(); ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) (callback)).requestScopes(new Scope(((String)((Iterator) (gsobject)).next()).trim()), new Scope[0]));
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokespecial   #94  <Method List getScopes(GSObject)>
	//   27   53:invokeinterface #100 <Method Iterator List.iterator()>
	//   28   58:astore_1        
	//   29   59:aload_1         
	//   30   60:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//   31   65:ifeq            99
	//   32   68:aload_3         
	//   33   69:new             #108 <Class Scope>
	//   34   72:dup             
	//   35   73:aload_1         
	//   36   74:invokeinterface #112 <Method Object Iterator.next()>
	//   37   79:checkcast       #114 <Class String>
	//   38   82:invokevirtual   #118 <Method String String.trim()>
	//   39   85:invokespecial   #121 <Method void Scope(String)>
	//   40   88:iconst_0        
	//   41   89:anewarray       Scope[]
	//   42   92:invokevirtual   #125 <Method com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder.requestScopes(Scope, Scope[])>
	//   43   95:pop             
	//*  44   96:goto            59
		((com.google.android.gms.common.api.GoogleApiClient.Builder) (silent)).addApi(Auth.GOOGLE_SIGN_IN_API, ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) (((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) (callback)).build())));
	//   45   99:aload_2         
	//   46  100:getstatic       #131 <Field com.google.android.gms.common.api.Api Auth.GOOGLE_SIGN_IN_API>
	//   47  103:aload_3         
	//   48  104:invokevirtual   #135 <Method GoogleSignInOptions com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder.build()>
	//   49  107:invokevirtual   #139 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addApi(com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions$HasOptions)>
	//   50  110:pop             
		return ((com.google.android.gms.common.api.GoogleApiClient.Builder) (silent)).build();
	//   51  111:aload_2         
	//   52  112:invokevirtual   #142 <Method GoogleApiClient com.google.android.gms.common.api.GoogleApiClient$Builder.build()>
	//   53  115:areturn         
	}

	private void getGoogleAuthTokenFromResult(GoogleSignInResult googlesigninresult, Boolean boolean1, LoginProvider.ProviderCallback providercallback)
	{
		if(googlesigninresult == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			fail(providercallback, "missing google sign in result");
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:ldc1            #144 <String "missing google sign in result">
	//    5    8:invokevirtual   #148 <Method void fail(LoginProvider$ProviderCallback, String)>
			return;
	//    6   11:return          
		}
		if(!googlesigninresult.isSuccess())
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #153 <Method boolean GoogleSignInResult.isSuccess()>
	//*   9   16:ifne            75
		{
			if(!boolean1.booleanValue())
	//*  10   19:aload_2         
	//*  11   20:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//*  12   23:ifne            31
			{
				startSignInActivity();
	//   13   26:aload_0         
	//   14   27:invokespecial   #161 <Method void startSignInActivity()>
				return;
	//   15   30:return          
			} else
			{
				boolean1 = ((Boolean) (new GSObject()));
	//   16   31:new             #163 <Class GSObject>
	//   17   34:dup             
	//   18   35:invokespecial   #164 <Method void GSObject()>
	//   19   38:astore_2        
				((GSObject) (boolean1)).put("errorCode", 0x7a137);
	//   20   39:aload_2         
	//   21   40:ldc1            #166 <String "errorCode">
	//   22   42:ldc1            #167 <Int 0x7a137>
	//   23   44:invokevirtual   #171 <Method void GSObject.put(String, int)>
				((GSObject) (boolean1)).put("errorMessage", "no google token");
	//   24   47:aload_2         
	//   25   48:ldc1            #173 <String "errorMessage">
	//   26   50:ldc1            #175 <String "no google token">
	//   27   52:invokevirtual   #178 <Method void GSObject.put(String, String)>
				((GSObject) (boolean1)).put("providerError", googlesigninresult.getStatus().getStatusMessage());
	//   28   55:aload_2         
	//   29   56:ldc1            #180 <String "providerError">
	//   30   58:aload_1         
	//   31   59:invokevirtual   #184 <Method Status GoogleSignInResult.getStatus()>
	//   32   62:invokevirtual   #189 <Method String Status.getStatusMessage()>
	//   33   65:invokevirtual   #178 <Method void GSObject.put(String, String)>
				fail(providercallback, ((GSObject) (boolean1)));
	//   34   68:aload_0         
	//   35   69:aload_3         
	//   36   70:aload_2         
	//   37   71:invokevirtual   #192 <Method void fail(LoginProvider$ProviderCallback, GSObject)>
				return;
	//   38   74:return          
			}
		} else
		{
			((_cls5) (new AsyncTask() {

				protected volatile Object doInBackground(Object aobj[])
				{
					return ((Object) (doInBackground((Void[])aobj)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #32  <Class Void[]>
				//    3    5:invokevirtual   #35  <Method Void doInBackground(Void[])>
				//    4    8:areturn         
				}

				protected Void doInBackground(Void avoid[])
				{
					try
					{
						avoid = ((Void []) (GSAPI.getInstance().getContext()));
				//    0    0:invokestatic    #43  <Method GSAPI GSAPI.getInstance()>
				//    1    3:invokevirtual   #47  <Method android.content.Context GSAPI.getContext()>
				//    2    6:astore_1        
						Account account = new Account(acc.getEmail(), "com.google");
				//    3    7:new             #49  <Class Account>
				//    4   10:dup             
				//    5   11:aload_0         
				//    6   12:getfield        #22  <Field GoogleSignInAccount val$acc>
				//    7   15:invokevirtual   #55  <Method String GoogleSignInAccount.getEmail()>
				//    8   18:ldc1            #57  <String "com.google">
				//    9   20:invokespecial   #60  <Method void Account(String, String)>
				//   10   23:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   11   24:new             #62  <Class StringBuilder>
				//   12   27:dup             
				//   13   28:invokespecial   #63  <Method void StringBuilder()>
				//   14   31:astore_3        
						stringbuilder.append("oauth2:");
				//   15   32:aload_3         
				//   16   33:ldc1            #65  <String "oauth2:">
				//   17   35:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//   18   38:pop             
						stringbuilder.append(TextUtils.join(" ", ((Iterable) (acc.getGrantedScopes()))));
				//   19   39:aload_3         
				//   20   40:ldc1            #71  <String " ">
				//   21   42:aload_0         
				//   22   43:getfield        #22  <Field GoogleSignInAccount val$acc>
				//   23   46:invokevirtual   #75  <Method java.util.Set GoogleSignInAccount.getGrantedScopes()>
				//   24   49:invokestatic    #81  <Method String TextUtils.join(CharSequence, Iterable)>
				//   25   52:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//   26   55:pop             
						avoid = ((Void []) (GoogleAuthUtil.getToken(((android.content.Context) (avoid)), account, stringbuilder.toString())));
				//   27   56:aload_1         
				//   28   57:aload_2         
				//   29   58:aload_3         
				//   30   59:invokevirtual   #84  <Method String StringBuilder.toString()>
				//   31   62:invokestatic    #90  <Method String GoogleAuthUtil.getToken(android.content.Context, Account, String)>
				//   32   65:astore_1        
					}
				//*  33   66:goto            118
					// Misplaced declaration of an exception variable
					catch(Void avoid[])
				//*  34   69:astore_1        
					{
						GSObject gsobject = new GSObject();
				//   35   70:new             #92  <Class GSObject>
				//   36   73:dup             
				//   37   74:invokespecial   #93  <Method void GSObject()>
				//   38   77:astore_2        
						gsobject.put("errorCode", 0x7a137);
				//   39   78:aload_2         
				//   40   79:ldc1            #95  <String "errorCode">
				//   41   81:ldc1            #96  <Int 0x7a137>
				//   42   83:invokevirtual   #100 <Method void GSObject.put(String, int)>
						gsobject.put("errorMessage", "error while getting google token");
				//   43   86:aload_2         
				//   44   87:ldc1            #102 <String "errorMessage">
				//   45   89:ldc1            #104 <String "error while getting google token">
				//   46   91:invokevirtual   #106 <Method void GSObject.put(String, String)>
						gsobject.put("providerError", ((Exception) (avoid)).getMessage());
				//   47   94:aload_2         
				//   48   95:ldc1            #108 <String "providerError">
				//   49   97:aload_1         
				//   50   98:invokevirtual   #111 <Method String Exception.getMessage()>
				//   51  101:invokevirtual   #106 <Method void GSObject.put(String, String)>
						fail(callback, gsobject);
				//   52  104:aload_0         
				//   53  105:getfield        #20  <Field GoogleProvider this$0>
				//   54  108:aload_0         
				//   55  109:getfield        #24  <Field LoginProvider$ProviderCallback val$callback>
				//   56  112:aload_2         
				//   57  113:invokevirtual   #115 <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, GSObject)>
						avoid = null;
				//   58  116:aconst_null     
				//   59  117:astore_1        
					}
					if(avoid != null && !((String) (avoid)).isEmpty())
				//*  60  118:aload_1         
				//*  61  119:ifnull          149
				//*  62  122:aload_1         
				//*  63  123:invokevirtual   #121 <Method boolean String.isEmpty()>
				//*  64  126:ifeq            132
				//*  65  129:goto            149
					{
						success(callback, ((String) (avoid)), -1L);
				//   66  132:aload_0         
				//   67  133:getfield        #20  <Field GoogleProvider this$0>
				//   68  136:aload_0         
				//   69  137:getfield        #24  <Field LoginProvider$ProviderCallback val$callback>
				//   70  140:aload_1         
				//   71  141:ldc2w           #122 <Long -1L>
				//   72  144:invokevirtual   #127 <Method void GoogleProvider.success(LoginProvider$ProviderCallback, String, long)>
						return null;
				//   73  147:aconst_null     
				//   74  148:areturn         
					} else
					{
						avoid = ((Void []) (new GSObject()));
				//   75  149:new             #92  <Class GSObject>
				//   76  152:dup             
				//   77  153:invokespecial   #93  <Method void GSObject()>
				//   78  156:astore_1        
						((GSObject) (avoid)).put("errorCode", 0x7a137);
				//   79  157:aload_1         
				//   80  158:ldc1            #95  <String "errorCode">
				//   81  160:ldc1            #96  <Int 0x7a137>
				//   82  162:invokevirtual   #100 <Method void GSObject.put(String, int)>
						((GSObject) (avoid)).put("errorMessage", "no google token");
				//   83  165:aload_1         
				//   84  166:ldc1            #102 <String "errorMessage">
				//   85  168:ldc1            #129 <String "no google token">
				//   86  170:invokevirtual   #106 <Method void GSObject.put(String, String)>
						fail(callback, ((GSObject) (avoid)));
				//   87  173:aload_0         
				//   88  174:getfield        #20  <Field GoogleProvider this$0>
				//   89  177:aload_0         
				//   90  178:getfield        #24  <Field LoginProvider$ProviderCallback val$callback>
				//   91  181:aload_1         
				//   92  182:invokevirtual   #115 <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, GSObject)>
						return null;
				//   93  185:aconst_null     
				//   94  186:areturn         
					}
				}

				final GoogleProvider this$0;
				final GoogleSignInAccount val$acc;
				final LoginProvider.ProviderCallback val$callback;

			
			{
				this$0 = GoogleProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field GoogleProvider this$0>
				acc = googlesigninaccount;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field GoogleSignInAccount val$acc>
				callback = providercallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void AsyncTask()>
			//   11   19:return          
			}
			}
)).execute(((Object []) (new Void[0])));
	//   39   75:new             #14  <Class GoogleProvider$5>
	//   40   78:dup             
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:invokevirtual   #196 <Method GoogleSignInAccount GoogleSignInResult.getSignInAccount()>
	//   44   84:aload_3         
	//   45   85:invokespecial   #199 <Method void GoogleProvider$5(GoogleProvider, GoogleSignInAccount, LoginProvider$ProviderCallback)>
	//   46   88:iconst_0        
	//   47   89:anewarray       Void[]
	//   48   92:invokevirtual   #205 <Method AsyncTask GoogleProvider$5.execute(Object[])>
	//   49   95:pop             
			return;
	//   50   96:return          
		}
	}

	private List getScopes(GSObject gsobject)
	{
		ArrayList arraylist = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (gsobject.getString("defaultPermissions", "https://www.googleapis.com/auth/plus.login,https://www.googleapis.com/auth/userinfo.email").split(",")))))));
	//    0    0:new             #207 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #209 <String "defaultPermissions">
	//    4    7:ldc1            #211 <String "https://www.googleapis.com/auth/plus.login,https://www.googleapis.com/auth/userinfo.email">
	//    5    9:invokevirtual   #215 <Method String GSObject.getString(String, String)>
	//    6   12:ldc1            #217 <String ",">
	//    7   14:invokevirtual   #221 <Method String[] String.split(String)>
	//    8   17:invokestatic    #227 <Method List Arrays.asList(Object[])>
	//    9   20:invokespecial   #230 <Method void ArrayList(java.util.Collection)>
	//   10   23:astore_2        
		gsobject = ((GSObject) (gsobject.getString("googlePlusExtraPermissions", ((String) (null)))));
	//   11   24:aload_1         
	//   12   25:ldc1            #232 <String "googlePlusExtraPermissions">
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #215 <Method String GSObject.getString(String, String)>
	//   15   31:astore_1        
		if(gsobject != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          52
			((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (((String) (gsobject)).split(",")))))));
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:ldc1            #217 <String ",">
	//   21   40:invokevirtual   #221 <Method String[] String.split(String)>
	//   22   43:invokestatic    #227 <Method List Arrays.asList(Object[])>
	//   23   46:invokeinterface #236 <Method boolean List.addAll(java.util.Collection)>
	//   24   51:pop             
		return ((List) (arraylist));
	//   25   52:aload_2         
	//   26   53:areturn         
	}

	private void googleAccountSignIn(final Boolean silent, final LoginProvider.ProviderCallback callback)
	{
		OptionalPendingResult optionalpendingresult = Auth.GoogleSignInApi.silentSignIn(googleClient);
	//    0    0:getstatic       #242 <Field GoogleSignInApi Auth.GoogleSignInApi>
	//    1    3:aload_0         
	//    2    4:getfield        #244 <Field GoogleApiClient googleClient>
	//    3    7:invokeinterface #250 <Method OptionalPendingResult GoogleSignInApi.silentSignIn(GoogleApiClient)>
	//    4   12:astore_3        
		if(optionalpendingresult.isDone())
	//*   5   13:aload_3         
	//*   6   14:invokevirtual   #255 <Method boolean OptionalPendingResult.isDone()>
	//*   7   17:ifeq            34
		{
			getGoogleAuthTokenFromResult((GoogleSignInResult)optionalpendingresult.get(), silent, callback);
	//    8   20:aload_0         
	//    9   21:aload_3         
	//   10   22:invokevirtual   #259 <Method Result OptionalPendingResult.get()>
	//   11   25:checkcast       #150 <Class GoogleSignInResult>
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokespecial   #45  <Method void getGoogleAuthTokenFromResult(GoogleSignInResult, Boolean, LoginProvider$ProviderCallback)>
			return;
	//   15   33:return          
		} else
		{
			optionalpendingresult.setResultCallback(new ResultCallback() {

				public void onResult(GoogleSignInResult googlesigninresult)
				{
					getGoogleAuthTokenFromResult(googlesigninresult, silent, callback);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field GoogleProvider this$0>
				//    2    4:aload_1         
				//    3    5:aload_0         
				//    4    6:getfield        #24  <Field Boolean val$silent>
				//    5    9:aload_0         
				//    6   10:getfield        #26  <Field LoginProvider$ProviderCallback val$callback>
				//    7   13:invokestatic    #36  <Method void GoogleProvider.access$200(GoogleProvider, GoogleSignInResult, Boolean, LoginProvider$ProviderCallback)>
				//    8   16:return          
				}

				public volatile void onResult(Result result)
				{
					onResult((GoogleSignInResult)result);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #39  <Class GoogleSignInResult>
				//    3    5:invokevirtual   #41  <Method void onResult(GoogleSignInResult)>
				//    4    8:return          
				}

				final GoogleProvider this$0;
				final LoginProvider.ProviderCallback val$callback;
				final Boolean val$silent;

			
			{
				this$0 = GoogleProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field GoogleProvider this$0>
				silent = boolean1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Boolean val$silent>
				callback = providercallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   16   34:aload_3         
	//   17   35:new             #12  <Class GoogleProvider$4>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokespecial   #260 <Method void GoogleProvider$4(GoogleProvider, Boolean, LoginProvider$ProviderCallback)>
	//   23   45:invokevirtual   #264 <Method void OptionalPendingResult.setResultCallback(ResultCallback)>
			return;
	//   24   48:return          
		}
	}

	public static boolean isConfigured()
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		android.content.Context context = GSAPI.getInstance().getContext();
	//    2    2:invokestatic    #65  <Method GSAPI GSAPI.getInstance()>
	//    3    5:invokevirtual   #69  <Method android.content.Context GSAPI.getContext()>
	//    4    8:astore          4
label0:
		{
			int i;
			boolean flag;
			boolean flag1;
			if(isClassExist("com.google.android.gms.common.GooglePlayServicesUtil") && GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0)
	//*   5   10:ldc2            #269 <String "com.google.android.gms.common.GooglePlayServicesUtil">
	//*   6   13:invokestatic    #273 <Method boolean isClassExist(String)>
	//*   7   16:ifeq            67
	//*   8   19:invokestatic    #278 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//*   9   22:aload           4
	//*  10   24:invokevirtual   #282 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//*  11   27:ifne            67
				flag = true;
	//   12   30:iconst_1        
	//   13   31:istore_1        
			else
	//*  14   32:goto            35
	//*  15   35:iload_3         
	//*  16   36:istore_2        
	//*  17   37:iload_1         
	//*  18   38:invokestatic    #286 <Method Boolean Boolean.valueOf(boolean)>
	//*  19   41:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//*  20   44:ifeq            61
	//*  21   47:getstatic       #291 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   50:istore_0        
	//*  23   51:iload_3         
	//*  24   52:istore_2        
	//*  25   53:iload_0         
	//*  26   54:bipush          8
	//*  27   56:icmplt          61
	//*  28   59:iconst_1        
	//*  29   60:istore_2        
	//*  30   61:iload_2         
	//*  31   62:ireturn         
	//*  32   63:astore          4
	//*  33   65:iconst_0        
	//*  34   66:ireturn         
				flag = false;
	//   35   67:iconst_0        
	//   36   68:istore_1        
			flag1 = flag2;
			try
			{
				if(!Boolean.valueOf(flag).booleanValue())
					break label0;
				i = android.os.Build.VERSION.SDK_INT;
			}
			catch(Throwable throwable)
			{
				return false;
			}
			flag1 = flag2;
			if(i >= 8)
				flag1 = true;
		}
		return flag1;
	//*  37   69:goto            35
	}

	private void startSignInActivity()
	{
		Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleClient);
	//    0    0:getstatic       #242 <Field GoogleSignInApi Auth.GoogleSignInApi>
	//    1    3:aload_0         
	//    2    4:getfield        #244 <Field GoogleApiClient googleClient>
	//    3    7:invokeinterface #295 <Method Intent GoogleSignInApi.getSignInIntent(GoogleApiClient)>
	//    4   12:astore_1        
		currentActivity.startActivityForResult(intent, GOOGLE_CODE_RESOLVE_ERR);
	//    5   13:aload_0         
	//    6   14:getfield        #297 <Field Activity currentActivity>
	//    7   17:aload_1         
	//    8   18:getstatic       #39  <Field int GOOGLE_CODE_RESOLVE_ERR>
	//    9   21:invokevirtual   #303 <Method void Activity.startActivityForResult(Intent, int)>
	//   10   24:return          
	}

	private void tryResolveConnectionFailed(ConnectionResult connectionresult, LoginProvider.ProviderCallback providercallback)
	{
		if(connectionresult.hasResolution())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #310 <Method boolean ConnectionResult.hasResolution()>
	//*   2    4:ifeq            28
			try
			{
				connectionresult.startResolutionForResult(currentActivity, GOOGLE_CODE_RESOLVE_ERR);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #297 <Field Activity currentActivity>
	//    6   12:getstatic       #39  <Field int GOOGLE_CODE_RESOLVE_ERR>
	//    7   15:invokevirtual   #314 <Method void ConnectionResult.startResolutionForResult(Activity, int)>
				return;
	//    8   18:return          
			}
			// Misplaced declaration of an exception variable
			catch(ConnectionResult connectionresult)
	//*   9   19:astore_1        
			{
				connectionresult = ((ConnectionResult) (((android.content.IntentSender.SendIntentException) (connectionresult)).getMessage()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #317 <Method String android.content.IntentSender$SendIntentException.getMessage()>
	//   12   24:astore_1        
			}
		else
	//*  13   25:goto            33
			connectionresult = ((ConnectionResult) (connectionresult.toString()));
	//   14   28:aload_1         
	//   15   29:invokevirtual   #320 <Method String ConnectionResult.toString()>
	//   16   32:astore_1        
		fail(providercallback, ((String) (connectionresult)));
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #148 <Method void fail(LoginProvider$ProviderCallback, String)>
	//   21   39:return          
	}

	public void clearSession()
	{
		if(googleClient != null && googleClient.isConnected())
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field GoogleApiClient googleClient>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #244 <Field GoogleApiClient googleClient>
	//*   5   11:invokevirtual   #326 <Method boolean GoogleApiClient.isConnected()>
	//*   6   14:ifeq            30
			Auth.GoogleSignInApi.signOut(googleClient);
	//    7   17:getstatic       #242 <Field GoogleSignInApi Auth.GoogleSignInApi>
	//    8   20:aload_0         
	//    9   21:getfield        #244 <Field GoogleApiClient googleClient>
	//   10   24:invokeinterface #330 <Method PendingResult GoogleSignInApi.signOut(GoogleApiClient)>
	//   11   29:pop             
	//   12   30:return          
	}

	protected void finish()
	{
		if(googleClient != null && googleClient.isConnected())
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field GoogleApiClient googleClient>
	//*   2    4:ifnull          40
	//*   3    7:aload_0         
	//*   4    8:getfield        #244 <Field GoogleApiClient googleClient>
	//*   5   11:invokevirtual   #326 <Method boolean GoogleApiClient.isConnected()>
	//*   6   14:ifeq            40
			Auth.GoogleSignInApi.signOut(googleClient).setResultCallback(new ResultCallback() {

				public volatile void onResult(Result result)
				{
					onResult((Status)result);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #25  <Class Status>
				//    3    5:invokevirtual   #28  <Method void onResult(Status)>
				//    4    8:return          
				}

				public void onResult(Status status)
				{
					googleClient.disconnect();
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field GoogleProvider this$0>
				//    2    4:getfield        #32  <Field GoogleApiClient GoogleProvider.googleClient>
				//    3    7:invokevirtual   #37  <Method void GoogleApiClient.disconnect()>
					if(currentActivity != null)
				//*   4   10:aload_0         
				//*   5   11:getfield        #18  <Field GoogleProvider this$0>
				//*   6   14:getfield        #41  <Field Activity GoogleProvider.currentActivity>
				//*   7   17:ifnull          38
					{
						currentActivity.finish();
				//    8   20:aload_0         
				//    9   21:getfield        #18  <Field GoogleProvider this$0>
				//   10   24:getfield        #41  <Field Activity GoogleProvider.currentActivity>
				//   11   27:invokevirtual   #44  <Method void Activity.finish()>
						currentActivity = null;
				//   12   30:aload_0         
				//   13   31:getfield        #18  <Field GoogleProvider this$0>
				//   14   34:aconst_null     
				//   15   35:putfield        #41  <Field Activity GoogleProvider.currentActivity>
					}
				//   16   38:return          
				}

				final GoogleProvider this$0;

			
			{
				this$0 = GoogleProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field GoogleProvider this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    7   17:getstatic       #242 <Field GoogleSignInApi Auth.GoogleSignInApi>
	//    8   20:aload_0         
	//    9   21:getfield        #244 <Field GoogleApiClient googleClient>
	//   10   24:invokeinterface #330 <Method PendingResult GoogleSignInApi.signOut(GoogleApiClient)>
	//   11   29:new             #16  <Class GoogleProvider$6>
	//   12   32:dup             
	//   13   33:aload_0         
	//   14   34:invokespecial   #334 <Method void GoogleProvider$6(GoogleProvider)>
	//   15   37:invokevirtual   #337 <Method void PendingResult.setResultCallback(ResultCallback)>
	//   16   40:return          
	}

	public void login(Activity activity, final GSObject params, final Boolean silent, final LoginProvider.ProviderCallback callback)
	{
		if(silent.booleanValue())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//*   2    4:ifeq            16
		{
			trySilentLogin(activity, params, callback);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload           4
	//    7   12:invokevirtual   #343 <Method void trySilentLogin(Activity, GSObject, LoginProvider$ProviderCallback)>
			return;
	//    8   15:return          
		}
		if(currentActivity != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #297 <Field Activity currentActivity>
	//*  11   20:ifnull          30
			currentActivity.finish();
	//   12   23:aload_0         
	//   13   24:getfield        #297 <Field Activity currentActivity>
	//   14   27:invokevirtual   #345 <Method void Activity.finish()>
		createActivity(new com.gigya.socialize.android.ui.HostActivity.HostActivityHandler() {

			public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
			{
				if(i == GoogleProvider.GOOGLE_CODE_RESOLVE_ERR)
			//*   0    0:iload_2         
			//*   1    1:invokestatic    #39  <Method int GoogleProvider.access$100()>
			//*   2    4:icmpne          72
				{
					if(j == -1)
			//*   3    7:iload_3         
			//*   4    8:iconst_m1       
			//*   5    9:icmpne          40
					{
						fragmentactivity = ((FragmentActivity) (Auth.GoogleSignInApi.getSignInResultFromIntent(intent)));
			//    6   12:getstatic       #45  <Field GoogleSignInApi Auth.GoogleSignInApi>
			//    7   15:aload           4
			//    8   17:invokeinterface #51  <Method GoogleSignInResult GoogleSignInApi.getSignInResultFromIntent(Intent)>
			//    9   22:astore_1        
						getGoogleAuthTokenFromResult(((GoogleSignInResult) (fragmentactivity)), silent, callback);
			//   10   23:aload_0         
			//   11   24:getfield        #23  <Field GoogleProvider this$0>
			//   12   27:aload_1         
			//   13   28:aload_0         
			//   14   29:getfield        #29  <Field Boolean val$silent>
			//   15   32:aload_0         
			//   16   33:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
			//   17   36:invokestatic    #55  <Method void GoogleProvider.access$200(GoogleProvider, GoogleSignInResult, Boolean, LoginProvider$ProviderCallback)>
						return;
			//   18   39:return          
					}
					if(j == 0)
			//*  19   40:iload_3         
			//*  20   41:ifne            56
					{
						cancel(callback);
			//   21   44:aload_0         
			//   22   45:getfield        #23  <Field GoogleProvider this$0>
			//   23   48:aload_0         
			//   24   49:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
			//   25   52:invokevirtual   #59  <Method void GoogleProvider.cancel(LoginProvider$ProviderCallback)>
						return;
			//   26   55:return          
					}
					fail(callback, intent.toString());
			//   27   56:aload_0         
			//   28   57:getfield        #23  <Field GoogleProvider this$0>
			//   29   60:aload_0         
			//   30   61:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
			//   31   64:aload           4
			//   32   66:invokevirtual   #65  <Method String Intent.toString()>
			//   33   69:invokevirtual   #69  <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, String)>
				}
			//   34   72:return          
			}

			public void onCancel(FragmentActivity fragmentactivity)
			{
				cancel(callback);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field GoogleProvider this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
			//    4    8:invokevirtual   #59  <Method void GoogleProvider.cancel(LoginProvider$ProviderCallback)>
			//    5   11:return          
			}

			public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
			{
				currentActivity = ((Activity) (fragmentactivity));
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field GoogleProvider this$0>
			//    2    4:aload_1         
			//    3    5:putfield        #77  <Field Activity GoogleProvider.currentActivity>
				googleClient = buildGoogleApiClient(params, Boolean.valueOf(false), callback);
			//    4    8:aload_0         
			//    5    9:getfield        #23  <Field GoogleProvider this$0>
			//    6   12:aload_0         
			//    7   13:getfield        #23  <Field GoogleProvider this$0>
			//    8   16:aload_0         
			//    9   17:getfield        #25  <Field GSObject val$params>
			//   10   20:iconst_0        
			//   11   21:invokestatic    #83  <Method Boolean Boolean.valueOf(boolean)>
			//   12   24:aload_0         
			//   13   25:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
			//   14   28:invokestatic    #87  <Method GoogleApiClient GoogleProvider.access$000(GoogleProvider, GSObject, Boolean, LoginProvider$ProviderCallback)>
			//   15   31:putfield        #91  <Field GoogleApiClient GoogleProvider.googleClient>
				googleClient.connect();
			//   16   34:aload_0         
			//   17   35:getfield        #23  <Field GoogleProvider this$0>
			//   18   38:getfield        #91  <Field GoogleApiClient GoogleProvider.googleClient>
			//   19   41:invokevirtual   #96  <Method void GoogleApiClient.connect()>
			//   20   44:return          
			}

			public void onResume(FragmentActivity fragmentactivity)
			{
			//    0    0:return          
			}

			public void onStart(FragmentActivity fragmentactivity)
			{
			//    0    0:return          
			}

			final GoogleProvider this$0;
			final LoginProvider.ProviderCallback val$callback;
			final GSObject val$params;
			final Boolean val$silent;

			
			{
				this$0 = GoogleProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field GoogleProvider this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field GSObject val$params>
				callback = providercallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field LoginProvider$ProviderCallback val$callback>
				silent = boolean1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field Boolean val$silent>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   15   30:aload_0         
	//   16   31:new             #6   <Class GoogleProvider$1>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:aload           4
	//   21   39:aload_3         
	//   22   40:invokespecial   #348 <Method void GoogleProvider$1(GoogleProvider, GSObject, LoginProvider$ProviderCallback, Boolean)>
	//   23   43:invokevirtual   #352 <Method void createActivity(com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
	//   24   46:return          
	}

	public void trySilentLogin(Activity activity, GSObject gsobject, LoginProvider.ProviderCallback providercallback)
	{
		googleClient = buildGoogleApiClient(gsobject, Boolean.valueOf(true), providercallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #286 <Method Boolean Boolean.valueOf(boolean)>
	//    5    7:aload_3         
	//    6    8:invokespecial   #35  <Method GoogleApiClient buildGoogleApiClient(GSObject, Boolean, LoginProvider$ProviderCallback)>
	//    7   11:putfield        #244 <Field GoogleApiClient googleClient>
		googleClient.connect();
	//    8   14:aload_0         
	//    9   15:getfield        #244 <Field GoogleApiClient googleClient>
	//   10   18:invokevirtual   #355 <Method void GoogleApiClient.connect()>
	//   11   21:return          
	}

	private static int GOOGLE_CODE_RESOLVE_ERR = 32667;
	Activity currentActivity;
	GoogleApiClient googleClient;

	static 
	{
	//    0    0:return          
	}


/*
	static GoogleApiClient access$000(GoogleProvider googleprovider, GSObject gsobject, Boolean boolean1, LoginProvider.ProviderCallback providercallback)
	{
		return googleprovider.buildGoogleApiClient(gsobject, boolean1, providercallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #35  <Method GoogleApiClient buildGoogleApiClient(GSObject, Boolean, LoginProvider$ProviderCallback)>
	//    5    7:areturn         
	}

*/


/*
	static int access$100()
	{
		return GOOGLE_CODE_RESOLVE_ERR;
	//    0    0:getstatic       #39  <Field int GOOGLE_CODE_RESOLVE_ERR>
	//    1    3:ireturn         
	}

*/


/*
	static void access$200(GoogleProvider googleprovider, GoogleSignInResult googlesigninresult, Boolean boolean1, LoginProvider.ProviderCallback providercallback)
	{
		googleprovider.getGoogleAuthTokenFromResult(googlesigninresult, boolean1, providercallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #45  <Method void getGoogleAuthTokenFromResult(GoogleSignInResult, Boolean, LoginProvider$ProviderCallback)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$300(GoogleProvider googleprovider, Boolean boolean1, LoginProvider.ProviderCallback providercallback)
	{
		googleprovider.googleAccountSignIn(boolean1, providercallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #51  <Method void googleAccountSignIn(Boolean, LoginProvider$ProviderCallback)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$400(GoogleProvider googleprovider, ConnectionResult connectionresult, LoginProvider.ProviderCallback providercallback)
	{
		googleprovider.tryResolveConnectionFailed(connectionresult, providercallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #57  <Method void tryResolveConnectionFailed(ConnectionResult, LoginProvider$ProviderCallback)>
		return;
	//    4    6:return          
	}

*/
}
