// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;

// Referenced classes of package com.facebook.login.widget:
//			LoginButton

class LoginButton$2 extends AccessTokenTracker
{

	protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
	{
		LoginButton.access$200(LoginButton.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LoginButton this$0>
	//    2    4:invokestatic    #24  <Method void LoginButton.access$200(LoginButton)>
	//    3    7:return          
	}

	final LoginButton this$0;

	LoginButton$2()
	{
		this$0 = LoginButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field LoginButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AccessTokenTracker()>
	//    5    9:return          
	}
}
