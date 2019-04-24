// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.support.api.entity.pay.internal.BaseReq;

public class ProductPayRequest extends BaseReq
{

	public ProductPayRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BaseReq()>
	//    2    4:return          
	}

	public String getExpireTime()
	{
		return expireTime;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String expireTime>
	//    2    4:areturn         
	}

	public String getProductNo()
	{
		return productNo;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String productNo>
	//    2    4:areturn         
	}

	public int getValidTime()
	{
		return validTime;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int validTime>
	//    2    4:ireturn         
	}

	public String expireTime;
	public String productNo;
	public int validTime;
}
