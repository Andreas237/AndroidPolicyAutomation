// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARError

public class CraftARNetworkError extends CraftARError
{

	public CraftARNetworkError(CraftARError.ERROR_CODES error_codes, String s, int i)
	{
		super(error_codes, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
		mStatusCode = i;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #13  <Field int mStatusCode>
	//    7   11:return          
	}

	public int getStatusCode()
	{
		return mStatusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int mStatusCode>
	//    2    4:ireturn         
	}

	int mStatusCode;
}
