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
import com.facebook.login.LoginFragment;

public class FacebookActivity extends FragmentActivity
{

	public FacebookActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void FragmentActivity()>
	//    2    4:return          
	}

	private void handlePassThroughError()
	{
		Intent intent = getIntent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Intent getIntent()>
	//    2    4:astore_1        
		setResult(0, NativeProtocol.createProtocolResultIntent(intent, ((Bundle) (null)), NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(intent))));
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aconst_null     
	//    7    9:aload_1         
	//    8   10:invokestatic    #30  <Method Bundle NativeProtocol.getMethodArgumentsFromIntent(Intent)>
	//    9   13:invokestatic    #34  <Method FacebookException NativeProtocol.getExceptionFromErrorData(Bundle)>
	//   10   16:invokestatic    #38  <Method Intent NativeProtocol.createProtocolResultIntent(Intent, Bundle, FacebookException)>
	//   11   19:invokevirtual   #42  <Method void setResult(int, Intent)>
		finish();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #45  <Method void finish()>
	//   14   26:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void FragmentActivity.onConfigurationChanged(Configuration)>
		if(singleFragment != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #51  <Field Fragment singleFragment>
	//*   5    9:ifnull          20
			singleFragment.onConfigurationChanged(configuration);
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field Fragment singleFragment>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #54  <Method void Fragment.onConfigurationChanged(Configuration)>
	//   10   20:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void FragmentActivity.onCreate(Bundle)>
		setContentView(R.layout.com_facebook_activity_layout);
	//    3    5:aload_0         
	//    4    6:getstatic       #64  <Field int R$layout.com_facebook_activity_layout>
	//    5    9:invokevirtual   #68  <Method void setContentView(int)>
		Intent intent = getIntent();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #24  <Method Intent getIntent()>
	//    8   16:astore_3        
		if(PASS_THROUGH_CANCEL_ACTION.equals(((Object) (intent.getAction()))))
	//*   9   17:getstatic       #70  <Field String PASS_THROUGH_CANCEL_ACTION>
	//*  10   20:aload_3         
	//*  11   21:invokevirtual   #76  <Method String Intent.getAction()>
	//*  12   24:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  13   27:ifeq            35
		{
			handlePassThroughError();
	//   14   30:aload_0         
	//   15   31:invokespecial   #84  <Method void handlePassThroughError()>
			return;
	//   16   34:return          
		}
		FragmentManager fragmentmanager = getSupportFragmentManager();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #88  <Method FragmentManager getSupportFragmentManager()>
	//   19   39:astore_2        
		bundle = ((Bundle) (fragmentmanager.findFragmentByTag(FRAGMENT_TAG)));
	//   20   40:aload_2         
	//   21   41:getstatic       #90  <Field String FRAGMENT_TAG>
	//   22   44:invokevirtual   #96  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   23   47:astore_1        
		if(bundle == null)
	//*  24   48:aload_1         
	//*  25   49:ifnonnull       122
			if("FacebookDialogFragment".equals(((Object) (intent.getAction()))))
	//*  26   52:ldc1            #98  <String "FacebookDialogFragment">
	//*  27   54:aload_3         
	//*  28   55:invokevirtual   #76  <Method String Intent.getAction()>
	//*  29   58:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  30   61:ifeq            88
			{
				bundle = ((Bundle) (new FacebookDialogFragment()));
	//   31   64:new             #100 <Class FacebookDialogFragment>
	//   32   67:dup             
	//   33   68:invokespecial   #101 <Method void FacebookDialogFragment()>
	//   34   71:astore_1        
				((FacebookDialogFragment) (bundle)).setRetainInstance(true);
	//   35   72:aload_1         
	//   36   73:iconst_1        
	//   37   74:invokevirtual   #105 <Method void FacebookDialogFragment.setRetainInstance(boolean)>
				((FacebookDialogFragment) (bundle)).show(fragmentmanager, FRAGMENT_TAG);
	//   38   77:aload_1         
	//   39   78:aload_2         
	//   40   79:getstatic       #90  <Field String FRAGMENT_TAG>
	//   41   82:invokevirtual   #109 <Method void FacebookDialogFragment.show(FragmentManager, String)>
			} else
	//*  42   85:goto            122
			{
				bundle = ((Bundle) (new LoginFragment()));
	//   43   88:new             #111 <Class LoginFragment>
	//   44   91:dup             
	//   45   92:invokespecial   #112 <Method void LoginFragment()>
	//   46   95:astore_1        
				((Fragment) (bundle)).setRetainInstance(true);
	//   47   96:aload_1         
	//   48   97:iconst_1        
	//   49   98:invokevirtual   #113 <Method void Fragment.setRetainInstance(boolean)>
				fragmentmanager.beginTransaction().add(R.id.com_facebook_fragment_container, ((Fragment) (bundle)), FRAGMENT_TAG).commit();
	//   50  101:aload_2         
	//   51  102:invokevirtual   #117 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   52  105:getstatic       #122 <Field int R$id.com_facebook_fragment_container>
	//   53  108:aload_1         
	//   54  109:getstatic       #90  <Field String FRAGMENT_TAG>
	//   55  112:invokevirtual   #128 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
	//   56  115:invokevirtual   #132 <Method int FragmentTransaction.commit()>
	//   57  118:pop             
			}
	//*  58  119:goto            122
		singleFragment = ((Fragment) (bundle));
	//   59  122:aload_0         
	//   60  123:aload_1         
	//   61  124:putfield        #51  <Field Fragment singleFragment>
	//   62  127:return          
	}

	private static String FRAGMENT_TAG = "SingleFragment";
	public static String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
	private Fragment singleFragment;

	static 
	{
	//    0    0:return          
	}
}
