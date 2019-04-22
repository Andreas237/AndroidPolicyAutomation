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
import android.text.*;
import android.widget.EditText;
import com.twitter.sdk.android.core.SessionManager;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			DigitsController, UnrecoverableException, DigitsException, StateButton, 
//			ActivityClassManager, DigitsClient, ErrorCodes, DigitsSession

abstract class DigitsControllerImpl
	implements TextWatcher, DigitsController
{

	DigitsControllerImpl(ResultReceiver resultreceiver, StateButton statebutton, EditText edittext, DigitsClient digitsclient, ErrorCodes errorcodes, ActivityClassManager activityclassmanager, SessionManager sessionmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		resultReceiver = resultreceiver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field ResultReceiver resultReceiver>
		digitsClient = digitsclient;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #36  <Field DigitsClient digitsClient>
		activityClassManager = activityclassmanager;
	//    8   15:aload_0         
	//    9   16:aload           6
	//   10   18:putfield        #38  <Field ActivityClassManager activityClassManager>
		sendButton = statebutton;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #40  <Field StateButton sendButton>
		editText = edittext;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #42  <Field EditText editText>
		errors = errorcodes;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #44  <Field ErrorCodes errors>
		sessionManager = sessionmanager;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #46  <Field SessionManager sessionManager>
		errorCount = 0;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #48  <Field int errorCount>
	//   26   48:return          
	}

	private boolean isUnrecoverable(DigitsException digitsexception)
	{
		return errorCount == 5 || (digitsexception instanceof UnrecoverableException);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int errorCount>
	//    2    4:iconst_5        
	//    3    5:icmpeq          20
	//    4    8:aload_1         
	//    5    9:instanceof      #55  <Class UnrecoverableException>
	//    6   12:ifeq            18
	//    7   15:goto            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	public void afterTextChanged(Editable editable)
	{
	//    0    0:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void clearError()
	{
		editText.setError(((CharSequence) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field EditText editText>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #66  <Method void EditText.setError(CharSequence)>
	//    4    8:return          
	}

	Bundle getBundle(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #70  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("phone_number", s);
	//    4    8:aload_2         
	//    5    9:ldc1            #73  <String "phone_number">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #77  <Method void Bundle.putString(String, String)>
		return bundle;
	//    8   15:aload_2         
	//    9   16:areturn         
	}

	public int getErrorCount()
	{
		return errorCount;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int errorCount>
	//    2    4:ireturn         
	}

	public ErrorCodes getErrors()
	{
		return errors;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ErrorCodes errors>
	//    2    4:areturn         
	}

	public TextWatcher getTextWatcher()
	{
		return ((TextWatcher) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	abstract Uri getTosUri();

	public void handleError(Context context, DigitsException digitsexception)
	{
		errorCount = errorCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int errorCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #48  <Field int errorCount>
		if(isUnrecoverable(digitsexception))
	//*   6   10:aload_0         
	//*   7   11:aload_2         
	//*   8   12:invokespecial   #89  <Method boolean isUnrecoverable(DigitsException)>
	//*   9   15:ifeq            29
		{
			startFallback(context, resultReceiver, digitsexception);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #34  <Field ResultReceiver resultReceiver>
	//   14   24:aload_2         
	//   15   25:invokevirtual   #93  <Method void startFallback(Context, ResultReceiver, DigitsException)>
			return;
	//   16   28:return          
		} else
		{
			editText.setError(((CharSequence) (digitsexception.getLocalizedMessage())));
	//   17   29:aload_0         
	//   18   30:getfield        #42  <Field EditText editText>
	//   19   33:aload_2         
	//   20   34:invokevirtual   #99  <Method String DigitsException.getLocalizedMessage()>
	//   21   37:invokevirtual   #66  <Method void EditText.setError(CharSequence)>
			sendButton.showError();
	//   22   40:aload_0         
	//   23   41:getfield        #40  <Field StateButton sendButton>
	//   24   44:invokevirtual   #104 <Method void StateButton.showError()>
			return;
	//   25   47:return          
		}
	}

	void loginSuccess(final Context context, DigitsSession digitssession, final String phoneNumber)
	{
		sessionManager.setActiveSession(((com.twitter.sdk.android.core.Session) (digitssession)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SessionManager sessionManager>
	//    2    4:aload_2         
	//    3    5:invokeinterface #112 <Method void SessionManager.setActiveSession(com.twitter.sdk.android.core.Session)>
		sendButton.showFinish();
	//    4   10:aload_0         
	//    5   11:getfield        #40  <Field StateButton sendButton>
	//    6   14:invokevirtual   #115 <Method void StateButton.showFinish()>
		editText.postDelayed(new Runnable() {

			public void run()
			{
				resultReceiver.send(200, getBundle(phoneNumber));
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field DigitsControllerImpl this$0>
			//    2    4:getfield        #34  <Field ResultReceiver DigitsControllerImpl.resultReceiver>
			//    3    7:sipush          200
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field DigitsControllerImpl this$0>
			//    6   14:aload_0         
			//    7   15:getfield        #23  <Field String val$phoneNumber>
			//    8   18:invokevirtual   #38  <Method Bundle DigitsControllerImpl.getBundle(String)>
			//    9   21:invokevirtual   #44  <Method void ResultReceiver.send(int, Bundle)>
				CommonUtils.finishAffinity((Activity)context, 200);
			//   10   24:aload_0         
			//   11   25:getfield        #25  <Field Context val$context>
			//   12   28:checkcast       #46  <Class Activity>
			//   13   31:sipush          200
			//   14   34:invokestatic    #52  <Method void CommonUtils.finishAffinity(Activity, int)>
			//   15   37:return          
			}

			final DigitsControllerImpl this$0;
			final Context val$context;
			final String val$phoneNumber;

			
			{
				this$0 = DigitsControllerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DigitsControllerImpl this$0>
				phoneNumber = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$phoneNumber>
				context = context1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Context val$context>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
, 1500L);
	//    7   17:aload_0         
	//    8   18:getfield        #42  <Field EditText editText>
	//    9   21:new             #10  <Class DigitsControllerImpl$1>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:aload_3         
	//   13   27:aload_1         
	//   14   28:invokespecial   #118 <Method void DigitsControllerImpl$1(DigitsControllerImpl, String, Context)>
	//   15   31:ldc2w           #119 <Long 1500L>
	//   16   34:invokevirtual   #124 <Method boolean EditText.postDelayed(Runnable, long)>
	//   17   37:pop             
	//   18   38:return          
	}

	public void onResume()
	{
		sendButton.showStart();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field StateButton sendButton>
	//    2    4:invokevirtual   #128 <Method void StateButton.showStart()>
	//    3    7:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		clearError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method void clearError()>
	//    2    4:return          
	}

	public void showTOS(Context context)
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #135 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #137 <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #140 <Method void Intent(String)>
	//    4    9:astore_2        
		intent.setData(getTosUri());
	//    5   10:aload_2         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #142 <Method Uri getTosUri()>
	//    8   15:invokevirtual   #146 <Method Intent Intent.setData(Uri)>
	//    9   18:pop             
		context.startActivity(intent);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #152 <Method void Context.startActivity(Intent)>
	//   13   24:return          
	}

	void startActivityForResult(Activity activity, Intent intent)
	{
		activity.startActivityForResult(intent, 140);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:sipush          140
	//    3    5:invokevirtual   #159 <Method void Activity.startActivityForResult(Intent, int)>
	//    4    8:return          
	}

	public void startFallback(Context context, ResultReceiver resultreceiver, DigitsException digitsexception)
	{
		Intent intent = new Intent(context, activityClassManager.getFailureActivity());
	//    0    0:new             #135 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field ActivityClassManager activityClassManager>
	//    5    9:invokeinterface #165 <Method Class ActivityClassManager.getFailureActivity()>
	//    6   14:invokespecial   #168 <Method void Intent(Context, Class)>
	//    7   17:astore          4
		intent.putExtra("receiver", ((android.os.Parcelable) (resultreceiver)));
	//    8   19:aload           4
	//    9   21:ldc1            #170 <String "receiver">
	//   10   23:aload_2         
	//   11   24:invokevirtual   #174 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   12   27:pop             
		intent.putExtra("fallback_reason", ((java.io.Serializable) (digitsexception)));
	//   13   28:aload           4
	//   14   30:ldc1            #176 <String "fallback_reason">
	//   15   32:aload_3         
	//   16   33:invokevirtual   #179 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   17   36:pop             
		context.startActivity(intent);
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #152 <Method void Context.startActivity(Intent)>
		CommonUtils.finishAffinity(context, 200);
	//   21   43:aload_1         
	//   22   44:sipush          200
	//   23   47:invokestatic    #185 <Method void CommonUtils.finishAffinity(Context, int)>
	//   24   50:return          
	}

	public boolean validateInput(CharSequence charsequence)
	{
		return TextUtils.isEmpty(charsequence) ^ true;
	//    0    0:aload_1         
	//    1    1:invokestatic    #192 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	final ActivityClassManager activityClassManager;
	final DigitsClient digitsClient;
	final EditText editText;
	private int errorCount;
	final ErrorCodes errors;
	final ResultReceiver resultReceiver;
	final StateButton sendButton;
	final SessionManager sessionManager;
}
