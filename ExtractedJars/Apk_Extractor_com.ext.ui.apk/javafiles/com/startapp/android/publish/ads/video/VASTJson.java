// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;


public class VASTJson
{

	public VASTJson()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public String getAdmTag()
	{
		return admtag;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String admtag>
	//    2    4:areturn         
	}

	public String getCampaignId()
	{
		return campaign_id;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String campaign_id>
	//    2    4:areturn         
	}

	public String getTtlSec()
	{
		return ttl_sec;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String ttl_sec>
	//    2    4:areturn         
	}

	public String getVastTag()
	{
		return vasttag;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String vasttag>
	//    2    4:areturn         
	}

	private String admtag;
	private String campaign_id;
	private String ttl_sec;
	private String vasttag;
}
