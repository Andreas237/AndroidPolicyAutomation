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
//			DigitsActivityDelegateImpl, StateButton, AuthConfig, LoginCodeController, 
//			BundleManager, DigitsController, SmsBroadcastReceiver

class LoginCodeActivityDelegate extends DigitsActivityDelegateImpl
{

	LoginCodeActivityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void DigitsActivityDelegateImpl()>
	//    2    4:return          
	}

	public int getLayoutId()
	{
		return R.layout.dgts__activity_confirmation;
	//    0    0:getstatic       #34  <Field int R$layout.dgts__activity_confirmation>
	//    1    3:ireturn         
	}

	public void init(Activity activity1, Bundle bundle)
	{
		activity = activity1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field Activity activity>
		editText = (EditText)activity1.findViewById(R.id.dgts__confirmationEditText);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #43  <Field int R$id.dgts__confirmationEditText>
	//    6   10:invokevirtual   #49  <Method View Activity.findViewById(int)>
	//    7   13:checkcast       #51  <Class EditText>
	//    8   16:putfield        #53  <Field EditText editText>
		stateButton = (StateButton)activity1.findViewById(R.id.dgts__createAccount);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:getstatic       #56  <Field int R$id.dgts__createAccount>
	//   12   24:invokevirtual   #49  <Method View Activity.findViewById(int)>
	//   13   27:checkcast       #58  <Class StateButton>
	//   14   30:putfield        #60  <Field StateButton stateButton>
		termsText = (TextView)activity1.findViewById(R.id.dgts__termsTextCreateAccount);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getstatic       #63  <Field int R$id.dgts__termsTextCreateAccount>
	//   18   38:invokevirtual   #49  <Method View Activity.findViewById(int)>
	//   19   41:checkcast       #65  <Class TextView>
	//   20   44:putfield        #67  <Field TextView termsText>
		TextView textview = (TextView)activity1.findViewById(R.id.dgts__resendConfirmation);
	//   21   47:aload_1         
	//   22   48:getstatic       #70  <Field int R$id.dgts__resendConfirmation>
	//   23   51:invokevirtual   #49  <Method View Activity.findViewById(int)>
	//   24   54:checkcast       #65  <Class TextView>
	//   25   57:astore_3        
		config = (AuthConfig)bundle.getParcelable("auth_config");
	//   26   58:aload_0         
	//   27   59:aload_2         
	//   28   60:ldc1            #72  <String "auth_config">
	//   29   62:invokevirtual   #78  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   30   65:checkcast       #80  <Class AuthConfig>
	//   31   68:putfield        #82  <Field AuthConfig config>
		controller = initController(bundle);
	//   32   71:aload_0         
	//   33   72:aload_0         
	//   34   73:aload_2         
	//   35   74:invokevirtual   #86  <Method DigitsController initController(Bundle)>
	//   36   77:putfield        #88  <Field DigitsController controller>
		setUpEditText(activity1, controller, editText);
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:aload_0         
	//   40   83:getfield        #88  <Field DigitsController controller>
	//   41   86:aload_0         
	//   42   87:getfield        #53  <Field EditText editText>
	//   43   90:invokevirtual   #92  <Method void setUpEditText(Activity, DigitsController, EditText)>
		setUpSendButton(activity1, controller, stateButton);
	//   44   93:aload_0         
	//   45   94:aload_1         
	//   46   95:aload_0         
	//   47   96:getfield        #88  <Field DigitsController controller>
	//   48   99:aload_0         
	//   49  100:getfield        #60  <Field StateButton stateButton>
	//   50  103:invokevirtual   #96  <Method void setUpSendButton(Activity, DigitsController, StateButton)>
		setUpTermsText(activity1, controller, termsText);
	//   51  106:aload_0         
	//   52  107:aload_1         
	//   53  108:aload_0         
	//   54  109:getfield        #88  <Field DigitsController controller>
	//   55  112:aload_0         
	//   56  113:getfield        #67  <Field TextView termsText>
	//   57  116:invokevirtual   #100 <Method void setUpTermsText(Activity, DigitsController, TextView)>
		setUpResendText(activity1, textview);
	//   58  119:aload_0         
	//   59  120:aload_1         
	//   60  121:aload_3         
	//   61  122:invokevirtual   #104 <Method void setUpResendText(Activity, TextView)>
		setUpSmsIntercept(activity1, editText);
	//   62  125:aload_0         
	//   63  126:aload_1         
	//   64  127:aload_0         
	//   65  128:getfield        #53  <Field EditText editText>
	//   66  131:invokevirtual   #108 <Method void setUpSmsIntercept(Activity, EditText)>
		CommonUtils.openKeyboard(((android.content.Context) (activity1)), ((View) (editText)));
	//   67  134:aload_1         
	//   68  135:aload_0         
	//   69  136:getfield        #53  <Field EditText editText>
	//   70  139:invokestatic    #114 <Method void CommonUtils.openKeyboard(android.content.Context, View)>
	//   71  142:return          
	}

	DigitsController initController(Bundle bundle)
	{
		return ((DigitsController) (new LoginCodeController((ResultReceiver)bundle.getParcelable("receiver"), stateButton, editText, bundle.getString("request_id"), bundle.getLong("user_id"), bundle.getString("phone_number"))));
	//    0    0:new             #116 <Class LoginCodeController>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #117 <String "receiver">
	//    4    7:invokevirtual   #78  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    5   10:checkcast       #119 <Class ResultReceiver>
	//    6   13:aload_0         
	//    7   14:getfield        #60  <Field StateButton stateButton>
	//    8   17:aload_0         
	//    9   18:getfield        #53  <Field EditText editText>
	//   10   21:aload_1         
	//   11   22:ldc1            #121 <String "request_id">
	//   12   24:invokevirtual   #125 <Method String Bundle.getString(String)>
	//   13   27:aload_1         
	//   14   28:ldc1            #127 <String "user_id">
	//   15   30:invokevirtual   #131 <Method long Bundle.getLong(String)>
	//   16   33:aload_1         
	//   17   34:ldc1            #133 <String "phone_number">
	//   18   36:invokevirtual   #125 <Method String Bundle.getString(String)>
	//   19   39:invokespecial   #136 <Method void LoginCodeController(ResultReceiver, StateButton, EditText, String, long, String)>
	//   20   42:areturn         
	}

	public boolean isValid(Bundle bundle)
	{
		return BundleManager.assertContains(bundle, new String[] {
			"receiver", "phone_number", "request_id", "user_id"
		});
	//    0    0:aload_1         
	//    1    1:iconst_4        
	//    2    2:anewarray       String[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:ldc1            #117 <String "receiver">
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:ldc1            #133 <String "phone_number">
	//   10   14:aastore         
	//   11   15:dup             
	//   12   16:iconst_2        
	//   13   17:ldc1            #121 <String "request_id">
	//   14   19:aastore         
	//   15   20:dup             
	//   16   21:iconst_3        
	//   17   22:ldc1            #127 <String "user_id">
	//   18   24:aastore         
	//   19   25:invokestatic    #146 <Method boolean BundleManager.assertContains(Bundle, String[])>
	//   20   28:ireturn         
	}

	public void onDestroy()
	{
		SmsBroadcastReceiver smsbroadcastreceiver = receiver;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field SmsBroadcastReceiver receiver>
	//    2    4:astore_1        
		if(smsbroadcastreceiver != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			activity.unregisterReceiver(((android.content.BroadcastReceiver) (smsbroadcastreceiver)));
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field Activity activity>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #153 <Method void Activity.unregisterReceiver(android.content.BroadcastReceiver)>
	//    9   17:return          
	}

	public void onResume()
	{
		controller.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field DigitsController controller>
	//    2    4:invokeinterface #158 <Method void DigitsController.onResume()>
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

			final LoginCodeActivityDelegate this$0;
			final Activity val$activity;

			
			{
				this$0 = LoginCodeActivityDelegate.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LoginCodeActivityDelegate this$0>
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
	//    0    0:new             #6   <Class LoginCodeActivityDelegate$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #161 <Method void LoginCodeActivityDelegate$1(LoginCodeActivityDelegate, Activity)>
	//    5    9:astore_1        
		if(!(textview instanceof View))
	//*   6   10:aload_2         
	//*   7   11:instanceof      #163 <Class View>
	//*   8   14:ifne            23
		{
			textview.setOnClickListener(((android.view.View.OnClickListener) (activity)));
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #167 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   12   22:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)textview, ((android.view.View.OnClickListener) (activity)));
	//   13   23:aload_2         
	//   14   24:checkcast       #163 <Class View>
	//   15   27:aload_1         
	//   16   28:invokestatic    #172 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   17   31:return          
		}
	}

	public void setUpSendButton(Activity activity1, DigitsController digitscontroller, StateButton statebutton)
	{
		statebutton.setStatesText(R.string.dgts__sign_in, R.string.dgts__signing_in, R.string.dgts__sign_in);
	//    0    0:aload_3         
	//    1    1:getstatic       #177 <Field int R$string.dgts__sign_in>
	//    2    4:getstatic       #180 <Field int R$string.dgts__signing_in>
	//    3    7:getstatic       #177 <Field int R$string.dgts__sign_in>
	//    4   10:invokevirtual   #184 <Method void StateButton.setStatesText(int, int, int)>
		statebutton.showStart();
	//    5   13:aload_3         
	//    6   14:invokevirtual   #187 <Method void StateButton.showStart()>
		super.setUpSendButton(activity1, digitscontroller, statebutton);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:invokespecial   #188 <Method void DigitsActivityDelegateImpl.setUpSendButton(Activity, DigitsController, StateButton)>
	//   12   24:return          
	}

	protected void setUpSmsIntercept(Activity activity1, EditText edittext)
	{
		if(CommonUtils.checkPermission(((android.content.Context) (activity1)), "android.permission.RECEIVE_SMS"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #190 <String "android.permission.RECEIVE_SMS">
	//*   2    3:invokestatic    #194 <Method boolean CommonUtils.checkPermission(android.content.Context, String)>
	//*   3    6:ifeq            41
		{
			IntentFilter intentfilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
	//    4    9:new             #196 <Class IntentFilter>
	//    5   12:dup             
	//    6   13:ldc1            #198 <String "android.provider.Telephony.SMS_RECEIVED">
	//    7   15:invokespecial   #201 <Method void IntentFilter(String)>
	//    8   18:astore_3        
			receiver = new SmsBroadcastReceiver(edittext);
	//    9   19:aload_0         
	//   10   20:new             #203 <Class SmsBroadcastReceiver>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #206 <Method void SmsBroadcastReceiver(EditText)>
	//   14   28:putfield        #149 <Field SmsBroadcastReceiver receiver>
			activity1.registerReceiver(((android.content.BroadcastReceiver) (receiver)), intentfilter);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #149 <Field SmsBroadcastReceiver receiver>
	//   18   36:aload_3         
	//   19   37:invokevirtual   #210 <Method android.content.Intent Activity.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   20   40:pop             
		}
	//   21   41:return          
	}

	public void setUpTermsText(Activity activity1, DigitsController digitscontroller, TextView textview)
	{
		AuthConfig authconfig = config;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field AuthConfig config>
	//    2    4:astore          4
		if(authconfig != null && authconfig.tosUpdate)
	//*   3    6:aload           4
	//*   4    8:ifnull          39
	//*   5   11:aload           4
	//*   6   13:getfield        #214 <Field boolean AuthConfig.tosUpdate>
	//*   7   16:ifeq            39
		{
			textview.setText(((CharSequence) (getFormattedTerms(activity1, R.string.dgts__terms_text_sign_in))));
	//    8   19:aload_3         
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:getstatic       #217 <Field int R$string.dgts__terms_text_sign_in>
	//   12   25:invokevirtual   #221 <Method String getFormattedTerms(Activity, int)>
	//   13   28:invokevirtual   #225 <Method void TextView.setText(CharSequence)>
			super.setUpTermsText(activity1, digitscontroller, textview);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:aload_3         
	//   18   35:invokespecial   #226 <Method void DigitsActivityDelegateImpl.setUpTermsText(Activity, DigitsController, TextView)>
			return;
	//   19   38:return          
		} else
		{
			textview.setVisibility(8);
	//   20   39:aload_3         
	//   21   40:bipush          8
	//   22   42:invokevirtual   #230 <Method void TextView.setVisibility(int)>
			return;
	//   23   45:return          
		}
	}

	Activity activity;
	AuthConfig config;
	DigitsController controller;
	EditText editText;
	SmsBroadcastReceiver receiver;
	StateButton stateButton;
	TextView termsText;
}
