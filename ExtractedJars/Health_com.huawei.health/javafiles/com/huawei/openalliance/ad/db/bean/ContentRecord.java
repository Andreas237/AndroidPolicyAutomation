// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.db.bean;

import com.huawei.openalliance.ad.beans.metadata.*;
import com.huawei.openalliance.ad.utils.m;
import com.huawei.openalliance.ad.utils.p;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.huawei.openalliance.ad.db.bean:
//			RecordBean, EncryptionField

public class ContentRecord extends RecordBean
	implements Serializable
{

	public ContentRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void RecordBean()>
		showId = String.valueOf(m.f());
	//    2    4:aload_0         
	//    3    5:invokestatic    #114 <Method long m.f()>
	//    4    8:invokestatic    #120 <Method String String.valueOf(long)>
	//    5   11:putfield        #122 <Field String showId>
		showAppLogoFlag_ = 1;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #124 <Field int showAppLogoFlag_>
		fcCtrlDate_ = "";
	//    9   19:aload_0         
	//   10   20:ldc1            #126 <String "">
	//   11   22:putfield        #128 <Field String fcCtrlDate_>
		creativeType_ = 2;
	//   12   25:aload_0         
	//   13   26:iconst_2        
	//   14   27:putfield        #130 <Field int creativeType_>
		adType_ = -1;
	//   15   30:aload_0         
	//   16   31:iconst_m1       
	//   17   32:putfield        #132 <Field int adType_>
	//   18   35:return          
	}

	public int getAdType_()
	{
		return adType_;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int adType_>
	//    2    4:ireturn         
	}

	public List getClickActionList()
	{
		return clickActionList;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field List clickActionList>
	//    2    4:areturn         
	}

	public String getContentDownMethod()
	{
		return contentDownMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field String contentDownMethod>
	//    2    4:areturn         
	}

	public String getContentId_()
	{
		return contentId_;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field String contentId_>
	//    2    4:areturn         
	}

	public int getCreativeType_()
	{
		return creativeType_;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field int creativeType_>
	//    2    4:ireturn         
	}

	public String getCtrlSwitchs()
	{
		return ctrlSwitchs;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field String ctrlSwitchs>
	//    2    4:areturn         
	}

	public ImageInfo getDefaultImageInfo()
	{
		Object obj = ((Object) ((MetaData)p.b(metaData_, com/huawei/openalliance/ad/beans/metadata/MetaData, new Class[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String metaData_>
	//    2    4:ldc1            #158 <Class MetaData>
	//    3    6:iconst_0        
	//    4    7:anewarray       Class[]
	//    5   10:invokestatic    #166 <Method Object p.b(String, Class, Class[])>
	//    6   13:checkcast       #158 <Class MetaData>
	//    7   16:astore_1        
		if(obj != null)
	//*   8   17:aload_1         
	//*   9   18:ifnull          50
		{
			obj = ((Object) (((MetaData) (obj)).getImageInfo__()));
	//   10   21:aload_1         
	//   11   22:invokevirtual   #169 <Method List MetaData.getImageInfo__()>
	//   12   25:astore_1        
			if(obj != null && ((List) (obj)).size() > 0)
	//*  13   26:aload_1         
	//*  14   27:ifnull          50
	//*  15   30:aload_1         
	//*  16   31:invokeinterface #174 <Method int List.size()>
	//*  17   36:ifle            50
				return (ImageInfo)((List) (obj)).get(0);
	//   18   39:aload_1         
	//   19   40:iconst_0        
	//   20   41:invokeinterface #178 <Method Object List.get(int)>
	//   21   46:checkcast       #180 <Class ImageInfo>
	//   22   49:areturn         
		}
		return null;
	//   23   50:aconst_null     
	//   24   51:areturn         
	}

	public String getDetailUrl_()
	{
		return detailUrl_;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field String detailUrl_>
	//    2    4:areturn         
	}

	public int getDisplayCount_()
	{
		return displayCount_;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field int displayCount_>
	//    2    4:ireturn         
	}

	public String getDisplayDate_()
	{
		return displayDate_;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field String displayDate_>
	//    2    4:areturn         
	}

	public long getEndTime_()
	{
		return endTime_;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field long endTime_>
	//    2    4:lreturn         
	}

	public String getFcCtrlDate_()
	{
		return fcCtrlDate_;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field String fcCtrlDate_>
	//    2    4:areturn         
	}

	public int getHeight_()
	{
		return height_;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field int height_>
	//    2    4:ireturn         
	}

	public String getIntentUri_()
	{
		return intentUri_;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field String intentUri_>
	//    2    4:areturn         
	}

	public int getInteractiontype_()
	{
		return interactiontype_;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field int interactiontype_>
	//    2    4:ireturn         
	}

	public List getKeyWords()
	{
		return keyWords;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field List keyWords>
	//    2    4:areturn         
	}

	public int getLandingTitleFlag()
	{
		return landingTitleFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field int landingTitleFlag>
	//    2    4:ireturn         
	}

	public long getLastShowTime_()
	{
		return lastShowTime_;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field long lastShowTime_>
	//    2    4:lreturn         
	}

	public String getLogo2Pos()
	{
		return logo2Pos;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field String logo2Pos>
	//    2    4:areturn         
	}

	public String getLogo2Text()
	{
		return logo2Text;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field String logo2Text>
	//    2    4:areturn         
	}

	public String getMetaData_()
	{
		return metaData_;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String metaData_>
	//    2    4:areturn         
	}

	public EncryptionField getMonitors()
	{
		return monitors;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field EncryptionField monitors>
	//    2    4:areturn         
	}

	public List getNoReportEventList()
	{
		return noReportEventList;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field List noReportEventList>
	//    2    4:areturn         
	}

	public EncryptionField getParamFromServer_()
	{
		return paramFromServer_;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field EncryptionField paramFromServer_>
	//    2    4:areturn         
	}

	public int getPriority_()
	{
		return priority_;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field int priority_>
	//    2    4:ireturn         
	}

	public int getShowAppLogoFlag_()
	{
		return showAppLogoFlag_;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int showAppLogoFlag_>
	//    2    4:ireturn         
	}

	public String getShowId()
	{
		return showId;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field String showId>
	//    2    4:areturn         
	}

	public String getSkipTextPos()
	{
		return skipTextPos;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field String skipTextPos>
	//    2    4:areturn         
	}

	public String getSkipText_()
	{
		return skipText_;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field String skipText_>
	//    2    4:areturn         
	}

	public String getSlotId_()
	{
		return slotId_;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field String slotId_>
	//    2    4:areturn         
	}

	public String getSplashMediaPath()
	{
		return splashMediaPath;
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field String splashMediaPath>
	//    2    4:areturn         
	}

	public int getSplashPreContentFlag_()
	{
		return splashPreContentFlag_;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field int splashPreContentFlag_>
	//    2    4:ireturn         
	}

	public long getStartTime_()
	{
		return startTime_;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field long startTime_>
	//    2    4:lreturn         
	}

	public String getTaskId_()
	{
		return taskId_;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field String taskId_>
	//    2    4:areturn         
	}

	public List getTextStateList()
	{
		return textStateList;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field List textStateList>
	//    2    4:areturn         
	}

	public String getUnique()
	{
		return "materialId";
	//    0    0:ldc2            #264 <String "materialId">
	//    1    3:areturn         
	}

	public long getUpdateTime_()
	{
		return updateTime_;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field long updateTime_>
	//    2    4:lreturn         
	}

	public String getWebConfig()
	{
		return webConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field String webConfig>
	//    2    4:areturn         
	}

	public int getWidth_()
	{
		return width_;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field int width_>
	//    2    4:ireturn         
	}

	public void setAdType_(int i)
	{
		adType_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #132 <Field int adType_>
	//    3    5:return          
	}

	public void setClickActionList(List list)
	{
		clickActionList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field List clickActionList>
	//    3    5:return          
	}

	public void setContentDownMethod(String s)
	{
		contentDownMethod = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field String contentDownMethod>
	//    3    5:return          
	}

	public void setContentId_(String s)
	{
		contentId_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field String contentId_>
	//    3    5:return          
	}

	public void setCreativeType_(int i)
	{
		creativeType_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field int creativeType_>
	//    3    5:return          
	}

	public void setCtrlSwitchs(String s)
	{
		ctrlSwitchs = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field String ctrlSwitchs>
	//    3    5:return          
	}

	public void setDetailUrl_(String s)
	{
		detailUrl_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #183 <Field String detailUrl_>
	//    3    5:return          
	}

	public void setDisplayCount_(int i)
	{
		displayCount_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #186 <Field int displayCount_>
	//    3    5:return          
	}

	public void setDisplayDate_(String s)
	{
		displayDate_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #189 <Field String displayDate_>
	//    3    5:return          
	}

	public void setEndTime_(long l)
	{
		endTime_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #192 <Field long endTime_>
	//    3    5:return          
	}

	public void setFcCtrlDate_(String s)
	{
		fcCtrlDate_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field String fcCtrlDate_>
	//    3    5:return          
	}

	public void setHeight_(int i)
	{
		height_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #196 <Field int height_>
	//    3    5:return          
	}

	public void setIntentUri_(String s)
	{
		intentUri_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #199 <Field String intentUri_>
	//    3    5:return          
	}

	public void setInteractiontype_(int i)
	{
		interactiontype_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #202 <Field int interactiontype_>
	//    3    5:return          
	}

	public void setKeyWords(List list)
	{
		keyWords = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #205 <Field List keyWords>
	//    3    5:return          
	}

	public void setLandingTitleFlag(int i)
	{
		landingTitleFlag = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #209 <Field int landingTitleFlag>
	//    3    5:return          
	}

	public void setLastShowTime_(long l)
	{
		lastShowTime_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #212 <Field long lastShowTime_>
	//    3    5:return          
	}

	public void setLogo2Pos(String s)
	{
		logo2Pos = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #215 <Field String logo2Pos>
	//    3    5:return          
	}

	public void setLogo2Text(String s)
	{
		logo2Text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #218 <Field String logo2Text>
	//    3    5:return          
	}

	public void setMetaData_(String s)
	{
		metaData_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field String metaData_>
	//    3    5:return          
	}

	public void setMonitors(EncryptionField encryptionfield)
	{
		monitors = encryptionfield;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #223 <Field EncryptionField monitors>
	//    3    5:return          
	}

	public void setMonitors(List list)
	{
		EncryptionField encryptionfield = new EncryptionField(java/util/List, com/huawei/openalliance/ad/beans/metadata/Monitor);
	//    0    0:new             #304 <Class EncryptionField>
	//    1    3:dup             
	//    2    4:ldc1            #171 <Class List>
	//    3    6:ldc2            #306 <Class Monitor>
	//    4    9:invokespecial   #309 <Method void EncryptionField(Class, Class)>
	//    5   12:astore_2        
		encryptionfield.setOriginalField(((Object) (list)));
	//    6   13:aload_2         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #313 <Method void EncryptionField.setOriginalField(Object)>
		monitors = encryptionfield;
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:putfield        #223 <Field EncryptionField monitors>
	//   12   23:return          
	}

	public void setNoReportEventList(List list)
	{
		noReportEventList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #227 <Field List noReportEventList>
	//    3    5:return          
	}

	public void setParamFromServer_(EncryptionField encryptionfield)
	{
		paramFromServer_ = encryptionfield;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #230 <Field EncryptionField paramFromServer_>
	//    3    5:return          
	}

	public void setParamFromServer_(String s)
	{
		if(paramFromServer_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field EncryptionField paramFromServer_>
	//*   2    4:ifnonnull       20
			paramFromServer_ = new EncryptionField(java/lang/String);
	//    3    7:aload_0         
	//    4    8:new             #304 <Class EncryptionField>
	//    5   11:dup             
	//    6   12:ldc1            #116 <Class String>
	//    7   14:invokespecial   #320 <Method void EncryptionField(Class)>
	//    8   17:putfield        #230 <Field EncryptionField paramFromServer_>
		paramFromServer_.setOriginalField(((Object) (s)));
	//    9   20:aload_0         
	//   10   21:getfield        #230 <Field EncryptionField paramFromServer_>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #313 <Method void EncryptionField.setOriginalField(Object)>
	//   13   28:return          
	}

	public void setPriority_(int i)
	{
		priority_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #234 <Field int priority_>
	//    3    5:return          
	}

	public void setShowAppLogoFlag_(int i)
	{
		showAppLogoFlag_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field int showAppLogoFlag_>
	//    3    5:return          
	}

	public void setShowId(String s)
	{
		showId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field String showId>
	//    3    5:return          
	}

	public void setSkipTextPos(String s)
	{
		skipTextPos = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #239 <Field String skipTextPos>
	//    3    5:return          
	}

	public void setSkipText_(String s)
	{
		skipText_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #242 <Field String skipText_>
	//    3    5:return          
	}

	public void setSlotId_(String s)
	{
		slotId_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #245 <Field String slotId_>
	//    3    5:return          
	}

	public void setSplashMediaPath(String s)
	{
		splashMediaPath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #248 <Field String splashMediaPath>
	//    3    5:return          
	}

	public void setSplashPreContentFlag_(int i)
	{
		splashPreContentFlag_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #251 <Field int splashPreContentFlag_>
	//    3    5:return          
	}

	public void setStartTime_(long l)
	{
		startTime_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #254 <Field long startTime_>
	//    3    5:return          
	}

	public void setTaskId_(String s)
	{
		taskId_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #257 <Field String taskId_>
	//    3    5:return          
	}

	public void setTextStateList(List list)
	{
		textStateList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #260 <Field List textStateList>
	//    3    5:return          
	}

	public void setUpdateTime_(long l)
	{
		updateTime_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #267 <Field long updateTime_>
	//    3    5:return          
	}

	public void setWebConfig(String s)
	{
		webConfig = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #270 <Field String webConfig>
	//    3    5:return          
	}

	public void setWidth_(int i)
	{
		width_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #273 <Field int width_>
	//    3    5:return          
	}

	public void updateOnAdLoad()
	{
		displayCount_ = displayCount_ + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #186 <Field int displayCount_>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #186 <Field int displayCount_>
		priority_ = 1;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #234 <Field int priority_>
		lastShowTime_ = m.f();
	//    9   15:aload_0         
	//   10   16:invokestatic    #114 <Method long m.f()>
	//   11   19:putfield        #212 <Field long lastShowTime_>
	//   12   22:return          
	}

	public static final String AD_TYPE = "adType";
	public static final String CONTENT_ID = "contentId";
	public static final String DISPLAY_COUNT = "displayCount";
	public static final String DISPLAY_DATE = "displayDate";
	public static final String END_TIME = "endTime";
	public static final String FC_CTRL_DATE = "fcCtrlDate";
	public static final String HEIGHT = "height";
	public static final String LAST_SHOW_TIME = "lastShowTime";
	public static final String PRIORITY = "priority";
	public static final String SLOT_ID = "slotId";
	public static final String SPLASH_MEDIA_PATH = "splashMediaPath";
	public static final String SPLASH_PRE_CONTENT_FLAG = "splashPreContentFlag";
	public static final String START_TIME = "startTime";
	public static final String TASK_ID = "taskId";
	public static final String UPDATE_TIME = "updateTime";
	public static final String WIDTH = "width";
	private static final long serialVersionUID = 0x1d015dcL;
	private int adType_;
	private List clickActionList;
	private String contentDownMethod;
	private String contentId_;
	private int creativeType_;
	private String ctrlSwitchs;
	private String detailUrl_;
	private int displayCount_;
	private String displayDate_;
	private long endTime_;
	private String fcCtrlDate_;
	private int height_;
	private String intentUri_;
	private int interactiontype_;
	private List keyWords;
	private int landingTitleFlag;
	private long lastShowTime_;
	private String logo2Pos;
	private String logo2Text;
	private String metaData_;
	private EncryptionField monitors;
	private List noReportEventList;
	private EncryptionField paramFromServer_;
	private int priority_;
	private int showAppLogoFlag_;
	private String showId;
	private String skipTextPos;
	private String skipText_;
	private String slotId_;
	private String splashMediaPath;
	private int splashPreContentFlag_;
	private long startTime_;
	private String taskId_;
	private List textStateList;
	private long updateTime_;
	private String webConfig;
	private int width_;
}
