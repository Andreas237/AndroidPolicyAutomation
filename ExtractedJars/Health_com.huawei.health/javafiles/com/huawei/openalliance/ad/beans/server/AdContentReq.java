// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.server;

import android.content.Context;
import com.huawei.openalliance.ad.beans.base.ReqBean;
import com.huawei.openalliance.ad.beans.metadata.*;
import java.util.List;

public class AdContentReq extends ReqBean
{

	public AdContentReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ReqBean()>
		version__ = "3.4";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "3.4">
	//    4    7:putfield        #33  <Field String version__>
		sdkversion__ = "3.4.20.301";
	//    5   10:aload_0         
	//    6   11:ldc1            #35  <String "3.4.20.301">
	//    7   13:putfield        #37  <Field String sdkversion__>
	//    8   16:return          
	}

	public AdContentReq(Context context, List list, List list1, List list2, int i, int j, int k, 
			boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ReqBean()>
		version__ = "3.4";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "3.4">
	//    4    7:putfield        #33  <Field String version__>
		sdkversion__ = "3.4.20.301";
	//    5   10:aload_0         
	//    6   11:ldc1            #35  <String "3.4.20.301">
	//    7   13:putfield        #37  <Field String sdkversion__>
		multislot__ = list;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #41  <Field List multislot__>
		app__ = new App(context);
	//   11   21:aload_0         
	//   12   22:new             #43  <Class App>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #46  <Method void App(Context)>
	//   16   30:putfield        #48  <Field App app__>
		device__ = new Device(context, i, j, k, flag);
	//   17   33:aload_0         
	//   18   34:new             #50  <Class Device>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:iload           5
	//   22   41:iload           6
	//   23   43:iload           7
	//   24   45:iload           8
	//   25   47:invokespecial   #53  <Method void Device(Context, int, int, int, boolean)>
	//   26   50:putfield        #55  <Field Device device__>
		network__ = new Network(context, flag);
	//   27   53:aload_0         
	//   28   54:new             #57  <Class Network>
	//   29   57:dup             
	//   30   58:aload_1         
	//   31   59:iload           8
	//   32   61:invokespecial   #60  <Method void Network(Context, boolean)>
	//   33   64:putfield        #62  <Field Network network__>
		cachecontentid__ = list1;
	//   34   67:aload_0         
	//   35   68:aload_3         
	//   36   69:putfield        #64  <Field List cachecontentid__>
		cacheSloganId__ = list2;
	//   37   72:aload_0         
	//   38   73:aload           4
	//   39   75:putfield        #66  <Field List cacheSloganId__>
	//   40   78:return          
	}

	public App getApp__()
	{
		return app__;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field App app__>
	//    2    4:areturn         
	}

	public String getAuthKey()
	{
		return "ed6f3d4b2edb011ffb4dd9d18dad91250c1962904f4fcaf81b86b719c108dc716bc5d5ff6c5a5bed615424da0f13f18963d2d9182529eefd3f591e28011e36f3";
	//    0    0:ldc1            #74  <String "ed6f3d4b2edb011ffb4dd9d18dad91250c1962904f4fcaf81b86b719c108dc716bc5d5ff6c5a5bed615424da0f13f18963d2d9182529eefd3f591e28011e36f3">
	//    1    2:areturn         
	}

	public List getCacheSloganId__()
	{
		return cacheSloganId__;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field List cacheSloganId__>
	//    2    4:areturn         
	}

	public List getCachecontentid__()
	{
		return cachecontentid__;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List cachecontentid__>
	//    2    4:areturn         
	}

	public String getClientReqSequence()
	{
		return clientReqSequence;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String clientReqSequence>
	//    2    4:areturn         
	}

	public Device getDevice__()
	{
		return device__;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Device device__>
	//    2    4:areturn         
	}

	public List getMultislot__()
	{
		return multislot__;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List multislot__>
	//    2    4:areturn         
	}

	public Network getNetwork__()
	{
		return network__;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Network network__>
	//    2    4:areturn         
	}

	public int getPdToOther()
	{
		return pdToOther;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int pdToOther>
	//    2    4:ireturn         
	}

	public String getPpsStore()
	{
		return ppsStore;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String ppsStore>
	//    2    4:areturn         
	}

	public String getRealM()
	{
		return "result.ad";
	//    0    0:ldc1            #97  <String "result.ad">
	//    1    2:areturn         
	}

	public List getRemovedContentId__()
	{
		return removedContentId__;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field List removedContentId__>
	//    2    4:areturn         
	}

	public String getRequestUri()
	{
		return "/result.ad";
	//    0    0:ldc1            #103 <String "/result.ad">
	//    1    2:areturn         
	}

	public String getSdkversion__()
	{
		return sdkversion__;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String sdkversion__>
	//    2    4:areturn         
	}

	public String getVersion__()
	{
		return version__;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String version__>
	//    2    4:areturn         
	}

	public void setApp__(App app)
	{
		app__ = app;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field App app__>
	//    3    5:return          
	}

	public void setCacheSloganId__(List list)
	{
		cacheSloganId__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field List cacheSloganId__>
	//    3    5:return          
	}

	public void setCachecontentid__(List list)
	{
		cachecontentid__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field List cachecontentid__>
	//    3    5:return          
	}

	public void setClientReqSequence(String s)
	{
		clientReqSequence = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field String clientReqSequence>
	//    3    5:return          
	}

	public void setDevice__(Device device)
	{
		device__ = device;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field Device device__>
	//    3    5:return          
	}

	public void setMultislot__(List list)
	{
		multislot__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field List multislot__>
	//    3    5:return          
	}

	public void setNetwork__(Network network)
	{
		network__ = network;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Network network__>
	//    3    5:return          
	}

	public void setPdToOther(int i)
	{
		pdToOther = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field int pdToOther>
	//    3    5:return          
	}

	public void setPpsStore(String s)
	{
		ppsStore = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field String ppsStore>
	//    3    5:return          
	}

	public void setRemovedContentId__(List list)
	{
		removedContentId__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field List removedContentId__>
	//    3    5:return          
	}

	public void setSdkversion__(String s)
	{
		sdkversion__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String sdkversion__>
	//    3    5:return          
	}

	public void setVersion__(String s)
	{
		version__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String version__>
	//    3    5:return          
	}

	private App app__;
	private List cacheSloganId__;
	private List cachecontentid__;
	private String clientReqSequence;
	private Device device__;
	private List multislot__;
	private Network network__;
	private int pdToOther;
	private String ppsStore;
	private List removedContentId__;
	private String sdkversion__;
	private String version__;
}
