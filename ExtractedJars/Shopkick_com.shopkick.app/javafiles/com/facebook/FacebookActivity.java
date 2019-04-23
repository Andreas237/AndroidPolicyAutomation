// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.*;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginFragment;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

// Referenced classes of package com.facebook:
//			FacebookSdk

public class FacebookActivity extends FragmentActivity
{

	public FacebookActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void FragmentActivity()>
	//    2    4:return          
	}

	private void handlePassThroughError()
	{
		FacebookException facebookexception = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(getIntent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Intent getIntent()>
	//    2    4:invokestatic    #33  <Method Bundle NativeProtocol.getMethodArgumentsFromIntent(Intent)>
	//    3    7:invokestatic    #37  <Method FacebookException NativeProtocol.getExceptionFromErrorData(Bundle)>
	//    4   10:astore_1        
		setResult(0, NativeProtocol.createProtocolResultIntent(getIntent(), ((Bundle) (null)), facebookexception));
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:invokevirtual   #27  <Method Intent getIntent()>
	//    9   17:aconst_null     
	//   10   18:aload_1         
	//   11   19:invokestatic    #41  <Method Intent NativeProtocol.createProtocolResultIntent(Intent, Bundle, FacebookException)>
	//   12   22:invokevirtual   #45  <Method void setResult(int, Intent)>
		finish();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #48  <Method void finish()>
	//   15   29:return          
	}

	public Fragment getCurrentFragment()
	{
		return singleFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Fragment singleFragment>
	//    2    4:areturn         
	}

	protected Fragment getFragment()
	{
		Intent intent = getIntent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Intent getIntent()>
	//    2    4:astore          4
		FragmentManager fragmentmanager = getSupportFragmentManager();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #57  <Method FragmentManager getSupportFragmentManager()>
	//    5   10:astore_3        
		Fragment fragment = fragmentmanager.findFragmentByTag(FRAGMENT_TAG);
	//    6   11:aload_3         
	//    7   12:getstatic       #59  <Field String FRAGMENT_TAG>
	//    8   15:invokevirtual   #65  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    9   18:astore_2        
		Object obj = ((Object) (fragment));
	//   10   19:aload_2         
	//   11   20:astore_1        
		if(fragment == null)
	//*  12   21:aload_2         
	//*  13   22:ifnonnull       142
		{
			if("FacebookDialogFragment".equals(((Object) (intent.getAction()))))
	//*  14   25:ldc1            #67  <String "FacebookDialogFragment">
	//*  15   27:aload           4
	//*  16   29:invokevirtual   #73  <Method String Intent.getAction()>
	//*  17   32:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  18   35:ifeq            61
			{
				obj = ((Object) (new FacebookDialogFragment()));
	//   19   38:new             #81  <Class FacebookDialogFragment>
	//   20   41:dup             
	//   21   42:invokespecial   #82  <Method void FacebookDialogFragment()>
	//   22   45:astore_1        
				((FacebookDialogFragment) (obj)).setRetainInstance(true);
	//   23   46:aload_1         
	//   24   47:iconst_1        
	//   25   48:invokevirtual   #86  <Method void FacebookDialogFragment.setRetainInstance(boolean)>
				((FacebookDialogFragment) (obj)).show(fragmentmanager, FRAGMENT_TAG);
	//   26   51:aload_1         
	//   27   52:aload_3         
	//   28   53:getstatic       #59  <Field String FRAGMENT_TAG>
	//   29   56:invokevirtual   #90  <Method void FacebookDialogFragment.show(FragmentManager, String)>
				return ((Fragment) (obj));
	//   30   59:aload_1         
	//   31   60:areturn         
			}
			if("DeviceShareDialogFragment".equals(((Object) (intent.getAction()))))
	//*  32   61:ldc1            #92  <String "DeviceShareDialogFragment">
	//*  33   63:aload           4
	//*  34   65:invokevirtual   #73  <Method String Intent.getAction()>
	//*  35   68:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  36   71:ifeq            111
			{
				obj = ((Object) (new DeviceShareDialogFragment()));
	//   37   74:new             #94  <Class DeviceShareDialogFragment>
	//   38   77:dup             
	//   39   78:invokespecial   #95  <Method void DeviceShareDialogFragment()>
	//   40   81:astore_1        
				((DeviceShareDialogFragment) (obj)).setRetainInstance(true);
	//   41   82:aload_1         
	//   42   83:iconst_1        
	//   43   84:invokevirtual   #96  <Method void DeviceShareDialogFragment.setRetainInstance(boolean)>
				((DeviceShareDialogFragment) (obj)).setShareContent((ShareContent)intent.getParcelableExtra("content"));
	//   44   87:aload_1         
	//   45   88:aload           4
	//   46   90:ldc1            #98  <String "content">
	//   47   92:invokevirtual   #102 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   48   95:checkcast       #104 <Class ShareContent>
	//   49   98:invokevirtual   #108 <Method void DeviceShareDialogFragment.setShareContent(ShareContent)>
				((DeviceShareDialogFragment) (obj)).show(fragmentmanager, FRAGMENT_TAG);
	//   50  101:aload_1         
	//   51  102:aload_3         
	//   52  103:getstatic       #59  <Field String FRAGMENT_TAG>
	//   53  106:invokevirtual   #109 <Method void DeviceShareDialogFragment.show(FragmentManager, String)>
				return ((Fragment) (obj));
	//   54  109:aload_1         
	//   55  110:areturn         
			}
			obj = ((Object) (new LoginFragment()));
	//   56  111:new             #111 <Class LoginFragment>
	//   57  114:dup             
	//   58  115:invokespecial   #112 <Method void LoginFragment()>
	//   59  118:astore_1        
			((Fragment) (obj)).setRetainInstance(true);
	//   60  119:aload_1         
	//   61  120:iconst_1        
	//   62  121:invokevirtual   #115 <Method void Fragment.setRetainInstance(boolean)>
			fragmentmanager.beginTransaction().add(com.facebook.common.R.id.com_facebook_fragment_container, ((Fragment) (obj)), FRAGMENT_TAG).commit();
	//   63  124:aload_3         
	//   64  125:invokevirtual   #119 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   65  128:getstatic       #125 <Field int com.facebook.common.R$id.com_facebook_fragment_container>
	//   66  131:aload_1         
	//   67  132:getstatic       #59  <Field String FRAGMENT_TAG>
	//   68  135:invokevirtual   #131 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
	//   69  138:invokevirtual   #135 <Method int FragmentTransaction.commit()>
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
	//    2    2:invokespecial   #139 <Method void FragmentActivity.onConfigurationChanged(Configuration)>
		Fragment fragment = singleFragment;
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field Fragment singleFragment>
	//    5    9:astore_2        
		if(fragment != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			fragment.onConfigurationChanged(configuration);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #140 <Method void Fragment.onConfigurationChanged(Configuration)>
	//   11   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #144 <Method void FragmentActivity.onCreate(Bundle)>
		bundle = ((Bundle) (getIntent()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #27  <Method Intent getIntent()>
	//    5    9:astore_1        
		if(!FacebookSdk.isInitialized())
	//*   6   10:invokestatic    #150 <Method boolean FacebookSdk.isInitialized()>
	//*   7   13:ifne            31
		{
			Utility.logd(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
	//    8   16:getstatic       #152 <Field String TAG>
	//    9   19:ldc1            #154 <String "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.">
	//   10   21:invokestatic    #160 <Method void Utility.logd(String, String)>
			FacebookSdk.sdkInitialize(getApplicationContext());
	//   11   24:aload_0         
	//   12   25:invokevirtual   #164 <Method android.content.Context getApplicationContext()>
	//   13   28:invokestatic    #168 <Method void FacebookSdk.sdkInitialize(android.content.Context)>
		}
		setContentView(com.facebook.common.R.layout.com_facebook_activity_layout);
	//   14   31:aload_0         
	//   15   32:getstatic       #173 <Field int com.facebook.common.R$layout.com_facebook_activity_layout>
	//   16   35:invokevirtual   #177 <Method void setContentView(int)>
		if(PASS_THROUGH_CANCEL_ACTION.equals(((Object) (((Intent) (bundle)).getAction()))))
	//*  17   38:getstatic       #179 <Field String PASS_THROUGH_CANCEL_ACTION>
	//*  18   41:aload_1         
	//*  19   42:invokevirtual   #73  <Method String Intent.getAction()>
	//*  20   45:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  21   48:ifeq            56
		{
			handlePassThroughError();
	//   22   51:aload_0         
	//   23   52:invokespecial   #181 <Method void handlePassThroughError()>
			return;
	//   24   55:return          
		} else
		{
			singleFragment = getFragment();
	//   25   56:aload_0         
	//   26   57:aload_0         
	//   27   58:invokevirtual   #183 <Method Fragment getFragment()>
	//   28   61:putfield        #52  <Field Fragment singleFragment>
			return;
	//   29   64:return          
		}
	}

	private static String FRAGMENT_TAG = "SingleFragment";
	public static String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
	private static final String TAG = "com.facebook.FacebookActivity";
	private Fragment singleFragment;

	static 
	{
	//    0    0:return          
	}
}
