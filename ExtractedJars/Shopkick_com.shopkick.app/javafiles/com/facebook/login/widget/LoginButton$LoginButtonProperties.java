// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.Utility;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.login.widget:
//			LoginButton

static class LoginButton$LoginButtonProperties
{

	public void clearPermissions()
	{
		permissions = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #37  <Field List permissions>
		authorizationType = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #39  <Field LoginAuthorizationType authorizationType>
	//    6   10:return          
	}

	public String getAuthType()
	{
		return authType;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String authType>
	//    2    4:areturn         
	}

	public DefaultAudience getDefaultAudience()
	{
		return defaultAudience;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DefaultAudience defaultAudience>
	//    2    4:areturn         
	}

	public LoginBehavior getLoginBehavior()
	{
		return loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LoginBehavior loginBehavior>
	//    2    4:areturn         
	}

	List getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List permissions>
	//    2    4:areturn         
	}

	public void setAuthType(String s)
	{
		authType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String authType>
	//    3    5:return          
	}

	public void setDefaultAudience(DefaultAudience defaultaudience)
	{
		defaultAudience = defaultaudience;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field DefaultAudience defaultAudience>
	//    3    5:return          
	}

	public void setLoginBehavior(LoginBehavior loginbehavior)
	{
		loginBehavior = loginbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field LoginBehavior loginBehavior>
	//    3    5:return          
	}

	public void setPublishPermissions(List list)
	{
		if(!LoginAuthorizationType.READ.equals(((Object) (authorizationType))))
	//*   0    0:getstatic       #78  <Field LoginAuthorizationType LoginAuthorizationType.READ>
	//*   1    3:aload_0         
	//*   2    4:getfield        #39  <Field LoginAuthorizationType authorizationType>
	//*   3    7:invokevirtual   #82  <Method boolean LoginAuthorizationType.equals(Object)>
	//*   4   10:ifne            43
		{
			if(!Utility.isNullOrEmpty(((java.util.Collection) (list))))
	//*   5   13:aload_1         
	//*   6   14:invokestatic    #88  <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*   7   17:ifne            33
			{
				permissions = list;
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:putfield        #37  <Field List permissions>
				authorizationType = LoginAuthorizationType.PUBLISH;
	//   11   25:aload_0         
	//   12   26:getstatic       #91  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
	//   13   29:putfield        #39  <Field LoginAuthorizationType authorizationType>
				return;
	//   14   32:return          
			} else
			{
				throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
	//   15   33:new             #93  <Class IllegalArgumentException>
	//   16   36:dup             
	//   17   37:ldc1            #95  <String "Permissions for publish actions cannot be null or empty.">
	//   18   39:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   19   42:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
	//   20   43:new             #99  <Class UnsupportedOperationException>
	//   21   46:dup             
	//   22   47:ldc1            #101 <String "Cannot call setPublishPermissions after setReadPermissions has been called.">
	//   23   49:invokespecial   #102 <Method void UnsupportedOperationException(String)>
	//   24   52:athrow          
		}
	}

	public void setReadPermissions(List list)
	{
		if(!LoginAuthorizationType.PUBLISH.equals(((Object) (authorizationType))))
	//*   0    0:getstatic       #91  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
	//*   1    3:aload_0         
	//*   2    4:getfield        #39  <Field LoginAuthorizationType authorizationType>
	//*   3    7:invokevirtual   #82  <Method boolean LoginAuthorizationType.equals(Object)>
	//*   4   10:ifne            26
		{
			permissions = list;
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:putfield        #37  <Field List permissions>
			authorizationType = LoginAuthorizationType.READ;
	//    8   18:aload_0         
	//    9   19:getstatic       #78  <Field LoginAuthorizationType LoginAuthorizationType.READ>
	//   10   22:putfield        #39  <Field LoginAuthorizationType authorizationType>
			return;
	//   11   25:return          
		} else
		{
			throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
	//   12   26:new             #99  <Class UnsupportedOperationException>
	//   13   29:dup             
	//   14   30:ldc1            #106 <String "Cannot call setReadPermissions after setPublishPermissions has been called.">
	//   15   32:invokespecial   #102 <Method void UnsupportedOperationException(String)>
	//   16   35:athrow          
		}
	}

	private String authType;
	private LoginAuthorizationType authorizationType;
	private DefaultAudience defaultAudience;
	private LoginBehavior loginBehavior;
	private List permissions;


/*
	static LoginAuthorizationType access$600(LoginButton$LoginButtonProperties loginbutton$loginbuttonproperties)
	{
		return loginbutton$loginbuttonproperties.authorizationType;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field LoginAuthorizationType authorizationType>
	//    2    4:areturn         
	}

*/


/*
	static List access$700(LoginButton$LoginButtonProperties loginbutton$loginbuttonproperties)
	{
		return loginbutton$loginbuttonproperties.permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List permissions>
	//    2    4:areturn         
	}

*/

	LoginButton$LoginButtonProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		defaultAudience = DefaultAudience.FRIENDS;
	//    2    4:aload_0         
	//    3    5:getstatic       #27  <Field DefaultAudience DefaultAudience.FRIENDS>
	//    4    8:putfield        #29  <Field DefaultAudience defaultAudience>
		permissions = Collections.emptyList();
	//    5   11:aload_0         
	//    6   12:invokestatic    #35  <Method List Collections.emptyList()>
	//    7   15:putfield        #37  <Field List permissions>
		authorizationType = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #39  <Field LoginAuthorizationType authorizationType>
		loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
	//   11   23:aload_0         
	//   12   24:getstatic       #44  <Field LoginBehavior LoginBehavior.NATIVE_WITH_FALLBACK>
	//   13   27:putfield        #46  <Field LoginBehavior loginBehavior>
		authType = "rerequest";
	//   14   30:aload_0         
	//   15   31:ldc1            #48  <String "rerequest">
	//   16   33:putfield        #50  <Field String authType>
	//   17   36:return          
	}
}
