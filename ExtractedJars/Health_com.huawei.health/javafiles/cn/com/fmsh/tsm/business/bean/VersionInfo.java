// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;


public class VersionInfo
{

	public VersionInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String url>
	//    2    4:areturn         
	}

	public String getViersion()
	{
		return viersion;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String viersion>
	//    2    4:areturn         
	}

	public boolean isUpdate()
	{
		return isUpdate;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean isUpdate>
	//    2    4:ireturn         
	}

	public void setUpdate(boolean flag)
	{
		isUpdate = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean isUpdate>
	//    3    5:return          
	}

	public void setUrl(String s)
	{
		url = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String url>
	//    3    5:return          
	}

	public void setViersion(String s)
	{
		viersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String viersion>
	//    3    5:return          
	}

	boolean isUpdate;
	String url;
	String viersion;
}
