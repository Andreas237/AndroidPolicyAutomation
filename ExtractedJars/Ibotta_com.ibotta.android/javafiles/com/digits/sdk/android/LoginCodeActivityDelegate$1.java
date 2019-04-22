// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.digits.sdk.android:
//			LoginCodeActivityDelegate

class LoginCodeActivityDelegate$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		val$activity.setResult(300);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity val$activity>
	//    2    4:sipush          300
	//    3    7:invokevirtual   #33  <Method void Activity.setResult(int)>
		val$activity.finish();
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Activity val$activity>
	//    6   14:invokevirtual   #36  <Method void Activity.finish()>
	//    7   17:return          
	}

	final LoginCodeActivityDelegate this$0;
	final Activity val$activity;

	LoginCodeActivityDelegate$1()
	{
		this$0 = final_logincodeactivitydelegate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LoginCodeActivityDelegate this$0>
		val$activity = Activity.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Activity val$activity>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
