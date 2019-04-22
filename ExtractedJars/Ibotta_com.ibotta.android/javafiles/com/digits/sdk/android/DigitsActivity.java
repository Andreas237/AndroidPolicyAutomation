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
//			DigitsActivityDelegate, Digits

public abstract class DigitsActivity extends Activity
	implements TraceFieldInterface
{

	public DigitsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Activity()>
	//    2    4:return          
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Trace _nr_trace>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Trace trace)
	//*   4    6:astore_1        
		{
			return;
	//    5    7:return          
		}
	}

	abstract DigitsActivityDelegate getActivityDelegate();

	protected void onActivityResult(int i, int j, Intent intent)
	{
		_flddelegate.onActivityResult(i, j, ((Activity) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field DigitsActivityDelegate _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_0         
	//    5    7:invokeinterface #33  <Method void DigitsActivityDelegate.onActivityResult(int, int, Activity)>
		if(j == 200 && i == 140)
	//*   6   12:iload_2         
	//*   7   13:sipush          200
	//*   8   16:icmpne          30
	//*   9   19:iload_1         
	//*  10   20:sipush          140
	//*  11   23:icmpne          30
			finish();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #36  <Method void finish()>
	//   14   30:return          
	}

	public void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("DigitsActivity");
	//    0    0:ldc1            #42  <String "DigitsActivity">
	//    1    2:invokestatic    #48  <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "DigitsActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #22  <Field Trace _nr_trace>
	//    4    9:ldc1            #50  <String "DigitsActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #54  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "DigitsActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #50  <String "DigitsActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #54  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		setTheme(Digits.getInstance().getTheme());
	//   12   25:aload_0         
	//   13   26:invokestatic    #60  <Method Digits Digits.getInstance()>
	//   14   29:invokevirtual   #64  <Method int Digits.getTheme()>
	//   15   32:invokevirtual   #68  <Method void setTheme(int)>
		super.onCreate(bundle);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:invokespecial   #70  <Method void Activity.onCreate(Bundle)>
		_flddelegate = getActivityDelegate();
	//   19   40:aload_0         
	//   20   41:aload_0         
	//   21   42:invokevirtual   #72  <Method DigitsActivityDelegate getActivityDelegate()>
	//   22   45:putfield        #28  <Field DigitsActivityDelegate _flddelegate>
		bundle = getIntent().getExtras();
	//   23   48:aload_0         
	//   24   49:invokevirtual   #76  <Method Intent getIntent()>
	//   25   52:invokevirtual   #82  <Method Bundle Intent.getExtras()>
	//   26   55:astore_1        
		if(_flddelegate.isValid(bundle))
	//*  27   56:aload_0         
	//*  28   57:getfield        #28  <Field DigitsActivityDelegate _flddelegate>
	//*  29   60:aload_1         
	//*  30   61:invokeinterface #86  <Method boolean DigitsActivityDelegate.isValid(Bundle)>
	//*  31   66:ifeq            97
		{
			setContentView(_flddelegate.getLayoutId());
	//   32   69:aload_0         
	//   33   70:aload_0         
	//   34   71:getfield        #28  <Field DigitsActivityDelegate _flddelegate>
	//   35   74:invokeinterface #89  <Method int DigitsActivityDelegate.getLayoutId()>
	//   36   79:invokevirtual   #92  <Method void setContentView(int)>
			_flddelegate.init(((Activity) (this)), bundle);
	//   37   82:aload_0         
	//   38   83:getfield        #28  <Field DigitsActivityDelegate _flddelegate>
	//   39   86:aload_0         
	//   40   87:aload_1         
	//   41   88:invokeinterface #96  <Method void DigitsActivityDelegate.init(Activity, Bundle)>
			TraceMachine.exitMethod();
	//   42   93:invokestatic    #99  <Method void TraceMachine.exitMethod()>
			return;
	//   43   96:return          
		} else
		{
			finish();
	//   44   97:aload_0         
	//   45   98:invokevirtual   #36  <Method void finish()>
			bundle = ((Bundle) (new IllegalAccessError("This activity can only be started from Digits")));
	//   46  101:new             #101 <Class IllegalAccessError>
	//   47  104:dup             
	//   48  105:ldc1            #103 <String "This activity can only be started from Digits">
	//   49  107:invokespecial   #105 <Method void IllegalAccessError(String)>
	//   50  110:astore_1        
			TraceMachine.exitMethod();
	//   51  111:invokestatic    #99  <Method void TraceMachine.exitMethod()>
			throw bundle;
	//   52  114:aload_1         
	//   53  115:athrow          
		}
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   54  116:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  55  117:goto            18
	}

	public void onDestroy()
	{
		_flddelegate.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field DigitsActivityDelegate _flddelegate>
	//    2    4:invokeinterface #108 <Method void DigitsActivityDelegate.onDestroy()>
		super.onDestroy();
	//    3    9:aload_0         
	//    4   10:invokespecial   #109 <Method void Activity.onDestroy()>
	//    5   13:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method void Activity.onResume()>
		_flddelegate.onResume();
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field DigitsActivityDelegate _flddelegate>
	//    4    8:invokeinterface #113 <Method void DigitsActivityDelegate.onResume()>
	//    5   13:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void Activity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #121 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #124 <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void Activity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #121 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #130 <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	public Trace _nr_trace;
	DigitsActivityDelegate _flddelegate;
}
