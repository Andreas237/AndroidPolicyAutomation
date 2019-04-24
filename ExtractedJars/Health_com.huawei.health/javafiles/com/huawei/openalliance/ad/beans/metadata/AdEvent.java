// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.utils.ad;
import java.util.*;

// Referenced classes of package com.huawei.openalliance.ad.beans.metadata:
//			ParamFromServer

public class AdEvent
{

	public AdEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public AdEvent(String s, String s1, int i, int j, ParamFromServer paramfromserver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		type__ = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field String type__>
		showid__ = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #50  <Field String showid__>
		paramfromserver__ = paramfromserver;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #52  <Field ParamFromServer paramfromserver__>
		time__ = System.currentTimeMillis();
	//   11   20:aload_0         
	//   12   21:invokestatic    #58  <Method long System.currentTimeMillis()>
	//   13   24:putfield        #60  <Field long time__>
		rawX__ = i;
	//   14   27:aload_0         
	//   15   28:iload_3         
	//   16   29:putfield        #62  <Field int rawX__>
		rawY__ = j;
	//   17   32:aload_0         
	//   18   33:iload           4
	//   19   35:putfield        #64  <Field int rawY__>
	//   20   38:return          
	}

	public AdEvent(String s, String s1, int i, ParamFromServer paramfromserver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		type__ = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field String type__>
		showid__ = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #50  <Field String showid__>
		paramfromserver__ = paramfromserver;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #52  <Field ParamFromServer paramfromserver__>
		time__ = System.currentTimeMillis();
	//   11   20:aload_0         
	//   12   21:invokestatic    #58  <Method long System.currentTimeMillis()>
	//   13   24:putfield        #60  <Field long time__>
		opTimesInLandingPage__ = i;
	//   14   27:aload_0         
	//   15   28:iload_3         
	//   16   29:putfield        #67  <Field int opTimesInLandingPage__>
	//   17   32:return          
	}

	public AdEvent(String s, String s1, ParamFromServer paramfromserver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		type__ = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field String type__>
		showid__ = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #50  <Field String showid__>
		paramfromserver__ = paramfromserver;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #52  <Field ParamFromServer paramfromserver__>
		time__ = System.currentTimeMillis();
	//   11   19:aload_0         
	//   12   20:invokestatic    #58  <Method long System.currentTimeMillis()>
	//   13   23:putfield        #60  <Field long time__>
	//   14   26:return          
	}

	public Integer getAppDownloadRelatedActionSource()
	{
		return appDownloadRelatedActionSource;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Integer appDownloadRelatedActionSource>
	//    2    4:areturn         
	}

	public String getClickSuccessDestination__()
	{
		return clickSuccessDestination__;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String clickSuccessDestination__>
	//    2    4:areturn         
	}

	public List getCloseReason()
	{
		return closeReason;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List closeReason>
	//    2    4:areturn         
	}

	public Integer getContentDownMethod()
	{
		return contentDownMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Integer contentDownMethod>
	//    2    4:areturn         
	}

	public String getExt()
	{
		return ext;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String ext>
	//    2    4:areturn         
	}

	public Integer getInstallRelatedActionSource()
	{
		return installRelatedActionSource;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Integer installRelatedActionSource>
	//    2    4:areturn         
	}

	public Integer getIntentDestination()
	{
		return intentDestination;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Integer intentDestination>
	//    2    4:areturn         
	}

	public Integer getIntentFailReason()
	{
		return intentFailReason;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Integer intentFailReason>
	//    2    4:areturn         
	}

	public String getLastFailReason()
	{
		return lastFailReason;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String lastFailReason>
	//    2    4:areturn         
	}

	public String getLastReportTime()
	{
		return lastReportTime;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String lastReportTime>
	//    2    4:areturn         
	}

	public Integer getMaxShowRatio__()
	{
		return maxShowRatio__;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Integer maxShowRatio__>
	//    2    4:areturn         
	}

	public int getOpTimesInLandingPage__()
	{
		return opTimesInLandingPage__;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int opTimesInLandingPage__>
	//    2    4:ireturn         
	}

	public ParamFromServer getParamfromserver__()
	{
		return paramfromserver__;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ParamFromServer paramfromserver__>
	//    2    4:areturn         
	}

	public Integer getPreCheckResult()
	{
		return preCheckResult;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Integer preCheckResult>
	//    2    4:areturn         
	}

	public List getPreContentSuccessList()
	{
		return preContentSuccessList;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List preContentSuccessList>
	//    2    4:areturn         
	}

	public int getRawX__()
	{
		return rawX__;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int rawX__>
	//    2    4:ireturn         
	}

	public int getRawY__()
	{
		return rawY__;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int rawY__>
	//    2    4:ireturn         
	}

	public long getRepeatedCount()
	{
		return repeatedCount;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field long repeatedCount>
	//    2    4:lreturn         
	}

	public String getSeq__()
	{
		return seq__;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field String seq__>
	//    2    4:areturn         
	}

	public Long getShowTimeDuration__()
	{
		return showTimeDuration__;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field Long showTimeDuration__>
	//    2    4:areturn         
	}

	public String getShowid__()
	{
		return showid__;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String showid__>
	//    2    4:areturn         
	}

	public long getTime__()
	{
		return time__;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field long time__>
	//    2    4:lreturn         
	}

	public String getType__()
	{
		return type__;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String type__>
	//    2    4:areturn         
	}

	public Integer getVideoPlayEndProgress__()
	{
		return videoPlayEndProgress__;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field Integer videoPlayEndProgress__>
	//    2    4:areturn         
	}

	public Long getVideoPlayEndTime__()
	{
		return videoPlayEndTime__;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Long videoPlayEndTime__>
	//    2    4:areturn         
	}

	public Integer getVideoPlayStartProgress__()
	{
		return videoPlayStartProgress__;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field Integer videoPlayStartProgress__>
	//    2    4:areturn         
	}

	public Long getVideoPlayStartTime__()
	{
		return videoPlayStartTime__;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Long videoPlayStartTime__>
	//    2    4:areturn         
	}

	public void setAppDownloadRelatedActionSource(Integer integer)
	{
		appDownloadRelatedActionSource = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field Integer appDownloadRelatedActionSource>
	//    3    5:return          
	}

	public void setClickSuccessDestination__(String s)
	{
		clickSuccessDestination__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String clickSuccessDestination__>
	//    3    5:return          
	}

	public void setCloseReason(List list)
	{
		if(list != null && list.size() > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          67
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #154 <Method int List.size()>
	//*   4   10:ifle            67
		{
			closeReason = ((List) (new ArrayList()));
	//    5   13:aload_0         
	//    6   14:new             #156 <Class ArrayList>
	//    7   17:dup             
	//    8   18:invokespecial   #157 <Method void ArrayList()>
	//    9   21:putfield        #80  <Field List closeReason>
			String s;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); closeReason.add(((Object) (ad.c(s)))))
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #161 <Method Iterator List.iterator()>
	//*  12   30:astore_1        
	//*  13   31:aload_1         
	//*  14   32:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//*  15   37:ifeq            67
				s = (String)((Iterator) (list)).next();
	//   16   40:aload_1         
	//   17   41:invokeinterface #171 <Method Object Iterator.next()>
	//   18   46:checkcast       #173 <Class String>
	//   19   49:astore_2        

	//   20   50:aload_0         
	//   21   51:getfield        #80  <Field List closeReason>
	//   22   54:aload_2         
	//   23   55:invokestatic    #179 <Method String ad.c(String)>
	//   24   58:invokeinterface #183 <Method boolean List.add(Object)>
	//   25   63:pop             
		}
	//*  26   64:goto            31
	//   27   67:return          
	}

	public void setContentDownMethod(Integer integer)
	{
		contentDownMethod = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field Integer contentDownMethod>
	//    3    5:return          
	}

	public void setExt(String s)
	{
		ext = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String ext>
	//    3    5:return          
	}

	public void setInstallRelatedActionSource(Integer integer)
	{
		installRelatedActionSource = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field Integer installRelatedActionSource>
	//    3    5:return          
	}

	public void setIntentDestination(Integer integer)
	{
		intentDestination = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field Integer intentDestination>
	//    3    5:return          
	}

	public void setIntentFailReason(Integer integer)
	{
		intentFailReason = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field Integer intentFailReason>
	//    3    5:return          
	}

	public void setLastFailReason(String s)
	{
		lastFailReason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field String lastFailReason>
	//    3    5:return          
	}

	public void setLastReportTime(String s)
	{
		lastReportTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field String lastReportTime>
	//    3    5:return          
	}

	public void setMaxShowRatio__(Integer integer)
	{
		maxShowRatio__ = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field Integer maxShowRatio__>
	//    3    5:return          
	}

	public void setOpTimesInLandingPage__(int i)
	{
		opTimesInLandingPage__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int opTimesInLandingPage__>
	//    3    5:return          
	}

	public void setParamfromserver__(ParamFromServer paramfromserver)
	{
		paramfromserver__ = paramfromserver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field ParamFromServer paramfromserver__>
	//    3    5:return          
	}

	public void setPreCheckResult(Integer integer)
	{
		preCheckResult = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field Integer preCheckResult>
	//    3    5:return          
	}

	public void setPreContentSuccessList(List list)
	{
		preContentSuccessList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field List preContentSuccessList>
	//    3    5:return          
	}

	public void setRawX__(int i)
	{
		rawX__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field int rawX__>
	//    3    5:return          
	}

	public void setRawY__(int i)
	{
		rawY__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int rawY__>
	//    3    5:return          
	}

	public void setRepeatedCount(long l)
	{
		repeatedCount = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #121 <Field long repeatedCount>
	//    3    5:return          
	}

	public void setSeq__(String s)
	{
		seq__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field String seq__>
	//    3    5:return          
	}

	public void setShowTimeDuration__(Long long1)
	{
		showTimeDuration__ = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field Long showTimeDuration__>
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

	public void setTime__(long l)
	{
		time__ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #60  <Field long time__>
	//    3    5:return          
	}

	public void setType__(EventType eventtype)
	{
		type__ = eventtype.value();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #214 <Method String EventType.value()>
	//    3    5:putfield        #48  <Field String type__>
	//    4    8:return          
	}

	public void setType__(String s)
	{
		type__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String type__>
	//    3    5:return          
	}

	public void setVideoPlayEndProgress__(Integer integer)
	{
		videoPlayEndProgress__ = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field Integer videoPlayEndProgress__>
	//    3    5:return          
	}

	public void setVideoPlayEndTime__(Long long1)
	{
		videoPlayEndTime__ = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field Long videoPlayEndTime__>
	//    3    5:return          
	}

	public void setVideoPlayStartProgress__(Integer integer)
	{
		videoPlayStartProgress__ = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #140 <Field Integer videoPlayStartProgress__>
	//    3    5:return          
	}

	public void setVideoPlayStartTime__(Long long1)
	{
		videoPlayStartTime__ = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #143 <Field Long videoPlayStartTime__>
	//    3    5:return          
	}

	private Integer appDownloadRelatedActionSource;
	private String clickSuccessDestination__;
	private List closeReason;
	private Integer contentDownMethod;
	private String ext;
	private Integer installRelatedActionSource;
	private Integer intentDestination;
	private Integer intentFailReason;
	private String lastFailReason;
	private String lastReportTime;
	private Integer maxShowRatio__;
	private int opTimesInLandingPage__;
	private ParamFromServer paramfromserver__;
	private Integer preCheckResult;
	private List preContentSuccessList;
	private int rawX__;
	private int rawY__;
	private long repeatedCount;
	private String seq__;
	private Long showTimeDuration__;
	private String showid__;
	private long time__;
	private String type__;
	private Integer videoPlayEndProgress__;
	private Long videoPlayEndTime__;
	private Integer videoPlayStartProgress__;
	private Long videoPlayStartTime__;
}
