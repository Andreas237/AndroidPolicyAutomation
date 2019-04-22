// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.ButterKnife;
import com.ibotta.android.aop.tracking.TrackingAspect;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.fragment.dialog.DialogFragmentHelper;
import com.ibotta.android.fragment.dialog.FullImageDialogFragment;
import com.ibotta.android.fragment.retailer.RetailerParcel;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.loading.PtrLoadingMvpActivity;
import com.ibotta.android.mvp.ui.activity.account.row.AbstractAccountRow;
import com.ibotta.android.mvp.ui.activity.account.row.AccountMenuRow;
import com.ibotta.android.mvp.ui.activity.bonus.BonusesPickerActivity;
import com.ibotta.android.mvp.ui.activity.earnings.EarningsActivity;
import com.ibotta.android.mvp.ui.misc.BottomNavIdentifier;
import com.ibotta.android.mvp.ui.misc.scrolllistner.SincereSwipeRefreshScrollListener;
import com.ibotta.android.mvp.ui.view.IBSwipeRefreshLayout;
import com.ibotta.android.mvp.ui.view.ScrollingBottomSpace;
import com.ibotta.android.mvp.ui.view.nav.NavBarView;
import com.ibotta.android.mvp.ui.view.nav.NavButtonType;
import com.ibotta.android.routing.intent.*;
import com.ibotta.android.security.DeviceSecurity;
import com.ibotta.android.service.api.job.CacheClearBatchApiJob;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.social.facebook.FacebookManager;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.state.app.config.invitefriends.InviteFriendsCopyConfig;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import com.ibotta.android.util.AppHelper;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountAdapterListener, AccountView, AccountAdapter, DaggerAccountComponent, 
//			AccountModule, AccountComponent, AccountPresenter, AccountMenu

public class AccountActivity extends PtrLoadingMvpActivity
	implements AccountAdapterListener, AccountView, BottomNavIdentifier, com.ibotta.android.social.facebook.FacebookManager.FacebookAuthListener, com.ibotta.android.social.facebook.FacebookManager.FacebookInfoListener, com.ibotta.android.social.facebook.FacebookManager.FacebookLinkListener, com.ibotta.android.social.facebook.FacebookManager.FacebookUiListener
{

	public AccountActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void PtrLoadingMvpActivity()>
	//    2    4:return          
	}

	private static void ajc$preClinit()
	{
		Factory factory = new Factory("AccountActivity.java", com/ibotta/android/mvp/ui/activity/account/AccountActivity);
	//    0    0:new             #62  <Class Factory>
	//    1    3:dup             
	//    2    4:ldc1            #64  <String "AccountActivity.java">
	//    3    6:ldc1            #2   <Class AccountActivity>
	//    4    8:invokespecial   #67  <Method void Factory(String, Class)>
	//    5   11:astore_0        
		ajc$tjp_0 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("1", "onNavButtonSelected", "com.ibotta.android.mvp.ui.activity.account.AccountActivity", "com.ibotta.android.mvp.ui.view.nav.NavButtonType", "navButtonType", "", "void"))), 172);
	//    6   12:aload_0         
	//    7   13:ldc1            #69  <String "method-execution">
	//    8   15:aload_0         
	//    9   16:ldc1            #71  <String "1">
	//   10   18:ldc1            #73  <String "onNavButtonSelected">
	//   11   20:ldc1            #75  <String "com.ibotta.android.mvp.ui.activity.account.AccountActivity">
	//   12   22:ldc1            #77  <String "com.ibotta.android.mvp.ui.view.nav.NavButtonType">
	//   13   24:ldc1            #79  <String "navButtonType">
	//   14   26:ldc1            #81  <String "">
	//   15   28:ldc1            #83  <String "void">
	//   16   30:invokevirtual   #87  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   17   33:sipush          172
	//   18   36:invokevirtual   #91  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   19   39:putstatic       #93  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//   20   42:return          
	}

	private void initAdapter()
	{
		adapter = new AccountAdapter();
	//    0    0:aload_0         
	//    1    1:new             #96  <Class AccountAdapter>
	//    2    4:dup             
	//    3    5:invokespecial   #97  <Method void AccountAdapter()>
	//    4    8:putfield        #99  <Field AccountAdapter adapter>
		adapter.setListener(((AccountAdapterListener) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #99  <Field AccountAdapter adapter>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #103 <Method void AccountAdapter.setListener(AccountAdapterListener)>
		rvRecycler.setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(((android.content.Context) (this)), 1, false))));
	//    9   19:aload_0         
	//   10   20:getfield        #105 <Field RecyclerView rvRecycler>
	//   11   23:new             #107 <Class LinearLayoutManager>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:iconst_0        
	//   16   30:invokespecial   #110 <Method void LinearLayoutManager(android.content.Context, int, boolean)>
	//   17   33:invokevirtual   #116 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		rvRecycler.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (adapter)));
	//   18   36:aload_0         
	//   19   37:getfield        #105 <Field RecyclerView rvRecycler>
	//   20   40:aload_0         
	//   21   41:getfield        #99  <Field AccountAdapter adapter>
	//   22   44:invokevirtual   #120 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
	//   23   47:return          
	}

	private void initNavBar()
	{
		nbvNavBar.setListener(((com.ibotta.android.mvp.ui.view.nav.NavBarListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field NavBarView nbvNavBar>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #128 <Method void NavBarView.setListener(com.ibotta.android.mvp.ui.view.nav.NavBarListener)>
	//    4    8:return          
	}

	private void initScrollListener()
	{
		rvRecycler.addOnScrollListener(((android.support.v7.widget.RecyclerView.OnScrollListener) (new SincereSwipeRefreshScrollListener(((SwipeRefreshLayout) (srlSwipeRefresh))))));
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field RecyclerView rvRecycler>
	//    2    4:new             #131 <Class SincereSwipeRefreshScrollListener>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field IBSwipeRefreshLayout srlSwipeRefresh>
	//    6   12:invokespecial   #136 <Method void SincereSwipeRefreshScrollListener(SwipeRefreshLayout)>
	//    7   15:invokevirtual   #140 <Method void RecyclerView.addOnScrollListener(android.support.v7.widget.RecyclerView$OnScrollListener)>
	//    8   18:return          
	}

	private void initScrollingBottomSpace()
	{
		scrollingBottomSpace.setBottomPadding(((android.view.View) (rvRecycler)));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ScrollingBottomSpace scrollingBottomSpace>
	//    2    4:aload_0         
	//    3    5:getfield        #105 <Field RecyclerView rvRecycler>
	//    4    8:invokevirtual   #149 <Method void ScrollingBottomSpace.setBottomPadding(android.view.View)>
	//    5   11:return          
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #154 <Method AccountComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected AccountComponent createComponent(MainComponent maincomponent)
	{
		return DaggerAccountComponent.builder().mainComponent(maincomponent).accountModule(new AccountModule(((AccountView) (this)))).build();
	//    0    0:invokestatic    #160 <Method DaggerAccountComponent$Builder DaggerAccountComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #166 <Method DaggerAccountComponent$Builder DaggerAccountComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #168 <Class AccountModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #171 <Method void AccountModule(AccountView)>
	//    7   15:invokevirtual   #175 <Method DaggerAccountComponent$Builder DaggerAccountComponent$Builder.accountModule(AccountModule)>
	//    8   18:invokevirtual   #179 <Method AccountComponent DaggerAccountComponent$Builder.build()>
	//    9   21:areturn         
	}

	public EventContext getEventContext()
	{
		return EventContext.ACTIVITY;
	//    0    0:getstatic       #187 <Field EventContext EventContext.ACTIVITY>
	//    1    3:areturn         
	}

	public volatile SwipeRefreshLayout getPtrView()
	{
		return ((SwipeRefreshLayout) (getPtrView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #192 <Method IBSwipeRefreshLayout getPtrView()>
	//    2    4:areturn         
	}

	public IBSwipeRefreshLayout getPtrView()
	{
		return srlSwipeRefresh;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field IBSwipeRefreshLayout srlSwipeRefresh>
	//    2    4:areturn         
	}

	public RetailerParcel getRetailerParcel()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public NavButtonType getTabContext()
	{
		return NavButtonType.ACCOUNT;
	//    0    0:getstatic       #204 <Field NavButtonType NavButtonType.ACCOUNT>
	//    1    3:areturn         
	}

	public void hideFacebookLoading()
	{
		hideSubmittedJobLoading();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method void hideSubmittedJobLoading()>
	//    2    4:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((AccountComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #212 <Class AccountComponent>
	//    3    5:invokevirtual   #215 <Method void inject(AccountComponent)>
	//    4    8:return          
	}

	protected void inject(AccountComponent accountcomponent)
	{
		accountcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #218 <Method void AccountComponent.inject(AccountActivity)>
	//    3    7:return          
	}

	public boolean isAutoSocialConnect()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected boolean isBackSupported()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void linkAccount()
	{
		if(fbManager.ensureFacebookSession())
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field FacebookManager fbManager>
	//*   2    4:invokevirtual   #229 <Method boolean FacebookManager.ensureFacebookSession()>
	//*   3    7:ifeq            17
			fbManager.fetchInfo();
	//    4   10:aload_0         
	//    5   11:getfield        #224 <Field FacebookManager fbManager>
	//    6   14:invokevirtual   #232 <Method void FacebookManager.fetchInfo()>
	//    7   17:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #236 <Method void PtrLoadingMvpActivity.onActivityResult(int, int, Intent)>
		fbManager.onActivityResult(i, j, intent);
	//    5    7:aload_0         
	//    6    8:getfield        #224 <Field FacebookManager fbManager>
	//    7   11:iload_1         
	//    8   12:iload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #237 <Method void FacebookManager.onActivityResult(int, int, Intent)>
	//   11   17:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method void PtrLoadingMvpActivity.onCreate(Bundle)>
		fbManager.setUiListener(((com.ibotta.android.social.facebook.FacebookManager.FacebookUiListener) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #224 <Field FacebookManager fbManager>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #245 <Method void FacebookManager.setUiListener(com.ibotta.android.social.facebook.FacebookManager$FacebookUiListener)>
		fbManager.setInfoListener(((com.ibotta.android.social.facebook.FacebookManager.FacebookInfoListener) (this)));
	//    7   13:aload_0         
	//    8   14:getfield        #224 <Field FacebookManager fbManager>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #249 <Method void FacebookManager.setInfoListener(com.ibotta.android.social.facebook.FacebookManager$FacebookInfoListener)>
		fbManager.setAuthListener(((com.ibotta.android.social.facebook.FacebookManager.FacebookAuthListener) (this)));
	//   11   21:aload_0         
	//   12   22:getfield        #224 <Field FacebookManager fbManager>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #253 <Method void FacebookManager.setAuthListener(com.ibotta.android.social.facebook.FacebookManager$FacebookAuthListener)>
		fbManager.setLinkListener(((com.ibotta.android.social.facebook.FacebookManager.FacebookLinkListener) (this)));
	//   15   29:aload_0         
	//   16   30:getfield        #224 <Field FacebookManager fbManager>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #257 <Method void FacebookManager.setLinkListener(com.ibotta.android.social.facebook.FacebookManager$FacebookLinkListener)>
		setContentView(0x7f0c001c);
	//   19   37:aload_0         
	//   20   38:ldc2            #258 <Int 0x7f0c001c>
	//   21   41:invokevirtual   #262 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((android.app.Activity) (this))));
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:invokestatic    #268 <Method butterknife.Unbinder ButterKnife.bind(android.app.Activity)>
	//   25   49:invokevirtual   #272 <Method void setUnbinder(butterknife.Unbinder)>
		initNavBar();
	//   26   52:aload_0         
	//   27   53:invokespecial   #274 <Method void initNavBar()>
		initAdapter();
	//   28   56:aload_0         
	//   29   57:invokespecial   #276 <Method void initAdapter()>
		initScrollListener();
	//   30   60:aload_0         
	//   31   61:invokespecial   #278 <Method void initScrollListener()>
		initScrollingBottomSpace();
	//   32   64:aload_0         
	//   33   65:invokespecial   #280 <Method void initScrollingBottomSpace()>
		fbManager.onCreate();
	//   34   68:aload_0         
	//   35   69:getfield        #224 <Field FacebookManager fbManager>
	//   36   72:invokevirtual   #282 <Method void FacebookManager.onCreate()>
	//   37   75:return          
	}

	protected void onDestroy()
	{
		fbManager.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field FacebookManager fbManager>
	//    2    4:invokevirtual   #286 <Method void FacebookManager.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #287 <Method void PtrLoadingMvpActivity.onDestroy()>
	//    5   11:return          
	}

	public void onEarningsProgressBarClicked()
	{
		((AccountPresenter)mvpPresenter).onEarningsProgressBarClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #296 <Method void AccountPresenter.onEarningsProgressBarClicked()>
	//    4   12:return          
	}

	public void onFacebookAuthFailed()
	{
		((AccountPresenter)mvpPresenter).onFacebookAuthFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #299 <Method void AccountPresenter.onFacebookAuthFailed()>
	//    4   12:return          
	}

	public void onFacebookAuthSuccess()
	{
		fbManager.fetchInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field FacebookManager fbManager>
	//    2    4:invokevirtual   #232 <Method void FacebookManager.fetchInfo()>
	//    3    7:return          
	}

	public void onFacebookInfoFailed()
	{
		((AccountPresenter)mvpPresenter).onFacebookInfoFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #303 <Method void AccountPresenter.onFacebookInfoFailed()>
	//    4   12:return          
	}

	public void onFacebookInfoSuccess()
	{
		fbManager.linkFacebookToIbotta();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field FacebookManager fbManager>
	//    2    4:invokevirtual   #307 <Method void FacebookManager.linkFacebookToIbotta()>
	//    3    7:return          
	}

	public void onFacebookLinkFailed()
	{
		((AccountPresenter)mvpPresenter).onFacebookLinkFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #310 <Method void AccountPresenter.onFacebookLinkFailed()>
	//    4   12:return          
	}

	public void onFacebookLinkSuccess()
	{
		cacheClearFactory.create().clearCustomer(false).clear();
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field CacheClearJobFactory cacheClearFactory>
	//    2    4:invokevirtual   #319 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #325 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//    5   11:invokevirtual   #328 <Method void CacheClearBatchApiJob.clear()>
		((AccountPresenter)mvpPresenter).onRefresh();
	//    6   14:aload_0         
	//    7   15:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    8   18:checkcast       #294 <Class AccountPresenter>
	//    9   21:invokeinterface #331 <Method void AccountPresenter.onRefresh()>
	//   10   26:return          
	}

	public void onFacebookUnlinkFailed()
	{
		((AccountPresenter)mvpPresenter).onFacebookUnlinkFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #334 <Method void AccountPresenter.onFacebookUnlinkFailed()>
	//    4   12:return          
	}

	public void onFacebookUnlinkSuccess()
	{
		((AccountPresenter)mvpPresenter).onRefresh();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #331 <Method void AccountPresenter.onRefresh()>
	//    4   12:return          
	}

	public void onLinkAccountClicked()
	{
		((AccountPresenter)mvpPresenter).onLinkAccountClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #338 <Method void AccountPresenter.onLinkAccountClicked()>
	//    4   12:return          
	}

	public void onNavButtonSelected(NavButtonType navbuttontype)
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, ((Object) (this)), ((Object) (this)), ((Object) (navbuttontype)));
	//    0    0:getstatic       #93  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #348 <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object, Object)>
	//    5    9:astore_2        
label0:
		{
			if(navbuttontype == NavButtonType.ACCOUNT)
	//*   6   10:aload_1         
	//*   7   11:getstatic       #204 <Field NavButtonType NavButtonType.ACCOUNT>
	//*   8   14:if_acmpne       28
			{
				rvRecycler.smoothScrollToPosition(0);
	//    9   17:aload_0         
	//   10   18:getfield        #105 <Field RecyclerView rvRecycler>
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #351 <Method void RecyclerView.smoothScrollToPosition(int)>
				break label0;
	//   13   25:goto            33
			}
			try
			{
				super.onNavButtonSelected(navbuttontype);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokespecial   #353 <Method void PtrLoadingMvpActivity.onNavButtonSelected(NavButtonType)>
			}
	//*  17   33:invokestatic    #359 <Method TrackingAspect TrackingAspect.aspectOf()>
	//*  18   36:aload_2         
	//*  19   37:invokevirtual   #363 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(NavButtonType navbuttontype)
	//*  21   41:astore_1        
			{
				TrackingAspect.aspectOf().after(joinpoint);
	//   22   42:invokestatic    #359 <Method TrackingAspect TrackingAspect.aspectOf()>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #363 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
				throw navbuttontype;
	//   25   49:aload_1         
	//   26   50:athrow          
			}
		}
		TrackingAspect.aspectOf().after(joinpoint);
		return;
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #368 <Method void PtrLoadingMvpActivity.onNewIntent(Intent)>
		setIntent(intent);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #371 <Method void setIntent(Intent)>
	//    6   10:return          
	}

	public void onPendingReceiptsClicked()
	{
		((AccountPresenter)mvpPresenter).onPendingReceiptsClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #374 <Method void AccountPresenter.onPendingReceiptsClicked()>
	//    4   12:return          
	}

	public void onProfileImageClicked()
	{
		((AccountPresenter)mvpPresenter).onProfileImageClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #377 <Method void AccountPresenter.onProfileImageClicked()>
	//    4   12:return          
	}

	public void onQuestionMarkClicked()
	{
		((AccountPresenter)mvpPresenter).onQuestionMarkClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #380 <Method void AccountPresenter.onQuestionMarkClicked()>
	//    4   12:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #383 <Method void PtrLoadingMvpActivity.onResume()>
		brazeTracking.trackAccountView();
	//    2    4:aload_0         
	//    3    5:getfield        #385 <Field BrazeTracking brazeTracking>
	//    4    8:invokeinterface #390 <Method void BrazeTracking.trackAccountView()>
	//    5   13:return          
	}

	public void onRowClicked(AccountMenu accountmenu)
	{
		((AccountPresenter)mvpPresenter).onRowClicked(accountmenu);
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #394 <Method void AccountPresenter.onRowClicked(AccountMenu)>
	//    5   13:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #397 <Method void PtrLoadingMvpActivity.onStart()>
		nbvNavBar.setup(NavButtonType.ACCOUNT);
	//    2    4:aload_0         
	//    3    5:getfield        #123 <Field NavBarView nbvNavBar>
	//    4    8:getstatic       #204 <Field NavButtonType NavButtonType.ACCOUNT>
	//    5   11:invokevirtual   #400 <Method void NavBarView.setup(NavButtonType)>
	//    6   14:return          
	}

	public void onWithdrawCashClicked()
	{
		((AccountPresenter)mvpPresenter).onWithdrawCashClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #294 <Class AccountPresenter>
	//    3    7:invokeinterface #403 <Method void AccountPresenter.onWithdrawCashClicked()>
	//    4   12:return          
	}

	public void setAccountRows(List list)
	{
		Iterator iterator = list.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #411 <Method Iterator List.iterator()>
	//    2    6:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    3    7:aload_2         
	//    4    8:invokeinterface #416 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            75
			Object obj = ((Object) ((AbstractAccountRow)iterator.next()));
	//    6   16:aload_2         
	//    7   17:invokeinterface #420 <Method Object Iterator.next()>
	//    8   22:checkcast       #422 <Class AbstractAccountRow>
	//    9   25:astore_3        
			if(obj instanceof AccountMenuRow)
	//*  10   26:aload_3         
	//*  11   27:instanceof      #424 <Class AccountMenuRow>
	//*  12   30:ifeq            7
			{
				obj = ((Object) ((AccountMenuRow)obj));
	//   13   33:aload_3         
	//   14   34:checkcast       #424 <Class AccountMenuRow>
	//   15   37:astore_3        
				static class _cls1
				{

					static final int $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[];

					static 
					{
						$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu = new int[AccountMenu.values().length];
					//    0    0:invokestatic    #18  <Method AccountMenu[] AccountMenu.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
						try
						{
							$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.INVITE_FRIENDS.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
					//    5   12:getstatic       #24  <Field AccountMenu AccountMenu.INVITE_FRIENDS>
					//    6   15:invokevirtual   #28  <Method int AccountMenu.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
					//    9   20:return          
						}
						catch(NoSuchFieldError nosuchfielderror) { }
					//   10   21:astore_0        
					//*  11   22:return          
					}
				}

				if(_cls1..SwitchMap.com.ibotta.android.mvp.ui.activity.account.AccountMenu[((AccountMenuRow) (obj)).getAccountMenu().ordinal()] == 1)
	//*  16   38:getstatic       #428 <Field int[] AccountActivity$1.$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  17   41:aload_3         
	//*  18   42:invokevirtual   #432 <Method AccountMenu AccountMenuRow.getAccountMenu()>
	//*  19   45:invokevirtual   #438 <Method int AccountMenu.ordinal()>
	//*  20   48:iaload          
	//*  21   49:iconst_1        
	//*  22   50:icmpeq          56
	//*  23   53:goto            7
					((AccountMenuRow) (obj)).setExtra(appConfig.getInviteFriendsCopy().getMenuCta());
	//   24   56:aload_3         
	//   25   57:aload_0         
	//   26   58:getfield        #440 <Field AppConfig appConfig>
	//   27   61:invokeinterface #446 <Method InviteFriendsCopyConfig AppConfig.getInviteFriendsCopy()>
	//   28   66:invokevirtual   #452 <Method String InviteFriendsCopyConfig.getMenuCta()>
	//   29   69:invokevirtual   #456 <Method void AccountMenuRow.setExtra(String)>
			}
		} while(true);
	//   30   72:goto            7
		adapter.setListener(((AccountAdapterListener) (this)));
	//   31   75:aload_0         
	//   32   76:getfield        #99  <Field AccountAdapter adapter>
	//   33   79:aload_0         
	//   34   80:invokevirtual   #103 <Method void AccountAdapter.setListener(AccountAdapterListener)>
		adapter.setAccountMenu(list);
	//   35   83:aload_0         
	//   36   84:getfield        #99  <Field AccountAdapter adapter>
	//   37   87:aload_1         
	//   38   88:invokevirtual   #459 <Method void AccountAdapter.setAccountMenu(List)>
	//   39   91:return          
	}

	public void setTitleForLoadFailure()
	{
		setTitle(0x7f110135);
	//    0    0:aload_0         
	//    1    1:ldc2            #463 <Int 0x7f110135>
	//    2    4:invokevirtual   #466 <Method void setTitle(int)>
	//    3    7:return          
	}

	public void showBonuses()
	{
		BonusesPickerActivity.start(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #473 <Method void BonusesPickerActivity.start(android.content.Context)>
	//    2    4:return          
	}

	public void showFacebookLoading(String s)
	{
		showSubmittedJobLoading(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #477 <Method void showSubmittedJobLoading(String)>
	//    3    5:return          
	}

	public void showFullscreenProfilePic(String s)
	{
		s = ((String) (FullImageDialogFragment.newInstance(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #484 <Method FullImageDialogFragment FullImageDialogFragment.newInstance(String)>
	//    2    4:astore_1        
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (s)));
	//    3    5:getstatic       #490 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #494 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment)>
	//    7   13:return          
	}

	public void showGiftCards()
	{
		startActivity((new WalletIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #497 <Class WalletIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #499 <Method void WalletIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #502 <Method Intent WalletIntentCreator.create()>
	//    6   12:invokevirtual   #505 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showHelp()
	{
		startActivity((new HelpCenterIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #508 <Class HelpCenterIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #509 <Method void HelpCenterIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #510 <Method Intent HelpCenterIntentCreator.create()>
	//    6   12:invokevirtual   #505 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showHowTo()
	{
		appHelper.openUrlExternally(((android.app.Activity) (this)), appConfig.getHowToUseIbottaUrl());
	//    0    0:aload_0         
	//    1    1:getfield        #513 <Field AppHelper appHelper>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #440 <Field AppConfig appConfig>
	//    5    9:invokeinterface #516 <Method String AppConfig.getHowToUseIbottaUrl()>
	//    6   14:invokeinterface #522 <Method void AppHelper.openUrlExternally(android.app.Activity, String)>
	//    7   19:return          
	}

	public void showInviteFriends()
	{
		startActivity((new InviteIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #525 <Class InviteIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #526 <Method void InviteIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #527 <Method Intent InviteIntentCreator.create()>
	//    6   12:invokevirtual   #505 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showMyEarnings()
	{
		startActivity((new MyEarningsIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #530 <Class MyEarningsIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #531 <Method void MyEarningsIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #532 <Method Intent MyEarningsIntentCreator.create()>
	//    6   12:invokevirtual   #505 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showMyFavorites()
	{
		startActivity((new FavoritesIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #535 <Class FavoritesIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #536 <Method void FavoritesIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #537 <Method Intent FavoritesIntentCreator.create()>
	//    6   12:invokevirtual   #505 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showPendingReceipts()
	{
		EarningsActivity.start(((android.content.Context) (this)), true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #543 <Method void EarningsActivity.start(android.content.Context, boolean)>
	//    3    5:return          
	}

	public void showSettings()
	{
		startActivity((new SettingsIntentCreator(((android.content.Context) (this)), com.ibotta.android.routing.intent.SettingsIntentCreator.SettingsDestination.SETTINGS)).create());
	//    0    0:aload_0         
	//    1    1:new             #546 <Class SettingsIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getstatic       #552 <Field com.ibotta.android.routing.intent.SettingsIntentCreator$SettingsDestination com.ibotta.android.routing.intent.SettingsIntentCreator$SettingsDestination.SETTINGS>
	//    5    9:invokespecial   #555 <Method void SettingsIntentCreator(android.content.Context, com.ibotta.android.routing.intent.SettingsIntentCreator$SettingsDestination)>
	//    6   12:invokevirtual   #556 <Method Intent SettingsIntentCreator.create()>
	//    7   15:invokevirtual   #505 <Method void startActivity(Intent)>
	//    8   18:return          
	}

	public void showTeamwork()
	{
		startActivity((new TeammatesIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #559 <Class TeammatesIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #560 <Method void TeammatesIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #561 <Method Intent TeammatesIntentCreator.create()>
	//    6   12:invokevirtual   #505 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void showWithdrawCash()
	{
		startActivity((new WithdrawIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #564 <Class WithdrawIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #565 <Method void WithdrawIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #566 <Method Intent WithdrawIntentCreator.create()>
	//    6   12:invokevirtual   #505 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
	private AccountAdapter adapter;
	protected AppConfig appConfig;
	protected AppHelper appHelper;
	protected BrazeTracking brazeTracking;
	protected CacheClearJobFactory cacheClearFactory;
	protected DeviceSecurity deviceSecurity;
	protected FacebookManager fbManager;
	protected NavBarView nbvNavBar;
	protected RecyclerView rvRecycler;
	protected ScrollingBottomSpace scrollingBottomSpace;
	protected IBSwipeRefreshLayout srlSwipeRefresh;

	static 
	{
		ajc$preClinit();
	//    0    0:invokestatic    #56  <Method void ajc$preClinit()>
	//*   1    3:return          
	}
}
