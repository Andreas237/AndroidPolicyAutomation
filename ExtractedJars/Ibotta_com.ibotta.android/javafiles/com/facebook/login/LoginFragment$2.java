// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.view.View;

// Referenced classes of package com.facebook.login:
//			LoginFragment

class LoginFragment$2
	implements groundProcessingListener
{

	public void onBackgroundProcessingStarted()
	{
		val$progressBar.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field View val$progressBar>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #32  <Method void View.setVisibility(int)>
	//    4    8:return          
	}

	public void onBackgroundProcessingStopped()
	{
		val$progressBar.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field View val$progressBar>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #32  <Method void View.setVisibility(int)>
	//    4    9:return          
	}

	final LoginFragment this$0;
	final View val$progressBar;

	LoginFragment$2()
	{
		this$0 = final_loginfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LoginFragment this$0>
		val$progressBar = View.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View val$progressBar>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
