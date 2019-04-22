// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.digits.sdk.android:
//			ContactsActivityDelegateImpl, ContactsController

class ContactsActivityDelegateImpl$2
	implements android.view.View.OnClickListener
{

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

	ContactsActivityDelegateImpl$2()
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
