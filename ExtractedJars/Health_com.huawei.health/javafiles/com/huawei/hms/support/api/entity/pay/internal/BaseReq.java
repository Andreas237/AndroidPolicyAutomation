// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay.internal;

import com.huawei.hms.core.aidl.IMessageEntity;

public class BaseReq
	implements IMessageEntity
{

	public BaseReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public String getApplicationID()
	{
		return applicationID;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String applicationID>
	//    2    4:areturn         
	}

	public String getExtReserved()
	{
		return extReserved;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String extReserved>
	//    2    4:areturn         
	}

	public String getMerchantId()
	{
		return merchantId;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String merchantId>
	//    2    4:areturn         
	}

	public String getMerchantName()
	{
		return merchantName;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String merchantName>
	//    2    4:areturn         
	}

	public String getRequestId()
	{
		return requestId;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String requestId>
	//    2    4:areturn         
	}

	public int getSdkChannel()
	{
		return sdkChannel;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int sdkChannel>
	//    2    4:ireturn         
	}

	public String getServiceCatalog()
	{
		return serviceCatalog;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String serviceCatalog>
	//    2    4:areturn         
	}

	public String getSign()
	{
		return sign;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String sign>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String url>
	//    2    4:areturn         
	}

	public String getUrlVer()
	{
		return urlVer;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String urlVer>
	//    2    4:areturn         
	}

	public String applicationID;
	public String extReserved;
	public String merchantId;
	public String merchantName;
	public String requestId;
	public int sdkChannel;
	public String serviceCatalog;
	public String sign;
	public String url;
	public String urlVer;
}
