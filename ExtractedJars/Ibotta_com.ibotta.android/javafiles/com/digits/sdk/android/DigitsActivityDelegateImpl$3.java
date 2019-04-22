// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.digits.sdk.android:
//			DigitsActivityDelegateImpl, DigitsController

class DigitsActivityDelegateImpl$3
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		val$controller.clearError();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DigitsController val$controller>
	//    2    4:invokeinterface #36  <Method void DigitsController.clearError()>
		val$controller.showTOS(((android.content.Context) (val$activity)));
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

	DigitsActivityDelegateImpl$3()
	{
		this$0 = final_digitsactivitydelegateimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DigitsActivityDelegateImpl this$0>
		val$controller = digitscontroller;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field DigitsController val$controller>
		val$activity = Activity.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Activity val$activity>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
