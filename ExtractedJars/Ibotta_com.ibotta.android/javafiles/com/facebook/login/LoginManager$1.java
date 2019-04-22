// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Intent;
import com.facebook.FacebookCallback;

// Referenced classes of package com.facebook.login:
//			LoginManager

class LoginManager$1
	implements com.facebook.internal.Impl.Callback
{

	public boolean onActivityResult(int i, Intent intent)
	{
		return LoginManager.this.onActivityResult(i, intent, val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LoginManager this$0>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field FacebookCallback val$callback>
	//    6   10:invokevirtual   #30  <Method boolean LoginManager.onActivityResult(int, Intent, FacebookCallback)>
	//    7   13:ireturn         
	}

	final LoginManager this$0;
	final FacebookCallback val$callback;

	LoginManager$1()
	{
		this$0 = final_loginmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LoginManager this$0>
		val$callback = FacebookCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FacebookCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
