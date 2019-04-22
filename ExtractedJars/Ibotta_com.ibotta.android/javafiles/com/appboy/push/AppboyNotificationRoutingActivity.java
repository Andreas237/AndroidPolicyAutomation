// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.appboy.push:
//			AppboyNotificationUtils

public class AppboyNotificationRoutingActivity extends Activity
	implements TraceFieldInterface
{

	public AppboyNotificationRoutingActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Activity()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("AppboyNotificationRoutingActivity");
	//    0    0:ldc1            #32  <String "AppboyNotificationRoutingActivity">
	//    1    2:invokestatic    #38  <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "AppboyNotificationRoutingActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #40  <Field Trace _nr_trace>
	//    4    9:ldc1            #42  <String "AppboyNotificationRoutingActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #46  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyNotificationRoutingActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #42  <String "AppboyNotificationRoutingActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #46  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #48  <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (getIntent()));
	//   15   30:aload_0         
	//   16   31:invokevirtual   #52  <Method Intent getIntent()>
	//   17   34:astore_1        
		if(bundle == null)
	//*  18   35:aload_1         
	//*  19   36:ifnonnull       56
		{
			AppboyLogger.d(TAG, "Notification routing activity received null intent. Doing nothing.");
	//   20   39:getstatic       #21  <Field String TAG>
	//   21   42:ldc1            #54  <String "Notification routing activity received null intent. Doing nothing.">
	//   22   44:invokestatic    #58  <Method int AppboyLogger.d(String, String)>
	//   23   47:pop             
			finish();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #61  <Method void finish()>
			TraceMachine.exitMethod();
	//   26   52:invokestatic    #64  <Method void TraceMachine.exitMethod()>
			return;
	//   27   55:return          
		}
		Object obj = ((Object) (((Intent) (bundle)).getAction()));
	//   28   56:aload_1         
	//   29   57:invokevirtual   #70  <Method String Intent.getAction()>
	//   30   60:astore_2        
		if(obj == null)
	//*  31   61:aload_2         
	//*  32   62:ifnonnull       82
		{
			AppboyLogger.d(TAG, "Notification routing activity received intent with null action. Doing nothing.");
	//   33   65:getstatic       #21  <Field String TAG>
	//   34   68:ldc1            #72  <String "Notification routing activity received intent with null action. Doing nothing.">
	//   35   70:invokestatic    #58  <Method int AppboyLogger.d(String, String)>
	//   36   73:pop             
			finish();
	//   37   74:aload_0         
	//   38   75:invokevirtual   #61  <Method void finish()>
			TraceMachine.exitMethod();
	//   39   78:invokestatic    #64  <Method void TraceMachine.exitMethod()>
			return;
	//   40   81:return          
		} else
		{
			Object obj1 = ((Object) (TAG));
	//   41   82:getstatic       #21  <Field String TAG>
	//   42   85:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   43   86:new             #74  <Class StringBuilder>
	//   44   89:dup             
	//   45   90:invokespecial   #75  <Method void StringBuilder()>
	//   46   93:astore          4
			stringbuilder.append("Notification routing activity received intent: ");
	//   47   95:aload           4
	//   48   97:ldc1            #77  <String "Notification routing activity received intent: ">
	//   49   99:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
			stringbuilder.append(((Intent) (bundle)).toString());
	//   51  103:aload           4
	//   52  105:aload_1         
	//   53  106:invokevirtual   #84  <Method String Intent.toString()>
	//   54  109:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   55  112:pop             
			AppboyLogger.i(((String) (obj1)), stringbuilder.toString());
	//   56  113:aload_3         
	//   57  114:aload           4
	//   58  116:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   59  119:invokestatic    #88  <Method int AppboyLogger.i(String, String)>
	//   60  122:pop             
			obj1 = ((Object) (getApplicationContext()));
	//   61  123:aload_0         
	//   62  124:invokevirtual   #92  <Method Context getApplicationContext()>
	//   63  127:astore_3        
			obj = ((Object) ((new Intent(((String) (obj)))).setClass(((Context) (obj1)), AppboyNotificationUtils.getNotificationReceiverClass())));
	//   64  128:new             #66  <Class Intent>
	//   65  131:dup             
	//   66  132:aload_2         
	//   67  133:invokespecial   #94  <Method void Intent(String)>
	//   68  136:aload_3         
	//   69  137:invokestatic    #100 <Method Class AppboyNotificationUtils.getNotificationReceiverClass()>
	//   70  140:invokevirtual   #104 <Method Intent Intent.setClass(Context, Class)>
	//   71  143:astore_2        
			((Intent) (obj)).putExtras(((Intent) (bundle)).getExtras());
	//   72  144:aload_2         
	//   73  145:aload_1         
	//   74  146:invokevirtual   #108 <Method Bundle Intent.getExtras()>
	//   75  149:invokevirtual   #112 <Method Intent Intent.putExtras(Bundle)>
	//   76  152:pop             
			((Context) (obj1)).sendBroadcast(((Intent) (obj)));
	//   77  153:aload_3         
	//   78  154:aload_2         
	//   79  155:invokevirtual   #118 <Method void Context.sendBroadcast(Intent)>
			finish();
	//   80  158:aload_0         
	//   81  159:invokevirtual   #61  <Method void finish()>
			TraceMachine.exitMethod();
	//   82  162:invokestatic    #64  <Method void TraceMachine.exitMethod()>
			return;
	//   83  165:return          
		}
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   84  166:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  85  167:goto            18
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void Activity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #128 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #131 <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void Activity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #128 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #137 <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/push/AppboyNotificationRoutingActivity);
	public Trace _nr_trace;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyNotificationRoutingActivity>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String TAG>
	//*   3    8:return          
	}
}
