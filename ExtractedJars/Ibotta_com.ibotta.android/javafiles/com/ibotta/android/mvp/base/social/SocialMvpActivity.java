// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.social;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.*;
import com.facebook.share.widget.ShareDialog;
import com.ibotta.android.FacebookFeed;
import com.ibotta.android.fragment.dialog.DialogFragmentHelper;
import com.ibotta.android.fragment.dialog.ErrorDialogFragment;
import com.ibotta.android.mvp.base.MvpPresenter;
import com.ibotta.android.mvp.base.loading.LoadingMvpActivity;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.ApiJobFactory;
import com.ibotta.android.social.facebook.FacebookManager;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.tracking.Tracker;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.base.social:
//			SocialMvpView, SocialMvpPresenter

public abstract class SocialMvpActivity extends LoadingMvpActivity
	implements SocialMvpView, com.ibotta.android.social.facebook.FacebookManager.FacebookAuthListener, com.ibotta.android.social.facebook.FacebookManager.FacebookUiListener
{

	public SocialMvpActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void LoadingMvpActivity()>
	//    2    4:return          
	}

	private Intent buildShareIntent(String s, String s1)
	{
		Intent intent = new Intent("android.intent.action.SEND");
	//    0    0:new             #43  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String "android.intent.action.SEND">
	//    3    6:invokespecial   #48  <Method void Intent(String)>
	//    4    9:astore_3        
		intent.setType(getString(0x7f11062d));
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:ldc1            #49  <Int 0x7f11062d>
	//    8   14:invokevirtual   #53  <Method String getString(int)>
	//    9   17:invokevirtual   #57  <Method Intent Intent.setType(String)>
	//   10   20:pop             
		intent.putExtra("android.intent.extra.SUBJECT", s);
	//   11   21:aload_3         
	//   12   22:ldc1            #59  <String "android.intent.extra.SUBJECT">
	//   13   24:aload_1         
	//   14   25:invokevirtual   #62  <Method Intent Intent.putExtra(String, String)>
	//   15   28:pop             
		intent.putExtra("android.intent.extra.TEXT", s1);
	//   16   29:aload_3         
	//   17   30:ldc1            #64  <String "android.intent.extra.TEXT">
	//   18   32:aload_2         
	//   19   33:invokevirtual   #62  <Method Intent Intent.putExtra(String, String)>
	//   20   36:pop             
		intent.setFlags(0x200000);
	//   21   37:aload_3         
	//   22   38:ldc1            #65  <Int 0x200000>
	//   23   40:invokevirtual   #69  <Method Intent Intent.setFlags(int)>
	//   24   43:pop             
		return intent;
	//   25   44:aload_3         
	//   26   45:areturn         
	}

	private void initFacebookManager()
	{
		fbManager.onCreate();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FacebookManager fbManager>
	//    2    4:invokevirtual   #77  <Method void FacebookManager.onCreate()>
		fbManager.setUiListener(((com.ibotta.android.social.facebook.FacebookManager.FacebookUiListener) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field FacebookManager fbManager>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #81  <Method void FacebookManager.setUiListener(com.ibotta.android.social.facebook.FacebookManager$FacebookUiListener)>
		fbManager.setAuthListener(((com.ibotta.android.social.facebook.FacebookManager.FacebookAuthListener) (this)));
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field FacebookManager fbManager>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #85  <Method void FacebookManager.setAuthListener(com.ibotta.android.social.facebook.FacebookManager$FacebookAuthListener)>
		((SocialMvpPresenter)mvpPresenter).setFacebookManager(fbManager);
	//   11   23:aload_0         
	//   12   24:getfield        #37  <Field MvpPresenter mvpPresenter>
	//   13   27:checkcast       #87  <Class SocialMvpPresenter>
	//   14   30:aload_0         
	//   15   31:getfield        #72  <Field FacebookManager fbManager>
	//   16   34:invokeinterface #91  <Method void SocialMvpPresenter.setFacebookManager(FacebookManager)>
	//   17   39:return          
	}

	public void doFacebookShare(FacebookFeed facebookfeed)
	{
		facebookfeed = ((FacebookFeed) (facebookfeed.toShareFeedContent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #99  <Method com.facebook.share.internal.ShareFeedContent FacebookFeed.toShareFeedContent()>
	//    2    4:astore_1        
		fbShareCallbackManager = com.facebook.CallbackManager.Factory.create();
	//    3    5:aload_0         
	//    4    6:invokestatic    #105 <Method CallbackManager com.facebook.CallbackManager$Factory.create()>
	//    5    9:putfield        #107 <Field CallbackManager fbShareCallbackManager>
		(new ShareDialog(((android.app.Activity) (this)))).registerCallback(fbShareCallbackManager, new FacebookCallback() {

			public void onCancel()
			{
				((SocialMvpPresenter)access$200).onFacebookFeedCancelled();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SocialMvpActivity this$0>
			//    2    4:invokestatic    #27  <Method MvpPresenter SocialMvpActivity.access$100(SocialMvpActivity)>
			//    3    7:checkcast       #29  <Class SocialMvpPresenter>
			//    4   10:invokeinterface #32  <Method void SocialMvpPresenter.onFacebookFeedCancelled()>
			//    5   15:return          
			}

			public void onError(FacebookException facebookexception)
			{
				((SocialMvpPresenter)access$200).onFacebookFeedFail(((Exception) (facebookexception)));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SocialMvpActivity this$0>
			//    2    4:invokestatic    #37  <Method MvpPresenter SocialMvpActivity.access$200(SocialMvpActivity)>
			//    3    7:checkcast       #29  <Class SocialMvpPresenter>
			//    4   10:aload_1         
			//    5   11:invokeinterface #41  <Method void SocialMvpPresenter.onFacebookFeedFail(Exception)>
			//    6   16:return          
			}

			public void onSuccess(com.facebook.share.Sharer.Result result)
			{
				tracker.event("invite", "facebook");
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SocialMvpActivity this$0>
			//    2    4:getfield        #47  <Field Tracker SocialMvpActivity.tracker>
			//    3    7:ldc1            #49  <String "invite">
			//    4    9:ldc1            #51  <String "facebook">
			//    5   11:invokeinterface #57  <Method void Tracker.event(String, String)>
				((SocialMvpPresenter)access$200).onFacebookFeedSuccess();
			//    6   16:aload_0         
			//    7   17:getfield        #18  <Field SocialMvpActivity this$0>
			//    8   20:invokestatic    #60  <Method MvpPresenter SocialMvpActivity.access$000(SocialMvpActivity)>
			//    9   23:checkcast       #29  <Class SocialMvpPresenter>
			//   10   26:invokeinterface #63  <Method void SocialMvpPresenter.onFacebookFeedSuccess()>
			//   11   31:return          
			}

			public volatile void onSuccess(Object obj)
			{
				onSuccess((com.facebook.share.Sharer.Result)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #66  <Class com.facebook.share.Sharer$Result>
			//    3    5:invokevirtual   #68  <Method void onSuccess(com.facebook.share.Sharer$Result)>
			//    4    8:return          
			}

			final SocialMvpActivity this$0;

			
			{
				this$0 = SocialMvpActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SocialMvpActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    6   12:new             #109 <Class ShareDialog>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #112 <Method void ShareDialog(android.app.Activity)>
	//   10   20:aload_0         
	//   11   21:getfield        #107 <Field CallbackManager fbShareCallbackManager>
	//   12   24:new             #13  <Class SocialMvpActivity$1>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #115 <Method void SocialMvpActivity$1(SocialMvpActivity)>
	//   16   32:invokevirtual   #119 <Method void ShareDialog.registerCallback(CallbackManager, FacebookCallback)>
		ShareDialog.show(((android.app.Activity) (this)), ((com.facebook.share.model.ShareContent) (facebookfeed)));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokestatic    #123 <Method void ShareDialog.show(android.app.Activity, com.facebook.share.model.ShareContent)>
	//   20   40:return          
	}

	public void doTweet(String s)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.SEND");
	//    0    0:new             #43  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String "android.intent.action.SEND">
	//    3    6:invokespecial   #48  <Method void Intent(String)>
	//    4    9:astore_2        
			intent.setPackage("com.twitter.android");
	//    5   10:aload_2         
	//    6   11:ldc1            #128 <String "com.twitter.android">
	//    7   13:invokevirtual   #131 <Method Intent Intent.setPackage(String)>
	//    8   16:pop             
			intent.setType(getString(0x7f11062d));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:ldc1            #49  <Int 0x7f11062d>
	//   12   21:invokevirtual   #53  <Method String getString(int)>
	//   13   24:invokevirtual   #57  <Method Intent Intent.setType(String)>
	//   14   27:pop             
			intent.putExtra("android.intent.extra.TEXT", s);
	//   15   28:aload_2         
	//   16   29:ldc1            #64  <String "android.intent.extra.TEXT">
	//   17   31:aload_1         
	//   18   32:invokevirtual   #62  <Method Intent Intent.putExtra(String, String)>
	//   19   35:pop             
			startActivity(intent);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #135 <Method void startActivity(Intent)>
			tracker.event("invite", "twitter");
	//   23   41:aload_0         
	//   24   42:getfield        #137 <Field Tracker tracker>
	//   25   45:ldc1            #139 <String "invite">
	//   26   47:ldc1            #141 <String "twitter">
	//   27   49:invokeinterface #147 <Method void Tracker.event(String, String)>
			return;
	//   28   54:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  29   55:astore_1        
		{
			Timber.e(((Throwable) (s)), "Twitter activity not found.", new Object[0]);
	//   30   56:aload_1         
	//   31   57:ldc1            #149 <String "Twitter activity not found.">
	//   32   59:iconst_0        
	//   33   60:anewarray       Object[]
	//   34   63:invokestatic    #157 <Method void Timber.e(Throwable, String, Object[])>
		}
	//   35   66:return          
	}

	public String getBackUpShareMessage(String s)
	{
		return getString(0x7f1103b5, new Object[] {
			s
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #160 <Int 0x7f1103b5>
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:aastore         
	//    8   11:invokevirtual   #163 <Method String getString(int, Object[])>
	//    9   14:areturn         
	}

	public void hideFacebookLoading()
	{
		hideSubmittedJobLoading();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method void hideSubmittedJobLoading()>
	//    2    4:return          
	}

	public boolean isAutoSocialConnect()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #173 <Method void LoadingMvpActivity.onActivityResult(int, int, Intent)>
		CallbackManager callbackmanager = fbShareCallbackManager;
	//    5    7:aload_0         
	//    6    8:getfield        #107 <Field CallbackManager fbShareCallbackManager>
	//    7   11:astore          4
		if(callbackmanager != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          29
			callbackmanager.onActivityResult(i, j, intent);
	//   10   18:aload           4
	//   11   20:iload_1         
	//   12   21:iload_2         
	//   13   22:aload_3         
	//   14   23:invokeinterface #178 <Method boolean CallbackManager.onActivityResult(int, int, Intent)>
	//   15   28:pop             
		fbManager.onActivityResult(i, j, intent);
	//   16   29:aload_0         
	//   17   30:getfield        #72  <Field FacebookManager fbManager>
	//   18   33:iload_1         
	//   19   34:iload_2         
	//   20   35:aload_3         
	//   21   36:invokevirtual   #179 <Method void FacebookManager.onActivityResult(int, int, Intent)>
	//   22   39:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void LoadingMvpActivity.onCreate(Bundle)>
		initFacebookManager();
	//    3    5:aload_0         
	//    4    6:invokespecial   #185 <Method void initFacebookManager()>
	//    5    9:return          
	}

	public void onFacebookAuthFailed()
	{
		((SocialMvpPresenter)mvpPresenter).onFacebookAuthFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #87  <Class SocialMvpPresenter>
	//    3    7:invokeinterface #189 <Method void SocialMvpPresenter.onFacebookAuthFailed()>
	//    4   12:return          
	}

	public void onFacebookAuthSuccess()
	{
		((SocialMvpPresenter)mvpPresenter).onFacebookAuthSuccess();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #87  <Class SocialMvpPresenter>
	//    3    7:invokeinterface #192 <Method void SocialMvpPresenter.onFacebookAuthSuccess()>
	//    4   12:return          
	}

	public void showFacebookAuthFailed()
	{
		showQuickMessage(0x7f1102ac, false, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #194 <Int 0x7f1102ac>
	//    2    3:iconst_0        
	//    3    4:iconst_1        
	//    4    5:invokevirtual   #198 <Method void showQuickMessage(int, boolean, boolean)>
	//    5    8:return          
	}

	public void showFacebookLoading(String s)
	{
		showSubmittedJobLoading(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #202 <Method void showSubmittedJobLoading(String)>
	//    3    5:return          
	}

	public void showFacebookPostFailedMessage(String s)
	{
		ErrorDialogFragment errordialogfragment = ErrorDialogFragment.newInstance(getString(0x7f110162, new Object[] {
			s
		}));
	//    0    0:aload_0         
	//    1    1:ldc1            #204 <Int 0x7f110162>
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:aastore         
	//    8   11:invokevirtual   #163 <Method String getString(int, Object[])>
	//    9   14:invokestatic    #210 <Method ErrorDialogFragment ErrorDialogFragment.newInstance(String)>
	//   10   17:astore_2        
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (errordialogfragment)));
	//   11   18:getstatic       #216 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #219 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment)>
		if(s != null)
	//*  15   26:aload_1         
	//*  16   27:ifnull          58
			apiWorkSubmitter.submit(((com.ibotta.android.service.api.job.ApiJob) (apiJobFactory.createLogErrorPostCall(userState.getCustomerId(), s))));
	//   17   30:aload_0         
	//   18   31:getfield        #221 <Field ApiWorkSubmitter apiWorkSubmitter>
	//   19   34:aload_0         
	//   20   35:getfield        #223 <Field ApiJobFactory apiJobFactory>
	//   21   38:aload_0         
	//   22   39:getfield        #225 <Field UserState userState>
	//   23   42:invokeinterface #231 <Method int UserState.getCustomerId()>
	//   24   47:aload_1         
	//   25   48:invokeinterface #237 <Method com.ibotta.android.service.api.job.SingleApiJob ApiJobFactory.createLogErrorPostCall(int, String)>
	//   26   53:invokeinterface #243 <Method void ApiWorkSubmitter.submit(com.ibotta.android.service.api.job.ApiJob)>
	//   27   58:return          
	}

	public void showShareChooser(String s, String s1)
	{
		try
		{
			startActivity(Intent.createChooser(buildShareIntent(s, s1), ((CharSequence) (getString(0x7f1103ae)))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #246 <Method Intent buildShareIntent(String, String)>
	//    5    7:aload_0         
	//    6    8:ldc1            #247 <Int 0x7f1103ae>
	//    7   10:invokevirtual   #53  <Method String getString(int)>
	//    8   13:invokestatic    #251 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//    9   16:invokevirtual   #135 <Method void startActivity(Intent)>
			tracker.event("invite", "native");
	//   10   19:aload_0         
	//   11   20:getfield        #137 <Field Tracker tracker>
	//   12   23:ldc1            #139 <String "invite">
	//   13   25:ldc1            #253 <String "native">
	//   14   27:invokeinterface #147 <Method void Tracker.event(String, String)>
			return;
	//   15   32:return          
		}
	//*  16   33:aload_0         
	//*  17   34:ldc1            #254 <Int 0x7f1101ba>
	//*  18   36:aconst_null     
	//*  19   37:invokevirtual   #258 <Method void showErrorMessage(int, String)>
	//*  20   40:return          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			showErrorMessage(0x7f1101ba, ((String) (null)));
		}
	//*  21   41:astore_1        
	//*  22   42:goto            33
	}

	ApiJobFactory apiJobFactory;
	ApiWorkSubmitter apiWorkSubmitter;
	FacebookManager fbManager;
	private CallbackManager fbShareCallbackManager;
	Tracker tracker;
	UserState userState;


/*
	static MvpPresenter access$000(SocialMvpActivity socialmvpactivity)
	{
		return socialmvpactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$100(SocialMvpActivity socialmvpactivity)
	{
		return socialmvpactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$200(SocialMvpActivity socialmvpactivity)
	{
		return socialmvpactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/
}
