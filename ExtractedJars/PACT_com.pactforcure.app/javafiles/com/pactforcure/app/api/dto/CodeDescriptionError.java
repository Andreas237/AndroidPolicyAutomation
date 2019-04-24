// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;

import com.pactforcure.app.studies.Res;

public class CodeDescriptionError
{

	public CodeDescriptionError()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public CodeDescriptionError(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		code = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int code>
		description = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #26  <String "">
	//    7   12:putfield        #28  <Field String description>
	//    8   15:return          
	}

	public int getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int code>
	//    2    4:ireturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String description>
	//    2    4:areturn         
	}

	public String getUserFriendlyErrorMessage()
	{
		switch(code)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int code>
		{
	//*   2    4:tableswitch     432 432: default 24
	//	               432 30
		default:
			return Res.getStudySpecificString(0x7f0802f1);
	//    3   24:ldc1            #34  <Int 0x7f0802f1>
	//    4   26:invokestatic    #40  <Method String Res.getStudySpecificString(int)>
	//    5   29:areturn         

		case 432: 
			return Res.getStudySpecificString(0x7f080050);
	//    6   30:ldc1            #41  <Int 0x7f080050>
	//    7   32:invokestatic    #40  <Method String Res.getStudySpecificString(int)>
	//    8   35:areturn         
		}
	}

	public void setCode(int i)
	{
		code = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int code>
	//    3    5:return          
	}

	public void setDescription(String s)
	{
		description = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String description>
	//    3    5:return          
	}

	public static final int CREDENTIALS_ERROR = -3;
	public static final int NETWORK_FAILURE = -1;
	public static final int RESPONSE_PARSING_FAILURE = -2;
	public static final int UNC_ERRORCODE_DUPLICATED_EMAIL = 432;
	int code;
	String description;
}
