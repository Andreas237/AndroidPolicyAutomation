// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import java.util.List;

public class ApkInfo
{

	public ApkInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		permPromptForCard = "1";
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "1">
	//    4    7:putfield        #30  <Field String permPromptForCard>
		permPromptForLanding = "0";
	//    5   10:aload_0         
	//    6   11:ldc1            #32  <String "0">
	//    7   13:putfield        #34  <Field String permPromptForLanding>
	//    8   16:return          
	}

	public String getAppName()
	{
		return appName;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String appName>
	//    2    4:areturn         
	}

	public long getFileSize()
	{
		return fileSize;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long fileSize>
	//    2    4:lreturn         
	}

	public String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String packageName>
	//    2    4:areturn         
	}

	public String getPermPromptForCard()
	{
		if(permPromptForCard == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field String permPromptForCard>
	//*   2    4:ifnonnull       10
			return "1";
	//    3    7:ldc1            #28  <String "1">
	//    4    9:areturn         
		else
			return permPromptForCard;
	//    5   10:aload_0         
	//    6   11:getfield        #30  <Field String permPromptForCard>
	//    7   14:areturn         
	}

	public String getPermPromptForLanding()
	{
		if(permPromptForLanding == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field String permPromptForLanding>
	//*   2    4:ifnonnull       10
			return "0";
	//    3    7:ldc1            #32  <String "0">
	//    4    9:areturn         
		else
			return permPromptForLanding;
	//    5   10:aload_0         
	//    6   11:getfield        #34  <Field String permPromptForLanding>
	//    7   14:areturn         
	}

	public List getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field List permissions>
	//    2    4:areturn         
	}

	public int getPopUpAfterInstall()
	{
		return popUpAfterInstall;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int popUpAfterInstall>
	//    2    4:ireturn         
	}

	public String getPriorInstallWay()
	{
		return priorInstallWay;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String priorInstallWay>
	//    2    4:areturn         
	}

	public String getSecondUrl()
	{
		return secondUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String secondUrl>
	//    2    4:areturn         
	}

	public String getSha256()
	{
		return sha256;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String sha256>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String url>
	//    2    4:areturn         
	}

	public String getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String versionCode>
	//    2    4:areturn         
	}

	public void setAppName(String s)
	{
		appName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String appName>
	//    3    5:return          
	}

	public void setFileSize(long l)
	{
		fileSize = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #43  <Field long fileSize>
	//    3    5:return          
	}

	public void setPackageName(String s)
	{
		packageName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String packageName>
	//    3    5:return          
	}

	public void setPermPromptForCard(String s)
	{
		permPromptForCard = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String permPromptForCard>
	//    3    5:return          
	}

	public void setPermPromptForLanding(String s)
	{
		permPromptForLanding = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String permPromptForLanding>
	//    3    5:return          
	}

	public void setPermissions(List list)
	{
		permissions = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field List permissions>
	//    3    5:return          
	}

	public void setPopUpAfterInstall(int i)
	{
		popUpAfterInstall = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int popUpAfterInstall>
	//    3    5:return          
	}

	public void setPriorInstallWay(String s)
	{
		priorInstallWay = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field String priorInstallWay>
	//    3    5:return          
	}

	public void setSecondUrl(String s)
	{
		secondUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field String secondUrl>
	//    3    5:return          
	}

	public void setSha256(String s)
	{
		sha256 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field String sha256>
	//    3    5:return          
	}

	public void setUrl(String s)
	{
		url = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String url>
	//    3    5:return          
	}

	public void setVersionCode(String s)
	{
		versionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field String versionCode>
	//    3    5:return          
	}

	private String appName;
	private long fileSize;
	private String packageName;
	private String permPromptForCard;
	private String permPromptForLanding;
	private List permissions;
	private int popUpAfterInstall;
	private String priorInstallWay;
	private String secondUrl;
	private String sha256;
	private String url;
	private String versionCode;
}
