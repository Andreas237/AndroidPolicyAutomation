// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.health.sns.ui.group.healthbeans;

import java.io.Serializable;

public class HeadersBean
	implements Serializable
{

	public HeadersBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public String getAuthorization()
	{
		return Authorization;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String Authorization>
	//    2    4:areturn         
	}

	public String getContentMD5()
	{
		return ContentMD5;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String ContentMD5>
	//    2    4:areturn         
	}

	public String getContenttype()
	{
		return contenttype;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String contenttype>
	//    2    4:areturn         
	}

	public String getHost()
	{
		return Host;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String Host>
	//    2    4:areturn         
	}

	public String getUseragent()
	{
		return useragent;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String useragent>
	//    2    4:areturn         
	}

	public String getXamzcontentsha256()
	{
		return xamzcontentsha256;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String xamzcontentsha256>
	//    2    4:areturn         
	}

	public String getXamzdate()
	{
		return xamzdate;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String xamzdate>
	//    2    4:areturn         
	}

	public void setAuthorization(String s)
	{
		Authorization = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String Authorization>
	//    3    5:return          
	}

	public void setContentMD5(String s)
	{
		ContentMD5 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String ContentMD5>
	//    3    5:return          
	}

	public void setContenttype(String s)
	{
		contenttype = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String contenttype>
	//    3    5:return          
	}

	public void setHost(String s)
	{
		Host = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String Host>
	//    3    5:return          
	}

	public void setUseragent(String s)
	{
		useragent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String useragent>
	//    3    5:return          
	}

	public void setXamzcontentsha256(String s)
	{
		xamzcontentsha256 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String xamzcontentsha256>
	//    3    5:return          
	}

	public void setXamzdate(String s)
	{
		xamzdate = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String xamzdate>
	//    3    5:return          
	}

	private String Authorization;
	private String ContentMD5;
	private String Host;
	private String contenttype;
	private String useragent;
	private String xamzcontentsha256;
	private String xamzdate;
}
