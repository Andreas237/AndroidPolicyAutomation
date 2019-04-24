// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


// Referenced classes of package com.pactforcure.app.api.dto:
//			BaseDtoV2, User

public class LoginResponse extends BaseDtoV2
{

	public LoginResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void BaseDtoV2()>
	//    2    4:return          
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String token>
	//    2    4:areturn         
	}

	public User getUser()
	{
		return user;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field User user>
	//    2    4:areturn         
	}

	public void setToken(String s)
	{
		token = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String token>
	//    3    5:return          
	}

	public void setUser(User user1)
	{
		user = user1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field User user>
	//    3    5:return          
	}

	private String token;
	private User user;
}
