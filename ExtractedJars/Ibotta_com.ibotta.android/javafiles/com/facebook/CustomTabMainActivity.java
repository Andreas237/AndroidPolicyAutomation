// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.CustomTab;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.facebook:
//			FacebookSdk, CustomTabActivity

public class CustomTabMainActivity extends Activity
	implements TraceFieldInterface
{

	public CustomTabMainActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Activity()>
		shouldCloseCustomTab = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #60  <Field boolean shouldCloseCustomTab>
	//    5    9:return          
	}

	public static final String getRedirectUrl()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append("fb");
	//    4    8:aload_0         
	//    5    9:ldc1            #63  <String "fb">
	//    6   11:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(FacebookSdk.getApplicationId());
	//    8   15:aload_0         
	//    9   16:invokestatic    #68  <Method String FacebookSdk.getApplicationId()>
	//   10   19:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append("://authorize");
	//   12   23:aload_0         
	//   13   24:ldc1            #70  <String "://authorize">
	//   14   26:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		return stringbuilder.toString();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   18   34:areturn         
	}

	private void sendResult(int i, Intent intent)
	{
		LocalBroadcastManager.getInstance(((Context) (this))).unregisterReceiver(redirectReceiver);
	//    0    0:aload_0         
	//    1    1:invokestatic    #78  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #80  <Field BroadcastReceiver redirectReceiver>
	//    4    8:invokevirtual   #84  <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
		if(intent != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			setResult(i, intent);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #87  <Method void setResult(int, Intent)>
		else
	//*  11   21:goto            29
			setResult(i);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokevirtual   #90  <Method void setResult(int)>
		finish();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #93  <Method void finish()>
	//   17   33:return          
	}

	protected void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("CustomTabMainActivity");
	//    0    0:ldc1            #99  <String "CustomTabMainActivity">
	//    1    2:invokestatic    #105 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "CustomTabMainActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #107 <Field Trace _nr_trace>
	//    4    9:ldc1            #109 <String "CustomTabMainActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #113 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "CustomTabMainActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #109 <String "CustomTabMainActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #113 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #115 <Method void Activity.onCreate(Bundle)>
		if(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION.equals(((Object) (getIntent().getAction()))))
	//*  15   30:getstatic       #120 <Field String CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION>
	//*  16   33:aload_0         
	//*  17   34:invokevirtual   #124 <Method Intent getIntent()>
	//*  18   37:invokevirtual   #129 <Method String Intent.getAction()>
	//*  19   40:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  20   43:ifeq            59
		{
			setResult(0);
	//   21   46:aload_0         
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #90  <Method void setResult(int)>
			finish();
	//   24   51:aload_0         
	//   25   52:invokevirtual   #93  <Method void finish()>
			TraceMachine.exitMethod();
	//   26   55:invokestatic    #138 <Method void TraceMachine.exitMethod()>
			return;
	//   27   58:return          
		}
		if(bundle == null)
	//*  28   59:aload_1         
	//*  29   60:ifnonnull       138
		{
			bundle = getIntent().getBundleExtra(EXTRA_PARAMS);
	//   30   63:aload_0         
	//   31   64:invokevirtual   #124 <Method Intent getIntent()>
	//   32   67:getstatic       #44  <Field String EXTRA_PARAMS>
	//   33   70:invokevirtual   #142 <Method Bundle Intent.getBundleExtra(String)>
	//   34   73:astore_1        
			String s = getIntent().getStringExtra(EXTRA_CHROME_PACKAGE);
	//   35   74:aload_0         
	//   36   75:invokevirtual   #124 <Method Intent getIntent()>
	//   37   78:getstatic       #48  <Field String EXTRA_CHROME_PACKAGE>
	//   38   81:invokevirtual   #146 <Method String Intent.getStringExtra(String)>
	//   39   84:astore_2        
			(new CustomTab("oauth", bundle)).openCustomTab(((Activity) (this)), s);
	//   40   85:new             #148 <Class CustomTab>
	//   41   88:dup             
	//   42   89:ldc1            #150 <String "oauth">
	//   43   91:aload_1         
	//   44   92:invokespecial   #153 <Method void CustomTab(String, Bundle)>
	//   45   95:aload_0         
	//   46   96:aload_2         
	//   47   97:invokevirtual   #157 <Method void CustomTab.openCustomTab(Activity, String)>
			shouldCloseCustomTab = false;
	//   48  100:aload_0         
	//   49  101:iconst_0        
	//   50  102:putfield        #60  <Field boolean shouldCloseCustomTab>
			redirectReceiver = ((BroadcastReceiver) (new BroadcastReceiver() {

				public void onReceive(Context context, Intent intent)
				{
					context = ((Context) (new Intent(((Context) (CustomTabMainActivity.this)), com/facebook/CustomTabMainActivity)));
				//    0    0:new             #23  <Class Intent>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #15  <Field CustomTabMainActivity this$0>
				//    4    8:ldc1            #6   <Class CustomTabMainActivity>
				//    5   10:invokespecial   #26  <Method void Intent(Context, Class)>
				//    6   13:astore_1        
					((Intent) (context)).setAction(CustomTabMainActivity.REFRESH_ACTION);
				//    7   14:aload_1         
				//    8   15:getstatic       #30  <Field String CustomTabMainActivity.REFRESH_ACTION>
				//    9   18:invokevirtual   #34  <Method Intent Intent.setAction(String)>
				//   10   21:pop             
					((Intent) (context)).putExtra(CustomTabMainActivity.EXTRA_URL, intent.getStringExtra(CustomTabMainActivity.EXTRA_URL));
				//   11   22:aload_1         
				//   12   23:getstatic       #37  <Field String CustomTabMainActivity.EXTRA_URL>
				//   13   26:aload_2         
				//   14   27:getstatic       #37  <Field String CustomTabMainActivity.EXTRA_URL>
				//   15   30:invokevirtual   #41  <Method String Intent.getStringExtra(String)>
				//   16   33:invokevirtual   #45  <Method Intent Intent.putExtra(String, String)>
				//   17   36:pop             
					((Intent) (context)).addFlags(0x24000000);
				//   18   37:aload_1         
				//   19   38:ldc1            #46  <Int 0x24000000>
				//   20   40:invokevirtual   #50  <Method Intent Intent.addFlags(int)>
				//   21   43:pop             
					startActivity(((Intent) (context)));
				//   22   44:aload_0         
				//   23   45:getfield        #15  <Field CustomTabMainActivity this$0>
				//   24   48:aload_1         
				//   25   49:invokevirtual   #54  <Method void CustomTabMainActivity.startActivity(Intent)>
				//   26   52:return          
				}

				final CustomTabMainActivity this$0;

			
			{
				this$0 = CustomTabMainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CustomTabMainActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
			}
));
	//   51  105:aload_0         
	//   52  106:new             #8   <Class CustomTabMainActivity$1>
	//   53  109:dup             
	//   54  110:aload_0         
	//   55  111:invokespecial   #160 <Method void CustomTabMainActivity$1(CustomTabMainActivity)>
	//   56  114:putfield        #80  <Field BroadcastReceiver redirectReceiver>
			LocalBroadcastManager.getInstance(((Context) (this))).registerReceiver(redirectReceiver, new IntentFilter(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION));
	//   57  117:aload_0         
	//   58  118:invokestatic    #78  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   59  121:aload_0         
	//   60  122:getfield        #80  <Field BroadcastReceiver redirectReceiver>
	//   61  125:new             #162 <Class IntentFilter>
	//   62  128:dup             
	//   63  129:getstatic       #120 <Field String CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION>
	//   64  132:invokespecial   #164 <Method void IntentFilter(String)>
	//   65  135:invokevirtual   #168 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
		}
		TraceMachine.exitMethod();
	//   66  138:invokestatic    #138 <Method void TraceMachine.exitMethod()>
		return;
	//   67  141:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   68  142:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  69  143:goto            18
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #172 <Method void Activity.onNewIntent(Intent)>
		if(REFRESH_ACTION.equals(((Object) (intent.getAction()))))
	//*   3    5:getstatic       #56  <Field String REFRESH_ACTION>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #129 <Method String Intent.getAction()>
	//*   6   12:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*   7   15:ifeq            45
		{
			Intent intent1 = new Intent(CustomTabActivity.DESTROY_ACTION);
	//    8   18:new             #126 <Class Intent>
	//    9   21:dup             
	//   10   22:getstatic       #175 <Field String CustomTabActivity.DESTROY_ACTION>
	//   11   25:invokespecial   #176 <Method void Intent(String)>
	//   12   28:astore_2        
			LocalBroadcastManager.getInstance(((Context) (this))).sendBroadcast(intent1);
	//   13   29:aload_0         
	//   14   30:invokestatic    #78  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #180 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   17   37:pop             
			sendResult(-1, intent);
	//   18   38:aload_0         
	//   19   39:iconst_m1       
	//   20   40:aload_1         
	//   21   41:invokespecial   #182 <Method void sendResult(int, Intent)>
			return;
	//   22   44:return          
		}
		if(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION.equals(((Object) (intent.getAction()))))
	//*  23   45:getstatic       #120 <Field String CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION>
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #129 <Method String Intent.getAction()>
	//*  26   52:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  27   55:ifeq            64
			sendResult(-1, intent);
	//   28   58:aload_0         
	//   29   59:iconst_m1       
	//   30   60:aload_1         
	//   31   61:invokespecial   #182 <Method void sendResult(int, Intent)>
	//   32   64:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void Activity.onResume()>
		if(shouldCloseCustomTab)
	//*   2    4:aload_0         
	//*   3    5:getfield        #60  <Field boolean shouldCloseCustomTab>
	//*   4    8:ifeq            17
			sendResult(0, ((Intent) (null)));
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:aconst_null     
	//    8   14:invokespecial   #182 <Method void sendResult(int, Intent)>
		shouldCloseCustomTab = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #60  <Field boolean shouldCloseCustomTab>
	//   12   22:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void Activity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #193 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #196 <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method void Activity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #193 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #202 <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	public static final String EXTRA_CHROME_PACKAGE;
	public static final String EXTRA_PARAMS;
	public static final String EXTRA_URL;
	public static final String REFRESH_ACTION;
	public Trace _nr_trace;
	private BroadcastReceiver redirectReceiver;
	private boolean shouldCloseCustomTab;

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//    4    8:aload_0         
	//    5    9:ldc1            #2   <Class CustomTabMainActivity>
	//    6   11:invokevirtual   #33  <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(".extra_params");
	//    9   18:aload_0         
	//   10   19:ldc1            #39  <String ".extra_params">
	//   11   21:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		EXTRA_PARAMS = stringbuilder.toString();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   15   29:putstatic       #44  <Field String EXTRA_PARAMS>
		stringbuilder = new StringBuilder();
	//   16   32:new             #24  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #27  <Method void StringBuilder()>
	//   19   39:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//   20   40:aload_0         
	//   21   41:ldc1            #2   <Class CustomTabMainActivity>
	//   22   43:invokevirtual   #33  <Method String Class.getSimpleName()>
	//   23   46:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		stringbuilder.append(".extra_chromePackage");
	//   25   50:aload_0         
	//   26   51:ldc1            #46  <String ".extra_chromePackage">
	//   27   53:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		EXTRA_CHROME_PACKAGE = stringbuilder.toString();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   31   61:putstatic       #48  <Field String EXTRA_CHROME_PACKAGE>
		stringbuilder = new StringBuilder();
	//   32   64:new             #24  <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #27  <Method void StringBuilder()>
	//   35   71:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//   36   72:aload_0         
	//   37   73:ldc1            #2   <Class CustomTabMainActivity>
	//   38   75:invokevirtual   #33  <Method String Class.getSimpleName()>
	//   39   78:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
		stringbuilder.append(".extra_url");
	//   41   82:aload_0         
	//   42   83:ldc1            #50  <String ".extra_url">
	//   43   85:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
		EXTRA_URL = stringbuilder.toString();
	//   45   89:aload_0         
	//   46   90:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   47   93:putstatic       #52  <Field String EXTRA_URL>
		stringbuilder = new StringBuilder();
	//   48   96:new             #24  <Class StringBuilder>
	//   49   99:dup             
	//   50  100:invokespecial   #27  <Method void StringBuilder()>
	//   51  103:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//   52  104:aload_0         
	//   53  105:ldc1            #2   <Class CustomTabMainActivity>
	//   54  107:invokevirtual   #33  <Method String Class.getSimpleName()>
	//   55  110:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   56  113:pop             
		stringbuilder.append(".action_refresh");
	//   57  114:aload_0         
	//   58  115:ldc1            #54  <String ".action_refresh">
	//   59  117:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   60  120:pop             
		REFRESH_ACTION = stringbuilder.toString();
	//   61  121:aload_0         
	//   62  122:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   63  125:putstatic       #56  <Field String REFRESH_ACTION>
	//*  64  128:return          
	}
}
