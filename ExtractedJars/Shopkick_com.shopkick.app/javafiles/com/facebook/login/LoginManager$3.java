// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Intent;

// Referenced classes of package com.facebook.login:
//			LoginManager

class LoginManager$3
	implements com.facebook.internal.Impl.Callback
{

	public boolean onActivityResult(int i, Intent intent)
	{
		return LoginManager.this.onActivityResult(i, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LoginManager this$0>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method boolean LoginManager.onActivityResult(int, Intent)>
	//    5    9:ireturn         
	}

	final LoginManager this$0;

	LoginManager$3()
	{
		this$0 = LoginManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LoginManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
