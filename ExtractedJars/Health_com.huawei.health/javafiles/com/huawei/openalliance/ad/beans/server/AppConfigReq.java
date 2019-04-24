// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.server;

import com.huawei.openalliance.ad.beans.base.ReqBean;

public class AppConfigReq extends ReqBean
{

	public AppConfigReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ReqBean()>
		version__ = "3.4";
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "3.4">
	//    4    7:putfield        #18  <Field String version__>
		sdkversion__ = "3.4.20.301";
	//    5   10:aload_0         
	//    6   11:ldc1            #20  <String "3.4.20.301">
	//    7   13:putfield        #22  <Field String sdkversion__>
	//    8   16:return          
	}

	public AppConfigReq(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ReqBean()>
		version__ = "3.4";
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "3.4">
	//    4    7:putfield        #18  <Field String version__>
		sdkversion__ = "3.4.20.301";
	//    5   10:aload_0         
	//    6   11:ldc1            #20  <String "3.4.20.301">
	//    7   13:putfield        #22  <Field String sdkversion__>
		slotid__ = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #26  <Field String slotid__>
	//   11   21:return          
	}

	public String getAuthKey()
	{
		return "afba7949663afb7836b766b086c3b66bae819607ef1a6dbfd729b0274f0896824f333901d201493d8722410598958bda043b2fc6555534569a8ac137078fdc23";
	//    0    0:ldc1            #30  <String "afba7949663afb7836b766b086c3b66bae819607ef1a6dbfd729b0274f0896824f333901d201493d8722410598958bda043b2fc6555534569a8ac137078fdc23">
	//    1    2:areturn         
	}

	public String getRealM()
	{
		return "query";
	//    0    0:ldc1            #33  <String "query">
	//    1    2:areturn         
	}

	public String getRequestUri()
	{
		return "/sdkserver/query";
	//    0    0:ldc1            #36  <String "/sdkserver/query">
	//    1    2:areturn         
	}

	public String getSdkversion__()
	{
		return sdkversion__;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String sdkversion__>
	//    2    4:areturn         
	}

	public String getServerStore()
	{
		return serverStore;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String serverStore>
	//    2    4:areturn         
	}

	public String getSlotid__()
	{
		return slotid__;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String slotid__>
	//    2    4:areturn         
	}

	public String getVersion__()
	{
		return version__;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String version__>
	//    2    4:areturn         
	}

	public void setSdkversion__(String s)
	{
		sdkversion__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String sdkversion__>
	//    3    5:return          
	}

	public void setServerStore(String s)
	{
		serverStore = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String serverStore>
	//    3    5:return          
	}

	public void setSlotid__(String s)
	{
		slotid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String slotid__>
	//    3    5:return          
	}

	public void setVersion__(String s)
	{
		version__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String version__>
	//    3    5:return          
	}

	private String sdkversion__;
	private String serverStore;
	private String slotid__;
	private String version__;
}
