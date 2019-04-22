// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.*;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.*;
import butterknife.Unbinder;
import com.ibotta.android.App;
import com.ibotta.android.LocalBroadcast;
import com.ibotta.android.aop.tracking.TrackingAspect;
import com.ibotta.android.aop.tracking.advice.EventContextAdviceField;
import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.fragment.dialog.*;
import com.ibotta.android.fragment.retailer.RetailerParcel;
import com.ibotta.android.mvp.ui.activity.notifications.NotificationTracking;
import com.ibotta.android.mvp.ui.dialog.NetworkConnectionDialog;
import com.ibotta.android.mvp.ui.dialog.UnlockAnimationDialog;
import com.ibotta.android.mvp.ui.view.dialog.NotificationDialog;
import com.ibotta.android.mvp.ui.view.nav.NavBarListener;
import com.ibotta.android.mvp.ui.view.nav.NavButtonType;
import com.ibotta.android.profile.BuildProfile;
import com.ibotta.android.routing.intent.*;
import com.ibotta.android.service.api.job.CacheClearBatchApiJob;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.service.work.tracking.TrackingFlushWorker;
import com.ibotta.android.state.*;
import com.ibotta.android.state.app.cache.AppCacheState;
import com.ibotta.android.state.app.debug.DebugState;
import com.ibotta.android.state.app.upgrade.UpgradeState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import com.ibotta.android.util.AppHelper;
import com.ibotta.api.ApiErrorDetails;
import com.ibotta.api.model.buttonsdk.ButtonTx;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;
import org.parceler.Parcels;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpView, MvpPresenter, MvpComponent

public abstract class MvpActivity extends AppCompatActivity
	implements EventContextAdviceField, com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener, com.ibotta.android.fragment.dialog.PromptDialogFragment.PromptDialogListener, MvpView, NavBarListener, GlobalStateListener, TraceFieldInterface
{

	public MvpActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void AppCompatActivity()>
		upgradeCheck = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #96  <Field boolean upgradeCheck>
	//    5    9:return          
	}

	private static void ajc$preClinit()
	{
		Factory factory = new Factory("MvpActivity.java", com/ibotta/android/mvp/base/MvpActivity);
	//    0    0:new             #98  <Class Factory>
	//    1    3:dup             
	//    2    4:ldc1            #100 <String "MvpActivity.java">
	//    3    6:ldc1            #2   <Class MvpActivity>
	//    4    8:invokespecial   #103 <Method void Factory(String, Class)>
	//    5   11:astore_0        
		ajc$tjp_0 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("1", "showPwiFlow", "com.ibotta.android.mvp.base.MvpActivity", "com.ibotta.android.fragment.retailer.RetailerParcel:com.ibotta.android.apiandroid.content.ContentId", "retailerParcel:contentId", "", "void"))), 406);
	//    6   12:aload_0         
	//    7   13:ldc1            #105 <String "method-execution">
	//    8   15:aload_0         
	//    9   16:ldc1            #107 <String "1">
	//   10   18:ldc1            #109 <String "showPwiFlow">
	//   11   20:ldc1            #111 <String "com.ibotta.android.mvp.base.MvpActivity">
	//   12   22:ldc1            #113 <String "com.ibotta.android.fragment.retailer.RetailerParcel:com.ibotta.android.apiandroid.content.ContentId">
	//   13   24:ldc1            #115 <String "retailerParcel:contentId">
	//   14   26:ldc1            #117 <String "">
	//   15   28:ldc1            #119 <String "void">
	//   16   30:invokevirtual   #123 <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   17   33:sipush          406
	//   18   36:invokevirtual   #127 <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   19   39:putstatic       #129 <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//   20   42:return          
	}

	private void checkForToolbar()
	{
		toolbar = (Toolbar)findViewById(0x7f09043a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #131 <Int 0x7f09043a>
	//    3    4:invokevirtual   #135 <Method View findViewById(int)>
	//    4    7:checkcast       #137 <Class Toolbar>
	//    5   10:putfield        #139 <Field Toolbar toolbar>
		if(toolbar != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #139 <Field Toolbar toolbar>
	//*   8   17:ifnull          24
			initToolBar();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #142 <Method void initToolBar()>
	//   11   24:return          
	}

	private void loadPresenterSavedState(Bundle bundle)
	{
		if(bundle != null && bundle.containsKey("presenter_state"))
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
	//*   2    4:aload_1         
	//*   3    5:ldc1            #146 <String "presenter_state">
	//*   4    7:invokevirtual   #152 <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifeq            33
		{
			bundle = ((Bundle) (Parcels.unwrap(bundle.getParcelable("presenter_state"))));
	//    6   13:aload_1         
	//    7   14:ldc1            #146 <String "presenter_state">
	//    8   16:invokevirtual   #156 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    9   19:invokestatic    #162 <Method Object Parcels.unwrap(android.os.Parcelable)>
	//   10   22:astore_1        
			mvpPresenter.setPersistedState(((Object) (bundle)));
	//   11   23:aload_0         
	//   12   24:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   13   27:aload_1         
	//   14   28:invokeinterface #170 <Method void MvpPresenter.setPersistedState(Object)>
		}
	//   15   33:return          
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field Trace _nr_trace>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Trace trace)
	//*   4    6:astore_1        
		{
			return;
	//    5    7:return          
		}
	}

	protected abstract MvpComponent createComponent(MainComponent maincomponent);

	public void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void AppCompatActivity.finish()>
		overridePendingTransition(0, 0);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #185 <Method void overridePendingTransition(int, int)>
	//    6   10:return          
	}

	public Activity getActivity()
	{
		return ((Activity) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public ActionBar getCompatActionBar()
	{
		return getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #192 <Method ActionBar getSupportActionBar()>
	//    2    4:areturn         
	}

	public FragmentManager getCompatFragmentManager()
	{
		return getSupportFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method FragmentManager getSupportFragmentManager()>
	//    2    4:areturn         
	}

	public LoaderManager getCompatLoaderManager()
	{
		return getSupportLoaderManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method LoaderManager getSupportLoaderManager()>
	//    2    4:areturn         
	}

	public Fragment getCurrentFragment()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public EventContext getEventContext()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected abstract NavButtonType getNavButtonType();

	protected void initToolBar()
	{
		setSupportActionBar(toolbar);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #139 <Field Toolbar toolbar>
	//    3    5:invokevirtual   #213 <Method void setSupportActionBar(Toolbar)>
		if(getSupportActionBar() == null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #192 <Method ActionBar getSupportActionBar()>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			getSupportActionBar().setDisplayHomeAsUpEnabled(isBackSupported());
	//    8   16:aload_0         
	//    9   17:invokevirtual   #192 <Method ActionBar getSupportActionBar()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #217 <Method boolean isBackSupported()>
	//   12   24:invokevirtual   #223 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
			getSupportActionBar().setDisplayShowHomeEnabled(isBackSupported());
	//   13   27:aload_0         
	//   14   28:invokevirtual   #192 <Method ActionBar getSupportActionBar()>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #217 <Method boolean isBackSupported()>
	//   17   35:invokevirtual   #226 <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
			return;
	//   18   38:return          
		}
	}

	protected abstract void inject(MvpComponent mvpcomponent);

	protected boolean isBackSupported()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isEmpty(String s)
	{
		return TextUtils.isEmpty(((CharSequence) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #234 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ireturn         
	}

	protected boolean isFreshStart(Bundle bundle)
	{
		return bundle == null;
	//    0    0:aload_1         
	//    1    1:ifnonnull       6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public boolean isUpgradeDialogVisible()
	{
		return DialogFragmentHelper.INSTANCE.isShowing(((com.ibotta.android.activity.CompatSupplier) (this)), "app_upgrade") || DialogFragmentHelper.INSTANCE.isShowing(((com.ibotta.android.activity.CompatSupplier) (this)), "upgrade_required");
	//    0    0:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    1    3:aload_0         
	//    2    4:ldc1            #31  <String "app_upgrade">
	//    3    6:invokevirtual   #251 <Method boolean DialogFragmentHelper.isShowing(com.ibotta.android.activity.CompatSupplier, String)>
	//    4    9:ifne            29
	//    5   12:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    6   15:aload_0         
	//    7   16:ldc1            #37  <String "upgrade_required">
	//    8   18:invokevirtual   #251 <Method boolean DialogFragmentHelper.isShowing(com.ibotta.android.activity.CompatSupplier, String)>
	//    9   21:ifeq            27
	//   10   24:goto            29
	//   11   27:iconst_0        
	//   12   28:ireturn         
	//   13   29:iconst_1        
	//   14   30:ireturn         
	}

	public void onAppCacheLowSpace()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #255 <Method boolean isFinishing()>
	//*   2    4:ifne            45
		{
			if(isUpgradeDialogVisible())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #257 <Method boolean isUpgradeDialogVisible()>
	//*   5   11:ifeq            15
			{
				return;
	//    6   14:return          
			} else
			{
				tracker.event("app_cache_low");
	//    7   15:aload_0         
	//    8   16:getfield        #259 <Field Tracker tracker>
	//    9   19:ldc1            #28  <String "app_cache_low">
	//   10   21:invokeinterface #265 <Method void Tracker.event(String)>
				appCacheState.setAppCacheLowLastNoticeSeen();
	//   11   26:aload_0         
	//   12   27:getfield        #267 <Field AppCacheState appCacheState>
	//   13   30:invokeinterface #272 <Method void AppCacheState.setAppCacheLowLastNoticeSeen()>
				showErrorMessage(0x7f11013b, "app_cache_low");
	//   14   35:aload_0         
	//   15   36:ldc2            #273 <Int 0x7f11013b>
	//   16   39:ldc1            #28  <String "app_cache_low">
	//   17   41:invokevirtual   #277 <Method void showErrorMessage(int, String)>
				return;
	//   18   44:return          
			}
		} else
		{
			return;
	//   19   45:return          
		}
	}

	public void onAppConfigChanged()
	{
	//    0    0:return          
	}

	public void onAppVersionDeprecated()
	{
		showUpgradeRequired();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method void showUpgradeRequired()>
	//    2    4:return          
	}

	public void onAuthenticationLost(boolean flag)
	{
		Timber.w("onAuthenticationLost", new Object[0]);
	//    0    0:ldc2            #284 <String "onAuthenticationLost">
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokestatic    #292 <Method void Timber.w(String, Object[])>
		authManager.clearAuthentication();
	//    4   10:aload_0         
	//    5   11:getfield        #294 <Field AuthManager authManager>
	//    6   14:invokeinterface #299 <Method void AuthManager.clearAuthentication()>
		LocalBroadcast.broadcastLogout();
	//    7   19:invokestatic    #304 <Method void LocalBroadcast.broadcastLogout()>
		startActivity((new LaunchIntentCreator(((android.content.Context) (this)), flag)).create());
	//    8   22:aload_0         
	//    9   23:new             #306 <Class LaunchIntentCreator>
	//   10   26:dup             
	//   11   27:aload_0         
	//   12   28:iload_1         
	//   13   29:invokespecial   #309 <Method void LaunchIntentCreator(android.content.Context, boolean)>
	//   14   32:invokevirtual   #313 <Method Intent LaunchIntentCreator.create()>
	//   15   35:invokevirtual   #317 <Method void startActivity(Intent)>
		finish();
	//   16   38:aload_0         
	//   17   39:invokevirtual   #318 <Method void finish()>
	//   18   42:return          
	}

	public void onButtonSdkWelcomeBack(ButtonTx buttontx)
	{
		if(isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #255 <Method boolean isFinishing()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			buttonSdkManager.showWelcomeBackTransactionData(buttontx);
	//    4    8:aload_0         
	//    5    9:getfield        #322 <Field ButtonSdkManager buttonSdkManager>
	//    6   12:aload_1         
	//    7   13:invokeinterface #327 <Method void ButtonSdkManager.showWelcomeBackTransactionData(ButtonTx)>
			return;
	//    8   18:return          
		}
	}

	public void onChoice(String s, int i, String s1)
	{
		if("upgrade_required".equals(((Object) (s))) && i == 0x7f110206)
	//*   0    0:ldc1            #37  <String "upgrade_required">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #335 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            25
	//*   4    9:iload_2         
	//*   5   10:ldc2            #336 <Int 0x7f110206>
	//*   6   13:icmpne          25
			mvpPresenter.onUpgradeClicked();
	//    7   16:aload_0         
	//    8   17:getfield        #164 <Field MvpPresenter mvpPresenter>
	//    9   20:invokeinterface #339 <Method void MvpPresenter.onUpgradeClicked()>
	//   10   25:return          
	}

	protected void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("MvpActivity");
	//    0    0:ldc2            #344 <String "MvpActivity">
	//    1    3:invokestatic    #349 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "MvpActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    6:aload_0         
	//    3    7:getfield        #176 <Field Trace _nr_trace>
	//    4   10:ldc2            #351 <String "MvpActivity#onCreate">
	//    5   13:aconst_null     
	//    6   14:invokestatic    #355 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   17:goto            28
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "MvpActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   20:aconst_null     
	//    9   21:ldc2            #351 <String "MvpActivity#onCreate">
	//   10   24:aconst_null     
	//   11   25:invokestatic    #355 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		if(mvpComponent == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #357 <Field MvpComponent mvpComponent>
	//*  14   32:ifnonnull       49
			mvpComponent = createComponent(App.instance().getMainComponent());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:invokestatic    #363 <Method App App.instance()>
	//   18   40:invokevirtual   #367 <Method MainComponent App.getMainComponent()>
	//   19   43:invokevirtual   #369 <Method MvpComponent createComponent(MainComponent)>
	//   20   46:putfield        #357 <Field MvpComponent mvpComponent>
		MvpComponent mvpcomponent = mvpComponent;
	//   21   49:aload_0         
	//   22   50:getfield        #357 <Field MvpComponent mvpComponent>
	//   23   53:astore_2        
		if(mvpcomponent != null)
	//*  24   54:aload_2         
	//*  25   55:ifnull          76
		{
			mvpPresenter = mvpcomponent.getMvpPresenter();
	//   26   58:aload_0         
	//   27   59:aload_2         
	//   28   60:invokeinterface #375 <Method MvpPresenter MvpComponent.getMvpPresenter()>
	//   29   65:putfield        #164 <Field MvpPresenter mvpPresenter>
			inject(mvpComponent);
	//   30   68:aload_0         
	//   31   69:aload_0         
	//   32   70:getfield        #357 <Field MvpComponent mvpComponent>
	//   33   73:invokevirtual   #377 <Method void inject(MvpComponent)>
		}
		super.onCreate(bundle);
	//   34   76:aload_0         
	//   35   77:aload_1         
	//   36   78:invokespecial   #379 <Method void AppCompatActivity.onCreate(Bundle)>
		mvpPresenter.onAttach(((MvpView) (this)));
	//   37   81:aload_0         
	//   38   82:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   39   85:aload_0         
	//   40   86:invokeinterface #383 <Method void MvpPresenter.onAttach(MvpView)>
		loadPresenterSavedState(bundle);
	//   41   91:aload_0         
	//   42   92:aload_1         
	//   43   93:invokespecial   #385 <Method void loadPresenterSavedState(Bundle)>
		redeemHelper = mvpComponent.getRedeemPreflightHelper();
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #357 <Field MvpComponent mvpComponent>
	//   47  101:invokeinterface #389 <Method RedeemPreFlightHelper MvpComponent.getRedeemPreflightHelper()>
	//   48  106:putfield        #391 <Field RedeemPreFlightHelper redeemHelper>
		redeemHelper.setEventContext(getEventContext());
	//   49  109:aload_0         
	//   50  110:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//   51  113:aload_0         
	//   52  114:invokevirtual   #393 <Method EventContext getEventContext()>
	//   53  117:invokevirtual   #399 <Method void RedeemPreFlightHelper.setEventContext(EventContext)>
		redeemHelper.setDoPendingCheck(authManager.isAuthenticated());
	//   54  120:aload_0         
	//   55  121:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//   56  124:aload_0         
	//   57  125:getfield        #294 <Field AuthManager authManager>
	//   58  128:invokeinterface #402 <Method boolean AuthManager.isAuthenticated()>
	//   59  133:invokevirtual   #405 <Method void RedeemPreFlightHelper.setDoPendingCheck(boolean)>
		TraceMachine.exitMethod();
	//   60  136:invokestatic    #408 <Method void TraceMachine.exitMethod()>
		return;
	//   61  139:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   62  140:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  63  141:goto            20
	}

	protected void onDestroy()
	{
		Object obj = ((Object) (redeemHelper));
	//    0    0:aload_0         
	//    1    1:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			((RedeemPreFlightHelper) (obj)).destroy();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #412 <Method void RedeemPreFlightHelper.destroy()>
		mvpPresenter.onDetach();
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field MvpPresenter mvpPresenter>
	//    9   17:invokeinterface #415 <Method void MvpPresenter.onDetach()>
		obj = ((Object) (unbinder));
	//   10   22:aload_0         
	//   11   23:getfield        #417 <Field Unbinder unbinder>
	//   12   26:astore_1        
		if(obj != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          37
			((Unbinder) (obj)).unbind();
	//   15   31:aload_1         
	//   16   32:invokeinterface #422 <Method void Unbinder.unbind()>
		super.onDestroy();
	//   17   37:aload_0         
	//   18   38:invokespecial   #424 <Method void AppCompatActivity.onDestroy()>
	//   19   41:return          
	}

	public void onDialogFragmentCancelled(String s)
	{
		Timber.d("onDialogFragmentCancelled: tag=%1$s", new Object[] {
			s
		});
	//    0    0:ldc2            #427 <String "onDialogFragmentCancelled: tag=%1$s">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aastore         
	//    7   11:invokestatic    #430 <Method void Timber.d(String, Object[])>
	//    8   14:return          
	}

	public void onDialogFragmentDismissed(String s)
	{
		Timber.d("onDialogFragmentDismissed: tag=%1$s", new Object[] {
			s
		});
	//    0    0:ldc2            #433 <String "onDialogFragmentDismissed: tag=%1$s">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aastore         
	//    7   11:invokestatic    #430 <Method void Timber.d(String, Object[])>
	//    8   14:return          
	}

	public void onDismissedNotificationClicked(NotificationDialog notificationdialog)
	{
		notificationdialog.dismiss();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #440 <Method void NotificationDialog.dismiss()>
	//    2    4:return          
	}

	public void onGeofenceNotificationStatusChanged(GeofenceNotificationStatus geofencenotificationstatus)
	{
	//    0    0:return          
	}

	public void onGeofenceStatusChanged(GeofenceStatus geofencestatus)
	{
	//    0    0:return          
	}

	public void onGeofencesRegistered()
	{
	//    0    0:return          
	}

	public void onLocationChanged(Location location)
	{
	//    0    0:return          
	}

	public void onMaintenanceMode()
	{
		showErrorMessage(0x7f1101ac, "maintenance_mode");
	//    0    0:aload_0         
	//    1    1:ldc2            #449 <Int 0x7f1101ac>
	//    2    4:ldc1            #34  <String "maintenance_mode">
	//    3    6:invokevirtual   #277 <Method void showErrorMessage(int, String)>
	//    4    9:return          
	}

	public void onNavButtonSelected(NavButtonType navbuttontype)
	{
		static class _cls2
		{

			static final int $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[];

			static 
			{
				$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType = new int[NavButtonType.values().length];
			//    0    0:invokestatic    #18  <Method NavButtonType[] NavButtonType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.FEATURED.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
			//    5   12:getstatic       #24  <Field NavButtonType NavButtonType.FEATURED>
			//    6   15:invokevirtual   #28  <Method int NavButtonType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
			//*  10   23:getstatic       #31  <Field NavButtonType NavButtonType.FIND_REBATES>
			//*  11   26:invokevirtual   #28  <Method int NavButtonType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
			//*  15   34:getstatic       #34  <Field NavButtonType NavButtonType.REDEEM>
			//*  16   37:invokevirtual   #28  <Method int NavButtonType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
			//*  20   45:getstatic       #37  <Field NavButtonType NavButtonType.MY_REBATES>
			//*  21   48:invokevirtual   #28  <Method int NavButtonType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
			//*  25   56:getstatic       #40  <Field NavButtonType NavButtonType.ACCOUNT>
			//*  26   59:invokevirtual   #28  <Method int NavButtonType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.FIND_REBATES.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.REDEEM.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.MY_REBATES.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.ACCOUNT.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls2..SwitchMap.com.ibotta.android.mvp.ui.view.nav.NavButtonType[navbuttontype.ordinal()])
	//*   0    0:getstatic       #455 <Field int[] MvpActivity$2.$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #461 <Method int NavButtonType.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 85
	//	               2 75
	//	               3 65
	//	               4 55
	//	               5 45
		default:
			return;
	//    5   44:return          

		case 5: // '\005'
			mvpPresenter.onNavAccountClicked();
	//    6   45:aload_0         
	//    7   46:getfield        #164 <Field MvpPresenter mvpPresenter>
	//    8   49:invokeinterface #464 <Method void MvpPresenter.onNavAccountClicked()>
			return;
	//    9   54:return          

		case 4: // '\004'
			mvpPresenter.onNavMyRebatesClicked();
	//   10   55:aload_0         
	//   11   56:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   12   59:invokeinterface #467 <Method void MvpPresenter.onNavMyRebatesClicked()>
			return;
	//   13   64:return          

		case 3: // '\003'
			mvpPresenter.onNavRedeemClicked();
	//   14   65:aload_0         
	//   15   66:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   16   69:invokeinterface #470 <Method void MvpPresenter.onNavRedeemClicked()>
			return;
	//   17   74:return          

		case 2: // '\002'
			mvpPresenter.onNavFindRebatesClicked();
	//   18   75:aload_0         
	//   19   76:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   20   79:invokeinterface #473 <Method void MvpPresenter.onNavFindRebatesClicked()>
			return;
	//   21   84:return          

		case 1: // '\001'
			mvpPresenter.onNavFeaturedClicked();
	//   22   85:aload_0         
	//   23   86:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   24   89:invokeinterface #476 <Method void MvpPresenter.onNavFeaturedClicked()>
			return;
	//   25   94:return          
		}
	}

	public void onNotificationsUpdated()
	{
		LocalBroadcast.broadcastNotificationCount();
	//    0    0:invokestatic    #480 <Method void LocalBroadcast.broadcastNotificationCount()>
	//    1    3:return          
	}

	public void onOfferExpired()
	{
		Timber.w("onOfferExpired", new Object[0]);
	//    0    0:ldc2            #482 <String "onOfferExpired">
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokestatic    #292 <Method void Timber.w(String, Object[])>
		cacheClearFactory.create().clearOffers(true).clear();
	//    4   10:aload_0         
	//    5   11:getfield        #484 <Field CacheClearJobFactory cacheClearFactory>
	//    6   14:invokevirtual   #489 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//    7   17:iconst_1        
	//    8   18:invokevirtual   #495 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearOffers(boolean)>
	//    9   21:invokevirtual   #498 <Method void CacheClearBatchApiJob.clear()>
		startActivity((new FeaturedIntentCreator(((android.content.Context) (this)))).create());
	//   10   24:aload_0         
	//   11   25:new             #500 <Class FeaturedIntentCreator>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #503 <Method void FeaturedIntentCreator(android.content.Context)>
	//   15   33:invokevirtual   #504 <Method Intent FeaturedIntentCreator.create()>
	//   16   36:invokevirtual   #317 <Method void startActivity(Intent)>
	//   17   39:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		int i = menuitem.getItemId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #511 <Method int MenuItem.getItemId()>
	//    2    6:istore_2        
		if(i != 0x102002c)
	//*   3    7:iload_2         
	//*   4    8:ldc2            #512 <Int 0x102002c>
	//*   5   11:icmpeq          29
		{
			if(i != 0x7f090022)
	//*   6   14:iload_2         
	//*   7   15:ldc2            #513 <Int 0x7f090022>
	//*   8   18:icmpeq          23
			{
				return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
			} else
			{
				finish();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #318 <Method void finish()>
				return true;
	//   13   27:iconst_1        
	//   14   28:ireturn         
			}
		} else
		{
			onBackPressed();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #516 <Method void onBackPressed()>
			return true;
	//   17   33:iconst_1        
	//   18   34:ireturn         
		}
	}

	protected void onPause()
	{
		mvpPresenter.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field MvpPresenter mvpPresenter>
	//    2    4:invokeinterface #519 <Method void MvpPresenter.onPause()>
		super.onPause();
	//    3    9:aload_0         
	//    4   10:invokespecial   #520 <Method void AppCompatActivity.onPause()>
		globalEventManager.removeGlobalStateListener(((GlobalStateListener) (this)));
	//    5   13:aload_0         
	//    6   14:getfield        #522 <Field GlobalEventManager globalEventManager>
	//    7   17:aload_0         
	//    8   18:invokeinterface #528 <Method void GlobalEventManager.removeGlobalStateListener(GlobalStateListener)>
	//    9   23:return          
	}

	public void onPendingEarningsUpdated()
	{
	//    0    0:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #532 <Method void AppCompatActivity.onResume()>
		globalEventManager.addGlobalStateListener(((GlobalStateListener) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #522 <Field GlobalEventManager globalEventManager>
	//    4    8:aload_0         
	//    5    9:invokeinterface #535 <Method void GlobalEventManager.addGlobalStateListener(GlobalStateListener)>
		buttonSdkManager.pollForTransactions(((com.ibotta.android.activity.CompatSupplier) (this)));
	//    6   14:aload_0         
	//    7   15:getfield        #322 <Field ButtonSdkManager buttonSdkManager>
	//    8   18:aload_0         
	//    9   19:invokeinterface #539 <Method void ButtonSdkManager.pollForTransactions(com.ibotta.android.activity.CompatSupplier)>
		tracker.view(((Object)this).getClass().getSimpleName());
	//   10   24:aload_0         
	//   11   25:getfield        #259 <Field Tracker tracker>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #543 <Method Class Object.getClass()>
	//   14   32:invokevirtual   #549 <Method String Class.getSimpleName()>
	//   15   35:invokeinterface #552 <Method void Tracker.view(String)>
		mvpPresenter.onResume();
	//   16   40:aload_0         
	//   17   41:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   18   44:invokeinterface #553 <Method void MvpPresenter.onResume()>
	//   19   49:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #556 <Method void AppCompatActivity.onSaveInstanceState(Bundle)>
		Object obj = mvpPresenter.getPersistedState();
	//    3    5:aload_0         
	//    4    6:getfield        #164 <Field MvpPresenter mvpPresenter>
	//    5    9:invokeinterface #560 <Method Object MvpPresenter.getPersistedState()>
	//    6   14:astore_2        
		if(obj != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          29
			bundle.putParcelable("presenter_state", Parcels.wrap(obj));
	//    9   19:aload_1         
	//   10   20:ldc1            #146 <String "presenter_state">
	//   11   22:aload_2         
	//   12   23:invokestatic    #564 <Method android.os.Parcelable Parcels.wrap(Object)>
	//   13   26:invokevirtual   #568 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
	//   14   29:return          
	}

	protected void onStart()
	{
		ApplicationStateMonitor.getInstance().activityStarted();
	//    0    0:invokestatic    #575 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    1    3:invokevirtual   #578 <Method void ApplicationStateMonitor.activityStarted()>
		super.onStart();
	//    2    6:aload_0         
	//    3    7:invokespecial   #580 <Method void AppCompatActivity.onStart()>
		RedeemPreFlightHelper redeempreflighthelper = redeemHelper;
	//    4   10:aload_0         
	//    5   11:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//    6   14:astore_1        
		if(redeempreflighthelper != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          23
			redeempreflighthelper.start();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #583 <Method void RedeemPreFlightHelper.start()>
		mvpPresenter.onStart();
	//   11   23:aload_0         
	//   12   24:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   13   27:invokeinterface #584 <Method void MvpPresenter.onStart()>
		trackingFlushWorker.schedule();
	//   14   32:aload_0         
	//   15   33:getfield        #586 <Field TrackingFlushWorker trackingFlushWorker>
	//   16   36:invokevirtual   #591 <Method void TrackingFlushWorker.schedule()>
	//   17   39:return          
	}

	protected void onStop()
	{
		ApplicationStateMonitor.getInstance().activityStopped();
	//    0    0:invokestatic    #575 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    1    3:invokevirtual   #595 <Method void ApplicationStateMonitor.activityStopped()>
		RedeemPreFlightHelper redeempreflighthelper = redeemHelper;
	//    2    6:aload_0         
	//    3    7:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//    4   10:astore_1        
		if(redeempreflighthelper != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          19
			redeempreflighthelper.stop();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #598 <Method void RedeemPreFlightHelper.stop()>
		mvpPresenter.onStop();
	//    9   19:aload_0         
	//   10   20:getfield        #164 <Field MvpPresenter mvpPresenter>
	//   11   23:invokeinterface #600 <Method void MvpPresenter.onStop()>
		super.onStop();
	//   12   28:aload_0         
	//   13   29:invokespecial   #601 <Method void AppCompatActivity.onStop()>
	//   14   32:return          
	}

	public boolean onSupportNavigateUp()
	{
		onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #516 <Method void onBackPressed()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	public void onUpgradeAvailable(String s)
	{
		boolean flag = buildProfile.isUpgradeNoticeIgnorable();
	//    0    0:aload_0         
	//    1    1:getfield        #605 <Field BuildProfile buildProfile>
	//    2    4:invokeinterface #610 <Method boolean BuildProfile.isUpgradeNoticeIgnorable()>
	//    3    9:istore_2        
		if(upgradeCheck)
	//*   4   10:aload_0         
	//*   5   11:getfield        #96  <Field boolean upgradeCheck>
	//*   6   14:ifeq            141
		{
			if(flag && debugState.isIgnoreUpdates())
	//*   7   17:iload_2         
	//*   8   18:ifeq            34
	//*   9   21:aload_0         
	//*  10   22:getfield        #612 <Field DebugState debugState>
	//*  11   25:invokeinterface #617 <Method boolean DebugState.isIgnoreUpdates()>
	//*  12   30:ifeq            34
				return;
	//   13   33:return          
			if(s != null && !isFinishing())
	//*  14   34:aload_1         
	//*  15   35:ifnull          127
	//*  16   38:aload_0         
	//*  17   39:invokevirtual   #255 <Method boolean isFinishing()>
	//*  18   42:ifeq            48
	//*  19   45:goto            127
				if(DialogFragmentHelper.INSTANCE.isShowing(((com.ibotta.android.activity.CompatSupplier) (this)), "upgrade_required"))
	//*  20   48:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//*  21   51:aload_0         
	//*  22   52:ldc1            #37  <String "upgrade_required">
	//*  23   54:invokevirtual   #251 <Method boolean DialogFragmentHelper.isShowing(com.ibotta.android.activity.CompatSupplier, String)>
	//*  24   57:ifeq            61
				{
					return;
	//   25   60:return          
				} else
				{
					upgradeState.ackUpgradeCheck();
	//   26   61:aload_0         
	//   27   62:getfield        #619 <Field UpgradeState upgradeState>
	//   28   65:invokeinterface #624 <Method void UpgradeState.ackUpgradeCheck()>
					s = ((String) (PromptDialogFragment.newInstance(getString(0x7f11013d), getString(0x7f11013c, new Object[] {
						s
					}), new int[] {
						0x7f1101bf, 0x7f110206
					})));
	//   29   70:aload_0         
	//   30   71:ldc2            #625 <Int 0x7f11013d>
	//   31   74:invokevirtual   #629 <Method String getString(int)>
	//   32   77:aload_0         
	//   33   78:ldc2            #630 <Int 0x7f11013c>
	//   34   81:iconst_1        
	//   35   82:anewarray       Object[]
	//   36   85:dup             
	//   37   86:iconst_0        
	//   38   87:aload_1         
	//   39   88:aastore         
	//   40   89:invokevirtual   #633 <Method String getString(int, Object[])>
	//   41   92:iconst_2        
	//   42   93:newarray        int[]
	//   43   95:dup             
	//   44   96:iconst_0        
	//   45   97:ldc2            #634 <Int 0x7f1101bf>
	//   46  100:iastore         
	//   47  101:dup             
	//   48  102:iconst_1        
	//   49  103:ldc2            #336 <Int 0x7f110206>
	//   50  106:iastore         
	//   51  107:invokestatic    #640 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   52  110:astore_1        
					((PromptDialogFragment) (s)).setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   53  111:aload_1         
	//   54  112:aload_0         
	//   55  113:invokevirtual   #644 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
					DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (s)), "app_upgrade");
	//   56  116:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   57  119:aload_0         
	//   58  120:aload_1         
	//   59  121:ldc1            #31  <String "app_upgrade">
	//   60  123:invokevirtual   #648 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
					return;
	//   61  126:return          
				}
			if(s == null)
	//*  62  127:aload_1         
	//*  63  128:ifnonnull       140
				upgradeState.ackUpgradeCheck();
	//   64  131:aload_0         
	//   65  132:getfield        #619 <Field UpgradeState upgradeState>
	//   66  135:invokeinterface #624 <Method void UpgradeState.ackUpgradeCheck()>
			return;
	//   67  140:return          
		} else
		{
			return;
	//   68  141:return          
		}
	}

	public void onUpgradeRequired()
	{
		if(DialogFragmentHelper.INSTANCE.isShowing(((com.ibotta.android.activity.CompatSupplier) (this)), "app_upgrade"))
	//*   0    0:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//*   1    3:aload_0         
	//*   2    4:ldc1            #31  <String "app_upgrade">
	//*   3    6:invokevirtual   #251 <Method boolean DialogFragmentHelper.isShowing(com.ibotta.android.activity.CompatSupplier, String)>
	//*   4    9:ifeq            21
			DialogFragmentHelper.INSTANCE.hide(((com.ibotta.android.activity.CompatSupplier) (this)), "app_upgrade");
	//    5   12:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    6   15:aload_0         
	//    7   16:ldc1            #31  <String "app_upgrade">
	//    8   18:invokevirtual   #653 <Method void DialogFragmentHelper.hide(com.ibotta.android.activity.CompatSupplier, String)>
		showUpgradeRequired();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #282 <Method void showUpgradeRequired()>
	//   11   25:return          
	}

	public void onUserGoalChanged()
	{
	//    0    0:return          
	}

	public void runAsync(Runnable runnable)
	{
		handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #658 <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #664 <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #669 <Method void AppCompatActivity.setContentView(int)>
		checkForToolbar();
	//    3    5:aload_0         
	//    4    6:invokespecial   #671 <Method void checkForToolbar()>
	//    5    9:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #674 <Method void AppCompatActivity.setContentView(View)>
		checkForToolbar();
	//    3    5:aload_0         
	//    4    6:invokespecial   #671 <Method void checkForToolbar()>
	//    5    9:return          
	}

	protected void setPresenter(MvpPresenter mvppresenter)
	{
		mvpPresenter = mvppresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #164 <Field MvpPresenter mvpPresenter>
	//    3    5:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		Toolbar toolbar1 = toolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Toolbar toolbar>
	//    2    4:astore_2        
		if(toolbar1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			toolbar1.setSubtitle(charsequence);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #682 <Method void Toolbar.setSubtitle(CharSequence)>
	//    8   14:return          
	}

	protected void setUnbinder(Unbinder unbinder1)
	{
		unbinder = unbinder1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #417 <Field Unbinder unbinder>
		mvpPresenter.onViewsBound();
	//    3    5:aload_0         
	//    4    6:getfield        #164 <Field MvpPresenter mvpPresenter>
	//    5    9:invokeinterface #687 <Method void MvpPresenter.onViewsBound()>
	//    6   14:return          
	}

	public void showAccount()
	{
		startActivity((new AccountIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #690 <Class AccountIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #691 <Method void AccountIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #692 <Method Intent AccountIntentCreator.create()>
	//    6   12:invokevirtual   #317 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	protected void showErrorMessage(int i, String s)
	{
		showErrorMessage(getString(i), s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #629 <Method String getString(int)>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #695 <Method void showErrorMessage(String, String)>
	//    6   10:return          
	}

	public void showErrorMessage(ApiErrorDetails apierrordetails, String s)
	{
		if(apierrordetails != null && apierrordetails.isError())
	//*   0    0:aload_1         
	//*   1    1:ifnull          58
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #701 <Method boolean ApiErrorDetails.isError()>
	//*   4    8:ifeq            58
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #703 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #704 <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append(getString(0x7f110159));
	//    9   19:aload_3         
	//   10   20:aload_0         
	//   11   21:ldc2            #705 <Int 0x7f110159>
	//   12   24:invokevirtual   #629 <Method String getString(int)>
	//   13   27:invokevirtual   #709 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(" ");
	//   15   31:aload_3         
	//   16   32:ldc2            #711 <String " ">
	//   17   35:invokevirtual   #709 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(apierrordetails.toString());
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #714 <Method String ApiErrorDetails.toString()>
	//   22   44:invokevirtual   #709 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			showErrorMessage(stringbuilder.toString(), s);
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:invokevirtual   #715 <Method String StringBuilder.toString()>
	//   27   53:aload_2         
	//   28   54:invokevirtual   #695 <Method void showErrorMessage(String, String)>
			return;
	//   29   57:return          
		} else
		{
			showErrorMessage(0x7f11015a, s);
	//   30   58:aload_0         
	//   31   59:ldc2            #716 <Int 0x7f11015a>
	//   32   62:aload_2         
	//   33   63:invokevirtual   #277 <Method void showErrorMessage(int, String)>
			return;
	//   34   66:return          
		}
	}

	protected void showErrorMessage(String s, String s1)
	{
		s = ((String) (ErrorDialogFragment.newInstance(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #721 <Method ErrorDialogFragment ErrorDialogFragment.newInstance(String)>
	//    2    4:astore_1        
		((ErrorDialogFragment) (s)).setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #722 <Method void ErrorDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (s)), s1);
	//    6   10:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #648 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   11   19:return          
	}

	public void showFeatured()
	{
		startActivity((new FeaturedIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #500 <Class FeaturedIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #503 <Method void FeaturedIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #504 <Method Intent FeaturedIntentCreator.create()>
	//    6   12:invokevirtual   #317 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showFindRebates()
	{
		startActivity((new FindRebatesIntentCreator(((android.content.Context) (this)), true)).create());
	//    0    0:aload_0         
	//    1    1:new             #726 <Class FindRebatesIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #727 <Method void FindRebatesIntentCreator(android.content.Context, boolean)>
	//    6   10:invokevirtual   #728 <Method Intent FindRebatesIntentCreator.create()>
	//    7   13:invokevirtual   #317 <Method void startActivity(Intent)>
	//    8   16:return          
	}

	public void showIbottaInGooglePlayStore()
	{
		appHelper.openUrlExternally(((Activity) (this)), getString(0x7f1101ad));
	//    0    0:aload_0         
	//    1    1:getfield        #731 <Field AppHelper appHelper>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc2            #732 <Int 0x7f1101ad>
	//    5    9:invokevirtual   #629 <Method String getString(int)>
	//    6   12:invokeinterface #738 <Method void AppHelper.openUrlExternally(Activity, String)>
	//    7   17:return          
	}

	public void showMyRebates()
	{
		startActivity((new MyRebatesIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #741 <Class MyRebatesIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #742 <Method void MyRebatesIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #743 <Method Intent MyRebatesIntentCreator.create()>
	//    6   12:invokevirtual   #317 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showNetworkConnectionErrorDialog()
	{
		(new NetworkConnectionDialog(((android.content.Context) (this)))).show();
	//    0    0:new             #746 <Class NetworkConnectionDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #747 <Method void NetworkConnectionDialog(android.content.Context)>
	//    4    8:invokevirtual   #749 <Method void NetworkConnectionDialog.show()>
	//    5   11:return          
	}

	public void showPwiFlow(RetailerParcel retailerparcel, ContentId contentid)
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, ((Object) (this)), ((Object) (this)), ((Object) (retailerparcel)), ((Object) (contentid)));
	//    0    0:getstatic       #129 <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokestatic    #759 <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object, Object, Object)>
	//    6   10:astore_3        
		try
		{
			retailerparcel = ((RetailerParcel) (new PwiHomeIntentCreator(((android.content.Context) (this)), retailerparcel.getId())));
	//    7   11:new             #761 <Class PwiHomeIntentCreator>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #766 <Method int RetailerParcel.getId()>
	//   12   20:invokespecial   #769 <Method void PwiHomeIntentCreator(android.content.Context, int)>
	//   13   23:astore_1        
		}
	//*  14   24:aload_2         
	//*  15   25:ifnull          34
	//*  16   28:aload_1         
	//*  17   29:aload_2         
	//*  18   30:invokevirtual   #773 <Method PwiHomeIntentCreator PwiHomeIntentCreator.contentId(ContentId)>
	//*  19   33:pop             
	//*  20   34:aload_0         
	//*  21   35:aload_1         
	//*  22   36:invokevirtual   #774 <Method Intent PwiHomeIntentCreator.create()>
	//*  23   39:invokevirtual   #317 <Method void startActivity(Intent)>
	//*  24   42:invokestatic    #780 <Method TrackingAspect TrackingAspect.aspectOf()>
	//*  25   45:aload_3         
	//*  26   46:invokevirtual   #784 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
	//*  27   49:return          
		// Misplaced declaration of an exception variable
		catch(RetailerParcel retailerparcel)
	//*  28   50:astore_1        
		{
			TrackingAspect.aspectOf().after(joinpoint);
	//   29   51:invokestatic    #780 <Method TrackingAspect TrackingAspect.aspectOf()>
	//   30   54:aload_3         
	//   31   55:invokevirtual   #784 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
			throw retailerparcel;
	//   32   58:aload_1         
	//   33   59:athrow          
		}
		if(contentid == null)
			break MISSING_BLOCK_LABEL_34;
		((PwiHomeIntentCreator) (retailerparcel)).contentId(contentid);
		startActivity(((PwiHomeIntentCreator) (retailerparcel)).create());
		TrackingAspect.aspectOf().after(joinpoint);
		return;
	}

	protected void showQuickMessage(int i)
	{
		showQuickMessage(getString(i), false, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #629 <Method String getString(int)>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #789 <Method void showQuickMessage(String, boolean, boolean)>
	//    7   11:return          
	}

	protected void showQuickMessage(int i, boolean flag)
	{
		showQuickMessage(getString(i), flag, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #629 <Method String getString(int)>
	//    4    6:iload_2         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #789 <Method void showQuickMessage(String, boolean, boolean)>
	//    7   11:return          
	}

	protected void showQuickMessage(int i, boolean flag, boolean flag1)
	{
		showQuickMessage(i, flag, flag1, ((com.ibotta.android.mvp.ui.view.dialog.NotificationDialog.NotificationDialogListener) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #794 <Method void showQuickMessage(int, boolean, boolean, com.ibotta.android.mvp.ui.view.dialog.NotificationDialog$NotificationDialogListener)>
	//    6    8:return          
	}

	protected void showQuickMessage(int i, boolean flag, boolean flag1, com.ibotta.android.mvp.ui.view.dialog.NotificationDialog.NotificationDialogListener notificationdialoglistener)
	{
		showQuickMessage(getString(i), flag, flag1, notificationdialoglistener);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #629 <Method String getString(int)>
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:invokevirtual   #797 <Method void showQuickMessage(String, boolean, boolean, com.ibotta.android.mvp.ui.view.dialog.NotificationDialog$NotificationDialogListener)>
	//    8   13:return          
	}

	protected void showQuickMessage(String s)
	{
		showQuickMessage(s, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #789 <Method void showQuickMessage(String, boolean, boolean)>
	//    5    7:return          
	}

	protected void showQuickMessage(String s, boolean flag, boolean flag1)
	{
		showQuickMessage(s, flag, flag1, ((com.ibotta.android.mvp.ui.view.dialog.NotificationDialog.NotificationDialogListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #797 <Method void showQuickMessage(String, boolean, boolean, com.ibotta.android.mvp.ui.view.dialog.NotificationDialog$NotificationDialogListener)>
	//    6    8:return          
	}

	protected void showQuickMessage(String s, boolean flag, boolean flag1, com.ibotta.android.mvp.ui.view.dialog.NotificationDialog.NotificationDialogListener notificationdialoglistener)
	{
		final NotificationDialog notificationDialog = new NotificationDialog(((android.content.Context) (this)));
	//    0    0:new             #437 <Class NotificationDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #798 <Method void NotificationDialog(android.content.Context)>
	//    4    8:astore          5
		if(flag)
	//*   5   10:iload_2         
	//*   6   11:ifeq            22
			notificationDialog.showStar();
	//    7   14:aload           5
	//    8   16:invokevirtual   #801 <Method void NotificationDialog.showStar()>
		else
	//*   9   19:goto            27
			notificationDialog.hideStar();
	//   10   22:aload           5
	//   11   24:invokevirtual   #804 <Method void NotificationDialog.hideStar()>
		if(flag1)
	//*  12   27:iload_3         
	//*  13   28:ifeq            39
			notificationDialog.makePink();
	//   14   31:aload           5
	//   15   33:invokevirtual   #807 <Method void NotificationDialog.makePink()>
		else
	//*  16   36:goto            44
			notificationDialog.makeGreen();
	//   17   39:aload           5
	//   18   41:invokevirtual   #810 <Method void NotificationDialog.makeGreen()>
		if(notificationdialoglistener != null)
	//*  19   44:aload           4
	//*  20   46:ifnull          59
			notificationDialog.setListener(notificationdialoglistener);
	//   21   49:aload           5
	//   22   51:aload           4
	//   23   53:invokevirtual   #813 <Method void NotificationDialog.setListener(com.ibotta.android.mvp.ui.view.dialog.NotificationDialog$NotificationDialogListener)>
		else
	//*  24   56:goto            74
			notificationDialog.setListener(new com.ibotta.android.mvp.ui.view.dialog.NotificationDialog.NotificationDialogListener() {

				public void onDismissedNotificationClicked()
				{
					MvpActivity.this.onDismissedNotificationClicked(notificationDialog);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field MvpActivity this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field NotificationDialog val$notificationDialog>
				//    4    8:invokevirtual   #29  <Method void MvpActivity.onDismissedNotificationClicked(NotificationDialog)>
				//    5   11:return          
				}

				final MvpActivity this$0;
				final NotificationDialog val$notificationDialog;

			
			{
				this$0 = MvpActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MvpActivity this$0>
				notificationDialog = notificationdialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field NotificationDialog val$notificationDialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   25   59:aload           5
	//   26   61:new             #21  <Class MvpActivity$1>
	//   27   64:dup             
	//   28   65:aload_0         
	//   29   66:aload           5
	//   30   68:invokespecial   #816 <Method void MvpActivity$1(MvpActivity, NotificationDialog)>
	//   31   71:invokevirtual   #813 <Method void NotificationDialog.setListener(com.ibotta.android.mvp.ui.view.dialog.NotificationDialog$NotificationDialogListener)>
		notificationDialog.setup(s);
	//   32   74:aload           5
	//   33   76:aload_1         
	//   34   77:invokevirtual   #819 <Method void NotificationDialog.setup(String)>
		notificationDialog.show();
	//   35   80:aload           5
	//   36   82:invokevirtual   #820 <Method void NotificationDialog.show()>
	//   37   85:return          
	}

	public void showRedeem()
	{
		redeemHelper.redeem();
	//    0    0:aload_0         
	//    1    1:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//    2    4:invokevirtual   #824 <Method void RedeemPreFlightHelper.redeem()>
	//    3    7:return          
	}

	public void showRedeem(RetailerParcel retailerparcel, List list)
	{
		redeemHelper.redeem(retailerparcel, list);
	//    0    0:aload_0         
	//    1    1:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #827 <Method void RedeemPreFlightHelper.redeem(RetailerParcel, List)>
	//    5    9:return          
	}

	public void showRedeemLoyaltyReceipt(RetailerParcel retailerparcel, List list)
	{
		redeemHelper.redeemLoyaltyReceipt(retailerparcel, list);
	//    0    0:aload_0         
	//    1    1:getfield        #391 <Field RedeemPreFlightHelper redeemHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #832 <Method void RedeemPreFlightHelper.redeemLoyaltyReceipt(RetailerParcel, List)>
	//    5    9:return          
	}

	public void showUnknownErrorMessage()
	{
		ErrorDialogFragment errordialogfragment = ErrorDialogFragment.newInstance(getString(0x7f11015a));
	//    0    0:aload_0         
	//    1    1:ldc2            #716 <Int 0x7f11015a>
	//    2    4:invokevirtual   #629 <Method String getString(int)>
	//    3    7:invokestatic    #721 <Method ErrorDialogFragment ErrorDialogFragment.newInstance(String)>
	//    4   10:astore_1        
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (errordialogfragment)));
	//    5   11:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #836 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment)>
	//    9   19:return          
	}

	public void showUnlockAnimation()
	{
		showUnlockAnimation(((android.content.DialogInterface.OnCancelListener) (null)), ((android.content.DialogInterface.OnDismissListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #840 <Method void showUnlockAnimation(android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnDismissListener)>
	//    4    6:return          
	}

	public void showUnlockAnimation(android.content.DialogInterface.OnCancelListener oncancellistener, android.content.DialogInterface.OnDismissListener ondismisslistener)
	{
		UnlockAnimationDialog unlockanimationdialog = new UnlockAnimationDialog(((android.content.Context) (this)));
	//    0    0:new             #842 <Class UnlockAnimationDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #843 <Method void UnlockAnimationDialog(android.content.Context)>
	//    4    8:astore_3        
		unlockanimationdialog.setOnCancelListener(oncancellistener);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #847 <Method void UnlockAnimationDialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		unlockanimationdialog.setOnDismissListener(ondismisslistener);
	//    8   14:aload_3         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #851 <Method void UnlockAnimationDialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		unlockanimationdialog.show();
	//   11   19:aload_3         
	//   12   20:invokevirtual   #852 <Method void UnlockAnimationDialog.show()>
	//   13   23:return          
	}

	protected void showUpgradeRequired()
	{
		PromptDialogFragment promptdialogfragment = PromptDialogFragment.newInstance(getString(0x7f110208), getString(0x7f110207), new int[] {
			0x7f110206
		});
	//    0    0:aload_0         
	//    1    1:ldc2            #853 <Int 0x7f110208>
	//    2    4:invokevirtual   #629 <Method String getString(int)>
	//    3    7:aload_0         
	//    4    8:ldc2            #854 <Int 0x7f110207>
	//    5   11:invokevirtual   #629 <Method String getString(int)>
	//    6   14:iconst_1        
	//    7   15:newarray        int[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:ldc2            #336 <Int 0x7f110206>
	//   11   22:iastore         
	//   12   23:invokestatic    #640 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   13   26:astore_1        
		promptdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #644 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (promptdialogfragment)), "upgrade_required");
	//   17   32:getstatic       #247 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:ldc1            #37  <String "upgrade_required">
	//   21   39:invokevirtual   #648 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   22   42:return          
	}

	public void startActivity(Intent intent)
	{
		super.startActivity(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #855 <Method void AppCompatActivity.startActivity(Intent)>
		overridePendingTransition(0, 0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #185 <Method void overridePendingTransition(int, int)>
	//    7   11:return          
	}

	public void startActivityForResult(Intent intent, int i)
	{
		super.startActivityForResult(intent, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #859 <Method void AppCompatActivity.startActivityForResult(Intent, int)>
		overridePendingTransition(0, 0);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #185 <Method void overridePendingTransition(int, int)>
	//    8   12:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		super.startActivityForResult(intent, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #862 <Method void AppCompatActivity.startActivityForResult(Intent, int, Bundle)>
		overridePendingTransition(0, 0);
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #185 <Method void overridePendingTransition(int, int)>
	//    9   13:return          
	}

	public static final String TAG_APP_CACHE_LOW = "app_cache_low";
	public static final String TAG_APP_UPGRADE = "app_upgrade";
	public static final String TAG_MAINTENANCE_MODE = "maintenance_mode";
	public static final String TAG_UPGRADE_REQUIRED = "upgrade_required";
	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
	public Trace _nr_trace;
	AppCacheState appCacheState;
	AppHelper appHelper;
	AuthManager authManager;
	BuildProfile buildProfile;
	ButtonSdkManager buttonSdkManager;
	CacheClearJobFactory cacheClearFactory;
	DebugState debugState;
	GlobalEventManager globalEventManager;
	Handler handler;
	protected Menu menu;
	private MvpComponent mvpComponent;
	protected MvpPresenter mvpPresenter;
	NotificationTracking notificationTracking;
	protected RedeemPreFlightHelper redeemHelper;
	protected Toolbar toolbar;
	Tracker tracker;
	TrackingFlushWorker trackingFlushWorker;
	private Unbinder unbinder;
	private boolean upgradeCheck;
	UpgradeState upgradeState;

	static 
	{
		ajc$preClinit();
	//    0    0:invokestatic    #90  <Method void ajc$preClinit()>
	//*   1    3:return          
	}
}
