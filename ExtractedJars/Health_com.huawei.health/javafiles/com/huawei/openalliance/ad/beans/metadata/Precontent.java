// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.beans.base.RspBean;
import com.huawei.openalliance.ad.utils.q;
import java.util.*;

// Referenced classes of package com.huawei.openalliance.ad.beans.metadata:
//			AdTypeEvent

public class Precontent extends RspBean
{

	public Precontent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void RspBean()>
	//    2    4:return          
	}

	public String getContentid__()
	{
		return contentid__;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String contentid__>
	//    2    4:areturn         
	}

	public int getCreativetype__()
	{
		return creativetype__;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int creativetype__>
	//    2    4:ireturn         
	}

	public String getCtrlSwitchs()
	{
		return ctrlSwitchs;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String ctrlSwitchs>
	//    2    4:areturn         
	}

	public List getImageInfo()
	{
		return imageInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List imageInfo>
	//    2    4:areturn         
	}

	public List getNoReportEventList()
	{
		return noReportEventList;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List noReportEventList>
	//    2    4:areturn         
	}

	public String getSlotid__()
	{
		return slotid__;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String slotid__>
	//    2    4:areturn         
	}

	public void setContentid__(String s)
	{
		contentid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String contentid__>
	//    3    5:return          
	}

	public void setCreativetype__(int i)
	{
		creativetype__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int creativetype__>
	//    3    5:return          
	}

	public void setCtrlSwitchs(String s)
	{
		ctrlSwitchs = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String ctrlSwitchs>
	//    3    5:return          
	}

	public void setImageInfo(List list)
	{
		imageInfo = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field List imageInfo>
	//    3    5:return          
	}

	public void setNoReportEventList(List list)
	{
		noReportEventList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field List noReportEventList>
	//    3    5:return          
	}

	public void setNoReportEventList(List list, int i)
	{
		if(q.a(((java.util.Collection) (list))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #62  <Method boolean q.a(java.util.Collection)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		list = ((List) (list.iterator()));
	//    4    8:aload_1         
	//    5    9:invokeinterface #68  <Method Iterator List.iterator()>
	//    6   14:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    7   15:aload_1         
	//    8   16:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            89
			Object obj = ((Object) ((AdTypeEvent)((Iterator) (list)).next()));
	//   10   24:aload_1         
	//   11   25:invokeinterface #78  <Method Object Iterator.next()>
	//   12   30:checkcast       #80  <Class AdTypeEvent>
	//   13   33:astore_3        
			if(obj != null && ((AdTypeEvent) (obj)).getAdType() == i)
	//*  14   34:aload_3         
	//*  15   35:ifnull          86
	//*  16   38:aload_3         
	//*  17   39:invokevirtual   #83  <Method int AdTypeEvent.getAdType()>
	//*  18   42:iload_2         
	//*  19   43:icmpne          86
			{
				obj = ((Object) (((AdTypeEvent) (obj)).getEventTypeList()));
	//   20   46:aload_3         
	//   21   47:invokevirtual   #86  <Method List AdTypeEvent.getEventTypeList()>
	//   22   50:astore_3        
				if(obj != null && ((List) (obj)).size() > 0)
	//*  23   51:aload_3         
	//*  24   52:ifnull          86
	//*  25   55:aload_3         
	//*  26   56:invokeinterface #89  <Method int List.size()>
	//*  27   61:ifle            86
				{
					noReportEventList = ((List) (new ArrayList()));
	//   28   64:aload_0         
	//   29   65:new             #91  <Class ArrayList>
	//   30   68:dup             
	//   31   69:invokespecial   #92  <Method void ArrayList()>
	//   32   72:putfield        #41  <Field List noReportEventList>
					noReportEventList.addAll(((java.util.Collection) (obj)));
	//   33   75:aload_0         
	//   34   76:getfield        #41  <Field List noReportEventList>
	//   35   79:aload_3         
	//   36   80:invokeinterface #95  <Method boolean List.addAll(java.util.Collection)>
	//   37   85:pop             
				}
			}
		} while(true);
	//   38   86:goto            15
	//   39   89:return          
	}

	public void setSlotid__(String s)
	{
		slotid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String slotid__>
	//    3    5:return          
	}

	private String contentid__;
	private int creativetype__;
	private String ctrlSwitchs;
	private List imageInfo;
	private List noReportEventList;
	private String slotid__;
}
