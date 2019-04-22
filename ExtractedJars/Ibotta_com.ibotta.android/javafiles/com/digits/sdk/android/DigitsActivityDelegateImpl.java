// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.digits.sdk.android:
//			DigitsActivityDelegate, DigitsController, StateButton

abstract class DigitsActivityDelegateImpl
	implements DigitsActivityDelegate
{

	DigitsActivityDelegateImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	protected String getFormattedTerms(Activity activity, int i)
	{
		return activity.getString(i, new Object[] {
			"\""
		});
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:anewarray       Object[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:ldc1            #22  <String "\"">
	//    7   10:aastore         
	//    8   11:invokevirtual   #28  <Method String Activity.getString(int, Object[])>
	//    9   14:areturn         
	}

	public void onActivityResult(int i, int j, Activity activity)
	{
	//    0    0:return          
	}

	public void onDestroy()
	{
	//    0    0:return          
	}

	public void setUpEditText(final Activity activity, final DigitsController controller, EditText edittext)
	{
		edittext.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

			public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
			{
				if(i == 5)
			//*   0    0:iload_2         
			//*   1    1:iconst_5        
			//*   2    2:icmpne          29
				{
					controller.clearError();
			//    3    5:aload_0         
			//    4    6:getfield        #23  <Field DigitsController val$controller>
			//    5    9:invokeinterface #36  <Method void DigitsController.clearError()>
					controller.executeRequest(((android.content.Context) (activity)));
			//    6   14:aload_0         
			//    7   15:getfield        #23  <Field DigitsController val$controller>
			//    8   18:aload_0         
			//    9   19:getfield        #25  <Field Activity val$activity>
			//   10   22:invokeinterface #40  <Method void DigitsController.executeRequest(android.content.Context)>
					return true;
			//   11   27:iconst_1        
			//   12   28:ireturn         
				} else
				{
					return false;
			//   13   29:iconst_0        
			//   14   30:ireturn         
				}
			}

			final DigitsActivityDelegateImpl this$0;
			final Activity val$activity;
			final DigitsController val$controller;

			
			{
				this$0 = DigitsActivityDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DigitsActivityDelegateImpl this$0>
				controller = digitscontroller;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field DigitsController val$controller>
				activity = activity1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Activity val$activity>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_3         
	//    1    1:new             #10  <Class DigitsActivityDelegateImpl$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokespecial   #36  <Method void DigitsActivityDelegateImpl$2(DigitsActivityDelegateImpl, DigitsController, Activity)>
	//    7   11:invokevirtual   #42  <Method void EditText.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		edittext.addTextChangedListener(controller.getTextWatcher());
	//    8   14:aload_3         
	//    9   15:aload_2         
	//   10   16:invokeinterface #48  <Method android.text.TextWatcher DigitsController.getTextWatcher()>
	//   11   21:invokevirtual   #52  <Method void EditText.addTextChangedListener(android.text.TextWatcher)>
	//   12   24:return          
	}

	public void setUpSendButton(final Activity activity, final DigitsController controller, StateButton statebutton)
	{
		activity = ((Activity) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				controller.clearError();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field DigitsController val$controller>
			//    2    4:invokeinterface #36  <Method void DigitsController.clearError()>
				controller.executeRequest(((android.content.Context) (activity)));
			//    3    9:aload_0         
			//    4   10:getfield        #23  <Field DigitsController val$controller>
			//    5   13:aload_0         
			//    6   14:getfield        #25  <Field Activity val$activity>
			//    7   17:invokeinterface #40  <Method void DigitsController.executeRequest(android.content.Context)>
			//    8   22:return          
			}

			final DigitsActivityDelegateImpl this$0;
			final Activity val$activity;
			final DigitsController val$controller;

			
			{
				this$0 = DigitsActivityDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DigitsActivityDelegateImpl this$0>
				controller = digitscontroller;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field DigitsController val$controller>
				activity = activity1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Activity val$activity>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//    0    0:new             #8   <Class DigitsActivityDelegateImpl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #55  <Method void DigitsActivityDelegateImpl$1(DigitsActivityDelegateImpl, DigitsController, Activity)>
	//    6   10:astore_1        
		if(!(statebutton instanceof View))
	//*   7   11:aload_3         
	//*   8   12:instanceof      #57  <Class View>
	//*   9   15:ifne            24
		{
			statebutton.setOnClickListener(((android.view.View.OnClickListener) (activity)));
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #63  <Method void StateButton.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   13   23:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)statebutton, ((android.view.View.OnClickListener) (activity)));
	//   14   24:aload_3         
	//   15   25:checkcast       #57  <Class View>
	//   16   28:aload_1         
	//   17   29:invokestatic    #68  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   18   32:return          
		}
	}

	public void setUpTermsText(final Activity activity, final DigitsController controller, TextView textview)
	{
		activity = ((Activity) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				controller.clearError();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field DigitsController val$controller>
			//    2    4:invokeinterface #36  <Method void DigitsController.clearError()>
				controller.showTOS(((android.content.Context) (activity)));
			//    3    9:aload_0         
			//    4   10:getfield        #23  <Field DigitsController val$controller>
			//    5   13:aload_0         
			//    6   14:getfield        #25  <Field Activity val$activity>
			//    7   17:invokeinterface #40  <Method void DigitsController.showTOS(android.content.Context)>
			//    8   22:return          
			}

			final DigitsActivityDelegateImpl this$0;
			final Activity val$activity;
			final DigitsController val$controller;

			
			{
				this$0 = DigitsActivityDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DigitsActivityDelegateImpl this$0>
				controller = digitscontroller;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field DigitsController val$controller>
				activity = activity1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Activity val$activity>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//    0    0:new             #12  <Class DigitsActivityDelegateImpl$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #71  <Method void DigitsActivityDelegateImpl$3(DigitsActivityDelegateImpl, DigitsController, Activity)>
	//    6   10:astore_1        
		if(!(textview instanceof View))
	//*   7   11:aload_3         
	//*   8   12:instanceof      #57  <Class View>
	//*   9   15:ifne            24
		{
			textview.setOnClickListener(((android.view.View.OnClickListener) (activity)));
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #74  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   13   23:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)textview, ((android.view.View.OnClickListener) (activity)));
	//   14   24:aload_3         
	//   15   25:checkcast       #57  <Class View>
	//   16   28:aload_1         
	//   17   29:invokestatic    #68  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   18   32:return          
		}
	}
}
