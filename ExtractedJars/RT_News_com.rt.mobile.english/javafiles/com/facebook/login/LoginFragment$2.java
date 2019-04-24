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
		val$view.findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field View val$view>
	//    2    4:getstatic       #32  <Field int com.facebook.R$id.com_facebook_login_activity_progress_bar>
	//    3    7:invokevirtual   #38  <Method View View.findViewById(int)>
	//    4   10:iconst_0        
	//    5   11:invokevirtual   #42  <Method void View.setVisibility(int)>
	//    6   14:return          
	}

	public void onBackgroundProcessingStopped()
	{
		val$view.findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field View val$view>
	//    2    4:getstatic       #32  <Field int com.facebook.R$id.com_facebook_login_activity_progress_bar>
	//    3    7:invokevirtual   #38  <Method View View.findViewById(int)>
	//    4   10:bipush          8
	//    5   12:invokevirtual   #42  <Method void View.setVisibility(int)>
	//    6   15:return          
	}

	final LoginFragment this$0;
	final View val$view;

	LoginFragment$2()
	{
		this$0 = final_loginfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LoginFragment this$0>
		val$view = View.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View val$view>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
