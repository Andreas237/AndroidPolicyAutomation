// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import java.util.List;

public class ProductDetailResp extends AbstractMessageEntity
{

	public ProductDetailResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AbstractMessageEntity()>
	//    2    4:return          
	}

	public String getErrMsg()
	{
		return errMsg;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String errMsg>
	//    2    4:areturn         
	}

	public List getFailList()
	{
		return failList;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List failList>
	//    2    4:areturn         
	}

	public List getProductList()
	{
		return productList;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List productList>
	//    2    4:areturn         
	}

	public String getRequestId()
	{
		return requestId;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String requestId>
	//    2    4:areturn         
	}

	public int getReturnCode()
	{
		return returnCode;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int returnCode>
	//    2    4:ireturn         
	}

	public String errMsg;
	public List failList;
	public List productList;
	public String requestId;
	public int returnCode;
}
