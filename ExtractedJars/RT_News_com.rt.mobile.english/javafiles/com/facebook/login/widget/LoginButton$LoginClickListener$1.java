// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.content.DialogInterface;
import com.facebook.login.LoginManager;

// Referenced classes of package com.facebook.login.widget:
//			LoginButton

class LoginButton$LoginClickListener$1
	implements android.content.DialogInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		getLoginManager().logOut();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field LoginButton$LoginClickListener this$1>
	//    2    4:getfield        #29  <Field LoginButton LoginButton$LoginClickListener.this$0>
	//    3    7:invokevirtual   #33  <Method LoginManager LoginButton.getLoginManager()>
	//    4   10:invokevirtual   #38  <Method void LoginManager.logOut()>
	//    5   13:return          
	}

	final LoginButton.LoginClickListener this$1;

	LoginButton$LoginClickListener$1()
	{
		this$1 = LoginButton.LoginClickListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field LoginButton$LoginClickListener this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
