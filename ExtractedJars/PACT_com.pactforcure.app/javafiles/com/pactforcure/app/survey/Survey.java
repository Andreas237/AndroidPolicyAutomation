// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pactforcure.app.survey:
//			ProgressStatus, UploadStatus

public class Survey
	implements Serializable
{

	Survey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		name = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #48  <String "">
	//    4    7:putfield        #50  <Field String name>
		estimateString = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #48  <String "">
	//    7   13:putfield        #52  <Field String estimateString>
		code = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #48  <String "">
	//   10   19:putfield        #54  <Field String code>
		order = 0;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #56  <Field int order>
		hidden = false;
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:putfield        #58  <Field boolean hidden>
		progressStatus = ProgressStatus.New;
	//   17   32:aload_0         
	//   18   33:getstatic       #63  <Field ProgressStatus ProgressStatus.New>
	//   19   36:putfield        #65  <Field ProgressStatus progressStatus>
		uploadStatus = UploadStatus.UploadStatusNotUploaded;
	//   20   39:aload_0         
	//   21   40:getstatic       #70  <Field UploadStatus UploadStatus.UploadStatusNotUploaded>
	//   22   43:putfield        #72  <Field UploadStatus uploadStatus>
		questions = ((List) (new ArrayList()));
	//   23   46:aload_0         
	//   24   47:new             #74  <Class ArrayList>
	//   25   50:dup             
	//   26   51:invokespecial   #75  <Method void ArrayList()>
	//   27   54:putfield        #77  <Field List questions>
		responses = ((List) (new ArrayList()));
	//   28   57:aload_0         
	//   29   58:new             #74  <Class ArrayList>
	//   30   61:dup             
	//   31   62:invokespecial   #75  <Method void ArrayList()>
	//   32   65:putfield        #79  <Field List responses>
	//   33   68:return          
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String code>
	//    2    4:areturn         
	}

	public String getEstimateString()
	{
		return estimateString;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String estimateString>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String name>
	//    2    4:areturn         
	}

	public int getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int order>
	//    2    4:ireturn         
	}

	public ProgressStatus getProgressStatus()
	{
		return progressStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field ProgressStatus progressStatus>
	//    2    4:areturn         
	}

	public List getQuestions()
	{
		return questions;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List questions>
	//    2    4:areturn         
	}

	public List getResponses()
	{
		return responses;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List responses>
	//    2    4:areturn         
	}

	public UploadStatus getUploadStatus()
	{
		return uploadStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field UploadStatus uploadStatus>
	//    2    4:areturn         
	}

	public boolean isHidden()
	{
		return hidden;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean hidden>
	//    2    4:ireturn         
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String code>
	//    3    5:return          
	}

	public void setEstimateString(String s)
	{
		estimateString = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String estimateString>
	//    3    5:return          
	}

	public void setHidden(boolean flag)
	{
		hidden = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean hidden>
	//    3    5:return          
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String name>
	//    3    5:return          
	}

	public void setOrder(int i)
	{
		order = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int order>
	//    3    5:return          
	}

	public void setProgressStatus(ProgressStatus progressstatus)
	{
		progressStatus = progressstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field ProgressStatus progressStatus>
	//    3    5:return          
	}

	public void setQuestions(List list)
	{
		questions = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field List questions>
	//    3    5:return          
	}

	public void setResponses(List list)
	{
		responses = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field List responses>
	//    3    5:return          
	}

	public void setUploadStatus(UploadStatus uploadstatus)
	{
		uploadStatus = uploadstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field UploadStatus uploadStatus>
	//    3    5:return          
	}

	public static final String DNA = "DNA";
	public static final String ELIGIBILITY = "Eligibility";
	public static final String HEALTH_ECONOMICS_BIMF = "HealthEconomics-BIMF";
	public static final String HEALTH_ECONOMICS_HRPQ = "HealthEconomics-HRPQ";
	public static final String HEALTH_ECONOMICS_HRUQ = "HealthEconomics-HRUQ";
	public static final String HEALTH_ECONOMICS_SF12 = "HealthEconomics-SF12";
	public static final String PPD = "PPD";
	private String code;
	private String estimateString;
	private boolean hidden;
	private String name;
	private int order;
	private ProgressStatus progressStatus;
	private List questions;
	private List responses;
	private UploadStatus uploadStatus;
}
