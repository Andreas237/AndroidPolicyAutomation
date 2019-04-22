// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			DigitsActivityDelegateImpl, TosView, PhoneNumberTask, Digits, 
//			CountryListSpinner, StateButton, PhoneNumberUtils, SimManager, 
//			PhoneNumberController, BundleManager, PhoneNumber, DigitsController

class PhoneNumberActivityDelegate extends DigitsActivityDelegateImpl
	implements PhoneNumberTask.Listener, TosView
{

	PhoneNumberActivityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void DigitsActivityDelegateImpl()>
	//    2    4:return          
	}

	private void executePhoneNumberTask(PhoneNumberUtils phonenumberutils, Bundle bundle)
	{
		bundle = ((Bundle) (bundle.getString("phone_number")));
	//    0    0:aload_2         
	//    1    1:ldc1            #32  <String "phone_number">
	//    2    3:invokevirtual   #38  <Method String Bundle.getString(String)>
	//    3    6:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (bundle))))
	//*   4    7:aload_2         
	//*   5    8:invokestatic    #44  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   11:ifeq            38
		{
			(new PhoneNumberTask(phonenumberutils, ((PhoneNumberTask.Listener) (this)))).executeOnExecutor(((java.util.concurrent.Executor) (Digits.getInstance().getExecutorService())), ((Object []) (new Void[0])));
	//    7   14:new             #46  <Class PhoneNumberTask>
	//    8   17:dup             
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokespecial   #49  <Method void PhoneNumberTask(PhoneNumberUtils, PhoneNumberTask$Listener)>
	//   12   23:invokestatic    #55  <Method Digits Digits.getInstance()>
	//   13   26:invokevirtual   #59  <Method java.util.concurrent.ExecutorService Digits.getExecutorService()>
	//   14   29:iconst_0        
	//   15   30:anewarray       Void[]
	//   16   33:invokevirtual   #65  <Method io.fabric.sdk.android.services.concurrency.AsyncTask PhoneNumberTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   17   36:pop             
			return;
	//   18   37:return          
		} else
		{
			(new PhoneNumberTask(phonenumberutils, ((String) (bundle)), ((PhoneNumberTask.Listener) (this)))).executeOnExecutor(((java.util.concurrent.Executor) (Digits.getInstance().getExecutorService())), ((Object []) (new Void[0])));
	//   19   38:new             #46  <Class PhoneNumberTask>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:aload_2         
	//   23   44:aload_0         
	//   24   45:invokespecial   #68  <Method void PhoneNumberTask(PhoneNumberUtils, String, PhoneNumberTask$Listener)>
	//   25   48:invokestatic    #55  <Method Digits Digits.getInstance()>
	//   26   51:invokevirtual   #59  <Method java.util.concurrent.ExecutorService Digits.getExecutorService()>
	//   27   54:iconst_0        
	//   28   55:anewarray       Void[]
	//   29   58:invokevirtual   #65  <Method io.fabric.sdk.android.services.concurrency.AsyncTask PhoneNumberTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   30   61:pop             
			return;
	//   31   62:return          
		}
	}

	public int getLayoutId()
	{
		return R.layout.dgts__activity_phone_number;
	//    0    0:getstatic       #76  <Field int R$layout.dgts__activity_phone_number>
	//    1    3:ireturn         
	}

	public void init(Activity activity1, Bundle bundle)
	{
		activity = activity1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field Activity activity>
		countryCodeSpinner = (CountryListSpinner)activity1.findViewById(R.id.dgts__countryCode);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #85  <Field int R$id.dgts__countryCode>
	//    6   10:invokevirtual   #91  <Method View Activity.findViewById(int)>
	//    7   13:checkcast       #93  <Class CountryListSpinner>
	//    8   16:putfield        #95  <Field CountryListSpinner countryCodeSpinner>
		sendButton = (StateButton)activity1.findViewById(R.id.dgts__sendCodeButton);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:getstatic       #98  <Field int R$id.dgts__sendCodeButton>
	//   12   24:invokevirtual   #91  <Method View Activity.findViewById(int)>
	//   13   27:checkcast       #100 <Class StateButton>
	//   14   30:putfield        #102 <Field StateButton sendButton>
		phoneEditText = (EditText)activity1.findViewById(R.id.dgts__phoneNumberEditText);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getstatic       #105 <Field int R$id.dgts__phoneNumberEditText>
	//   18   38:invokevirtual   #91  <Method View Activity.findViewById(int)>
	//   19   41:checkcast       #107 <Class EditText>
	//   20   44:putfield        #109 <Field EditText phoneEditText>
		termsTextView = (TextView)activity1.findViewById(R.id.dgts__termsText);
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:getstatic       #112 <Field int R$id.dgts__termsText>
	//   24   52:invokevirtual   #91  <Method View Activity.findViewById(int)>
	//   25   55:checkcast       #114 <Class TextView>
	//   26   58:putfield        #116 <Field TextView termsTextView>
		controller = initController(bundle);
	//   27   61:aload_0         
	//   28   62:aload_0         
	//   29   63:aload_2         
	//   30   64:invokevirtual   #120 <Method PhoneNumberController initController(Bundle)>
	//   31   67:putfield        #122 <Field PhoneNumberController controller>
		setUpEditText(activity1, ((DigitsController) (controller)), phoneEditText);
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #122 <Field PhoneNumberController controller>
	//   36   76:aload_0         
	//   37   77:getfield        #109 <Field EditText phoneEditText>
	//   38   80:invokevirtual   #126 <Method void setUpEditText(Activity, DigitsController, EditText)>
		setUpSendButton(activity1, ((DigitsController) (controller)), sendButton);
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:aload_0         
	//   42   86:getfield        #122 <Field PhoneNumberController controller>
	//   43   89:aload_0         
	//   44   90:getfield        #102 <Field StateButton sendButton>
	//   45   93:invokevirtual   #130 <Method void setUpSendButton(Activity, DigitsController, StateButton)>
		setUpTermsText(activity1, ((DigitsController) (controller)), termsTextView);
	//   46   96:aload_0         
	//   47   97:aload_1         
	//   48   98:aload_0         
	//   49   99:getfield        #122 <Field PhoneNumberController controller>
	//   50  102:aload_0         
	//   51  103:getfield        #116 <Field TextView termsTextView>
	//   52  106:invokevirtual   #134 <Method void setUpTermsText(Activity, DigitsController, TextView)>
		setUpCountrySpinner(countryCodeSpinner);
	//   53  109:aload_0         
	//   54  110:aload_0         
	//   55  111:getfield        #95  <Field CountryListSpinner countryCodeSpinner>
	//   56  114:invokevirtual   #138 <Method void setUpCountrySpinner(CountryListSpinner)>
		executePhoneNumberTask(new PhoneNumberUtils(SimManager.createSimManager(((android.content.Context) (activity1)))), bundle);
	//   57  117:aload_0         
	//   58  118:new             #140 <Class PhoneNumberUtils>
	//   59  121:dup             
	//   60  122:aload_1         
	//   61  123:invokestatic    #146 <Method SimManager SimManager.createSimManager(android.content.Context)>
	//   62  126:invokespecial   #149 <Method void PhoneNumberUtils(SimManager)>
	//   63  129:aload_2         
	//   64  130:invokespecial   #151 <Method void executePhoneNumberTask(PhoneNumberUtils, Bundle)>
		CommonUtils.openKeyboard(((android.content.Context) (activity1)), ((View) (phoneEditText)));
	//   65  133:aload_1         
	//   66  134:aload_0         
	//   67  135:getfield        #109 <Field EditText phoneEditText>
	//   68  138:invokestatic    #157 <Method void CommonUtils.openKeyboard(android.content.Context, View)>
	//   69  141:return          
	}

	PhoneNumberController initController(Bundle bundle)
	{
		return new PhoneNumberController((ResultReceiver)bundle.getParcelable("receiver"), sendButton, phoneEditText, countryCodeSpinner, ((TosView) (this)));
	//    0    0:new             #159 <Class PhoneNumberController>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #161 <String "receiver">
	//    4    7:invokevirtual   #165 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    5   10:checkcast       #167 <Class ResultReceiver>
	//    6   13:aload_0         
	//    7   14:getfield        #102 <Field StateButton sendButton>
	//    8   17:aload_0         
	//    9   18:getfield        #109 <Field EditText phoneEditText>
	//   10   21:aload_0         
	//   11   22:getfield        #95  <Field CountryListSpinner countryCodeSpinner>
	//   12   25:aload_0         
	//   13   26:invokespecial   #170 <Method void PhoneNumberController(ResultReceiver, StateButton, EditText, CountryListSpinner, TosView)>
	//   14   29:areturn         
	}

	public boolean isValid(Bundle bundle)
	{
		return BundleManager.assertContains(bundle, new String[] {
			"receiver"
		});
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:anewarray       String[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:ldc1            #161 <String "receiver">
	//    6    9:aastore         
	//    7   10:invokestatic    #180 <Method boolean BundleManager.assertContains(Bundle, String[])>
	//    8   13:ireturn         
	}

	public void onActivityResult(int i, int j, Activity activity1)
	{
		if(j == 300 && i == 140)
	//*   0    0:iload_2         
	//*   1    1:sipush          300
	//*   2    4:icmpne          21
	//*   3    7:iload_1         
	//*   4    8:sipush          140
	//*   5   11:icmpne          21
			controller.resend();
	//    6   14:aload_0         
	//    7   15:getfield        #122 <Field PhoneNumberController controller>
	//    8   18:invokevirtual   #185 <Method void PhoneNumberController.resend()>
	//    9   21:return          
	}

	public void onLoadComplete(PhoneNumber phonenumber)
	{
		controller.setPhoneNumber(phonenumber);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field PhoneNumberController controller>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #190 <Method void PhoneNumberController.setPhoneNumber(PhoneNumber)>
		controller.setCountryCode(phonenumber);
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field PhoneNumberController controller>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #193 <Method void PhoneNumberController.setCountryCode(PhoneNumber)>
	//    8   16:return          
	}

	public void onResume()
	{
		controller.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field PhoneNumberController controller>
	//    2    4:invokevirtual   #196 <Method void PhoneNumberController.onResume()>
	//    3    7:return          
	}

	public void setText(int i)
	{
		termsTextView.setText(((CharSequence) (getFormattedTerms(activity, i))));
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextView termsTextView>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field Activity activity>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #202 <Method String getFormattedTerms(Activity, int)>
	//    7   13:invokevirtual   #205 <Method void TextView.setText(CharSequence)>
	//    8   16:return          
	}

	protected void setUpCountrySpinner(CountryListSpinner countrylistspinner)
	{
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				controller.clearError();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PhoneNumberActivityDelegate this$0>
			//    2    4:getfield        #27  <Field PhoneNumberController PhoneNumberActivityDelegate.controller>
			//    3    7:invokevirtual   #32  <Method void PhoneNumberController.clearError()>
			//    4   10:return          
			}

			final PhoneNumberActivityDelegate this$0;

			
			{
				this$0 = PhoneNumberActivityDelegate.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PhoneNumberActivityDelegate this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class PhoneNumberActivityDelegate$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #208 <Method void PhoneNumberActivityDelegate$1(PhoneNumberActivityDelegate)>
	//    4    8:astore_2        
		if(!(countrylistspinner instanceof View))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #210 <Class View>
	//*   7   13:ifne            22
		{
			countrylistspinner.setOnClickListener(onclicklistener);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #214 <Method void CountryListSpinner.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   11   21:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)countrylistspinner, onclicklistener);
	//   12   22:aload_1         
	//   13   23:checkcast       #210 <Class View>
	//   14   26:aload_2         
	//   15   27:invokestatic    #219 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   16   30:return          
		}
	}

	public void setUpTermsText(Activity activity1, DigitsController digitscontroller, TextView textview)
	{
		textview.setText(((CharSequence) (getFormattedTerms(activity1, R.string.dgts__terms_text))));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:getstatic       #224 <Field int R$string.dgts__terms_text>
	//    4    6:invokevirtual   #202 <Method String getFormattedTerms(Activity, int)>
	//    5    9:invokevirtual   #205 <Method void TextView.setText(CharSequence)>
		super.setUpTermsText(activity1, digitscontroller, textview);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokespecial   #225 <Method void DigitsActivityDelegateImpl.setUpTermsText(Activity, DigitsController, TextView)>
	//   11   19:return          
	}

	private Activity activity;
	PhoneNumberController controller;
	CountryListSpinner countryCodeSpinner;
	EditText phoneEditText;
	StateButton sendButton;
	TextView termsTextView;
}
