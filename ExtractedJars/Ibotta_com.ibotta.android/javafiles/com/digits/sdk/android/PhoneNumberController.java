// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.EditText;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.SessionManager;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.Locale;

// Referenced classes of package com.digits.sdk.android:
//			DigitsControllerImpl, Digits, PhoneNumberErrorCodes, StateButton, 
//			Verification, ActivityClassManager, DeviceRegistrationResponse, CountryListSpinner, 
//			DigitsClient, DigitsConstants, CouldNotAuthenticateException, OperatorUnsupportedException, 
//			DigitsException, AuthConfig, TosView, PhoneNumber, 
//			AuthResponse, ErrorCodes, DigitsCallback, DigitsController

class PhoneNumberController extends DigitsControllerImpl
	implements PhoneNumberTask.Listener
{

	PhoneNumberController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, CountryListSpinner countrylistspinner, DigitsClient digitsclient, ErrorCodes errorcodes, ActivityClassManager activityclassmanager, 
			SessionManager sessionmanager, TosView tosview)
	{
		super(resultreceiver, statebutton, edittext, digitsclient, errorcodes, activityclassmanager, sessionmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           5
	//    5    6:aload           6
	//    6    8:aload           7
	//    7   10:aload           8
	//    8   12:invokespecial   #26  <Method void DigitsControllerImpl(ResultReceiver, StateButton, EditText, DigitsClient, ErrorCodes, ActivityClassManager, SessionManager)>
		countryCodeSpinner = countrylistspinner;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field CountryListSpinner countryCodeSpinner>
		tosView = tosview;
	//   12   21:aload_0         
	//   13   22:aload           9
	//   14   24:putfield        #30  <Field TosView tosView>
	//   15   27:return          
	}

	PhoneNumberController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, CountryListSpinner countrylistspinner, TosView tosview)
	{
		this(resultreceiver, statebutton, edittext, countrylistspinner, Digits.getInstance().getDigitsClient(), ((ErrorCodes) (new PhoneNumberErrorCodes(statebutton.getContext().getResources()))), Digits.getInstance().getActivityClassManager(), Digits.getSessionManager(), tosview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #40  <Method Digits Digits.getInstance()>
	//    6    9:invokevirtual   #44  <Method DigitsClient Digits.getDigitsClient()>
	//    7   12:new             #46  <Class PhoneNumberErrorCodes>
	//    8   15:dup             
	//    9   16:aload_2         
	//   10   17:invokevirtual   #52  <Method Context StateButton.getContext()>
	//   11   20:invokevirtual   #58  <Method android.content.res.Resources Context.getResources()>
	//   12   23:invokespecial   #61  <Method void PhoneNumberErrorCodes(android.content.res.Resources)>
	//   13   26:invokestatic    #40  <Method Digits Digits.getInstance()>
	//   14   29:invokevirtual   #65  <Method ActivityClassManager Digits.getActivityClassManager()>
	//   15   32:invokestatic    #69  <Method SessionManager Digits.getSessionManager()>
	//   16   35:aload           5
	//   17   37:invokespecial   #71  <Method void PhoneNumberController(ResultReceiver, StateButton, EditText, CountryListSpinner, DigitsClient, ErrorCodes, ActivityClassManager, SessionManager, TosView)>
		voiceEnabled = false;
	//   18   40:aload_0         
	//   19   41:iconst_0        
	//   20   42:putfield        #73  <Field boolean voiceEnabled>
		resendState = false;
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:putfield        #75  <Field boolean resendState>
	//   24   50:return          
	}

	private Bundle getBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #85  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("phone_number", phoneNumber);
	//    4    8:aload_1         
	//    5    9:ldc1            #90  <String "phone_number">
	//    6   11:aload_0         
	//    7   12:getfield        #92  <Field String phoneNumber>
	//    8   15:invokevirtual   #96  <Method void Bundle.putString(String, String)>
		bundle.putParcelable("receiver", ((android.os.Parcelable) (resultReceiver)));
	//    9   18:aload_1         
	//   10   19:ldc1            #98  <String "receiver">
	//   11   21:aload_0         
	//   12   22:getfield        #102 <Field ResultReceiver resultReceiver>
	//   13   25:invokevirtual   #106 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return bundle;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	private String getNumber(long l, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #110 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #111 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("+");
	//    4    9:aload           4
	//    5   11:ldc1            #113 <String "+">
	//    6   13:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(String.valueOf(l));
	//    8   17:aload           4
	//    9   19:lload_1         
	//   10   20:invokestatic    #123 <Method String String.valueOf(long)>
	//   11   23:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(s);
	//   13   27:aload           4
	//   14   29:aload_3         
	//   15   30:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		return stringbuilder.toString();
	//   17   34:aload           4
	//   18   36:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   19   39:areturn         
	}

	private Verification getVerificationType()
	{
		if(resendState && voiceEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field boolean resendState>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:getfield        #73  <Field boolean voiceEnabled>
	//*   5   11:ifeq            18
			return Verification.voicecall;
	//    6   14:getstatic       #136 <Field Verification Verification.voicecall>
	//    7   17:areturn         
		else
			return Verification.sms;
	//    8   18:getstatic       #139 <Field Verification Verification.sms>
	//    9   21:areturn         
	}

	private void startNextStep(Context context, DeviceRegistrationResponse deviceregistrationresponse)
	{
		Intent intent = new Intent(context, activityClassManager.getConfirmationActivity());
	//    0    0:new             #142 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #146 <Field ActivityClassManager activityClassManager>
	//    5    9:invokeinterface #152 <Method Class ActivityClassManager.getConfirmationActivity()>
	//    6   14:invokespecial   #155 <Method void Intent(Context, Class)>
	//    7   17:astore_3        
		Bundle bundle = getBundle();
	//    8   18:aload_0         
	//    9   19:invokespecial   #157 <Method Bundle getBundle()>
	//   10   22:astore          4
		if(deviceregistrationresponse.authConfig != null)
	//*  11   24:aload_2         
	//*  12   25:getfield        #163 <Field AuthConfig DeviceRegistrationResponse.authConfig>
	//*  13   28:ifnull          42
			bundle.putParcelable("auth_config", ((android.os.Parcelable) (deviceregistrationresponse.authConfig)));
	//   14   31:aload           4
	//   15   33:ldc1            #165 <String "auth_config">
	//   16   35:aload_2         
	//   17   36:getfield        #163 <Field AuthConfig DeviceRegistrationResponse.authConfig>
	//   18   39:invokevirtual   #106 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtras(bundle);
	//   19   42:aload_3         
	//   20   43:aload           4
	//   21   45:invokevirtual   #169 <Method Intent Intent.putExtras(Bundle)>
	//   22   48:pop             
		startActivityForResult((Activity)context, intent);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:checkcast       #171 <Class Activity>
	//   26   54:aload_3         
	//   27   55:invokevirtual   #175 <Method void startActivityForResult(Activity, Intent)>
	//   28   58:return          
	}

	public void executeRequest(final Context final_context1)
	{
		if(validateInput(((CharSequence) (editText.getText()))))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #181 <Field EditText editText>
	//*   3    5:invokevirtual   #187 <Method android.text.Editable EditText.getText()>
	//*   4    8:invokevirtual   #191 <Method boolean validateInput(CharSequence)>
	//*   5   11:ifeq            91
		{
			sendButton.showProgress();
	//    6   14:aload_0         
	//    7   15:getfield        #195 <Field StateButton sendButton>
	//    8   18:invokevirtual   #198 <Method void StateButton.showProgress()>
			CommonUtils.hideKeyboard(final_context1, ((android.view.View) (editText)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #181 <Field EditText editText>
	//   12   26:invokestatic    #204 <Method void CommonUtils.hideKeyboard(Context, android.view.View)>
			int i = ((Integer)countryCodeSpinner.getTag()).intValue();
	//   13   29:aload_0         
	//   14   30:getfield        #28  <Field CountryListSpinner countryCodeSpinner>
	//   15   33:invokevirtual   #210 <Method Object CountryListSpinner.getTag()>
	//   16   36:checkcast       #212 <Class Integer>
	//   17   39:invokevirtual   #216 <Method int Integer.intValue()>
	//   18   42:istore_2        
			String s = ((Object) (editText.getText())).toString();
	//   19   43:aload_0         
	//   20   44:getfield        #181 <Field EditText editText>
	//   21   47:invokevirtual   #187 <Method android.text.Editable EditText.getText()>
	//   22   50:invokevirtual   #219 <Method String Object.toString()>
	//   23   53:astore_3        
			phoneNumber = getNumber(i, s);
	//   24   54:aload_0         
	//   25   55:aload_0         
	//   26   56:iload_2         
	//   27   57:i2l             
	//   28   58:aload_3         
	//   29   59:invokespecial   #221 <Method String getNumber(long, String)>
	//   30   62:putfield        #92  <Field String phoneNumber>
			digitsClient.authDevice(phoneNumber, getVerificationType(), ((com.twitter.sdk.android.core.Callback) (new DigitsCallback(((DigitsController) (this)), final_context1) {

				public void success(Result result)
				{
					sendButton.showFinish();
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field PhoneNumberController this$0>
				//    2    4:getfield        #32  <Field StateButton PhoneNumberController.sendButton>
				//    3    7:invokevirtual   #38  <Method void StateButton.showFinish()>
					AuthConfig authconfig = ((AuthResponse)result.data).authConfig;
				//    4   10:aload_1         
				//    5   11:getfield        #44  <Field Object Result.data>
				//    6   14:checkcast       #46  <Class AuthResponse>
				//    7   17:getfield        #50  <Field AuthConfig AuthResponse.authConfig>
				//    8   20:astore_2        
					if(authconfig != null)
				//*   9   21:aload_2         
				//*  10   22:ifnull          36
						voiceEnabled = authconfig.isVoiceEnabled;
				//   11   25:aload_0         
				//   12   26:getfield        #20  <Field PhoneNumberController this$0>
				//   13   29:aload_2         
				//   14   30:getfield        #56  <Field boolean AuthConfig.isVoiceEnabled>
				//   15   33:putfield        #59  <Field boolean PhoneNumberController.voiceEnabled>
					editText.postDelayed(((_cls1) (result)). new Runnable() {

						public void run()
						{
							Object obj = ((Object) ((AuthResponse)result.data));
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field Result val$result>
						//    2    4:getfield        #32  <Field Object Result.data>
						//    3    7:checkcast       #34  <Class AuthResponse>
						//    4   10:astore_1        
							PhoneNumberController phonenumbercontroller = _fld0;
						//    5   11:aload_0         
						//    6   12:getfield        #19  <Field PhoneNumberController$1 this$1>
						//    7   15:getfield        #38  <Field PhoneNumberController PhoneNumberController$1.this$0>
						//    8   18:astore_2        
							if(((AuthResponse) (obj)).normalizedPhoneNumber == null)
						//*   9   19:aload_1         
						//*  10   20:getfield        #42  <Field String AuthResponse.normalizedPhoneNumber>
						//*  11   23:ifnonnull       40
								obj = ((Object) (phoneNumber));
						//   12   26:aload_0         
						//   13   27:getfield        #19  <Field PhoneNumberController$1 this$1>
						//   14   30:getfield        #38  <Field PhoneNumberController PhoneNumberController$1.this$0>
						//   15   33:getfield        #47  <Field String PhoneNumberController.phoneNumber>
						//   16   36:astore_1        
							else
						//*  17   37:goto            45
								obj = ((Object) (((AuthResponse) (obj)).normalizedPhoneNumber));
						//   18   40:aload_1         
						//   19   41:getfield        #42  <Field String AuthResponse.normalizedPhoneNumber>
						//   20   44:astore_1        
							phonenumbercontroller.phoneNumber = ((String) (obj));
						//   21   45:aload_2         
						//   22   46:aload_1         
						//   23   47:putfield        #47  <Field String PhoneNumberController.phoneNumber>
							startSignIn(context, (AuthResponse)result.data);
						//   24   50:aload_0         
						//   25   51:getfield        #19  <Field PhoneNumberController$1 this$1>
						//   26   54:getfield        #38  <Field PhoneNumberController PhoneNumberController$1.this$0>
						//   27   57:aload_0         
						//   28   58:getfield        #19  <Field PhoneNumberController$1 this$1>
						//   29   61:getfield        #51  <Field Context PhoneNumberController$1.val$context>
						//   30   64:aload_0         
						//   31   65:getfield        #21  <Field Result val$result>
						//   32   68:getfield        #32  <Field Object Result.data>
						//   33   71:checkcast       #34  <Class AuthResponse>
						//   34   74:invokevirtual   #55  <Method void PhoneNumberController.startSignIn(Context, AuthResponse)>
						//   35   77:return          
						}

						final _cls1 this$1;
						final Result val$result;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PhoneNumberController$1 this$1>
				result = Result.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Result val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
, 1500L);
				//   16   36:aload_0         
				//   17   37:getfield        #20  <Field PhoneNumberController this$0>
				//   18   40:getfield        #63  <Field EditText PhoneNumberController.editText>
				//   19   43:new             #12  <Class PhoneNumberController$1$1>
				//   20   46:dup             
				//   21   47:aload_0         
				//   22   48:aload_1         
				//   23   49:invokespecial   #66  <Method void PhoneNumberController$1$1(PhoneNumberController$1, Result)>
				//   24   52:ldc2w           #67  <Long 1500L>
				//   25   55:invokevirtual   #74  <Method boolean EditText.postDelayed(Runnable, long)>
				//   26   58:pop             
				//   27   59:return          
				}

				final PhoneNumberController this$0;
				final Context val$context;

			
			{
				this$0 = PhoneNumberController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field PhoneNumberController this$0>
				context = context2;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field Context val$context>
				super(final_context1, digitscontroller);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:aload_3         
			//    9   14:invokespecial   #25  <Method void DigitsCallback(Context, DigitsController)>
			//   10   17:return          
			}
			}
)));
	//   31   65:aload_0         
	//   32   66:getfield        #225 <Field DigitsClient digitsClient>
	//   33   69:aload_0         
	//   34   70:getfield        #92  <Field String phoneNumber>
	//   35   73:aload_0         
	//   36   74:invokespecial   #227 <Method Verification getVerificationType()>
	//   37   77:new             #8   <Class PhoneNumberController$1>
	//   38   80:dup             
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:invokespecial   #230 <Method void PhoneNumberController$1(PhoneNumberController, Context, DigitsController, Context)>
	//   44   88:invokevirtual   #236 <Method void DigitsClient.authDevice(String, Verification, com.twitter.sdk.android.core.Callback)>
		}
	//   45   91:return          
	}

	Uri getTosUri()
	{
		return DigitsConstants.DIGITS_TOS;
	//    0    0:getstatic       #244 <Field Uri DigitsConstants.DIGITS_TOS>
	//    1    3:areturn         
	}

	public void handleError(final Context final_context1, DigitsException digitsexception)
	{
		if(digitsexception instanceof CouldNotAuthenticateException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #248 <Class CouldNotAuthenticateException>
	//*   2    4:ifeq            34
		{
			digitsClient.registerDevice(phoneNumber, getVerificationType(), ((com.twitter.sdk.android.core.Callback) (new DigitsCallback(((DigitsController) (this)), final_context1) {

				public void success(Result result)
				{
					Object obj = ((Object) ((DeviceRegistrationResponse)result.data));
				//    0    0:aload_1         
				//    1    1:getfield        #32  <Field Object Result.data>
				//    2    4:checkcast       #34  <Class DeviceRegistrationResponse>
				//    3    7:astore_2        
					Object obj1 = ((Object) (((DeviceRegistrationResponse) (obj)).authConfig));
				//    4    8:aload_2         
				//    5    9:getfield        #38  <Field AuthConfig DeviceRegistrationResponse.authConfig>
				//    6   12:astore_3        
					if(obj1 != null)
				//*   7   13:aload_3         
				//*   8   14:ifnull          28
						voiceEnabled = ((AuthConfig) (obj1)).isVoiceEnabled;
				//    9   17:aload_0         
				//   10   18:getfield        #18  <Field PhoneNumberController this$0>
				//   11   21:aload_3         
				//   12   22:getfield        #44  <Field boolean AuthConfig.isVoiceEnabled>
				//   13   25:putfield        #47  <Field boolean PhoneNumberController.voiceEnabled>
					obj1 = ((Object) (PhoneNumberController.this));
				//   14   28:aload_0         
				//   15   29:getfield        #18  <Field PhoneNumberController this$0>
				//   16   32:astore_3        
					if(((DeviceRegistrationResponse) (obj)).normalizedPhoneNumber == null)
				//*  17   33:aload_2         
				//*  18   34:getfield        #51  <Field String DeviceRegistrationResponse.normalizedPhoneNumber>
				//*  19   37:ifnonnull       51
						obj = ((Object) (phoneNumber));
				//   20   40:aload_0         
				//   21   41:getfield        #18  <Field PhoneNumberController this$0>
				//   22   44:getfield        #54  <Field String PhoneNumberController.phoneNumber>
				//   23   47:astore_2        
					else
				//*  24   48:goto            56
						obj = ((Object) (((DeviceRegistrationResponse) (obj)).normalizedPhoneNumber));
				//   25   51:aload_2         
				//   26   52:getfield        #51  <Field String DeviceRegistrationResponse.normalizedPhoneNumber>
				//   27   55:astore_2        
					obj1.phoneNumber = ((String) (obj));
				//   28   56:aload_3         
				//   29   57:aload_2         
				//   30   58:putfield        #54  <Field String PhoneNumberController.phoneNumber>
					sendButton.showFinish();
				//   31   61:aload_0         
				//   32   62:getfield        #18  <Field PhoneNumberController this$0>
				//   33   65:getfield        #58  <Field StateButton PhoneNumberController.sendButton>
				//   34   68:invokevirtual   #64  <Method void StateButton.showFinish()>
					startNextStep(context, (DeviceRegistrationResponse)result.data);
				//   35   71:aload_0         
				//   36   72:getfield        #18  <Field PhoneNumberController this$0>
				//   37   75:aload_0         
				//   38   76:getfield        #20  <Field Context val$context>
				//   39   79:aload_1         
				//   40   80:getfield        #32  <Field Object Result.data>
				//   41   83:checkcast       #34  <Class DeviceRegistrationResponse>
				//   42   86:invokestatic    #68  <Method void PhoneNumberController.access$000(PhoneNumberController, Context, DeviceRegistrationResponse)>
				//   43   89:return          
				}

				final PhoneNumberController this$0;
				final Context val$context;

			
			{
				this$0 = PhoneNumberController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PhoneNumberController this$0>
				context = context2;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #20  <Field Context val$context>
				super(final_context1, digitscontroller);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:aload_3         
			//    9   14:invokespecial   #23  <Method void DigitsCallback(Context, DigitsController)>
			//   10   17:return          
			}
			}
)));
	//    3    7:aload_0         
	//    4    8:getfield        #225 <Field DigitsClient digitsClient>
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field String phoneNumber>
	//    7   15:aload_0         
	//    8   16:invokespecial   #227 <Method Verification getVerificationType()>
	//    9   19:new             #12  <Class PhoneNumberController$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #249 <Method void PhoneNumberController$2(PhoneNumberController, Context, DigitsController, Context)>
	//   16   30:invokevirtual   #252 <Method void DigitsClient.registerDevice(String, Verification, com.twitter.sdk.android.core.Callback)>
			return;
	//   17   33:return          
		}
		if(digitsexception instanceof OperatorUnsupportedException)
	//*  18   34:aload_2         
	//*  19   35:instanceof      #254 <Class OperatorUnsupportedException>
	//*  20   38:ifeq            63
		{
			voiceEnabled = digitsexception.getConfig().isVoiceEnabled;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokevirtual   #260 <Method AuthConfig DigitsException.getConfig()>
	//   24   46:getfield        #265 <Field boolean AuthConfig.isVoiceEnabled>
	//   25   49:putfield        #73  <Field boolean voiceEnabled>
			resend();
	//   26   52:aload_0         
	//   27   53:invokevirtual   #268 <Method void resend()>
			super.handleError(final_context1, digitsexception);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:invokespecial   #270 <Method void DigitsControllerImpl.handleError(Context, DigitsException)>
			return;
	//   32   62:return          
		} else
		{
			super.handleError(final_context1, digitsexception);
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:aload_2         
	//   36   66:invokespecial   #270 <Method void DigitsControllerImpl.handleError(Context, DigitsException)>
			return;
	//   37   69:return          
		}
	}

	public void onLoadComplete(PhoneNumber phonenumber)
	{
		setPhoneNumber(phonenumber);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #275 <Method void setPhoneNumber(PhoneNumber)>
		setCountryCode(phonenumber);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #278 <Method void setCountryCode(PhoneNumber)>
	//    6   10:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		super.onTextChanged(charsequence, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #282 <Method void DigitsControllerImpl.onTextChanged(CharSequence, int, int, int)>
		if(Verification.voicecall.equals(((Object) (getVerificationType()))))
	//*   6    9:getstatic       #136 <Field Verification Verification.voicecall>
	//*   7   12:aload_0         
	//*   8   13:invokespecial   #227 <Method Verification getVerificationType()>
	//*   9   16:invokevirtual   #286 <Method boolean Verification.equals(Object)>
	//*  10   19:ifeq            62
		{
			resendState = false;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #75  <Field boolean resendState>
			sendButton.setStatesText(R.string.dgts__confirmation_send_text, R.string.dgts__confirmation_sending_text, R.string.dgts__confirmation_sent_text);
	//   14   27:aload_0         
	//   15   28:getfield        #195 <Field StateButton sendButton>
	//   16   31:getstatic       #292 <Field int R$string.dgts__confirmation_send_text>
	//   17   34:getstatic       #295 <Field int R$string.dgts__confirmation_sending_text>
	//   18   37:getstatic       #298 <Field int R$string.dgts__confirmation_sent_text>
	//   19   40:invokevirtual   #302 <Method void StateButton.setStatesText(int, int, int)>
			sendButton.showStart();
	//   20   43:aload_0         
	//   21   44:getfield        #195 <Field StateButton sendButton>
	//   22   47:invokevirtual   #305 <Method void StateButton.showStart()>
			tosView.setText(R.string.dgts__terms_text);
	//   23   50:aload_0         
	//   24   51:getfield        #30  <Field TosView tosView>
	//   25   54:getstatic       #308 <Field int R$string.dgts__terms_text>
	//   26   57:invokeinterface #314 <Method void TosView.setText(int)>
		}
	//   27   62:return          
	}

	public void resend()
	{
		resendState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #75  <Field boolean resendState>
		if(voiceEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #73  <Field boolean voiceEnabled>
	//*   5    9:ifeq            40
		{
			sendButton.setStatesText(R.string.dgts__call_me, R.string.dgts__calling, R.string.dgts__calling);
	//    6   12:aload_0         
	//    7   13:getfield        #195 <Field StateButton sendButton>
	//    8   16:getstatic       #317 <Field int R$string.dgts__call_me>
	//    9   19:getstatic       #320 <Field int R$string.dgts__calling>
	//   10   22:getstatic       #320 <Field int R$string.dgts__calling>
	//   11   25:invokevirtual   #302 <Method void StateButton.setStatesText(int, int, int)>
			tosView.setText(R.string.dgts__terms_text_call_me);
	//   12   28:aload_0         
	//   13   29:getfield        #30  <Field TosView tosView>
	//   14   32:getstatic       #323 <Field int R$string.dgts__terms_text_call_me>
	//   15   35:invokeinterface #314 <Method void TosView.setText(int)>
		}
	//   16   40:return          
	}

	public void setCountryCode(PhoneNumber phonenumber)
	{
		if(PhoneNumber.isCountryValid(phonenumber))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #329 <Method boolean PhoneNumber.isCountryValid(PhoneNumber)>
	//*   2    4:ifeq            35
			countryCodeSpinner.setSelectedForCountry((new Locale("", phonenumber.getCountryIso())).getDisplayName(), phonenumber.getCountryCode());
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field CountryListSpinner countryCodeSpinner>
	//    5   11:new             #331 <Class Locale>
	//    6   14:dup             
	//    7   15:ldc2            #333 <String "">
	//    8   18:aload_1         
	//    9   19:invokevirtual   #336 <Method String PhoneNumber.getCountryIso()>
	//   10   22:invokespecial   #338 <Method void Locale(String, String)>
	//   11   25:invokevirtual   #341 <Method String Locale.getDisplayName()>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #344 <Method String PhoneNumber.getCountryCode()>
	//   14   32:invokevirtual   #347 <Method void CountryListSpinner.setSelectedForCountry(String, String)>
	//   15   35:return          
	}

	public void setPhoneNumber(PhoneNumber phonenumber)
	{
		if(PhoneNumber.isValid(phonenumber))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #350 <Method boolean PhoneNumber.isValid(PhoneNumber)>
	//*   2    4:ifeq            32
		{
			editText.setText(((CharSequence) (phonenumber.getPhoneNumber())));
	//    3    7:aload_0         
	//    4    8:getfield        #181 <Field EditText editText>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #353 <Method String PhoneNumber.getPhoneNumber()>
	//    7   15:invokevirtual   #356 <Method void EditText.setText(CharSequence)>
			editText.setSelection(phonenumber.getPhoneNumber().length());
	//    8   18:aload_0         
	//    9   19:getfield        #181 <Field EditText editText>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #353 <Method String PhoneNumber.getPhoneNumber()>
	//   12   26:invokevirtual   #359 <Method int String.length()>
	//   13   29:invokevirtual   #362 <Method void EditText.setSelection(int)>
		}
	//   14   32:return          
	}

	void startSignIn(Context context, AuthResponse authresponse)
	{
		Intent intent = new Intent(context, activityClassManager.getLoginCodeActivity());
	//    0    0:new             #142 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #146 <Field ActivityClassManager activityClassManager>
	//    5    9:invokeinterface #367 <Method Class ActivityClassManager.getLoginCodeActivity()>
	//    6   14:invokespecial   #155 <Method void Intent(Context, Class)>
	//    7   17:astore_3        
		Bundle bundle = getBundle();
	//    8   18:aload_0         
	//    9   19:invokespecial   #157 <Method Bundle getBundle()>
	//   10   22:astore          4
		bundle.putString("request_id", authresponse.requestId);
	//   11   24:aload           4
	//   12   26:ldc2            #369 <String "request_id">
	//   13   29:aload_2         
	//   14   30:getfield        #374 <Field String AuthResponse.requestId>
	//   15   33:invokevirtual   #96  <Method void Bundle.putString(String, String)>
		bundle.putLong("user_id", authresponse.userId);
	//   16   36:aload           4
	//   17   38:ldc2            #376 <String "user_id">
	//   18   41:aload_2         
	//   19   42:getfield        #380 <Field long AuthResponse.userId>
	//   20   45:invokevirtual   #384 <Method void Bundle.putLong(String, long)>
		bundle.putParcelable("auth_config", ((android.os.Parcelable) (authresponse.authConfig)));
	//   21   48:aload           4
	//   22   50:ldc1            #165 <String "auth_config">
	//   23   52:aload_2         
	//   24   53:getfield        #385 <Field AuthConfig AuthResponse.authConfig>
	//   25   56:invokevirtual   #106 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtras(bundle);
	//   26   59:aload_3         
	//   27   60:aload           4
	//   28   62:invokevirtual   #169 <Method Intent Intent.putExtras(Bundle)>
	//   29   65:pop             
		startActivityForResult((Activity)context, intent);
	//   30   66:aload_0         
	//   31   67:aload_1         
	//   32   68:checkcast       #171 <Class Activity>
	//   33   71:aload_3         
	//   34   72:invokevirtual   #175 <Method void startActivityForResult(Activity, Intent)>
	//   35   75:return          
	}

	final CountryListSpinner countryCodeSpinner;
	String phoneNumber;
	boolean resendState;
	private final TosView tosView;
	boolean voiceEnabled;


/*
	static void access$000(PhoneNumberController phonenumbercontroller, Context context, DeviceRegistrationResponse deviceregistrationresponse)
	{
		phonenumbercontroller.startNextStep(context, deviceregistrationresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #81  <Method void startNextStep(Context, DeviceRegistrationResponse)>
		return;
	//    4    6:return          
	}

*/
}
