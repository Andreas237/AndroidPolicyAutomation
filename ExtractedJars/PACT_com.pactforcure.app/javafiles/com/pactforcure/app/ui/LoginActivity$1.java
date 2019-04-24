// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.util.Log;
import android.widget.ProgressBar;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.participant.ParticipantSync;
import com.pactforcure.app.survey.SurveySync;
import com.pactforcure.app.tip.TipOfTheWeekNotificationScheduler;

// Referenced classes of package com.pactforcure.app.ui:
//			LoginActivity

class LoginActivity$1
	implements DtoCallbackV2
{

	public void onError(ErrorV2 errorv2)
	{
		LoginActivity.access$202(LoginActivity.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LoginActivity this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #25  <Method boolean LoginActivity.access$202(LoginActivity, boolean)>
	//    4    8:pop             
		LoginActivity.access$000(LoginActivity.this).setVisibility(4);
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field LoginActivity this$0>
	//    7   13:invokestatic    #29  <Method ProgressBar LoginActivity.access$000(LoginActivity)>
	//    8   16:iconst_4        
	//    9   17:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
		LoginActivity.access$300(LoginActivity.this, errorv2);
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field LoginActivity this$0>
	//   12   24:aload_1         
	//   13   25:invokestatic    #39  <Method void LoginActivity.access$300(LoginActivity, ErrorV2)>
	//   14   28:return          
	}

	public void onSuccess(LoginResponse loginresponse)
	{
		LoginActivity.access$000(LoginActivity.this).setVisibility(4);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LoginActivity this$0>
	//    2    4:invokestatic    #29  <Method ProgressBar LoginActivity.access$000(LoginActivity)>
	//    3    7:iconst_4        
	//    4    8:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
		try
		{
			User user = loginresponse.getUser();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #49  <Method User LoginResponse.getUser()>
	//    7   15:astore_2        
			ParticipantStorage.setUserAsRegistered();
	//    8   16:invokestatic    #54  <Method void ParticipantStorage.setUserAsRegistered()>
			ParticipantStorage.setUserHasPassword();
	//    9   19:invokestatic    #57  <Method void ParticipantStorage.setUserHasPassword()>
			ParticipantStorage.saveAccessToken(loginresponse.getToken());
	//   10   22:aload_1         
	//   11   23:invokevirtual   #61  <Method String LoginResponse.getToken()>
	//   12   26:invokestatic    #65  <Method void ParticipantStorage.saveAccessToken(String)>
			ParticipantSync.syncStateWithDto(user);
	//   13   29:aload_2         
	//   14   30:invokestatic    #71  <Method void ParticipantSync.syncStateWithDto(User)>
			SurveySync.saveResponsesFromDtos(user.getAttributes().getStudy(), user.getAttributes().getResponses());
	//   15   33:aload_2         
	//   16   34:invokevirtual   #77  <Method Attributes User.getAttributes()>
	//   17   37:invokevirtual   #83  <Method com.pactforcure.app.api.dto.Study Attributes.getStudy()>
	//   18   40:aload_2         
	//   19   41:invokevirtual   #77  <Method Attributes User.getAttributes()>
	//   20   44:invokevirtual   #87  <Method java.util.List Attributes.getResponses()>
	//   21   47:invokestatic    #93  <Method void SurveySync.saveResponsesFromDtos(com.pactforcure.app.api.dto.Study, java.util.List)>
			SurveySync.syncStateFromDtos(user.getAttributes().getStudy(), user.getAttributes().getResponses(), user.getAttributes().getDnaKitCompleted());
	//   22   50:aload_2         
	//   23   51:invokevirtual   #77  <Method Attributes User.getAttributes()>
	//   24   54:invokevirtual   #83  <Method com.pactforcure.app.api.dto.Study Attributes.getStudy()>
	//   25   57:aload_2         
	//   26   58:invokevirtual   #77  <Method Attributes User.getAttributes()>
	//   27   61:invokevirtual   #87  <Method java.util.List Attributes.getResponses()>
	//   28   64:aload_2         
	//   29   65:invokevirtual   #77  <Method Attributes User.getAttributes()>
	//   30   68:invokevirtual   #97  <Method Boolean Attributes.getDnaKitCompleted()>
	//   31   71:invokestatic    #101 <Method void SurveySync.syncStateFromDtos(com.pactforcure.app.api.dto.Study, java.util.List, Boolean)>
			TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(((android.content.Context) (LoginActivity.this)));
	//   32   74:aload_0         
	//   33   75:getfield        #15  <Field LoginActivity this$0>
	//   34   78:invokestatic    #107 <Method void TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(android.content.Context)>
			LoginActivity.access$100(LoginActivity.this);
	//   35   81:aload_0         
	//   36   82:getfield        #15  <Field LoginActivity this$0>
	//   37   85:invokestatic    #110 <Method void LoginActivity.access$100(LoginActivity)>
			return;
	//   38   88:return          
		}
		// Misplaced declaration of an exception variable
		catch(LoginResponse loginresponse)
	//*  39   89:astore_1        
		{
			LoginActivity.access$202(LoginActivity.this, false);
	//   40   90:aload_0         
	//   41   91:getfield        #15  <Field LoginActivity this$0>
	//   42   94:iconst_0        
	//   43   95:invokestatic    #25  <Method boolean LoginActivity.access$202(LoginActivity, boolean)>
	//   44   98:pop             
		}
		Log.e("LoginActivity", Log.getStackTraceString(((Throwable) (loginresponse))));
	//   45   99:ldc1            #112 <String "LoginActivity">
	//   46  101:aload_1         
	//   47  102:invokestatic    #118 <Method String Log.getStackTraceString(Throwable)>
	//   48  105:invokestatic    #122 <Method int Log.e(String, String)>
	//   49  108:pop             
		LoginActivity.access$300(LoginActivity.this, new ErrorV2(-2));
	//   50  109:aload_0         
	//   51  110:getfield        #15  <Field LoginActivity this$0>
	//   52  113:new             #124 <Class ErrorV2>
	//   53  116:dup             
	//   54  117:bipush          -2
	//   55  119:invokespecial   #126 <Method void ErrorV2(int)>
	//   56  122:invokestatic    #39  <Method void LoginActivity.access$300(LoginActivity, ErrorV2)>
	//   57  125:return          
	}

	public volatile void onSuccess(Object obj)
	{
		onSuccess((LoginResponse)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #45  <Class LoginResponse>
	//    3    5:invokevirtual   #129 <Method void onSuccess(LoginResponse)>
	//    4    8:return          
	}

	final LoginActivity this$0;

	LoginActivity$1()
	{
		this$0 = LoginActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field LoginActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
