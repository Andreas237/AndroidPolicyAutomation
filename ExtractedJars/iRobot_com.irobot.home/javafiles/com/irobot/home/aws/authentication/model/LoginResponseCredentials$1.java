// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.aws.authentication.model;

import com.amazonaws.auth.AWSSessionCredentials;

// Referenced classes of package com.irobot.home.aws.authentication.model:
//			LoginResponseCredentials

class LoginResponseCredentials$1
	implements AWSSessionCredentials
{

	public String a()
	{
		return LoginResponseCredentials.access$100(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LoginResponseCredentials a>
	//    2    4:invokestatic    #26  <Method String LoginResponseCredentials.access$100(LoginResponseCredentials)>
	//    3    7:areturn         
	}

	public String b()
	{
		return LoginResponseCredentials.access$200(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LoginResponseCredentials a>
	//    2    4:invokestatic    #30  <Method String LoginResponseCredentials.access$200(LoginResponseCredentials)>
	//    3    7:areturn         
	}

	public String c()
	{
		return LoginResponseCredentials.access$000(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LoginResponseCredentials a>
	//    2    4:invokestatic    #34  <Method String LoginResponseCredentials.access$000(LoginResponseCredentials)>
	//    3    7:areturn         
	}

	final LoginResponseCredentials a;

	LoginResponseCredentials$1(LoginResponseCredentials loginresponsecredentials)
	{
		a = loginresponsecredentials;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LoginResponseCredentials a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
