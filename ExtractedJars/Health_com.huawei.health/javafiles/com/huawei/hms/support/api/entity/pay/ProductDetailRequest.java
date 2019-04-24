// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;

public class ProductDetailRequest
	implements IMessageEntity
{

	public ProductDetailRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public String getApplicationID()
	{
		return applicationID;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String applicationID>
	//    2    4:areturn         
	}

	public String getMerchantId()
	{
		return merchantId;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String merchantId>
	//    2    4:areturn         
	}

	public String getProductNos()
	{
		return productNos;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String productNos>
	//    2    4:areturn         
	}

	public String getRequestId()
	{
		return requestId;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String requestId>
	//    2    4:areturn         
	}

	public String applicationID;
	public String merchantId;
	public String productNos;
	public String requestId;
}
