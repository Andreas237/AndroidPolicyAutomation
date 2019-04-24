// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


// Referenced classes of package com.pactforcure.app.api.dto:
//			CodeDescriptionError

public class BaseDto
{

	public BaseDto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public CodeDescriptionError getError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CodeDescriptionError error>
	//    2    4:areturn         
	}

	public Boolean getSuccess()
	{
		return success;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Boolean success>
	//    2    4:areturn         
	}

	public void setError(CodeDescriptionError codedescriptionerror)
	{
		error = codedescriptionerror;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CodeDescriptionError error>
	//    3    5:return          
	}

	public void setSuccess(Boolean boolean1)
	{
		success = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Boolean success>
	//    3    5:return          
	}

	CodeDescriptionError error;
	Boolean success;
}
