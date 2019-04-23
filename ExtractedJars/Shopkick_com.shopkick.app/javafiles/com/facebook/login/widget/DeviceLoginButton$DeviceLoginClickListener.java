// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import com.facebook.login.*;

// Referenced classes of package com.facebook.login.widget:
//			DeviceLoginButton

private class DeviceLoginButton$DeviceLoginClickListener extends LoginButton.LoginClickListener
{

	protected LoginManager getLoginManager()
	{
		DeviceLoginManager deviceloginmanager = DeviceLoginManager.getInstance();
	//    0    0:invokestatic    #28  <Method DeviceLoginManager DeviceLoginManager.getInstance()>
	//    1    3:astore_1        
		deviceloginmanager.setDefaultAudience(getDefaultAudience());
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field DeviceLoginButton this$0>
	//    5    9:invokevirtual   #32  <Method com.facebook.login.DefaultAudience DeviceLoginButton.getDefaultAudience()>
	//    6   12:invokevirtual   #36  <Method LoginManager DeviceLoginManager.setDefaultAudience(com.facebook.login.DefaultAudience)>
	//    7   15:pop             
		deviceloginmanager.setLoginBehavior(LoginBehavior.DEVICE_AUTH);
	//    8   16:aload_1         
	//    9   17:getstatic       #42  <Field LoginBehavior LoginBehavior.DEVICE_AUTH>
	//   10   20:invokevirtual   #46  <Method LoginManager DeviceLoginManager.setLoginBehavior(LoginBehavior)>
	//   11   23:pop             
		deviceloginmanager.setDeviceRedirectUri(getDeviceRedirectUri());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #13  <Field DeviceLoginButton this$0>
	//   15   29:invokevirtual   #50  <Method android.net.Uri DeviceLoginButton.getDeviceRedirectUri()>
	//   16   32:invokevirtual   #54  <Method void DeviceLoginManager.setDeviceRedirectUri(android.net.Uri)>
		return ((LoginManager) (deviceloginmanager));
	//   17   35:aload_1         
	//   18   36:areturn         
	}

	final DeviceLoginButton this$0;

	private DeviceLoginButton$DeviceLoginClickListener()
	{
		this$0 = DeviceLoginButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field DeviceLoginButton this$0>
		super(((LoginButton) (DeviceLoginButton.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #16  <Method void LoginButton$LoginClickListener(LoginButton)>
	//    6   10:return          
	}

	DeviceLoginButton$DeviceLoginClickListener(DeviceLoginButton._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void DeviceLoginButton$DeviceLoginClickListener(DeviceLoginButton)>
	//    3    5:return          
	}
}
