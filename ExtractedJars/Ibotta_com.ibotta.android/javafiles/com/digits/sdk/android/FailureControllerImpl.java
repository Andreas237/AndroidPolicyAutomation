// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

// Referenced classes of package com.digits.sdk.android:
//			FailureController, Digits, ActivityClassManager

class FailureControllerImpl
	implements FailureController
{

	public FailureControllerImpl()
	{
		this(Digits.getInstance().getActivityClassManager());
	//    0    0:aload_0         
	//    1    1:invokestatic    #16  <Method Digits Digits.getInstance()>
	//    2    4:invokevirtual   #20  <Method ActivityClassManager Digits.getActivityClassManager()>
	//    3    7:invokespecial   #23  <Method void FailureControllerImpl(ActivityClassManager)>
	//    4   10:return          
	}

	public FailureControllerImpl(ActivityClassManager activityclassmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		classManager = activityclassmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field ActivityClassManager classManager>
	//    5    9:return          
	}

	int getFlags()
	{
		return android.os.Build.VERSION.SDK_INT < 11 ? 0x14000000 : 0x10008000;
	//    0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          11
	//    2    5:icmplt          11
	//    3    8:ldc1            #40  <Int 0x10008000>
	//    4   10:ireturn         
	//    5   11:ldc1            #41  <Int 0x14000000>
	//    6   13:ireturn         
	}

	public void sendFailure(ResultReceiver resultreceiver, Exception exception)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #46  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putString("login_error", exception.getLocalizedMessage());
	//    4    8:aload_3         
	//    5    9:ldc1            #49  <String "login_error">
	//    6   11:aload_2         
	//    7   12:invokevirtual   #55  <Method String Exception.getLocalizedMessage()>
	//    8   15:invokevirtual   #59  <Method void Bundle.putString(String, String)>
		resultreceiver.send(400, bundle);
	//    9   18:aload_1         
	//   10   19:sipush          400
	//   11   22:aload_3         
	//   12   23:invokevirtual   #65  <Method void ResultReceiver.send(int, Bundle)>
	//   13   26:return          
	}

	public void tryAnotherNumber(Activity activity, ResultReceiver resultreceiver)
	{
		Intent intent = new Intent(((android.content.Context) (activity)), classManager.getPhoneNumberActivity());
	//    0    0:new             #69  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field ActivityClassManager classManager>
	//    5    9:invokeinterface #75  <Method Class ActivityClassManager.getPhoneNumberActivity()>
	//    6   14:invokespecial   #78  <Method void Intent(android.content.Context, Class)>
	//    7   17:astore_3        
		Bundle bundle = new Bundle();
	//    8   18:new             #46  <Class Bundle>
	//    9   21:dup             
	//   10   22:invokespecial   #47  <Method void Bundle()>
	//   11   25:astore          4
		bundle.putParcelable("receiver", ((android.os.Parcelable) (resultreceiver)));
	//   12   27:aload           4
	//   13   29:ldc1            #80  <String "receiver">
	//   14   31:aload_2         
	//   15   32:invokevirtual   #84  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtras(bundle);
	//   16   35:aload_3         
	//   17   36:aload           4
	//   18   38:invokevirtual   #88  <Method Intent Intent.putExtras(Bundle)>
	//   19   41:pop             
		intent.setFlags(getFlags());
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:invokevirtual   #90  <Method int getFlags()>
	//   23   47:invokevirtual   #94  <Method Intent Intent.setFlags(int)>
	//   24   50:pop             
		activity.startActivity(intent);
	//   25   51:aload_1         
	//   26   52:aload_3         
	//   27   53:invokevirtual   #100 <Method void Activity.startActivity(Intent)>
	//   28   56:return          
	}

	final ActivityClassManager classManager;
}
