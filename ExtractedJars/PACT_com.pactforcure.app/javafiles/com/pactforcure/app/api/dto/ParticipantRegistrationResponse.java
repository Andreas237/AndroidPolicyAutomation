// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


// Referenced classes of package com.pactforcure.app.api.dto:
//			BaseDto

public class ParticipantRegistrationResponse extends BaseDto
{

	public ParticipantRegistrationResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BaseDto()>
	//    2    4:return          
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String token>
	//    2    4:areturn         
	}

	public void setToken(String s)
	{
		token = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field String token>
	//    3    5:return          
	}

	String token;
}
