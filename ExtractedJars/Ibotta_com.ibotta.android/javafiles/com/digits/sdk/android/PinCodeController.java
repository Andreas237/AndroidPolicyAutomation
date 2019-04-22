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
//			DigitsClient, ErrorCodes, ActivityClassManager, DigitsCallback, 
//			DigitsSessionResponse, DigitsSession, DigitsController

class PinCodeController extends DigitsControllerImpl
{

	PinCodeController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, SessionManager sessionmanager, DigitsClient digitsclient, String s, long l, String s1, ErrorCodes errorcodes, ActivityClassManager activityclassmanager)
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

	PinCodeController(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, String s, long l, String s1)
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
	//   18   39:invokespecial   #63  <Method void PinCodeController(ResultReceiver, StateButton, EditText, SessionManager, DigitsClient, String, long, String, ErrorCodes, ActivityClassManager)>
	//   19   42:return          
	}

	public void executeRequest(final Context final_context1)
	{
		if(validateInput(((CharSequence) (editText.getText()))))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #71  <Field EditText editText>
	//*   3    5:invokevirtual   #77  <Method android.text.Editable EditText.getText()>
	//*   4    8:invokevirtual   #81  <Method boolean validateInput(CharSequence)>
	//*   5   11:ifeq            67
		{
			sendButton.showProgress();
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field StateButton sendButton>
	//    8   18:invokevirtual   #89  <Method void StateButton.showProgress()>
			CommonUtils.hideKeyboard(final_context1, ((android.view.View) (editText)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #71  <Field EditText editText>
	//   12   26:invokestatic    #95  <Method void CommonUtils.hideKeyboard(Context, android.view.View)>
			String s = ((Object) (editText.getText())).toString();
	//   13   29:aload_0         
	//   14   30:getfield        #71  <Field EditText editText>
	//   15   33:invokevirtual   #77  <Method android.text.Editable EditText.getText()>
	//   16   36:invokevirtual   #101 <Method String Object.toString()>
	//   17   39:astore_2        
			digitsClient.verifyPin(requestId, userId, s, ((com.twitter.sdk.android.core.Callback) (new DigitsCallback(((DigitsController) (this)), final_context1) {

				public void success(Result result)
				{
					result = ((Result) (DigitsSession.create((DigitsSessionResponse)result.data, phoneNumber)));
				//    0    0:aload_1         
				//    1    1:getfield        #32  <Field Object Result.data>
				//    2    4:checkcast       #34  <Class DigitsSessionResponse>
				//    3    7:aload_0         
				//    4    8:getfield        #18  <Field PinCodeController this$0>
				//    5   11:invokestatic    #38  <Method String PinCodeController.access$000(PinCodeController)>
				//    6   14:invokestatic    #44  <Method DigitsSession DigitsSession.create(DigitsSessionResponse, String)>
				//    7   17:astore_1        
					PinCodeController pincodecontroller = PinCodeController.this;
				//    8   18:aload_0         
				//    9   19:getfield        #18  <Field PinCodeController this$0>
				//   10   22:astore_2        
					pincodecontroller.loginSuccess(context, ((DigitsSession) (result)), pincodecontroller.phoneNumber);
				//   11   23:aload_2         
				//   12   24:aload_0         
				//   13   25:getfield        #20  <Field Context val$context>
				//   14   28:aload_1         
				//   15   29:aload_2         
				//   16   30:invokestatic    #38  <Method String PinCodeController.access$000(PinCodeController)>
				//   17   33:invokevirtual   #48  <Method void PinCodeController.loginSuccess(Context, DigitsSession, String)>
				//   18   36:return          
				}

				final PinCodeController this$0;
				final Context val$context;

			
			{
				this$0 = PinCodeController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PinCodeController this$0>
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
	//   19   41:getfield        #105 <Field DigitsClient digitsClient>
	//   20   44:aload_0         
	//   21   45:getfield        #18  <Field String requestId>
	//   22   48:aload_0         
	//   23   49:getfield        #20  <Field long userId>
	//   24   52:aload_2         
	//   25   53:new             #6   <Class PinCodeController$1>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokespecial   #108 <Method void PinCodeController$1(PinCodeController, Context, DigitsController, Context)>
	//   32   64:invokevirtual   #114 <Method void DigitsClient.verifyPin(String, long, String, com.twitter.sdk.android.core.Callback)>
		}
	//   33   67:return          
	}

	Uri getTosUri()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void showTOS(Context context)
	{
	//    0    0:return          
	}

	private final String phoneNumber;
	private final String requestId;
	private final long userId;


/*
	static String access$000(PinCodeController pincodecontroller)
	{
		return pincodecontroller.phoneNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String phoneNumber>
	//    2    4:areturn         
	}

*/
}
