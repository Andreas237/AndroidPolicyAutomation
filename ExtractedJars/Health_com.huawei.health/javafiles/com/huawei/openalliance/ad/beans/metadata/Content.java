// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.beans.base.RspBean;
import com.huawei.openalliance.ad.utils.p;
import com.huawei.openalliance.ad.utils.q;
import java.util.*;

// Referenced classes of package com.huawei.openalliance.ad.beans.metadata:
//			Precontent, MetaData, AdTypeEvent, ParamFromServer

public class Content extends RspBean
{

	public Content()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void RspBean()>
		showAppLogoFlag__ = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #42  <Field int showAppLogoFlag__>
		interactiontype__ = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #44  <Field int interactiontype__>
		creativetype__ = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #46  <Field int creativetype__>
		showid__ = "";
	//   11   19:aload_0         
	//   12   20:ldc1            #48  <String "">
	//   13   22:putfield        #50  <Field String showid__>
		skipTextPos = "tr";
	//   14   25:aload_0         
	//   15   26:ldc1            #52  <String "tr">
	//   16   28:putfield        #54  <Field String skipTextPos>
		logo2Text = "";
	//   17   31:aload_0         
	//   18   32:ldc1            #48  <String "">
	//   19   34:putfield        #56  <Field String logo2Text>
		logo2Pos = "ll";
	//   20   37:aload_0         
	//   21   38:ldc1            #58  <String "ll">
	//   22   40:putfield        #60  <Field String logo2Pos>
	//   23   43:return          
	}

	public Content(Precontent precontent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void RspBean()>
		showAppLogoFlag__ = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #42  <Field int showAppLogoFlag__>
		interactiontype__ = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #44  <Field int interactiontype__>
		creativetype__ = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #46  <Field int creativetype__>
		showid__ = "";
	//   11   19:aload_0         
	//   12   20:ldc1            #48  <String "">
	//   13   22:putfield        #50  <Field String showid__>
		skipTextPos = "tr";
	//   14   25:aload_0         
	//   15   26:ldc1            #52  <String "tr">
	//   16   28:putfield        #54  <Field String skipTextPos>
		logo2Text = "";
	//   17   31:aload_0         
	//   18   32:ldc1            #48  <String "">
	//   19   34:putfield        #56  <Field String logo2Text>
		logo2Pos = "ll";
	//   20   37:aload_0         
	//   21   38:ldc1            #58  <String "ll">
	//   22   40:putfield        #60  <Field String logo2Pos>
		if(precontent != null)
	//*  23   43:aload_1         
	//*  24   44:ifnull          103
		{
			contentid__ = precontent.getContentid__();
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #68  <Method String Precontent.getContentid__()>
	//   28   52:putfield        #70  <Field String contentid__>
			creativetype__ = precontent.getCreativetype__();
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #74  <Method int Precontent.getCreativetype__()>
	//   32   60:putfield        #46  <Field int creativetype__>
			ctrlSwitchs = precontent.getCtrlSwitchs();
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #77  <Method String Precontent.getCtrlSwitchs()>
	//   36   68:putfield        #79  <Field String ctrlSwitchs>
			noReportEventList = precontent.getNoReportEventList();
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokevirtual   #83  <Method List Precontent.getNoReportEventList()>
	//   40   76:putfield        #85  <Field List noReportEventList>
			MetaData metadata = new MetaData();
	//   41   79:new             #87  <Class MetaData>
	//   42   82:dup             
	//   43   83:invokespecial   #88  <Method void MetaData()>
	//   44   86:astore_2        
			metadata.setImageInfo__(precontent.getImageInfo());
	//   45   87:aload_2         
	//   46   88:aload_1         
	//   47   89:invokevirtual   #91  <Method List Precontent.getImageInfo()>
	//   48   92:invokevirtual   #95  <Method void MetaData.setImageInfo__(List)>
			metaData__ = p.b(((Object) (metadata)));
	//   49   95:aload_0         
	//   50   96:aload_2         
	//   51   97:invokestatic    #101 <Method String p.b(Object)>
	//   52  100:putfield        #103 <Field String metaData__>
		}
	//   53  103:return          
	}

	public List getClickActionList()
	{
		return clickActionList;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field List clickActionList>
	//    2    4:areturn         
	}

	public String getContentid__()
	{
		return contentid__;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String contentid__>
	//    2    4:areturn         
	}

	public int getCreativetype__()
	{
		return creativetype__;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int creativetype__>
	//    2    4:ireturn         
	}

	public String getCtrlSwitchs()
	{
		return ctrlSwitchs;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String ctrlSwitchs>
	//    2    4:areturn         
	}

	public long getEndtime__()
	{
		return endtime__;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field long endtime__>
	//    2    4:lreturn         
	}

	public List getFilterList()
	{
		return filterList;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List filterList>
	//    2    4:areturn         
	}

	public int getInteractiontype__()
	{
		return interactiontype__;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int interactiontype__>
	//    2    4:ireturn         
	}

	public List getKeyWords()
	{
		return keyWords;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List keyWords>
	//    2    4:areturn         
	}

	public int getLandingTitle()
	{
		return landingTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int landingTitle>
	//    2    4:ireturn         
	}

	public String getLogo2Pos()
	{
		return logo2Pos;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String logo2Pos>
	//    2    4:areturn         
	}

	public String getLogo2Text()
	{
		return logo2Text;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String logo2Text>
	//    2    4:areturn         
	}

	public MetaData getMetaData()
	{
		return (MetaData)p.b(metaData__, com/huawei/openalliance/ad/beans/metadata/MetaData, new Class[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String metaData__>
	//    2    4:ldc1            #87  <Class MetaData>
	//    3    6:iconst_0        
	//    4    7:anewarray       Class[]
	//    5   10:invokestatic    #132 <Method Object p.b(String, Class, Class[])>
	//    6   13:checkcast       #87  <Class MetaData>
	//    7   16:areturn         
	}

	public String getMetaData__()
	{
		return metaData__;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String metaData__>
	//    2    4:areturn         
	}

	public List getMonitor()
	{
		return monitor;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field List monitor>
	//    2    4:areturn         
	}

	public List getNoReportEventList()
	{
		return noReportEventList;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List noReportEventList>
	//    2    4:areturn         
	}

	public ParamFromServer getParamfromserver__()
	{
		return paramfromserver__;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field ParamFromServer paramfromserver__>
	//    2    4:areturn         
	}

	public int getShowAppLogoFlag__()
	{
		return showAppLogoFlag__;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int showAppLogoFlag__>
	//    2    4:ireturn         
	}

	public String getShowid__()
	{
		return showid__;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String showid__>
	//    2    4:areturn         
	}

	public String getSkipTextPos()
	{
		return skipTextPos;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String skipTextPos>
	//    2    4:areturn         
	}

	public String getSkipText__()
	{
		return skipText__;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field String skipText__>
	//    2    4:areturn         
	}

	public long getStarttime__()
	{
		return starttime__;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field long starttime__>
	//    2    4:lreturn         
	}

	public String getTaskid__()
	{
		return taskid__;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field String taskid__>
	//    2    4:areturn         
	}

	public String getWebConfig()
	{
		return webConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String webConfig>
	//    2    4:areturn         
	}

	public void setClickActionList(List list)
	{
		clickActionList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field List clickActionList>
	//    3    5:return          
	}

	public void setContentid__(String s)
	{
		contentid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String contentid__>
	//    3    5:return          
	}

	public void setCreativetype__(int i)
	{
		creativetype__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field int creativetype__>
	//    3    5:return          
	}

	public void setCtrlSwitchs(String s)
	{
		ctrlSwitchs = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field String ctrlSwitchs>
	//    3    5:return          
	}

	public void setEndtime__(long l)
	{
		endtime__ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #112 <Field long endtime__>
	//    3    5:return          
	}

	public void setFilterList(List list)
	{
		filterList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field List filterList>
	//    3    5:return          
	}

	public void setInteractiontype__(int i)
	{
		interactiontype__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int interactiontype__>
	//    3    5:return          
	}

	public void setKeyWords(List list)
	{
		keyWords = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field List keyWords>
	//    3    5:return          
	}

	public void setLandingTitle(int i)
	{
		landingTitle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field int landingTitle>
	//    3    5:return          
	}

	public void setLogo2Pos(String s)
	{
		logo2Pos = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field String logo2Pos>
	//    3    5:return          
	}

	public void setLogo2Text(String s)
	{
		logo2Text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field String logo2Text>
	//    3    5:return          
	}

	public void setMetaData__(String s)
	{
		metaData__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field String metaData__>
	//    3    5:return          
	}

	public void setMonitor(List list)
	{
		monitor = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field List monitor>
	//    3    5:return          
	}

	public void setNoReportEventList(List list)
	{
		noReportEventList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field List noReportEventList>
	//    3    5:return          
	}

	public void setNoReportEventList(List list, int i)
	{
		if(q.a(((java.util.Collection) (list))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #183 <Method boolean q.a(java.util.Collection)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		list = ((List) (list.iterator()));
	//    4    8:aload_1         
	//    5    9:invokeinterface #189 <Method Iterator List.iterator()>
	//    6   14:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    7   15:aload_1         
	//    8   16:invokeinterface #195 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            89
			Object obj = ((Object) ((AdTypeEvent)((Iterator) (list)).next()));
	//   10   24:aload_1         
	//   11   25:invokeinterface #199 <Method Object Iterator.next()>
	//   12   30:checkcast       #201 <Class AdTypeEvent>
	//   13   33:astore_3        
			if(obj != null && ((AdTypeEvent) (obj)).getAdType() == i)
	//*  14   34:aload_3         
	//*  15   35:ifnull          86
	//*  16   38:aload_3         
	//*  17   39:invokevirtual   #204 <Method int AdTypeEvent.getAdType()>
	//*  18   42:iload_2         
	//*  19   43:icmpne          86
			{
				obj = ((Object) (((AdTypeEvent) (obj)).getEventTypeList()));
	//   20   46:aload_3         
	//   21   47:invokevirtual   #207 <Method List AdTypeEvent.getEventTypeList()>
	//   22   50:astore_3        
				if(obj != null && ((List) (obj)).size() > 0)
	//*  23   51:aload_3         
	//*  24   52:ifnull          86
	//*  25   55:aload_3         
	//*  26   56:invokeinterface #210 <Method int List.size()>
	//*  27   61:ifle            86
				{
					noReportEventList = ((List) (new ArrayList()));
	//   28   64:aload_0         
	//   29   65:new             #212 <Class ArrayList>
	//   30   68:dup             
	//   31   69:invokespecial   #213 <Method void ArrayList()>
	//   32   72:putfield        #85  <Field List noReportEventList>
					noReportEventList.addAll(((java.util.Collection) (obj)));
	//   33   75:aload_0         
	//   34   76:getfield        #85  <Field List noReportEventList>
	//   35   79:aload_3         
	//   36   80:invokeinterface #216 <Method boolean List.addAll(java.util.Collection)>
	//   37   85:pop             
				}
			}
		} while(true);
	//   38   86:goto            15
	//   39   89:return          
	}

	public void setParamfromserver__(ParamFromServer paramfromserver)
	{
		paramfromserver__ = paramfromserver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field ParamFromServer paramfromserver__>
	//    3    5:return          
	}

	public void setShowAppLogoFlag__(int i)
	{
		showAppLogoFlag__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int showAppLogoFlag__>
	//    3    5:return          
	}

	public void setShowid__(String s)
	{
		showid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String showid__>
	//    3    5:return          
	}

	public void setSkipTextPos(String s)
	{
		skipTextPos = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String skipTextPos>
	//    3    5:return          
	}

	public void setSkipText__(String s)
	{
		skipText__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field String skipText__>
	//    3    5:return          
	}

	public void setStarttime__(long l)
	{
		starttime__ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #150 <Field long starttime__>
	//    3    5:return          
	}

	public void setTaskid__(String s)
	{
		taskid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field String taskid__>
	//    3    5:return          
	}

	public void setWebConfig(String s)
	{
		webConfig = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field String webConfig>
	//    3    5:return          
	}

	private List clickActionList;
	private String contentid__;
	private int creativetype__;
	private String ctrlSwitchs;
	private long endtime__;
	private List filterList;
	private int interactiontype__;
	private List keyWords;
	private int landingTitle;
	private String logo2Pos;
	private String logo2Text;
	private String metaData__;
	private List monitor;
	private List noReportEventList;
	private ParamFromServer paramfromserver__;
	private int showAppLogoFlag__;
	private String showid__;
	private String skipTextPos;
	private String skipText__;
	private long starttime__;
	private String taskid__;
	private String webConfig;
}
