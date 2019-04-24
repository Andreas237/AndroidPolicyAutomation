// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


// Referenced classes of package com.pactforcure.app.api.dto:
//			ErrorV2

public class BaseDtoV2
{

	public BaseDtoV2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public ErrorV2 getError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ErrorV2 error>
	//    2    4:areturn         
	}

	public Boolean getSuccess()
	{
		return success;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Boolean success>
	//    2    4:areturn         
	}

	public void setError(ErrorV2 errorv2)
	{
		error = errorv2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ErrorV2 error>
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

	ErrorV2 error;
	Boolean success;
}
