// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.core.aidl;


// Referenced classes of package com.huawei.hms.core.aidl:
//			IMessageEntity

public class ResponseHeader
	implements IMessageEntity
{

	public ResponseHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public ResponseHeader(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int statusCode>
	//    5    9:return          
	}

	public int getStatusCode()
	{
		return statusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int statusCode>
	//    2    4:ireturn         
	}

	protected int statusCode;
}
