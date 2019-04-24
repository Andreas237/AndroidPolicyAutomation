// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.core.message.SurveyUploadedMessage;
import com.pactforcure.app.databinding.ActivitySettingsBinding;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.survey.PpdResultsStorage;
import org.greenrobot.eventbus.EventBus;

// Referenced classes of package com.pactforcure.app.ui:
//			SettingsActivity

class SettingsActivity$4
	implements DtoCallback
{

	static void lambda$onError$51(View view)
	{
	//    0    0:return          
	}

	public void onError(CodeDescriptionError codedescriptionerror)
	{
		val$progressDialog.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ProgressDialog val$progressDialog>
	//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$()
			{
				return ((android.view.View.OnClickListener) (instance));
			//    0    0:getstatic       #15  <Field SettingsActivity$4$$Lambda$1 instance>
			//    1    3:areturn         
			}

			public void onClick(View view)
			{
				SettingsActivity._cls4.lambda$onError$51(view);
			//    0    0:aload_1         
			//    1    1:invokestatic    #26  <Method void SettingsActivity$4.lambda$onError$51(View)>
			//    2    4:return          
			}

			private static final .Lambda._cls1 instance = new .Lambda._cls1();

			static 
			{
			//    0    0:new             #2   <Class SettingsActivity$4$$Lambda$1>
			//    1    3:dup             
			//    2    4:invokespecial   #13  <Method void SettingsActivity$4$$Lambda$1()>
			//    3    7:putstatic       #15  <Field SettingsActivity$4$$Lambda$1 instance>
			//*   4   10:return          
			}

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #17  <Method void Object()>
			//    2    4:return          
			}
		}

		codedescriptionerror = ((CodeDescriptionError) (Snackbar.make(findViewById(0x7f0e00f7), ((CharSequence) (Res.getStudySpecificString(0x7f08029c))), -2).setAction(0x7f080320, .Lambda._cls1.lambdaFactory.()).setActionTextColor(getResources().getColor(0x106000b))));
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field SettingsActivity this$0>
	//    5   11:ldc1            #35  <Int 0x7f0e00f7>
	//    6   13:invokevirtual   #39  <Method View SettingsActivity.findViewById(int)>
	//    7   16:ldc1            #40  <Int 0x7f08029c>
	//    8   18:invokestatic    #46  <Method String Res.getStudySpecificString(int)>
	//    9   21:bipush          -2
	//   10   23:invokestatic    #52  <Method Snackbar Snackbar.make(View, CharSequence, int)>
	//   11   26:ldc1            #53  <Int 0x7f080320>
	//   12   28:invokestatic    #59  <Method android.view.View$OnClickListener SettingsActivity$4$$Lambda$1.lambdaFactory$()>
	//   13   31:invokevirtual   #63  <Method Snackbar Snackbar.setAction(int, android.view.View$OnClickListener)>
	//   14   34:aload_0         
	//   15   35:getfield        #20  <Field SettingsActivity this$0>
	//   16   38:invokevirtual   #67  <Method Resources SettingsActivity.getResources()>
	//   17   41:ldc1            #68  <Int 0x106000b>
	//   18   43:invokevirtual   #74  <Method int Resources.getColor(int)>
	//   19   46:invokevirtual   #78  <Method Snackbar Snackbar.setActionTextColor(int)>
	//   20   49:astore_1        
		((TextView)((Snackbar) (codedescriptionerror)).getView().findViewById(0x7f0e011a)).setMaxLines(3);
	//   21   50:aload_1         
	//   22   51:invokevirtual   #82  <Method View Snackbar.getView()>
	//   23   54:ldc1            #83  <Int 0x7f0e011a>
	//   24   56:invokevirtual   #86  <Method View View.findViewById(int)>
	//   25   59:checkcast       #88  <Class TextView>
	//   26   62:iconst_3        
	//   27   63:invokevirtual   #92  <Method void TextView.setMaxLines(int)>
		((Snackbar) (codedescriptionerror)).show();
	//   28   66:aload_1         
	//   29   67:invokevirtual   #95  <Method void Snackbar.show()>
	//   30   70:return          
	}

	public void onSuccess(BaseDto basedto)
	{
		val$progressDialog.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ProgressDialog val$progressDialog>
	//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
		basedto = ((BaseDto) (ParticipantStorage.getParticipant()));
	//    3    7:invokestatic    #103 <Method Participant ParticipantStorage.getParticipant()>
	//    4   10:astore_1        
		((Participant) (basedto)).setDNAregistered(false);
	//    5   11:aload_1         
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #109 <Method void Participant.setDNAregistered(boolean)>
		((Participant) (basedto)).save();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #112 <Method void Participant.save()>
		PpdResultsStorage.setGivenDnaConsent(Res.getStudyId(), false);
	//   10   20:invokestatic    #116 <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//   11   23:iconst_0        
	//   12   24:invokestatic    #122 <Method void PpdResultsStorage.setGivenDnaConsent(com.pactforcure.app.studies.StudyId, boolean)>
		PpdResultsStorage.setSentDnaKitBack(Res.getStudyId(), false);
	//   13   27:invokestatic    #116 <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//   14   30:iconst_0        
	//   15   31:invokestatic    #125 <Method void PpdResultsStorage.setSentDnaKitBack(com.pactforcure.app.studies.StudyId, boolean)>
		SettingsActivity.access$200(SettingsActivity.this).leaveDnaTitle.setVisibility(8);
	//   16   34:aload_0         
	//   17   35:getfield        #20  <Field SettingsActivity this$0>
	//   18   38:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
	//   19   41:getfield        #135 <Field TextView ActivitySettingsBinding.leaveDnaTitle>
	//   20   44:bipush          8
	//   21   46:invokevirtual   #138 <Method void TextView.setVisibility(int)>
		SettingsActivity.access$200(SettingsActivity.this).leaveDnaExplanation.setVisibility(8);
	//   22   49:aload_0         
	//   23   50:getfield        #20  <Field SettingsActivity this$0>
	//   24   53:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
	//   25   56:getfield        #141 <Field TextView ActivitySettingsBinding.leaveDnaExplanation>
	//   26   59:bipush          8
	//   27   61:invokevirtual   #138 <Method void TextView.setVisibility(int)>
		SettingsActivity.access$200(SettingsActivity.this).leaveDnaBtn.setVisibility(8);
	//   28   64:aload_0         
	//   29   65:getfield        #20  <Field SettingsActivity this$0>
	//   30   68:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
	//   31   71:getfield        #144 <Field TextView ActivitySettingsBinding.leaveDnaBtn>
	//   32   74:bipush          8
	//   33   76:invokevirtual   #138 <Method void TextView.setVisibility(int)>
		SettingsActivity.access$200(SettingsActivity.this).addressTitle.setVisibility(8);
	//   34   79:aload_0         
	//   35   80:getfield        #20  <Field SettingsActivity this$0>
	//   36   83:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
	//   37   86:getfield        #147 <Field TextView ActivitySettingsBinding.addressTitle>
	//   38   89:bipush          8
	//   39   91:invokevirtual   #138 <Method void TextView.setVisibility(int)>
		SettingsActivity.access$200(SettingsActivity.this).addressView.setVisibility(8);
	//   40   94:aload_0         
	//   41   95:getfield        #20  <Field SettingsActivity this$0>
	//   42   98:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
	//   43  101:getfield        #150 <Field TextView ActivitySettingsBinding.addressView>
	//   44  104:bipush          8
	//   45  106:invokevirtual   #138 <Method void TextView.setVisibility(int)>
		SettingsActivity.access$200(SettingsActivity.this).addressChangeMail.setVisibility(8);
	//   46  109:aload_0         
	//   47  110:getfield        #20  <Field SettingsActivity this$0>
	//   48  113:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
	//   49  116:getfield        #153 <Field TextView ActivitySettingsBinding.addressChangeMail>
	//   50  119:bipush          8
	//   51  121:invokevirtual   #138 <Method void TextView.setVisibility(int)>
		EventBus.getDefault().postSticky(((Object) (new SurveyUploadedMessage())));
	//   52  124:invokestatic    #159 <Method EventBus EventBus.getDefault()>
	//   53  127:new             #161 <Class SurveyUploadedMessage>
	//   54  130:dup             
	//   55  131:invokespecial   #162 <Method void SurveyUploadedMessage()>
	//   56  134:invokevirtual   #166 <Method void EventBus.postSticky(Object)>
	//   57  137:return          
	}

	public volatile void onSuccess(Object obj)
	{
		onSuccess((BaseDto)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #168 <Class BaseDto>
	//    3    5:invokevirtual   #170 <Method void onSuccess(BaseDto)>
	//    4    8:return          
	}

	final SettingsActivity this$0;
	final ProgressDialog val$progressDialog;

	SettingsActivity$4()
	{
		this$0 = final_settingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field SettingsActivity this$0>
		val$progressDialog = ProgressDialog.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ProgressDialog val$progressDialog>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
