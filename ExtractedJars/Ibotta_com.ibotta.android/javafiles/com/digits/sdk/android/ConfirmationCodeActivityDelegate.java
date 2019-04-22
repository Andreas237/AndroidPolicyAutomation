// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			DigitsActivityDelegateImpl, StateButton, ConfirmationCodeController, BundleManager, 
//			DigitsController, SmsBroadcastReceiver

class ConfirmationCodeActivityDelegate extends DigitsActivityDelegateImpl
{

	ConfirmationCodeActivityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void DigitsActivityDelegateImpl()>
	//    2    4:return          
	}

	public int getLayoutId()
	{
		return R.layout.dgts__activity_confirmation;
	//    0    0:getstatic       #33  <Field int R$layout.dgts__activity_confirmation>
	//    1    3:ireturn         
	}

	public void init(Activity activity1, Bundle bundle)
	{
		activity = activity1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field Activity activity>
		editText = (EditText)activity1.findViewById(R.id.dgts__confirmationEditText);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #42  <Field int R$id.dgts__confirmationEditText>
	//    6   10:invokevirtual   #48  <Method View Activity.findViewById(int)>
	//    7   13:checkcast       #50  <Class EditText>
	//    8   16:putfield        #52  <Field EditText editText>
		stateButton = (StateButton)activity1.findViewById(R.id.dgts__createAccount);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:getstatic       #55  <Field int R$id.dgts__createAccount>
	//   12   24:invokevirtual   #48  <Method View Activity.findViewById(int)>
	//   13   27:checkcast       #57  <Class StateButton>
	//   14   30:putfield        #59  <Field StateButton stateButton>
		termsText = (TextView)activity1.findViewById(R.id.dgts__termsTextCreateAccount);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getstatic       #62  <Field int R$id.dgts__termsTextCreateAccount>
	//   18   38:invokevirtual   #48  <Method View Activity.findViewById(int)>
	//   19   41:checkcast       #64  <Class TextView>
	//   20   44:putfield        #66  <Field TextView termsText>
		resendText = (TextView)activity1.findViewById(R.id.dgts__resendConfirmation);
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:getstatic       #69  <Field int R$id.dgts__resendConfirmation>
	//   24   52:invokevirtual   #48  <Method View Activity.findViewById(int)>
	//   25   55:checkcast       #64  <Class TextView>
	//   26   58:putfield        #71  <Field TextView resendText>
		controller = initController(bundle);
	//   27   61:aload_0         
	//   28   62:aload_0         
	//   29   63:aload_2         
	//   30   64:invokevirtual   #75  <Method DigitsController initController(Bundle)>
	//   31   67:putfield        #77  <Field DigitsController controller>
		setUpEditText(activity1, controller, editText);
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #77  <Field DigitsController controller>
	//   36   76:aload_0         
	//   37   77:getfield        #52  <Field EditText editText>
	//   38   80:invokevirtual   #81  <Method void setUpEditText(Activity, DigitsController, EditText)>
		setUpSendButton(activity1, controller, stateButton);
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:aload_0         
	//   42   86:getfield        #77  <Field DigitsController controller>
	//   43   89:aload_0         
	//   44   90:getfield        #59  <Field StateButton stateButton>
	//   45   93:invokevirtual   #85  <Method void setUpSendButton(Activity, DigitsController, StateButton)>
		setUpTermsText(activity1, controller, termsText);
	//   46   96:aload_0         
	//   47   97:aload_1         
	//   48   98:aload_0         
	//   49   99:getfield        #77  <Field DigitsController controller>
	//   50  102:aload_0         
	//   51  103:getfield        #66  <Field TextView termsText>
	//   52  106:invokevirtual   #89  <Method void setUpTermsText(Activity, DigitsController, TextView)>
		setUpResendText(activity1, resendText);
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:aload_0         
	//   56  112:getfield        #71  <Field TextView resendText>
	//   57  115:invokevirtual   #93  <Method void setUpResendText(Activity, TextView)>
		setUpSmsIntercept(activity1, editText);
	//   58  118:aload_0         
	//   59  119:aload_1         
	//   60  120:aload_0         
	//   61  121:getfield        #52  <Field EditText editText>
	//   62  124:invokevirtual   #97  <Method void setUpSmsIntercept(Activity, EditText)>
		CommonUtils.openKeyboard(((android.content.Context) (activity1)), ((View) (editText)));
	//   63  127:aload_1         
	//   64  128:aload_0         
	//   65  129:getfield        #52  <Field EditText editText>
	//   66  132:invokestatic    #103 <Method void CommonUtils.openKeyboard(android.content.Context, View)>
	//   67  135:return          
	}

	DigitsController initController(Bundle bundle)
	{
		return ((DigitsController) (new ConfirmationCodeController((ResultReceiver)bundle.getParcelable("receiver"), stateButton, editText, bundle.getString("phone_number"))));
	//    0    0:new             #105 <Class ConfirmationCodeController>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #106 <String "receiver">
	//    4    7:invokevirtual   #112 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    5   10:checkcast       #114 <Class ResultReceiver>
	//    6   13:aload_0         
	//    7   14:getfield        #59  <Field StateButton stateButton>
	//    8   17:aload_0         
	//    9   18:getfield        #52  <Field EditText editText>
	//   10   21:aload_1         
	//   11   22:ldc1            #116 <String "phone_number">
	//   12   24:invokevirtual   #120 <Method String Bundle.getString(String)>
	//   13   27:invokespecial   #123 <Method void ConfirmationCodeController(ResultReceiver, StateButton, EditText, String)>
	//   14   30:areturn         
	}

	public boolean isValid(Bundle bundle)
	{
		return BundleManager.assertContains(bundle, new String[] {
			"receiver", "phone_number"
		});
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:anewarray       String[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:ldc1            #106 <String "receiver">
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:ldc1            #116 <String "phone_number">
	//   10   14:aastore         
	//   11   15:invokestatic    #133 <Method boolean BundleManager.assertContains(Bundle, String[])>
	//   12   18:ireturn         
	}

	public void onDestroy()
	{
		SmsBroadcastReceiver smsbroadcastreceiver = receiver;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field SmsBroadcastReceiver receiver>
	//    2    4:astore_1        
		if(smsbroadcastreceiver != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			activity.unregisterReceiver(((android.content.BroadcastReceiver) (smsbroadcastreceiver)));
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field Activity activity>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #140 <Method void Activity.unregisterReceiver(android.content.BroadcastReceiver)>
	//    9   17:return          
	}

	public void onResume()
	{
		controller.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DigitsController controller>
	//    2    4:invokeinterface #145 <Method void DigitsController.onResume()>
	//    3    9:return          
	}

	protected void setUpResendText(final Activity activity, TextView textview)
	{
		activity = ((Activity) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				activity.setResult(300);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Activity val$activity>
			//    2    4:sipush          300
			//    3    7:invokevirtual   #33  <Method void Activity.setResult(int)>
				activity.finish();
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Activity val$activity>
			//    6   14:invokevirtual   #36  <Method void Activity.finish()>
			//    7   17:return          
			}

			final ConfirmationCodeActivityDelegate this$0;
			final Activity val$activity;

			
			{
				this$0 = ConfirmationCodeActivityDelegate.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ConfirmationCodeActivityDelegate this$0>
				activity = activity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Activity val$activity>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #6   <Class ConfirmationCodeActivityDelegate$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #148 <Method void ConfirmationCodeActivityDelegate$1(ConfirmationCodeActivityDelegate, Activity)>
	//    5    9:astore_1        
		if(!(textview instanceof View))
	//*   6   10:aload_2         
	//*   7   11:instanceof      #150 <Class View>
	//*   8   14:ifne            23
		{
			textview.setOnClickListener(((android.view.View.OnClickListener) (activity)));
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #154 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   12   22:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)textview, ((android.view.View.OnClickListener) (activity)));
	//   13   23:aload_2         
	//   14   24:checkcast       #150 <Class View>
	//   15   27:aload_1         
	//   16   28:invokestatic    #159 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   17   31:return          
		}
	}

	protected void setUpSmsIntercept(Activity activity1, EditText edittext)
	{
		if(CommonUtils.checkPermission(((android.content.Context) (activity1)), "android.permission.RECEIVE_SMS"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #161 <String "android.permission.RECEIVE_SMS">
	//*   2    3:invokestatic    #165 <Method boolean CommonUtils.checkPermission(android.content.Context, String)>
	//*   3    6:ifeq            41
		{
			IntentFilter intentfilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
	//    4    9:new             #167 <Class IntentFilter>
	//    5   12:dup             
	//    6   13:ldc1            #169 <String "android.provider.Telephony.SMS_RECEIVED">
	//    7   15:invokespecial   #172 <Method void IntentFilter(String)>
	//    8   18:astore_3        
			receiver = new SmsBroadcastReceiver(edittext);
	//    9   19:aload_0         
	//   10   20:new             #174 <Class SmsBroadcastReceiver>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #177 <Method void SmsBroadcastReceiver(EditText)>
	//   14   28:putfield        #136 <Field SmsBroadcastReceiver receiver>
			activity1.registerReceiver(((android.content.BroadcastReceiver) (receiver)), intentfilter);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #136 <Field SmsBroadcastReceiver receiver>
	//   18   36:aload_3         
	//   19   37:invokevirtual   #181 <Method android.content.Intent Activity.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   20   40:pop             
		}
	//   21   41:return          
	}

	public void setUpTermsText(Activity activity1, DigitsController digitscontroller, TextView textview)
	{
		textview.setText(((CharSequence) (getFormattedTerms(activity1, R.string.dgts__terms_text_create))));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:getstatic       #186 <Field int R$string.dgts__terms_text_create>
	//    4    6:invokevirtual   #190 <Method String getFormattedTerms(Activity, int)>
	//    5    9:invokevirtual   #194 <Method void TextView.setText(CharSequence)>
		super.setUpTermsText(activity1, digitscontroller, textview);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokespecial   #195 <Method void DigitsActivityDelegateImpl.setUpTermsText(Activity, DigitsController, TextView)>
	//   11   19:return          
	}

	Activity activity;
	DigitsController controller;
	EditText editText;
	SmsBroadcastReceiver receiver;
	TextView resendText;
	StateButton stateButton;
	TextView termsText;
}
