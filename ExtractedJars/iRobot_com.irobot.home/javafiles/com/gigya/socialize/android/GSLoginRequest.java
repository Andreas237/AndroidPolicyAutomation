// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.app.Activity;
import android.text.TextUtils;
import com.gigya.socialize.*;
import com.gigya.socialize.android.login.LoginProviderFactory;
import com.gigya.socialize.android.login.providers.GigyaWebViewProvider;
import com.gigya.socialize.android.login.providers.LoginProvider;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSSession

public class GSLoginRequest
{
	public static final class LoginRequestType extends Enum
	{

		public static LoginRequestType valueOf(String s)
		{
			return (LoginRequestType)Enum.valueOf(com/gigya/socialize/android/GSLoginRequest$LoginRequestType, s);
		//    0    0:ldc1            #2   <Class GSLoginRequest$LoginRequestType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GSLoginRequest$LoginRequestType>
		//    4    9:areturn         
		}

		public static LoginRequestType[] values()
		{
			return (LoginRequestType[])((LoginRequestType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field GSLoginRequest$LoginRequestType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.gigya.socialize.android.GSLoginRequest$LoginRequestType_3B_.clone()>
		//    2    6:checkcast       #42  <Class GSLoginRequest$LoginRequestType[]>
		//    3    9:areturn         
		}

		private static final LoginRequestType $VALUES[];
		public static final LoginRequestType addConnection;
		public static final LoginRequestType login;
		public static final LoginRequestType socialLogin;

		static 
		{
			login = new LoginRequestType("login", 0);
		//    0    0:new             #2   <Class GSLoginRequest$LoginRequestType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "login">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void GSLoginRequest$LoginRequestType(String, int)>
		//    5   10:putstatic       #23  <Field GSLoginRequest$LoginRequestType login>
			addConnection = new LoginRequestType("addConnection", 1);
		//    6   13:new             #2   <Class GSLoginRequest$LoginRequestType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "addConnection">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void GSLoginRequest$LoginRequestType(String, int)>
		//   11   23:putstatic       #26  <Field GSLoginRequest$LoginRequestType addConnection>
			socialLogin = new LoginRequestType("socialLogin", 2);
		//   12   26:new             #2   <Class GSLoginRequest$LoginRequestType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "socialLogin">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void GSLoginRequest$LoginRequestType(String, int)>
		//   17   36:putstatic       #29  <Field GSLoginRequest$LoginRequestType socialLogin>
			$VALUES = (new LoginRequestType[] {
				login, addConnection, socialLogin
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       LoginRequestType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field GSLoginRequest$LoginRequestType login>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field GSLoginRequest$LoginRequestType addConnection>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field GSLoginRequest$LoginRequestType socialLogin>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field GSLoginRequest$LoginRequestType[] $VALUES>
		//*  33   64:return          
		}

		private LoginRequestType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	protected GSLoginRequest(LoginRequestType loginrequesttype, Activity activity1, GSObject gsobject, GSResponseListener gsresponselistener, Boolean boolean1, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		canceled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #43  <Field boolean canceled>
		logger = new GSLogger();
	//    5    9:aload_0         
	//    6   10:new             #45  <Class GSLogger>
	//    7   13:dup             
	//    8   14:invokespecial   #46  <Method void GSLogger()>
	//    9   17:putfield        #48  <Field GSLogger logger>
		type = loginrequesttype;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #50  <Field GSLoginRequest$LoginRequestType type>
		activity = activity1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #52  <Field Activity activity>
		responseListener = gsresponselistener;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #54  <Field GSResponseListener responseListener>
		context = obj;
	//   19   36:aload_0         
	//   20   37:aload           6
	//   21   39:putfield        #56  <Field Object context>
		params = gsobject;
	//   22   42:aload_0         
	//   23   43:aload_3         
	//   24   44:putfield        #58  <Field GSObject params>
		silent = boolean1;
	//   25   47:aload_0         
	//   26   48:aload           5
	//   27   50:putfield        #60  <Field Boolean silent>
		if(gsobject != null)
	//*  28   53:aload_3         
	//*  29   54:ifnull          68
			provider = gsobject.getString("provider", ((String) (null)));
	//   30   57:aload_0         
	//   31   58:aload_3         
	//   32   59:ldc1            #61  <String "provider">
	//   33   61:aconst_null     
	//   34   62:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   35   65:putfield        #69  <Field String provider>
		id = ((Object)this).hashCode();
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:invokevirtual   #73  <Method int Object.hashCode()>
	//   39   73:putfield        #75  <Field int id>
		logger.writeFormat("GSLoginRequest:\n\ttype=%s\\nprovider=%sn\tparams=%s", new Object[] {
			loginrequesttype, provider, gsobject
		});
	//   40   76:aload_0         
	//   41   77:getfield        #48  <Field GSLogger logger>
	//   42   80:ldc1            #77  <String "GSLoginRequest:\n\ttype=%s\\nprovider=%sn\tparams=%s">
	//   43   82:iconst_3        
	//   44   83:anewarray       Object[]
	//   45   86:dup             
	//   46   87:iconst_0        
	//   47   88:aload_1         
	//   48   89:aastore         
	//   49   90:dup             
	//   50   91:iconst_1        
	//   51   92:aload_0         
	//   52   93:getfield        #69  <Field String provider>
	//   53   96:aastore         
	//   54   97:dup             
	//   55   98:iconst_2        
	//   56   99:aload_3         
	//   57  100:aastore         
	//   58  101:invokevirtual   #81  <Method void GSLogger.writeFormat(String, Object[])>
	//   59  104:return          
	}

	protected GSLoginRequest(LoginRequestType loginrequesttype, Activity activity1, GSObject gsobject, GSResponseListener gsresponselistener, Object obj)
	{
		this(loginrequesttype, activity1, gsobject, gsresponselistener, Boolean.valueOf(false), obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokestatic    #89  <Method Boolean Boolean.valueOf(boolean)>
	//    7   10:aload           5
	//    8   12:invokespecial   #91  <Method void GSLoginRequest(GSLoginRequest$LoginRequestType, Activity, GSObject, GSResponseListener, Boolean, Object)>
	//    9   15:return          
	}

	private void checkLoginProviderCompatibility()
	{
		if(provider.equals("facebook") && !GSAPI.getInstance().loginProviderFactory.hasLoginProvider("facebook"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field String provider>
	//*   2    4:ldc1            #106 <String "facebook">
	//*   3    6:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            36
	//*   5   12:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//*   6   15:getfield        #122 <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//*   7   18:ldc1            #106 <String "facebook">
	//*   8   20:invokevirtual   #128 <Method boolean LoginProviderFactory.hasLoginProvider(String)>
	//*   9   23:ifne            36
			throw new IllegalArgumentException("Login with Facebook is supported only using Facebook SDK native login.");
	//   10   26:new             #130 <Class IllegalArgumentException>
	//   11   29:dup             
	//   12   30:ldc1            #132 <String "Login with Facebook is supported only using Facebook SDK native login.">
	//   13   32:invokespecial   #135 <Method void IllegalArgumentException(String)>
	//   14   35:athrow          
		else
			return;
	//   15   36:return          
	}

	private void onFailResponse(GSObject gsobject, int i, final String finalResponse)
	{
		if(responseListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field GSResponseListener responseListener>
	//*   2    4:ifnull          116
		{
			finalResponse = ((String) (new GSResponse(type.toString().toLowerCase(), gsobject, i, finalResponse, logger)));
	//    3    7:new             #139 <Class GSResponse>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field GSLoginRequest$LoginRequestType type>
	//    7   15:invokevirtual   #143 <Method String GSLoginRequest$LoginRequestType.toString()>
	//    8   18:invokevirtual   #146 <Method String String.toLowerCase()>
	//    9   21:aload_1         
	//   10   22:iload_2         
	//   11   23:aload_3         
	//   12   24:aload_0         
	//   13   25:getfield        #48  <Field GSLogger logger>
	//   14   28:invokespecial   #149 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//   15   31:astore_3        
			gsobject = ((GSObject) (gsobject.getString("regToken", ((String) (null)))));
	//   16   32:aload_1         
	//   17   33:ldc1            #151 <String "regToken">
	//   18   35:aconst_null     
	//   19   36:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   20   39:astore_1        
			if(i == 0x324b1 && gsobject != null)
	//*  21   40:iload_2         
	//*  22   41:ldc1            #152 <Int 0x324b1>
	//*  23   43:icmpne          92
	//*  24   46:aload_1         
	//*  25   47:ifnull          92
			{
				GSObject gsobject1 = new GSObject();
	//   26   50:new             #63  <Class GSObject>
	//   27   53:dup             
	//   28   54:invokespecial   #153 <Method void GSObject()>
	//   29   57:astore          4
				gsobject1.put("regToken", ((String) (gsobject)));
	//   30   59:aload           4
	//   31   61:ldc1            #151 <String "regToken">
	//   32   63:aload_1         
	//   33   64:invokevirtual   #157 <Method void GSObject.put(String, String)>
				GSAPI.getInstance().sendRequest("accounts.getAccountInfo", gsobject1, true, new GSResponseListener() {

					public void onGSResponse(String s, GSResponse gsresponse, Object obj)
					{
						finalResponse.getData().put("data", gsresponse.getObject("data", ((GSObject) (null))));
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field GSResponse val$finalResponse>
					//    2    4:invokevirtual   #33  <Method GSObject GSResponse.getData()>
					//    3    7:ldc1            #35  <String "data">
					//    4    9:aload_2         
					//    5   10:ldc1            #35  <String "data">
					//    6   12:aconst_null     
					//    7   13:invokevirtual   #39  <Method GSObject GSResponse.getObject(String, GSObject)>
					//    8   16:invokevirtual   #45  <Method void GSObject.put(String, GSObject)>
						finalResponse.getData().put("profile", gsresponse.getObject("profile", ((GSObject) (null))));
					//    9   19:aload_0         
					//   10   20:getfield        #21  <Field GSResponse val$finalResponse>
					//   11   23:invokevirtual   #33  <Method GSObject GSResponse.getData()>
					//   12   26:ldc1            #47  <String "profile">
					//   13   28:aload_2         
					//   14   29:ldc1            #47  <String "profile">
					//   15   31:aconst_null     
					//   16   32:invokevirtual   #39  <Method GSObject GSResponse.getObject(String, GSObject)>
					//   17   35:invokevirtual   #45  <Method void GSObject.put(String, GSObject)>
						responseListener.onGSResponse(type.toString().toLowerCase(), finalResponse, obj);
					//   18   38:aload_0         
					//   19   39:getfield        #19  <Field GSLoginRequest this$0>
					//   20   42:getfield        #51  <Field GSResponseListener GSLoginRequest.responseListener>
					//   21   45:aload_0         
					//   22   46:getfield        #19  <Field GSLoginRequest this$0>
					//   23   49:getfield        #55  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
					//   24   52:invokevirtual   #61  <Method String GSLoginRequest$LoginRequestType.toString()>
					//   25   55:invokevirtual   #66  <Method String String.toLowerCase()>
					//   26   58:aload_0         
					//   27   59:getfield        #21  <Field GSResponse val$finalResponse>
					//   28   62:aload_3         
					//   29   63:invokeinterface #68  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
					//   30   68:return          
					}

					final GSLoginRequest this$0;
					final GSResponse val$finalResponse;

			
			{
				this$0 = GSLoginRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSLoginRequest this$0>
				finalResponse = gsresponse;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field GSResponse val$finalResponse>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
, context);
	//   34   67:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//   35   70:ldc1            #159 <String "accounts.getAccountInfo">
	//   36   72:aload           4
	//   37   74:iconst_1        
	//   38   75:new             #10  <Class GSLoginRequest$3>
	//   39   78:dup             
	//   40   79:aload_0         
	//   41   80:aload_3         
	//   42   81:invokespecial   #162 <Method void GSLoginRequest$3(GSLoginRequest, GSResponse)>
	//   43   84:aload_0         
	//   44   85:getfield        #56  <Field Object context>
	//   45   88:invokevirtual   #166 <Method void GSAPI.sendRequest(String, GSObject, boolean, GSResponseListener, Object)>
				return;
	//   46   91:return          
			}
			responseListener.onGSResponse(type.toString().toLowerCase(), ((GSResponse) (finalResponse)), context);
	//   47   92:aload_0         
	//   48   93:getfield        #54  <Field GSResponseListener responseListener>
	//   49   96:aload_0         
	//   50   97:getfield        #50  <Field GSLoginRequest$LoginRequestType type>
	//   51  100:invokevirtual   #143 <Method String GSLoginRequest$LoginRequestType.toString()>
	//   52  103:invokevirtual   #146 <Method String String.toLowerCase()>
	//   53  106:aload_3         
	//   54  107:aload_0         
	//   55  108:getfield        #56  <Field Object context>
	//   56  111:invokeinterface #172 <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
		}
	//   57  116:return          
	}

	private void onLoginResponse(GSObject gsobject)
	{
		int i = gsobject.getInt("errorCode", 0);
	//    0    0:aload_1         
	//    1    1:ldc1            #174 <String "errorCode">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #178 <Method int GSObject.getInt(String, int)>
	//    4    7:istore_2        
		Object obj = ((Object) (gsobject.getString("errorMessage", GSResponse.getErrorMessage(i))));
	//    5    8:aload_1         
	//    6    9:ldc1            #180 <String "errorMessage">
	//    7   11:iload_2         
	//    8   12:invokestatic    #184 <Method String GSResponse.getErrorMessage(int)>
	//    9   15:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   10   18:astore_3        
		String s = gsobject.getString("x_regToken", ((String) (null)));
	//   11   19:aload_1         
	//   12   20:ldc1            #186 <String "x_regToken">
	//   13   22:aconst_null     
	//   14   23:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   15   26:astore          4
		if(s != null)
	//*  16   28:aload           4
	//*  17   30:ifnull          47
		{
			gsobject.remove("x_regToken");
	//   18   33:aload_1         
	//   19   34:ldc1            #186 <String "x_regToken">
	//   20   36:invokevirtual   #189 <Method void GSObject.remove(String)>
			gsobject.put("regToken", s);
	//   21   39:aload_1         
	//   22   40:ldc1            #151 <String "regToken">
	//   23   42:aload           4
	//   24   44:invokevirtual   #157 <Method void GSObject.put(String, String)>
		}
		s = gsobject.getString("error_description", ((String) (null)));
	//   25   47:aload_1         
	//   26   48:ldc1            #191 <String "error_description">
	//   27   50:aconst_null     
	//   28   51:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   29   54:astore          4
		if(s != null)
	//*  30   56:aload           4
	//*  31   58:ifnull          105
		{
			gsobject.remove("error_description");
	//   32   61:aload_1         
	//   33   62:ldc1            #191 <String "error_description">
	//   34   64:invokevirtual   #189 <Method void GSObject.remove(String)>
			gsobject.remove("error");
	//   35   67:aload_1         
	//   36   68:ldc1            #193 <String "error">
	//   37   70:invokevirtual   #189 <Method void GSObject.remove(String)>
			obj = ((Object) (s.replace("+", "").split("-")));
	//   38   73:aload           4
	//   39   75:ldc1            #195 <String "+">
	//   40   77:ldc1            #197 <String "">
	//   41   79:invokevirtual   #201 <Method String String.replace(CharSequence, CharSequence)>
	//   42   82:ldc1            #203 <String "-">
	//   43   84:invokevirtual   #207 <Method String[] String.split(String)>
	//   44   87:astore_3        
			i = Integer.parseInt(((String) (obj[0])).trim());
	//   45   88:aload_3         
	//   46   89:iconst_0        
	//   47   90:aaload          
	//   48   91:invokevirtual   #210 <Method String String.trim()>
	//   49   94:invokestatic    #216 <Method int Integer.parseInt(String)>
	//   50   97:istore_2        
			obj = ((Object) (((String) (obj[1])).trim()));
	//   51   98:aload_3         
	//   52   99:iconst_1        
	//   53  100:aaload          
	//   54  101:invokevirtual   #210 <Method String String.trim()>
	//   55  104:astore_3        
		}
		if(i == 0)
	//*  56  105:iload_2         
	//*  57  106:ifne            115
		{
			onSuccessResponse(gsobject);
	//   58  109:aload_0         
	//   59  110:aload_1         
	//   60  111:invokespecial   #219 <Method void onSuccessResponse(GSObject)>
			return;
	//   61  114:return          
		} else
		{
			onFailResponse(gsobject, i, ((String) (obj)));
	//   62  115:aload_0         
	//   63  116:aload_1         
	//   64  117:iload_2         
	//   65  118:aload_3         
	//   66  119:invokespecial   #221 <Method void onFailResponse(GSObject, int, String)>
			return;
	//   67  122:return          
		}
	}

	private void onSuccessResponse(GSObject gsobject)
	{
		final GSAPI api = GSAPI.getInstance();
	//    0    0:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//    1    3:astore_3        
		GSSession gssession = api.getSession();
	//    2    4:aload_3         
	//    3    5:invokevirtual   #225 <Method GSSession GSAPI.getSession()>
	//    4    8:astore_2        
		if(gsobject.containsKey("access_token"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #227 <String "access_token">
	//*   7   12:invokevirtual   #230 <Method boolean GSObject.containsKey(String)>
	//*   8   15:ifeq            27
			gssession = new GSSession(gsobject);
	//    9   18:new             #232 <Class GSSession>
	//   10   21:dup             
	//   11   22:aload_1         
	//   12   23:invokespecial   #234 <Method void GSSession(GSObject)>
	//   13   26:astore_2        
		api.setSession(gssession, provider, new GSResponseListener() {

			public void onGSResponse(String s, GSResponse gsresponse, Object obj)
			{
				if(responseListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field GSLoginRequest this$0>
			//*   2    4:getfield        #31  <Field GSResponseListener GSLoginRequest.responseListener>
			//*   3    7:ifnull          37
					responseListener.onGSResponse(type.toString().toLowerCase(), gsresponse, obj);
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field GSLoginRequest this$0>
			//    6   14:getfield        #31  <Field GSResponseListener GSLoginRequest.responseListener>
			//    7   17:aload_0         
			//    8   18:getfield        #19  <Field GSLoginRequest this$0>
			//    9   21:getfield        #35  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
			//   10   24:invokevirtual   #41  <Method String GSLoginRequest$LoginRequestType.toString()>
			//   11   27:invokevirtual   #46  <Method String String.toLowerCase()>
			//   12   30:aload_2         
			//   13   31:aload_3         
			//   14   32:invokeinterface #48  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
				if(gsresponse.getErrorCode() == 0)
			//*  15   37:aload_2         
			//*  16   38:invokevirtual   #54  <Method int GSResponse.getErrorCode()>
			//*  17   41:ifne            125
				{
					if(type.equals(((Object) (LoginRequestType.login))))
			//*  18   44:aload_0         
			//*  19   45:getfield        #19  <Field GSLoginRequest this$0>
			//*  20   48:getfield        #35  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
			//*  21   51:getstatic       #57  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
			//*  22   54:invokevirtual   #61  <Method boolean GSLoginRequest$LoginRequestType.equals(Object)>
			//*  23   57:ifeq            75
					{
						api.setLastLoginProvider(provider);
			//   24   60:aload_0         
			//   25   61:getfield        #21  <Field GSAPI val$api>
			//   26   64:aload_0         
			//   27   65:getfield        #19  <Field GSLoginRequest this$0>
			//   28   68:getfield        #65  <Field String GSLoginRequest.provider>
			//   29   71:invokevirtual   #71  <Method void GSAPI.setLastLoginProvider(String)>
						return;
			//   30   74:return          
					}
					if(type.equals(((Object) (LoginRequestType.addConnection))))
			//*  31   75:aload_0         
			//*  32   76:getfield        #19  <Field GSLoginRequest this$0>
			//*  33   79:getfield        #35  <Field GSLoginRequest$LoginRequestType GSLoginRequest.type>
			//*  34   82:getstatic       #74  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
			//*  35   85:invokevirtual   #61  <Method boolean GSLoginRequest$LoginRequestType.equals(Object)>
			//*  36   88:ifeq            125
						api.invokeSocializeListeners("connectionAdded", new Object[] {
							provider, gsresponse.getData(), obj
						});
			//   37   91:aload_0         
			//   38   92:getfield        #21  <Field GSAPI val$api>
			//   39   95:ldc1            #76  <String "connectionAdded">
			//   40   97:iconst_3        
			//   41   98:anewarray       Object[]
			//   42  101:dup             
			//   43  102:iconst_0        
			//   44  103:aload_0         
			//   45  104:getfield        #19  <Field GSLoginRequest this$0>
			//   46  107:getfield        #65  <Field String GSLoginRequest.provider>
			//   47  110:aastore         
			//   48  111:dup             
			//   49  112:iconst_1        
			//   50  113:aload_2         
			//   51  114:invokevirtual   #80  <Method GSObject GSResponse.getData()>
			//   52  117:aastore         
			//   53  118:dup             
			//   54  119:iconst_2        
			//   55  120:aload_3         
			//   56  121:aastore         
			//   57  122:invokevirtual   #84  <Method void GSAPI.invokeSocializeListeners(String, Object[])>
				}
			//   58  125:return          
			}

			final GSLoginRequest this$0;
			final GSAPI val$api;

			
			{
				this$0 = GSLoginRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSLoginRequest this$0>
				api = gsapi;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field GSAPI val$api>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, context);
	//   14   27:aload_3         
	//   15   28:aload_2         
	//   16   29:aload_0         
	//   17   30:getfield        #69  <Field String provider>
	//   18   33:new             #12  <Class GSLoginRequest$4>
	//   19   36:dup             
	//   20   37:aload_0         
	//   21   38:aload_3         
	//   22   39:invokespecial   #237 <Method void GSLoginRequest$4(GSLoginRequest, GSAPI)>
	//   23   42:aload_0         
	//   24   43:getfield        #56  <Field Object context>
	//   25   46:invokevirtual   #241 <Method void GSAPI.setSession(GSSession, String, GSResponseListener, Object)>
	//   26   49:return          
	}

	private void preProcessParameters()
	{
		if(GSAPI.getInstance().getConfig() == null)
	//*   0    0:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//*   1    3:invokevirtual   #246 <Method GSObject GSAPI.getConfig()>
	//*   2    6:ifnonnull       10
			return;
	//    3    9:return          
		params.put("sdk", "android_3.3.26");
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field GSObject params>
	//    6   14:ldc1            #248 <String "sdk">
	//    7   16:ldc1            #250 <String "android_3.3.26">
	//    8   18:invokevirtual   #157 <Method void GSObject.put(String, String)>
		params.put("ucid", GSAPI.getInstance().getUCID());
	//    9   21:aload_0         
	//   10   22:getfield        #58  <Field GSObject params>
	//   11   25:ldc1            #252 <String "ucid">
	//   12   27:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//   13   30:invokevirtual   #255 <Method String GSAPI.getUCID()>
	//   14   33:invokevirtual   #157 <Method void GSObject.put(String, String)>
		Object obj = ((Object) (GSAPI.getInstance().getConfig().getObject("permissions", ((GSObject) (null)))));
	//   15   36:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//   16   39:invokevirtual   #246 <Method GSObject GSAPI.getConfig()>
	//   17   42:ldc2            #257 <String "permissions">
	//   18   45:aconst_null     
	//   19   46:invokevirtual   #261 <Method GSObject GSObject.getObject(String, GSObject)>
	//   20   49:astore_1        
		if(obj != null)
	//*  21   50:aload_1         
	//*  22   51:ifnull          92
		{
			obj = ((Object) (((GSObject) (obj)).getArray(provider, ((GSArray) (null)))));
	//   23   54:aload_1         
	//   24   55:aload_0         
	//   25   56:getfield        #69  <Field String provider>
	//   26   59:aconst_null     
	//   27   60:invokevirtual   #265 <Method GSArray GSObject.getArray(String, GSArray)>
	//   28   63:astore_1        
			if(obj != null && ((GSArray) (obj)).length() != 0)
	//*  29   64:aload_1         
	//*  30   65:ifnull          92
	//*  31   68:aload_1         
	//*  32   69:invokevirtual   #270 <Method int GSArray.length()>
	//*  33   72:ifeq            92
				params.put("defaultPermissions", TextUtils.join(",", ((Iterable) (obj))));
	//   34   75:aload_0         
	//   35   76:getfield        #58  <Field GSObject params>
	//   36   79:ldc2            #272 <String "defaultPermissions">
	//   37   82:ldc2            #274 <String ",">
	//   38   85:aload_1         
	//   39   86:invokestatic    #280 <Method String TextUtils.join(CharSequence, Iterable)>
	//   40   89:invokevirtual   #157 <Method void GSObject.put(String, String)>
		}
	//   41   92:return          
	}

	private void ssoLogin(String s, long l)
	{
		GSObject gsobject = params.clone();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field GSObject params>
	//    2    4:invokevirtual   #283 <Method GSObject GSObject.clone()>
	//    3    7:astore          4
		gsobject.put("endPoint", params.getString("endPoint", "socialize.login"));
	//    4    9:aload           4
	//    5   11:ldc2            #285 <String "endPoint">
	//    6   14:aload_0         
	//    7   15:getfield        #58  <Field GSObject params>
	//    8   18:ldc2            #285 <String "endPoint">
	//    9   21:ldc2            #287 <String "socialize.login">
	//   10   24:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   11   27:invokevirtual   #157 <Method void GSObject.put(String, String)>
		gsobject.put("provider", provider);
	//   12   30:aload           4
	//   13   32:ldc1            #61  <String "provider">
	//   14   34:aload_0         
	//   15   35:getfield        #69  <Field String provider>
	//   16   38:invokevirtual   #157 <Method void GSObject.put(String, String)>
		gsobject.put("providerToken", s);
	//   17   41:aload           4
	//   18   43:ldc2            #288 <String "providerToken">
	//   19   46:aload_1         
	//   20   47:invokevirtual   #157 <Method void GSObject.put(String, String)>
		providerToken = s;
	//   21   50:aload_0         
	//   22   51:aload_1         
	//   23   52:putfield        #290 <Field String providerToken>
		if(l != -1L)
	//*  24   55:lload_2         
	//*  25   56:ldc2w           #291 <Long -1L>
	//*  26   59:lcmp            
	//*  27   60:ifeq            72
			gsobject.put("providerExpiration", l);
	//   28   63:aload           4
	//   29   65:ldc2            #294 <String "providerExpiration">
	//   30   68:lload_2         
	//   31   69:invokevirtual   #296 <Method void GSObject.put(String, long)>
		s = ((String) (GSAPI.getInstance().getSession()));
	//   32   72:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//   33   75:invokevirtual   #225 <Method GSSession GSAPI.getSession()>
	//   34   78:astore_1        
		if(s != null && ((GSSession) (s)).isValid())
	//*  35   79:aload_1         
	//*  36   80:ifnull          102
	//*  37   83:aload_1         
	//*  38   84:invokevirtual   #300 <Method boolean GSSession.isValid()>
	//*  39   87:ifeq            102
			gsobject.put("oauth_token", ((GSSession) (s)).getToken());
	//   40   90:aload           4
	//   41   92:ldc2            #302 <String "oauth_token">
	//   42   95:aload_1         
	//   43   96:invokevirtual   #305 <Method String GSSession.getToken()>
	//   44   99:invokevirtual   #157 <Method void GSObject.put(String, String)>
		s = ((String) (new GigyaWebViewProvider()));
	//   45  102:new             #307 <Class GigyaWebViewProvider>
	//   46  105:dup             
	//   47  106:invokespecial   #308 <Method void GigyaWebViewProvider()>
	//   48  109:astore_1        
		s.isTransparent = Boolean.valueOf(true);
	//   49  110:aload_1         
	//   50  111:iconst_1        
	//   51  112:invokestatic    #89  <Method Boolean Boolean.valueOf(boolean)>
	//   52  115:putfield        #311 <Field Boolean GigyaWebViewProvider.isTransparent>
		((GigyaWebViewProvider) (s)).login(activity, gsobject, new com.gigya.socialize.android.login.providers.LoginProvider.ProviderCallback() {

			public void onResponse(GSObject gsobject1)
			{
				onLoginResponse(gsobject1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field GSLoginRequest this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void GSLoginRequest.access$100(GSLoginRequest, GSObject)>
			//    4    8:return          
			}

			final GSLoginRequest this$0;

			
			{
				this$0 = GSLoginRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSLoginRequest this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   53  118:aload_1         
	//   54  119:aload_0         
	//   55  120:getfield        #52  <Field Activity activity>
	//   56  123:aload           4
	//   57  125:new             #8   <Class GSLoginRequest$2>
	//   58  128:dup             
	//   59  129:aload_0         
	//   60  130:invokespecial   #314 <Method void GSLoginRequest$2(GSLoginRequest)>
	//   61  133:invokevirtual   #318 <Method void GigyaWebViewProvider.login(Activity, GSObject, com.gigya.socialize.android.login.providers.LoginProvider$ProviderCallback)>
	//   62  136:return          
	}

	protected void send()
	{
		if(provider != null && !provider.equals(""))
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field String provider>
	//*   2    4:ifnull          190
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field String provider>
	//*   5   11:ldc1            #197 <String "">
	//*   6   13:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*   7   16:ifeq            22
	//*   8   19:goto            190
		{
			checkLoginProviderCompatibility();
	//    9   22:aload_0         
	//   10   23:invokespecial   #321 <Method void checkLoginProviderCompatibility()>
			preProcessParameters();
	//   11   26:aload_0         
	//   12   27:invokespecial   #323 <Method void preProcessParameters()>
			String s1 = params.getString("provider", "");
	//   13   30:aload_0         
	//   14   31:getfield        #58  <Field GSObject params>
	//   15   34:ldc1            #61  <String "provider">
	//   16   36:ldc1            #197 <String "">
	//   17   38:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   18   41:astore_3        
			String s;
			if(type == LoginRequestType.login)
	//*  19   42:aload_0         
	//*  20   43:getfield        #50  <Field GSLoginRequest$LoginRequestType type>
	//*  21   46:getstatic       #325 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
	//*  22   49:if_acmpne       59
				s = "socialize.login";
	//   23   52:ldc2            #287 <String "socialize.login">
	//   24   55:astore_2        
			else
	//*  25   56:goto            95
			if(type == LoginRequestType.addConnection)
	//*  26   59:aload_0         
	//*  27   60:getfield        #50  <Field GSLoginRequest$LoginRequestType type>
	//*  28   63:getstatic       #328 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
	//*  29   66:if_acmpne       76
				s = "socialize.addConnection";
	//   30   69:ldc2            #330 <String "socialize.addConnection">
	//   31   72:astore_2        
			else
	//*  32   73:goto            95
			if(type == LoginRequestType.socialLogin)
	//*  33   76:aload_0         
	//*  34   77:getfield        #50  <Field GSLoginRequest$LoginRequestType type>
	//*  35   80:getstatic       #333 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.socialLogin>
	//*  36   83:if_acmpne       93
				s = "accounts.socialLogin";
	//   37   86:ldc2            #335 <String "accounts.socialLogin">
	//   38   89:astore_2        
			else
	//*  39   90:goto            95
				s = null;
	//   40   93:aconst_null     
	//   41   94:astore_2        
			params.put("endPoint", s);
	//   42   95:aload_0         
	//   43   96:getfield        #58  <Field GSObject params>
	//   44   99:ldc2            #285 <String "endPoint">
	//   45  102:aload_2         
	//   46  103:invokevirtual   #157 <Method void GSObject.put(String, String)>
			params.put("gmid", GSAPI.getInstance().getGMID());
	//   47  106:aload_0         
	//   48  107:getfield        #58  <Field GSObject params>
	//   49  110:ldc2            #337 <String "gmid">
	//   50  113:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//   51  116:invokevirtual   #340 <Method String GSAPI.getGMID()>
	//   52  119:invokevirtual   #157 <Method void GSObject.put(String, String)>
			s = params.getString("loginMode", ((String) (null)));
	//   53  122:aload_0         
	//   54  123:getfield        #58  <Field GSObject params>
	//   55  126:ldc2            #342 <String "loginMode">
	//   56  129:aconst_null     
	//   57  130:invokevirtual   #67  <Method String GSObject.getString(String, String)>
	//   58  133:astore_2        
			boolean flag;
			if(s != null && s.equals("reAuth"))
	//*  59  134:aload_2         
	//*  60  135:ifnull          153
	//*  61  138:aload_2         
	//*  62  139:ldc2            #344 <String "reAuth">
	//*  63  142:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  64  145:ifeq            153
				flag = true;
	//   65  148:iconst_1        
	//   66  149:istore_1        
			else
	//*  67  150:goto            155
				flag = false;
	//   68  153:iconst_0        
	//   69  154:istore_1        
			GSAPI.getInstance().loginProviderFactory.getLoginProvider(s1, flag).login(activity, params, silent, new com.gigya.socialize.android.login.providers.LoginProvider.ProviderCallback() {

				public void onResponse(GSObject gsobject)
				{
					String s2 = gsobject.getString("providerToken", ((String) (null)));
				//    0    0:aload_1         
				//    1    1:ldc1            #24  <String "providerToken">
				//    2    3:aconst_null     
				//    3    4:invokevirtual   #30  <Method String GSObject.getString(String, String)>
				//    4    7:astore_2        
					if(s2 != null)
				//*   5    8:aload_2         
				//*   6    9:ifnull          30
					{
						ssoLogin(s2, gsobject.getLong("providerExpiration", -1L));
				//    7   12:aload_0         
				//    8   13:getfield        #17  <Field GSLoginRequest this$0>
				//    9   16:aload_2         
				//   10   17:aload_1         
				//   11   18:ldc1            #32  <String "providerExpiration">
				//   12   20:ldc2w           #33  <Long -1L>
				//   13   23:invokevirtual   #38  <Method long GSObject.getLong(String, long)>
				//   14   26:invokestatic    #42  <Method void GSLoginRequest.access$000(GSLoginRequest, String, long)>
						return;
				//   15   29:return          
					} else
					{
						onLoginResponse(gsobject);
				//   16   30:aload_0         
				//   17   31:getfield        #17  <Field GSLoginRequest this$0>
				//   18   34:aload_1         
				//   19   35:invokestatic    #46  <Method void GSLoginRequest.access$100(GSLoginRequest, GSObject)>
						return;
				//   20   38:return          
					}
				}

				final GSLoginRequest this$0;

			
			{
				this$0 = GSLoginRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSLoginRequest this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   70  155:invokestatic    #118 <Method GSAPI GSAPI.getInstance()>
	//   71  158:getfield        #122 <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//   72  161:aload_3         
	//   73  162:iload_1         
	//   74  163:invokevirtual   #348 <Method LoginProvider LoginProviderFactory.getLoginProvider(String, boolean)>
	//   75  166:aload_0         
	//   76  167:getfield        #52  <Field Activity activity>
	//   77  170:aload_0         
	//   78  171:getfield        #58  <Field GSObject params>
	//   79  174:aload_0         
	//   80  175:getfield        #60  <Field Boolean silent>
	//   81  178:new             #6   <Class GSLoginRequest$1>
	//   82  181:dup             
	//   83  182:aload_0         
	//   84  183:invokespecial   #349 <Method void GSLoginRequest$1(GSLoginRequest)>
	//   85  186:invokevirtual   #354 <Method void LoginProvider.login(Activity, GSObject, Boolean, com.gigya.socialize.android.login.providers.LoginProvider$ProviderCallback)>
			return;
	//   86  189:return          
		} else
		{
			throw new IllegalArgumentException("Missing \"provider\" parameter");
	//   87  190:new             #130 <Class IllegalArgumentException>
	//   88  193:dup             
	//   89  194:ldc2            #356 <String "Missing \"provider\" parameter">
	//   90  197:invokespecial   #135 <Method void IllegalArgumentException(String)>
	//   91  200:athrow          
		}
	}

	private Activity activity;
	protected boolean canceled;
	protected Object context;
	protected int id;
	public GSLogger logger;
	protected GSObject params;
	protected String provider;
	private String providerToken;
	protected GSResponseListener responseListener;
	protected Boolean silent;
	protected LoginRequestType type;


/*
	static void access$000(GSLoginRequest gsloginrequest, String s, long l)
	{
		gsloginrequest.ssoLogin(s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #97  <Method void ssoLogin(String, long)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$100(GSLoginRequest gsloginrequest, GSObject gsobject)
	{
		gsloginrequest.onLoginResponse(gsobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void onLoginResponse(GSObject)>
		return;
	//    3    5:return          
	}

*/
}
