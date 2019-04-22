// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.facebook:
//			CustomTabMainActivity

public class CustomTabActivity extends Activity
	implements TraceFieldInterface
{

	public CustomTabActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Activity()>
	//    2    4:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #50  <Method void Activity.onActivityResult(int, int, Intent)>
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            79
		{
			intent = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
	//    7   11:new             #52  <Class Intent>
	//    8   14:dup             
	//    9   15:getstatic       #40  <Field String CUSTOM_TAB_REDIRECT_ACTION>
	//   10   18:invokespecial   #55  <Method void Intent(String)>
	//   11   21:astore_3        
			intent.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
	//   12   22:aload_3         
	//   13   23:getstatic       #60  <Field String CustomTabMainActivity.EXTRA_URL>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #64  <Method Intent getIntent()>
	//   16   30:invokevirtual   #67  <Method String Intent.getDataString()>
	//   17   33:invokevirtual   #71  <Method Intent Intent.putExtra(String, String)>
	//   18   36:pop             
			LocalBroadcastManager.getInstance(((Context) (this))).sendBroadcast(intent);
	//   19   37:aload_0         
	//   20   38:invokestatic    #77  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   21   41:aload_3         
	//   22   42:invokevirtual   #81  <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   23   45:pop             
			closeReceiver = ((BroadcastReceiver) (new BroadcastReceiver() {

				public void onReceive(Context context, Intent intent1)
				{
					finish();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field CustomTabActivity this$0>
				//    2    4:invokevirtual   #24  <Method void CustomTabActivity.finish()>
				//    3    7:return          
				}

				final CustomTabActivity this$0;

			
			{
				this$0 = CustomTabActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CustomTabActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
			}
));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class CustomTabActivity$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #84  <Method void CustomTabActivity$1(CustomTabActivity)>
	//   29   55:putfield        #86  <Field BroadcastReceiver closeReceiver>
			LocalBroadcastManager.getInstance(((Context) (this))).registerReceiver(closeReceiver, new IntentFilter(DESTROY_ACTION));
	//   30   58:aload_0         
	//   31   59:invokestatic    #77  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   32   62:aload_0         
	//   33   63:getfield        #86  <Field BroadcastReceiver closeReceiver>
	//   34   66:new             #88  <Class IntentFilter>
	//   35   69:dup             
	//   36   70:getstatic       #44  <Field String DESTROY_ACTION>
	//   37   73:invokespecial   #89  <Method void IntentFilter(String)>
	//   38   76:invokevirtual   #93  <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
		}
	//   39   79:return          
	}

	protected void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("CustomTabActivity");
	//    0    0:ldc1            #99  <String "CustomTabActivity">
	//    1    2:invokestatic    #104 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "CustomTabActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #106 <Field Trace _nr_trace>
	//    4    9:ldc1            #108 <String "CustomTabActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #112 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "CustomTabActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #108 <String "CustomTabActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #112 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #114 <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (new Intent(((Context) (this)), com/facebook/CustomTabMainActivity)));
	//   15   30:new             #52  <Class Intent>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:ldc1            #57  <Class CustomTabMainActivity>
	//   19   37:invokespecial   #117 <Method void Intent(Context, Class)>
	//   20   40:astore_1        
		((Intent) (bundle)).setAction(CUSTOM_TAB_REDIRECT_ACTION);
	//   21   41:aload_1         
	//   22   42:getstatic       #40  <Field String CUSTOM_TAB_REDIRECT_ACTION>
	//   23   45:invokevirtual   #121 <Method Intent Intent.setAction(String)>
	//   24   48:pop             
		((Intent) (bundle)).putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
	//   25   49:aload_1         
	//   26   50:getstatic       #60  <Field String CustomTabMainActivity.EXTRA_URL>
	//   27   53:aload_0         
	//   28   54:invokevirtual   #64  <Method Intent getIntent()>
	//   29   57:invokevirtual   #67  <Method String Intent.getDataString()>
	//   30   60:invokevirtual   #71  <Method Intent Intent.putExtra(String, String)>
	//   31   63:pop             
		((Intent) (bundle)).addFlags(0x24000000);
	//   32   64:aload_1         
	//   33   65:ldc1            #122 <Int 0x24000000>
	//   34   67:invokevirtual   #126 <Method Intent Intent.addFlags(int)>
	//   35   70:pop             
		startActivityForResult(((Intent) (bundle)), 2);
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:iconst_2        
	//   39   74:invokevirtual   #130 <Method void startActivityForResult(Intent, int)>
		TraceMachine.exitMethod();
	//   40   77:invokestatic    #133 <Method void TraceMachine.exitMethod()>
		return;
	//   41   80:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   42   81:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  43   82:goto            18
	}

	protected void onDestroy()
	{
		LocalBroadcastManager.getInstance(((Context) (this))).unregisterReceiver(closeReceiver);
	//    0    0:aload_0         
	//    1    1:invokestatic    #77  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field BroadcastReceiver closeReceiver>
	//    4    8:invokevirtual   #138 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
		super.onDestroy();
	//    5   11:aload_0         
	//    6   12:invokespecial   #140 <Method void Activity.onDestroy()>
	//    7   15:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void Activity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #148 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #151 <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void Activity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #148 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #157 <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	public static final String CUSTOM_TAB_REDIRECT_ACTION;
	public static final String DESTROY_ACTION;
	public Trace _nr_trace;
	private BroadcastReceiver closeReceiver;

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabActivity)).getSimpleName());
	//    4    8:aload_0         
	//    5    9:ldc1            #2   <Class CustomTabActivity>
	//    6   11:invokevirtual   #29  <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(".action_customTabRedirect");
	//    9   18:aload_0         
	//   10   19:ldc1            #35  <String ".action_customTabRedirect">
	//   11   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		CUSTOM_TAB_REDIRECT_ACTION = stringbuilder.toString();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   15   29:putstatic       #40  <Field String CUSTOM_TAB_REDIRECT_ACTION>
		stringbuilder = new StringBuilder();
	//   16   32:new             #20  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #23  <Method void StringBuilder()>
	//   19   39:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabActivity)).getSimpleName());
	//   20   40:aload_0         
	//   21   41:ldc1            #2   <Class CustomTabActivity>
	//   22   43:invokevirtual   #29  <Method String Class.getSimpleName()>
	//   23   46:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		stringbuilder.append(".action_destroy");
	//   25   50:aload_0         
	//   26   51:ldc1            #42  <String ".action_destroy">
	//   27   53:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		DESTROY_ACTION = stringbuilder.toString();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   31   61:putstatic       #44  <Field String DESTROY_ACTION>
	//*  32   64:return          
	}
}
