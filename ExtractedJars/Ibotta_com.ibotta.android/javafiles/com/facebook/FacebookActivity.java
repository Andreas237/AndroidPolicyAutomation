// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.*;
import android.util.Log;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginFragment;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.facebook:
//			FacebookSdk

public class FacebookActivity extends FragmentActivity
	implements TraceFieldInterface
{

	public FacebookActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void FragmentActivity()>
	//    2    4:return          
	}

	private void handlePassThroughError()
	{
		FacebookException facebookexception = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(getIntent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Intent getIntent()>
	//    2    4:invokestatic    #38  <Method Bundle NativeProtocol.getMethodArgumentsFromIntent(Intent)>
	//    3    7:invokestatic    #42  <Method FacebookException NativeProtocol.getExceptionFromErrorData(Bundle)>
	//    4   10:astore_1        
		setResult(0, NativeProtocol.createProtocolResultIntent(getIntent(), ((Bundle) (null)), facebookexception));
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:invokevirtual   #32  <Method Intent getIntent()>
	//    9   17:aconst_null     
	//   10   18:aload_1         
	//   11   19:invokestatic    #46  <Method Intent NativeProtocol.createProtocolResultIntent(Intent, Bundle, FacebookException)>
	//   12   22:invokevirtual   #50  <Method void setResult(int, Intent)>
		finish();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #53  <Method void finish()>
	//   15   29:return          
	}

	public Fragment getCurrentFragment()
	{
		return singleFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Fragment singleFragment>
	//    2    4:areturn         
	}

	protected Fragment getFragment()
	{
		Intent intent = getIntent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Intent getIntent()>
	//    2    4:astore          4
		FragmentManager fragmentmanager = getSupportFragmentManager();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #62  <Method FragmentManager getSupportFragmentManager()>
	//    5   10:astore_3        
		Fragment fragment = fragmentmanager.findFragmentByTag(FRAGMENT_TAG);
	//    6   11:aload_3         
	//    7   12:getstatic       #64  <Field String FRAGMENT_TAG>
	//    8   15:invokevirtual   #70  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    9   18:astore_2        
		Object obj = ((Object) (fragment));
	//   10   19:aload_2         
	//   11   20:astore_1        
		if(fragment == null)
	//*  12   21:aload_2         
	//*  13   22:ifnonnull       142
		{
			if("FacebookDialogFragment".equals(((Object) (intent.getAction()))))
	//*  14   25:ldc1            #72  <String "FacebookDialogFragment">
	//*  15   27:aload           4
	//*  16   29:invokevirtual   #78  <Method String Intent.getAction()>
	//*  17   32:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*  18   35:ifeq            61
			{
				obj = ((Object) (new FacebookDialogFragment()));
	//   19   38:new             #86  <Class FacebookDialogFragment>
	//   20   41:dup             
	//   21   42:invokespecial   #87  <Method void FacebookDialogFragment()>
	//   22   45:astore_1        
				((FacebookDialogFragment) (obj)).setRetainInstance(true);
	//   23   46:aload_1         
	//   24   47:iconst_1        
	//   25   48:invokevirtual   #91  <Method void FacebookDialogFragment.setRetainInstance(boolean)>
				((FacebookDialogFragment) (obj)).show(fragmentmanager, FRAGMENT_TAG);
	//   26   51:aload_1         
	//   27   52:aload_3         
	//   28   53:getstatic       #64  <Field String FRAGMENT_TAG>
	//   29   56:invokevirtual   #95  <Method void FacebookDialogFragment.show(FragmentManager, String)>
				return ((Fragment) (obj));
	//   30   59:aload_1         
	//   31   60:areturn         
			}
			if("DeviceShareDialogFragment".equals(((Object) (intent.getAction()))))
	//*  32   61:ldc1            #97  <String "DeviceShareDialogFragment">
	//*  33   63:aload           4
	//*  34   65:invokevirtual   #78  <Method String Intent.getAction()>
	//*  35   68:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*  36   71:ifeq            111
			{
				obj = ((Object) (new DeviceShareDialogFragment()));
	//   37   74:new             #99  <Class DeviceShareDialogFragment>
	//   38   77:dup             
	//   39   78:invokespecial   #100 <Method void DeviceShareDialogFragment()>
	//   40   81:astore_1        
				((DeviceShareDialogFragment) (obj)).setRetainInstance(true);
	//   41   82:aload_1         
	//   42   83:iconst_1        
	//   43   84:invokevirtual   #101 <Method void DeviceShareDialogFragment.setRetainInstance(boolean)>
				((DeviceShareDialogFragment) (obj)).setShareContent((ShareContent)intent.getParcelableExtra("content"));
	//   44   87:aload_1         
	//   45   88:aload           4
	//   46   90:ldc1            #103 <String "content">
	//   47   92:invokevirtual   #107 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   48   95:checkcast       #109 <Class ShareContent>
	//   49   98:invokevirtual   #113 <Method void DeviceShareDialogFragment.setShareContent(ShareContent)>
				((DeviceShareDialogFragment) (obj)).show(fragmentmanager, FRAGMENT_TAG);
	//   50  101:aload_1         
	//   51  102:aload_3         
	//   52  103:getstatic       #64  <Field String FRAGMENT_TAG>
	//   53  106:invokevirtual   #114 <Method void DeviceShareDialogFragment.show(FragmentManager, String)>
				return ((Fragment) (obj));
	//   54  109:aload_1         
	//   55  110:areturn         
			}
			obj = ((Object) (new LoginFragment()));
	//   56  111:new             #116 <Class LoginFragment>
	//   57  114:dup             
	//   58  115:invokespecial   #117 <Method void LoginFragment()>
	//   59  118:astore_1        
			((Fragment) (obj)).setRetainInstance(true);
	//   60  119:aload_1         
	//   61  120:iconst_1        
	//   62  121:invokevirtual   #120 <Method void Fragment.setRetainInstance(boolean)>
			fragmentmanager.beginTransaction().add(com.facebook.common.R.id.com_facebook_fragment_container, ((Fragment) (obj)), FRAGMENT_TAG).commit();
	//   63  124:aload_3         
	//   64  125:invokevirtual   #124 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   65  128:getstatic       #130 <Field int com.facebook.common.R$id.com_facebook_fragment_container>
	//   66  131:aload_1         
	//   67  132:getstatic       #64  <Field String FRAGMENT_TAG>
	//   68  135:invokevirtual   #136 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
	//   69  138:invokevirtual   #140 <Method int FragmentTransaction.commit()>
	//   70  141:pop             
		}
		return ((Fragment) (obj));
	//   71  142:aload_1         
	//   72  143:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #144 <Method void FragmentActivity.onConfigurationChanged(Configuration)>
		Fragment fragment = singleFragment;
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field Fragment singleFragment>
	//    5    9:astore_2        
		if(fragment != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			fragment.onConfigurationChanged(configuration);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #145 <Method void Fragment.onConfigurationChanged(Configuration)>
	//   11   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("FacebookActivity");
	//    0    0:ldc1            #151 <String "FacebookActivity">
	//    1    2:invokestatic    #157 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "FacebookActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #159 <Field Trace _nr_trace>
	//    4    9:ldc1            #161 <String "FacebookActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #165 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "FacebookActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #161 <String "FacebookActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #165 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #167 <Method void FragmentActivity.onCreate(Bundle)>
		bundle = ((Bundle) (getIntent()));
	//   15   30:aload_0         
	//   16   31:invokevirtual   #32  <Method Intent getIntent()>
	//   17   34:astore_1        
		if(!FacebookSdk.isInitialized())
	//*  18   35:invokestatic    #173 <Method boolean FacebookSdk.isInitialized()>
	//*  19   38:ifne            57
		{
			Log.d(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
	//   20   41:getstatic       #175 <Field String TAG>
	//   21   44:ldc1            #177 <String "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.">
	//   22   46:invokestatic    #183 <Method int Log.d(String, String)>
	//   23   49:pop             
			FacebookSdk.sdkInitialize(getApplicationContext());
	//   24   50:aload_0         
	//   25   51:invokevirtual   #187 <Method android.content.Context getApplicationContext()>
	//   26   54:invokestatic    #191 <Method void FacebookSdk.sdkInitialize(android.content.Context)>
		}
		setContentView(com.facebook.common.R.layout.com_facebook_activity_layout);
	//   27   57:aload_0         
	//   28   58:getstatic       #196 <Field int com.facebook.common.R$layout.com_facebook_activity_layout>
	//   29   61:invokevirtual   #200 <Method void setContentView(int)>
		if(PASS_THROUGH_CANCEL_ACTION.equals(((Object) (((Intent) (bundle)).getAction()))))
	//*  30   64:getstatic       #202 <Field String PASS_THROUGH_CANCEL_ACTION>
	//*  31   67:aload_1         
	//*  32   68:invokevirtual   #78  <Method String Intent.getAction()>
	//*  33   71:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*  34   74:ifeq            85
		{
			handlePassThroughError();
	//   35   77:aload_0         
	//   36   78:invokespecial   #204 <Method void handlePassThroughError()>
			TraceMachine.exitMethod();
	//   37   81:invokestatic    #207 <Method void TraceMachine.exitMethod()>
			return;
	//   38   84:return          
		} else
		{
			singleFragment = getFragment();
	//   39   85:aload_0         
	//   40   86:aload_0         
	//   41   87:invokevirtual   #209 <Method Fragment getFragment()>
	//   42   90:putfield        #57  <Field Fragment singleFragment>
			TraceMachine.exitMethod();
	//   43   93:invokestatic    #207 <Method void TraceMachine.exitMethod()>
			return;
	//   44   96:return          
		}
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   45   97:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  46   98:goto            18
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #212 <Method void FragmentActivity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #218 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #221 <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #224 <Method void FragmentActivity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #218 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #227 <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	private static String FRAGMENT_TAG = "SingleFragment";
	public static String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
	private static final String TAG = "com.facebook.FacebookActivity";
	public Trace _nr_trace;
	private Fragment singleFragment;

	static 
	{
	//    0    0:return          
	}
}
