// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.core.message.SurveyUploadedMessage;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.survey.PpdResultsStorage;
import org.greenrobot.eventbus.EventBus;

// Referenced classes of package com.pactforcure.app.ui:
//			ParticipantAddressFormActivity

class ParticipantAddressFormActivity$1
	implements DtoCallback
{

	public void onError(CodeDescriptionError codedescriptionerror)
	{
		ParticipantAddressFormActivity.access$300(ParticipantAddressFormActivity.this, codedescriptionerror.getUserFriendlyErrorMessage());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ParticipantAddressFormActivity this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method String CodeDescriptionError.getUserFriendlyErrorMessage()>
	//    4    8:invokestatic    #38  <Method void ParticipantAddressFormActivity.access$300(ParticipantAddressFormActivity, String)>
	//    5   11:return          
	}

	public void onSuccess(ParticipantRegistrationResponse participantregistrationresponse)
	{
		ParticipantAddressFormActivity.access$000(ParticipantAddressFormActivity.this).setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ParticipantAddressFormActivity this$0>
	//    2    4:invokestatic    #44  <Method TextView ParticipantAddressFormActivity.access$000(ParticipantAddressFormActivity)>
	//    3    7:ldc1            #46  <String "">
	//    4    9:invokevirtual   #52  <Method void TextView.setText(CharSequence)>
		ParticipantAddressFormActivity.access$100(ParticipantAddressFormActivity.this).setVisibility(8);
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field ParticipantAddressFormActivity this$0>
	//    7   16:invokestatic    #56  <Method ProgressBar ParticipantAddressFormActivity.access$100(ParticipantAddressFormActivity)>
	//    8   19:bipush          8
	//    9   21:invokevirtual   #62  <Method void ProgressBar.setVisibility(int)>
		PpdResultsStorage.setGivenDnaConsent(Res.getStudyId(), true);
	//   10   24:invokestatic    #68  <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//   11   27:iconst_1        
	//   12   28:invokestatic    #74  <Method void PpdResultsStorage.setGivenDnaConsent(com.pactforcure.app.studies.StudyId, boolean)>
		PpdResultsStorage.setAreHealthEconomicQuestionnairesAvailable(Res.getStudyId(), true);
	//   13   31:invokestatic    #68  <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//   14   34:iconst_1        
	//   15   35:invokestatic    #77  <Method void PpdResultsStorage.setAreHealthEconomicQuestionnairesAvailable(com.pactforcure.app.studies.StudyId, boolean)>
		val$participant.setDNAregistered(true);
	//   16   38:aload_0         
	//   17   39:getfield        #22  <Field Participant val$participant>
	//   18   42:iconst_1        
	//   19   43:invokevirtual   #83  <Method void Participant.setDNAregistered(boolean)>
		ParticipantStorage.saveParticipant(val$participant);
	//   20   46:aload_0         
	//   21   47:getfield        #22  <Field Participant val$participant>
	//   22   50:invokestatic    #89  <Method void ParticipantStorage.saveParticipant(Participant)>
		EventBus.getDefault().postSticky(((Object) (new SurveyUploadedMessage())));
	//   23   53:invokestatic    #95  <Method EventBus EventBus.getDefault()>
	//   24   56:new             #97  <Class SurveyUploadedMessage>
	//   25   59:dup             
	//   26   60:invokespecial   #98  <Method void SurveyUploadedMessage()>
	//   27   63:invokevirtual   #102 <Method void EventBus.postSticky(Object)>
		ParticipantAddressFormActivity.access$200(ParticipantAddressFormActivity.this);
	//   28   66:aload_0         
	//   29   67:getfield        #20  <Field ParticipantAddressFormActivity this$0>
	//   30   70:invokestatic    #106 <Method void ParticipantAddressFormActivity.access$200(ParticipantAddressFormActivity)>
	//   31   73:return          
	}

	public volatile void onSuccess(Object obj)
	{
		onSuccess((ParticipantRegistrationResponse)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #108 <Class ParticipantRegistrationResponse>
	//    3    5:invokevirtual   #110 <Method void onSuccess(ParticipantRegistrationResponse)>
	//    4    8:return          
	}

	final ParticipantAddressFormActivity this$0;
	final Participant val$participant;

	ParticipantAddressFormActivity$1()
	{
		this$0 = final_participantaddressformactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ParticipantAddressFormActivity this$0>
		val$participant = Participant.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Participant val$participant>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
