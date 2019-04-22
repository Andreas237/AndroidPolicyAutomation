// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.service.api.job.ApiJobFactory;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.api.call.ApiCallFactory;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectPresenterImpl, PayPalConnectCollaborators, PayPalConnectView, PayPalConnectPresenter

public class PayPalConnectModule extends AbstractMvpModule
{

	public PayPalConnectModule(PayPalConnectView paypalconnectview)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (paypalconnectview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
	//    3    5:return          
	}

	public PayPalConnectPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, AppConfig appconfig, ApiCallFactory apicallfactory, ApiJobFactory apijobfactory, PayPalConnectCollaborators paypalconnectcollaborators, CacheClearJobFactory cacheclearjobfactory)
	{
		return ((PayPalConnectPresenter) (new PayPalConnectPresenterImpl(mvppresenteractions, appconfig, apicallfactory, apijobfactory, paypalconnectcollaborators, cacheclearjobfactory)));
	//    0    0:new             #18  <Class PayPalConnectPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokespecial   #21  <Method void PayPalConnectPresenterImpl(MvpPresenterActions, AppConfig, ApiCallFactory, ApiJobFactory, PayPalConnectCollaborators, CacheClearJobFactory)>
	//    9   16:areturn         
	}

	public PayPalConnectCollaborators providePayPalConnectCollaborators()
	{
		return new PayPalConnectCollaborators();
	//    0    0:new             #26  <Class PayPalConnectCollaborators>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void PayPalConnectCollaborators()>
	//    3    7:areturn         
	}
}
