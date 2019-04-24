// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;

public class OrderRequest
	implements IMessageEntity
{

	public OrderRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	private static Object get(Object obj)
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public String getKeyType()
	{
		return (String)get(((Object) (keyType)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String keyType>
	//    2    4:invokestatic    #28  <Method Object get(Object)>
	//    3    7:checkcast       #30  <Class String>
	//    4   10:areturn         
	}

	public String getMerchantId()
	{
		return (String)get(((Object) (merchantId)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String merchantId>
	//    2    4:invokestatic    #28  <Method Object get(Object)>
	//    3    7:checkcast       #30  <Class String>
	//    4   10:areturn         
	}

	public String getRequestId()
	{
		return (String)get(((Object) (requestId)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String requestId>
	//    2    4:invokestatic    #28  <Method Object get(Object)>
	//    3    7:checkcast       #30  <Class String>
	//    4   10:areturn         
	}

	public String getSign()
	{
		return (String)get(((Object) (sign)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String sign>
	//    2    4:invokestatic    #28  <Method Object get(Object)>
	//    3    7:checkcast       #30  <Class String>
	//    4   10:areturn         
	}

	public String getTime()
	{
		return (String)get(((Object) (time)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String time>
	//    2    4:invokestatic    #28  <Method Object get(Object)>
	//    3    7:checkcast       #30  <Class String>
	//    4   10:areturn         
	}

	public void setKeyType(String s)
	{
		keyType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String keyType>
	//    3    5:return          
	}

	public void setMerchantId(String s)
	{
		merchantId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String merchantId>
	//    3    5:return          
	}

	public void setRequestId(String s)
	{
		requestId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String requestId>
	//    3    5:return          
	}

	public void setSign(String s)
	{
		sign = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String sign>
	//    3    5:return          
	}

	public void setTime(String s)
	{
		time = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String time>
	//    3    5:return          
	}

	public String keyType;
	public String merchantId;
	public String requestId;
	public String sign;
	public String time;
}
