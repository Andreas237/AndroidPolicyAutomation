// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.*;

// Referenced classes of package com.facebook.login.widget:
//			LoginButton

public class DeviceLoginButton extends LoginButton
{
	private class DeviceLoginClickListener extends LoginButton.LoginClickListener
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
		//   15   29:invokevirtual   #50  <Method Uri DeviceLoginButton.getDeviceRedirectUri()>
		//   16   32:invokevirtual   #54  <Method void DeviceLoginManager.setDeviceRedirectUri(Uri)>
			return ((LoginManager) (deviceloginmanager));
		//   17   35:aload_1         
		//   18   36:areturn         
		}

		final DeviceLoginButton this$0;

		private DeviceLoginClickListener()
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

	}


	public DeviceLoginButton(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void LoginButton(Context)>
	//    3    5:return          
	}

	public DeviceLoginButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void LoginButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public DeviceLoginButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #22  <Method void LoginButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public Uri getDeviceRedirectUri()
	{
		return deviceRedirectUri;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Uri deviceRedirectUri>
	//    2    4:areturn         
	}

	protected LoginButton.LoginClickListener getNewLoginClickListener()
	{
		return ((LoginButton.LoginClickListener) (new DeviceLoginClickListener()));
	//    0    0:new             #8   <Class DeviceLoginButton$DeviceLoginClickListener>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #31  <Method void DeviceLoginButton$DeviceLoginClickListener(DeviceLoginButton, DeviceLoginButton$1)>
	//    5    9:areturn         
	}

	public void setDeviceRedirectUri(Uri uri)
	{
		deviceRedirectUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Uri deviceRedirectUri>
	//    3    5:return          
	}

	private Uri deviceRedirectUri;
}
