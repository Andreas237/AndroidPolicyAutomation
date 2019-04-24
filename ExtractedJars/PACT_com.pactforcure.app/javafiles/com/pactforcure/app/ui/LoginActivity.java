// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.*;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.*;
import android.widget.*;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.participant.ParticipantSync;
import com.pactforcure.app.participant.login.CredentialsValidationError;
import com.pactforcure.app.participant.login.Login;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.survey.SurveySync;
import com.pactforcure.app.tip.TipOfTheWeekNotificationScheduler;
import com.pactforcure.app.util.DialogUtils;
import com.pactforcure.app.util.KeyboardUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pactforcure.app.ui:
//			DashboardActivity, ResetPasswordActivity, MainActivity

public class LoginActivity extends AppCompatActivity
{

	public LoginActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AppCompatActivity()>
		handleLoginCallback = new DtoCallbackV2() {

			public void onError(ErrorV2 errorv2)
			{
				tryingToLogin = false;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field LoginActivity this$0>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #25  <Method boolean LoginActivity.access$202(LoginActivity, boolean)>
			//    4    8:pop             
				progressBar.setVisibility(4);
			//    5    9:aload_0         
			//    6   10:getfield        #15  <Field LoginActivity this$0>
			//    7   13:invokestatic    #29  <Method ProgressBar LoginActivity.access$000(LoginActivity)>
			//    8   16:iconst_4        
			//    9   17:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
				displayLoginFailureDialog(errorv2);
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field LoginActivity this$0>
			//   12   24:aload_1         
			//   13   25:invokestatic    #39  <Method void LoginActivity.access$300(LoginActivity, ErrorV2)>
			//   14   28:return          
			}

			public void onSuccess(LoginResponse loginresponse)
			{
				progressBar.setVisibility(4);
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
			//   20   44:invokevirtual   #87  <Method List Attributes.getResponses()>
			//   21   47:invokestatic    #93  <Method void SurveySync.saveResponsesFromDtos(com.pactforcure.app.api.dto.Study, List)>
					SurveySync.syncStateFromDtos(user.getAttributes().getStudy(), user.getAttributes().getResponses(), user.getAttributes().getDnaKitCompleted());
			//   22   50:aload_2         
			//   23   51:invokevirtual   #77  <Method Attributes User.getAttributes()>
			//   24   54:invokevirtual   #83  <Method com.pactforcure.app.api.dto.Study Attributes.getStudy()>
			//   25   57:aload_2         
			//   26   58:invokevirtual   #77  <Method Attributes User.getAttributes()>
			//   27   61:invokevirtual   #87  <Method List Attributes.getResponses()>
			//   28   64:aload_2         
			//   29   65:invokevirtual   #77  <Method Attributes User.getAttributes()>
			//   30   68:invokevirtual   #97  <Method Boolean Attributes.getDnaKitCompleted()>
			//   31   71:invokestatic    #101 <Method void SurveySync.syncStateFromDtos(com.pactforcure.app.api.dto.Study, List, Boolean)>
					TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(((android.content.Context) (LoginActivity.this)));
			//   32   74:aload_0         
			//   33   75:getfield        #15  <Field LoginActivity this$0>
			//   34   78:invokestatic    #107 <Method void TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(android.content.Context)>
					goToDashboard();
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
					tryingToLogin = false;
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
				displayLoginFailureDialog(new ErrorV2(-2));
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
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class LoginActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #36  <Method void LoginActivity$1(LoginActivity)>
	//    7   13:putfield        #38  <Field DtoCallbackV2 handleLoginCallback>
	//    8   16:return          
	}

	private void displayLoginFailureDialog(ErrorV2 errorv2)
	{
		class .Lambda._cls4
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$()
			{
				return ((android.content.DialogInterface.OnClickListener) (instance));
			//    0    0:getstatic       #15  <Field LoginActivity$$Lambda$4 instance>
			//    1    3:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				LoginActivity.lambda$displayLoginFailureDialog$18(dialoginterface, i);
			//    0    0:aload_1         
			//    1    1:iload_2         
			//    2    2:invokestatic    #26  <Method void LoginActivity.lambda$displayLoginFailureDialog$18(DialogInterface, int)>
			//    3    5:return          
			}

			private static final .Lambda._cls4 instance = new .Lambda._cls4();

			static 
			{
			//    0    0:new             #2   <Class LoginActivity$$Lambda$4>
			//    1    3:dup             
			//    2    4:invokespecial   #13  <Method void LoginActivity$$Lambda$4()>
			//    3    7:putstatic       #15  <Field LoginActivity$$Lambda$4 instance>
			//*   4   10:return          
			}

			private .Lambda._cls4()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #17  <Method void Object()>
			//    2    4:return          
			}
		}

		errorv2 = ((ErrorV2) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(((CharSequence) (getString(0x7f08003c)))).setMessage(0x7f08003b).setPositiveButton(0x7f080320, .Lambda._cls4.lambdaFactory.()).create()));
	//    0    0:new             #59  <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:ldc1            #63  <Int 0x7f08003c>
	//    6   11:invokevirtual   #67  <Method String getString(int)>
	//    7   14:invokevirtual   #71  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    8   17:ldc1            #72  <Int 0x7f08003b>
	//    9   19:invokevirtual   #76  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
	//   10   22:ldc1            #77  <Int 0x7f080320>
	//   11   24:invokestatic    #83  <Method android.content.DialogInterface$OnClickListener LoginActivity$$Lambda$4.lambdaFactory$()>
	//   12   27:invokevirtual   #87  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   30:invokevirtual   #91  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   14   33:astore_1        
		DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (errorv2)));
	//   15   34:aload_1         
	//   16   35:invokestatic    #97  <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
		if(!isFinishing())
	//*  17   38:aload_0         
	//*  18   39:invokevirtual   #101 <Method boolean isFinishing()>
	//*  19   42:ifne            49
			((AlertDialog) (errorv2)).show();
	//   20   45:aload_1         
	//   21   46:invokevirtual   #106 <Method void AlertDialog.show()>
	//   22   49:return          
	}

	private void goToDashboard()
	{
		Intent intent = new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/DashboardActivity);
	//    0    0:new             #108 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #110 <Class DashboardActivity>
	//    4    7:invokespecial   #113 <Method void Intent(android.content.Context, Class)>
	//    5   10:astore_1        
		intent.setFlags(0x10008000);
	//    6   11:aload_1         
	//    7   12:ldc1            #114 <Int 0x10008000>
	//    8   14:invokevirtual   #118 <Method Intent Intent.setFlags(int)>
	//    9   17:pop             
		startActivity(intent);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #122 <Method void startActivity(Intent)>
	//   13   23:return          
	}

	private void goToResetPasswordScreen()
	{
		startActivity(new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/ResetPasswordActivity));
	//    0    0:aload_0         
	//    1    1:new             #108 <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:ldc1            #125 <Class ResetPasswordActivity>
	//    5    8:invokespecial   #113 <Method void Intent(android.content.Context, Class)>
	//    6   11:invokevirtual   #122 <Method void startActivity(Intent)>
		overridePendingTransition(0x7f050019, 0x7f05001a);
	//    7   14:aload_0         
	//    8   15:ldc1            #126 <Int 0x7f050019>
	//    9   17:ldc1            #127 <Int 0x7f05001a>
	//   10   19:invokevirtual   #131 <Method void overridePendingTransition(int, int)>
	//   11   22:return          
	}

	private void handleLoginValidationErrors(List list)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #139 <Method Iterator List.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            127
			CredentialsValidationError credentialsvalidationerror = (CredentialsValidationError)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #148 <Method Object Iterator.next()>
	//    8   22:checkcast       #150 <Class CredentialsValidationError>
	//    9   25:astore_2        
			static class _cls2
			{

				static final int $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[];

				static 
				{
					$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError = new int[CredentialsValidationError.values().length];
				//    0    0:invokestatic    #18  <Method CredentialsValidationError[] CredentialsValidationError.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
					try
					{
						$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.EMPTY_EMAIL.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
				//    5   12:getstatic       #24  <Field CredentialsValidationError CredentialsValidationError.EMPTY_EMAIL>
				//    6   15:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
				//*  10   23:getstatic       #31  <Field CredentialsValidationError CredentialsValidationError.EMPTY_PASSWORD>
				//*  11   26:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
				//*  15   34:getstatic       #34  <Field CredentialsValidationError CredentialsValidationError.INVALID_EMAIL>
				//*  16   37:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
				//*  20   45:getstatic       #37  <Field CredentialsValidationError CredentialsValidationError.INVALID_PASSWORD>
				//*  21   48:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:return          
				//*  25   54:astore_0        
				//*  26   55:return          
				//*  27   56:astore_0        
				//*  28   57:goto            42
				//*  29   60:astore_0        
				//*  30   61:goto            31
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   31   64:astore_0        
					try
					{
						$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.EMPTY_PASSWORD.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror2) { }
					try
					{
						$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.INVALID_EMAIL.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.INVALID_PASSWORD.ordinal()] = 4;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  32   65:goto            20
				}
			}

			switch(_cls2..SwitchMap.com.pactforcure.app.participant.login.CredentialsValidationError[credentialsvalidationerror.ordinal()])
	//*  10   26:getstatic       #154 <Field int[] LoginActivity$2.$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
	//*  11   29:aload_2         
	//*  12   30:invokevirtual   #158 <Method int CredentialsValidationError.ordinal()>
	//*  13   33:iaload          
			{
	//*  14   34:tableswitch     1 4: default 64
	//	               1 67
	//	               2 82
	//	               3 97
	//	               4 112
	//*  15   64:goto            7
			case 1: // '\001'
				emailView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802d3))));
	//   16   67:aload_0         
	//   17   68:getfield        #160 <Field EditText emailView>
	//   18   71:ldc1            #161 <Int 0x7f0802d3>
	//   19   73:invokestatic    #166 <Method String Res.getStudySpecificString(int)>
	//   20   76:invokevirtual   #172 <Method void EditText.setError(CharSequence)>
				break;

	//*  21   79:goto            7
			case 2: // '\002'
				passwordView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802db))));
	//   22   82:aload_0         
	//   23   83:getfield        #174 <Field EditText passwordView>
	//   24   86:ldc1            #175 <Int 0x7f0802db>
	//   25   88:invokestatic    #166 <Method String Res.getStudySpecificString(int)>
	//   26   91:invokevirtual   #172 <Method void EditText.setError(CharSequence)>
				break;

	//*  27   94:goto            7
			case 3: // '\003'
				emailView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802d7))));
	//   28   97:aload_0         
	//   29   98:getfield        #160 <Field EditText emailView>
	//   30  101:ldc1            #176 <Int 0x7f0802d7>
	//   31  103:invokestatic    #166 <Method String Res.getStudySpecificString(int)>
	//   32  106:invokevirtual   #172 <Method void EditText.setError(CharSequence)>
				break;

	//*  33  109:goto            7
			case 4: // '\004'
				passwordView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802be))));
	//   34  112:aload_0         
	//   35  113:getfield        #174 <Field EditText passwordView>
	//   36  116:ldc1            #177 <Int 0x7f0802be>
	//   37  118:invokestatic    #166 <Method String Res.getStudySpecificString(int)>
	//   38  121:invokevirtual   #172 <Method void EditText.setError(CharSequence)>
				break;
			}
		} while(true);
	//*  39  124:goto            7
	//   40  127:return          
	}

	static void lambda$displayLoginFailureDialog$18(DialogInterface dialoginterface, int i)
	{
	//    0    0:return          
	}

	static void lambda$onCreate$15(LoginActivity loginactivity, View view)
	{
		loginactivity.tryToLogin();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method void tryToLogin()>
	//    2    4:return          
	}

	static boolean lambda$onCreate$16(LoginActivity loginactivity, TextView textview, int i, KeyEvent keyevent)
	{
		if(i == 2)
	//*   0    0:iload_2         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          11
		{
			loginactivity.tryToLogin();
	//    3    5:aload_0         
	//    4    6:invokespecial   #186 <Method void tryToLogin()>
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		} else
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
	}

	static void lambda$onCreate$17(LoginActivity loginactivity, View view)
	{
		loginactivity.goToResetPasswordScreen();
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method void goToResetPasswordScreen()>
	//    2    4:return          
	}

	private void tryToLogin()
	{
		if(tryingToLogin)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean tryingToLogin>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		tryingToLogin = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #51  <Field boolean tryingToLogin>
		KeyboardUtils.dismissKeyboard(((android.app.Activity) (this)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #197 <Method void KeyboardUtils.dismissKeyboard(android.app.Activity)>
		Login login = new Login(((Object) (emailView.getText())).toString(), ((Object) (passwordView.getText())).toString());
	//    9   17:new             #199 <Class Login>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #160 <Field EditText emailView>
	//   13   25:invokevirtual   #203 <Method android.text.Editable EditText.getText()>
	//   14   28:invokevirtual   #209 <Method String Object.toString()>
	//   15   31:aload_0         
	//   16   32:getfield        #174 <Field EditText passwordView>
	//   17   35:invokevirtual   #203 <Method android.text.Editable EditText.getText()>
	//   18   38:invokevirtual   #209 <Method String Object.toString()>
	//   19   41:invokespecial   #212 <Method void Login(String, String)>
	//   20   44:astore_1        
		List list = login.validate();
	//   21   45:aload_1         
	//   22   46:invokevirtual   #216 <Method List Login.validate()>
	//   23   49:astore_2        
		if(list.isEmpty())
	//*  24   50:aload_2         
	//*  25   51:invokeinterface #219 <Method boolean List.isEmpty()>
	//*  26   56:ifeq            76
		{
			progressBar.setVisibility(0);
	//   27   59:aload_0         
	//   28   60:getfield        #43  <Field ProgressBar progressBar>
	//   29   63:iconst_0        
	//   30   64:invokevirtual   #225 <Method void ProgressBar.setVisibility(int)>
			login.authenticate(handleLoginCallback);
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #38  <Field DtoCallbackV2 handleLoginCallback>
	//   34   72:invokevirtual   #229 <Method void Login.authenticate(DtoCallbackV2)>
			return;
	//   35   75:return          
		} else
		{
			handleLoginValidationErrors(list);
	//   36   76:aload_0         
	//   37   77:aload_2         
	//   38   78:invokespecial   #231 <Method void handleLoginValidationErrors(List)>
			tryingToLogin = false;
	//   39   81:aload_0         
	//   40   82:iconst_0        
	//   41   83:putfield        #51  <Field boolean tryingToLogin>
			return;
	//   42   86:return          
		}
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method void AppCompatActivity.onBackPressed()>
		overridePendingTransition(0x7f050018, 0x7f05001b);
	//    2    4:aload_0         
	//    3    5:ldc1            #235 <Int 0x7f050018>
	//    4    7:ldc1            #236 <Int 0x7f05001b>
	//    5    9:invokevirtual   #131 <Method void overridePendingTransition(int, int)>
	//    6   12:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040023);
	//    3    5:aload_0         
	//    4    6:ldc1            #242 <Int 0x7f040023>
	//    5    8:invokevirtual   #245 <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #246 <Int 0x7f0e00af>
	//    9   15:invokevirtual   #250 <Method View findViewById(int)>
	//   10   18:checkcast       #252 <Class Toolbar>
	//   11   21:putfield        #254 <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #254 <Field Toolbar toolbar>
	//   15   29:invokevirtual   #258 <Method void setSupportActionBar(Toolbar)>
		setTitle(0x7f08003a);
	//   16   32:aload_0         
	//   17   33:ldc2            #259 <Int 0x7f08003a>
	//   18   36:invokevirtual   #261 <Method void setTitle(int)>
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	//   19   39:aload_0         
	//   20   40:invokevirtual   #265 <Method ActionBar getSupportActionBar()>
	//   21   43:iconst_1        
	//   22   44:invokevirtual   #271 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
		progressBar = (ProgressBar)findViewById(0x7f0e00a9);
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:ldc2            #272 <Int 0x7f0e00a9>
	//   26   52:invokevirtual   #250 <Method View findViewById(int)>
	//   27   55:checkcast       #221 <Class ProgressBar>
	//   28   58:putfield        #43  <Field ProgressBar progressBar>
		emailView = (EditText)findViewById(0x7f0e009f);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:ldc2            #273 <Int 0x7f0e009f>
	//   32   66:invokevirtual   #250 <Method View findViewById(int)>
	//   33   69:checkcast       #168 <Class EditText>
	//   34   72:putfield        #160 <Field EditText emailView>
		passwordView = (EditText)findViewById(0x7f0e00a3);
	//   35   75:aload_0         
	//   36   76:aload_0         
	//   37   77:ldc2            #274 <Int 0x7f0e00a3>
	//   38   80:invokevirtual   #250 <Method View findViewById(int)>
	//   39   83:checkcast       #168 <Class EditText>
	//   40   86:putfield        #174 <Field EditText passwordView>
		resetPasswordHelpTextView = (TextView)findViewById(0x7f0e00ca);
	//   41   89:aload_0         
	//   42   90:aload_0         
	//   43   91:ldc2            #275 <Int 0x7f0e00ca>
	//   44   94:invokevirtual   #250 <Method View findViewById(int)>
	//   45   97:checkcast       #277 <Class TextView>
	//   46  100:putfield        #279 <Field TextView resetPasswordHelpTextView>
		resetPasswordBtn = (TextView)findViewById(0x7f0e00cc);
	//   47  103:aload_0         
	//   48  104:aload_0         
	//   49  105:ldc2            #280 <Int 0x7f0e00cc>
	//   50  108:invokevirtual   #250 <Method View findViewById(int)>
	//   51  111:checkcast       #277 <Class TextView>
	//   52  114:putfield        #282 <Field TextView resetPasswordBtn>
		emailView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f080330))));
	//   53  117:aload_0         
	//   54  118:getfield        #160 <Field EditText emailView>
	//   55  121:ldc2            #283 <Int 0x7f080330>
	//   56  124:invokestatic    #166 <Method String Res.getStudySpecificString(int)>
	//   57  127:invokevirtual   #286 <Method void EditText.setHint(CharSequence)>
		loginBtn = (Button)findViewById(0x7f0e00cb);
	//   58  130:aload_0         
	//   59  131:aload_0         
	//   60  132:ldc2            #287 <Int 0x7f0e00cb>
	//   61  135:invokevirtual   #250 <Method View findViewById(int)>
	//   62  138:checkcast       #289 <Class Button>
	//   63  141:putfield        #291 <Field Button loginBtn>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(LoginActivity loginactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (loginactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class LoginActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void LoginActivity$$Lambda$1(LoginActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				LoginActivity.lambda$onCreate$15(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field LoginActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void LoginActivity.lambda$onCreate$15(LoginActivity, View)>
			//    4    8:return          
			}

			private final LoginActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = LoginActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field LoginActivity arg$1>
			//    5    9:return          
			}
		}

		loginBtn.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//   64  144:aload_0         
	//   65  145:getfield        #291 <Field Button loginBtn>
	//   66  148:aload_0         
	//   67  149:invokestatic    #296 <Method android.view.View$OnClickListener LoginActivity$$Lambda$1.lambdaFactory$(LoginActivity)>
	//   68  152:invokevirtual   #300 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls2
			implements android.widget.TextView.OnEditorActionListener
		{

			public static android.widget.TextView.OnEditorActionListener lambdaFactory$(LoginActivity loginactivity)
			{
				return ((android.widget.TextView.OnEditorActionListener) (((.Lambda._cls2) (loginactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class LoginActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void LoginActivity$$Lambda$2(LoginActivity)>
			//    4    8:areturn         
			}

			public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
			{
				return LoginActivity.lambda$onCreate$16(arg$1, textview, i, keyevent);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field LoginActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:aload_3         
			//    5    7:invokestatic    #28  <Method boolean LoginActivity.lambda$onCreate$16(LoginActivity, TextView, int, KeyEvent)>
			//    6   10:ireturn         
			}

			private final LoginActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = LoginActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field LoginActivity arg$1>
			//    5    9:return          
			}
		}

		passwordView.setOnEditorActionListener(.Lambda._cls2.lambdaFactory.(this));
	//   69  155:aload_0         
	//   70  156:getfield        #174 <Field EditText passwordView>
	//   71  159:aload_0         
	//   72  160:invokestatic    #305 <Method android.widget.TextView$OnEditorActionListener LoginActivity$$Lambda$2.lambdaFactory$(LoginActivity)>
	//   73  163:invokevirtual   #309 <Method void EditText.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		resetPasswordHelpTextView.setText(((CharSequence) (Html.fromHtml(getString(0x7f08003e)))));
	//   74  166:aload_0         
	//   75  167:getfield        #279 <Field TextView resetPasswordHelpTextView>
	//   76  170:aload_0         
	//   77  171:ldc2            #310 <Int 0x7f08003e>
	//   78  174:invokevirtual   #67  <Method String getString(int)>
	//   79  177:invokestatic    #316 <Method android.text.Spanned Html.fromHtml(String)>
	//   80  180:invokevirtual   #319 <Method void TextView.setText(CharSequence)>
		class .Lambda._cls3
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(LoginActivity loginactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls3) (loginactivity)). new .Lambda._cls3()));
			//    0    0:new             #2   <Class LoginActivity$$Lambda$3>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void LoginActivity$$Lambda$3(LoginActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				LoginActivity.lambda$onCreate$17(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field LoginActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void LoginActivity.lambda$onCreate$17(LoginActivity, View)>
			//    4    8:return          
			}

			private final LoginActivity arg$1;

			private .Lambda._cls3()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = LoginActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field LoginActivity arg$1>
			//    5    9:return          
			}
		}

		resetPasswordBtn.setOnClickListener(.Lambda._cls3.lambdaFactory.(this));
	//   81  183:aload_0         
	//   82  184:getfield        #282 <Field TextView resetPasswordBtn>
	//   83  187:aload_0         
	//   84  188:invokestatic    #322 <Method android.view.View$OnClickListener LoginActivity$$Lambda$3.lambdaFactory$(LoginActivity)>
	//   85  191:invokevirtual   #323 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
	//   86  194:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0001);
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field Toolbar toolbar>
	//    2    4:ldc2            #327 <Int 0x7f0f0001>
	//    3    7:invokevirtual   #330 <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		menuitem.getItemId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #337 <Method int MenuItem.getItemId()>
		JVM INSTR lookupswitch 2: default 32
	//	               16908332: 34
	//	               2131624317: 41;
	//    2    6:lookupswitch    2: default 32
	//	               16908332: 34
	//	               2131624317: 41
		   goto _L1 _L2 _L3
_L1:
		return false;
	//    3   32:iconst_0        
	//    4   33:ireturn         
_L2:
		onBackPressed();
	//    5   34:aload_0         
	//    6   35:invokevirtual   #338 <Method void onBackPressed()>
		  goto _L1
	//*   7   38:goto            32
_L3:
		menuitem = ((MenuItem) (new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/MainActivity)));
	//    8   41:new             #108 <Class Intent>
	//    9   44:dup             
	//   10   45:aload_0         
	//   11   46:ldc2            #340 <Class MainActivity>
	//   12   49:invokespecial   #113 <Method void Intent(android.content.Context, Class)>
	//   13   52:astore_1        
		((Intent) (menuitem)).setFlags(0x10008000);
	//   14   53:aload_1         
	//   15   54:ldc1            #114 <Int 0x10008000>
	//   16   56:invokevirtual   #118 <Method Intent Intent.setFlags(int)>
	//   17   59:pop             
		startActivity(((Intent) (menuitem)));
	//   18   60:aload_0         
	//   19   61:aload_1         
	//   20   62:invokevirtual   #122 <Method void startActivity(Intent)>
		return true;
	//   21   65:iconst_1        
	//   22   66:ireturn         
	}

	private static final String TAG = "LoginActivity";
	private EditText emailView;
	DtoCallbackV2 handleLoginCallback;
	private Button loginBtn;
	private EditText passwordView;
	private ProgressBar progressBar;
	private TextView resetPasswordBtn;
	private TextView resetPasswordHelpTextView;
	private Toolbar toolbar;
	private boolean tryingToLogin;


/*
	static ProgressBar access$000(LoginActivity loginactivity)
	{
		return loginactivity.progressBar;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ProgressBar progressBar>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(LoginActivity loginactivity)
	{
		loginactivity.goToDashboard();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void goToDashboard()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$202(LoginActivity loginactivity, boolean flag)
	{
		loginactivity.tryingToLogin = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field boolean tryingToLogin>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$300(LoginActivity loginactivity, ErrorV2 errorv2)
	{
		loginactivity.displayLoginFailureDialog(errorv2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void displayLoginFailureDialog(ErrorV2)>
		return;
	//    3    5:return          
	}

*/
}
