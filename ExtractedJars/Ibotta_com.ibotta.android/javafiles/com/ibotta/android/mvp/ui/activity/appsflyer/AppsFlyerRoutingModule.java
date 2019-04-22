// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.appsflyer;

import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.state.app.pojo.AppsFlyerState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.util.AppHelper;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.appsflyer:
//			AppsFlyerRoutingPresenterImpl, AppsFlyerRoutingView, AppsFlyerRoutingPresenter

public class AppsFlyerRoutingModule extends AbstractMvpModule
{

	public AppsFlyerRoutingModule(AppsFlyerRoutingView appsflyerroutingview)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (appsflyerroutingview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
	//    3    5:return          
	}

	public static AppsFlyerRoutingPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, AppHelper apphelper, AuthManager authmanager, AppsFlyerState appsflyerstate)
	{
		return ((AppsFlyerRoutingPresenter) (new AppsFlyerRoutingPresenterImpl(mvppresenteractions, apphelper, authmanager, appsflyerstate)));
	//    0    0:new             #18  <Class AppsFlyerRoutingPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #21  <Method void AppsFlyerRoutingPresenterImpl(MvpPresenterActions, AppHelper, AuthManager, AppsFlyerState)>
	//    7   11:areturn         
	}
}
