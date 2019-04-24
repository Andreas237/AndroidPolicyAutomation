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
	//    1    1:invokespecial   #31  <Method void Fragment()>
	//    2    4:return          
	}

	private void initializeCallingPackage(Activity activity)
	{
		activity = ((Activity) (activity.getCallingActivity()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #46  <Method ComponentName Activity.getCallingActivity()>
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
	//    8   12:invokevirtual   #52  <Method String ComponentName.getPackageName()>
	//    9   15:putfield        #54  <Field String callingPackage>
			return;
	//   10   18:return          
		}
	}

	private void onLoginClientCompleted(LoginClient.Result result)
	{
		request = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #56  <Field LoginClient$Request request>
		byte byte0;
		if(result.code == LoginClient.Result.Code.CANCEL)
	//*   3    5:aload_1         
	//*   4    6:getfield        #62  <Field LoginClient$Result$Code LoginClient$Result.code>
	//*   5    9:getstatic       #67  <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
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
	//   12   22:new             #69  <Class Bundle>
	//   13   25:dup             
	//   14   26:invokespecial   #70  <Method void Bundle()>
	//   15   29:astore_3        
		bundle.putParcelable("com.facebook.LoginFragment:Result", ((android.os.Parcelable) (result)));
	//   16   30:aload_3         
	//   17   31:ldc1            #18  <String "com.facebook.LoginFragment:Result">
	//   18   33:aload_1         
	//   19   34:invokevirtual   #74  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		result = ((LoginClient.Result) (new Intent()));
	//   20   37:new             #76  <Class Intent>
	//   21   40:dup             
	//   22   41:invokespecial   #77  <Method void Intent()>
	//   23   44:astore_1        
		((Intent) (result)).putExtras(bundle);
	//   24   45:aload_1         
	//   25   46:aload_3         
	//   26   47:invokevirtual   #81  <Method Intent Intent.putExtras(Bundle)>
	//   27   50:pop             
		if(isAdded())
	//*  28   51:aload_0         
	//*  29   52:invokevirtual   #85  <Method boolean isAdded()>
	//*  30   55:ifeq            74
		{
			getActivity().setResult(((int) (byte0)), ((Intent) (result)));
	//   31   58:aload_0         
	//   32   59:invokevirtual   #89  <Method FragmentActivity getActivity()>
	//   33   62:iload_2         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #95  <Method void FragmentActivity.setResult(int, Intent)>
			getActivity().finish();
	//   36   67:aload_0         
	//   37   68:invokevirtual   #89  <Method FragmentActivity getActivity()>
	//   38   71:invokevirtual   #98  <Method void FragmentActivity.finish()>
		}
	//   39   74:return          
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #102 <Method void Fragment.onActivityResult(int, int, Intent)>
		loginClient.onActivityResult(i, j, intent);
	//    5    7:aload_0         
	//    6    8:getfield        #104 <Field LoginClient loginClient>
	//    7   11:iload_1         
	//    8   12:iload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #109 <Method boolean LoginClient.onActivityResult(int, int, Intent)>
	//   11   17:pop             
	//   12   18:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void Fragment.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          33
		{
			loginClient = (LoginClient)bundle.getParcelable("loginClient");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #21  <String "loginClient">
	//    8   13:invokevirtual   #117 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    9   16:checkcast       #106 <Class LoginClient>
	//   10   19:putfield        #104 <Field LoginClient loginClient>
			loginClient.setFragment(((Fragment) (this)));
	//   11   22:aload_0         
	//   12   23:getfield        #104 <Field LoginClient loginClient>
	//   13   26:aload_0         
	//   14   27:invokevirtual   #121 <Method void LoginClient.setFragment(Fragment)>
		} else
	//*  15   30:goto            45
		{
			loginClient = new LoginClient(((Fragment) (this)));
	//   16   33:aload_0         
	//   17   34:new             #106 <Class LoginClient>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:invokespecial   #123 <Method void LoginClient(Fragment)>
	//   21   42:putfield        #104 <Field LoginClient loginClient>
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
	//   22   45:aload_0         
	//   23   46:getfield        #104 <Field LoginClient loginClient>
	//   24   49:new             #6   <Class LoginFragment$1>
	//   25   52:dup             
	//   26   53:aload_0         
	//   27   54:invokespecial   #126 <Method void LoginFragment$1(LoginFragment)>
	//   28   57:invokevirtual   #130 <Method void LoginClient.setOnCompletedListener(LoginClient$OnCompletedListener)>
		bundle = ((Bundle) (getActivity()));
	//   29   60:aload_0         
	//   30   61:invokevirtual   #89  <Method FragmentActivity getActivity()>
	//   31   64:astore_1        
		if(bundle == null)
	//*  32   65:aload_1         
	//*  33   66:ifnonnull       70
			return;
	//   34   69:return          
		initializeCallingPackage(((Activity) (bundle)));
	//   35   70:aload_0         
	//   36   71:aload_1         
	//   37   72:invokespecial   #132 <Method void initializeCallingPackage(Activity)>
		if(((Activity) (bundle)).getIntent() != null)
	//*  38   75:aload_1         
	//*  39   76:invokevirtual   #136 <Method Intent Activity.getIntent()>
	//*  40   79:ifnull          98
			request = (LoginClient.Request)((Activity) (bundle)).getIntent().getParcelableExtra("request");
	//   41   82:aload_0         
	//   42   83:aload_1         
	//   43   84:invokevirtual   #136 <Method Intent Activity.getIntent()>
	//   44   87:ldc1            #12  <String "request">
	//   45   89:invokevirtual   #139 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   46   92:checkcast       #141 <Class LoginClient$Request>
	//   47   95:putfield        #56  <Field LoginClient$Request request>
	//   48   98:return          
	}

	public View onCreateView(final LayoutInflater view, ViewGroup viewgroup, Bundle bundle)
	{
		view = ((LayoutInflater) (view.inflate(com.facebook.R.layout.com_facebook_login_fragment, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:getstatic       #150 <Field int com.facebook.R$layout.com_facebook_login_fragment>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #156 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    9:astore_1        
		loginClient.setBackgroundProcessingListener(new LoginClient.BackgroundProcessingListener() {

			public void onBackgroundProcessingStarted()
			{
				view.findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(0);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field View val$view>
			//    2    4:getstatic       #32  <Field int com.facebook.R$id.com_facebook_login_activity_progress_bar>
			//    3    7:invokevirtual   #38  <Method View View.findViewById(int)>
			//    4   10:iconst_0        
			//    5   11:invokevirtual   #42  <Method void View.setVisibility(int)>
			//    6   14:return          
			}

			public void onBackgroundProcessingStopped()
			{
				view.findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field View val$view>
			//    2    4:getstatic       #32  <Field int com.facebook.R$id.com_facebook_login_activity_progress_bar>
			//    3    7:invokevirtual   #38  <Method View View.findViewById(int)>
			//    4   10:bipush          8
			//    5   12:invokevirtual   #42  <Method void View.setVisibility(int)>
			//    6   15:return          
			}

			final LoginFragment this$0;
			final View val$view;

			
			{
				this$0 = LoginFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LoginFragment this$0>
				view = view1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View val$view>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    6   10:aload_0         
	//    7   11:getfield        #104 <Field LoginClient loginClient>
	//    8   14:new             #8   <Class LoginFragment$2>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #159 <Method void LoginFragment$2(LoginFragment, View)>
	//   13   23:invokevirtual   #163 <Method void LoginClient.setBackgroundProcessingListener(LoginClient$BackgroundProcessingListener)>
		return ((View) (view));
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public void onDestroy()
	{
		loginClient.cancelCurrentHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field LoginClient loginClient>
	//    2    4:invokevirtual   #168 <Method void LoginClient.cancelCurrentHandler()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #170 <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method void Fragment.onPause()>
		getActivity().findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #89  <Method FragmentActivity getActivity()>
	//    4    8:getstatic       #178 <Field int com.facebook.R$id.com_facebook_login_activity_progress_bar>
	//    5   11:invokevirtual   #182 <Method View FragmentActivity.findViewById(int)>
	//    6   14:bipush          8
	//    7   16:invokevirtual   #188 <Method void View.setVisibility(int)>
	//    8   19:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method void Fragment.onResume()>
		if(callingPackage == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #54  <Field String callingPackage>
	//*   4    8:ifnonnull       27
		{
			Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
	//    5   11:ldc1            #24  <String "LoginFragment">
	//    6   13:ldc1            #15  <String "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.">
	//    7   15:invokestatic    #197 <Method int Log.e(String, String)>
	//    8   18:pop             
			getActivity().finish();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #89  <Method FragmentActivity getActivity()>
	//   11   23:invokevirtual   #98  <Method void FragmentActivity.finish()>
			return;
	//   12   26:return          
		} else
		{
			loginClient.startOrContinueAuth(request);
	//   13   27:aload_0         
	//   14   28:getfield        #104 <Field LoginClient loginClient>
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field LoginClient$Request request>
	//   17   35:invokevirtual   #201 <Method void LoginClient.startOrContinueAuth(LoginClient$Request)>
			return;
	//   18   38:return          
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #204 <Method void Fragment.onSaveInstanceState(Bundle)>
		bundle.putParcelable("loginClient", ((android.os.Parcelable) (loginClient)));
	//    3    5:aload_1         
	//    4    6:ldc1            #21  <String "loginClient">
	//    5    8:aload_0         
	//    6    9:getfield        #104 <Field LoginClient loginClient>
	//    7   12:invokevirtual   #74  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
	//    8   15:return          
	}

	static final String EXTRA_REQUEST = "request";
	private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
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
	//    2    2:invokespecial   #38  <Method void onLoginClientCompleted(LoginClient$Result)>
		return;
	//    3    5:return          
	}

*/
}
