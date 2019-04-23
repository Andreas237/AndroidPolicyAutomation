// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.app.Activity;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;

// Referenced classes of package com.facebook.login.widget:
//			LoginButton

class LoginButton$1$1
	implements Runnable
{

	public void run()
	{
		LoginButton.access$000(this$0, val$settings);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LoginButton$1 this$1>
	//    2    4:getfield        #28  <Field LoginButton LoginButton$1.this$0>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field FetchedAppSettings val$settings>
	//    5   11:invokestatic    #34  <Method void LoginButton.access$000(LoginButton, FetchedAppSettings)>
	//    6   14:return          
	}

	final LoginButton._cls1 this$1;
	final FetchedAppSettings val$settings;

	LoginButton$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LoginButton$1 this$1>
		val$settings = FetchedAppSettings.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FetchedAppSettings val$settings>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/facebook/login/widget/LoginButton$1

/* anonymous class */
	class LoginButton._cls1
		implements Runnable
	{

		public void run()
		{
			FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.queryAppSettings(appId, false);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String val$appId>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #33  <Method FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
		//    4    8:astore_1        
			LoginButton.access$100(LoginButton.this).runOnUiThread(((Runnable) (((LoginButton._cls1._cls1) (fetchedappsettings)). new LoginButton._cls1._cls1())));
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field LoginButton this$0>
		//    7   13:invokestatic    #37  <Method Activity LoginButton.access$100(LoginButton)>
		//    8   16:new             #13  <Class LoginButton$1$1>
		//    9   19:dup             
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokespecial   #40  <Method void LoginButton$1$1(LoginButton$1, FetchedAppSettings)>
		//   13   25:invokevirtual   #46  <Method void Activity.runOnUiThread(Runnable)>
		//   14   28:return          
		}

		final LoginButton this$0;
		final String val$appId;

			
			{
				this$0 = final_loginbutton;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field LoginButton this$0>
				appId = String.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$appId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
	}

}
