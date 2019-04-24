// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import com.birbit.android.jobqueue.*;
import com.pactforcure.app.core.message.SurveyCompletedMessage;
import com.pactforcure.app.core.message.SurveyUploadedMessage;
import com.pactforcure.app.participant.ParticipantServerAgent;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.survey.PpdResultsStorage;
import com.pactforcure.app.survey.ProgressStatus;
import org.greenrobot.eventbus.EventBus;

public class DnaKitToggleJob extends Job
{

	public DnaKitToggleJob()
	{
		super((new Params(1)).persist());
	//    0    0:aload_0         
	//    1    1:new             #8   <Class Params>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:invokespecial   #11  <Method void Params(int)>
	//    5    9:invokevirtual   #15  <Method Params Params.persist()>
	//    6   12:invokespecial   #18  <Method void Job(Params)>
	//    7   15:return          
	}

	public void onAdded()
	{
		PpdResultsStorage.setSentDnaKitBackProgress(Res.getStudyId(), ProgressStatus.Completed);
	//    0    0:invokestatic    #26  <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//    1    3:getstatic       #32  <Field ProgressStatus ProgressStatus.Completed>
	//    2    6:invokestatic    #38  <Method void PpdResultsStorage.setSentDnaKitBackProgress(com.pactforcure.app.studies.StudyId, ProgressStatus)>
		EventBus.getDefault().postSticky(((Object) (new SurveyCompletedMessage())));
	//    3    9:invokestatic    #44  <Method EventBus EventBus.getDefault()>
	//    4   12:new             #46  <Class SurveyCompletedMessage>
	//    5   15:dup             
	//    6   16:invokespecial   #48  <Method void SurveyCompletedMessage()>
	//    7   19:invokevirtual   #52  <Method void EventBus.postSticky(Object)>
	//    8   22:return          
	}

	protected void onCancel(int i, Throwable throwable)
	{
	//    0    0:return          
	}

	public void onRun()
		throws Throwable
	{
		(new ParticipantServerAgent()).updateProfileSynchronous();
	//    0    0:new             #61  <Class ParticipantServerAgent>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void ParticipantServerAgent()>
	//    3    7:invokevirtual   #65  <Method void ParticipantServerAgent.updateProfileSynchronous()>
		PpdResultsStorage.setSentDnaKitBackProgress(Res.getStudyId(), ProgressStatus.Uploaded);
	//    4   10:invokestatic    #26  <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//    5   13:getstatic       #68  <Field ProgressStatus ProgressStatus.Uploaded>
	//    6   16:invokestatic    #38  <Method void PpdResultsStorage.setSentDnaKitBackProgress(com.pactforcure.app.studies.StudyId, ProgressStatus)>
		EventBus.getDefault().postSticky(((Object) (new SurveyUploadedMessage())));
	//    7   19:invokestatic    #44  <Method EventBus EventBus.getDefault()>
	//    8   22:new             #70  <Class SurveyUploadedMessage>
	//    9   25:dup             
	//   10   26:invokespecial   #71  <Method void SurveyUploadedMessage()>
	//   11   29:invokevirtual   #52  <Method void EventBus.postSticky(Object)>
	//   12   32:return          
	}

	protected RetryConstraint shouldReRunOnThrowable(Throwable throwable, int i, int j)
	{
		return RetryConstraint.createExponentialBackoff(i, 5000L);
	//    0    0:iload_2         
	//    1    1:ldc2w           #76  <Long 5000L>
	//    2    4:invokestatic    #83  <Method RetryConstraint RetryConstraint.createExponentialBackoff(int, long)>
	//    3    7:areturn         
	}
}
