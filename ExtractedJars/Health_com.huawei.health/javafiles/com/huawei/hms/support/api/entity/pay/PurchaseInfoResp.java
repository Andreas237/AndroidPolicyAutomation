// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import java.util.List;

public class PurchaseInfoResp extends AbstractMessageEntity
{

	public PurchaseInfoResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AbstractMessageEntity()>
	//    2    4:return          
	}

	public long getPageCount()
	{
		return pageCount;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long pageCount>
	//    2    4:lreturn         
	}

	public List getPurchaseInfoList()
	{
		return purchaseInfoList;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List purchaseInfoList>
	//    2    4:areturn         
	}

	public String getRtnCode()
	{
		return rtnCode;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String rtnCode>
	//    2    4:areturn         
	}

	public String getSign()
	{
		return sign;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String sign>
	//    2    4:areturn         
	}

	public void setPageCount(long l)
	{
		pageCount = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #22  <Field long pageCount>
	//    3    5:return          
	}

	public void setPurchaseInfoList(List list)
	{
		purchaseInfoList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field List purchaseInfoList>
	//    3    5:return          
	}

	public void setRtnCode(String s)
	{
		rtnCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String rtnCode>
	//    3    5:return          
	}

	public void setSign(String s)
	{
		sign = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String sign>
	//    3    5:return          
	}

	private long pageCount;
	private List purchaseInfoList;
	private String rtnCode;
	private String sign;
}
