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
		val$loginManager.logOut();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field LoginManager val$loginManager>
	//    2    4:invokevirtual   #35  <Method void LoginManager.logOut()>
	//    3    7:return          
	}

	final LoginButton.LoginClickListener this$1;
	final LoginManager val$loginManager;

	LoginButton$LoginClickListener$1()
	{
		this$1 = final_loginclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field LoginButton$LoginClickListener this$1>
		val$loginManager = LoginManager.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field LoginManager val$loginManager>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
