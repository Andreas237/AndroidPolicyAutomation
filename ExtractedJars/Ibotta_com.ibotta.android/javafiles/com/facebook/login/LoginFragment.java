// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.*;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.facebook.login:
//			LoginClient

public class LoginFragment extends Fragment
	implements TraceFieldInterface
{

	public LoginFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Fragment()>
	//    2    4:return          
	}

	private void initializeCallingPackage(Activity activity)
	{
		activity = ((Activity) (activity.getCallingActivity()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method ComponentName Activity.getCallingActivity()>
	//    2    4:astore_1        
		if(activity == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			callingPackage = ((ComponentName) (activity)).getPackageName();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #44  <Method String ComponentName.getPackageName()>
	//    9   15:putfield        #46  <Field String callingPackage>
			return;
	//   10   18:return          
		}
	}

	private void onLoginClientCompleted(LoginClient.Result result)
	{
		request = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #48  <Field LoginClient$Request request>
		byte byte0;
		if(result.code == LoginClient.Result.Code.CANCEL)
	//*   3    5:aload_1         
	//*   4    6:getfield        #54  <Field LoginClient$Result$Code LoginClient$Result.code>
	//*   5    9:getstatic       #59  <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
	//*   6   12:if_acmpne       20
			byte0 = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		else
	//*   9   17:goto            22
			byte0 = -1;
	//   10   20:iconst_m1       
	//   11   21:istore_2        
		Bundle bundle = new Bundle();
	//   12   22:new             #61  <Class Bundle>
	//   13   25:dup             
	//   14   26:invokespecial   #62  <Method void Bundle()>
	//   15   29:astore_3        
		bundle.putParcelable("com.facebook.LoginFragment:Result", ((android.os.Parcelable) (result)));
	//   16   30:aload_3         
	//   17   31:ldc1            #64  <String "com.facebook.LoginFragment:Result">
	//   18   33:aload_1         
	//   19   34:invokevirtual   #68  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		result = ((LoginClient.Result) (new Intent()));
	//   20   37:new             #70  <Class Intent>
	//   21   40:dup             
	//   22   41:invokespecial   #71  <Method void Intent()>
	//   23   44:astore_1        
		((Intent) (result)).putExtras(bundle);
	//   24   45:aload_1         
	//   25   46:aload_3         
	//   26   47:invokevirtual   #75  <Method Intent Intent.putExtras(Bundle)>
	//   27   50:pop             
		if(isAdded())
	//*  28   51:aload_0         
	//*  29   52:invokevirtual   #79  <Method boolean isAdded()>
	//*  30   55:ifeq            74
		{
			getActivity().setResult(((int) (byte0)), ((Intent) (result)));
	//   31   58:aload_0         
	//   32   59:invokevirtual   #83  <Method FragmentActivity getActivity()>
	//   33   62:iload_2         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #89  <Method void FragmentActivity.setResult(int, Intent)>
			getActivity().finish();
	//   36   67:aload_0         
	//   37   68:invokevirtual   #83  <Method FragmentActivity getActivity()>
	//   38   71:invokevirtual   #92  <Method void FragmentActivity.finish()>
		}
	//   39   74:return          
	}

	protected LoginClient createLoginClient()
	{
		return new LoginClient(((Fragment) (this)));
	//    0    0:new             #96  <Class LoginClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #99  <Method void LoginClient(Fragment)>
	//    4    8:areturn         
	}

	LoginClient getLoginClient()
	{
		return loginClient;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field LoginClient loginClient>
	//    2    4:areturn         
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #106 <Method void Fragment.onActivityResult(int, int, Intent)>
		loginClient.onActivityResult(i, j, intent);
	//    5    7:aload_0         
	//    6    8:getfield        #102 <Field LoginClient loginClient>
	//    7   11:iload_1         
	//    8   12:iload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #109 <Method boolean LoginClient.onActivityResult(int, int, Intent)>
	//   11   17:pop             
	//   12   18:return          
	}

	public void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("LoginFragment");
	//    0    0:ldc1            #115 <String "LoginFragment">
	//    1    2:invokestatic    #121 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "LoginFragment#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #123 <Field Trace _nr_trace>
	//    4    9:ldc1            #125 <String "LoginFragment#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #129 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "LoginFragment#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #125 <String "LoginFragment#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #129 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #131 <Method void Fragment.onCreate(Bundle)>
		if(bundle != null)
	//*  15   30:aload_1         
	//*  16   31:ifnull          58
		{
			loginClient = (LoginClient)bundle.getParcelable("loginClient");
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc1            #132 <String "loginClient">
	//   20   38:invokevirtual   #136 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   21   41:checkcast       #96  <Class LoginClient>
	//   22   44:putfield        #102 <Field LoginClient loginClient>
			loginClient.setFragment(((Fragment) (this)));
	//   23   47:aload_0         
	//   24   48:getfield        #102 <Field LoginClient loginClient>
	//   25   51:aload_0         
	//   26   52:invokevirtual   #139 <Method void LoginClient.setFragment(Fragment)>
		} else
	//*  27   55:goto            66
		{
			loginClient = createLoginClient();
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:invokevirtual   #141 <Method LoginClient createLoginClient()>
	//   31   63:putfield        #102 <Field LoginClient loginClient>
		}
		loginClient.setOnCompletedListener(new LoginClient.OnCompletedListener() {

			public void onCompleted(LoginClient.Result result)
			{
				onLoginClientCompleted(result);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LoginFragment this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void LoginFragment.access$000(LoginFragment, LoginClient$Result)>
			//    4    8:return          
			}

			final LoginFragment this$0;

			
			{
				this$0 = LoginFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LoginFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   32   66:aload_0         
	//   33   67:getfield        #102 <Field LoginClient loginClient>
	//   34   70:new             #8   <Class LoginFragment$1>
	//   35   73:dup             
	//   36   74:aload_0         
	//   37   75:invokespecial   #144 <Method void LoginFragment$1(LoginFragment)>
	//   38   78:invokevirtual   #148 <Method void LoginClient.setOnCompletedListener(LoginClient$OnCompletedListener)>
		bundle = ((Bundle) (getActivity()));
	//   39   81:aload_0         
	//   40   82:invokevirtual   #83  <Method FragmentActivity getActivity()>
	//   41   85:astore_1        
		if(bundle == null)
	//*  42   86:aload_1         
	//*  43   87:ifnonnull       94
		{
			TraceMachine.exitMethod();
	//   44   90:invokestatic    #151 <Method void TraceMachine.exitMethod()>
			return;
	//   45   93:return          
		}
		initializeCallingPackage(((Activity) (bundle)));
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:invokespecial   #153 <Method void initializeCallingPackage(Activity)>
		bundle = ((Bundle) (((Activity) (bundle)).getIntent()));
	//   49   99:aload_1         
	//   50  100:invokevirtual   #157 <Method Intent Activity.getIntent()>
	//   51  103:astore_1        
		if(bundle != null)
	//*  52  104:aload_1         
	//*  53  105:ifnull          132
		{
			bundle = ((Intent) (bundle)).getBundleExtra("com.facebook.LoginFragment:Request");
	//   54  108:aload_1         
	//   55  109:ldc1            #159 <String "com.facebook.LoginFragment:Request">
	//   56  111:invokevirtual   #163 <Method Bundle Intent.getBundleExtra(String)>
	//   57  114:astore_1        
			if(bundle != null)
	//*  58  115:aload_1         
	//*  59  116:ifnull          132
				request = (LoginClient.Request)bundle.getParcelable("request");
	//   60  119:aload_0         
	//   61  120:aload_1         
	//   62  121:ldc1            #164 <String "request">
	//   63  123:invokevirtual   #136 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   64  126:checkcast       #166 <Class LoginClient$Request>
	//   65  129:putfield        #48  <Field LoginClient$Request request>
		}
		TraceMachine.exitMethod();
	//   66  132:invokestatic    #151 <Method void TraceMachine.exitMethod()>
		return;
	//   67  135:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   68  136:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  69  137:goto            18
	}

	public View onCreateView(LayoutInflater layoutinflater, final ViewGroup progressBar, Bundle bundle)
	{
		TraceMachine.enterMethod(_nr_trace, "LoginFragment#onCreateView", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Trace _nr_trace>
	//    2    4:ldc1            #171 <String "LoginFragment#onCreateView">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #129 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "LoginFragment#onCreateView", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #171 <String "LoginFragment#onCreateView">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #129 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(com.facebook.common.R.layout.com_facebook_login_fragment, progressBar, false)));
	//   10   20:aload_1         
	//   11   21:getstatic       #177 <Field int com.facebook.common.R$layout.com_facebook_login_fragment>
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #183 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   15   29:astore_1        
		progressBar = ((ViewGroup) (((View) (layoutinflater)).findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar)));
	//   16   30:aload_1         
	//   17   31:getstatic       #188 <Field int com.facebook.common.R$id.com_facebook_login_fragment_progress_bar>
	//   18   34:invokevirtual   #194 <Method View View.findViewById(int)>
	//   19   37:astore_2        
		loginClient.setBackgroundProcessingListener(new LoginClient.BackgroundProcessingListener() {

			public void onBackgroundProcessingStarted()
			{
				progressBar.setVisibility(0);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field View val$progressBar>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #32  <Method void View.setVisibility(int)>
			//    4    8:return          
			}

			public void onBackgroundProcessingStopped()
			{
				progressBar.setVisibility(8);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field View val$progressBar>
			//    2    4:bipush          8
			//    3    6:invokevirtual   #32  <Method void View.setVisibility(int)>
			//    4    9:return          
			}

			final LoginFragment this$0;
			final View val$progressBar;

			
			{
				this$0 = LoginFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LoginFragment this$0>
				progressBar = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View val$progressBar>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   20   38:aload_0         
	//   21   39:getfield        #102 <Field LoginClient loginClient>
	//   22   42:new             #10  <Class LoginFragment$2>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokespecial   #197 <Method void LoginFragment$2(LoginFragment, View)>
	//   27   51:invokevirtual   #201 <Method void LoginClient.setBackgroundProcessingListener(LoginClient$BackgroundProcessingListener)>
		TraceMachine.exitMethod();
	//   28   54:invokestatic    #151 <Method void TraceMachine.exitMethod()>
		return ((View) (layoutinflater));
	//   29   57:aload_1         
	//   30   58:areturn         
		bundle;
	//   31   59:astore_3        
		if(true) goto _L3; else goto _L2
_L2:
	//*  32   60:goto            13
	}

	public void onDestroy()
	{
		loginClient.cancelCurrentHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field LoginClient loginClient>
	//    2    4:invokevirtual   #206 <Method void LoginClient.cancelCurrentHandler()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #208 <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void Fragment.onPause()>
		View view;
		if(getView() == null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #215 <Method View getView()>
	//*   4    8:ifnonnull       16
			view = null;
	//    5   11:aconst_null     
	//    6   12:astore_1        
		else
	//*   7   13:goto            27
			view = getView().findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
	//    8   16:aload_0         
	//    9   17:invokevirtual   #215 <Method View getView()>
	//   10   20:getstatic       #188 <Field int com.facebook.common.R$id.com_facebook_login_fragment_progress_bar>
	//   11   23:invokevirtual   #194 <Method View View.findViewById(int)>
	//   12   26:astore_1        
		if(view != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          37
			view.setVisibility(8);
	//   15   31:aload_1         
	//   16   32:bipush          8
	//   17   34:invokevirtual   #219 <Method void View.setVisibility(int)>
	//   18   37:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #222 <Method void Fragment.onResume()>
		if(callingPackage == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field String callingPackage>
	//*   4    8:ifnonnull       27
		{
			Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
	//    5   11:ldc1            #115 <String "LoginFragment">
	//    6   13:ldc1            #224 <String "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.">
	//    7   15:invokestatic    #230 <Method int Log.e(String, String)>
	//    8   18:pop             
			getActivity().finish();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #83  <Method FragmentActivity getActivity()>
	//   11   23:invokevirtual   #92  <Method void FragmentActivity.finish()>
			return;
	//   12   26:return          
		} else
		{
			loginClient.startOrContinueAuth(request);
	//   13   27:aload_0         
	//   14   28:getfield        #102 <Field LoginClient loginClient>
	//   15   31:aload_0         
	//   16   32:getfield        #48  <Field LoginClient$Request request>
	//   17   35:invokevirtual   #234 <Method void LoginClient.startOrContinueAuth(LoginClient$Request)>
			return;
	//   18   38:return          
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #237 <Method void Fragment.onSaveInstanceState(Bundle)>
		bundle.putParcelable("loginClient", ((android.os.Parcelable) (loginClient)));
	//    3    5:aload_1         
	//    4    6:ldc1            #132 <String "loginClient">
	//    5    8:aload_0         
	//    6    9:getfield        #102 <Field LoginClient loginClient>
	//    7   12:invokevirtual   #68  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
	//    8   15:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method void Fragment.onStart()>
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    2    4:invokestatic    #246 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #250 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #253 <Method void Fragment.onStop()>
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    2    4:invokestatic    #246 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #256 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
	//    5   11:return          
	}

	public Trace _nr_trace;
	private String callingPackage;
	private LoginClient loginClient;
	private LoginClient.Request request;


/*
	static void access$000(LoginFragment loginfragment, LoginClient.Result result)
	{
		loginfragment.onLoginClientCompleted(result);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void onLoginClientCompleted(LoginClient$Result)>
		return;
	//    3    5:return          
	}

*/
}
