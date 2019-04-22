// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.view.View;

// Referenced classes of package com.digits.sdk.android:
//			PhoneNumberActivityDelegate, PhoneNumberController

class PhoneNumberActivityDelegate$1
	implements android.view.View.OnClickListener
{

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

	PhoneNumberActivityDelegate$1()
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
