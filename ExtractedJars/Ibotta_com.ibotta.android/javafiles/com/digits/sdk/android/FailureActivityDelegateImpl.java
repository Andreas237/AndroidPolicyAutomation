// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			FailureActivityDelegate, FailureControllerImpl, DigitsException, BundleManager, 
//			FailureController

class FailureActivityDelegateImpl
	implements FailureActivityDelegate
{

	public FailureActivityDelegateImpl(Activity activity1)
	{
		this(activity1, ((FailureController) (new FailureControllerImpl())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #19  <Class FailureControllerImpl>
	//    3    5:dup             
	//    4    6:invokespecial   #22  <Method void FailureControllerImpl()>
	//    5    9:invokespecial   #25  <Method void FailureActivityDelegateImpl(Activity, FailureController)>
	//    6   12:return          
	}

	public FailureActivityDelegateImpl(Activity activity1, FailureController failurecontroller)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		activity = activity1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Activity activity>
		controller = failurecontroller;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field FailureController controller>
	//    8   14:return          
	}

	private DigitsException getBundleException()
	{
		return (DigitsException)activity.getIntent().getExtras().getSerializable("fallback_reason");
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:invokevirtual   #49  <Method Intent Activity.getIntent()>
	//    3    7:invokevirtual   #55  <Method Bundle Intent.getExtras()>
	//    4   10:ldc1            #57  <String "fallback_reason">
	//    5   12:invokevirtual   #63  <Method java.io.Serializable Bundle.getSerializable(String)>
	//    6   15:checkcast       #65  <Class DigitsException>
	//    7   18:areturn         
	}

	private ResultReceiver getBundleResultReceiver()
	{
		return (ResultReceiver)activity.getIntent().getExtras().getParcelable("receiver");
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:invokevirtual   #49  <Method Intent Activity.getIntent()>
	//    3    7:invokevirtual   #55  <Method Bundle Intent.getExtras()>
	//    4   10:ldc1            #67  <String "receiver">
	//    5   12:invokevirtual   #71  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    6   15:checkcast       #73  <Class ResultReceiver>
	//    7   18:areturn         
	}

	public void init()
	{
		if(isBundleValid(activity.getIntent().getExtras()))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field Activity activity>
	//*   3    5:invokevirtual   #49  <Method Intent Activity.getIntent()>
	//*   4    8:invokevirtual   #55  <Method Bundle Intent.getExtras()>
	//*   5   11:invokevirtual   #78  <Method boolean isBundleValid(Bundle)>
	//*   6   14:ifeq            26
		{
			setContentView();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #81  <Method void setContentView()>
			setUpViews();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #84  <Method void setUpViews()>
			return;
	//   11   25:return          
		} else
		{
			throw new IllegalAccessError("This activity can only be started from Digits");
	//   12   26:new             #86  <Class IllegalAccessError>
	//   13   29:dup             
	//   14   30:ldc1            #88  <String "This activity can only be started from Digits">
	//   15   32:invokespecial   #91  <Method void IllegalAccessError(String)>
	//   16   35:athrow          
		}
	}

	protected boolean isBundleValid(Bundle bundle)
	{
		return BundleManager.assertContains(bundle, new String[] {
			"receiver"
		});
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:anewarray       String[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:ldc1            #67  <String "receiver">
	//    6    9:aastore         
	//    7   10:invokestatic    #99  <Method boolean BundleManager.assertContains(Bundle, String[])>
	//    8   13:ireturn         
	}

	protected void setContentView()
	{
		activity.setContentView(R.layout.dgts__activity_failure);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:getstatic       #105 <Field int R$layout.dgts__activity_failure>
	//    3    7:invokevirtual   #108 <Method void Activity.setContentView(int)>
	//    4   10:return          
	}

	protected void setUpDismissButton(Button button)
	{
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				CommonUtils.finishAffinity(activity, 200);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//    2    4:getfield        #27  <Field Activity FailureActivityDelegateImpl.activity>
			//    3    7:sipush          200
			//    4   10:invokestatic    #33  <Method void CommonUtils.finishAffinity(Activity, int)>
				controller.sendFailure(getBundleResultReceiver(), ((Exception) (getBundleException())));
			//    5   13:aload_0         
			//    6   14:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//    7   17:getfield        #37  <Field FailureController FailureActivityDelegateImpl.controller>
			//    8   20:aload_0         
			//    9   21:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//   10   24:invokestatic    #41  <Method ResultReceiver FailureActivityDelegateImpl.access$000(FailureActivityDelegateImpl)>
			//   11   27:aload_0         
			//   12   28:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//   13   31:invokestatic    #45  <Method DigitsException FailureActivityDelegateImpl.access$100(FailureActivityDelegateImpl)>
			//   14   34:invokeinterface #51  <Method void FailureController.sendFailure(ResultReceiver, Exception)>
			//   15   39:return          
			}

			final FailureActivityDelegateImpl this$0;

			
			{
				this$0 = FailureActivityDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FailureActivityDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class FailureActivityDelegateImpl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #113 <Method void FailureActivityDelegateImpl$1(FailureActivityDelegateImpl)>
	//    4    8:astore_2        
		if(!(button instanceof View))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #115 <Class View>
	//*   7   13:ifne            22
		{
			button.setOnClickListener(onclicklistener);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #121 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   11   21:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)button, onclicklistener);
	//   12   22:aload_1         
	//   13   23:checkcast       #115 <Class View>
	//   14   26:aload_2         
	//   15   27:invokestatic    #126 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   16   30:return          
		}
	}

	protected void setUpTryAnotherPhoneButton(TextView textview)
	{
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				controller.tryAnotherNumber(activity, getBundleResultReceiver());
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//    2    4:getfield        #27  <Field FailureController FailureActivityDelegateImpl.controller>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//    5   11:getfield        #31  <Field Activity FailureActivityDelegateImpl.activity>
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//    8   18:invokestatic    #35  <Method ResultReceiver FailureActivityDelegateImpl.access$000(FailureActivityDelegateImpl)>
			//    9   21:invokeinterface #41  <Method void FailureController.tryAnotherNumber(Activity, ResultReceiver)>
				activity.finish();
			//   10   26:aload_0         
			//   11   27:getfield        #17  <Field FailureActivityDelegateImpl this$0>
			//   12   30:getfield        #31  <Field Activity FailureActivityDelegateImpl.activity>
			//   13   33:invokevirtual   #46  <Method void Activity.finish()>
			//   14   36:return          
			}

			final FailureActivityDelegateImpl this$0;

			
			{
				this$0 = FailureActivityDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FailureActivityDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class FailureActivityDelegateImpl$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #129 <Method void FailureActivityDelegateImpl$2(FailureActivityDelegateImpl)>
	//    4    8:astore_2        
		if(!(textview instanceof View))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #115 <Class View>
	//*   7   13:ifne            22
		{
			textview.setOnClickListener(onclicklistener);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #132 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   11   21:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)textview, onclicklistener);
	//   12   22:aload_1         
	//   13   23:checkcast       #115 <Class View>
	//   14   26:aload_2         
	//   15   27:invokestatic    #126 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   16   30:return          
		}
	}

	protected void setUpViews()
	{
		Button button = (Button)activity.findViewById(R.id.dgts__dismiss_button);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:getstatic       #137 <Field int R$id.dgts__dismiss_button>
	//    3    7:invokevirtual   #141 <Method View Activity.findViewById(int)>
	//    4   10:checkcast       #117 <Class Button>
	//    5   13:astore_1        
		TextView textview = (TextView)activity.findViewById(R.id.dgts__try_another_phone);
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field Activity activity>
	//    8   18:getstatic       #144 <Field int R$id.dgts__try_another_phone>
	//    9   21:invokevirtual   #141 <Method View Activity.findViewById(int)>
	//   10   24:checkcast       #131 <Class TextView>
	//   11   27:astore_2        
		setUpDismissButton(button);
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokevirtual   #146 <Method void setUpDismissButton(Button)>
		setUpTryAnotherPhoneButton(textview);
	//   15   33:aload_0         
	//   16   34:aload_2         
	//   17   35:invokevirtual   #148 <Method void setUpTryAnotherPhoneButton(TextView)>
	//   18   38:return          
	}

	final Activity activity;
	final FailureController controller;


/*
	static ResultReceiver access$000(FailureActivityDelegateImpl failureactivitydelegateimpl)
	{
		return failureactivitydelegateimpl.getBundleResultReceiver();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method ResultReceiver getBundleResultReceiver()>
	//    2    4:areturn         
	}

*/


/*
	static DigitsException access$100(FailureActivityDelegateImpl failureactivitydelegateimpl)
	{
		return failureactivitydelegateimpl.getBundleException();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method DigitsException getBundleException()>
	//    2    4:areturn         
	}

*/
}
