// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;


public class ShareInfo
{

	public ShareInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String description>
	//    2    4:areturn         
	}

	public String getIconUrl()
	{
		return iconUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String iconUrl>
	//    2    4:areturn         
	}

	public String getShareUrl()
	{
		return shareUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String shareUrl>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String title>
	//    2    4:areturn         
	}

	public void setDescription(String s)
	{
		description = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String description>
	//    3    5:return          
	}

	public void setIconUrl(String s)
	{
		iconUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String iconUrl>
	//    3    5:return          
	}

	public void setShareUrl(String s)
	{
		shareUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String shareUrl>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String title>
	//    3    5:return          
	}

	private String description;
	private String iconUrl;
	private String shareUrl;
	private String title;
}
