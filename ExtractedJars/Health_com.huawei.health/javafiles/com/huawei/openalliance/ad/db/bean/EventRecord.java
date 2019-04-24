// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.db.bean;

import java.util.List;

// Referenced classes of package com.huawei.openalliance.ad.db.bean:
//			RecordBean, EncryptionField

public class EventRecord extends RecordBean
{

	public EventRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void RecordBean()>
		showTimeDuration_ = 0xfffe4df9L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #60  <Long 0xfffe4df9L>
	//    4    8:putfield        #63  <Field long showTimeDuration_>
		maxShowRatio_ = 0xfffe4df9;
	//    5   11:aload_0         
	//    6   12:ldc1            #64  <Int 0xfffe4df9>
	//    7   14:putfield        #66  <Field int maxShowRatio_>
		videoPlayStartTime_ = 0xfffe4df9L;
	//    8   17:aload_0         
	//    9   18:ldc2w           #60  <Long 0xfffe4df9L>
	//   10   21:putfield        #68  <Field long videoPlayStartTime_>
		videoPlayEndTime_ = 0xfffe4df9L;
	//   11   24:aload_0         
	//   12   25:ldc2w           #60  <Long 0xfffe4df9L>
	//   13   28:putfield        #70  <Field long videoPlayEndTime_>
		videoPlayStartProgress_ = 0xfffe4df9;
	//   14   31:aload_0         
	//   15   32:ldc1            #64  <Int 0xfffe4df9>
	//   16   34:putfield        #72  <Field int videoPlayStartProgress_>
		videoPlayEndProgress_ = 0xfffe4df9;
	//   17   37:aload_0         
	//   18   38:ldc1            #64  <Int 0xfffe4df9>
	//   19   40:putfield        #74  <Field int videoPlayEndProgress_>
	//   20   43:return          
	}

	public int getAdType_()
	{
		return adType_;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int adType_>
	//    2    4:ireturn         
	}

	public String getAppDownloadRelatedActionSource()
	{
		return appDownloadRelatedActionSource;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String appDownloadRelatedActionSource>
	//    2    4:areturn         
	}

	public String getClickSuccessDestination_()
	{
		return clickSuccessDestination_;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String clickSuccessDestination_>
	//    2    4:areturn         
	}

	public String getContentDownMethod()
	{
		return contentDownMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String contentDownMethod>
	//    2    4:areturn         
	}

	public String getExt()
	{
		return ext;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String ext>
	//    2    4:areturn         
	}

	public String getInstallRelatedActionSource()
	{
		return installRelatedActionSource;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String installRelatedActionSource>
	//    2    4:areturn         
	}

	public String getIntentDest()
	{
		return intentDest;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String intentDest>
	//    2    4:areturn         
	}

	public String getIntentFailReason()
	{
		return intentFailReason;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String intentFailReason>
	//    2    4:areturn         
	}

	public List getKeyWords()
	{
		return keyWords;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field List keyWords>
	//    2    4:areturn         
	}

	public String getLastFailReason()
	{
		return lastFailReason;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field String lastFailReason>
	//    2    4:areturn         
	}

	public String getLastReportTime()
	{
		return lastReportTime;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String lastReportTime>
	//    2    4:areturn         
	}

	public int getMaxShowRatio_()
	{
		return maxShowRatio_;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int maxShowRatio_>
	//    2    4:ireturn         
	}

	public int getOpTimesInLandingPage_()
	{
		return opTimesInLandingPage_;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int opTimesInLandingPage_>
	//    2    4:ireturn         
	}

	public EncryptionField getParamFromServer_()
	{
		return paramFromServer_;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field EncryptionField paramFromServer_>
	//    2    4:areturn         
	}

	public String getPreCheckResult()
	{
		return preCheckResult;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field String preCheckResult>
	//    2    4:areturn         
	}

	public List getPreContentSuccessList()
	{
		return preContentSuccessList;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field List preContentSuccessList>
	//    2    4:areturn         
	}

	public int getRawX_()
	{
		return rawX_;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int rawX_>
	//    2    4:ireturn         
	}

	public int getRawY_()
	{
		return rawY_;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int rawY_>
	//    2    4:ireturn         
	}

	public long getRepeatedCount()
	{
		return repeatedCount;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field long repeatedCount>
	//    2    4:lreturn         
	}

	public long getShowTimeDuration_()
	{
		return showTimeDuration_;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field long showTimeDuration_>
	//    2    4:lreturn         
	}

	public String getShowid_()
	{
		return showid_;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String showid_>
	//    2    4:areturn         
	}

	public long getTime_()
	{
		return time_;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field long time_>
	//    2    4:lreturn         
	}

	public String getType_()
	{
		return type_;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field String type_>
	//    2    4:areturn         
	}

	public int getVideoPlayEndProgress_()
	{
		return videoPlayEndProgress_;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int videoPlayEndProgress_>
	//    2    4:ireturn         
	}

	public long getVideoPlayEndTime_()
	{
		return videoPlayEndTime_;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long videoPlayEndTime_>
	//    2    4:lreturn         
	}

	public int getVideoPlayStartProgress_()
	{
		return videoPlayStartProgress_;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int videoPlayStartProgress_>
	//    2    4:ireturn         
	}

	public long getVideoPlayStartTime_()
	{
		return videoPlayStartTime_;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long videoPlayStartTime_>
	//    2    4:lreturn         
	}

	public String get_id()
	{
		return _id;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field String _id>
	//    2    4:areturn         
	}

	public void setAdType_(int i)
	{
		adType_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field int adType_>
	//    3    5:return          
	}

	public void setAppDownloadRelatedActionSource(String s)
	{
		appDownloadRelatedActionSource = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field String appDownloadRelatedActionSource>
	//    3    5:return          
	}

	public void setClickSuccessDestination_(String s)
	{
		clickSuccessDestination_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field String clickSuccessDestination_>
	//    3    5:return          
	}

	public void setContentDownMethod(String s)
	{
		contentDownMethod = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field String contentDownMethod>
	//    3    5:return          
	}

	public void setExt(String s)
	{
		ext = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field String ext>
	//    3    5:return          
	}

	public void setInstallRelatedActionSource(String s)
	{
		installRelatedActionSource = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field String installRelatedActionSource>
	//    3    5:return          
	}

	public void setIntentDest(String s)
	{
		intentDest = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field String intentDest>
	//    3    5:return          
	}

	public void setIntentFailReason(String s)
	{
		intentFailReason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field String intentFailReason>
	//    3    5:return          
	}

	public void setKeyWords(List list)
	{
		keyWords = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field List keyWords>
	//    3    5:return          
	}

	public void setLastFailReason(String s)
	{
		lastFailReason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field String lastFailReason>
	//    3    5:return          
	}

	public void setLastReportTime(String s)
	{
		lastReportTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field String lastReportTime>
	//    3    5:return          
	}

	public void setMaxShowRatio_(int i)
	{
		maxShowRatio_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field int maxShowRatio_>
	//    3    5:return          
	}

	public void setOpTimesInLandingPage_(int i)
	{
		opTimesInLandingPage_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #117 <Field int opTimesInLandingPage_>
	//    3    5:return          
	}

	public void setParamFromServer_(EncryptionField encryptionfield)
	{
		paramFromServer_ = encryptionfield;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field EncryptionField paramFromServer_>
	//    3    5:return          
	}

	public void setParamFromServer_(String s)
	{
		if(paramFromServer_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field EncryptionField paramFromServer_>
	//*   2    4:ifnonnull       20
			paramFromServer_ = new EncryptionField(java/lang/String);
	//    3    7:aload_0         
	//    4    8:new             #177 <Class EncryptionField>
	//    5   11:dup             
	//    6   12:ldc1            #179 <Class String>
	//    7   14:invokespecial   #182 <Method void EncryptionField(Class)>
	//    8   17:putfield        #121 <Field EncryptionField paramFromServer_>
		paramFromServer_.setOriginalField(((Object) (s)));
	//    9   20:aload_0         
	//   10   21:getfield        #121 <Field EncryptionField paramFromServer_>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #186 <Method void EncryptionField.setOriginalField(Object)>
	//   13   28:return          
	}

	public void setPreCheckResult(String s)
	{
		preCheckResult = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field String preCheckResult>
	//    3    5:return          
	}

	public void setPreContentSuccessList(List list)
	{
		preContentSuccessList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field List preContentSuccessList>
	//    3    5:return          
	}

	public void setRawX_(int i)
	{
		rawX_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #131 <Field int rawX_>
	//    3    5:return          
	}

	public void setRawY_(int i)
	{
		rawY_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #134 <Field int rawY_>
	//    3    5:return          
	}

	public void setRepeatedCount(long l)
	{
		repeatedCount = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #138 <Field long repeatedCount>
	//    3    5:return          
	}

	public void setShowTimeDuration_(long l)
	{
		showTimeDuration_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #63  <Field long showTimeDuration_>
	//    3    5:return          
	}

	public void setShowid_(String s)
	{
		showid_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field String showid_>
	//    3    5:return          
	}

	public void setTime_(long l)
	{
		time_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #145 <Field long time_>
	//    3    5:return          
	}

	public void setType_(String s)
	{
		type_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field String type_>
	//    3    5:return          
	}

	public void setVideoPlayEndProgress_(int i)
	{
		videoPlayEndProgress_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int videoPlayEndProgress_>
	//    3    5:return          
	}

	public void setVideoPlayEndTime_(long l)
	{
		videoPlayEndTime_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #70  <Field long videoPlayEndTime_>
	//    3    5:return          
	}

	public void setVideoPlayStartProgress_(int i)
	{
		videoPlayStartProgress_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int videoPlayStartProgress_>
	//    3    5:return          
	}

	public void setVideoPlayStartTime_(long l)
	{
		videoPlayStartTime_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #68  <Field long videoPlayStartTime_>
	//    3    5:return          
	}

	public void set_id(String s)
	{
		_id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field String _id>
	//    3    5:return          
	}

	public static final String AD_TYPE = "adType";
	public static final String LAST_FAIL_REASON = "lastFailReason";
	public static final String LAST_REPORT_TIME = "lastReportTime";
	public static final String REPEATED_COUNT = "repeatedCount";
	private static final String TAG = "EventRecord";
	public static final String TIME = "time";
	private String _id;
	private int adType_;
	private String appDownloadRelatedActionSource;
	private String clickSuccessDestination_;
	private String contentDownMethod;
	private String ext;
	private String installRelatedActionSource;
	private String intentDest;
	private String intentFailReason;
	private List keyWords;
	private String lastFailReason;
	private String lastReportTime;
	private int maxShowRatio_;
	private int opTimesInLandingPage_;
	private EncryptionField paramFromServer_;
	private String preCheckResult;
	private List preContentSuccessList;
	private int rawX_;
	private int rawY_;
	private long repeatedCount;
	private long showTimeDuration_;
	private String showid_;
	private long time_;
	private String type_;
	private int videoPlayEndProgress_;
	private long videoPlayEndTime_;
	private int videoPlayStartProgress_;
	private long videoPlayStartTime_;
}
