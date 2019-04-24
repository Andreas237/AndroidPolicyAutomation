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
	//    2    2:putfield        #35  <Field List permissions>
		authorizationType = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #37  <Field LoginAuthorizationType authorizationType>
	//    6   10:return          
	}

	public DefaultAudience getDefaultAudience()
	{
		return defaultAudience;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DefaultAudience defaultAudience>
	//    2    4:areturn         
	}

	public LoginBehavior getLoginBehavior()
	{
		return loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field LoginBehavior loginBehavior>
	//    2    4:areturn         
	}

	List getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List permissions>
	//    2    4:areturn         
	}

	public void setDefaultAudience(DefaultAudience defaultaudience)
	{
		defaultAudience = defaultaudience;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field DefaultAudience defaultAudience>
	//    3    5:return          
	}

	public void setLoginBehavior(LoginBehavior loginbehavior)
	{
		loginBehavior = loginbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field LoginBehavior loginBehavior>
	//    3    5:return          
	}

	public void setPublishPermissions(List list)
	{
		if(LoginAuthorizationType.READ.equals(((Object) (authorizationType))))
	//*   0    0:getstatic       #68  <Field LoginAuthorizationType LoginAuthorizationType.READ>
	//*   1    3:aload_0         
	//*   2    4:getfield        #37  <Field LoginAuthorizationType authorizationType>
	//*   3    7:invokevirtual   #72  <Method boolean LoginAuthorizationType.equals(Object)>
	//*   4   10:ifeq            23
			throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
	//    5   13:new             #74  <Class UnsupportedOperationException>
	//    6   16:dup             
	//    7   17:ldc1            #76  <String "Cannot call setPublishPermissions after setReadPermissions has been called.">
	//    8   19:invokespecial   #79  <Method void UnsupportedOperationException(String)>
	//    9   22:athrow          
		if(Utility.isNullOrEmpty(((java.util.Collection) (list))))
	//*  10   23:aload_1         
	//*  11   24:invokestatic    #85  <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  12   27:ifeq            40
		{
			throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
	//   13   30:new             #87  <Class IllegalArgumentException>
	//   14   33:dup             
	//   15   34:ldc1            #89  <String "Permissions for publish actions cannot be null or empty.">
	//   16   36:invokespecial   #90  <Method void IllegalArgumentException(String)>
	//   17   39:athrow          
		} else
		{
			permissions = list;
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:putfield        #35  <Field List permissions>
			authorizationType = LoginAuthorizationType.PUBLISH;
	//   21   45:aload_0         
	//   22   46:getstatic       #93  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
	//   23   49:putfield        #37  <Field LoginAuthorizationType authorizationType>
			return;
	//   24   52:return          
		}
	}

	public void setReadPermissions(List list)
	{
		if(LoginAuthorizationType.PUBLISH.equals(((Object) (authorizationType))))
	//*   0    0:getstatic       #93  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
	//*   1    3:aload_0         
	//*   2    4:getfield        #37  <Field LoginAuthorizationType authorizationType>
	//*   3    7:invokevirtual   #72  <Method boolean LoginAuthorizationType.equals(Object)>
	//*   4   10:ifeq            23
		{
			throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
	//    5   13:new             #74  <Class UnsupportedOperationException>
	//    6   16:dup             
	//    7   17:ldc1            #97  <String "Cannot call setReadPermissions after setPublishPermissions has been called.">
	//    8   19:invokespecial   #79  <Method void UnsupportedOperationException(String)>
	//    9   22:athrow          
		} else
		{
			permissions = list;
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:putfield        #35  <Field List permissions>
			authorizationType = LoginAuthorizationType.READ;
	//   13   28:aload_0         
	//   14   29:getstatic       #68  <Field LoginAuthorizationType LoginAuthorizationType.READ>
	//   15   32:putfield        #37  <Field LoginAuthorizationType authorizationType>
			return;
	//   16   35:return          
		}
	}

	private LoginAuthorizationType authorizationType;
	private DefaultAudience defaultAudience;
	private LoginBehavior loginBehavior;
	private List permissions;


/*
	static LoginAuthorizationType access$700(LoginButton$LoginButtonProperties loginbutton$loginbuttonproperties)
	{
		return loginbutton$loginbuttonproperties.authorizationType;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field LoginAuthorizationType authorizationType>
	//    2    4:areturn         
	}

*/


/*
	static List access$800(LoginButton$LoginButtonProperties loginbutton$loginbuttonproperties)
	{
		return loginbutton$loginbuttonproperties.permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List permissions>
	//    2    4:areturn         
	}

*/

	LoginButton$LoginButtonProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		defaultAudience = DefaultAudience.FRIENDS;
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field DefaultAudience DefaultAudience.FRIENDS>
	//    4    8:putfield        #27  <Field DefaultAudience defaultAudience>
		permissions = Collections.emptyList();
	//    5   11:aload_0         
	//    6   12:invokestatic    #33  <Method List Collections.emptyList()>
	//    7   15:putfield        #35  <Field List permissions>
		authorizationType = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #37  <Field LoginAuthorizationType authorizationType>
		loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
	//   11   23:aload_0         
	//   12   24:getstatic       #42  <Field LoginBehavior LoginBehavior.NATIVE_WITH_FALLBACK>
	//   13   27:putfield        #44  <Field LoginBehavior loginBehavior>
	//   14   30:return          
	}
}
