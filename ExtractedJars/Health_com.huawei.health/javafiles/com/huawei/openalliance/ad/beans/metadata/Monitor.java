// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import java.io.Serializable;
import java.util.List;

public class Monitor
	implements Serializable
{

	public Monitor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public String getEventType()
	{
		return eventType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String eventType>
	//    2    4:areturn         
	}

	public List getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List url>
	//    2    4:areturn         
	}

	public void setEventType(String s)
	{
		eventType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String eventType>
	//    3    5:return          
	}

	public void setUrl(List list)
	{
		url = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field List url>
	//    3    5:return          
	}

	private static final long serialVersionUID = 0x5c5d8cafL;
	private String eventType;
	private List url;
}
