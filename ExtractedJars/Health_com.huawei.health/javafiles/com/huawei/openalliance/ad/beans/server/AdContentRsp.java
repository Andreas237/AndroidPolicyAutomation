// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.server;

import com.huawei.openalliance.ad.beans.base.RspBean;
import java.util.List;

public class AdContentRsp extends RspBean
{

	public AdContentRsp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void RspBean()>
		retcode__ = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #29  <Field int retcode__>
	//    5    9:return          
	}

	public List getInvalidSloganId__()
	{
		return invalidSloganId__;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List invalidSloganId__>
	//    2    4:areturn         
	}

	public List getInvalidcontentid__()
	{
		return invalidcontentid__;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List invalidcontentid__>
	//    2    4:areturn         
	}

	public List getMultiad__()
	{
		return multiad__;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List multiad__>
	//    2    4:areturn         
	}

	public List getNoReportAdTypeEventList()
	{
		return noReportAdTypeEventList;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List noReportAdTypeEventList>
	//    2    4:areturn         
	}

	public String getPpsStore()
	{
		return ppsStore;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String ppsStore>
	//    2    4:areturn         
	}

	public List getPremulticontent__()
	{
		return premulticontent__;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List premulticontent__>
	//    2    4:areturn         
	}

	public String getReason__()
	{
		return reason__;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String reason__>
	//    2    4:areturn         
	}

	public int getRetcode__()
	{
		return retcode__;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int retcode__>
	//    2    4:ireturn         
	}

	public List getSloganList__()
	{
		return sloganList__;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List sloganList__>
	//    2    4:areturn         
	}

	public List getTodayNoShowContentid__()
	{
		return todayNoShowContentid__;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List todayNoShowContentid__>
	//    2    4:areturn         
	}

	public void setInvalidSloganId__(List list)
	{
		invalidSloganId__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field List invalidSloganId__>
	//    3    5:return          
	}

	public void setInvalidcontentid__(List list)
	{
		invalidcontentid__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field List invalidcontentid__>
	//    3    5:return          
	}

	public void setMultiad__(List list)
	{
		multiad__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field List multiad__>
	//    3    5:return          
	}

	public void setNoReportAdTypeEventList(List list)
	{
		noReportAdTypeEventList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field List noReportAdTypeEventList>
	//    3    5:return          
	}

	public void setPpsStore(String s)
	{
		ppsStore = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String ppsStore>
	//    3    5:return          
	}

	public void setPremulticontent__(List list)
	{
		premulticontent__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field List premulticontent__>
	//    3    5:return          
	}

	public void setReason__(String s)
	{
		reason__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String reason__>
	//    3    5:return          
	}

	public void setRetcode__(int i)
	{
		retcode__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int retcode__>
	//    3    5:return          
	}

	public void setSloganList__(List list)
	{
		sloganList__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field List sloganList__>
	//    3    5:return          
	}

	public void setTodayNoShowContentid__(List list)
	{
		todayNoShowContentid__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field List todayNoShowContentid__>
	//    3    5:return          
	}

	private List invalidSloganId__;
	private List invalidcontentid__;
	private List multiad__;
	private List noReportAdTypeEventList;
	private String ppsStore;
	private List premulticontent__;
	private String reason__;
	private int retcode__;
	private List sloganList__;
	private List todayNoShowContentid__;
}
