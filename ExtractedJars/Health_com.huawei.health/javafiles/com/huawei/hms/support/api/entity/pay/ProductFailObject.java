// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;

public class ProductFailObject
	implements IMessageEntity
{

	public ProductFailObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public int getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int code>
	//    2    4:ireturn         
	}

	public String getMsg()
	{
		return msg;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String msg>
	//    2    4:areturn         
	}

	public String getProductNo()
	{
		return productNo;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String productNo>
	//    2    4:areturn         
	}

	public int code;
	public String msg;
	public String productNo;
}
