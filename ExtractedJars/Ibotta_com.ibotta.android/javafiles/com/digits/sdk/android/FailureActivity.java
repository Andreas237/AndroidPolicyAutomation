// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.os.Bundle;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.digits.sdk.android:
//			Digits, FailureActivityDelegateImpl

public class FailureActivity extends Activity
	implements TraceFieldInterface
{

	public FailureActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Activity()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("FailureActivity");
	//    0    0:ldc1            #22  <String "FailureActivity">
	//    1    2:invokestatic    #28  <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "FailureActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #30  <Field Trace _nr_trace>
	//    4    9:ldc1            #32  <String "FailureActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #36  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "FailureActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #32  <String "FailureActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #36  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		setTheme(Digits.getInstance().getTheme());
	//   12   25:aload_0         
	//   13   26:invokestatic    #42  <Method Digits Digits.getInstance()>
	//   14   29:invokevirtual   #46  <Method int Digits.getTheme()>
	//   15   32:invokevirtual   #50  <Method void setTheme(int)>
		super.onCreate(bundle);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:invokespecial   #52  <Method void Activity.onCreate(Bundle)>
		_flddelegate = new FailureActivityDelegateImpl(((Activity) (this)));
	//   19   40:aload_0         
	//   20   41:new             #54  <Class FailureActivityDelegateImpl>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokespecial   #57  <Method void FailureActivityDelegateImpl(Activity)>
	//   24   49:putfield        #59  <Field FailureActivityDelegateImpl _flddelegate>
		_flddelegate.init();
	//   25   52:aload_0         
	//   26   53:getfield        #59  <Field FailureActivityDelegateImpl _flddelegate>
	//   27   56:invokevirtual   #62  <Method void FailureActivityDelegateImpl.init()>
		TraceMachine.exitMethod();
	//   28   59:invokestatic    #65  <Method void TraceMachine.exitMethod()>
		return;
	//   29   62:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   30   63:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  31   64:goto            18
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Activity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #73  <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #76  <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Activity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #73  <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #82  <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	public Trace _nr_trace;
	FailureActivityDelegateImpl _flddelegate;
}
