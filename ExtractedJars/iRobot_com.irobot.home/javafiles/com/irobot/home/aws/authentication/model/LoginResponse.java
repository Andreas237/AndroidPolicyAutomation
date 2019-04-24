// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.aws.authentication.model;

import java.util.HashMap;

// Referenced classes of package com.irobot.home.aws.authentication.model:
//			LoginResponseCredentials

public class LoginResponse
{

	public LoginResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mCredentials = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field LoginResponseCredentials mCredentials>
	//    5    9:return          
	}

	public HashMap getAssociations()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public LoginResponseCredentials getCredentials()
	{
		return mCredentials;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LoginResponseCredentials mCredentials>
	//    2    4:areturn         
	}

	public boolean hasValidCredentials()
	{
		return mCredentials != null && mCredentials.isValid();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LoginResponseCredentials mCredentials>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field LoginResponseCredentials mCredentials>
	//    5   11:invokevirtual   #30  <Method boolean LoginResponseCredentials.isValid()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void setCredentials(LoginResponseCredentials loginresponsecredentials)
	{
		mCredentials = loginresponsecredentials;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field LoginResponseCredentials mCredentials>
	//    3    5:return          
	}

	private LoginResponseCredentials mCredentials;
}
