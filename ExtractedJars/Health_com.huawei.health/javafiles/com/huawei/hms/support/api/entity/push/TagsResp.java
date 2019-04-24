// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;

public class TagsResp
	implements IMessageEntity
{

	public TagsResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		retCode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int retCode>
		content = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #19  <String "">
	//    7   12:putfield        #21  <Field String content>
	//    8   15:return          
	}

	public String getContent()
	{
		return content;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String content>
	//    2    4:areturn         
	}

	public int getRetCode()
	{
		return retCode;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int retCode>
	//    2    4:ireturn         
	}

	public void setContent(String s)
	{
		content = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String content>
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

	private String content;
	private int retCode;
}
