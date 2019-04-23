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

// Referenced classes of package com.facebook.login:
//			LoginClient

public class LoginFragment extends Fragment
{

	public LoginFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Fragment()>
	//    2    4:return          
	}

	private void initializeCallingPackage(Activity activity)
	{
		activity = ((Activity) (activity.getCallingActivity()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method ComponentName Activity.getCallingActivity()>
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
	//    8   12:invokevirtual   #55  <Method String ComponentName.getPackageName()>
	//    9   15:putfield        #57  <Field String callingPackage>
			return;
	//   10   18:return          
		}
	}

	private void onLoginClientCompleted(LoginClient.Result result)
	{
		request = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #59  <Field LoginClient$Request request>
		byte byte0;
		if(result.code == LoginClient.Result.Code.CANCEL)
	//*   3    5:aload_1         
	//*   4    6:getfield        #65  <Field LoginClient$Result$Code LoginClient$Result.code>
	//*   5    9:getstatic       #70  <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
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
	//   12   22:new             #72  <Class Bundle>
	//   13   25:dup             
	//   14   26:invokespecial   #73  <Method void Bundle()>
	//   15   29:astore_3        
		bundle.putParcelable("com.facebook.LoginFragment:Result", ((android.os.Parcelable) (result)));
	//   16   30:aload_3         
	//   17   31:ldc1            #21  <String "com.facebook.LoginFragment:Result">
	//   18   33:aload_1         
	//   19   34:invokevirtual   #77  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		result = ((LoginClient.Result) (new Intent()));
	//   20   37:new             #79  <Class Intent>
	//   21   40:dup             
	//   22   41:invokespecial   #80  <Method void Intent()>
	//   23   44:astore_1        
		((Intent) (result)).putExtras(bundle);
	//   24   45:aload_1         
	//   25   46:aload_3         
	//   26   47:invokevirtual   #84  <Method Intent Intent.putExtras(Bundle)>
	//   27   50:pop             
		if(isAdded())
	//*  28   51:aload_0         
	//*  29   52:invokevirtual   #88  <Method boolean isAdded()>
	//*  30   55:ifeq            74
		{
			getActivity().setResult(((int) (byte0)), ((Intent) (result)));
	//   31   58:aload_0         
	//   32   59:invokevirtual   #92  <Method FragmentActivity getActivity()>
	//   33   62:iload_2         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #98  <Method void FragmentActivity.setResult(int, Intent)>
			getActivity().finish();
	//   36   67:aload_0         
	//   37   68:invokevirtual   #92  <Method FragmentActivity getActivity()>
	//   38   71:invokevirtual   #101 <Method void FragmentActivity.finish()>
		}
	//   39   74:return          
	}

	protected LoginClient createLoginClient()
	{
		return new LoginClient(((Fragment) (this)));
	//    0    0:new             #105 <Class LoginClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #108 <Method void LoginClient(Fragment)>
	//    4    8:areturn         
	}

	protected int getLayoutResId()
	{
		return com.facebook.common.R.layout.com_facebook_login_fragment;
	//    0    0:getstatic       #117 <Field int com.facebook.common.R$layout.com_facebook_login_fragment>
	//    1    3:ireturn         
	}

	LoginClient getLoginClient()
	{
		return loginClient;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field LoginClient loginClient>
	//    2    4:areturn         
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #125 <Method void Fragment.onActivityResult(int, int, Intent)>
		loginClient.onActivityResult(i, j, intent);
	//    5    7:aload_0         
	//    6    8:getfield        #121 <Field LoginClient loginClient>
	//    7   11:iload_1         
	//    8   12:iload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #128 <Method boolean LoginClient.onActivityResult(int, int, Intent)>
	//   11   17:pop             
	//   12   18:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #132 <Method void Fragment.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          33
		{
			loginClient = (LoginClient)bundle.getParcelable("loginClient");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #24  <String "loginClient">
	//    8   13:invokevirtual   #136 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    9   16:checkcast       #105 <Class LoginClient>
	//   10   19:putfield        #121 <Field LoginClient loginClient>
			loginClient.setFragment(((Fragment) (this)));
	//   11   22:aload_0         
	//   12   23:getfield        #121 <Field LoginClient loginClient>
	//   13   26:aload_0         
	//   14   27:invokevirtual   #139 <Method void LoginClient.setFragment(Fragment)>
		} else
	//*  15   30:goto            41
		{
			loginClient = createLoginClient();
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:invokevirtual   #141 <Method LoginClient createLoginClient()>
	//   19   38:putfield        #121 <Field LoginClient loginClient>
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
	//   20   41:aload_0         
	//   21   42:getfield        #121 <Field LoginClient loginClient>
	//   22   45:new             #6   <Class LoginFragment$1>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:invokespecial   #144 <Method void LoginFragment$1(LoginFragment)>
	//   26   53:invokevirtual   #148 <Method void LoginClient.setOnCompletedListener(LoginClient$OnCompletedListener)>
		bundle = ((Bundle) (getActivity()));
	//   27   56:aload_0         
	//   28   57:invokevirtual   #92  <Method FragmentActivity getActivity()>
	//   29   60:astore_1        
		if(bundle == null)
	//*  30   61:aload_1         
	//*  31   62:ifnonnull       66
			return;
	//   32   65:return          
		initializeCallingPackage(((Activity) (bundle)));
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:invokespecial   #150 <Method void initializeCallingPackage(Activity)>
		bundle = ((Bundle) (((Activity) (bundle)).getIntent()));
	//   36   71:aload_1         
	//   37   72:invokevirtual   #154 <Method Intent Activity.getIntent()>
	//   38   75:astore_1        
		if(bundle != null)
	//*  39   76:aload_1         
	//*  40   77:ifnull          104
		{
			bundle = ((Intent) (bundle)).getBundleExtra("com.facebook.LoginFragment:Request");
	//   41   80:aload_1         
	//   42   81:ldc1            #18  <String "com.facebook.LoginFragment:Request">
	//   43   83:invokevirtual   #158 <Method Bundle Intent.getBundleExtra(String)>
	//   44   86:astore_1        
			if(bundle != null)
	//*  45   87:aload_1         
	//*  46   88:ifnull          104
				request = (LoginClient.Request)bundle.getParcelable("request");
	//   47   91:aload_0         
	//   48   92:aload_1         
	//   49   93:ldc1            #12  <String "request">
	//   50   95:invokevirtual   #136 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   51   98:checkcast       #160 <Class LoginClient$Request>
	//   52  101:putfield        #59  <Field LoginClient$Request request>
		}
	//   53  104:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, final ViewGroup progressBar, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(getLayoutResId(), progressBar, false)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #165 <Method int getLayoutResId()>
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #171 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    6   10:astore_1        
		progressBar = ((ViewGroup) (((View) (layoutinflater)).findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar)));
	//    7   11:aload_1         
	//    8   12:getstatic       #176 <Field int com.facebook.common.R$id.com_facebook_login_fragment_progress_bar>
	//    9   15:invokevirtual   #182 <Method View View.findViewById(int)>
	//   10   18:astore_2        
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
	//   11   19:aload_0         
	//   12   20:getfield        #121 <Field LoginClient loginClient>
	//   13   23:new             #8   <Class LoginFragment$2>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokespecial   #185 <Method void LoginFragment$2(LoginFragment, View)>
	//   18   32:invokevirtual   #189 <Method void LoginClient.setBackgroundProcessingListener(LoginClient$BackgroundProcessingListener)>
		return ((View) (layoutinflater));
	//   19   35:aload_1         
	//   20   36:areturn         
	}

	public void onDestroy()
	{
		loginClient.cancelCurrentHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field LoginClient loginClient>
	//    2    4:invokevirtual   #194 <Method void LoginClient.cancelCurrentHandler()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #196 <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method void Fragment.onPause()>
		View view;
		if(getView() == null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #203 <Method View getView()>
	//*   4    8:ifnonnull       16
			view = null;
	//    5   11:aconst_null     
	//    6   12:astore_1        
		else
	//*   7   13:goto            27
			view = getView().findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
	//    8   16:aload_0         
	//    9   17:invokevirtual   #203 <Method View getView()>
	//   10   20:getstatic       #176 <Field int com.facebook.common.R$id.com_facebook_login_fragment_progress_bar>
	//   11   23:invokevirtual   #182 <Method View View.findViewById(int)>
	//   12   26:astore_1        
		if(view != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          37
			view.setVisibility(8);
	//   15   31:aload_1         
	//   16   32:bipush          8
	//   17   34:invokevirtual   #207 <Method void View.setVisibility(int)>
	//   18   37:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #210 <Method void Fragment.onResume()>
		if(callingPackage == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field String callingPackage>
	//*   4    8:ifnonnull       27
		{
			Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
	//    5   11:ldc1            #27  <String "LoginFragment">
	//    6   13:ldc1            #15  <String "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.">
	//    7   15:invokestatic    #216 <Method int Log.e(String, String)>
	//    8   18:pop             
			getActivity().finish();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #92  <Method FragmentActivity getActivity()>
	//   11   23:invokevirtual   #101 <Method void FragmentActivity.finish()>
			return;
	//   12   26:return          
		} else
		{
			loginClient.startOrContinueAuth(request);
	//   13   27:aload_0         
	//   14   28:getfield        #121 <Field LoginClient loginClient>
	//   15   31:aload_0         
	//   16   32:getfield        #59  <Field LoginClient$Request request>
	//   17   35:invokevirtual   #220 <Method void LoginClient.startOrContinueAuth(LoginClient$Request)>
			return;
	//   18   38:return          
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #223 <Method void Fragment.onSaveInstanceState(Bundle)>
		bundle.putParcelable("loginClient", ((android.os.Parcelable) (loginClient)));
	//    3    5:aload_1         
	//    4    6:ldc1            #24  <String "loginClient">
	//    5    8:aload_0         
	//    6    9:getfield        #121 <Field LoginClient loginClient>
	//    7   12:invokevirtual   #77  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
	//    8   15:return          
	}

	static final String EXTRA_REQUEST = "request";
	private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
	static final String REQUEST_KEY = "com.facebook.LoginFragment:Request";
	static final String RESULT_KEY = "com.facebook.LoginFragment:Result";
	private static final String SAVED_LOGIN_CLIENT = "loginClient";
	private static final String TAG = "LoginFragment";
	private String callingPackage;
	private LoginClient loginClient;
	private LoginClient.Request request;


/*
	static void access$000(LoginFragment loginfragment, LoginClient.Result result)
	{
		loginfragment.onLoginClientCompleted(result);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void onLoginClientCompleted(LoginClient$Result)>
		return;
	//    3    5:return          
	}

*/
}
