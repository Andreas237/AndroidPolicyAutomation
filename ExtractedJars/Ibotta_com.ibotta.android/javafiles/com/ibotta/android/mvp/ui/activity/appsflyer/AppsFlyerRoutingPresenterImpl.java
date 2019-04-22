// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.appsflyer;

import com.ibotta.android.mvp.base.AbstractMvpPresenter;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.state.app.pojo.AppsFlyerState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.util.AppHelper;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.appsflyer:
//			AppsFlyerRoutingPresenter, AppsFlyerRoutingView

public class AppsFlyerRoutingPresenterImpl extends AbstractMvpPresenter
	implements AppsFlyerRoutingPresenter
{

	public AppsFlyerRoutingPresenterImpl(MvpPresenterActions mvppresenteractions, AppHelper apphelper, AuthManager authmanager, AppsFlyerState appsflyerstate)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void AbstractMvpPresenter(MvpPresenterActions)>
		appHelper = apphelper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field AppHelper appHelper>
		authManager = authmanager;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field AuthManager authManager>
		appsFlyerState = appsflyerstate;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field AppsFlyerState appsFlyerState>
	//   12   21:return          
	}

	public void parseUrl(String s)
	{
		s = appHelper.parseUrlForQueryParam(s, "af_dp");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AppHelper appHelper>
	//    2    4:aload_1         
	//    3    5:ldc1            #30  <String "af_dp">
	//    4    7:invokeinterface #36  <Method String AppHelper.parseUrlForQueryParam(String, String)>
	//    5   12:astore_1        
		if(appHelper.isEmpty(s))
	//*   6   13:aload_0         
	//*   7   14:getfield        #20  <Field AppHelper appHelper>
	//*   8   17:aload_1         
	//*   9   18:invokeinterface #40  <Method boolean AppHelper.isEmpty(String)>
	//*  10   23:ifeq            39
		{
			((AppsFlyerRoutingView)mvpView).onNoAppsFlyerUrl();
	//   11   26:aload_0         
	//   12   27:getfield        #44  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   13   30:checkcast       #46  <Class AppsFlyerRoutingView>
	//   14   33:invokeinterface #50  <Method void AppsFlyerRoutingView.onNoAppsFlyerUrl()>
			return;
	//   15   38:return          
		} else
		{
			routeToUrl(s);
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:invokevirtual   #53  <Method void routeToUrl(String)>
			return;
	//   19   44:return          
		}
	}

	public void routeToUrl(String s)
	{
		if(authManager.isAuthenticated())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field AuthManager authManager>
	//*   2    4:invokeinterface #61  <Method boolean AuthManager.isAuthenticated()>
	//*   3    9:ifeq            26
		{
			((AppsFlyerRoutingView)mvpView).routeToRouting(s);
	//    4   12:aload_0         
	//    5   13:getfield        #44  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    6   16:checkcast       #46  <Class AppsFlyerRoutingView>
	//    7   19:aload_1         
	//    8   20:invokeinterface #64  <Method void AppsFlyerRoutingView.routeToRouting(String)>
			return;
	//    9   25:return          
		} else
		{
			appsFlyerState.setDeepLink(s);
	//   10   26:aload_0         
	//   11   27:getfield        #24  <Field AppsFlyerState appsFlyerState>
	//   12   30:aload_1         
	//   13   31:invokeinterface #69  <Method void AppsFlyerState.setDeepLink(String)>
			((AppsFlyerRoutingView)mvpView).routeToLogin();
	//   14   36:aload_0         
	//   15   37:getfield        #44  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   16   40:checkcast       #46  <Class AppsFlyerRoutingView>
	//   17   43:invokeinterface #72  <Method void AppsFlyerRoutingView.routeToLogin()>
			return;
	//   18   48:return          
		}
	}

	private final AppHelper appHelper;
	private final AppsFlyerState appsFlyerState;
	private final AuthManager authManager;
}
