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

// Referenced classes of package com.digits.sdk.android:
//			DigitsControllerImpl, Digits, ConfirmationErrorCodes, StateButton, 
//			ActivityClassManager, DigitsClient, DigitsConstants, ErrorCodes, 
//			DigitsCallback, DigitsSessionResponse, DigitsSession, DigitsController

class LoginCodeController extends DigitsControllerImpl
{

	LoginCodeController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, SessionManager sessionmanager, DigitsClient digitsclient, String s, long l, String s1, ErrorCodes errorcodes, ActivityClassManager activityclassmanager)
	{
		super(resultreceiver, statebutton, edittext, digitsclient, errorcodes, activityclassmanager, sessionmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           5
	//    5    6:aload           10
	//    6    8:aload           11
	//    7   10:aload           4
	//    8   12:invokespecial   #16  <Method void DigitsControllerImpl(ResultReceiver, StateButton, EditText, DigitsClient, ErrorCodes, ActivityClassManager, SessionManager)>
		requestId = s;
	//    9   15:aload_0         
	//   10   16:aload           6
	//   11   18:putfield        #18  <Field String requestId>
		userId = l;
	//   12   21:aload_0         
	//   13   22:lload           7
	//   14   24:putfield        #20  <Field long userId>
		phoneNumber = s1;
	//   15   27:aload_0         
	//   16   28:aload           9
	//   17   30:putfield        #22  <Field String phoneNumber>
	//   18   33:return          
	}

	LoginCodeController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, String s, long l, String s1)
	{
		this(resultreceiver, statebutton, edittext, Digits.getSessionManager(), Digits.getInstance().getDigitsClient(), s, l, s1, ((ErrorCodes) (new ConfirmationErrorCodes(statebutton.getContext().getResources()))), Digits.getInstance().getActivityClassManager());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #32  <Method SessionManager Digits.getSessionManager()>
	//    5    7:invokestatic    #36  <Method Digits Digits.getInstance()>
	//    6   10:invokevirtual   #40  <Method DigitsClient Digits.getDigitsClient()>
	//    7   13:aload           4
	//    8   15:lload           5
	//    9   17:aload           7
	//   10   19:new             #42  <Class ConfirmationErrorCodes>
	//   11   22:dup             
	//   12   23:aload_2         
	//   13   24:invokevirtual   #48  <Method Context StateButton.getContext()>
	//   14   27:invokevirtual   #54  <Method android.content.res.Resources Context.getResources()>
	//   15   30:invokespecial   #57  <Method void ConfirmationErrorCodes(android.content.res.Resources)>
	//   16   33:invokestatic    #36  <Method Digits Digits.getInstance()>
	//   17   36:invokevirtual   #61  <Method ActivityClassManager Digits.getActivityClassManager()>
	//   18   39:invokespecial   #63  <Method void LoginCodeController(ResultReceiver, StateButton, EditText, SessionManager, DigitsClient, String, long, String, ErrorCodes, ActivityClassManager)>
	//   19   42:return          
	}

	private void startPinCodeActivity(Context context)
	{
		Intent intent = new Intent(context, activityClassManager.getPinCodeActivity());
	//    0    0:new             #73  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field ActivityClassManager activityClassManager>
	//    5    9:invokeinterface #83  <Method Class ActivityClassManager.getPinCodeActivity()>
	//    6   14:invokespecial   #86  <Method void Intent(Context, Class)>
	//    7   17:astore_2        
		Bundle bundle = getBundle(phoneNumber);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field String phoneNumber>
	//   11   23:invokevirtual   #90  <Method Bundle getBundle(String)>
	//   12   26:astore_3        
		bundle.putParcelable("receiver", ((android.os.Parcelable) (resultReceiver)));
	//   13   27:aload_3         
	//   14   28:ldc1            #92  <String "receiver">
	//   15   30:aload_0         
	//   16   31:getfield        #96  <Field ResultReceiver resultReceiver>
	//   17   34:invokevirtual   #102 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putString("request_id", requestId);
	//   18   37:aload_3         
	//   19   38:ldc1            #104 <String "request_id">
	//   20   40:aload_0         
	//   21   41:getfield        #18  <Field String requestId>
	//   22   44:invokevirtual   #108 <Method void Bundle.putString(String, String)>
		bundle.putLong("user_id", userId);
	//   23   47:aload_3         
	//   24   48:ldc1            #110 <String "user_id">
	//   25   50:aload_0         
	//   26   51:getfield        #20  <Field long userId>
	//   27   54:invokevirtual   #114 <Method void Bundle.putLong(String, long)>
		intent.putExtras(bundle);
	//   28   57:aload_2         
	//   29   58:aload_3         
	//   30   59:invokevirtual   #118 <Method Intent Intent.putExtras(Bundle)>
	//   31   62:pop             
		startActivityForResult((Activity)context, intent);
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:checkcast       #120 <Class Activity>
	//   35   68:aload_2         
	//   36   69:invokevirtual   #124 <Method void startActivityForResult(Activity, Intent)>
	//   37   72:return          
	}

	public void executeRequest(final Context final_context1)
	{
		if(validateInput(((CharSequence) (editText.getText()))))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #129 <Field EditText editText>
	//*   3    5:invokevirtual   #135 <Method android.text.Editable EditText.getText()>
	//*   4    8:invokevirtual   #139 <Method boolean validateInput(CharSequence)>
	//*   5   11:ifeq            67
		{
			sendButton.showProgress();
	//    6   14:aload_0         
	//    7   15:getfield        #143 <Field StateButton sendButton>
	//    8   18:invokevirtual   #147 <Method void StateButton.showProgress()>
			CommonUtils.hideKeyboard(final_context1, ((android.view.View) (editText)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #129 <Field EditText editText>
	//   12   26:invokestatic    #153 <Method void CommonUtils.hideKeyboard(Context, android.view.View)>
			String s = ((Object) (editText.getText())).toString();
	//   13   29:aload_0         
	//   14   30:getfield        #129 <Field EditText editText>
	//   15   33:invokevirtual   #135 <Method android.text.Editable EditText.getText()>
	//   16   36:invokevirtual   #159 <Method String Object.toString()>
	//   17   39:astore_2        
			digitsClient.loginDevice(requestId, userId, s, ((com.twitter.sdk.android.core.Callback) (new DigitsCallback(((DigitsController) (this)), final_context1) {

				public void success(Result result)
				{
					if(((DigitsSessionResponse)result.data).isEmpty())
				//*   0    0:aload_1         
				//*   1    1:getfield        #32  <Field Object Result.data>
				//*   2    4:checkcast       #34  <Class DigitsSessionResponse>
				//*   3    7:invokevirtual   #38  <Method boolean DigitsSessionResponse.isEmpty()>
				//*   4   10:ifeq            25
					{
						startPinCodeActivity(context);
				//    5   13:aload_0         
				//    6   14:getfield        #18  <Field LoginCodeController this$0>
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field Context val$context>
				//    9   21:invokestatic    #42  <Method void LoginCodeController.access$000(LoginCodeController, Context)>
						return;
				//   10   24:return          
					} else
					{
						result = ((Result) (DigitsSession.create((DigitsSessionResponse)result.data, phoneNumber)));
				//   11   25:aload_1         
				//   12   26:getfield        #32  <Field Object Result.data>
				//   13   29:checkcast       #34  <Class DigitsSessionResponse>
				//   14   32:aload_0         
				//   15   33:getfield        #18  <Field LoginCodeController this$0>
				//   16   36:invokestatic    #46  <Method String LoginCodeController.access$100(LoginCodeController)>
				//   17   39:invokestatic    #52  <Method DigitsSession DigitsSession.create(DigitsSessionResponse, String)>
				//   18   42:astore_1        
						LoginCodeController logincodecontroller = LoginCodeController.this;
				//   19   43:aload_0         
				//   20   44:getfield        #18  <Field LoginCodeController this$0>
				//   21   47:astore_2        
						logincodecontroller.loginSuccess(context, ((DigitsSession) (result)), logincodecontroller.phoneNumber);
				//   22   48:aload_2         
				//   23   49:aload_0         
				//   24   50:getfield        #20  <Field Context val$context>
				//   25   53:aload_1         
				//   26   54:aload_2         
				//   27   55:invokestatic    #46  <Method String LoginCodeController.access$100(LoginCodeController)>
				//   28   58:invokevirtual   #56  <Method void LoginCodeController.loginSuccess(Context, DigitsSession, String)>
						return;
				//   29   61:return          
					}
				}

				final LoginCodeController this$0;
				final Context val$context;

			
			{
				this$0 = LoginCodeController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field LoginCodeController this$0>
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
	//   18   40:aload_0         
	//   19   41:getfield        #163 <Field DigitsClient digitsClient>
	//   20   44:aload_0         
	//   21   45:getfield        #18  <Field String requestId>
	//   22   48:aload_0         
	//   23   49:getfield        #20  <Field long userId>
	//   24   52:aload_2         
	//   25   53:new             #6   <Class LoginCodeController$1>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokespecial   #166 <Method void LoginCodeController$1(LoginCodeController, Context, DigitsController, Context)>
	//   32   64:invokevirtual   #172 <Method void DigitsClient.loginDevice(String, long, String, com.twitter.sdk.android.core.Callback)>
		}
	//   33   67:return          
	}

	Uri getTosUri()
	{
		return DigitsConstants.TWITTER_TOS;
	//    0    0:getstatic       #180 <Field Uri DigitsConstants.TWITTER_TOS>
	//    1    3:areturn         
	}

	private final String phoneNumber;
	private final String requestId;
	private final long userId;


/*
	static void access$000(LoginCodeController logincodecontroller, Context context)
	{
		logincodecontroller.startPinCodeActivity(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void startPinCodeActivity(Context)>
		return;
	//    3    5:return          
	}

*/


/*
	static String access$100(LoginCodeController logincodecontroller)
	{
		return logincodecontroller.phoneNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String phoneNumber>
	//    2    4:areturn         
	}

*/
}
