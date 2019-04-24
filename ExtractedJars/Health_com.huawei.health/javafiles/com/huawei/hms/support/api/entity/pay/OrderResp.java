// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.AbstractMessageEntity;

public class OrderResp extends AbstractMessageEntity
{

	public OrderResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AbstractMessageEntity()>
	//    2    4:return          
	}

	private static Object get(Object obj)
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public String getOrderID()
	{
		return (String)get(((Object) (orderID)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String orderID>
	//    2    4:invokestatic    #30  <Method Object get(Object)>
	//    3    7:checkcast       #32  <Class String>
	//    4   10:areturn         
	}

	public String getOrderTime()
	{
		return (String)get(((Object) (orderTime)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String orderTime>
	//    2    4:invokestatic    #30  <Method Object get(Object)>
	//    3    7:checkcast       #32  <Class String>
	//    4   10:areturn         
	}

	public String getRequestId()
	{
		return (String)get(((Object) (requestId)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String requestId>
	//    2    4:invokestatic    #30  <Method Object get(Object)>
	//    3    7:checkcast       #32  <Class String>
	//    4   10:areturn         
	}

	public int getReturnCode()
	{
		return ((Integer)get(((Object) (Integer.valueOf(returnCode))))).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int returnCode>
	//    2    4:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//    3    7:invokestatic    #30  <Method Object get(Object)>
	//    4   10:checkcast       #44  <Class Integer>
	//    5   13:invokevirtual   #51  <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public String getReturnDesc()
	{
		return (String)get(((Object) (returnDesc)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String returnDesc>
	//    2    4:invokestatic    #30  <Method Object get(Object)>
	//    3    7:checkcast       #32  <Class String>
	//    4   10:areturn         
	}

	public String getSign()
	{
		return (String)get(((Object) (sign)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String sign>
	//    2    4:invokestatic    #30  <Method Object get(Object)>
	//    3    7:checkcast       #32  <Class String>
	//    4   10:areturn         
	}

	public String getStatus()
	{
		return (String)get(((Object) (status)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String status>
	//    2    4:invokestatic    #30  <Method Object get(Object)>
	//    3    7:checkcast       #32  <Class String>
	//    4   10:areturn         
	}

	public String getTradeTime()
	{
		return (String)get(((Object) (tradeTime)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String tradeTime>
	//    2    4:invokestatic    #30  <Method Object get(Object)>
	//    3    7:checkcast       #32  <Class String>
	//    4   10:areturn         
	}

	public void setOrderID(String s)
	{
		orderID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String orderID>
	//    3    5:return          
	}

	public void setOrderTime(String s)
	{
		orderTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String orderTime>
	//    3    5:return          
	}

	public void setRequestId(String s)
	{
		requestId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String requestId>
	//    3    5:return          
	}

	public void setReturnCode(int i)
	{
		returnCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int returnCode>
	//    3    5:return          
	}

	public void setReturnDesc(String s)
	{
		returnDesc = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String returnDesc>
	//    3    5:return          
	}

	public void setSign(String s)
	{
		sign = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String sign>
	//    3    5:return          
	}

	public void setStatus(String s)
	{
		status = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field String status>
	//    3    5:return          
	}

	public void setTradeTime(String s)
	{
		tradeTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field String tradeTime>
	//    3    5:return          
	}

	public String orderID;
	public String orderTime;
	public String requestId;
	public int returnCode;
	public String returnDesc;
	public String sign;
	public String status;
	public String tradeTime;
}
