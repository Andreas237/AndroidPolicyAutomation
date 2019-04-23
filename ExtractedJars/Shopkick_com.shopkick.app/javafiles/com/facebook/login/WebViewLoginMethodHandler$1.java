// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.login:
//			WebViewLoginMethodHandler

class WebViewLoginMethodHandler$1
	implements com.facebook.internal.
{

	public void onComplete(Bundle bundle, FacebookException facebookexception)
	{
		onWebDialogComplete(val$request, bundle, facebookexception);
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

	WebViewLoginMethodHandler$1()
	{
		this$0 = final_webviewloginmethodhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field WebViewLoginMethodHandler this$0>
		val$request = LoginClient.Request.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field LoginClient$Request val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
