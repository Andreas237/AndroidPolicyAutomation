// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.WebDialog;

// Referenced classes of package com.facebook.login:
//			WebViewLoginMethodHandler

static class WebViewLoginMethodHandler$AuthDialogBuilder extends com.facebook.internal.WebDialog.Builder
{

	public WebDialog build()
	{
		Bundle bundle = getParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method Bundle getParameters()>
	//    2    4:astore_1        
		bundle.putString("redirect_uri", redirect_uri);
	//    3    5:aload_1         
	//    4    6:ldc1            #31  <String "redirect_uri">
	//    5    8:aload_0         
	//    6    9:getfield        #23  <Field String redirect_uri>
	//    7   12:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		bundle.putString("client_id", getApplicationId());
	//    8   15:aload_1         
	//    9   16:ldc1            #39  <String "client_id">
	//   10   18:aload_0         
	//   11   19:invokevirtual   #43  <Method String getApplicationId()>
	//   12   22:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		bundle.putString("e2e", e2e);
	//   13   25:aload_1         
	//   14   26:ldc1            #44  <String "e2e">
	//   15   28:aload_0         
	//   16   29:getfield        #46  <Field String e2e>
	//   17   32:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		bundle.putString("response_type", "token,signed_request");
	//   18   35:aload_1         
	//   19   36:ldc1            #48  <String "response_type">
	//   20   38:ldc1            #50  <String "token,signed_request">
	//   21   40:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		bundle.putString("return_scopes", "true");
	//   22   43:aload_1         
	//   23   44:ldc1            #52  <String "return_scopes">
	//   24   46:ldc1            #54  <String "true">
	//   25   48:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		bundle.putString("auth_type", authType);
	//   26   51:aload_1         
	//   27   52:ldc1            #56  <String "auth_type">
	//   28   54:aload_0         
	//   29   55:getfield        #58  <Field String authType>
	//   30   58:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		return WebDialog.newInstance(getContext(), "oauth", bundle, getTheme(), getListener());
	//   31   61:aload_0         
	//   32   62:invokevirtual   #62  <Method Context getContext()>
	//   33   65:ldc1            #11  <String "oauth">
	//   34   67:aload_1         
	//   35   68:aload_0         
	//   36   69:invokevirtual   #66  <Method int getTheme()>
	//   37   72:aload_0         
	//   38   73:invokevirtual   #70  <Method com.facebook.internal.WebDialog$OnCompleteListener getListener()>
	//   39   76:invokestatic    #76  <Method WebDialog WebDialog.newInstance(Context, String, Bundle, int, com.facebook.internal.WebDialog$OnCompleteListener)>
	//   40   79:areturn         
	}

	public WebViewLoginMethodHandler$AuthDialogBuilder setAuthType(String s)
	{
		authType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String authType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WebViewLoginMethodHandler$AuthDialogBuilder setE2E(String s)
	{
		e2e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String e2e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WebViewLoginMethodHandler$AuthDialogBuilder setIsChromeOS(boolean flag)
	{
		String s;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			s = "fbconnect://chrome_os_success";
	//    2    4:ldc1            #83  <String "fbconnect://chrome_os_success">
	//    3    6:astore_2        
		else
	//*   4    7:goto            13
			s = "fbconnect://success";
	//    5   10:ldc1            #21  <String "fbconnect://success">
	//    6   12:astore_2        
		redirect_uri = s;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #23  <Field String redirect_uri>
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public WebViewLoginMethodHandler$AuthDialogBuilder setIsRerequest(boolean flag)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private static final String OAUTH_DIALOG = "oauth";
	private String authType;
	private String e2e;
	private String redirect_uri;

	public WebViewLoginMethodHandler$AuthDialogBuilder(Context context, String s, Bundle bundle)
	{
		super(context, s, "oauth", bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #11  <String "oauth">
	//    4    5:aload_3         
	//    5    6:invokespecial   #19  <Method void com.facebook.internal.WebDialog$Builder(Context, String, String, Bundle)>
		redirect_uri = "fbconnect://success";
	//    6    9:aload_0         
	//    7   10:ldc1            #21  <String "fbconnect://success">
	//    8   12:putfield        #23  <Field String redirect_uri>
	//    9   15:return          
	}
}
