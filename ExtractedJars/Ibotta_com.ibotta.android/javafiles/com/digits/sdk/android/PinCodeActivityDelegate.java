// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.EditText;
import android.widget.TextView;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			DigitsActivityDelegateImpl, StateButton, PinCodeController, BundleManager, 
//			DigitsController

class PinCodeActivityDelegate extends DigitsActivityDelegateImpl
{

	PinCodeActivityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void DigitsActivityDelegateImpl()>
	//    2    4:return          
	}

	public int getLayoutId()
	{
		return R.layout.dgts__activity_pin_code;
	//    0    0:getstatic       #25  <Field int R$layout.dgts__activity_pin_code>
	//    1    3:ireturn         
	}

	public void init(Activity activity, Bundle bundle)
	{
		editText = (EditText)activity.findViewById(R.id.dgts__confirmationEditText);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field int R$id.dgts__confirmationEditText>
	//    3    5:invokevirtual   #38  <Method android.view.View Activity.findViewById(int)>
	//    4    8:checkcast       #40  <Class EditText>
	//    5   11:putfield        #42  <Field EditText editText>
		stateButton = (StateButton)activity.findViewById(R.id.dgts__createAccount);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:getstatic       #45  <Field int R$id.dgts__createAccount>
	//    9   19:invokevirtual   #38  <Method android.view.View Activity.findViewById(int)>
	//   10   22:checkcast       #47  <Class StateButton>
	//   11   25:putfield        #49  <Field StateButton stateButton>
		termsText = (TextView)activity.findViewById(R.id.dgts__termsTextCreateAccount);
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:getstatic       #52  <Field int R$id.dgts__termsTextCreateAccount>
	//   15   33:invokevirtual   #38  <Method android.view.View Activity.findViewById(int)>
	//   16   36:checkcast       #54  <Class TextView>
	//   17   39:putfield        #56  <Field TextView termsText>
		controller = initController(bundle);
	//   18   42:aload_0         
	//   19   43:aload_0         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #60  <Method DigitsController initController(Bundle)>
	//   22   48:putfield        #62  <Field DigitsController controller>
		setUpEditText(activity, controller, editText);
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:aload_0         
	//   26   54:getfield        #62  <Field DigitsController controller>
	//   27   57:aload_0         
	//   28   58:getfield        #42  <Field EditText editText>
	//   29   61:invokevirtual   #66  <Method void setUpEditText(Activity, DigitsController, EditText)>
		setUpSendButton(activity, controller, stateButton);
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:getfield        #62  <Field DigitsController controller>
	//   34   70:aload_0         
	//   35   71:getfield        #49  <Field StateButton stateButton>
	//   36   74:invokevirtual   #70  <Method void setUpSendButton(Activity, DigitsController, StateButton)>
		setUpTermsText(activity, controller, termsText);
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #62  <Field DigitsController controller>
	//   41   83:aload_0         
	//   42   84:getfield        #56  <Field TextView termsText>
	//   43   87:invokevirtual   #74  <Method void setUpTermsText(Activity, DigitsController, TextView)>
		CommonUtils.openKeyboard(((android.content.Context) (activity)), ((android.view.View) (editText)));
	//   44   90:aload_1         
	//   45   91:aload_0         
	//   46   92:getfield        #42  <Field EditText editText>
	//   47   95:invokestatic    #80  <Method void CommonUtils.openKeyboard(android.content.Context, android.view.View)>
	//   48   98:return          
	}

	DigitsController initController(Bundle bundle)
	{
		return ((DigitsController) (new PinCodeController((ResultReceiver)bundle.getParcelable("receiver"), stateButton, editText, bundle.getString("request_id"), bundle.getLong("user_id"), bundle.getString("phone_number"))));
	//    0    0:new             #82  <Class PinCodeController>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #84  <String "receiver">
	//    4    7:invokevirtual   #90  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    5   10:checkcast       #92  <Class ResultReceiver>
	//    6   13:aload_0         
	//    7   14:getfield        #49  <Field StateButton stateButton>
	//    8   17:aload_0         
	//    9   18:getfield        #42  <Field EditText editText>
	//   10   21:aload_1         
	//   11   22:ldc1            #94  <String "request_id">
	//   12   24:invokevirtual   #98  <Method String Bundle.getString(String)>
	//   13   27:aload_1         
	//   14   28:ldc1            #100 <String "user_id">
	//   15   30:invokevirtual   #104 <Method long Bundle.getLong(String)>
	//   16   33:aload_1         
	//   17   34:ldc1            #106 <String "phone_number">
	//   18   36:invokevirtual   #98  <Method String Bundle.getString(String)>
	//   19   39:invokespecial   #109 <Method void PinCodeController(ResultReceiver, StateButton, EditText, String, long, String)>
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
	//    5    7:ldc1            #84  <String "receiver">
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:ldc1            #106 <String "phone_number">
	//   10   14:aastore         
	//   11   15:dup             
	//   12   16:iconst_2        
	//   13   17:ldc1            #94  <String "request_id">
	//   14   19:aastore         
	//   15   20:dup             
	//   16   21:iconst_3        
	//   17   22:ldc1            #100 <String "user_id">
	//   18   24:aastore         
	//   19   25:invokestatic    #119 <Method boolean BundleManager.assertContains(Bundle, String[])>
	//   20   28:ireturn         
	}

	public void onResume()
	{
		controller.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DigitsController controller>
	//    2    4:invokeinterface #124 <Method void DigitsController.onResume()>
	//    3    9:return          
	}

	DigitsController controller;
	EditText editText;
	StateButton stateButton;
	TextView termsText;
}
