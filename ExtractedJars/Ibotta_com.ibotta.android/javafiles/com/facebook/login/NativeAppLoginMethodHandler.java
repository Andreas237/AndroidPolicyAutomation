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
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import java.util.Collection;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, LoginClient

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler
{

	NativeAppLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void LoginMethodHandler(Parcel)>
	//    3    5:return          
	}

	NativeAppLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void LoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	private String getError(Bundle bundle)
	{
		String s1 = bundle.getString("error");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "error">
	//    2    3:invokevirtual   #22  <Method String Bundle.getString(String)>
	//    3    6:astore_3        
		String s = s1;
	//    4    7:aload_3         
	//    5    8:astore_2        
		if(s1 == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       20
			s = bundle.getString("error_type");
	//    8   13:aload_1         
	//    9   14:ldc1            #24  <String "error_type">
	//   10   16:invokevirtual   #22  <Method String Bundle.getString(String)>
	//   11   19:astore_2        
		return s;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	private String getErrorMessage(Bundle bundle)
	{
		String s1 = bundle.getString("error_message");
	//    0    0:aload_1         
	//    1    1:ldc1            #27  <String "error_message">
	//    2    3:invokevirtual   #22  <Method String Bundle.getString(String)>
	//    3    6:astore_3        
		String s = s1;
	//    4    7:aload_3         
	//    5    8:astore_2        
		if(s1 == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       20
			s = bundle.getString("error_description");
	//    8   13:aload_1         
	//    9   14:ldc1            #29  <String "error_description">
	//   10   16:invokevirtual   #22  <Method String Bundle.getString(String)>
	//   11   19:astore_2        
		return s;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	private LoginClient.Result handleResultCancel(LoginClient.Request request, Intent intent)
	{
		Bundle bundle = intent.getExtras();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #37  <Method Bundle Intent.getExtras()>
	//    2    4:astore_3        
		String s = getError(bundle);
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:invokespecial   #39  <Method String getError(Bundle)>
	//    6   10:astore          4
		if(bundle.get("error_code") != null)
	//*   7   12:aload_3         
	//*   8   13:ldc1            #41  <String "error_code">
	//*   9   15:invokevirtual   #45  <Method Object Bundle.get(String)>
	//*  10   18:ifnull          34
			intent = ((Intent) (bundle.get("error_code").toString()));
	//   11   21:aload_3         
	//   12   22:ldc1            #41  <String "error_code">
	//   13   24:invokevirtual   #45  <Method Object Bundle.get(String)>
	//   14   27:invokevirtual   #51  <Method String Object.toString()>
	//   15   30:astore_2        
		else
	//*  16   31:goto            36
			intent = null;
	//   17   34:aconst_null     
	//   18   35:astore_2        
		if("CONNECTION_FAILURE".equals(((Object) (intent))))
	//*  19   36:ldc1            #53  <String "CONNECTION_FAILURE">
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  22   42:ifeq            58
			return LoginClient.Result.createErrorResult(request, s, getErrorMessage(bundle), ((String) (intent)));
	//   23   45:aload_1         
	//   24   46:aload           4
	//   25   48:aload_0         
	//   26   49:aload_3         
	//   27   50:invokespecial   #61  <Method String getErrorMessage(Bundle)>
	//   28   53:aload_2         
	//   29   54:invokestatic    #67  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String, String)>
	//   30   57:areturn         
		else
			return LoginClient.Result.createCancelResult(request, s);
	//   31   58:aload_1         
	//   32   59:aload           4
	//   33   61:invokestatic    #71  <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//   34   64:areturn         
	}

	private LoginClient.Result handleResultOk(LoginClient.Request request, Intent intent)
	{
		Bundle bundle = intent.getExtras();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #37  <Method Bundle Intent.getExtras()>
	//    2    4:astore_3        
		String s = getError(bundle);
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:invokespecial   #39  <Method String getError(Bundle)>
	//    6   10:astore          4
		if(bundle.get("error_code") != null)
	//*   7   12:aload_3         
	//*   8   13:ldc1            #41  <String "error_code">
	//*   9   15:invokevirtual   #45  <Method Object Bundle.get(String)>
	//*  10   18:ifnull          34
			intent = ((Intent) (bundle.get("error_code").toString()));
	//   11   21:aload_3         
	//   12   22:ldc1            #41  <String "error_code">
	//   13   24:invokevirtual   #45  <Method Object Bundle.get(String)>
	//   14   27:invokevirtual   #51  <Method String Object.toString()>
	//   15   30:astore_2        
		else
	//*  16   31:goto            36
			intent = null;
	//   17   34:aconst_null     
	//   18   35:astore_2        
		String s1 = getErrorMessage(bundle);
	//   19   36:aload_0         
	//   20   37:aload_3         
	//   21   38:invokespecial   #61  <Method String getErrorMessage(Bundle)>
	//   22   41:astore          5
		String s2 = bundle.getString("e2e");
	//   23   43:aload_3         
	//   24   44:ldc1            #76  <String "e2e">
	//   25   46:invokevirtual   #22  <Method String Bundle.getString(String)>
	//   26   49:astore          6
		if(!Utility.isNullOrEmpty(s2))
	//*  27   51:aload           6
	//*  28   53:invokestatic    #82  <Method boolean Utility.isNullOrEmpty(String)>
	//*  29   56:ifne            65
			logWebLoginCompleted(s2);
	//   30   59:aload_0         
	//   31   60:aload           6
	//   32   62:invokevirtual   #86  <Method void logWebLoginCompleted(String)>
		if(s == null && intent == null && s1 == null)
	//*  33   65:aload           4
	//*  34   67:ifnonnull       112
	//*  35   70:aload_2         
	//*  36   71:ifnonnull       112
	//*  37   74:aload           5
	//*  38   76:ifnonnull       112
		{
			try
			{
				intent = ((Intent) (LoginClient.Result.createTokenResult(request, createAccessTokenFromWebBundle(((Collection) (request.getPermissions())), bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, request.getApplicationId()))));
	//   39   79:aload_1         
	//   40   80:aload_1         
	//   41   81:invokevirtual   #92  <Method java.util.Set LoginClient$Request.getPermissions()>
	//   42   84:aload_3         
	//   43   85:getstatic       #98  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   44   88:aload_1         
	//   45   89:invokevirtual   #101 <Method String LoginClient$Request.getApplicationId()>
	//   46   92:invokestatic    #105 <Method com.facebook.AccessToken createAccessTokenFromWebBundle(Collection, Bundle, AccessTokenSource, String)>
	//   47   95:invokestatic    #109 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, com.facebook.AccessToken)>
	//   48   98:astore_2        
			}
	//*  49   99:aload_2         
	//*  50  100:areturn         
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//*  51  101:astore_2        
			{
				return LoginClient.Result.createErrorResult(request, ((String) (null)), ((FacebookException) (intent)).getMessage());
	//   52  102:aload_1         
	//   53  103:aconst_null     
	//   54  104:aload_2         
	//   55  105:invokevirtual   #112 <Method String FacebookException.getMessage()>
	//   56  108:invokestatic    #115 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   57  111:areturn         
			}
			return ((LoginClient.Result) (intent));
		}
		if(ServerProtocol.errorsProxyAuthDisabled.contains(((Object) (s))))
	//*  58  112:getstatic       #121 <Field Collection ServerProtocol.errorsProxyAuthDisabled>
	//*  59  115:aload           4
	//*  60  117:invokeinterface #126 <Method boolean Collection.contains(Object)>
	//*  61  122:ifeq            127
			return null;
	//   62  125:aconst_null     
	//   63  126:areturn         
		if(ServerProtocol.errorsUserCanceled.contains(((Object) (s))))
	//*  64  127:getstatic       #129 <Field Collection ServerProtocol.errorsUserCanceled>
	//*  65  130:aload           4
	//*  66  132:invokeinterface #126 <Method boolean Collection.contains(Object)>
	//*  67  137:ifeq            146
			return LoginClient.Result.createCancelResult(request, ((String) (null)));
	//   68  140:aload_1         
	//   69  141:aconst_null     
	//   70  142:invokestatic    #71  <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//   71  145:areturn         
		else
			return LoginClient.Result.createErrorResult(request, s, s1, ((String) (intent)));
	//   72  146:aload_1         
	//   73  147:aload           4
	//   74  149:aload           5
	//   75  151:aload_2         
	//   76  152:invokestatic    #67  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String, String)>
	//   77  155:areturn         
	}

	boolean onActivityResult(int i, int j, Intent intent)
	{
		LoginClient.Request request = loginClient.getPendingRequest();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field LoginClient loginClient>
	//    2    4:invokevirtual   #141 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    3    7:astore          4
		if(intent == null)
	//*   4    9:aload_3         
	//*   5   10:ifnonnull       24
			intent = ((Intent) (LoginClient.Result.createCancelResult(request, "Operation canceled")));
	//    6   13:aload           4
	//    7   15:ldc1            #143 <String "Operation canceled">
	//    8   17:invokestatic    #71  <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
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
	//   16   32:invokespecial   #145 <Method LoginClient$Result handleResultCancel(LoginClient$Request, Intent)>
	//   17   35:astore_3        
		else
	//*  18   36:goto            64
		if(j != -1)
	//*  19   39:iload_2         
	//*  20   40:iconst_m1       
	//*  21   41:icmpeq          56
			intent = ((Intent) (LoginClient.Result.createErrorResult(request, "Unexpected resultCode from authorization.", ((String) (null)))));
	//   22   44:aload           4
	//   23   46:ldc1            #147 <String "Unexpected resultCode from authorization.">
	//   24   48:aconst_null     
	//   25   49:invokestatic    #115 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   26   52:astore_3        
		else
	//*  27   53:goto            64
			intent = ((Intent) (handleResultOk(request, intent)));
	//   28   56:aload_0         
	//   29   57:aload           4
	//   30   59:aload_3         
	//   31   60:invokespecial   #149 <Method LoginClient$Result handleResultOk(LoginClient$Request, Intent)>
	//   32   63:astore_3        
		if(intent != null)
	//*  33   64:aload_3         
	//*  34   65:ifnull          79
			loginClient.completeAndValidate(((LoginClient.Result) (intent)));
	//   35   68:aload_0         
	//   36   69:getfield        #135 <Field LoginClient loginClient>
	//   37   72:aload_3         
	//   38   73:invokevirtual   #153 <Method void LoginClient.completeAndValidate(LoginClient$Result)>
		else
	//*  39   76:goto            86
			loginClient.tryNextHandler();
	//   40   79:aload_0         
	//   41   80:getfield        #135 <Field LoginClient loginClient>
	//   42   83:invokevirtual   #157 <Method void LoginClient.tryNextHandler()>
		return true;
	//   43   86:iconst_1        
	//   44   87:ireturn         
	}

	abstract boolean tryAuthorize(LoginClient.Request request);

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
	//    5    7:getfield        #135 <Field LoginClient loginClient>
	//    6   10:invokevirtual   #167 <Method Fragment LoginClient.getFragment()>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #173 <Method void Fragment.startActivityForResult(Intent, int)>
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
}
