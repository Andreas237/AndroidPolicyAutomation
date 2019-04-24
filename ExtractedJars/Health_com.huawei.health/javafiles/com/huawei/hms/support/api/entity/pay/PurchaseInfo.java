// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;

public class PurchaseInfo
	implements IMessageEntity
{

	public PurchaseInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public String getAppId()
	{
		return appId;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String appId>
	//    2    4:areturn         
	}

	public String getMerchantId()
	{
		return merchantId;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String merchantId>
	//    2    4:areturn         
	}

	public String getProductId()
	{
		return productId;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String productId>
	//    2    4:areturn         
	}

	public String getRequestId()
	{
		return requestId;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String requestId>
	//    2    4:areturn         
	}

	public String getTradeTime()
	{
		return tradeTime;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String tradeTime>
	//    2    4:areturn         
	}

	public void setAppId(String s)
	{
		appId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String appId>
	//    3    5:return          
	}

	public void setMerchantId(String s)
	{
		merchantId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String merchantId>
	//    3    5:return          
	}

	public void setProductId(String s)
	{
		productId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String productId>
	//    3    5:return          
	}

	public void setRequestId(String s)
	{
		requestId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String requestId>
	//    3    5:return          
	}

	public void setTradeTime(String s)
	{
		tradeTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String tradeTime>
	//    3    5:return          
	}

	private String appId;
	private String merchantId;
	private String productId;
	private String requestId;
	private String tradeTime;
}
