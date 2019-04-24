// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;

public class PurchaseInfoRequest
	implements IMessageEntity
{

	public PurchaseInfoRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		pageNo = 1L;
	//    2    4:aload_0         
	//    3    5:lconst_1        
	//    4    6:putfield        #22  <Field long pageNo>
	//    5    9:return          
	}

	public String getAppId()
	{
		return appId;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String appId>
	//    2    4:areturn         
	}

	public String getMerchantId()
	{
		return merchantId;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String merchantId>
	//    2    4:areturn         
	}

	public long getPageNo()
	{
		return pageNo;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long pageNo>
	//    2    4:lreturn         
	}

	public String getPriceType()
	{
		return priceType;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String priceType>
	//    2    4:areturn         
	}

	public String getProductId()
	{
		return productId;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String productId>
	//    2    4:areturn         
	}

	public String getSign()
	{
		return sign;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String sign>
	//    2    4:areturn         
	}

	public long getTs()
	{
		return ts;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long ts>
	//    2    4:lreturn         
	}

	public void setAppId(String s)
	{
		appId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String appId>
	//    3    5:return          
	}

	public void setMerchantId(String s)
	{
		merchantId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String merchantId>
	//    3    5:return          
	}

	public void setPageNo(long l)
	{
		pageNo = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #22  <Field long pageNo>
	//    3    5:return          
	}

	public void setPriceType(String s)
	{
		priceType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String priceType>
	//    3    5:return          
	}

	public void setProductId(String s)
	{
		productId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String productId>
	//    3    5:return          
	}

	public void setSign(String s)
	{
		sign = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String sign>
	//    3    5:return          
	}

	public void setTs(long l)
	{
		ts = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #44  <Field long ts>
	//    3    5:return          
	}

	public String appId;
	public String merchantId;
	public long pageNo;
	public String priceType;
	public String productId;
	public String sign;
	public long ts;
}
