// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.support.api.entity.pay.internal.BaseReq;

public class PayReq extends BaseReq
{

	public PayReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BaseReq()>
	//    2    4:return          
	}

	public String getAmount()
	{
		return amount;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String amount>
	//    2    4:areturn         
	}

	public String getCountry()
	{
		return country;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String country>
	//    2    4:areturn         
	}

	public String getCurrency()
	{
		return currency;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String currency>
	//    2    4:areturn         
	}

	public String getExpireTime()
	{
		return expireTime;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String expireTime>
	//    2    4:areturn         
	}

	public String getPartnerIDs()
	{
		return partnerIDs;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String partnerIDs>
	//    2    4:areturn         
	}

	public String getProductDesc()
	{
		return productDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String productDesc>
	//    2    4:areturn         
	}

	public String getProductName()
	{
		return productName;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String productName>
	//    2    4:areturn         
	}

	public int getValidTime()
	{
		return validTime;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int validTime>
	//    2    4:ireturn         
	}

	public String amount;
	public String country;
	public String currency;
	public String expireTime;
	public String partnerIDs;
	public String productDesc;
	public String productName;
	public int validTime;
}
