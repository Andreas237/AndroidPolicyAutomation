// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import com.pactforcure.app.survey.ProgressStatus;
import com.pactforcure.app.survey.Survey;

// Referenced classes of package com.pactforcure.app.ui:
//			SurveyTasksFragment

private class SurveyTasksFragment$AddCards$SurveyAndProgress
{

	public final ProgressStatus progressStatus;
	public final Survey survey;
	public final int surveyId;
	final SurveyTasksFragment.AddCards this$1;

	public SurveyTasksFragment$AddCards$SurveyAndProgress(Survey survey1, int i, ProgressStatus progressstatus)
	{
		this$1 = SurveyTasksFragment.AddCards.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field SurveyTasksFragment$AddCards this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		survey = survey1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Survey survey>
		surveyId = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #29  <Field int surveyId>
		progressStatus = progressstatus;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field ProgressStatus progressStatus>
	//   14   25:return          
	}
}
