// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


// Referenced classes of package com.pactforcure.app.api.dto:
//			BaseDtoV2

public class ResetPasswordResponse extends BaseDtoV2
{

	public ResetPasswordResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BaseDtoV2()>
	//    2    4:return          
	}

	public String getEmail()
	{
		return email;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String email>
	//    2    4:areturn         
	}

	public void setEmail(String s)
	{
		email = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field String email>
	//    3    5:return          
	}

	String email;
}
