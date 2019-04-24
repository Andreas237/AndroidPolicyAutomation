// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;


public class FirmwareUpdateItemValue
{

	public FirmwareUpdateItemValue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public String getDeploymentMetapackage()
	{
		return deploymentMpkg;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String deploymentMpkg>
	//    2    4:areturn         
	}

	public String getDownloadUrl()
	{
		return downloadUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String downloadUrl>
	//    2    4:areturn         
	}

	public String getNotes()
	{
		return notes;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String notes>
	//    2    4:areturn         
	}

	public String getReleaseDate()
	{
		return releaseDate;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String releaseDate>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String version>
	//    2    4:areturn         
	}

	private String deploymentMpkg;
	private String downloadUrl;
	private String notes;
	private String releaseDate;
	private String version;
}
