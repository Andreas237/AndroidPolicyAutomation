// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.*;
import java.util.Collection;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, LoginClient

class KatanaProxyLoginMethodHandler extends LoginMethodHandler
{

	KatanaProxyLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void LoginMethodHandler(Parcel)>
	//    3    5:return          
	}

	KatanaProxyLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void LoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	private String getError(Bundle bundle)
	{
		String s1 = bundle.getString("error");
	//    0    0:aload_1         
	//    1    1:ldc1            #27  <String "error">
	//    2    3:invokevirtual   #33  <Method String Bundle.getString(String)>
	//    3    6:astore_3        
		String s = s1;
	//    4    7:aload_3         
	//    5    8:astore_2        
		if(s1 == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       20
			s = bundle.getString("error_type");
	//    8   13:aload_1         
	//    9   14:ldc1            #35  <String "error_type">
	//   10   16:invokevirtual   #33  <Method String Bundle.getString(String)>
	//   11   19:astore_2        
		return s;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	private String getErrorMessage(Bundle bundle)
	{
		String s1 = bundle.getString("error_message");
	//    0    0:aload_1         
	//    1    1:ldc1            #38  <String "error_message">
	//    2    3:invokevirtual   #33  <Method String Bundle.getString(String)>
	//    3    6:astore_3        
		String s = s1;
	//    4    7:aload_3         
	//    5    8:astore_2        
		if(s1 == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       20
			s = bundle.getString("error_description");
	//    8   13:aload_1         
	//    9   14:ldc1            #40  <String "error_description">
	//   10   16:invokevirtual   #33  <Method String Bundle.getString(String)>
	//   11   19:astore_2        
		return s;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	private LoginClient.Result handleResultCancel(LoginClient.Request request, Intent intent)
	{
		intent = ((Intent) (intent.getExtras()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #48  <Method Bundle Intent.getExtras()>
	//    2    4:astore_2        
		String s = getError(((Bundle) (intent)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #50  <Method String getError(Bundle)>
	//    6   10:astore_3        
		String s1 = ((Bundle) (intent)).getString("error_code");
	//    7   11:aload_2         
	//    8   12:ldc1            #52  <String "error_code">
	//    9   14:invokevirtual   #33  <Method String Bundle.getString(String)>
	//   10   17:astore          4
		if("CONNECTION_FAILURE".equals(((Object) (s1))))
	//*  11   19:ldc1            #54  <String "CONNECTION_FAILURE">
	//*  12   21:aload           4
	//*  13   23:invokevirtual   #60  <Method boolean String.equals(Object)>
	//*  14   26:ifeq            42
			return LoginClient.Result.createErrorResult(request, s, getErrorMessage(((Bundle) (intent))), s1);
	//   15   29:aload_1         
	//   16   30:aload_3         
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:invokespecial   #62  <Method String getErrorMessage(Bundle)>
	//   20   36:aload           4
	//   21   38:invokestatic    #68  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String, String)>
	//   22   41:areturn         
		else
			return LoginClient.Result.createCancelResult(request, s);
	//   23   42:aload_1         
	//   24   43:aload_3         
	//   25   44:invokestatic    #72  <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//   26   47:areturn         
	}

	private LoginClient.Result handleResultOk(LoginClient.Request request, Intent intent)
	{
		intent = ((Intent) (intent.getExtras()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #48  <Method Bundle Intent.getExtras()>
	//    2    4:astore_2        
		String s = getError(((Bundle) (intent)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #50  <Method String getError(Bundle)>
	//    6   10:astore_3        
		String s1 = ((Bundle) (intent)).getString("error_code");
	//    7   11:aload_2         
	//    8   12:ldc1            #52  <String "error_code">
	//    9   14:invokevirtual   #33  <Method String Bundle.getString(String)>
	//   10   17:astore          4
		String s2 = getErrorMessage(((Bundle) (intent)));
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokespecial   #62  <Method String getErrorMessage(Bundle)>
	//   14   24:astore          5
		String s3 = ((Bundle) (intent)).getString("e2e");
	//   15   26:aload_2         
	//   16   27:ldc1            #77  <String "e2e">
	//   17   29:invokevirtual   #33  <Method String Bundle.getString(String)>
	//   18   32:astore          6
		if(!Utility.isNullOrEmpty(s3))
	//*  19   34:aload           6
	//*  20   36:invokestatic    #83  <Method boolean Utility.isNullOrEmpty(String)>
	//*  21   39:ifne            48
			logWebLoginCompleted(s3);
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:invokevirtual   #87  <Method void logWebLoginCompleted(String)>
		if(s == null && s1 == null && s2 == null)
	//*  25   48:aload_3         
	//*  26   49:ifnonnull       95
	//*  27   52:aload           4
	//*  28   54:ifnonnull       95
	//*  29   57:aload           5
	//*  30   59:ifnonnull       95
		{
			try
			{
				intent = ((Intent) (LoginClient.Result.createTokenResult(request, createAccessTokenFromWebBundle(((Collection) (request.getPermissions())), ((Bundle) (intent)), AccessTokenSource.FACEBOOK_APPLICATION_WEB, request.getApplicationId()))));
	//   31   62:aload_1         
	//   32   63:aload_1         
	//   33   64:invokevirtual   #93  <Method java.util.Set LoginClient$Request.getPermissions()>
	//   34   67:aload_2         
	//   35   68:getstatic       #99  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   36   71:aload_1         
	//   37   72:invokevirtual   #103 <Method String LoginClient$Request.getApplicationId()>
	//   38   75:invokestatic    #107 <Method com.facebook.AccessToken createAccessTokenFromWebBundle(Collection, Bundle, AccessTokenSource, String)>
	//   39   78:invokestatic    #111 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, com.facebook.AccessToken)>
	//   40   81:astore_2        
			}
	//*  41   82:aload_2         
	//*  42   83:areturn         
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//*  43   84:astore_2        
			{
				return LoginClient.Result.createErrorResult(request, ((String) (null)), ((FacebookException) (intent)).getMessage());
	//   44   85:aload_1         
	//   45   86:aconst_null     
	//   46   87:aload_2         
	//   47   88:invokevirtual   #114 <Method String FacebookException.getMessage()>
	//   48   91:invokestatic    #117 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   49   94:areturn         
			}
			return ((LoginClient.Result) (intent));
		}
		if(ServerProtocol.errorsProxyAuthDisabled.contains(((Object) (s))))
	//*  50   95:getstatic       #123 <Field Collection ServerProtocol.errorsProxyAuthDisabled>
	//*  51   98:aload_3         
	//*  52   99:invokeinterface #128 <Method boolean Collection.contains(Object)>
	//*  53  104:ifeq            109
			return null;
	//   54  107:aconst_null     
	//   55  108:areturn         
		if(ServerProtocol.errorsUserCanceled.contains(((Object) (s))))
	//*  56  109:getstatic       #131 <Field Collection ServerProtocol.errorsUserCanceled>
	//*  57  112:aload_3         
	//*  58  113:invokeinterface #128 <Method boolean Collection.contains(Object)>
	//*  59  118:ifeq            127
			return LoginClient.Result.createCancelResult(request, ((String) (null)));
	//   60  121:aload_1         
	//   61  122:aconst_null     
	//   62  123:invokestatic    #72  <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//   63  126:areturn         
		else
			return LoginClient.Result.createErrorResult(request, s, s2, s1);
	//   64  127:aload_1         
	//   65  128:aload_3         
	//   66  129:aload           5
	//   67  131:aload           4
	//   68  133:invokestatic    #68  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String, String)>
	//   69  136:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getNameForLogging()
	{
		return "katana_proxy_auth";
	//    0    0:ldc1            #136 <String "katana_proxy_auth">
	//    1    2:areturn         
	}

	boolean onActivityResult(int i, int j, Intent intent)
	{
		LoginClient.Request request = loginClient.getPendingRequest();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LoginClient loginClient>
	//    2    4:invokevirtual   #148 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    3    7:astore          4
		if(intent == null)
	//*   4    9:aload_3         
	//*   5   10:ifnonnull       24
			intent = ((Intent) (LoginClient.Result.createCancelResult(request, "Operation canceled")));
	//    6   13:aload           4
	//    7   15:ldc1            #150 <String "Operation canceled">
	//    8   17:invokestatic    #72  <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//    9   20:astore_3        
		else
	//*  10   21:goto            64
		if(j == 0)
	//*  11   24:iload_2         
	//*  12   25:ifne            39
			intent = ((Intent) (handleResultCancel(request, intent)));
	//   13   28:aload_0         
	//   14   29:aload           4
	//   15   31:aload_3         
	//   16   32:invokespecial   #152 <Method LoginClient$Result handleResultCancel(LoginClient$Request, Intent)>
	//   17   35:astore_3        
		else
	//*  18   36:goto            64
		if(j != -1)
	//*  19   39:iload_2         
	//*  20   40:iconst_m1       
	//*  21   41:icmpeq          56
			intent = ((Intent) (LoginClient.Result.createErrorResult(request, "Unexpected resultCode from authorization.", ((String) (null)))));
	//   22   44:aload           4
	//   23   46:ldc1            #154 <String "Unexpected resultCode from authorization.">
	//   24   48:aconst_null     
	//   25   49:invokestatic    #117 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   26   52:astore_3        
		else
	//*  27   53:goto            64
			intent = ((Intent) (handleResultOk(request, intent)));
	//   28   56:aload_0         
	//   29   57:aload           4
	//   30   59:aload_3         
	//   31   60:invokespecial   #156 <Method LoginClient$Result handleResultOk(LoginClient$Request, Intent)>
	//   32   63:astore_3        
		if(intent != null)
	//*  33   64:aload_3         
	//*  34   65:ifnull          79
			loginClient.completeAndValidate(((LoginClient.Result) (intent)));
	//   35   68:aload_0         
	//   36   69:getfield        #142 <Field LoginClient loginClient>
	//   37   72:aload_3         
	//   38   73:invokevirtual   #160 <Method void LoginClient.completeAndValidate(LoginClient$Result)>
		else
	//*  39   76:goto            86
			loginClient.tryNextHandler();
	//   40   79:aload_0         
	//   41   80:getfield        #142 <Field LoginClient loginClient>
	//   42   83:invokevirtual   #163 <Method void LoginClient.tryNextHandler()>
		return true;
	//   43   86:iconst_1        
	//   44   87:ireturn         
	}

	boolean tryAuthorize(LoginClient.Request request)
	{
		String s = LoginClient.getE2E();
	//    0    0:invokestatic    #168 <Method String LoginClient.getE2E()>
	//    1    3:astore_2        
		request = ((LoginClient.Request) (NativeProtocol.createProxyAuthIntent(((android.content.Context) (loginClient.getActivity())), request.getApplicationId(), ((Collection) (request.getPermissions())), s, request.isRerequest(), request.hasPublishPermission(), request.getDefaultAudience())));
	//    2    4:aload_0         
	//    3    5:getfield        #142 <Field LoginClient loginClient>
	//    4    8:invokevirtual   #172 <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #103 <Method String LoginClient$Request.getApplicationId()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #93  <Method java.util.Set LoginClient$Request.getPermissions()>
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #176 <Method boolean LoginClient$Request.isRerequest()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #179 <Method boolean LoginClient$Request.hasPublishPermission()>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #183 <Method DefaultAudience LoginClient$Request.getDefaultAudience()>
	//   16   32:invokestatic    #189 <Method Intent NativeProtocol.createProxyAuthIntent(android.content.Context, String, Collection, String, boolean, boolean, DefaultAudience)>
	//   17   35:astore_1        
		addLoggingExtra("e2e", ((Object) (s)));
	//   18   36:aload_0         
	//   19   37:ldc1            #77  <String "e2e">
	//   20   39:aload_2         
	//   21   40:invokevirtual   #193 <Method void addLoggingExtra(String, Object)>
		return tryIntent(((Intent) (request)), LoginClient.getLoginRequestCode());
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:invokestatic    #196 <Method int LoginClient.getLoginRequestCode()>
	//   25   48:invokevirtual   #200 <Method boolean tryIntent(Intent, int)>
	//   26   51:ireturn         
	}

	protected boolean tryIntent(Intent intent, int i)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		try
		{
			loginClient.getFragment().startActivityForResult(intent, i);
	//    4    6:aload_0         
	//    5    7:getfield        #142 <Field LoginClient loginClient>
	//    6   10:invokevirtual   #206 <Method Fragment LoginClient.getFragment()>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #212 <Method void Fragment.startActivityForResult(Intent, int)>
		}
	//*  10   18:iconst_1        
	//*  11   19:ireturn         
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//*  12   20:astore_1        
		{
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
		}
		return true;
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #216 <Method void LoginMethodHandler.writeToParcel(Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel)
		{
			return new KatanaProxyLoginMethodHandler(parcel);
		//    0    0:new             #8   <Class KatanaProxyLoginMethodHandler>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #18  <Method void KatanaProxyLoginMethodHandler(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method KatanaProxyLoginMethodHandler createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public KatanaProxyLoginMethodHandler[] newArray(int i)
		{
			return new KatanaProxyLoginMethodHandler[i];
		//    0    0:iload_1         
		//    1    1:anewarray       KatanaProxyLoginMethodHandler[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method KatanaProxyLoginMethodHandler[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #6   <Class KatanaProxyLoginMethodHandler$1>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void KatanaProxyLoginMethodHandler$1()>
	//    3    7:putstatic       #16  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
