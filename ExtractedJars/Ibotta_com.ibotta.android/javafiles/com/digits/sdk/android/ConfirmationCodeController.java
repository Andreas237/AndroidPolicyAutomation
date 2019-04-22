// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.net.Uri;
import android.os.ResultReceiver;
import android.widget.EditText;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.SessionManager;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			DigitsControllerImpl, Digits, ConfirmationErrorCodes, StateButton, 
//			DigitsClient, DigitsConstants, ErrorCodes, ActivityClassManager, 
//			DigitsCallback, DigitsSession, DigitsController

class ConfirmationCodeController extends DigitsControllerImpl
{

	ConfirmationCodeController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, String s)
	{
		this(resultreceiver, statebutton, edittext, s, Digits.getSessionManager(), Digits.getInstance().getDigitsClient(), ((ErrorCodes) (new ConfirmationErrorCodes(statebutton.getContext().getResources()))), Digits.getInstance().getActivityClassManager());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #16  <Method SessionManager Digits.getSessionManager()>
	//    6    9:invokestatic    #20  <Method Digits Digits.getInstance()>
	//    7   12:invokevirtual   #24  <Method DigitsClient Digits.getDigitsClient()>
	//    8   15:new             #26  <Class ConfirmationErrorCodes>
	//    9   18:dup             
	//   10   19:aload_2         
	//   11   20:invokevirtual   #32  <Method Context StateButton.getContext()>
	//   12   23:invokevirtual   #38  <Method android.content.res.Resources Context.getResources()>
	//   13   26:invokespecial   #41  <Method void ConfirmationErrorCodes(android.content.res.Resources)>
	//   14   29:invokestatic    #20  <Method Digits Digits.getInstance()>
	//   15   32:invokevirtual   #45  <Method ActivityClassManager Digits.getActivityClassManager()>
	//   16   35:invokespecial   #48  <Method void ConfirmationCodeController(ResultReceiver, StateButton, EditText, String, SessionManager, DigitsClient, ErrorCodes, ActivityClassManager)>
	//   17   38:return          
	}

	ConfirmationCodeController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, String s, SessionManager sessionmanager, DigitsClient digitsclient, ErrorCodes errorcodes, 
			ActivityClassManager activityclassmanager)
	{
		super(resultreceiver, statebutton, edittext, digitsclient, errorcodes, activityclassmanager, sessionmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           6
	//    5    6:aload           7
	//    6    8:aload           8
	//    7   10:aload           5
	//    8   12:invokespecial   #52  <Method void DigitsControllerImpl(ResultReceiver, StateButton, EditText, DigitsClient, ErrorCodes, ActivityClassManager, SessionManager)>
		phoneNumber = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #54  <Field String phoneNumber>
	//   12   21:return          
	}

	public void executeRequest(final Context final_context1)
	{
		if(validateInput(((CharSequence) (editText.getText()))))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field EditText editText>
	//*   3    5:invokevirtual   #70  <Method android.text.Editable EditText.getText()>
	//*   4    8:invokevirtual   #74  <Method boolean validateInput(CharSequence)>
	//*   5   11:ifeq            63
		{
			sendButton.showProgress();
	//    6   14:aload_0         
	//    7   15:getfield        #78  <Field StateButton sendButton>
	//    8   18:invokevirtual   #82  <Method void StateButton.showProgress()>
			CommonUtils.hideKeyboard(final_context1, ((android.view.View) (editText)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #64  <Field EditText editText>
	//   12   26:invokestatic    #88  <Method void CommonUtils.hideKeyboard(Context, android.view.View)>
			String s = ((Object) (editText.getText())).toString();
	//   13   29:aload_0         
	//   14   30:getfield        #64  <Field EditText editText>
	//   15   33:invokevirtual   #70  <Method android.text.Editable EditText.getText()>
	//   16   36:invokevirtual   #94  <Method String Object.toString()>
	//   17   39:astore_2        
			digitsClient.createAccount(s, phoneNumber, ((com.twitter.sdk.android.core.Callback) (new DigitsCallback(((DigitsController) (this)), final_context1) {

				public void success(Result result)
				{
					result = ((Result) (DigitsSession.create(result, phoneNumber)));
				//    0    0:aload_1         
				//    1    1:aload_0         
				//    2    2:getfield        #18  <Field ConfirmationCodeController this$0>
				//    3    5:invokestatic    #30  <Method String ConfirmationCodeController.access$000(ConfirmationCodeController)>
				//    4    8:invokestatic    #36  <Method DigitsSession DigitsSession.create(Result, String)>
				//    5   11:astore_1        
					ConfirmationCodeController confirmationcodecontroller = ConfirmationCodeController.this;
				//    6   12:aload_0         
				//    7   13:getfield        #18  <Field ConfirmationCodeController this$0>
				//    8   16:astore_2        
					confirmationcodecontroller.loginSuccess(context, ((DigitsSession) (result)), confirmationcodecontroller.phoneNumber);
				//    9   17:aload_2         
				//   10   18:aload_0         
				//   11   19:getfield        #20  <Field Context val$context>
				//   12   22:aload_1         
				//   13   23:aload_2         
				//   14   24:invokestatic    #30  <Method String ConfirmationCodeController.access$000(ConfirmationCodeController)>
				//   15   27:invokevirtual   #40  <Method void ConfirmationCodeController.loginSuccess(Context, DigitsSession, String)>
				//   16   30:return          
				}

				final ConfirmationCodeController this$0;
				final Context val$context;

			
			{
				this$0 = ConfirmationCodeController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConfirmationCodeController this$0>
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
	//   19   41:getfield        #98  <Field DigitsClient digitsClient>
	//   20   44:aload_2         
	//   21   45:aload_0         
	//   22   46:getfield        #54  <Field String phoneNumber>
	//   23   49:new             #6   <Class ConfirmationCodeController$1>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokespecial   #101 <Method void ConfirmationCodeController$1(ConfirmationCodeController, Context, DigitsController, Context)>
	//   30   60:invokevirtual   #107 <Method void DigitsClient.createAccount(String, String, com.twitter.sdk.android.core.Callback)>
		}
	//   31   63:return          
	}

	Uri getTosUri()
	{
		return DigitsConstants.TWITTER_TOS;
	//    0    0:getstatic       #115 <Field Uri DigitsConstants.TWITTER_TOS>
	//    1    3:areturn         
	}

	private final String phoneNumber;


/*
	static String access$000(ConfirmationCodeController confirmationcodecontroller)
	{
		return confirmationcodecontroller.phoneNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String phoneNumber>
	//    2    4:areturn         
	}

*/
}
