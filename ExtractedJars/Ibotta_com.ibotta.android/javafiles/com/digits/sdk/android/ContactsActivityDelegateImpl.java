// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.digits.sdk.android:
//			ContactsActivityDelegate, ContactsControllerImpl, ContactsController

class ContactsActivityDelegateImpl
	implements ContactsActivityDelegate
{

	public ContactsActivityDelegateImpl(Activity activity1)
	{
		this(activity1, ((ContactsController) (new ContactsControllerImpl())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #19  <Class ContactsControllerImpl>
	//    3    5:dup             
	//    4    6:invokespecial   #22  <Method void ContactsControllerImpl()>
	//    5    9:invokespecial   #25  <Method void ContactsActivityDelegateImpl(Activity, ContactsController)>
	//    6   12:return          
	}

	public ContactsActivityDelegateImpl(Activity activity1, ContactsController contactscontroller)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		activity = activity1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Activity activity>
		controller = contactscontroller;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field ContactsController controller>
	//    8   14:return          
	}

	protected String getApplicationName()
	{
		return activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:invokevirtual   #39  <Method ApplicationInfo Activity.getApplicationInfo()>
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field Activity activity>
	//    5   11:invokevirtual   #43  <Method android.content.pm.PackageManager Activity.getPackageManager()>
	//    6   14:invokevirtual   #49  <Method CharSequence ApplicationInfo.loadLabel(android.content.pm.PackageManager)>
	//    7   17:invokeinterface #54  <Method String CharSequence.toString()>
	//    8   22:areturn         
	}

	protected String getFormattedDescription()
	{
		return activity.getString(R.string.dgts__upload_contacts, new Object[] {
			getApplicationName()
		});
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:getstatic       #61  <Field int R$string.dgts__upload_contacts>
	//    3    7:iconst_1        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:invokevirtual   #63  <Method String getApplicationName()>
	//    9   17:aastore         
	//   10   18:invokevirtual   #67  <Method String Activity.getString(int, Object[])>
	//   11   21:areturn         
	}

	public void init()
	{
		setContentView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void setContentView()>
		setUpViews();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #74  <Method void setUpViews()>
	//    4    8:return          
	}

	protected void setContentView()
	{
		activity.setContentView(R.layout.dgts__activity_contacts);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:getstatic       #79  <Field int R$layout.dgts__activity_contacts>
	//    3    7:invokevirtual   #82  <Method void Activity.setContentView(int)>
	//    4   10:return          
	}

	protected void setUpDescription(TextView textview)
	{
		textview.setText(((CharSequence) (getFormattedDescription())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #86  <Method String getFormattedDescription()>
	//    3    5:invokevirtual   #92  <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	protected void setUpNotNowButton(Button button)
	{
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				activity.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ContactsActivityDelegateImpl this$0>
			//    2    4:getfield        #27  <Field Activity ContactsActivityDelegateImpl.activity>
			//    3    7:invokevirtual   #32  <Method void Activity.finish()>
			//    4   10:return          
			}

			final ContactsActivityDelegateImpl this$0;

			
			{
				this$0 = ContactsActivityDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ContactsActivityDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class ContactsActivityDelegateImpl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #97  <Method void ContactsActivityDelegateImpl$1(ContactsActivityDelegateImpl)>
	//    4    8:astore_2        
		if(!(button instanceof View))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #99  <Class View>
	//*   7   13:ifne            22
		{
			button.setOnClickListener(onclicklistener);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #105 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   11   21:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)button, onclicklistener);
	//   12   22:aload_1         
	//   13   23:checkcast       #99  <Class View>
	//   14   26:aload_2         
	//   15   27:invokestatic    #110 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   16   30:return          
		}
	}

	protected void setUpOkayButton(Button button)
	{
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				controller.startUploadService(((android.content.Context) (activity)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ContactsActivityDelegateImpl this$0>
			//    2    4:getfield        #27  <Field ContactsController ContactsActivityDelegateImpl.controller>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field ContactsActivityDelegateImpl this$0>
			//    5   11:getfield        #31  <Field Activity ContactsActivityDelegateImpl.activity>
			//    6   14:invokeinterface #37  <Method void ContactsController.startUploadService(android.content.Context)>
				activity.finish();
			//    7   19:aload_0         
			//    8   20:getfield        #17  <Field ContactsActivityDelegateImpl this$0>
			//    9   23:getfield        #31  <Field Activity ContactsActivityDelegateImpl.activity>
			//   10   26:invokevirtual   #42  <Method void Activity.finish()>
			//   11   29:return          
			}

			final ContactsActivityDelegateImpl this$0;

			
			{
				this$0 = ContactsActivityDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ContactsActivityDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class ContactsActivityDelegateImpl$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #112 <Method void ContactsActivityDelegateImpl$2(ContactsActivityDelegateImpl)>
	//    4    8:astore_2        
		if(!(button instanceof View))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #99  <Class View>
	//*   7   13:ifne            22
		{
			button.setOnClickListener(onclicklistener);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #105 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   11   21:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)button, onclicklistener);
	//   12   22:aload_1         
	//   13   23:checkcast       #99  <Class View>
	//   14   26:aload_2         
	//   15   27:invokestatic    #110 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   16   30:return          
		}
	}

	protected void setUpViews()
	{
		Button button = (Button)activity.findViewById(R.id.dgts__not_now);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity activity>
	//    2    4:getstatic       #117 <Field int R$id.dgts__not_now>
	//    3    7:invokevirtual   #121 <Method View Activity.findViewById(int)>
	//    4   10:checkcast       #101 <Class Button>
	//    5   13:astore_1        
		Button button1 = (Button)activity.findViewById(R.id.dgts__okay);
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field Activity activity>
	//    8   18:getstatic       #124 <Field int R$id.dgts__okay>
	//    9   21:invokevirtual   #121 <Method View Activity.findViewById(int)>
	//   10   24:checkcast       #101 <Class Button>
	//   11   27:astore_2        
		TextView textview = (TextView)activity.findViewById(R.id.dgts__upload_contacts);
	//   12   28:aload_0         
	//   13   29:getfield        #29  <Field Activity activity>
	//   14   32:getstatic       #125 <Field int R$id.dgts__upload_contacts>
	//   15   35:invokevirtual   #121 <Method View Activity.findViewById(int)>
	//   16   38:checkcast       #88  <Class TextView>
	//   17   41:astore_3        
		setUpNotNowButton(button);
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:invokevirtual   #127 <Method void setUpNotNowButton(Button)>
		setUpOkayButton(button1);
	//   21   47:aload_0         
	//   22   48:aload_2         
	//   23   49:invokevirtual   #129 <Method void setUpOkayButton(Button)>
		setUpDescription(textview);
	//   24   52:aload_0         
	//   25   53:aload_3         
	//   26   54:invokevirtual   #131 <Method void setUpDescription(TextView)>
	//   27   57:return          
	}

	final Activity activity;
	final ContactsController controller;
}
