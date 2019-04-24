// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;

public class AgreementResp
	implements IMessageEntity
{

	public AgreementResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		retCode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int retCode>
		bAgree = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field boolean bAgree>
	//    8   14:return          
	}

	public int getRetCode()
	{
		return retCode;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int retCode>
	//    2    4:ireturn         
	}

	public boolean isAgree()
	{
		return bAgree;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean bAgree>
	//    2    4:ireturn         
	}

	public void setAgree(boolean flag)
	{
		bAgree = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field boolean bAgree>
	//    3    5:return          
	}

	public void setRetCode(int i)
	{
		retCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int retCode>
	//    3    5:return          
	}

	private boolean bAgree;
	private int retCode;
}
