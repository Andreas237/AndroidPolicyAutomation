// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.consent.ConsentPdfFactory;
import com.pactforcure.app.participant.*;
import com.pactforcure.app.participant.login.PasswordValidator;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.tip.TipOfTheWeekNotificationScheduler;
import com.pactforcure.app.util.DialogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.researchstack.backbone.model.ConsentDocument;
import org.researchstack.backbone.utils.TextUtils;

// Referenced classes of package com.pactforcure.app.ui:
//			FormActivity, DashboardActivity

public class AccountFormActivity extends FormActivity
{
	private static class FormValidation
	{

		boolean isValid()
		{
			if(((String)formData.get("email")).length() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field Map formData>
		//*   2    4:ldc1            #26  <String "email">
		//*   3    6:invokeinterface #32  <Method Object Map.get(Object)>
		//*   4   11:checkcast       #34  <Class String>
		//*   5   14:invokevirtual   #38  <Method int String.length()>
		//*   6   17:ifne            31
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d3);
		//    7   20:aload_0         
		//    8   21:ldc1            #39  <Int 0x7f0802d3>
		//    9   23:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//   10   26:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//   11   29:iconst_0        
		//   12   30:ireturn         
			}
			if(((String)formData.get("confirmEmail")).length() == 0)
		//*  13   31:aload_0         
		//*  14   32:getfield        #19  <Field Map formData>
		//*  15   35:ldc1            #49  <String "confirmEmail">
		//*  16   37:invokeinterface #32  <Method Object Map.get(Object)>
		//*  17   42:checkcast       #34  <Class String>
		//*  18   45:invokevirtual   #38  <Method int String.length()>
		//*  19   48:ifne            62
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d0);
		//   20   51:aload_0         
		//   21   52:ldc1            #50  <Int 0x7f0802d0>
		//   22   54:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//   23   57:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//   24   60:iconst_0        
		//   25   61:ireturn         
			}
			if(((String)formData.get("password")).length() == 0)
		//*  26   62:aload_0         
		//*  27   63:getfield        #19  <Field Map formData>
		//*  28   66:ldc1            #52  <String "password">
		//*  29   68:invokeinterface #32  <Method Object Map.get(Object)>
		//*  30   73:checkcast       #34  <Class String>
		//*  31   76:invokevirtual   #38  <Method int String.length()>
		//*  32   79:ifne            93
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802db);
		//   33   82:aload_0         
		//   34   83:ldc1            #53  <Int 0x7f0802db>
		//   35   85:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//   36   88:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//   37   91:iconst_0        
		//   38   92:ireturn         
			}
			if(((String)formData.get("confirmPassword")).length() == 0)
		//*  39   93:aload_0         
		//*  40   94:getfield        #19  <Field Map formData>
		//*  41   97:ldc1            #55  <String "confirmPassword">
		//*  42   99:invokeinterface #32  <Method Object Map.get(Object)>
		//*  43  104:checkcast       #34  <Class String>
		//*  44  107:invokevirtual   #38  <Method int String.length()>
		//*  45  110:ifne            124
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d1);
		//   46  113:aload_0         
		//   47  114:ldc1            #56  <Int 0x7f0802d1>
		//   48  116:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//   49  119:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//   50  122:iconst_0        
		//   51  123:ireturn         
			}
			if(!TextUtils.isValidEmail((CharSequence)formData.get("email")))
		//*  52  124:aload_0         
		//*  53  125:getfield        #19  <Field Map formData>
		//*  54  128:ldc1            #26  <String "email">
		//*  55  130:invokeinterface #32  <Method Object Map.get(Object)>
		//*  56  135:checkcast       #58  <Class CharSequence>
		//*  57  138:invokestatic    #64  <Method boolean TextUtils.isValidEmail(CharSequence)>
		//*  58  141:ifne            155
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d7);
		//   59  144:aload_0         
		//   60  145:ldc1            #65  <Int 0x7f0802d7>
		//   61  147:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//   62  150:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//   63  153:iconst_0        
		//   64  154:ireturn         
			}
			if(!TextUtils.isValidEmail((CharSequence)formData.get("confirmEmail")))
		//*  65  155:aload_0         
		//*  66  156:getfield        #19  <Field Map formData>
		//*  67  159:ldc1            #49  <String "confirmEmail">
		//*  68  161:invokeinterface #32  <Method Object Map.get(Object)>
		//*  69  166:checkcast       #58  <Class CharSequence>
		//*  70  169:invokestatic    #64  <Method boolean TextUtils.isValidEmail(CharSequence)>
		//*  71  172:ifne            186
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d7);
		//   72  175:aload_0         
		//   73  176:ldc1            #65  <Int 0x7f0802d7>
		//   74  178:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//   75  181:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//   76  184:iconst_0        
		//   77  185:ireturn         
			}
			if(!((String)formData.get("email")).equals(formData.get("confirmEmail")))
		//*  78  186:aload_0         
		//*  79  187:getfield        #19  <Field Map formData>
		//*  80  190:ldc1            #26  <String "email">
		//*  81  192:invokeinterface #32  <Method Object Map.get(Object)>
		//*  82  197:checkcast       #34  <Class String>
		//*  83  200:aload_0         
		//*  84  201:getfield        #19  <Field Map formData>
		//*  85  204:ldc1            #49  <String "confirmEmail">
		//*  86  206:invokeinterface #32  <Method Object Map.get(Object)>
		//*  87  211:invokevirtual   #69  <Method boolean String.equals(Object)>
		//*  88  214:ifne            228
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d6);
		//   89  217:aload_0         
		//   90  218:ldc1            #70  <Int 0x7f0802d6>
		//   91  220:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//   92  223:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//   93  226:iconst_0        
		//   94  227:ireturn         
			}
			if(!(new PasswordValidator((String)formData.get("password"))).isValid())
		//*  95  228:new             #72  <Class PasswordValidator>
		//*  96  231:dup             
		//*  97  232:aload_0         
		//*  98  233:getfield        #19  <Field Map formData>
		//*  99  236:ldc1            #52  <String "password">
		//* 100  238:invokeinterface #32  <Method Object Map.get(Object)>
		//* 101  243:checkcast       #34  <Class String>
		//* 102  246:invokespecial   #75  <Method void PasswordValidator(String)>
		//* 103  249:invokevirtual   #77  <Method boolean PasswordValidator.isValid()>
		//* 104  252:ifne            266
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802be);
		//  105  255:aload_0         
		//  106  256:ldc1            #78  <Int 0x7f0802be>
		//  107  258:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//  108  261:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//  109  264:iconst_0        
		//  110  265:ireturn         
			}
			if(!((String)formData.get("password")).equals(formData.get("confirmPassword")))
		//* 111  266:aload_0         
		//* 112  267:getfield        #19  <Field Map formData>
		//* 113  270:ldc1            #52  <String "password">
		//* 114  272:invokeinterface #32  <Method Object Map.get(Object)>
		//* 115  277:checkcast       #34  <Class String>
		//* 116  280:aload_0         
		//* 117  281:getfield        #19  <Field Map formData>
		//* 118  284:ldc1            #55  <String "confirmPassword">
		//* 119  286:invokeinterface #32  <Method Object Map.get(Object)>
		//* 120  291:invokevirtual   #69  <Method boolean String.equals(Object)>
		//* 121  294:ifne            308
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802bc);
		//  122  297:aload_0         
		//  123  298:ldc1            #79  <Int 0x7f0802bc>
		//  124  300:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
		//  125  303:putfield        #47  <Field String firstErrorEncounteredMessage>
				return false;
		//  126  306:iconst_0        
		//  127  307:ireturn         
			} else
			{
				return true;
		//  128  308:iconst_1        
		//  129  309:ireturn         
			}
		}

		String firstErrorEncounteredMessage;
		private final Map formData;

		FormValidation(Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			formData = map;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Map formData>
		//    5    9:return          
		}
	}


	public AccountFormActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void FormActivity()>
	//    2    4:return          
	}

	private void combineFormData()
	{
		formData.put("email", ((Object) (((Object) (emailView.getText())).toString().trim())));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field HashMap formData>
	//    2    4:ldc1            #22  <String "email">
	//    3    6:aload_0         
	//    4    7:getfield        #56  <Field EditText emailView>
	//    5   10:invokevirtual   #62  <Method android.text.Editable EditText.getText()>
	//    6   13:invokevirtual   #68  <Method String Object.toString()>
	//    7   16:invokevirtual   #73  <Method String String.trim()>
	//    8   19:invokevirtual   #79  <Method Object HashMap.put(Object, Object)>
	//    9   22:pop             
		formData.put("confirmEmail", ((Object) (((Object) (confirmEmailView.getText())).toString().trim())));
	//   10   23:aload_0         
	//   11   24:getfield        #54  <Field HashMap formData>
	//   12   27:ldc1            #13  <String "confirmEmail">
	//   13   29:aload_0         
	//   14   30:getfield        #81  <Field EditText confirmEmailView>
	//   15   33:invokevirtual   #62  <Method android.text.Editable EditText.getText()>
	//   16   36:invokevirtual   #68  <Method String Object.toString()>
	//   17   39:invokevirtual   #73  <Method String String.trim()>
	//   18   42:invokevirtual   #79  <Method Object HashMap.put(Object, Object)>
	//   19   45:pop             
		formData.put("password", ((Object) (((Object) (passwordView.getText())).toString().trim())));
	//   20   46:aload_0         
	//   21   47:getfield        #54  <Field HashMap formData>
	//   22   50:ldc1            #28  <String "password">
	//   23   52:aload_0         
	//   24   53:getfield        #83  <Field EditText passwordView>
	//   25   56:invokevirtual   #62  <Method android.text.Editable EditText.getText()>
	//   26   59:invokevirtual   #68  <Method String Object.toString()>
	//   27   62:invokevirtual   #73  <Method String String.trim()>
	//   28   65:invokevirtual   #79  <Method Object HashMap.put(Object, Object)>
	//   29   68:pop             
		formData.put("confirmPassword", ((Object) (((Object) (confirmPasswordView.getText())).toString().trim())));
	//   30   69:aload_0         
	//   31   70:getfield        #54  <Field HashMap formData>
	//   32   73:ldc1            #16  <String "confirmPassword">
	//   33   75:aload_0         
	//   34   76:getfield        #85  <Field EditText confirmPasswordView>
	//   35   79:invokevirtual   #62  <Method android.text.Editable EditText.getText()>
	//   36   82:invokevirtual   #68  <Method String Object.toString()>
	//   37   85:invokevirtual   #73  <Method String String.trim()>
	//   38   88:invokevirtual   #79  <Method Object HashMap.put(Object, Object)>
	//   39   91:pop             
	//   40   92:return          
	}

	private void goToDashboard()
	{
		Intent intent = new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/DashboardActivity);
	//    0    0:new             #88  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #90  <Class DashboardActivity>
	//    4    7:invokespecial   #93  <Method void Intent(android.content.Context, Class)>
	//    5   10:astore_1        
		intent.setFlags(0x10008000);
	//    6   11:aload_1         
	//    7   12:ldc1            #94  <Int 0x10008000>
	//    8   14:invokevirtual   #98  <Method Intent Intent.setFlags(int)>
	//    9   17:pop             
		startActivity(intent);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #102 <Method void startActivity(Intent)>
	//   13   23:return          
	}

	private void goToPpdSurvey()
	{
		Intent intent = new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/DashboardActivity);
	//    0    0:new             #88  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #90  <Class DashboardActivity>
	//    4    7:invokespecial   #93  <Method void Intent(android.content.Context, Class)>
	//    5   10:astore_1        
		intent.setFlags(0x10008000);
	//    6   11:aload_1         
	//    7   12:ldc1            #94  <Int 0x10008000>
	//    8   14:invokevirtual   #98  <Method Intent Intent.setFlags(int)>
	//    9   17:pop             
		intent.putExtra("SURVEY_CODE_EXTRA", 0x7f0e0013);
	//   10   18:aload_1         
	//   11   19:ldc1            #105 <String "SURVEY_CODE_EXTRA">
	//   12   21:ldc1            #106 <Int 0x7f0e0013>
	//   13   23:invokevirtual   #110 <Method Intent Intent.putExtra(String, int)>
	//   14   26:pop             
		startActivity(intent);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #102 <Method void startActivity(Intent)>
	//   18   32:return          
	}

	static void lambda$onCreate$4(AccountFormActivity accountformactivity, View view)
	{
		accountformactivity.combineFormData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void combineFormData()>
		view = ((View) (new FormValidation(((Map) (accountformactivity.formData)))));
	//    2    4:new             #8   <Class AccountFormActivity$FormValidation>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field HashMap formData>
	//    6   12:invokespecial   #117 <Method void AccountFormActivity$FormValidation(Map)>
	//    7   15:astore_1        
		if(((FormValidation) (view)).isValid())
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #121 <Method boolean AccountFormActivity$FormValidation.isValid()>
	//*  10   20:ifeq            28
		{
			accountformactivity.registerParticipant();
	//   11   23:aload_0         
	//   12   24:invokespecial   #124 <Method void registerParticipant()>
			return;
	//   13   27:return          
		} else
		{
			Toast.makeText(((android.content.Context) (accountformactivity)), ((CharSequence) (((FormValidation) (view)).firstErrorEncounteredMessage)), 1).show();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #127 <Field String AccountFormActivity$FormValidation.firstErrorEncounteredMessage>
	//   17   33:iconst_1        
	//   18   34:invokestatic    #133 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   19   37:invokevirtual   #136 <Method void Toast.show()>
			return;
	//   20   40:return          
		}
	}

	static void lambda$registrationSuccessDialog$5(AccountFormActivity accountformactivity, DialogInterface dialoginterface, int i)
	{
		accountformactivity.finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method void finish()>
		accountformactivity.goToDashboard();
	//    2    4:aload_0         
	//    3    5:invokespecial   #143 <Method void goToDashboard()>
	//    4    8:return          
	}

	static void lambda$registrationSuccessDialog$6(AccountFormActivity accountformactivity, DialogInterface dialoginterface, int i)
	{
		accountformactivity.finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method void finish()>
		accountformactivity.goToPpdSurvey();
	//    2    4:aload_0         
	//    3    5:invokespecial   #146 <Method void goToPpdSurvey()>
	//    4    8:return          
	}

	private void registerParticipant()
	{
		boolean flag;
		Object obj;
		final Participant participant;
		messageView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802f0))));
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field TextView messageView>
	//    2    4:ldc1            #156 <Int 0x7f0802f0>
	//    3    6:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//    4    9:invokevirtual   #168 <Method void TextView.setText(CharSequence)>
		progressBar.setVisibility(0);
	//    5   12:aload_0         
	//    6   13:getfield        #172 <Field ProgressBar progressBar>
	//    7   16:iconst_0        
	//    8   17:invokevirtual   #178 <Method void ProgressBar.setVisibility(int)>
		bottomBarBtn.setVisibility(8);
	//    9   20:aload_0         
	//   10   21:getfield        #181 <Field TextView bottomBarBtn>
	//   11   24:bipush          8
	//   12   26:invokevirtual   #182 <Method void TextView.setVisibility(int)>
		participant = ParticipantStorage.getParticipant();
	//   13   29:invokestatic    #188 <Method Participant ParticipantStorage.getParticipant()>
	//   14   32:astore_3        
		Participant.updateWithDataFromRegistrationForm(participant, ((Map) (formData)));
	//   15   33:aload_3         
	//   16   34:aload_0         
	//   17   35:getfield        #54  <Field HashMap formData>
	//   18   38:invokestatic    #194 <Method void Participant.updateWithDataFromRegistrationForm(Participant, Map)>
		ParticipantStorage.saveParticipant(participant);
	//   19   41:aload_3         
	//   20   42:invokestatic    #198 <Method void ParticipantStorage.saveParticipant(Participant)>
		flag = false;
	//   21   45:iconst_0        
	//   22   46:istore_1        
		obj = "";
	//   23   47:ldc1            #200 <String "">
	//   24   49:astore_2        
		ConsentPdfFactory.genConsentPdf(consentDocument, participant.buildName(), participant.getBase64Signature(), "general_consent.pdf");
	//   25   50:aload_0         
	//   26   51:getfield        #202 <Field ConsentDocument consentDocument>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #205 <Method String Participant.buildName()>
	//   29   58:aload_3         
	//   30   59:invokevirtual   #208 <Method String Participant.getBase64Signature()>
	//   31   62:ldc1            #210 <String "general_consent.pdf">
	//   32   64:invokestatic    #216 <Method void ConsentPdfFactory.genConsentPdf(ConsentDocument, String, String, String)>
_L1:
		IOException ioexception;
		if(flag)
	//*  33   67:iload_1         
	//*  34   68:ifeq            98
		{
			displayRegistrationError(((String) (obj)));
	//   35   71:aload_0         
	//   36   72:aload_2         
	//   37   73:invokevirtual   #220 <Method void displayRegistrationError(String)>
			return;
	//   38   76:return          
		} else
	//*  39   77:astore_2        
	//*  40   78:ldc1            #31  <String "AccountFormActivity">
	//*  41   80:ldc1            #222 <String "error registering participant">
	//*  42   82:aload_2         
	//*  43   83:invokestatic    #228 <Method int Log.e(String, String, Throwable)>
	//*  44   86:pop             
	//*  45   87:ldc1            #229 <Int 0x7f080259>
	//*  46   89:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//*  47   92:astore_2        
	//*  48   93:iconst_1        
	//*  49   94:istore_1        
	//*  50   95:goto            67
		{
			(new ParticipantServerAgent()).register((String)formData.get("password"), new DtoCallback() {

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
					participant.setRegistered(true);
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
					ParticipantStorage.saveParticipant(participant);
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

				public volatile void onSuccess(Object obj1)
				{
					onSuccess((ParticipantRegistrationResponse)obj1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #69  <Class ParticipantRegistrationResponse>
				//    3    5:invokevirtual   #96  <Method void onSuccess(ParticipantRegistrationResponse)>
				//    4    8:return          
				}

				final AccountFormActivity this$0;
				final Participant val$participant;

			
			{
				this$0 = AccountFormActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AccountFormActivity this$0>
				participant = participant1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Participant val$participant>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   51   98:new             #231 <Class ParticipantServerAgent>
	//   52  101:dup             
	//   53  102:invokespecial   #232 <Method void ParticipantServerAgent()>
	//   54  105:aload_0         
	//   55  106:getfield        #54  <Field HashMap formData>
	//   56  109:ldc1            #28  <String "password">
	//   57  111:invokevirtual   #236 <Method Object HashMap.get(Object)>
	//   58  114:checkcast       #70  <Class String>
	//   59  117:new             #6   <Class AccountFormActivity$1>
	//   60  120:dup             
	//   61  121:aload_0         
	//   62  122:aload_3         
	//   63  123:invokespecial   #239 <Method void AccountFormActivity$1(AccountFormActivity, Participant)>
	//   64  126:invokevirtual   #243 <Method void ParticipantServerAgent.register(String, DtoCallback)>
			return;
	//   65  129:return          
		}
		obj;
_L2:
		Log.e("AccountFormActivity", "error registering participant", ((Throwable) (ioexception)));
		ioexception = ((IOException) (Res.getStudySpecificString(0x7f080259)));
		flag = true;
		  goto _L1
		ioexception;
	//   66  130:astore_2        
		  goto _L2
	//*  67  131:goto            78
		ioexception;
	//   68  134:astore_2        
		  goto _L2
	//*  69  135:goto            78
	}

	protected int getLayoutResId()
	{
		return 0x7f04001b;
	//    0    0:ldc1            #246 <Int 0x7f04001b>
	//    1    2:ireturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method void FormActivity.onCreate(Bundle)>
		setTitle(((CharSequence) (Res.getStudySpecificString(0x7f0802bf))));
	//    3    5:aload_0         
	//    4    6:ldc1            #252 <Int 0x7f0802bf>
	//    5    8:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//    6   11:invokevirtual   #255 <Method void setTitle(CharSequence)>
		consentDocument = (ConsentDocument)getIntent().getSerializableExtra("consentDocument");
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #259 <Method Intent getIntent()>
	//   10   19:ldc1            #19  <String "consentDocument">
	//   11   21:invokevirtual   #263 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   12   24:checkcast       #265 <Class ConsentDocument>
	//   13   27:putfield        #202 <Field ConsentDocument consentDocument>
		formData = (HashMap)getIntent().getSerializableExtra("participantForm");
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:invokevirtual   #259 <Method Intent getIntent()>
	//   17   35:ldc1            #25  <String "participantForm">
	//   18   37:invokevirtual   #263 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   19   40:checkcast       #75  <Class HashMap>
	//   20   43:putfield        #54  <Field HashMap formData>
		emailLabelView = (TextView)findViewById(0x7f0e009e);
	//   21   46:aload_0         
	//   22   47:aload_0         
	//   23   48:ldc2            #266 <Int 0x7f0e009e>
	//   24   51:invokevirtual   #270 <Method View findViewById(int)>
	//   25   54:checkcast       #164 <Class TextView>
	//   26   57:putfield        #272 <Field TextView emailLabelView>
		emailView = (EditText)findViewById(0x7f0e009f);
	//   27   60:aload_0         
	//   28   61:aload_0         
	//   29   62:ldc2            #273 <Int 0x7f0e009f>
	//   30   65:invokevirtual   #270 <Method View findViewById(int)>
	//   31   68:checkcast       #58  <Class EditText>
	//   32   71:putfield        #56  <Field EditText emailView>
		confirmEmailLabelView = (TextView)findViewById(0x7f0e00a0);
	//   33   74:aload_0         
	//   34   75:aload_0         
	//   35   76:ldc2            #274 <Int 0x7f0e00a0>
	//   36   79:invokevirtual   #270 <Method View findViewById(int)>
	//   37   82:checkcast       #164 <Class TextView>
	//   38   85:putfield        #276 <Field TextView confirmEmailLabelView>
		confirmEmailView = (EditText)findViewById(0x7f0e00a1);
	//   39   88:aload_0         
	//   40   89:aload_0         
	//   41   90:ldc2            #277 <Int 0x7f0e00a1>
	//   42   93:invokevirtual   #270 <Method View findViewById(int)>
	//   43   96:checkcast       #58  <Class EditText>
	//   44   99:putfield        #81  <Field EditText confirmEmailView>
		passwordLabelView = (TextView)findViewById(0x7f0e00a2);
	//   45  102:aload_0         
	//   46  103:aload_0         
	//   47  104:ldc2            #278 <Int 0x7f0e00a2>
	//   48  107:invokevirtual   #270 <Method View findViewById(int)>
	//   49  110:checkcast       #164 <Class TextView>
	//   50  113:putfield        #280 <Field TextView passwordLabelView>
		passwordView = (EditText)findViewById(0x7f0e00a3);
	//   51  116:aload_0         
	//   52  117:aload_0         
	//   53  118:ldc2            #281 <Int 0x7f0e00a3>
	//   54  121:invokevirtual   #270 <Method View findViewById(int)>
	//   55  124:checkcast       #58  <Class EditText>
	//   56  127:putfield        #83  <Field EditText passwordView>
		confirmPasswordLabelView = (TextView)findViewById(0x7f0e00a4);
	//   57  130:aload_0         
	//   58  131:aload_0         
	//   59  132:ldc2            #282 <Int 0x7f0e00a4>
	//   60  135:invokevirtual   #270 <Method View findViewById(int)>
	//   61  138:checkcast       #164 <Class TextView>
	//   62  141:putfield        #284 <Field TextView confirmPasswordLabelView>
		confirmPasswordView = (EditText)findViewById(0x7f0e00a5);
	//   63  144:aload_0         
	//   64  145:aload_0         
	//   65  146:ldc2            #285 <Int 0x7f0e00a5>
	//   66  149:invokevirtual   #270 <Method View findViewById(int)>
	//   67  152:checkcast       #58  <Class EditText>
	//   68  155:putfield        #85  <Field EditText confirmPasswordView>
		passwordRulesView = (TextView)findViewById(0x7f0e00a6);
	//   69  158:aload_0         
	//   70  159:aload_0         
	//   71  160:ldc2            #286 <Int 0x7f0e00a6>
	//   72  163:invokevirtual   #270 <Method View findViewById(int)>
	//   73  166:checkcast       #164 <Class TextView>
	//   74  169:putfield        #288 <Field TextView passwordRulesView>
		emailLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802bb))));
	//   75  172:aload_0         
	//   76  173:getfield        #272 <Field TextView emailLabelView>
	//   77  176:ldc2            #289 <Int 0x7f0802bb>
	//   78  179:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   79  182:invokevirtual   #168 <Method void TextView.setText(CharSequence)>
		confirmEmailLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802b8))));
	//   80  185:aload_0         
	//   81  186:getfield        #276 <Field TextView confirmEmailLabelView>
	//   82  189:ldc2            #290 <Int 0x7f0802b8>
	//   83  192:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   84  195:invokevirtual   #168 <Method void TextView.setText(CharSequence)>
		passwordLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802ba))));
	//   85  198:aload_0         
	//   86  199:getfield        #280 <Field TextView passwordLabelView>
	//   87  202:ldc2            #291 <Int 0x7f0802ba>
	//   88  205:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   89  208:invokevirtual   #168 <Method void TextView.setText(CharSequence)>
		confirmPasswordLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802b9))));
	//   90  211:aload_0         
	//   91  212:getfield        #284 <Field TextView confirmPasswordLabelView>
	//   92  215:ldc2            #292 <Int 0x7f0802b9>
	//   93  218:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   94  221:invokevirtual   #168 <Method void TextView.setText(CharSequence)>
		passwordRulesView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802be))));
	//   95  224:aload_0         
	//   96  225:getfield        #288 <Field TextView passwordRulesView>
	//   97  228:ldc2            #293 <Int 0x7f0802be>
	//   98  231:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   99  234:invokevirtual   #168 <Method void TextView.setText(CharSequence)>
		emailView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f080330))));
	//  100  237:aload_0         
	//  101  238:getfield        #56  <Field EditText emailView>
	//  102  241:ldc2            #294 <Int 0x7f080330>
	//  103  244:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//  104  247:invokevirtual   #297 <Method void EditText.setHint(CharSequence)>
		confirmEmailView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f080330))));
	//  105  250:aload_0         
	//  106  251:getfield        #81  <Field EditText confirmEmailView>
	//  107  254:ldc2            #294 <Int 0x7f080330>
	//  108  257:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//  109  260:invokevirtual   #297 <Method void EditText.setHint(CharSequence)>
		passwordView.setHint(((CharSequence) (Res.getRegularString(0x7f080331))));
	//  110  263:aload_0         
	//  111  264:getfield        #83  <Field EditText passwordView>
	//  112  267:ldc2            #298 <Int 0x7f080331>
	//  113  270:invokestatic    #301 <Method String Res.getRegularString(int)>
	//  114  273:invokevirtual   #297 <Method void EditText.setHint(CharSequence)>
		confirmPasswordView.setHint(((CharSequence) (Res.getRegularString(0x7f080331))));
	//  115  276:aload_0         
	//  116  277:getfield        #85  <Field EditText confirmPasswordView>
	//  117  280:ldc2            #298 <Int 0x7f080331>
	//  118  283:invokestatic    #301 <Method String Res.getRegularString(int)>
	//  119  286:invokevirtual   #297 <Method void EditText.setHint(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(AccountFormActivity accountformactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (accountformactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class AccountFormActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void AccountFormActivity$$Lambda$1(AccountFormActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				AccountFormActivity.lambda$onCreate$4(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountFormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void AccountFormActivity.lambda$onCreate$4(AccountFormActivity, View)>
			//    4    8:return          
			}

			private final AccountFormActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = AccountFormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field AccountFormActivity arg$1>
			//    5    9:return          
			}
		}

		bottomBarBtn.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//  120  289:aload_0         
	//  121  290:getfield        #181 <Field TextView bottomBarBtn>
	//  122  293:aload_0         
	//  123  294:invokestatic    #307 <Method android.view.View$OnClickListener AccountFormActivity$$Lambda$1.lambdaFactory$(AccountFormActivity)>
	//  124  297:invokevirtual   #311 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
	//  125  300:return          
	}

	public void registrationSuccessDialog()
	{
		ParticipantStorage.setUserAsRegistered();
	//    0    0:invokestatic    #316 <Method void ParticipantStorage.setUserAsRegistered()>
		ParticipantStorage.setUserHasPassword();
	//    1    3:invokestatic    #319 <Method void ParticipantStorage.setUserHasPassword()>
		class .Lambda._cls2
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(AccountFormActivity accountformactivity)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls2) (accountformactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class AccountFormActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void AccountFormActivity$$Lambda$2(AccountFormActivity)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				AccountFormActivity.lambda$registrationSuccessDialog$5(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountFormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void AccountFormActivity.lambda$registrationSuccessDialog$5(AccountFormActivity, DialogInterface, int)>
			//    5    9:return          
			}

			private final AccountFormActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = AccountFormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field AccountFormActivity arg$1>
			//    5    9:return          
			}
		}

		class .Lambda._cls3
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(AccountFormActivity accountformactivity)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls3) (accountformactivity)). new .Lambda._cls3()));
			//    0    0:new             #2   <Class AccountFormActivity$$Lambda$3>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void AccountFormActivity$$Lambda$3(AccountFormActivity)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				AccountFormActivity.lambda$registrationSuccessDialog$6(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountFormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void AccountFormActivity.lambda$registrationSuccessDialog$6(AccountFormActivity, DialogInterface, int)>
			//    5    9:return          
			}

			private final AccountFormActivity arg$1;

			private .Lambda._cls3()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = AccountFormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field AccountFormActivity arg$1>
			//    5    9:return          
			}
		}

		AlertDialog alertdialog = (new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(((CharSequence) (Res.getStudySpecificString(0x7f08033a)))).setMessage(((CharSequence) (Res.getStudySpecificString(0x7f080339)))).setNegativeButton(((CharSequence) (Res.getStudySpecificString(0x7f0802b2))), .Lambda._cls2.lambdaFactory.(this)).setPositiveButton(((CharSequence) (Res.getStudySpecificString(0x7f080338))), .Lambda._cls3.lambdaFactory.(this)).setCancelable(false).create();
	//    2    6:new             #321 <Class android.support.v7.app.AlertDialog$Builder>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #324 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    6   14:ldc2            #325 <Int 0x7f08033a>
	//    7   17:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//    8   20:invokevirtual   #328 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    9   23:ldc2            #329 <Int 0x7f080339>
	//   10   26:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   11   29:invokevirtual   #332 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   12   32:ldc2            #333 <Int 0x7f0802b2>
	//   13   35:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   14   38:aload_0         
	//   15   39:invokestatic    #338 <Method android.content.DialogInterface$OnClickListener AccountFormActivity$$Lambda$2.lambdaFactory$(AccountFormActivity)>
	//   16   42:invokevirtual   #342 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   17   45:ldc2            #343 <Int 0x7f080338>
	//   18   48:invokestatic    #162 <Method String Res.getStudySpecificString(int)>
	//   19   51:aload_0         
	//   20   52:invokestatic    #346 <Method android.content.DialogInterface$OnClickListener AccountFormActivity$$Lambda$3.lambdaFactory$(AccountFormActivity)>
	//   21   55:invokevirtual   #349 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   22   58:iconst_0        
	//   23   59:invokevirtual   #353 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//   24   62:invokevirtual   #357 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   25   65:astore_1        
		DialogUtils.boldPositiveAndNegativeButtons(alertdialog);
	//   26   66:aload_1         
	//   27   67:invokestatic    #363 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
		alertdialog.show();
	//   28   70:aload_1         
	//   29   71:invokevirtual   #366 <Method void AlertDialog.show()>
	//   30   74:return          
	}

	public static final String CONFIRM_EMAIL_KEY = "confirmEmail";
	public static final String CONFIRM_PASSWORD_KEY = "confirmPassword";
	public static final String CONSENT_DOCUMENT_EXTRA = "consentDocument";
	public static final String EMAIL_KEY = "email";
	public static final String PARTICIPANT_FORM_DATA_EXTRA = "participantForm";
	public static final String PASSWORD_KEY = "password";
	private static final String TAG = "AccountFormActivity";
	private TextView confirmEmailLabelView;
	private EditText confirmEmailView;
	private TextView confirmPasswordLabelView;
	private EditText confirmPasswordView;
	private ConsentDocument consentDocument;
	private TextView emailLabelView;
	private EditText emailView;
	private HashMap formData;
	private TextView passwordLabelView;
	private TextView passwordRulesView;
	private EditText passwordView;
}
