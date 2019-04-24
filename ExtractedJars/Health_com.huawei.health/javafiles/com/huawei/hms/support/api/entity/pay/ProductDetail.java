// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;

public class ProductDetail
	implements IMessageEntity
{

	public ProductDetail()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public String getCountry()
	{
		return country;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String country>
	//    2    4:areturn         
	}

	public String getCurrency()
	{
		return currency;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String currency>
	//    2    4:areturn         
	}

	public long getMicrosPrice()
	{
		return microsPrice;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long microsPrice>
	//    2    4:lreturn         
	}

	public String getPrice()
	{
		return price;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String price>
	//    2    4:areturn         
	}

	public String getProductDesc()
	{
		return productDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String productDesc>
	//    2    4:areturn         
	}

	public String getProductName()
	{
		return productName;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String productName>
	//    2    4:areturn         
	}

	public String getProductNo()
	{
		return productNo;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String productNo>
	//    2    4:areturn         
	}

	public String country;
	public String currency;
	public long microsPrice;
	public String price;
	public String productDesc;
	public String productName;
	public String productNo;
}
