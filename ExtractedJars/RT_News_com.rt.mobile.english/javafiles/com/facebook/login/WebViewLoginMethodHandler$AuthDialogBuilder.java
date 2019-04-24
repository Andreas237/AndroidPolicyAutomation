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

	public WebViewLoginMethodHandler$AuthDialogBuilder setIsRerequest(boolean flag)
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

	public WebViewLoginMethodHandler$AuthDialogBuilder(Context context, String s, Bundle bundle)
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
