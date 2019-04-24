// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.health.sns.ui.group.healthbeans;

import java.io.Serializable;
import java.util.List;

public class HealthGetUploadUrlBean
	implements Serializable
{

	public HealthGetUploadUrlBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public List getFileDownloadUrlList()
	{
		return fileDownloadUrlList;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List fileDownloadUrlList>
	//    2    4:areturn         
	}

	public List getFileTagList()
	{
		return fileTagList;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List fileTagList>
	//    2    4:areturn         
	}

	public List getNspGetResponseList()
	{
		return nspGetResponseList;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List nspGetResponseList>
	//    2    4:areturn         
	}

	public int getResultCodeX()
	{
		return resultCodeX;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int resultCodeX>
	//    2    4:ireturn         
	}

	public void setFileDownloadUrlList(List list)
	{
		fileDownloadUrlList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field List fileDownloadUrlList>
	//    3    5:return          
	}

	public void setFileTagList(List list)
	{
		fileTagList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field List fileTagList>
	//    3    5:return          
	}

	public void setNspGetResponseList(List list)
	{
		nspGetResponseList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field List nspGetResponseList>
	//    3    5:return          
	}

	public void setResultCodeX(int i)
	{
		resultCodeX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int resultCodeX>
	//    3    5:return          
	}

	private List fileDownloadUrlList;
	private List fileTagList;
	private List nspGetResponseList;
	private int resultCodeX;
}
