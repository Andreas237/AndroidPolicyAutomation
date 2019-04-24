// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import java.util.Map;

public class GetTagsResp
	implements IMessageEntity
{

	public GetTagsResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		tags = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Map tags>
	//    5    9:return          
	}

	public Map getTags()
	{
		return tags;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map tags>
	//    2    4:areturn         
	}

	public void setTags(Map map)
	{
		tags = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Map tags>
	//    3    5:return          
	}

	private Map tags;
}
