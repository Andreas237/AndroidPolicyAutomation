// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.view.View;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.digits.sdk.android:
//			FailureActivityDelegateImpl, FailureController

class FailureActivityDelegateImpl$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		CommonUtils.finishAffinity(activity, 200);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//    2    4:getfield        #27  <Field android.app.Activity FailureActivityDelegateImpl.activity>
	//    3    7:sipush          200
	//    4   10:invokestatic    #33  <Method void CommonUtils.finishAffinity(android.app.Activity, int)>
		controller.sendFailure(FailureActivityDelegateImpl.access$000(FailureActivityDelegateImpl.this), ((Exception) (FailureActivityDelegateImpl.access$100(FailureActivityDelegateImpl.this))));
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//    7   17:getfield        #37  <Field FailureController FailureActivityDelegateImpl.controller>
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//   10   24:invokestatic    #41  <Method android.os.ResultReceiver FailureActivityDelegateImpl.access$000(FailureActivityDelegateImpl)>
	//   11   27:aload_0         
	//   12   28:getfield        #17  <Field FailureActivityDelegateImpl this$0>
	//   13   31:invokestatic    #45  <Method DigitsException FailureActivityDelegateImpl.access$100(FailureActivityDelegateImpl)>
	//   14   34:invokeinterface #51  <Method void FailureController.sendFailure(android.os.ResultReceiver, Exception)>
	//   15   39:return          
	}

	final FailureActivityDelegateImpl this$0;

	FailureActivityDelegateImpl$1()
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
