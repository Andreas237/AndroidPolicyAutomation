// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;

public class InternalPayRequest
	implements IMessageEntity
{

	public InternalPayRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public String accessToken;
	public String amount;
	public String applicationID;
	public String extReserved;
	public String notifyUrl;
	public String productDesc;
	public String productName;
	public String requestId;
	public int sdkChannel;
	public String serviceCatalog;
	public String sign;
	public String signType;
	public String urlver;
	public String userID;
	public String userName;
	public int validTime;
}
