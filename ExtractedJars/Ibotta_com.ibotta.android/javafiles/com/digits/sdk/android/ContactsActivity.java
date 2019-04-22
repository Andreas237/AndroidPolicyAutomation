// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.digits.sdk.android:
//			ContactsActivityDelegateImpl

public class ContactsActivity extends Activity
	implements TraceFieldInterface
{

	public ContactsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Activity()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("ContactsActivity");
	//    0    0:ldc1            #22  <String "ContactsActivity">
	//    1    2:invokestatic    #28  <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "ContactsActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #30  <Field Trace _nr_trace>
	//    4    9:ldc1            #32  <String "ContactsActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #36  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "ContactsActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #32  <String "ContactsActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #36  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		setTheme(getIntent().getIntExtra("THEME_RESOURCE_ID", R.style.Digits_default));
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #40  <Method Intent getIntent()>
	//   15   30:ldc1            #42  <String "THEME_RESOURCE_ID">
	//   16   32:getstatic       #48  <Field int R$style.Digits_default>
	//   17   35:invokevirtual   #54  <Method int Intent.getIntExtra(String, int)>
	//   18   38:invokevirtual   #58  <Method void setTheme(int)>
		super.onCreate(bundle);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokespecial   #60  <Method void Activity.onCreate(Bundle)>
		_flddelegate = new ContactsActivityDelegateImpl(((Activity) (this)));
	//   22   46:aload_0         
	//   23   47:new             #62  <Class ContactsActivityDelegateImpl>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:invokespecial   #65  <Method void ContactsActivityDelegateImpl(Activity)>
	//   27   55:putfield        #67  <Field ContactsActivityDelegateImpl _flddelegate>
		_flddelegate.init();
	//   28   58:aload_0         
	//   29   59:getfield        #67  <Field ContactsActivityDelegateImpl _flddelegate>
	//   30   62:invokevirtual   #70  <Method void ContactsActivityDelegateImpl.init()>
		TraceMachine.exitMethod();
	//   31   65:invokestatic    #73  <Method void TraceMachine.exitMethod()>
		return;
	//   32   68:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   33   69:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  34   70:goto            18
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Activity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #82  <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #85  <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Activity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #82  <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #91  <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	public Trace _nr_trace;
	ContactsActivityDelegateImpl _flddelegate;
}
