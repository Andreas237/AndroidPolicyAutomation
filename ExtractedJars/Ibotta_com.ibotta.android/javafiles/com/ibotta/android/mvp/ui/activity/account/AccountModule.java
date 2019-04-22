// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import android.app.Activity;
import com.ibotta.android.api.auth.PostAuthWorkJobFactory;
import com.ibotta.android.features.variant.account.TeamworkVariant;
import com.ibotta.android.features.variant.pwi.PwiVariant;
import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.ui.view.ScrollingBottomSpace;
import com.ibotta.android.security.DeviceSecurity;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.social.facebook.FacebookManager;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.tracking.EventContextProvider;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.util.AppHelper;
import com.ibotta.api.call.ApiCallFactory;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountPresenterImpl, AccountTracking, AccountView, AccountPresenter

public class AccountModule extends AbstractMvpModule
{

	public AccountModule(AccountView accountview)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (accountview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
		accountView = accountview;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field AccountView accountView>
	//    6   10:return          
	}

	public FacebookManager provideFacebookManager(DeviceSecurity devicesecurity, PostAuthWorkJobFactory postauthworkjobfactory, ApiCallFactory apicallfactory, ApiWorkSubmitter apiworksubmitter, UserState userstate, AuthManager authmanager, CacheClearJobFactory cacheclearjobfactory)
	{
		return new FacebookManager((Activity)accountView, devicesecurity, postauthworkjobfactory, apicallfactory, apiworksubmitter, userstate, authmanager, cacheclearjobfactory);
	//    0    0:new             #22  <Class FacebookManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field AccountView accountView>
	//    4    8:checkcast       #24  <Class Activity>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:aload           5
	//   10   18:aload           6
	//   11   20:aload           7
	//   12   22:invokespecial   #27  <Method void FacebookManager(Activity, DeviceSecurity, PostAuthWorkJobFactory, ApiCallFactory, ApiWorkSubmitter, UserState, AuthManager, CacheClearJobFactory)>
	//   13   25:areturn         
	}

	public AccountPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, UserState userstate, Tracker tracker, AccountTracking accounttracking, PwiVariant pwivariant, TeamworkVariant teamworkvariant)
	{
		return ((AccountPresenter) (new AccountPresenterImpl(mvppresenteractions, userstate, tracker, accounttracking, pwivariant, teamworkvariant)));
	//    0    0:new             #32  <Class AccountPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokespecial   #35  <Method void AccountPresenterImpl(MvpPresenterActions, UserState, Tracker, AccountTracking, PwiVariant, TeamworkVariant)>
	//    9   16:areturn         
	}

	public ScrollingBottomSpace provideScrollingBottomSpace()
	{
		return (new com.ibotta.android.mvp.ui.view.ScrollingBottomSpace.Builder()).build();
	//    0    0:new             #39  <Class com.ibotta.android.mvp.ui.view.ScrollingBottomSpace$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void com.ibotta.android.mvp.ui.view.ScrollingBottomSpace$Builder()>
	//    3    7:invokevirtual   #45  <Method ScrollingBottomSpace com.ibotta.android.mvp.ui.view.ScrollingBottomSpace$Builder.build()>
	//    4   10:areturn         
	}

	public AccountTracking providesAccountTracking(AppHelper apphelper, EventContextProvider eventcontextprovider, TrackingQueue trackingqueue)
	{
		return new AccountTracking(apphelper, eventcontextprovider, trackingqueue);
	//    0    0:new             #52  <Class AccountTracking>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #55  <Method void AccountTracking(AppHelper, EventContextProvider, TrackingQueue)>
	//    6   10:areturn         
	}

	private final AccountView accountView;
}
