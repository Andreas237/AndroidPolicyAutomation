// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.digits.sdk.android:
//			DigitsActivityDelegateImpl, DigitsController

class DigitsActivityDelegateImpl$2
	implements android.widget.er
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		if(i == 5)
	//*   0    0:iload_2         
	//*   1    1:iconst_5        
	//*   2    2:icmpne          29
		{
			val$controller.clearError();
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field DigitsController val$controller>
	//    5    9:invokeinterface #36  <Method void DigitsController.clearError()>
			val$controller.executeRequest(((android.content.Context) (val$activity)));
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

	DigitsActivityDelegateImpl$2()
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
