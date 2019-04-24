// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//			Result

public class Response
{

	public Response()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	protected Response(Result result)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzao = result;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Result zzao>
	//    5    9:return          
	}

	protected Result getResult()
	{
		return zzao;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Result zzao>
	//    2    4:areturn         
	}

	public void setResult(Result result)
	{
		zzao = result;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Result zzao>
	//    3    5:return          
	}

	private Result zzao;
}
