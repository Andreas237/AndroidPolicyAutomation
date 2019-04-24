// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.tip.TipOfTheWeekNotificationScheduler;

// Referenced classes of package com.pactforcure.app.ui:
//			AccountFormActivity

class AccountFormActivity$1
	implements DtoCallback
{

	public void onError(CodeDescriptionError codedescriptionerror)
	{
		displayRegistrationError(codedescriptionerror.getUserFriendlyErrorMessage());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AccountFormActivity this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method String CodeDescriptionError.getUserFriendlyErrorMessage()>
	//    4    8:invokevirtual   #37  <Method void AccountFormActivity.displayRegistrationError(String)>
	//    5   11:return          
	}

	public void onSuccess(ParticipantRegistrationResponse participantregistrationresponse)
	{
		messageView.setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AccountFormActivity this$0>
	//    2    4:getfield        #43  <Field TextView AccountFormActivity.messageView>
	//    3    7:ldc1            #45  <String "">
	//    4    9:invokevirtual   #51  <Method void TextView.setText(CharSequence)>
		progressBar.setVisibility(8);
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field AccountFormActivity this$0>
	//    7   16:getfield        #55  <Field ProgressBar AccountFormActivity.progressBar>
	//    8   19:bipush          8
	//    9   21:invokevirtual   #61  <Method void ProgressBar.setVisibility(int)>
		val$participant.setRegistered(true);
	//   10   24:aload_0         
	//   11   25:getfield        #22  <Field Participant val$participant>
	//   12   28:iconst_1        
	//   13   29:invokevirtual   #67  <Method void Participant.setRegistered(boolean)>
		ParticipantStorage.saveAccessToken(participantregistrationresponse.getToken());
	//   14   32:aload_1         
	//   15   33:invokevirtual   #72  <Method String ParticipantRegistrationResponse.getToken()>
	//   16   36:invokestatic    #77  <Method void ParticipantStorage.saveAccessToken(String)>
		ParticipantStorage.setUserAsRegistered();
	//   17   39:invokestatic    #80  <Method void ParticipantStorage.setUserAsRegistered()>
		ParticipantStorage.saveParticipant(val$participant);
	//   18   42:aload_0         
	//   19   43:getfield        #22  <Field Participant val$participant>
	//   20   46:invokestatic    #84  <Method void ParticipantStorage.saveParticipant(Participant)>
		TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(((android.content.Context) (AccountFormActivity.this)));
	//   21   49:aload_0         
	//   22   50:getfield        #20  <Field AccountFormActivity this$0>
	//   23   53:invokestatic    #90  <Method void TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(android.content.Context)>
		registrationSuccessDialog();
	//   24   56:aload_0         
	//   25   57:getfield        #20  <Field AccountFormActivity this$0>
	//   26   60:invokevirtual   #93  <Method void AccountFormActivity.registrationSuccessDialog()>
	//   27   63:return          
	}

	public volatile void onSuccess(Object obj)
	{
		onSuccess((ParticipantRegistrationResponse)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #69  <Class ParticipantRegistrationResponse>
	//    3    5:invokevirtual   #96  <Method void onSuccess(ParticipantRegistrationResponse)>
	//    4    8:return          
	}

	final AccountFormActivity this$0;
	final Participant val$participant;

	AccountFormActivity$1()
	{
		this$0 = final_accountformactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AccountFormActivity this$0>
		val$participant = Participant.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Participant val$participant>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
