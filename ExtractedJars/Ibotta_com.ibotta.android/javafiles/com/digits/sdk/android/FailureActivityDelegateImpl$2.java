// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.digits.sdk.android:
//			FailureActivityDelegateImpl, FailureController

class FailureActivityDelegateImpl$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		controller.tryAnotherNumber(activity, FailureActivityDelegateImpl.access$000(FailureActivityDelegateImpl.this));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//    2    4:getfield        #27  <Field FailureController FailureActivityDelegateImpl.controller>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//    5   11:getfield        #31  <Field Activity FailureActivityDelegateImpl.activity>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//    8   18:invokestatic    #35  <Method android.os.ResultReceiver FailureActivityDelegateImpl.access$000(FailureActivityDelegateImpl)>
	//    9   21:invokeinterface #41  <Method void FailureController.tryAnotherNumber(Activity, android.os.ResultReceiver)>
		activity.finish();
	//   10   26:aload_0         
	//   11   27:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//   12   30:getfield        #31  <Field Activity FailureActivityDelegateImpl.activity>
	//   13   33:invokevirtual   #46  <Method void Activity.finish()>
	//   14   36:return          
	}

	final FailureActivityDelegateImpl this$0;

	FailureActivityDelegateImpl$2()
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
